package Mov;

public class MovableCircle implements Movable
{
    private int radius;
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString()
    {
        return "Координаты: (" + x + " " + y + "); радиус = " + radius + "; Сдвиг " + xSpeed + " " + ySpeed;
    }

    public void moveUp()
    {
        this.y += this.ySpeed;
    }

    public void moveDown()
    {
        this.y -= this.ySpeed;
    }

    public void moveLeft()
    {
        this.x -= this.xSpeed;
    }

    public void moveRight()
    {
        this.x += this.xSpeed;
    }
}
