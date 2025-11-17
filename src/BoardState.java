import java.util.ArrayList;
import java.util.Scanner;

public class BoardState {

    private ArrayList<ArrayList<Integer>>board;

    public BoardState(){
        board = resetBoard();
    }

    public void move (int turn, int column){
        Scanner scan = new Scanner(System.in);
        boolean success = false;
        for(int i = 5; i > -1; i--){
            if(board.get(i).get(column-1) == 0){
                board.get(i).set(column-1, turn);
                success = true;
                break;
            }
        }
        if (!success){
            System.out.print("No more space in that column... Choose a different one: ");
            int newColumn = scan.nextInt();
            move(turn, newColumn);
        }
        success = true;
    }
    public boolean winCheck (){
        //horizontal

        return false;
    }

    public ArrayList<ArrayList<Integer>> resetBoard(){
        ArrayList<ArrayList<Integer>>board = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            board.add(new ArrayList<Integer>());
            for (int n = 0; n < 7; n++){
                board.get(i).add(0);
            }
        }
        return board;
    }

    public void printBoard() {
        for(int i = 0; i < 6; i++){
            System.out.println(board.get(i));
        }
    }
}
