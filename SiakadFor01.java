import java.util.Scanner;
public class SiakadFor01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int highest = 0;
        int lowest = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.println("Enter The Grade For Student " + i + ":");
            int grade = input.nextInt();
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
            }
            System.out.println("The Highest Grade : " + highest);
            System.out.println("The Lowest Grade : " + lowest);
               
            }

        }

    

