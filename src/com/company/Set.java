package com.company;

import java.util.ArrayList;

/**
 * Created by MOULIE415 on 03/11/2016.
 */
public class Set {
    private int p1Sets = 0;
    private int p2Sets = 0;

    //player 1 and 2 tie break points
    private int p1TBPoints = 0;
    private int p2TBPoints = 0;

    private ArrayList<Integer> p1PrevSets = new ArrayList<>();
    private ArrayList<Integer> p2PrevSets = new ArrayList<>();

    /**
     * Pre: Player 1 hasn't already reached 7 tie break points and isn't already 2 points ahead
     * Post: p1TBPoints +=1
     */
    public void p1TBPoint() {
        assert (!(p1TBPoints >= 7 && p1TBPoints > p2TBPoints + 1)) : "Player 1 should have already won the tie break";
        p1TBPoints +=1;
    }

    /**
     * Pre: Player 2 hasn't already reached 7 tie break points and isn't already 2 points ahead
     * Post: p2TBPoints +=1
     */
    public void p2TBPoint() {
        assert (!(p2TBPoints >= 7 && p2TBPoints > p1TBPoints + 1)) : "Player 2 should have already won the tie break";
        p2TBPoints += 1;
    }

    /**
     * reset tie break points after tie break has been won
     */
    public void resetTBPoints () {
        p1TBPoints = 0;
        p2TBPoints = 0;
    }

    public int getP1TBPoints() {
        return p1TBPoints;
    }

    public int getP2TBPoints() {return p2TBPoints; }

    public ArrayList<Integer> getP1PrevSets() {
        return p1PrevSets;
    }

    public ArrayList<Integer> getP2PrevSets() {
        return p2PrevSets;
    }


    /**
     * Pre: Player 1 should not have already reached 3 sets
     * Post: p1Sets +=1
     */
    public void addP1Set() {
        assert (p1Sets < 3) : "Player 1 should not have already reached 3 sets";
        p1Sets +=1;
    }

    /**
     * Pre: Player 2 should not have already reached 3 sets
     * Post: p2Sets +=1
     */
    public void addP2Set() {
        assert (p2Sets < 3) : "Player 2 should not have already reached 3 sets";
        p2Sets +=1;
    }

    public int getP1Sets() {
        return p1Sets;
    }

    public int getP2Sets() {
        return p2Sets;
    }

    /**
     * adds number of games won for that set to an arraylist for each player
     * Pre: p1Set and p2Set values are less than 8
     * Post: p1Set added to p1PrevSets arraylist and p2PrevSets
     * @param p1Set an integer representing the games one by player 1 for that set
     * @param p2Set an integer representing the games one by player 2 for that set
     */
    public void addToPrevSets(int p1Set, int p2Set) {
        assert (p1Set < 8 && p2Set < 8): "Number of games won in a set should not exceed 7";
        p1PrevSets.add(p1Set);
        p2PrevSets.add(p2Set);
    }

}
