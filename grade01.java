import java.util.Scanner;

public class grade01{
    public static void main(String[] args) {
        result();//this is python syntax sorry not use to it
    }



    public static double AttendenceLab(int labsAttended, int total, double homeworkRule){
        if (labsAttended < (total/2)){
            homeworkRule = homeworkRule * 0.9;//if labs attended is less than half, 10% deduction
        }
        else if (labsAttended == total){
            homeworkRule = homeworkRule + 5;//if all labs attended, 5 extra credit
        }
        return homeworkRule;//we will call them in homework function
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
        if(finalScore > 100){
            System.out.println("Final score: 100");
        } else {
            System.out.println("Final score: " + finalScore);
        }
    input.close();
    }
}


//exam 1, 2, homework
//homework = 10 points each 
//lab = 4 points
//same total of labs and homework
//user input the number of assingment
// numbers of lab attended and homework scores
// late = 10 % deduction if the total late is more then the total of 50%
//5 extra credit for a student that had no late assingment
//extra finals are the same as maximum. students can get a 105 out of 100. that 105 is changed to 100