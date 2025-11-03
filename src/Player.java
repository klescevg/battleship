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

        set4SizedShip();
    }

    public void set4SizedShip() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter coordinates of 4 size ship (format: x,y;x,y;x,y;x,y)");
            String input = scanner.nextLine();
            String[] coordinates = input.split(";");

            int currentShipSection = 0;
            while (currentShipSection < coordinates.length) {
                String[] coordinate = coordinates[currentShipSection].split(",");
                int x = Integer.parseInt(coordinate[0]);
                int y = Integer.parseInt(coordinate[1]);


                if ((x > 9 || x < 0) || (y > 9 || y < 0)) {
                    System.out.println("Wrong coordinate!");
                    break;
                }

                myField.setShip(x, y);
                currentShipSection++;
            }

            if (currentShipSection == 4) {
                break;
            }
        }
    }

    public void setShip(int size) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            //System.out.println("Enter coordinates of 4 size ship (format: x,y;x,y;x,y;x,y)");
            String input = scanner.nextLine();
            String[] inputCoordinates = input.split(";");
            int[][] shipCoordinates = new int[inputCoordinates.length][2];

            for (int i = 0; i < inputCoordinates.length; i++) {
                String[] coordinate = inputCoordinates[i].split(",");
                shipCoordinates[i][0] = Integer.parseInt(coordinate[0]);
                shipCoordinates[i][1] = Integer.parseInt(coordinate[1]);
            }

            //check coordinate range (0..9)
            //check number of coordinates (e.g. 4 for 4-sized ship)
            //check ship integrity
            //check free space
            //check intersections with other ships
        }
    }

    public boolean checkShipCoordinates(int[][] shipCoordinates, int shipSize) {
        //check number of coordinates (e.g. 4 for 4-sized ship)
        if (shipCoordinates.length != shipSize) {
            System.out.println("Wrong ship size");
            return false;
        }

        //check coordinate format (2D)
        for (int i = 0; i < shipSize; i++) {
            if (shipCoordinates[i].length != 2) {
                System.out.println("Wrong coordinates format (2D coordinates required)");
                return false;
            }
        }

        //check coordinate range (0..9)
        for (int i = 0; i < shipSize; i++) {
            for (int j = 0; j < 2; j++) {
                if (shipCoordinates[i][j] > 9 || shipCoordinates[i][j] < 0) {
                    return false;
                }
            }
        }

        //check ship integrity (without continuity check - TO DO)
        boolean allXSame = true;
        boolean allYSame = true;
        for (int i = 1; i < shipSize; i++) {
            if (shipCoordinates[i][0] != shipCoordinates[0][0]) {
                allXSame = false;
            }
            if (shipCoordinates[i][1] != shipCoordinates[0][1]) {
                allYSame = false;
            }
        }
        if (allXSame == allYSame) {
            return false;
        }


        return true;
    }
}
