public class Animals {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String newName){
        this.name = newName;
    }
}


class Main {
    public static void main(String[] args) {
        Animals lion = new Animals();
        Animals dogs = new Animals();
        Animals cows = new Animals();
        lion.setName("Roars");
        dogs.setName("Barks");
        cows.setName("Moooos");
        System.out.println(lion.getName());
        System.out.println(dogs.getName());
        System.out.println(cows.getName());
    }
}
