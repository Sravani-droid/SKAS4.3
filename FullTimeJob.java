import java.time.LocalDate;

public class FullTimeJob extends Job {
    private double annualSalary;

    public FullTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double annualSalary) {
        super(companyName, position, startDate, endDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Full-Time Job at " + companyName + " as " + position);
        System.out.println("Duration: " + calculateJobDuration() + " years");
        System.out.println("Annual Salary: $" + annualSalary);
    }

    @Override
    public int assessJobSatisfaction() {
        return (int) (annualSalary / 10000);
    }

    public double calculateSalary() {
        return annualSalary / 12;
    }

    public String evaluateWorkLifeBalance() {
        if (annualSalary > 100000) return "Poor";
        else if (annualSalary > 50000) return "Moderate";
        else return "Excellent";
    }
}