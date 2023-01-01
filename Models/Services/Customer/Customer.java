package Models.Services.Customer;

import Models.Services.Services;

public class Customer {
    public String name;
    public int dateOfBirth;
    public String sex;
    public int identityCardNumber;
    public double phoneNumber;
    public double emailAddress;
    public int typeOfGuest;
    public String address;
    public Services userServices;

    
    public Customer() {
    }

    public Customer(String name, int dateOfBirth, String sex, int identityCardNumber, double phoneNumber, double emailAddress, int typeOfGuest, String address, Services userServices) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.typeOfGuest = typeOfGuest;
        this.address = address;
        this.userServices = userServices;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String isSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(double emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getTypeOfGuest() {
        return typeOfGuest;
    }

    public void setTypeOfGuest(int typeOfGuest) {
        this.typeOfGuest = typeOfGuest;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUserServices() {
        return userServices;
    }

    public void setUserServices(Services userServices) {
        this.userServices = userServices;
    }




    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                ", identityCardNumber=" + identityCardNumber +
                ", phoneNumber=" + phoneNumber +
                ", emailAddress=" + emailAddress +
                ", typeOfGuest=" + typeOfGuest +
                ", address='" + address + '\'' +
                ", userServices=" + userServices +
                '}';
    }


}
