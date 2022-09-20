package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(int storage, int size, String title) {
        super(storage, size, title);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at a variable rate of 200-500 RPM");
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
