public class Main
{   
    public static void printSum(int n, int sum)
    {
        if(n==0)
        {
            System.out.println("The sum of first natural " + n + " natural number is " + sum);
            return;
        }
        
        sum=sum+n;
        printSum(n-1, sum);
    }
    
	public static void main(String[] args) {
		int n=5, sum=0;
		
		printSum(n, sum);
	}
}