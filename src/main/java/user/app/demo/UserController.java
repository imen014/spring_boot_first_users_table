package user.app.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.app.demo.model.User;
import user.app.demo.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService user_service;
	
	@GetMapping("/users")
	public String printName() {
		return "sahar.html";
	}
	
    @GetMapping("/users/all")
	@ResponseBody
	public List<User> getUsers() {
        return user_service.getAllUsers();
    }
    
   @GetMapping("/create_user")
    public String createUserForm() {
         return "form.html";
    }

    
   
   @PostMapping("/save_user")
   public String createUser(@RequestParam("username") String username, @RequestParam("email") String email) {
       User user = new User();
       user.setUsername(username); 
       user.setEmail(email); 
       user_service.createUser(user);
       return "redirect:/users/all"; 
   }



}
