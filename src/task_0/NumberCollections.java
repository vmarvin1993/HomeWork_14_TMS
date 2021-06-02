package task_0;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 0. Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме
 */
public class NumberCollections {


    public static void main(String[] args) {
        List<Integer> arrayList = Arrays.asList(1, 2, 5, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);

        System.out.println(arrayList.toString());

        List<Integer> dNumbers = arrayList.stream()
                .distinct() //doubles
                .collect(Collectors.toList());
        System.out.println(dNumbers);

        List<Integer> evenNumbers = arrayList.stream()
                .filter(n -> n >= 7) // 7
                .filter(n -> n <= 17) // 17 filter
                .filter(i -> i % 2 == 0) //even numbers
                .collect(Collectors.toList());
        System.out.println(evenNumbers);
        System.out.println();

        List<Integer> multNum = arrayList.stream()
                .map(i -> i * 2)
                .collect(Collectors.toList()); //Each element is multiplied by 2
        System.out.println(multNum);

        List<Integer> sortNum = arrayList.stream()
                .sorted()
                .limit(4)
                .collect(Collectors.toList()); // Sort and output the first 4 items
        System.out.println(sortNum);


        System.out.print(arrayList.stream().count()); //Number of items in the stream
        System.out.println();


        System.out.print(arrayList.stream().mapToInt(Integer::intValue).average()); //Output the arithmetic mean of all numbers in the stream
    }
}
