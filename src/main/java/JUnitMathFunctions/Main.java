package JUnitMathFunctions;

import JUnitMathFunctions.MathFunctions;

public class Main {
    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();

        System.out.println(math.subtract(5,6));
        System.out.println(math.countToEleven());
        math.string();
        math.num(5);
        math.boo(false);


    }

}
