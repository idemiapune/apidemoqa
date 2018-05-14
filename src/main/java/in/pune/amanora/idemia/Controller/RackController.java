package in.pune.amanora.idemia.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.pune.amanora.idemia.model.Rack;

@RestController
public class RackController {

	public static Rack rack = new Rack();

	/*
	 * Get Rack details
	 * 
	 * @author Shraddha
	 */
	@RequestMapping(value = "/rack")
	public Rack getRack() {

		return rack;
	}

	/*
	 * Add new Rack
	 * 
	 * @RequestBody Rack object
	 * 
	 * @author Shraddha
	 */
	@RequestMapping(method = RequestMethod.POST, value = "/rack")
	public Rack addRack(@RequestBody Rack rack) {
		if (RackController.rack.getId() == 0 ) {
			RackController.rack.setId(rack.getId());
			RackController.rack.setNoOfShelves(rack.getNoOfShelves());
			RackController.rack.setShelves(rack.getShelves());
		}
		return RackController.rack;
	}

}