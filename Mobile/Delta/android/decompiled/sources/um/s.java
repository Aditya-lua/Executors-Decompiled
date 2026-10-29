package um;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import xu.b0;
import xu.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class s extends t {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object[] f32443j = new Object[32];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f32444k;

    public class a extends xu.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xu.e f32445a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p0 p0Var, xu.e eVar) {
            super(p0Var);
            this.f32445a = eVar;
        }

        @Override // xu.o, xu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (s.this.r() == 9) {
                s sVar = s.this;
                Object[] objArr = sVar.f32443j;
                int i10 = sVar.f32446a;
                if (objArr[i10] == null) {
                    sVar.f32446a = i10 - 1;
                    Object objB = m.s(this.f32445a).B();
                    s sVar2 = s.this;
                    boolean z10 = sVar2.f32451g;
                    sVar2.f32451g = true;
                    try {
                        sVar2.Z(objB);
                        s sVar3 = s.this;
                        sVar3.f32451g = z10;
                        int[] iArr = sVar3.f32448d;
                        int i11 = sVar3.f32446a - 1;
                        iArr[i11] = iArr[i11] + 1;
                        return;
                    } catch (Throwable th2) {
                        s.this.f32451g = z10;
                        throw th2;
                    }
                }
            }
            throw new AssertionError();
        }
    }

    public s() {
        u(6);
    }

    @Override // um.t
    public t F(double d10) {
        if (!this.f32450f && (Double.isNaN(d10) || d10 == Double.NEGATIVE_INFINITY || d10 == Double.POSITIVE_INFINITY)) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f32452h) {
            this.f32452h = false;
            return n(Double.toString(d10));
        }
        Z(Double.valueOf(d10));
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t H(long j10) {
        if (this.f32452h) {
            this.f32452h = false;
            return n(Long.toString(j10));
        }
        Z(Long.valueOf(j10));
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t I(Boolean bool) {
        if (this.f32452h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        Z(bool);
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t L(Number number) {
        if ((number instanceof Byte) || (number instanceof Short) || (number instanceof Integer) || (number instanceof Long)) {
            return H(number.longValue());
        }
        if ((number instanceof Float) || (number instanceof Double)) {
            return F(number.doubleValue());
        }
        if (number == null) {
            return o();
        }
        BigDecimal bigDecimal = number instanceof BigDecimal ? (BigDecimal) number : new BigDecimal(number.toString());
        if (this.f32452h) {
            this.f32452h = false;
            return n(bigDecimal.toString());
        }
        Z(bigDecimal);
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t M(String str) {
        if (this.f32452h) {
            this.f32452h = false;
            return n(str);
        }
        Z(str);
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t U(boolean z10) {
        if (this.f32452h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        Z(Boolean.valueOf(z10));
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public xu.f X() {
        if (this.f32452h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        if (r() == 9) {
            throw new IllegalStateException("Sink from valueSink() was not closed");
        }
        u(9);
        xu.e eVar = new xu.e();
        return b0.b(new a(eVar, eVar));
    }

    public final s Z(Object obj) {
        String str;
        Object objPut;
        int iR = r();
        int i10 = this.f32446a;
        if (i10 == 1) {
            if (iR != 6) {
                throw new IllegalStateException("JSON must have only one top-level value.");
            }
            this.b[i10 - 1] = 7;
            this.f32443j[i10 - 1] = obj;
            return this;
        }
        if (iR != 3 || (str = this.f32444k) == null) {
            if (iR == 1) {
                ((List) this.f32443j[i10 - 1]).add(obj);
                return this;
            }
            if (iR == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            throw new IllegalStateException("Nesting problem.");
        }
        if ((obj == null && !this.f32451g) || (objPut = ((Map) this.f32443j[i10 - 1]).put(str, obj)) == null) {
            this.f32444k = null;
            return this;
        }
        throw new IllegalArgumentException("Map key '" + this.f32444k + "' has multiple values at path " + getPath() + ": " + objPut + " and " + obj);
    }

    @Override // um.t
    public t a() {
        if (this.f32452h) {
            throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f32446a;
        int i11 = this.f32453i;
        if (i10 == i11 && this.b[i10 - 1] == 1) {
            this.f32453i = ~i11;
            return this;
        }
        d();
        ArrayList arrayList = new ArrayList();
        Z(arrayList);
        Object[] objArr = this.f32443j;
        int i12 = this.f32446a;
        objArr[i12] = arrayList;
        this.f32448d[i12] = 0;
        u(1);
        return this;
    }

    public Object a0() {
        int i10 = this.f32446a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IllegalStateException("Incomplete document");
        }
        return this.f32443j[0];
    }

    @Override // um.t
    public t c() {
        if (this.f32452h) {
            throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
        }
        int i10 = this.f32446a;
        int i11 = this.f32453i;
        if (i10 == i11 && this.b[i10 - 1] == 3) {
            this.f32453i = ~i11;
            return this;
        }
        d();
        u uVar = new u();
        Z(uVar);
        this.f32443j[this.f32446a] = uVar;
        u(3);
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        int i10 = this.f32446a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32446a = 0;
    }

    @Override // um.t
    public t e() {
        if (r() != 1) {
            throw new IllegalStateException("Nesting problem.");
        }
        int i10 = this.f32446a;
        int i11 = this.f32453i;
        if (i10 == (~i11)) {
            this.f32453i = ~i11;
            return this;
        }
        int i12 = i10 - 1;
        this.f32446a = i12;
        this.f32443j[i12] = null;
        int[] iArr = this.f32448d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f32446a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    @Override // um.t
    public t g() {
        if (r() != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32444k != null) {
            throw new IllegalStateException("Dangling name: " + this.f32444k);
        }
        int i10 = this.f32446a;
        int i11 = this.f32453i;
        if (i10 == (~i11)) {
            this.f32453i = ~i11;
            return this;
        }
        this.f32452h = false;
        int i12 = i10 - 1;
        this.f32446a = i12;
        this.f32443j[i12] = null;
        this.f32447c[i12] = null;
        int[] iArr = this.f32448d;
        int i13 = i10 - 2;
        iArr[i13] = iArr[i13] + 1;
        return this;
    }

    @Override // um.t
    public t n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f32446a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        if (r() != 3 || this.f32444k != null || this.f32452h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f32444k = str;
        this.f32447c[this.f32446a - 1] = str;
        return this;
    }

    @Override // um.t
    public t o() {
        if (this.f32452h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        Z(null);
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }
}
