package s0;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n0.i2;
import n0.i4;
import n0.o0;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30448a;
    public final int b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f30449c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f30450d;

    public p(o0 o0Var, Rational rational) {
        this.f30448a = o0Var.d();
        this.b = o0Var.i();
        this.f30449c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f30450d = z10;
    }

    public static Size a(Size size, int i10, int i11, int i12) {
        return (size == null || !e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static Rational b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : o.k(list)) {
            if (p0.a.a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static boolean e(int i10, int i11, int i12) {
        int iA = p0.c.a(p0.c.b(i10), i12, 1 == i11);
        return iA == 90 || iA == 270;
    }

    public final Rational c(i2 i2Var, List<Size> list) {
        if (i2Var.A()) {
            return o.n(i2Var.C(), this.f30450d);
        }
        Size sizeD = d(i2Var);
        if (sizeD != null) {
            return b(sizeD, list);
        }
        return null;
    }

    public final Size d(i2 i2Var) {
        return a(i2Var.V(null), i2Var.J(0), this.b, this.f30448a);
    }

    public List<Size> f(List<Size> list, i4<?> i4Var) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new p0.e(true));
        ArrayList arrayList2 = new ArrayList();
        i2 i2Var = (i2) i4Var;
        Size sizeI = i2Var.i(null);
        int i10 = 0;
        Size size = (Size) arrayList.get(0);
        if (sizeI == null || w0.d.c(size) < w0.d.c(sizeI)) {
            sizeI = size;
        }
        Size sizeD = d(i2Var);
        Size size2 = w0.d.f33584c;
        int iC = w0.d.c(size2);
        if (w0.d.c(sizeI) < iC) {
            size2 = w0.d.f33583a;
        } else if (sizeD != null && w0.d.c(sizeD) < iC) {
            size2 = sizeD;
        }
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj = arrayList.get(i11);
            i11++;
            Size size4 = (Size) obj;
            if (w0.d.c(size4) <= w0.d.c(sizeI) && w0.d.c(size4) >= w0.d.c(size2) && !arrayList2.contains(size4)) {
                arrayList2.add(size4);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeI + "\ninitial size list: " + arrayList);
        }
        Rational rationalC = c(i2Var, arrayList2);
        if (sizeD == null) {
            sizeD = i2Var.R(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalC == null) {
            arrayList3.addAll(arrayList2);
            if (sizeD != null) {
                o.q(arrayList3, sizeD, true);
                return arrayList3;
            }
        } else {
            Map<Rational, List<Size>> mapO = o.o(arrayList2);
            if (sizeD != null) {
                Iterator<Rational> it = mapO.keySet().iterator();
                while (it.hasNext()) {
                    o.q(mapO.get(it.next()), sizeD, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapO.keySet());
            Collections.sort(arrayList4, new p0.a.C0489a(rationalC, this.f30449c));
            int size5 = arrayList4.size();
            while (i10 < size5) {
                Object obj2 = arrayList4.get(i10);
                i10++;
                for (Size size6 : mapO.get((Rational) obj2)) {
                    if (!arrayList3.contains(size6)) {
                        arrayList3.add(size6);
                    }
                }
            }
        }
        return arrayList3;
    }
}
