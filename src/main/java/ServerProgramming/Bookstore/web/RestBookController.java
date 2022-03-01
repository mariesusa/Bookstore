package ServerProgramming.Bookstore.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ServerProgramming.Bookstore.domain.Book;
import ServerProgramming.Bookstore.domain.BookRepository;

@RestController
public class RestBookController {
	
	@Autowired
	private BookRepository repository;
	
	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<Book> booklistRest() {
		return (List<Book>) repository.findAll();
	}
	
	@RequestMapping(value="/books/{id}", method = RequestMethod.GET)
	public Optional<Book> findBookRest(@PathVariable("id") Long id) {
		return repository.findById(id);
	
	}
}
