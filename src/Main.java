public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }


        for (int i = 0; i <= 17; i=i+2) {
            System.out.println(i);
        }

        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }



        for (int i = 1904; i <= 2096; i=i+4) {
            System.out.println(i + " is visokosniy year");
        }



        for (int i = 7; i <= 98; i=i+7) {
            System.out.println(i);
        }



        for (int i = 1; i <= 512; i=i*2) {
            System.out.println(i);
        }


        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++) {
            total += salary;
            System.out.println("Month " + i + " summa nakopleniy ravna " + total + " rubles");
        }


        int salary1 = 29000;
        int total1 = 0;
        for (int i = 0; i < 12; i++) {
            total1 += total1/100;
            total1 += salary1;
            System.out.println("Month " + i + " summa nakopleniy ravna " + total1 + " rubles");
        }




        int two = 2;
        for (int i = 1; i <= 10; i++) {
            int result = two * i;
            System.out.println(two + " * " +  i + " = " + result );
        }


    }
}