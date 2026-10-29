package u4;

import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f32068a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};

    public static void A(@NonNull byte[] bArr, int i10, int i11, @NonNull b bVar) {
        int iM = m(i10, i11, bVar.f32054g);
        int i12 = iM / 8;
        bArr[i12] = (byte) ((1 << (iM % 8)) | bArr[i12]);
    }

    public static void B(@NonNull InputStream inputStream) {
        c.h(inputStream);
        int iJ = c.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            c.j(inputStream);
            for (int iJ2 = c.j(inputStream); iJ2 > 0; iJ2--) {
                c.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean C(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull b[] bVarArr) throws IOException {
        if (Arrays.equals(bArr, j.f32069a)) {
            P(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.b)) {
            O(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f32071d)) {
            M(outputStream, bVarArr);
            return true;
        }
        if (Arrays.equals(bArr, j.f32070c)) {
            N(outputStream, bVarArr);
            return true;
        }
        if (!Arrays.equals(bArr, j.f32072e)) {
            return false;
        }
        L(outputStream, bVarArr);
        return true;
    }

    public static void D(@NonNull OutputStream outputStream, @NonNull b bVar) throws IOException {
        int[] iArr = bVar.f32055h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            c.p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    public static k E(@NonNull b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c.p(byteArrayOutputStream, bVarArr.length);
            int i10 = 2;
            for (b bVar : bVarArr) {
                c.q(byteArrayOutputStream, bVar.f32050c);
                c.q(byteArrayOutputStream, bVar.f32051d);
                c.q(byteArrayOutputStream, bVar.f32054g);
                String strJ = j(bVar.f32049a, bVar.b, j.f32069a);
                int iK = c.k(strJ);
                c.p(byteArrayOutputStream, iK);
                i10 = i10 + 14 + iK;
                c.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                k kVar = new k(d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return kVar;
            }
            throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void F(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f32068a);
        outputStream.write(bArr);
    }

    public static void G(@NonNull OutputStream outputStream, @NonNull b bVar) throws IOException {
        K(outputStream, bVar);
        D(outputStream, bVar);
        I(outputStream, bVar);
    }

    public static void H(@NonNull OutputStream outputStream, @NonNull b bVar, @NonNull String str) throws IOException {
        c.p(outputStream, c.k(str));
        c.p(outputStream, bVar.f32052e);
        c.q(outputStream, bVar.f32053f);
        c.q(outputStream, bVar.f32050c);
        c.q(outputStream, bVar.f32054g);
        c.n(outputStream, str);
    }

    public static void I(@NonNull OutputStream outputStream, @NonNull b bVar) throws IOException {
        byte[] bArr = new byte[k(bVar.f32054g)];
        for (Map.Entry<Integer, Integer> entry : bVar.f32056i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                A(bArr, 2, iIntValue, bVar);
            }
            if ((iIntValue2 & 4) != 0) {
                A(bArr, 4, iIntValue, bVar);
            }
        }
        outputStream.write(bArr);
    }

    public static void J(@NonNull OutputStream outputStream, int i10, @NonNull b bVar) throws IOException {
        byte[] bArr = new byte[l(i10, bVar.f32054g)];
        for (Map.Entry<Integer, Integer> entry : bVar.f32056i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i10) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (bVar.f32054g * i11) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    public static void K(@NonNull OutputStream outputStream, @NonNull b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f32056i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                c.p(outputStream, iIntValue - i10);
                c.p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    public static void L(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) throws IOException {
        c.p(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            String strJ = j(bVar.f32049a, bVar.b, j.f32072e);
            c.p(outputStream, c.k(strJ));
            c.p(outputStream, bVar.f32056i.size());
            c.p(outputStream, bVar.f32055h.length);
            c.q(outputStream, bVar.f32050c);
            c.n(outputStream, strJ);
            Iterator<Integer> it = bVar.f32056i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, it.next().intValue());
            }
            for (int i10 : bVar.f32055h) {
                c.p(outputStream, i10);
            }
        }
    }

    public static void M(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) throws IOException {
        c.r(outputStream, bVarArr.length);
        for (b bVar : bVarArr) {
            int size = bVar.f32056i.size() * 4;
            String strJ = j(bVar.f32049a, bVar.b, j.f32071d);
            c.p(outputStream, c.k(strJ));
            c.p(outputStream, bVar.f32055h.length);
            c.q(outputStream, size);
            c.q(outputStream, bVar.f32050c);
            c.n(outputStream, strJ);
            Iterator<Integer> it = bVar.f32056i.keySet().iterator();
            while (it.hasNext()) {
                c.p(outputStream, it.next().intValue());
                c.p(outputStream, 0);
            }
            for (int i10 : bVar.f32055h) {
                c.p(outputStream, i10);
            }
        }
    }

    public static void N(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) throws IOException {
        byte[] bArrB = b(bVarArr, j.f32070c);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, bArrB);
    }

    public static void O(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) throws IOException {
        byte[] bArrB = b(bVarArr, j.b);
        c.r(outputStream, bVarArr.length);
        c.m(outputStream, bArrB);
    }

    public static void P(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) throws IOException {
        Q(outputStream, bVarArr);
    }

    public static void Q(@NonNull OutputStream outputStream, @NonNull b[] bVarArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(E(bVarArr));
        arrayList.add(c(bVarArr));
        arrayList.add(d(bVarArr));
        long length2 = ((long) j.f32069a.length) + ((long) f32068a.length) + 4 + ((long) (arrayList.size() * 16));
        c.q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            k kVar = (k) arrayList.get(i10);
            c.q(outputStream, kVar.f32075a.b());
            c.q(outputStream, length2);
            if (kVar.f32077d) {
                byte[] bArr = kVar.f32076c;
                long length3 = bArr.length;
                byte[] bArrB = c.b(bArr);
                arrayList2.add(bArrB);
                c.q(outputStream, bArrB.length);
                c.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(kVar.f32076c);
                c.q(outputStream, kVar.f32076c.length);
                c.q(outputStream, 0L);
                length = kVar.f32076c.length;
            }
            length2 += (long) length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    public static int a(@NonNull b bVar) {
        Iterator<Map.Entry<Integer, Integer>> it = bVar.f32056i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @NonNull
    public static byte[] b(@NonNull b[] bVarArr, @NonNull byte[] bArr) throws IOException {
        int i10 = 0;
        int iK = 0;
        for (b bVar : bVarArr) {
            iK += c.k(j(bVar.f32049a, bVar.b, bArr)) + 16 + (bVar.f32052e * 2) + bVar.f32053f + k(bVar.f32054g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, j.f32070c)) {
            int length = bVarArr.length;
            while (i10 < length) {
                b bVar2 = bVarArr[i10];
                H(byteArrayOutputStream, bVar2, j(bVar2.f32049a, bVar2.b, bArr));
                G(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                H(byteArrayOutputStream, bVar3, j(bVar3.f32049a, bVar3.b, bArr));
            }
            int length2 = bVarArr.length;
            while (i10 < length2) {
                G(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static k c(@NonNull b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                b bVar = bVarArr[i11];
                c.p(byteArrayOutputStream, i11);
                c.p(byteArrayOutputStream, bVar.f32052e);
                i10 = i10 + 4 + (bVar.f32052e * 2);
                D(byteArrayOutputStream, bVar);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            k kVar = new k(d.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static k d(@NonNull b[] bVarArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < bVarArr.length; i11++) {
            try {
                b bVar = bVarArr[i11];
                int iA = a(bVar);
                byte[] bArrE = e(iA, bVar);
                byte[] bArrF = f(bVar);
                c.p(byteArrayOutputStream, i11);
                int length = bArrE.length + 2 + bArrF.length;
                c.q(byteArrayOutputStream, length);
                c.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i10 = i10 + 6 + length;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i10 == byteArray.length) {
            k kVar = new k(d.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return kVar;
        }
        throw c.c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(int i10, @NonNull b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            J(byteArrayOutputStream, i10, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static byte[] f(@NonNull b bVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            K(byteArrayOutputStream, bVar);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static String g(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @NonNull
    public static String h(@NonNull String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static b i(@NonNull b[] bVarArr, @NonNull String str) {
        if (bVarArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            if (bVarArr[i10].b.equals(strH)) {
                return bVarArr[i10];
            }
        }
        return null;
    }

    @NonNull
    public static String j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strA = j.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + j.a(bArr) + str2;
    }

    public static int k(int i10) {
        return z(i10 * 2) / 8;
    }

    public static int l(int i10, int i11) {
        return z(Integer.bitCount(i10 & (-2)) * i11) / 8;
    }

    public static int m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw c.c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw c.c("Unexpected flag: " + i10);
    }

    public static int[] n(@NonNull InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int iH = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iH += c.h(inputStream);
            iArr[i11] = iH;
        }
        return iArr;
    }

    public static int o(@NonNull BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m(4, i10, i11)) ? i12 | 4 : i12;
    }

    public static byte[] p(@NonNull InputStream inputStream, @NonNull byte[] bArr) {
        if (Arrays.equals(bArr, c.d(inputStream, bArr.length))) {
            return c.d(inputStream, j.b.length);
        }
        throw c.c("Invalid magic");
    }

    public static void q(@NonNull InputStream inputStream, @NonNull b bVar) {
        int iAvailable = inputStream.available() - bVar.f32053f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += c.h(inputStream);
            bVar.f32056i.put(Integer.valueOf(iH), 1);
            for (int iH2 = c.h(inputStream); iH2 > 0; iH2--) {
                B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw c.c("Read too much data during profile line parse");
        }
    }

    @NonNull
    public static b[] r(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, b[] bVarArr) {
        if (Arrays.equals(bArr, j.f32073f)) {
            if (Arrays.equals(j.f32069a, bArr2)) {
                throw c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return s(inputStream, bArr, bVarArr);
        }
        if (Arrays.equals(bArr, j.f32074g)) {
            return u(inputStream, bArr2, bVarArr);
        }
        throw c.c("Unsupported meta version");
    }

    @NonNull
    public static b[] s(@NonNull InputStream inputStream, @NonNull byte[] bArr, b[] bVarArr) throws IOException {
        if (!Arrays.equals(bArr, j.f32073f)) {
            throw c.c("Unsupported meta version");
        }
        int iJ = c.j(inputStream);
        byte[] bArrE = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            b[] bVarArrT = t(byteArrayInputStream, iJ, bVarArr);
            byteArrayInputStream.close();
            return bVarArrT;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static b[] t(@NonNull InputStream inputStream, int i10, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw c.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = c.h(inputStream);
            iArr[i11] = c.h(inputStream);
            strArr[i11] = c.f(inputStream, iH);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.b.equals(strArr[i12])) {
                throw c.c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f32052e = i13;
            bVar.f32055h = n(inputStream, i13);
        }
        return bVarArr;
    }

    @NonNull
    public static b[] u(@NonNull InputStream inputStream, @NonNull byte[] bArr, b[] bVarArr) throws IOException {
        int iH = c.h(inputStream);
        byte[] bArrE = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            b[] bVarArrV = v(byteArrayInputStream, bArr, iH, bVarArr);
            byteArrayInputStream.close();
            return bVarArrV;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static b[] v(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i10, b[] bVarArr) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw c.c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            c.h(inputStream);
            String strF = c.f(inputStream, c.h(inputStream));
            long jI = c.i(inputStream);
            int iH = c.h(inputStream);
            b bVarI = i(bVarArr, strF);
            if (bVarI == null) {
                throw c.c("Missing profile key: " + strF);
            }
            bVarI.f32051d = jI;
            int[] iArrN = n(inputStream, iH);
            if (Arrays.equals(bArr, j.f32072e)) {
                bVarI.f32052e = iH;
                bVarI.f32055h = iArrN;
            }
        }
        return bVarArr;
    }

    public static void w(@NonNull InputStream inputStream, @NonNull b bVar) {
        BitSet bitSetValueOf = BitSet.valueOf(c.d(inputStream, c.a(bVar.f32054g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = bVar.f32054g;
            if (i10 >= i11) {
                return;
            }
            int iO = o(bitSetValueOf, i10, i11);
            if (iO != 0) {
                Integer num = bVar.f32056i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                bVar.f32056i.put(Integer.valueOf(i10), Integer.valueOf(iO | num.intValue()));
            }
            i10++;
        }
    }

    @NonNull
    public static b[] x(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, j.b)) {
            throw c.c("Unsupported version");
        }
        int iJ = c.j(inputStream);
        byte[] bArrE = c.e(inputStream, (int) c.i(inputStream), (int) c.i(inputStream));
        if (inputStream.read() > 0) {
            throw c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            b[] bVarArrY = y(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return bVarArrY;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @NonNull
    public static b[] y(@NonNull InputStream inputStream, @NonNull String str, int i10) {
        if (inputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iH = c.h(inputStream);
            int iH2 = c.h(inputStream);
            bVarArr[i11] = new b(str, c.f(inputStream, iH), c.i(inputStream), 0L, iH2, (int) c.i(inputStream), (int) c.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            q(inputStream, bVar);
            bVar.f32055h = n(inputStream, bVar.f32052e);
            w(inputStream, bVar);
        }
        return bVarArr;
    }

    public static int z(int i10) {
        return (i10 + 7) & (-8);
    }
}
