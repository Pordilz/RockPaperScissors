
package rockpaperscissorspromax;


public class Lizard extends Element{
   static ElementType[] weakAgainst = {ElementType.Scissors,ElementType.Rock,ElementType.SpiderMan,ElementType.Wizard};
   static ElementType[] strongAgainst = {ElementType.Batman,ElementType.Glock,ElementType.Paper,ElementType.Spock};
   
     Lizard() {
        super(ElementType.Lizard,weakAgainst,strongAgainst);

    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Scissors decapitates lizard.", "Rock crushes lizard.", "Spider-Man defeats The Lizard.", "Wizard transforms lizard."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Lizard Confuses Batman (because he looks like Killer Croc),", "Lizard is too small for Glock.", "Lizard eats Paper.", "Lizard poisons Spock."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }


}
