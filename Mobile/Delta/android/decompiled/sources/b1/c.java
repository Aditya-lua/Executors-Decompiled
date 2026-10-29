package b1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import g0.r1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import n0.i2;
import n0.i4;
import n0.o0;
import n0.p0;
import n0.w2;
import p0.a0;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f3780h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f3781a;
    public final Rational b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rational f3782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<i4<?>> f3783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s0.o f3784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f3785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map<i4<?>, List<Size>> f3786g;

    public static class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rational f3787a;
        public final boolean b;

        public a(Rational rational, boolean z10) {
            this.f3787a = rational;
            this.b = z10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fC = c.c(rational, this.f3787a);
            float fC2 = c.c(rational2, this.f3787a);
            return this.b ? Float.compare(fC2, fC) : Float.compare(fC, fC2);
        }
    }

    public c(p0 p0Var, Set<i4<?>> set) {
        this(a0.m(p0Var.k().h()), p0Var.k(), set);
    }

    public static boolean A(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    public static List<Size> E(List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    public static Rect F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    public static void M(List<Size> list) {
        Collections.sort(list, new p0.e(true));
    }

    public static Rational N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    public static Rational O(Size size) {
        Rational rational = p0.a.f28051a;
        if (p0.a.a(size, rational)) {
            return rational;
        }
        Rational rational2 = p0.a.f28052c;
        return p0.a.a(size, rational2) ? rational2 : N(size);
    }

    public static float c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    public static List<Size> e(List<Size> list) {
        Rational rationalN;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalN = null;
                    break;
                }
                rationalN = (Rational) it.next();
            } while (!p0.a.a(size, rationalN));
            if (rationalN != null) {
                Size size2 = (Size) map.get(rationalN);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalN = N(size);
            }
            arrayList.add(size);
            map.put(rationalN, size);
        }
        return arrayList;
    }

    public static List<Size> f(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static List<Size> g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (p0.a.a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public static Rational h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f3780h ? p0.a.f28052c : p0.a.f28051a;
    }

    public static Rect k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalN = N(size);
        if (rational.floatValue() == rationalN.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalN.floatValue()) {
                float f10 = width;
                float fFloatValue = f10 / rational.floatValue();
                float f11 = (height - fFloatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f10, fFloatValue + f11);
            } else {
                float f12 = height;
                float fFloatValue2 = rational.floatValue() * f12;
                float f13 = (width - fFloatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, fFloatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    public static Rect m(Size size, Size size2) {
        return k(N(size2), size);
    }

    public static Rational n(Rational rational) {
        Rational rational2 = p0.a.f28051a;
        if (rational.equals(rational2)) {
            return p0.a.f28052c;
        }
        if (rational.equals(p0.a.f28052c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    public static List<Size> p(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listE = E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listE) {
            if (z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    public static Rational u(Size size) {
        Rational rationalH = h(size);
        r1.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalH + ".");
        return rationalH;
    }

    public static List<Size> w(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    public static boolean y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    public static boolean z(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    public final boolean B(Rational rational, Size size) {
        if (this.b.equals(rational) || p0.a.a(size, rational)) {
            return false;
        }
        return b(this.b.floatValue(), rational.floatValue(), O(size).floatValue());
    }

    public final boolean C(Size size, Size size2) {
        return B(O(size), size2);
    }

    public final boolean D() {
        Iterator<Size> it = l().iterator();
        while (it.hasNext()) {
            if (!p0.a.a(it.next(), this.f3782c)) {
                return true;
            }
        }
        return false;
    }

    public final List<Size> G(List<Size> list, boolean z10) {
        Map<Rational, List<Size>> mapX = x(list);
        ArrayList arrayList = new ArrayList(mapX.keySet());
        L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Rational rational = (Rational) obj;
            if (!rational.equals(p0.a.f28052c) && !rational.equals(p0.a.f28051a)) {
                List<Size> list2 = mapX.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    public final List<Size> H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (D()) {
            arrayList.addAll(I(this.b, list, false));
        }
        int size = arrayList.size();
        if (K()) {
            size = 0;
        }
        arrayList.addAll(size, I(this.f3782c, list, false));
        arrayList.addAll(G(list, false));
        if (arrayList.isEmpty()) {
            r1.l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(G(list, true));
        }
        r1.a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    public final List<Size> I(Rational rational, List<Size> list, boolean z10) {
        List<Size> listG = g(rational, list);
        M(listG);
        HashSet hashSet = new HashSet(listG);
        Iterator<i4<?>> it = this.f3783d.iterator();
        while (it.hasNext()) {
            List<Size> listV = v(it.next());
            if (!z10) {
                listV = d(rational, listV);
            }
            if (listV.isEmpty()) {
                return new ArrayList();
            }
            listG = f(listV, listG);
            hashSet.retainAll(p(listV, listG));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listG) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final boolean J() {
        boolean z10;
        a1.c cVarQ;
        Iterator<i4<?>> it = this.f3783d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            i4<?> next = it.next();
            if (!next.d0(false) && (next instanceof i2) && (cVarQ = ((i2) next).q(null)) != null) {
                z10 = true;
                if (cVarQ.a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    public final boolean K() {
        if (this.f3783d.isEmpty()) {
            return false;
        }
        Iterator<i4<?>> it = this.f3783d.iterator();
        while (it.hasNext()) {
            Iterator<Size> it2 = v(it.next()).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (it2.hasNext()) {
                boolean zA = p0.a.a(it2.next(), this.f3782c);
                if (zA) {
                    z10 = true;
                }
                if (z11 && zA) {
                    return false;
                }
                if (!zA) {
                    z11 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    public final void L(List<Rational> list) {
        Collections.sort(list, new a(N(this.f3781a), true));
    }

    public final boolean b(float f10, float f11, float f12) {
        if (f10 != f11 && f11 != f12) {
            if (f10 > f11) {
                return f11 < f12;
            }
            if (f11 > f12) {
                return true;
            }
        }
        return false;
    }

    public final List<Size> d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    public final List<Size> i() {
        return this.f3785f.j(34);
    }

    public final List<Size> j() {
        return this.f3785f.m(34);
    }

    public final Set<Size> l() {
        HashSet hashSet = new HashSet();
        Iterator<i4<?>> it = this.f3783d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(v(it.next()));
        }
        return hashSet;
    }

    public List<Size> o(w2 w2Var) {
        List<Size> listJ = j();
        if (J()) {
            ArrayList arrayList = new ArrayList(listJ);
            arrayList.addAll(i());
            listJ = arrayList;
        }
        List list = (List) w2Var.h(i2.f24691t, null);
        if (list != null) {
            listJ = w(list);
        }
        return H(listJ);
    }

    public Size q(Size size, i4<?> i4Var) {
        List<Size> listV = v(i4Var);
        for (Size size2 : listV) {
            if (!C(size, size2) && !y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listV) {
            if (!y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    public PreferredChildSize r(i4<?> i4Var, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (a0.i(i10)) {
            rect = F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        PreferredChildSize preferredChildSizeT = t(rect, i4Var, z10);
        return z11 ? new PreferredChildSize(F(preferredChildSizeT.getCropRectBeforeScaling()), a0.o(preferredChildSizeT.getChildSizeToScale()), preferredChildSizeT.getOriginalSelectedChildSize()) : preferredChildSizeT;
    }

    public Pair<Size, Size> s(Size size, i4<?> i4Var) {
        for (Size size2 : v(i4Var)) {
            Size sizeM = a0.m(m(size2, size));
            if (!y(sizeM, size)) {
                return Pair.create(size2, sizeM);
            }
        }
        return Pair.create(size, size);
    }

    public final PreferredChildSize t(Rect rect, i4<?> i4Var, boolean z10) {
        Size sizeQ;
        Size size;
        if (z10) {
            Pair<Size, Size> pairS = s(a0.m(rect), i4Var);
            sizeQ = (Size) pairS.first;
            size = (Size) pairS.second;
        } else {
            Size sizeM = a0.m(rect);
            sizeQ = q(sizeM, i4Var);
            rect = m(sizeM, sizeQ);
            size = sizeQ;
        }
        return new PreferredChildSize(rect, size, sizeQ);
    }

    public final List<Size> v(i4<?> i4Var) {
        if (!this.f3783d.contains(i4Var)) {
            throw new IllegalArgumentException("Invalid child config: " + i4Var);
        }
        if (this.f3786g.containsKey(i4Var)) {
            List<Size> list = this.f3786g.get(i4Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listE = e(this.f3784e.m(i4Var));
        this.f3786g.put(i4Var, listE);
        return listE;
    }

    public final Map<Rational, List<Size>> x(List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = p0.a.f28051a;
        map.put(rational, new ArrayList());
        Rational rational2 = p0.a.f28052c;
        map.put(rational2, new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rational);
        arrayList2.add(rational2);
        for (Size size : list) {
            if (size.getHeight() > 0) {
                int size2 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size2) {
                        arrayList = null;
                        break;
                    }
                    Object obj = arrayList2.get(i10);
                    i10++;
                    Rational rational3 = (Rational) obj;
                    if (p0.a.a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalN = N(size);
                    arrayList2.add(rationalN);
                    map.put(rationalN, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    public c(Size size, o0 o0Var, Set<i4<?>> set) {
        this(size, o0Var, set, new s0.o(o0Var, size));
    }

    public c(Size size, o0 o0Var, Set<i4<?>> set, s0.o oVar) {
        this.f3786g = new HashMap();
        this.f3781a = size;
        Rational rationalU = u(size);
        this.b = rationalU;
        this.f3782c = n(rationalU);
        this.f3785f = o0Var;
        this.f3783d = set;
        this.f3784e = oVar;
    }
}
