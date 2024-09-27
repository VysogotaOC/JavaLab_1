import com.sun.source.doctree.SystemPropertyTree;

import java.util.Scanner;

public class Main {

    static void lab1_1() {
        System.out.print("Enter your 'N' value: ");
        Scanner input_scan = new Scanner(System.in);
        int input_var_n = Integer.parseInt(input_scan.nextLine());
        int counter = 0;
        while (input_var_n != 1) {
            if (input_var_n % 2 == 0) {
                input_var_n = input_var_n / 2;
            } else {
                input_var_n = 3 * input_var_n + 1;
            }
            counter += 1;
        }
        System.out.println(counter);
    }

    static void lab1_2() {
        System.out.print("Enter your number of variables: ");
        Scanner input_scan = new Scanner(System.in);
        int input_var_n = Integer.parseInt(input_scan.nextLine());
        int counter_for_answer = 0;
        for (int i = 1; i <= input_var_n; i++) {
            String output_var = "Enter your " + i + " value: ";
            System.out.printf(output_var);
            int temp = Integer.parseInt(input_scan.nextLine());
            if (i % 2 != 0) {
                counter_for_answer += temp;
            } else {
                counter_for_answer -= temp;
            }
        }
        System.out.println(counter_for_answer);
    }

    static void lab1_3() {
        Scanner input_scan = new Scanner(System.in);

        System.out.print("Enter x coordinate where One Piece is: ");
        int x_treasure = Integer.parseInt(input_scan.nextLine());
        System.out.print("Enter y coordinate where One Piece is: ");
        int y_treasure = Integer.parseInt(input_scan.nextLine());
        int counter_for_answer = 0;
        int starting_x = 0;
        int starting_y = 0;
        while (true) {
            System.out.print("Enter your direction: ");
            String direction = input_scan.nextLine();

            if(direction.equals("стоп")) {
                break;
            }

            System.out.print("Enter how many steps to take: ");
            int direction_value = Integer.parseInt(input_scan.nextLine());

            if(!(x_treasure == starting_x && y_treasure == starting_y)) {
                if (direction.equals("запад")) {
                    starting_x -= direction_value;
                } else if (direction.equals("восток")) {
                    starting_x += direction_value;
                } else if (direction.equals("север")) {
                    starting_y += direction_value;
                } else {
                    starting_y -= direction_value;
                }
                counter_for_answer += 1;
            }

        }
        System.out.println(counter_for_answer);
    }

    static void lab1_4() {
        System.out.print("Enter the number of roads: ");
        Scanner input_scan = new Scanner(System.in);
        int input_var_n = Integer.parseInt(input_scan.nextLine());
        int[] array = new int[input_var_n];
        Integer my_pos_inf = Integer.MAX_VALUE;

        for (int i = 0; i < input_var_n; i++) {
            int min_height = my_pos_inf;

            System.out.print("Enter the number of the tunnels on this road: ");
            int number_of_tunnels = Integer.parseInt(input_scan.nextLine());
            for(int j = 0; j < number_of_tunnels; j++) {
                System.out.print("Enter the height of the tunnels on this road: ");
                int temp = Integer.parseInt(input_scan.nextLine());
                if (temp < min_height) {
                    min_height = temp;
                }
            }
            array[i] = min_height;
        }
        int temp = array[0];
        int index_answer = 0;
        for (int i = 1; i < input_var_n; i++) {
            if (temp < array[i]) {
                temp = array[i];
                index_answer = i + 1;
            }
        }
        System.out.println(index_answer + " " + temp);
    }

    static void lab1_5() {
        System.out.print("Enter your number: ");
        Scanner input_scan = new Scanner(System.in);
        String users_input = input_scan.nextLine();
        LabFifth result = new LabFifth();
        boolean temp = result.IsDoubleEven(users_input);
        System.out.println(temp);
    }

    public static void main(String[] args) {
        Scanner input_scan = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the number of your task: ");
            String users_input = input_scan.nextLine();
            switch (users_input) {
                case "1":
                    lab1_1();
                    break;
                case "2":
                    lab1_2();
                    break;
                case "3":
                    lab1_3();
                    break;
                case "4":
                    lab1_4();
                    break;
                case "5":
                    lab1_5();
                    break;
                case "stop":
                    return;
            }
        }

    }
}