public class wmakhoul1
{
	public static void main(String[] args)
	{
		int x1 = 10;
        	int y1 = 20;

        	int intResult1 = x1 + y1 * x1 / y1 - x1;
        	int intResult2 = -x1 - y1 / x1 * y1 + x1;
        	int intResult3 = x1 + y1 - x1 / y1;

        	double x2 = 10.5;
        	double y2 = 20.5;

        	double doubleResult1 = x2 + y2 * x2 / y2 - x2;
        	double doubleResult2 = -x2 - y2 / x2 * y2 + x2;
        	double doubleResult3 = x2 + y2 - x2 / y2;

        	System.out.printf("The integer result for (x + y * x / y -x): %d\n", intResult1);
        	System.out.printf("The integer result for (-x - y / x * y + x): %d\n", intResult2);
        	System.out.printf("The integer result for (x + y - x / y) %d\n", intResult3);

        	System.out.printf("The double result for (x + y * x / y -x): %f\n", doubleResult1);
        	System.out.printf("The double result for (-x - y / x * y + x): %f\n", doubleResult2);
        	System.out.printf("The double result for (x + y - x / y): %f\n", doubleResult3);
	}
}
