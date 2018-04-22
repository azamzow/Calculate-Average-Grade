/**
 @Title: CalculateGrades
 @Purpose: To practice java loop and conditional statements.
 @Author: Avery Zamzow
 @Date: 2/25/15
 @Version: 1.0
 */

import java.util.Scanner;
public class CalculateGrades
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		double score;
		double lowest;
		double sum; 
		boolean input=true;
		
		do {
			
			sum = 0;
			lowest = 100; 
			for (int i=1;i<=5;i++){
				System.out.println("Please enter assignment grade" +i);	
			     score = sc.nextDouble();
			     sum=sum+score;
			     if(score<lowest)
			     {
			    	 lowest=score;
			     }
			}
			sum=sum-lowest;
			double average = sum/ 4;
		
			System.out.println("After the lowest grade is dropped, your assignment average will be " + average);
		
			System.out.println("Please enter 2 exam grades.");
			double exam1 = sc.nextDouble();
			double exam2 = sc.nextDouble();
		
			System.out.println("Please enter the lab grade");
			double labGrade = sc.nextDouble();
		
			System.out.println("Please enter the grade of your final exam");
			double finalExam = sc.nextDouble();
			double finalAverage = (average * .20) + (exam1 * .15) + (exam2 * .20) + (labGrade * .20) + (finalExam * .25);
				
			System.out.println("The weighted average is: " + average + " * 20% + " + exam1 + " * 15% + " + exam2 + 
				                                         " * 20% + " + labGrade + " * 20% + " + finalExam + " * 25% = " + finalAverage);
			if(finalAverage < 60){
				System.out.println("You will recive a F.");
			}
			else if (finalAverage >=60 && finalAverage <70){
				System.out.println("You will recive a D.");
			}
			else if (finalAverage >=70 && finalAverage <80){
				System.out.println("You will recive a C.");
			}
			else if (finalAverage >=80 && finalAverage <90){
				System.out.println("You will recive a B.");
			}
			else {
				System.out.println("You will recive a A.");
			}
		
			System.out.println("Do you want to calculate for another student? Please type 'true' or 'false'. ");
			input=sc.nextBoolean();
		}
		while (input);
		System.out.println("Bye, bye! ");
		}
}


			
