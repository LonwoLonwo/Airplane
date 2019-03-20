import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> airplaneNumbers = new Stack<>();

        System.out.println("Добро пожаловать. Сообщите ваш бортовой номер: ");

        for(; ;)
        {
            String s = reader.readLine();
            if(s.equals("exitAll"))
            {
                exitAll(airplaneNumbers);
                System.out.println("Все улетели.");
                //должна ли на этом программа остановить считывание с клавиатуры?
                break;
            }
            if(s.equals("exitLast"))
            {
                exitLast(airplaneNumbers);
                continue;
            }
            if(airplaneNumbers.size() == 5)
            {
                System.out.println("Ангар переполнен. Поищите себе другой ангар.");
                continue;
            }
            airplaneNumbers.push(s);
        }
    }

    //Выезжают все самолёты
    public static Stack<String> exitAll(Stack<String> airplaneNumbers)
    {
        for(int i = airplaneNumbers.size(); i > 0; i--)
        {
            System.out.println(airplaneNumbers.pop());
        }
        return airplaneNumbers;
    }

    //Выезжает последний самолёт
    public static Stack<String> exitLast(Stack<String> airplaneNumbers)
    {
            System.out.println(airplaneNumbers.pop());
            return airplaneNumbers;
    }
}
