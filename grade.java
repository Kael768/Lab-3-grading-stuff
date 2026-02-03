import java.util.Scanner;

public class grade{
    public static void main(String[] args) {
        result();
    }
    public static double homework(int total, int homeworkScore, int labsAttended){
        double homeworkRule = 50 * (homeworkScore * 10 + 4 * labsAttended) / (total * 10 + 4 * 10);
        return homeworkRule;
    }
    public static double exam01(int examScore1){
        return 20 * examScore1 / 100.0;
    }
    public static double exam02(int examScore2){
        return 30 * examScore2 / 100.0;
    }
    public static int finals(double homework, double exam01, double exam02){
        return (int)(homework + exam01 + exam02);    
    }
    public static void result(){
        int examScore1 = 85;
        int examScore2 = 90;
        Scanner input = new Scanner(System.in);
        System.out.println("Total labs and homework: ");
        int total = input.nextInt();
        System.out.print("Enter number of assignments: ");
        int assignments = input.nextInt();
        System.out.print("Enter number of labs attended: ");
        int labsAttended = input.nextInt(); 
        System.out.print("Enter total homework score: ");
        double homeworkScore = input.nextDouble();
        double homework = homework(total, (int)homeworkScore, labsAttended);
        double exam01 = exam01(examScore1);
        double exam02 = exam02(examScore2);
        int finalScore = finals(homework, exam01, exam02);
        System.out.println("Final score: " + finalScore);
        if(finalScore > 100){
            System.out.println("Final score: 100");
        } else {
            System.out.println("Final score: " + finalScore);
        }
        
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
