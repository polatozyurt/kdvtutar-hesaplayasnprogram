package myjavaprograms;
import java.util.Scanner ;


public class kdvtutarýhesaplayanprogram {

	public static void main(String[] args) {
		
		
		double price, kdvper ;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Hesaplamak istediðiniz tutarý giriniz :  ");
		price = input.nextDouble();
		
		kdvper =0.18 ;
		
		
		System.out.println("KDV'siz tutar: "+ price);
		System.out.println("KDV oraný: " + kdvper);
		System.out.println("KDV tutarý: "+ (price * kdvper));
		System.out.println("KDV' li tutarý: " + (price+price*kdvper));
		System.out.println("Program Bitti");

		

		
		
		

	}

}
