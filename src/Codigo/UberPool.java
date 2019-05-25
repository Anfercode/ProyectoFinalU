package Codigo;

/**
 * UberX
 */

class UberPool extends Car{
    String Brand;
    String Model;

    public UberPool(String license, Account Driver , String Brand, String Model ) {
        super(license, Driver);
        this.Brand = Brand;
        this.Model = Model;
    }
}