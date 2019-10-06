import java.util.Scanner;

public class t4{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int nilai;

		do{
            System.out.print("Masukan angka < 100 : "); 
            nilai = input.nextInt();
            if(0 < nilai && nilai < 100){
            System.out.println("Angka yg di masukan < 100 ");
            }
       }while(nilai <= 100);
	}
}