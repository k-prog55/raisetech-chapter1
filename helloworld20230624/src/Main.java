public class Main {
    public static void main(String[] args) {
        //Hello world1回
        System.out.println("Hello world!!!!!");
        System.out.println();
        //Hello World2回、Hello2回
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                System.out.println("Hello world");
            } else {
                System.out.println("Hello");
            }
        }
        System.out.println();
        //偶数ならHello world、奇数ならHello
        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                System.out.println("Hello world");
            } else {
                System.out.println("Hello");
            }
        }
        System.out.println();
        //10回 Hello World, 10回　Hello
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                System.out.println("Hello World");
            } else {
                System.out.println("Hello");
            }
        }
    }
}