package pg;

import java.util.Map;
import mg.EnumC8520a;
import mg.EnumC8521b;
import ng.C9471b;
import p381qg.EnumC10578a;
import p411rg.C10874b;
import p411rg.C10875c;
import p411rg.C10879g;

/* JADX INFO: renamed from: pg.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C10251a {
    /* JADX INFO: renamed from: b */
    public static C9471b m39404b(C10879g c10879g, int i10, int i11, int i12) {
        C10874b c10874bM41419a = c10879g.m41419a();
        if (c10874bM41419a == null) {
            throw new IllegalStateException();
        }
        int iM41332e = c10874bM41419a.m41332e();
        int iM41331d = c10874bM41419a.m41331d();
        int i13 = i12 * 2;
        int i14 = iM41332e + i13;
        int i15 = i13 + iM41331d;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (iM41332e * iMin)) / 2;
        int i17 = (iMax2 - (iM41331d * iMin)) / 2;
        C9471b c9471b = new C9471b(iMax, iMax2);
        int i18 = 0;
        while (i18 < iM41331d) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < iM41332e) {
                if (c10874bM41419a.m41329b(i19, i18) == 1) {
                    c9471b.m37318e(i20, i17, iMin, iMin);
                }
                i19++;
                i20 += iMin;
            }
            i18++;
            i17 += iMin;
        }
        return c9471b;
    }

    /* JADX INFO: renamed from: a */
    public C9471b m39405a(String str, EnumC8520a enumC8520a, int i10, int i11, Map<EnumC8521b, ?> map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (enumC8520a != EnumC8520a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got " + enumC8520a);
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        EnumC10578a enumC10578aValueOf = EnumC10578a.L;
        int i12 = 4;
        if (map != null) {
            EnumC8521b enumC8521b = EnumC8521b.ERROR_CORRECTION;
            if (map.containsKey(enumC8521b)) {
                enumC10578aValueOf = EnumC10578a.valueOf(map.get(enumC8521b).toString());
            }
            EnumC8521b enumC8521b2 = EnumC8521b.MARGIN;
            if (map.containsKey(enumC8521b2)) {
                i12 = Integer.parseInt(map.get(enumC8521b2).toString());
            }
        }
        return m39404b(C10875c.m41348n(str, enumC10578aValueOf, map), i10, i11, i12);
    }
}
