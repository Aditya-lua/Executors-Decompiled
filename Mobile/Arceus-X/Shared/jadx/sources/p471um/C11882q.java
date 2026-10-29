package p471um;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p560xu.C12924e;
import p560xu.InterfaceC12928g;

/* JADX INFO: renamed from: um.q */
/* JADX INFO: loaded from: classes2.dex */
public final class C11882q extends AbstractC11878m {

    /* JADX INFO: renamed from: h */
    public static final Object f42145h = new Object();

    /* JADX INFO: renamed from: g */
    public Object[] f42146g;

    /* JADX INFO: renamed from: um.q$a */
    public static final class a implements Iterator<Object>, Cloneable {

        /* JADX INFO: renamed from: a */
        public final AbstractC11878m.c f42147a;

        /* JADX INFO: renamed from: b */
        public final Object[] f42148b;

        /* JADX INFO: renamed from: c */
        public int f42149c;

        public a(AbstractC11878m.c cVar, Object[] objArr, int i10) {
            this.f42147a = cVar;
            this.f42148b = objArr;
            this.f42149c = i10;
        }

        /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a clone() {
            return new a(this.f42147a, this.f42148b, this.f42149c);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f42149c < this.f42148b.length;
        }

        @Override // java.util.Iterator
        public Object next() {
            Object[] objArr = this.f42148b;
            int i10 = this.f42149c;
            this.f42149c = i10 + 1;
            return objArr[i10];
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C11882q(Object obj) {
        int[] iArr = this.f42109b;
        int i10 = this.f42108a;
        iArr[i10] = 7;
        Object[] objArr = new Object[32];
        this.f42146g = objArr;
        this.f42108a = i10 + 1;
        objArr[i10] = obj;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: F */
    public int mo44316F(AbstractC11878m.b bVar) {
        Map.Entry<?, ?> entry = (Map.Entry) m44385a0(Map.Entry.class, AbstractC11878m.c.NAME);
        String strM44386b0 = m44386b0(entry);
        int length = bVar.f42115a.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (bVar.f42115a[i10].equals(strM44386b0)) {
                this.f42146g[this.f42108a - 1] = entry.getValue();
                this.f42110c[this.f42108a - 2] = strM44386b0;
                return i10;
            }
        }
        return -1;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: H */
    public int mo44317H(AbstractC11878m.b bVar) {
        int i10 = this.f42108a;
        Object obj = i10 != 0 ? this.f42146g[i10 - 1] : null;
        if (!(obj instanceof String)) {
            if (obj != f42145h) {
                return -1;
            }
            throw new IllegalStateException("JsonReader is closed");
        }
        String str = (String) obj;
        int length = bVar.f42115a.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (bVar.f42115a[i11].equals(str)) {
                m44384Z();
                return i11;
            }
        }
        return -1;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: M */
    public void mo44320M() {
        if (!this.f42113f) {
            this.f42146g[this.f42108a - 1] = ((Map.Entry) m44385a0(Map.Entry.class, AbstractC11878m.c.NAME)).getValue();
            this.f42110c[this.f42108a - 2] = "null";
            return;
        }
        AbstractC11878m.c cVarMo44339u = mo44339u();
        mo44335n();
        throw new C11875j("Cannot skip unexpected " + cVarMo44339u + " at " + getPath());
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: P */
    public void mo44321P() {
        if (this.f42113f) {
            throw new C11875j("Cannot skip unexpected " + mo44339u() + " at " + getPath());
        }
        int i10 = this.f42108a;
        if (i10 > 1) {
            this.f42110c[i10 - 2] = "null";
        }
        Object obj = i10 != 0 ? this.f42146g[i10 - 1] : null;
        if (obj instanceof a) {
            throw new C11875j("Expected a value but was " + mo44339u() + " at path " + getPath());
        }
        if (obj instanceof Map.Entry) {
            Object[] objArr = this.f42146g;
            objArr[i10 - 1] = ((Map.Entry) objArr[i10 - 1]).getValue();
        } else {
            if (i10 > 0) {
                m44384Z();
                return;
            }
            throw new C11875j("Expected a value but was " + mo44339u() + " at path " + getPath());
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m44383Y(Object obj) {
        int i10 = this.f42108a;
        if (i10 == this.f42146g.length) {
            if (i10 == 256) {
                throw new C11875j("Nesting too deep at " + getPath());
            }
            int[] iArr = this.f42109b;
            this.f42109b = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f42110c;
            this.f42110c = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f42111d;
            this.f42111d = Arrays.copyOf(iArr2, iArr2.length * 2);
            Object[] objArr = this.f42146g;
            this.f42146g = Arrays.copyOf(objArr, objArr.length * 2);
        }
        Object[] objArr2 = this.f42146g;
        int i11 = this.f42108a;
        this.f42108a = i11 + 1;
        objArr2[i11] = obj;
    }

    /* JADX INFO: renamed from: Z */
    public final void m44384Z() {
        int i10 = this.f42108a;
        int i11 = i10 - 1;
        this.f42108a = i11;
        Object[] objArr = this.f42146g;
        objArr[i11] = null;
        this.f42109b[i11] = 0;
        if (i11 > 0) {
            int[] iArr = this.f42111d;
            int i12 = i10 - 2;
            iArr[i12] = iArr[i12] + 1;
            Object obj = objArr[i10 - 2];
            if (obj instanceof Iterator) {
                Iterator it = (Iterator) obj;
                if (it.hasNext()) {
                    m44383Y(it.next());
                }
            }
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: a */
    public void mo44324a() {
        List list = (List) m44385a0(List.class, AbstractC11878m.c.BEGIN_ARRAY);
        a aVar = new a(AbstractC11878m.c.END_ARRAY, list.toArray(new Object[list.size()]), 0);
        Object[] objArr = this.f42146g;
        int i10 = this.f42108a;
        objArr[i10 - 1] = aVar;
        this.f42109b[i10 - 1] = 1;
        this.f42111d[i10 - 1] = 0;
        if (aVar.hasNext()) {
            m44383Y(aVar.next());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final <T> T m44385a0(Class<T> cls, AbstractC11878m.c cVar) {
        int i10 = this.f42108a;
        Object obj = i10 != 0 ? this.f42146g[i10 - 1] : null;
        if (cls.isInstance(obj)) {
            return cls.cast(obj);
        }
        if (obj == null && cVar == AbstractC11878m.c.NULL) {
            return null;
        }
        if (obj == f42145h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m44323X(obj, cVar);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: b */
    public void mo44325b() {
        Map map = (Map) m44385a0(Map.class, AbstractC11878m.c.BEGIN_OBJECT);
        a aVar = new a(AbstractC11878m.c.END_OBJECT, map.entrySet().toArray(new Object[map.size()]), 0);
        Object[] objArr = this.f42146g;
        int i10 = this.f42108a;
        objArr[i10 - 1] = aVar;
        this.f42109b[i10 - 1] = 3;
        if (aVar.hasNext()) {
            m44383Y(aVar.next());
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final String m44386b0(Map.Entry<?, ?> entry) {
        Object key = entry.getKey();
        if (key instanceof String) {
            return (String) key;
        }
        throw m44323X(key, AbstractC11878m.c.NAME);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: c */
    public void mo44326c() {
        AbstractC11878m.c cVar = AbstractC11878m.c.END_ARRAY;
        a aVar = (a) m44385a0(a.class, cVar);
        if (aVar.f42147a != cVar || aVar.hasNext()) {
            throw m44323X(aVar, cVar);
        }
        m44384Z();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Arrays.fill(this.f42146g, 0, this.f42108a, (Object) null);
        this.f42146g[0] = f42145h;
        this.f42109b[0] = 8;
        this.f42108a = 1;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: d */
    public void mo44327d() {
        AbstractC11878m.c cVar = AbstractC11878m.c.END_OBJECT;
        a aVar = (a) m44385a0(a.class, cVar);
        if (aVar.f42147a != cVar || aVar.hasNext()) {
            throw m44323X(aVar, cVar);
        }
        this.f42110c[this.f42108a - 1] = null;
        m44384Z();
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: f */
    public boolean mo44329f() {
        int i10 = this.f42108a;
        if (i10 == 0) {
            return false;
        }
        Object obj = this.f42146g[i10 - 1];
        return !(obj instanceof Iterator) || ((Iterator) obj).hasNext();
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: h */
    public boolean mo44331h() {
        Boolean bool = (Boolean) m44385a0(Boolean.class, AbstractC11878m.c.BOOLEAN);
        m44384Z();
        return bool.booleanValue();
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: j */
    public double mo44332j() throws C11876k {
        double dDoubleValue;
        AbstractC11878m.c cVar = AbstractC11878m.c.NUMBER;
        Object objM44385a0 = m44385a0(Object.class, cVar);
        if (objM44385a0 instanceof Number) {
            dDoubleValue = ((Number) objM44385a0).doubleValue();
        } else {
            if (!(objM44385a0 instanceof String)) {
                throw m44323X(objM44385a0, cVar);
            }
            try {
                dDoubleValue = Double.parseDouble((String) objM44385a0);
            } catch (NumberFormatException unused) {
                throw m44323X(objM44385a0, AbstractC11878m.c.NUMBER);
            }
        }
        if (this.f42112e || !(Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue))) {
            m44384Z();
            return dDoubleValue;
        }
        throw new C11876k("JSON forbids NaN and infinities: " + dDoubleValue + " at path " + getPath());
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: l */
    public int mo44333l() {
        int iIntValueExact;
        AbstractC11878m.c cVar = AbstractC11878m.c.NUMBER;
        Object objM44385a0 = m44385a0(Object.class, cVar);
        if (objM44385a0 instanceof Number) {
            iIntValueExact = ((Number) objM44385a0).intValue();
        } else {
            if (!(objM44385a0 instanceof String)) {
                throw m44323X(objM44385a0, cVar);
            }
            try {
                try {
                    iIntValueExact = Integer.parseInt((String) objM44385a0);
                } catch (NumberFormatException unused) {
                    throw m44323X(objM44385a0, AbstractC11878m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                iIntValueExact = new BigDecimal((String) objM44385a0).intValueExact();
            }
        }
        m44384Z();
        return iIntValueExact;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: m */
    public long mo44334m() {
        long jLongValueExact;
        AbstractC11878m.c cVar = AbstractC11878m.c.NUMBER;
        Object objM44385a0 = m44385a0(Object.class, cVar);
        if (objM44385a0 instanceof Number) {
            jLongValueExact = ((Number) objM44385a0).longValue();
        } else {
            if (!(objM44385a0 instanceof String)) {
                throw m44323X(objM44385a0, cVar);
            }
            try {
                try {
                    jLongValueExact = Long.parseLong((String) objM44385a0);
                } catch (NumberFormatException unused) {
                    throw m44323X(objM44385a0, AbstractC11878m.c.NUMBER);
                }
            } catch (NumberFormatException unused2) {
                jLongValueExact = new BigDecimal((String) objM44385a0).longValueExact();
            }
        }
        m44384Z();
        return jLongValueExact;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: n */
    public String mo44335n() {
        Map.Entry<?, ?> entry = (Map.Entry) m44385a0(Map.Entry.class, AbstractC11878m.c.NAME);
        String strM44386b0 = m44386b0(entry);
        this.f42146g[this.f42108a - 1] = entry.getValue();
        this.f42110c[this.f42108a - 2] = strM44386b0;
        return strM44386b0;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: o */
    public <T> T mo44336o() {
        m44385a0(Void.class, AbstractC11878m.c.NULL);
        m44384Z();
        return null;
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: q */
    public InterfaceC12928g mo44337q() throws IOException {
        Object objM44315B = m44315B();
        C12924e c12924e = new C12924e();
        AbstractC11885t abstractC11885tM44393q = AbstractC11885t.m44393q(c12924e);
        try {
            abstractC11885tM44393q.m44402m(objM44315B);
            abstractC11885tM44393q.close();
            return c12924e;
        } catch (Throwable th2) {
            if (abstractC11885tM44393q != null) {
                try {
                    abstractC11885tM44393q.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: r */
    public String mo44338r() {
        int i10 = this.f42108a;
        Object obj = i10 != 0 ? this.f42146g[i10 - 1] : null;
        if (obj instanceof String) {
            m44384Z();
            return (String) obj;
        }
        if (obj instanceof Number) {
            m44384Z();
            return obj.toString();
        }
        if (obj == f42145h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m44323X(obj, AbstractC11878m.c.STRING);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: u */
    public AbstractC11878m.c mo44339u() {
        int i10 = this.f42108a;
        if (i10 == 0) {
            return AbstractC11878m.c.END_DOCUMENT;
        }
        Object obj = this.f42146g[i10 - 1];
        if (obj instanceof a) {
            return ((a) obj).f42147a;
        }
        if (obj instanceof List) {
            return AbstractC11878m.c.BEGIN_ARRAY;
        }
        if (obj instanceof Map) {
            return AbstractC11878m.c.BEGIN_OBJECT;
        }
        if (obj instanceof Map.Entry) {
            return AbstractC11878m.c.NAME;
        }
        if (obj instanceof String) {
            return AbstractC11878m.c.STRING;
        }
        if (obj instanceof Boolean) {
            return AbstractC11878m.c.BOOLEAN;
        }
        if (obj instanceof Number) {
            return AbstractC11878m.c.NUMBER;
        }
        if (obj == null) {
            return AbstractC11878m.c.NULL;
        }
        if (obj == f42145h) {
            throw new IllegalStateException("JsonReader is closed");
        }
        throw m44323X(obj, "a JSON value");
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: v */
    public AbstractC11878m mo44340v() {
        return new C11882q(this);
    }

    @Override // p471um.AbstractC11878m
    /* JADX INFO: renamed from: w */
    public void mo44341w() {
        if (mo44329f()) {
            m44383Y(mo44335n());
        }
    }

    public C11882q(C11882q c11882q) {
        super(c11882q);
        this.f42146g = (Object[]) c11882q.f42146g.clone();
        for (int i10 = 0; i10 < this.f42108a; i10++) {
            Object[] objArr = this.f42146g;
            Object obj = objArr[i10];
            if (obj instanceof a) {
                objArr[i10] = ((a) obj).clone();
            }
        }
    }
}
