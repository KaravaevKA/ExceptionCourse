package tasks;

import java.util.Scanner;

public class Task4 {
    public static void result() {
        try {
            System.out.println("Ex4 result - " + getStr());
        }
        catch (EmptyStringException e) {
            System.out.println(e);
        }
    }

    static String getStr() throws EmptyStringException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string: ");
        String result = scan.nextLine();
        if (result.isEmpty()) {
            throw new EmptyStringException("Нельзя вводить пустую строку!");
        }
        return result;
    }
}

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}
