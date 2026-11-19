package ah;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f433a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};
    public static final Charset b = StandardCharsets.ISO_8859_1;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f434a;

        static {
            int[] iArr = new int[zg.b.values().length];
            f434a = iArr;
            try {
                iArr[zg.b.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f434a[zg.b.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f434a[zg.b.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f434a[zg.b.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a(String str, wg.a aVar, Charset charset) {
        for (byte b10 : str.getBytes(charset)) {
            aVar.c(b10, 8);
        }
    }

    public static void b(CharSequence charSequence, wg.a aVar) throws vg.c {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iP = p(charSequence.charAt(i10));
            if (iP == -1) {
                throw new vg.c();
            }
            int i11 = i10 + 1;
            if (i11 < length) {
                int iP2 = p(charSequence.charAt(i11));
                if (iP2 == -1) {
                    throw new vg.c();
                }
                aVar.c((iP * 45) + iP2, 11);
                i10 += 2;
            } else {
                aVar.c(iP, 6);
                i10 = i11;
            }
        }
    }

    public static void c(String str, zg.b bVar, wg.a aVar, Charset charset) {
        int i10 = a.f434a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
            return;
        }
        if (i10 == 2) {
            b(str, aVar);
            return;
        }
        if (i10 == 3) {
            a(str, aVar, charset);
        } else {
            if (i10 == 4) {
                e(str, aVar);
                return;
            }
            throw new vg.c("Invalid mode: " + bVar);
        }
    }

    public static void d(wg.c cVar, wg.a aVar) {
        aVar.c(zg.b.ECI.a(), 4);
        aVar.c(cVar.c(), 8);
    }

    public static void e(String str, wg.a aVar) throws vg.c {
        int i10;
        Charset charset = wg.e.b;
        if (charset == null) {
            throw new vg.c("SJIS Charset not supported on this platform");
        }
        byte[] bytes = str.getBytes(charset);
        if (bytes.length % 2 != 0) {
            throw new vg.c("Kanji byte size not even");
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
                throw new vg.c("Invalid byte sequence");
            }
            aVar.c(((i10 >> 8) * 192) + (i10 & 255), 13);
        }
    }

    public static void f(int i10, zg.c cVar, zg.b bVar, wg.a aVar) throws vg.c {
        int iB = bVar.b(cVar);
        int i11 = 1 << iB;
        if (i10 < i11) {
            aVar.c(i10, iB);
            return;
        }
        throw new vg.c(i10 + " is bigger than " + (i11 - 1));
    }

    public static void g(zg.b bVar, wg.a aVar) {
        aVar.c(bVar.a(), 4);
    }

    public static void h(CharSequence charSequence, wg.a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int iCharAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((iCharAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((iCharAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(iCharAt, 4);
                }
            }
        }
    }

    public static int i(zg.b bVar, wg.a aVar, wg.a aVar2, zg.c cVar) {
        return aVar.k() + bVar.b(cVar) + aVar2.k();
    }

    public static int j(b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    public static int k(wg.a aVar, zg.a aVar2, zg.c cVar, b bVar) throws vg.c {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int iJ = j(bVar);
            if (iJ < i10) {
                i11 = i12;
                i10 = iJ;
            }
        }
        return i11;
    }

    public static zg.b l(String str, Charset charset) {
        Charset charset2 = wg.e.b;
        if (charset2 != null && charset2.equals(charset) && s(str)) {
            return zg.b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= '0' && cCharAt <= '9') {
                z11 = true;
            } else {
                if (p(cCharAt) == -1) {
                    return zg.b.BYTE;
                }
                z10 = true;
            }
        }
        if (z10) {
            return zg.b.ALPHANUMERIC;
        }
        return z11 ? zg.b.NUMERIC : zg.b.BYTE;
    }

    public static zg.c m(int i10, zg.a aVar) throws vg.c {
        for (int i11 = 1; i11 <= 40; i11++) {
            zg.c cVarE = zg.c.e(i11);
            if (v(i10, cVarE, aVar)) {
                return cVarE;
            }
        }
        throw new vg.c("Data too big");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0037  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:59:0x013d  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public static g n(String str, zg.a aVar, Map<vg.b, ?> map) throws vg.c {
        boolean z10;
        boolean z11;
        zg.c cVarT;
        zg.b bVar;
        zg.c cVarE;
        wg.a aVar2;
        wg.c cVarA;
        int iK;
        boolean z12 = false;
        if (map != null) {
            vg.b bVar2 = vg.b.GS1_FORMAT;
            if (map.containsKey(bVar2) && Boolean.parseBoolean(map.get(bVar2).toString())) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (map != null) {
            vg.b bVar3 = vg.b.QR_COMPACT;
            if (map.containsKey(bVar3) && Boolean.parseBoolean(map.get(bVar3).toString())) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        Charset charsetForName = b;
        if (map != null && map.containsKey(vg.b.CHARACTER_SET)) {
            z12 = true;
        }
        if (z12) {
            try {
                charsetForName = Charset.forName(map.get(vg.b.CHARACTER_SET).toString());
            } catch (UnsupportedCharsetException unused) {
            }
        }
        if (z11) {
            bVar = zg.b.BYTE;
            if (charsetForName.equals(b)) {
                charsetForName = null;
            }
            f.c cVarH = f.h(str, null, charsetForName, z10, aVar);
            aVar2 = new wg.a();
            cVarH.b(aVar2);
            cVarE = cVarH.e();
        } else {
            zg.b bVarL = l(str, charsetForName);
            wg.a aVar3 = new wg.a();
            zg.b bVar4 = zg.b.BYTE;
            if (bVarL == bVar4 && z12 && (cVarA = wg.c.a(charsetForName)) != null) {
                d(cVarA, aVar3);
            }
            if (z10) {
                g(zg.b.FNC1_FIRST_POSITION, aVar3);
            }
            g(bVarL, aVar3);
            wg.a aVar4 = new wg.a();
            c(str, bVarL, aVar4, charsetForName);
            if (map != null) {
                vg.b bVar5 = vg.b.QR_VERSION;
                if (map.containsKey(bVar5)) {
                    cVarT = zg.c.e(Integer.parseInt(map.get(bVar5).toString()));
                    if (!v(i(bVarL, aVar3, aVar4, cVarT), cVarT, aVar)) {
                        throw new vg.c("Data too big for requested version");
                    }
                } else {
                    cVarT = t(aVar, bVarL, aVar3, aVar4);
                }
            } else {
                cVarT = t(aVar, bVarL, aVar3, aVar4);
            }
            wg.a aVar5 = new wg.a();
            aVar5.b(aVar3);
            f(bVarL == bVar4 ? aVar4.l() : str.length(), cVarT, bVarL, aVar5);
            aVar5.b(aVar4);
            bVar = bVarL;
            cVarE = cVarT;
            aVar2 = aVar5;
        }
        zg.c.b bVarC = cVarE.c(aVar);
        int iD = cVarE.d() - bVarC.d();
        u(iD, aVar2);
        wg.a aVarR = r(aVar2, cVarE.d(), iD, bVarC.c());
        g gVar = new g();
        gVar.c(aVar);
        gVar.f(bVar);
        gVar.g(cVarE);
        int iB = cVarE.b();
        b bVar6 = new b(iB, iB);
        if (map != null) {
            vg.b bVar7 = vg.b.QR_MASK_PATTERN;
            if (map.containsKey(bVar7)) {
                iK = Integer.parseInt(map.get(bVar7).toString());
                if (!g.b(iK)) {
                    iK = -1;
                }
            } else {
                iK = -1;
            }
        } else {
            iK = -1;
        }
        if (iK == -1) {
            iK = k(aVarR, aVar, cVarE, bVar6);
        }
        gVar.d(iK);
        e.a(aVarR, aVar, cVarE, iK, bVar6);
        gVar.e(bVar6);
        return gVar;
    }

    public static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[length + i10];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new xg.c(xg.a.f36671l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    public static int p(int i10) {
        int[] iArr = f433a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    public static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) throws vg.c {
        if (i13 >= i12) {
            throw new vg.c("Block ID too large");
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
            throw new vg.c("EC bytes mismatch");
        }
        if (i12 != i15 + i14) {
            throw new vg.c("RS blocks mismatch");
        }
        if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
            throw new vg.c("Total bytes mismatch");
        }
        if (i13 < i15) {
            iArr[0] = i18;
            iArr2[0] = i20;
        } else {
            iArr[0] = i19;
            iArr2[0] = i21;
        }
    }

    public static wg.a r(wg.a aVar, int i10, int i11, int i12) throws vg.c {
        if (aVar.l() != i11) {
            throw new vg.c("Number of bits and data bytes does not match");
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
            q(i15, i16, i17, i13, iArr, iArr2);
            int i18 = iArr[0];
            byte[] bArr = new byte[i18];
            aVar.p(i14 * 8, bArr, 0, i18);
            byte[] bArrO = o(bArr, iArr2[0]);
            arrayList.add(new ah.a(bArr, bArrO));
            iMax = Math.max(iMax, i18);
            iMax2 = Math.max(iMax2, bArrO.length);
            i14 += iArr[0];
            i13++;
            i10 = i15;
            i11 = i16;
            i12 = i17;
        }
        int i19 = i10;
        if (i11 != i14) {
            throw new vg.c("Data bytes does not match offset");
        }
        wg.a aVar2 = new wg.a();
        for (int i20 = 0; i20 < iMax; i20++) {
            int size = arrayList.size();
            int i21 = 0;
            while (i21 < size) {
                Object obj = arrayList.get(i21);
                i21++;
                byte[] bArrA = ((ah.a) obj).a();
                if (i20 < bArrA.length) {
                    aVar2.c(bArrA[i20], 8);
                }
            }
        }
        for (int i22 = 0; i22 < iMax2; i22++) {
            int size2 = arrayList.size();
            int i23 = 0;
            while (i23 < size2) {
                Object obj2 = arrayList.get(i23);
                i23++;
                byte[] bArrB = ((ah.a) obj2).b();
                if (i22 < bArrB.length) {
                    aVar2.c(bArrB[i22], 8);
                }
            }
        }
        if (i19 == aVar2.l()) {
            return aVar2;
        }
        throw new vg.c("Interleaving error: " + i19 + " and " + aVar2.l() + " differ.");
    }

    public static boolean s(String str) {
        byte[] bytes = str.getBytes(wg.e.b);
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

    public static zg.c t(zg.a aVar, zg.b bVar, wg.a aVar2, wg.a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, zg.c.e(1)), aVar)), aVar);
    }

    public static void u(int i10, wg.a aVar) throws vg.c {
        int i11 = i10 * 8;
        if (aVar.k() > i11) {
            throw new vg.c("data bits cannot fit in the QR Code" + aVar.k() + " > " + i11);
        }
        for (int i12 = 0; i12 < 4 && aVar.k() < i11; i12++) {
            aVar.a(false);
        }
        int iK = aVar.k() & 7;
        if (iK > 0) {
            while (iK < 8) {
                aVar.a(false);
                iK++;
            }
        }
        int iL = i10 - aVar.l();
        for (int i13 = 0; i13 < iL; i13++) {
            aVar.c((i13 & 1) == 0 ? 236 : 17, 8);
        }
        if (aVar.k() != i11) {
            throw new vg.c("Bits size does not equal capacity");
        }
    }

    public static boolean v(int i10, zg.c cVar, zg.a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}
