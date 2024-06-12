/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafficdatabasesystem;

/**
 *
 * @author Tasnem
 */
public class CarPlate {
    //Data Members
    private String carPlateNumber;
    
    //Accessor

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    //Constructor
    public CarPlate(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }
    
    public CarPlate() {
    }
    
    //Method to generate car plate numbers and save generated numbers in a File
    public static String generateNumbers()
    {
        String charactersString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder sb = new StringBuilder(5);
        int flag=0;
        while(true)
        {
            for (int i = 0; i < 5; i++) 
            {
                int index = (int)(charactersString.length() * Math.random());
                sb.append(charactersString.charAt(index));
            }
            
            CarPlate cP = new CarPlate(sb.toString());
            
            for(CarPlate c:Global.carPlateNumbers)
            {
                if((sb.toString()).equals(c.carPlateNumber))
                {
                    flag=1;
                    //break;
                }   
                
            }
            
            if(flag==0)
            {
                Global.carPlateNumbers.add(cP);
                    return sb.toString();
            }
            
                    
        }

    }
    
    //Method to read a car plate number from file of numbers
}
