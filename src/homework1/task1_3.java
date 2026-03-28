
package homework1;

public class task1_3 {

    public static void main(String[] args) {

        int n = 126;
        int element1 = n/10/10;
        int element2 = (n/10)%10;
        int element3 = n%10;

        int sum = element1+element2+element3;

        System.out.println(sum);
    }
}