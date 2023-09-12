package Services;

import Domen.PersonComparator;
import Domen.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * * @author Developer name
 * * @version 1.0
 * * @apiNote Класс для описания взиамодейсвтяи с перподавателями
 */
public class TeacherService implements iPersonService {

    /**
     * список преподавателей
     */
    private List<Teacher> teachers;

    /**
     * @apiNote конструктор класса
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    @Override
    /**
     * @apiNote получеине списка всех пропадавателей
     */
    public List getAll() {
        return teachers;
    }

    @Override
    /**
     * создание нового преподавателя
     */
    public void create(String name, int age) {
        Teacher tch = new Teacher(name, age, "basic");
        teachers.add(tch);
    }

    /**
     * печать списка преподавателей с сортировкой по имени
     */
    public void printByName() {
        PersonComparator<Teacher> persComp = new PersonComparator<>();
        teachers.sort(persComp);
        for (Teacher tch : teachers) {
            System.out.println("Преподаватель = " + tch);
        }
    }
}
