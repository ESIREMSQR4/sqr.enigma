package enigma;

/** Class that represents a reflector in the enigma.
 *  @author
 */
public class Reflector extends Rotor {
	
	/*
	 * Roue servant de r�flecteur.
	 * ELle va retourner vers la sortie le signal qu'elle recoit de l'entr� et qui passe par
	 * les roue interm�diaires
	 *  
	 * 
	 */
	
	int[] reflection;
	
	// Mise en place du r�flecteur
	public static Reflector reflectorFactory(String str){
		char[] s = str.trim().replace(" ", "").toCharArray();
		int[] cipher = new int[26];
		for (int i = 0; i< 26; i++){
			cipher[i] = toIndex(s[i]);
		}
		return new Reflector(cipher);
	}
	
	Reflector(int[] r){
		super(r,0);
		reflection = r;
	}

	//donner la correspondance en sortie du premier tour dans le rotor ( le signal recu de l'entr�)
    public int convertForward(int p) {
        return ((reflection[((p)%26+26)%26])%26+26)%26;
    }

    //Cette fonction n'est pas utile dans cette classe car c'est le r�flecteur
    @Override
    public int convertBackward(int unused) {
        throw new UnsupportedOperationException();
    }
    
    //Ici on override la methode advance() de la classe Rotor. Et on la laisse vide
    // On fait �a car le r�flecteur ne doit par tourner
    @Override
    public void advance() {
    }

}
