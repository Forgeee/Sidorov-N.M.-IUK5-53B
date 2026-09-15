import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = 5, b = 10, c = 15, d = 20;
        // 1.1 if / else if / else с 2, 3 и 4
        if (a > 0 && b > 0) {                         // 2 операнда
            System.out.println("1.1 (2): a и b положительны");
        } else if (a > 0 || c > 0) {                  // 3 операнда
            System.out.println("1.1 (3): хотя бы одно положительно");
        } else {
            System.out.println("1.1: иначе");
        }

        if ((a > 0 && b > 0) || (c > 0 && d > 0)) {   // 4 операнда
            System.out.println("1.1 (4): условие истинно");
        }

        int day = 3;// 1.2 switch / case с break и default
        switch (day) {
            case 1: System.out.println("1.2 Единица"); break;
            case 2: System.out.println("1.2: Двойка"); break;
            case 3: System.out.println("1.2: Тройка"); break;
            default: System.out.println("1.2: Другая цифра");
        }

        String res = (a > b) ? "a > b" : "a <= b";// 1.3 Тернарный оператор
        System.out.println("1.3: " + res);

        // 2.1 for, while, do...while
        for (int i = 0; i < 3; i++) System.out.print("for:" + i + " ");
        System.out.println();

        int i = 0;
        while (i < 3) { System.out.print("while:" + i + " "); i++; }
        System.out.println();

        i = 0;
        do { System.out.print("do:" + i + " "); i++; } while (i < 3);
        System.out.println();


        for (int k = 0; k < 5; k++) {// 2.2 continue и break
            if (k == 2) continue;
            if (k == 4) break;
            System.out.print("k=" + k + " ");
        }
        System.out.println();

        int[][] matrix = {{1, 2}, {3, 4}, {5, 6}};    // 2.3 Многомерный массив
        for (int[] row : matrix)
            for (int val : row)
                System.out.print(val + " ");
        System.out.println();


        int primInt = 10;
        Integer boxInt = primInt;        // 3autoboxing
        int unboxInt = boxInt;           // unboxing

        boolean primBool = true;
        Boolean boxBool = primBool;
        boolean unboxBool = boxBool;

        long primLong = 100L;
        Long boxLong = primLong;
        long unboxLong = boxLong;

        System.out.println("3: " + boxInt + " " + boxBool + " " + boxLong);

        // Имитация NullPointerException
        Integer nullInt = null;
        try {
            int x = nullInt;             // NPE при unboxing
        } catch (NullPointerException e) {
            System.out.println("3: Пойман NullPointerException");
        }


        String s = "Hello world";
        System.out.println("4.1 replace: " + s.replace("world", "not helloooo"));// 4.1 замена, обрезка, разбиение
        System.out.println("4.1 substring: " + s.substring(0, 5));
        String[] parts = s.split(", ");
        System.out.println("4.1 split: " + Arrays.toString(parts));

        String s1 = "test"; // 4.2 сравнение строк
        String s2 = new String("test");
        System.out.println("4.2 == : " + (s1 == s2));
        System.out.println("4.2 equals: " + s1.equals(s2));
        System.out.println("4.2 equalsIgnoreCase: " + s1.equalsIgnoreCase("TEST"));

        StringBuilder sb = new StringBuilder("abcdef");// 4.3 StringBuilder
        sb.append("ghi");
        sb.delete(2, 5);
        System.out.println("4.3 StringBuilder: " + sb);


    }
}