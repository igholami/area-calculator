package shape;

public class Square implements AriaCalculatable {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double area() {
        return 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
