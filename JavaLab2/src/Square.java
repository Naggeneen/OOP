public class Square extends Rectangle{
    public double getSideLength(){
        return super.getLength();
    }

    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength){
        super(xTopLeftCoordinate, yTopLeftCoordinate,
                xTopLeftCoordinate+sideLength, yTopLeftCoordinate-sideLength);
    }
    public Square(int xTopLeftCoordinate, int yTopLeftCoordinate, int sideLength, String color, boolean filled){
        super(xTopLeftCoordinate, yTopLeftCoordinate,
                xTopLeftCoordinate+sideLength, yTopLeftCoordinate-sideLength,
                color, filled);
    }
    public Square(){
        super();
    }

    public String toString(){
        return "A square with side=" + getLength() + ", which is a subclass of " + super.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Square square = (Square) obj;
        return color.equals(square.getColor()) && filled == square.isFilled() &&
                xTopLeftCoordinate == square.xTopLeftCoordinate &&
                yTopLeftCoordinate == square.yTopLeftCoordinate &&
                xBottomRightCoordinate == square.xBottomRightCoordinate &&
                yBottomRightCoordinate == square.yBottomRightCoordinate;
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
