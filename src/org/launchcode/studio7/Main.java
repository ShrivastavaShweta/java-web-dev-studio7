package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

        CD threeCheers = new CD("Sweet Revenge", "My Chemical Romance", "CD", "Punk", "ABC co.");
        File helena = new File("Helena", 50, "audio");
        File cemeteryDrive = new File("Cemetery Drive", 40, "audio");
        File dummy = new File("A Song", 700, "audio");

        threeCheers.spinDisc();
        threeCheers.readData();
        threeCheers.writeData(helena);
        threeCheers.writeData(dummy);
        threeCheers.writeData(cemeteryDrive);

        threeCheers.readData();

    }
}
