package su22.sof3021.controllers.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import su22.sof3021.beans.AccountModel;
import su22.sof3021.entities.Account;
import su22.sof3021.repositories.AccountRepository;

@Controller
@RequestMapping("/admin/accounts")
public class AccountController {
	@Autowired
	private AccountRepository accountRepo;
	
//	@Autowired
//	private Account account;
	
	@GetMapping("create")
	public String create(@ModelAttribute("account") AccountModel account )
	{
		return "admin/accounts/create";
	}
	
	@PostMapping("store")
	public String store(AccountModel accModel)
	{
		// Chuyển AccountModel -> entities.Account
		Account account = new Account();
		account.setFullname(accModel.getFullname());
		account.setEmail(accModel.getEmail());
		account.setUsername(accModel.getUsername());
		account.setPassword(accModel.getPassword());
		account.setPhoto(accModel.getPhoto());
		account.setAdmin(accModel.getAdmin());
		account.setActivated(0);
		this.accountRepo.save(account);

		return "redirect:/admin/accounts/create";
	}
	
	@GetMapping("delete/{id}")
	public String delete(@PathVariable("id") Account account)
	{
		// Truy vấn theo id
//		Account a = this.accountRepo.getOne(id);
		System.out.println(account.getEmail());
		return "redirect:/admin/accounts/create";
	}
	
	@GetMapping("index")
	public String index(
		Model model,
		@RequestParam(name="page", defaultValue="0") Integer page,
		@RequestParam(name="size", defaultValue="10") Integer size
	) {
		Account a = this.accountRepo.findAccountFPTByUsername("tiennh24");
		System.out.println(a.getFullname());
		Pageable pageable = PageRequest.of(page, size);
		Page<Account> data = this.accountRepo.findAll(pageable);
		model.addAttribute("data", data);
		return "admin/accounts/index";
	}
}
