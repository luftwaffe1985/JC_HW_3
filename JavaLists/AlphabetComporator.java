import java.util.Comparator;

public class AlphabetComporator implements Comparator<Employees> {
    @Override
    public int compare(Employees emp1, Employees emp2) {
        return Integer.compare(emp1.getEmpName().charAt(0),
                emp2.getEmpName().charAt(0));
    }
}