public class Circle extends MyShape{
    int xCoordinate;
    int yCoordinate;
    int radius;

    public Circle(){
        this.xCoordinate = 0;
        this.yCoordinate = 0;
        this.radius = 1;
    }
    public Circle(int xCoordinate, int yCoordinate, int radius){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
    }
    public Circle(int xCoordinate, int yCoordinate, int radius, String color, boolean filled){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public int getXCoordinate(){
        return xCoordinate;
    }

    public int getYCoordinate(){
        return yCoordinate;
    }

    public int getRadius(){
        return radius;
    }

    public void setXCoordinate(int xCoordinate){
    this.xCoordinate = xCoordinate;
    }

    public void setYCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public String toString(){
        return "Circle{" +
                "xCoordinate=" + xCoordinate +
                ", yCoordinate=" + yCoordinate +
                ", radius=" + radius +"} which is subclass of " + super.toString();
    }
    public double getArea(){
        return (double)radius*(double)radius*3.14;
    }
    public double getCircumference(){
        return (double)radius*2*3.14;
    }

    public double getDistanceTo(Circle anotherCircle){
        double distance = Math.pow(anotherCircle.xCoordinate - xCoordinate, 2) + Math.pow(anotherCircle.yCoordinate - yCoordinate, 2);
        return Math.sqrt(distance);
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Circle circle = (Circle) obj;
        return color.equals(circle.getColor()) && filled == circle.isFilled() &&
                radius == circle.radius &&
                xCoordinate == circle.xCoordinate &&
                yCoordinate == circle.yCoordinate;
    }
    @Override
    public int hashCode(){
        int result = 17;
        if(xCoordinate != 0){
            result = 31 * result * xCoordinate;
        }
        if(yCoordinate != 0){
            result = 31 * result * yCoordinate;
        }
        if(radius!= 0){
            result = 31 * result * radius;
        }
        return result;
    }
}
