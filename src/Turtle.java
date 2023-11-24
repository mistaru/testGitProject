public class Turtle implements Swimmable, LayEggsable{
    @Override
    public void swim() {
        System.out.println("Turtle swim");
    }

    @Override
    public void layEggs () {
        System.out.println("Turtle lay eggs");
    }
}
