import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Всі методи статичні, бо клас не має жодних полів
public class StringProcessor {
    // Розрахунок кількості елементів за шаблоном
    public static int calculateElements(String str, Pattern pattern) {
        // Розділення рядку на частини
        String[] parts = str.split("\\s");

        int numbersCount = 0;
        for (String part : parts) {
            // Перевірка чи рядок пустий та чи підійшов під шаблон
            Matcher matcher = pattern.matcher(part);
            if (!part.isEmpty() && matcher.find()) {
                numbersCount++;
            }
        }

        return numbersCount;
    }

    // Прибираємо всі символи, що не є літерами
    public static String leaveOnlyLetters(String str) {
        return str.replaceAll("[^a-zA-Z]+", "");
    }

    // Прибираємо великі пропуски
    public static String removeMultipleSpaces(String str) {
        return str.replaceAll("\\s+", " ");
    }

    // Показуємо слова з великої літери
    public static String showWordsWithCapitalLetter(String str) {
        String[] parts = str.split("\\s");

        Pattern pattern = Pattern.compile("^[A-Z].");
        // Будемо будувати вихідний рядок по шматкам
        StringBuilder stringBuilder = new StringBuilder();
        for (String part : parts) {
            Matcher matcher = pattern.matcher(part);

            if (!part.isEmpty() && matcher.find()) {
                stringBuilder.append(part).append(" ");
            }
        }
        return stringBuilder.toString();
    }
}
