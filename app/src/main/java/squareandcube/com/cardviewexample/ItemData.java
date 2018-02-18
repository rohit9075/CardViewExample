package squareandcube.com.cardviewexample;

/**
 * Created by VIVEK on 10/16/2017.
 */

public class ItemData {

    private String name , id , notes;

    public ItemData(String name, String id, String notes) {
        this.name = name;
        this.id = id;
        this.notes = notes;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getNotes() {
        return notes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
