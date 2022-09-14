
package rockpaperscissorspromax;


public class SpiderMan extends Element{
    static ElementType[] weakAgainst = {ElementType.Spock,ElementType.Rock,ElementType.Scissors,ElementType.Batman};
    static ElementType[] strongAgainst = {ElementType.Wizard,ElementType.Lizard,ElementType.Glock,ElementType.Paper};
    
     SpiderMan() {
        super(ElementType.SpiderMan,weakAgainst,strongAgainst);
    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Spock befuddles Spider-Man.", "The Rock knocks out Spider-Man.", "Scissors cuts Spider-Man’s webs.", "Batman scares Spider-Man."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Spider-Man annoys the wizard.", "Spider-Man defeats The Lizard.", "Spider-Man disarms Glock.", "Spider-Man rips paper."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
