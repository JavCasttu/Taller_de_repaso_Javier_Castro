import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola");
        System.out.println("Mundo");
        System.out.println("Hola Mundo");
    }
}

class EjercicioDos {
    public static void main(String[] args) {
        System.out.println("¿Cómo te llamas?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
    }
}

class EjercicioTres {
    public static void main(String[] args) {
        System.out.println("Digite un número al que le quiera sacar el cuadrado");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int numCuadrado = numero*numero;
        System.out.println("El cuadrado de "+numero+" es: " + numCuadrado);
    }
}

class EjercicioCuatro{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Digite el segúndo número");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println("El resultado es: "+suma);
    }
}

class EjercicioCinco{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dos números que quiera sumar, restar, multiplicar y dividir");
        System.out.println("Numero 1:");
        int numero1 = sc.nextInt();
        System.out.println("Numero 2:");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
        System.out.println("La suma es: "+suma);
        int resta = numero1 - numero2;
        System.out.println("La resta es: "+resta);
        int multiplicacion = numero1 * numero2;
        System.out.println("La multiplicacion es: "+multiplicacion);
        double residuo =  numero1 / numero2;
        System.out.println("La división es: "+residuo);
    }
}

class EjercicioSeis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número decimal");
        double numero = sc.nextDouble();
        int entero = (int) numero;
        double decimal = numero - entero;
        System.out.println("La parte entera es: "+entero);
        System.out.println("La parte decimal es: "+decimal);

    }
}

class EjercicioSiete{
    static double calcularPromedio(double n1, double n2, double n3, double n4, double n5){
        return n1*0.15 + n2*0.2 + n3*0.15 + n4*0.3 + n5*0.2;
    }
    public static void main(String[] args) {
        System.out.println("Digite sus 5 notas para calcular su promedio");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        double promedio = calcularPromedio(n1, n2, n3, n4, n5);
        System.out.println("El promedio es: "+promedio);
    }
}

class EjercicioOcho{
    static double CalcularIVA(double precio){
        return precio*1.19;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el precio del producto, y se le calcularà el iva");
        double precio = sc.nextDouble();
        double precioIVA = CalcularIVA(precio);
        System.out.print("Si el precio bruto es: : "+precio);
        System.out.print(", entonces con iva: "+precioIVA);

    }
}

class EjercicioNueve{
    static double AreaCirculo(double radio){
        return Math.PI * (radio*radio);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el radio del círculo");
        double radio = sc.nextDouble();
        double areaCirculo = AreaCirculo(radio);
        System.out.println("El área del círculo es: "+areaCirculo);
    }
}

class EjercicioDiez{
    static double AreaHexagono(double lado, double apotema){
        return (6*lado*apotema)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el lado del hexágono");
        double lado = sc.nextDouble();
        System.out.println("Digite el apotema del hexágono");
        double apotema = sc.nextDouble();
        double areaH = AreaHexagono(lado, apotema);
        System.out.println("El area del hexágono es: "+areaH);
    }
}

class EjercicioOnce{
    static double nPromedio(int n){
        Scanner sc = new Scanner(System.in);
        double numero = 0;
        double suma = 0;

        for (int i = 0; i< n ; i++) {
            System.out.println("Digite el "+(i+1)+" numero");
            numero = sc.nextDouble();
            suma += numero;
        }
        return suma/n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantos numeros quiere digitar?");
        int n = sc.nextInt();
        double promedio = nPromedio(n);
        System.out.println("El promedio es: "+promedio);
    }
}

class EjercicioDoce{
    static double distanciaCoordenadas(double x1, double y1, double x2, double y2){
        return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la primera coordenada x");
        double x1 = sc.nextDouble();
        System.out.println("Digite la primera coordenada y");
        double y1 = sc.nextDouble();
        System.out.println("Digite la segunda coordenada x");
        double x2 = sc.nextDouble();
        System.out.println("Digite la segunda coordenada y");
        double y2 = sc.nextDouble();
        double distancia =  distanciaCoordenadas(x1, y1, x2, y2);
        System.out.println("La distancia entre las coordenadas es: "+distancia);
    }
}

class EjercicioTrece{
    static int repeticionNumero (int n){
        String NN = "" + n + n + "";
        String NNN = "" + n + n + n + "";
        int NNA = Integer.parseInt(NN);
        int NNNA = Integer.parseInt(NNN);
        return NNA + NNNA + n;
    }
    public static void main(String[] args) {
        System.out.println("Digite un número al que quiera aplicarle la repetición");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String NN = "" + n + n + "";
        String NNN = "" + n + n + n + "";
        int NNA = Integer.parseInt(NN);
        int NNNA = Integer.parseInt(NNN);
        int suman = repeticionNumero(n);
        System.out.println("El número es "+n);
        System.out.println("El número en formato nn es: "+NNA);
        System.out.println("El número en formato nnn es: "+NNNA);
        System.out.println("La suma entre los 3 números es: "+suman);

    }
}

//Este lo hice con ayuda//
class EjercicioCatorce {

    static void horasMinutosSegundos(int num) {
        int horas = num / 3600;
        int segundosRestantes = num % 3600;
        int minutos = segundosRestantes / 60;
        int segundosf = segundosRestantes % 60;
        System.out.printf("El número en el formato prometido es: %02d:%02d:%02d%n", horas, minutos, segundosf);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el número en segundos para saber su equivalente en horas:minutos:segundos:");
        int num = sc.nextInt();
        horasMinutosSegundos(num);
        sc.close();
    }
}

class EjercicioQuince{
    static int parImpar(int n){
        if(n%2==0){
            System.out.println(n+" es un número par");
        } else if(n%2==1){
            System.out.println(n+" es un número impar");
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número y le diré si es par o impar");
        int n = sc.nextInt();
        parImpar(n);
    }
}

class EjercicioDieciseis{
    static int positivoNegativo(int n){
        String respuesta = (n>=0) ? "Es un número positivo":"Es un número negativo";
        System.out.println(respuesta);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número, y le mencionaré si es positivo o negativo");
        int n = sc.nextInt();
        positivoNegativo(n);
    }
}

class EjercicioDiecisiete{
    static double descuentoIva(double precio){
        if (precio>150000){
            double AplicarDescuento = precio*0.95;
            double PagoIva = EjercicioOcho.CalcularIVA(AplicarDescuento);
            System.out.println("Se le ha aplicado descuento a la compra, debido a que costó mas de 150000");
            System.out.println("El subtotal (sin IVA): "+AplicarDescuento);
            System.out.println("El valor a pagar (con IVA): "+PagoIva);
        } else if(precio<150000){
            double PagoIva = EjercicioOcho.CalcularIVA(precio);
            System.out.println("Al ser una compra menor a 150000, no se le aplicará descuento");
            System.out.println("El valor a pagar es (con IVA): "+PagoIva);
        }
        return precio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el precio a pagar");
        double precio = sc.nextDouble();
        descuentoIva(precio);
    }
}

class EjercicioDieciocho{
    public static void main(String[] args) {
        System.out.println("Digite sus 5 notas para calcular su promedio (decimales con comas)");
        Scanner sc = new Scanner(System.in);
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double n5 = sc.nextDouble();
        double promedio = EjercicioSiete.calcularPromedio(n1, n2, n3, n4, n5);
        if (promedio<2 && promedio>=0){
            System.out.println("Con un promedio de "+promedio+", ha perdido la matería y no habrá posibilidad de habilitación");
        }else if (promedio<3){
            System.out.println("Con un promedio de "+promedio+", ha reprobado la materia");
        } else if (promedio>=3 && promedio<=4.5){
            System.out.println("Ha aprobado el curso con un promedio de "+promedio);
        } else if (promedio>4.5 && promedio<=5){
            System.out.println("Felicitaciones!, ha aprobado la materia con un promedio de "+promedio+"!");
        } else{
            System.out.println("Ese promedio es inválido, las notas van de 0 a 5");
        }
    }
}

class EjercicioDiecinueve{
    static double ecuaciónCuadrática(double a, double b, double x, double c){
        System.out.println("La ecuación queda planteada como: ");
        System.out.println("("+a+")"+"("+x+")^2 + ("+b+")("+x+") + "+c);
        double cuadratica = (a*(Math.pow(x,2)) + (b*x) + c);
        return cuadratica;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Resolveré una ecuación cuadrática (ax^2 + bx + c)");
        System.out.println("Ingrese el valor de a");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor de b");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor de c");
        double c = sc.nextDouble();
        System.out.println("Ingrese el valor de x");
        double x = sc.nextDouble();
        double respuesta = ecuaciónCuadrática(a,b,x,c);
        System.out.println("La solución de esa ecuación es: "+respuesta);
    }
}

class EjercicioVeinte{
    static String Login(String usuario, String contraseña){
        Scanner sc = new Scanner(System.in);
        System.out.println("#### <Proceso de inicio de sesión> ####");
        String respuesta = "";
        for (int i = 0; i<=3; i++){
            System.out.println("#### Intento "+(i+1)+"/3 ####");
            System.out.println("#### Ingrese su usuario ####");
            String Lusuario = sc.next();
            System.out.println("#### Ingrese su contraseña ####");
            String Lcontraseña = sc.next();
            if (usuario.equals(Lusuario)){
                if (contraseña.equals(Lcontraseña)){
                    respuesta = "#### Sesión iniciada con éxito ####";
                    System.out.println(respuesta);
                    break;
                } else{
                    System.out.println("#### Contraseña incorrecta ####");
                    if (i == 3){
                        respuesta = "#### Intentos terminados, inicio de sesión fallido ####";
                    }
                }
            } else{
                System.out.println("#### Usuario incorrecto ####");
                if (i == 3){
                    respuesta = "#### Intentos terminados, inicio de sesión fallido ####";
                }
            }
        }
        return respuesta;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("#### Bienvenido a SnapGram!, ¿Quiere crear una cuenta? ####");
        System.out.println("#### true (si) : false (no) ####");
        boolean c1 = sc.nextBoolean();
        if (c1 == true) {
            System.out.println("#### Prosiguiendo con la creación de la cuenta ####");
            System.out.println("#### Ingrese su usuario ####");
            String usuario = sc.next();
            System.out.println("#### Ingrese su contraseña ####");
            String contraseña = sc.next();
            System.out.println("#### Cuenta creada exitosamente! ####");
            String Lrespuesta = Login(usuario, contraseña);
        } else if (c1 == false) {
            System.out.println("#### Saliendo de la pagina... ####");
        }
    }
}

class EjercicioVeintiuno{
    static String NumeroEnLetras(int numero){
        String respuesta = (numero == 0) ? "CERO" :
                (numero == 1) ? "UNO" :
                (numero == 2) ? "DOS" :
                (numero == 3) ? "TRES" :
                (numero == 4) ? "CUATRO" :
                (numero == 5) ? "CINCO" :
                (numero == 6) ? "SEIS" :
                (numero == 7) ? "SIETE":
                (numero == 8) ? "OCHO" :
                (numero == 9) ? "NUEVE" :
                (numero == 10) ? "DIEZ" :
                "Ese número no está entre 0 y 10";
        return respuesta;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero del 0 al 10, y se mostrará en pantalla escrito en letras");
        int numero = sc.nextInt();
        System.out.println(NumeroEnLetras(numero));
    }
}

class EjercicioVeintidos{
    static String contadorCaracteres(String numero){
        String respuesta = "";
        int digitos = numero.length();
        if (digitos<6){
            respuesta = numero+" tiene "+digitos+" digitos";
        } else {
            respuesta = "El número debe ser menor a 100000";
        }
        return respuesta;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número entero menor a 100000");
        String numero = sc.next();
        System.out.println(contadorCaracteres(numero));
    }
}

class EjercicioVeintitres{
    static String tendenciaNumeros(int n1, int n2, int n3){
        String respuesta = "";
        if (n1<n2 && n2<n3) {
            respuesta = "Los números están incrementando";
        } else if (n1>n2 && n2>n3) {
            respuesta = "Los números están disminuyendo";
        } else {
            respuesta = "Ni se incrementa, ni se disminuye";
        }
        return respuesta;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite números, y yo le mencionaré si tienden a subir, o tienden a bajar");
        System.out.println("Digite el primer número");
        int n1 = sc.nextInt();
        System.out.println("Digite el segundo número");
        int n2 = sc.nextInt();
        System.out.println("Digite el tercer número");
        int n3 = sc.nextInt();
        System.out.println(tendenciaNumeros(n1, n2, n3));
    }
}

class EjercicioVeinticuatro{
    static String DiaSemana(int dia){
        String respuesta = "";
        respuesta = (dia == 1) ? "Lunes" :
        (dia == 2) ? "Martes" :
        (dia == 3) ? "Miércoles" :
        (dia == 4) ? "Jueves" :
        (dia == 5) ? "Viernes" :
        (dia == 6) ? "Sábado" :
        (dia == 7) ? "Domingo" : "Ese no es un número del 1 al 7";
        return respuesta;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un número del 1 al 7, y le mencionaré qué día de la semana es");
        int dia = sc.nextInt();
        System.out.println(DiaSemana(dia));
    }
}

//Los siguientes ejercicios con operaciones de string, tuve que hacerlos con ayuda

class EjercicioVeinticinco {
    static String invertirTexto(String texto) {
        StringBuilder invertido = new StringBuilder();
        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido.append(texto.charAt(i));
        }
        return invertido.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto para invertirlo:");
        String texto = sc.nextLine();
        System.out.println("Texto invertido: " + invertirTexto(texto));
    }
}

class EjercicioVeintiseis {
    static String capitalizarPalabras(String texto) {
        if (texto == null || texto.trim().isEmpty()) {
            return texto;
        }

        String[] palabras = texto.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return resultado.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto largo:");
        String texto = sc.nextLine();
        System.out.println("Resultado: " + capitalizarPalabras(texto));
    }
}

class EjercicioVeintisiete {
    static String obtenerPenultimaPalabra(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        if (palabras.length < 2) {
            return "El texto no contiene suficientes palabras (mínimo 2).";
        }
        return palabras[palabras.length - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un texto largo:");
        String texto = sc.nextLine();
        System.out.println("La penúltima palabra es: " + obtenerPenultimaPalabra(texto));
    }
}

class EjercicioVeintiocho {
    static boolean segundoContienePrimero(String texto1, String texto2) {
        return texto2.contains(texto1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el primer texto (subcadena a buscar):");
        String texto1 = sc.nextLine();
        System.out.println("Digite el segundo texto (cadena principal):");
        String texto2 = sc.nextLine();

        if (segundoContienePrimero(texto1, texto2)) {
            System.out.println("El segundo texto SÍ contiene al primero.");
        } else {
            System.out.println("El segundo texto NO contiene al primero.");
        }
    }
}

class EjercicioVeintinueve {
    static boolean esPalindromo(String palabra) {
        String limpia = palabra.toLowerCase().trim();
        int i = 0;
        int j = limpia.length() - 1;

        while (i < j) {
            if (limpia.charAt(i) != limpia.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite una palabra para verificar si es palíndromo:");
        String palabra = sc.next();
        System.out.println("¿Es palíndromo?: " + esPalindromo(palabra));
    }
}

class EjercicioTreinta{
    static double poligonoRegular(double a, double b, double c){
        double per = a*b;
        double ar = (per*c)/2;
        return ar;
    }
    static double areaCuadrado(double a, double b){
        double area = a*b;
        return area;
    }
    static double areaTriangulo(double a, double b){
        double area = (a*b)/2;
        return area;
    }
    static double areaTrapecio(double a, double b, double c){
        double area = ((a+b)*c)/2;
        return area;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("A qué tipo de polígono le quiere sacar el área?");
        System.out.println("1. Regular");
        System.out.println("2. Irregular");
        int rta1 = sc.nextInt();
        if (rta1==1){
            System.out.print("Digite la cantidad de lados del polígono: ");
            double lados = sc.nextDouble();
            System.out.println("");
            System.out.print("Digite la longitud del lado: ");
            double ladom = sc.nextDouble();
            System.out.println("");
            System.out.print("Digite el apotema: ");
            double apotema = sc.nextDouble();
            System.out.println("");
            System.out.print("El área del polígono es: " + poligonoRegular(lados,ladom,apotema));
        } else if(rta1==2){
            double areatotal = 0;
            System.out.print("Cuantas figuras conforman el polígono?: ");
            int nfiguras = sc.nextInt();
            System.out.println("");
            for(int i=1; i<=nfiguras; i++){
                System.out.println("Qué tipo de figura es la figura "+i+":");
                System.out.println("1. Cuadrado/Rectangulo");
                System.out.println("2. Triangulo");
                System.out.println("3. Trapecio");
                int rta2 = sc.nextInt();
                if (rta2==1){
                    System.out.print("Digite el valor del lado 1: ");
                    double lado1 = sc.nextDouble();
                    System.out.println(" ");
                    System.out.print("Digite el valor del lado 2: ");
                    double lado2 = sc.nextDouble();
                    System.out.println(" ");
                    areatotal += areaCuadrado(lado1,lado2);
                } else if(rta2==2){
                    System.out.print("Digite el valor de la base: ");
                    double base = sc.nextDouble();
                    System.out.println(" ");
                    System.out.print("Digite el valor de la altura: ");
                    double altura = sc.nextDouble();
                    System.out.println(" ");
                    areatotal += areaTriangulo(base,altura);
                } else if(rta2==3){
                    System.out.print("Digite el valor de la base mayor: ");
                    double baseMayor = sc.nextDouble();
                    System.out.println(" ");
                    System.out.print("Digite el valor de la base menor: ");
                    double baseMenor = sc.nextDouble();
                    System.out.println(" ");
                    System.out.print("Digite el valor de la altura: ");
                    double altura = sc.nextDouble();
                    System.out.println(" ");
                    areatotal += areaTrapecio(baseMayor,baseMenor, altura);
                }
            }
            System.out.println("El área del polígono irregular es de: "+areatotal);
        } else {
            System.out.println("Ese no es un número válido");
        }
    }
}

class EjercicioTreintayuno{
    public static void main(String[] args){
        for (int i = 0; i<10; i++){
            System.out.println(i);
        }
    }
}

class EjercicioTreintaydos{
    public static void main(String[] args){
        for  (int i = 0; i<20; i++){
            if (i%2!=0){
                System.out.println(i);
            }
        }
    }
}

class EjercicioTreintaytres{
    public static void main(String[] args){
        for (int i = 0; i<19; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}

class EjercicioTreintaycuatro{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un numero entero positivo: ");
        int entp = sc.nextInt();
        if (entp>=0){
            System.out.print(entp);
        } else{
            do{
                System.out.println("Valor inválido, digite un numero entero positivo: ");
                entp = sc.nextInt();
            } while (entp<0);
            System.out.println(entp);
        }

    }
}

class EjercicioTreintaycinco{
    static String convertirABinario(int n) {
        if (n == 0) {
            return "0";
        }

        StringBuilder binario = new StringBuilder();
        int numero = Math.abs(n);

        while (numero > 0) {
            int residuo = numero % 2;
            binario.insert(0, residuo);
            numero = numero / 2;
        }

        return (n < 0) ? "-" + binario.toString() : binario.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número decimal: ");
        int decimal = sc.nextInt();

        String resultado = convertirABinario(decimal);
        System.out.println("En binario: " + resultado);
    }
}

class EjercicioTreintayseis{
    static int convertirADecimal(String binario) {
        int decimal = 0;
        int potencia = 1;


        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);

            if (bit == '1') {
                decimal += potencia;
            } else if (bit != '0') {
                throw new IllegalArgumentException("Error: La entrada solo debe contener '0' y '1'.");
            }

            potencia *= 2;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número binario: ");
        String binario = scanner.nextLine().trim();

        try {
            int decimal = convertirADecimal(binario);
            System.out.println("En decimal: " + decimal);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class EjercicioTreintaysiete{
        public static void main(String[] args) {
            int filas = 10;
            for (int i = 1; i <= filas; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
}

class EjercicioTreintayocho{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas filas quiere ver?");
        int filas = sc.nextInt();
        String charr = "@";
        for (int i = 1; i <= filas; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(charr);
            }
            System.out.println();
        }
    }
}

class EjercicioTreintaynueve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas filas quiere ver?");
        int filas = sc.nextInt();
        for (int i = 0; i < filas; i++){
            for (int espacios = 0; espacios < i; espacios++){
                System.out.print(" ");
            }
            for (int j = 0; j<(filas-i); j++){
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}

//Capacidad maxima = 18.000 kg
//BultoMax = 500 kg
//Bultos: [0,25] = 0*kg; [26, 300] = 1500*kg; [301, 500] = 2500*kg
//Solicitar:
//1. Número total de bultos ingresados para el vuelo.
//2. Peso del bulto más pesado, y del más liviano.
//3. Peso promedio de los bultos.
//4. Ingreso en pesos y en dólares por concepto de carga
//
//Al menos 15 bultos

class EjercicioFinal {

    static double calcularValorBulto(double peso) {
        if (peso <= 25) {
            return 0;
        } else if (peso <= 300) {
            return peso * 1500;
        } else {
            return peso * 2500;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double CAPACIDAD_MAXIMA = 18000.0;
        final double PESO_MAX_BULTO = 500.0;
        final double TASA_DOLAR = 3250.0;

        int totalBultos = 0;
        double pesoAcumuladoTotal = 0;
        double ingresoTotalPesos = 0;

        double pesoMaximo = -1;
        double pesoMinimo = Double.MAX_VALUE;

        System.out.println("#### SISTEMA DE RECEPCIÓN DE EQUIPAJE - BOEING 747 ####");
        System.out.println("Capacidad máxima de carga: " + CAPACIDAD_MAXIMA + " kg");
        System.out.println("Peso máximo permitido por bulto: " + PESO_MAX_BULTO + " kg");
        System.out.println("Nota: Ingrese 0 o un valor negativo en el peso para finalizar el registro.\n");

        while (true) {
            System.out.print("Digite el peso del bulto #" + (totalBultos + 1) + " en kg: ");
            double peso = sc.nextDouble();
            if (peso <= 0) {
                if (totalBultos < 15) {
                    System.out.println("Aviso: Se requiere una prueba con al menos 15 bultos. Lleva registrados " + totalBultos + " bultos.");
                    System.out.print("¿Desea cerrar el vuelo de todas formas? (true: sí / false: no): ");
                    boolean confirmar = sc.nextBoolean();
                    if (!confirmar) {
                        continue;
                    }
                }
                break;
            }
            if (peso > PESO_MAX_BULTO) {
                System.out.println("Error: El bulto supera el peso individual permitido (máx 500 kg). No se recibe.");
                continue;
            }
            if (pesoAcumuladoTotal + peso > CAPACIDAD_MAXIMA) {
                System.out.println("Error: El bulto excede la capacidad restante del avión ("
                        + (CAPACIDAD_MAXIMA - pesoAcumuladoTotal) + " kg disponibles). No se puede cargar.");
                continue;
            }

            totalBultos++;
            pesoAcumuladoTotal += peso;
            double costoBulto = calcularValorBulto(peso);
            ingresoTotalPesos += costoBulto;

            if (peso > pesoMaximo) {
                pesoMaximo = peso;
            }
            if (peso < pesoMinimo) {
                pesoMinimo = peso;
            }
            System.out.println("-> Bulto #" + totalBultos + " aceptado. Costo de carga: $" + costoBulto + " COP.");
            System.out.println("-> Capacidad restante en el avión: " + (CAPACIDAD_MAXIMA - pesoAcumuladoTotal) + " kg\n");
        }

        System.out.println("\n================ RESUMEN DEL VUELO ================");
        if (totalBultos > 0) {
            double pesoPromedio = pesoAcumuladoTotal / totalBultos;
            double ingresoTotalDolares = ingresoTotalPesos / TASA_DOLAR;

            System.out.println("   Número total de bultos ingresados: " + totalBultos);
            System.out.println("   Peso total acumulado: " + pesoAcumuladoTotal + " kg / " + CAPACIDAD_MAXIMA + " kg");
            System.out.println("   Peso del bulto más pesado: " + pesoMaximo + " kg");
            System.out.println("   Peso del bulto más liviano: " + pesoMinimo + " kg");
            System.out.println("   Peso promedio de los bultos: " + String.format("%.2f", pesoPromedio) + " kg");
            System.out.println("   Ingreso total en pesos: $" + ingresoTotalPesos + " COP");
            System.out.println("   Ingreso total en dólares: $" + String.format("%.2f", ingresoTotalDolares) + " USD (tasa $" + TASA_DOLAR + ")");
        } else {
            System.out.println("No se ingresaron bultos para este vuelo.");
        }
        System.out.println("===================================================");
    }
}