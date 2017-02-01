import java.util.Scanner;
/**
 * blah
 */
public class FillinQuestion extends Question
{
    /**
     * overriding setText metod
     */
    public void setText(String questionText)
    {
        Scanner s = new Scanner(questionText);
        s.useDelimiter("_");
        String question1=s.next();
        String answer=s.next();
        String space = " ______ ";
        String question2=s.next();
        String question=question1+space+question2;
        
        /*
         * 
         */
        super.setText(question);
        super.setAnswer(answer);
    }
}
