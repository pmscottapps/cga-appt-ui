package pl.ncplus.cgaapptui.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * WelcomeController
 */
@Controller
public class WelcomeController {

    @Value("${application.name}")
    private String applicationName;
    
    @Value("${build.version}")
    private String buildVersion;

    @RequestMapping("/")
    public String welcome(Model model) {

        String title = "Aplikacja testowa";

        String text = "...";
        text = new StringBuilder(text).append("+ cl200 +").toString();
        
        String app = applicationName;
        String version = buildVersion;

        model.addAttribute("title", title);
        model.addAttribute("text", text);
        model.addAttribute("app", app);
        model.addAttribute("version", version);
        
        return "index";
    }

}