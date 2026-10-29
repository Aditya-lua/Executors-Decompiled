package p125fb;

/* JADX INFO: renamed from: fb.i2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5531i2 {
    /* JADX INFO: renamed from: a */
    public static String m25198a(int i10) {
        if (i10 == 0) {
            return "DAILY";
        }
        if (i10 == 1) {
            return "WEEKLY";
        }
        if (i10 == 2) {
            return "ALL_TIME";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 18);
        sb2.append("Unknown time span ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
