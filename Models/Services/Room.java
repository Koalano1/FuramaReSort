package Models.Services;

import Models.Services.Services;

public class Room extends Services{
    private String freeServices;

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room [freeServices=" + freeServices + "]";
    }

    @Override
    public void showInfor() {
        // TODO Auto-generated method stub
        System.out.println("Room {" + "freeServices='" + freeServices  + "serviceName='"
        + getServiceName() +'\''+ "usableArea='" + getUsableArea() + '\'' + " feeRent='"+ 
       getFeeRent() + '\'' + " numberMaximumPeople=' "+ getNumberMaximumPeople() + 
       '\'' + "styleRent='" + getStyleRent() + '}');
    }
}
