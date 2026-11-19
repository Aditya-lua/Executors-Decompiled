package hn;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f18372h = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f18373g;

    public static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.c f18374a;
        public final Object[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18375c;

        public a(m.c cVar, Object[] objArr, int i10) {
            this.f18374a = cVar;
            this.b = objArr;
            this.f18375c = i10;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f18374a, this.b, this.f18375c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f18375c < this.b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.b;
            int i10 = this.f18375c;
            this.f18375c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q(Object obj) {
        int[] iArr = this.b;
        int i10 = this.f18338a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f18373g = objArr;
        this.f18338a = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // hn.m
    public int I(m.b bVar) {
        Map.Entry<?, ?> entry = (Map.Entry) d0(Map.Entry.class, m.c.NAME);
        String strE0 = e0(entry);
        int length = bVar.f18344a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bVar.f18344a[i10].equals(strE0)) {
                this.f18373g[this.f18338a - 1] = entry.getValue();
                this.f18339c[this.f18338a - 2] = strE0;
                return i10;
            }
        }
        return -1;
    }

    @Override // hn.m
    public int K(m.b bVar) {
        int i10 = this.f18338a;
        Object obj = i10 != 0 ? this.f18373g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f18372h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f18344a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f18344a[i11].equals(str)) {
                c0();
                return i11;
            }
        }
        return -1;
    }

    @Override // hn.m
    public void O() {
        if (!this.f18342f) {
            this.f18373g[this.f18338a - 1] = ((Map.Entry) d0(Map.Entry.class, m.c.NAME)).getValue();
            this.f18339c[this.f18338a - 2] = "null";
            return;
        }
        m.c cVarW = w();
        o();
        throw new j("Cannot skip unexpected " + cVarW + " at " + x());
    }

    @Override // hn.m
    public void Q() {
        if (this.f18342f) {
            throw new j("Cannot skip unexpected " + w() + " at " + x());
        }
        int i10 = this.f18338a;
        if (i10 > 1) {
            this.f18339c[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f18373g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new j("Expected a value but was " + w() + " at path " + x());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f18373g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                c0();
                return;
            }
            throw new j("Expected a value but was " + w() + " at path " + x());
        }
    }

    @Override // hn.m
    public void a() {
        List list = (List) d0(List.class, m.c.BEGIN_ARRAY);
        a aVar = new a(m.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f18373g;
        int i10 = this.f18338a;
        objArr[i10 - 1] = aVar;
        this.b[i10 - 1] = 1;
        this.f18340d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            b0(aVar.next());
        }
    }

    @Override // hn.m
    public void b() {
        Map map = (Map) d0(Map.class, m.c.BEGIN_OBJECT);
        a aVar = new a(m.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f18373g;
        int i10 = this.f18338a;
        objArr[i10 - 1] = aVar;
        this.b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            b0(aVar.next());
        }
    }

    public final void b0(Object obj) {
        int i10 = this.f18338a;
        if (i10 == this.f18373g.length) {
            if (i10 == 256) {
                throw new j("Nesting too deep at " + x());
            }
            int[] iArr = this.b;
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f18339c;
            this.f18339c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f18340d;
            this.f18340d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f18373g;
            this.f18373g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f18373g;
        int i11 = this.f18338a;
        this.f18338a = i11 + 1;
        objArr2[i11] = obj;
    }

    @Override // hn.m
    public void c() {
        m.c cVar = m.c.END_ARRAY;
        a aVar = (a) d0(a.class, cVar);
        if (aVar.f18374a != cVar || aVar.hasNext()) {
            throw Y(aVar, cVar);
        }
        c0();
    }

    public final void c0() {
        int i10 = this.f18338a;
        int i11 = i10 - 1;
        this.f18338a = i11;
        Object[] objArr = this.f18373g;
        objArr[i11] = null;
        this.b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f18340d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    b0(it.next());
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f18373g, 0, this.f18338a, (Object) null);
        this.f18373g[0] = f18372h;
        this.b[0] = 8;
        this.f18338a = 1;
    }

    @Override // hn.m
    public void d() {
        m.c cVar = m.c.END_OBJECT;
        a aVar = (a) d0(a.class, cVar);
        if (aVar.f18374a != cVar || aVar.hasNext()) {
            throw Y(aVar, cVar);
        }
        this.f18339c[this.f18338a - 1] = null;
        c0();
    }

    public final <T> T d0(Class<T> cls, m.c cVar) {
        int i10 = this.f18338a;
        Object obj = i10 != 0 ? this.f18373g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == m.c.NULL) {
            return null;
        }
        if (obj == f18372h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw Y(obj, cVar);
    }

    public final String e0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw Y(key, m.c.NAME);
    }

    @Override // hn.m
    public boolean f() {
        int i10 = this.f18338a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f18373g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // hn.m
    public boolean h() {
        Boolean bool = (Boolean) d0(Boolean.class, m.c.BOOLEAN);
        c0();
        return bool.booleanValue();
    }

    @Override // hn.m
    public double k() throws k {
        double dDoubleValue;
        m.c cVar = m.c.NUMBER;
        Object objD0 = d0(Object.class, cVar);
        if (objD0 instanceof Number) {
            dDoubleValue = ((Number) objD0).doubleValue();
        } else {
            if (!(objD0 instanceof String)) {
                throw Y(objD0, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objD0);
            } catch (NumberFormatException unused) {
                throw Y(objD0, m.c.NUMBER);
            }
        }
        if (this.f18341e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            c0();
            return dDoubleValue;
        }
        throw new k("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + x());
    }

    @Override // hn.m
    public int m() {
        int iIntValueExact;
        m.c cVar = m.c.NUMBER;
        Object objD0 = d0(Object.class, cVar);
        if (objD0 instanceof Number) {
            iIntValueExact = ((Number) objD0).intValue();
        } else {
            if (!(objD0 instanceof String)) {
                throw Y(objD0, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objD0);
                } catch (NumberFormatException unused) {
                    throw Y(objD0, m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objD0).intValueExact();
            }
        }
        c0();
        return iIntValueExact;
    }

    @Override // hn.m
    public long n() {
        long jLongValueExact;
        m.c cVar = m.c.NUMBER;
        Object objD0 = d0(Object.class, cVar);
        if (objD0 instanceof Number) {
            jLongValueExact = ((Number) objD0).longValue();
        } else {
            if (!(objD0 instanceof String)) {
                throw Y(objD0, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objD0);
                } catch (NumberFormatException unused) {
                    throw Y(objD0, m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objD0).longValueExact();
            }
        }
        c0();
        return jLongValueExact;
    }

    @Override // hn.m
    public String o() {
        Map.Entry<?, ?> entry = (Map.Entry) d0(Map.Entry.class, m.c.NAME);
        String strE0 = e0(entry);
        this.f18373g[this.f18338a - 1] = entry.getValue();
        this.f18339c[this.f18338a - 2] = strE0;
        return strE0;
    }

    @Override // hn.m
    public <T> T p() {
        d0(Void.class, m.c.NULL);
        c0();
        return null;
    }

    @Override // hn.m
    public ew.g r() throws IOException {
        Object objE = E();
        ew.e eVar = new ew.e();
        t tVarR = t.r(eVar);
        try {
            tVarR.n(objE);
            tVarR.close();
            return eVar;
        } catch (Throwable th2) {
            if (tVarR != null) {
                try {
                    tVarR.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // hn.m
    public String s() {
        int i10 = this.f18338a;
        Object obj = i10 != 0 ? this.f18373g[i10 - 1] : null;
        if (obj instanceof String) {
            c0();
            return (String) obj;
        }
        if (obj instanceof Number) {
            c0();
            return obj.toString();
        }
        if (obj == f18372h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw Y(obj, m.c.STRING);
    }

    @Override // hn.m
    public m.c w() {
        int i10 = this.f18338a;
        if (i10 == 0) {
            return m.c.END_DOCUMENT;
        }
        Object obj = this.f18373g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f18374a;
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
        if (obj == f18372h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw Y(obj, "a JSON value");
    }

    @Override // hn.m
    public m y() {
        return new q(this);
    }

    @Override // hn.m
    public void z() {
        if (f()) {
            b0(o());
        }
    }

    public q(q qVar) {
        super(qVar);
        this.f18373g = (Object[]) qVar.f18373g.clone();
        for (int i10 = 0; i10 < this.f18338a; i10++) {
            Object[] objArr = this.f18373g;
            Object obj = objArr[i10];
            if (obj instanceof a) {
                objArr[i10] = ((a) obj).clone();
            }
        }
    }
}
