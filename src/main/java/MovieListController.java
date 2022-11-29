import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MovieListController {

    @GetMapping
    @RequestMapping(method= RequestMethod.GET, value = "/movie")
    public String index100(Model model) {
        // add `message` attribute
        model.addAttribute("message", "Thank you for visiting.");
        // return view name
        return "page1";
    }
}
