package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2373w9 {

    /* JADX INFO: renamed from: a */
    public static volatile int f8735a = 100;

    /* JADX INFO: renamed from: a */
    public static int m10920a(byte[] bArr, int i10, C2355v9 c2355v9) {
        int i11 = i10 + 1;
        byte b = bArr[i10];
        if (b < 0) {
            return m10921b(b, bArr, i11, c2355v9);
        }
        c2355v9.f8714a = b;
        return i11;
    }

    /* JADX INFO: renamed from: b */
    public static int m10921b(int i10, byte[] bArr, int i11, C2355v9 c2355v9) {
        byte b = bArr[i11];
        int i12 = i11 + 1;
        int i13 = i10 & 127;
        if (b >= 0) {
            c2355v9.f8714a = i13 | (b << 7);
            return i12;
        }
        int i14 = i13 | ((b & 127) << 7);
        int i15 = i11 + 2;
        byte b10 = bArr[i12];
        if (b10 >= 0) {
            c2355v9.f8714a = i14 | (b10 << 14);
            return i15;
        }
        int i16 = i14 | ((b10 & 127) << 14);
        int i17 = i11 + 3;
        byte b11 = bArr[i15];
        if (b11 >= 0) {
            c2355v9.f8714a = i16 | (b11 << 21);
            return i17;
        }
        int i18 = i16 | ((b11 & 127) << 21);
        int i19 = i11 + 4;
        byte b12 = bArr[i17];
        if (b12 >= 0) {
            c2355v9.f8714a = i18 | (b12 << 28);
            return i19;
        }
        int i20 = i18 | ((b12 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                c2355v9.f8714a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m10922c(byte[] bArr, int i10, C2355v9 c2355v9) {
        long j10 = bArr[i10];
        int i11 = i10 + 1;
        if (j10 >= 0) {
            c2355v9.f8715b = j10;
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
        c2355v9.f8715b = j11;
        return i12;
    }

    /* JADX INFO: renamed from: d */
    public static int m10923d(byte[] bArr, int i10) {
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    /* JADX INFO: renamed from: e */
    public static long m10924e(byte[] bArr, int i10) {
        return (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48) | ((((long) bArr[i10 + 7]) & 255) << 56);
    }

    /* JADX INFO: renamed from: f */
    public static int m10925f(byte[] bArr, int i10, C2355v9 c2355v9) throws C2303sb {
        int i11;
        int iM10920a = m10920a(bArr, i10, c2355v9);
        int i12 = c2355v9.f8714a;
        if (i12 < 0) {
            throw new C2303sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i12 == 0) {
            c2355v9.f8716c = "";
            return iM10920a;
        }
        int i13 = C2359vd.f8720a;
        int length = bArr.length;
        if ((((length - iM10920a) - i12) | iM10920a | i12) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iM10920a), Integer.valueOf(i12)));
        }
        int i14 = iM10920a + i12;
        char[] cArr = new char[i12];
        int i15 = 0;
        while (iM10920a < i14) {
            byte b = bArr[iM10920a];
            if (!C2323td.m10770a(b)) {
                break;
            }
            iM10920a++;
            cArr[i15] = (char) b;
            i15++;
        }
        int i16 = i15;
        while (iM10920a < i14) {
            int i17 = iM10920a + 1;
            byte b10 = bArr[iM10920a];
            if (C2323td.m10770a(b10)) {
                cArr[i16] = (char) b10;
                i16++;
                iM10920a = i17;
                while (iM10920a < i14) {
                    byte b11 = bArr[iM10920a];
                    if (!C2323td.m10770a(b11)) {
                        break;
                    }
                    iM10920a++;
                    cArr[i16] = (char) b11;
                    i16++;
                }
            } else {
                if (b10 < -32) {
                    if (i17 >= i14) {
                        throw new C2303sb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    iM10920a += 2;
                    C2323td.m10771b(b10, bArr[i17], cArr, i16);
                } else if (b10 < -16) {
                    if (i17 >= i14 - 1) {
                        throw new C2303sb("Protocol message had invalid UTF-8.");
                    }
                    i11 = i16 + 1;
                    int i18 = iM10920a + 2;
                    iM10920a += 3;
                    C2323td.m10772c(b10, bArr[i17], bArr[i18], cArr, i16);
                } else {
                    if (i17 >= i14 - 2) {
                        throw new C2303sb("Protocol message had invalid UTF-8.");
                    }
                    byte b12 = bArr[i17];
                    int i19 = iM10920a + 3;
                    byte b13 = bArr[iM10920a + 2];
                    iM10920a += 4;
                    C2323td.m10773d(b10, b12, b13, bArr[i19], cArr, i16);
                    i16 += 2;
                }
                i16 = i11;
            }
        }
        c2355v9.f8716c = new String(cArr, 0, i16);
        return i14;
    }

    /* JADX INFO: renamed from: g */
    public static int m10926g(byte[] bArr, int i10, C2355v9 c2355v9) throws C2303sb {
        int iM10920a = m10920a(bArr, i10, c2355v9);
        int i11 = c2355v9.f8714a;
        if (i11 < 0) {
            throw new C2303sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 > bArr.length - iM10920a) {
            throw new C2303sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i11 == 0) {
            c2355v9.f8716c = AbstractC2104ha.f8218b;
            return iM10920a;
        }
        c2355v9.f8716c = AbstractC2104ha.m10185h(bArr, iM10920a, i11);
        return iM10920a + i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m10927h(InterfaceC2430zc interfaceC2430zc, byte[] bArr, int i10, int i11, C2355v9 c2355v9) throws C2303sb {
        Object objZza = interfaceC2430zc.zza();
        int iM10929j = m10929j(objZza, interfaceC2430zc, bArr, i10, i11, c2355v9);
        interfaceC2430zc.mo10658c(objZza);
        c2355v9.f8716c = objZza;
        return iM10929j;
    }

    /* JADX INFO: renamed from: i */
    public static int m10928i(InterfaceC2430zc interfaceC2430zc, byte[] bArr, int i10, int i11, int i12, C2355v9 c2355v9) throws C2303sb {
        Object objZza = interfaceC2430zc.zza();
        int iM10930k = m10930k(objZza, interfaceC2430zc, bArr, i10, i11, i12, c2355v9);
        interfaceC2430zc.mo10658c(objZza);
        c2355v9.f8716c = objZza;
        return iM10930k;
    }

    /* JADX INFO: renamed from: j */
    public static int m10929j(Object obj, InterfaceC2430zc interfaceC2430zc, byte[] bArr, int i10, int i11, C2355v9 c2355v9) throws C2303sb {
        int iM10921b = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM10921b = m10921b(i12, bArr, iM10921b, c2355v9);
            i12 = c2355v9.f8714a;
        }
        int i13 = iM10921b;
        if (i12 < 0 || i12 > i11 - i13) {
            throw new C2303sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i14 = c2355v9.f8718e + 1;
        c2355v9.f8718e = i14;
        m10936q(i14);
        int i15 = i13 + i12;
        interfaceC2430zc.mo10659d(obj, bArr, i13, i15, c2355v9);
        c2355v9.f8718e--;
        c2355v9.f8716c = obj;
        return i15;
    }

    /* JADX INFO: renamed from: k */
    public static int m10930k(Object obj, InterfaceC2430zc interfaceC2430zc, byte[] bArr, int i10, int i11, int i12, C2355v9 c2355v9) throws C2303sb {
        int i13 = c2355v9.f8718e + 1;
        c2355v9.f8718e = i13;
        m10936q(i13);
        int iM10669x = ((C2286rc) interfaceC2430zc).m10669x(obj, bArr, i10, i11, i12, c2355v9);
        c2355v9.f8718e--;
        c2355v9.f8716c = obj;
        return iM10669x;
    }

    /* JADX INFO: renamed from: l */
    public static int m10931l(int i10, byte[] bArr, int i11, int i12, InterfaceC2249pb interfaceC2249pb, C2355v9 c2355v9) {
        C2105hb c2105hb = (C2105hb) interfaceC2249pb;
        int iM10920a = m10920a(bArr, i11, c2355v9);
        c2105hb.m10195w(c2355v9.f8714a);
        while (iM10920a < i12) {
            int iM10920a2 = m10920a(bArr, iM10920a, c2355v9);
            if (i10 != c2355v9.f8714a) {
                break;
            }
            iM10920a = m10920a(bArr, iM10920a2, c2355v9);
            c2105hb.m10195w(c2355v9.f8714a);
        }
        return iM10920a;
    }

    /* JADX INFO: renamed from: m */
    public static int m10932m(byte[] bArr, int i10, InterfaceC2249pb interfaceC2249pb, C2355v9 c2355v9) throws C2303sb {
        C2105hb c2105hb = (C2105hb) interfaceC2249pb;
        int iM10920a = m10920a(bArr, i10, c2355v9);
        int i11 = c2355v9.f8714a + iM10920a;
        while (iM10920a < i11) {
            iM10920a = m10920a(bArr, iM10920a, c2355v9);
            c2105hb.m10195w(c2355v9.f8714a);
        }
        if (iM10920a == i11) {
            return iM10920a;
        }
        throw new C2303sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: n */
    public static int m10933n(InterfaceC2430zc interfaceC2430zc, int i10, byte[] bArr, int i11, int i12, InterfaceC2249pb interfaceC2249pb, C2355v9 c2355v9) throws C2303sb {
        int iM10927h = m10927h(interfaceC2430zc, bArr, i11, i12, c2355v9);
        interfaceC2249pb.add(c2355v9.f8716c);
        while (iM10927h < i12) {
            int iM10920a = m10920a(bArr, iM10927h, c2355v9);
            if (i10 != c2355v9.f8714a) {
                break;
            }
            iM10927h = m10927h(interfaceC2430zc, bArr, iM10920a, i12, c2355v9);
            interfaceC2249pb.add(c2355v9.f8716c);
        }
        return iM10927h;
    }

    /* JADX INFO: renamed from: o */
    public static int m10934o(int i10, byte[] bArr, int i11, int i12, C2197md c2197md, C2355v9 c2355v9) throws C2303sb {
        if ((i10 >>> 3) == 0) {
            throw new C2303sb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            int iM10922c = m10922c(bArr, i11, c2355v9);
            c2197md.m10399k(i10, Long.valueOf(c2355v9.f8715b));
            return iM10922c;
        }
        if (i13 == 1) {
            c2197md.m10399k(i10, Long.valueOf(m10924e(bArr, i11)));
            return i11 + 8;
        }
        if (i13 == 2) {
            int iM10920a = m10920a(bArr, i11, c2355v9);
            int i14 = c2355v9.f8714a;
            if (i14 < 0) {
                throw new C2303sb("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i14 > bArr.length - iM10920a) {
                throw new C2303sb("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i14 == 0) {
                c2197md.m10399k(i10, AbstractC2104ha.f8218b);
            } else {
                c2197md.m10399k(i10, AbstractC2104ha.m10185h(bArr, iM10920a, i14));
            }
            return iM10920a + i14;
        }
        if (i13 != 3) {
            if (i13 != 5) {
                throw new C2303sb("Protocol message contained an invalid tag (zero).");
            }
            c2197md.m10399k(i10, Integer.valueOf(m10923d(bArr, i11)));
            return i11 + 4;
        }
        int i15 = (i10 & (-8)) | 4;
        C2197md c2197mdM10390b = C2197md.m10390b();
        int i16 = c2355v9.f8718e + 1;
        c2355v9.f8718e = i16;
        m10936q(i16);
        int i17 = 0;
        while (i11 < i12) {
            int iM10920a2 = m10920a(bArr, i11, c2355v9);
            int i18 = c2355v9.f8714a;
            if (i18 == i15) {
                i17 = i18;
                i11 = iM10920a2;
                break;
            }
            i11 = m10934o(i18, bArr, iM10920a2, i12, c2197mdM10390b, c2355v9);
            i17 = i18;
        }
        c2355v9.f8718e--;
        if (i11 > i12 || i17 != i15) {
            throw new C2303sb("Failed to parse the message.");
        }
        c2197md.m10399k(i10, c2197mdM10390b);
        return i11;
    }

    /* JADX INFO: renamed from: p */
    public static int m10935p(int i10, byte[] bArr, int i11, int i12, C2355v9 c2355v9) throws C2303sb {
        if ((i10 >>> 3) == 0) {
            throw new C2303sb("Protocol message contained an invalid tag (zero).");
        }
        int i13 = i10 & 7;
        if (i13 == 0) {
            return m10922c(bArr, i11, c2355v9);
        }
        if (i13 == 1) {
            return i11 + 8;
        }
        if (i13 == 2) {
            return m10920a(bArr, i11, c2355v9) + c2355v9.f8714a;
        }
        if (i13 != 3) {
            if (i13 == 5) {
                return i11 + 4;
            }
            throw new C2303sb("Protocol message contained an invalid tag (zero).");
        }
        int i14 = (i10 & (-8)) | 4;
        int i15 = 0;
        while (i11 < i12) {
            i11 = m10920a(bArr, i11, c2355v9);
            i15 = c2355v9.f8714a;
            if (i15 == i14) {
                break;
            }
            i11 = m10935p(i15, bArr, i11, i12, c2355v9);
        }
        if (i11 > i12 || i15 != i14) {
            throw new C2303sb("Failed to parse the message.");
        }
        return i11;
    }

    /* JADX INFO: renamed from: q */
    public static void m10936q(int i10) throws C2303sb {
        if (i10 >= f8735a) {
            throw new C2303sb("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}
