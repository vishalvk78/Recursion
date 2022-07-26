class Recusrion {
    public static void printNumbers(int n)
    {
        //base condition
        if(n==0)
            return;
        
        //recusrsive steps
        printNumbers(n-1);
        
        //printNum
        System.out.print(n + " ");
        
        //recusrsive steps
        printNumbers(n-1);
        
        
    
    }
    
    public static void main(String[] args) {
        int n=3;
        
        printNumbers(n);
    }
}