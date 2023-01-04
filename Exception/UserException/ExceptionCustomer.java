package Exception.UserException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExceptionCustomer {
    public static boolean checkNameException(String stringNameException){
        String regex = "[A-Z][a-z]*\\\\s[A-Z][a-z]*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(stringNameException);
        return m.matches();
    }


}
