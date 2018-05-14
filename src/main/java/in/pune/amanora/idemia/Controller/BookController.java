package in.pune.amanora.idemia.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.pune.amanora.idemia.model.Book;

@RestController
public class BookController {

	@RequestMapping(method = RequestMethod.GET, value = "/shelves/{id}/books")
	public List<Book> getBooks(@PathVariable("id") long id) {
		for (int i = 0; i < RackController.rack.getShelves().size(); i++) {
			if (RackController.rack.getShelves().get(i).getId() == id) {
				return RackController.rack.getShelves().get(i).getBooks();
			}
		}
		return null;
	}

}
