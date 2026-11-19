package tg;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import lg.e;
import lg.x;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f32413l = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f32414m = new String[Barcode.FORMAT_ITF];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String[] f32415n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Writer f32416a;
    public int[] b = new int[32];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32417c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f32418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f32420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public x f32422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f32423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f32424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f32425k;

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            f32414m[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = f32414m;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f32415n = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        y(6);
        this.f32422h = x.LEGACY_STRICT;
        this.f32425k = true;
        Objects.requireNonNull(writer, "out == null");
        this.f32416a = writer;
        A(e.f22086d);
    }

    public static boolean a(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    public final void A(e eVar) {
        Objects.requireNonNull(eVar);
        this.f32418d = eVar;
        this.f32420f = ",";
        if (eVar.c()) {
            this.f32419e = ": ";
            if (this.f32418d.b().isEmpty()) {
                this.f32420f = ", ";
            }
        } else {
            this.f32419e = ":";
        }
        this.f32421g = this.f32418d.b().isEmpty() && this.f32418d.a().isEmpty();
    }

    public final void E(boolean z10) {
        this.f32423i = z10;
    }

    public final void I(boolean z10) {
        this.f32425k = z10;
    }

    public final void K(x xVar) {
        Objects.requireNonNull(xVar);
        this.f32422h = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    public final void L(String str) throws IOException {
        String str2;
        String[] strArr = this.f32423i ? f32415n : f32414m;
        this.f32416a.write(34);
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        this.f32416a.write(str, i10, i11 - i10);
                    }
                    this.f32416a.write(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    this.f32416a.write(str, i10, i11 - i10);
                }
                this.f32416a.write(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            this.f32416a.write(str, i10, length - i10);
        }
        this.f32416a.write(34);
    }

    public c N(double d10) throws IOException {
        c0();
        if (this.f32422h == x.LENIENT || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            c();
            this.f32416a.append((CharSequence) Double.toString(d10));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d10);
    }

    public c O(long j10) throws IOException {
        c0();
        c();
        this.f32416a.write(Long.toString(j10));
        return this;
    }

    public c Q(Boolean bool) throws IOException {
        if (bool == null) {
            return s();
        }
        c0();
        c();
        this.f32416a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c T(Number number) throws IOException {
        if (number == null) {
            return s();
        }
        c0();
        String string = number.toString();
        Class<?> cls = number.getClass();
        if (!a(cls)) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (this.f32422h != x.LENIENT) {
                    throw new IllegalArgumentException("Numeric values must be finite, but was " + string);
                }
            } else if (cls != Float.class && cls != Double.class && !f32413l.matcher(string).matches()) {
                throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + string);
            }
        }
        c();
        this.f32416a.append((CharSequence) string);
        return this;
    }

    public c Y(String str) throws IOException {
        if (str == null) {
            return s();
        }
        c0();
        c();
        L(str);
        return this;
    }

    public final void b() throws IOException {
        int iW = w();
        if (iW == 5) {
            this.f32416a.write(this.f32420f);
        } else if (iW != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        r();
        z(4);
    }

    public c b0(boolean z10) throws IOException {
        c0();
        c();
        this.f32416a.write(z10 ? "true" : "false");
        return this;
    }

    public final void c() throws IOException {
        int iW = w();
        if (iW == 1) {
            z(2);
            r();
            return;
        }
        if (iW == 2) {
            this.f32416a.append((CharSequence) this.f32420f);
            r();
        } else {
            if (iW == 4) {
                this.f32416a.append((CharSequence) this.f32419e);
                z(5);
                return;
            }
            if (iW != 6) {
                if (iW != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f32422h != x.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            z(7);
        }
    }

    public final void c0() throws IOException {
        if (this.f32424j != null) {
            b();
            L(this.f32424j);
            this.f32424j = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32416a.close();
        int i10 = this.f32417c;
        if (i10 > 1 || (i10 == 1 && this.b[i10 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f32417c = 0;
    }

    public c d() throws IOException {
        c0();
        return u(1, '[');
    }

    public c e() throws IOException {
        c0();
        return u(3, '{');
    }

    public final c f(int i10, int i11, char c10) throws IOException {
        int iW = w();
        if (iW != i11 && iW != i10) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f32424j != null) {
            throw new IllegalStateException("Dangling name: " + this.f32424j);
        }
        this.f32417c--;
        if (iW == i11) {
            r();
        }
        this.f32416a.write(c10);
        return this;
    }

    public void flush() throws IOException {
        if (this.f32417c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f32416a.flush();
    }

    public c g() {
        return f(1, 2, ']');
    }

    public c h() {
        return f(3, 5, '}');
    }

    public final boolean k() {
        return this.f32425k;
    }

    public final x m() {
        return this.f32422h;
    }

    public final boolean n() {
        return this.f32423i;
    }

    public boolean o() {
        return this.f32422h == x.LENIENT;
    }

    public c p(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f32424j != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int iW = w();
        if (iW != 3 && iW != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.f32424j = str;
        return this;
    }

    public final void r() throws IOException {
        if (this.f32421g) {
            return;
        }
        this.f32416a.write(this.f32418d.b());
        int i10 = this.f32417c;
        for (int i11 = 1; i11 < i10; i11++) {
            this.f32416a.write(this.f32418d.a());
        }
    }

    public c s() throws IOException {
        if (this.f32424j != null) {
            if (!this.f32425k) {
                this.f32424j = null;
                return this;
            }
            c0();
        }
        c();
        this.f32416a.write("null");
        return this;
    }

    public final c u(int i10, char c10) throws IOException {
        c();
        y(i10);
        this.f32416a.write(c10);
        return this;
    }

    public final int w() {
        int i10 = this.f32417c;
        if (i10 != 0) {
            return this.b[i10 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final void y(int i10) {
        int i11 = this.f32417c;
        int[] iArr = this.b;
        if (i11 == iArr.length) {
            this.b = Arrays.copyOf(iArr, i11 * 2);
        }
        int[] iArr2 = this.b;
        int i12 = this.f32417c;
        this.f32417c = i12 + 1;
        iArr2[i12] = i10;
    }

    public final void z(int i10) {
        this.b[this.f32417c - 1] = i10;
    }
}
