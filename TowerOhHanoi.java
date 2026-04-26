package modul3;

public class TowerOhHanoi {

    public static void solveHanoi(int n, char source, char dest, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from peg " + source + " to peg " + dest);
            return;
        }
        solveHanoi(n - 1, source, aux, dest);
        System.out.println("Move disk " + n + " from peg " + source + " to peg " + dest);
        solveHanoi(n - 1, aux, dest, source);
    }

    public static void main(String[] args) {
        int numDisks = 3;
        solveHanoi(numDisks, 'A', 'C', 'B');
    }

}
