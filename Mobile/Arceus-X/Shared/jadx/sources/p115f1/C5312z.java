package p115f1;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p347p0.C10084a;
import p503w0.C12274d;

/* JADX INFO: renamed from: f1.z */
/* JADX INFO: loaded from: classes.dex */
public class C5312z {

    /* JADX INFO: renamed from: b */
    public static final Map<C5306x, Range<Integer>> f20648b;

    /* JADX INFO: renamed from: c */
    public static final Map<Integer, Rational> f20649c;

    /* JADX INFO: renamed from: a */
    public final Map<a, List<Size>> f20650a = new HashMap();

    /* JADX INFO: renamed from: f1.z$a */
    public static abstract class a {
        /* JADX INFO: renamed from: c */
        public static a m24604c(C5306x c5306x, int i10) {
            return new C5261i(c5306x, i10);
        }

        /* JADX INFO: renamed from: a */
        public abstract int mo24321a();

        /* JADX INFO: renamed from: b */
        public abstract C5306x mo24322b();
    }

    static {
        HashMap map = new HashMap();
        f20648b = map;
        map.put(C5306x.f20632d, Range.create(2160, 4319));
        map.put(C5306x.f20631c, Range.create(1080, 1439));
        map.put(C5306x.f20630b, Range.create(720, 1079));
        map.put(C5306x.f20629a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f20649c = map2;
        map2.put(0, C10084a.f36314a);
        map2.put(1, C10084a.f36316c);
    }

    public C5312z(List<Size> list, Map<C5306x, Size> map) {
        for (C5306x c5306x : f20648b.keySet()) {
            this.f20650a.put(a.m24604c(c5306x, -1), new ArrayList());
            Iterator<Integer> it = f20649c.keySet().iterator();
            while (it.hasNext()) {
                this.f20650a.put(a.m24604c(c5306x, it.next().intValue()), new ArrayList());
            }
        }
        m24599b(map);
        m24600c(list);
        m24603h(map);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0012: ARITH (wrap int:0x0005: INVOKE 
      (wrap int:0x0004: ARITH (wrap int:0x0000: INVOKE (r1v0 android.util.Size) STATIC call: w0.d.c(android.util.Size):int A[MD:(android.util.Size):int (m), WRAPPED]) - (r0v0 int) A[WRAPPED])
     STATIC call: java.lang.Math.abs(int):int A[MD:(int):int (c), WRAPPED]) - (wrap int:0x000e: INVOKE 
      (wrap int:0x000d: ARITH (wrap int:0x0009: INVOKE (r2v0 android.util.Size) STATIC call: w0.d.c(android.util.Size):int A[MD:(android.util.Size):int (m), WRAPPED]) - (r0v0 int) A[WRAPPED])
     STATIC call: java.lang.Math.abs(int):int A[MD:(int):int (c), WRAPPED]) */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m24596a(int i10, Size size, Size size2) {
        return Math.abs(C12274d.m45571c(size) - i10) - Math.abs(C12274d.m45571c(size2) - i10);
    }

    /* JADX INFO: renamed from: d */
    public static Integer m24597d(Size size) {
        for (Map.Entry<Integer, Rational> entry : f20649c.entrySet()) {
            if (C10084a.m38865b(size, entry.getValue(), C12274d.f43481b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static C5306x m24598e(Size size) {
        for (Map.Entry<C5306x, Range<Integer>> entry : f20648b.entrySet()) {
            if (entry.getValue().contains(Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m24599b(Map<C5306x, Size> map) {
        for (Map.Entry<C5306x, Size> entry : map.entrySet()) {
            List<Size> listM24601f = m24601f(entry.getKey(), -1);
            Objects.requireNonNull(listM24601f);
            listM24601f.add(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m24600c(List<Size> list) {
        Integer numM24597d;
        for (Size size : list) {
            C5306x c5306xM24598e = m24598e(size);
            if (c5306xM24598e != null && (numM24597d = m24597d(size)) != null) {
                List<Size> listM24601f = m24601f(c5306xM24598e, numM24597d.intValue());
                Objects.requireNonNull(listM24601f);
                listM24601f.add(size);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final List<Size> m24601f(C5306x c5306x, int i10) {
        return this.f20650a.get(a.m24604c(c5306x, i10));
    }

    /* JADX INFO: renamed from: g */
    public List<Size> m24602g(C5306x c5306x, int i10) {
        List<Size> listM24601f = m24601f(c5306x, i10);
        return listM24601f != null ? new ArrayList(listM24601f) : new ArrayList(0);
    }

    /* JADX INFO: renamed from: h */
    public final void m24603h(Map<C5306x, Size> map) {
        for (Map.Entry<a, List<Size>> entry : this.f20650a.entrySet()) {
            Size size = map.get(entry.getKey().mo24322b());
            if (size != null) {
                final int iM45571c = C12274d.m45571c(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: f1.y
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return C5312z.m24596a(iM45571c, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }
}
