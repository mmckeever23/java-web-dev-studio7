package org.launchcode.studio7;

public abstract class BaseDisc {

    private int storage;
    private int size;
    private String title;

    public BaseDisc(int storage, int size, String title) {
        this.storage = storage;
        this.size = size;
        this.title = title;
    }

    private int checkCapacity(int dataWritten) {
        if (storage < dataWritten) {
            return storage;
        }
        return dataWritten;
    }

    public String diskInfo(){
        System.out.println("Disk name: " + title);
        return null;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
