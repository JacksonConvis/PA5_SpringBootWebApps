package grandcircus.co.practiceassessment5;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String calculator() {
		return "calculator";
	}
	
	@PostMapping("/result")
	public String result(Model model, @RequestParam int num_one, @RequestParam int num_two, @RequestParam String operator) {
		
		if(operator.equalsIgnoreCase("plus")) {
			model.addAttribute("mathResult", num_one+num_two);	
		}else if(operator.equalsIgnoreCase("minus")) {
			model.addAttribute("mathResult", num_one-num_two);
		}else if(operator.equalsIgnoreCase("multiply")) {
			model.addAttribute("mathResult", num_one*num_two);
		}else {
			model.addAttribute("mathResult", num_one/num_two);
		}
		
		model.addAttribute("operator", operator);
		return "result";
	}
}
