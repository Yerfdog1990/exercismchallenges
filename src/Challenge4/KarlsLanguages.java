package Challenge4;

import java.util.ArrayList;
import java.util.List;

public class KarlsLanguages<E> implements Instructions{
    private final List<String> languages = new ArrayList<>();

    public KarlsLanguages() {
    }

    public List<String> getLanguages() {
        return languages;
    }
    @Override
    public void findMoreLanguagesToLearn(){
        System.out.println("The language list is empty. Finding more languages to learn...");
    }

    @Override
    public boolean isEmpty() {
        return languages.isEmpty();
    }

    @Override
    public void addLanguage(String language) {
        languages.add(language);
    }

    @Override
    public void removeLanguage(String language) {
        languages.remove(language);
    }

    @Override
    public String firstLanguage() {
        return languages.removeFirst();
    }

    @Override
    public int count() {
        return languages.size();
    }

    @Override
    public boolean containsLanguage(String language) {
        return (languages.contains(language) || languages.contains(language));
    }

    @Override
    public boolean isExciting() {
        return containsLanguage("Java") || containsLanguage("Kotlin");
    }
}
