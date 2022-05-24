package SingleLinkedListFunctions;
/**
 *
 * @author Harshilkumar Vaghela(3116318);
 * @date September 23,2020(Lab2);
 */
public class Book {
   private String title;
   private String author;

    public Book() {
        this("Unknown","Unknown");
    }
    public Book(String t, String a) {
        title = t;
        author = a;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
   @Override
    public String toString() {
        return  title + " by " + author;
    }
   
    
}
