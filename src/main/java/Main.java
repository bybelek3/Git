
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Note> notes = new ArrayList<>();
    public static void main(String[] args)
    {
        Note note1 = new Note("qwertyuiop", "Friend", "qwe");
        notes.add(note1);
        Note note2 = new Note("123", "apple", "fruit");
        notes.add(note2);
        Note note3 = new Note("rrrr5", "pop-music", "Cool");
        notes.add(note3);

        System.out.println("Write down an id of the note you want to delete: ");
        //System.out.println("To stop removing notes, type word 'stop'");

        NotesManager notesManager = new NotesManager();

        Scanner sc = new Scanner(System.in);
        String usersInput = sc.next();

        notesManager.deleteNote(usersInput);

        System.out.println("List with rest notes: ");
        System.out.println(notesManager.getNotesInAFormattedWay());
    }
}
