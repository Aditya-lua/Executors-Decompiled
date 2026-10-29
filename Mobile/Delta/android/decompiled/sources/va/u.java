package va;

/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(29);
        sb2.append((CharSequence) "expected a non-null reference", 0, 29);
        throw new v(sb2.toString());
    }
}
