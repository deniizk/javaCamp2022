package com.example.Kodlama.io.Devs.dataAccess.concretes;

import com.example.Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
    }

    @Override
    public List<ProgrammingLanguage> getALl() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {

        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(int id) {
        programmingLanguages.remove(id);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        for (ProgrammingLanguage language : programmingLanguages) {
            if (language.getId() == programmingLanguage.getId()) {
                language.setId(programmingLanguage.getId());
                language.setName(programmingLanguage.getName());
            }
        }
    }
}
