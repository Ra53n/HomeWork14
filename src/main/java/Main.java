import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


    }

    public static int[] numbersAfterFour(int[] numbers){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : numbers){
            list.add(n);
        }
        if(!list.contains(4)) throw new RuntimeException();
        int index = list.lastIndexOf(4);
        List<Integer> res = new ArrayList<>();
        for (int i = index+1; i < list.size(); i++) {
            res.add(list.get(i));
        }
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    public static boolean oneAndFour(int[] num){
        ArrayList<Integer> list = new ArrayList<>();
        for(int n : num){
            list.add(n);
        }
        for(int n : list){
            if(n != 1 && n != 4) return false;
        }
        return true;
    }

}
