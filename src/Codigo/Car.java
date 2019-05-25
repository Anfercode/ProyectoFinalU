package Codigo;

/**
 * Car
 */
class Car {

    private int id;
    private String license;
    private Account Driver;
    private int Passenger;

    public Car(String licence, Account Driver) {
        this.license = licence;
        this.Driver = Driver;
    }

    void printDataCar(){
        if (Passenger != 0) {
            System.out.println("License: " + license + " Name Driver: " + Driver.Name + " Passengers: " + Passenger);    
        }
        
    }

    public int getPassenger() {
        return Passenger;
    }
       

    public void setPassenger(int Passenger){
        if (Passenger == 4) {
            this.Passenger = Passenger;    
        } else {
            System.out.println("No concuerda con los 4 pasajeros");
        }
        
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the license
     */
    public String getLicense() {
        return license;
    }

    /**
     * @param license the license to set
     */
    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * @return the driver
     */
    public Account getDriver() {
        return Driver;
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Account driver) {
        Driver = driver;
    }

    
}