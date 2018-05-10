package in.pune.amanora.idemia.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.pune.amanora.idemia.model.Shelf;

public class ShelfController {

	@RequestMapping(method = RequestMethod.GET, value = "/shelves")
	public List<Shelf> getShelf() {
		return RackController.rack.getShelves();
	}

}
