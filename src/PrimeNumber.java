public class PrimeNumber {
    int i;
    int sum;
    public Boolean getPrimeNumber(int num)
    {

        if(num==2) {
            return true;
        }
        else
        {
            sum=0;
            for(i = 2; i<= Math.sqrt(num); i++)
            {


                if(num%i==0)
                {
                    sum++;
                }
            }
        }

        if(sum>=2)
            return false;
        else
            return true;
    }

    public static void main(String args[])
    {

        int num=17;

        PrimeNumber obj=new PrimeNumber();
        Boolean b=obj.getPrimeNumber(num);

        System.out.println(b);

    }
}
