import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee name: ");
        String name = sc.next();

        System.out.print("Enter hours that Employee have or will work to calculate his Total Pay: ");
        double hours = sc.nextDouble();

        System.out.println();
        System.out.println(new Employee(name, hours));
    }
}
