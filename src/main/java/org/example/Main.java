package org.example;

import Controllers.AccountController;
import Domen.*;
import Services.TeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) throws Exception {
        /**
         * создание списка студентов
         */
        Student s1 = new Student("Ленар", 25);
        Student s2 = new Student("Ольга", 23);
        Student s3 = new Student("Николай", 22);
        Student s4 = new Student("Татьяна", 23);
        Student s5 = new Student("Марсель", 23);
        Student s6 = new Student("Елена", 23);
        Student s7 = new Student("Владислав", 25);
        Student s8 = new Student("Мария", 23);
        Student s9 = new Student("Анастсия", 22);
        Student s10 = new Student("Сергей", 23);
        Student s11 = new Student("Анна", 23);
        Student s12 = new Student("Полина", 23);
        Student s13 = new Student("Дмитрий", 25);
        Student s14 = new Student("Олег", 23);
        Student s15 = new Student("Андрей", 22);
        Student s16 = new Student("Наталья", 23);

        /**
         * формирование групп студентов
         */
        List<Person> listStud1 = new ArrayList<>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        listStud1.add(s7);

        List<Person> listStud2 = new ArrayList<>();
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        listStud2.add(s11);
        listStud2.add(s12);

        List<Person> listStud3 = new ArrayList<>();
        listStud3.add(s13);
        listStud3.add(s14);
        listStud3.add(s15);
        listStud3.add(s16);

        /**
         * формирование поток студентов
         */
        StudentGroup group4570 = new StudentGroup(listStud1, 4570);
        StudentGroup group4580 = new StudentGroup(listStud2, 4580);
        StudentGroup group4590 = new StudentGroup(listStud3, 4590);

        System.out.println("******** ВЫВОД ГРУПП СО СПИСОК СТУДЕНТОВ ********");
        System.out.println("=================================================");
        for (Person std : group4570) {
            System.out.println(std);
        }
        System.out.println("*************************************************");

        for (Person std : group4580) {
            System.out.println(std);
        }
        System.out.println("*************************************************");

        for (Person std : group4590) {
            System.out.println(std);
        }
        System.out.println("=================================================");
        System.out.println("");

        /**
         * формирование поток студентов
         */
        List<StudentGroup> stream1 = new ArrayList<>();
        stream1.add(group4570);
        stream1.add(group4580);

        List<StudentGroup> stream2 = new ArrayList<>();
        stream2.add(group4580);
        stream2.add(group4590);

        List<StudentGroup> stream3 = new ArrayList<>();
        stream3.add(group4590);
        stream3.add(group4570);


        StudentStream firstStream = new StudentStream(stream1, 11);
        StudentStream secondStream = new StudentStream(stream2, 12);
        StudentStream thirdStream = new StudentStream(stream3, 13);


        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ БЕЗ СОРТИРОВКИ ********");
        System.out.println("=================================================");
        for (StudentGroup grp : firstStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        for (StudentGroup grp : secondStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        for (StudentGroup grp : thirdStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");
        System.out.println("");

        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ СОРТИРОВКОЙ ПО РАЗМЕРУ ГРУППЫ ********");
        System.out.println("=================================================");
        Collections.sort(firstStream.getStream());
        for (StudentGroup grp : firstStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        Collections.sort(secondStream.getStream());
        for (StudentGroup grp : secondStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        Collections.sort(secondStream.getStream());
        for (StudentGroup grp : thirdStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");
        System.out.println("");

        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ СОРТИРОВКОЙ ПО НОМЕРУ ГРУППЫ ********");
        System.out.println("=================================================");
        Collections.sort(firstStream.getStream(), StudentGroup.compareById());
        for (StudentGroup grp : firstStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        Collections.sort(secondStream.getStream(), StudentGroup.compareById());
        for (StudentGroup grp : secondStream) {
            System.out.println(grp);
        }
        System.out.println("*************************************************");

        Collections.sort(thirdStream.getStream(), StudentGroup.compareById());
        for (StudentGroup grp : thirdStream) {
            System.out.println(grp);
        }
        System.out.println("=================================================");
        System.out.println("");

        System.out.println("******** ВЫВОД ПОТОКОВ СТУДЕНТОВ С УКАЗАНИЕМ НОМЕРА ПОТОКА, КОЛ-ВА СТУДЕНТОВ В ГРУППЕ И СПИСОКМ СТУДЕНТОВ ********");
        System.out.println("=================================================");
        System.out.println("firstStream = " + firstStream);
        System.out.println("*************************************************");

        System.out.println("secondStream = " + secondStream);
        System.out.println("*************************************************");

        System.out.println("thirdStream = " + thirdStream);
        System.out.println("=================================================");
        System.out.println("");

        /**
         * создаем список учителей
         */
        TeacherService tchCat = new TeacherService();
        tchCat.create("Галина", 55);
        tchCat.create("Татьяна", 57);
        tchCat.create("Ольга", 35);
        tchCat.create("Владимир", 62);
        tchCat.create("Анатолий", 44);
        tchCat.create("Николай", 40);



        System.out.println("Срединй возврас студентов = " + AccountController.averageAge(listStud1));
        System.out.println("=================================================");
        System.out.println("");


        System.out.println("Срединй возврас студентов = " + AccountController.averageAge(tchCat.getAll()));
        System.out.println("=================================================");
        System.out.println("");

        System.out.println("ВЫВОД СПИСКА УЧИТЕЛЕЙ С СОРТИРОВКОЙ ПО ИМЕНИ");
        System.out.println("=================================================");
        tchCat.printByName();
        System.out.println("=================================================");
        System.out.println("");


    }


}