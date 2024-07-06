import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Task 1
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Task 1. Write integers a and b:");
//        float a = scan.nextFloat();
//        float b = scan.nextFloat();
//        if(a > b){
//            System.out.println(a + " is greater than " + b);
//        } else if(a<b){
//            System.out.println(a + " is less than " + b);
//        } else{
//            System.out.println("Two numbers are equals");
//        }
        //Task 2
//        System.out.println("Task 2. Write six digit number:");
//        Scanner scan2 = new Scanner(System.in);
//        String c = scan2.nextLine();
//        int firsthalfsum = 0;
//        int secondhalfsum = 0;
//        for (int i = 0; i < 6; i++) {
//            if(i < 3){
//            firsthalfsum += c.charAt(i);
//            } else{
//                secondhalfsum +=c.charAt(i);
//            }
//        }
//        if(firsthalfsum == secondhalfsum){
//            System.out.println("Yes");
//        } else{
//            System.out.println("No");
//        }
//
//        //Task 3
//        System.out.println("Task 3. Write distance A and amount of time t1 and t2:");
//        Scanner scan3 = new Scanner(System.in);
//        float A = scan3.nextFloat();
//        float t1 = scan3.nextFloat();
//        float t2 = scan3.nextFloat();
//        float velocity1 = 20/t1;
//        float velocity2 = (A-20)/t2;
//        if(velocity1 > velocity2){
//            System.out.println("Before");
//        } else{
//            System.out.println("After");
//        }
//
//        //Forth task
//        System.out.println("Task 4. Write integers x and y:");
//        Scanner scan4 = new Scanner(System.in);
//        float x = scan4.nextFloat();
//        float y = scan4.nextFloat();
//        if(5*x*x-7*x+2 == y){
//            System.out.println("Yes");
//        } else{
//            System.out.println("No");
//        }
//
//        //Task 5
//        Scanner scan5 = new Scanner(System.in);
//        int sum5 = 0;
//        int number;
//
//        System.out.println("Task 5. Write integers until 0:");
//
//        while (true) {
//            number = scan5.nextInt();
//            if (number == 0) {
//                break;
//            }
//            if (number % 2 != 0) {
//                sum5 += number;
//            }
//        }

//        System.out.println(sum5);

        //Task 6
        Scanner scan6 = new Scanner(System.in);

        System.out.print("Task 6. Write number n:");
        int num6 = scan6.nextInt();

        double sum6 = 0.0;

        for (int i = 1; i <= num6; i++) {
            sum6 += 1.0 / i;
        }

        System.out.println(sum6);

        //Task 7
//        Scanner scan7 = new Scanner(System.in);
//
//        System.out.print("Task 7. Write integer n and m: ");
//        int n = scan7.nextInt();
//        int m = scan7.nextInt();
//
//        for (double i7 = n; i7 <= m; i7 += 0.5) {
//            double y7 = -2.4 * i7 * i7 + 5 * i7 - 3;
//            System.out.println(i7 + " " + y7);
//        }
//
//        //Task8
//        Scanner scan8 = new Scanner(System.in);
//
//        System.out.print("Task 8. Write number n:");
//        double num8 = scan8.nextInt();
//
//        double sum8 = 0.0;
//        double altersign = 1;
//
//        for (double i8 = 0; i8 < num8; i8++) {
//            double sequence = altersign * (1/(2*i8+1));
//            sum8 += sequence;
//            altersign *= -1;
//        }
//        System.out.println(sum8);
//
//        //Task 9
//        System.out.println("Task 9. Write an integer to sum its digits:");
//        Scanner scan9 = new Scanner(System.in);
//        String number9 = scan9.nextLine();
//        int result9 = 0;
//        for (int i = 0; i < number9.length(); i++) {
//            result9 += Integer.parseInt(number9.substring(i, i+1));
//        }
//        System.out.println(result9);
    }
}