package gk;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    public static int a(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }
}
