import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeesIterator implements Iterable<Employees> {
    List<Employees> employeesList = new ArrayList<>();
    List<Freelancer> freelancersList = new ArrayList<>();
    List<Worker> workersList = new ArrayList<>();

    @Override
    public Iterator<Employees> iterator() {
        Iterator<Employees> iterate = new Iterator<Employees>() {
            int index;

            @Override
            public boolean hasNext() {
                return index < employeesList.size();
            }

            @Override
            public Employees next() {
                return employeesList.get(index);
            }
        };
        return iterate;
    }

}