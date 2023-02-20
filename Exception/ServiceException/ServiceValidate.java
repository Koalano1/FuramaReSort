package Exception.ServiceException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServiceValidate {
    public static boolean checkIDVilla(String stringVillaID){
        String regex = "^SVVL-[\\d]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringVillaID);
        return m.matches();
    }

    public static boolean chechIDHouse(String stringHouseID){
        String regex = "SVHO-[\\d]{4}$$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringHouseID);
        return m.matches();
    }

    public static boolean checkIDRoom(String stringRoomID){
        String regex = "SVRO-[\\d]{4}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringRoomID);
        return m.matches();
    }

    public static boolean checkNameServices(String stringNameServices){
        String regex = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringNameServices);
        return m.matches();
    }

    //diện tichs sử dụng
    public static boolean checkUsableArea(String stringUsable){
        String regex = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringUsable);
        return m.matches();
    }

    //chi phí thuê
    public static boolean checkFeeRent(String stringFee){
        String regex = "";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringFee);
        return m.matches();
    }

    //Số lượng người tối đa
    public static boolean checkMaximumPepole(String stringMaxPeople){
        String regex = " ";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringMaxPeople);
        return m.matches();
    }
    

}
