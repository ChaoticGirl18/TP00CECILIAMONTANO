package controllerñam;
import controler.Controller;
import controler.GetMapping;
@Controller

public class Calculadoracontroller {
	@GetMapping("/menu");
	public String obtenerMenu () {
		
		
		
		return ("index");
		
	}

}
