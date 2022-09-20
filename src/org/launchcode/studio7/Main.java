package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        CD myCd = new CD(500, 120,"Kenny G's Greatest Hits");
        DVD myDvd = new DVD(1000, 120, "Snakes on a Plane" );

        myCd.spinDisc();
        myDvd.spinDisc();
        myCd.diskInfo();


    }
}
