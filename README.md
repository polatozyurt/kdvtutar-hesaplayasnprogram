# kdvtutar-hesaplayasnprogram
package myjavaprograms;
import java.util.Scanner ;


public class kdvtutarıhesaplayanprogram {

	public static void main(String[] args) {
		
		
		double price, kdvper ;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Hesaplamak istediğiniz tutarı giriniz :  ");
		price = input.nextDouble();
		
		kdvper =0.18 ;
		
		
		System.out.println("KDV'siz tutar: "+ price);
		System.out.println("KDV oranı: " + kdvper);
		System.out.println("KDV tutarı: "+ (price * kdvper));
		System.out.println("KDV' li tutarı: " + (price+price*kdvper));
		System.out.println("Program Bitti");

		

		
		
		

	}

}
