import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            getRandomNote();
        }
    }

    public static void getRandomNote() {
        int randomInteger = new Random().nextInt(5);
        var allNotes = NotesOnKeyboard.values();
        System.out.println(allNotes[randomInteger] + " " + getNoteLength());
    }

    private static double getNoteLength() {
        int randomInteger = new Random().nextInt(4);
        return switch (randomInteger) {
            case 0 -> .25;
            case 1 -> .50;
            case 2 -> .75;
            case 3 -> 1d;
            default -> -1;
        };
    }

}


// use enum and Random class for music generator where enum value assigned to array indexes and Rrandom class calls
// random indexes. Can make this more fun by limiting random numbers to values appropriate for certain scales. Maybe
// assign use Random again to assign a time interval


//SECTION 10: LIST, ARRAYLIST, LINKEDLIST, ITERATOR, AUTOBOXING

// new section 10: videos 131-133: ArrayListsJava17: ArrayLists, record class, raw arrayList, various ArrayList
// inbuilt methods for adding/removing items and converting and alphabetizing, List class, '.of' List method
//new section 10: video 134: MutableVsImmutableLists: mutable vs immutable list creation from arrays and array creation from arrayList
// 135: ArrayListChallengeJDK17: text block as variable, .sort and .indexOf ArrayList methods, Comparator and .naturalOrder method, .split method of String[], .trim String method,
// 137-138: LinkedListJDK17: LinkedList. Stack and Queue methods for adding, removing, querrying. ListIterator
// 139: IteratorVsListIterator: methods
// 140-141: LinkedListChallengeJDK17: user input, boolean flags, Iterator forward/backwards, enhanced for loop, var keyword
// 144-145: banking again with use of autoboxing and unboxing of double and Double. Use of both width and precision in format
// specifiers for justification of transactions in list
// 146: enum into. methods: .name, .ordinal, .values.(still not sure about this) Random() class with .nextInt. var variable type