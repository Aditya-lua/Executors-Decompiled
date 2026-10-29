package um;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f32427h = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f32428g;

    public static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.c f32429a;
        public final Object[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32430c;

        public a(m.c cVar, Object[] objArr, int i10) {
            this.f32429a = cVar;
            this.b = objArr;
            this.f32430c = i10;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f32429a, this.b, this.f32430c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f32430c < this.b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.b;
            int i10 = this.f32430c;
            this.f32430c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q(Object obj) {
        int[] iArr = this.b;
        int i10 = this.f32393a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f32428g = objArr;
        this.f32393a = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // um.m
    public int F(m.b bVar) {
        Map.Entry<?, ?> entry = (Map.Entry) a0(Map.Entry.class, m.c.NAME);
        String strB0 = b0(entry);
        int length = bVar.f32399a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bVar.f32399a[i10].equals(strB0)) {
                this.f32428g[this.f32393a - 1] = entry.getValue();
                this.f32394c[this.f32393a - 2] = strB0;
                return i10;
            }
        }
        return -1;
    }

    @Override // um.m
    public int H(m.b bVar) {
        int i10 = this.f32393a;
        Object obj = i10 != 0 ? this.f32428g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f32427h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f32399a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f32399a[i11].equals(str)) {
                Z();
                return i11;
            }
        }
        return -1;
    }

    @Override // um.m
    public void M() {
        if (!this.f32397f) {
            this.f32428g[this.f32393a - 1] = ((Map.Entry) a0(Map.Entry.class, m.c.NAME)).getValue();
            this.f32394c[this.f32393a - 2] = "null";
            return;
        }
        m.c cVarU = u();
        n();
        throw new j("Cannot skip unexpected " + cVarU + " at " + getPath());
    }

    @Override // um.m
    public void P() {
        if (this.f32397f) {
            throw new j("Cannot skip unexpected " + u() + " at " + getPath());
        }
        int i10 = this.f32393a;
        if (i10 > 1) {
            this.f32394c[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f32428g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new j("Expected a value but was " + u() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f32428g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                Z();
                return;
            }
            throw new j("Expected a value but was " + u() + " at path " + getPath());
        }
    }

    public final void Y(Object obj) {
        int i10 = this.f32393a;
        if (i10 == this.f32428g.length) {
            if (i10 == 256) {
                throw new j("Nesting too deep at " + getPath());
            }
            int[] iArr = this.b;
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f32394c;
            this.f32394c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f32395d;
            this.f32395d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f32428g;
            this.f32428g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f32428g;
        int i11 = this.f32393a;
        this.f32393a = i11 + 1;
        objArr2[i11] = obj;
    }

    public final void Z() {
        int i10 = this.f32393a;
        int i11 = i10 - 1;
        this.f32393a = i11;
        Object[] objArr = this.f32428g;
        objArr[i11] = null;
        this.b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f32395d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    Y(it.next());
                }
            }
        }
    }

    @Override // um.m
    public void a() {
        List list = (List) a0(List.class, m.c.BEGIN_ARRAY);
        a aVar = new a(m.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f32428g;
        int i10 = this.f32393a;
        objArr[i10 - 1] = aVar;
        this.b[i10 - 1] = 1;
        this.f32395d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            Y(aVar.next());
        }
    }

    public final <T> T a0(Class<T> cls, m.c cVar) {
        int i10 = this.f32393a;
        Object obj = i10 != 0 ? this.f32428g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == m.c.NULL) {
            return null;
        }
        if (obj == f32427h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw X(obj, cVar);
    }

    @Override // um.m
    public void b() {
        Map map = (Map) a0(Map.class, m.c.BEGIN_OBJECT);
        a aVar = new a(m.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f32428g;
        int i10 = this.f32393a;
        objArr[i10 - 1] = aVar;
        this.b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            Y(aVar.next());
        }
    }

    public final String b0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw X(key, m.c.NAME);
    }

    @Override // um.m
    public void c() {
        m.c cVar = m.c.END_ARRAY;
        a aVar = (a) a0(a.class, cVar);
        if (aVar.f32429a != cVar || aVar.hasNext()) {
            throw X(aVar, cVar);
        }
        Z();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f32428g, 0, this.f32393a, (Object) null);
        this.f32428g[0] = f32427h;
        this.b[0] = 8;
        this.f32393a = 1;
    }

    @Override // um.m
    public void d() {
        m.c cVar = m.c.END_OBJECT;
        a aVar = (a) a0(a.class, cVar);
        if (aVar.f32429a != cVar || aVar.hasNext()) {
            throw X(aVar, cVar);
        }
        this.f32394c[this.f32393a - 1] = null;
        Z();
    }

    @Override // um.m
    public boolean f() {
        int i10 = this.f32393a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f32428g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // um.m
    public boolean h() {
        Boolean bool = (Boolean) a0(Boolean.class, m.c.BOOLEAN);
        Z();
        return bool.booleanValue();
    }

    @Override // um.m
    public double j() throws k {
        double dDoubleValue;
        m.c cVar = m.c.NUMBER;
        Object objA0 = a0(Object.class, cVar);
        if (objA0 instanceof Number) {
            dDoubleValue = ((Number) objA0).doubleValue();
        } else {
            if (!(objA0 instanceof String)) {
                throw X(objA0, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objA0);
            } catch (NumberFormatException unused) {
                throw X(objA0, m.c.NUMBER);
            }
        }
        if (this.f32396e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            Z();
            return dDoubleValue;
        }
        throw new k("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
    }

    @Override // um.m
    public int l() {
        int iIntValueExact;
        m.c cVar = m.c.NUMBER;
        Object objA0 = a0(Object.class, cVar);
        if (objA0 instanceof Number) {
            iIntValueExact = ((Number) objA0).intValue();
        } else {
            if (!(objA0 instanceof String)) {
                throw X(objA0, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objA0);
                } catch (NumberFormatException unused) {
                    throw X(objA0, m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objA0).intValueExact();
            }
        }
        Z();
        return iIntValueExact;
    }

    @Override // um.m
    public long m() {
        long jLongValueExact;
        m.c cVar = m.c.NUMBER;
        Object objA0 = a0(Object.class, cVar);
        if (objA0 instanceof Number) {
            jLongValueExact = ((Number) objA0).longValue();
        } else {
            if (!(objA0 instanceof String)) {
                throw X(objA0, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objA0);
                } catch (NumberFormatException unused) {
                    throw X(objA0, m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objA0).longValueExact();
            }
        }
        Z();
        return jLongValueExact;
    }

    @Override // um.m
    public String n() {
        Map.Entry<?, ?> entry = (Map.Entry) a0(Map.Entry.class, m.c.NAME);
        String strB0 = b0(entry);
        this.f32428g[this.f32393a - 1] = entry.getValue();
        this.f32394c[this.f32393a - 2] = strB0;
        return strB0;
    }

    @Override // um.m
    public <T> T o() {
        a0(Void.class, m.c.NULL);
        Z();
        return null;
    }

    @Override // um.m
    public xu.g q() throws IOException {
        Object objB = B();
        xu.e eVar = new xu.e();
        t tVarQ = t.q(eVar);
        try {
            tVarQ.m(objB);
            tVarQ.close();
            return eVar;
        } catch (Throwable th2) {
            if (tVarQ != null) {
                try {
                    tVarQ.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // um.m
    public String r() {
        int i10 = this.f32393a;
        Object obj = i10 != 0 ? this.f32428g[i10 - 1] : null;
        if (obj instanceof String) {
            Z();
            return (String) obj;
        }
        if (obj instanceof Number) {
            Z();
            return obj.toString();
        }
        if (obj == f32427h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw X(obj, m.c.STRING);
    }

    @Override // um.m
    public m.c u() {
        int i10 = this.f32393a;
        if (i10 == 0) {
            return m.c.END_DOCUMENT;
        }
        Object obj = this.f32428g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f32429a;
        }
        if (obj instanceof List) {
            return m.c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return m.c.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return m.c.NAME;
        }
        if (obj instanceof String) {
            return m.c.STRING;
        }
        if (obj instanceof Boolean) {
            return m.c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return m.c.NUMBER;
        }
        if (obj == null) {
            return m.c.NULL;
        }
        if (obj == f32427h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw X(obj, "a JSON value");
    }

    @Override // um.m
    public m v() {
        return new q(this);
    }

    @Override // um.m
    public void w() {
        if (f()) {
            Y(n());
        }
    }

    public q(q qVar) {
        super(qVar);
        this.f32428g = (Object[]) qVar.f32428g.clone();
        for (int i10 = 0; i10 < this.f32393a; i10++) {
            Object[] objArr = this.f32428g;
            Object obj = objArr[i10];
            if (obj instanceof a) {
                objArr[i10] = ((a) obj).clone();
            }
        }
    }
}
