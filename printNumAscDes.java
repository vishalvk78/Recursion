class Recusrion {
    public static void printNumAscDes(int n)
    {
        //base condition
        if(n==0)
            return;
        //printNum
        System.out.print(n + " ");
        
        //recusrsive steps
        printNumAscDes(n-1);
        
        System.out.print(n + " ");
    
    }
    
    public static void main(String[] args) {
        int n=3;
        
        printNumAscDes(n);
    }
}