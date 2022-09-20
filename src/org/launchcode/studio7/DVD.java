package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc {
    public DVD(int storage, int size, String title) {
        super(storage, size, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("A DVD spins at a variable rate of 1000-1500 RPM");
    }

    @Override
    public void playMedia() {

    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public void reportInfo() {

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
