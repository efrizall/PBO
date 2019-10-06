import java.util.Scanner;

public class t2{
	public static void main(String[] args){

		int a, hasil = 0, n;

		Scanner input = new Scanner(System.in);

		System.out.print("Masukan angka = ");
        n = input.nextInt();
        for(a = 1; a <= n; a++){
            hasil = hasil + a;
        }
        System.out.println("Penjumlahan dari 1 sampai " + n + " : "+ hasil);
	}
}