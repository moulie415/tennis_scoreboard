package com.company;

import java.util.ArrayList;

/**
 * Created by MOULIE415 on 03/11/2016.
 */
public class Match {

    private Set set = new Set();
    private Game game = new Game();

    /**
     * Pre: Match has not already been won
     * Post: Player 1s score is updated
     */
    public void p1Score() {
        assert (!isMatchWon()) : "The Match has already ended";
        //if its a tie break then add to player 1 tiebreak points otherwise add to standard game points
        if (isTieBreak()) {
            set.p1TBPoint();
            if (set.getP1TBPoints() == 7 && set.getP2TBPoints() < 6) {
                game.addP1Game();
                set.addP1Set();
                set.addToPrevSets(game.getP1Games(), game.getP2Games());
                game.resetGames();
                set.resetTBPoints();
            }

            else if (set.getP1TBPoints() > 7 && set.getP1TBPoints() > set.getP2TBPoints() + 1) {
                game.addP1Game();
                set.addP1Set();
                set.addToPrevSets(game.getP1Games(), game.getP2Games());
                game.resetGames();
                set.resetTBPoints();
            }
        }
        else {
            game.p1Point();
            isSetWon();
        }
        isMatchWon();
    }

    /**
     * Pre: Match has not already been won
     * Post: Player 2s score is updated
     */
    public void p2Score() {
        assert (!isMatchWon()) : "The Match has already ended";
        //if its a tie break then add to player 2 tiebreak points otherwise add to standard game points
        if (isTieBreak()) {
            set.p2TBPoint();
            if (set.getP2TBPoints() == 7 && set.getP1TBPoints() < 6) {
                game.addP2Game();
                set.addP2Set();
                set.addToPrevSets(game.getP1Games(), game.getP2Games());
                game.resetGames();
                set.resetTBPoints();
            }

            else if (set.getP2TBPoints() > 7 && set.getP2TBPoints() > set.getP1TBPoints() + 1) {
                game.addP2Game();
                set.addP2Set();
                set.addToPrevSets(game.getP1Games(), game.getP2Games());
                game.resetGames();
                set.resetTBPoints();
            }
        }
        else {
            game.p2Point();
            isSetWon();
        }
        isMatchWon();
    }

    /**
     * Pre: Neither player should have a value greater than 7 for games won
     * Post: Either one of the player gains a set and both players games are set to 0 or nothing happens
     * @return boolean value stating whether or not the set has been won
     */
    public boolean isSetWon() {
        assert (game.getP1Games() < 8 && game.getP2Games() < 8) : "games won should not have exceeded 7 for either player";
        if (game.getP1Games() == 6 && game.getP2Games() < 5 || game.getP1Games() == 7) {
            set.addP1Set();
            if (!isMatchWon()) {
                set.addToPrevSets(game.getP1Games(), game.getP2Games());
                game.resetGames();
            }
            return true;

        }

        else if (game.getP2Games() == 6 && game.getP1Games() < 5 || game.getP1Games() == 7) {
            set.addP2Set();
            if (!isMatchWon()) {
                set.addToPrevSets(game.getP1Games(), game.getP2Games());
                game.resetGames();
            }
            return true;
        }

        else {
            return false;
        }

    }

    /**
     * Pre: Both players have not exceeded 7 games
     * Post: Value returned is true if both players are at 6 games each otherwise value returned is false
     * @return boolean value stating whether the set is at a tie break
     */
    public boolean isTieBreak() {
        assert (game.getP1Games() < 8 && game.getP2Games() < 8) : "games won should not have exceeded 7 for either player";
        if (game.getP1Games() == 6 && game.getP2Games() == 6) {
            return true;
        }
        else {
            return false;
        }
    }


    /**
     * Pre: Both players should not have exceeded 3 sets
     * Post: Value returned is true if one of the players has reached 3 sets otherwise value returned is false
     * @return boolean value stating whether or not the match has been won
     */
    public boolean isMatchWon() {
        assert (set.getP1Sets() <= 3 && set.getP2Sets() <= 3) : "number of sets won exceeded";
        if (set.getP1Sets() == 3) {
            return true;
        } else if (set.getP2Sets() == 3) {
            return true;
        } else {
            return false;
        }
    }

    public int getP1Points() {
        return game.getP1Points();
    }

    public int getP2Points() {
        return game.getP2Points();
    }

    public int getP1Games() {
        return game.getP1Games();
    }

    public int getP2Games() {
        return game.getP2Games();
    }

    public int getP1Sets() {
        return set.getP1Sets();
    }

    public int getP2Sets() {
        return set.getP2Sets();
    }

    public int getP1TBPoints() { return set.getP1TBPoints();}

    public int getP2TBPoints() { return set.getP2TBPoints();}

    public ArrayList<Integer> getP1PrevSets() {
        return set.getP1PrevSets();
    }

    public ArrayList<Integer> getP2PrevSets() {
        return set.getP2PrevSets();
    }

    public boolean getP1Van() {
        return game.isP1Van();
    }
    public boolean getP2Van() {
       return game.isP2Van();
    }

    public boolean getDeuce() {
        return game.isDeuce();
    }

}
