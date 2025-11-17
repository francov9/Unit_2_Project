import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        BoardState main = new BoardState();
        main.printBoard();
        int turn = 1;
        while (!main.winCheck()){
            System.out.print("Which column would you like to drop a piece in player " + turn + "? ");
            int input = scan.nextInt();
            while(input > 7 || input < 1){
                System.out.print("That is not a slot that exists in Connect 4! Try again: ");
                input = scan.nextInt();
            }
            main.move(turn, input);
            main.printBoard();
            turn = switch (turn) {
                case 1 -> 2;
                case 2 -> 1;
                default -> turn;
            };
        }
        scan.close();
    }
}