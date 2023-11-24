public class Duck implements Swimmable, LayEggsable{
    @Override
    public void swim() {
        System.out.println("Duck swim");
    }



    @Override
    public void layEggs () {
        System.out.println("Duck lay eggs");
    }


}
