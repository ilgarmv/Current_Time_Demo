import java.text.DateFormat; 
import java.util.*; 
  
public class CountryTime { 
    public static void main(String[] args) throws Exception 
    { 
        Date d1 = new Date(); 

        Locale locBaku = new Locale("az", "AZ");
        DateFormat db = DateFormat.getDateInstance(DateFormat.FULL, locBaku); 
        System.out.println("Baku Format: " + db.format(d1)); 

        Locale locTbilisi = new Locale("ka", "GE");
        DateFormat dt = DateFormat.getDateInstance(DateFormat.FULL, locTbilisi); 
        System.out.println("Tbilisi Format: " + dt.format(d1)); 

        Locale locIstanbul = new Locale("tr", "TR");
        DateFormat di = DateFormat.getDateInstance(DateFormat.FULL, locIstanbul); 
        System.out.println("Istanbul Format: " + di.format(d1)); 
    } 
}
