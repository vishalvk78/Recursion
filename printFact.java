public class Main
{   
    public static void printFact(int i, int n, int fact)
    {
        if(i==n)
        {
            fact=fact*i;
            System.out.println(" Factorial of " + n + " is " + fact);
            return;
        }
        
        fact=fact*i;
        printFact(i+1, n, fact);
    }
    
	public static void main(String[] args) {
		int n=5, i=1, fact=1;
		
		printFact(i,n,fact);
	}
}