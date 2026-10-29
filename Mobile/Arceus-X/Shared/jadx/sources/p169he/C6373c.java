package p169he;

/* JADX INFO: renamed from: he.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C6373c {
    /* JADX INFO: renamed from: a */
    public static boolean m27889a(char c10) {
        return c10 >= 'a' && c10 <= 'z';
    }

    /* JADX INFO: renamed from: b */
    public static boolean m27890b(char c10) {
        return c10 >= 'A' && c10 <= 'Z';
    }

    /* JADX INFO: renamed from: c */
    public static char m27891c(char c10) {
        return m27890b(c10) ? (char) (c10 ^ ' ') : c10;
    }
}
