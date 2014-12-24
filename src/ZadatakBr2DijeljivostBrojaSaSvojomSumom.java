public class ZadatakBr2DijeljivostBrojaSaSvojomSumom {
	public static void main(String[] args) {
		System.out.println("Unesi jedan broj: ");
		int broj =TextIO.getInt();
		
		System.out.println("Brojevi koji su djeljivi sa sumom svojih cifara: ");
		brojeviDjeljiviSaSvojomCifrom(broj);

	}

	private static void brojeviDjeljiviSaSvojomCifrom(int broj) {
		for (int i = 1; i <= broj; i++) {
			if (i % sumaCifara(i) == 0) {
				System.out.print(i + ", ");
			}
		}
	}

	private static int sumaCifara(int i) {
		int sum = 0;
		while (i != 0) {
			int k = i % 10;
			sum = sum + k;
			i = i / 10;
		}
		return sum;
	}
}
