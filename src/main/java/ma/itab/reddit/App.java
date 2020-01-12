package ma.itab.reddit;

public class App {
    public static void main(String[] args) {

    }
    class car {
        private Engine engine = new Engine();
    }
    class Engine {
        private Tank tank =new Tank();
        public boolean startEngine(){
            return tank.getFuel(100);
        }
    }
    class Tank {
        private int capacity = 150;
        public  boolean getFuel(int quantity){
            if (capacity>=quantity){
                capacity -= quantity;
                return true;
            }
        }
    }
}

