package p424s0;

import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p002a1.C0052a;
import p002a1.C0054c;
import p002a1.C0055d;
import p002a1.InterfaceC0053b;
import p140g0.C5931r1;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8799o0;
import p347p0.C10084a;
import p347p0.C10087c;
import p347p0.C10089e;
import p503w0.C12274d;

/* JADX INFO: renamed from: s0.o */
/* JADX INFO: loaded from: classes.dex */
public class C11154o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8799o0 f39391a;

    /* JADX INFO: renamed from: b */
    public final int f39392b;

    /* JADX INFO: renamed from: c */
    public final int f39393c;

    /* JADX INFO: renamed from: d */
    public final Rational f39394d;

    /* JADX INFO: renamed from: e */
    public final C11155p f39395e;

    public C11154o(InterfaceC8799o0 interfaceC8799o0, Size size) {
        this.f39391a = interfaceC8799o0;
        this.f39392b = interfaceC8799o0.mo6749d();
        this.f39393c = interfaceC8799o0.mo26583i();
        Rational rationalM42033h = size != null ? m42033h(size) : m42034i(interfaceC8799o0);
        this.f39394d = rationalM42033h;
        this.f39395e = new C11155p(interfaceC8799o0, rationalM42033h);
    }

    /* JADX INFO: renamed from: a */
    public static LinkedHashMap<Rational, List<Size>> m42019a(List<Size> list, C0052a c0052a, Rational rational) {
        return m42020b(m42027o(list), c0052a, rational);
    }

    /* JADX INFO: renamed from: b */
    public static LinkedHashMap<Rational, List<Size>> m42020b(Map<Rational, List<Size>> map, C0052a c0052a, Rational rational) {
        int i10 = 0;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        Rational rationalM42026n = m42026n(c0052a.m109b(), z10);
        if (c0052a.m108a() == 0) {
            Rational rationalM42026n2 = m42026n(c0052a.m109b(), z10);
            ArrayList arrayList = new ArrayList(map.keySet());
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                Rational rational2 = (Rational) obj;
                if (!rational2.equals(rationalM42026n2)) {
                    map.remove(rational2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2, new C10084a.a(rationalM42026n, rational));
        LinkedHashMap<Rational, List<Size>> linkedHashMap = new LinkedHashMap<>();
        int size2 = arrayList2.size();
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            Rational rational3 = (Rational) obj2;
            linkedHashMap.put(rational3, map.get(rational3));
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    public static void m42021d(LinkedHashMap<Rational, List<Size>> linkedHashMap, Size size) {
        int iM45571c = C12274d.m45571c(size);
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            List<Size> list = linkedHashMap.get(it.next());
            ArrayList arrayList = new ArrayList();
            for (Size size2 : list) {
                if (C12274d.m45571c(size2) <= iM45571c) {
                    arrayList.add(size2);
                }
            }
            list.clear();
            list.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: e */
    public static List<Size> m42022e(List<Size> list, InterfaceC0053b interfaceC0053b, int i10, int i11, int i12) {
        if (interfaceC0053b == null) {
            return list;
        }
        List<Size> listMo110a = interfaceC0053b.mo110a(new ArrayList(list), C10087c.m38902a(C10087c.m38903b(i10), i11, i12 == 1));
        if (list.containsAll(listMo110a)) {
            return listMo110a;
        }
        throw new IllegalArgumentException("The returned sizes list of the resolution filter must be a subset of the provided sizes list.");
    }

    /* JADX INFO: renamed from: f */
    public static void m42023f(LinkedHashMap<Rational, List<Size>> linkedHashMap, C0055d c0055d) {
        if (c0055d == null) {
            return;
        }
        Iterator<Rational> it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            m42024g(linkedHashMap.get(it.next()), c0055d);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m42024g(List<Size> list, C0055d c0055d) {
        if (list.isEmpty()) {
            return;
        }
        int iM122b = c0055d.m122b();
        if (c0055d.equals(C0055d.f110c)) {
            return;
        }
        Size sizeM121a = c0055d.m121a();
        if (iM122b == 0) {
            m42031s(list, sizeM121a);
            return;
        }
        if (iM122b == 1) {
            m42029q(list, sizeM121a, true);
            return;
        }
        if (iM122b == 2) {
            m42029q(list, sizeM121a, false);
        } else if (iM122b == 3) {
            m42030r(list, sizeM121a, true);
        } else {
            if (iM122b != 4) {
                return;
            }
            m42030r(list, sizeM121a, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public static List<Rational> m42025k(List<Size> list) {
        Object obj;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10084a.f36314a);
        arrayList.add(C10084a.f36316c);
        for (Size size : list) {
            Rational rational = new Rational(size.getWidth(), size.getHeight());
            if (!arrayList.contains(rational)) {
                int size2 = arrayList.size();
                int i10 = 0;
                do {
                    if (i10 >= size2) {
                        arrayList.add(rational);
                        break;
                    }
                    obj = arrayList.get(i10);
                    i10++;
                } while (!C10084a.m38864a(size, (Rational) obj));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static Rational m42026n(int i10, boolean z10) {
        if (i10 == -1) {
            return null;
        }
        if (i10 == 0) {
            return z10 ? C10084a.f36314a : C10084a.f36315b;
        }
        if (i10 == 1) {
            return z10 ? C10084a.f36316c : C10084a.f36317d;
        }
        C5931r1.m26563c("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i10);
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static Map<Rational, List<Size>> m42027o(List<Size> list) {
        HashMap map = new HashMap();
        Iterator<Rational> it = m42025k(list).iterator();
        while (it.hasNext()) {
            map.put(it.next(), new ArrayList());
        }
        for (Size size : list) {
            for (Rational rational : map.keySet()) {
                if (C10084a.m38864a(size, rational)) {
                    ((List) map.get(rational)).add(size);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: p */
    public static List<Size> m42028p(C0054c c0054c, List<Size> list, Size size, int i10, Rational rational, int i11, int i12) {
        LinkedHashMap<Rational, List<Size>> linkedHashMapM42019a = m42019a(list, c0054c.m112b(), rational);
        if (size != null) {
            m42021d(linkedHashMapM42019a, size);
        }
        m42023f(linkedHashMapM42019a, c0054c.m114d());
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMapM42019a.values().iterator();
        while (it.hasNext()) {
            for (Size size2 : it.next()) {
                if (!arrayList.contains(size2)) {
                    arrayList.add(size2);
                }
            }
        }
        return m42022e(arrayList, c0054c.m113c(), i10, i11, i12);
    }

    /* JADX INFO: renamed from: q */
    public static void m42029q(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m42030r(List<Size> list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            Size size2 = list.get(i10);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m42031s(List<Size> list, Size size) {
        boolean zContains = list.contains(size);
        list.clear();
        if (zContains) {
            list.add(size);
        }
    }

    /* JADX INFO: renamed from: c */
    public final List<Size> m42032c(List<Size> list, C0054c c0054c, int i10) {
        if (c0054c.m111a() != 1) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        arrayList.addAll(this.f39391a.mo35047j(i10));
        Collections.sort(arrayList, new C10089e(true));
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final Rational m42033h(Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: i */
    public final Rational m42034i(InterfaceC8799o0 interfaceC8799o0) {
        List<Size> listMo35050m = interfaceC8799o0.mo35050m(256);
        if (listMo35050m.isEmpty()) {
            return null;
        }
        Size size = (Size) Collections.max(listMo35050m, new C10089e());
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: j */
    public final List<Size> m42035j(List<Pair<Integer, Size[]>> list, int i10) {
        List<Size> listM42036l = m42036l(list, i10);
        if (listM42036l == null) {
            listM42036l = this.f39391a.mo35050m(i10);
        }
        ArrayList arrayList = new ArrayList(listM42036l);
        Collections.sort(arrayList, new C10089e(true));
        if (arrayList.isEmpty()) {
            C5931r1.m26572l("SupportedOutputSizesCollector", "The retrieved supported resolutions from camera info internal is empty. Format is " + i10 + ".");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final List<Size> m42036l(List<Pair<Integer, Size[]>> list, int i10) {
        Size[] sizeArr;
        if (list != null) {
            for (Pair<Integer, Size[]> pair : list) {
                if (((Integer) pair.first).intValue() == i10) {
                    sizeArr = (Size[]) pair.second;
                }
            }
            sizeArr = null;
        } else {
            sizeArr = null;
        }
        if (sizeArr == null) {
            return null;
        }
        return Arrays.asList(sizeArr);
    }

    /* JADX INFO: renamed from: m */
    public List<Size> m42037m(InterfaceC8771i4<?> interfaceC8771i4) {
        InterfaceC8769i2 interfaceC8769i2 = (InterfaceC8769i2) interfaceC8771i4;
        List<Size> listM35186N = interfaceC8769i2.m35186N(null);
        if (listM35186N != null) {
            return listM35186N;
        }
        C0054c c0054cM35193q = interfaceC8769i2.m35193q(null);
        List<Size> listM42035j = m42035j(interfaceC8769i2.m35191l(null), interfaceC8771i4.mo26767p());
        if (c0054cM35193q == null) {
            return this.f39395e.m42043f(listM42035j, interfaceC8771i4);
        }
        Size sizeM35190i = ((InterfaceC8769i2) interfaceC8771i4).m35190i(null);
        int iM35185J = interfaceC8769i2.m35185J(0);
        if (!interfaceC8771i4.m35208d0(false)) {
            listM42035j = m42032c(listM42035j, c0054cM35193q, interfaceC8771i4.mo26767p());
        }
        List<Size> list = listM42035j;
        C5931r1.m26561a("SupportedOutputSizesCollector", "useCaseConfig = " + interfaceC8771i4 + ", candidateSizes = " + list);
        return m42028p(interfaceC8769i2.m35192m(), list, sizeM35190i, iM35185J, this.f39394d, this.f39392b, this.f39393c);
    }
}
