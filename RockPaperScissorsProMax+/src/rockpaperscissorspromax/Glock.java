
package rockpaperscissorspromax;


public class Glock extends Element {
   static ElementType[] weakAgainst = {ElementType.Wizard,ElementType.SpiderMan,ElementType.Lizard,ElementType.Paper};
   static ElementType[] strongAgainst = {ElementType.Batman,ElementType.Scissors,ElementType.Rock,ElementType.Spock};
   
     Glock() {
        super(ElementType.Glock,weakAgainst,strongAgainst);
    
    }

   
    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Wizard melts Glock.", "Spider-Man disarms Glock.", "Lizard is too small for Glock.", "Paper jams Glock."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Glock kills Batmans parents.", "Glock dents scissors.", "Glock shoots The rock.", "Glock shoots Spock"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
