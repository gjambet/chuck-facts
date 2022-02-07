package me.guillaume.chuck_facts.adapters.web;

import me.guillaume.chuck_facts.application.ChuckFactsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.security.Principal;

@Controller
public class AdminController {

    private final ChuckFactsService chuckFactsService;

    public AdminController(ChuckFactsService chuckFactsService) {
        this.chuckFactsService = chuckFactsService;
    }

    @GetMapping(value = "/admin")
    public String home(Model model) {
        model.addAttribute("facts", chuckFactsService.facts());
        return "admin";
    }

    @PostMapping(value = "/admin/delete", params = {"factId"})
    public String removeRow(HttpServletRequest req) {
        Long factId = Long.valueOf(req.getParameter("factId"));
        chuckFactsService.delete(factId);
        return "redirect:/admin";
    }

    @PostMapping("/admin/create")
    public String pidUserSubmit(@RequestParam(name = "fact") String fact, Principal principal) {
        String author = principal.getName();
        chuckFactsService.create(fact, author);
        return "redirect:/admin";
    }

}
