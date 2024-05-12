import java.util.List;

public abstract class Employees implements Comparable<Employees> { // Parent abstract class

    protected Integer empId; // Employee ID
    protected String empName; // Employee Name
    protected String remunerationType; // Employee type - Freelancer or Worker - acc. to his/her remuneration type
    protected Double empRemuneration; // Employee Remuneration
    protected List<Employees> employeesList; // Employees List

    public abstract Double averageMonthSalary(); // Average monthly salary calculation

    public static void printEmployeesList(List<Employees> employeesList) { // Formatted Employees List View
        System.out.printf("\n %10s \t %10s \t %10s \t %10s \n", "id", "Name", "Employee_type", "Remuneration");
        System.out.printf("%10s", "---------------------------------------------------------------");
        for (Employees item : employeesList) {
            System.out.print(item);
        }
    }

    @Override
    public String toString() {
        return String.format("\n %10d \t %10s \t %10s \t %10.2f", empId, empName, remunerationType, empRemuneration);
    }

    @Override
    public int compareTo(Employees employ) {
        if (this.empRemuneration > employ.empRemuneration)
            return 1;
        else if (this.empRemuneration < employ.empRemuneration)
            return -1;
        else
            return 0;
    }

    // getters and setters
    public String getRemunerationType() {
        return remunerationType;
    }

    public void setRemunerationType(String remunerationType) {
        this.remunerationType = remunerationType;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String name) {
        this.empName = name;
    }

    public Double getEmpRemuneration() {
        return empRemuneration;
    }

    public void setEmpRemuneration(Double empRemuneration) {
        this.empRemuneration = empRemuneration;
    }
}