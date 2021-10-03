import java.math.BigDecimal;
import java.util.Arrays;

public class Tasks2 {
    @Override
    public String toString() {
        String output = "\nЗадачи по второму блоку:" +
                "\nПервая задача: " + repeat("mice", 5) +
                "\nВторая задача: " + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}) +
                "\nТретья задача: " + isAvgWhole(new int[]{1, 3, 2, 4}) +
                "\nЧетвертая задача: " + Arrays.toString(cumulativeSum(new int[]{1, 2, 3})) +
                "\nПятая задача: " + getDecimalPlaces("43.20") +
                "\nШестая задача: " + fibonacci(12) +
                "\nСедьмая задача: " + isValid("59001") +
                "\nВосьмая задача: " + isStrangePair("b", "a") +
                "\nДевятая задача isPrefix(): " + isPrefix("automation", "auto-") +
                "\nДевятая задача isSuffix(): " + isSuffix("arachnophobia", "-phobia") +
                "\nДесятая задача: " + boxSeq(0) + boxSeq(1) + boxSeq(2);
        return output;
    }

    /**
     * Повторяет каждый символ в строке n раз.
     * @param str
     * @param n
     * @return
     */
    public static String repeat(String str, int n) {
        StringBuilder output = new StringBuilder();
        for (char element : str.toCharArray()) {
            output.append(String.valueOf(element).repeat(n));
        }
        return output.toString();
    }

    /**
     * Возвращает разницу между самым большим и самым маленьким числом в списке.
     * @param array
     * @return
     */
    public static int differenceMaxMin(int[] array) {
        int maxValue = Arrays.stream(array).max().getAsInt();
        int minValue = Arrays.stream(array).min().getAsInt();
        return maxValue - minValue;
    }

    /**
     * Проверяет, является ли среднее значение массива целым числом.
     * @param array
     * @return
     */
    public static boolean isAvgWhole(int[] array) {
        double sum = 0;
        for (int element : array) {
            sum += element;
        }
        double avgValue = sum / array.length;
        return avgValue % 1 == 0;
    }

    /**
     * Возвращает массив, в котором каждое число является суммой самого себя и всех предыдущих в массиве.
     * @param array
     * @return
     */
    public static int[] cumulativeSum(int[] array) {
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i - 1];
        }
        return array;
    }

    /**
     * Возвращает количество десятичных знаков после запятой.
     * @param number
     * @return
     */
    public static int getDecimalPlaces(String number) {
        return new BigDecimal(number).scale();
    }

    /**
     * Возвращает соответствующее число Фибоначчи.
     * @param number
     * @return
     */
    public static int fibonacci(int number) {
        switch (number) {
            case 1:
            case 2:
                return 1;
        }
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

    /**
     * Проверяет почтовый индекс на валидность. Почтовый индекс должен состоять из 5 подряд идущих цифр.
     * @param postcode
     * @return
     */
    public static boolean isValid(String postcode) {
        return postcode.matches("^\\d{5}$");
    }

    /**
     * Проверяет, является ли пара строк странной парой.
     * Пара строк образует странную пару, если оба из следующих условий истинны:
     * Первая буква 1-й строки = последняя буква 2-й строки.
     * Последняя буква 1-й строки = первая буква 2-й строки.
     * @param firstString
     * @param secondString
     * @return
     */
    public static boolean isStrangePair(String firstString, String secondString) {
        // если обе строки пустые
        if (firstString.isEmpty() && firstString.equals(secondString)) return true;
        // если одна пустая
        if (firstString.isEmpty() || secondString.isEmpty()) return false;
        return (firstString.charAt(0) == secondString.charAt(secondString.length() - 1)) &&
                (firstString.charAt(firstString.length() - 1) == secondString.charAt(0));
    }

    /**
     * Проверяет, начинается ли строка с префиксного аргумента.
     * @param word
     * @param prefix
     * @return
     */
    public static boolean isPrefix(String word, String prefix) {
        return word.startsWith(prefix.substring(0, prefix.indexOf('-')));
    }

    /**
     * Проверяет, заканчивается ли строка аргументом суффикса.
     * @param word
     * @param prefix
     * @return
     */
    public static boolean isSuffix(String word, String prefix) {
        return word.endsWith(prefix.substring(1));
    }

    /**
     * Возвращает количество полей на шаге последовательности.
     * @param step
     * @return
     */
    public static int boxSeq(int step) {
        if (step % 2 == 0) {
            return step;
        } else {
            return step + 2;
        }
    }
}
