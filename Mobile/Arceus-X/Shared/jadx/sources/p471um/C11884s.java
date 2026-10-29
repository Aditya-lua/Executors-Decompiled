package p471um;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p560xu.AbstractC12944o;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12947p0;

/* JADX INFO: renamed from: um.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C11884s extends AbstractC11885t {

    /* JADX INFO: renamed from: j */
    public Object[] f42163j = new Object[32];

    /* JADX INFO: renamed from: k */
    public String f42164k;

    /* JADX INFO: renamed from: um.s$a */
    public class a extends AbstractC12944o {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12924e f42165a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC12947p0 interfaceC12947p0, C12924e c12924e) {
            super(interfaceC12947p0);
            this.f42165a = c12924e;
        }

        @Override // p560xu.AbstractC12944o, p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C11884s.this.m44403r() == 9) {
                C11884s c11884s = C11884s.this;
                Object[] objArr = c11884s.f42163j;
                int i10 = c11884s.f42167a;
                if (objArr[i10] == null) {
                    c11884s.f42167a = i10 - 1;
                    Object objM44315B = AbstractC11878m.m44314s(this.f42165a).m44315B();
                    C11884s c11884s2 = C11884s.this;
                    boolean z10 = c11884s2.f42173g;
                    c11884s2.f42173g = true;
                    try {
                        c11884s2.m44391Z(objM44315B);
                        C11884s c11884s3 = C11884s.this;
                        c11884s3.f42173g = z10;
                        int[] iArr = c11884s3.f42170d;
                        int i11 = c11884s3.f42167a - 1;
                        iArr[i11] = iArr[i11] + 1;
                        return;
                    } catch (Throwable th2) {
                        C11884s.this.f42173g = z10;
                        throw th2;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public C11884s() {
        m44405u(6);
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: F */
    public AbstractC11885t mo44363F(double d10) {
        if (!this.f42172f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(Double.toString(d10));
        }
        m44391Z(Double.valueOf(d10));
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: H */
    public AbstractC11885t mo44364H(long j10) {
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(Long.toString(j10));
        }
        m44391Z(Long.valueOf(j10));
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: I */
    public AbstractC11885t mo44365I(Boolean bool) {
        if (this.f42174h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        m44391Z(bool);
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: L */
    public AbstractC11885t mo44366L(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return mo44364H(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return mo44363F(number.doubleValue());
        }
        if (number == null) {
            return mo44381o();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(bigDecimal.toString());
        }
        m44391Z(bigDecimal);
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: M */
    public AbstractC11885t mo44367M(String str) {
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(str);
        }
        m44391Z(str);
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: U */
    public AbstractC11885t mo44368U(boolean z10) {
        if (this.f42174h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        m44391Z(Boolean.valueOf(z10));
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: X */
    public InterfaceC12926f mo44369X() {
        if (this.f42174h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        if (m44403r() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        m44405u(9);
        C12924e c12924e = new C12924e();
        return C12919b0.m47960b(new a(c12924e, c12924e));
    }

    /* JADX INFO: renamed from: Z */
    public final C11884s m44391Z(Object obj) {
        String str;
        Object objPut;
        int iM44403r = m44403r();
        int i10 = this.f42167a;
        if (i10 == 1) {
            if (iM44403r != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.f42168b[i10 - 1] = 7;
            this.f42163j[i10 - 1] = obj;
            return this;
        }
        if (iM44403r != 3 || (str = this.f42164k) == null) {
            if (iM44403r == 1) {
                ((List) this.f42163j[i10 - 1]).add(obj);
                return this;
            }
            if (iM44403r == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f42173g) || (objPut = ((Map) this.f42163j[i10 - 1]).put(str, obj)) == null) {
            this.f42164k = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f42164k + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: a */
    public AbstractC11885t mo44371a() {
        if (this.f42174h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f42167a;
        int i11 = this.f42175i;
        if (i10 == i11 && this.f42168b[i10 - 1] == 1) {
            this.f42175i = ~i11;
            return this;
        }
        m44397d();
        ArrayList arrayList = new ArrayList();
        m44391Z(arrayList);
        Object[] objArr = this.f42163j;
        int i12 = this.f42167a;
        objArr[i12] = arrayList;
        this.f42170d[i12] = 0;
        m44405u(1);
        return this;
    }

    /* JADX INFO: renamed from: a0 */
    public Object m44392a0() {
        int i10 = this.f42167a;
        if (i10 > 1 || (i10 == 1 && this.f42168b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f42163j[0];
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: c */
    public AbstractC11885t mo44374c() {
        if (this.f42174h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f42167a;
        int i11 = this.f42175i;
        if (i10 == i11 && this.f42168b[i10 - 1] == 3) {
            this.f42175i = ~i11;
            return this;
        }
        m44397d();
        C11886u c11886u = new C11886u();
        m44391Z(c11886u);
        this.f42163j[this.f42167a] = c11886u;
        m44405u(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f42167a;
        if (i10 > 1 || (i10 == 1 && this.f42168b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f42167a = 0;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: e */
    public AbstractC11885t mo44375e() {
        if (m44403r() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f42167a;
        int i11 = this.f42175i;
        if (i10 == (~i11)) {
            this.f42175i = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f42167a = i12;
        this.f42163j[i12] = null;
        int[] iArr = this.f42170d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f42167a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: g */
    public AbstractC11885t mo44378g() {
        if (m44403r() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f42164k != null) {
            throw new IllegalStateException("Dangling name: " + this.f42164k);
        }
        int i10 = this.f42167a;
        int i11 = this.f42175i;
        if (i10 == (~i11)) {
            this.f42175i = ~i11;
            return this;
        }
        this.f42174h = false;
        int i12 = i10 - 1;
        this.f42167a = i12;
        this.f42163j[i12] = null;
        this.f42169c[i12] = null;
        int[] iArr = this.f42170d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: n */
    public AbstractC11885t mo44380n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f42167a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (m44403r() != 3 || this.f42164k != null || this.f42174h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f42164k = str;
        this.f42169c[this.f42167a - 1] = str;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: o */
    public AbstractC11885t mo44381o() {
        if (this.f42174h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        m44391Z(null);
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
