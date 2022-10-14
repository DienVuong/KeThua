public class ReactangleTest {
    public static void main(String[] args) {
        Rectangle rectangle =new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(20.2, 20.6);
        System.out.println(rectangle);

        rectangle = new Rectangle(30.1, 36.4, "red", true  );
        System.out.println(rectangle);

        System.out.println("dien tich hcn la: " + rectangle.getArea());
        System.out.println("chu vi hcn la : " + rectangle.getPerimeter());
    }
}
