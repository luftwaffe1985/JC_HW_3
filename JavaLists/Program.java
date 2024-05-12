import java.util.Collections;
import java.util.List;

class Program {
    public static void main(String[] args) {
        Services service = new Services(); // Creation, filling out and printing the Employees List
        List<Employees> employeesList;
        employeesList = service.createEmployeesList();
        System.out.printf("\n %s", "View formatted List");
        Employees.printEmployeesList(employeesList);
        System.out.printf("\n %s", "Alphabet sorting with Comparator"); // Alphabet sorting
        Employees.printEmployeesList(service.sortWithAlphabet(employeesList)); // printing the sorted list
        Collections.sort(employeesList); // Remuneration sorting and printing
        System.out.printf("\n %s", "Remuneration sorting with Comparable");
        Employees.printEmployeesList(employeesList);
        EmployeesIterator iterate = new EmployeesIterator(); // For Each loop for Employees, Freelancers, Workers
        iterate.freelancersList = Freelancer.getFreelancersList(employeesList); // Freelancers and Workers
        iterate.workersList = Worker.getWorkersList(employeesList);
        System.out.printf("\n %s", "For Each loop for Workers");
        for (Worker item : iterate.workersList) {
            System.out.print(item);
        }
        System.out.printf("\n %s", "Freelancers List");
        for (Freelancer item : iterate.freelancersList) {
            System.out.print(item);
        }
    }
}