package Services;

import Domen.Person;
import Domen.PersonGroup;
import Domen.Student;
import Domen.StudentGroup;

import java.util.List;

public class AverageAge<T extends Person> {

    public int getAverageAge(List<T> pers) {
        int index = 0;
        int count = 0;
        for (T item : pers) {
            count += item.getAge();
            index++;
        }
        return count / index;
    }
}