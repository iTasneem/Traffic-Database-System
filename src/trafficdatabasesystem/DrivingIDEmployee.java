package trafficdatabasesystem;

/**
 *
 * @author Tasnem
 */
public class DrivingIDEmployee /*extends Employee */ implements Employee{
    
    //OVERRIDE checkPassword METHOD!
    @Override
    public boolean checkPassword(String pass)
    {
        if(pass.substring(0, 3).equals("DRV"))
            return true;    //Method returns TRUE when password is that of a Driving ID Employee
        else 
            return false;
    }
    
}
