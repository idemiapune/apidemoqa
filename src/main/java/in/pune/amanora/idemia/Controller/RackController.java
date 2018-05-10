package in.pune.amanora.idemia.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.pune.amanora.idemia.model.Rack;

@RestController
public class RackController {

	static Rack rack = new Rack();

	@RequestMapping(value = "/rack")
	public Rack getRack() {
		return rack;
	}

}