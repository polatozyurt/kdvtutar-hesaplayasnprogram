package myjavaprograms;
import java.util.Scanner ;


public class kdvtutar�hesaplayanprogram {

	public static void main(String[] args) {
		
		
		double price, kdvper ;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Hesaplamak istedi�iniz tutar� giriniz :  ");
		price = input.nextDouble();
		
		kdvper =0.18 ;
		
		
		System.out.println("KDV'siz tutar: "+ price);
		System.out.println("KDV oran�: " + kdvper);
		System.out.println("KDV tutar�: "+ (price * kdvper));
		System.out.println("KDV' li tutar�: " + (price+price*kdvper));
		System.out.println("Program Bitti");

		

		
		
		

	}

}
