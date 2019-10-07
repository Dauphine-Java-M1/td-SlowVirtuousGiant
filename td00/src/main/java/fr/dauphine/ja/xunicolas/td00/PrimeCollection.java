package fr.dauphine.ja.xunicolas.td00;

import java.util.ArrayList;
import java.util.Random;

/**
 * Hello world!
 *
 */
public class PrimeCollection 
{  

	public static void initRandom(int n, int m,ArrayList<Integer>list) {
		for(int i = 1;i <= n;i++) {
			int randomNumber = (int) ((Math.random()*((m-0)+1))+0);
			list.add(randomNumber);
		}
	}
	
	
	public static boolean isPrime(int p) {
		if(p<=1) return false;
		for(int i = 2;i*i<=p;i++) if (p%i ==0){
			return false;
		}
		return true;
	}
	
	private static void printPrimes(ArrayList<Integer>list) {
		int i ;
		for (i = 0;i< list.size();i++) {
			if(isPrime(list.get(i))==true) {
				System.out.println(list.get(i) + " est un nombre premier");
			};
			if(isPrime(list.get(i))==false) {
				System.out.println(list.get(i) + " n'est pas un nombre premier");
			};
		}
	}
    public static void main( String[] args )
    {
    	ArrayList<Integer> numbers = new ArrayList<Integer>();
        initRandom(1,10000,numbers);
        printPrimes(numbers);
    }
}
