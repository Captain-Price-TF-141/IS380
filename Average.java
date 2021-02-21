//Captain-Price-TF-141


import java.util.Scanner;

//Average
class Average
{
    //class attribute
    private int data[];
    
    private double mean;
    
    Scanner input;
    
    //constructor
    public Average()
    {
        //scanner object for user input
        input = new Scanner(System.in);
        
        //Initializing the array for 5 inputs
        data = new int[5];
        
        //for loop to get 5 inputs from user
        for(int i=0; i<5; i++)
        {
            System.out.println("Enter data number " + (i + 1) + ": ");
            
            data[i] = input.nextInt();
        }
        
        //call selection sort
        this.selectionSort();
        
        //call calculateMean
        this.calculateMean();
    };
    
    //method calculateMean
    public void calculateMean()
    {
        for(int i = 0; i < data.length; i++)
        {
        	
            mean += data[i];
            
        }
        mean = mean / data.length;
        
    }
    
    //method toString
    public String toString()
    {
        String str = "";
        
        	for(int i = 0; i<data.length; i++)
            {
                str += data[i] + ", ";
            }
        	
        str = str + "Mean: " + this.mean;
        
        return str;
    }
    
    //method selectionSort
    public void selectionSort()
    {
        for(int i = 0; i < data.length; i++)
        {
        	
            for(int j = 0; j < data.length; j++)	
            {
                if(data[i] > data[j])	
                {
                	
                    int temp = data[i];
                    
                    data[i] = data[j];
                    
                    data[j] = temp;
                    
                }
            }
        }
    }
}
