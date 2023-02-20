package Models.Services;

import Models.Services.Services;

public class Villa extends Services {
    private int roomStandard;
    private int descriptionOfOther;
    private double poolArea;
    private int floor;
    private String IDVilla;

    

    public Villa() {
    }

    
    



    public Villa(int roomStandard, int descriptionOfOther, double poolArea, int floor, String iDVilla) {
        this.roomStandard = roomStandard;
        this.descriptionOfOther = descriptionOfOther;
        this.poolArea = poolArea;
        this.floor = floor;
        IDVilla = iDVilla;
    }






    public Villa(String serviceName, double usableArea, int feeRent, int numberMaximumPeople, double styleRent,
            int roomStandard, int descriptionOfOther, double poolArea, int floor, String iDVilla) {
        super(serviceName, usableArea, feeRent, numberMaximumPeople, styleRent);
        this.roomStandard = roomStandard;
        this.descriptionOfOther = descriptionOfOther;
        this.poolArea = poolArea;
        this.floor = floor;
        IDVilla = iDVilla;
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
        System.out.println(+ '\n'
        + "Dien tich su dung la: " + getUsableArea() + '\n' + "Chi phi thue la: " +
        getFeeRent() + '\n' + "So luong toi da la: "+ getNumberMaximumPeople() + 
        '\n' + "Kieu thue la: " + getStyleRent()+ '\n' + "Tieu chuan phong la: " + getRoomStandard() + '\n' + "Mo ta tien nghi khac: " + getDescriptionOfOther() +
        '\n' + "Dien tich ho boi la: " + getPoolArea());
        
    }






    public String getIDVilla() {
        return IDVilla;
    }






    public void setIDVilla(String iDVilla) {
        IDVilla = iDVilla;
    }



}
