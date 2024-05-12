public class NotesManager {

    public String getNotesInAFormattedWay()
    {
        String formattedText = "";
        for (Note note : Main.notes)
        {
            formattedText += note.toString() + "\n";
        }
        return formattedText;
    }

    public void deleteNote(String id)
    {
        boolean isExist = false;
        for (Note note : Main.notes)
        {
            if (note.getId().equals(id))
            {
                Main.notes.remove(note);
                isExist = true;
                System.out.println("You deleted the note with id: "
                        + note.getId());
                break;
            }
        }
        if (!isExist)
        {
            System.out.println("Id does not exist");
        }
    }
}
