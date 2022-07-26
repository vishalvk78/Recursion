class Recusrion {
    public static void printNum(int n)
    {
        //base condition
        if(n==0)
            return;
        //printNum
        System.out.print(n + " ");
        
        //recusrsive steps
        printNum(n-1);
        
        
        
    }
    
    public static void main(String[] args) {
        int n=5;
        
        printNum(n);
    }
}