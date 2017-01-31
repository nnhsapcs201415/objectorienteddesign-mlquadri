

/**
 * Write a description of class NumaricQueston here.
 * 
 * @author (mlquadri) 
 * @version (a version number or a date)
 */
public class NumaricQueston extends Question
{
    /*
     * inharets all of questions instence varables
     */

    /**
     * Default constructor for objects of class NumaricQueston
     */
    public NumaricQueston()
    {
        
    }

    private double numaricAnswer;
    /*
     * numaricQ class is overloading the setAnswer metod defined in the question class
     */
    public void setAnswer(double correctResponce)
    {
        this.numaricAnswer=correctResponce;
    }

   /**
    * numaricQ class overrides the checkA metoud defined in the Q class
    * 
    * Checks a given response for correctness.
      @param response the response to check
      @return true if the response was correct, false otherwise
   */
   public boolean checkAnswer(String response)
   {
       double responseAsDouble = Double.parseDouble(response);
       return Math.abs(responseAsDouble-numaricAnswer)<=0.01;
   }
}
