public class Circle {
    private double radius = 1.0;
    private String color = "red";
    public Circle() {
    }
    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void display() {
        System.out.println(getRadius() + " " + getColor());
    }
}
