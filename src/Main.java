import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Ivan", "Sergey", "Irina", "Alexey", "Irina", "Ivan"};
        String string = array[0] + " ";
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i].equals(array[j])) {
                    array[i] = null;
                    break;
                }
            }
            if (array[i] != null) {
                string += array[i] + " ";
            }
        }
        System.out.println(string);
    }
}
