// 1. Создать список типа ArrayList<String>. Поместить в него как строки, так и целые числа. Пройти по списку, найти и удалить целые числа.
// Пример: {"Яблоко", "11", "13", "Апельсин", "Дыня", "17"} -> {"Яблоко", "Апельсин", "Дыня"}

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] newList = { "Яблоко", "11", "13", "Апельсин", "Дыня", "17" };
        for (String elem : newList) {
            // System.out.println(elem);         
                      
            try {
                // String преобразуется в int:
                int convertedElem = Integer.parseInt(elem.trim());
                System.out.print(convertedElem + " ");
                

            } catch (NumberFormatException nfe) {  // удаление элемента если преобр-е невозможно
                elem = null;
            }
        }
    }

}
