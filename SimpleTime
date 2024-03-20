import java.util.*;
import java.time.*;
public class SimpleTime {
    public static void main(String[] args)
    {
        Date date = new Date();
 
        LocalDateTime dtime = LocalDateTime.now();
 
        ZonedDateTime UTCtime = dtime.atZone(ZoneId.of("UTC"));
        
        ZonedDateTime InTime = UTCtime.withZoneSameInstant(
            ZoneId.of("Asia/Baku"));
  
 
        System.out.println(InTime);
    }
}
