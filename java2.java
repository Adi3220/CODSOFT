//TASK-2:Student Grade Calculator
import java.util.*;

public class java2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Submit the marks out of 100");
        System.out.println("DBMS:");
        int DBMS = sc.nextInt();
        System.out.println("Computer Network:");
        int CN = sc.nextInt();
        System.out.println("Artificial Intelligence");
        int AI = sc.nextInt();
        System.out.println("Human Computer Interface:");
        int HCI = sc.nextInt();
        System.out.println("Theory of Computation:");
        int TOC = sc.nextInt();

        int totalMarks = DBMS+CN+AI+HCI+TOC;
        int avgPercent = (totalMarks*100)/500;
        String Grade = " ";

        if(avgPercent>=0 && avgPercent<=35){
            Grade = "F";
        }
        else if(avgPercent<=50){
            Grade = "E";
        }
        else if(avgPercent<=60){
            Grade = "D";
        }
        else if(avgPercent<=70){
            Grade = "C";
        }
        else if(avgPercent<=80){
            Grade = "B";
        }
        else if(avgPercent<=90){
            Grade = "A";
        }
        else{
            Grade = "O";
        }

        System.out.println("Your total marks are:"+ totalMarks +"/500");
        System.out.println("Average Percentage is "+ avgPercent +"%");
        System.out.println("Your Grade is "+ Grade);
    }
}
