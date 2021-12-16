package vn.edu.hcmus.student.sv19127640.slangword;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

/**
 * vn.edu.hcmus.student.sv19127640.slangword
 * Created by ADMIN
 * Date 12/15/2021 - 8:58 PM
 * Description: ...
 */
public class Buttons extends JPanel {
    // attribute
    private JButton myInfoButton;
    private JButton addButton;
    private JButton searchButton;
    private JButton quizButton;
    private JButton resetButton;
    private JButton historyButton;
    private JButton randomWordButton;
    private JButton exitBtn;
    /**
     * default constructor
     */
    Buttons(){
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,5,5,5);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        myInfoButton = new JButton("My Information");
        buttonPanel.add(myInfoButton, gbc);


        gbc.gridy = 1;
        searchButton = new JButton("Search slang word");
        buttonPanel.add(searchButton, gbc);

        gbc.gridy = 2;
        addButton = new JButton("Add new slang word");
        buttonPanel.add(addButton, gbc);

        gbc.gridy = 3;
        historyButton = new JButton("History");
        buttonPanel.add(historyButton, gbc);

        gbc.gridy = 4;
        randomWordButton = new JButton("On this day slang word");
        buttonPanel.add(randomWordButton, gbc);

        gbc.gridy = 5;
        quizButton = new JButton("Quiz");
        buttonPanel.add(quizButton, gbc);

        gbc.gridy = 6;
        resetButton = new JButton("Reset to default");
        buttonPanel.add(resetButton, gbc);

        gbc.gridy = 7;
        exitBtn = new JButton("Exit");
        buttonPanel.add(exitBtn, gbc);


        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        setBorder(new EmptyBorder(30, 10, 10, 10));
        add(buttonPanel);
    }

    public JButton getAddButton() {
        return addButton;
    }

    public JButton getSearchButton() {
        return searchButton;
    }

    public JButton getQuizButton() {
        return quizButton;
    }

    public JButton getResetButton() {
        return resetButton;
    }

    public JButton getHistoryButton() {
        return historyButton;
    }

    public JButton getRandomWordButton() {
        return randomWordButton;
    }

    public JButton getExitBtn() {
        return exitBtn;
    }
}
