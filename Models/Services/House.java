package Models.Services;

import Models.Services.Services;

public class House extends Services{
    private int roomStandard;
    private int descriptionOfOther;
    private int floor;
    
    public House() {
    }

    public House(int roomStandard, int descriptionOfOther, int floor) {
        this.roomStandard = roomStandard;
        this.descriptionOfOther = descriptionOfOther;
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

    public int getFloor() {
        return floor;
    }

    public void setFloor(int string) {
        this.floor = string;
    }

    @Override
    public String toString() {
        return "House [descriptionOfOther=" + descriptionOfOther + ", floor=" + floor + ", roomStandard=" + roomStandard
                + "]";
    }

    @Override
    public void showInfor() {
        //super(roomStandard, descriptionOfOther, floor, serviceName, usableArea,
        //feeRent, numberMaximumPeople, styleRent);
  
        System.out.println("House: " + '\n'+ "Tieu chuan phong la: "+ roomStandard 
        + '\n' + "Mo ta tien nghi khac: " + descriptionOfOther+ '\n' + 
        "So tang la: " + floor+ '\n' + "Ten dich vu: " + getServiceName() +'\n'
        + "Dien tich su dung: " + getUsableArea() + '\n' + "Phi thue la: "+ 
        getFeeRent() + '\n' + "So luong nguoi toi da: " + getNumberMaximumPeople() +
        '\n' + "Kieu thue la: " + getStyleRent());
        
    }
}
