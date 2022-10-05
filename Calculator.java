public class Calculator {

    public static void main(String[] args) {

/*        String Name = "Adolf Simon Postl";
        int Summand1 = 180;
        int Summand2 = 30;
        //int SummeAddition;

        //SummeAddition = Summand1 + Summand2 ;
        //Strg. + Alt + V -> Variable erzeugen
        int SummeAddition = Summand1 + Summand2;

        System.out.println("Mein Name ist " + Name);
        System.out.println("Summand1 = " + Summand1);
        System.out.println("Summand2 = " + Summand2);
        System.out.println("Ergebnis = " + SummeAddition);
        //soutv + Tab -> Variable wird ausgegeben
        System.out.println("SummeAddition = " + SummeAddition);*/
        int a = 27;
        int b = 4302;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a  + b = " + addieren(a,b));
        System.out.println("a - b = " + subtrahieren(a,b));
        System.out.println("a * b = " + multiplizieren(a,b));
        System.out.println("a / b = " + dividieren(a,b));
        System.out.println("a % b = " + restwert(a,b));
        System.out.println("a² = " + quadrieren(a));
        System.out.println("b² = " + quadrieren(b));

    }

    public static int addieren(int a, int b){
            return a + b;
                    }

        public static int subtrahieren(int a, int b){
            return a - b;
        }

        public static int multiplizieren(int a, int b){
            return a * b;
        }

        public static float dividieren(int a, float b){
            if (b == 0) {
                return (b);
            }
           return (a / b);
        }

        public static int restwert(int a, int b){
            if (b == 0) {
                return (0);
            }
            else return (a % b);
        }

        public static int quadrieren(int a){
        return a * a;
        }

    }
