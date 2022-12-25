public class Restaurant implements Runnable{
    private boolean WaitingForPickup = false;
    private static final Object lock = new Object();
    private static int foodNumber = 1;

    @Override 
    public void run() {
        while (true) {
            makeFood();
            try {
                Thread.sleep(5000);
            }
            catch(InterruptedException a) {
                a.printStackTrace();
            }
        }
    }

    public void setWaitingForPickup (boolean WaitingForPickup) {
        this.WaitingForPickup = WaitingForPickup;
    }

    public static int getFoodNumber () {
        return foodNumber;
    }

    public void makeFood() {
        synchronized (Restaurant.lock){
            if (this.WaitingForPickup){
                try {
                    System.out.println("Restaurant : waiting For The Waiter to Deliver The Food");
                    Restaurant.lock.wait();
                }
                catch (InterruptedException a){
                    a.printStackTrace();
                }
            }
            WaitingForPickup = true;
            System.out.println("Restaurant : Making The Food Number "+ foodNumber++);
            Restaurant.lock.notifyAll();
            System.out.println ("Restaurant : Telling the Waiter to get the food\n");
        }
    }

    public static Object getLock () {
        return lock;
    }

}
