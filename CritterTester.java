/*
 This is a class to test the Critter class
 
 @author Patrick Zhou
 @version v1.0.0
*/

public class CritterTester {
    public static void main(String[] args) {
        // declare and initialize critter and print initial status
        Critter beetle = new Critter("beetle", false, true);
        System.out.println(beetle.currentStatus());
        // declare variables for for loop
        int i, j;
        // nested for loop for beetle movement
        for (i=0;i<4;i++) { // turn 4 times
            for (j=0;j<5;j++) { // move forward 5 times every time you turn
                beetle.moveforward();
            }
            // turn code
            beetle.turnright();
            // print status every turn
            System.out.println(beetle.currentStatus());
        }
        // declaration and initialization of required critters.
        Critter bentley = beetle;
        Critter blackhawk = new Critter("blackhawk", true, true);
        Critter mustang = new Critter("mustang", true, false);
        // mustang initial turn
        mustang.turnright();
        // nested for loop to move mustang
        for (i=0;i<4;i++) { // turn 4 times
            for (j=0;j<5;j++) { // move forward 5 times every time you turn
                mustang.moveforward();
            }
            mustang.turnleft();
            // print status every turn
            System.out.println(mustang.currentStatus());
        }
        // check whether mustang position equals beetle position
        if (mustang.getPosX() == beetle.getPosX() && mustang.getPosY() == beetle.getPosY()) {
            System.out.println("beetle and mustang are in a race!");
        } 
        // check if bentley's name is equal to beetle's name
        if (bentley.getName() == beetle.getName()) {
            System.out.println("beetle also goes by bentley");
        }
        // check if mustang's views are equal to beetle's views
        if (mustang.getViews()!=beetle.getViews()) {
            System.out.println("beetle and mustang are in competition with each other");
        }
        // check if blackhawk wants to enter the competition
        if (blackhawk.getCompetition()) {
            System.out.println("blackhawk wants to compete!");
        } else if (!blackhawk.getCompetition()) {
            System.out.println("blackhawk does not want to compete");
        } else {
            System.out.println("blackhawk is getting ready");
        }
    }
}

/*
 * Questions:
 * i. 2 integers, 4 critters
 * ii. 4 objects
 * iii. 12 aliases/shared references
 * iv. 2 variables (my i and j integers) point to no object
 */