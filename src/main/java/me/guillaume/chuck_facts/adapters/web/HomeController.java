package me.guillaume.chuck_facts.adapters.web;

import me.guillaume.chuck_facts.application.ChuckFactsService;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import static org.slf4j.LoggerFactory.getLogger;

@Controller
public class HomeController {

    private final Logger log = getLogger(this.getClass());

    private final ChuckFactsService chuckFactsService;

    public HomeController(ChuckFactsService chuckFactsService) {
        this.chuckFactsService = chuckFactsService;
    }

    @GetMapping(value="/")
    public String home(Model model) {
        model.addAttribute("facts", chuckFactsService.facts());

        log.info("Home page returned - testing logstash integration");

        return "home";
    }

}
