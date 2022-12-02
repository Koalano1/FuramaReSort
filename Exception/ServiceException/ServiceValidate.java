package Exception.ServiceException;

public class ServiceValidate {
    private static String regex ="";


    //Validate Villa 
    public static boolean checkIDVilla(String str) {
        regex = "SVVL-[\\d{4}$";
        return str.matches(regex);
    }

    //Validate House
    public static boolean checkIDHouse(String str){
        regex = "^SVVL-[\\d]{4$}$";
        return str.matches(regex);
    }  

      //validate Room
    public static boolean checkIDRoom(String str){
        regex = "HOVL-[\\d]{4}$";
        return str.matches(regex);
    }
    
    //Validate Name of Service(upercOfase the first character)
    public static boolean checkNameServices(String str) {
        regex = "";
        return str.matches(regex);
    }
}
