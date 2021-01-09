package GameBoard;


import javax.swing.*;
import java.awt.*;

public class Board extends JPanel
{
    private final int rows = 8, cols = 8;
    private Square[][] squares;

    public Board()
    {
        setName("GameBoard");
        this.setSize(640, 640);
        setLayout(new GridLayout(8,8));
        squares = new Square[rows][cols];
        constructBoard();
        setNewGame();
    }

    @Override
    public void paintComponent(Graphics g)
    {

    }

    public void constructBoard()
    {
        String fileID = "", rankID = "";
        Square temp;

        for(int i = 0; i < rows; i++)
        {
            //region set file/row
            rankID = "" + (i+1);
            for(int j = 0; j < cols; j++)
            {
                switch (j)
                {
                    case 0:
                        fileID = "a";
                        break;

                    case 1:
                        fileID = "b";
                        break;

                    case 2:
                        fileID = "c";
                        break;

                    case 3:
                        fileID = "d";
                        break;

                    case 4:
                        fileID = "e";
                        break;

                    case 5:
                        fileID = "f";
                        break;

                    case 6:
                        fileID = "g";
                        break;

                    case 7:
                        fileID = "h";
                        break;

                    default:
                        System.out.println("Error, file was not set.");
                        break;
                }
                //endregion

                //If Row is Even
                if (Double.parseDouble(rankID) % 2.0 == 0.0)
                {
                    //If column is Even (Dark)
                    if((j+1) % 2 == 0)
                    {
                        temp = new DarkSquare(fileID, rankID);
                        squares[i][j] = temp;
                    }
                    //Column is Odd (Light)
                    else
                    {
                        temp = new LightSquare(fileID, rankID);
                        squares[i][j] = temp;
                    }
                }

                //Else Row is Odd
                else
                {
                    //If column is Even (Light)
                    if((j+1) % 2.0 == 0.0)
                    {
                        temp = new LightSquare(fileID, rankID);
                        squares[i][j] = temp;
                    }
                    //Column is Odd (Dark)
                    else
                    {
                        temp = new DarkSquare(fileID, rankID);
                        squares[i][j] = temp;

                    }
                }
                System.out.print(temp.getFileID() + temp.getRankID() + ",");
            }
            System.out.println();
        }

        for (int i = rows-1; i >= 0; i--)
        {
            for (int j = 0; j < cols; j++)
            {
                this.add(squares[i][j].getFileID() + squares[i][j].getRankID(), squares[i][j]);
            }
        }
    }

    public void setNewGame()
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < cols; j++)
            {
                if (squares[i][j] instanceof DarkSquare)
                {
                    squares[i][j].setPiece("light", "");
                }
            }
        }

        for (int i = 7; i > 4; i--)
        {
            for (int j = 0; j < cols; j++)
            {
                if (squares[i][j] instanceof DarkSquare)
                {
                    squares[i][j].setPiece("dark", "");

                    //System.out.println("Dark Piece: " + squares[i][j].isOccupied + " on " + squares[i][j].fileID + squares[i][j].rankID);
                }
            }
        }
    }

}
