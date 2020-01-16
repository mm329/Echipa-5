/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cabinetmedicalpsbd;

import clase.ListaAnalizeC;
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
public class AnalizeIT {
    
    public AnalizeIT() {
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
     * Test of showDate method, of class Analize.
     */
    @Test
    public void testShowDate() {
        System.out.println("showDate");
        Analize instance = new Analize();
        instance.showDate();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getConnetion method, of class Analize.
     */
    @Test
    public void testGetConnetion() {
        System.out.println("getConnetion");
        Analize instance = new Analize();
        Connection expResult = null;
        Connection result = instance.getConnetion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AnalizeList method, of class Analize.
     */
    @Test
    public void testAnalizeList() {
        System.out.println("AnalizeList");
        Analize instance = new Analize();
        ArrayList<ListaAnalizeC> expResult = null;
        ArrayList<ListaAnalizeC> result = instance.AnalizeList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ShowAnalize method, of class Analize.
     */
    @Test
    public void testShowAnalize() {
        System.out.println("ShowAnalize");
        Analize instance = new Analize();
        instance.ShowAnalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executeSQLQuery method, of class Analize.
     */
    @Test
    public void testExecuteSQLQuery() {
        System.out.println("executeSQLQuery");
        String query = "";
        String message = "";
        Analize instance = new Analize();
        instance.executeSQLQuery(query, message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Analize.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Analize.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
