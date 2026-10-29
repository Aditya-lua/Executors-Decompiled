package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.t.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t<T extends b<T>> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t<?> f2316d = new t<>(true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1<T, Object> f2317a;
    public boolean b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2318c;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2319a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[s1.b.values().length];
            b = iArr;
            try {
                iArr[s1.b.f2286c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[s1.b.f2287d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[s1.b.f2288e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[s1.b.f2289f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[s1.b.f2290g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[s1.b.f2291h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[s1.b.f2292i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[s1.b.f2293j.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[s1.b.f2295l.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                b[s1.b.f2296m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                b[s1.b.f2294k.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                b[s1.b.f2297n.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                b[s1.b.f2298o.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                b[s1.b.f2300q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                b[s1.b.f2301r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                b[s1.b.f2302s.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                b[s1.b.f2303t.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                b[s1.b.f2299p.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[s1.c.values().length];
            f2319a = iArr2;
            try {
                iArr2[s1.c.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f2319a[s1.c.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f2319a[s1.c.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f2319a[s1.c.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f2319a[s1.c.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f2319a[s1.c.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f2319a[s1.c.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f2319a[s1.c.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f2319a[s1.c.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        boolean f();

        s1.b g();

        int getNumber();

        s1.c k();

        boolean m();

        r0.a t(r0.a aVar, r0 r0Var);
    }

    public t() {
        this.f2317a = j1.r();
    }

    public static void A(j jVar, s1.b bVar, int i10, Object obj) {
        if (bVar == s1.b.f2295l) {
            jVar.z0(i10, (r0) obj);
        } else {
            jVar.V0(i10, m(bVar, false));
            B(jVar, bVar, obj);
        }
    }

    public static void B(j jVar, s1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                jVar.q0(((Double) obj).doubleValue());
                break;
            case 2:
                jVar.y0(((Float) obj).floatValue());
                break;
            case 3:
                jVar.G0(((Long) obj).longValue());
                break;
            case 4:
                jVar.Z0(((Long) obj).longValue());
                break;
            case 5:
                jVar.E0(((Integer) obj).intValue());
                break;
            case 6:
                jVar.w0(((Long) obj).longValue());
                break;
            case 7:
                jVar.u0(((Integer) obj).intValue());
                break;
            case 8:
                jVar.k0(((Boolean) obj).booleanValue());
                break;
            case 9:
                jVar.B0((r0) obj);
                break;
            case 10:
                jVar.I0((r0) obj);
                break;
            case 11:
                if (!(obj instanceof g)) {
                    jVar.U0((String) obj);
                } else {
                    jVar.o0((g) obj);
                }
                break;
            case 12:
                if (!(obj instanceof g)) {
                    jVar.l0((byte[]) obj);
                } else {
                    jVar.o0((g) obj);
                }
                break;
            case 13:
                jVar.X0(((Integer) obj).intValue());
                break;
            case 14:
                jVar.M0(((Integer) obj).intValue());
                break;
            case 15:
                jVar.O0(((Long) obj).longValue());
                break;
            case 16:
                jVar.Q0(((Integer) obj).intValue());
                break;
            case 17:
                jVar.S0(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof z.a)) {
                    jVar.s0(((Integer) obj).intValue());
                } else {
                    jVar.s0(((z.a) obj).getNumber());
                }
                break;
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int d(s1.b bVar, int i10, Object obj) {
        int iU = j.U(i10);
        if (bVar == s1.b.f2295l) {
            iU *= 2;
        }
        return iU + e(bVar, obj);
    }

    public static int e(s1.b bVar, Object obj) {
        switch (a.b[bVar.ordinal()]) {
            case 1:
                return j.j(((Double) obj).doubleValue());
            case 2:
                return j.r(((Float) obj).floatValue());
            case 3:
                return j.y(((Long) obj).longValue());
            case 4:
                return j.Y(((Long) obj).longValue());
            case 5:
                return j.w(((Integer) obj).intValue());
            case 6:
                return j.p(((Long) obj).longValue());
            case 7:
                return j.n(((Integer) obj).intValue());
            case 8:
                return j.e(((Boolean) obj).booleanValue());
            case 9:
                return j.t((r0) obj);
            case 10:
                return obj instanceof c0 ? j.B((c0) obj) : j.G((r0) obj);
            case 11:
                return obj instanceof g ? j.h((g) obj) : j.T((String) obj);
            case 12:
                return obj instanceof g ? j.h((g) obj) : j.f((byte[]) obj);
            case 13:
                return j.W(((Integer) obj).intValue());
            case 14:
                return j.L(((Integer) obj).intValue());
            case 15:
                return j.N(((Long) obj).longValue());
            case 16:
                return j.P(((Integer) obj).intValue());
            case 17:
                return j.R(((Long) obj).longValue());
            case 18:
                return obj instanceof z.a ? j.l(((z.a) obj).getNumber()) : j.l(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int f(b<?> bVar, Object obj) {
        s1.b bVarG = bVar.g();
        int number = bVar.getNumber();
        if (!bVar.f()) {
            return d(bVarG, number, obj);
        }
        List list = (List) obj;
        int size = list.size();
        int i10 = 0;
        if (!bVar.m()) {
            int iD = 0;
            while (i10 < size) {
                iD += d(bVarG, number, list.get(i10));
                i10++;
            }
            return iD;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int iE = 0;
        while (i10 < size) {
            iE += e(bVarG, list.get(i10));
            i10++;
        }
        return j.U(number) + iE + j.W(iE);
    }

    public static <T extends b<T>> t<T> h() {
        return (t<T>) f2316d;
    }

    public static int m(s1.b bVar, boolean z10) {
        if (z10) {
            return 2;
        }
        return bVar.b();
    }

    public static <T extends b<T>> boolean q(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.k() != s1.c.MESSAGE) {
            return true;
        }
        if (!key.f()) {
            return r(entry.getValue());
        }
        List list = (List) entry.getValue();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!r(list.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public static boolean r(Object obj) {
        if (obj instanceof s0) {
            return ((s0) obj).isInitialized();
        }
        if (obj instanceof c0) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public static boolean s(s1.b bVar, Object obj) {
        z.a(obj);
        switch (a.f2319a[bVar.a().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof g) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof z.a);
            case 9:
                return (obj instanceof r0) || (obj instanceof c0);
            default:
                return false;
        }
    }

    public static <T extends b<T>> t<T> x() {
        return new t<>();
    }

    public void a(T t8, Object obj) {
        List arrayList;
        if (!t8.f()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        z(t8, obj);
        Object objI = i(t8);
        if (objI == null) {
            arrayList = new ArrayList();
            this.f2317a.s(t8, arrayList);
        } else {
            arrayList = (List) objI;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public t<T> clone() {
        t<T> tVarX = x();
        int iL = this.f2317a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f2317a.k(i10);
            tVarX.y((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f2317a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            tVarX.y((b) entry.getKey(), entry.getValue());
        }
        tVarX.f2318c = this.f2318c;
        return tVarX;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return this.f2317a.equals(((t) obj).f2317a);
        }
        return false;
    }

    public Iterator<Map.Entry<T, Object>> g() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f2318c ? new c0.c(this.f2317a.i().iterator()) : this.f2317a.i().iterator();
    }

    public int hashCode() {
        return this.f2317a.hashCode();
    }

    public Object i(T t8) {
        Object obj = this.f2317a.get(t8);
        return obj instanceof c0 ? ((c0) obj).f() : obj;
    }

    public int j() {
        int iL = this.f2317a.l();
        int iK = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            iK += k(this.f2317a.k(i10));
        }
        Iterator it = this.f2317a.n().iterator();
        while (it.hasNext()) {
            iK += k((Map.Entry) it.next());
        }
        return iK;
    }

    public final int k(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.k() != s1.c.MESSAGE || key.f() || key.m()) {
            return f(key, value);
        }
        return value instanceof c0 ? j.z(entry.getKey().getNumber(), (c0) value) : j.D(entry.getKey().getNumber(), (r0) value);
    }

    public int l() {
        int iL = this.f2317a.l();
        int iF = 0;
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f2317a.k(i10);
            iF += f((b) entryK.getKey(), entryK.getValue());
        }
        Iterator it = this.f2317a.n().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iF += f((b) entry.getKey(), entry.getValue());
        }
        return iF;
    }

    public boolean n() {
        return this.f2317a.isEmpty();
    }

    public boolean o() {
        return this.b;
    }

    public boolean p() {
        int iL = this.f2317a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            if (!q(this.f2317a.k(i10))) {
                return false;
            }
        }
        Iterator it = this.f2317a.n().iterator();
        while (it.hasNext()) {
            if (!q((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<T, Object>> t() {
        if (n()) {
            return Collections.emptyIterator();
        }
        return this.f2318c ? new c0.c(this.f2317a.entrySet().iterator()) : this.f2317a.entrySet().iterator();
    }

    public void u() {
        if (this.b) {
            return;
        }
        int iL = this.f2317a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            Map.Entry<K, Object> entryK = this.f2317a.k(i10);
            if (entryK.getValue() instanceof x) {
                ((x) entryK.getValue()).J();
            }
        }
        this.f2317a.q();
        this.b = true;
    }

    public void v(t<T> tVar) {
        int iL = tVar.f2317a.l();
        for (int i10 = 0; i10 < iL; i10++) {
            w(tVar.f2317a.k(i10));
        }
        Iterator it = tVar.f2317a.n().iterator();
        while (it.hasNext()) {
            w((Map.Entry) it.next());
        }
    }

    public final void w(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof c0;
        if (key.f()) {
            if (z10) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object objI = i(key);
            if (objI == null) {
                objI = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) objI).add(c(it.next()));
            }
            this.f2317a.s(key, objI);
            return;
        }
        if (key.k() != s1.c.MESSAGE) {
            if (z10) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.f2317a.s(key, c(value));
            return;
        }
        Object objI2 = i(key);
        if (objI2 == null) {
            this.f2317a.s(key, c(value));
            if (z10) {
                this.f2318c = true;
                return;
            }
            return;
        }
        if (z10) {
            value = ((c0) value).f();
        }
        this.f2317a.s(key, key.t(((r0) objI2).a(), (r0) value).build());
    }

    public void y(T t8, Object obj) {
        if (!t8.f()) {
            z(t8, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                z(t8, obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof c0) {
            this.f2318c = true;
        }
        this.f2317a.s(t8, obj);
    }

    public final void z(T t8, Object obj) {
        if (!s(t8.g(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t8.getNumber()), t8.g().a(), obj.getClass().getName()));
        }
    }

    public t(boolean z10) {
        this(j1.r());
        u();
    }

    public t(j1<T, Object> j1Var) {
        this.f2317a = j1Var;
        u();
    }
}
