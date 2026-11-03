package sm;

import java.io.IOException;
import vu.b0;
import vu.p0;
import vu.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f31612m = new String[128];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final vu.f f31613j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f31614k = ":";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f31615l;

    public class a implements p0 {
        public a() {
        }

        @Override // vu.p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (p.this.r() != 9) {
                throw new AssertionError();
            }
            p pVar = p.this;
            int i10 = pVar.f31636a;
            pVar.f31636a = i10 - 1;
            int[] iArr = pVar.f31638d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // vu.p0, java.io.Flushable
        public void flush() {
            p.this.f31613j.flush();
        }

        @Override // vu.p0
        /* JADX INFO: renamed from: timeout */
        public s0 getTimeout() {
            return s0.NONE;
        }

        @Override // vu.p0
        public void write(vu.e eVar, long j10) {
            p.this.f31613j.write(eVar, j10);
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f31612m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f31612m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public p(vu.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f31613j = fVar;
        u(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void f0(vu.f fVar, String str) {
        String str2;
        String[] strArr = f31612m;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.G0(str, i10, i11);
                    }
                    fVar.y0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.G0(str, i10, i11);
                }
                fVar.y0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.G0(str, i10, length);
        }
        fVar.writeByte(34);
    }

    @Override // sm.t
    public t F(double d10) {
        if (!this.f31640f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f31642h) {
            this.f31642h = false;
            return n(Double.toString(d10));
        }
        i0();
        Z();
        this.f31613j.y0(Double.toString(d10));
        int[] iArr = this.f31638d;
        int i10 = this.f31636a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t H(long j10) {
        if (this.f31642h) {
            this.f31642h = false;
            return n(Long.toString(j10));
        }
        i0();
        Z();
        this.f31613j.y0(Long.toString(j10));
        int[] iArr = this.f31638d;
        int i10 = this.f31636a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t I(Boolean bool) {
        return bool == null ? o() : U(bool.booleanValue());
    }

    @Override // sm.t
    public t L(Number number) {
        if (number == null) {
            return o();
        }
        String string = number.toString();
        if (!this.f31640f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f31642h) {
            this.f31642h = false;
            return n(string);
        }
        i0();
        Z();
        this.f31613j.y0(string);
        int[] iArr = this.f31638d;
        int i10 = this.f31636a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t M(String str) {
        if (str == null) {
            return o();
        }
        if (this.f31642h) {
            this.f31642h = false;
            return n(str);
        }
        i0();
        Z();
        f0(this.f31613j, str);
        int[] iArr = this.f31638d;
        int i10 = this.f31636a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public t U(boolean z10) {
        if (this.f31642h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + getPath());
        }
        i0();
        Z();
        this.f31613j.y0(z10 ? "true" : "false");
        int[] iArr = this.f31638d;
        int i10 = this.f31636a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public vu.f W() {
        if (this.f31642h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + getPath());
        }
        i0();
        Z();
        u(9);
        return b0.b(new a());
    }

    public final void Y() {
        int iR = r();
        if (iR == 5) {
            this.f31613j.writeByte(44);
        } else if (iR != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        c0();
        v(4);
    }

    public final void Z() {
        int iR = r();
        int i10 = 2;
        if (iR == 1) {
            c0();
        } else if (iR == 2) {
            this.f31613j.writeByte(44);
            c0();
        } else if (iR == 4) {
            this.f31613j.y0(this.f31614k);
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
                if (!this.f31640f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        v(i10);
    }

    @Override // sm.t
    public t a() {
        if (!this.f31642h) {
            i0();
            return d0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    public final t a0(int i10, int i11, char c10) {
        int iR = r();
        if (iR != i11 && iR != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f31615l != null) {
            throw new IllegalStateException("Dangling name: " + this.f31615l);
        }
        int i12 = this.f31636a;
        int i13 = this.f31643i;
        if (i12 == (~i13)) {
            this.f31643i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f31636a = i14;
        this.f31637c[i14] = null;
        int[] iArr = this.f31638d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iR == i11) {
            c0();
        }
        this.f31613j.writeByte(c10);
        return this;
    }

    @Override // sm.t
    public t c() {
        if (!this.f31642h) {
            i0();
            return d0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    public final void c0() {
        if (this.f31639e == null) {
            return;
        }
        this.f31613j.writeByte(10);
        int i10 = this.f31636a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f31613j.y0(this.f31639e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f31613j.close();
        int i10 = this.f31636a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f31636a = 0;
    }

    public final t d0(int i10, int i11, char c10) {
        int i12 = this.f31636a;
        int i13 = this.f31643i;
        if (i12 == i13) {
            int[] iArr = this.b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f31643i = ~i13;
                return this;
            }
        }
        Z();
        d();
        u(i10);
        this.f31638d[this.f31636a - 1] = 0;
        this.f31613j.writeByte(c10);
        return this;
    }

    @Override // sm.t
    public t e() {
        return a0(1, 2, ']');
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f31636a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f31613j.flush();
    }

    @Override // sm.t
    public t g() {
        this.f31642h = false;
        return a0(3, 5, '}');
    }

    public final void i0() {
        if (this.f31615l != null) {
            Y();
            f0(this.f31613j, this.f31615l);
            this.f31615l = null;
        }
    }

    @Override // sm.t
    public t n(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f31636a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iR = r();
        if ((iR != 3 && iR != 5) || this.f31615l != null || this.f31642h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f31615l = str;
        this.f31637c[this.f31636a - 1] = str;
        return this;
    }

    @Override // sm.t
    public t o() {
        if (this.f31642h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f31615l != null) {
            if (!this.f31641g) {
                this.f31615l = null;
                return this;
            }
            i0();
        }
        Z();
        this.f31613j.y0("null");
        int[] iArr = this.f31638d;
        int i10 = this.f31636a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // sm.t
    public void w(String str) {
        super.w(str);
        this.f31614k = !str.isEmpty() ? ": " : ":";
    }
}
