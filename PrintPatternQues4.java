package assignment1;
//Question 4: WAP to print
public class PrintPatternQues4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noOfRows=8;
		int noOfColumns=14;
		for(int i=0;i<noOfRows;i++)
		{
			for(int j=0;j<noOfColumns;j++)
			{
				if(i==noOfRows-1 || j==noOfColumns-1 || i>=j || j==0 || i+j>=noOfColumns-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
