package su22.sof3021.controllers.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import su22.sof3021.beans.User;

@RequestMapping("/admin/user")
@Controller
public class UserController {
	@RequestMapping("create")
	public String create(@ModelAttribute("user") User user)
	{
		return "admin/users/create";
	}
	
//	@PostMapping("store")
//	public String store()
//	{
//		return "redirect:admin/users/create";
//	}

}
