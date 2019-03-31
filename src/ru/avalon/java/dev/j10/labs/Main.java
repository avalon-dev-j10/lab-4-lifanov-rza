package ru.avalon.java.dev.j10.labs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
	    String[] strings = {"авто", "якорь", "корабль", "кран", "светофор", 
                "ковш", "улыбка", "step", "Scan", "1 из 2", "Семь", "огонь батарея!",
                "cafebabe", "премия", "выборка", "time", "глина", "Java", "storm", "radio"};

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
	    Person[] persons = new Developer[20];
            persons[0] = new Developer("Олег", new Date(93, 0, 1));
            persons[1] = new Developer("Игорь", new Date(94, 1, 11));
            persons[2] = new Developer("Денис", new Date(94, 11, 18));
            persons[3] = new Developer("Вячеслав", new Date(95, 10, 9));
            persons[4] = new Developer("Рустам", new Date(89, 4, 0));
            persons[5] = new Developer("Света", new Date(90, 6, 10));
            persons[6] = new Developer("Олег", new Date(93, 3, 26));
            persons[7] = new Developer("Яна", new Date(91, 5, 27));
            persons[8] = new Developer("Ольга", new Date(75, 9, 24));
            persons[9] = new Developer("Николай", new Date(82, 8, 15));
            persons[10] = new Developer("Александр", new Date(79, 0, 17));
            persons[11] = new Developer("Володя", new Date(73, 5, 19));
            persons[12] = new Developer("Александра", new Date(100, 4, 11));
            persons[13] = new Developer("Олег", new Date(73, 9, 0));
            persons[14] = new Developer("Егор", new Date(98, 2, 13));
            persons[15] = new Developer("Дмитрий", new Date(96, 0, 12));
            persons[16] = new Developer("Татьяна", new Date(92, 0, 8));
            persons[17] = new Developer("Виктория", new Date(83, 5, 6));
            persons[18] = new Developer("Петр", new Date(85, 2, 4));
            persons[19] = new Developer("Антонина", new Date(99, 6, 1));
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        
        Sort sort = new SortList();
            
        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new ComparatorReverseSort();

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("----------До сортировки----------");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }
        sort.sort(persons);
        System.out.println("");
        System.out.println("---------После сортировки--------");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        System.out.println("");
        System.out.println("----------До сортировки----------");
        System.out.println(Arrays.toString(strings));
        sort.sort(strings);
        System.out.println("---------После сортировки--------");
        System.out.println(Arrays.toString(strings));
        
        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        System.out.println("-------Реверсная сортировка------");
        System.out.println(Arrays.toString(strings));
    }
}
