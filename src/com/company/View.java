package com.company;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

/**
 * Created by MOULIE415 on 01/11/2016.
 */
public class View extends JFrame {
    private JLabel prevSets = new JLabel("PREVIOUS SETS");
    private JLabel sets = new JLabel("SETS");
    private JLabel games = new JLabel("GAMES");
    private JLabel points = new JLabel("POINTS");

    private JTextField p1FirstSet = new JTextField("",2);
    private JTextField p2FirstSet = new JTextField("",2);
    private JTextField p1SecondSet = new JTextField("",2);
    private JTextField p2SecondSet = new JTextField("",2);
    private JTextField p1ThirdSet = new JTextField("",2);
    private JTextField p2ThirdSet = new JTextField("",2);
    private JTextField p1FourthSet = new JTextField("",2);
    private JTextField p2FourthSet = new JTextField("",2);

    private JTextPane names = new JTextPane();

    private JTextField p1Sets = new JTextField("0",2);
    private JTextField p2Sets = new JTextField("0",2);

    private JTextField p1Games = new JTextField("0",2);
    private JTextField p2Games = new JTextField("0", 2);


    private JTextField p1Points = new JTextField("0",2);
    private JTextField p2Points = new JTextField("0",2);

    private JButton p1WinPoint = new JButton("Win Point");
    private JButton p2WinPoint = new JButton("Win Point");

    private Color darkGreen = Color.decode("#326500");
    private Color myYellow = Color.decode("#FCFE04");

    private Font numbers = new Font("Courier", Font.BOLD, 30);
    private Font namesFont = new Font("Courier",Font.PLAIN, 18);
    private Font otherText = new Font("Courier",Font.PLAIN, 7);

    private Border border = BorderFactory.createLineBorder(darkGreen,1);


    View() {

        //steps needed to center the names in the middle section
        StyledDocument doc = names.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);

        prevSets.setFont(otherText);
        prevSets.setBackground(darkGreen);
        prevSets.setForeground(myYellow);
        prevSets.setPreferredSize(new Dimension(435,10));
        prevSets.setBorder(border);

        sets.setFont(otherText);
        sets.setBackground(darkGreen);
        sets.setForeground(myYellow);
        sets.setPreferredSize(new Dimension(55,10));
        sets.setBorder(border);

        games.setFont(otherText);
        games.setBackground(darkGreen);
        games.setForeground(myYellow);
        games.setPreferredSize(new Dimension(55,10));
        games.setBorder(border);

        points.setFont(otherText);
        points.setBackground(darkGreen);
        points.setForeground(myYellow);
        points.setBorder(border);

        p1WinPoint.setBackground(darkGreen);
        p1WinPoint.setForeground(myYellow);
        p2WinPoint.setBackground(darkGreen);
        p2WinPoint.setForeground(myYellow);

        p1Points.setBackground(Color.black);
        p1Points.setForeground(myYellow);
        p1Points.setFont(numbers);
        p1Points.setEditable(false);
        p1Points.setBorder(border);

        p2Points.setBackground(Color.black);
        p2Points.setForeground(myYellow);
        p2Points.setFont(numbers);
        p2Points.setEditable(false);
        p2Points.setBorder(border);

        p1Games.setFont(numbers);
        p1Games.setEditable(false);
        p1Games.setBorder(border);
        p1Games.setBackground(Color.black);
        p1Games.setForeground(myYellow);

        p2Games.setFont(numbers);
        p2Games.setEditable(false);
        p2Games.setBorder(border);
        p2Games.setBackground(Color.black);
        p2Games.setForeground(myYellow);

        p1Sets.setFont(numbers);
        p1Sets.setEditable(false);
        p1Sets.setBorder(border);
        p1Sets.setBackground(Color.black);
        p1Sets.setForeground(myYellow);

        p2Sets.setFont(numbers);
        p2Sets.setEditable(false);
        p2Sets.setBorder(border);
        p2Sets.setBackground(Color.black);
        p2Sets.setForeground(myYellow);

        p1FirstSet.setFont(numbers);
        p1FirstSet.setEditable(false);
        p1FirstSet.setBorder(border);
        p1FirstSet.setBackground(Color.black);
        p1FirstSet.setForeground(myYellow);

        p2FirstSet.setFont(numbers);
        p2FirstSet.setEditable(false);
        p2FirstSet.setBorder(border);
        p2FirstSet.setBackground(Color.black);
        p2FirstSet.setForeground(myYellow);

        p1SecondSet.setFont(numbers);
        p1SecondSet.setEditable(false);
        p1SecondSet.setBorder(border);
        p1SecondSet.setBackground(Color.black);
        p1SecondSet.setForeground(myYellow);

        p2SecondSet.setFont(numbers);
        p2SecondSet.setEditable(false);
        p2SecondSet.setBorder(border);
        p2SecondSet.setBackground(Color.black);
        p2SecondSet.setForeground(myYellow);

        p1ThirdSet.setFont(numbers);
        p1ThirdSet.setEditable(false);
        p1ThirdSet.setBorder(border);
        p1ThirdSet.setBackground(Color.black);
        p1ThirdSet.setForeground(myYellow);

        p2ThirdSet.setFont(numbers);
        p2ThirdSet.setEditable(false);
        p2ThirdSet.setBorder(border);
        p2ThirdSet.setBackground(Color.black);
        p2ThirdSet.setForeground(myYellow);

        p1FourthSet.setFont(numbers);
        p1FourthSet.setEditable(false);
        p1FourthSet.setBorder(border);
        p1FourthSet.setBackground(Color.black);
        p1FourthSet.setForeground(myYellow);

        p2FourthSet.setFont(numbers);
        p2FourthSet.setEditable(false);
        p2FourthSet.setBorder(border);
        p2FourthSet.setBackground(Color.black);
        p2FourthSet.setForeground(myYellow);

        names.setPreferredSize(new Dimension(220,80));
        names.setFont(namesFont);
        names.setBackground(Color.black);
        names.setForeground(myYellow);
        names.setEditable(false);

        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT,0,0));
        JPanel buttons = new JPanel(new BorderLayout());
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel topGap = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
        JPanel scoring = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));

        JPanel section1 = new JPanel(new GridLayout(2,5));
        JPanel section2 = new JPanel(new FlowLayout(FlowLayout.LEFT,0,0));
        JPanel section3 = new JPanel(new GridLayout(2,3));


        section1.add(p1FirstSet);
        section1.add(p1SecondSet);
        section1.add(p1ThirdSet);
        section1.add(p1FourthSet);
        section1.add(p2FirstSet);
        section1.add(p2SecondSet);
        section1.add(p2ThirdSet);
        section1.add(p2FourthSet);

        section2.add(names);

        section3.add(p1Sets);
        section3.add(p1Games);
        section3.add(p1Points);
        section3.add(p2Sets);
        section3.add(p2Games);
        section3.add(p2Points);

        scoring.setBackground(darkGreen);
        section3.setBackground(darkGreen);

        scoring.add(section1);
        scoring.add(section2);
        scoring.add(section3);

        topGap.add(prevSets);
        topGap.add(sets);
        topGap.add(games);
        topGap.add(points);


        mainPanel.add(topGap, BorderLayout.NORTH);
        mainPanel.add(scoring, BorderLayout.CENTER);

        p1WinPoint.setPreferredSize(new Dimension(200,80));
        p2WinPoint.setPreferredSize(new Dimension(200,80));


        topGap.setPreferredSize(new Dimension(500, 10));
        topGap.setBackground(darkGreen);

        buttons.add(p1WinPoint, BorderLayout.NORTH);
        buttons.add(p2WinPoint, BorderLayout.SOUTH);


        p1FirstSet.setMaximumSize(new Dimension(5,5));

        panel.setBackground(darkGreen);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(805, 190);

        panel.add(mainPanel);
        panel.add(buttons);

        this.add(panel);
        this.setTitle("Tennis");
        setResizable(false);

    }

    /**
     * set points text to ad if it is that players advantage
     */
    public void setP1Van() {
        p1Points.setText("Ad");
    }

    public void setP2Van() {
        p2Points.setText("Ad");
    }

    public void setP1FirstSet(int set) {
        p1FirstSet.setText(Integer.toString(set));
    }

    public void setP2FirstSet(int set) {
        p2FirstSet.setText(Integer.toString(set));
    }

    public void setP1SecondSet(int set) {
        p1SecondSet.setText(Integer.toString(set));
    }

    public void setP2SecondSet(int set) {
        p2SecondSet.setText(Integer.toString(set));
    }

    public void setP1ThirdSet(int set) {
        p1ThirdSet.setText(Integer.toString(set));
    }

    public void setP2ThirdSet(int set) {
        p2ThirdSet.setText(Integer.toString(set));
    }

    public void setP1FourthSet(int set) {
        p1FourthSet.setText(Integer.toString(set));
    }

    public void setP2FourthSet(int set) {
        p2FourthSet.setText(Integer.toString(set));
    }

    public void setP1Sets(int sets) {
        p1Sets.setText(Integer.toString(sets));
    }

    public void setP2Sets(int sets) {p2Sets.setText(Integer.toString(sets));}

    public void setP1Games(int game) {
        p1Games.setText(Integer.toString(game));
    }

    public void setP2Games(int game) {
        p2Games.setText(Integer.toString(game));
    }

    public void setP1Points(int points) {
        p1Points.setText(Integer.toString(points));
    }

    public void setP2Points(int points) {p2Points.setText(Integer.toString(points));}

    void addButtonListener(ActionListener listenForButton) {
        p1WinPoint.addActionListener(listenForButton);
        p2WinPoint.addActionListener(listenForButton);
    }


    /**
     * needed so that controller can access button compare to button clicked
     * @return player 1s button
     */
    public JButton getP1WinPoint() {
        return p1WinPoint;
    }

    /**
     * call this function when match has been won so buttons are no longer clickable
     */
    public void disableButtons() {
        p1WinPoint.setEnabled(false);
        p2WinPoint.setEnabled(false);
    }

    public void setNamesText(String p1, String p2) {
        names.setText(p1 + "\nVS.\n" + p2);
    }

    /**
     * when match has been won update the text box to show the winning player
     * @param player the player that won
     */
    public void setWinningText(String player) {
        names.setText(player +" WINS!!!");
    }

}
