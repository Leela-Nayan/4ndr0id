class Student {
    int id;
    String name;

    void record(int i, String s){
    id = i;
    name = s;
    System.out.println(id + " " + name);

    
}

}

public class Collect {
    public static void main(String args[]){
    Student store = new Student();
    store.record(12, "Nayan");
    new Student().record(12, "Nayan");

}
}

