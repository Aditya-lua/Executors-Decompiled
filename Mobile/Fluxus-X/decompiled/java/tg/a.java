package tg;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import lg.x;
import ng.i0;
import ng.z;
import og.g;

/* JADX INFO: loaded from: classes2.dex */
public class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Reader f32388a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f32396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f32397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f32398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f32399m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String[] f32401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f32402p;
    public x b = x.LEGACY_STRICT;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f32389c = 255;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final char[] f32390d = new char[Barcode.FORMAT_UPC_E];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f32391e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f32392f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f32393g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f32394h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32395i = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32400n = 1;

    /* JADX INFO: renamed from: tg.a$a, reason: collision with other inner class name */
    public class C0646a extends z {
        @Override // ng.z
        public void a(a aVar) throws IOException {
            if (aVar instanceof g) {
                ((g) aVar).G0();
                return;
            }
            int iF = aVar.f32395i;
            if (iF == 0) {
                iF = aVar.f();
            }
            if (iF == 13) {
                aVar.f32395i = 9;
            } else if (iF == 12) {
                aVar.f32395i = 8;
            } else {
                if (iF != 14) {
                    throw aVar.w0("a name");
                }
                aVar.f32395i = 10;
            }
        }
    }

    static {
        z.f25584a = new C0646a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f32399m = iArr;
        iArr[0] = 6;
        this.f32401o = new String[32];
        this.f32402p = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f32388a = reader;
    }

    private String m(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('$');
        int i10 = 0;
        while (true) {
            int i11 = this.f32400n;
            if (i10 >= i11) {
                return sb2.toString();
            }
            int i12 = this.f32399m[i10];
            switch (i12) {
                case 1:
                case 2:
                    int i13 = this.f32402p[i10];
                    if (z10 && i13 > 0 && i10 == i11 - 1) {
                        i13--;
                    }
                    sb2.append('[');
                    sb2.append(i13);
                    sb2.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb2.append('.');
                    String str = this.f32401o[i10];
                    if (str != null) {
                        sb2.append(str);
                    }
                    break;
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError("Unknown scope value: " + i12);
            }
            i10++;
        }
    }

    public long A() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f32395i = 0;
            int[] iArr = this.f32402p;
            int i10 = this.f32400n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f32396j;
        }
        if (iF == 16) {
            this.f32398l = new String(this.f32390d, this.f32391e, this.f32397k);
            this.f32391e += this.f32397k;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw w0("a long");
            }
            if (iF == 10) {
                this.f32398l = O();
            } else {
                this.f32398l = L(iF == 8 ? '\'' : '\"');
            }
            try {
                long j10 = Long.parseLong(this.f32398l);
                this.f32395i = 0;
                int[] iArr2 = this.f32402p;
                int i11 = this.f32400n - 1;
                iArr2[i11] = iArr2[i11] + 1;
                return j10;
            } catch (NumberFormatException unused) {
            }
        }
        this.f32395i = 11;
        double d10 = Double.parseDouble(this.f32398l);
        long j11 = (long) d10;
        if (j11 != d10) {
            throw new NumberFormatException("Expected a long but was " + this.f32398l + u());
        }
        this.f32398l = null;
        this.f32395i = 0;
        int[] iArr3 = this.f32402p;
        int i12 = this.f32400n - 1;
        iArr3[i12] = iArr3[i12] + 1;
        return j11;
    }

    public String E() throws IOException {
        String strL;
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 14) {
            strL = O();
        } else if (iF == 12) {
            strL = L('\'');
        } else {
            if (iF != 13) {
                throw w0("a name");
            }
            strL = L('\"');
        }
        this.f32395i = 0;
        this.f32401o[this.f32400n - 1] = strL;
        return strL;
    }

    public final int I(boolean z10) throws IOException {
        char[] cArr = this.f32390d;
        int i10 = this.f32391e;
        int i11 = this.f32392f;
        while (true) {
            if (i10 == i11) {
                this.f32391e = i10;
                if (!k(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + u());
                }
                i10 = this.f32391e;
                i11 = this.f32392f;
            }
            int i12 = i10 + 1;
            char c10 = cArr[i10];
            if (c10 == '\n') {
                this.f32393g++;
                this.f32394h = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f32391e = i12;
                    if (i12 == i11) {
                        this.f32391e = i10;
                        boolean zK = k(2);
                        this.f32391e++;
                        if (!zK) {
                        }
                        return c10;
                    }
                    d();
                    int i13 = this.f32391e;
                    char c11 = cArr[i13];
                    if (c11 == '*') {
                        this.f32391e = i13 + 1;
                        if (!h0("*/")) {
                            throw s0("Unterminated comment");
                        }
                        i10 = this.f32391e + 2;
                        i11 = this.f32392f;
                    } else {
                        if (c11 != '/') {
                            return c10;
                        }
                        this.f32391e = i13 + 1;
                        i0();
                        i10 = this.f32391e;
                        i11 = this.f32392f;
                    }
                } else {
                    if (c10 != '#') {
                        this.f32391e = i12;
                        return c10;
                    }
                    this.f32391e = i12;
                    d();
                    i0();
                    i10 = this.f32391e;
                    i11 = this.f32392f;
                }
            }
            i10 = i12;
        }
    }

    public void K() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 7) {
            throw w0("null");
        }
        this.f32395i = 0;
        int[] iArr = this.f32402p;
        int i10 = this.f32400n - 1;
        iArr[i10] = iArr[i10] + 1;
    }

    public final String L(char c10) throws d {
        int i10;
        char[] cArr = this.f32390d;
        StringBuilder sb2 = null;
        do {
            int i11 = this.f32391e;
            int i12 = this.f32392f;
            while (true) {
                int i13 = i12;
                i10 = i11;
                while (true) {
                    if (i11 < i13) {
                        int i14 = i11 + 1;
                        char c11 = cArr[i11];
                        if (this.b == x.STRICT && c11 < ' ') {
                            throw s0("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        }
                        if (c11 == c10) {
                            this.f32391e = i14;
                            int i15 = (i14 - i10) - 1;
                            if (sb2 == null) {
                                return new String(cArr, i10, i15);
                            }
                            sb2.append(cArr, i10, i15);
                            return sb2.toString();
                        }
                        if (c11 == '\\') {
                            this.f32391e = i14;
                            int i16 = i14 - i10;
                            int i17 = i16 - 1;
                            if (sb2 == null) {
                                sb2 = new StringBuilder(Math.max(i16 * 2, 16));
                            }
                            sb2.append(cArr, i10, i17);
                            sb2.append(c0());
                            i11 = this.f32391e;
                            i12 = this.f32392f;
                        } else {
                            if (c11 == '\n') {
                                this.f32393g++;
                                this.f32394h = i14;
                            }
                            i11 = i14;
                        }
                    }
                }
            }
            if (sb2 == null) {
                sb2 = new StringBuilder(Math.max((i11 - i10) * 2, 16));
            }
            sb2.append(cArr, i10, i11 - i10);
            this.f32391e = i11;
        } while (k(1));
        throw s0("Unterminated string");
    }

    public String N() throws IOException {
        String str;
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 10) {
            str = O();
        } else if (iF == 8) {
            str = L('\'');
        } else if (iF == 9) {
            str = L('\"');
        } else if (iF == 11) {
            str = this.f32398l;
            this.f32398l = null;
        } else if (iF == 15) {
            str = Long.toString(this.f32396j);
        } else {
            if (iF != 16) {
                throw w0("a string");
            }
            str = new String(this.f32390d, this.f32391e, this.f32397k);
            this.f32391e += this.f32397k;
        }
        this.f32395i = 0;
        int[] iArr = this.f32402p;
        int i10 = this.f32400n - 1;
        iArr[i10] = iArr[i10] + 1;
        return str;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    public final String O() throws d {
        String string;
        StringBuilder sb2 = null;
        int i10 = 0;
        while (true) {
            int i11 = 0;
            while (true) {
                int i12 = this.f32391e;
                if (i12 + i11 < this.f32392f) {
                    char c10 = this.f32390d[i12 + i11];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i11++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        d();
                    }
                    i10 = i11;
                } else if (i11 >= this.f32390d.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i11, 16));
                    }
                    sb2.append(this.f32390d, this.f32391e, i11);
                    this.f32391e += i11;
                    if (!k(1)) {
                    }
                } else if (!k(i11 + 1)) {
                    i10 = i11;
                }
                if (sb2 == null) {
                    string = new String(this.f32390d, this.f32391e, i10);
                } else {
                    sb2.append(this.f32390d, this.f32391e, i10);
                    string = sb2.toString();
                }
                this.f32391e += i10;
                return string;
            }
        }
    }

    public b Q() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        switch (iF) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int T() {
        String str;
        String str2;
        int i10;
        char c10 = this.f32390d[this.f32391e];
        if (c10 == 't' || c10 == 'T') {
            str = "true";
            str2 = "TRUE";
            i10 = 5;
        } else if (c10 == 'f' || c10 == 'F') {
            str = "false";
            str2 = "FALSE";
            i10 = 6;
        } else {
            if (c10 != 'n' && c10 != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i10 = 7;
        }
        boolean z10 = this.b != x.STRICT;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (this.f32391e + i11 >= this.f32392f && !k(i11 + 1)) {
                return 0;
            }
            char c11 = this.f32390d[this.f32391e + i11];
            if (c11 != str.charAt(i11) && (!z10 || c11 != str2.charAt(i11))) {
                return 0;
            }
        }
        if ((this.f32391e + length < this.f32392f || k(length + 1)) && s(this.f32390d[this.f32391e + length])) {
            return 0;
        }
        this.f32391e += length;
        this.f32395i = i10;
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00da  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e1  */
    public final int Y() {
        char c10;
        int i10;
        char[] cArr = this.f32390d;
        int i11 = this.f32391e;
        int i12 = this.f32392f;
        int i13 = 0;
        int i14 = 0;
        char c11 = 0;
        boolean z10 = false;
        int i15 = 1;
        long j10 = 0;
        while (true) {
            char c12 = 2;
            if (i11 + i14 != i12) {
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E' || c10 == 'e') {
                        if (c11 == 2 && c11 != 4) {
                            return i10;
                        }
                        c11 = 5;
                    } else if (c10 == '-') {
                        c12 = 6;
                        if (c11 == 0) {
                            c11 = 1;
                            z10 = true;
                        } else if (c11 != 5) {
                            return i10;
                        }
                    } else if (c10 != '.') {
                        if (c10 < '0' || c10 > '9') {
                            if (!s(c10)) {
                                break;
                            }
                            return i10;
                        }
                        if (c11 == 1 || c11 == 0) {
                            j10 = -(c10 - '0');
                        } else if (c11 == 2) {
                            if (j10 == 0) {
                                return i10;
                            }
                            long j11 = (10 * j10) - ((long) (c10 - '0'));
                            i15 &= (j10 > -922337203685477580L || (j10 == -922337203685477580L && j11 < j10)) ? 1 : i10;
                            j10 = j11;
                        } else if (c11 == 3) {
                            c11 = 4;
                        } else if (c11 == 5 || c11 == 6) {
                            c11 = 7;
                        }
                    } else {
                        if (c11 != 2) {
                            return i10;
                        }
                        c11 = 3;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            } else {
                if (i14 == cArr.length) {
                    return i13;
                }
                if (!k(i14 + 1)) {
                    i10 = i13;
                    break;
                }
                i11 = this.f32391e;
                i12 = this.f32392f;
                c10 = cArr[i11 + i14];
                i10 = i13;
                if (c10 != '+') {
                    if (c10 != 'E') {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    } else {
                        if (c11 == 2) {
                        }
                        c11 = 5;
                    }
                    i14++;
                    i13 = i10;
                } else {
                    c12 = 6;
                    if (c11 != 5) {
                        return i10;
                    }
                }
                c11 = c12;
                i14++;
                i13 = i10;
            }
        }
        if (c11 == 2 && i15 != 0 && ((j10 != Long.MIN_VALUE || z10) && (j10 != 0 || !z10))) {
            if (!z10) {
                j10 = -j10;
            }
            this.f32396j = j10;
            this.f32391e += i14;
            this.f32395i = 15;
            return 15;
        }
        if (c11 != 2 && c11 != 4 && c11 != 7) {
            return i10;
        }
        this.f32397k = i14;
        this.f32395i = 16;
        return 16;
    }

    public void b() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 3) {
            throw w0("BEGIN_ARRAY");
        }
        b0(1);
        this.f32402p[this.f32400n - 1] = 0;
        this.f32395i = 0;
    }

    public final void b0(int i10) throws d {
        int i11 = this.f32400n;
        if (i11 - 1 >= this.f32389c) {
            throw new d("Nesting limit " + this.f32389c + " reached" + u());
        }
        int[] iArr = this.f32399m;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.f32399m = Arrays.copyOf(iArr, i12);
            this.f32402p = Arrays.copyOf(this.f32402p, i12);
            this.f32401o = (String[]) Arrays.copyOf(this.f32401o, i12);
        }
        int[] iArr2 = this.f32399m;
        int i13 = this.f32400n;
        this.f32400n = i13 + 1;
        iArr2[i13] = i10;
    }

    public void c() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 1) {
            throw w0("BEGIN_OBJECT");
        }
        b0(3);
        this.f32395i = 0;
    }

    public final char c0() throws d {
        int i10;
        if (this.f32391e == this.f32392f && !k(1)) {
            throw s0("Unterminated escape sequence");
        }
        char[] cArr = this.f32390d;
        int i11 = this.f32391e;
        int i12 = i11 + 1;
        this.f32391e = i12;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"') {
                if (c10 != '\'') {
                    if (c10 != '/' && c10 != '\\') {
                        if (c10 == 'b') {
                            return '\b';
                        }
                        if (c10 == 'f') {
                            return '\f';
                        }
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 == 'r') {
                            return '\r';
                        }
                        if (c10 == 't') {
                            return '\t';
                        }
                        if (c10 != 'u') {
                            throw s0("Invalid escape sequence");
                        }
                        if (i11 + 5 > this.f32392f && !k(4)) {
                            throw s0("Unterminated escape sequence");
                        }
                        int i13 = this.f32391e;
                        int i14 = i13 + 4;
                        int i15 = 0;
                        while (i13 < i14) {
                            char c11 = this.f32390d[i13];
                            int i16 = i15 << 4;
                            if (c11 >= '0' && c11 <= '9') {
                                i10 = c11 - '0';
                            } else if (c11 >= 'a' && c11 <= 'f') {
                                i10 = c11 - 'W';
                            } else {
                                if (c11 < 'A' || c11 > 'F') {
                                    throw s0("Malformed Unicode escape \\u" + new String(this.f32390d, this.f32391e, 4));
                                }
                                i10 = c11 - '7';
                            }
                            i15 = i16 + i10;
                            i13++;
                        }
                        this.f32391e += 4;
                        return (char) i15;
                    }
                }
            }
            return c10;
        }
        if (this.b == x.STRICT) {
            throw s0("Cannot escape a newline character in strict mode");
        }
        this.f32393g++;
        this.f32394h = i12;
        if (this.b == x.STRICT) {
            throw s0("Invalid escaped character \"'\" in strict mode");
        }
        return c10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f32395i = 0;
        this.f32399m[0] = 8;
        this.f32400n = 1;
        this.f32388a.close();
    }

    public final void d() throws d {
        if (this.b != x.LENIENT) {
            throw s0("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    @Deprecated
    public final void d0(boolean z10) {
        e0(z10 ? x.LENIENT : x.LEGACY_STRICT);
    }

    public final void e() throws IOException {
        I(true);
        int i10 = this.f32391e;
        this.f32391e = i10 - 1;
        if (i10 + 4 <= this.f32392f || k(5)) {
            int i11 = this.f32391e;
            char[] cArr = this.f32390d;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f32391e = i11 + 5;
            }
        }
    }

    public final void e0(x xVar) {
        Objects.requireNonNull(xVar);
        this.b = xVar;
    }

    public int f() throws IOException {
        int I;
        int[] iArr = this.f32399m;
        int i10 = this.f32400n;
        int i11 = iArr[i10 - 1];
        if (i11 == 1) {
            iArr[i10 - 1] = 2;
        } else if (i11 == 2) {
            int I2 = I(true);
            if (I2 != 44) {
                if (I2 != 59) {
                    if (I2 != 93) {
                        throw s0("Unterminated array");
                    }
                    this.f32395i = 4;
                    return 4;
                }
                d();
            }
        } else {
            if (i11 == 3 || i11 == 5) {
                iArr[i10 - 1] = 4;
                if (i11 == 5 && (I = I(true)) != 44) {
                    if (I != 59) {
                        if (I != 125) {
                            throw s0("Unterminated object");
                        }
                        this.f32395i = 2;
                        return 2;
                    }
                    d();
                }
                int I3 = I(true);
                if (I3 == 34) {
                    this.f32395i = 13;
                    return 13;
                }
                if (I3 == 39) {
                    d();
                    this.f32395i = 12;
                    return 12;
                }
                if (I3 == 125) {
                    if (i11 == 5) {
                        throw s0("Expected name");
                    }
                    this.f32395i = 2;
                    return 2;
                }
                d();
                this.f32391e--;
                if (!s((char) I3)) {
                    throw s0("Expected name");
                }
                this.f32395i = 14;
                return 14;
            }
            if (i11 == 4) {
                iArr[i10 - 1] = 5;
                int I4 = I(true);
                if (I4 != 58) {
                    if (I4 != 61) {
                        throw s0("Expected ':'");
                    }
                    d();
                    if (this.f32391e < this.f32392f || k(1)) {
                        char[] cArr = this.f32390d;
                        int i12 = this.f32391e;
                        if (cArr[i12] == '>') {
                            this.f32391e = i12 + 1;
                        }
                    }
                }
            } else if (i11 == 6) {
                if (this.b == x.LENIENT) {
                    e();
                }
                this.f32399m[this.f32400n - 1] = 7;
            } else if (i11 == 7) {
                if (I(false) == -1) {
                    this.f32395i = 17;
                    return 17;
                }
                d();
                this.f32391e--;
            } else if (i11 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int I5 = I(true);
        if (I5 == 34) {
            this.f32395i = 9;
            return 9;
        }
        if (I5 == 39) {
            d();
            this.f32395i = 8;
            return 8;
        }
        if (I5 != 44 && I5 != 59) {
            if (I5 == 91) {
                this.f32395i = 3;
                return 3;
            }
            if (I5 != 93) {
                if (I5 == 123) {
                    this.f32395i = 1;
                    return 1;
                }
                this.f32391e--;
                int iT = T();
                if (iT != 0) {
                    return iT;
                }
                int iY = Y();
                if (iY != 0) {
                    return iY;
                }
                if (!s(this.f32390d[this.f32391e])) {
                    throw s0("Expected value");
                }
                d();
                this.f32395i = 10;
                return 10;
            }
            if (i11 == 1) {
                this.f32395i = 4;
                return 4;
            }
        }
        if (i11 != 1 && i11 != 2) {
            throw s0("Unexpected value");
        }
        d();
        this.f32391e--;
        this.f32395i = 7;
        return 7;
    }

    public final void f0(char c10) throws d {
        char[] cArr = this.f32390d;
        do {
            int i10 = this.f32391e;
            int i11 = this.f32392f;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = cArr[i10];
                if (c11 == c10) {
                    this.f32391e = i12;
                    return;
                }
                if (c11 == '\\') {
                    this.f32391e = i12;
                    c0();
                    i10 = this.f32391e;
                    i11 = this.f32392f;
                } else {
                    if (c11 == '\n') {
                        this.f32393g++;
                        this.f32394h = i12;
                    }
                    i10 = i12;
                }
            }
            this.f32391e = i10;
        } while (k(1));
        throw s0("Unterminated string");
    }

    public void g() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 4) {
            throw w0("END_ARRAY");
        }
        int i10 = this.f32400n;
        this.f32400n = i10 - 1;
        int[] iArr = this.f32402p;
        int i11 = i10 - 2;
        iArr[i11] = iArr[i11] + 1;
        this.f32395i = 0;
    }

    public void h() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF != 2) {
            throw w0("END_OBJECT");
        }
        int i10 = this.f32400n;
        int i11 = i10 - 1;
        this.f32400n = i11;
        this.f32401o[i11] = null;
        int[] iArr = this.f32402p;
        int i12 = i10 - 2;
        iArr[i12] = iArr[i12] + 1;
        this.f32395i = 0;
    }

    public final boolean h0(String str) {
        int length = str.length();
        while (true) {
            if (this.f32391e + length > this.f32392f && !k(length)) {
                return false;
            }
            char[] cArr = this.f32390d;
            int i10 = this.f32391e;
            if (cArr[i10] != '\n') {
                for (int i11 = 0; i11 < length; i11++) {
                    if (this.f32390d[this.f32391e + i11] == str.charAt(i11)) {
                    }
                }
                return true;
            }
            this.f32393g++;
            this.f32394h = i10 + 1;
            this.f32391e++;
        }
    }

    public final void i0() {
        char c10;
        do {
            if (this.f32391e >= this.f32392f && !k(1)) {
                return;
            }
            char[] cArr = this.f32390d;
            int i10 = this.f32391e;
            int i11 = i10 + 1;
            this.f32391e = i11;
            c10 = cArr[i10];
            if (c10 == '\n') {
                this.f32393g++;
                this.f32394h = i11;
                return;
            }
        } while (c10 != '\r');
    }

    public final boolean k(int i10) throws IOException {
        int i11;
        int i12;
        char[] cArr = this.f32390d;
        int i13 = this.f32394h;
        int i14 = this.f32391e;
        this.f32394h = i13 - i14;
        int i15 = this.f32392f;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.f32392f = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.f32392f = 0;
        }
        this.f32391e = 0;
        do {
            Reader reader = this.f32388a;
            int i17 = this.f32392f;
            int i18 = reader.read(cArr, i17, cArr.length - i17);
            if (i18 == -1) {
                return false;
            }
            i11 = this.f32392f + i18;
            this.f32392f = i11;
            if (this.f32393g == 0 && (i12 = this.f32394h) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f32391e++;
                this.f32394h = i12 + 1;
                i10++;
            }
        } while (i11 < i10);
        return true;
    }

    public final void k0() throws d {
        do {
            int i10 = 0;
            while (true) {
                int i11 = this.f32391e;
                if (i11 + i10 < this.f32392f) {
                    char c10 = this.f32390d[i11 + i10];
                    if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                        if (c10 != '#') {
                            if (c10 != ',') {
                                if (c10 != '/' && c10 != '=') {
                                    if (c10 != '{' && c10 != '}' && c10 != ':') {
                                        if (c10 != ';') {
                                            switch (c10) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i10++;
                                                    break;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        d();
                    }
                    this.f32391e += i10;
                    return;
                }
                this.f32391e = i11 + i10;
            }
        } while (k(1));
    }

    public String n() {
        return m(true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void n0() throws IOException {
        int i10 = 0;
        do {
            int iF = this.f32395i;
            if (iF == 0) {
                iF = f();
            }
            switch (iF) {
                case 1:
                    b0(3);
                    i10++;
                    this.f32395i = 0;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f32401o[this.f32400n - 1] = null;
                    }
                    this.f32400n--;
                    i10--;
                    this.f32395i = 0;
                    break;
                case 3:
                    b0(1);
                    i10++;
                    this.f32395i = 0;
                    break;
                case 4:
                    this.f32400n--;
                    i10--;
                    this.f32395i = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.f32395i = 0;
                    break;
                case 8:
                    f0('\'');
                    this.f32395i = 0;
                    break;
                case 9:
                    f0('\"');
                    this.f32395i = 0;
                    break;
                case 10:
                    k0();
                    this.f32395i = 0;
                    break;
                case 12:
                    f0('\'');
                    if (i10 == 0) {
                        this.f32401o[this.f32400n - 1] = "<skipped>";
                    }
                    this.f32395i = 0;
                    break;
                case 13:
                    f0('\"');
                    if (i10 == 0) {
                        this.f32401o[this.f32400n - 1] = "<skipped>";
                    }
                    this.f32395i = 0;
                    break;
                case 14:
                    k0();
                    if (i10 == 0) {
                        this.f32401o[this.f32400n - 1] = "<skipped>";
                    }
                    this.f32395i = 0;
                    break;
                case 16:
                    this.f32391e += this.f32397k;
                    this.f32395i = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i10 > 0);
        int[] iArr = this.f32402p;
        int i11 = this.f32400n - 1;
        iArr[i11] = iArr[i11] + 1;
    }

    public final x o() {
        return this.b;
    }

    public boolean p() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        return (iF == 2 || iF == 4 || iF == 17) ? false : true;
    }

    public final boolean r() {
        return this.b == x.LENIENT;
    }

    public final boolean s(char c10) throws d {
        if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
            return false;
        }
        if (c10 != '#') {
            if (c10 == ',') {
                return false;
            }
            if (c10 != '/' && c10 != '=') {
                if (c10 == '{' || c10 == '}' || c10 == ':') {
                    return false;
                }
                if (c10 != ';') {
                    switch (c10) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        d();
        return false;
    }

    public final d s0(String str) throws d {
        throw new d(str + u() + "\nSee " + i0.a("malformed-json"));
    }

    public String toString() {
        return getClass().getSimpleName() + u();
    }

    public String u() {
        return " at line " + (this.f32393g + 1) + " column " + ((this.f32391e - this.f32394h) + 1) + " path " + x();
    }

    public boolean w() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 5) {
            this.f32395i = 0;
            int[] iArr = this.f32402p;
            int i10 = this.f32400n - 1;
            iArr[i10] = iArr[i10] + 1;
            return true;
        }
        if (iF != 6) {
            throw w0("a boolean");
        }
        this.f32395i = 0;
        int[] iArr2 = this.f32402p;
        int i11 = this.f32400n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return false;
    }

    public final IllegalStateException w0(String str) {
        return new IllegalStateException("Expected " + str + " but was " + Q() + u() + "\nSee " + i0.a(Q() == b.NULL ? "adapter-not-null-safe" : "unexpected-json-structure"));
    }

    public String x() {
        return m(false);
    }

    public double y() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            this.f32395i = 0;
            int[] iArr = this.f32402p;
            int i10 = this.f32400n - 1;
            iArr[i10] = iArr[i10] + 1;
            return this.f32396j;
        }
        if (iF == 16) {
            this.f32398l = new String(this.f32390d, this.f32391e, this.f32397k);
            this.f32391e += this.f32397k;
        } else if (iF == 8 || iF == 9) {
            this.f32398l = L(iF == 8 ? '\'' : '\"');
        } else if (iF == 10) {
            this.f32398l = O();
        } else if (iF != 11) {
            throw w0("a double");
        }
        this.f32395i = 11;
        double d10 = Double.parseDouble(this.f32398l);
        if (this.b != x.LENIENT && (Double.isNaN(d10) || Double.isInfinite(d10))) {
            throw s0("JSON forbids NaN and infinities: " + d10);
        }
        this.f32398l = null;
        this.f32395i = 0;
        int[] iArr2 = this.f32402p;
        int i11 = this.f32400n - 1;
        iArr2[i11] = iArr2[i11] + 1;
        return d10;
    }

    public int z() throws IOException {
        int iF = this.f32395i;
        if (iF == 0) {
            iF = f();
        }
        if (iF == 15) {
            long j10 = this.f32396j;
            int i10 = (int) j10;
            if (j10 == i10) {
                this.f32395i = 0;
                int[] iArr = this.f32402p;
                int i11 = this.f32400n - 1;
                iArr[i11] = iArr[i11] + 1;
                return i10;
            }
            throw new NumberFormatException("Expected an int but was " + this.f32396j + u());
        }
        if (iF == 16) {
            this.f32398l = new String(this.f32390d, this.f32391e, this.f32397k);
            this.f32391e += this.f32397k;
        } else {
            if (iF != 8 && iF != 9 && iF != 10) {
                throw w0("an int");
            }
            if (iF == 10) {
                this.f32398l = O();
            } else {
                this.f32398l = L(iF == 8 ? '\'' : '\"');
            }
            try {
                int i12 = Integer.parseInt(this.f32398l);
                this.f32395i = 0;
                int[] iArr2 = this.f32402p;
                int i13 = this.f32400n - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return i12;
            } catch (NumberFormatException unused) {
            }
        }
        this.f32395i = 11;
        double d10 = Double.parseDouble(this.f32398l);
        int i14 = (int) d10;
        if (i14 != d10) {
            throw new NumberFormatException("Expected an int but was " + this.f32398l + u());
        }
        this.f32398l = null;
        this.f32395i = 0;
        int[] iArr3 = this.f32402p;
        int i15 = this.f32400n - 1;
        iArr3[i15] = iArr3[i15] + 1;
        return i14;
    }
}
