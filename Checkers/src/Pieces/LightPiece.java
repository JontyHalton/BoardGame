package Pieces;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class LightPiece extends Piece
{

    public LightPiece()
    {
        super();

        try
        {
            this.setImageFile(new File("src/Pieces/Assets/whiteCheckersPiece.png"));
            this.setImage(ImageIO.read(this.getImageFile()));
        }
        catch (IOException ioError)
        {
            System.out.println("Could not find white piece image file.");
        }
    }

    public LightPiece(String fileID, String rankID)
    {
        super(fileID, rankID);

        try
        {
            this.setImageFile(new File("src/Pieces/Assets/whiteCheckersPiece.png"));
            this.setImage(ImageIO.read(this.getImageFile()));
        }
        catch (IOException ioError)
        {
            System.out.println("Could not find white piece image file.");
        }
    }
}
