package me.guillaume.chuck_facts.adapters.react_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReactDataController {

    @GetMapping("/react/data")
    public List<JobResult> data() {
        var result = new ArrayList<JobResult>();
        for (int i = 0; i <= 9; i++) {
            result.add(new JobResult("job " + i));
        }
        return result;
    }

}

