import java.util.Scanner;

public class grade01{
    public static void main(String[] args) {
        result();
        //rules:
        //Exam 1 = 20%
        //Exam 2 = 30%
        //Homework, assignments(not separate) = 50%% *
        //labs total are 10(needed user input)
        //exam 1 & 2 is 100 (goto the result function where it says examScore1 and 2)
        //the max score was 100 and the final can't get higher than 100
        //no late attendance gets a 5 point credit reward.
        //more than 50 total late attendance, the 50% maybe reduced to 40% of the total grade is reduced more by 10% after the homework equation
        //conclusion is getting 2 or even one can delete 2-6 points. even if you got a 100
        //rough rule
    }



    public static double AttendenceLab(int labsAttended, int total, double homeworkRule){
        if (labsAttended < (total/2)){
            homeworkRule = homeworkRule * 0.9;//if labs attended are less than half, 10% deduction
        }
        else if (labsAttended == total){
            homeworkRule = homeworkRule + 5;//if all labs attended, 5 extra credit
        }
        return homeworkRule;//we will call them in the homework function
    }
    
    public static double homework(int total, int homeworkScore, int labsAttended){//this one 
        double homeworkRule = 50 * (homeworkScore * 10 + 4 * labsAttended) / (total * 10 + 4 * 10);
        homeworkRule = AttendenceLab(labsAttended, total, homeworkRule);//call the attendence lab function
        return homeworkRule;
    }
    
    public static double exam01(int examScore1){
        return 20 * examScore1 / 100.0;
    }
    
    public static double exam02(int examScore2){
        if (examScore2 > 94){
            examScore2 += 10;
            if (examScore2 > 100){
                examScore2 = 100;
            }
        }
        return 30 * examScore2 / 100.0;
    }
    
    public static double finals(double homework, double exam01, double exam02){
        double finalScore = homework + exam01 + exam02;
        return finalScore;
    }



    public static void result(){//the body of the program
        int examScore1 = 100;
        int examScore2 = 100;
        Scanner input = new Scanner(System.in);
        System.out.print("Total labs and homework: ");
        int total = input.nextInt();
        System.out.print("Enter number of labs attended: ");
        int labsAttended = input.nextInt(); 
        System.out.print("Enter total homework score: ");
        double homeworkScore = input.nextDouble();
        double homework = homework(total, (int)homeworkScore, labsAttended);
        double exam01 = exam01(examScore1);
        double exam02 = exam02(examScore2);
        double finalScore = finals(homework, exam01, exam02);
        System.out.println("Final score: " + finalScore);
        if(finalScore > 100){ //score can't be more than 100(no extra credit)
            System.out.println("Final score: 100");
        } 
        else {
            System.out.println("Final score: " + finalScore);
        }
    input.close();
    }
}


