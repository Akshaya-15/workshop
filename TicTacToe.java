import java.util.Scanner;


public class TicTacToe{

    public static void main(String args[])
    {
        int  x=0,o=0;
        TicTacToe t=new TicTacToe();
		  Scanner s = new Scanner(System.in);
        do
{
            x=s.nextInt();
				y=s.nextInt();

            t.putSign(x,o);
				t.display();

}
class TicTacToe
{
public static final int x=1,o=-1;
public static final int Empty =0;

public int player = x;
private int [][] board =new int [3][3];
public boolean isEmpty = false;
public void putSign(int x,int y)


