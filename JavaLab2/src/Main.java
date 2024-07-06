import java.util.Scanner;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
//        System.out.println("Введите координаты центра первого круга и радиус: ");
//        Scanner scan = new Scanner(System.in);
//        int xCoordinate = scan.nextInt();
//        int yCoordinate = scan.nextInt();
//        int radius = scan.nextInt();
//        Circle myCircle = new Circle(xCoordinate, yCoordinate, radius);
//        System.out.println(myCircle);
//        System.out.println("Площадь: " + myCircle.getArea());
//        System.out.println("Длина окружности " + myCircle.getCircumference());
//
//        System.out.println("Введите координаты центра второго круга и радиус: ");
//        Scanner scan2 = new Scanner(System.in);
//        int x2Coordinate = scan2.nextInt();
//        int y2Coordinate = scan2.nextInt();
//        int radius2 = scan2.nextInt();
//        Circle anotherCircle = new Circle(x2Coordinate, y2Coordinate, radius2);
//        System.out.println("Дистанция: " + myCircle.getDistanceTo(anotherCircle));
//
//        System.out.println("Введите координаты левей верхней и правой нижней точек в первом прямоугольнике: ");
//        Scanner scan3 = new Scanner(System.in);
//        int point1xA = scan3.nextInt();
//        int point1yA = scan3.nextInt();
//        int point2xA = scan3.nextInt();
//        int point2yA = scan3.nextInt();
//        Rectangle firstRect = new Rectangle(point1xA, point1yA, point2xA, point2yA);
//        System.out.println("Площадь первого прямоугольника=" + firstRect.getArea());
//        System.out.println("Периметр первого прямоугольника=" + firstRect.getPerimeter());
//
//        System.out.println("Введите координаты левей верхней и правой нижней точек во втором прямоугольнике: ");
//        Scanner scan4 = new Scanner(System.in);
//        int point1xB = scan4.nextInt();
//        int point1yB = scan4.nextInt();
//        int point2xB = scan4.nextInt();
//        int point2yB = scan4.nextInt();
//        Rectangle secondRect = new Rectangle(point1xB, point1yB, point2xB, point2yB);
//        System.out.println("Расстояние от середины первого прямоугольника до середины второго=" + firstRect.getDistanceToTheCenterOf(secondRect));
//
//        //Lab3
//        System.out.println("Введите значения для квадрата(x,y, length): ");
//        Scanner scan5 = new Scanner(System.in);
//        int xTopLeftCoordinateSquare = scan5.nextInt();
//        int yTopLeftCoordinateSquare = scan5.nextInt();
//        int SideLength = scan5.nextInt();
//        Square square = new Square(xTopLeftCoordinateSquare, yTopLeftCoordinateSquare, SideLength);
//        System.out.println("Площадь квадрата=" + square.getArea());
//        System.out.println("Периметр квадрата=" + square.getPerimeter());
//        System.out.println("Цвет квадрата=" + square.getColor());
//        System.out.println("Закрашен ли квадрат:" + square.isFilled());
//
//        System.out.println("Введите новый цвет для квадрата: ");
//        Scanner scan6 = new Scanner(System.in);
//        String newColor = scan6.nextLine();
//        square.color = newColor;
//        System.out.println("Цвет квадрата=" + square.getColor());

        //Lab2Advanced
//        System.out.println("Введите координаты центра продвинутого круга и радиус и центр второго продвинутого круга с радиусом: ");
//        Scanner scan7 = new Scanner(System.in);
//        int xAdvanced1 = scan7.nextInt();
//        int yAdvanced1 = scan7.nextInt();
//        int radiusAdvanced1 = scan7.nextInt();
//        int xAdvanced2 = scan7.nextInt();
//        int yAdvanced2 = scan7.nextInt();
//        int radiusAdvanced2 = scan7.nextInt();
//
//        AdvancedCircle advcircle1 = new AdvancedCircle(xAdvanced1, yAdvanced1, radiusAdvanced1);
//        System.out.println(advcircle1.getArea());
//        System.out.println(advcircle1.getCircumference());
//        AdvancedCircle advcircle2 = new AdvancedCircle(xAdvanced2, yAdvanced2, radiusAdvanced2);
//        System.out.println(advcircle1.getDistanceTo(advcircle2));
//
//        System.out.println("Введите координаты левой верхней и правой нижней координат продвинутого прямоугольника: ");
//        Scanner scan8 = new Scanner(System.in);
//        int xAdvRectTopLeft1 = scan8.nextInt();
//        int yAdvRectTopLeft1 = scan8.nextInt();
//        int xAdvRectBottomRight1 = scan8.nextInt();
//        int yAdvRectBottomRight1 = scan8.nextInt();
//
//        AdvancedRectangle advRect1 = new AdvancedRectangle(xAdvRectTopLeft1, yAdvRectTopLeft1, xAdvRectBottomRight1, yAdvRectBottomRight1);
//        System.out.println(advRect1.getArea());
//        System.out.println(advRect1.getPerimeter());
//
//        System.out.println("Введите координаты второго продвинутого прямоугольника: ");
//        Scanner scan9 = new Scanner(System.in);
//        int xAdvRectTopLeft2 = scan9.nextInt();
//        int yAdvRectTopLeft2 = scan9.nextInt();
//        int xAdvRectBottomRight2 = scan9.nextInt();
//        int yAdvRectBottomRight2 = scan9.nextInt();
//
//        AdvancedRectangle advRect2 = new AdvancedRectangle(xAdvRectTopLeft2, yAdvRectTopLeft2, xAdvRectBottomRight2, yAdvRectBottomRight2);
//        System.out.println(advRect1.getDistanceTo(advRect2));

//        System.out.println("Введите 3 точки координат параллелипипеда: ");
//        Scanner scan10 = new Scanner(System.in);
//        int xAdvTopLeft = scan10.nextInt();
//        int yAdvTopLeft = scan10.nextInt();
//        int zAdvTopLeft = scan10.nextInt();
//
//        int xAdvBottomRight = scan10.nextInt();
//        int yAdvBottomRight = scan10.nextInt();
//        int zAdvBottomRight = scan10.nextInt();
//
//        int xAdvUpTopLeft = scan10.nextInt();
//        int yAdvUpTopLeft = scan10.nextInt();
//        int zAdvUpTopLeft = scan10.nextInt();
//
//        Point pointTopLeft = new Point(xAdvTopLeft, yAdvTopLeft, zAdvTopLeft);
//        Point pointBottomRight = new Point (xAdvBottomRight, yAdvBottomRight, zAdvBottomRight);
//        Point pointUpTopLeft = new Point(xAdvUpTopLeft, yAdvUpTopLeft, zAdvUpTopLeft);
//
//        AdvancedRectangle adv3dRect = new AdvancedRectangle(pointTopLeft, pointBottomRight, pointUpTopLeft);
//        System.out.println(adv3dRect.getVolume());
        HashMap<MyShape, String> myHashMap = new HashMap<>();
        Circle myCircle = new Circle(0, 0, 1);
        Rectangle myRectangle = new Rectangle(0, 1, 3, 0);
        Square mySquare = new Square(0, 1, 1);

        myHashMap.put(myCircle, "CIRCLES");
        myHashMap.put(myRectangle, "RECTANGLES");
        myHashMap.put(mySquare, "SQUARES");

        System.out.println("INITIAL - " + myHashMap.size() + " " +  myHashMap.get(myCircle));

        Circle circleWithTheSameAttributes = new Circle(0, 0, 1);
        myHashMap.put(circleWithTheSameAttributes, "SAME CIRCLES");

        System.out.println("ADDED CIRCLE WITH THE SAME ATTRIBUTES - " + myHashMap.size() + " " +  myHashMap.get(myCircle));
    }
}