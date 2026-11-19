package z;

/* JADX INFO: loaded from: classes.dex */
public class o4 {
    public static int a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                g0.r1.l("LensFacingUtil", "The given lens facing integer: " + i10 + " can not be recognized.");
                return -1;
            }
        }
        return i11;
    }
}
