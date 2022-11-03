package com.example.Kodlama.io.Devs.dataAccess.abstracts;

import com.example.Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getALl();

    void add(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    void update(ProgrammingLanguage programmingLanguage);
}
