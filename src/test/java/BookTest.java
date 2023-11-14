/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.example.Book;
import org.example.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
 *
 * @author informatica
 */
public class BookTest {
    private Book book;
    
    @BeforeEach
    public void setUp() {
        book = new Book("01", "Book", "Juan");
    }
    
    
    @Test
    public void testGetTitle(){
        assertEquals("Book", book.getTitle());
    }
    @Test
    public void testGetAuthor(){
        assertEquals("Juan", book.getAuthor());
    }
    @Test
    public void testGetId(){
        assertEquals("01", book.getId());
    }
     @Test
    public void testIsAvailableTrue(){
        assertEquals(true, book.isAvailable());
    }
    @Test
    public void testIsAvailableFalse(){
        book.markAsUnavailable();
        assertEquals(false, book.isAvailable());
    }
}
