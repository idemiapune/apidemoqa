package in.pune.amanora.idemia.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.pune.amanora.idemia.model.Shelf;

@RestController
public class ShelfController {

	/*
	 * Get all shelves in a rack
	 * @author Shraddha
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/shelves")
	public List<Shelf> getShelves() {
		return RackController.rack.getShelves();
	}

	/*
	 * Add new shelf in a rack
	 * @RequestBody Shelf object
	 * @author Shraddha
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/shelves")
	public Shelf addShelf(@RequestBody Shelf shelf) {
		RackController.rack.getShelves().add(shelf);
		return shelf;

	}
}
