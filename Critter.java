/*
 This is a project to simulate the motions of a critter.
 
 @author Patrick Zhou
 @version v1.0.0
*/

public class Critter {
    // declare and initialize instance variables
    private int x, y, facing;
    private String name;
    private boolean views, competition;
    // constructor code
    public Critter(String passedname, boolean passedview, boolean passedcompetition) {
        x=5;
        y=5;
        facing = 0;
        name = passedname;
        views = passedview;
        competition = passedcompetition;
    }
    // turn right method
    public void turnright() {
        facing++;
        if (facing == 4) {
            facing = 0;
        }
    }
    // turn left method
    public void turnleft() {
        facing--;
        if (facing == -1) {
            facing = 3;
        }
    }
    // move forward method
    public void moveforward() {
        if (facing == 0) {
            y++;
        } else if (facing == 1) {
            x++;
        } else if (facing == 2) {
            y--;
        } else if (facing == 3) {
            x--;
        }
    }
    // accessor methods
    public int getPosX() {
        return x;
    }
    public int getPosY() {
        return y;
    }
    public int direction() {
        return facing;
    }
    // mutator methods
    public void setPosX(int passedX) {
        x = passedX;
    }
    public void setPosY(int passedY) {
        y = passedY;
    }
    public String getName() {
        return name;
    }
    public boolean getViews() {
        return views;
    }
    public boolean getCompetition() {
        return competition;
    }
    // tostring method for printing current status
    public String currentStatus() {
        String fullstr="";
        fullstr+="Name: "+name+"\n";
        String dir = "";
        if (facing == 0) {
            dir = "North";
        } else if (facing == 1) {
            dir = "East";
        } else if (facing == 2) {
            dir = "South";
        } else if (facing == 3) {
            dir = "West";
        }
        fullstr+="Direction: "+dir+"\n"+"Position: ("+x+", "+y+")";
        return fullstr;
    }
}