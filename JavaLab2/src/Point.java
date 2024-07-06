public class Point {
    int xCoordinate;
    int yCoordinate;
    int zCoordinate;

    public Point(int xCoordinate, int yCoordinate){
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }
    public Point(int xCoordinate, int yCoordinate, int zCoordinate){
        this(xCoordinate, yCoordinate);
        this.zCoordinate = zCoordinate;
    }

    public int getXCoordinate(){
        return xCoordinate;
    }
    public int getYCoordinate(){
        return yCoordinate;
    }
    public void setXCoordinate(int xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(int yCoordinate){
        this.yCoordinate = yCoordinate;
    }


    public double getDistance(Point point){
        return Math.sqrt(Math.pow(point.xCoordinate-this.xCoordinate, 2)+Math.pow(point.yCoordinate-this.yCoordinate, 2));
    }

}
