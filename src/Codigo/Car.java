package Codigo;

/**
 * Car
 */
class Car {

    private int id;
    private String license;
    private Driver Driver;
    private int Passenger;
    private String Brand;
    private String Model;

    public Car(String licence, Driver Driver, String Brand, String Model) {
        this.license = licence;
        this.Driver = Driver;
        this.Brand = Brand;
        this.Model = Model;
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
    public String getDriver() {
        return Driver.Name + "," + Driver.Document  + "," + Driver.getPassword() + "," + Driver.getEmail();
    }

    /**
     * @param driver the driver to set
     */
    public void setDriver(Driver driver) {
        Driver = driver;
    }
    
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }
    
    public String getModel() {
        return Brand;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    
}