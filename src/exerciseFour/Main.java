package exerciseFour;

public class Main {
    public static void main(String[] args) {
        MyMap<String,String> e = new MyMap<>();
        MyMap<Integer,Integer> e1 = new MyMap<>();
        e1.put(1,2);
        e.put("r","h");
        /*System.out.println(e.containsKey("r"));
        System.out.println(e.isEmpty());*/
        /*e.showValues();*/
        e1.replace(1,3);
        e1.showValues();
    }
}
