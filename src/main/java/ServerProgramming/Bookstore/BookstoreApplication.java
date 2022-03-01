package ServerProgramming.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ServerProgramming.Bookstore.domain.Book;
import ServerProgramming.Bookstore.domain.BookRepository;
import ServerProgramming.Bookstore.domain.Category;
import ServerProgramming.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
//	@Bean
//	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository) {
//		return (args) -> {
//			log.info("save new books");
//			crepository.save(new Category("Horror"));
//			crepository.save(new Category("Classics"));
//			crepository.save(new Category("Crime"));
//			
//			repository.save(new Book("Test Book", "Test Author", 1988, "12322-232495", 20.00, crepository.findByName("Horror").get(0)));
//			repository.save(new Book("Testing Book 2", "Author Nauthor", 1995, "123-09876", 400.90, crepository.findByName("Crime").get(0)));
//			repository.save(new Book("Booken 3", "Guy Writer", 2019, "754-948545", 3000.05, crepository.findByName("Classics").get(0)));
//			
//			log.info("fetch all books");
//			for (Book book : repository.findAll()) {
//				log.info(book.toString());
//			}
//		};
//	}

}
