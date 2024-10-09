import java.time.LocalDate;

public class PartTimeJob extends Job {
    private double hourlyWage;
    private int hoursPerWeek;

    public PartTimeJob(String companyName, String position, LocalDate startDate, LocalDate endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    public void displayJobDetails() {
        System.out.println("Part-Time Job at " + companyName + " as " + position);
        System.out.println("Duration: " + calculateJobDuration() + " years");
        System.out.println("Hourly Wage: $" + hourlyWage);
    }

    @Override
    public int assessJobSatisfaction() {
        return (int) (hourlyWage * 2);
    }

    public double calculateWeeklyWage() {
        return hourlyWage * hoursPerWeek;
    }

    public String assessFlexibility() {
        if (hoursPerWeek < 10) return "High";
        else if (hoursPerWeek < 20) return "Moderate";
        else return "Low";
    }
}
