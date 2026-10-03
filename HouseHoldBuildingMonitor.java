import java.util.Scanner;

public class HouseHoldBuildingMonitor {
    public static int calculatetotal(int morningusage, int eveningusage) {
        return morningusage + eveningusage;
    }

    public static void main(String[] args) {
        int totalusage = calculatetotal(100, 150);
        System.out.println("Total Usage: " + totalusage);

        Scanner sn = new Scanner(System.in);
        System.out.println("Enter Number of Family members");
        int familymembers = sn.nextInt();

        System.out.println("Enter Water Consumed in liters");
        double waterconsumed = sn.nextDouble();

        System.out.println("House Number");
        int housenumber = sn.nextInt();

        System.out.println("Enter Water status");
        boolean waterstatus = sn.nextBoolean();

        System.out.println("FamilyMembers:" + familymembers);
        System.out.println("Water Consumed:" + waterconsumed);
        System.out.println("House Number:" + housenumber);
        System.out.println("Water Status:" + waterstatus);

        if (waterconsumed <= 500) {
            System.out.println("100");
        } else {
            System.out.println("200");
        }

        sn.close();
    }
}