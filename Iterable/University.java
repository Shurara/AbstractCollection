import java.util.Iterator;
import java.util.Arrays;
import java.util.List;

public class University
        // BEGIN (write your solution here)
        implements  Iterable <Student>
        // END
{

    private final Student[] students;

    public University(final Student[] students) {
        this.students = students;
    }

    // BEGIN (write your solution here)
    @Override
    public Iterator<Student> iterator(){
        final List studentsList = Arrays.asList(students);
        return studentsList.iterator();
    }
    // END

}