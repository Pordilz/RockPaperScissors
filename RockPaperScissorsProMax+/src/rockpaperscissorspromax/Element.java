
package rockpaperscissorspromax;

// Getting input from the computer
public abstract class Element {
    
    //template variables for child class
   //https://www.programiz.com/java-programming/access-modifiers 
   protected ElementType Name;
   protected ElementType[] weakVs = new ElementType[3];
   protected ElementType[] strongVs = new ElementType[3];
   protected String phrase1;
   protected String phrase2;
   protected String phrase3;
   protected String phrase4;
   
   //template object for child classes to inherit 
    public Element(ElementType Name,  ElementType[] weakVs, ElementType[] StrongVs){
        this.Name = Name;
        this.weakVs = weakVs;
        this.strongVs = StrongVs;
    }


    //methods serve as a template for child classes to override
   //https://stackoverflow.com/questions/68647479/how-to-call-the-overridden-method-of-a-derived-class-child-class
    public   String matchUpWin(ElementType oponent, ElementType[] loser, String phrase1, String phrase2, String phrase3, String phrase4){
        String wPhrase = "";
        
        if(oponent.equals(loser[0])){
            wPhrase = phrase1;
        }else if(oponent.equals(loser[1])){
             wPhrase = phrase2;
        }else if(oponent.equals(loser[2])){
            wPhrase= phrase3;
        }else if(oponent.equals(loser[3])){
            wPhrase = phrase4;
        }

        return wPhrase;
    }
    
  //same as above 
    public  String matchUploss(ElementType oponent, ElementType[] winner, String phrase1, String phrase2, String phrase3, String phrase4){
        String lPhrase = "";
        
        if(oponent.equals(winner[0])){
            lPhrase = phrase1;
        }else if(oponent.equals(winner[1])){
             lPhrase = phrase2;
        }else if(oponent.equals(winner[2])){
             lPhrase = phrase3;
        }else{
            lPhrase = phrase4;
        }

        return lPhrase;
    }
     
}

