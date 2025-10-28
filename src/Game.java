import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //set names and create players
        System.out.print("Player 1 enter your name: ");
        String player1Name = scanner.nextLine();

        System.out.print("Player 2 enter your name: ");
        String player2Name = scanner.nextLine();

        Player player1 = new Player(player1Name);
        Player player2 = new Player(player2Name);


        player1.setShips();
        player2.setShips();


    }
}
