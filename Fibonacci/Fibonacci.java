public class Fibonacci{
    public static void main(String[] args) {
        int repetir = 10;
        int anterior = 0;
        int atual = 1;
        while(0 <= repetir){
            System.out.println(atual);
            atual = atual + anterior;
            anterior = atual - anterior;
            repetir--;
        }
    }
}