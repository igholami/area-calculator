package shape;

public class Rectangle implements AriaCalculatable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double area() {
        return 0;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
