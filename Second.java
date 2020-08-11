package drugie;

import java.util.Scanner;

public class Second {

    private Scanner scanner = new Scanner(System.in);
    int account = 1000;

    public void check() {

        String pin = "1234";
        boolean correctpin = false;
        int counter = 0;
        String num;


        System.out.println("Witaj w bankomacie.");


        while (counter < 3 && correctpin == false) {

            System.out.println("Proszę podać kod PIN.");
            num = scanner.next();

            if (num.equals(pin)) {
                System.out.println("Podano prawidłowy kod PIN");
                correctpin = true;
            } else {
                System.out.println("Podano nieprawidłowy kod PIN");
                counter++;
            }

            if (counter == 2 && correctpin == false) {
                System.out.println("Pozostała jedna szansa");
            }
        }
    }

    public void choices() {
        System.out.println("Jeśli chcesz wypłacić pieniądze wpisz \"1\" \n" +
                "Jeśli chcesz sprawdzić stan konta wybierz \"2\" \n" +
                "Jeśli chcesz wyjść wybierz \"3\" ");
    }

    public void operations() {

        int i = scanner.nextInt();

            switch (i) {
                case 1:
                    System.out.println("Podaj sume jaka chcesz wyplacic");
                    int a = scanner.nextInt();
                    if (a>account)
                        System.out.println("Nie masz takiej sumy na koncie");
                    else
                        account = account - a;
                    choices();
                    operations();
                    break;
                case 2:
                    System.out.println("Twoj stan konta wynosi: " + account);
                    choices();
                    operations();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nie rozpoznano polecenia, sprobuj ponownie");
                    choices();
                    operations();
                    break;
        }
    }
}
