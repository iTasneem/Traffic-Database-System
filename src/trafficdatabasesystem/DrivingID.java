package trafficdatabasesystem;

/**
 *
 * @author Tasnem
 */
public class DrivingID extends ID {
    //Data Members
    private String nationality;
    private boolean testPassed;
    private boolean opticalGlasses;

    //Accessors
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isTestPassed() {
        return testPassed;
    }

    public void setTestPassed(boolean testPassed) {
        this.testPassed = testPassed;
    }

    public boolean isOpticalGlasses() {
        return opticalGlasses;
    }

    public void setOpticalGlasses(boolean opticalGlasses) {
        this.opticalGlasses = opticalGlasses;
    }
    
}
