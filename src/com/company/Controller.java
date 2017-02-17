package com.company;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MOULIE415 on 02/11/2016.
 */
public class Controller {

    private Match theModel;
    private View theView;
    private String player1;
    private String player2;

    public Controller(View theView, Match theModel, String p1, String p2) {
        this.theModel = theModel;
        this.theView = theView;
        this.theView.addButtonListener(new ControllerListener());
        this.player1 = p1;
        this.player2 = p2;
        this.theView.setNamesText(p1,p2);

    }

    class ControllerListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == theView.getP1WinPoint()) {
                theModel.p1Score();
                if (!theModel.isTieBreak()) {
                    if (theModel.getP1Van()) {
                        theView.setP1Van();
                    } else {
                        theView.setP1Points(theModel.getP1Points());
                    }
                    theView.setP2Points(theModel.getP2Points());
                }
                else {
                    theView.setP1Points(theModel.getP1TBPoints());
                    theView.setP2Points(theModel.getP2TBPoints());
                }
            }
            else {
                theModel.p2Score();
                if (!theModel.isTieBreak()) {
                    if (theModel.getP2Van()) {
                        theView.setP2Van();
                    } else {
                        theView.setP2Points(theModel.getP2Points());
                    }
                    theView.setP1Points(theModel.getP1Points());
                }
                else {
                    theView.setP1Points(theModel.getP1TBPoints());
                    theView.setP2Points(theModel.getP2TBPoints());
                }
            }
            theView.setP1Games(theModel.getP1Games());
            theView.setP2Games(theModel.getP2Games());
            theView.setP1Sets(theModel.getP1Sets());
            theView.setP2Sets(theModel.getP2Sets());

            //check if set has been played before querying previous sets array
            if (theModel.getP1PrevSets().size() > 0) {
                theView.setP1FirstSet(theModel.getP1PrevSets().get(0));
                theView.setP2FirstSet(theModel.getP2PrevSets().get(0));
            }
            if (theModel.getP1PrevSets().size() > 1) {
                theView.setP1SecondSet(theModel.getP1PrevSets().get(1));
                theView.setP2SecondSet(theModel.getP2PrevSets().get(1));
            }
            if (theModel.getP1PrevSets().size() > 2) {
                theView.setP1ThirdSet(theModel.getP1PrevSets().get(2));
                theView.setP2ThirdSet(theModel.getP2PrevSets().get(2));
            }
            if (theModel.getP1PrevSets().size() > 3) {
                theView.setP1FourthSet(theModel.getP1PrevSets().get(3));
                theView.setP2FourthSet(theModel.getP2PrevSets().get(3));
            }

            if (theModel.isMatchWon()) {
                theView.disableButtons();
                if (theModel.getP1Sets() == 3) {
                    theView.setWinningText(player1);
                }
                else {
                    theView.setWinningText(player2);
                }
            }



        }
    }

}
