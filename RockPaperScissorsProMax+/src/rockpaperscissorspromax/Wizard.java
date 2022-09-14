
package rockpaperscissorspromax;


public class Wizard extends Element {
    static ElementType[] weakAgainst = {ElementType.Scissors,ElementType.Rock,ElementType.Spock,ElementType.SpiderMan};
    static ElementType[] strongAgainst = {ElementType.Paper,ElementType.Lizard,ElementType.Batman,ElementType.Glock};
    
     Wizard() {
        super(ElementType.Wizard,weakAgainst,strongAgainst);

    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Scissors cuts wizard’s robes.", "Rock interrupts wizard.", "Spock zaps wizard.", "Spider-Man annoys the wizard."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Wizard burns paper.", "Wizard transforms lizard.", "Wizard stuns Batman.", "Wizard melts Glock."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
