import java.util.Scanner;

public class PowerOf4And5 {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayıyı giriniz=");
        num= scanner.nextInt();

        for (int i=1;i<num;i*=4) {
            System.out.println("4'ün katları=" + i);
        }
        System.out.println("------------------");
            for (int j=1;j<num;j*=5){
                System.out.println("5'in katları="+j);
            }

    }
}
