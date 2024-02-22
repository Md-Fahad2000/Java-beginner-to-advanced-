public class Assign3Q2 {
    public static void main(String[] args) {
        String currentMonth = "January";
        System.out.println("The current month is :" + currentMonth);
        switch (currentMonth) {
            case "January":
            System.out.println("January is:"+ 31+ "days");
            case "February":
            System.out.println("Feburary is:"+ 28+ "days");
            case "March":
            System.out.println("April is:"+ 31+ "days");
            case "April":
            System.out.println("May is:"+ 30+ "days");
            case "May":
            System.out.println("June is:"+ 31+ "days");
            case "June":
            System.out.println("July is:"+ 30+ "days");
            case "July":
            System.out.println("August is:"+ 31+ "days");
            case "August":
            System.out.println("September is:"+ 30+ "days");
            case "September":
            System.out.println("October is:"+ 31+ "days");
            case "October":
            System.out.println("January is:"+ 30+ "days");
            case "November":
            System.out.println("November is:"+ 31+ "days");
            case "December":
            System.out.println("December is:"+ 30+ "days");
            
                break;
        
            default:
                break;
        }
    }
}
