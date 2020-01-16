/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinetmedicalpsbd;

import clase.Medici;
import java.sql.Connection;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maria
 */
public class MedicIT {
    
    public MedicIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getConnetion method, of class Medic.
     */
    @Test
    public void testGetConnetion() {
        System.out.println("getConnetion");
        Medic instance = new Medic();
        Connection expResult = null;
        Connection result = instance.getConnetion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MediciList method, of class Medic.
     */
    @Test
    public void testMediciList() {
        System.out.println("MediciList");
        Medic instance = new Medic();
        ArrayList<Medici> expResult = null;
        ArrayList<Medici> result = instance.MediciList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShowMedici method, of class Medic.
     */
    @Test
    public void testShowMedici() {
        System.out.println("ShowMedici");
        Medic instance = new Medic();
        instance.ShowMedici();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSQLQuery method, of class Medic.
     */
    @Test
    public void testExecuteSQLQuery() {
        System.out.println("executeSQLQuery");
        String query = "";
        String message = "";
        Medic instance = new Medic();
        instance.executeSQLQuery(query, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Medic.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Medic.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
