package edu.eci.cvds.tdd.library;

import edu.eci.cvds.tdd.library.loan.Loan;
import edu.eci.cvds.tdd.library.user.User;
import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;
import edu.eci.cvds.tdd.library.book.Book;

public class LibraryTest
{
    private Library library;
    private Book book;
    private User user;
    private Loan loan;


    /**
     * creates some testing objects
     * @Before any testing is run
     */
    @Before
    public void before(){
        library = new Library();
        book = new Book("title", "author", "isbn");
        user = new User();
        user.setId("10");
        loan = new Loan();
    }

    /**
     * @test
     * verifies if the book was added correctly into the library
     */
    @Test
        public void TestAddBook(){
        assertTrue(library.addBook(book));
    }

    /**
     * @test
     * verifies if the book was added correctly into the library and was already in the library
     */
    @Test
    public void TestAddRepeatedBook(){
        library.addBook(book);
        assertTrue(library.addBook(book));
    }

    /**
     * @test
     * verifies if the loan was created correctly
     */
    @Test
    public void TestLoan(){
        String answer = library.loanABook("10","isbn").toString();
        assertEquals("ACTIVE",answer);
    }

}
