package p213j9;

/* JADX INFO: renamed from: j9.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7106k0 {
    /* JADX INFO: renamed from: a */
    public static int m29913a(int i10) {
        int[] iArr = {1, 2, 3, 4, 5, 6};
        for (int i11 = 0; i11 < 6; i11++) {
            int i12 = iArr[i11];
            int i13 = i12 - 1;
            if (i12 == 0) {
                throw null;
            }
            if (i13 == i10) {
                return i12;
            }
        }
        return 1;
    }
}
