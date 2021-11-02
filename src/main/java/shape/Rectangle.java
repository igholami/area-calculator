package shape;

public class Rectangle implements AreaCumputable {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.setWidth(width);
        this.setHeight(height);
    }

    public double computeArea() {
        return width * height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width <= 0)
            throw new IllegalArgumentException("Width must be positive.");
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height <= 0)
            throw new IllegalArgumentException("Height must be positive.");
        this.height = height;
    }
}
