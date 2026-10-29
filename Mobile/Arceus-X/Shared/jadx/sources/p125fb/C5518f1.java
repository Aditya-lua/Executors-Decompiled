package p125fb;

/* JADX INFO: renamed from: fb.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5518f1 {
    /* JADX INFO: renamed from: a */
    public static int m25176a(int i10, String str) {
        if (i10 >= 0) {
            return i10;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 29 + String.valueOf(i10).length());
        sb2.append(str);
        sb2.append(" cannot be negative but was: ");
        sb2.append(i10);
        throw new IllegalArgumentException(sb2.toString());
    }
}
