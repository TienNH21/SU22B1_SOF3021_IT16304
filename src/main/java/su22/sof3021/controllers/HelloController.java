package su22.sof3021.controllers;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("home")
public class HelloController {
	@RequestMapping(value="hello", method=RequestMethod.GET)
	public String hello(
		Model model,
//		@RequestParam(
//			name="ho_ten",
//			defaultValue="IT16304"
//		) String hoTen
		@RequestParam(name="ho_ten") Optional<String> hoTen
	) {
		String name = "";
		if (hoTen.isPresent()) {
			name = hoTen.get();
		} else {
			name = "FPT Polytechnic";
		}
		
		model.addAttribute("message", name);
		return "hello";
	}
}
