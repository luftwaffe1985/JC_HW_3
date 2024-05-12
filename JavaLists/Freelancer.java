import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Freelancer extends Employees {
    Integer hoursPerDay;
    Double dayCounter;
    Double rublesPerHour;

    Random random = new Random();

    public static List<Freelancer> getFreelancersList(List<Employees> employ) { // Create Freelancers List from the
                                                                                // General List
        List<Freelancer> freelancersList = new ArrayList<>();
        for (int i = 0; i < employ.size(); i++) {
            if (employ.get(i).getRemunerationType() == "Freelancer")
                freelancersList.add((Freelancer) employ.get(i));
        }
        return freelancersList;
    }

    @Override
    public Double averageMonthSalary() {
        setHoursPerDay(8);
        setDayCounter(22.1);
        setRublesPerHour(random.nextDouble(250.0, 450.0));
        return rublesPerHour * getDayCounter() * getHoursPerDay();
    }

    public Integer getHoursPerDay() { // getters and setters
        return hoursPerDay;
    }

    public void setHoursPerDay(Integer hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public Double getDayCounter() {
        return dayCounter;
    }

    public void setDayCounter(Double dayCounter) {
        this.dayCounter = dayCounter;
    }

    public Double getRublesPerHour() {
        return rublesPerHour;
    }

    public void setRublesPerHour(Double rublesPerHour) {
        this.rublesPerHour = rublesPerHour;
    }
}