public class ZadatakBr10PosljednjaRijec {
	public static void main(String[] args) {
		System.out.println("Unesi recenicu: ");
		String recenica = TextIO.getlnString();
		char razmak = ' ';

		String[] zadnjaRijec = rijeciIzStringa(recenica, razmak);
		// for ( int i = 0; i< zadnjaRijec.length; i++){
		if (zadnjaRijec[zadnjaRijec.length - 1] == null) {
			System.out.println(zadnjaRijec[zadnjaRijec.length - 2]);
		}
		if (zadnjaRijec[zadnjaRijec.length - 1] != null) {
			System.out.println(zadnjaRijec[zadnjaRijec.length - 1]);

		}
	}

	public static String[] rijeciIzStringa(String recenica, char razmak) {
		String[] recenicaNiz = {};
		String[] temp = {};

		int brojac = 0;
		int x = recenica.indexOf(razmak);
		do {
			brojac++;

			String rijec = recenica.substring(0, x);
			temp = new String[brojac];
			for (int i = 0; i < recenicaNiz.length; i++) {
				temp[i] = recenicaNiz[i];
			}
			temp[brojac - 1] = rijec;
			recenicaNiz = temp;
			recenica = recenica.substring(x + 1);
			x = recenica.indexOf(razmak);

		} while (x >= 0);

		temp = new String[brojac + 1];
		for (int i = 0; i < recenicaNiz.length; i++) {
			temp[i] = recenicaNiz[i];
		}
		temp[brojac] = recenica;
		recenicaNiz = temp;

		return recenicaNiz;
	}
}
