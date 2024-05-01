public class Snail {
    private String color;
    private int position;

    public Snail(String color) {
        this.color = color;
        this.position = 0;
    }

    public void advance(boolean boost) {
        int distance = (int) (Math.random() * 4);
        if (boost) {
            distance *= 2;
        }
        position += distance;
    }

    public int getPosition() {
        return position;
    }

    public String getColor() {
        return color;
    }
}
