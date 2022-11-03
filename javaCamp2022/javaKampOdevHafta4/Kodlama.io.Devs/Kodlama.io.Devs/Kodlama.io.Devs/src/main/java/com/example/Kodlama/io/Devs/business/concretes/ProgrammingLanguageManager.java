package com.example.Kodlama.io.Devs.business.concretes;

import com.example.Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import com.example.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getALl() {
        return programmingLanguageRepository.getALl();
    }


    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        if (programmingLanguage.getName().isEmpty()) {
            for (ProgrammingLanguage language : programmingLanguageRepository.getALl()) {
                if (language.getName() == programmingLanguage.getName()) {
                    System.out.println("Programlama ismi tekrar edemez.");
                }
            }
            programmingLanguageRepository.add(programmingLanguage);
        }
    }

    @Override
    public void delete(int id) {
        programmingLanguageRepository.delete(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.update((programmingLanguage));
    }
}
