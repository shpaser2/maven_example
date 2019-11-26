package by.belhard.j18;

public class Main {
    public static void main(String[] args) {
        Entity entity = new Entity(1, "aa");

        //after @Data from lombok
        entity.getA();
        entity.getS();
        entity.hashCode();
        System.out.println(entity.toString());
        //and more


    }
}
