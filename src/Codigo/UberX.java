package Codigo;

/**
 * UberX
 */
public class UberX extends Car {

    public UberX(String license, Driver Driver, String Brand, String Model) {

        super(license, Driver, Brand, Model);
    }

    @Override
    void printDataCar() {
        super.printDataCar();
        System.out.println("Modelo: " + Model + " Marca: " + Brand);
    }
}
