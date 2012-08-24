class Nomina                                       {
public static void pay(double sueldo, int horas) {
if (sueldo < 8.000) {System.out.println("Muy poco sueldo");
} else if (horas > 60) {
System.out.println("haz trabajado mucho no te lo procesamos");
} else {
double extras = 0;
if (horas > 40) {
extras = horas-40*sueldo;
horas = 40;
 }
 double pay = sueldo * horas;
 pay = extras * sueldo * 1.5;
 System.out.println("tu pago es" + pay);
}
}
public static void main(String[] arguments) {

 pay(7.5, 35);
 pay(8.2, 47);
 pay(10.0, 73);
}
}
