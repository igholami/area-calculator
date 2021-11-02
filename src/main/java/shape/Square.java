package shape;

public class Square implements AreaCumputable {
    private int size;

    public Square(int size) {
        this.size = size;
    }

    @Override
    public double computeArea() {
        return size * size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size <= 0)
            throw new IllegalArgumentException("Size must be positive.");
        this.size = size;
    }
}
