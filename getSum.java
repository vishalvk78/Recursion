public class Main
{   
    public static int getSum(int n)
    {
        if(n==0)
            return 0;
        
        return n+getSum(n-1);
    }
    
	public static void main(String[] args) {
		
		int n=4;
		int res=getSum(n);
		System.out.println("The sum of first natural " + n + " natural number is " + res);
	}
}