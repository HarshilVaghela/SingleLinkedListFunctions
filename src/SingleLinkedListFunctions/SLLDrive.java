package SingleLinkedListFunctions;
/**
 *
 * @author Harshilkumar Vaghela(3116318);
 * @date September 23,2020(Lab2);
 */
import java.util.LinkedList;
public class SLLDrive {

    public static void main(String[] args) {
        Pair<Book, Double> bid1 = new Pair<>(new Book
        ("Harry Potter and the Goblet of Fire","J.K. Rowling"), 10.49);
        Pair<Book, Double> bid2 = new Pair<>(new Book
        ("The Design of Everyday Things","Don Norman"), 12.49);

        double price=bid1.getSecond()+bid2.getSecond();
        
        System.out.println(bid1.getFirst());System.out.println(bid2.getFirst());
        System.out.println("Total price: $"+price);
        SinglyLinkedList<Integer> ints=new SinglyLinkedList<>();
        ints.addFirst(1);ints.addLast(2);ints.addLast(3);
        SinglyLinkedList<Pair<String,Integer>> weasley=new SinglyLinkedList<>();
        //adding contents to the list
        Pair<String,Integer> p1= new Pair<>("Bill",1);
       weasley.addFirst(p1);
        addPair(weasley,"Charlie",2);
        addPair(weasley,"Percy",3);
        addPair(weasley,"Fred",4);
        addPair(weasley,"George",5);
        addPair(weasley,"Ron",6);
        addPair(weasley,"Ginny",7);
        System.out.println("List of weasleys: "+weasley);
        Pair<String, Integer> pair=weasley.removeFirst();System.out.println("first: "+pair);
        Pair<String, Integer> pair2=weasley.removeFirst();System.out.println("first: "+pair2);
       
    }
    public static void addPair(SinglyLinkedList<Pair<String,Integer>> s, 
            String name, int number){
        s.addLast(new Pair<>(name,number));
    }

}

