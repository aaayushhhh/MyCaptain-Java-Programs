public class MinsToYearsAndDays
{
    public static void main (String[] args)
    {
        int m = 3456789,y,d;
        //to find the actual years passed
        y = m / 525600;
        //to find the remaining days in the year
        d = (m / 60 /24) % 365;

        System.out.println(m + " minutes is approximately equal to " + y + " years and " + d + " days!");
    }
}
