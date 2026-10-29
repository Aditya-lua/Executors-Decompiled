package com.google.android.material.carousel;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pc.f;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f7735a;
    public final List<b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<b> f7736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float[] f7737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f7738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f7739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f7740g;

    public c(@NonNull b bVar, List<b> list, List<b> list2) {
        this.f7735a = bVar;
        this.b = Collections.unmodifiableList(list);
        this.f7736c = Collections.unmodifiableList(list2);
        float f10 = list.get(list.size() - 1).c().f7728a - bVar.c().f7728a;
        this.f7739f = f10;
        float f11 = bVar.j().f7728a - list2.get(list2.size() - 1).j().f7728a;
        this.f7740g = f11;
        this.f7737d = m(f10, list, true);
        this.f7738e = m(f11, list2, false);
    }

    public static int b(b bVar, float f10) {
        for (int i10 = bVar.i(); i10 < bVar.g().size(); i10++) {
            if (f10 == bVar.g().get(i10).f7729c) {
                return i10;
            }
        }
        return bVar.g().size() - 1;
    }

    public static int c(b bVar) {
        for (int i10 = 0; i10 < bVar.g().size(); i10++) {
            if (!bVar.g().get(i10).f7731e) {
                return i10;
            }
        }
        return -1;
    }

    public static int d(b bVar, float f10) {
        for (int iB = bVar.b() - 1; iB >= 0; iB--) {
            if (f10 == bVar.g().get(iB).f7729c) {
                return iB;
            }
        }
        return 0;
    }

    public static int e(b bVar) {
        for (int size = bVar.g().size() - 1; size >= 0; size--) {
            if (!bVar.g().get(size).f7731e) {
                return size;
            }
        }
        return -1;
    }

    public static c f(pc.b bVar, b bVar2, float f10, float f11, float f12) {
        return new c(bVar2, p(bVar, bVar2, f10, f11), n(bVar, bVar2, f10, f12));
    }

    public static float[] m(float f10, List<b> list, boolean z10) {
        int size = list.size();
        float[] fArr = new float[size];
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            b bVar = list.get(i11);
            b bVar2 = list.get(i10);
            fArr[i10] = i10 == size + (-1) ? 1.0f : fArr[i11] + ((z10 ? bVar2.c().f7728a - bVar.c().f7728a : bVar.j().f7728a - bVar2.j().f7728a) / f10);
            i10++;
        }
        return fArr;
    }

    public static List<b> n(pc.b bVar, b bVar2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int iE = e(bVar2);
        float fA = bVar.f() ? bVar.a() : bVar.b();
        if (!r(bVar, bVar2) && iE != -1) {
            int i10 = iE - bVar2.i();
            float f12 = bVar2.c().b - (bVar2.c().f7730d / 2.0f);
            if (i10 <= 0 && bVar2.h().f7732f > 0.0f) {
                arrayList.add(v(bVar2, f12 - bVar2.h().f7732f, fA));
                return arrayList;
            }
            int i11 = 0;
            float f13 = 0.0f;
            while (i11 < i10) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i12 = iE - i11;
                float f14 = f13 + bVar2.g().get(i12).f7732f;
                int i13 = i12 + 1;
                b bVarT = t(bVar3, iE, i13 < bVar2.g().size() ? d(bVar3, bVar2.g().get(i13).f7729c) + 1 : 0, f12 - f14, bVar2.b() + i11 + 1, bVar2.i() + i11 + 1, fA);
                if (i11 == i10 - 1 && f11 > 0.0f) {
                    bVarT = u(bVarT, f11, fA, false, f10);
                }
                arrayList.add(bVarT);
                i11++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, fA, false, f10));
        }
        return arrayList;
    }

    public static float[] o(List<b> list, float f10, float[] fArr) {
        int size = list.size();
        float f11 = fArr[0];
        int i10 = 1;
        while (i10 < size) {
            float f12 = fArr[i10];
            if (f10 <= f12) {
                return new float[]{ic.a.b(0.0f, 1.0f, f11, f12, f10), i10 - 1, i10};
            }
            i10++;
            f11 = f12;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static List<b> p(pc.b bVar, b bVar2, float f10, float f11) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar2);
        int iC = c(bVar2);
        float fA = bVar.f() ? bVar.a() : bVar.b();
        if (!q(bVar2) && iC != -1) {
            int iB = bVar2.b() - iC;
            float f12 = bVar2.c().b - (bVar2.c().f7730d / 2.0f);
            if (iB <= 0 && bVar2.a().f7732f > 0.0f) {
                arrayList.add(v(bVar2, f12 + bVar2.a().f7732f, fA));
                return arrayList;
            }
            int i10 = 0;
            float f13 = 0.0f;
            while (i10 < iB) {
                b bVar3 = (b) arrayList.get(arrayList.size() - 1);
                int i11 = iC + i10;
                int size = bVar2.g().size() - 1;
                float f14 = f13 + bVar2.g().get(i11).f7732f;
                int i12 = i11 - 1;
                if (i12 >= 0) {
                    size = b(bVar3, bVar2.g().get(i12).f7729c) - 1;
                }
                b bVarT = t(bVar3, iC, size, f12 + f14, (bVar2.b() - i10) - 1, (bVar2.i() - i10) - 1, fA);
                if (i10 == iB - 1 && f11 > 0.0f) {
                    bVarT = u(bVarT, f11, fA, true, f10);
                }
                arrayList.add(bVarT);
                i10++;
                f13 = f14;
            }
        } else if (f11 > 0.0f) {
            arrayList.add(u(bVar2, f11, fA, true, f10));
        }
        return arrayList;
    }

    public static boolean q(b bVar) {
        return bVar.a().b - (bVar.a().f7730d / 2.0f) >= 0.0f && bVar.a() == bVar.d();
    }

    public static boolean r(pc.b bVar, b bVar2) {
        int iB = bVar.b();
        if (bVar.f()) {
            iB = bVar.a();
        }
        return bVar2.h().b + (bVar2.h().f7730d / 2.0f) <= ((float) iB) && bVar2.h() == bVar2.k();
    }

    public static b s(List<b> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return b.m(list.get((int) fArrO[1]), list.get((int) fArrO[2]), fArrO[0]);
    }

    public static b t(b bVar, int i10, int i11, float f10, int i12, int i13, float f11) {
        ArrayList arrayList = new ArrayList(bVar.g());
        arrayList.add(i11, (b.c) arrayList.remove(i10));
        b.C0118b c0118b = new b.C0118b(bVar.f(), f11);
        int i14 = 0;
        while (i14 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i14);
            float f12 = cVar.f7730d;
            c0118b.e(f10 + (f12 / 2.0f), cVar.f7729c, f12, i14 >= i12 && i14 <= i13, cVar.f7731e, cVar.f7732f);
            f10 += cVar.f7730d;
            i14++;
        }
        return c0118b.i();
    }

    public static b u(b bVar, float f10, float f11, boolean z10, float f12) {
        ArrayList arrayList = new ArrayList(bVar.g());
        b.C0118b c0118b = new b.C0118b(bVar.f(), f11);
        float fL = f10 / bVar.l();
        float f13 = z10 ? f10 : 0.0f;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            b.c cVar = (b.c) arrayList.get(i10);
            if (cVar.f7731e) {
                c0118b.e(cVar.b, cVar.f7729c, cVar.f7730d, false, true, cVar.f7732f);
            } else {
                boolean z11 = i10 >= bVar.b() && i10 <= bVar.i();
                float f14 = cVar.f7730d - fL;
                float fB = f.b(f14, bVar.f(), f12);
                float f15 = (f14 / 2.0f) + f13;
                float f16 = f15 - cVar.b;
                c0118b.f(f15, fB, f14, z11, false, cVar.f7732f, z10 ? f16 : 0.0f, z10 ? 0.0f : f16);
                f13 += f14;
            }
            i10++;
        }
        return c0118b.i();
    }

    public static b v(b bVar, float f10, float f11) {
        return t(bVar, 0, 0, f10, bVar.b(), bVar.i(), f11);
    }

    public final b a(List<b> list, float f10, float[] fArr) {
        float[] fArrO = o(list, f10, fArr);
        return fArrO[0] >= 0.5f ? list.get((int) fArrO[2]) : list.get((int) fArrO[1]);
    }

    public b g() {
        return this.f7735a;
    }

    public b h() {
        List<b> list = this.f7736c;
        return list.get(list.size() - 1);
    }

    public Map<Integer, b> i(int i10, int i11, int i12, boolean z10) {
        float f10 = this.f7735a.f();
        HashMap map = new HashMap();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 >= i10) {
                break;
            }
            int i15 = z10 ? (i10 - i13) - 1 : i13;
            if (i15 * f10 * (z10 ? -1 : 1) > i12 - this.f7740g || i13 >= i10 - this.f7736c.size()) {
                Integer numValueOf = Integer.valueOf(i15);
                List<b> list = this.f7736c;
                map.put(numValueOf, list.get(s2.a.c(i14, 0, list.size() - 1)));
                i14++;
            }
            i13++;
        }
        int i16 = 0;
        for (int i17 = i10 - 1; i17 >= 0; i17--) {
            int i18 = z10 ? (i10 - i17) - 1 : i17;
            if (i18 * f10 * (z10 ? -1 : 1) < i11 + this.f7739f || i17 < this.b.size()) {
                Integer numValueOf2 = Integer.valueOf(i18);
                List<b> list2 = this.b;
                map.put(numValueOf2, list2.get(s2.a.c(i16, 0, list2.size() - 1)));
                i16++;
            }
        }
        return map;
    }

    public b j(float f10, float f11, float f12) {
        return k(f10, f11, f12, false);
    }

    public b k(float f10, float f11, float f12, boolean z10) {
        float fB;
        List<b> list;
        float[] fArr;
        float f13 = this.f7739f + f11;
        float f14 = f12 - this.f7740g;
        float f15 = l().a().f7733g;
        float f16 = h().h().f7734h;
        if (this.f7739f == f15) {
            f13 += f15;
        }
        if (this.f7740g == f16) {
            f14 -= f16;
        }
        if (f10 < f13) {
            fB = ic.a.b(1.0f, 0.0f, f11, f13, f10);
            list = this.b;
            fArr = this.f7737d;
        } else {
            if (f10 <= f14) {
                return this.f7735a;
            }
            fB = ic.a.b(0.0f, 1.0f, f14, f12, f10);
            list = this.f7736c;
            fArr = this.f7738e;
        }
        return z10 ? a(list, fB, fArr) : s(list, fB, fArr);
    }

    public b l() {
        List<b> list = this.b;
        return list.get(list.size() - 1);
    }
}
