package ex.com.luke.assessment4.dao;

import java.util.List;

import ex.com.luke.assessment4.model.Book;

public interface BookDao {

       public void saveBook(Book book); // create and update

       public List<Book> listBooks();
       public Book getBook(Long id);

       public void deleteBook(Long id);
}
