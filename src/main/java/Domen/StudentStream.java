package Domen;

import java.util.Iterator;
import java.util.List;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote Класс для описания потока студентов учебного заведения
 */
public class StudentStream implements Iterable<StudentGroup> {
    private List<StudentGroup> stream;
    private Integer idStream;

    /**
     * @apiNote конструктор класса
     * @param stream список групп на потоке
     * @param idStream идентификатор (номер) потока
     */
    public StudentStream(List<StudentGroup> stream, Integer idStream) {
        this.stream = stream;
        this.idStream = idStream;
    }

    public List<StudentGroup> getStream() {
        return this.stream;
    }

    public void setSteam(List<StudentGroup> stream) {
        this.stream = stream;
    }

    public Integer getIdSteam() {
        return this.idStream;
    }

    public void setIdSteam(Integer idStream) {
        this.idStream = idStream;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int counter;

            @Override
            public boolean hasNext() {
                if (counter < stream.size()) {
                    return true;
                } else {
                    return false;
                }
            }

            @Override
            public StudentGroup next() {

                return stream.get(counter++);
            }
        };
    }

    @Override
    public String toString() {
        return "idSteam = " + idStream
                + " NumberOfGroups = " + stream.size()
                + "\nStudents = " + stream.toString();
    }
}

