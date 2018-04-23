# Calculate Average Grade Project

### Description

This project is a simple java program used to practice java loop and conditional statements. It calculates the semester grade using 5 assignment grades as 20%, Test1 as 15%, Test2 as 20%, LabGrade for 20%, and finally a Final Exam for 25%. It drops the lowest assignment grade, so after the 5 assignments are entered, it calculates the average of the highest 4 to get the assignment percentage. 

After all the grades are entered, It calculates the Letter Grade for the semester using the total grade after all the percentages are complete.

### To Run

Using terminal on Mac,

```
$ cd Calculate-Average-Grade
$ javac CalculateGrades.java
$ java CalculateGrades
```

### Output

This programs output is,
```
Please enter assignment grade1
100
Please enter assignment grade2
90
Please enter assignment grade3
80
Please enter assignment grade4
70
Please enter assignment grade5
60
After the lowest grade is dropped, your assignment average will be 85.0
Please enter 2 exam grades.
100
70
Please enter the lab grade
100
Please enter the grade of your final exam
80
The weighted average is: 85.0 * 20% + 100.0 * 15% + 70.0 * 20% + 100.0 * 20% + 80.0 * 25% = 86.0
You will recive a B.
Do you want to calculate for another student? Please type 'true' or 'false'.
false
Bye, bye!
```
