public class HistoryStudent implements Student {

    String name;
    int id;
    String sex;

    public HistoryStudent(String name, int id, String sex) {
        this.name = name;
        this.id = id;
        this.sex = sex;
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getSex() {
        return this.sex;
    }

    @Override
    public String toString() {
        return "HistoryStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", sex='" + sex + '\'' +
                '}';
    }

    @Override
    public String getCourse() {
        return "History";
    }
}
