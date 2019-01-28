package minishop.irerin07.github.controller;

import minishop.irerin07.github.service.MainService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class MainController {
    MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("text", "안녕하세요");
        return "index";

    }


}

//    @Controller
//    public class UserController {
//        UserService userService;
//
//        public UserController(UserService userService){
//            this.userService = userService;
//        }
//
//        //  @RequestMapping(method=GET, path="/list") 와 같은 것
//        @GetMapping("/list")
//        public String main(Model model){
//            List<User> users = userService.getUsers();
//            model.addAttribute("users", users);
//            return "index"; // view name
//        }
//    }

