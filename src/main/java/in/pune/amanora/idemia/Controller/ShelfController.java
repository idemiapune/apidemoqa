package in.pune.amanora.idemia.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.pune.amanora.idemia.model.Shelf;

public class ShelfController {

	public static Shelf shelf = new Shelf();

	@RequestMapping(method = RequestMethod.GET, value = "/shelves")
	public Shelf getShelf() {
		return shelf;
	}

}
