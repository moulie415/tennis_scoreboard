package com.company;

import junit.framework.TestCase;

/**
 * Created by MOULIE415 on 06/11/2016.
 */
public class MatchTest extends TestCase {
    public void testP1Score()  {
        //test by scoring player1 4 times to see if a game is added and points are reset to 0
        Match match = new Match();
        for (int i = 0; i < 4; i++) {
            match.p1Score();
        }

        assertEquals(0, match.getP1Points());
        assertEquals(1, match.getP1Games());

    }

    public void testDeuce() {
        /*
        test whether deuce and player 1 advantage gets correctly evaluated at certain points
         */
        Match match = new Match();
        //two for loops to get to the players to deuce
        for (int i = 0; i < 3; i++) {
            match.p1Score();
        }
        for (int i = 0; i < 3; i++) {
            match.p2Score();
        }

        assertEquals(true, match.getDeuce());
        match.p1Score();
        assertEquals(true, match.getP1Van());
        match.p2Score();
        assertEquals(false,match.getP1Van());
        match.p1Score();
        match.p1Score();
        assertEquals(false, match.getDeuce());
    }

    public void testSetAdded() {

        /*
        test whether a set is incremented when player reaches certain amount of games and whether that also added the
        numbers of games won to the players previous sets array list
         */

        Match match = new Match();
        //score player1 24 times so that they should have the right amount of points to win 6 games and therefore the set
        for (int i = 0; i < 24; i++) {
            match.p1Score();
        }

        int prevSet = match.getP1PrevSets().get(0);
        assertEquals(0,match.getP1Games());
        assertEquals(1,match.getP1Sets());
        assertEquals(6,prevSet);

    }


}