package app;

public class ArrayUtils {

    @MethodInfo(name = "findMax", returnType = "int", description = "Пошук максимального значення в масиві")
    @Author(firstName = "Павло", lastName = "Петронюк")
    public int findMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    @MethodInfo(name = "calculateSum", returnType = "int", description = "Обчислення суми елементів масиву")
    @Author(firstName = "Марія", lastName = "Петронюк")
    public int calculateSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
