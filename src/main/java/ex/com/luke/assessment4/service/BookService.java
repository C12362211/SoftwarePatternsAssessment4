package ex.com.luke.assessment4.service;

import java.util.List;

import ex.com.luke.assessment4.model.Book;


public interface BookService {

       public void saveBook(Book book);

       public List<Book> listBooks();
       public Book getBook(Long id);

       public void deleteBook(Long id);

}
