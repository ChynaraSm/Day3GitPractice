public class FibonacciExample {

    public static void main(String[] args) {


        int n1=0, n2=1,n3,i,count=12;

        System.out.println(n1+","+n2);// printing 0 and 1

        for ( i = 2; i <count ; i++) { // loop starts from 2 bcz 0 and1 are already printed

            n3= n1+n2;

            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }

        }







    }

