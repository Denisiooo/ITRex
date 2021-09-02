package ITRexx2;

public class PrinceOfPersia<E> {
    private int xCoord;
    private int yCoord;
    private char val;
    private boolean H;
    private boolean M;
    private boolean N;

    public PrinceOfPersia()
    {
        xCoord =0;
        yCoord =0;
        val =' ';
        H = true;
        M = true;
        N = true;
//        W = true;

    }

    public PrinceOfPersia (int X, int Y)
    {
        xCoord = X;
        yCoord = Y;

    }

    public void setX(int x)
    {
        xCoord = x;
    }
    public void setY(int y)
    {
        yCoord = y;
    }

    public void setNorth(boolean h)
    {
        H = h;
    }
    public void setSouth(boolean m)
    {
        M= m;
    }
    public void setEast(boolean n)
    {
        N = n;
    }

    public int getX()
    {
        return xCoord;

    }

    public int getY()
    {
        return yCoord;
    }
    public char getVal()
    {
        return val;
    }

    public boolean getNorth()
    {
        return H;
    }
    public boolean getSouth()
    {
        return M;
    }

    public boolean getEast()
    {
        return N;
    }

    public String toString1()
    {
        String result = "(" + xCoord + ", " +yCoord + ")";
        return result;
    }
}
