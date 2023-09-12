package Domen;

import java.util.Iterator;
import java.util.List;

public class PersonIterator implements Iterator<Person> {
    private int counter;
    private final List<Person> persons;
    public PersonIterator(List<Person> persons) {
        this.persons = persons;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter<persons.size();
    }
    @Override
    public Person next() {
        if(!hasNext())
        {
            return null;
        }
        return persons.get(counter++);
    }

}