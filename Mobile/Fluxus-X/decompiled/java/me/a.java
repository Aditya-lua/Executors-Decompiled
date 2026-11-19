package me;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import je.n;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23215a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    public static final a b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f23216c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f23217d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f23218e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: me.a$a, reason: collision with other inner class name */
    public static final class C0453a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23219a;
        public final char[] b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f23220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f23221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f23222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final byte[] f23224g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean[] f23225h;

        public C0453a(String str, char[] cArr) {
            this.f23219a = (String) n.l(str);
            this.b = (char[]) n.l(cArr);
            try {
                int iD = ne.a.d(cArr.length, RoundingMode.UNNECESSARY);
                this.f23221d = iD;
                int iMin = Math.min(8, Integer.lowestOneBit(iD));
                try {
                    this.f23222e = 8 / iMin;
                    this.f23223f = iD / iMin;
                    this.f23220c = cArr.length - 1;
                    byte[] bArr = new byte[Barcode.FORMAT_ITF];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i10 = 0; i10 < cArr.length; i10++) {
                        char c10 = cArr[i10];
                        n.f(c10 < 128, "Non-ASCII character: %s", c10);
                        n.f(bArr[c10] == -1, "Duplicate character: %s", c10);
                        bArr[c10] = (byte) i10;
                    }
                    this.f23224g = bArr;
                    boolean[] zArr = new boolean[this.f23222e];
                    for (int i11 = 0; i11 < this.f23223f; i11++) {
                        zArr[ne.a.a(i11 * 8, this.f23221d, RoundingMode.CEILING)] = true;
                    }
                    this.f23225h = zArr;
                } catch (ArithmeticException e10) {
                    String str2 = new String(cArr);
                    throw new IllegalArgumentException(str2.length() != 0 ? "Illegal alphabet ".concat(str2) : new String("Illegal alphabet "), e10);
                }
            } catch (ArithmeticException e11) {
                int length = cArr.length;
                StringBuilder sb2 = new StringBuilder(35);
                sb2.append("Illegal alphabet length ");
                sb2.append(length);
                throw new IllegalArgumentException(sb2.toString(), e11);
            }
        }

        public int b(char c10) throws d {
            if (c10 > 127) {
                String strValueOf = String.valueOf(Integer.toHexString(c10));
                throw new d(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f23224g[c10];
            if (b != -1) {
                return b;
            }
            if (c10 <= ' ' || c10 == 127) {
                String strValueOf2 = String.valueOf(Integer.toHexString(c10));
                throw new d(strValueOf2.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf2) : new String("Unrecognized character: 0x"));
            }
            StringBuilder sb2 = new StringBuilder(25);
            sb2.append("Unrecognized character: ");
            sb2.append(c10);
            throw new d(sb2.toString());
        }

        public char c(int i10) {
            return this.b[i10];
        }

        public final boolean d() {
            for (char c10 : this.b) {
                if (je.c.a(c10)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean e() {
            for (char c10 : this.b) {
                if (je.c.b(c10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof C0453a) {
                return Arrays.equals(this.b, ((C0453a) obj).b);
            }
            return false;
        }

        public boolean f(int i10) {
            return this.f23225h[i10 % this.f23222e];
        }

        public C0453a g() {
            if (!e()) {
                return this;
            }
            n.s(!d(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.b;
                if (i10 >= cArr2.length) {
                    return new C0453a(String.valueOf(this.f23219a).concat(".lowerCase()"), cArr);
                }
                cArr[i10] = je.c.c(cArr2[i10]);
                i10++;
            }
        }

        public boolean h(char c10) {
            byte[] bArr = this.f23224g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.b);
        }

        public String toString() {
            return this.f23219a;
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final char[] f23226i;

        public b(String str, String str2) {
            this(new C0453a(str, str2.toCharArray()));
        }

        @Override // me.a.e, me.a
        public int f(byte[] bArr, CharSequence charSequence) throws d {
            n.l(bArr);
            if (charSequence.length() % 2 == 1) {
                int length = charSequence.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                bArr[i11] = (byte) ((this.f23227f.b(charSequence.charAt(i10)) << 4) | this.f23227f.b(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // me.a.e, me.a
        public void i(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            n.l(appendable);
            n.q(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f23226i[i13]);
                appendable.append(this.f23226i[i13 | Barcode.FORMAT_QR_CODE]);
            }
        }

        @Override // me.a.e
        public a q(C0453a c0453a, Character ch2) {
            return new b(c0453a);
        }

        public b(C0453a c0453a) {
            super(c0453a, null);
            this.f23226i = new char[Barcode.FORMAT_UPC_A];
            n.d(c0453a.b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f23226i[i10] = c0453a.c(i10 >>> 4);
                this.f23226i[i10 | Barcode.FORMAT_QR_CODE] = c0453a.c(i10 & 15);
            }
        }
    }

    public static final class c extends e {
        public c(String str, String str2, Character ch2) {
            this(new C0453a(str, str2.toCharArray()), ch2);
        }

        @Override // me.a.e, me.a
        public int f(byte[] bArr, CharSequence charSequence) throws d {
            n.l(bArr);
            CharSequence charSequenceO = o(charSequence);
            if (!this.f23227f.f(charSequenceO.length())) {
                int length = charSequenceO.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceO.length()) {
                int i12 = i10 + 2;
                int iB = (this.f23227f.b(charSequenceO.charAt(i10)) << 18) | (this.f23227f.b(charSequenceO.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (iB >>> 16);
                if (i12 < charSequenceO.length()) {
                    int i14 = i10 + 3;
                    int iB2 = iB | (this.f23227f.b(charSequenceO.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((iB2 >>> 8) & 255);
                    if (i14 < charSequenceO.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iB2 | this.f23227f.b(charSequenceO.charAt(i14))) & 255);
                    } else {
                        i11 = i15;
                        i10 = i14;
                    }
                } else {
                    i11 = i13;
                    i10 = i12;
                }
            }
            return i11;
        }

        @Override // me.a.e, me.a
        public void i(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            n.l(appendable);
            int i12 = i10 + i11;
            n.q(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & 255);
                appendable.append(this.f23227f.c(i15 >>> 18));
                appendable.append(this.f23227f.c((i15 >>> 12) & 63));
                appendable.append(this.f23227f.c((i15 >>> 6) & 63));
                appendable.append(this.f23227f.c(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                p(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // me.a.e
        public a q(C0453a c0453a, Character ch2) {
            return new c(c0453a, ch2);
        }

        public c(C0453a c0453a, Character ch2) {
            super(c0453a, ch2);
            n.d(c0453a.b.length == 64);
        }
    }

    public static final class d extends IOException {
        public d(String str) {
            super(str);
        }
    }

    public static class e extends a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C0453a f23227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Character f23228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public transient a f23229h;

        public e(String str, String str2, Character ch2) {
            this(new C0453a(str, str2.toCharArray()), ch2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f23227f.equals(eVar.f23227f) && je.j.a(this.f23228g, eVar.f23228g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // me.a
        public int f(byte[] bArr, CharSequence charSequence) throws d {
            C0453a c0453a;
            n.l(bArr);
            CharSequence charSequenceO = o(charSequence);
            if (!this.f23227f.f(charSequenceO.length())) {
                int length = charSequenceO.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceO.length()) {
                long jB = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    c0453a = this.f23227f;
                    if (i12 >= c0453a.f23222e) {
                        break;
                    }
                    jB <<= c0453a.f23221d;
                    if (i10 + i12 < charSequenceO.length()) {
                        jB |= (long) this.f23227f.b(charSequenceO.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = c0453a.f23223f;
                int i15 = (i14 * 8) - (i13 * c0453a.f23221d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((jB >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f23227f.f23222e;
            }
            return i11;
        }

        public int hashCode() {
            return this.f23227f.hashCode() ^ je.j.b(this.f23228g);
        }

        @Override // me.a
        public void i(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            n.l(appendable);
            n.q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                p(appendable, bArr, i10 + i12, Math.min(this.f23227f.f23223f, i11 - i12));
                i12 += this.f23227f.f23223f;
            }
        }

        @Override // me.a
        public a k() {
            a aVarQ = this.f23229h;
            if (aVarQ == null) {
                C0453a c0453aG = this.f23227f.g();
                aVarQ = c0453aG == this.f23227f ? this : q(c0453aG, this.f23228g);
                this.f23229h = aVarQ;
            }
            return aVarQ;
        }

        @Override // me.a
        public int l(int i10) {
            return (int) (((((long) this.f23227f.f23221d) * ((long) i10)) + 7) / 8);
        }

        @Override // me.a
        public int m(int i10) {
            C0453a c0453a = this.f23227f;
            return c0453a.f23222e * ne.a.a(i10, c0453a.f23223f, RoundingMode.CEILING);
        }

        @Override // me.a
        public a n() {
            return this.f23228g == null ? this : q(this.f23227f, null);
        }

        @Override // me.a
        public CharSequence o(CharSequence charSequence) {
            n.l(charSequence);
            Character ch2 = this.f23228g;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        public void p(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            n.l(appendable);
            n.q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            n.d(i11 <= this.f23227f.f23223f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f23227f.f23221d;
            while (i12 < i11 * 8) {
                C0453a c0453a = this.f23227f;
                appendable.append(c0453a.c(((int) (j10 >>> (i14 - i12))) & c0453a.f23220c));
                i12 += this.f23227f.f23221d;
            }
            if (this.f23228g != null) {
                while (i12 < this.f23227f.f23223f * 8) {
                    appendable.append(this.f23228g.charValue());
                    i12 += this.f23227f.f23221d;
                }
            }
        }

        public a q(C0453a c0453a, Character ch2) {
            return new e(c0453a, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f23227f.toString());
            if (8 % this.f23227f.f23221d != 0) {
                if (this.f23228g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f23228g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        public e(C0453a c0453a, Character ch2) {
            this.f23227f = (C0453a) n.l(c0453a);
            n.h(ch2 == null || !c0453a.h(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f23228g = ch2;
        }
    }

    public static a a() {
        return f23218e;
    }

    public static a b() {
        return f23215a;
    }

    public static a c() {
        return b;
    }

    public static byte[] j(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] d(CharSequence charSequence) {
        try {
            return e(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final byte[] e(CharSequence charSequence) {
        CharSequence charSequenceO = o(charSequence);
        byte[] bArr = new byte[l(charSequenceO.length())];
        return j(bArr, f(bArr, charSequenceO));
    }

    public abstract int f(byte[] bArr, CharSequence charSequence);

    public String g(byte[] bArr) {
        return h(bArr, 0, bArr.length);
    }

    public final String h(byte[] bArr, int i10, int i11) {
        n.q(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(m(i11));
        try {
            i(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract void i(Appendable appendable, byte[] bArr, int i10, int i11);

    public abstract a k();

    public abstract int l(int i10);

    public abstract int m(int i10);

    public abstract a n();

    public abstract CharSequence o(CharSequence charSequence);
}
