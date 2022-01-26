import java.util.Random;
import java.util.Scanner;
public class SlotMachine2 {

    private Random randomGenerator = new Random();
    private Scanner answer = new Scanner(System.in);

    int counter = 100 ;

    int[]reel1 = {1, 2, 3, 4, 5, 6};

    int randomItemFromArray1 = reel1[randomGenerator.nextInt(reel1.length)];
    int randomItemFromArray2 = reel1[randomGenerator.nextInt(reel1.length)];
    int randomItemFromArray3 = reel1[randomGenerator.nextInt(reel1.length)];

    int randomItemFromArray4 = reel1[randomGenerator.nextInt(reel1.length)];
    int randomItemFromArray5 = reel1[randomGenerator.nextInt(reel1.length)];
    int randomItemFromArray6 = reel1[randomGenerator.nextInt(reel1.length)];

    int randomItemFromArray7 = reel1[randomGenerator.nextInt(reel1.length)];
    int randomItemFromArray8 = reel1[randomGenerator.nextInt(reel1.length)];
    int randomItemFromArray9 = reel1[randomGenerator.nextInt(reel1.length)];

    private void playagain(){

        if ( counter == 0 ){
          System.out.println("Sorry no more credits");
        }
        else{
          System.out.println("Enter 10 Credits to play again");
          int response = answer.nextInt();
          counter-=10;
          printslotmachine();
          checkwin();
          playagain();


        }
    }


    private char displaySq ( int number){
        if ( number == 1){
            return 'X';
        } 
        else if ( number==2){
            return 'O';
        } 
        else if ( number==3){
            return '$';
        } 
        else if ( number==4){
            return 'A';
        } 
        else if ( number==5){
            return 'K';
        } 
        else if ( number==6){
            return 'Q';
        }
        else {
            return 0;
        }
    }

    private void printslotmachine(){
        
        int randomItemFromArray1 = reel1[randomGenerator.nextInt(reel1.length)];
        int randomItemFromArray2 = reel1[randomGenerator.nextInt(reel1.length)];
        int randomItemFromArray3 = reel1[randomGenerator.nextInt(reel1.length)];
    
        int randomItemFromArray4 = reel1[randomGenerator.nextInt(reel1.length)];
        int randomItemFromArray5 = reel1[randomGenerator.nextInt(reel1.length)];
        int randomItemFromArray6 = reel1[randomGenerator.nextInt(reel1.length)];
    
        int randomItemFromArray7 = reel1[randomGenerator.nextInt(reel1.length)];
        int randomItemFromArray8 = reel1[randomGenerator.nextInt(reel1.length)];
        int randomItemFromArray9 = reel1[randomGenerator.nextInt(reel1.length)];
    
        
        System.out.printf("| %c | %c | %c |\n", displaySq(randomItemFromArray1) , displaySq(randomItemFromArray2), displaySq(randomItemFromArray3));
        System.out.printf("| %c | %c | %c |\n", displaySq(randomItemFromArray4) , displaySq(randomItemFromArray5), displaySq(randomItemFromArray6));
        System.out.printf("| %c | %c | %c |\n", displaySq(randomItemFromArray7) , displaySq(randomItemFromArray8), displaySq(randomItemFromArray9));
        System.out.printf("You have %d credits remaining\n", counter);
    }
    private void checkwin(){
        if((randomItemFromArray1 == randomItemFromArray2)&&(randomItemFromArray1 == randomItemFromArray3)){
            System.out.println("**BIG WIN 100 credits **");
            counter+=100;
            
        }
        else if ((randomItemFromArray4 == randomItemFromArray5)&&(randomItemFromArray6 == randomItemFromArray4)){
            System.out.println("**BIG WIN 100 credits**"); 
            counter+=100;
            
        }
        else if ((randomItemFromArray7 == randomItemFromArray8)&&(randomItemFromArray9 == randomItemFromArray7)){
            System.out.println("**BIG WIN 100 credits**");  
            counter+=100;
              
        }
        else if ((randomItemFromArray1 == randomItemFromArray5)&&(randomItemFromArray9 == randomItemFromArray1)){
            System.out.println("**BIG WIN 100 credits**");
            counter+=100;
                
        }
        else if ((randomItemFromArray7 == randomItemFromArray5)&&(randomItemFromArray3 == randomItemFromArray7)){
            System.out.println("**BIG WIN 100 credits **");
            counter+=100;
                
        }

        else {
            System.out.println("NO WIN SORRY:(");
            
        }

    }

    SlotMachine2(){
      printslotmachine();
      checkwin();
      playagain();

    }

    public static void main(String args[]){

        
    
        new SlotMachine2();
    }
}


