package sm;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f31617h = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object[] f31618g;

    public static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.c f31619a;
        public final Object[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f31620c;

        public a(m.c cVar, Object[] objArr, int i10) {
            this.f31619a = cVar;
            this.b = objArr;
            this.f31620c = i10;
        }

        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f31619a, this.b, this.f31620c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f31620c < this.b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.b;
            int i10 = this.f31620c;
            this.f31620c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public q(Object obj) {
        int[] iArr = this.b;
        int i10 = this.f31583a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f31618g = objArr;
        this.f31583a = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // sm.m
    public int F(m.b bVar) {
        Map.Entry<?, ?> entry = (Map.Entry) Z(Map.Entry.class, m.c.NAME);
        String strA0 = a0(entry);
        int length = bVar.f31589a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bVar.f31589a[i10].equals(strA0)) {
                this.f31618g[this.f31583a - 1] = entry.getValue();
                this.f31584c[this.f31583a - 2] = strA0;
                return i10;
            }
        }
        return -1;
    }

    @Override // sm.m
    public int H(m.b bVar) {
        int i10 = this.f31583a;
        Object obj = i10 != 0 ? this.f31618g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f31617h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f31589a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f31589a[i11].equals(str)) {
                Y();
                return i11;
            }
        }
        return -1;
    }

    @Override // sm.m
    public void M() {
        if (!this.f31587f) {
            this.f31618g[this.f31583a - 1] = ((Map.Entry) Z(Map.Entry.class, m.c.NAME)).getValue();
            this.f31584c[this.f31583a - 2] = "null";
            return;
        }
        m.c cVarU = u();
        n();
        throw new j("Cannot skip unexpected " + cVarU + " at " + getPath());
    }

    @Override // sm.m
    public void P() {
        if (this.f31587f) {
            throw new j("Cannot skip unexpected " + u() + " at " + getPath());
        }
        int i10 = this.f31583a;
        if (i10 > 1) {
            this.f31584c[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f31618g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new j("Expected a value but was " + u() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f31618g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                Y();
                return;
            }
            throw new j("Expected a value but was " + u() + " at path " + getPath());
        }
    }

    public final void X(Object obj) {
        int i10 = this.f31583a;
        if (i10 == this.f31618g.length) {
            if (i10 == 256) {
                throw new j("Nesting too deep at " + getPath());
            }
            int[] iArr = this.b;
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f31584c;
            this.f31584c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f31585d;
            this.f31585d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f31618g;
            this.f31618g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f31618g;
        int i11 = this.f31583a;
        this.f31583a = i11 + 1;
        objArr2[i11] = obj;
    }

    public final void Y() {
        int i10 = this.f31583a;
        int i11 = i10 - 1;
        this.f31583a = i11;
        Object[] objArr = this.f31618g;
        objArr[i11] = null;
        this.b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f31585d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    X(it.next());
                }
            }
        }
    }

    public final <T> T Z(Class<T> cls, m.c cVar) {
        int i10 = this.f31583a;
        Object obj = i10 != 0 ? this.f31618g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == m.c.NULL) {
            return null;
        }
        if (obj == f31617h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw W(obj, cVar);
    }

    @Override // sm.m
    public void a() {
        List list = (List) Z(List.class, m.c.BEGIN_ARRAY);
        a aVar = new a(m.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f31618g;
        int i10 = this.f31583a;
        objArr[i10 - 1] = aVar;
        this.b[i10 - 1] = 1;
        this.f31585d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            X(aVar.next());
        }
    }

    public final String a0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw W(key, m.c.NAME);
    }

    @Override // sm.m
    public void b() {
        Map map = (Map) Z(Map.class, m.c.BEGIN_OBJECT);
        a aVar = new a(m.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f31618g;
        int i10 = this.f31583a;
        objArr[i10 - 1] = aVar;
        this.b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            X(aVar.next());
        }
    }

    @Override // sm.m
    public void c() {
        m.c cVar = m.c.END_ARRAY;
        a aVar = (a) Z(a.class, cVar);
        if (aVar.f31619a != cVar || aVar.hasNext()) {
            throw W(aVar, cVar);
        }
        Y();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f31618g, 0, this.f31583a, (Object) null);
        this.f31618g[0] = f31617h;
        this.b[0] = 8;
        this.f31583a = 1;
    }

    @Override // sm.m
    public void d() {
        m.c cVar = m.c.END_OBJECT;
        a aVar = (a) Z(a.class, cVar);
        if (aVar.f31619a != cVar || aVar.hasNext()) {
            throw W(aVar, cVar);
        }
        this.f31584c[this.f31583a - 1] = null;
        Y();
    }

    @Override // sm.m
    public boolean f() {
        int i10 = this.f31583a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f31618g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // sm.m
    public boolean h() {
        Boolean bool = (Boolean) Z(Boolean.class, m.c.BOOLEAN);
        Y();
        return bool.booleanValue();
    }

    @Override // sm.m
    public double j() throws k {
        double dDoubleValue;
        m.c cVar = m.c.NUMBER;
        Object objZ = Z(Object.class, cVar);
        if (objZ instanceof Number) {
            dDoubleValue = ((Number) objZ).doubleValue();
        } else {
            if (!(objZ instanceof String)) {
                throw W(objZ, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objZ);
            } catch (NumberFormatException unused) {
                throw W(objZ, m.c.NUMBER);
            }
        }
        if (this.f31586e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            Y();
            return dDoubleValue;
        }
        throw new k("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
    }

    @Override // sm.m
    public int l() {
        int iIntValueExact;
        m.c cVar = m.c.NUMBER;
        Object objZ = Z(Object.class, cVar);
        if (objZ instanceof Number) {
            iIntValueExact = ((Number) objZ).intValue();
        } else {
            if (!(objZ instanceof String)) {
                throw W(objZ, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objZ);
                } catch (NumberFormatException unused) {
                    throw W(objZ, m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objZ).intValueExact();
            }
        }
        Y();
        return iIntValueExact;
    }

    @Override // sm.m
    public long m() {
        long jLongValueExact;
        m.c cVar = m.c.NUMBER;
        Object objZ = Z(Object.class, cVar);
        if (objZ instanceof Number) {
            jLongValueExact = ((Number) objZ).longValue();
        } else {
            if (!(objZ instanceof String)) {
                throw W(objZ, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objZ);
                } catch (NumberFormatException unused) {
                    throw W(objZ, m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objZ).longValueExact();
            }
        }
        Y();
        return jLongValueExact;
    }

    @Override // sm.m
    public String n() {
        Map.Entry<?, ?> entry = (Map.Entry) Z(Map.Entry.class, m.c.NAME);
        String strA0 = a0(entry);
        this.f31618g[this.f31583a - 1] = entry.getValue();
        this.f31584c[this.f31583a - 2] = strA0;
        return strA0;
    }

    @Override // sm.m
    public <T> T o() {
        Z(Void.class, m.c.NULL);
        Y();
        return null;
    }

    @Override // sm.m
    public vu.g q() throws IOException {
        Object objA = A();
        vu.e eVar = new vu.e();
        t tVarQ = t.q(eVar);
        try {
            tVarQ.m(objA);
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

    @Override // sm.m
    public String r() {
        int i10 = this.f31583a;
        Object obj = i10 != 0 ? this.f31618g[i10 - 1] : null;
        if (obj instanceof String) {
            Y();
            return (String) obj;
        }
        if (obj instanceof Number) {
            Y();
            return obj.toString();
        }
        if (obj == f31617h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw W(obj, m.c.STRING);
    }

    @Override // sm.m
    public m.c u() {
        int i10 = this.f31583a;
        if (i10 == 0) {
            return m.c.END_DOCUMENT;
        }
        Object obj = this.f31618g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f31619a;
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
        if (obj == f31617h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw W(obj, "a JSON value");
    }

    @Override // sm.m
    public m v() {
        return new q(this);
    }

    @Override // sm.m
    public void w() {
        if (f()) {
            X(n());
        }
    }

    public q(q qVar) {
        super(qVar);
        this.f31618g = (Object[]) qVar.f31618g.clone();
        for (int i10 = 0; i10 < this.f31583a; i10++) {
            Object[] objArr = this.f31618g;
            Object obj = objArr[i10];
            if (obj instanceof a) {
                objArr[i10] = ((a) obj).clone();
            }
        }
    }
}
