import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Quiz {
    Scanner sc = new Scanner(System.in);
    int correctAnsCount = 0;
    int wrongAnsCount = 0;

    public void logic() {
        // Define the Questions and Answers
        Question q1 = new Question("What is the purpose of using variables in Java?",
                "A. To store and manipulate data ",
                "B. To control the flow of a program ",
                "C. To handle exceptions and errors ",
                "D. To create graphical interfaces ");

        Question q2 = new Question("Which control statement in Java is used to repeat a block of code multiple times?",
                "A.  if statement", "B. for loop", "C.switch statement", "D. while loop");

        Question q3 = new Question("What is the main advantage of object-oriented programming in Java? ",
                "A. Increased program reliability", "B. Faster program execution", "C. Simpler syntax and code structure", "D. Greater memory efficiency");

        Question q4 = new Question("What is the difference between arrays and collections in Java?",
                "A  Arrays have a fixed size, while collections are dynamic. ",
                "B. Arrays can hold elements of different types, while collections store elements of the same type.",
                "C. Arrays provide easy resizing, while collections offer direct element access.",
                "D. Arrays are used for file handling, while collections are used for exception handling.");

        Question q5 = new Question("What is the purpose of exception handling in Java?",
                "A. To manage runtime errors and prevent program crashes",
                "B. To control the flow of a program based on conditions",
                "C. To handle file operations and manipulation",
                "D. To enable concurrent execution of multiple threads");
        // Create a map of Questions and Correct Answers
        Map<Question, Character> questionAnswerMap = new HashMap<>();
        questionAnswerMap.put(q1, 'A');
        questionAnswerMap.put(q2, 'B');
        questionAnswerMap.put(q3, 'A');
        questionAnswerMap.put(q4, 'A');
        questionAnswerMap.put(q5, 'A');



        // Iterate through the questions and prompt the user for answers
        for (Map.Entry<Question, Character> entry : questionAnswerMap.entrySet()) {
            Question question = entry.getKey();
            Character answer = entry.getValue();

            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            System.out.print("Enter Your Answer: ");
            Character userAnswer = sc.next().charAt(0);

            if (userAnswer.equals(answer)) {
                System.out.println("Correct");
                correctAnsCount++;
            } else {
                System.out.println("Wrong");
                wrongAnsCount++;
            }
        }

        // Display the quiz results
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***********--------COURSE COMPLETION CERTIFICATE---------**********");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Total Questions: " + questionAnswerMap.size() +"                         ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Correct Answered Questions: " + correctAnsCount+"              ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Wrong Answered Questions: " + wrongAnsCount+"                ***");
        int percentage = (100 * correctAnsCount) / questionAnswerMap.size();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Percentage: " + percentage+"                             ***");

        if (percentage > 95) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Good                     ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else if (percentage < 35) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Low                      ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Medium                        ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        }
    }

    public void web(){
        Question q1= new Question("What is the primary purpose of CSS in web development?",
                "A. To structure web pages." ,
                "B. To handle client-side events.",
                "C. To interact with databases.",
                "D. To style and format HTML elements");

        Question q2= new Question("Which programming language is commonly used for client-side interactivity in Java-based web development?",
                "A. HTML" ,
                "B. CSS",
                "C. JavaScript",
                "D. Java");

        Question q3= new Question("What does DOM manipulation involve in Java-based web development?",
                "A. Dynamically modifying web pages using the Document Object Model",
                "B. Creating server-side components with Java" ,
                "C. Storing and managing data using databases" ,
                "D. Integrating external APIs into applications" );


        Question q4= new Question("What does responsive web design aim to achieve in Java-based web development?",
                "A.  Adapting web applications to different screen sizes and devices" ,
                "B. Styling and formatting HTML elements",
                "C. Manipulating the Document Object Model" ,
                "D. Integrating front-end frameworks" );

        Question q5= new Question("Which front-end frameworks are commonly used in Java-based web development?" ,
                "A. React and Angular",
                "B. Node.js and Express" ,
                "C. HTML and CSS",
                "D. Java and JavaScript");

        Map<Question, Character> questionAnswerMap = new HashMap<>();
        questionAnswerMap.put(q1, 'D');
        questionAnswerMap.put(q2, 'C');
        questionAnswerMap.put(q3, 'A');
        questionAnswerMap.put(q4, 'A');
        questionAnswerMap.put(q5, 'A');



        // Iterate through the questions and prompt the user for answers
        for (Map.Entry<Question, Character> entry : questionAnswerMap.entrySet()) {
            Question question = entry.getKey();
            Character answer = entry.getValue();

            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            System.out.print("Enter Your Answer: ");
            Character userAnswer = sc.next().charAt(0);

            if (userAnswer.equals(answer)) {
                System.out.println("Correct");
                correctAnsCount++;
            } else {
                System.out.println("Wrong");
                wrongAnsCount++;
            }
        }

        // Display the quiz results
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***********--------COURSE COMPLETION CERTIFICATE---------**********");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Total Questions: " + questionAnswerMap.size() +"                         ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Correct Answered Questions: " + correctAnsCount+"              ***");
         System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Wrong Answered Questions: " + wrongAnsCount+"                ***");
        int percentage = (100 * correctAnsCount) / questionAnswerMap.size();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Percentage: " + percentage+"                             ***");

        if (percentage > 95) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Good                     ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else if (percentage < 35) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Low                      ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Medium                        ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        }

    }

    public void data(){
        Question q1= new Question("What is the purpose of data cleaning and preprocessing in data science?" ,
                "A. To visually analyze datasets and uncover patterns",
                "B. To train models using labeled data",
                "C. To prepare raw data for analysis by removing errors and inconsistencies",
                "D. To process and analyze large datasets for valuable insights");

        Question q2= new Question("What does exploratory data analysis (EDA) involve in data science?",
                "A. Training models with labeled data",
                "B. Analyzing unlabeled data to discover patterns" ,
                "C. Cleaning and preprocessing datasets",
                "D. Visually and statistically analyzing datasets to uncover patterns and gain insights");

        Question q3=new Question("What is the main goal of supervised learning in data science?",
                "A. To analyze unlabeled data and extract meaningful insights",
                "B. To train models with labeled data to make predictions or estimate values",
                "C. To assess the performance of machine learning models",
                "D. To process and analyze large datasets for valuable insights");

        Question q4=new Question("What is the purpose of model evaluation and selection in data science?",
                "A. To visually analyze datasets and uncover patterns",
                "B. To prepare raw data for analysis by removing errors and inconsistencies",
                "C. To assess the performance of machine learning models and choose the most suitable one",
                "D. To process and analyze large datasets for valuable insights");

        Question q5= new Question("What is the role of data visualization in data science?",
                "A. To visually analyze datasets and uncover patterns",
                "B. To train models with labeled data",
                "C. To process and analyze large datasets for valuable insights",
                "D. To prepare raw data for analysis by removing errors and inconsistencies");

        Map<Question, Character> questionAnswerMap = new HashMap<>();
        questionAnswerMap.put(q1, 'C');
        questionAnswerMap.put(q2, 'D');
        questionAnswerMap.put(q3, 'B');
        questionAnswerMap.put(q4, 'C');
        questionAnswerMap.put(q5, 'A');



        // Iterate through the questions and prompt the user for answers
        for (Map.Entry<Question, Character> entry : questionAnswerMap.entrySet()) {
            Question question = entry.getKey();
            Character answer = entry.getValue();

            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            System.out.print("Enter Your Answer: ");
            Character userAnswer = sc.next().charAt(0);

            if (userAnswer.equals(answer)) {
                System.out.println("Correct");
                correctAnsCount++;
            } else {
                System.out.println("Wrong");
                wrongAnsCount++;
            }
        }

        // Display the quiz results
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***********--------COURSE COMPLETION CERTIFICATE---------**********");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Total Questions: " + questionAnswerMap.size() +"                         ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Correct Answered Questions: " + correctAnsCount+"              ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Wrong Answered Questions: " + wrongAnsCount+"                ***");
        int percentage = (100 * correctAnsCount) / questionAnswerMap.size();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Percentage: " + percentage+"                             ***");

        if (percentage > 95) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Good                     ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else if (percentage < 35) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Low                      ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Medium                        ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        }
    }
    public void mobile(){
        Question q1= new Question("Which programming language is commonly used for mobile app development in Java?",
                "A. Swift",
                "B. JavaScript",
                "C. Kotlin",
                "D. Java");

        Question q2=new Question("What is the role of User Interface (UI) design in mobile app development?",
                "A. Creating visually appealing interfaces using JavaFX and Swing",
                "B. Verifying app functionality, performance, and stability",
                "C. Creating preliminary interactive representations of mobile apps",
                "D. Packaging apps into distributable formats for publishing");

        Question q3= new Question("What is the main advantage of using React Native for mobile app development?",
                "A. Fast development cycle",
                "B. Interoperability with Java",
                "C. Feature-rich iOS app development",
                "D. Native component utilization");

        Question q4= new Question("Which languages are commonly used for Android development?",
                "A. Swift and Kotlin",
                "B. Java and Swift",
                "C. Java and Kotlin",
                "D. Java and JavaScript");

        Question q5= new Question("What is the purpose of app testing and debugging in Java mobile app development?",
                "A. Creating preliminary interactive representations of mobile apps",
                "B. Packaging apps into distributable formats for publishing",
                "C. Verifying app functionality, performance, and stability",
                "D. Creating visually appealing interfaces using JavaFX and Swing");

        Map<Question, Character> questionAnswerMap = new HashMap<>();
        questionAnswerMap.put(q1, 'D');
        questionAnswerMap.put(q2, 'A');
        questionAnswerMap.put(q3, 'A');
        questionAnswerMap.put(q4, 'C');
        questionAnswerMap.put(q5, 'C');



        // Iterate through the questions and prompt the user for answers
        for (Map.Entry<Question, Character> entry : questionAnswerMap.entrySet()) {
            Question question = entry.getKey();
            Character answer = entry.getValue();

            System.out.println(question.getQuestion());
            System.out.println(question.getOption1());
            System.out.println(question.getOption2());
            System.out.println(question.getOption3());
            System.out.println(question.getOption4());

            System.out.print("Enter Your Answer: ");
            Character userAnswer = sc.next().charAt(0);

            if (userAnswer.equals(answer)) {
                System.out.println("Correct");
                correctAnsCount++;
            } else {
                System.out.println("Wrong");
                wrongAnsCount++;
            }
        }

        // Display the quiz results
        System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***********--------COURSE COMPLETION CERTIFICATE---------**********");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Total Questions: " + questionAnswerMap.size() +"                         ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Correct Answered Questions: " + correctAnsCount+"              ***");
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Wrong Answered Questions: " + wrongAnsCount+"                ***");
        int percentage = (100 * correctAnsCount) / questionAnswerMap.size();
        System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Percentage: " + percentage+"                             ***");

        if (percentage > 95) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Good                     ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else if (percentage < 35) {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Very Low                      ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        } else {
            System.out.println("\t\t\t\t\t\t\t\t\t\t***                  Performance: Medium                        ***");
            System.out.println("\t\t\t\t\t\t\t\t\t\t***********----------------------------------------------**********");
        }
    }
}
