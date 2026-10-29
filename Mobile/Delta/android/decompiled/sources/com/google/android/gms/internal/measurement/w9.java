package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f6865a = 100;

    public static int a(byte[] bArr, int i10, v9 v9Var) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return b(b, bArr, i11, v9Var);
        }
        v9Var.f6849a = b;
        return i11;
    }

    public static int b(int i10, byte[] bArr, int i11, v9 v9Var) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            v9Var.f6849a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            v9Var.f6849a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            v9Var.f6849a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            v9Var.f6849a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                v9Var.f6849a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int c(byte[] bArr, int i10, v9 v9Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            v9Var.b = j10;
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
        v9Var.b = j11;
        return i12;
    }

    public static int d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public static long e(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    public static int f(byte[] bArr, int i10, v9 v9Var) throws sb {
        int i11;
        int iA = a(bArr, i10, v9Var);
        int i12 = v9Var.f6849a;
        if (i12 < 0) {
            throw new sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            v9Var.f6850c = "";
            return iA;
        }
        int i13 = vd.f6854a;
        int length = bArr.length;
        if ((((length - iA) - i12) | iA | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iA), Integer.valueOf(i12)));
        }
        int i14 = iA + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iA < i14) {
            byte b = bArr[iA];
            if (!td.a(b)) {
                break;
            }
            iA++;
            cArr[i15] = (char) b;
            i15++;
        }
        int i16 = i15;
        while (iA < i14) {
            int i17 = iA + 1;
            byte b10 = bArr[iA];
            if (td.a(b10)) {
                cArr[i16] = (char) b10;
                i16++;
                iA = i17;
                while (iA < i14) {
                    byte b11 = bArr[iA];
                    if (!td.a(b11)) {
                        break;
                    }
                    iA++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
            } else {
                if (b10 < -32) {
                    if (i17 >= i14) {
                        throw new sb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iA += 2;
                    td.b(b10, bArr[i17], cArr, i16);
                } else if (b10 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new sb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iA + 2;
                    iA += 3;
                    td.c(b10, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new sb("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i17];
                    int i19 = iA + 3;
                    byte b13 = bArr[iA + 2];
                    iA += 4;
                    td.d(b10, b12, b13, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        v9Var.f6850c = new String(cArr, 0, i16);
        return i14;
    }

    public static int g(byte[] bArr, int i10, v9 v9Var) throws sb {
        int iA = a(bArr, i10, v9Var);
        int i11 = v9Var.f6849a;
        if (i11 < 0) {
            throw new sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iA) {
            throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            v9Var.f6850c = ha.b;
            return iA;
        }
        v9Var.f6850c = ha.h(bArr, iA, i11);
        return iA + i11;
    }

    public static int h(zc zcVar, byte[] bArr, int i10, int i11, v9 v9Var) throws sb {
        Object objZza = zcVar.zza();
        int iJ = j(objZza, zcVar, bArr, i10, i11, v9Var);
        zcVar.c(objZza);
        v9Var.f6850c = objZza;
        return iJ;
    }

    public static int i(zc zcVar, byte[] bArr, int i10, int i11, int i12, v9 v9Var) throws sb {
        Object objZza = zcVar.zza();
        int iK = k(objZza, zcVar, bArr, i10, i11, i12, v9Var);
        zcVar.c(objZza);
        v9Var.f6850c = objZza;
        return iK;
    }

    public static int j(Object obj, zc zcVar, byte[] bArr, int i10, int i11, v9 v9Var) throws sb {
        int iB = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iB = b(i12, bArr, iB, v9Var);
            i12 = v9Var.f6849a;
        }
        int i13 = iB;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = v9Var.f6852e + 1;
        v9Var.f6852e = i14;
        q(i14);
        int i15 = i13 + i12;
        zcVar.d(obj, bArr, i13, i15, v9Var);
        v9Var.f6852e--;
        v9Var.f6850c = obj;
        return i15;
    }

    public static int k(Object obj, zc zcVar, byte[] bArr, int i10, int i11, int i12, v9 v9Var) throws sb {
        int i13 = v9Var.f6852e + 1;
        v9Var.f6852e = i13;
        q(i13);
        int iX = ((rc) zcVar).x(obj, bArr, i10, i11, i12, v9Var);
        v9Var.f6852e--;
        v9Var.f6850c = obj;
        return iX;
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, pb pbVar, v9 v9Var) {
        hb hbVar = (hb) pbVar;
        int iA = a(bArr, i11, v9Var);
        hbVar.w(v9Var.f6849a);
        while (iA < i12) {
            int iA2 = a(bArr, iA, v9Var);
            if (i10 != v9Var.f6849a) {
                break;
            }
            iA = a(bArr, iA2, v9Var);
            hbVar.w(v9Var.f6849a);
        }
        return iA;
    }

    public static int m(byte[] bArr, int i10, pb pbVar, v9 v9Var) throws sb {
        hb hbVar = (hb) pbVar;
        int iA = a(bArr, i10, v9Var);
        int i11 = v9Var.f6849a + iA;
        while (iA < i11) {
            iA = a(bArr, iA, v9Var);
            hbVar.w(v9Var.f6849a);
        }
        if (iA == i11) {
            return iA;
        }
        throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int n(zc zcVar, int i10, byte[] bArr, int i11, int i12, pb pbVar, v9 v9Var) throws sb {
        int iH = h(zcVar, bArr, i11, i12, v9Var);
        pbVar.add(v9Var.f6850c);
        while (iH < i12) {
            int iA = a(bArr, iH, v9Var);
            if (i10 != v9Var.f6849a) {
                break;
            }
            iH = h(zcVar, bArr, iA, i12, v9Var);
            pbVar.add(v9Var.f6850c);
        }
        return iH;
    }

    public static int o(int i10, byte[] bArr, int i11, int i12, md mdVar, v9 v9Var) throws sb {
        if ((i10 >>> 3) == 0) {
            throw new sb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iC = c(bArr, i11, v9Var);
            mdVar.k(i10, Long.valueOf(v9Var.b));
            return iC;
        }
        if (i13 == 1) {
            mdVar.k(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iA = a(bArr, i11, v9Var);
            int i14 = v9Var.f6849a;
            if (i14 < 0) {
                throw new sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iA) {
                throw new sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                mdVar.k(i10, ha.b);
            } else {
                mdVar.k(i10, ha.h(bArr, iA, i14));
            }
            return iA + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new sb("Protocol message contained an invalid tag (zero).");
            }
            mdVar.k(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        md mdVarB = md.b();
        int i16 = v9Var.f6852e + 1;
        v9Var.f6852e = i16;
        q(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iA2 = a(bArr, i11, v9Var);
            int i18 = v9Var.f6849a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iA2;
                break;
            }
            i11 = o(i18, bArr, iA2, i12, mdVarB, v9Var);
            i17 = i18;
        }
        v9Var.f6852e--;
        if (i11 > i12 || i17 != i15) {
            throw new sb("Failed to parse the message.");
        }
        mdVar.k(i10, mdVarB);
        return i11;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, v9 v9Var) throws sb {
        if ((i10 >>> 3) == 0) {
            throw new sb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, v9Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, v9Var) + v9Var.f6849a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new sb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, v9Var);
            i15 = v9Var.f6849a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, v9Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new sb("Failed to parse the message.");
        }
        return i11;
    }

    public static void q(int i10) throws sb {
        if (i10 >= f6865a) {
            throw new sb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
