package Codigo;

import java.util.ArrayList;
import java.util.Map;

/**
 * UberBlack
 */
public class UberBlack extends Car {

    Map<String, Map<String, Integer>> TypeCarAccepted;
    ArrayList<String> SeatsMaterial;

    public UberBlack(String license, Account Driver,
            Map<String, Map<String, Integer>> TypeCarAccepted,
            ArrayList<String> SeatsMaterial) {

        super(license, Driver);
        this.TypeCarAccepted = TypeCarAccepted;
        this.SeatsMaterial = SeatsMaterial;
    }

}
