package in.pune.amanora.idemia.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.pune.amanora.idemia.model.Shelf;

@RestController
public class ShelfController {

	@RequestMapping(method = RequestMethod.GET, value = "/shelves")
	public List<Shelf> getShelves() {
		return RackController.rack.getShelves();
	}

}
