
package rockpaperscissorspromax;

import java.util.Random;
import java.util.Scanner;


public class RPSGame {
//object from scanner class
Scanner op = new Scanner(System.in);
//objects from Element class
Element rock = new Rock(), paper = new Paper(), scissors = new Scissors(), lizard = new Lizard(), spock = new Spock(), spiderMan = new SpiderMan(),batman = new Batman(),wizard = new Wizard(),glock = new Glock();


//method allows user to execute the game
public void playGame(){
    System.out.println("Welcome...To RockPaperScissorsProMax!");
    System.out.println("Please Input number of Players? --> SinglePlayer[1] / Multiplayer[2]");
        int players = Integer.parseInt(op.nextLine());
        
    System.out.println("How many rounds would you like to play?");
        int rounds = Integer.parseInt(op.nextLine());
        
        for (int i = 0; i < rounds; i++) {
            if(players == 1){
            System.out.println(gameResult(playerMove(),cpuInput()));
            }else{
            System.out.println(gameResult(playerMove(),playerMove()));   
            }  
    }
}

//method gets an input from the user
//https://stackoverflow.com/questions/26093739/returning-object-from-a-java-method
private  ElementType playerMove(){
   ElementType playerInput=null;
        
        System.out.println("Chose your move: [Rock] [Paper] [Scissors] [Lizard] [Spock] [SpiderMan] [Batman] [Wizard] [Glock]");
        String choice = op.nextLine().toLowerCase();

    switch (choice) {
        case "rock" -> {
            playerInput = ElementType.Rock;
            
        }
            
        case "paper" -> {
            playerInput = ElementType.Paper;
            
        }
        case "scissors" -> {
            playerInput = ElementType.Scissors;
           
        }
        case "lizard" -> {
            playerInput = ElementType.Lizard;
            
        }
        case "spock" -> {
            playerInput =ElementType.Spock;
           
        }
        case "spiderman" -> {
            playerInput = ElementType.SpiderMan;
          
        }
        case "batman" -> {
            playerInput = ElementType.Batman;
            
        }
        case "wizard" -> {
            playerInput = ElementType.Wizard;
        
        }
        case "glock" -> {
            playerInput = ElementType.Glock;
        
        }
        case "goku" ->{
            playerInput = ElementType.Goku;//Easter Egg
        }
        
        default -> System.out.println("Please enter a valid Input");
            
    }
       return playerInput;
    }
    
// Method gets an input from the computer(CPU)
//https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
private  ElementType cpuInput() {

         ElementType computerMove = null;
        Random random = new Random();
        int randomNumber = random.nextInt(9);       
        switch (randomNumber) {
            case 0 -> computerMove = ElementType.Rock;
            case 1 -> computerMove = ElementType.Paper;
            case 2 -> computerMove = ElementType.Scissors;
            case 3 -> computerMove = ElementType.Lizard;
            case 4 -> computerMove = ElementType.Spock;
            case 5 -> computerMove = ElementType.SpiderMan;
            case 6 -> computerMove = ElementType.Batman;
            case 7 -> computerMove = ElementType.Wizard;
            case 8 -> computerMove = ElementType.Glock;
                
        }
        System.out.println("Computer chose " + computerMove + "!");
        return computerMove;
    }

//method ensures correct outcome on game result
//https://www.geeksforgeeks.org/java-program-to-convert-enum-to-string/ 
//https://stackoverflow.com/questions/11466441/call-a-child-class-method-from-a-parent-class-object
//https://www.geeksforgeeks.org/break-and-continue-statement-in-java/#:~:text=The%20break%20statement%20is%20used%20to%20terminate%20the%20loop%20immediately,continue%20statement%20in%20java%20programming.
public String gameResult( ElementType playerMove, ElementType computerMove) {
    String retVar ="";
       
        switch (playerMove) {
        case Rock -> {
        for (ElementType weakV : Rock.weakAgainst) {
            if(computerMove.equals(weakV)){
                retVar = rock.matchUploss(computerMove, Rock.weakAgainst, null, null, null, null)+"\n"+computerMove.toString()+" WINS!";
            break;
            }else if(computerMove.equals(playerMove)){
                System.out.println("DRAW!");
            break;
            }else{
                retVar = rock.matchUpWin (computerMove, Rock.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+" WINS!";  
            }
        }
            }
            
        case Paper -> {
                for (ElementType weakV : Paper.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar = paper.matchUploss(computerMove, Paper.weakAgainst, null, null, null, null)+"\n"+computerMove.toString()+ " WINS!";
        break;
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break;
        }else{
            retVar = paper.matchUpWin (computerMove, Paper.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+ " WINS!";
        break;    
        }
    }      
        }
        
        case Scissors -> {
                        for (ElementType weakV : Scissors.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar = scissors.matchUploss(computerMove, Scissors.weakAgainst, null, null, null, null)+"\n"+computerMove.toString()+ " WINS!";
        break;    
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar = scissors.matchUpWin (computerMove, Scissors.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+ " WINS!"; 
        }
    }
           
        }
        case Lizard -> {
                    for (ElementType weakV : Lizard.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar = lizard.matchUploss(computerMove, Lizard.weakAgainst, null, null, null, null)+"\n"+computerMove.toString()+ " WINS!";    
        break; 
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar = lizard.matchUpWin (computerMove, Lizard.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+ " WINS!";   
        }
    }
            
        }
        case Spock -> {
                    for (ElementType weakV : Spock.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar = spock.matchUploss(computerMove, Spock.weakAgainst, null, null, null, null)+"\n"+computerMove.toString()+ " WINS!";
            
        break; 
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar =spock.matchUpWin (computerMove, Spock.strongAgainst, null, null,null,null)+"\n"+ playerMove.toString()+ " WINS!";
            
        }
    }
           
        }
        case SpiderMan -> {
                    for (ElementType weakV : SpiderMan.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar = spiderMan.matchUploss(computerMove, SpiderMan.weakAgainst, null, null, null, null)+"\n"+computerMove.toString()+ " WINS!"; 
        break; 
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar = spiderMan.matchUpWin (computerMove, SpiderMan.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+ " WINS!";    
        }
    }
          
        }
        case Batman -> {
                       for (ElementType weakV : Batman.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar =batman.matchUploss(computerMove, Batman.weakAgainst, null, null, null, null)+"\n"+ computerMove.toString()+ " WINS!";
        break;     
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar = batman.matchUpWin (computerMove, Batman.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+ " WINS!";
           
        }
    }
            
        }
        case Wizard -> {
                        for (ElementType weakV : Wizard.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar =wizard.matchUploss(computerMove, Wizard.weakAgainst, null, null, null, null)+"\n"+ computerMove.toString()+ " WINS!";
        break;     
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar =wizard.matchUpWin (computerMove, Wizard.strongAgainst, null, null,null,null)+"\n"+ playerMove.toString()+ " WINS!";
            
        }
    }
        
        }
        case Glock -> {
                    for (ElementType weakV : Glock.weakAgainst) {
        if(computerMove.equals(weakV)){
            retVar =glock.matchUploss(computerMove, Glock.weakAgainst, null, null, null, null)+"\n"+ computerMove.toString()+ " WINS!";
        break;     
        }else if(computerMove.equals(playerMove)){
            System.out.println("DRAW!");
        break; 
        }else{
            retVar = glock.matchUpWin (computerMove, Glock.strongAgainst, null, null,null,null)+"\n"+playerMove.toString()+ " WINS!";
            
        }
    }
        
        }
        case Goku -> {
            retVar = "Goku solos "+computerMove.toString() +"!!!";//Easter Egg
        } 
    }   
    return retVar;
}


} 

