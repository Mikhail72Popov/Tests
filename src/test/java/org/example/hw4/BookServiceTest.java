package org.example.hw4;

import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import java.util.List;

public class BookServiceTest {


    @Test
    public void testFindBookId() {
        BookRepository mockRepository = (BookRepository)Mockito.mock(BookRepository.class);
        when(mockRepository.findById("001")).thenReturn(new Book("001", "New Book", "New Author"));
        BookService bookService = new BookService(mockRepository);
        Book result = bookService.findBookById("001");
        Assertions.assertEquals("New Book", result.getTitle());
        Assertions.assertEquals("New Author", result.getAuthor());
    }

    @Test
    public void testFindBooks() {
        BookRepository mockRepository = (BookRepository)Mockito.mock(BookRepository.class);
        when(mockRepository.findAll()).thenReturn(List.of(new Book("001", "New Book", "New Author")));
        BookService bookService = new BookService(mockRepository);
        List<Book> result = bookService.findAllBooks();
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals("New Book", ((Book)result.get(0)).getTitle());
        Assertions.assertEquals("New Author", ((Book)result.get(0)).getAuthor());
    }




    //@Mock
//    private BookService bookRepository;
//    private BookService bookService;
//
// @BeforeAll
// public void setup(){
//     MockitoAnnotations.initMocks(this);
//     bookService = new BookService; /* (bookRepository); */
// }
// @Test
//    public void testGetBookByld(){
//     Book book = new Book(1, "Test Book", "New Author");
//     when(bookRepository.getBookByld(1)).thenReturn(book);
//     Book result = bookService.getBookByld(1);
//     assertEquals(book, result);
//     verify(bookRepository, times(1)).getBookByld(1);
//
//   @Test
//   public void testAddBook(){
//       Book book = new Book(2, "New Book");
//       bookService.addBook(book);
//       verify(bookRepository, times(1)).addBook(book);
//     }
}
