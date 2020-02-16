/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps.sales;

import com.itexps.sales.Book;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author polar
 */
public class BookTest {
    
    public BookTest() {
        Book book;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    /**
     * Test of getTitle method, of class Book.
     */
    @Test
    public void testGetTitle() {
        System.out.println("TEST getTitle");
        Book instance = new Book();
        String expResult = "Tale of Two Cities";
        instance.setTitle(expResult);
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Book.
     */
    @Test
    public void testSetTitle() {
        System.out.println("TEST setTitle");
        String title = "Tale of Two Cities";
        Book instance = new Book();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Book.
     */
    @Test
    public void testGetName() {
        System.out.println("TEST getName");
        Book instance = new Book();
        String expResult = "Charles Dickens";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Book.
     */
    @Test
    public void testSetName() {
        System.out.println("TEST setName");
        String name = "";
        Book instance = new Book();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Book.
     */
    @Test
    public void testGetPrice() {
        System.out.println("TEST getPrice");
        Book instance = new Book();
        float expResult = 12.00F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 12.00F);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Book.
     */
    @Test
    public void testSetPrice() {
        System.out.println("TEST setPrice");
        float price = 0.0F;
        Book instance = new Book();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Book.
     */
    @Test
    public void testMain() {
        System.out.println("HW 02/04 Book project test");
        String[] args = null;
        Book.main(args);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
