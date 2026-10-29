package p424s0;

import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8799o0;
import p347p0.C10084a;
import p347p0.C10087c;
import p347p0.C10089e;
import p503w0.C12274d;

/* JADX INFO: renamed from: s0.p */
/* JADX INFO: loaded from: classes.dex */
public class C11155p {

    /* JADX INFO: renamed from: a */
    public final int f39396a;

    /* JADX INFO: renamed from: b */
    public final int f39397b;

    /* JADX INFO: renamed from: c */
    public final Rational f39398c;

    /* JADX INFO: renamed from: d */
    public final boolean f39399d;

    public C11155p(InterfaceC8799o0 interfaceC8799o0, Rational rational) {
        this.f39396a = interfaceC8799o0.mo6749d();
        this.f39397b = interfaceC8799o0.mo26583i();
        this.f39398c = rational;
        boolean z10 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z10 = false;
        }
        this.f39399d = z10;
    }

    /* JADX INFO: renamed from: a */
    public static Size m42038a(Size size, int i10, int i11, int i12) {
        return (size == null || !m42040e(i10, i11, i12)) ? size : new Size(size.getHeight(), size.getWidth());
    }

    /* JADX INFO: renamed from: b */
    public static Rational m42039b(Size size, List<Size> list) {
        if (size == null) {
            return null;
        }
        for (Rational rational : C11154o.m42025k(list)) {
            if (C10084a.m38864a(size, rational)) {
                return rational;
            }
        }
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: e */
    public static boolean m42040e(int i10, int i11, int i12) {
        int iM38902a = C10087c.m38902a(C10087c.m38903b(i10), i12, 1 == i11);
        return iM38902a == 90 || iM38902a == 270;
    }

    /* JADX INFO: renamed from: c */
    public final Rational m42041c(InterfaceC8769i2 interfaceC8769i2, List<Size> list) {
        if (interfaceC8769i2.m35183A()) {
            return C11154o.m42026n(interfaceC8769i2.m35184C(), this.f39399d);
        }
        Size sizeM42042d = m42042d(interfaceC8769i2);
        if (sizeM42042d != null) {
            return m42039b(sizeM42042d, list);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final Size m42042d(InterfaceC8769i2 interfaceC8769i2) {
        return m42038a(interfaceC8769i2.m35188V(null), interfaceC8769i2.m35185J(0), this.f39397b, this.f39396a);
    }

    /* JADX INFO: renamed from: f */
    public List<Size> m42043f(List<Size> list, InterfaceC8771i4<?> interfaceC8771i4) {
        if (list.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, new C10089e(true));
        ArrayList arrayList2 = new ArrayList();
        InterfaceC8769i2 interfaceC8769i2 = (InterfaceC8769i2) interfaceC8771i4;
        Size sizeM35190i = interfaceC8769i2.m35190i(null);
        int i10 = 0;
        Size size = (Size) arrayList.get(0);
        if (sizeM35190i == null || C12274d.m45571c(size) < C12274d.m45571c(sizeM35190i)) {
            sizeM35190i = size;
        }
        Size sizeM42042d = m42042d(interfaceC8769i2);
        Size size2 = C12274d.f43482c;
        int iM45571c = C12274d.m45571c(size2);
        if (C12274d.m45571c(sizeM35190i) < iM45571c) {
            size2 = C12274d.f43480a;
        } else if (sizeM42042d != null && C12274d.m45571c(sizeM42042d) < iM45571c) {
            size2 = sizeM42042d;
        }
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj = arrayList.get(i11);
            i11++;
            Size size4 = (Size) obj;
            if (C12274d.m45571c(size4) <= C12274d.m45571c(sizeM35190i) && C12274d.m45571c(size4) >= C12274d.m45571c(size2) && !arrayList2.contains(size4)) {
                arrayList2.add(size4);
            }
        }
        if (arrayList2.isEmpty()) {
            throw new IllegalArgumentException("All supported output sizes are filtered out according to current resolution selection settings. \nminSize = " + size2 + "\nmaxSize = " + sizeM35190i + "\ninitial size list: " + arrayList);
        }
        Rational rationalM42041c = m42041c(interfaceC8769i2, arrayList2);
        if (sizeM42042d == null) {
            sizeM42042d = interfaceC8769i2.m35187R(null);
        }
        ArrayList arrayList3 = new ArrayList();
        new HashMap();
        if (rationalM42041c == null) {
            arrayList3.addAll(arrayList2);
            if (sizeM42042d != null) {
                C11154o.m42029q(arrayList3, sizeM42042d, true);
                return arrayList3;
            }
        } else {
            Map<Rational, List<Size>> mapM42027o = C11154o.m42027o(arrayList2);
            if (sizeM42042d != null) {
                Iterator<Rational> it = mapM42027o.keySet().iterator();
                while (it.hasNext()) {
                    C11154o.m42029q(mapM42027o.get(it.next()), sizeM42042d, true);
                }
            }
            ArrayList arrayList4 = new ArrayList(mapM42027o.keySet());
            Collections.sort(arrayList4, new C10084a.a(rationalM42041c, this.f39398c));
            int size5 = arrayList4.size();
            while (i10 < size5) {
                Object obj2 = arrayList4.get(i10);
                i10++;
                for (Size size6 : mapM42027o.get((Rational) obj2)) {
                    if (!arrayList3.contains(size6)) {
                        arrayList3.add(size6);
                    }
                }
            }
        }
        return arrayList3;
    }
}
