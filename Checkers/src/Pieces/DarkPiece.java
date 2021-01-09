package Pieces;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DarkPiece extends Piece
{

    public DarkPiece()
    {
        super();

        try
        {
            this.setImageFile(new File("src/Pieces/Assets/blackCheckersPiece.png"));
            this.setImage(ImageIO.read(this.getImageFile()));
        }
        catch (IOException ioError)
        {
            System.out.println("Could not find black piece image file.");
        }
    }

    public DarkPiece(String fileID, String rankID)
    {
        super(fileID, rankID);

        try
        {
            this.setImageFile(new File("src/Pieces/Assets/blackCheckersPiece.png"));
            this.setImage(ImageIO.read(this.getImageFile()));
        }
        catch (IOException ioError)
        {
            System.out.println("Could not find black piece image file.");
        }
    }

}
