
package rockpaperscissorspromax;


public class Scissors extends Element{
 
  static ElementType[] weakAgainst = {ElementType.Rock,ElementType.Batman,ElementType.Spock,ElementType.Glock};  
  static ElementType[] strongAgainst = {ElementType.Paper,ElementType.Lizard,ElementType.SpiderMan,ElementType.Wizard};  

     Scissors() {
        super(ElementType.Scissors,weakAgainst,strongAgainst);

    }

    
    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Rock crushes scissors", "Batman dismantles scissors","Spock smashes scissors.","Glock dents scissors"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public  String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Scissors cuts paper.", "Scissors decapitates lizard.", "Scissors cuts Spider-Man’s webs.", "Scissors cuts wizard’s robes."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    

    
   
   
  
    

    
}
