package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p216jc.C7137a;
import p377qc.AbstractC10500f;
import p377qc.InterfaceC10496b;
import p426s2.C11162a;

/* JADX INFO: renamed from: com.google.android.material.carousel.c */
/* JADX INFO: loaded from: classes2.dex */
public class C2775c {

    /* JADX INFO: renamed from: a */
    public final C2774b f9892a;

    /* JADX INFO: renamed from: b */
    public final List<C2774b> f9893b;

    /* JADX INFO: renamed from: c */
    public final List<C2774b> f9894c;

    /* JADX INFO: renamed from: d */
    public final float[] f9895d;

    /* JADX INFO: renamed from: e */
    public final float[] f9896e;

    /* JADX INFO: renamed from: f */
    public final float f9897f;

    /* JADX INFO: renamed from: g */
    public final float f9898g;

    public C2775c(@NonNull C2774b c2774b, List<C2774b> list, List<C2774b> list2) {
        this.f9892a = c2774b;
        this.f9893b = Collections.unmodifiableList(list);
        this.f9894c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).m12321c().f9884a - c2774b.m12321c().f9884a;
        this.f9897f = f10;
        float f11 = c2774b.m12328j().f9884a - list2.get(list2.size() - 1).m12328j().f9884a;
        this.f9898g = f11;
        this.f9895d = m12347m(f10, list, true);
        this.f9896e = m12347m(f11, list2, false);
    }

    /* JADX INFO: renamed from: b */
    public static int m12342b(C2774b c2774b, float f10) {
        for (int iM12327i = c2774b.m12327i(); iM12327i < c2774b.m12325g().size(); iM12327i++) {
            if (f10 == c2774b.m12325g().get(iM12327i).f9886c) {
                return iM12327i;
            }
        }
        return c2774b.m12325g().size() - 1;
    }

    /* JADX INFO: renamed from: c */
    public static int m12343c(C2774b c2774b) {
        for (int i10 = 0; i10 < c2774b.m12325g().size(); i10++) {
            if (!c2774b.m12325g().get(i10).f9888e) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m12344d(C2774b c2774b, float f10) {
        for (int iM12320b = c2774b.m12320b() - 1; iM12320b >= 0; iM12320b--) {
            if (f10 == c2774b.m12325g().get(iM12320b).f9886c) {
                return iM12320b;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static int m12345e(C2774b c2774b) {
        for (int size = c2774b.m12325g().size() - 1; size >= 0; size--) {
            if (!c2774b.m12325g().get(size).f9888e) {
                return size;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: f */
    public static C2775c m12346f(InterfaceC10496b interfaceC10496b, C2774b c2774b, float f10, float f11, float f12) {
        return new C2775c(c2774b, m12350p(interfaceC10496b, c2774b, f10, f11), m12348n(interfaceC10496b, c2774b, f10, f12));
    }

    /* JADX INFO: renamed from: m */
    public static float[] m12347m(float f10, List<C2774b> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            C2774b c2774b = list.get(i11);
            C2774b c2774b2 = list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? c2774b2.m12321c().f9884a - c2774b.m12321c().f9884a : c2774b.m12328j().f9884a - c2774b2.m12328j().f9884a) / f10);
            i10++;
        }
        return fArr;
    }

    /* JADX INFO: renamed from: n */
    public static List<C2774b> m12348n(InterfaceC10496b interfaceC10496b, C2774b c2774b, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2774b);
        int iM12345e = m12345e(c2774b);
        float fMo12278a = interfaceC10496b.mo12286f() ? interfaceC10496b.mo12278a() : interfaceC10496b.mo12280b();
        if (!m12352r(interfaceC10496b, c2774b) && iM12345e != -1) {
            int iM12327i = iM12345e - c2774b.m12327i();
            float f12 = c2774b.m12321c().f9885b - (c2774b.m12321c().f9887d / 2.0f);
            if (iM12327i <= 0 && c2774b.m12326h().f9889f > 0.0f) {
                arrayList.add(m12356v(c2774b, f12 - c2774b.m12326h().f9889f, fMo12278a));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iM12327i) {
                C2774b c2774b2 = (C2774b) arrayList.get(arrayList.size() - 1);
                int i11 = iM12345e - i10;
                float f14 = f13 + c2774b.m12325g().get(i11).f9889f;
                int i12 = i11 + 1;
                C2774b c2774bM12354t = m12354t(c2774b2, iM12345e, i12 < c2774b.m12325g().size() ? m12344d(c2774b2, c2774b.m12325g().get(i12).f9886c) + 1 : 0, f12 - f14, c2774b.m12320b() + i10 + 1, c2774b.m12327i() + i10 + 1, fMo12278a);
                if (i10 == iM12327i - 1 && f11 > 0.0f) {
                    c2774bM12354t = m12355u(c2774bM12354t, f11, fMo12278a, false, f10);
                }
                arrayList.add(c2774bM12354t);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(m12355u(c2774b, f11, fMo12278a, false, f10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o */
    public static float[] m12349o(List<C2774b> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{C7137a.m29920b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    /* JADX INFO: renamed from: p */
    public static List<C2774b> m12350p(InterfaceC10496b interfaceC10496b, C2774b c2774b, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c2774b);
        int iM12343c = m12343c(c2774b);
        float fMo12278a = interfaceC10496b.mo12286f() ? interfaceC10496b.mo12278a() : interfaceC10496b.mo12280b();
        if (!m12351q(c2774b) && iM12343c != -1) {
            int iM12320b = c2774b.m12320b() - iM12343c;
            float f12 = c2774b.m12321c().f9885b - (c2774b.m12321c().f9887d / 2.0f);
            if (iM12320b <= 0 && c2774b.m12319a().f9889f > 0.0f) {
                arrayList.add(m12356v(c2774b, f12 + c2774b.m12319a().f9889f, fMo12278a));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iM12320b) {
                C2774b c2774b2 = (C2774b) arrayList.get(arrayList.size() - 1);
                int i11 = iM12343c + i10;
                int size = c2774b.m12325g().size() - 1;
                float f14 = f13 + c2774b.m12325g().get(i11).f9889f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = m12342b(c2774b2, c2774b.m12325g().get(i12).f9886c) - 1;
                }
                C2774b c2774bM12354t = m12354t(c2774b2, iM12343c, size, f12 + f14, (c2774b.m12320b() - i10) - 1, (c2774b.m12327i() - i10) - 1, fMo12278a);
                if (i10 == iM12320b - 1 && f11 > 0.0f) {
                    c2774bM12354t = m12355u(c2774bM12354t, f11, fMo12278a, true, f10);
                }
                arrayList.add(c2774bM12354t);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(m12355u(c2774b, f11, fMo12278a, true, f10));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m12351q(C2774b c2774b) {
        return c2774b.m12319a().f9885b - (c2774b.m12319a().f9887d / 2.0f) >= 0.0f && c2774b.m12319a() == c2774b.m12322d();
    }

    /* JADX INFO: renamed from: r */
    public static boolean m12352r(InterfaceC10496b interfaceC10496b, C2774b c2774b) {
        int iMo12280b = interfaceC10496b.mo12280b();
        if (interfaceC10496b.mo12286f()) {
            iMo12280b = interfaceC10496b.mo12278a();
        }
        return c2774b.m12326h().f9885b + (c2774b.m12326h().f9887d / 2.0f) <= ((float) iMo12280b) && c2774b.m12326h() == c2774b.m12329k();
    }

    /* JADX INFO: renamed from: s */
    public static C2774b m12353s(List<C2774b> list, float f10, float[] fArr) {
        float[] fArrM12349o = m12349o(list, f10, fArr);
        return C2774b.m12317m(list.get((int) fArrM12349o[1]), list.get((int) fArrM12349o[2]), fArrM12349o[0]);
    }

    /* JADX INFO: renamed from: t */
    public static C2774b m12354t(C2774b c2774b, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(c2774b.m12325g());
        arrayList.add(i11, (C2774b.c) arrayList.remove(i10));
        C2774b.b bVar = new C2774b.b(c2774b.m12324f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            C2774b.c cVar = (C2774b.c) arrayList.get(i14);
            float f12 = cVar.f9887d;
            bVar.m12336e(f10 + (f12 / 2.0f), cVar.f9886c, f12, i14 >= i12 && i14 <= i13, cVar.f9888e, cVar.f9889f);
            f10 += cVar.f9887d;
            i14++;
        }
        return bVar.m12340i();
    }

    /* JADX INFO: renamed from: u */
    public static C2774b m12355u(C2774b c2774b, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(c2774b.m12325g());
        C2774b.b bVar = new C2774b.b(c2774b.m12324f(), f11);
        float fM12330l = f10 / c2774b.m12330l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            C2774b.c cVar = (C2774b.c) arrayList.get(i10);
            if (cVar.f9888e) {
                bVar.m12336e(cVar.f9885b, cVar.f9886c, cVar.f9887d, false, true, cVar.f9889f);
            } else {
                boolean z11 = i10 >= c2774b.m12320b() && i10 <= c2774b.m12327i();
                float f14 = cVar.f9887d - fM12330l;
                float fM40323b = AbstractC10500f.m40323b(f14, c2774b.m12324f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.f9885b;
                bVar.m12337f(f15, fM40323b, f14, z11, false, cVar.f9889f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return bVar.m12340i();
    }

    /* JADX INFO: renamed from: v */
    public static C2774b m12356v(C2774b c2774b, float f10, float f11) {
        return m12354t(c2774b, 0, 0, f10, c2774b.m12320b(), c2774b.m12327i(), f11);
    }

    /* JADX INFO: renamed from: a */
    public final C2774b m12357a(List<C2774b> list, float f10, float[] fArr) {
        float[] fArrM12349o = m12349o(list, f10, fArr);
        return fArrM12349o[0] >= 0.5f ? list.get((int) fArrM12349o[2]) : list.get((int) fArrM12349o[1]);
    }

    /* JADX INFO: renamed from: g */
    public C2774b m12358g() {
        return this.f9892a;
    }

    /* JADX INFO: renamed from: h */
    public C2774b m12359h() {
        List<C2774b> list = this.f9894c;
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: i */
    public Map<Integer, C2774b> m12360i(int i10, int i11, int i12, boolean z10) {
        float fM12324f = this.f9892a.m12324f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * fM12324f * (z10 ? -1 : 1) > i12 - this.f9898g || i13 >= i10 - this.f9894c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List<C2774b> list = this.f9894c;
                map.put(numValueOf, list.get(C11162a.m42060c(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * fM12324f * (z10 ? -1 : 1) < i11 + this.f9897f || i17 < this.f9893b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List<C2774b> list2 = this.f9893b;
                map.put(numValueOf2, list2.get(C11162a.m42060c(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: j */
    public C2774b m12361j(float f10, float f11, float f12) {
        return m12362k(f10, f11, f12, false);
    }

    /* JADX INFO: renamed from: k */
    public C2774b m12362k(float f10, float f11, float f12, boolean z10) {
        float fM29920b;
        List<C2774b> list;
        float[] fArr;
        float f13 = this.f9897f + f11;
        float f14 = f12 - this.f9898g;
        float f15 = m12363l().m12319a().f9890g;
        float f16 = m12359h().m12326h().f9891h;
        if (this.f9897f == f15) {
            f13 += f15;
        }
        if (this.f9898g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fM29920b = C7137a.m29920b(1.0f, 0.0f, f11, f13, f10);
            list = this.f9893b;
            fArr = this.f9895d;
        } else {
            if (f10 <= f14) {
                return this.f9892a;
            }
            fM29920b = C7137a.m29920b(0.0f, 1.0f, f14, f12, f10);
            list = this.f9894c;
            fArr = this.f9896e;
        }
        return z10 ? m12357a(list, fM29920b, fArr) : m12353s(list, fM29920b, fArr);
    }

    /* JADX INFO: renamed from: l */
    public C2774b m12363l() {
        List<C2774b> list = this.f9893b;
        return list.get(list.size() - 1);
    }
}
