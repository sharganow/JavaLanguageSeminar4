import java.util.Deque;
import java.util.LinkedList;

/*Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.  */

public class Queuelist {
    static void enqueue(LinkedList<StringBuilder> list, StringBuilder element){
        list.offerLast(element);
    }
    static StringBuilder dequeue(LinkedList<StringBuilder> list){
            try {
                return list.removeFirst();
            } catch (Exception e) {
                return new StringBuilder().append(e);
            }
    }
    static StringBuilder first(LinkedList<StringBuilder> list){
        try {
            return list.getFirst();
        } catch (Exception e) {
            return new StringBuilder().append(e);
        }
    }
    public static void main(String[] args){
        LinkedList<StringBuilder> originList = FlippedList.getFilledList(0, 2147483647, 5);// С большими числами проблем нет
        StringBuilder firstElement = first(originList);
        System.out.println(originList);
        do{
            enqueue(originList, dequeue(originList));
            System.out.println(originList);
        }while (firstElement != first(originList));
    }
}
