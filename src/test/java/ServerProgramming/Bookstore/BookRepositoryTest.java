package ServerProgramming.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import ServerProgramming.Bookstore.domain.Book;
import ServerProgramming.Bookstore.domain.BookRepository;
import ServerProgramming.Bookstore.domain.CategoryRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class BookRepositoryTest {

	@Autowired
	private BookRepository repository;
	
	@Autowired
	private CategoryRepository crepository;
	
	@Test
	public void findByTitleShouldReturnBook() {
		List<Book> books = repository.findByTitle("Test Book");
		//assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("Test Author");
	}
	
	@Test
	public void createNewBook() {
		Book book = new Book ("BookBook", "Bo Bocken", 1988, "123-1234", 25.50, crepository.findByName("Horror").get(0));
		repository.save(book);
		assertThat(book.getId()).isNotNull();
	}
	
	@Test
	public void deleteNewBook() {
		List<Book> books = repository.findByTitle("Test Book");
		Book book = books.get(0);
		repository.delete(book);
		List<Book> newBooks = repository.findByTitle("Test Book");
		assertThat(newBooks).hasSize(0);
	}

}
