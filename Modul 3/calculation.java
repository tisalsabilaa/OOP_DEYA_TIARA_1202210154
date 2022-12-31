public class calculation implements Runnable {
    public double radius, side, area;
    public double phi = 3.14;

    public void setSquare(double side){
        if (side < 1) {
            throw new IllegalArgumentException();
        }
        else {
            area = side*side;
        }
    }
    public double getSquare(){
        return area;
    }

    public void setCircle (double radius){
        if (radius < 1){
            throw new IllegalArgumentException();
        }
        else {
            area = phi*radius;
        }
    }
    public double getCircle(){
        return area;
    }

    public void setTrapezoid(double a, double b, double t){
        if (a < 1 || b < 1 || t < 1){
            throw new IllegalArgumentException();
        }
        else {
            area = ((a+b)*t)/2;
        }
    }
    public double getTrapezoid(){
        return area;
    }

    @Override
    public void run(){
        System.out.println("===== Program Will Start in =====");
        for (int i = 3; i > 0; i --){
            System.out.println("Starting eith Thread "+i);
            try {
                Thread.sleep(2000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            
        }
    }
}
