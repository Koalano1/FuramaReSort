package Controllers;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Services.House;
import Models.Services.Room;
import Models.Services.Services;
import Models.Services.Villa;
import Views.main;


public class MainController {
    private static ArrayList<Villa> villaList = new ArrayList<>();
    private static ArrayList<House> houseList = new ArrayList<>();
    private static ArrayList<Room> roomList = new ArrayList<>();
    private static ArrayList<Services> servicesList = new ArrayList<>();
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

        int luaChon;
        luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                addNewService();
                break;
            case 2:
                addService();
                break;
            case 3: 
                break; 
            case 4:
                break;   
            case 5:
                break;  
            case 6:
                break;
            case 7:
                Exit();
                break;                 
            default:
                System.out.println("Ban da nhap sai. Vui long nhap lai!!!");
                break;
        }
    }

    private static void addService() {//task 3
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Show all Villa");
        System.out.println("2. Show all House");
        System.out.println("3. Show all Room");
        System.out.println("4. Show all name Villa Not Duplicate");
        System.out.println("5. Show  All Name House Not Duplicate");
        System.out.println("6. Show All Name Room Not Duplicate");
        System.out.println("7. Back to menu");
        System.out.println("8. Exit");

        int luaChon;
        luaChon = sc.nextInt();

        switch (luaChon) {
            case 1:
                showAllVilla();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4: 
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                exit();
                break;        
            default:
                break;
        }

    }
    private static void showAllVilla(){

    }

    private static void addNewService() {//mục 2 task 2
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
                System.out.println("Ban nhap sai roi! nhap lại đi!!");
                break;
        }
    }

    //case1: 
    private static void addNewVilla() {
        Scanner sc = new Scanner(System.in);
        int soLuong = sc.nextInt();

        int dem =0;
        while(dem < soLuong) {
            Villa myVilla = new Villa();

            System.out.println("Nhap tieu chuan phong: ");
            sc.nextLine();
            myVilla.setRoomStandard(sc.nextInt());

            System.out.println("Nhap mo ta tien nghi khac");
            myVilla.setDescriptionOfOther(sc.nextInt());

            System.out.println("Nhap dien tich ho boi");
            myVilla.setDescriptionOfOther(sc.nextInt());

            System.out.println("Nhap so tang");
            myVilla.setFloor(sc.nextInt());

            System.out.println("Nhap ten dich vu: ");
            myVilla.setServiceName(sc.nextLine());

            System.out.println("Nhap dien tich su dung");
            myVilla.setUsableArea(sc.nextInt());

            System.out.println("Nhap chi phi thue");
            myVilla.setFeeRent(sc.nextInt());

            System.out.println("Nhap so luong toi da");
            myVilla.setNumberMaximumPeople(sc.nextInt());

            System.out.println("Nhap kieu thue");
            myVilla.setStyleRent(sc.nextDouble());

            System.out.println("Ban da nhap Villa" + " " + dem + "tobe continueee!!!!!!!!!!!!!!");
            sc.hasNextLine();
            Villa.add(myVilla);
            dem++;
        }
        addNewService();
    }
    // String csvFile = "data/data.csv";
    // try() 

    //case2:
    private static void addNewHouse(){
        Scanner sc = new Scanner(System.in);

        int soLuong = sc.nextInt();

        int dem = 0;
        while(dem < soLuong) {
            House myHouse = new House();

            System.out.println("Nhap tieu chuan phong: ");
            sc.nextLine();
            myHouse.setRoomStandard(sc.nextInt());

            System.out.println("Nhap mo ta tien nghi khac");
            myHouse.setDescriptionOfOther(sc.nextInt());

            System.out.println("Nhap so tang");
            myHouse.setFloor(sc.nextInt());

            System.out.println("Nhap ten dich vu: ");
            myHouse.setServiceName(sc.nextLine());

            System.out.println("Nhap dien tich su dung");
            myHouse.setUsableArea(sc.nextInt());

            System.out.println("Nhap chi phi thue");
            myHouse.setFeeRent(sc.nextInt());

            System.out.println("Nhap so luong toi da");
            myHouse.setNumberMaximumPeople(sc.nextInt());

            System.out.println("Nhap kieu thue");
            myHouse.setStyleRent(sc.nextDouble());

            System.out.println("Ban da nhap House" + " " + dem + "tobe continueee!!!!!!!!!!!!!!");
            sc.hasNextLine();
            houseList.add(myHouse);
            dem = dem +1;
        }
        addNewService();

    }
    //case3: 
    private static void addNewRoom() {
        Scanner sc = new Scanner(System.in);

        int dem = 0;
        int soLuong =sc.nextInt();
        while(dem < soLuong) {
            Room myRoom = new Room();
            System.out.println("Nhap dich vu mien phi di kem");
            sc.nextLine();
            myRoom.setFreeServices(sc.nextLine());

            System.out.println("Nhap ten dich vu: ");
            Services myHouse;
            myRoom.setServiceName(sc.nextLine());

            System.out.println("Nhap dien tich su dung");
            myRoom.setUsableArea(sc.nextInt());

            System.out.println("Nhap chi phi thue");
            myRoom.setFeeRent(sc.nextInt());

            System.out.println("Nhap so luong toi da");
            myRoom.setNumberMaximumPeople(sc.nextInt());

            System.out.println("Nhap kieu thue");
            myRoom.setStyleRent(sc.nextDouble());

            System.out.println("Ban da nhap House" + " " + dem + "tobe continueee!!!!!!!!!!!!!!");
            sc.hasNextLine();
            roomList.add(myRoom);
            dem = dem+1;
        }
        addNewService();
    }

    //case4:
    private static void backToMenu() {
        addNewService();
    }

    //case5: 
    private static void Exit() {
        System.exit(0);
    }

    
}
