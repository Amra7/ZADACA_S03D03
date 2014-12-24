public class ZadatakBr11CezarovaSifra {
	/*
	 * Ispisuje cezarou sifru za unesenu recenicu.
	 */
	public static void main(String[] args) {
		System.out.println("Upisi recenicu: ");
		String recenica = TextIO.getln();
		int pomak = 3;

		System.out.println(cezarovaSifra(recenica, pomak));

	}

	public static char [] cezarovaSifra(String recenica, int pomak) {
		char[] recenicaNiz = recenica.toCharArray();
//		String str = "";

		for (int i = 0; i < recenica.length(); i++) {
			char slovo = recenicaNiz[i];
			slovo = (char) ( slovo + pomak);
			if (slovo > 'z') {
				slovo = (char)(slovo -26);
			} else if (slovo > 'a'){
				slovo = (char)(slovo +26);
			}
			recenicaNiz[i] =  slovo;
		}
		return recenicaNiz;
	}
}
