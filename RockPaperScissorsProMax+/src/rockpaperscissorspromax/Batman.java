
package rockpaperscissorspromax;


public class Batman extends Element{
    static ElementType[] weakAgainst = {ElementType.Paper,ElementType.Lizard,ElementType.Wizard,ElementType.Glock};
    static ElementType[] strongAgainst = {ElementType.SpiderMan,ElementType.Rock,ElementType.Scissors,ElementType.Spock};
    
     Batman() {
        super(ElementType.Batman,weakAgainst,strongAgainst);

    }

    @Override
    public String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUploss(oponent, weakAgainst, "Paper delays Batman.", "Lizard Confuses Batman (because he looks like Killer Croc)", "Wizard stuns Batman.", "Glock kIlls Batmans parents."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4) {
        return super.matchUpWin(oponent, strongAgainst, "Batman scares Spider-Man.", "Batman explodes Rock.", "Batman dismantles Scissors", "Batman Hangs Spock"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
        
}
