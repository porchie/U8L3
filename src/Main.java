import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        String[][] words2 = {{"hi", "bye", "stuff", "goo"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        ArrayList<String> returnedList = Algorithm2DArrays.findStringsOfLength(words2, 3);
        System.out.println(returnedList);
        ArrayList<String> returnedList2 = Algorithm2DArrays.findStringsOfLength(words2, 4);
        System.out.println(returnedList2);
        ArrayList<String> returnedList3 = Algorithm2DArrays.findStringsOfLength(words2, 6);
        System.out.println(returnedList3);

    }


}
