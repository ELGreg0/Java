import java.util.*;

public class Task1 {
    public static void main(String[] args){
        List<String> words = Arrays.asList(
                "Женя", "Вася", "Оля", "Петя", "Гоша",
                "Саша", "Гоша", "Женя", "Андрей", "Сева",
                "Инакентий", "Петя", "Вася", "Вася", "Вадим",
                "Гоша", "Саша", "Гоша", "Влад", "Андрей"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Первоначальный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречаемости слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}
