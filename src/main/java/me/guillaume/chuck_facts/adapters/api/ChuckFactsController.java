package me.guillaume.chuck_facts.adapters.api;

import me.guillaume.chuck_facts.application.ChuckFactsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static java.util.stream.Collectors.toList;

@RestController
public class ChuckFactsController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    private final ChuckFactsService chuckFactsService;

    public ChuckFactsController(ChuckFactsService chuckFactsService) {
        this.chuckFactsService = chuckFactsService;
    }


    @GetMapping(value = "/api/chuck-facts")
    public List<String> facts() {
        logger.info("Serving Facts");
        return chuckFactsService.facts()
                .stream()
                .map(p -> p.getName())
                .collect(toList());
    }

}