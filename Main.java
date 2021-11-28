package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


//-----------------------------------------------------------------------------
// ZADANIE 1

   Scanner scanner = new Scanner(System.in);
   //Deklaracja zmiennych
   double dlugoscPostawyDolnej = 1;
   double dlugoscPostawyGornej = 1;
   double dlugoscWysokości = 1;
   double pole = 1;
   int wybranaFigura = 1;
    // lista opcji i pobierz dane

   System.out.print("Program słuzy do obliczania pola figur: \n1 - prostokąta \n2 - kwadratu \n3 -trójkąta \n4 - rombu \n5 - równoległoboku \n6 - trapezu \nPowiedz proszę, jaka figura Ciebie interesuje: ");
   String wybranaLiczba= scanner.nextLine();
   wybranaFigura = Integer.parseInt(wybranaLiczba);

   switch(wybranaFigura){
       case 1:
           System.out.print("Wybrałeś prostokąt.");
           System.out.print("Podaj długość podstawy dolnej: ");
           dlugoscPostawyDolnej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość wysokości: ");
           dlugoscWysokości=Double.parseDouble(scanner.nextLine());
           pole = poleProstokata(dlugoscPostawyDolnej,dlugoscWysokości);
           break;
       case 2:
           System.out.print("Wybrałeś kwadrat.");
           System.out.print("Podaj długość podstawy dolnej: ");
           dlugoscPostawyDolnej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość podstawy górnej: ");
           pole = poleKwadratu(dlugoscPostawyDolnej);
           break;
       case 3:
           System.out.print("Wybrałeś trójkąt.");
           System.out.print("Podaj długość podstawy dolnej: ");
           dlugoscPostawyDolnej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość podstawy górnej: ");
           dlugoscWysokości=Double.parseDouble(scanner.nextLine());
           pole=poleTrojkata(dlugoscPostawyDolnej,dlugoscWysokości);
           break;
       case 4:
           System.out.print("Wybrałeś romb.");
           System.out.print("Podaj długość podstawy dolnej: ");
           dlugoscPostawyDolnej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość wysokości: ");
           dlugoscWysokości=Double.parseDouble(scanner.nextLine());
           pole=poleRombu(dlugoscPostawyDolnej,dlugoscWysokości);
           break;
       case 5:
           System.out.print("Wybrałeś równoległobok.");
           System.out.print("Podaj długość podstawy dolnej: ");
           dlugoscPostawyDolnej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość wysokości: ");
           dlugoscWysokości=Double.parseDouble(scanner.nextLine());
           pole=poleRownolegloboku(dlugoscPostawyDolnej,dlugoscWysokości);
           break;
       case 6:
           System.out.print("Wybrałeś trapez.");
           System.out.print("Podaj długość podstawy dolnej: ");
           dlugoscPostawyDolnej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość podstawy górnej: ");
           dlugoscPostawyGornej=Double.parseDouble(scanner.nextLine());
           System.out.print("Podaj długość wysokości: ");
           dlugoscWysokości=Double.parseDouble(scanner.nextLine());
           pole=poleTrapezu(dlugoscPostawyDolnej,dlugoscPostawyGornej,dlugoscWysokości);
        }
        System.out.print("Pole jest równe: "+ pole);

        scanner.close();


//---------------------------------------------------------------------------
        //ZADANIE 2
    /*
        boolean flag = false;

        Scanner scanner=new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        String podanaLiczba=scanner.nextLine();
        double liczba=Double.parseDouble(podanaLiczba);

        if (liczba%2 == 0) {
            flag = true;
            System.out.println("Liczba " + liczba + " jest podzielna przez 2.");
        }
        if(liczba%3 == 0) {
            flag = true;
            System.out.println("Liczba " + liczba + " jest podzielna przez 3.");
        }
        if(liczba%5 == 0) {
            flag = true;
            System.out.println("Liczba " + liczba + " jest podzielna przez 5.");
        }
        if(!flag){
        System.out.println("Liczba " + liczba + " nie jest podzielna przez 2,3 lub 5.");
        }

        scanner.close();
    */
//--------------------------------------------------------
        //ZADANIE 3
/*
    Scanner scanner=new Scanner(System.in);

    System.out.print("Podaj liczbę całkowita, maksymalnie czterocyfrową: ");
    int podanaLiczba=Integer.parseInt(scanner.nextLine());
    int liczbaSprawdzana = podanaLiczba;
        // Sprawdzamy najpierw podzielność przez dziesięc
    //Sprawdzamy czy liczba nie jest ujemna i wtedy mnoże -1
    if(podanaLiczba<0){
    liczbaSprawdzana*=-1;
    }
    if(liczbaSprawdzana/10==0) {
        System.out.println("Liczba " + podanaLiczba + " jest jednocyfrowa.");
    }
    else if(liczbaSprawdzana/100==0) {
        System.out.println("Liczba " + podanaLiczba + " jest dwucyfrowa.");
    }
    else if (liczbaSprawdzana/1000==0){
        System.out.println("Liczba " + podanaLiczba + " jest trzycyfrowa.");
    }
    else if (liczbaSprawdzana/10000==0){
        System.out.println("Liczba " + podanaLiczba + " jest czterocyfrowa");
    }

    scanner.close();
*/
//------------------------------------------------------------------
        //ZADANIE 4
    /*
    Scanner scanner=new Scanner(System.in);
    System.out.print("Podaj jedną liczbe z zakresu 1-12: ");
    int podanaLiczba=Integer.parseInt(scanner.nextLine());


    switch(podanaLiczba) {
        case 1:
            System.out.println("Wspomniałeś styczen.");
            break;
        case 2:
            System.out.println("Wspomniałeś luty.");
            break;
        case 3:
            System.out.println("Wspomniałeś marzec.");
            break;
        case 4:
            System.out.println("Wspomniałeś kwiecień.");
            break;
        case 5:
            System.out.println("Wspomniałeś maj.");
            break;
        case 6:
            System.out.println("Wspomniałeś czerwiec.");
            break;
        case 7:
            System.out.println("Wspomniałeś lipiec.");
            break;
        case 8:
            System.out.println("Wspomniałeś sierpień.");
            break;
        case 9:
            System.out.println("Wspomniałeś wrzesień.");
            break;
        case 10:
            System.out.println("Wspomniałeś październik.");
            break;
        case 11:
            System.out.println("Wspomniałeś listopad.");
            break;
        case 12:
            System.out.println("Wspomniałeś grudzień.");
            break;
        default:
        {
            System.out.println("Nie ma takiego miesiaca.");
        }
        }
        scanner.close();

    */
//ZDANIE 5
    /*

    Scanner scanner=new Scanner(System.in);
    System.out.print("Podaj numer miesiąca: ");
    int podanyNumerMiesiaca=Integer.parseInt(scanner.nextLine());

    String napis="Do końca czekają Cię jeszcze miesiące: ";
    switch(podanyNumerMiesiaca){
        case 1:
            napis+="styczeń, ";
        case 2:
            napis+="luty, ";
        case 3:
            napis+="marzec, ";
        case 4:
            napis+="kwiecień, ";
        case 5:
            napis+="maj, ";
        case 6:
            napis+="czerwiec, ";
        case 7:
            napis+="lipiec, ";
        case 8:
            napis+="sierpień, ";
        case 9:
            napis+="wrzesień, ";
        case 10:
            napis+="październik, ";
        case 11:
            napis+="listopad, grudzień.";
        break;
        case 12:
            napis="Hura, to już koniec roku!";

        System.out.println(napis);
    }

    scanner.close();
    */
// Zadanie 6
    /*

    Scanner scanner=new Scanner(System.in);
    System.out.print("Podaj liczbę rzeczystą: ");
    double podanaLiczba=Double.parseDouble(scanner.nextLine());

    System.out.println("Wartość funkcji signum dla " + podanaLiczba + " to " + znakLiczby(podanaLiczba));

    scanner.close();
    */

// Zadanie 7
/*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj trzy liczby całkowite: \nPodaj liczbę a: ");
        double podanaLiczbaA = Double.parseDouble(scanner.nextLine());
        System.out.print("Podaj liczbę b: ");
        double podanaLiczbaB = Double.parseDouble(scanner.nextLine());
        System.out.print("Podaj liczbę n ");
        double podanaLiczbaN = Double.parseDouble(scanner.nextLine());

        sprawdzeniePrzystawania(podanaLiczbaA,podanaLiczbaB,podanaLiczbaN);
*/

        
    }

//------------------------------------------------------------------
// METODA ZADANIE 1

    public static double poleTrapezu(double a, double b, double h) {

        return 0.5 * (a + b) * h;
    }

    public static double poleKwadratu(double a) {

        return poleTrapezu(a, a, a);
    }

    public static double poleProstokata(double a, double b) {

        return poleTrapezu(a, a, b);
    }

    public static double poleTrojkata(double a, double h) {

        return poleTrapezu(a, 0, h);
    }

    public static double poleRombu(double a, double h) {

        return poleTrapezu(a, a, h);
    }

    public static double poleRownolegloboku(double a, double h) {

        return poleTrapezu(a, a, h);
    }


//------------------------------------------------------------------
// METODA ZADANIE 6

    public static double znakLiczby(double d){

        if(d>0){
            return 1;
        } else if (d==0){
            return 0;
        } else return -1;
    }
//------------------------------------------------------------------
// METODA ZADANIE 7

    public static void sprawdzeniePrzystawania(double a, double b, double n){
        String wyswietl=("Liczby " + a +" i " + b );
        if(a%n==b%n){
            System.out.print(wyswietl + " przystają do siebie modulo " + n + ".");
        }else System.out.print(wyswietl + " nie przystają do siebie modulo " + n + ".");
        }
    }

