
import java.util.ArrayList;

public class Sortah {
    public static void main(String[] args) {
        int[] porco = {1,2,3,4,5,6,7,8,9,333,0,4};
        int[] curtis = {2,4,6,99,111,222,4444,11111};
        int[] piccolo = {999,88,7,5,3,2,1};
        int[] fio = {8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
        System.out.println("sortOrder ----------------");
        System.out.println(sortOrder(porco));
        System.out.println(sortOrder(curtis));
        System.out.println(sortOrder(piccolo));
        System.out.println(sortOrder(fio));
        System.out.println("even ----------------");
        for (int umm : even(porco)) {
            System.out.print(umm + " ");
        } System.out.println("");
        for (int umm : even(curtis)) {
            System.out.print(umm + " ");
        } System.out.println("");
        for (int umm : even(piccolo)) {
            System.out.print(umm + " ");
        } System.out.println("");
        for (int umm : even(fio)) {
            System.out.print(umm + " ");
        } System.out.println("");
        System.out.println("sum ----------------");
        System.out.println(sum(porco));
        System.out.println(sum(curtis));
        System.out.println(sum(piccolo));
        System.out.println(sum(fio));
    }
    
    public static int sortOrder(int[] array) {
            int first = 0;
            int next = 0;
            boolean goup = true;
            boolean goun = true;
            for (int i = 0; i < array.length - 1; i++) {
                first = array[i];
                next = array[i+1];
                if (first < next) {
                    goun = false;
                } else if (first > next) {
                    goup = false;
                }
            } 
            if (!(goup && goun)) {
            if (goup) {
                return 1;
            } else if (goun) {
                return -1;
            }}
            return 0;
        }

    public static int[] even(int[] array) {
        ArrayList<Integer> deez = new ArrayList<>();
        for (int nuts : array) {
            if (nuts % 2 == 0) {
                deez.add(nuts);
            }
        }
        int[] goteem = new int[deez.size()];
        for (int c = 0; c < deez.size(); c++) {
            goteem[c] = deez.get(c);
        }
        return goteem;
    }
    public static int sum(int[] array) {
        int gina = 0;
        for (int i : array) {
            gina += i;
        }
        return gina;
    }
}
