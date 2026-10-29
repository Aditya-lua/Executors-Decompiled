package p458u4;

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

/* JADX INFO: renamed from: u4.i */
/* JADX INFO: loaded from: classes.dex */
public class C11798i {

    /* JADX INFO: renamed from: a */
    public static final byte[] f41538a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b */
    public static final byte[] f41539b = {112, 114, 109, 0};

    /* JADX INFO: renamed from: A */
    public static void m44107A(@NonNull byte[] bArr, int i10, int i11, @NonNull C11791b c11791b) {
        int iM44136m = m44136m(i10, i11, c11791b.f41521g);
        int i12 = iM44136m / 8;
        bArr[i12] = (byte) ((1 << (iM44136m % 8)) | bArr[i12]);
    }

    /* JADX INFO: renamed from: B */
    public static void m44108B(@NonNull InputStream inputStream) {
        C11792c.m44094h(inputStream);
        int iM44096j = C11792c.m44096j(inputStream);
        if (iM44096j == 6 || iM44096j == 7) {
            return;
        }
        while (iM44096j > 0) {
            C11792c.m44096j(inputStream);
            for (int iM44096j2 = C11792c.m44096j(inputStream); iM44096j2 > 0; iM44096j2--) {
                C11792c.m44094h(inputStream);
            }
            iM44096j--;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m44109C(@NonNull OutputStream outputStream, @NonNull byte[] bArr, @NonNull C11791b[] c11791bArr) throws IOException {
        if (Arrays.equals(bArr, C11799j.f41540a)) {
            m44122P(outputStream, c11791bArr);
            return true;
        }
        if (Arrays.equals(bArr, C11799j.f41541b)) {
            m44121O(outputStream, c11791bArr);
            return true;
        }
        if (Arrays.equals(bArr, C11799j.f41543d)) {
            m44119M(outputStream, c11791bArr);
            return true;
        }
        if (Arrays.equals(bArr, C11799j.f41542c)) {
            m44120N(outputStream, c11791bArr);
            return true;
        }
        if (!Arrays.equals(bArr, C11799j.f41544e)) {
            return false;
        }
        m44118L(outputStream, c11791bArr);
        return true;
    }

    /* JADX INFO: renamed from: D */
    public static void m44110D(@NonNull OutputStream outputStream, @NonNull C11791b c11791b) throws IOException {
        int[] iArr = c11791b.f41522h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            C11792c.m44102p(outputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
    }

    /* JADX INFO: renamed from: E */
    public static C11800k m44111E(@NonNull C11791b[] c11791bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            C11792c.m44102p(byteArrayOutputStream, c11791bArr.length);
            int i10 = 2;
            for (C11791b c11791b : c11791bArr) {
                C11792c.m44103q(byteArrayOutputStream, c11791b.f41517c);
                C11792c.m44103q(byteArrayOutputStream, c11791b.f41518d);
                C11792c.m44103q(byteArrayOutputStream, c11791b.f41521g);
                String strM44133j = m44133j(c11791b.f41515a, c11791b.f41516b, C11799j.f41540a);
                int iM44097k = C11792c.m44097k(strM44133j);
                C11792c.m44102p(byteArrayOutputStream, iM44097k);
                i10 = i10 + 14 + iM44097k;
                C11792c.m44100n(byteArrayOutputStream, strM44133j);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i10 == byteArray.length) {
                C11800k c11800k = new C11800k(EnumC11793d.DEX_FILES, i10, byteArray, false);
                byteArrayOutputStream.close();
                return c11800k;
            }
            throw C11792c.m44089c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th2) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m44112F(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f41538a);
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: G */
    public static void m44113G(@NonNull OutputStream outputStream, @NonNull C11791b c11791b) throws IOException {
        m44117K(outputStream, c11791b);
        m44110D(outputStream, c11791b);
        m44115I(outputStream, c11791b);
    }

    /* JADX INFO: renamed from: H */
    public static void m44114H(@NonNull OutputStream outputStream, @NonNull C11791b c11791b, @NonNull String str) throws IOException {
        C11792c.m44102p(outputStream, C11792c.m44097k(str));
        C11792c.m44102p(outputStream, c11791b.f41519e);
        C11792c.m44103q(outputStream, c11791b.f41520f);
        C11792c.m44103q(outputStream, c11791b.f41517c);
        C11792c.m44103q(outputStream, c11791b.f41521g);
        C11792c.m44100n(outputStream, str);
    }

    /* JADX INFO: renamed from: I */
    public static void m44115I(@NonNull OutputStream outputStream, @NonNull C11791b c11791b) throws IOException {
        byte[] bArr = new byte[m44134k(c11791b.f41521g)];
        for (Map.Entry<Integer, Integer> entry : c11791b.f41523i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                m44107A(bArr, 2, iIntValue, c11791b);
            }
            if ((iIntValue2 & 4) != 0) {
                m44107A(bArr, 4, iIntValue, c11791b);
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: J */
    public static void m44116J(@NonNull OutputStream outputStream, int i10, @NonNull C11791b c11791b) throws IOException {
        byte[] bArr = new byte[m44135l(i10, c11791b.f41521g)];
        for (Map.Entry<Integer, Integer> entry : c11791b.f41523i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i10) != 0) {
                    if ((i12 & iIntValue2) == i12) {
                        int i13 = (c11791b.f41521g * i11) + iIntValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: K */
    public static void m44117K(@NonNull OutputStream outputStream, @NonNull C11791b c11791b) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : c11791b.f41523i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                C11792c.m44102p(outputStream, iIntValue - i10);
                C11792c.m44102p(outputStream, 0);
                i10 = iIntValue;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static void m44118L(@NonNull OutputStream outputStream, @NonNull C11791b[] c11791bArr) throws IOException {
        C11792c.m44102p(outputStream, c11791bArr.length);
        for (C11791b c11791b : c11791bArr) {
            String strM44133j = m44133j(c11791b.f41515a, c11791b.f41516b, C11799j.f41544e);
            C11792c.m44102p(outputStream, C11792c.m44097k(strM44133j));
            C11792c.m44102p(outputStream, c11791b.f41523i.size());
            C11792c.m44102p(outputStream, c11791b.f41522h.length);
            C11792c.m44103q(outputStream, c11791b.f41517c);
            C11792c.m44100n(outputStream, strM44133j);
            Iterator<Integer> it = c11791b.f41523i.keySet().iterator();
            while (it.hasNext()) {
                C11792c.m44102p(outputStream, it.next().intValue());
            }
            for (int i10 : c11791b.f41522h) {
                C11792c.m44102p(outputStream, i10);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static void m44119M(@NonNull OutputStream outputStream, @NonNull C11791b[] c11791bArr) throws IOException {
        C11792c.m44104r(outputStream, c11791bArr.length);
        for (C11791b c11791b : c11791bArr) {
            int size = c11791b.f41523i.size() * 4;
            String strM44133j = m44133j(c11791b.f41515a, c11791b.f41516b, C11799j.f41543d);
            C11792c.m44102p(outputStream, C11792c.m44097k(strM44133j));
            C11792c.m44102p(outputStream, c11791b.f41522h.length);
            C11792c.m44103q(outputStream, size);
            C11792c.m44103q(outputStream, c11791b.f41517c);
            C11792c.m44100n(outputStream, strM44133j);
            Iterator<Integer> it = c11791b.f41523i.keySet().iterator();
            while (it.hasNext()) {
                C11792c.m44102p(outputStream, it.next().intValue());
                C11792c.m44102p(outputStream, 0);
            }
            for (int i10 : c11791b.f41522h) {
                C11792c.m44102p(outputStream, i10);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m44120N(@NonNull OutputStream outputStream, @NonNull C11791b[] c11791bArr) throws IOException {
        byte[] bArrM44125b = m44125b(c11791bArr, C11799j.f41542c);
        C11792c.m44104r(outputStream, c11791bArr.length);
        C11792c.m44099m(outputStream, bArrM44125b);
    }

    /* JADX INFO: renamed from: O */
    public static void m44121O(@NonNull OutputStream outputStream, @NonNull C11791b[] c11791bArr) throws IOException {
        byte[] bArrM44125b = m44125b(c11791bArr, C11799j.f41541b);
        C11792c.m44104r(outputStream, c11791bArr.length);
        C11792c.m44099m(outputStream, bArrM44125b);
    }

    /* JADX INFO: renamed from: P */
    public static void m44122P(@NonNull OutputStream outputStream, @NonNull C11791b[] c11791bArr) throws IOException {
        m44123Q(outputStream, c11791bArr);
    }

    /* JADX INFO: renamed from: Q */
    public static void m44123Q(@NonNull OutputStream outputStream, @NonNull C11791b[] c11791bArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(m44111E(c11791bArr));
        arrayList.add(m44126c(c11791bArr));
        arrayList.add(m44127d(c11791bArr));
        long length2 = ((long) C11799j.f41540a.length) + ((long) f41538a.length) + 4 + ((long) (arrayList.size() * 16));
        C11792c.m44103q(outputStream, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            C11800k c11800k = (C11800k) arrayList.get(i10);
            C11792c.m44103q(outputStream, c11800k.f41547a.m44106b());
            C11792c.m44103q(outputStream, length2);
            if (c11800k.f41550d) {
                byte[] bArr = c11800k.f41549c;
                long length3 = bArr.length;
                byte[] bArrM44088b = C11792c.m44088b(bArr);
                arrayList2.add(bArrM44088b);
                C11792c.m44103q(outputStream, bArrM44088b.length);
                C11792c.m44103q(outputStream, length3);
                length = bArrM44088b.length;
            } else {
                arrayList2.add(c11800k.f41549c);
                C11792c.m44103q(outputStream, c11800k.f41549c.length);
                C11792c.m44103q(outputStream, 0L);
                length = c11800k.f41549c.length;
            }
            length2 += (long) length;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            outputStream.write((byte[]) arrayList2.get(i11));
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m44124a(@NonNull C11791b c11791b) {
        Iterator<Map.Entry<Integer, Integer>> it = c11791b.f41523i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= it.next().getValue().intValue();
        }
        return iIntValue;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static byte[] m44125b(@NonNull C11791b[] c11791bArr, @NonNull byte[] bArr) throws IOException {
        int i10 = 0;
        int iM44097k = 0;
        for (C11791b c11791b : c11791bArr) {
            iM44097k += C11792c.m44097k(m44133j(c11791b.f41515a, c11791b.f41516b, bArr)) + 16 + (c11791b.f41519e * 2) + c11791b.f41520f + m44134k(c11791b.f41521g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iM44097k);
        if (Arrays.equals(bArr, C11799j.f41542c)) {
            int length = c11791bArr.length;
            while (i10 < length) {
                C11791b c11791b2 = c11791bArr[i10];
                m44114H(byteArrayOutputStream, c11791b2, m44133j(c11791b2.f41515a, c11791b2.f41516b, bArr));
                m44113G(byteArrayOutputStream, c11791b2);
                i10++;
            }
        } else {
            for (C11791b c11791b3 : c11791bArr) {
                m44114H(byteArrayOutputStream, c11791b3, m44133j(c11791b3.f41515a, c11791b3.f41516b, bArr));
            }
            int length2 = c11791bArr.length;
            while (i10 < length2) {
                m44113G(byteArrayOutputStream, c11791bArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == iM44097k) {
            return byteArrayOutputStream.toByteArray();
        }
        throw C11792c.m44089c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iM44097k);
    }

    /* JADX INFO: renamed from: c */
    public static C11800k m44126c(@NonNull C11791b[] c11791bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c11791bArr.length; i11++) {
            try {
                C11791b c11791b = c11791bArr[i11];
                C11792c.m44102p(byteArrayOutputStream, i11);
                C11792c.m44102p(byteArrayOutputStream, c11791b.f41519e);
                i10 = i10 + 4 + (c11791b.f41519e * 2);
                m44110D(byteArrayOutputStream, c11791b);
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
            C11800k c11800k = new C11800k(EnumC11793d.CLASSES, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c11800k;
        }
        throw C11792c.m44089c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: d */
    public static C11800k m44127d(@NonNull C11791b[] c11791bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        for (int i11 = 0; i11 < c11791bArr.length; i11++) {
            try {
                C11791b c11791b = c11791bArr[i11];
                int iM44124a = m44124a(c11791b);
                byte[] bArrM44128e = m44128e(iM44124a, c11791b);
                byte[] bArrM44129f = m44129f(c11791b);
                C11792c.m44102p(byteArrayOutputStream, i11);
                int length = bArrM44128e.length + 2 + bArrM44129f.length;
                C11792c.m44103q(byteArrayOutputStream, length);
                C11792c.m44102p(byteArrayOutputStream, iM44124a);
                byteArrayOutputStream.write(bArrM44128e);
                byteArrayOutputStream.write(bArrM44129f);
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
            C11800k c11800k = new C11800k(EnumC11793d.METHODS, i10, byteArray, true);
            byteArrayOutputStream.close();
            return c11800k;
        }
        throw C11792c.m44089c("Expected size " + i10 + ", does not match actual size " + byteArray.length);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m44128e(int i10, @NonNull C11791b c11791b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m44116J(byteArrayOutputStream, i10, c11791b);
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

    /* JADX INFO: renamed from: f */
    public static byte[] m44129f(@NonNull C11791b c11791b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            m44117K(byteArrayOutputStream, c11791b);
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
    /* JADX INFO: renamed from: g */
    public static String m44130g(@NonNull String str, @NonNull String str2) {
        if ("!".equals(str2)) {
            return str.replace(":", "!");
        }
        return ":".equals(str2) ? str.replace("!", ":") : str;
    }

    @NonNull
    /* JADX INFO: renamed from: h */
    public static String m44131h(@NonNull String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    /* JADX INFO: renamed from: i */
    public static C11791b m44132i(@NonNull C11791b[] c11791bArr, @NonNull String str) {
        if (c11791bArr.length <= 0) {
            return null;
        }
        String strM44131h = m44131h(str);
        for (int i10 = 0; i10 < c11791bArr.length; i10++) {
            if (c11791bArr[i10].f41516b.equals(strM44131h)) {
                return c11791bArr[i10];
            }
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: j */
    public static String m44133j(@NonNull String str, @NonNull String str2, @NonNull byte[] bArr) {
        String strM44150a = C11799j.m44150a(bArr);
        if (str.length() <= 0) {
            return m44130g(str2, strM44150a);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return m44130g(str2, strM44150a);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + C11799j.m44150a(bArr) + str2;
    }

    /* JADX INFO: renamed from: k */
    public static int m44134k(int i10) {
        return m44149z(i10 * 2) / 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m44135l(int i10, int i11) {
        return m44149z(Integer.bitCount(i10 & (-2)) * i11) / 8;
    }

    /* JADX INFO: renamed from: m */
    public static int m44136m(int i10, int i11, int i12) {
        if (i10 == 1) {
            throw C11792c.m44089c("HOT methods are not stored in the bitmap");
        }
        if (i10 == 2) {
            return i11;
        }
        if (i10 == 4) {
            return i11 + i12;
        }
        throw C11792c.m44089c("Unexpected flag: " + i10);
    }

    /* JADX INFO: renamed from: n */
    public static int[] m44137n(@NonNull InputStream inputStream, int i10) {
        int[] iArr = new int[i10];
        int iM44094h = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iM44094h += C11792c.m44094h(inputStream);
            iArr[i11] = iM44094h;
        }
        return iArr;
    }

    /* JADX INFO: renamed from: o */
    public static int m44138o(@NonNull BitSet bitSet, int i10, int i11) {
        int i12 = bitSet.get(m44136m(2, i10, i11)) ? 2 : 0;
        return bitSet.get(m44136m(4, i10, i11)) ? i12 | 4 : i12;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m44139p(@NonNull InputStream inputStream, @NonNull byte[] bArr) {
        if (Arrays.equals(bArr, C11792c.m44090d(inputStream, bArr.length))) {
            return C11792c.m44090d(inputStream, C11799j.f41541b.length);
        }
        throw C11792c.m44089c("Invalid magic");
    }

    /* JADX INFO: renamed from: q */
    public static void m44140q(@NonNull InputStream inputStream, @NonNull C11791b c11791b) {
        int iAvailable = inputStream.available() - c11791b.f41520f;
        int iM44094h = 0;
        while (inputStream.available() > iAvailable) {
            iM44094h += C11792c.m44094h(inputStream);
            c11791b.f41523i.put(Integer.valueOf(iM44094h), 1);
            for (int iM44094h2 = C11792c.m44094h(inputStream); iM44094h2 > 0; iM44094h2--) {
                m44108B(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw C11792c.m44089c("Read too much data during profile line parse");
        }
    }

    @NonNull
    /* JADX INFO: renamed from: r */
    public static C11791b[] m44141r(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull byte[] bArr2, C11791b[] c11791bArr) {
        if (Arrays.equals(bArr, C11799j.f41545f)) {
            if (Arrays.equals(C11799j.f41540a, bArr2)) {
                throw C11792c.m44089c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return m44142s(inputStream, bArr, c11791bArr);
        }
        if (Arrays.equals(bArr, C11799j.f41546g)) {
            return m44144u(inputStream, bArr2, c11791bArr);
        }
        throw C11792c.m44089c("Unsupported meta version");
    }

    @NonNull
    /* JADX INFO: renamed from: s */
    public static C11791b[] m44142s(@NonNull InputStream inputStream, @NonNull byte[] bArr, C11791b[] c11791bArr) throws IOException {
        if (!Arrays.equals(bArr, C11799j.f41545f)) {
            throw C11792c.m44089c("Unsupported meta version");
        }
        int iM44096j = C11792c.m44096j(inputStream);
        byte[] bArrM44091e = C11792c.m44091e(inputStream, (int) C11792c.m44095i(inputStream), (int) C11792c.m44095i(inputStream));
        if (inputStream.read() > 0) {
            throw C11792c.m44089c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM44091e);
        try {
            C11791b[] c11791bArrM44143t = m44143t(byteArrayInputStream, iM44096j, c11791bArr);
            byteArrayInputStream.close();
            return c11791bArrM44143t;
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
    /* JADX INFO: renamed from: t */
    public static C11791b[] m44143t(@NonNull InputStream inputStream, int i10, C11791b[] c11791bArr) {
        if (inputStream.available() == 0) {
            return new C11791b[0];
        }
        if (i10 != c11791bArr.length) {
            throw C11792c.m44089c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM44094h = C11792c.m44094h(inputStream);
            iArr[i11] = C11792c.m44094h(inputStream);
            strArr[i11] = C11792c.m44092f(inputStream, iM44094h);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C11791b c11791b = c11791bArr[i12];
            if (!c11791b.f41516b.equals(strArr[i12])) {
                throw C11792c.m44089c("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            c11791b.f41519e = i13;
            c11791b.f41522h = m44137n(inputStream, i13);
        }
        return c11791bArr;
    }

    @NonNull
    /* JADX INFO: renamed from: u */
    public static C11791b[] m44144u(@NonNull InputStream inputStream, @NonNull byte[] bArr, C11791b[] c11791bArr) throws IOException {
        int iM44094h = C11792c.m44094h(inputStream);
        byte[] bArrM44091e = C11792c.m44091e(inputStream, (int) C11792c.m44095i(inputStream), (int) C11792c.m44095i(inputStream));
        if (inputStream.read() > 0) {
            throw C11792c.m44089c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM44091e);
        try {
            C11791b[] c11791bArrM44145v = m44145v(byteArrayInputStream, bArr, iM44094h, c11791bArr);
            byteArrayInputStream.close();
            return c11791bArrM44145v;
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
    /* JADX INFO: renamed from: v */
    public static C11791b[] m44145v(@NonNull InputStream inputStream, @NonNull byte[] bArr, int i10, C11791b[] c11791bArr) {
        if (inputStream.available() == 0) {
            return new C11791b[0];
        }
        if (i10 != c11791bArr.length) {
            throw C11792c.m44089c("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            C11792c.m44094h(inputStream);
            String strM44092f = C11792c.m44092f(inputStream, C11792c.m44094h(inputStream));
            long jM44095i = C11792c.m44095i(inputStream);
            int iM44094h = C11792c.m44094h(inputStream);
            C11791b c11791bM44132i = m44132i(c11791bArr, strM44092f);
            if (c11791bM44132i == null) {
                throw C11792c.m44089c("Missing profile key: " + strM44092f);
            }
            c11791bM44132i.f41518d = jM44095i;
            int[] iArrM44137n = m44137n(inputStream, iM44094h);
            if (Arrays.equals(bArr, C11799j.f41544e)) {
                c11791bM44132i.f41519e = iM44094h;
                c11791bM44132i.f41522h = iArrM44137n;
            }
        }
        return c11791bArr;
    }

    /* JADX INFO: renamed from: w */
    public static void m44146w(@NonNull InputStream inputStream, @NonNull C11791b c11791b) {
        BitSet bitSetValueOf = BitSet.valueOf(C11792c.m44090d(inputStream, C11792c.m44087a(c11791b.f41521g * 2)));
        int i10 = 0;
        while (true) {
            int i11 = c11791b.f41521g;
            if (i10 >= i11) {
                return;
            }
            int iM44138o = m44138o(bitSetValueOf, i10, i11);
            if (iM44138o != 0) {
                Integer num = c11791b.f41523i.get(Integer.valueOf(i10));
                if (num == null) {
                    num = 0;
                }
                c11791b.f41523i.put(Integer.valueOf(i10), Integer.valueOf(iM44138o | num.intValue()));
            }
            i10++;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public static C11791b[] m44147x(@NonNull InputStream inputStream, @NonNull byte[] bArr, @NonNull String str) throws IOException {
        if (!Arrays.equals(bArr, C11799j.f41541b)) {
            throw C11792c.m44089c("Unsupported version");
        }
        int iM44096j = C11792c.m44096j(inputStream);
        byte[] bArrM44091e = C11792c.m44091e(inputStream, (int) C11792c.m44095i(inputStream), (int) C11792c.m44095i(inputStream));
        if (inputStream.read() > 0) {
            throw C11792c.m44089c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrM44091e);
        try {
            C11791b[] c11791bArrM44148y = m44148y(byteArrayInputStream, str, iM44096j);
            byteArrayInputStream.close();
            return c11791bArrM44148y;
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
    /* JADX INFO: renamed from: y */
    public static C11791b[] m44148y(@NonNull InputStream inputStream, @NonNull String str, int i10) {
        if (inputStream.available() == 0) {
            return new C11791b[0];
        }
        C11791b[] c11791bArr = new C11791b[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iM44094h = C11792c.m44094h(inputStream);
            int iM44094h2 = C11792c.m44094h(inputStream);
            c11791bArr[i11] = new C11791b(str, C11792c.m44092f(inputStream, iM44094h), C11792c.m44095i(inputStream), 0L, iM44094h2, (int) C11792c.m44095i(inputStream), (int) C11792c.m44095i(inputStream), new int[iM44094h2], new TreeMap());
        }
        for (int i12 = 0; i12 < i10; i12++) {
            C11791b c11791b = c11791bArr[i12];
            m44140q(inputStream, c11791b);
            c11791b.f41522h = m44137n(inputStream, c11791b.f41519e);
            m44146w(inputStream, c11791b);
        }
        return c11791bArr;
    }

    /* JADX INFO: renamed from: z */
    public static int m44149z(int i10) {
        return (i10 + 7) & (-8);
    }
}
