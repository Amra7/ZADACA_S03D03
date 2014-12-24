public class ZadatakBr16NizProstiIliSlozeni {
	public static void main(String[] args) {

		int[] niz = kreirajNiz();

		System.out.println("Vas niz je: ");
		ispisivanjeNiza(niz);

		prostiIliSlozeni(niz);
	}

	public static int[] kreirajNiz() {
		System.out.println("Unesi vrijednost za duzinu niza: ");
		int broj = TextIO.getInt();

		int[] unosenjeNiza = new int[broj];
		for (int i = 0; i < unosenjeNiza.length; i++) {
			System.out.println("Unesite vrijednosti u niz:  ");
			unosenjeNiza[i] = TextIO.getInt();
		}
		return unosenjeNiza;
	}

	public static void ispisivanjeNiza(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (i!=0){
				System.out.print(niz[i] + ", ");
			}
		}
		
		System.out.println();
	}
	
	public static boolean prostBroj (int broj){
		boolean prostBroj = true;
		for (int j = 2; j < broj; j++) 
		if  ( broj % j==0) {
			return false;
		}
		return prostBroj;
	}

	public static void prostiIliSlozeni(int[] niz) {
		int brojacP = 0;
		int brojacS = 0;
		
		int[] prostiBrojevi = new int[niz.length];
		int[] slozeniBrojevi = new int[niz.length];
	
			for (int i = 0; i < niz.length; i++) {
				if (prostBroj(niz[i])){
					prostiBrojevi[brojacP] = niz[i];
					brojacP++;
					}
				
				else
				{
			    slozeniBrojevi[brojacS] = niz[i];
					brojacS++;
				}
				
			

			}
			System.out.println("Prosti brojevi u nizu su: ");
			ispisivanjeNiza(prostiBrojevi);
			//System.out.println("Slozeni brojevi u nizu su: " + slozeniBrojevi);
			ispisivanjeNiza(slozeniBrojevi);
		} 
	}

