package task_1;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * С помощью Stream'ов:
 * - Вернуть количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
 * - Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * - Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
 */

public class StudentCollection {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("Evgenii");
        myList.add("Anton");
        myList.add("Vitali");
        myList.add("Olga");
        myList.add("Julia");
        myList.add("Vitali");
        myList.add("Maria");
        myList.add("Alex");
        myList.add("Tasja");
        myList.add("Egor");

        System.out.println(myList.toString()); //Print list
        System.out.println("---------");
        myList.stream().filter(i -> Collections.frequency(myList, i) > 1)
                .collect(Collectors.toSet()).forEach(System.out::println); //Print double names
        System.out.println("---------");
        myList.stream()
                .map(String::toLowerCase)
                .filter(n -> n.startsWith("a"))
                .collect(Collectors.toList())
                .forEach(System.out::println);//Print names start with "A"
        System.out.println("---------");

        System.out.println(myList.stream().findFirst().orElse("Empty")); //Print first student on list.


    }
}
