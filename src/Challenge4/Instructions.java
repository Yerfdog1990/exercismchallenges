package Challenge4;
/*
Instructions
Karl wants to keep track of a list of languages to learn on Exercism's website. Karl needs to be able to add new languages,
remove old ones and check if certain languages are in the list. It would be very exciting if Karl wants to learn Java or Kotlin!

1. Define a function to check if the language list is empty
Karl needs to know if his list of languages ever becomes empty, so he can go find more to learn! Define a method called
isEmpty which returns true if there are no languages in the list.
2. Define a function to add a language to the list
Karl is looking forward to learning Kotlin and Python! Help Karl get started by defining a method called addLanguage
which takes the language he wants to learn and adds it to the list.
4. Define a function to return the first item in the list
Karl wants to remember the first language he added to the list (that is still in the list). Define a method called firstLanguage that
returns the first language in the list.
5. Define a function to return how many languages are in the list
Karl needs to know how many languages he is trying to learn. Help Karl find the answer by defining a method called count which returns the number of languages in the list.
6. Define a function to determine if a language is in the list
Karl is trying to remember if he wanted to learn Python or Ruby. Define a method called containsLanguage which takes the language he is asking about so Karl can find out!
7. Define a function to determine if the list is exciting
If Karl wants to learn Java or Kotlin, that is very exciting! Define a method called isExciting that returns true if Karl wants to learn Java or Kotlin.
 */

import java.util.List;

public interface Instructions<E> {
    // Dummy method to simulate finding more languages to learn
    void findMoreLanguagesToLearn();
    //1. Define a function to check if the language list is empty
    boolean isEmpty();
    //2. Define a function to add a language to the list
    void addLanguage(String language);
    //3. Define a function to remove a language from the list
    public void removeLanguage(String language);
    //4. Define a function to return the first item in the list
    public String firstLanguage();
    //5. Define a function to return how many languages are in the list
    public int count();
    //6. Define a function to determine if a language is in the list
    public boolean containsLanguage(String language);
    //7. Define a function to determine if the list is exciting
    public boolean isExciting();


}
