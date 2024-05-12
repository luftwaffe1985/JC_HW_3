import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker extends Employees {

    Random random = new Random();

    public static List<Worker> getWorkersList(List<Employees> employ) { // Generates Workers List from the General List
        List<Worker> workersList = new ArrayList<>();
        for (int i = 0; i < employ.size(); i++) {
            if (employ.get(i).getRemunerationType() == "Worker")
                workersList.add((Worker) employ.get(i));
        }
        return workersList;
    }

    @Override
    public Double averageMonthSalary() {
        return random.nextDouble(40000.0, 90000.0);
    }

}