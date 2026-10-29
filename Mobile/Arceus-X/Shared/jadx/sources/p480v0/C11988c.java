package p480v0;

import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import p454u0.C11766b;

/* JADX INFO: renamed from: v0.c */
/* JADX INFO: loaded from: classes.dex */
public class C11988c {

    /* JADX INFO: renamed from: a */
    public final LargeJpegImageQuirk f42462a = (LargeJpegImageQuirk) C11766b.m44046b(LargeJpegImageQuirk.class);

    /* JADX INFO: renamed from: a */
    public static int m44741a(byte[] bArr) {
        byte b;
        int i10 = 2;
        while (i10 + 4 <= bArr.length && (b = bArr[i10]) == -1) {
            int i11 = i10 + 2;
            int i12 = ((bArr[i11] & 255) << 8) | (bArr[i10 + 3] & 255);
            if (b == -1 && bArr[i10 + 1] == -38) {
                while (true) {
                    int i13 = i11 + 2;
                    if (i13 > bArr.length) {
                        return -1;
                    }
                    if (bArr[i11] == -1 && bArr[i11 + 1] == -39) {
                        return i13;
                    }
                    i11++;
                }
            } else {
                i10 += i12 + 2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public int m44742b(byte[] bArr) {
        LargeJpegImageQuirk largeJpegImageQuirk = this.f42462a;
        if (largeJpegImageQuirk == null || !largeJpegImageQuirk.m2253k(bArr)) {
            return bArr.length;
        }
        int iM44741a = m44741a(bArr);
        return iM44741a != -1 ? iM44741a : bArr.length;
    }
}
