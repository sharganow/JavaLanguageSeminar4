import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class SumAllElements {
    static int sumList(LinkedList<StringBuilder> list){
        Deque<StringBuilder> deque = new LinkedList<StringBuilder>(list);
        int sumList = 0;
        Iterator<StringBuilder> it =  deque.iterator();
        while (true){
            try{
                sumList += Integer.parseInt(it.next().toString());
            }
            catch(Exception e){
                return sumList;
            }
        }
    }
    public static void main(String[] args){
        LinkedList<StringBuilder> originList = FlippedList.getFilledList(0, 9, 5);
        System.out.printf("Сумма Элементов массива %s равна %d",originList.toString(), sumList(originList));
    }
}
