public class ZadatakBr1BrojN {
	public static void main(String[] args) {
		System.out.println("Unesi broj: ");
		int broj = TextIO.getlnInt();

		System.out.println("Suma cifara broja je: " + sumaCifara(broj));

	}

	private static int sumaCifara(int broj) {

		int sum = 0;
		while (broj != 0) {
			int k = broj % 10;
			sum = sum + k;
			broj = broj / 10;
		}
		return sum;
	}
}
