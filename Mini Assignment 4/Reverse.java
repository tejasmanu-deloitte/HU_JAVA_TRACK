import java.util.*;

public class Reverse {
    public static void main(String[] args) {

        ArrayList<String> arrlst = new ArrayList<String>();

        arrlst.add("hashedin");
        arrlst.add("by");
        arrlst.add("Deloitte");
        arrlst.add("2022");

        System.out.println("List:"+arrlst);

        Collections.reverse(arrlst);

        System.out.println("Reverse List:"+arrlst);
    }
}