package trafficdatabasesystem;

/**
 *
 * @author Tasnem
 */
public class CarLicence extends ID  {   //Inheritance Relation changed from (Person) to (ID)
    //Data Members
    private CarPlate cPlate; //Aggregation
    private String nationality;
    private boolean carInspection;
    private int carChassisNumber;
    private String carManufacturer;
    private String carModel;
    private int dateOfManufacturing;
    private int engineCapacity;
    private String carColor;
    //Place of Issue
    
    //Accessors
    public CarPlate getcPlate() {
        return cPlate;
    }

    public void setcPlate(CarPlate cPlate) {
        this.cPlate = cPlate;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public boolean isCarInspection() {
        return carInspection;
    }

    public void setCarInspection(boolean carInspection) {
        this.carInspection = carInspection;
    }

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getDateOfManufacturing() {
        return dateOfManufacturing;
    }

    public void setDateOfManufacturing(int dateOfManufacturing) {
        this.dateOfManufacturing = dateOfManufacturing;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getCarChassisNumber() {
        return carChassisNumber;
    }

    public void setCarChassisNumber(int carEngineChassisNumber) {
        this.carChassisNumber = carEngineChassisNumber;
    }
    
    
}
