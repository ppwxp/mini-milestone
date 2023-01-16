package org.example.employee;

import java.util.Random;

public enum Language {
    English, German, Spanish, Polish;
    private static final Random random = new Random();
    public static Language getRandomLanguage() {
        Language[] allLanguages = Language.values();
        return allLanguages[random.nextInt(allLanguages.length - 1)];
    }

}
