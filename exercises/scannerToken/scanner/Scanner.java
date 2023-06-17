package scanner;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;
import java.util.Arrays;
import java.util.List;

import token.*;

public class Scanner {
	final char EOF = (char) -1; // int 65535
	private int riga;
	private PushbackReader buffer;
	private String log;

	private List<Character> skipChars = Arrays.asList(' ', '\n', '\t', '\r', EOF);
	private List<Character> letters = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
			'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
	private List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');
	// HashMap caratteri TokenType per associazione fra '+', '-', '*', '/', '=', ';'
	// e TokenType
	// HashMap stringhe TokenType per associazione fra parole chiave "print",
	// "float", "int" e TokenType

	public Scanner(String fileName) throws FileNotFoundException {
		this.buffer = new PushbackReader(new FileReader(fileName));
		riga = 1;

	}

	/*
	 * public Token peekToken() throws IOException { ..... }
	 */

	public Token nextToken() throws IOException {

		// nextChar contiene il prossimo carattere dell'input.
		char nextChar = peekChar();
		
		// Avanza nel buffer leggendo i carattere in skipChars
		// incrementando riga se leggi '\n'.
		// Se raggiungi la fine del file ritorna il Token EOF


		// Se nextChar e' in numbers
		//                return scanNumber()
		// che legge sia un intero che un float e ritorna il Token INUM o FNUM
		// i caratteri che leggete devono essere accumulati in una stringa
		// che verra' assegnata al campo valore del Token

		// Se nextChar e' in letters
		//                return scanId()
		// che legge tutte le lettere minuscole e ritorna un Token ID o
		// il Token associato Parola Chiave (per generare i Token per le
		// parole chiave usate l'HaskMap di corrispondenza

		// Se nextChar e' un operatore o = o ;
		// ritorna il Token associato con l'operatore o il delimitatore
		// Anche qui per generare i Token usate l'HaskMap di corrispondenza

		// Altrimenti il carattere NON E' UN CARATTERE LEGALE
		// Potete:
		// (1) Cercare di recuperare l'errore scartando il carattere (segnalarlo
		// nella stringa log) e andando avanti
		// (2) Interrompere l'analisi lessicale sollevando una eccezione
		
		return null;

	}

	private char readChar() throws IOException {
		return ((char) this.buffer.read());
	}

	private char peekChar() throws IOException {
		char c = (char) buffer.read();
		buffer.unread(c);
		return c;
	}
}
