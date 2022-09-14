
package rockpaperscissorspromax;


public class Spock extends Element{
    static ElementType[] weakAgainst = {ElementType.Paper,ElementType.Lizard,ElementType.Glock,ElementType.Batman};
    static ElementType[] strongAgainst = {ElementType.Scissors,ElementType.Rock,ElementType.SpiderMan,ElementType.Wizard};
    
     Spock() {
        super(ElementType.Spock,weakAgainst,strongAgainst);

    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Paper disproves Spock.", "Lizard poisons Spock.", "Glock shoots Spock.", "Batman hangs Spock."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Spock smashes scissors.", "Spok vaporizes rock", "Spock befuddles Spider-Man.", "Spock zaps wizard."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
        
}
