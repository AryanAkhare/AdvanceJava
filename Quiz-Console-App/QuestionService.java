import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String selection[]=new String[5];
    public QuestionService(){
        questions[0] = new Question(2, "What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");

questions[1] = new Question(3, "Which language is used for Android development?", "Python", "Swift", "Java", "C#", "Java");

questions[2] = new Question(4, "Who developed Java?", "Microsoft", "Sun Microsystems", "Google", "Apple", "Sun Microsystems");

questions[3] = new Question(5, "Which data structure uses FIFO?", "Stack", "Tree", "Queue", "Graph", "Queue");

questions[4] = new Question(6, "Which keyword is used to inherit a class in Java?", "this", "super", "implements", "extends", "extends");

        
    }

    public void printScore(){
        int score=0;
        for(int i=0; i<questions.length;i++){
            Question ques=questions[i];
            String answer=ques.getAnswer();

            String userAnswer=selection[i];

            if(answer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is : "+score);
    }
    public void playQuiz(){
        int j=0;
        for(Question q:questions){
            System.out.println("Question number : " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());

            Scanner sc=new Scanner(System.in);
            selection[j]=sc.nextLine();
            j++;
            for(String s: selection)
            {
                System.out.println(s);
            }

        }
        
    }
}
