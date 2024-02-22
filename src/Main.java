import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month, day;

        Scanner input = new Scanner(System.in);
        System.out.print("Doğum ayınızı girin: ");
        month = input.nextInt();

        System.out.print("Doğum gününüzü girin: ");
        day = input.nextInt();

        boolean isError = false;
        String burc = "";

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Oğlak";
                } else {
                    burc = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day < 21) {
                    burc = "Kova";
                } else {
                    burc = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day < 21) {
                    burc = "Balık";
                } else {
                    burc = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day < 21) {
                    burc = "Koç";
                } else {
                    burc = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day < 22) {
                    burc = "Boğa";
                } else {
                    burc = "İkizler";
                }
            } else {
                isError = true;
            }
        }
        // Diğer ayların kontrolleri benzer şekilde devam eder...

        if (isError) {
            System.out.println("Hatalı giriş yaptınız. Lütfen doğru ay ve gün giriniz.");
        } else {
            System.out.println("Burcunuz: " + burc);
        }
    }
}
