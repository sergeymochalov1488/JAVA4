package Domen;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания студента учебного заведения
 */
public class Student extends Person implements Comparable<Student> {

    /**
     * уникальный идентификатор студента
     */
    private int id;
    private static int generalId = 1;

    /**
     * @param name имя студента
     * @param age  возраст студента
     * @apiNote констрктор класса
     */
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId++;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Students [age=" + super.getAge() + ", name=" + super.getName() + ", id=" + id + "]";
    }

    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (id == o.id) return 0;
            if (id > o.id) return 1;
            else return -1;
        }
        if (super.getAge() > o.getAge())
            return 1;
        else
            return -1;
    }
}