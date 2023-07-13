package Services;

import Domen.Person;
import Domen.PersonGroup;
import Domen.Student;
import Domen.StudentGroup;

public class AverageAge<T extends StudentGroup> {
    private StudentGroup people;

    public AverageAge(T studenGroup) {
        people = studenGroup;
    }

    public double getAverageAge() {
        int sum = 0;
        int count = 0;
        for (Student student : people) {
            sum = sum + student.getAge();
            count++;
        }
        return (double)sum / count;
    }
}
