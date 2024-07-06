public class Rectangle extends MyShape {
    int xTopLeftCoordinate;
    int yTopLeftCoordinate;
    int xBottomRightCoordinate;
    int yBottomRightCoordinate;

    public Rectangle(){
        this.xTopLeftCoordinate = 0;
        this.yTopLeftCoordinate = 0;
        this.xBottomRightCoordinate = 1;
        this.yBottomRightCoordinate = -1;
    }
    public Rectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate){
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }
    public Rectangle(
            int xTopLeftCoordinate, int yTopLeftCoordinate,
            int xBottomRightCoordinate, int yBottomRightCoordinate,
            String color, boolean filled
    ){
        this.xTopLeftCoordinate = xTopLeftCoordinate;
        this.yTopLeftCoordinate = yTopLeftCoordinate;
        this.xBottomRightCoordinate = xBottomRightCoordinate;
        this.yBottomRightCoordinate = yBottomRightCoordinate;
        this.color = color;
        this.filled = filled;
    }

    public int getXTopLeftCoordinate(){
        return xTopLeftCoordinate;
    }
    public int getYTopLeftCoordinate(){
        return yTopLeftCoordinate;
    }
    public int getXBottomRightCoordinate(){
        return xBottomRightCoordinate;
    }
    public int getYBottomRightCoordinate(){
        return yBottomRightCoordinate;
    }
    public void setXTopLeftCoordinate(int xTopLeftCoordinate){
        this.xTopLeftCoordinate = xTopLeftCoordinate;
    }
    public void setYTopLeftCoordinate(int yTopLeftCoordinate){
        this.yTopLeftCoordinate = yTopLeftCoordinate;
    }
    public void setXBottomRightCoordinate(int xBottomRightCoordinate){
        this.xBottomRightCoordinate = xBottomRightCoordinate;
    }
    public void setYBottomRightCoordinate(int yBottomRightCoordinate){
        this.yBottomRightCoordinate = yBottomRightCoordinate;
    }
    public String toString(){
        return "Rectangle{"+"xTopLeftCoordinate="+xTopLeftCoordinate+
                ", yTopLeftCoordinate="+yTopLeftCoordinate+
                ", xBottomRightCoordinate="+xBottomRightCoordinate+
                ", yBottomRightCoordinate="+yBottomRightCoordinate+"} which is subclass of " + super.toString();
    }

    public int getLength(){
        return xBottomRightCoordinate - xTopLeftCoordinate;
    }
    public int getWidth(){
        return yTopLeftCoordinate - yBottomRightCoordinate;
    }
    public int getArea(){
        return (xBottomRightCoordinate-xTopLeftCoordinate)*(yTopLeftCoordinate-yBottomRightCoordinate);
    }

    public int getPerimeter(){
        return 2*((xBottomRightCoordinate-xTopLeftCoordinate)+(yTopLeftCoordinate-yBottomRightCoordinate));
    }

    public double getDistanceToTheCenterOf(Rectangle anotherRectangle){
        double xCenterA = (double)(xBottomRightCoordinate+xTopLeftCoordinate)/2;
        double yCenterA = (double)(yTopLeftCoordinate + yBottomRightCoordinate)/2;
        double xCenterB = (double)(anotherRectangle.xBottomRightCoordinate+anotherRectangle.xTopLeftCoordinate)/2;
        double yCenterB = (double)(anotherRectangle.yTopLeftCoordinate+anotherRectangle.yBottomRightCoordinate)/2;
        System.out.println("Середина первого прямоугольника: x=" + xCenterA +", y=" + yCenterA);
        System.out.println("Середина второго прямоугольника: x=" + xCenterB +", y=" + yCenterB);
        return Math.sqrt(Math.pow(xCenterB-xCenterA, 2) + Math.pow(yCenterB-yCenterA, 2));
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return color.equals(rectangle.getColor()) && filled == rectangle.isFilled() &&
                xTopLeftCoordinate == rectangle.xTopLeftCoordinate &&
                yTopLeftCoordinate == rectangle.yTopLeftCoordinate &&
                xBottomRightCoordinate == rectangle.xBottomRightCoordinate &&
                yBottomRightCoordinate == rectangle.yBottomRightCoordinate;
    }
    @Override
    public int hashCode(){
        int result = 17;
        if(xTopLeftCoordinate!=0){
            result = 31 * result * xTopLeftCoordinate;
        }
        if(yTopLeftCoordinate != 0){
            result = 31 * result * yTopLeftCoordinate;
        }
        if(xBottomRightCoordinate != 0){
            result = 31 * result * xBottomRightCoordinate;
        }
        if(yBottomRightCoordinate != 0){
            result = 31 * result * yBottomRightCoordinate;
        }
        return result;
    }
}
