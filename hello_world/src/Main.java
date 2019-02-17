import java.awt.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Bret");

        Car myCar = new Car( 25.5,
                "1BC32E",
                Color.BLUE,
                true
                );
        Car bretCar = new Car(23.2,
                "324GBC",
                Color.BLACK,
                false);

        System.out.println("my car's lic plate: " + myCar.licensePlate );
        System.out.println("bret car's lic plate: " + bretCar.licensePlate );

        System.out.println(myCar.paintColor);
        myCar.changePaintColor(Color.RED);
        System.out.println(myCar.paintColor);

    }
}
