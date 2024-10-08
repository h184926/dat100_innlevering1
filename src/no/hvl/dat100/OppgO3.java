package no.hvl.dat100;
import java.util.Scanner;
public class OppgO3 {
	
	public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Skriv inn n (n>0): ");
        long n = obj.nextLong();  // Read user input

        long resultat=1;
        for(long i=2;i<=n;i++){
                resultat=resultat*i;
        }System.out.println("n! av " + n + " er " + resultat);
            
		
    obj.close();

	}
}
