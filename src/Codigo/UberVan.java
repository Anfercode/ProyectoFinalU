package Codigo;

import java.util.Map;
import java.util.ArrayList;

/**
 * UberVan
 */
public class UberVan extends Car{

    Map<String ,Map<String , Integer>> TypeCarAccepted;
    ArrayList<String> SeatsMaterial;
    private int Passenger;

    public UberVan(String license, Account Driver) {
        super(license, Driver);     
    }    

    @Override
    public void setPassenger(int Passenger) {
        if (Passenger == 6) {
            this.Passenger = Passenger;    
        } else {
            System.out.println("No concuerda con los 6 pasajeros");
        }
    }
    
}