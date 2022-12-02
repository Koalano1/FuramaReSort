package Models.Services.Employee;

public class Employee {
    public String name;
    public int  dateOfBirth;
    public int identityCardNumber;
    public int phoneNumber;
    public double emailAddress;
    public double standard;
    public int location;//vị trí
    public int salary;
    
    public Employee() {
    }

    public Employee(String name, int dateOfBirth, int identityCardNumber, int phoneNumber, double emailAddress,
            double standard, int location, int salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.standard = standard;
        this.location = location;
        this.salary = salary;
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

    public int getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(int identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(double emailAddress) {
        this.emailAddress = emailAddress;
    }

    public double getStandard() {
        return standard;
    }

    public void setStandard(double standard) {
        this.standard = standard;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [dateOfBirth=" + dateOfBirth + ", emailAddress=" + emailAddress + ", identityCardNumber="
                + identityCardNumber + ", location=" + location + ", name=" + name + ", phoneNumber=" + phoneNumber
                + ", salary=" + salary + ", standard=" + standard + "]";
    }

    

}