/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinetmedicalpsbd;

import clase.Pacient;
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
public class PacientiCRUDIT {
    
    public PacientiCRUDIT() {
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
     * Test of getConnetion method, of class PacientiCRUD.
     */
    @Test
    public void testGetConnetion() {
        System.out.println("getConnetion");
        PacientiCRUD instance = new PacientiCRUD();
        Connection expResult = null;
        Connection result = instance.getConnetion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PacientList method, of class PacientiCRUD.
     */
    @Test
    public void testPacientList() {
        System.out.println("PacientList");
        PacientiCRUD instance = new PacientiCRUD();
        ArrayList<Pacient> expResult = null;
        ArrayList<Pacient> result = instance.PacientList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShowPacient method, of class PacientiCRUD.
     */
    @Test
    public void testShowPacient() {
        System.out.println("ShowPacient");
        PacientiCRUD instance = new PacientiCRUD();
        instance.ShowPacient();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSQLQuery method, of class PacientiCRUD.
     */
    @Test
    public void testExecuteSQLQuery() {
        System.out.println("executeSQLQuery");
        String query = "";
        String message = "";
        PacientiCRUD instance = new PacientiCRUD();
        instance.executeSQLQuery(query, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class PacientiCRUD.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        PacientiCRUD.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
