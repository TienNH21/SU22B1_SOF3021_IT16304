package su22.sof3021.controllers.admin;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import su22.sof3021.beans.User;

@RequestMapping("/admin/user")
@Controller
public class UserController {
	@RequestMapping("create")
	public String create(
		Model model,
		@Validated @ModelAttribute("user") User user,
		BindingResult bindResult
	) {
//		bindResult.
		System.out.println( bindResult.hasErrors() );
		if (bindResult.hasErrors() == true) {
			System.out.println("Form ko hợp lệ");
		} else {
			System.out.println("Form hợp lệ");			
		}
		return "admin/users/create";
	}
	
//	@PostMapping("store")
//	public String store()
//	{
//		return "redirect:admin/users/create";
//	}

}
