package sesion6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    public void testEjercicio2() {
		Sesion6 sesion6 = new Sesion6();
		
		assertFalse(sesion6.ejercico2(-5));
		assertTrue(sesion6.ejercico2(5));
		assertTrue(sesion6.ejercico2(0));
	}
	
	public void testEjercicio3() {
		Sesion6 sesion6 = new Sesion6();
		
		assertFalse(sesion6.ejercicio3("", ""));
		assertFalse(sesion6.ejercicio3("dfghdfgjhdfgjdfgjdfgdfgjdfgjdfgjshdf", "asdfgasdf"));
		assertFalse(sesion6.ejercicio3("sdffh", "dfghdfgjhdfgjdfgjdfgdfgjdfgjdfgjshdf"));
		assertTrue(sesion6.ejercicio3("sdffh", "sdffh"));
		assertFalse(sesion6.ejercicio3("sdffh", "sdffsdh"));
	}

	public void testEjercicio4() {
		Sesion6 sesion6 = new Sesion6();
		
		assertEquals(sesion6.ejercicio4(0), "");
		assertEquals(sesion6.ejercicio4(1), "*");
		assertEquals(sesion6.ejercicio4(5), "*****");
		assertEquals(sesion6.ejercicio4(-1), "Numero erroneo");
	}
	
	public void testEjercicio5() {
		Sesion6 sesion6 = new Sesion6();
		
		assertEquals(sesion6.ejercicio5("hola", "jola"), "h");
	}
}
