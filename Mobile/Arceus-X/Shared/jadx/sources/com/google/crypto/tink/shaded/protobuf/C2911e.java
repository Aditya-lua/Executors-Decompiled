package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C2911e {

    /* JADX INFO: renamed from: a */
    public static volatile int f10835a = 100;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10836a;

        static {
            int[] iArr = new int[C2955s1.b.values().length];
            f10836a = iArr;
            try {
                iArr[C2955s1.b.f10996c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10836a[C2955s1.b.f10997d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10836a[C2955s1.b.f10998e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10836a[C2955s1.b.f10999f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10836a[C2955s1.b.f11000g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10836a[C2955s1.b.f11008o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10836a[C2955s1.b.f11001h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10836a[C2955s1.b.f11011r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10836a[C2955s1.b.f11002i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10836a[C2955s1.b.f11010q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10836a[C2955s1.b.f11003j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10836a[C2955s1.b.f11012s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f10836a[C2955s1.b.f11013t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f10836a[C2955s1.b.f11009p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f10836a[C2955s1.b.f11007n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f10836a[C2955s1.b.f11004k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f10836a[C2955s1.b.f11005l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f10836a[C2955s1.b.f11006m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.e$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public int f10837a;

        /* JADX INFO: renamed from: b */
        public long f10838b;

        /* JADX INFO: renamed from: c */
        public Object f10839c;

        /* JADX INFO: renamed from: d */
        public final C2944p f10840d;

        /* JADX INFO: renamed from: e */
        public int f10841e;

        public b(C2944p c2944p) {
            c2944p.getClass();
            this.f10840d = c2944p;
        }
    }

    /* JADX INFO: renamed from: A */
    public static int m13427A(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2927j0 c2927j0 = (C2927j0) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            iM13436J = m13439M(bArr, iM13436J, bVar);
            c2927j0.m13721e(bVar.f10838b);
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: B */
    public static int m13428B(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2969z c2969z = (C2969z) iVar;
        int iM13436J = m13436J(bArr, i11, bVar);
        c2969z.m14363d(AbstractC2923i.m13581c(bVar.f10837a));
        while (iM13436J < i12) {
            int iM13436J2 = m13436J(bArr, iM13436J, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13436J = m13436J(bArr, iM13436J2, bVar);
            c2969z.m14363d(AbstractC2923i.m13581c(bVar.f10837a));
        }
        return iM13436J;
    }

    /* JADX INFO: renamed from: C */
    public static int m13429C(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2927j0 c2927j0 = (C2927j0) iVar;
        int iM13439M = m13439M(bArr, i11, bVar);
        c2927j0.m13721e(AbstractC2923i.m13582d(bVar.f10838b));
        while (iM13439M < i12) {
            int iM13436J = m13436J(bArr, iM13439M, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13439M = m13439M(bArr, iM13436J, bVar);
            c2927j0.m13721e(AbstractC2923i.m13582d(bVar.f10838b));
        }
        return iM13439M;
    }

    /* JADX INFO: renamed from: D */
    public static int m13430D(byte[] bArr, int i10, b bVar) throws C2903b0 {
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a;
        if (i11 < 0) {
            throw C2903b0.m13402g();
        }
        if (i11 == 0) {
            bVar.f10839c = "";
            return iM13436J;
        }
        bVar.f10839c = new String(bArr, iM13436J, i11, C2900a0.f10795b);
        return iM13436J + i11;
    }

    /* JADX DEBUG: Duplicate block (B:8:0x001a) to fix multi-entry loop: BACK_EDGE: B:8:0x001a -> B:9:0x001b */
    /* JADX INFO: renamed from: E */
    public static int m13431E(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        int iM13436J = m13436J(bArr, i11, bVar);
        int i13 = bVar.f10837a;
        if (i13 < 0) {
            throw C2903b0.m13402g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, iM13436J, i13, C2900a0.f10795b));
            iM13436J += i13;
        }
        while (iM13436J < i12) {
            int iM13436J2 = m13436J(bArr, iM13436J, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13436J = m13436J(bArr, iM13436J2, bVar);
            int i14 = bVar.f10837a;
            if (i14 < 0) {
                throw C2903b0.m13402g();
            }
            if (i14 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, iM13436J, i14, C2900a0.f10795b));
                iM13436J += i14;
            }
        }
        return iM13436J;
    }

    /* JADX DEBUG: Duplicate block (B:10:0x0022) to fix multi-entry loop: BACK_EDGE: B:10:0x0022 -> B:11:0x0023 */
    /* JADX INFO: renamed from: F */
    public static int m13432F(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        int iM13436J = m13436J(bArr, i11, bVar);
        int i13 = bVar.f10837a;
        if (i13 < 0) {
            throw C2903b0.m13402g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            int i14 = iM13436J + i13;
            if (!C2952r1.m14144m(bArr, iM13436J, i14)) {
                throw C2903b0.m13399d();
            }
            iVar.add(new String(bArr, iM13436J, i13, C2900a0.f10795b));
            iM13436J = i14;
        }
        while (iM13436J < i12) {
            int iM13436J2 = m13436J(bArr, iM13436J, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13436J = m13436J(bArr, iM13436J2, bVar);
            int i15 = bVar.f10837a;
            if (i15 < 0) {
                throw C2903b0.m13402g();
            }
            if (i15 == 0) {
                iVar.add("");
            } else {
                int i16 = iM13436J + i15;
                if (!C2952r1.m14144m(bArr, iM13436J, i16)) {
                    throw C2903b0.m13399d();
                }
                iVar.add(new String(bArr, iM13436J, i15, C2900a0.f10795b));
                iM13436J = i16;
            }
        }
        return iM13436J;
    }

    /* JADX INFO: renamed from: G */
    public static int m13433G(byte[] bArr, int i10, b bVar) throws C2903b0 {
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a;
        if (i11 < 0) {
            throw C2903b0.m13402g();
        }
        if (i11 == 0) {
            bVar.f10839c = "";
            return iM13436J;
        }
        bVar.f10839c = C2952r1.m14136e(bArr, iM13436J, i11);
        return iM13436J + i11;
    }

    /* JADX INFO: renamed from: H */
    public static int m13434H(int i10, byte[] bArr, int i11, int i12, C2943o1 c2943o1, b bVar) throws C2903b0 {
        if (C2955s1.m14179a(i10) == 0) {
            throw C2903b0.m13398c();
        }
        int iM14180b = C2955s1.m14180b(i10);
        if (iM14180b == 0) {
            int iM13439M = m13439M(bArr, i11, bVar);
            c2943o1.m14032n(i10, Long.valueOf(bVar.f10838b));
            return iM13439M;
        }
        if (iM14180b == 1) {
            c2943o1.m14032n(i10, Long.valueOf(m13454k(bArr, i11)));
            return i11 + 8;
        }
        if (iM14180b == 2) {
            int iM13436J = m13436J(bArr, i11, bVar);
            int i13 = bVar.f10837a;
            if (i13 < 0) {
                throw C2903b0.m13402g();
            }
            if (i13 > bArr.length - iM13436J) {
                throw C2903b0.m13406m();
            }
            if (i13 == 0) {
                c2943o1.m14032n(i10, AbstractC2920h.f10853b);
            } else {
                c2943o1.m14032n(i10, AbstractC2920h.m13556f(bArr, iM13436J, i13));
            }
            return iM13436J + i13;
        }
        if (iM14180b != 3) {
            if (iM14180b != 5) {
                throw C2903b0.m13398c();
            }
            c2943o1.m14032n(i10, Integer.valueOf(m13452i(bArr, i11)));
            return i11 + 4;
        }
        C2943o1 c2943o1M14021k = C2943o1.m14021k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = bVar.f10841e + 1;
        bVar.f10841e = i15;
        m13444a(i15);
        int i16 = 0;
        while (i11 < i12) {
            int iM13436J2 = m13436J(bArr, i11, bVar);
            i16 = bVar.f10837a;
            if (i16 == i14) {
                i11 = iM13436J2;
                break;
            }
            i11 = m13434H(i16, bArr, iM13436J2, i12, c2943o1M14021k, bVar);
        }
        bVar.f10841e--;
        if (i11 > i12 || i16 != i14) {
            throw C2903b0.m13403h();
        }
        c2943o1.m14032n(i10, c2943o1M14021k);
        return i11;
    }

    /* JADX INFO: renamed from: I */
    public static int m13435I(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f10837a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f10837a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f10837a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f10837a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f10837a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    /* JADX INFO: renamed from: J */
    public static int m13436J(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return m13435I(b10, bArr, i11, bVar);
        }
        bVar.f10837a = b10;
        return i11;
    }

    /* JADX INFO: renamed from: K */
    public static int m13437K(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2969z c2969z = (C2969z) iVar;
        int iM13436J = m13436J(bArr, i11, bVar);
        c2969z.m14363d(bVar.f10837a);
        while (iM13436J < i12) {
            int iM13436J2 = m13436J(bArr, iM13436J, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13436J = m13436J(bArr, iM13436J2, bVar);
            c2969z.m14363d(bVar.f10837a);
        }
        return iM13436J;
    }

    /* JADX INFO: renamed from: L */
    public static int m13438L(long j10, byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & 127)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & 127)) << i12;
            i11 = i13;
            b10 = b11;
        }
        bVar.f10838b = j11;
        return i11;
    }

    /* JADX INFO: renamed from: M */
    public static int m13439M(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return m13438L(j10, bArr, i11, bVar);
        }
        bVar.f10838b = j10;
        return i11;
    }

    /* JADX INFO: renamed from: N */
    public static int m13440N(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2927j0 c2927j0 = (C2927j0) iVar;
        int iM13439M = m13439M(bArr, i11, bVar);
        c2927j0.m13721e(bVar.f10838b);
        while (iM13439M < i12) {
            int iM13436J = m13436J(bArr, iM13439M, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13439M = m13439M(bArr, iM13436J, bVar);
            c2927j0.m13721e(bVar.f10838b);
        }
        return iM13439M;
    }

    /* JADX INFO: renamed from: O */
    public static int m13441O(Object obj, InterfaceC2919g1 interfaceC2919g1, byte[] bArr, int i10, int i11, int i12, b bVar) throws C2903b0 {
        int i13 = bVar.f10841e + 1;
        bVar.f10841e = i13;
        m13444a(i13);
        int iM14258d0 = ((C2962v0) interfaceC2919g1).m14258d0(obj, bArr, i10, i11, i12, bVar);
        bVar.f10841e--;
        bVar.f10839c = obj;
        return iM14258d0;
    }

    /* JADX INFO: renamed from: P */
    public static int m13442P(Object obj, InterfaceC2919g1 interfaceC2919g1, byte[] bArr, int i10, int i11, b bVar) throws C2903b0 {
        int iM13435I = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            iM13435I = m13435I(i12, bArr, iM13435I, bVar);
            i12 = bVar.f10837a;
        }
        int i13 = iM13435I;
        if (i12 < 0 || i12 > i11 - i13) {
            throw C2903b0.m13406m();
        }
        int i14 = bVar.f10841e + 1;
        bVar.f10841e = i14;
        m13444a(i14);
        int i15 = i13 + i12;
        interfaceC2919g1.mo13547h(obj, bArr, i13, i15, bVar);
        bVar.f10841e--;
        bVar.f10839c = obj;
        return i15;
    }

    /* JADX INFO: renamed from: Q */
    public static int m13443Q(int i10, byte[] bArr, int i11, int i12, b bVar) throws C2903b0 {
        if (C2955s1.m14179a(i10) == 0) {
            throw C2903b0.m13398c();
        }
        int iM14180b = C2955s1.m14180b(i10);
        if (iM14180b == 0) {
            return m13439M(bArr, i11, bVar);
        }
        if (iM14180b == 1) {
            return i11 + 8;
        }
        if (iM14180b == 2) {
            return m13436J(bArr, i11, bVar) + bVar.f10837a;
        }
        if (iM14180b != 3) {
            if (iM14180b == 5) {
                return i11 + 4;
            }
            throw C2903b0.m13398c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = m13436J(bArr, i11, bVar);
            i14 = bVar.f10837a;
            if (i14 == i13) {
                break;
            }
            i11 = m13443Q(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw C2903b0.m13403h();
        }
        return i11;
    }

    /* JADX INFO: renamed from: a */
    public static void m13444a(int i10) throws C2903b0 {
        if (i10 >= f10835a) {
            throw C2903b0.m13404i();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m13445b(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2914f c2914f = (C2914f) iVar;
        int iM13439M = m13439M(bArr, i11, bVar);
        c2914f.m13483e(bVar.f10838b != 0);
        while (iM13439M < i12) {
            int iM13436J = m13436J(bArr, iM13439M, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13439M = m13439M(bArr, iM13436J, bVar);
            c2914f.m13483e(bVar.f10838b != 0);
        }
        return iM13439M;
    }

    /* JADX INFO: renamed from: c */
    public static int m13446c(byte[] bArr, int i10, b bVar) throws C2903b0 {
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a;
        if (i11 < 0) {
            throw C2903b0.m13402g();
        }
        if (i11 > bArr.length - iM13436J) {
            throw C2903b0.m13406m();
        }
        if (i11 == 0) {
            bVar.f10839c = AbstractC2920h.f10853b;
            return iM13436J;
        }
        bVar.f10839c = AbstractC2920h.m13556f(bArr, iM13436J, i11);
        return iM13436J + i11;
    }

    /* JADX DEBUG: Duplicate block (B:9:0x001b) to fix multi-entry loop: BACK_EDGE: B:9:0x001b -> B:10:0x001c */
    /* JADX INFO: renamed from: d */
    public static int m13447d(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        int iM13436J = m13436J(bArr, i11, bVar);
        int i13 = bVar.f10837a;
        if (i13 < 0) {
            throw C2903b0.m13402g();
        }
        if (i13 > bArr.length - iM13436J) {
            throw C2903b0.m13406m();
        }
        if (i13 == 0) {
            iVar.add(AbstractC2920h.f10853b);
        } else {
            iVar.add(AbstractC2920h.m13556f(bArr, iM13436J, i13));
            iM13436J += i13;
        }
        while (iM13436J < i12) {
            int iM13436J2 = m13436J(bArr, iM13436J, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13436J = m13436J(bArr, iM13436J2, bVar);
            int i14 = bVar.f10837a;
            if (i14 < 0) {
                throw C2903b0.m13402g();
            }
            if (i14 > bArr.length - iM13436J) {
                throw C2903b0.m13406m();
            }
            if (i14 == 0) {
                iVar.add(AbstractC2920h.f10853b);
            } else {
                iVar.add(AbstractC2920h.m13556f(bArr, iM13436J, i14));
                iM13436J += i14;
            }
        }
        return iM13436J;
    }

    /* JADX INFO: renamed from: e */
    public static double m13448e(byte[] bArr, int i10) {
        return Double.longBitsToDouble(m13454k(bArr, i10));
    }

    /* JADX INFO: renamed from: f */
    public static int m13449f(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2935m c2935m = (C2935m) iVar;
        c2935m.m13964d(m13448e(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iM13436J = m13436J(bArr, i13, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            c2935m.m13964d(m13448e(bArr, iM13436J));
            i13 = iM13436J + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX INFO: renamed from: g */
    public static int m13450g(int i10, byte[] bArr, int i11, int i12, AbstractC2967y.c<?, ?> cVar, AbstractC2967y.e<?, ?> eVar, AbstractC2940n1<C2943o1, C2943o1> abstractC2940n1, b bVar) throws C2903b0 {
        int i13;
        int i14;
        C2959u<AbstractC2967y.d> c2959u = cVar.extensions;
        int i15 = i10 >>> 3;
        if (eVar.f11141b.mo14208f() && eVar.f11141b.mo14212m()) {
            switch (a.f10836a[eVar.m14355a().ordinal()]) {
                case 1:
                    C2935m c2935m = new C2935m();
                    int iM13463t = m13463t(bArr, i11, c2935m, bVar);
                    c2959u.m14206x(eVar.f11141b, c2935m);
                    return iM13463t;
                case 2:
                    C2963w c2963w = new C2963w();
                    int iM13466w = m13466w(bArr, i11, c2963w, bVar);
                    c2959u.m14206x(eVar.f11141b, c2963w);
                    return iM13466w;
                case 3:
                case 4:
                    C2927j0 c2927j0 = new C2927j0();
                    int iM13427A = m13427A(bArr, i11, c2927j0, bVar);
                    c2959u.m14206x(eVar.f11141b, c2927j0);
                    return iM13427A;
                case 5:
                case 6:
                    C2969z c2969z = new C2969z();
                    int iM13469z = m13469z(bArr, i11, c2969z, bVar);
                    c2959u.m14206x(eVar.f11141b, c2969z);
                    return iM13469z;
                case 7:
                case 8:
                    C2927j0 c2927j1 = new C2927j0();
                    int iM13465v = m13465v(bArr, i11, c2927j1, bVar);
                    c2959u.m14206x(eVar.f11141b, c2927j1);
                    return iM13465v;
                case 9:
                case 10:
                    C2969z c2969z2 = new C2969z();
                    int iM13464u = m13464u(bArr, i11, c2969z2, bVar);
                    c2959u.m14206x(eVar.f11141b, c2969z2);
                    return iM13464u;
                case 11:
                    C2914f c2914f = new C2914f();
                    int iM13462s = m13462s(bArr, i11, c2914f, bVar);
                    c2959u.m14206x(eVar.f11141b, c2914f);
                    return iM13462s;
                case 12:
                    C2969z c2969z3 = new C2969z();
                    int iM13467x = m13467x(bArr, i11, c2969z3, bVar);
                    c2959u.m14206x(eVar.f11141b, c2969z3);
                    return iM13467x;
                case 13:
                    C2927j0 c2927j2 = new C2927j0();
                    int iM13468y = m13468y(bArr, i11, c2927j2, bVar);
                    c2959u.m14206x(eVar.f11141b, c2927j2);
                    return iM13468y;
                case 14:
                    C2969z c2969z4 = new C2969z();
                    int iM13469z2 = m13469z(bArr, i11, c2969z4, bVar);
                    C2925i1.m13705z(cVar, i15, c2969z4, eVar.f11141b.m14354b(), null, abstractC2940n1);
                    c2959u.m14206x(eVar.f11141b, c2969z4);
                    return iM13469z2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f11141b.mo14209g());
            }
        }
        Object objValueOf = null;
        if (eVar.m14355a() == C2955s1.b.f11009p) {
            i11 = m13436J(bArr, i11, bVar);
            if (eVar.f11141b.m14354b().mo612a(bVar.f10837a) == null) {
                C2925i1.m13659J(cVar, i15, bVar.f10837a, null, abstractC2940n1);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f10837a);
        } else {
            switch (a.f10836a[eVar.m14355a().ordinal()]) {
                case 1:
                    i13 = i11;
                    objValueOf = Double.valueOf(m13448e(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 2:
                    i14 = i11;
                    objValueOf = Float.valueOf(m13456m(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 3:
                case 4:
                    i11 = m13439M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.f10838b);
                    break;
                case 5:
                case 6:
                    i11 = m13436J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f10837a);
                    break;
                case 7:
                case 8:
                    i13 = i11;
                    objValueOf = Long.valueOf(m13454k(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 9:
                case 10:
                    i14 = i11;
                    objValueOf = Integer.valueOf(m13452i(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 11:
                    i11 = m13439M(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.f10838b != 0);
                    break;
                case 12:
                    i11 = m13436J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(AbstractC2923i.m13581c(bVar.f10837a));
                    break;
                case 13:
                    i11 = m13439M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(AbstractC2923i.m13582d(bVar.f10838b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = m13446c(bArr, i11, bVar);
                    objValueOf = bVar.f10839c;
                    break;
                case 16:
                    i11 = m13430D(bArr, i11, bVar);
                    objValueOf = bVar.f10839c;
                    break;
                case 17:
                    int i16 = (i15 << 3) | 4;
                    InterfaceC2919g1 interfaceC2919g1M13414c = C2907c1.m13412a().m13414c(eVar.m14356b().getClass());
                    if (eVar.m14358d()) {
                        int iM13458o = m13458o(interfaceC2919g1M13414c, bArr, i11, i12, i16, bVar);
                        c2959u.m14192a(eVar.f11141b, bVar.f10839c);
                        return iM13458o;
                    }
                    Object objM14195i = c2959u.m14195i(eVar.f11141b);
                    if (objM14195i == null) {
                        objM14195i = interfaceC2919g1M13414c.mo13544e();
                        c2959u.m14206x(eVar.f11141b, objM14195i);
                    }
                    return m13441O(objM14195i, interfaceC2919g1M13414c, bArr, i11, i12, i16, bVar);
                case 18:
                    InterfaceC2919g1 interfaceC2919g1M13414c2 = C2907c1.m13412a().m13414c(eVar.m14356b().getClass());
                    if (eVar.m14358d()) {
                        int iM13460q = m13460q(interfaceC2919g1M13414c2, bArr, i11, i12, bVar);
                        c2959u.m14192a(eVar.f11141b, bVar.f10839c);
                        return iM13460q;
                    }
                    Object objM14195i2 = c2959u.m14195i(eVar.f11141b);
                    if (objM14195i2 == null) {
                        objM14195i2 = interfaceC2919g1M13414c2.mo13544e();
                        c2959u.m14206x(eVar.f11141b, objM14195i2);
                    }
                    return m13442P(objM14195i2, interfaceC2919g1M13414c2, bArr, i11, i12, bVar);
            }
        }
        if (eVar.m14358d()) {
            c2959u.m14192a(eVar.f11141b, objValueOf);
            return i11;
        }
        c2959u.m14206x(eVar.f11141b, objValueOf);
        return i11;
    }

    /* JADX INFO: renamed from: h */
    public static int m13451h(int i10, byte[] bArr, int i11, int i12, Object obj, InterfaceC2954s0 interfaceC2954s0, AbstractC2940n1<C2943o1, C2943o1> abstractC2940n1, b bVar) {
        AbstractC2967y.e eVarM14036a = bVar.f10840d.m14036a(interfaceC2954s0, i10 >>> 3);
        if (eVarM14036a == null) {
            return m13434H(i10, bArr, i11, i12, C2962v0.m14240w(obj), bVar);
        }
        AbstractC2967y.c cVar = (AbstractC2967y.c) obj;
        cVar.m14352Z();
        return m13450g(i10, bArr, i11, i12, cVar, eVarM14036a, abstractC2940n1, bVar);
    }

    /* JADX INFO: renamed from: i */
    public static int m13452i(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: j */
    public static int m13453j(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2969z c2969z = (C2969z) iVar;
        c2969z.m14363d(m13452i(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iM13436J = m13436J(bArr, i13, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            c2969z.m14363d(m13452i(bArr, iM13436J));
            i13 = iM13436J + 4;
        }
        return i13;
    }

    /* JADX INFO: renamed from: k */
    public static long m13454k(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: l */
    public static int m13455l(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2927j0 c2927j0 = (C2927j0) iVar;
        c2927j0.m13721e(m13454k(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iM13436J = m13436J(bArr, i13, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            c2927j0.m13721e(m13454k(bArr, iM13436J));
            i13 = iM13436J + 8;
        }
        return i13;
    }

    /* JADX INFO: renamed from: m */
    public static float m13456m(byte[] bArr, int i10) {
        return Float.intBitsToFloat(m13452i(bArr, i10));
    }

    /* JADX INFO: renamed from: n */
    public static int m13457n(int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) {
        C2963w c2963w = (C2963w) iVar;
        c2963w.m14292d(m13456m(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iM13436J = m13436J(bArr, i13, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            c2963w.m14292d(m13456m(bArr, iM13436J));
            i13 = iM13436J + 4;
        }
        return i13;
    }

    /* JADX INFO: renamed from: o */
    public static int m13458o(InterfaceC2919g1 interfaceC2919g1, byte[] bArr, int i10, int i11, int i12, b bVar) throws C2903b0 {
        Object objMo13544e = interfaceC2919g1.mo13544e();
        int iM13441O = m13441O(objMo13544e, interfaceC2919g1, bArr, i10, i11, i12, bVar);
        interfaceC2919g1.mo13541b(objMo13544e);
        bVar.f10839c = objMo13544e;
        return iM13441O;
    }

    /* JADX INFO: renamed from: p */
    public static int m13459p(InterfaceC2919g1 interfaceC2919g1, int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        int i13 = (i10 & (-8)) | 4;
        int iM13458o = m13458o(interfaceC2919g1, bArr, i11, i12, i13, bVar);
        iVar.add(bVar.f10839c);
        while (iM13458o < i12) {
            int iM13436J = m13436J(bArr, iM13458o, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13458o = m13458o(interfaceC2919g1, bArr, iM13436J, i12, i13, bVar);
            iVar.add(bVar.f10839c);
        }
        return iM13458o;
    }

    /* JADX INFO: renamed from: q */
    public static int m13460q(InterfaceC2919g1 interfaceC2919g1, byte[] bArr, int i10, int i11, b bVar) throws C2903b0 {
        Object objMo13544e = interfaceC2919g1.mo13544e();
        int iM13442P = m13442P(objMo13544e, interfaceC2919g1, bArr, i10, i11, bVar);
        interfaceC2919g1.mo13541b(objMo13544e);
        bVar.f10839c = objMo13544e;
        return iM13442P;
    }

    /* JADX INFO: renamed from: r */
    public static int m13461r(InterfaceC2919g1<?> interfaceC2919g1, int i10, byte[] bArr, int i11, int i12, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        int iM13460q = m13460q(interfaceC2919g1, bArr, i11, i12, bVar);
        iVar.add(bVar.f10839c);
        while (iM13460q < i12) {
            int iM13436J = m13436J(bArr, iM13460q, bVar);
            if (i10 != bVar.f10837a) {
                break;
            }
            iM13460q = m13460q(interfaceC2919g1, bArr, iM13436J, i12, bVar);
            iVar.add(bVar.f10839c);
        }
        return iM13460q;
    }

    /* JADX INFO: renamed from: s */
    public static int m13462s(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2914f c2914f = (C2914f) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            iM13436J = m13439M(bArr, iM13436J, bVar);
            c2914f.m13483e(bVar.f10838b != 0);
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: t */
    public static int m13463t(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2935m c2935m = (C2935m) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            c2935m.m13964d(m13448e(bArr, iM13436J));
            iM13436J += 8;
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: u */
    public static int m13464u(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2969z c2969z = (C2969z) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            c2969z.m14363d(m13452i(bArr, iM13436J));
            iM13436J += 4;
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: v */
    public static int m13465v(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2927j0 c2927j0 = (C2927j0) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            c2927j0.m13721e(m13454k(bArr, iM13436J));
            iM13436J += 8;
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: w */
    public static int m13466w(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2963w c2963w = (C2963w) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            c2963w.m14292d(m13456m(bArr, iM13436J));
            iM13436J += 4;
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: x */
    public static int m13467x(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2969z c2969z = (C2969z) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            iM13436J = m13436J(bArr, iM13436J, bVar);
            c2969z.m14363d(AbstractC2923i.m13581c(bVar.f10837a));
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: y */
    public static int m13468y(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2927j0 c2927j0 = (C2927j0) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            iM13436J = m13439M(bArr, iM13436J, bVar);
            c2927j0.m13721e(AbstractC2923i.m13582d(bVar.f10838b));
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }

    /* JADX INFO: renamed from: z */
    public static int m13469z(byte[] bArr, int i10, C2900a0.i<?> iVar, b bVar) throws C2903b0 {
        C2969z c2969z = (C2969z) iVar;
        int iM13436J = m13436J(bArr, i10, bVar);
        int i11 = bVar.f10837a + iM13436J;
        while (iM13436J < i11) {
            iM13436J = m13436J(bArr, iM13436J, bVar);
            c2969z.m14363d(bVar.f10837a);
        }
        if (iM13436J == i11) {
            return iM13436J;
        }
        throw C2903b0.m13406m();
    }
}
