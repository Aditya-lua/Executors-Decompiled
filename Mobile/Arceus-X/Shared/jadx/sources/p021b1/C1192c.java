package p021b1;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
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
import p002a1.C0054c;
import p140g0.C5931r1;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8841w2;
import p347p0.C10084a;
import p347p0.C10085a0;
import p347p0.C10089e;
import p424s0.C11154o;

/* JADX INFO: renamed from: b1.c */
/* JADX INFO: loaded from: classes.dex */
public class C1192c {

    /* JADX INFO: renamed from: h */
    public static final double f4947h = Math.sqrt(2.3703703703703702d);

    /* JADX INFO: renamed from: a */
    public final Size f4948a;

    /* JADX INFO: renamed from: b */
    public final Rational f4949b;

    /* JADX INFO: renamed from: c */
    public final Rational f4950c;

    /* JADX INFO: renamed from: d */
    public final Set<InterfaceC8771i4<?>> f4951d;

    /* JADX INFO: renamed from: e */
    public final C11154o f4952e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8799o0 f4953f;

    /* JADX INFO: renamed from: g */
    public final Map<InterfaceC8771i4<?>, List<Size>> f4954g;

    /* JADX INFO: renamed from: b1.c$a */
    public static class a implements Comparator<Rational> {

        /* JADX INFO: renamed from: a */
        public final Rational f4955a;

        /* JADX INFO: renamed from: b */
        public final boolean f4956b;

        public a(Rational rational, boolean z10) {
            this.f4955a = rational;
            this.f4956b = z10;
        }

        /* JADX DEBUG: Method merged with bridge method: compare(Ljava/lang/Object;Ljava/lang/Object;)I */
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Rational rational, Rational rational2) {
            float fM6608c = C1192c.m6608c(rational, this.f4955a);
            float fM6608c2 = C1192c.m6608c(rational2, this.f4955a);
            return this.f4956b ? Float.compare(fM6608c2, fM6608c) : Float.compare(fM6608c, fM6608c2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1192c(InterfaceC8804p0 interfaceC8804p0, Set<InterfaceC8771i4<?>> set) {
        this(C10085a0.m38885m(interfaceC8804p0.mo6698k().mo35046h()), interfaceC8804p0.mo6698k(), set);
    }

    /* JADX INFO: renamed from: A */
    public static boolean m6601A(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (!m6619y(it.next(), size)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: E */
    public static List<Size> m6602E(List<Size> list) {
        return list.isEmpty() ? list : new ArrayList(new LinkedHashSet(list));
    }

    /* JADX INFO: renamed from: F */
    public static Rect m6603F(Rect rect) {
        return new Rect(rect.top, rect.left, rect.bottom, rect.right);
    }

    /* JADX INFO: renamed from: M */
    public static void m6604M(List<Size> list) {
        Collections.sort(list, new C10089e(true));
    }

    /* JADX INFO: renamed from: N */
    public static Rational m6605N(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: O */
    public static Rational m6606O(Size size) {
        Rational rational = C10084a.f36314a;
        if (C10084a.m38864a(size, rational)) {
            return rational;
        }
        Rational rational2 = C10084a.f36316c;
        return C10084a.m38864a(size, rational2) ? rational2 : m6605N(size);
    }

    /* JADX INFO: renamed from: c */
    public static float m6608c(Rational rational, Rational rational2) {
        float fFloatValue = rational.floatValue();
        float fFloatValue2 = rational2.floatValue();
        return fFloatValue > fFloatValue2 ? fFloatValue2 / fFloatValue : fFloatValue / fFloatValue2;
    }

    /* JADX INFO: renamed from: e */
    public static List<Size> m6609e(List<Size> list) {
        Rational rationalM6605N;
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            Iterator it = map.keySet().iterator();
            do {
                if (!it.hasNext()) {
                    rationalM6605N = null;
                    break;
                }
                rationalM6605N = (Rational) it.next();
            } while (!C10084a.m38864a(size, rationalM6605N));
            if (rationalM6605N != null) {
                Size size2 = (Size) map.get(rationalM6605N);
                Objects.requireNonNull(size2);
                if (size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth() || (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight())) {
                }
            } else {
                rationalM6605N = m6605N(size);
            }
            arrayList.add(size);
            map.put(rationalM6605N, size);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static List<Size> m6610f(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (m6601A(collection, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static List<Size> m6611g(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (C10084a.m38864a(size, rational)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static Rational m6612h(Size size) {
        return ((double) size.getWidth()) / ((double) size.getHeight()) > f4947h ? C10084a.f36316c : C10084a.f36314a;
    }

    /* JADX INFO: renamed from: k */
    public static Rect m6613k(Rational rational, Size size) {
        RectF rectF;
        RectF rectF2;
        int width = size.getWidth();
        int height = size.getHeight();
        Rational rationalM6605N = m6605N(size);
        if (rational.floatValue() == rationalM6605N.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (rational.floatValue() > rationalM6605N.floatValue()) {
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

    /* JADX INFO: renamed from: m */
    public static Rect m6614m(Size size, Size size2) {
        return m6613k(m6605N(size2), size);
    }

    /* JADX INFO: renamed from: n */
    public static Rational m6615n(Rational rational) {
        Rational rational2 = C10084a.f36314a;
        if (rational.equals(rational2)) {
            return C10084a.f36316c;
        }
        if (rational.equals(C10084a.f36316c)) {
            return rational2;
        }
        throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
    }

    /* JADX INFO: renamed from: p */
    public static List<Size> m6616p(Collection<Size> collection, List<Size> list) {
        if (collection.isEmpty() || list.isEmpty()) {
            return new ArrayList();
        }
        List<Size> listM6602E = m6602E(list);
        ArrayList arrayList = new ArrayList();
        for (Size size : listM6602E) {
            if (m6620z(collection, size)) {
                arrayList.add(size);
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: u */
    public static Rational m6617u(Size size) {
        Rational rationalM6612h = m6612h(size);
        C5931r1.m26561a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + size + ") is " + rationalM6612h + ".");
        return rationalM6612h;
    }

    /* JADX INFO: renamed from: w */
    public static List<Size> m6618w(List<Pair<Integer, Size[]>> list) {
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).equals(34)) {
                return Arrays.asList((Size[]) pair.second);
            }
        }
        return new ArrayList();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m6619y(Size size, Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m6620z(Collection<Size> collection, Size size) {
        Iterator<Size> it = collection.iterator();
        while (it.hasNext()) {
            if (m6619y(it.next(), size)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m6621B(Rational rational, Size size) {
        if (this.f4949b.equals(rational) || C10084a.m38864a(size, rational)) {
            return false;
        }
        return m6630b(this.f4949b.floatValue(), rational.floatValue(), m6606O(size).floatValue());
    }

    /* JADX INFO: renamed from: C */
    public final boolean m6622C(Size size, Size size2) {
        return m6621B(m6606O(size), size2);
    }

    /* JADX INFO: renamed from: D */
    public final boolean m6623D() {
        Iterator<Size> it = m6634l().iterator();
        while (it.hasNext()) {
            if (!C10084a.m38864a(it.next(), this.f4950c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final List<Size> m6624G(List<Size> list, boolean z10) {
        Map<Rational, List<Size>> mapM6641x = m6641x(list);
        ArrayList arrayList = new ArrayList(mapM6641x.keySet());
        m6629L(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            Rational rational = (Rational) obj;
            if (!rational.equals(C10084a.f36316c) && !rational.equals(C10084a.f36314a)) {
                List<Size> list2 = mapM6641x.get(rational);
                Objects.requireNonNull(list2);
                arrayList2.addAll(m6626I(rational, list2, z10));
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: H */
    public final List<Size> m6625H(List<Size> list) {
        ArrayList arrayList = new ArrayList();
        if (m6623D()) {
            arrayList.addAll(m6626I(this.f4949b, list, false));
        }
        int size = arrayList.size();
        if (m6628K()) {
            size = 0;
        }
        arrayList.addAll(size, m6626I(this.f4950c, list, false));
        arrayList.addAll(m6624G(list, false));
        if (arrayList.isEmpty()) {
            C5931r1.m26572l("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList.addAll(m6624G(list, true));
        }
        C5931r1.m26561a("ResolutionsMerger", "Parent resolutions: " + arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: I */
    public final List<Size> m6626I(Rational rational, List<Size> list, boolean z10) {
        List<Size> listM6611g = m6611g(rational, list);
        m6604M(listM6611g);
        HashSet hashSet = new HashSet(listM6611g);
        Iterator<InterfaceC8771i4<?>> it = this.f4951d.iterator();
        while (it.hasNext()) {
            List<Size> listM6640v = m6640v(it.next());
            if (!z10) {
                listM6640v = m6631d(rational, listM6640v);
            }
            if (listM6640v.isEmpty()) {
                return new ArrayList();
            }
            listM6611g = m6610f(listM6640v, listM6611g);
            hashSet.retainAll(m6616p(listM6640v, listM6611g));
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : listM6611g) {
            if (!hashSet.contains(size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m6627J() {
        boolean z10;
        C0054c c0054cM35193q;
        Iterator<InterfaceC8771i4<?>> it = this.f4951d.iterator();
        while (true) {
            z10 = false;
            if (!it.hasNext()) {
                break;
            }
            InterfaceC8771i4<?> next = it.next();
            if (!next.m35208d0(false) && (next instanceof InterfaceC8769i2) && (c0054cM35193q = ((InterfaceC8769i2) next).m35193q(null)) != null) {
                z10 = true;
                if (c0054cM35193q.m111a() == 1) {
                    break;
                }
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m6628K() {
        if (this.f4951d.isEmpty()) {
            return false;
        }
        Iterator<InterfaceC8771i4<?>> it = this.f4951d.iterator();
        while (it.hasNext()) {
            Iterator<Size> it2 = m6640v(it.next()).iterator();
            boolean z10 = false;
            boolean z11 = false;
            while (it2.hasNext()) {
                boolean zM38864a = C10084a.m38864a(it2.next(), this.f4950c);
                if (zM38864a) {
                    z10 = true;
                }
                if (z11 && zM38864a) {
                    return false;
                }
                if (!zM38864a) {
                    z11 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public final void m6629L(List<Rational> list) {
        Collections.sort(list, new a(m6605N(this.f4948a), true));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6630b(float f10, float f11, float f12) {
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

    /* JADX INFO: renamed from: d */
    public final List<Size> m6631d(Rational rational, List<Size> list) {
        ArrayList arrayList = new ArrayList();
        for (Size size : list) {
            if (!m6621B(rational, size)) {
                arrayList.add(size);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public final List<Size> m6632i() {
        return this.f4953f.mo35047j(34);
    }

    /* JADX INFO: renamed from: j */
    public final List<Size> m6633j() {
        return this.f4953f.mo35050m(34);
    }

    /* JADX INFO: renamed from: l */
    public final Set<Size> m6634l() {
        HashSet hashSet = new HashSet();
        Iterator<InterfaceC8771i4<?>> it = this.f4951d.iterator();
        while (it.hasNext()) {
            hashSet.addAll(m6640v(it.next()));
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: o */
    public List<Size> m6635o(InterfaceC8841w2 interfaceC8841w2) {
        List<Size> listM6633j = m6633j();
        if (m6627J()) {
            ArrayList arrayList = new ArrayList(listM6633j);
            arrayList.addAll(m6632i());
            listM6633j = arrayList;
        }
        List list = (List) interfaceC8841w2.mo35030h(InterfaceC8769i2.f31889t, null);
        if (list != null) {
            listM6633j = m6618w(list);
        }
        return m6625H(listM6633j);
    }

    /* JADX INFO: renamed from: q */
    public Size m6636q(Size size, InterfaceC8771i4<?> interfaceC8771i4) {
        List<Size> listM6640v = m6640v(interfaceC8771i4);
        for (Size size2 : listM6640v) {
            if (!m6622C(size, size2) && !m6619y(size2, size)) {
                return size2;
            }
        }
        for (Size size3 : listM6640v) {
            if (!m6619y(size3, size)) {
                return size3;
            }
        }
        return size;
    }

    /* JADX INFO: renamed from: r */
    public PreferredChildSize m6637r(InterfaceC8771i4<?> interfaceC8771i4, Rect rect, int i10, boolean z10) {
        boolean z11;
        if (C10085a0.m38881i(i10)) {
            rect = m6603F(rect);
            z11 = true;
        } else {
            z11 = false;
        }
        PreferredChildSize preferredChildSizeM6639t = m6639t(rect, interfaceC8771i4, z10);
        return z11 ? new PreferredChildSize(m6603F(preferredChildSizeM6639t.getCropRectBeforeScaling()), C10085a0.m38887o(preferredChildSizeM6639t.getChildSizeToScale()), preferredChildSizeM6639t.getOriginalSelectedChildSize()) : preferredChildSizeM6639t;
    }

    /* JADX INFO: renamed from: s */
    public Pair<Size, Size> m6638s(Size size, InterfaceC8771i4<?> interfaceC8771i4) {
        for (Size size2 : m6640v(interfaceC8771i4)) {
            Size sizeM38885m = C10085a0.m38885m(m6614m(size2, size));
            if (!m6619y(sizeM38885m, size)) {
                return Pair.create(size2, sizeM38885m);
            }
        }
        return Pair.create(size, size);
    }

    /* JADX INFO: renamed from: t */
    public final PreferredChildSize m6639t(Rect rect, InterfaceC8771i4<?> interfaceC8771i4, boolean z10) {
        Size sizeM6636q;
        Size size;
        if (z10) {
            Pair<Size, Size> pairM6638s = m6638s(C10085a0.m38885m(rect), interfaceC8771i4);
            sizeM6636q = (Size) pairM6638s.first;
            size = (Size) pairM6638s.second;
        } else {
            Size sizeM38885m = C10085a0.m38885m(rect);
            sizeM6636q = m6636q(sizeM38885m, interfaceC8771i4);
            rect = m6614m(sizeM38885m, sizeM6636q);
            size = sizeM6636q;
        }
        return new PreferredChildSize(rect, size, sizeM6636q);
    }

    /* JADX INFO: renamed from: v */
    public final List<Size> m6640v(InterfaceC8771i4<?> interfaceC8771i4) {
        if (!this.f4951d.contains(interfaceC8771i4)) {
            throw new IllegalArgumentException("Invalid child config: " + interfaceC8771i4);
        }
        if (this.f4954g.containsKey(interfaceC8771i4)) {
            List<Size> list = this.f4954g.get(interfaceC8771i4);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> listM6609e = m6609e(this.f4952e.m42037m(interfaceC8771i4));
        this.f4954g.put(interfaceC8771i4, listM6609e);
        return listM6609e;
    }

    /* JADX INFO: renamed from: x */
    public final Map<Rational, List<Size>> m6641x(List<Size> list) {
        List arrayList;
        HashMap map = new HashMap();
        Rational rational = C10084a.f36314a;
        map.put(rational, new ArrayList());
        Rational rational2 = C10084a.f36316c;
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
                    if (C10084a.m38864a(size, rational3)) {
                        arrayList = (List) map.get(rational3);
                        break;
                    }
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    Rational rationalM6605N = m6605N(size);
                    arrayList2.add(rationalM6605N);
                    map.put(rationalM6605N, arrayList);
                }
                arrayList.add(size);
            }
        }
        return map;
    }

    public C1192c(Size size, InterfaceC8799o0 interfaceC8799o0, Set<InterfaceC8771i4<?>> set) {
        this(size, interfaceC8799o0, set, new C11154o(interfaceC8799o0, size));
    }

    public C1192c(Size size, InterfaceC8799o0 interfaceC8799o0, Set<InterfaceC8771i4<?>> set, C11154o c11154o) {
        this.f4954g = new HashMap();
        this.f4948a = size;
        Rational rationalM6617u = m6617u(size);
        this.f4949b = rationalM6617u;
        this.f4950c = m6615n(rationalM6617u);
        this.f4953f = interfaceC8799o0;
        this.f4951d = set;
        this.f4952e = c11154o;
    }
}
