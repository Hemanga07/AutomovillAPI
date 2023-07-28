package AutomovAuth.auto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/home")
    public String home() {
        return "This is the Home Page";
    }

    @GetMapping("/admin")
    public String admin() {
        return "This is the Admin Page";
    }
}
