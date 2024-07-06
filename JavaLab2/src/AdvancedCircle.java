public class AdvancedCircle {
    Point center;
    int radius;

    public AdvancedCircle(Point point, int radius){
        this.radius = radius;
        this.center = point;
    }
    public AdvancedCircle(int xCoordinate, int yCoordinate, int radius){
        center = new Point(xCoordinate, yCoordinate);
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }

    public Point getPoint(){
        return center;
    }

    public void setPoint(){
        this.center = center;
    }

    public String toString(){
        return "AdvancedCircle{" +
                "Center Point=" + center +
                ", radius=" + radius +"}";
    }
    public double getArea(){
        return (double)radius*(double)radius*3.14;
    }
    public double getCircumference(){
        return (double)radius*2*3.14;
    }

    public double getDistanceTo(AdvancedCircle anotherCircle){
        return center.getDistance(anotherCircle.center);
    }
}
