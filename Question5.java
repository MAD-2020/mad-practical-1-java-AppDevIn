import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    HashMap<Integer, Integer> numbers = new HashMap<Integer, Integer>();
    int highestKey = 0;

    Scanner in = new Scanner(System.in);

    int inputLoop = in.nextInt();

    for (int i = 0; i < inputLoop; i++) {
      int input = in.nextInt();
      
      if(numbers.containsKey(input)){
        numbers.replace(input,numbers.get(input) + 1);
      }else {
        numbers.put(input,1);
      }
      

    }







    for (int i :
            numbers.keySet()) {

      int highest = 0;

      highestKey = numbers.get(i);

      if(numbers.get(i) > highest){
        highest = numbers.get(i);
        highestKey = i;
      }



    }

    System.out.println(highestKey);
    
    
    






  }
}

