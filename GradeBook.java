

public class GradeBook
{
   private int[] scores;
   private int scoresSize;

   /**
      Constructs a gradebook with no scores and a given capacity.
      @param capacity the maximum number of scores in this gradebook
   */
   public GradeBook(int capacity)
   {
      scores = new int[capacity];
      scoresSize = 0;
   }

   /**
      Adds a score to this gradebook.
      @param score the score to add
      @return true if the score was added, false if the gradebook is full
   */
   public boolean addScore(int score)
   {
      if (scoresSize < scores.length)
      {
         scores[scoresSize] = score;
         scoresSize++;
         return true;
      }
      else
         return false;      
   }

   /**
      Computes the sum of the scores in this gradebook.
      @return the sum of the scores
   */
   public int sum()
   {
      int total = 0;
      for (int i = 0; i < scoresSize; i++)
      {
         total = total + scores[i];
      }
      return total;
   }
      
   /**
      Gets the minimum score in this gradebook.
      @return the minimum score, or 0 if there are no scores.
   */
   public int minimum()
   {
      if (scoresSize == 0) return 0;
      int smallest = scores[0];
      for (int i = 1; i < scoresSize; i++)
      {
         if (scores[i] < smallest)
         {
            smallest = scores[i];
         }
      }
      return smallest;
   }

   /**
      Gets the final score for this gradebook.
      @return the sum of the scores, with the lowest score dropped if 
      there are at least two scores, or 0 if there are no scores.
   */
   public int finalScore() 
   {
      if (scoresSize == 0)
         return 0;
      else if (scoresSize == 1)
         return scores[0];
      else
         return sum() - minimum();
   }
   
   public int getScoreSize(){
	   return scoresSize;
   }
   
   public String toString() {
	   
	   return scores[0] + " " + scores[1] + " " + scores[2] + " " + scores[3] + " " + scores[4];
   }
}
