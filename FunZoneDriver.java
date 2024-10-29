/**
 * @author Omar Habib ID:3742418
 */

public class FunZoneDriver {
    public static void main(String[] args) {

        FunZoneBadge bensBadge = new FunZoneBadge("Ben Landry", 1231234);
        bensBadge.setCharges(6.00);
        bensBadge.setCharges(9.50);

        FunZoneBadge mariasBadge = new FunZoneBadge("Maria Lopez", 2468135);
        mariasBadge.setCharges(7.25);
        mariasBadge.setCharges(6.50);

        FunZoneBadge karlsBadge = new FunZoneBadge("Karl Wagner", 3451016);
        karlsBadge.setCharges(2.75);
        karlsBadge.setCharges(9.50);

        FunZoneBadge lorisBadge = new FunZoneBadge("Lori Evans", 5798642);
        lorisBadge.setCharges(12.50);
        lorisBadge.setCharges(18.75);

        System.out.println("Badge Holder: " + bensBadge.getName());
        System.out.println("Badge Number: " + bensBadge.getBadgeNum());
        System.out.println("Total Charges: " + bensBadge.getCharges());
        System.out.println("Donation Amount: " + bensBadge.donation(0.18));
        System.out.println();

        System.out.println("Badge Holder: " + mariasBadge.getName());
        System.out.println("Badge Number: " + mariasBadge.getBadgeNum());
        System.out.println("Total Charges: " + mariasBadge.getCharges());
        System.out.println("Donation Amount: " + mariasBadge.donation(0.12));
        System.out.println();

        System.out.println("Badge Holder: " + karlsBadge.getName());
        System.out.println("Badge Number: " + karlsBadge.getBadgeNum());
        System.out.println("Total Charges: " + karlsBadge.getCharges());
        System.out.println("Donation Amount: " + karlsBadge.donation(0.20));
        System.out.println();

        System.out.println("Badge Holder: " + lorisBadge.getName());
        System.out.println("Badge Number: " + lorisBadge.getBadgeNum());
        System.out.println("Total Charges: " + lorisBadge.getCharges());
        System.out.println("Donation Amount: " + lorisBadge.donation(0.20));
        System.out.println();

    }
}
