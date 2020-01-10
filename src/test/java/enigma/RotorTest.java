package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class RotorTest {

	@Test
	public void toLettertest() {
		int c[] = new int[26];
		for (int i =0; i!=26; i++ ) {
			c[i]=i;
		}
		Rotor r = new Rotor(c, 1);
		char lettre = r.toLetter(2);
		
		assertEquals('C',lettre);
		
	}
	
	@Test
	public void toIndextest() {
		int c[] = new int[26];
		for (int i =0; i!=26; i++ ) {
			c[i]=i;
		}
		Rotor r = new Rotor(c, 1);
		int i = r.toIndex('A');		
		assertEquals(0,i);
		
	}
	
	@Test 
	public void advanceTest() {
		int c[] = new int[26];
		for (int i =0; i!=26; i++ ) {
			c[i]=i;
		}
		Rotor r = new Rotor(c, 1);
		int p =r.getPosition();
		p++;
		r.advance();		
		assertEquals(p, r.getPosition());		
	}
	
	
	@Test
	// Test d'intégration 
	public void convertForwardTest() {
		int c[] = new int[26];
		for (int i =0; i!=26; i++ ) {
			c[i]=i;
		}
		Rotor r = new Rotor(c, 1);		
		int p = r.convertForward(0);		
		int m = r.convertBackward(p);
		
		assertEquals(m, 0);	
		
	}
	
	@Test
	// Test d'intégration
	public void convertBackwardTest() {
		int c[] = new int[26];
		for (int i =0; i!=26; i++ ) {
			c[i]=i;
		}
		Rotor r = new Rotor(c, 1);
		
		int p = r.convertBackward(0);
		int m = r.convertForward(p);
		assertEquals(m, 0);
	}
	
	

}
