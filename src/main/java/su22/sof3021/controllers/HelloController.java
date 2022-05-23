package su22.sof3021.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import su22.sof3021.beans.User;
import su22.sof3021.demo_bean_config.UserDAOInterface;

@Controller
@RequestMapping("home")
public class HelloController {
	@Autowired
	private User user;

	@Autowired
	@Qualifier("user_dao_mysql")
	private UserDAOInterface userDAO;
	
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
	
	@ResponseBody
	@GetMapping("demo-bean")
	public String demoBean()
	{
		userDAO.create(this.user);
		userDAO.update(this.user);
		userDAO.delete(this.user);
		return "Hello, " + user.getHoTen();
	}
}
