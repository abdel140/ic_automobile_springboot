package com.epsi.ic_automobile.api.controller;

import com.epsi.ic_automobile.api.repository.ClientRepository;
import com.epsi.ic_automobile.api.repository.ContratRepository;
import com.epsi.ic_automobile.model.Contrat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/contrat")
public class ContratController {

    ClientRepository repo;

    public ContratController(ClientRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/client")
    public Contrat getContratByIdClient(@RequestParam("id") int idClient){
        log.debug("id client = "+ idClient);
        Contrat contrat = repo.findById(idClient).orElseThrow().getContrat();
        return contrat;
    }
}
