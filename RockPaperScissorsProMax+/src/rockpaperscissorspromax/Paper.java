
package rockpaperscissorspromax;


public class Paper extends Element{
   static ElementType[] weakAgainst = {ElementType.Scissors,ElementType.Wizard,ElementType.Lizard,ElementType.SpiderMan};
   static ElementType[] strongAgainst = {ElementType.Batman,ElementType.Glock,ElementType.Rock,ElementType.Spock};
   
     Paper() {
        super(ElementType.Paper,weakAgainst,strongAgainst);

    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Scissors cuts paper.", "Wizard burns paper.", "Lizard eats paper.", "Spider-Man rips paper."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Paper delays Batman.", "Paper jams Glock.", "Paper covers Rock", "Paper disproves Spock."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
       
    
}
