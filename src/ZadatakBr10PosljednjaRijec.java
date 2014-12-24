public class ZadatakBr10PosljednjaRijec {
	/**
	 * Zadatak text: 
	 * Napisite program koji prvo trazi da se sa tastature unese recenica, a koji zatim ispisuje
	 * posljednju rijec te recenice. Dobro obratite paţnju na to da recenica moze imati samo 
	 * jednu rijec, kao i da se nakon posljednje rijeci u recenici mogu nalaziti razmaci 
	 * (koje ne treba ispisivati).
	 * @param args
	 */
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
	//  * Za mentora * 
	
	// Ovdje sam napravila funkciju koja mi daje zanju rijec u recenici
	// Ukoliko se na zadnjem mjestu u recenici nalazi space, onda mi nista ne izbacuje
	// Pitanje je kako da se vratim na zadnju rijec prije space-a?
	

	public static String[] rijeciIzStringa(String recenica, char razmak) {
		String[] recenicaNiz = {};
		String[] temp = {};      // privremeni niz u koji ubacujem rijec

		int brojac = 0;   // brojac sluzi kao velicina privrmeneog niza ---> temp = new String[brojac];
		int x = recenica.indexOf(razmak); //  x= broj jesta u string na kjem se nalazi razmak
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
		
		// U ovom dijelu prebacujem iz privremenog niza u niz recenica 
		// koji bi kako konacni rezultat imao zadnju rijec

		temp = new String[brojac + 1];
		for (int i = 0; i < recenicaNiz.length; i++) {
			temp[i] = recenicaNiz[i];
		}
		temp[brojac] = recenica;
		recenicaNiz = temp;

		return recenicaNiz;
	}
}
