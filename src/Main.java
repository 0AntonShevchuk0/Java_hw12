import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    // Початок програми
    public static void main(String[] args) {
        // Введення даних
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Шаблони слів та чисел
        Pattern wordsPattern = Pattern.compile("[^.,\\-+0-9]");
        Pattern numbersPattern = Pattern.compile("^[+\\-]?[0-9]*[.,]?[0-9]+$");

        // Виведення
        System.out.println("Words: " + StringProcessor.calculateElements(input, wordsPattern));
        System.out.println("Numbers: " + StringProcessor.calculateElements(input, numbersPattern));
        System.out.println("Letters only: " + StringProcessor.leaveOnlyLetters(input));
        System.out.println("Only single spaces: " + StringProcessor.removeMultipleSpaces(input));
        System.out.println("Only words with capital letters: " + StringProcessor.showWordsWithCapitalLetter(input));
    }
}
