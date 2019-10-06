import java.util.Scanner;

public class t5{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int nilai = 1;

		while(nilai <= 100){
            System.out.print("Masukan angka: ");
            nilai = input.nextInt();
        }
	}
}