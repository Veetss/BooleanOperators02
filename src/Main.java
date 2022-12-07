//PROVA "CARTACEA"
//[A]: (55 != 55) && (false ^ true) = falso e vero -> F
//[B]: considering that a=true, b=false, int c=2 and char d='2': (!a//falsa || !b//vera)//vera || c == d //vera ) = V
//[C]: false && true || false && !false = falso o falso -> F
//[D]: (false && true) || (false || true)) = falso o vero -> V

public class Main {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        int c = 2;
        char d = 'd';
        System.out.println((55 != 55) && (false ^ true));
        System.out.println((!a || !b) || c == d);
        System.out.println(false && true || false && !false);
        System.out.println((false && true) || (false || true));

    }
}
