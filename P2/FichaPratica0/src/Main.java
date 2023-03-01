import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int x = 5;
        double soma = 0;
        boolean flag = false;

        /*if(x % 2 == 0){
            flag = true;
        }else{
            flag = false;
        }*/
//b
//        switch (x % 2) {
//            case 0:
//                flag = true;
//                break;
//            case 1:
//                flag = false;
//                break;
//            default:
//                break;
//        }


//c
//    flag = x%2==0 ? true : false;
// d
//        flag = x%2 == 0;

//e


//
//        for (int i = 1; i <= x; i++) {
//            soma+=i;
//        }
//        System.out.println("Soma: " + soma);


//f
//        soma=0;

//g
//        int i=1;
//        while (i<= x){
//
//            soma+=i;
//            i++;
//        }
//        System.out.println("Soma: " + soma);


//h
//        soma =0;

//i
//        int i =1;
//        do {
//            soma += i;
//            i++;
//        } while (i <= x);
//        System.out.println("Soma: " + soma);

//j

        for (int i = 1; i <= x; i++) {
            if(i!=3){
                soma+=i;
            }
        }
        System.out.println("Soma: " + soma);
    }
}
