public class Application {
    public static void main(String[] args) {
        // RECT1 (2,1)(5,5)
        // RECT2 (3,2)(5,7)
        OverlappinRectangle overlappinRectangle = new OverlappinRectangle();
        int field = overlappinRectangle.overlap(2,1,5,5,3,2,5,7);
        System.out.println(field);

        int field1 = overlappinRectangle.overlap(-1, -1, 10, 10, -1, 0, 3, 9);
        System.out.println(field1);

        int field2 = overlappinRectangle.overlap(-12, -4, -1, -2, 0, 0, 100, 3000);
        System.out.println(field2);
    }
}
