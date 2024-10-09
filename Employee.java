import java.util.ArrayList;
import java.util.List;

public class Employee {
    private List<Job> jobHistory;

    public Employee() {
        this.jobHistory = new ArrayList<>();
    }

    public void addJob(Job job) {
        jobHistory.add(job);
    }

    public void displayJobHistory() {
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println();
        }
    }

    public double calculateTotalExperience() {
        return jobHistory.stream().mapToInt(Job::calculateJobDuration).sum();
    }

    public double calculateAverageJobSatisfaction() {
        return jobHistory.stream().mapToInt(Job::assessJobSatisfaction).average().orElse(0);
    }
}