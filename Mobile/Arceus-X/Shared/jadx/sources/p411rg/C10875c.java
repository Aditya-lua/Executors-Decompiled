package p411rg;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Map;
import mg.C8522c;
import mg.EnumC8521b;
import ng.C9470a;
import ng.C9474e;
import ng.EnumC9472c;
import p331og.C9731a;
import p331og.C9733c;
import p381qg.C10580c;
import p381qg.EnumC10578a;
import p381qg.EnumC10579b;

/* JADX INFO: renamed from: rg.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C10875c {

    /* JADX INFO: renamed from: a */
    public static final int[] f38604a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    public static final Charset f38605b = StandardCharsets.ISO_8859_1;

    /* JADX INFO: renamed from: rg.c$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38606a;

        static {
            int[] iArr = new int[EnumC10579b.values().length];
            f38606a = iArr;
            try {
                iArr[EnumC10579b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38606a[EnumC10579b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38606a[EnumC10579b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38606a[EnumC10579b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m41335a(String str, C9470a c9470a, Charset charset) {
        for (byte b : str.getBytes(charset)) {
            c9470a.m37307c(b, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m41336b(CharSequence charSequence, C9470a c9470a) throws C8522c {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iM41350p = m41350p(charSequence.charAt(i10));
            if (iM41350p == -1) {
                throw new C8522c();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int iM41350p2 = m41350p(charSequence.charAt(i11));
                if (iM41350p2 == -1) {
                    throw new C8522c();
                }
                c9470a.m37307c((iM41350p * 45) + iM41350p2, 11);
                i10 += 2;
            } else {
                c9470a.m37307c(iM41350p, 6);
                i10 = i11;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m41337c(String str, EnumC10579b enumC10579b, C9470a c9470a, Charset charset) {
        int i10 = a.f38606a[enumC10579b.ordinal()];
        if (i10 == 1) {
            m41342h(str, c9470a);
            return;
        }
        if (i10 == 2) {
            m41336b(str, c9470a);
            return;
        }
        if (i10 == 3) {
            m41335a(str, c9470a, charset);
        } else {
            if (i10 == 4) {
                m41339e(str, c9470a);
                return;
            }
            throw new C8522c("Invalid mode: " + enumC10579b);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m41338d(EnumC9472c enumC9472c, C9470a c9470a) {
        c9470a.m37307c(EnumC10579b.ECI.m40550a(), 4);
        c9470a.m37307c(enumC9472c.m37322c(), 8);
    }

    /* JADX INFO: renamed from: e */
    public static void m41339e(String str, C9470a c9470a) throws C8522c {
        int i10;
        Charset charset = C9474e.f34079b;
        if (charset == null) {
            throw new C8522c("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new C8522c("Kanji byte size not even");
        }
        int length = bytes.length - 1;
        for (int i11 = 0; i11 < length; i11 += 2) {
            int i12 = ((bytes[i11] & 255) << 8) | (bytes[i11 + 1] & 255);
            int i13 = 33088;
            if (i12 >= 33088 && i12 <= 40956) {
                i10 = i12 - i13;
            } else if (i12 < 57408 || i12 > 60351) {
                i10 = -1;
            } else {
                i13 = 49472;
                i10 = i12 - i13;
            }
            if (i10 == -1) {
                throw new C8522c("Invalid byte sequence");
            }
            c9470a.m37307c(((i10 >> 8) * 192) + (i10 & 255), 13);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m41340f(int i10, C10580c c10580c, EnumC10579b enumC10579b, C9470a c9470a) throws C8522c {
        int iM40551b = enumC10579b.m40551b(c10580c);
        int i11 = 1 << iM40551b;
        if (i10 < i11) {
            c9470a.m37307c(i10, iM40551b);
            return;
        }
        throw new C8522c(i10 + " is bigger than " + (i11 - 1));
    }

    /* JADX INFO: renamed from: g */
    public static void m41341g(EnumC10579b enumC10579b, C9470a c9470a) {
        c9470a.m37307c(enumC10579b.m40550a(), 4);
    }

    /* JADX INFO: renamed from: h */
    public static void m41342h(CharSequence charSequence, C9470a c9470a) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                c9470a.m37307c((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    c9470a.m37307c((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    c9470a.m37307c(iCharAt, 4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static int m41343i(EnumC10579b enumC10579b, C9470a c9470a, C9470a c9470a2, C10580c c10580c) {
        return c9470a.m37311i() + enumC10579b.m40551b(c10580c) + c9470a2.m37311i();
    }

    /* JADX INFO: renamed from: j */
    public static int m41344j(C10874b c10874b) {
        return C10876d.m41357a(c10874b) + C10876d.m41359c(c10874b) + C10876d.m41360d(c10874b) + C10876d.m41361e(c10874b);
    }

    /* JADX INFO: renamed from: k */
    public static int m41345k(C9470a c9470a, EnumC10578a enumC10578a, C10580c c10580c, C10874b c10874b) throws C8522c {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            C10877e.m41365a(c9470a, enumC10578a, c10580c, i12, c10874b);
            int iM41344j = m41344j(c10874b);
            if (iM41344j < i10) {
                i11 = i12;
                i10 = iM41344j;
            }
        }
        return i11;
    }

    /* JADX INFO: renamed from: l */
    public static EnumC10579b m41346l(String str, Charset charset) {
        Charset charset2 = C9474e.f34079b;
        if (charset2 != null && charset2.equals(charset) && m41353s(str)) {
            return EnumC10579b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (m41350p(cCharAt) == -1) {
                    return EnumC10579b.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return EnumC10579b.ALPHANUMERIC;
        }
        return z11 ? EnumC10579b.NUMERIC : EnumC10579b.BYTE;
    }

    /* JADX INFO: renamed from: m */
    public static C10580c m41347m(int i10, EnumC10578a enumC10578a) throws C8522c {
        for (int i11 = 1; i11 <= 40; i11++) {
            C10580c c10580cM40553e = C10580c.m40553e(i11);
            if (m41356v(i10, c10580cM40553e, enumC10578a)) {
                return c10580cM40553e;
            }
        }
        throw new C8522c("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    /* JADX INFO: renamed from: n */
    public static C10879g m41348n(String str, EnumC10578a enumC10578a, Map<EnumC8521b, ?> map) throws C8522c {
        boolean z10;
        boolean z11;
        C10580c c10580cM41354t;
        EnumC10579b enumC10579b;
        C10580c c10580cM41410e;
        C9470a c9470a;
        EnumC9472c enumC9472cM37320a;
        int iM41345k;
        boolean z12 = false;
        if (map != null) {
            EnumC8521b enumC8521b = EnumC8521b.GS1_FORMAT;
            if (map.containsKey(enumC8521b) && Boolean.parseBoolean(map.get(enumC8521b).toString())) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (map != null) {
            EnumC8521b enumC8521b2 = EnumC8521b.QR_COMPACT;
            if (map.containsKey(enumC8521b2) && Boolean.parseBoolean(map.get(enumC8521b2).toString())) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        Charset charsetForName = f38605b;
        if (map != null && map.containsKey(EnumC8521b.CHARACTER_SET)) {
            z12 = true;
        }
        if (z12) {
            try {
                charsetForName = Charset.forName(map.get(EnumC8521b.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException unused) {
            }
        }
        if (z11) {
            enumC10579b = EnumC10579b.BYTE;
            if (charsetForName.equals(f38605b)) {
                charsetForName = null;
            }
            C10878f.c cVarM41388h = C10878f.m41388h(str, null, charsetForName, z10, enumC10578a);
            c9470a = new C9470a();
            cVarM41388h.m41407b(c9470a);
            c10580cM41410e = cVarM41388h.m41410e();
        } else {
            EnumC10579b enumC10579bM41346l = m41346l(str, charsetForName);
            C9470a c9470a2 = new C9470a();
            EnumC10579b enumC10579b2 = EnumC10579b.BYTE;
            if (enumC10579bM41346l == enumC10579b2 && z12 && (enumC9472cM37320a = EnumC9472c.m37320a(charsetForName)) != null) {
                m41338d(enumC9472cM37320a, c9470a2);
            }
            if (z10) {
                m41341g(EnumC10579b.FNC1_FIRST_POSITION, c9470a2);
            }
            m41341g(enumC10579bM41346l, c9470a2);
            C9470a c9470a3 = new C9470a();
            m41337c(str, enumC10579bM41346l, c9470a3, charsetForName);
            if (map != null) {
                EnumC8521b enumC8521b3 = EnumC8521b.QR_VERSION;
                if (map.containsKey(enumC8521b3)) {
                    c10580cM41354t = C10580c.m40553e(Integer.parseInt(map.get(enumC8521b3).toString()));
                    if (!m41356v(m41343i(enumC10579bM41346l, c9470a2, c9470a3, c10580cM41354t), c10580cM41354t, enumC10578a)) {
                        throw new C8522c("Data too big for requested version");
                    }
                } else {
                    c10580cM41354t = m41354t(enumC10578a, enumC10579bM41346l, c9470a2, c9470a3);
                }
            } else {
                c10580cM41354t = m41354t(enumC10578a, enumC10579bM41346l, c9470a2, c9470a3);
            }
            C9470a c9470a4 = new C9470a();
            c9470a4.m37306b(c9470a2);
            m41340f(enumC10579bM41346l == enumC10579b2 ? c9470a3.m37312j() : str.length(), c10580cM41354t, enumC10579bM41346l, c9470a4);
            c9470a4.m37306b(c9470a3);
            enumC10579b = enumC10579bM41346l;
            c10580cM41410e = c10580cM41354t;
            c9470a = c9470a4;
        }
        C10580c.b bVarM40555c = c10580cM41410e.m40555c(enumC10578a);
        int iM40556d = c10580cM41410e.m40556d() - bVarM40555c.m40563d();
        m41355u(iM40556d, c9470a);
        C9470a c9470aM41352r = m41352r(c9470a, c10580cM41410e.m40556d(), iM40556d, bVarM40555c.m40562c());
        C10879g c10879g = new C10879g();
        c10879g.m41420c(enumC10578a);
        c10879g.m41423f(enumC10579b);
        c10879g.m41424g(c10580cM41410e);
        int iM40554b = c10580cM41410e.m40554b();
        C10874b c10874b = new C10874b(iM40554b, iM40554b);
        if (map != null) {
            EnumC8521b enumC8521b4 = EnumC8521b.QR_MASK_PATTERN;
            if (map.containsKey(enumC8521b4)) {
                iM41345k = Integer.parseInt(map.get(enumC8521b4).toString());
                if (!C10879g.m41418b(iM41345k)) {
                    iM41345k = -1;
                }
            } else {
                iM41345k = -1;
            }
        } else {
            iM41345k = -1;
        }
        if (iM41345k == -1) {
            iM41345k = m41345k(c9470aM41352r, enumC10578a, c10580cM41410e, c10874b);
        }
        c10879g.m41421d(iM41345k);
        C10877e.m41365a(c9470aM41352r, enumC10578a, c10580cM41410e, iM41345k, c10874b);
        c10879g.m41422e(c10874b);
        return c10879g;
    }

    /* JADX INFO: renamed from: o */
    public static byte[] m41349o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new C9733c(C9731a.f35411l).m38519b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: p */
    public static int m41350p(int i10) {
        int[] iArr = f38604a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    /* JADX INFO: renamed from: q */
    public static void m41351q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws C8522c {
        if (i13 >= i12) {
            throw new C8522c("Block ID too large");
        }
        int i14 = i10 % i12;
        int i15 = i12 - i14;
        int i16 = i10 / i12;
        int i17 = i16 + 1;
        int i18 = i11 / i12;
        int i19 = i18 + 1;
        int i20 = i16 - i18;
        int i21 = i17 - i19;
        if (i20 != i21) {
            throw new C8522c("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new C8522c("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new C8522c("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    /* JADX INFO: renamed from: r */
    public static C9470a m41352r(C9470a c9470a, int i10, int i11, int i12) throws C8522c {
        if (c9470a.m37312j() != i11) {
            throw new C8522c("Number of bits and data bytes does not match");
        }
        ArrayList arrayList = new ArrayList(i12);
        int i13 = 0;
        int i14 = 0;
        int iMax = 0;
        int iMax2 = 0;
        while (i13 < i12) {
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            int i15 = i10;
            int i16 = i11;
            int i17 = i12;
            m41351q(i15, i16, i17, i13, iArr, iArr2);
            int i18 = iArr[0];
            byte[] bArr = new byte[i18];
            c9470a.m37313n(i14 * 8, bArr, 0, i18);
            byte[] bArrM41349o = m41349o(bArr, iArr2[0]);
            arrayList.add(new C10873a(bArr, bArrM41349o));
            iMax = Math.max(iMax, i18);
            iMax2 = Math.max(iMax2, bArrM41349o.length);
            i14 += iArr[0];
            i13++;
            i10 = i15;
            i11 = i16;
            i12 = i17;
        }
        int i19 = i10;
        if (i11 != i14) {
            throw new C8522c("Data bytes does not match offset");
        }
        C9470a c9470a2 = new C9470a();
        for (int i20 = 0; i20 < iMax; i20++) {
            int size = arrayList.size();
            int i21 = 0;
            while (i21 < size) {
                Object obj = arrayList.get(i21);
                i21++;
                byte[] bArrM41326a = ((C10873a) obj).m41326a();
                if (i20 < bArrM41326a.length) {
                    c9470a2.m37307c(bArrM41326a[i20], 8);
                }
            }
        }
        for (int i22 = 0; i22 < iMax2; i22++) {
            int size2 = arrayList.size();
            int i23 = 0;
            while (i23 < size2) {
                Object obj2 = arrayList.get(i23);
                i23++;
                byte[] bArrM41327b = ((C10873a) obj2).m41327b();
                if (i22 < bArrM41327b.length) {
                    c9470a2.m37307c(bArrM41327b[i22], 8);
                }
            }
        }
        if (i19 == c9470a2.m37312j()) {
            return c9470a2;
        }
        throw new C8522c("Interleaving error: " + i19 + " and " + c9470a2.m37312j() + " differ.");
    }

    /* JADX INFO: renamed from: s */
    public static boolean m41353s(String str) {
        byte[] bytes = str.getBytes(C9474e.f34079b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            int i11 = bytes[i10] & 255;
            if ((i11 < 129 || i11 > 159) && (i11 < 224 || i11 > 235)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: t */
    public static C10580c m41354t(EnumC10578a enumC10578a, EnumC10579b enumC10579b, C9470a c9470a, C9470a c9470a2) {
        return m41347m(m41343i(enumC10579b, c9470a, c9470a2, m41347m(m41343i(enumC10579b, c9470a, c9470a2, C10580c.m40553e(1)), enumC10578a)), enumC10578a);
    }

    /* JADX INFO: renamed from: u */
    public static void m41355u(int i10, C9470a c9470a) throws C8522c {
        int i11 = i10 * 8;
        if (c9470a.m37311i() > i11) {
            throw new C8522c("data bits cannot fit in the QR Code" + c9470a.m37311i() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && c9470a.m37311i() < i11; i12++) {
            c9470a.m37305a(false);
        }
        int iM37311i = c9470a.m37311i() & 7;
        if (iM37311i > 0) {
            while (iM37311i < 8) {
                c9470a.m37305a(false);
                iM37311i++;
            }
        }
        int iM37312j = i10 - c9470a.m37312j();
        for (int i13 = 0; i13 < iM37312j; i13++) {
            c9470a.m37307c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (c9470a.m37311i() != i11) {
            throw new C8522c("Bits size does not equal capacity");
        }
    }

    /* JADX INFO: renamed from: v */
    public static boolean m41356v(int i10, C10580c c10580c, EnumC10578a enumC10578a) {
        return c10580c.m40556d() - c10580c.m40555c(enumC10578a).m40563d() >= (i10 + 7) / 8;
    }
}
