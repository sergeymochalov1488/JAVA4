package Domen;

import java.util.Iterator;

/**
Родительский класс для описания участинка учебного заведения
 */
public class Person {

    private String name;

    private int age;

    /**
     * @param name имя участинка
     * @param age  возраст учатинка
     * @apiNote констрктор класса
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}
