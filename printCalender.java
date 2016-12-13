import java.util.Scanner;

/**
 * Created by Snoopy on 2016/11/23.
 */
public class printCalender {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year(eg:1997)");
        int year = input.nextInt();
        System.out.print("Enter month (1-12:)");
        int month = input.nextInt();
        printMonth(year,month);
    }

    public static void printMonth(int year, int month){
        printMonthTitle(year,month);
        printMonthBody(year,month);
    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("        "+getMonthName(month)+ " "+year);
        System.out.println("-------------------------------");
        System.out.println(" Sun Mon Tue Wen Thu Fri Sat");
    }

    private static String getMonthName(int month) {
        String monthName = "";
        switch(month){
            case 1: monthName = "January";break;
            case 2: monthName = "February";break;
            case 3: monthName = "March";break;
            case 4: monthName = "April";break;
            case 5: monthName = "May";break;
            case 6: monthName = "June";break;
            case 7: monthName = "July";break;
            case 8: monthName = "August";break;
            case 9: monthName = "September";break;
            case 10: monthName = "October";break;
            case 11: monthName = "November";break;
            case 12: monthName = "December";break;
        }
        return monthName;
    }

    private static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year,month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year,month);
        int i = 0;
        for(i = 0; i <startDay; i++)
               System.out.print("    ");
        for(i = 1; i <=numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);
            if((i + startDay)%7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    private static int getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1_1990 = 1;
        int totalNumberOfDays = getTotalNumberOfDays(year,month);
         return (totalNumberOfDays + START_DAY_FOR_JAN_1_1990)%7;
    }

    private static int getTotalNumberOfDays(int year, int month) {
        int total = 0;
        for(int i = 1990; i < year; i++){
            if(isLeapYear(i))
                total += 366;
            else
                total += 365;
        }
        for(int j = 1; j < month; j++)
            total += getNumberOfDaysInMonth(year,j);
        return total;
    }

    private static int getNumberOfDaysInMonth(int year, int month) {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if(month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if(month == 2)
            return isLeapYear(year) ? 29 : 28;
        return 0;
    }

    private static boolean isLeapYear(int year) {
        return year % 400 == 0 ||(year % 100 != 0 && year % 4 == 0);
    }
}
