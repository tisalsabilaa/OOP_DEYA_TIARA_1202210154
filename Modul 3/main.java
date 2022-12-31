import java.util.Scanner;
import java.util.InputMismatchException;

public class main {
    public static void main(String[] args) throws Exception{
        boolean repeat = true;
        Scanner x = new Scanner (System.in);
        calculation cc = new calculation();
        int menu;

        do {
            System.out.println("== Menu Program ==\n1. Square\n2. Circle\n3. Trapezoid\n0. Finish");
            try {
                System.out.println ("Select menu :");
                menu = x.nextInt();
                switch(menu){
                    case 1 :
                        System.out.println ("Enter the length of the side of the square : ");
                        double side = x.nextDouble();
                        cc.setSquare(side);
                        cc.run();
                        System.out.println ("The calculation result :"+cc.getSquare());
                        break;
                    case 2 :
                        System.out.println ("Enter the radius of the circle : ");
                        double radius = x.nextDouble();
                        cc.setCircle(radius);
                        cc.run();
                        System.out.println ("The calculation result :"+cc.getCircle());
                        break;
                    case 3 :
                        System.out.println ("Insert the side of the base of the trapezoid : ");
                        double a = x.nextDouble();
                        System.out.println ("Enter the upper side of the trapezoid : ");
                        double b = x.nextDouble();
                        System.out.println ("Enter the height of the trapezoid : ");
                        double t = x.nextDouble();
                        cc.setTrapezoid(a, b, t);
                        cc.run();
                        System.out.println ("The calculation result :"+cc.getTrapezoid());
                        break;
                    case 0 :
                        System.out.println ("=====Program has Ended=====");
                        break;
                    default :
                         System.out.println ("Option not available");
                        continue;
                }
                repeat = false;
            }
            catch (InputMismatchException e){
                System.out.println ("Error : Input must be a number");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        while(repeat);
        x.close();
    }
}
