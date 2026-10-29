package ke;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Arrays;
import p169he.C6373c;
import p169he.C6380j;
import p169he.C6384n;
import p270le.C8127a;

/* JADX INFO: renamed from: ke.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7569a {

    /* JADX INFO: renamed from: a */
    public static final AbstractC7569a f29008a = new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b */
    public static final AbstractC7569a f29009b = new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c */
    public static final AbstractC7569a f29010c = new e("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d */
    public static final AbstractC7569a f29011d = new e("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e */
    public static final AbstractC7569a f29012e = new b("base16()", "0123456789ABCDEF");

    /* JADX INFO: renamed from: ke.a$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f29013a;

        /* JADX INFO: renamed from: b */
        public final char[] f29014b;

        /* JADX INFO: renamed from: c */
        public final int f29015c;

        /* JADX INFO: renamed from: d */
        public final int f29016d;

        /* JADX INFO: renamed from: e */
        public final int f29017e;

        /* JADX INFO: renamed from: f */
        public final int f29018f;

        /* JADX INFO: renamed from: g */
        public final byte[] f29019g;

        /* JADX INFO: renamed from: h */
        public final boolean[] f29020h;

        public a(String str, char[] cArr) {
            this.f29013a = (String) C6384n.m27928l(str);
            this.f29014b = (char[]) C6384n.m27928l(cArr);
            try {
                int iM33347d = C8127a.m33347d(cArr.length, RoundingMode.UNNECESSARY);
                this.f29016d = iM33347d;
                int iMin = Math.min(8, Integer.lowestOneBit(iM33347d));
                try {
                    this.f29017e = 8 / iMin;
                    this.f29018f = iM33347d / iMin;
                    this.f29015c = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i10 = 0; i10 < cArr.length; i10++) {
                        char c10 = cArr[i10];
                        C6384n.m27922f(c10 < 128, "Non-ASCII character: %s", c10);
                        C6384n.m27922f(bArr[c10] == -1, "Duplicate character: %s", c10);
                        bArr[c10] = (byte) i10;
                    }
                    this.f29019g = bArr;
                    boolean[] zArr = new boolean[this.f29017e];
                    for (int i11 = 0; i11 < this.f29018f; i11++) {
                        zArr[C8127a.m33344a(i11 * 8, this.f29016d, RoundingMode.CEILING)] = true;
                    }
                    this.f29020h = zArr;
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

        /* JADX INFO: renamed from: b */
        public int m31355b(char c10) throws d {
            if (c10 > 127) {
                String strValueOf = String.valueOf(Integer.toHexString(c10));
                throw new d(strValueOf.length() != 0 ? "Unrecognized character: 0x".concat(strValueOf) : new String("Unrecognized character: 0x"));
            }
            byte b = this.f29019g[c10];
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

        /* JADX INFO: renamed from: c */
        public char m31356c(int i10) {
            return this.f29014b[i10];
        }

        /* JADX INFO: renamed from: d */
        public final boolean m31357d() {
            for (char c10 : this.f29014b) {
                if (C6373c.m27889a(c10)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final boolean m31358e() {
            for (char c10 : this.f29014b) {
                if (C6373c.m27890b(c10)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Arrays.equals(this.f29014b, ((a) obj).f29014b);
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        public boolean m31359f(int i10) {
            return this.f29020h[i10 % this.f29017e];
        }

        /* JADX INFO: renamed from: g */
        public a m31360g() {
            if (!m31358e()) {
                return this;
            }
            C6384n.m27935s(!m31357d(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f29014b.length];
            int i10 = 0;
            while (true) {
                char[] cArr2 = this.f29014b;
                if (i10 >= cArr2.length) {
                    return new a(String.valueOf(this.f29013a).concat(".lowerCase()"), cArr);
                }
                cArr[i10] = C6373c.m27891c(cArr2[i10]);
                i10++;
            }
        }

        /* JADX INFO: renamed from: h */
        public boolean m31361h(char c10) {
            byte[] bArr = this.f29019g;
            return c10 < bArr.length && bArr[c10] != -1;
        }

        public int hashCode() {
            return Arrays.hashCode(this.f29014b);
        }

        public String toString() {
            return this.f29013a;
        }
    }

    /* JADX INFO: renamed from: ke.a$b */
    public static final class b extends e {

        /* JADX INFO: renamed from: i */
        public final char[] f29021i;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(String str, String str2) {
            this(new a(str, str2.toCharArray()));
        }

        @Override // ke.AbstractC7569a.e, ke.AbstractC7569a
        /* JADX INFO: renamed from: f */
        public int mo31345f(byte[] bArr, CharSequence charSequence) throws d {
            C6384n.m27928l(bArr);
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
                bArr[i11] = (byte) ((this.f29022f.m31355b(charSequence.charAt(i10)) << 4) | this.f29022f.m31355b(charSequence.charAt(i10 + 1)));
                i10 += 2;
                i11++;
            }
            return i11;
        }

        @Override // ke.AbstractC7569a.e, ke.AbstractC7569a
        /* JADX INFO: renamed from: i */
        public void mo31348i(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            C6384n.m27928l(appendable);
            C6384n.m27933q(i10, i10 + i11, bArr.length);
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = bArr[i10 + i12] & 255;
                appendable.append(this.f29021i[i13]);
                appendable.append(this.f29021i[i13 | 256]);
            }
        }

        @Override // ke.AbstractC7569a.e
        /* JADX INFO: renamed from: q */
        public AbstractC7569a mo31362q(a aVar, Character ch2) {
            return new b(aVar);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(a aVar) {
            super(aVar, null);
            this.f29021i = new char[512];
            C6384n.m27920d(aVar.f29014b.length == 16);
            for (int i10 = 0; i10 < 256; i10++) {
                this.f29021i[i10] = aVar.m31356c(i10 >>> 4);
                this.f29021i[i10 | 256] = aVar.m31356c(i10 & 15);
            }
        }
    }

    /* JADX INFO: renamed from: ke.a$c */
    public static final class c extends e {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        @Override // ke.AbstractC7569a.e, ke.AbstractC7569a
        /* JADX INFO: renamed from: f */
        public int mo31345f(byte[] bArr, CharSequence charSequence) throws d {
            C6384n.m27928l(bArr);
            CharSequence charSequenceMo31353o = mo31353o(charSequence);
            if (!this.f29022f.m31359f(charSequenceMo31353o.length())) {
                int length = charSequenceMo31353o.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceMo31353o.length()) {
                int i12 = i10 + 2;
                int iM31355b = (this.f29022f.m31355b(charSequenceMo31353o.charAt(i10)) << 18) | (this.f29022f.m31355b(charSequenceMo31353o.charAt(i10 + 1)) << 12);
                int i13 = i11 + 1;
                bArr[i11] = (byte) (iM31355b >>> 16);
                if (i12 < charSequenceMo31353o.length()) {
                    int i14 = i10 + 3;
                    int iM31355b2 = iM31355b | (this.f29022f.m31355b(charSequenceMo31353o.charAt(i12)) << 6);
                    int i15 = i11 + 2;
                    bArr[i13] = (byte) ((iM31355b2 >>> 8) & 255);
                    if (i14 < charSequenceMo31353o.length()) {
                        i10 += 4;
                        i11 += 3;
                        bArr[i15] = (byte) ((iM31355b2 | this.f29022f.m31355b(charSequenceMo31353o.charAt(i14))) & 255);
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

        @Override // ke.AbstractC7569a.e, ke.AbstractC7569a
        /* JADX INFO: renamed from: i */
        public void mo31348i(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            C6384n.m27928l(appendable);
            int i12 = i10 + i11;
            C6384n.m27933q(i10, i12, bArr.length);
            while (i11 >= 3) {
                int i13 = i10 + 2;
                int i14 = ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10] & 255) << 16);
                i10 += 3;
                int i15 = i14 | (bArr[i13] & 255);
                appendable.append(this.f29022f.m31356c(i15 >>> 18));
                appendable.append(this.f29022f.m31356c((i15 >>> 12) & 63));
                appendable.append(this.f29022f.m31356c((i15 >>> 6) & 63));
                appendable.append(this.f29022f.m31356c(i15 & 63));
                i11 -= 3;
            }
            if (i10 < i12) {
                m31363p(appendable, bArr, i10, i12 - i10);
            }
        }

        @Override // ke.AbstractC7569a.e
        /* JADX INFO: renamed from: q */
        public AbstractC7569a mo31362q(a aVar, Character ch2) {
            return new c(aVar, ch2);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(a aVar, Character ch2) {
            super(aVar, ch2);
            C6384n.m27920d(aVar.f29014b.length == 64);
        }
    }

    /* JADX INFO: renamed from: ke.a$d */
    public static final class d extends IOException {
        public d(String str) {
            super(str);
        }
    }

    /* JADX INFO: renamed from: ke.a$e */
    public static class e extends AbstractC7569a {

        /* JADX INFO: renamed from: f */
        public final a f29022f;

        /* JADX INFO: renamed from: g */
        public final Character f29023g;

        /* JADX INFO: renamed from: h */
        public transient AbstractC7569a f29024h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e(String str, String str2, Character ch2) {
            this(new a(str, str2.toCharArray()), ch2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f29022f.equals(eVar.f29022f) && C6380j.m27910a(this.f29023g, eVar.f29023g)) {
                    return true;
                }
            }
            return false;
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: f */
        public int mo31345f(byte[] bArr, CharSequence charSequence) throws d {
            a aVar;
            C6384n.m27928l(bArr);
            CharSequence charSequenceMo31353o = mo31353o(charSequence);
            if (!this.f29022f.m31359f(charSequenceMo31353o.length())) {
                int length = charSequenceMo31353o.length();
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Invalid input length ");
                sb2.append(length);
                throw new d(sb2.toString());
            }
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceMo31353o.length()) {
                long jM31355b = 0;
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    aVar = this.f29022f;
                    if (i12 >= aVar.f29017e) {
                        break;
                    }
                    jM31355b <<= aVar.f29016d;
                    if (i10 + i12 < charSequenceMo31353o.length()) {
                        jM31355b |= (long) this.f29022f.m31355b(charSequenceMo31353o.charAt(i13 + i10));
                        i13++;
                    }
                    i12++;
                }
                int i14 = aVar.f29018f;
                int i15 = (i14 * 8) - (i13 * aVar.f29016d);
                int i16 = (i14 - 1) * 8;
                while (i16 >= i15) {
                    bArr[i11] = (byte) ((jM31355b >>> i16) & 255);
                    i16 -= 8;
                    i11++;
                }
                i10 += this.f29022f.f29017e;
            }
            return i11;
        }

        public int hashCode() {
            return this.f29022f.hashCode() ^ C6380j.m27911b(this.f29023g);
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: i */
        public void mo31348i(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            C6384n.m27928l(appendable);
            C6384n.m27933q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            while (i12 < i11) {
                m31363p(appendable, bArr, i10 + i12, Math.min(this.f29022f.f29018f, i11 - i12));
                i12 += this.f29022f.f29018f;
            }
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: k */
        public AbstractC7569a mo31349k() {
            AbstractC7569a abstractC7569aMo31362q = this.f29024h;
            if (abstractC7569aMo31362q == null) {
                a aVarM31360g = this.f29022f.m31360g();
                abstractC7569aMo31362q = aVarM31360g == this.f29022f ? this : mo31362q(aVarM31360g, this.f29023g);
                this.f29024h = abstractC7569aMo31362q;
            }
            return abstractC7569aMo31362q;
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: l */
        public int mo31350l(int i10) {
            return (int) (((((long) this.f29022f.f29016d) * ((long) i10)) + 7) / 8);
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: m */
        public int mo31351m(int i10) {
            a aVar = this.f29022f;
            return aVar.f29017e * C8127a.m33344a(i10, aVar.f29018f, RoundingMode.CEILING);
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: n */
        public AbstractC7569a mo31352n() {
            return this.f29023g == null ? this : mo31362q(this.f29022f, null);
        }

        @Override // ke.AbstractC7569a
        /* JADX INFO: renamed from: o */
        public CharSequence mo31353o(CharSequence charSequence) {
            C6384n.m27928l(charSequence);
            Character ch2 = this.f29023g;
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

        /* JADX INFO: renamed from: p */
        public void m31363p(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
            C6384n.m27928l(appendable);
            C6384n.m27933q(i10, i10 + i11, bArr.length);
            int i12 = 0;
            C6384n.m27920d(i11 <= this.f29022f.f29018f);
            long j10 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
            }
            int i14 = ((i11 + 1) * 8) - this.f29022f.f29016d;
            while (i12 < i11 * 8) {
                a aVar = this.f29022f;
                appendable.append(aVar.m31356c(((int) (j10 >>> (i14 - i12))) & aVar.f29015c));
                i12 += this.f29022f.f29016d;
            }
            if (this.f29023g != null) {
                while (i12 < this.f29022f.f29018f * 8) {
                    appendable.append(this.f29023g.charValue());
                    i12 += this.f29022f.f29016d;
                }
            }
        }

        /* JADX INFO: renamed from: q */
        public AbstractC7569a mo31362q(a aVar, Character ch2) {
            return new e(aVar, ch2);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BaseEncoding.");
            sb2.append(this.f29022f.toString());
            if (8 % this.f29022f.f29016d != 0) {
                if (this.f29023g == null) {
                    sb2.append(".omitPadding()");
                } else {
                    sb2.append(".withPadChar('");
                    sb2.append(this.f29023g);
                    sb2.append("')");
                }
            }
            return sb2.toString();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public e(a aVar, Character ch2) {
            this.f29022f = (a) C6384n.m27928l(aVar);
            C6384n.m27924h(ch2 == null || !aVar.m31361h(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f29023g = ch2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC7569a m31339a() {
        return f29012e;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC7569a m31340b() {
        return f29008a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC7569a m31341c() {
        return f29009b;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m31342j(byte[] bArr, int i10) {
        if (i10 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m31343d(CharSequence charSequence) {
        try {
            return m31344e(charSequence);
        } catch (d e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m31344e(CharSequence charSequence) {
        CharSequence charSequenceMo31353o = mo31353o(charSequence);
        byte[] bArr = new byte[mo31350l(charSequenceMo31353o.length())];
        return m31342j(bArr, mo31345f(bArr, charSequenceMo31353o));
    }

    /* JADX INFO: renamed from: f */
    public abstract int mo31345f(byte[] bArr, CharSequence charSequence);

    /* JADX INFO: renamed from: g */
    public String m31346g(byte[] bArr) {
        return m31347h(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: h */
    public final String m31347h(byte[] bArr, int i10, int i11) {
        C6384n.m27933q(i10, i10 + i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(mo31351m(i11));
        try {
            mo31348i(sb2, bArr, i10, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public abstract void mo31348i(Appendable appendable, byte[] bArr, int i10, int i11);

    /* JADX INFO: renamed from: k */
    public abstract AbstractC7569a mo31349k();

    /* JADX INFO: renamed from: l */
    public abstract int mo31350l(int i10);

    /* JADX INFO: renamed from: m */
    public abstract int mo31351m(int i10);

    /* JADX INFO: renamed from: n */
    public abstract AbstractC7569a mo31352n();

    /* JADX INFO: renamed from: o */
    public abstract CharSequence mo31353o(CharSequence charSequence);
}
