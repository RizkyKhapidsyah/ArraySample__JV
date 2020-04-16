import com.rk.as.*;

public class Programs {
    public static void main(String[] args) {
        CetakJudul('-',"Array: Contoh 1",30);
        Array_Contoh1.main(null);
        CetakJudul('-',"Array: Contoh 2",30);
        Array_Contoh2.main(null);
        CetakJudul('-',"Array: Contoh 3",30);
        Array_Contoh3.main(null);
    }

    public static void CetakJudul(char A, String B, int C) {
        int i;

        for (i = 0; i <= C; i++) {
            System.out.print(A);
        }
        System.out.println("\n" + B);
        for (i = 0; i <= C; i++) {
            System.out.print(A);
        }
        System.out.println();
    }
}
