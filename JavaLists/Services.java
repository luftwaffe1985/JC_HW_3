import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Services {
    private final Random random = new Random(); // Additional class for Employees List generation

    public List<Employees> createEmployeesList() { // Generates Employees List based on the General List
        String[] typeRate = new String[] { "Freelancer", "Worker" };
        String[] names = new String[] { "Bilbo", "Aragorn", "Lugo", "Fitzgerald", "Buba", "Robert", "Legolas",
                "Boromir", "Faromir", "Stix", "Lupa", "Sauron", "Saruman", "Imhotep" };
        List<Employees> employeesList = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            Employees employF = new Freelancer();
            Employees employW = new Worker();
            int tempIndex;
            tempIndex = random.nextInt(typeRate.length);
            if (typeRate[tempIndex] == "Freelancer") {
                employF.setEmpId(i + 1);
                employF.setEmpName(names[random.nextInt(names.length)]);
                employF.setRemunerationType(typeRate[tempIndex]);
                employF.setEmpRemuneration(employF.averageMonthSalary());
                employeesList.add(employF);
            }
            if (typeRate[tempIndex] == "Worker") {
                employW.setEmpId(i + 1);
                employW.setEmpName(names[random.nextInt(names.length)]);
                employW.setRemunerationType(typeRate[tempIndex]);
                employW.setEmpRemuneration(employW.averageMonthSalary());
                employeesList.add(employW);
            }
        }
        return employeesList;
    }

    public List<Employees> sortWithAlphabet(List<Employees> employ) {
        List<Employees> empl = employ;
        empl.sort(new AlphabetComporator());
        return empl;
    }
}
