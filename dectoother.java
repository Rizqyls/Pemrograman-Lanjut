package modul3;

class DecToOthers {
    static void printBase(int num, int base) {
        String digits = "0123456789abcdef";
        // String result = "";
        // while (num != 0) {
        //     int rem = num % base;
        //     num = num / base;
        //     result = digits.charAt(rem) + result;
        // }
        // System.out.println("Hasil konversi: " + result);
        if (num >= base){
            printBase(num / base, base);
        }
        System.out.print(digits.charAt(num % base));
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Masukkan bilangan bulat: ");
        int num = sc.nextInt();
        System.out.print("Masukkan basis: ");
        int base = sc.nextInt();
        printBase(num, base);
    }
}
