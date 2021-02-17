package me.guillaume.playground.application;

import me.guillaume.playground.infrastructure.persistence.Pippo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PippoService {

    public List<Pippo> pippos() {
        return List.of(new Pippo("default pippo"));
    }

}
