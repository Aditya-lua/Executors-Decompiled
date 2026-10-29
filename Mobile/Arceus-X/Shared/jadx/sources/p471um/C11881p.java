package p471um;

import java.io.IOException;
import p560xu.C12919b0;
import p560xu.C12924e;
import p560xu.C12953s0;
import p560xu.InterfaceC12926f;
import p560xu.InterfaceC12947p0;

/* JADX INFO: renamed from: um.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C11881p extends AbstractC11885t {

    /* JADX INFO: renamed from: m */
    public static final String[] f42140m = new String[128];

    /* JADX INFO: renamed from: j */
    public final InterfaceC12926f f42141j;

    /* JADX INFO: renamed from: k */
    public String f42142k = ":";

    /* JADX INFO: renamed from: l */
    public String f42143l;

    /* JADX INFO: renamed from: um.p$a */
    public class a implements InterfaceC12947p0 {
        public a() {
        }

        @Override // p560xu.InterfaceC12947p0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (C11881p.this.m44403r() != 9) {
                throw new AssertionError();
            }
            C11881p c11881p = C11881p.this;
            int i10 = c11881p.f42167a;
            c11881p.f42167a = i10 - 1;
            int[] iArr = c11881p.f42170d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // p560xu.InterfaceC12947p0, java.io.Flushable
        public void flush() {
            C11881p.this.f42141j.flush();
        }

        @Override // p560xu.InterfaceC12947p0
        /* JADX INFO: renamed from: timeout */
        public C12953s0 getTimeout() {
            return C12953s0.NONE;
        }

        @Override // p560xu.InterfaceC12947p0
        public void write(C12924e c12924e, long j10) {
            C11881p.this.f42141j.write(c12924e, j10);
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f42140m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f42140m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public C11881p(InterfaceC12926f interfaceC12926f) {
        if (interfaceC12926f == null) {
            throw new NullPointerException("sink == null");
        }
        this.f42141j = interfaceC12926f;
        m44405u(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    /* JADX INFO: renamed from: i0 */
    public static void m44362i0(InterfaceC12926f interfaceC12926f, String str) {
        String str2;
        String[] strArr = f42140m;
        interfaceC12926f.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        interfaceC12926f.mo48001K0(str, i10, i11);
                    }
                    interfaceC12926f.mo47992C0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    interfaceC12926f.mo48001K0(str, i10, i11);
                }
                interfaceC12926f.mo47992C0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            interfaceC12926f.mo48001K0(str, i10, length);
        }
        interfaceC12926f.writeByte(34);
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: F */
    public AbstractC11885t mo44363F(double d10) {
        if (!this.f42172f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(Double.toString(d10));
        }
        m44379l0();
        m44372a0();
        this.f42141j.mo47992C0(Double.toString(d10));
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
        m44379l0();
        m44372a0();
        this.f42141j.mo47992C0(Long.toString(j10));
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: I */
    public AbstractC11885t mo44365I(Boolean bool) {
        return bool == null ? mo44381o() : mo44368U(bool.booleanValue());
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: L */
    public AbstractC11885t mo44366L(Number number) {
        if (number == null) {
            return mo44381o();
        }
        String string = number.toString();
        if (!this.f42172f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(string);
        }
        m44379l0();
        m44372a0();
        this.f42141j.mo47992C0(string);
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: M */
    public AbstractC11885t mo44367M(String str) {
        if (str == null) {
            return mo44381o();
        }
        if (this.f42174h) {
            this.f42174h = false;
            return mo44380n(str);
        }
        m44379l0();
        m44372a0();
        m44362i0(this.f42141j, str);
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
        m44379l0();
        m44372a0();
        this.f42141j.mo47992C0(z10 ? "true" : "false");
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
        m44379l0();
        m44372a0();
        m44405u(9);
        return C12919b0.m47960b(new a());
    }

    /* JADX INFO: renamed from: Z */
    public final void m44370Z() {
        int iM44403r = m44403r();
        if (iM44403r == 5) {
            this.f42141j.writeByte(44);
        } else if (iM44403r != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        m44376e0();
        m44406v(4);
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: a */
    public AbstractC11885t mo44371a() {
        if (!this.f42174h) {
            m44379l0();
            return m44377f0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + getPath());
    }

    /* JADX INFO: renamed from: a0 */
    public final void m44372a0() {
        int iM44403r = m44403r();
        int i10 = 2;
        if (iM44403r == 1) {
            m44376e0();
        } else if (iM44403r == 2) {
            this.f42141j.writeByte(44);
            m44376e0();
        } else if (iM44403r == 4) {
            this.f42141j.mo47992C0(this.f42142k);
            i10 = 5;
        } else {
            if (iM44403r == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i10 = 7;
            if (iM44403r != 6) {
                if (iM44403r != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f42172f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        m44406v(i10);
    }

    /* JADX INFO: renamed from: b0 */
    public final AbstractC11885t m44373b0(int i10, int i11, char c10) {
        int iM44403r = m44403r();
        if (iM44403r != i11 && iM44403r != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f42143l != null) {
            throw new IllegalStateException("Dangling name: " + this.f42143l);
        }
        int i12 = this.f42167a;
        int i13 = this.f42175i;
        if (i12 == (~i13)) {
            this.f42175i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f42167a = i14;
        this.f42169c[i14] = null;
        int[] iArr = this.f42170d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iM44403r == i11) {
            m44376e0();
        }
        this.f42141j.writeByte(c10);
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: c */
    public AbstractC11885t mo44374c() {
        if (!this.f42174h) {
            m44379l0();
            return m44377f0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + getPath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f42141j.close();
        int i10 = this.f42167a;
        if (i10 > 1 || (i10 == 1 && this.f42168b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f42167a = 0;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: e */
    public AbstractC11885t mo44375e() {
        return m44373b0(1, 2, ']');
    }

    /* JADX INFO: renamed from: e0 */
    public final void m44376e0() {
        if (this.f42171e == null) {
            return;
        }
        this.f42141j.writeByte(10);
        int i10 = this.f42167a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f42141j.mo47992C0(this.f42171e);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final AbstractC11885t m44377f0(int i10, int i11, char c10) {
        int i12 = this.f42167a;
        int i13 = this.f42175i;
        if (i12 == i13) {
            int[] iArr = this.f42168b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f42175i = ~i13;
                return this;
            }
        }
        m44372a0();
        m44397d();
        m44405u(i10);
        this.f42170d[this.f42167a - 1] = 0;
        this.f42141j.writeByte(c10);
        return this;
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f42167a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f42141j.flush();
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: g */
    public AbstractC11885t mo44378g() {
        this.f42174h = false;
        return m44373b0(3, 5, '}');
    }

    /* JADX INFO: renamed from: l0 */
    public final void m44379l0() {
        if (this.f42143l != null) {
            m44370Z();
            m44362i0(this.f42141j, this.f42143l);
            this.f42143l = null;
        }
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
        int iM44403r = m44403r();
        if ((iM44403r != 3 && iM44403r != 5) || this.f42143l != null || this.f42174h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f42143l = str;
        this.f42169c[this.f42167a - 1] = str;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: o */
    public AbstractC11885t mo44381o() {
        if (this.f42174h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + getPath());
        }
        if (this.f42143l != null) {
            if (!this.f42173g) {
                this.f42143l = null;
                return this;
            }
            m44379l0();
        }
        m44372a0();
        this.f42141j.mo47992C0("null");
        int[] iArr = this.f42170d;
        int i10 = this.f42167a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // p471um.AbstractC11885t
    /* JADX INFO: renamed from: w */
    public void mo44382w(String str) {
        super.mo44382w(str);
        this.f42142k = !str.isEmpty() ? ": " : ":";
    }
}
