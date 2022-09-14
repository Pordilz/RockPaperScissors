
package rockpaperscissorspromax;


public class Rock extends Element{
   static ElementType[] weakAgainst = {ElementType.Glock,ElementType.Batman,ElementType.Spock,ElementType.Paper};
   static ElementType[] strongAgainst = {ElementType.SpiderMan,ElementType.Lizard,ElementType.Scissors,ElementType.Wizard};
    
     Rock() {
        super(ElementType.Rock,weakAgainst,strongAgainst);

    }



    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Rock knocks out Spider-Man.", "Rock crushes lizard.", "Rock crushes scissors", "Rock interrupts wizard."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Glock shoots The rock.", "Batman explodes rock.", "Spock vaporizes rock", "Paper covers rock."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
        
}
