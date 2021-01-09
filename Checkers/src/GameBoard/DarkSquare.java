package GameBoard;

import java.awt.*;

public class DarkSquare extends Square
{
    private Color squareColor = Color.RED;

    public DarkSquare()
    {
        super();
        setBackground(squareColor);
    }

    public DarkSquare(String pFileID, String pRowID)
    {
        super(pFileID, pRowID);
        setBackground(squareColor);
    }

    public DarkSquare(boolean hasPiece, String colour, String pFileID, String pRowID)
    {
        super(hasPiece, colour, pFileID, pRowID);
        setBackground(squareColor);
    }

    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        g.setColor(Color.WHITE);
        g.drawString(this.getFileID() + this.getRankID(), 0, 10);
    }
}
