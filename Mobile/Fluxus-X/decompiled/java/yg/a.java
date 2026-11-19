package yg;

import ah.c;
import ah.g;
import java.util.Map;
import wg.b;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static b b(g gVar, int i10, int i11, int i12) {
        ah.b bVarA = gVar.a();
        if (bVarA == null) {
            throw new IllegalStateException();
        }
        int iE = bVarA.e();
        int iD = bVarA.d();
        int i13 = i12 * 2;
        int i14 = iE + i13;
        int i15 = i13 + iD;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (iE * iMin)) / 2;
        int i17 = (iMax2 - (iD * iMin)) / 2;
        b bVar = new b(iMax, iMax2);
        int i18 = 0;
        while (i18 < iD) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < iE) {
                if (bVarA.b(i19, i18) == 1) {
                    bVar.e(i20, i17, iMin, iMin);
                }
                i19++;
                i20 += iMin;
            }
            i18++;
            i17 += iMin;
        }
        return bVar;
    }

    public b a(String str, vg.a aVar, int i10, int i11, Map<vg.b, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != vg.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + aVar);
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        zg.a aVarValueOf = zg.a.L;
        int i12 = 4;
        if (map != null) {
            vg.b bVar = vg.b.ERROR_CORRECTION;
            if (map.containsKey(bVar)) {
                aVarValueOf = zg.a.valueOf(map.get(bVar).toString());
            }
            vg.b bVar2 = vg.b.MARGIN;
            if (map.containsKey(bVar2)) {
                i12 = Integer.parseInt(map.get(bVar2).toString());
            }
        }
        return b(c.n(str, aVarValueOf, map), i10, i11, i12);
    }
}
