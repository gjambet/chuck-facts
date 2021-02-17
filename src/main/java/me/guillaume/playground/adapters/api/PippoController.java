package me.guillaume.playground.adapters.api;

import me.guillaume.playground.application.PippoService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;
import static org.springframework.http.MediaType.TEXT_PLAIN_VALUE;

@RestController
public class PippoController {

    private final PippoService pippoService;

    public PippoController(PippoService pippoService) {
        this.pippoService = pippoService;
    }


    @GetMapping(value="/pippo")
    public List<String> pippos() {
        return pippoService.pippos()
                .stream()
                .map(p-> p.getName())
                .collect(toList());
    }

}
