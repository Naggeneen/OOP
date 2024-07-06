public class AdvancedRectangle {
    Point pointTopLeft;
    Point pointBottomRight;
    Point pointUpTopLeft;

    public AdvancedRectangle(Point pointTopLeft, Point pointBottomRight){
        this.pointTopLeft = pointTopLeft;
        this.pointBottomRight = pointBottomRight;
    }
    public AdvancedRectangle(int xTopLeftCoordinate, int yTopLeftCoordinate, int xBottomRightCoordinate, int yBottomRightCoordinate){
        pointTopLeft = new Point(xTopLeftCoordinate, yTopLeftCoordinate);
        pointBottomRight = new Point(xBottomRightCoordinate, yBottomRightCoordinate);
    }
    public AdvancedRectangle(Point pointTopLeft, Point pointBottomRight, Point pointUpTopLeft){
        this(pointTopLeft, pointBottomRight);
        this.pointUpTopLeft = pointUpTopLeft;
    }

    public Point getPointTopLeft(){
        return getPointTopLeft();
    }
    public Point getPointBottomRight(){
        return getPointBottomRight();
    }

    public void setPointTopLeft(Point pointTopLeft){
        this.pointTopLeft = pointTopLeft;
    }
    public void setPointBottomRight(Point pointBottomRight){
        this.pointBottomRight = pointBottomRight;
    }
    public String toString(){
        return "AdvancedRectangle{" +
                "Top Left Point=" + pointTopLeft +
                ", Bottom Right Point" + pointBottomRight +"}";
    }

    public int getLength(){
        return pointBottomRight.xCoordinate - pointTopLeft.xCoordinate;
    }
    public int getWidth(){
        return pointTopLeft.yCoordinate - pointBottomRight.yCoordinate;
    }
    public int getArea(){
        return (pointBottomRight.xCoordinate-pointTopLeft.xCoordinate)*(pointTopLeft.yCoordinate-pointBottomRight.yCoordinate);
    }

    public int getPerimeter(){
        return 2*((pointBottomRight.xCoordinate-pointTopLeft.xCoordinate)+(pointTopLeft.yCoordinate-pointBottomRight.yCoordinate));
    }

    public int getVolume(){
        return Math.abs(getArea()*
                (pointUpTopLeft.zCoordinate-pointTopLeft.zCoordinate));
    }

    public double getDistanceTo(AdvancedRectangle anotherRectangle){
        int xCenterCoordinateFirst = (this.pointBottomRight.xCoordinate + this.pointTopLeft.xCoordinate)/2;
        int yCenterCoordinateFirst = (this.pointBottomRight.yCoordinate + this.pointTopLeft.yCoordinate)/2;
        int xCenterCoordinateSecond =(anotherRectangle.pointBottomRight.xCoordinate + anotherRectangle.pointTopLeft.xCoordinate)/2;
        int yCenterCoordinateSecond =(anotherRectangle.pointBottomRight.yCoordinate + anotherRectangle.pointTopLeft.yCoordinate)/2;

        Point centerFirst = new Point(xCenterCoordinateFirst, yCenterCoordinateFirst);
        Point centerSecond = new Point(xCenterCoordinateSecond, yCenterCoordinateSecond);
        return centerFirst.getDistance(centerSecond);
    }

}
