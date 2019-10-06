import java.util.Scanner;

public class t3{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int nilai;

		do{
             System.out.print("Masukan angka < 100 : "); 
             nilai = input.nextInt();
        }while(nilai <= 100);
	}
}