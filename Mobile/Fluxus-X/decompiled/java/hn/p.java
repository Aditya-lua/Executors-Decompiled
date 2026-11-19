package hn;

import com.google.mlkit.vision.barcode.common.Barcode;
import ew.j0;
import ew.m0;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f18367m = new String[Barcode.FORMAT_ITF];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ew.f f18368j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18369k = ":";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18370l;

    public class a implements j0 {
        public a() {
        }

        @Override // ew.j0
        public void R2(ew.e eVar, long j10) {
            p.this.f18368j.R2(eVar, j10);
        }

        @Override // ew.j0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (p.this.s() != 9) {
                throw new AssertionError();
            }
            p pVar = p.this;
            int i10 = pVar.f18391a;
            pVar.f18391a = i10 - 1;
            int[] iArr = pVar.f18393d;
            int i11 = i10 - 2;
            iArr[i11] = iArr[i11] + 1;
        }

        @Override // ew.j0, java.io.Flushable
        public void flush() {
            p.this.f18368j.flush();
        }

        @Override // ew.j0
        /* JADX INFO: renamed from: t */
        public m0 getTimeout() {
            return m0.f14833e;
        }
    }

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f18367m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f18367m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public p(ew.f fVar) {
        if (fVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f18368j = fVar;
        w(6);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    public static void i0(ew.f fVar, String str) {
        String str2;
        String[] strArr = f18367m;
        fVar.writeByte(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        fVar.L0(str, i10, i11);
                    }
                    fVar.D0(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    fVar.L0(str, i10, i11);
                }
                fVar.D0(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            fVar.L0(str, i10, length);
        }
        fVar.writeByte(34);
    }

    @Override // hn.t
    public t I(double d10) {
        if (!this.f18395f && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
        }
        if (this.f18397h) {
            this.f18397h = false;
            return o(Double.toString(d10));
        }
        k0();
        d0();
        this.f18368j.D0(Double.toString(d10));
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t K(long j10) {
        if (this.f18397h) {
            this.f18397h = false;
            return o(Long.toString(j10));
        }
        k0();
        d0();
        this.f18368j.D0(Long.toString(j10));
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t N(Boolean bool) {
        return bool == null ? p() : T(bool.booleanValue());
    }

    @Override // hn.t
    public t O(Number number) {
        if (number == null) {
            return p();
        }
        String string = number.toString();
        if (!this.f18395f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
        }
        if (this.f18397h) {
            this.f18397h = false;
            return o(string);
        }
        k0();
        d0();
        this.f18368j.D0(string);
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t Q(String str) {
        if (str == null) {
            return p();
        }
        if (this.f18397h) {
            this.f18397h = false;
            return o(str);
        }
        k0();
        d0();
        i0(this.f18368j, str);
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public t T(boolean z10) {
        if (this.f18397h) {
            throw new IllegalStateException("Boolean cannot be used as a map key in JSON at path " + x());
        }
        k0();
        d0();
        this.f18368j.D0(z10 ? "true" : "false");
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public ew.f Y() {
        if (this.f18397h) {
            throw new IllegalStateException("BufferedSink cannot be used as a map key in JSON at path " + x());
        }
        k0();
        d0();
        w(9);
        return ew.v.b(new a());
    }

    @Override // hn.t
    public t a() {
        if (!this.f18397h) {
            k0();
            return h0(1, 2, '[');
        }
        throw new IllegalStateException("Array cannot be used as a map key in JSON at path " + x());
    }

    @Override // hn.t
    public t c() {
        if (!this.f18397h) {
            k0();
            return h0(3, 5, '{');
        }
        throw new IllegalStateException("Object cannot be used as a map key in JSON at path " + x());
    }

    public final void c0() {
        int iS = s();
        if (iS == 5) {
            this.f18368j.writeByte(44);
        } else if (iS != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        f0();
        y(4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18368j.close();
        int i10 = this.f18391a;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f18391a = 0;
    }

    public final void d0() {
        int iS = s();
        int i10 = 2;
        if (iS == 1) {
            f0();
        } else if (iS == 2) {
            this.f18368j.writeByte(44);
            f0();
        } else if (iS == 4) {
            this.f18368j.D0(this.f18369k);
            i10 = 5;
        } else {
            if (iS == 9) {
                throw new IllegalStateException("Sink from valueSink() was not closed");
            }
            i10 = 7;
            if (iS != 6) {
                if (iS != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f18395f) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
        }
        y(i10);
    }

    @Override // hn.t
    public t e() {
        return e0(1, 2, ']');
    }

    public final t e0(int i10, int i11, char c10) {
        int iS = s();
        if (iS != i11 && iS != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f18370l != null) {
            throw new IllegalStateException("Dangling name: " + this.f18370l);
        }
        int i12 = this.f18391a;
        int i13 = this.f18398i;
        if (i12 == (~i13)) {
            this.f18398i = ~i13;
            return this;
        }
        int i14 = i12 - 1;
        this.f18391a = i14;
        this.f18392c[i14] = null;
        int[] iArr = this.f18393d;
        int i15 = i12 - 2;
        iArr[i15] = iArr[i15] + 1;
        if (iS == i11) {
            f0();
        }
        this.f18368j.writeByte(c10);
        return this;
    }

    public final void f0() {
        if (this.f18394e == null) {
            return;
        }
        this.f18368j.writeByte(10);
        int i10 = this.f18391a;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f18368j.D0(this.f18394e);
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f18391a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f18368j.flush();
    }

    @Override // hn.t
    public t g() {
        this.f18397h = false;
        return e0(3, 5, '}');
    }

    public final t h0(int i10, int i11, char c10) {
        int i12 = this.f18391a;
        int i13 = this.f18398i;
        if (i12 == i13) {
            int[] iArr = this.b;
            if (iArr[i12 - 1] == i10 || iArr[i12 - 1] == i11) {
                this.f18398i = ~i13;
                return this;
            }
        }
        d0();
        d();
        w(i10);
        this.f18393d[this.f18391a - 1] = 0;
        this.f18368j.writeByte(c10);
        return this;
    }

    public final void k0() {
        if (this.f18370l != null) {
            c0();
            i0(this.f18368j, this.f18370l);
            this.f18370l = null;
        }
    }

    @Override // hn.t
    public t o(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f18391a == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        int iS = s();
        if ((iS != 3 && iS != 5) || this.f18370l != null || this.f18397h) {
            throw new IllegalStateException("Nesting problem.");
        }
        this.f18370l = str;
        this.f18392c[this.f18391a - 1] = str;
        return this;
    }

    @Override // hn.t
    public t p() {
        if (this.f18397h) {
            throw new IllegalStateException("null cannot be used as a map key in JSON at path " + x());
        }
        if (this.f18370l != null) {
            if (!this.f18396g) {
                this.f18370l = null;
                return this;
            }
            k0();
        }
        d0();
        this.f18368j.D0("null");
        int[] iArr = this.f18393d;
        int i10 = this.f18391a - 1;
        iArr[i10] = iArr[i10] + 1;
        return this;
    }

    @Override // hn.t
    public void z(String str) {
        super.z(str);
        this.f18369k = !str.isEmpty() ? ": " : ":";
    }
}
