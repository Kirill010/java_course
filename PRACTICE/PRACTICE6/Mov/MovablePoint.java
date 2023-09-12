package Mov;

public class MovablePoint implements Movable
{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString()
    {
        return "Координаты: (" + x + " " + y + "); Сдвиг " + xSpeed + " " + ySpeed;
    }
    public void moveUp()
    {
        this.y += this.ySpeed;
        System.out.println("Вверх " + this.ySpeed);
    }

    public void moveDown()
    {
        this.y -= this.ySpeed;
        System.out.println("Вниз " + this.ySpeed);
    }

    public void moveLeft()
    {
        this.x -= this.xSpeed;
        System.out.println("Налево " + this.xSpeed);
    }

    public void moveRight()
    {
        this.x += this.xSpeed;
        System.out.println("Напрво " + this.xSpeed);
    }
}