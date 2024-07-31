package Challenge4;

public class Main {
    public static void main(String[] args) {
        KarlsLanguages languageList = new KarlsLanguages();

        if (languageList.isEmpty()) {
            languageList.findMoreLanguagesToLearn();
        }
        languageList.addLanguage("Kotlin");
        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");
        languageList.addLanguage("Scala");
        languageList.addLanguage("Java");
        System.out.println("List of languages: "+languageList.getLanguages());
        languageList.removeLanguage("Scala");
        System.out.println("After removing \"Scala\": "+languageList.getLanguages());
        System.out.println("Return first language: " +languageList.firstLanguage());
        System.out.println("Total number of languages available: " +languageList.count());
        System.out.println("Python language is present? " +languageList.containsLanguage("Python"));
        System.out.println("Ruby language is present? " +languageList.containsLanguage("Ruby"));
        System.out.println("Exciting languages are present? " +languageList.isExciting());
    }
}
