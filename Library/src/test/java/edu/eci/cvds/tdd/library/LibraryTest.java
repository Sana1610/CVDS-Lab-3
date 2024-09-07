package edu.eci.cvds.tdd.library;

import org.junit.*;
import static org.junit.Assert.*;

import edu.eci.cvds.tdd.library.book.Book;

public class LibraryTest
{
    private Library library;
    private Book book;


    /**
     * creates some testing objects
     * @Before any testing is run
     */
    @Before
    public void before(){
        library = new Library();
        book = new Book("title", "author", "isbn");
    }

    /**
     * @test
     * verifies is the book was added correctly into the library
     */
    @Test
        public void TestAddBook(){
        assertTrue(library.addBook(book));
    }
}
