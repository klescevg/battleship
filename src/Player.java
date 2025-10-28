import java.sql.SQLOutput;
import java.util.Scanner;

public class Player {
    private String name;
    private Battlefield myField;
    private Battlefield enemyField;

    public Player(String name) {
        this.name = name;
    }

    public void setShips() {
        Scanner scanner = new Scanner(System.in);

        System.out.println(name + ", get ready to set your ships!");

        while (true) {
            System.out.println("Enter coordinates of 4 size ship (format: x,y;x,y;x,y;x,y)");
            String input = scanner.nextLine();
            String[] coordinates = input.split(";");
            int[] intCoordinates;
            for (int i = 0; i < coordinates.length; i++) {
                String[] coordinate = coordinates[i].split(",");
                int x = Integer.parseInt(coordinate[0]);
                int y = Integer.parseInt(coordinate[1]);


                if ((x > 9 || x < 0) || (y > 9 || y < 0)) {
                    System.out.println("Wrong coordinate!");
                    break;
                }

                break;
            }
        }
    }

//    public void setShips() {
//        Scanner scanner = new Scanner(System.in);
//        String XCoordinates = "ABCDEFGHIJ";
//
//        int shipSize = 4;
//        while (shipSize != 0) {
//            System.out.println("Enter " + shipSize + " size ship coordinates");
//
//            int currentShipSize = 0;
//            while (currentShipSize != shipSize) {
//                System.out.println("Enter " + (currentShipSize + 1) + " position.");
//
//                //enter X
//                System.out.print("X: ");
//                String xString = scanner.nextLine().toUpperCase();
//                if(xString.length() != 1 || !XCoordinates.contains(xString)){
//                    System.out.println("Wrong range. Should be from A to J, try again.");
//                    continue;
//                }
//                int xInt = XCoordinates.indexOf(xString);
//
//                //enter y
//                System.out.print("Y: ");
//                int y = Integer.parseInt(scanner.nextLine());
//                if (y > 10 || y < 1) {
//                    System.out.println("Wrong range. Should be from 1 to 10, try again.");
//                    continue;
//                }
//
//
//                myField.setShip(xInt, y-1);
//                currentShipSize++;
//            }
//
//
//            shipSize--;
//        }
//    }

/*    public void setShips() {
        Scanner scanner = new Scanner(System.in);
//        String[] YCoordinates = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J"};
//        String[] XCoordinates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

        String YCoordinates = "ABCDEFGHIJ";
        String XCoordinates = "12345678910";

        System.out.println("Set 4 square ship positions (e.g. B6, B5, etc.): ");
        int x = 0;

        while (x != 4) {
            String position = scanner.nextLine();

            String[] coordinates = position.split("");

            if (!YCoordinates.contains(coordinates[0])) {
                System.out.println("Wrong Y coordinate, try again");
                continue;
            }

            if (!XCoordinates.contains(coordinates[1])) {
                System.out.println("Wrong X coordinate, try again");
                continue;
            }

            x++;
        }
    }*/
}
