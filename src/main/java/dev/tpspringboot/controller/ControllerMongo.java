package dev.tpspringboot.controller;

import dev.tpspringboot.document.Formation;
import dev.tpspringboot.repository.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/formations")
public class ControllerMongo {

    @Autowired
    private FormationRepository formationRepo;
    @RequestMapping(method = RequestMethod.GET)
    public List<Formation> listerformations() {

        return this.formationRepo.findAll();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void insertFormation(@RequestBody Formation f) {
        this.formationRepo.save(f);
    }

}
