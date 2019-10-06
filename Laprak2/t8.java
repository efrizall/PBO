import java.util.Scanner;

public class t8{
	public static void main(String[] args){
		int hasil = 0, a = 1, b = 0;

		Scanner input = new Scanner(System.in);

		while (a != 0 && a != b){
			b = a;
			System.out.print("Angka : ");
			a = input.nextInt();
			hasil = hasil + a;
		}
		System.out.println("Hasil : " + hasil);
	}
}