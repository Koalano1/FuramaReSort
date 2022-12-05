package Models.Services;

import Models.Services.Services;

public class Villa extends Services {
    private int roomStandard;
    private int descriptionOfOther;
    private double poolArea;
    private int floor;


    public Villa() {
    }


    public Villa(int roomStandard, int descriptionOfOther, double poolArea, int floor) {
        this.roomStandard = roomStandard;
        this.descriptionOfOther = descriptionOfOther;
        this.poolArea = poolArea;
        this.floor = floor;
    }


    public int getRoomStandard() {
        return roomStandard;
    }


    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }


    public int getDescriptionOfOther() {
        return descriptionOfOther;
    }


    public void setDescriptionOfOther(int i) {
        this.descriptionOfOther = i;
    }


    public double getPoolArea() {
        return poolArea;
    }


    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }


    public int getFloor() {
        return floor;
    }


    public void setFloor(int string) {
        this.floor = string;
    }


    @Override
    public String toString() {
        return "Villa [descriptionOfOther=" + descriptionOfOther + ", floor=" + floor + ", poolArea=" + poolArea
                + ", roomStandard=" + roomStandard + "]";
    }


    @Override
    public void showInfor() {
        
        // TODO Auto-generated method stub
        //super(roomStandard, descriptionOfOther, poolArea, floor)
        System.out.println("Villa: " + '\n'
        + "Dien tich su dung la: " + getUsableArea() + '\n' + "Chi phi thue la: " +
        getFeeRent() + '\n' + "So luong toi da la: "+ getNumberMaximumPeople() + 
        '\n' + "Kieu thue la: " + getStyleRent()+ '\n' + "So tang la: " + getRoomStandard() + '\n' + "Mo ta tien nghi khac: " + getDescriptionOfOther() +
        '\n' + "Dien tich ho boi la: " + getPoolArea());
        
    }

    public static void add(Villa myVilla) {
        
    }


}
