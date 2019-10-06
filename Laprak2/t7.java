import java.util.Scanner;

public class t7{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int nilai = 1, hasil = 0;

		while(nilai != 0){
            System.out.print("Masukan angka: ");
            nilai = input.nextInt();
            hasil = hasil + nilai;
        }
        System.out.print("Hasil : " + hasil);
	}
}