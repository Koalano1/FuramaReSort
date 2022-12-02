package Models.Services;

import java.lang.reflect.Method;

public abstract class Services {
    public String serviceName;
    public double usableArea;// diện tích sử dụng
    public int feeRent;
    public int numberMaximumPeople;
    public double styleRent;
    
    public Services() {
    }

    public Services(String serviceName, double usableArea, int feeRent, int numberMaximumPeople, double styleRent) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.feeRent = feeRent;
        this.numberMaximumPeople = numberMaximumPeople;
        this.styleRent = styleRent;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getFeeRent() {
        return feeRent;
    }

    public void setFeeRent(int feeRent) {
        this.feeRent = feeRent;
    }

    public int getNumberMaximumPeople() {
        return numberMaximumPeople;
    }

    public void setNumberMaximumPeople(int numberMaximumPeople) {
        this.numberMaximumPeople = numberMaximumPeople;
    }

    public double getStyleRent() {
        return styleRent;
        
    }

    public void setStyleRent(double styleRent) {
        this.styleRent = styleRent;
    }

    @Override
    public String toString() {
        return "Services [feeRent=" + feeRent + ", numberMaximumPeople=" + numberMaximumPeople + ", serviceName="
                + serviceName + ", styleRent=" + styleRent + ", usableArea=" + usableArea + "]";
    }

    // Abstract function
    public abstract void showInfor();


    }


