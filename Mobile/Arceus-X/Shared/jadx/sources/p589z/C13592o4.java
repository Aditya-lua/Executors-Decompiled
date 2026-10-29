package p589z;

import p140g0.C5931r1;

/* JADX INFO: renamed from: z.o4 */
/* JADX INFO: loaded from: classes.dex */
public class C13592o4 {
    /* JADX INFO: renamed from: a */
    public static int m49564a(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                C5931r1.m26572l("LensFacingUtil", "The given lens facing integer: " + i10 + " can not be recognized.");
                return -1;
            }
        }
        return i11;
    }
}
