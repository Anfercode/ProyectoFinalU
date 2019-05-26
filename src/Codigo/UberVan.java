package Codigo;

import java.util.Map;

/**
 * UberVan
 */
public class UberVan extends Car{

    private int Passenger;

    public UberVan(String license, Driver Driver, String Brand, String Model) {

        super(license, Driver,Brand,Model);    
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