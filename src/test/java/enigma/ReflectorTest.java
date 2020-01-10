package enigma;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReflectorTest {

	@Test
	public void convertForwardTest() {
		int c[] = new int[26];
		for (int i =0; i!=26; i++ ) {
			c[i]=i;
		}
		Reflector r = new Reflector(c);
		
		int z = r.convertForward(0);
		
		//Quand on met A on doit avoir A
		// Donc en mettant 0 on doit avoir 0
		assertEquals(z, 0);		
	}

}
