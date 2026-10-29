package um;

import java.io.IOException;
import xu.b0;
import xu.p0;
import xu.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f32422m = new String[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final xu.f f32423j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f32424k = ":";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32425l;

    public class a implements p0 {
        public a() {
        }

        @Override // xu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (p.this.r() != 9) {
                throw new AssertionError();
            }
            p pVar = p.this;
            int i10 = pVar.f32446a;
            pVar.f32446a = i10 - 1;
            int[] iArr = pVar.f32448d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // xu.p0, java.io.Flushable
        public void flush() {
            p.this.f32423j.flush();
        }

        @Override // xu.p0
        /* JADX INFO: renamed from: timeout */
        public s0 getTimeout() {
            return s0.NONE;
        }

        @Override // xu.p0
        public void write(xu.e eVar, long j10) {
            p.this.f32423j.write(eVar, j10);
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f32422m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f32422m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public p(xu.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f32423j = fVar;
        u(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void i0(xu.f fVar, String str) {
        String str2;
        String[] strArr = f32422m;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.K0(str, i10, i11);
                    }
                    fVar.C0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.K0(str, i10, i11);
                }
                fVar.C0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.K0(str, i10, length);
        }
        fVar.writeByte(34);
    }

    @Override // um.t
    public t F(double d10) {
        if (!this.f32450f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f32452h) {
            this.f32452h = false;
            return n(Double.toString(d10));
        }
        l0();
        a0();
        this.f32423j.C0(Double.toString(d10));
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
        l0();
        a0();
        this.f32423j.C0(Long.toString(j10));
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t I(Boolean bool) {
        return bool == null ? o() : U(bool.booleanValue());
    }

    @Override // um.t
    public t L(Number number) {
        if (number == null) {
            return o();
        }
        String string = number.toString();
        if (!this.f32450f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f32452h) {
            this.f32452h = false;
            return n(string);
        }
        l0();
        a0();
        this.f32423j.C0(string);
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public t M(String str) {
        if (str == null) {
            return o();
        }
        if (this.f32452h) {
            this.f32452h = false;
            return n(str);
        }
        l0();
        a0();
        i0(this.f32423j, str);
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
        l0();
        a0();
        this.f32423j.C0(z10 ? "true" : "false");
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
        l0();
        a0();
        u(9);
        return b0.b(new a());
    }

    public final void Z() {
        int iR = r();
        if (iR == 5) {
            this.f32423j.writeByte(44);
        } else if (iR != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        e0();
        v(4);
    }

    @Override // um.t
    public t a() {
        if (!this.f32452h) {
            l0();
            return f0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    public final void a0() {
        int iR = r();
        int i10 = 2;
        if (iR == 1) {
            e0();
        } else if (iR == 2) {
            this.f32423j.writeByte(44);
            e0();
        } else if (iR == 4) {
            this.f32423j.C0(this.f32424k);
            i10 = 5;
        } else {
            if (iR == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i10 = 7;
            if (iR != 6) {
                if (iR != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f32450f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        v(i10);
    }

    public final t b0(int i10, int i11, char c10) {
        int iR = r();
        if (iR != i11 && iR != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32425l != null) {
            throw new IllegalStateException("Dangling name: " + this.f32425l);
        }
        int i12 = this.f32446a;
        int i13 = this.f32453i;
        if (i12 == (~i13)) {
            this.f32453i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f32446a = i14;
        this.f32447c[i14] = null;
        int[] iArr = this.f32448d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iR == i11) {
            e0();
        }
        this.f32423j.writeByte(c10);
        return this;
    }

    @Override // um.t
    public t c() {
        if (!this.f32452h) {
            l0();
            return f0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32423j.close();
        int i10 = this.f32446a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32446a = 0;
    }

    @Override // um.t
    public t e() {
        return b0(1, 2, ']');
    }

    public final void e0() {
        if (this.f32449e == null) {
            return;
        }
        this.f32423j.writeByte(10);
        int i10 = this.f32446a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f32423j.C0(this.f32449e);
        }
    }

    public final t f0(int i10, int i11, char c10) {
        int i12 = this.f32446a;
        int i13 = this.f32453i;
        if (i12 == i13) {
            int[] iArr = this.b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f32453i = ~i13;
                return this;
            }
        }
        a0();
        d();
        u(i10);
        this.f32448d[this.f32446a - 1] = 0;
        this.f32423j.writeByte(c10);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f32446a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f32423j.flush();
    }

    @Override // um.t
    public t g() {
        this.f32452h = false;
        return b0(3, 5, '}');
    }

    public final void l0() {
        if (this.f32425l != null) {
            Z();
            i0(this.f32423j, this.f32425l);
            this.f32425l = null;
        }
    }

    @Override // um.t
    public t n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f32446a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iR = r();
        if ((iR != 3 && iR != 5) || this.f32425l != null || this.f32452h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f32425l = str;
        this.f32447c[this.f32446a - 1] = str;
        return this;
    }

    @Override // um.t
    public t o() {
        if (this.f32452h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f32425l != null) {
            if (!this.f32451g) {
                this.f32425l = null;
                return this;
            }
            l0();
        }
        a0();
        this.f32423j.C0("null");
        int[] iArr = this.f32448d;
        int i10 = this.f32446a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // um.t
    public void w(String str) {
        super.w(str);
        this.f32424k = !str.isEmpty() ? ": " : ":";
    }
}
