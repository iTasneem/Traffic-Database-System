package trafficdatabasesystem;

import java.util.Date;

/**
 *
 * @author Tasnem
 */

    public abstract class ID extends Person {
    //Data Members
    private long nationalID;
    private String job;
    private double violations;
    private Date dateOfIssue;
    private Date dateOfExpiry;
    //Picture

    //Accessors

    public long getNationalID() {
        return nationalID;
    }

    public void setNationalID(long nationalID) {
        this.nationalID = nationalID;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public Date getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(Date dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public double getViolations() {
        return violations;
    }

    public void setViolations(double violations) {
        this.violations = violations;
    }
    
    
}

