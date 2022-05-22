package JUnitMathFunctions;

public class MathFunctions {
    public MathFunctions(){}
        public int countToEleven() {
            int number = 0;
            for (int i = number; i < 12; i++) {
                System.out.println(number++);
            }
            return number++;
        }

        public float divideMethod(float a, float b) {
            return a/b;
        }

        public int multiplication(int [] arr) {
            int c = 1;
            for (int j : arr) {
                c *= j;
            }
            return c;
        }


        public String string() {
            System.out.println("String of text!");
            return "String of text!";
        }
        public int num(int i) {
            System.out.println(i);
            return 5;
        }
        public boolean boo(boolean b) {
            System.out.println(false);
            return false;
        }

        public int subtract(int d, int e){
            return d-e;
        }

        public double modus(double d, double e){
        return  d % e;
        }




}
