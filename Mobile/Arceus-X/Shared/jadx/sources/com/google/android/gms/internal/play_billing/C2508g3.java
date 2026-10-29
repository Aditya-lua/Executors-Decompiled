package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2508g3 {

    /* JADX INFO: renamed from: a */
    public static volatile int f8983a = 100;

    /* JADX INFO: renamed from: a */
    public static int m11420a(byte[] bArr, int i10, C2497f3 c2497f3) {
        int iM11428i = m11428i(bArr, i10, c2497f3);
        int i11 = c2497f3.f8963a;
        if (i11 < 0) {
            throw new C2499f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM11428i) {
            throw new C2499f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c2497f3.f8965c = AbstractC2640s3.f9227b;
            return iM11428i;
        }
        c2497f3.f8965c = AbstractC2640s3.m11719k(bArr, iM11428i, i11);
        return iM11428i + i11;
    }

    /* JADX INFO: renamed from: b */
    public static int m11421b(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: renamed from: c */
    public static int m11422c(InterfaceC2522h6 interfaceC2522h6, byte[] bArr, int i10, int i11, int i12, C2497f3 c2497f3) {
        Object objZze = interfaceC2522h6.zze();
        int iM11432m = m11432m(objZze, interfaceC2522h6, bArr, i10, i11, i12, c2497f3);
        interfaceC2522h6.mo11214b(objZze);
        c2497f3.f8965c = objZze;
        return iM11432m;
    }

    /* JADX INFO: renamed from: d */
    public static int m11423d(InterfaceC2522h6 interfaceC2522h6, byte[] bArr, int i10, int i11, C2497f3 c2497f3) {
        Object objZze = interfaceC2522h6.zze();
        int iM11433n = m11433n(objZze, interfaceC2522h6, bArr, i10, i11, c2497f3);
        interfaceC2522h6.mo11214b(objZze);
        c2497f3.f8965c = objZze;
        return iM11433n;
    }

    /* JADX INFO: renamed from: e */
    public static int m11424e(InterfaceC2522h6 interfaceC2522h6, int i10, byte[] bArr, int i11, int i12, InterfaceC2707y4 interfaceC2707y4, C2497f3 c2497f3) {
        int iM11423d = m11423d(interfaceC2522h6, bArr, i11, i12, c2497f3);
        interfaceC2707y4.add(c2497f3.f8965c);
        while (iM11423d < i12) {
            int iM11428i = m11428i(bArr, iM11423d, c2497f3);
            if (i10 != c2497f3.f8963a) {
                break;
            }
            iM11423d = m11423d(interfaceC2522h6, bArr, iM11428i, i12, c2497f3);
            interfaceC2707y4.add(c2497f3.f8965c);
        }
        return iM11423d;
    }

    /* JADX INFO: renamed from: f */
    public static int m11425f(byte[] bArr, int i10, InterfaceC2707y4 interfaceC2707y4, C2497f3 c2497f3) {
        C2663u4 c2663u4 = (C2663u4) interfaceC2707y4;
        int iM11428i = m11428i(bArr, i10, c2497f3);
        int i11 = c2497f3.f8963a;
        if (i11 < 0) {
            throw new C2499f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM11428i) {
            throw new C2499f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i12 = i11 + iM11428i;
        while (iM11428i < i12) {
            iM11428i = m11428i(bArr, iM11428i, c2497f3);
            c2663u4.mo11775w(c2497f3.f8963a);
        }
        if (iM11428i == i12) {
            return iM11428i;
        }
        throw new C2499f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: g */
    public static int m11426g(byte[] bArr, int i10, C2497f3 c2497f3) {
        int i11;
        int iM11428i = m11428i(bArr, i10, c2497f3);
        int i12 = c2497f3.f8963a;
        if (i12 < 0) {
            throw new C2499f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            c2497f3.f8965c = "";
            return iM11428i;
        }
        int i13 = C2490e7.f8962a;
        int length = bArr.length;
        if ((((length - iM11428i) - i12) | iM11428i | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM11428i), Integer.valueOf(i12)));
        }
        int i14 = iM11428i + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iM11428i < i14) {
            byte b = bArr[iM11428i];
            if (!C2457b7.m11319d(b)) {
                break;
            }
            iM11428i++;
            cArr[i15] = (char) b;
            i15++;
        }
        int i16 = i15;
        while (iM11428i < i14) {
            int i17 = iM11428i + 1;
            byte b10 = bArr[iM11428i];
            if (C2457b7.m11319d(b10)) {
                cArr[i16] = (char) b10;
                i16++;
                iM11428i = i17;
                while (iM11428i < i14) {
                    byte b11 = bArr[iM11428i];
                    if (!C2457b7.m11319d(b11)) {
                        break;
                    }
                    iM11428i++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
            } else {
                if (b10 < -32) {
                    if (i17 >= i14) {
                        throw new C2499f5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iM11428i += 2;
                    C2457b7.m11318c(b10, bArr[i17], cArr, i16);
                } else if (b10 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new C2499f5("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iM11428i + 2;
                    iM11428i += 3;
                    C2457b7.m11317b(b10, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new C2499f5("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i17];
                    int i19 = iM11428i + 3;
                    byte b13 = bArr[iM11428i + 2];
                    iM11428i += 4;
                    C2457b7.m11316a(b10, b12, b13, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        c2497f3.f8965c = new String(cArr, 0, i16);
        return i14;
    }

    /* JADX INFO: renamed from: h */
    public static int m11427h(int i10, byte[] bArr, int i11, int i12, C2665u6 c2665u6, C2497f3 c2497f3) {
        if ((i10 >>> 3) == 0) {
            throw new C2499f5("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM11431l = m11431l(bArr, i11, c2497f3);
            c2665u6.m11785j(i10, Long.valueOf(c2497f3.f8964b));
            return iM11431l;
        }
        if (i13 == 1) {
            c2665u6.m11785j(i10, Long.valueOf(m11434o(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM11428i = m11428i(bArr, i11, c2497f3);
            int i14 = c2497f3.f8963a;
            if (i14 < 0) {
                throw new C2499f5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iM11428i) {
                throw new C2499f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c2665u6.m11785j(i10, AbstractC2640s3.f9227b);
            } else {
                c2665u6.m11785j(i10, AbstractC2640s3.m11719k(bArr, iM11428i, i14));
            }
            return iM11428i + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C2499f5("Protocol message contained an invalid tag (zero).");
            }
            c2665u6.m11785j(i10, Integer.valueOf(m11421b(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2665u6 c2665u6M11778f = C2665u6.m11778f();
        int i16 = c2497f3.f8967e + 1;
        c2497f3.f8967e = i16;
        m11435p(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iM11428i2 = m11428i(bArr, i11, c2497f3);
            int i18 = c2497f3.f8963a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iM11428i2;
                break;
            }
            i11 = m11427h(i18, bArr, iM11428i2, i12, c2665u6M11778f, c2497f3);
            i17 = i18;
        }
        c2497f3.f8967e--;
        if (i11 > i12 || i17 != i15) {
            throw new C2499f5("Failed to parse the message.");
        }
        c2665u6.m11785j(i10, c2665u6M11778f);
        return i11;
    }

    /* JADX INFO: renamed from: i */
    public static int m11428i(byte[] bArr, int i10, C2497f3 c2497f3) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return m11429j(b, bArr, i11, c2497f3);
        }
        c2497f3.f8963a = b;
        return i11;
    }

    /* JADX INFO: renamed from: j */
    public static int m11429j(int i10, byte[] bArr, int i11, C2497f3 c2497f3) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            c2497f3.f8963a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            c2497f3.f8963a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c2497f3.f8963a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            c2497f3.f8963a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2497f3.f8963a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: renamed from: k */
    public static int m11430k(int i10, byte[] bArr, int i11, int i12, InterfaceC2707y4 interfaceC2707y4, C2497f3 c2497f3) {
        C2663u4 c2663u4 = (C2663u4) interfaceC2707y4;
        int iM11428i = m11428i(bArr, i11, c2497f3);
        c2663u4.mo11775w(c2497f3.f8963a);
        while (iM11428i < i12) {
            int iM11428i2 = m11428i(bArr, iM11428i, c2497f3);
            if (i10 != c2497f3.f8963a) {
                break;
            }
            iM11428i = m11428i(bArr, iM11428i2, c2497f3);
            c2663u4.mo11775w(c2497f3.f8963a);
        }
        return iM11428i;
    }

    /* JADX INFO: renamed from: l */
    public static int m11431l(byte[] bArr, int i10, C2497f3 c2497f3) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2497f3.f8964b = j10;
            return i11;
        }
        int i12 = i10 + 2;
        byte b = bArr[i11];
        long j11 = (j10 & 127) | (((long) (b & 127)) << 7);
        int i13 = 7;
        while (b < 0) {
            int i14 = i12 + 1;
            byte b10 = bArr[i12];
            i13 += 7;
            j11 |= ((long) (b10 & 127)) << i13;
            b = b10;
            i12 = i14;
        }
        c2497f3.f8964b = j11;
        return i12;
    }

    /* JADX INFO: renamed from: m */
    public static int m11432m(Object obj, InterfaceC2522h6 interfaceC2522h6, byte[] bArr, int i10, int i11, int i12, C2497f3 c2497f3) {
        int i13 = c2497f3.f8967e + 1;
        c2497f3.f8967e = i13;
        m11435p(i13);
        int iM11231v = ((C2445a6) interfaceC2522h6).m11231v(obj, bArr, i10, i11, i12, c2497f3);
        c2497f3.f8967e--;
        c2497f3.f8965c = obj;
        return iM11231v;
    }

    /* JADX INFO: renamed from: n */
    public static int m11433n(Object obj, InterfaceC2522h6 interfaceC2522h6, byte[] bArr, int i10, int i11, C2497f3 c2497f3) {
        int iM11429j = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM11429j = m11429j(i12, bArr, iM11429j, c2497f3);
            i12 = c2497f3.f8963a;
        }
        int i13 = iM11429j;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new C2499f5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c2497f3.f8967e + 1;
        c2497f3.f8967e = i14;
        m11435p(i14);
        int i15 = i13 + i12;
        interfaceC2522h6.mo11218f(obj, bArr, i13, i15, c2497f3);
        c2497f3.f8967e--;
        c2497f3.f8965c = obj;
        return i15;
    }

    /* JADX INFO: renamed from: o */
    public static long m11434o(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: p */
    public static void m11435p(int i10) throws C2499f5 {
        if (i10 >= f8983a) {
            throw new C2499f5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
