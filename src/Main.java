public class Main {
    public static void main(String[] args) {
        int total = 0;
        int vklad = 15000;
        int month = 0;
        while (total < 2_459_000) {
            total += vklad;
            month++;
            System.out.println("Month " + month + " summa nakopleniy ravna " + total + " rubley");
        }





        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();

        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();






        int population = 12_000_000;
        int born = 17;
        int death = 8;
        int bornDeath = born - death;
        for (int i = 0; i < 10; i++) {
            population += population * bornDeath / 1000;
        }
        System.out.println(population);




        int vkladd = 15000;
        int monthh = 0;
        while (vkladd <= 12_000_000) {
            vkladd += vkladd * 7 / 100;
            monthh++;
            if (monthh % 6 == 0) {
                System.out.println("Month " + monthh + " summa nakopleniy ravna " + vkladd + " rubley");
            }
        }



        int years = 9;
        int nineYearsMonth = years * 12;
        int vlojil = 15000;
        while (nineYearsMonth > 0) {
            vlojil += vlojil * 7 / 100;
            nineYearsMonth--;
            if (nineYearsMonth % 6 == 0) {
                System.out.println("Month " + nineYearsMonth + " summa vlojeniy ravna " + vlojil);
            }
        }


        int dney = 31;
        int den = 5;
        while ( den <= dney ) {
            System.out.println("Today is friday " + den + " It's time to make the otchet");
            den += 7;
        }



        int currentYear = 2023;
        int pastBorder = currentYear - 200;
        int futureBorder = currentYear + 100;

        for (int z = 0; z < futureBorder; z += 79) {
            if (z >= pastBorder && z <= futureBorder) {
                System.out.println(z);
            }
        }













    }
}