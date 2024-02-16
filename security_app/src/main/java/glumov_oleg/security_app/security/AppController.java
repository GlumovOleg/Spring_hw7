package glumov_oleg.security_app.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping("/login")
    public String loginEndpointer() {
        return "Login!";
    }

    @GetMapping("/admin")
    public String adminEndpointer() {
        return "Login is admin!";
    }

    @GetMapping("/user")
    public String userEndpointer() {
        return "Login is slave :)";
    }

    @GetMapping("/all")
    public String allRolesEndpointer() {
        return "Mass logins!";
    }

    @GetMapping("/delete")
    public String deleteEndpointer(@RequestBody String s) {
        return "bay bay :)" + s;
    }

}
