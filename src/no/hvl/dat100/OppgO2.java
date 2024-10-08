package no.hvl.dat100;
import java.util.Scanner;
public class OppgO2 {
	public static void main(String[] args) {

        Scanner nyobj = new Scanner(System.in);
        System.out.print("Skriv inn bruttoinntek: ");
        Integer brutto=nyobj.nextInt();

        Integer trinn;
        double skatt=0.0;

        if (brutto<208050){
            trinn=0;
        }else if(brutto>208050 && brutto<=292850){
            trinn=1;
            skatt=(brutto-208050)*0.017;
        }else if(brutto>292850 && brutto<=670000){
            trinn=2;
            skatt=(84800*0.017)+((brutto-292850)*0.04);
        }else if(brutto>670000 && brutto<=937900){
            trinn=3;
            skatt=(84800*0.017)+(377150*0.04)+((brutto-670000)*0.136);
        }else if(brutto>937900 && brutto<=1350000){
            trinn=4;
            skatt=(84800*0.017)+(377150*0.04)+(267900*0.136)+((brutto-937900)*0.166);
        }else{
            trinn=5;
            skatt=(84800*0.017)+(377150*0.04)+(267900*0.136)+(412100*0.166)+((brutto-1350000)*0.176);
        }  
        System.out.println("Din totale trinnskatt for trinn " + trinn + " er: " + skatt);
        nyobj.close();
    }

}
