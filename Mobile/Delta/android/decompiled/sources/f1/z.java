package f1;

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

/* JADX INFO: loaded from: classes.dex */
public class z {
    public static final Map<x, Range<Integer>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map<Integer, Rational> f16065c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<a, List<Size>> f16066a = new HashMap();

    public static abstract class a {
        public static a c(x xVar, int i10) {
            return new i(xVar, i10);
        }

        public abstract int a();

        public abstract x b();
    }

    static {
        HashMap map = new HashMap();
        b = map;
        map.put(x.f16052d, Range.create(2160, 4319));
        map.put(x.f16051c, Range.create(1080, 1439));
        map.put(x.b, Range.create(720, 1079));
        map.put(x.f16050a, Range.create(241, 719));
        HashMap map2 = new HashMap();
        f16065c = map2;
        map2.put(0, p0.a.f28051a);
        map2.put(1, p0.a.f28052c);
    }

    public z(List<Size> list, Map<x, Size> map) {
        for (x xVar : b.keySet()) {
            this.f16066a.put(a.c(xVar, -1), new ArrayList());
            Iterator<Integer> it = f16065c.keySet().iterator();
            while (it.hasNext()) {
                this.f16066a.put(a.c(xVar, it.next().intValue()), new ArrayList());
            }
        }
        b(map);
        c(list);
        h(map);
    }

    public static /* synthetic */ int a(int i10, Size size, Size size2) {
        return Math.abs(w0.d.c(size) - i10) - Math.abs(w0.d.c(size2) - i10);
    }

    public static Integer d(Size size) {
        for (Map.Entry<Integer, Rational> entry : f16065c.entrySet()) {
            if (p0.a.b(size, entry.getValue(), w0.d.b)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public static x e(Size size) {
        for (Map.Entry<x, Range<Integer>> entry : b.entrySet()) {
            if (entry.getValue().contains(Integer.valueOf(size.getHeight()))) {
                return entry.getKey();
            }
        }
        return null;
    }

    public final void b(Map<x, Size> map) {
        for (Map.Entry<x, Size> entry : map.entrySet()) {
            List<Size> listF = f(entry.getKey(), -1);
            Objects.requireNonNull(listF);
            listF.add(entry.getValue());
        }
    }

    public final void c(List<Size> list) {
        Integer numD;
        for (Size size : list) {
            x xVarE = e(size);
            if (xVarE != null && (numD = d(size)) != null) {
                List<Size> listF = f(xVarE, numD.intValue());
                Objects.requireNonNull(listF);
                listF.add(size);
            }
        }
    }

    public final List<Size> f(x xVar, int i10) {
        return this.f16066a.get(a.c(xVar, i10));
    }

    public List<Size> g(x xVar, int i10) {
        List<Size> listF = f(xVar, i10);
        return listF != null ? new ArrayList(listF) : new ArrayList(0);
    }

    public final void h(Map<x, Size> map) {
        for (Map.Entry<a, List<Size>> entry : this.f16066a.entrySet()) {
            Size size = map.get(entry.getKey().b());
            if (size != null) {
                final int iC = w0.d.c(size);
                Collections.sort(entry.getValue(), new Comparator() { // from class: f1.y
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return z.a(iC, (Size) obj, (Size) obj2);
                    }
                });
            }
        }
    }
}
