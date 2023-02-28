package net.codejava;
 
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
 
@Controller
public class AppController {
	//@GetMapping("/signup_form")
	//public String deva(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
	//	model.addAttribute("name", name);
	//	return "signup_form";
	//}
	 @Autowired
	    private UserRepository userRepo;
	     
	    @GetMapping("")
	    public String viewHomePage() {
	        return "index";
	    }
    @GetMapping("/signup_form")
    public String showRegistrationForm(Model model) {
       model.addAttribute("user", new User());
         
        return "signup_form";
    }
}