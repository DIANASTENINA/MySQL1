package objects;

public class Group {
    private long id;
    private String name;
    private long id_curator;

    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", id_curator=" + id_curator +
                '}';
    }

    public Group(long id, String name, long id_curator) {
        this.id = id;
        this.name = name;
        this.id_curator = id_curator;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getId_curator() {
        return id_curator;
    }
    public void setId_curator(long id_curator) {
        this.id_curator = id_curator;
    }
}
