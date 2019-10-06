//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести
//        на консоль текст, заголовок текста.

package by.epam.jb29.task12;

import java.util.Scanner;

class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public String getWord() {
        return word;
    }
}

class Sentence {
    private String sentence = "";

    public void addWord(Word word) {
        sentence += " " + word.getWord();
    }

    public String getSentence() {
        return sentence;
    }
}

class Text {
    private String title;
    private String text = "";

    public Text(Word word) {
        this.title = word.getWord();
    }

    public Text(Sentence sentence) {
        this.title = sentence.getSentence();
    }

    public void add_Text (Word word) {
        text += " " + word.getWord();
    }

    public void add_Text (Sentence sentence) {
        text += " " + sentence.getSentence();
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
