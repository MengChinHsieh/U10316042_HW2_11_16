import java.util.ArrayList;
import java.util.Scanner;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 100);
    int number2 = (int)(Math.random() * 100);

    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    ArrayList<answerlist> anslist = new ArrayList<answerlist>();

    System.out.print("What is " + number1 + " + " + number2 + "? ");
    
    int answer = input.nextInt();
    
      
      
    anslist.add(new answerlist(answer));
    
      
    
    while (number1 + number2 != answer) {
      
        for(int i = 0 ; i < (anslist.size() - 1) ; i++){
           int answer2 =  ((answerlist)anslist.get(i)).getanswer();
            if(answer == answer2){
                
                System.out.print("You already enter " + answer2 + "\n");
                break;
            }
            
        }
        
        System.out.print("Wrong answer. Try again. What is " + number1 + " + " + number2 + "? ");
        answer = input.nextInt();
        anslist.add(new answerlist(answer));
        
        
    }

    System.out.println("You got it!");
  }
}

class answerlist{
    
    private int answer;
    
    
    answerlist(int answer){
        this.answer = answer;
        
    }
    
    void setanswer(int answer){
        this.answer = answer;
    }
    
    int getanswer(){
        return answer;
    }
    
    
}
