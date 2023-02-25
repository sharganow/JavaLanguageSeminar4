import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;

public class FlippedList {
    static int getRandomInt(int start, int stop){
        double returnInt;
        double equaliser = 2.147483648e+9;
        Random rnd = new Random();
        long random = rnd.nextInt();
        if(random < 0) random *= -1;
        long delta = stop - start;
        returnInt = ((double)(random * delta)/equaliser) + (double) start;
        double ost = (double)stop - returnInt;
        if(ost < 0.5) returnInt = (double)stop + 0.5;
        return (int)returnInt;
    }

    static LinkedList<StringBuilder> getFilledList(int start, int stop, int size){
        LinkedList<StringBuilder> list = new LinkedList<>();
        for(int i = 0; i < size; i++){
            list.add(new StringBuilder().append(getRandomInt(start, stop)));
        }
        return list;
    }

    static LinkedList<StringBuilder> getFlippedList(LinkedList<StringBuilder> list){
        Stack<StringBuilder> stack = new Stack<>();
        for(StringBuilder o: list){
            stack.push(o);
        }
        LinkedList<StringBuilder> newFlippedList = new LinkedList<>();
        for(;stack.size() > 0 ;){
            newFlippedList.add(stack.pop());
        }
        return newFlippedList;
    }

    public static void main(String[] args){
        LinkedList<StringBuilder> originList = getFilledList(0, 100, 5);
        LinkedList<StringBuilder> newFlippedList = getFlippedList(originList);
        System.out.println(originList);
        System.out.println(newFlippedList);
    }
}
