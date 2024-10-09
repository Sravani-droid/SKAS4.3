import java.time.LocalDate;
import java.time.Period;

public abstract class Job {
    protected String companyName;
    protected String position;
    protected LocalDate startDate;
    protected LocalDate endDate;

    public Job(String companyName, String position, LocalDate startDate, LocalDate endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public abstract void displayJobDetails();

    public int calculateJobDuration() {
        LocalDate end = (endDate != null) ? endDate : LocalDate.now();
        return Period.between(startDate, end).getYears();
    }

    public abstract int assessJobSatisfaction();
}
