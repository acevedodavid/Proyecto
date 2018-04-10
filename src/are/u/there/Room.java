/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package are.u.there;

/**
 *
 * @author Rodrigo
 */
public class Room {
    private int type;       //flag to type of room displayed
    private boolean key;    //flag indicate if the room has a key or not
    private boolean passed; //flag to check if the puzzle has already been passed
    private int right;      //indicator of number of room connected to the left
    private int left;       //indicator of number of room connected to the right
    private int down;       //indicator of number of room connected down
    private int up;         //indicator of number of room connected up
    
    public Room (int type, int right, int left, int down, int up) {
        this.type = type;
        this.right = right;
        this.left = left;
        this.down = down;
        this.up = up;
    }

    public void setKey(boolean key) {
        this.key = key;
    }

    public boolean isKey() {
        return key;
    }

    public int getRight() {
        return right;
    }

    public int getLeft() {
        return left;
    }

    public int getDown() {
        return down;
    }

    public int getUp() {
        return up;
    }

    public int getType() {
        return type;
    }

    public boolean isPassed() {
        return passed;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }
    
}


