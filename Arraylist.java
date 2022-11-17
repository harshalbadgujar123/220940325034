
import java.util.ArrayList;
class main
{
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println("Arraylist:" + colors);

        for (int i = 0; i < colors.size(); i++)
            System.out.println(colors.get(i));
        System.out.println(" ");
    }

}

