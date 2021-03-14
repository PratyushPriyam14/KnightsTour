import java.io.*;
import java.util.*;
public class KnightTour{
  public static void main(String []args)throws Exception{
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int r=s.nextInt();
    int c=s.nextInt();
    int [][]chess=new int [n][n];
    printknighttour(chess,r,c,1);
  }
  public static void  printknighttour(int [][]chess,int row,int col,int move){
    if(row<0 || col<0 || row>=chess.length || col>=chess.length || chess[row][col]>0){
      return;
    }
    else if(move == chess.length *chess.length){
      chess[row][col]=move;  //for the last move
      display(chess);
      chess[row][col]=0;  //for the last move if we retruning rubbing old places value
    }
    chess[row][col]=1;
      printknighttour(chess, row-2 , col+1 ,move+1);
      printknighttour(chess, row-1 , col+2 ,move+1);
      printknighttour(chess, row+2 , col+1 ,move+1);
      printknighttour(chess, row+1 , col+2 ,move+1);
      printknighttour(chess, row+2 , col-1 ,move+1);
      printknighttour(chess, row+1 , col-2 ,move+1);
      printknighttour(chess, row-2,  col-1 ,move+1);
      printknighttour(chess, row-1,  col-2 ,move+1);
     chess[row][col]=0;
  }
  public static void display(int [][]chess){
    for(int i=0;i<chess.length;i++){
      for(int j=0;j<chess[0].length;j++){
        System.out.print(chess[i][j]+" ");
      }System.out.println();
    }
    
   
    
