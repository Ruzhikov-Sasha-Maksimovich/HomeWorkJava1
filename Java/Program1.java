public class Program1 {
    public static void main(String[] args) {
        int i;
        int j;
    int count=0;
    int mona=0;
    for(i = 2; i <= 1000; i++)
        {
        for (j = 2; j < i; j++) {
            if (i % j != 0) 
                count++;
        }
    if (count==i-2){
            System.out.println("prime number: %d\n", i);
            mona++;
            }
    count=0;
    }
}
}
