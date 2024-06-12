package trafficdatabasesystem;

/**
 *
 * @author Tasnem
 */
import java.util.Date;

public class NationalID extends ID {
    //Data Members
    private Date dateOfBirth;
    
    //Accessors
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
