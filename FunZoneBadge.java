/**
 * This class represents a badge at an entertainment centre.
 * 
 * @author Omar Habib ID:3742418
 */

public class FunZoneBadge {

    /**
     * the name of the card holder
     */
    private String name;
    /**
     * the badge number
     */
    private int badgeNum;
    /**
     * total amount of charges
     */
    private double charges;

    /**
     * this method constructs a Badge with the specified
     * name and number
     * 
     * @param nameIn     the name of the card holder
     * @param badgeNumIn the badge number
     */
    public FunZoneBadge(String nameIn, int badgeNumIn) {
        name = nameIn;
        badgeNum = badgeNumIn;
        charges = 0.00;
    }

    /**
     * this method retrives the name of the card holder
     * 
     * @return the name of the card holder
     */
    public String getName() {
        return name;
    }

    /**
     * this method retrieves the number of the badge
     * 
     * @return the badge number
     */
    public int getBadgeNum() {
        return badgeNum;
    }

    /**
     * this method retrives the total amount of charges
     * 
     * @return the total amount of charges
     */
    public double getCharges() {
        return charges;
    }

    /**
     * this method is called to increase the amount of charges
     * 
     * @param amount the price of the game
     */
    public void setCharges(double amount) {
        charges = charges + amount;
    }

    /**
     * this method returns the donation amount
     * @param percentage the percentage amount of the donation from the total charges
     * @return the amount of the donation
     */
    public double donation(double percentage) {
        return (charges/100 )* percentage;
    }
}
