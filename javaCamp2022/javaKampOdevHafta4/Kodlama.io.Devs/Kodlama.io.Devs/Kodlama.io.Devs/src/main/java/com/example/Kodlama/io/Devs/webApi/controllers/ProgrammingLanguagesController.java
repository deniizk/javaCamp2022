package com.example.Kodlama.io.Devs.webApi.controllers;

import com.example.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getALl();
    }

    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/{id}")
    public void delete(int id) {
        programmingLanguageService.delete(id);
    }

    @PutMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.update(programmingLanguage);
    }

}
