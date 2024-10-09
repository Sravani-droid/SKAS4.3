import java.time.LocalDate;

public class ContractJob extends Job {
    private double contractValue;

    public ContractJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double contractValue) {
        super(companyName, position, startDate, endDate);
        this.contractValue = contractValue;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Contract Job at " + companyName + " as " + position);
        System.out.println("Duration: " + calculateJobDuration() + " years");
        System.out.println("Contract Value: $" + contractValue);
    }

    @Override
    public int assessJobSatisfaction() {
        return (int) (contractValue / 5000);
    }

    public double calculatePayment() {
        int months = (int) (endDate.toEpochDay() - startDate.toEpochDay()) / 30;
        return contractValue / months;
    }

    public String evaluateJobSecurity() {
        if (calculateJobDuration() > 2) return "High";
        else if (calculateJobDuration() > 1) return "Medium";
        else return "Low";
    }
}
