package Pieces;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;

public abstract class Piece
{
    private BufferedImage image;
    private File imageFile;
    private String file, rank;
    private String position;

    public Piece()
    {

    }

    public Piece(String file, String rank)
    {
        this.rank = rank;
        this.file = file;
        this.position = file + rank;
    }

    //region Getters
    public Image getImage()
    {
        return image;
    }

    public File getImageFile()
    {
        return imageFile;
    }

    public String getFile()
    {
        return file;
    }

    public String getRank()
    {
        return rank;
    }

    public String getPosition()
    {
        return position;
    }
    //endregion
    //region Setters
    public void setImage(BufferedImage image)
    {
        this.image = image;
    }

    public void setImageFile(File imageFile)
    {
        this.imageFile = imageFile;
    }

    public void setFile(String file)
    {
        this.file = file;
    }

    public void setRank(String rank)
    {
        this.rank = rank;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }
    //endregion

}
