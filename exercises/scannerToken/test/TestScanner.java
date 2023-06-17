package test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import scanner.Scanner;

public class TestScanner {
	
	@Test
	public void testScanId() throws IOException {
		String path ="src/test/data/testId.txt";
		Scanner scanner = new Scanner(path);
	}

}