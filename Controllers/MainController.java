package Controllers;
import java.util.Collections;
import java.util.List;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import Models.Services.House;
import Models.Services.Room;
import Models.Services.Services;
import Models.Services.Villa;


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
        System.out.println("Ban muon thuc hien yeu cau nao?");

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
                writeFileDataVilla();
                break; 
            case 4:
                //task 5
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
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                backToMenu();
                break;
            case 8:
                Exit();
                break;        
            default:
                System.out.println("Ban nhap sai roi! Vui long nhap lai...");
                break;
        }

    }
    private static void showAllRoom() {
        for(Room room: roomList){
            room.showInfor();
        }
        displayMainMenu();
    }

    private static void showAllHouse() {
        for(House house: houseList){
            house.showInfor();
        }
        displayMainMenu();
    }

    private static void showAllVilla() {
        for(Villa villa: villaList) {
            villa.showInfor();
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
    public static void writeFileDataVilla(){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"))) {
            bw.write("Name");
            bw.write(",");
            bw.write("Role");
            bw.write(",");
            bw.write("Topic");
            bw.newLine();

            // for (Villa villa : villaList) {
            //     bw.write(String.join(",", villa));
            //     bw.newLine();
            // }
        }catch(Exception e){

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
    
            System.out.println("Ban da nhap Villa thu " + dem  + 1 + " thanh cong! " + "Enter de tiep tuc");
            sc.nextLine();
            villaList.add(myVilla);
            dem = dem + 1;
        }
        
        displayMainMenu();
    }
    // String csvFile = "data/data.csv";
    // try() 

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

            System.out.println("Ban da nhap House thu " + " " + dem + 1 + " thanh cong! " + "Tobe continueee!!!!!!!");
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

            System.out.println("Ban da nhap room thu " + " " + dem + 1 + " thanh cong! " + "tobe continueee!!!!!!!");
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
