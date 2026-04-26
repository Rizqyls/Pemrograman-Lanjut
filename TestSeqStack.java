package modul3;

class SeqStack {
    int top = -1; /* pada permulaan, stack kosong */
    int memSpace[]; /* penyimpanan untuk integer */
    int limit; /* ukuran dari memSpace */

    SeqStack() {
        memSpace = new int[10];
        limit = 10;
    }

    SeqStack(int size) {
        memSpace = new int[size];
        limit = size;
    }

    boolean push(int value) {
        top++;
        /* memeriksa apakah stack penuh */
        if (top < limit) {
            memSpace[top] = value;
        } else {
            top--;
            return false;
        }
        return true;
    }

    int pop() {
        int temp = -1;
        /* memeriksa apakah stack kosong */
        if (top >= 0) {
            temp = memSpace[top];
            top--;
        } else {
            return -1;
        }
        return temp;
    }

    /* fungsi untuk menampilkan semua isi stack */
    void display() {
        if (top == -1) {
            System.out.println("Stack kosong");
            return;
        }
        System.out.print("Isi stack (bottom to top): ");
        for (int i = 0; i <= top; i++) {
            System.out.print(memSpace[i]);
            if (i < top) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }
}

public class TestSeqStack {
    public static void main(String[] args) {
        SeqStack stack = new SeqStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();
        System.out.println("Pop: " + stack.pop());
        System.out.println("Pop: " + stack.pop());
        stack.display();
    }
}

