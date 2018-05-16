package in.pune.amanora.idemia.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.pune.amanora.idemia.model.Book;
import in.pune.amanora.idemia.model.Shelf;

@RestController
public class ShelfController {

	/*
	 * Get all shelves in a rack
	 * 
	 * @author Shraddha
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/shelves")
	public List<Shelf> getShelves() {
		return RackController.rack.getShelves();
	}

	/*
	 * Add new shelf in a rack
	 * 
	 * @RequestBody Shelf object
	 * 
	 * @author Shraddha
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/shelves")
	public Shelf addShelf(@RequestBody Shelf shelf) {
		RackController.rack.getShelves().add(shelf);
		return shelf;

	}

	/*
	 * Get shelf details for requested shelf Id
	 * 
	 * @author Riya
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/shelves/{id}")
	public Shelf getShelfDetails(@PathVariable("id") long id) {
		for (int i = 0; i < RackController.rack.getShelves().size(); i++) {
			if (RackController.rack.getShelves().get(i).getId() == id) {
				return RackController.rack.getShelves().get(i);
			}
		}
		return null;
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/shelves/{id}")
	public Shelf updateShelf(@PathVariable("id") long id, @RequestBody Shelf shelf) {
		for (int i = 0; i < RackController.rack.getShelves().size(); i++) {
			if (RackController.rack.getShelves().get(i).getId() == id) {
				if(shelf.getId() != 0) 
					RackController.rack.getShelves().get(i).setId(shelf.getId());
				if(shelf.getCapacity() != 0) 
					RackController.rack.getShelves().get(i).setCapacity(shelf.getCapacity());
				if(!shelf.getBooks().isEmpty()) 
					RackController.rack.getShelves().get(i).setBooks(shelf.getBooks());
			}
	}
		return shelf;
	}
}
