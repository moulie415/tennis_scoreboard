package com.company;

/**
 * Created by MOULIE415 on 03/11/2016.
 */
public class Game {

    private boolean deuce = false;

    //booleans for whether its player 1 or players 2 advantage
    private boolean p1Van = false;
    private boolean p2Van = false;

    private int p1Games = 0;
    private int p2Games = 0;

    private int p1Points = 0;
    private int p2Points = 0;

    public boolean isDeuce() {
        return deuce;
    }

    public boolean isP1Van() {
        return p1Van;
    }

    public boolean isP2Van() {
        return p2Van;
    }

    public int getP1Games() {
        return p1Games;
    }

    public int getP2Games() {
        return p2Games;
    }

    public int getP1Points() {return p1Points;}

    public int getP2Points() {return p2Points;}
    /**
     * Pre: games won by player 1 in the set is less than 7
     * Post: p1Games +=1
     */
    public void addP1Game () {
        assert (p1Games < 7) : "Player should not exceed 7 games in a set";
        p1Games +=1;
    }

    /**
     * Pre: games won by player 2 in the set is less than 7
     * Post: p2Games +=1
     */
    public void addP2Game () {
        assert (p2Games < 7) : "Player should not exceed 7 games in a set";
        p2Games +=1;
    }


    /**
     * reset games to zero after set has been won
     */
    public void resetGames() {
        p1Games = 0;
        p2Games = 0;
    }


    /**
     * Pre: player 1 points should not have exceeded 40
     * Post: Either player points, deuce, p1Van, p2Van values are updated
     */
    public void p1Point () {
        assert (p1Points <= 40) : "player should not exceed more than 40 points";
        if (p1Points == 0) {
            p1Points += 15;
        }
        else if (p1Points == 15) {
            p1Points += 15;
        }

        else if (p1Points == 30) {
            p1Points += 10;
            if (p2Points == 40) {
                deuce = true;
            }
        }

        else if (p1Points == 40) {
            if (deuce && !p1Van && !p2Van) {
                p1Van = true;
            }
            else if (deuce && p1Van) {
                p1Games += 1;
                p1Points = 0;
                p2Points = 0;
                deuce = false;
                p1Van = false;
            }
            else if (deuce) {
                p2Van = false;
            }
            else {
                p1Games += 1;
                p1Points = 0;
                p2Points = 0;

            }

        }
    }

    /**
     * Pre: player 2 points should not have exceeded 40
     * Post: Either player points, deuce, p1Van, p2Van values are updated
     */
    public void p2Point () {
        assert (p2Points <= 40) : "player should not exceed more than 40 points";
        if (p2Points == 0) {
            p2Points += 15;
        }

        else if (p2Points == 15) {
            p2Points += 15;
        }

        else if (p2Points == 30) {
            p2Points += 10;
            if (p1Points == 40) {
                deuce = true;
            }
        }

        else if (p2Points == 40 ) {
            if (deuce && !p1Van  && !p2Van) {
                p2Van = true;
            }
            else if (deuce && p2Van) {
                p2Games +=1;
                p1Points = 0;
                p2Points =0;
                deuce = false;
                p2Van = false;
            }

            else if (deuce) {
                p1Van = false;
            }

            else {
                p2Games +=1;
                p1Points = 0;
                p2Points =0;

            }

        }
    }
}
