import java.util.Scanner;


public class TicTacToe
{
    private int counter;
    private   char posn[]=new char[10];
    private   char player;
    
    
    public static void main(String args[])
    {
        String ch;
        TicTacToe Toe=new TicTacToe();
        do
{
            Toe.newBoard();
            Toe.play();
