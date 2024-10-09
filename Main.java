import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        FullTimeJob fullTimeJob = new FullTimeJob("TechCorp", "Software Engineer", 
        LocalDate.of(2018, 1, 1), LocalDate.of(2021, 12, 31), 80000);
    PartTimeJob partTimeJob = new PartTimeJob("RetailMart", "Sales Associate", 
        LocalDate.of(2016, 6, 1), LocalDate.of(2017, 12, 31), 15, 20);
    ContractJob contractJob = new ContractJob("FreelanceCo", "Web Developer", 
        LocalDate.of(2022, 1, 1), LocalDate.of(2022, 12, 31), 60000);
        
        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        System.out.println("Employee Job History:");
        employee.displayJobHistory();

        System.out.println("Total Work Experience: " + employee.calculateTotalExperience() + " years");
        System.out.println("Average Job Satisfaction: " + employee.calculateAverageJobSatisfaction());

        System.out.println("\nAdditional Information:");
        System.out.println("Full-Time Job Monthly Salary: $" + fullTimeJob.calculateSalary());
        System.out.println("Full-Time Job Work-Life Balance: " + fullTimeJob.evaluateWorkLifeBalance());
        System.out.println("Part-Time Job Weekly Wage: $" + partTimeJob.calculateWeeklyWage());
        System.out.println("Part-Time Job Flexibility: " + partTimeJob.assessFlexibility());
        System.out.println("Contract Job Monthly Payment: $" + contractJob.calculatePayment());
        System.out.println("Contract Job Security: " + contractJob.evaluateJobSecurity());
    }
}
