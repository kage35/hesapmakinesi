import java.util.Scanner;
public class makine {
    public static void main(String[] args) {
        int s1,s2,select;
        double sonuc;
        Scanner input =new Scanner(System.in);
        System.out.println("ilk sayıyı giriniz");
        s1=input.nextInt();
        System.out.println("ikinci sayıyı giriniz");
        s2=input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("seçiminiz nedir? : ");
        select=input.nextInt();
        switch (select){
            case 1 :
                sonuc=s1+s2;
                System.out.println(sonuc);
                break;
            case 2 :
                sonuc=s1-s2;
                System.out.println(sonuc);
                break;
            case 3 :
                sonuc=s1*s2;
                System.out.println(sonuc);
                break;
            case 4 :
                sonuc=s1/s2;
                System.out.println(sonuc);
                break;
            default:
                System.out.println("lütfen geçerli bir seneçek giriniz");
       }

    }
}
