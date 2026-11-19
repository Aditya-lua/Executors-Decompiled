package com.google.android.gms.internal.measurement;

import com.github.luben.zstd.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class aa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f6371a = 100;

    public static int a(byte[] bArr, int i10, z9 z9Var) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return b(b, bArr, i11, z9Var);
        }
        z9Var.f6971a = b;
        return i11;
    }

    public static int b(int i10, byte[] bArr, int i11, z9 z9Var) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            z9Var.f6971a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            z9Var.f6971a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            z9Var.f6971a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            z9Var.f6971a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                z9Var.f6971a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int c(byte[] bArr, int i10, z9 z9Var) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            z9Var.b = j10;
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
        z9Var.b = j11;
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

    public static int f(byte[] bArr, int i10, z9 z9Var) throws wb {
        int i11;
        int iA = a(bArr, i10, z9Var);
        int i12 = z9Var.f6971a;
        if (i12 < 0) {
            throw new wb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            z9Var.f6972c = BuildConfig.FLAVOR;
            return iA;
        }
        int i13 = zd.f6976a;
        int length = bArr.length;
        if ((((length - iA) - i12) | iA | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iA), Integer.valueOf(i12)));
        }
        int i14 = iA + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iA < i14) {
            byte b = bArr[iA];
            if (!xd.a(b)) {
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
            if (xd.a(b10)) {
                cArr[i16] = (char) b10;
                i16++;
                iA = i17;
                while (iA < i14) {
                    byte b11 = bArr[iA];
                    if (!xd.a(b11)) {
                        break;
                    }
                    iA++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
            } else {
                if (b10 < -32) {
                    if (i17 >= i14) {
                        throw new wb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iA += 2;
                    xd.b(b10, bArr[i17], cArr, i16);
                } else if (b10 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new wb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iA + 2;
                    iA += 3;
                    xd.c(b10, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new wb("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i17];
                    int i19 = iA + 3;
                    byte b13 = bArr[iA + 2];
                    iA += 4;
                    xd.d(b10, b12, b13, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        z9Var.f6972c = new String(cArr, 0, i16);
        return i14;
    }

    public static int g(byte[] bArr, int i10, z9 z9Var) throws wb {
        int iA = a(bArr, i10, z9Var);
        int i11 = z9Var.f6971a;
        if (i11 < 0) {
            throw new wb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iA) {
            throw new wb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            z9Var.f6972c = la.b;
            return iA;
        }
        z9Var.f6972c = la.h(bArr, iA, i11);
        return iA + i11;
    }

    public static int h(dd ddVar, byte[] bArr, int i10, int i11, z9 z9Var) throws wb {
        Object objZza = ddVar.zza();
        int iJ = j(objZza, ddVar, bArr, i10, i11, z9Var);
        ddVar.c(objZza);
        z9Var.f6972c = objZza;
        return iJ;
    }

    public static int i(dd ddVar, byte[] bArr, int i10, int i11, int i12, z9 z9Var) throws wb {
        Object objZza = ddVar.zza();
        int iK = k(objZza, ddVar, bArr, i10, i11, i12, z9Var);
        ddVar.c(objZza);
        z9Var.f6972c = objZza;
        return iK;
    }

    public static int j(Object obj, dd ddVar, byte[] bArr, int i10, int i11, z9 z9Var) throws wb {
        int iB = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iB = b(i12, bArr, iB, z9Var);
            i12 = z9Var.f6971a;
        }
        int i13 = iB;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new wb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = z9Var.f6974e + 1;
        z9Var.f6974e = i14;
        q(i14);
        int i15 = i13 + i12;
        ddVar.d(obj, bArr, i13, i15, z9Var);
        z9Var.f6974e--;
        z9Var.f6972c = obj;
        return i15;
    }

    public static int k(Object obj, dd ddVar, byte[] bArr, int i10, int i11, int i12, z9 z9Var) throws wb {
        int i13 = z9Var.f6974e + 1;
        z9Var.f6974e = i13;
        q(i13);
        int iX = ((vc) ddVar).x(obj, bArr, i10, i11, i12, z9Var);
        z9Var.f6974e--;
        z9Var.f6972c = obj;
        return iX;
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, tb tbVar, z9 z9Var) {
        lb lbVar = (lb) tbVar;
        int iA = a(bArr, i11, z9Var);
        lbVar.z(z9Var.f6971a);
        while (iA < i12) {
            int iA2 = a(bArr, iA, z9Var);
            if (i10 != z9Var.f6971a) {
                break;
            }
            iA = a(bArr, iA2, z9Var);
            lbVar.z(z9Var.f6971a);
        }
        return iA;
    }

    public static int m(byte[] bArr, int i10, tb tbVar, z9 z9Var) throws wb {
        lb lbVar = (lb) tbVar;
        int iA = a(bArr, i10, z9Var);
        int i11 = z9Var.f6971a + iA;
        while (iA < i11) {
            iA = a(bArr, iA, z9Var);
            lbVar.z(z9Var.f6971a);
        }
        if (iA == i11) {
            return iA;
        }
        throw new wb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int n(dd ddVar, int i10, byte[] bArr, int i11, int i12, tb tbVar, z9 z9Var) throws wb {
        int iH = h(ddVar, bArr, i11, i12, z9Var);
        tbVar.add(z9Var.f6972c);
        while (iH < i12) {
            int iA = a(bArr, iH, z9Var);
            if (i10 != z9Var.f6971a) {
                break;
            }
            iH = h(ddVar, bArr, iA, i12, z9Var);
            tbVar.add(z9Var.f6972c);
        }
        return iH;
    }

    public static int o(int i10, byte[] bArr, int i11, int i12, qd qdVar, z9 z9Var) throws wb {
        if ((i10 >>> 3) == 0) {
            throw new wb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iC = c(bArr, i11, z9Var);
            qdVar.k(i10, Long.valueOf(z9Var.b));
            return iC;
        }
        if (i13 == 1) {
            qdVar.k(i10, Long.valueOf(e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iA = a(bArr, i11, z9Var);
            int i14 = z9Var.f6971a;
            if (i14 < 0) {
                throw new wb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iA) {
                throw new wb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                qdVar.k(i10, la.b);
            } else {
                qdVar.k(i10, la.h(bArr, iA, i14));
            }
            return iA + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new wb("Protocol message contained an invalid tag (zero).");
            }
            qdVar.k(i10, Integer.valueOf(d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        qd qdVarB = qd.b();
        int i16 = z9Var.f6974e + 1;
        z9Var.f6974e = i16;
        q(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iA2 = a(bArr, i11, z9Var);
            int i18 = z9Var.f6971a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iA2;
                break;
            }
            i11 = o(i18, bArr, iA2, i12, qdVarB, z9Var);
            i17 = i18;
        }
        z9Var.f6974e--;
        if (i11 > i12 || i17 != i15) {
            throw new wb("Failed to parse the message.");
        }
        qdVar.k(i10, qdVarB);
        return i11;
    }

    public static int p(int i10, byte[] bArr, int i11, int i12, z9 z9Var) throws wb {
        if ((i10 >>> 3) == 0) {
            throw new wb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return c(bArr, i11, z9Var);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return a(bArr, i11, z9Var) + z9Var.f6971a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new wb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = a(bArr, i11, z9Var);
            i15 = z9Var.f6971a;
            if (i15 == i14) {
                break;
            }
            i11 = p(i15, bArr, i11, i12, z9Var);
        }
        if (i11 > i12 || i15 != i14) {
            throw new wb("Failed to parse the message.");
        }
        return i11;
    }

    public static void q(int i10) throws wb {
        if (i10 >= f6371a) {
            throw new wb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
