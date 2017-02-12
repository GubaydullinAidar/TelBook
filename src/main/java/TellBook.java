import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TellBook {

    public static void main(String[] args) throws IOException {
        ArrayList<String> phones1 = new ArrayList<String>();
        phones1.add("+8 800 2000 500");
        phones1.add("+8 800 2000 600");
        ArrayList<String> phones2 = new ArrayList<String>();
        phones2.add("+8 800 2000 700");
        ArrayList<String> phones3 = new ArrayList<String>();
        phones3.add("+8 800 2000 800");
        phones3.add("+8 800 2000 900");
        phones3.add("+8 800 2000 000");

        Map<String, ArrayList<String>> phoneBook = new HashMap<String, ArrayList<String>>();
        phoneBook.put("Иванов И.И.", phones1);
        phoneBook.put("Петров П.П.",phones2);
        phoneBook.put("Сидоров С.С.",phones3);

        System.out.println("Введите Ф.И.О:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        int numIter = 1;

        for (String key : phoneBook.keySet()) {

            if (key.equals(name)) {
                ArrayList<String> phoneNums = phoneBook.get(key);
                for (String phoneNum: phoneNums) {
                    System.out.println(phoneNum);
                }
                break;
            } else if (numIter == phoneBook.size()){
                System.out.println("Ф.И.О в базе данных отсутствует.");
            }
            numIter++;
        }
    }
}