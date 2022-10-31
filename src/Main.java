import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    //////////////////////////////////////////////////////////////

    //-----------//
    //Task 2
    public static int largest() {

        int[] arr = {3, 20, 156, 1, 14, 8};

        int i;
        int max = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    //-----------//

    //Task 3
    public static int lowest() {

        int[] arr = {3, 20, 156, 1, 14, 8};

        int i;
        int min = arr[0];

        for (i = 1; i < arr.length; i++)
            if (arr[i] < min)
                min = arr[i];

        return min;
    }

    //-----------//


    //Task 4

    //------------//

    //Task5
    public static void yerDeyisme(int[] x){

        int b = x[0];
        x[0] = x[x.length-1];
        x[x.length-1] = b;

        System.out.println("Ilk eded ve son ededin yeri deyisildi : " + Arrays.toString(x));

    }

    //------------//

    //Task 6

    //------------//

    //Task 7

    //------------//

    //Task 8

    public static void artanSira(int [] a){

        Arrays.sort(a);
        System.out.println("Artan sira ile: ");

        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);
        }



}
    //------------//


    /////////////////////////////////////////////////////
    public static void main(String[] args) {

        //Task 1
        int[] a = {2, 3, 4, 5, 6, 7};
        int x;

        ArrayList<Integer> tekEdedler = new ArrayList<>();
        ArrayList<Integer> cutEdedler = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            x = a[i]%2;
            if (x == 1){
                tekEdedler.add(a[i]);
            } else {
                cutEdedler.add(a[i]);
            }
        }

        System.out.println("Tek ededler : " + tekEdedler);
        System.out.println("Cut ededler : " + cutEdedler);

        System.out.println("Arraudaki en boyuk element : " + largest());
        System.out.println("Arraudaki en kicik element : " + lowest());

        yerDeyisme(a);
        artanSira(a);
    }

}