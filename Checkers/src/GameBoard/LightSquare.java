package GameBoard;

import java.awt.*;

public class LightSquare extends Square
{

    private Color squareColor = Color.white;

    public LightSquare()
    {
        super();
        setBackground(squareColor);
    }

    public LightSquare(String pFileID, String pRowID)
    {
        super(pFileID, pRowID);
        setBackground(squareColor);

    }

    public LightSquare(boolean hasPiece, String colour, String pFileID, String pRowID)
    {
        super(hasPiece, colour, pFileID, pRowID);
        setBackground(squareColor);

    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.DARK_GRAY);
        g.drawString(this.getFileID() + this.getRankID(), 0, 10);
    }
}
