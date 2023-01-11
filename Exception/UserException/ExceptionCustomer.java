package Exception.UserException;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionCustomer {
    public static boolean checkNameException(String stringNameException){
        String regex = "^[A-Z][^\\\\s]*$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringNameException);
        return m.matches();
    }

     public static boolean checkEmailException(String stringEmailException){
        String regex = "^[\\w-\\.+]*[\\w-\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringEmailException);
        return m.matches();
     }

     public static boolean checkGenderException(String stringGenderException){
        String regex = "(Male|Female|Unknow)";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringGenderException);
        return m.matches();
     }

     public static boolean checkIDCardException(String stringIDCardException){
        String regex = "^\\d{3}\\s\\d{3}\\s\\d{3}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringIDCardException);
        return m.matches();
     }

    public static boolean checkBirthdayException(String stringBirthdayException){
        String regex = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringBirthdayException);
        if (!m.matches()) {
            System.out.println("Khong dung roi!!! Vui long nhap lai");

        }

        int year = Integer.parseInt(stringBirthdayException.substring(6));
        if (year <= 1900 || year > Calendar.getInstance().get(Calendar.YEAR) - 18) {
            return false;
        }
        return true;

    }

}
