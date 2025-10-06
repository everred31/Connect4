import java.util.Scanner;
import javax.swing.*;

public class Main {
    public static void add(int[][] arr, int col, int player) {
        if (arr[0][col] != 0 ) {
            System.out.println("Col is full");
            return;
        }
        int i = arr.length - 1;
        while (arr[i][col] != 0 ){
            i--;
        }
        arr[i][col] = player;
    }

    public static void print(int[][]arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static void resetGame(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = 0;
            }
        }
    }

    public static boolean winCond(int[][]arr, int player){
        for (int j = 0; j < arr[0].length ; j++){
            for (int i = 0; i < arr.length - 3; i ++){
                if (arr[i][j] == player && arr[i + 1][j] == player && arr[i + 2][j] == player && arr[i+ 3][j] == player)
                    return true;
            }
        }
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length - 3; j ++){

                if (arr[i][j] == player && arr[i][j + 1] == player && arr[i][j + 2] == player && arr[i][j + 3] == player)
                    return true;
            }
        }
        for (int i = 0; i < arr.length - 4; i++){
            for (int j = 0; j < arr[0].length - 4; j ++){

                if (arr[i][j] == player && arr[i+1][j + 1] == player && arr[i+2][j +2] == player && arr[i+3][j + 3] == player)
                    return true;
            }
        }
        for (int i = 3; i < arr.length; i++){
            for (int j = 0; j < arr[0].length - 4; j ++){

                if (arr[i][j] == player && arr[i-1][j + 1] == player && arr[i-2][j + 2] == player && arr[i-3][j+3] == player)
                    return true;
            }
        }
        return false;
    }

    public static void game(int [][]arr){
        Scanner scan = new Scanner(System.in);
        int player = 1;
        while (true){
            int col = scan.nextInt() - 1;
            if (col == 7){
                break;
            }
            add(arr, col, player);
            print(arr);
            if ( winCond(arr, player)) {
                System.out.println("YES");
                break;
            }
            if (player == 1){
                player++;
            }
            else{
                player--;
            }
        }
    }

    public static void main(String[] args) {
        new GUI();

        Scanner scan = new Scanner(System.in);
        System.out.println("Select your option");
        System.out.println("Enter Column 1-7 or 8 to Quit");

        int[][] arr = new int[6][7];
        while (true){
            game(arr);
            System.out.println("1. Restart");
            System.out.println("2. Quit");
            int quitCheck = scan.nextInt();
            if (quitCheck == 1){
                resetGame(arr);
            }
            else{
                break;
            }
        }

    }
}