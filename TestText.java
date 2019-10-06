//Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст, вывести
//        на консоль текст, заголовок текста.

package by.epam.jb29.task12;

public class TestText {
    public static void main(String[] args) {
        Word word = new Word("Test1");
        Sentence sentence = new Sentence();
        Text text = new Text(word)
                ;

        Word word1 = new Word("Test2");
        Word word2 = new Word("Test3");
        Word word3 = new Word("Test4");
        Word word4 = new Word("Test5");

        sentence.addWord(word1);
        sentence.addWord(word2);
        sentence.addWord(word3);
        sentence.addWord(word4);

        text.add_Text(sentence);

        System.out.println("Заголовок текста: " + text.getTitle()
                + "\n" + "Текст: " + text.getText());
    }
}