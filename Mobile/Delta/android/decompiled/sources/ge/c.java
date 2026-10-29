package ge;

/* JADX INFO: loaded from: classes2.dex */
public final class c {
    public static boolean a(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    public static boolean b(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    public static char c(char c10) {
        return b(c10) ? (char) (c10 ^ ' ') : c10;
    }
}
