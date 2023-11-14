/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.example.Book;
import org.example.LibraryDatabase;
import org.example.Student;
import org.example.LoanManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author informatica
 */
public class LoanManagerTest {
    private LoanManager loanManager;
    private LibraryDatabase database = mock(LibraryDatabase.class) ;
    private Book book;
    private Student student;
    
    @BeforeEach
    public void setUp(){
        book = new Book("01", "Book", "Juan");
        student = new Student("001", "Maria");
        loanManager = new LoanManager(database);
        loanManager.addBook(book);
        loanManager.registerStudent(student);
    }

    /**
     *
     */
    @Test
    public void testLendBookTrue(){
        assertEquals(true, loanManager.lendBook("01", "001"));
    }
    @Test
    public void testLendBookFalseByBookId(){
        assertEquals(false, loanManager.lendBook("02", "001"));
    }
    @Test
    public void testLendBookFalseByStudentId(){
        assertEquals(false, loanManager.lendBook("01", "002"));
    }
    @Test
    public void testLendBookFalseByStudentIdAndBookID(){
        assertEquals(false, loanManager.lendBook("02", "002"));
    }
    @Test
    public void testGetBooks(){
        assertEquals("Book", loanManager.getBooks().get(0).getTitle());
        assertEquals("01", loanManager.getBooks().get(0).getId());
        assertEquals("Juan", loanManager.getBooks().get(0).getAuthor());
    }
     @Test
    public void testGetStudents(){
        assertEquals("Maria", loanManager.getStudents().get(0).getName());
        assertEquals("001", loanManager.getStudents().get(0).getId());
    }
}
