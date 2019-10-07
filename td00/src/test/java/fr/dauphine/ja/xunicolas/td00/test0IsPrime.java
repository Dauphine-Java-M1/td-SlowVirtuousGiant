package fr.dauphine.ja.xunicolas.td00;
/*
import static org.junit.Assert.*;
import org.junit.Test;
*/

import static org.junit.Assert.assertFalse;

import fr.dauphine.ja.xunicolas.td00.PrimeCollection;

public class test0IsPrime extends PrimeCollection{
	
	public void test0Prime() {
		
		 assertFalse(isPrime(0));
	}

}
