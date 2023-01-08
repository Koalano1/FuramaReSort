package Controllers;
import java.io.*;
import java.util.Collections;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import Exception.UserException.ExceptionCustomer;
import Models.Services.Customer.Customer;
import Models.Services.House;
import Models.Services.Room;
import Models.Services.Services;
import Models.Services.Villa;
//import Validate.ServiceValidation;


public class MainController {
    private static final DateTimeFormatter DateTimeFortmatter = null;
    private static ArrayList<Villa> villaList = new ArrayList<>();
    private static ArrayList<House> houseList = new ArrayList<>();
    private static ArrayList<Room> roomList = new ArrayList<>();
    private static ArrayList<Services> servicesList = new ArrayList<>();
    private static ArrayList<Customer> customerList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        displayMainMenu();
    }

    private static void displayMainMenu() {
        Scanner sc = new Scanner(System.in);


        System.out.println("=========MAIN MENU==========");
        System.out.println("1. Add New Service");
        System.out.println("2. Show Service");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        System.out.println("8. Ghi vao file data ");
        System.out.println("Ban muon thuc hien yeu cau nao?");

        int luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:
                addNewCustomer();
                break;
            case 4:
                showInformationCustomer();
                break;
            case 5:
                //task 7
                break;
            case 6:
                //task 9
                break;
            case 7:
                Exit();
                break;
            case 8:
                writeFileData();
            default:
                System.out.println("Ban da nhap sai. Vui long nhap lai!!!");
                break;
        }
    }

    private static void showInformationCustomer()  {//task 5 ý 3

        try {
            FileReader fr = new FileReader("D:\\Java_learning\\JavaProject02\\FuramaReSort\\Customer.CSV");
            BufferedReader br = new BufferedReader(fr);
            int i;
            while ((i = br.read()) != -1) {
                System.out.print((char) i);
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            System.out.println("Da co loi trong doc ghi file. Vui long quay lai menu");
            displayMainMenu();
        }


    }

    private static void addNewCustomer() {//task 5 ý 2
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so luong khach hang muon them vao la: ");

        int soLuong = sc.nextInt();
        sc.nextLine();

        int dem = 0;
        while (dem < soLuong) {
            Customer myCustomer = new Customer();

            String checkName;
            do{
                System.out.println("Nhap ten Customer: ");
                checkName = sc.nextLine();
                if(!ExceptionCustomer.checkNameException(checkName)){
                    System.out.println("Ten khach hang phai in hoa ki tu dau tien trong moi tu va khong chua nhung khoang trong");
                }
            }while (!ExceptionCustomer.checkNameException(checkName));
            myCustomer.setName(checkName);


            System.out.println("Nhap ngay sinh Customer: ");
            String birthday = sc.nextLine();
            if(!ExceptionCustomer.checkBirthdayException(birthday)){
                System.out.println("Nam sinh phai > 1900 va nho hon nam hien tai 18 nam, dung dinh dang dd/mm/yyyy");
            }
            myCustomer.setDateOfBirth(birthday);

            String checkGender;
            do{
                System.out.println("Gioi tinh cua Customer: ");
                System.out.println("\n VD: Male / Female / Unknown");
                checkGender = sc.nextLine();
            }while(!ExceptionCustomer.checkGenderException(checkGender));
            myCustomer.setSex(checkGender);

            System.out.println("So chung minh nhan dan Customer: ");
            String customerIdCard = sc.nextLine();
            if(!ExceptionCustomer.checkIDCardException(customerIdCard)){
                System.out.println("ID phai co 9 chu so dinh dang XXX XXX XXX");
            }
            myCustomer.setIdentityCardNumber(customerIdCard);


            System.out.println("So dien thoai Customer: ");
            String customerPhone = sc.nextLine();
            myCustomer.setPhoneNumber(customerPhone);

            String checkMail;
            do{
                System.out.println("Dia chi Email: ");
                System.out.println("\n vd: @gmail.com");
                checkMail = sc.nextLine();
            } while(!ExceptionCustomer.checkEmailException(checkMail));
            myCustomer.setEmailAddress(checkMail);

            System.out.println("Loại Customer: ");
            int cusType = sc.nextInt();
            myCustomer.setTypeOfGuest(cusType);
            sc.nextLine();

            System.out.println("Dia chi: ");
            String cusAddress = sc.nextLine();
            myCustomer.setAddress(cusAddress);

//            System.out.println("Su dung dich vu: ");
//            Services services = new House();
//            myCustomer.setUserServices(services);

            System.out.println("Chọn dịch vụ bạn muốn sử dụng: ");
            System.out.println("1. Villa");
            System.out.println("2. House");
            System.out.println("3. Room");

            int userChoice;
            userChoice = sc.nextInt();
            switch (userChoice){
                case 1:
                    System.out.println("Danh sach Villa:");
                    for (int i = 0; i < villaList.size(); i++) {
                        System.out.println((i + 1) + ". " + villaList.get(i).getServiceName());
                    }
                    System.out.println("Chon so Villa ban muon su dung: ");
                    int choiceVilla = Integer.parseInt(sc.nextLine());
                    Services userServices1 = villaList.get(choiceVilla - 1);
                    myCustomer.setUserServices(userServices1);
                    break;
                case 2:
                    System.out.println("Danh sach House: ");
                    for(int i = 0; i < houseList.size(); i++){
                        System.out.println((i + 1) + ". " + houseList.get(i).getServiceName());
                    }
                    System.out.println("Chon so House ban muon su dung: ");
                    int choiceHouse = Integer.parseInt(sc.nextLine());
                    Services userServices2 = houseList.get(choiceHouse - 1);
                    myCustomer.setUserServices(userServices2);
                    break;
                case 3:
                    System.out.println("Danh sach trong Room");
                    for(int i = 0; i < roomList.size(); i++){
                        System.out.println((i + 1)+ ". "+ roomList.get(i).getServiceName());
                    }
                    System.out.println("Chon so Room ban muon su dung: ");
                    int choiceRoom = Integer.parseInt(sc.nextLine());
                    Services userServices3 = roomList.get(choiceRoom - 1);
                    myCustomer.setUserServices(userServices3);
                    break;
                default:
                    System.out.println("Da xo loi trong luc nhap. Vui long chon lai !!!");
                    break;
            }

            System.out.println("Ban da nhap khach hang thu " + (dem + 1) + " thanh cong " + "Nhan enter de tiep tuc!!!");
            sc.nextLine();
            customerList.add(myCustomer);
            dem = dem + 1;
        }
        displayMainMenu();
    }
    private static void showService() {//task 3
        Scanner sc = new Scanner(System.in);


        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show all name Villa Not Duplicate");
        System.out.println("5. Show  All Name House Not Duplicate");
        System.out.println("6. Show All Name Room Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");
        System.out.println("Ban muon chon cai nao?");


        int luaChon;
        luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 4:
                //task 8
                break;
            case 5:
                //task 8
                break;
            case 6:
                //task 8
                break;
            case 7:
                backToMenu();
                break;
            case 8:
                Exit();
                break;
            default:
                System.out.println("Ban nhap sai roi. Vui long nhap lai!!!");
                break;
        }

    }
    private static void showAllRoom() {
        int i = 1;
        for(Room room : roomList){
            System.out.println("Room thu "+ i + " la");
            room.showInfor();
            i++;
        }

        displayMainMenu();

    }

    private static void showAllHouse() {
        int i = 1;
        for(House house: houseList){
            System.out.println("House thu "+ i + " la");
            house.showInfor();
            i++;
        }
        displayMainMenu();
    }

    private static void showAllVilla() {
        int i = 1;
        for(Villa villa: villaList){
            System.out.println("Villa thu "+  i +" la");
            villa.showInfor();
            i++;
        }

        displayMainMenu();
    }

    private static void showNewMenuService(){
        System.out.println("1.Add New Villa");
        System.out.println("2.Add New House");
        System.out.println("3.Add New Room");
        System.out.println("4.Back to menu");
        System.out.println("5.Exit");

    }

    private static void addNewService() {//mục 2 task 2
        showNewMenuService();
        Scanner sc = new Scanner(System.in);

        int soLuong = sc.nextInt();

        switch (soLuong) {
            case 1:
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                backToMenu();
                break;
            case 5:
                Exit();
                break;
            default:
                System.out.println("Ban nhap sai roi! Vui long nhap lại!!");
                break;
        }
        showNewMenuService();
    }

    public static void writeFileData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Write file data Villa");
        System.out.println("2. Write file data House");
        System.out.println("3. Write file data Room");
        System.out.println("4. Write File Customer");

        int luaChon =sc.nextInt();

        switch (luaChon) {
            case 1:
                writeFileDataVilla();
                break;
            case 2:
                writeFileDataHouse();
                break;
            case 3:
                writeFileDataRoom();
                break;
            case 4:
                writeFileCustomer();
                break;
            default:
                System.out.println("Khong co file nao duoc ghi o day. Vui long nhap lai!!!");
                break;
        }

    }

    private static void writeFileCustomer() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Customer.CSV"))){
            bw.write("Thong tin cua Customer: ");
            bw.newLine();

            for(int i = 0; i < customerList.size(); i++){
                bw.write("Customer "+ (i + 1)+":");
                bw.newLine();

                bw.write("Ho Ten Customer: "+ customerList.get(i).getName());
                bw.newLine();

                bw.write("Ngay sinh: "+ customerList.get(i).getDateOfBirth());
                bw.newLine();

                bw.write("Gioi tinh: "+ customerList.get(i).getDateOfBirth());
                bw.newLine();

                bw.write("So chung minh nhan dan Customer: "+ customerList.get(i).getIdentityCardNumber());
                bw.newLine();

                bw.write("So dien thoai: "+ customerList.get(i).getPhoneNumber());
                bw.newLine();

                bw.write("Dia chi email: "+ customerList.get(i).getEmailAddress());
                bw.newLine();

                bw.write("Kieu: "+ customerList.get(i).getTypeOfGuest());
                bw.newLine();

                bw.write("Dia chi Customer: "+ customerList.get(i).getAddress());
                bw.newLine();

                bw.write("Su dung dich vu: "+ customerList.get(i).getUserServices());
                bw.newLine();

            }
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Da co loi trong ghi file. Moi quay ve menu chinh!");
            displayMainMenu();
        }
    }

    public static void writeFileDataVilla(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Villa.csv"))) {
            bw.write("Thong tin cua Villa la: ");
            bw.newLine();

            for(int i = 0; i < villaList.size(); i++){
                bw.write("Villa " + (i + 1) +":");
                bw.newLine();
                // bw.newLine();
                bw.write("Ten dich vu: "+ villaList.get(i).getServiceName());
                bw.newLine();

                bw.write("Dien tich su dung: "+ villaList.get(i).getUsableArea());
                bw.newLine();

                bw.write("Phi thue: "+ villaList.get(i).getFeeRent());
                bw.newLine();

                bw.write("So luong nguoi toi da: "+ villaList.get(i).getNumberMaximumPeople());
                bw.newLine();

                bw.write("Kieu thue: "+ villaList.get(i).getStyleRent());
                bw.newLine();

                bw.write("Tieu chuan phong: " + villaList.get(i).getRoomStandard());
                bw.newLine();

                bw.write("Mo ta tien nghi khac: " + villaList.get(i).getDescriptionOfOther());
                bw.newLine();

                bw.write("So tang: "+ villaList.get(i).getFloor());
                bw.newLine();

                bw.write("Dien tich ho boi: "+ villaList.get(i).getPoolArea());
                bw.newLine();
            }

            bw.newLine();


        }catch(Exception e){
            System.out.println("Da co loi trong ghi file. Moi quay ve menu chinh!!!");
            displayMainMenu();
        }

        System.out.println(java.time.LocalDateTime.now());
        // DateTimeFormatter dft = DateTimeFortmatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // LocalDate now = LocalDate.now();
        // System.out.println(dft.format(now));

    }
    public static void writeFileDataHouse(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("House.csv"))) {
            bw.write("Thong tin cua House la: ");
            bw.newLine();

            for(int i = 0; i < houseList.size(); i++){
                bw.write("House " + (i + 1) +":");
                bw.newLine();
                // bw.newLine();
                bw.write("Ten dich vu: "+ houseList.get(i).getServiceName());
                bw.newLine();

                bw.write("Dien tich su dung: "+ houseList.get(i).getUsableArea());
                bw.newLine();

                bw.write("Phi thue: "+ houseList.get(i).getFeeRent());
                bw.newLine();

                bw.write("So luong nguoi toi da: "+ houseList.get(i).getNumberMaximumPeople());
                bw.newLine();

                bw.write("Kieu thue: "+ houseList.get(i).getStyleRent());
                bw.newLine();

                bw.write("Tieu chuan phong: "+ houseList.get(i).getRoomStandard());
                bw.newLine();

                bw.write("Mo ta tien nghi khac: "+ houseList.get(i).getDescriptionOfOther());
                bw.newLine();

                bw.write("So tang: "+ houseList.get(i).getFloor());
                bw.newLine();
            }
            bw.newLine();

        } catch (Exception e) {
            System.out.println("Da co loi trong ghi file. Moi quay ve menu chinh!!!");
            displayMainMenu();
        }

    }

    public static void writeFileDataRoom(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("Room.csv"))) {
            bw.write("Thong tin cua Room la: ");
            bw.newLine();
            for(int i = 0; i < roomList.size(); i++){
                bw.write("Room " + (i + 1) +":");
                bw.newLine();
                // bw.newLine();
                bw.write("Ten dich vu: "+ roomList.get(i).getServiceName());
                bw.newLine();

                bw.write("Dien tich su dung: "+ roomList.get(i).getUsableArea());
                bw.newLine();

                bw.write("Phi thue: "+ roomList.get(i).getFeeRent());
                bw.newLine();

                bw.write("So luong nguoi toi da: "+ roomList.get(i).getNumberMaximumPeople());
                bw.newLine();

                bw.write("Kieu thue: "+ roomList.get(i).getStyleRent());
                bw.newLine();

                bw.write("Dich vu mien phi: "+ roomList.get(i).getFreeServices());
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Da co loi trpng ghi file. vui long quay ve menu chinh!!!");
            displayMainMenu();
        }
    }


    //case1:
    private static void addNewVilla() {
        Scanner sc = new Scanner(System.in);

        System.out.println("So luong villa muon them vao la: ");

        int soLuong = sc.nextInt();

        int dem = 0;
        while(dem < soLuong) {
            Villa myVilla = new Villa();
            // String IDVilla = null;
            // do {
            //     System.out.println("Nhap ID Villa: ");
            //     IDVilla = sc.nextLine();
            // } while (ServiceValidate.checkIDVilla(IDVilla));
            // myVilla.setIDVilla(IDVilla);


            System.out.print("Nhap tieu chuan phong: ");
            // sc.nextLine();
            myVilla.setRoomStandard(sc.nextInt());

            System.out.print("Nhap mo ta tien nghi khac: ");
            myVilla.setDescriptionOfOther(sc.nextInt());

            System.out.print("Nhap dien tich ho boi: ");
            myVilla.setDescriptionOfOther(sc.nextInt());

            System.out.print("Nhap so tang: ");
            myVilla.setFloor(sc.nextInt());

            System.out.print("Nhap ten dich vu: ");
            myVilla.setServiceName(sc.nextLine());
            sc.nextLine();

            System.out.print("Nhap dien tich su dung: ");
            myVilla.setUsableArea(sc.nextInt());

            System.out.print("Nhap chi phi thue: ");
            myVilla.setFeeRent(sc.nextInt());

            System.out.print("Nhap so luong toi da: ");
            myVilla.setNumberMaximumPeople(sc.nextInt());

            System.out.print("Nhap kieu thue: ");
            myVilla.setStyleRent(sc.nextDouble());

            System.out.println("Ban da nhap Villa thu " + (dem  + 1) + " thanh cong! " + "Enter de tiep tuc");
            sc.nextLine();
            villaList.add(myVilla);
            dem = dem + 1;
        }

        displayMainMenu();
    }

    //case2:
    private static void addNewHouse(){
        Scanner sc = new Scanner(System.in);

        System.out.println("So luong house muon them vao la: ");

        int soLuong = sc.nextInt();

        int dem = 0;
        while(dem < soLuong) {
            House myHouse = new House();

            System.out.println("Nhap tieu chuan phong: ");
            // sc.nextLine();
            myHouse.setRoomStandard(sc.nextInt());

            System.out.println("Nhap mo ta tien nghi khac: ");
            myHouse.setDescriptionOfOther(sc.nextInt());

            System.out.println("Nhap so tang: ");
            myHouse.setFloor(sc.nextInt());

            System.out.println("Nhap ten dich vu: ");
            myHouse.setServiceName(sc.nextLine());
            sc.nextLine();

            System.out.println("Nhap dien tich su dung: ");
            myHouse.setUsableArea(sc.nextInt());

            System.out.println("Nhap chi phi thue: ");
            myHouse.setFeeRent(sc.nextInt());

            System.out.println("Nhap so luong toi da: ");
            myHouse.setNumberMaximumPeople(sc.nextInt());

            System.out.println("Nhap kieu thue: ");
            myHouse.setStyleRent(sc.nextDouble());

            System.out.println("Ban da nhap House thu " + " " + (dem + 1) + " thanh cong! " + "Tobe continueee!!!");
            sc.nextLine();
            houseList.add(myHouse);
            dem = dem + 1;
        }

        displayMainMenu();

    }
    //case3:
    private static void addNewRoom() {
        Scanner sc = new Scanner(System.in);

        System.out.println("So luong room muon them vao la: ");

        int soLuong =sc.nextInt();

        int dem = 0;
        while(dem < soLuong) {
            Room myRoom = new Room();
            System.out.println("Nhap dich vu mien phi di kem: ");
            sc.nextLine();
            myRoom.setFreeServices(sc.nextLine());

            System.out.println("Nhap ten dich vu: ");
            Services myHouse;
            myRoom.setServiceName(sc.nextLine());

            System.out.println("Nhap dien tich su dung: ");
            myRoom.setUsableArea(sc.nextInt());

            System.out.println("Nhap chi phi thue: ");
            myRoom.setFeeRent(sc.nextInt());

            System.out.println("Nhap so luong toi da: ");
            myRoom.setNumberMaximumPeople(sc.nextInt());

            System.out.println("Nhap kieu thue: ");
            myRoom.setStyleRent(sc.nextDouble());

            System.out.println("Ban da nhap room thu " + " " + (dem + 1) + " thanh cong! " + "tobe continueee!!!");
            sc.nextLine();
            roomList.add(myRoom);
            dem = dem + 1;
        }
        displayMainMenu();
    }

    //case4, case 7
    private static void backToMenu() {
        displayMainMenu();
    }

    //case5:
    private static void Exit() {
        System.exit(0);
    }




}