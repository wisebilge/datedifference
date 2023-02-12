import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Calculation {
    public static void calculate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date theDate = new Date();
        dateFormat.format(theDate);

        System.out.println("Enter a date and we'll tell you how much time has passed or how much time is left.");
        Scanner input = new Scanner(System.in);
        String userDate = input.nextLine();

        Date theUserDate = dateFormat.parse(userDate);


      long time_Difference = theDate.getTime() - theUserDate.getTime();


        long second = (time_Difference / 1000) % 60;
        long minute = (time_Difference / (1000 * 60)) % 60;
        long hour = (time_Difference / (1000 * 60 * 60)) % 24;
        long day = (time_Difference / (1000 * 60 * 60 * 24)) % 365;
        long year = (time_Difference / (1000l * 60 * 60 * 24 * 365));


        System.out.println(year + " year " + day + " day " + hour + " hour " + minute + " minute " + second + " second");


    }
}
