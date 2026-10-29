package p270le;

/* JADX INFO: renamed from: le.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C8128b {
    /* JADX INFO: renamed from: a */
    public static int m33349a(String str, int i10) {
        if (i10 > 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26);
        sb2.append(str);
        sb2.append(" (");
        sb2.append(i10);
        sb2.append(") must be > 0");
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    public static void m33350b(boolean z10) {
        if (!z10) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
