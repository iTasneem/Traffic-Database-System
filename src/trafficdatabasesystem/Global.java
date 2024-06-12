package trafficdatabasesystem;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;



/**
 *
 * @author Tasnem
 */
public class Global {
              public static  ArrayList<NationalID> nationalIDList = new ArrayList<>(); 
              public static  ArrayList<DrivingID> DrivingIDList = new ArrayList<>();
              public static  ArrayList<CarLicence> CarLicenceList = new ArrayList<>();
              public static  ArrayList<String> fileList = new ArrayList<String>();
              public static ArrayList<CarPlate> carPlateNumbers = new ArrayList<>();
              public static long GlobalID;
              public static NationalID GlobalNationalID;
              public static int CarChassisNumber;
              public static int carLicenceNumberOfYears;
              public static java.util.Date date = new java.util.Date();
              public static Calendar cal = Calendar.getInstance();
              public static SimpleDateFormat formatter =  new SimpleDateFormat("dd/MM/yyyy");


    
}
