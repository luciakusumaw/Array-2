import java.util.Scanner;

public class Siakad13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();
        System.out.print("Enter number of courses: ");
        int courses = sc.nextInt();

        int[][] score = new int[students][courses];

        for (int i = 0; i < students; i++) {
            System.out.println("\nEnter scores for student #" + (i + 1));
            double sumStudent = 0;

            for (int j = 0; j < courses; j++) {
                System.out.print("Course #" + (j + 1) + " score: ");
                score[i][j] = sc.nextInt();
                sumStudent += score[i][j];
            }

            System.out.println("Average score: " + (sumStudent / courses));
        }

        System.out.println("\n--- Average Score Per Course ---");
        for (int j = 0; j < courses; j++) {
            double sumCourse = 0;
            for (int i = 0; i < students; i++) {
                sumCourse += score[i][j];
            }
            System.out.println("Course #" + (j + 1) + ": " + (sumCourse / students));
        }
    }
}

