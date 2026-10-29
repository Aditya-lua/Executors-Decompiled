package p347p0;

import p140g0.C5931r1;

/* JADX INFO: renamed from: p0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C10087c {
    /* JADX INFO: renamed from: a */
    public static int m38902a(int i10, int i11, boolean z10) {
        int i12 = z10 ? ((i11 - i10) + 360) % 360 : (i11 + i10) % 360;
        if (C5931r1.m26568h("CameraOrientationUtil")) {
            C5931r1.m26561a("CameraOrientationUtil", String.format("getRelativeImageRotation: destRotationDegrees=%s, sourceRotationDegrees=%s, isOppositeFacing=%s, result=%s", Integer.valueOf(i10), Integer.valueOf(i11), Boolean.valueOf(z10), Integer.valueOf(i12)));
        }
        return i12;
    }

    /* JADX INFO: renamed from: b */
    public static int m38903b(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 90;
        }
        if (i10 == 2) {
            return 180;
        }
        if (i10 == 3) {
            return 270;
        }
        throw new IllegalArgumentException("Unsupported surface rotation: " + i10);
    }
}
