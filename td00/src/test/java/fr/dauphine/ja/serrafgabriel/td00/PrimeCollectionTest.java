package fr.dauphine.ja.serrafgabriel.td00;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class PrimeCollectionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public PrimeCollectionTest( String testName )
    {
        super( testName );
        
    }
    
    public void test0IsPrime() {
    	
    	assertTrue(PrimeCollection.isPrime(0) == false);    	
    }
    
    public void testTWoIsPrime() {
    	assertTrue(PrimeCollection.isPrime(2) == true);
    }
    
    public void test9IsPrime() {
    	assertTrue(PrimeCollection.isPrime(9) == false);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( PrimeCollectionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testApp()
    {
    
    	//assertTrue(true);
        
    }
}
