package GameBoard;
import javax.swing.*;
import Pieces.*;
import java.awt.*;

public abstract class Square extends JPanel
{
    private boolean isOccupied = false;
    private String rankID, fileID;
    //int width = 80, height = 80;
    private Piece piece = null;

    public Square()
    {
        isOccupied = false;
        //this.setSize(width, height);
    }

    public Square(String pFileID, String pRowID)
    {
        isOccupied = false;
        //this.setSize(width, height);
        fileID = pFileID;
        rankID = pRowID;
        this.setName(fileID + rankID);
    }

    public Square(boolean hasPiece, String colour, String pFileID, String pRowID)
    {
        //this.setSize(width, height);
        fileID = pFileID;
        rankID = pRowID;
        this.setName(fileID + rankID);
        if (hasPiece)
        {
            isOccupied = true;
            if (colour.equals("light") || colour.equals("Light"))
            {
                this.piece = new LightPiece(this.fileID, this.rankID);
            }
            else if (colour.equals("dark") || colour.equals("Dark"))
            {
                this.piece = new DarkPiece(fileID, rankID);
            }

        }
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        if (this.isOccupied())
        {
            g.drawImage(this.getPiece().getImage(), 0, 0 , this.getWidth(), this.getHeight(), null);
            //System.out.println("draw");
        }
    }


    //region Getters/Setters
    public void setPiece(String colour, String type)
    {
        if (colour.equals("Light") || colour.equals("light"))
        {
            isOccupied = true;
            this.piece = new LightPiece(this.fileID, this.rankID);
        }
        else if (colour.equals("Dark") || colour.equals("dark"))
        {
            isOccupied = true;
            this.piece = new DarkPiece(this.fileID, this.rankID);
        }
        update(getGraphics());
    }

    public boolean isOccupied()
    {
        return isOccupied;
    }

    public void setOccupied(boolean occupied)
    {
        isOccupied = occupied;
    }

    public String getRankID()
    {
        return rankID;
    }

    public void setRankID(String rankID)
    {
        this.rankID = rankID;
    }

    public String getFileID()
    {
        return fileID;
    }

    public void setFileID(String fileID)
    {
        this.fileID = fileID;
    }


    public Piece getPiece()
    {
        return piece;
    }
    //endregion


}
