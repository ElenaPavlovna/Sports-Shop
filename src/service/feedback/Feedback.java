package service.feedback;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public interface Feedback {
    default void leaveFeedback()  {
        File f = new File("feedback/clientsFeedback.txt");
        try (FileWriter fw = new FileWriter(f,true)){
            Scanner scanner = new Scanner(System.in);
            if(!f.exists()) f.createNewFile();
            System.out.println("Оставьте здесь свой отзыв: ");
            fw.write(scanner.nextLine());
            fw.flush();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
