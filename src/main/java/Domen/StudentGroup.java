package Domen;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания группы студентов учебного заведения
 */
public class StudentGroup implements Iterable<Person>, Comparable<StudentGroup> {
    private List<Person> group;
    private Integer idGroup;

    /**
     * @param group   список студентов группы
     * @param idGroup идентификатор (номер) группы
     * @apiNote конструктор класса
     */
    public StudentGroup(List<Person> group, Integer idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    public List<Person> getGroup() {

        return group;
    }

    public void setGroup(List<Person> group) {

        this.group = group;
    }

    public Integer getIdGroup() {

        return idGroup;
    }

    public void setIdGroup(Integer idGroup) {

        this.idGroup = idGroup;
    }

    public int getGroupSize() {
        return this.group.size();
    }

    /**
     * @apiNote метод соритровки по номеру группы
     */
    public static Comparator<StudentGroup> compareById() {
        return new Comparator<StudentGroup>() {
            @Override
            public int compare(StudentGroup o1, StudentGroup o2) {
                if (o1.getIdGroup() == o2.getIdGroup()) {
                    if (o1.getGroupSize() == o2.getGroupSize()) {
                        return 0;
                    } else if (o1.getGroupSize() > o1.getGroupSize()) {
                        return 1;
                    } else {
                        return -1;
                    }
                } else if (o1.getIdGroup() > o2.getIdGroup()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };
    }

    @Override
    public String toString() {
        return "idGroup = " + idGroup +
                " groupSize = " + group.size() +
                "\nStudents= " + group;
    }

    @Override
    public Iterator<Person> iterator() {
        return new PersonIterator(group);
    }

    /**
     * @apiNote метод сортировки по количеству студентов в группе
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.getGroupSize() == o.getGroupSize()) {
            if (this.getIdGroup() == o.getIdGroup()) {
                return 0;
            } else if (this.getIdGroup() > o.getIdGroup()) {
                return 1;
            } else {
                return -1;
            }
        } else if (this.getGroupSize() > o.getGroupSize()) {
            return 1;
        } else {
            return -1;
        }
    }
}


