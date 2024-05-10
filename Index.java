import java.util.Scanner;
    public class Index {
    public static void main (String[]args) {
        Integer Número = 0;
        String Nome = "";
        String Agencia = "";
        Double Saldo = 0.0;

        Scanner x = new Scanner(System.in);

        System.out.println ("Por favor insira o número de sua conta");
        Número = x.nextInt();
        System.out.println ("Por favor insira o seu saldo");
        Saldo = x.nextDouble();
        System.out.println ("Por favor insira o número de sua agência");
        Agencia = x.next();
        System.out.println ("Por favor insira o seu nome");
        Nome = x.next();

        System.out.println (("olá ") + Nome + (" obrigado por criar uma conta em nosso banco, sua agência é ") + Agencia + (" conta ") + Número + (" e seu saldo de ") + Saldo + (" Ja está disponível"));



}
}
