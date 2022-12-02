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
  
        System.out.println("House{" + "roomStandard='"+ roomStandard 
        + '\'' + "descriptionOfOthers='" + descriptionOfOther+ '\'' + 
        "Floor='" + floor+ '\'' + "serviceName='" + getServiceName() +'\''
        + "usableArea='" + getUsableArea() + '\'' + " feeRent='"+ 
        getFeeRent() + '\'' + " numberMaximumPeople=' "+ getNumberMaximumPeople() + 
        '\'' + "styleRent='" + getStyleRent() + '}');
        
    }
}
