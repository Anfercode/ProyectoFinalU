package Codigo;



class Main {
    public static void main(String[] args) {
        UberX uberx = new UberX("AMQ133",new Account("Andres Herrera", "AND132"),"Chevy","2001");
        uberx.setPassenger(4);        
        uberx.printDataCar();

        UberVan uberv = new UberVan("FGH132", new Account("Rogeluio", "112355133"));
        uberv.setPassenger(6);
        uberv.printDataCar();
    }
    
}