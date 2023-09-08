package tasks.homework3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String  inputData = scanner.next();
            String[] data = inputData.split(" ");
            if (data.length != 6){
                throw new IllegalArgumentException("Неверное количество данных");
            }
            String surname = data[0];
            String name = data[1];
            String patronymic = data [2];
            LocalDateTime date = LocalDateTime.parse(data[3]);
            String phone = data[4];
            String gender = data[5];
            String record = "name: " + name + ", surname: " + surname + ", patronymic: " + patronymic + ", birth date: " + date + ", phone number: " + phone + ", gender: " + gender;

            FileWriter writer = new FileWriter("tasks/homework3" + surname + ".txt");
            writer.write(record);

        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Стек вызовов: " + e.getStackTrace());
        }
    }

}
