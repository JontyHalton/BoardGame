import GameBoard.Board;

import javax.swing.*;
import javax.swing.text.Position;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Checkers
{
    public static void main(String[] args)
    {

        GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();


        //Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenuItem menuNew = new JMenuItem("New Game");
        JMenuItem menuOpt = new JMenuItem("Options");
        JMenuItem menuExit = new JMenuItem("Exit");
        menu.add(menuNew);
        menu.add(menuOpt);
        menu.add(menuExit);
        menu.add(menuExit);
        menuBar.add(menu);


        JFrame mainFrame = new JFrame("Checkers");
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


        Board board = new Board();
        mainFrame.setContentPane(board);
        mainFrame.setJMenuBar(menuBar);
        mainFrame.setSize(656, 702);
        mainFrame.setLocationRelativeTo(null);

        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
}
