public class Singleton {
    class Doubleton{
        int x;
        int y;

        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }

        public int getY() {
            return y;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
        Singleton.Doubleton d = singleton.new Doubleton();

    }
}
