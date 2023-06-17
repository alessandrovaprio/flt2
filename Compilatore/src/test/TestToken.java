package test;

import static org.junit.Assert.*;

import org.junit.Test;

import token.Token;
import token.TokenType;

public class TestToken {

	@Test
	public void test() {
		Token t = new Token(TokenType.ASSIGN,3);
		
		assertEquals(3, t.getRiga());
		assertEquals(t.getVal(), null);
		t = new Token(TokenType.INT, 5,"1");
		assertEquals(t.getVal(), "1");
		
	}

}
