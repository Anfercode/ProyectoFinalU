package Codigo;

/**
 * UberX
 */

class UberX extends Car{
    String Brand;
    String Model;

    public UberX(String license, Account Driver , String Brand, String Model ) {
        super(license, Driver);
        this.Brand = Brand;
        this.Model = Model;
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + Model + " Marca: " + Brand);
    }
}