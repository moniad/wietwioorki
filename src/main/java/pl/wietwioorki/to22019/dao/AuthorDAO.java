package pl.wietwioorki.to22019.dao;

import pl.wietwioorki.to22019.dao.generator.DataGenerator;
import pl.wietwioorki.to22019.model.Author;
import pl.wietwioorki.to22019.model.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
    private static List<Author> authors = new ArrayList<Author>();

    public static Author findByName(String name) {
        for (Author author: authors) {
            if(author.getFullName().equals(name)){
                return author;
            }
        }
        return new Author(DataGenerator.generateId(), name);
   }

   public static void addAuthor(Author author){
        authors.add(author);
   }

/*    public List<Book> findAllBooks() { //todo //not now
        return DataGenerator.generateBookList();
    }
*/
    public static Author findById(Long id) {
        for (Author author: authors) {
            if(author.getAuthorId()==id){
                return author;
            }
        }
        return null;
    }
}
