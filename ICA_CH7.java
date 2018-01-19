public class ICA_CH7
{
   public static void main(String[] args)
   {
      int[] numbers1 = new int[5];
      int[] numbers2 = new int[5];
     
     boolean equals = true; 
         
     for(int i=0; i<numbers1.length; i++)
     {
            if(numbers1[i] != numbers2[i])
             equals = false;
            
            if(numbers1[i] == numbers2[i])
            equals = true;
            
      }
      
      System.out.println("The arrays are equal is: " +equals);
    }
}

            
            

            
            
            
      
      
      
   
     
 