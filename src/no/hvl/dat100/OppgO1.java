package no.hvl.dat100;
import java.util.Scanner;
public class OppgO1 {
	 public static void main(String[] args) {
		    
	      Scanner obj = new Scanner(System.in); 

	      for (int i = 0; i <=10; i++) {
	      System.out.println("Skriv inn din poengsum(mellom 0 og 100): ");
	      Integer poengsum = obj.nextInt();  

	      char karakter ='.';
	      
	        while (poengsum<0||poengsum>100){
	            System.out.println("Skriv inn på nytt (0-100): ");
	            poengsum = obj.nextInt();
	            if (poengsum<0 || poengsum>100) {
	            System.out.print("Du gav eit ugyldig svar. Poengsummen må vere mellom 0 og 100");

	            
	             
	            
	        
	            }
	        }
	        if(poengsum>=90){
	                    karakter='A';
	            }else if(poengsum>=80){
	                    karakter='B';
	            }else if(poengsum>=60){
	                    karakter='C';
	            }else if(poengsum>=50){
	                    karakter='D';
	            }else if(poengsum>=40){
	                    karakter='E';
	            }else{
	                    karakter='F';
	            }
	            if (karakter=='F') {
	                    System.out.println("Karakteren din er: "+ karakter + ", betre lukke neste gang :/");
	            }else{
	                    System.out.println("Karakteren din er: "+ karakter);
	                }
	                

	    
	      }obj.close();}
	      
	      




}
