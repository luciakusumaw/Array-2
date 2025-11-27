import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int respond = 10, question = 6;
        int [][] surveyData = new int [respond][question];

        // Input data
        for (int i = 0; i < respond; i++) {
            System.out.println("Respondent " + (i+1) + ": ");
            for (int j = 0; j < question; j++) {
                System.out.print("Score for Question " + (j+1) + " is: ");
                surveyData[i][j] = sc.nextInt();
            }
        }

        // Average per Respondent
        System.out.println("\nAverage Per Respondent:");
        for (int i = 0; i < respond; i++) {
            int sum = 0;
            for (int j = 0; j < question; j++) {
                sum += surveyData[i][j];
            }
            System.out.println("Respondent " + (i+1) + " average is: " + (sum / (double) question));
        }

        // Average per Question
        System.out.println("\nAverage Per Question:");
        for (int j = 0; j < question; j++) {
            int sum = 0;
            for (int i = 0; i < respond; i++) {
                sum += surveyData[i][j];
            }
            System.out.println("Question " + (j+1) + " average is: " + (sum / (double) respond));
        }

        // Overall Average
        System.out.println("\nOverall Average:");
        int totalSum = 0;
        for (int i = 0; i < respond; i++) {
            for (int j = 0; j < question; j++) {
                totalSum += surveyData[i][j];
            }
        }

        double overallAvg = totalSum / (double)(respond * question);
        System.out.println("Overall Survey Average Score is: " + overallAvg);
    }
}
