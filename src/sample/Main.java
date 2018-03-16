package sample;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	ArrayList<Integer> items = new ArrayList<>();
	items.add(1);
	items.add(2);
	items.add(3);
//	items.add("tim");
	items.add(4);
	items.add(5);

	printDoubled(items);

    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i : n) { //Object data type declared, refer to next comment
            System.out.println(i * 2); //Integer is used to tell java what type of object is performed
        }
    }
}
