public class HistoryMagisterStudent extends HistoryStudent {

    public HistoryMagisterStudent(String name, int id, String sex) {
        super(name, id, sex);
    }


    @Override
    public String getCourse(){
        return "Second World War";
    }
}




