package com.company;

import java.util.ArrayList;
import java.util.Collections;

public interface RandomLanguage {
    default Language getRandomLanguage() {
        ArrayList<Language> languageList =new ArrayList<>();
        languageList.add(Language.ENGLISH);
        languageList.add(Language.SPANISH);
        languageList.add(Language.GERMAN);
        languageList.add(Language.RUSSIAN);
        Collections.shuffle(languageList);
        return languageList.get(0);
    }
}
