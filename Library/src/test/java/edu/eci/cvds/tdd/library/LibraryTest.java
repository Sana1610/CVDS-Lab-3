package edu.eci.cvds.tdd.library;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import edu.eci.cvds.tdd.library.book.Book;
import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.user.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryTest extends TestCase
{
    private Library library;
    private Book book;

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public LibraryTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( LibraryTest.class );
    }

    /**
     * creates some testing objects
     * @Before any testing is run
     */
    public void before(){
        library = new Library();
        book = new Book("title", "author", "isbn");
    }

    /**
     * @test
     * verifies is the book was added correctly into the libray
     */
    public void testAddBook (Book book){
        assertTrue(Library.addBook(book));
    }
}
