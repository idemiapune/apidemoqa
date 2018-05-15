package in.pune.amanora.idemia.Controller;

import in.pune.amanora.idemia.model.Book;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

	/*Get books in a particular shelf
	 * @Path variable 'id' : for shelf id
	 * @Author : Swarshri
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/shelves/{id}/books")
	public List<Book> getBooks(@PathVariable("id") long id) {
		for (int i = 0; i < RackController.rack.getShelves().size(); i++) {
			if (RackController.rack.getShelves().get(i).getId() == id) {
				return RackController.rack.getShelves().get(i).getBooks();
			}
		}
		return null;
	}

	/*Get a particular book details in a particular shelf.
	 * @ Two Path variable needed for shelfid 'id' & bookid 'bookid'
	 * @Author : Swarshri
	 */
	
	@RequestMapping(method = RequestMethod.GET, value = "/shelves/{id}/books/{bookid}")
	public Book getBookDetails(@PathVariable("id") long id,@PathVariable("bookid") long bookid) {
		for (int i = 0; i < RackController.rack.getShelves().size(); i++) {

			if (RackController.rack.getShelves().get(i).getId() == id) {
				for (int j = 0; j < RackController.rack.getShelves().get(i)
						.getBooks().size(); j++) {

					if (RackController.rack.getShelves().get(i).getBooks()
							.get(j).getId() == bookid) {
						return RackController.rack.getShelves().get(i).getBooks().get(j);
					}
				}
			}

		}
		return null;

	}
	
	/*
	 * Below API is for adding new Book in a shelf
	 * @RequestBody Book object
	 * @author Riya
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/shelves/{id}/books")
	public Book addBook(@PathVariable("id") long id, @RequestBody Book book) {
		for (int i = 0; i < RackController.rack.getShelves().size(); i++) {
			if (RackController.rack.getShelves().get(i).getId() == id) {
				RackController.rack.getShelves().get(i).getBooks().add(book);
				return book;
			}
		}
		return book;
	}
}
