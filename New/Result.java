package New;
import java.util.Scanner;

class Result{
    private String name;
    private int totalMarks;
    private String []subjects={"Maths","Chemistry","Phyiscs","English","History","CPP"};
    private int [] subjectMarks;
 
    // student names ke liye
    public Result (String name){
    this.name=name;
    this.subjectMarks= new int[6];
    }

    //sab subjects ke marks set krna h 
    public void setMarks(int index,int marks) {
        this.totalMarks +=marks;
        System.out.println("Enter marks  for "+this.subjects[index]+":"+marks);

    }
    // student ch total marks display 
    public int getTotalMarks(){
        return this.totalMarks;
    }
    // sgl total gheun percentage kdych
    public double getPercentage(){
        return (this.totalMarks /150*6)*100; // tq @sam bhai for this correction 
    }
    public void  showResult() {
        System.out.println("Student_Name : "+this.name);
        System.out.println("Subject\tMax Marks\tObtained Marks");
        for (int i = 0 ;i<6;i++) {
            System.out.println((this.subjects[i] + "\t" + 100 + "\t" + this.subjectMarks[i]));
        }
   

    double percentage = this.totalMarks/ (this.subjects.length*100)*100;
    System.out.println("The "+name + "Percentage is :" + percentage + "%");
    if (percentage >= 40) {
        System.out.println("Status: Passed");
    } else {
        System.out.println("Status: Carry forward");
    }
    
}
public class Main {
    public static void main(String args) {
       
          

        // get input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        Result user = new Result(name);

        // get marks for each subject from the user
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter marks for " + user.subjects[i] + ": ");
            int marks = scanner.nextInt();
            user.setMarks(i, marks);
            scanner.nextLine();
        }

        user.showResult();
    }
}


}