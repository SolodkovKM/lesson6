package work1;

public class Square {
    private Rectangle rectangle;

    public Square(int side) {
        this.rectangle = new Rectangle(side, side);
    }

    public void setSide(int side) {
        rectangle.setHeight(side);
        rectangle.setWidth(side);
    }

    public int getSide() {
        return rectangle.getHeight();
    }
}