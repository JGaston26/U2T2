public class Point {
    private int x;
    private int y;


    Point(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    Point()
    {
        x = 0;
        y = 0;

    }
    Point(int coordinate)
    {
        x = coordinate;
        y = coordinate;
    }
    public void setX (int newX)
    {
        x = newX;
    }
     public void setY (int newY)
    {
        y = newY;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    public String coordinate()
    {
        return "(" + x +"," + y + ")";
    }

    public String quadrant()
    {
        if(x > 0 && y > 0)
        {
            return "Quadrant: I";
        } else if (x < 0 && y > 0)
        {
            return "Quadrant: II";
        } else if (x < 0 && y < 0)
        {
            return "Quadrant: III";
        } else if (x > 0 && y < 0)
        {
            return "Quadrant: IV";
        } else if (x == 0 && y != 0) {
            return "On the X axis";

        } else if (y == 0 && x!= 0) {
            return "On the Y axis";
        }else{
            return "At the origin";
        }
    }

}
