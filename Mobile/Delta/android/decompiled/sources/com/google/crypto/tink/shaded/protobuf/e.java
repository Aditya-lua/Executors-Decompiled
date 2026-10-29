package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile int f8422a = 100;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8423a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f8423a = iArr;
            try {
                iArr[s1.b.f8554c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8423a[s1.b.f8555d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8423a[s1.b.f8556e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8423a[s1.b.f8557f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8423a[s1.b.f8558g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8423a[s1.b.f8566o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8423a[s1.b.f8559h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8423a[s1.b.f8569r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8423a[s1.b.f8560i.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8423a[s1.b.f8568q.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8423a[s1.b.f8561j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8423a[s1.b.f8570s.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8423a[s1.b.f8571t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8423a[s1.b.f8567p.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8423a[s1.b.f8565n.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8423a[s1.b.f8562k.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8423a[s1.b.f8563l.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8423a[s1.b.f8564m.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8424a;
        public long b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f8425c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f8426d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8427e;

        public b(p pVar) {
            pVar.getClass();
            this.f8426d = pVar;
        }
    }

    public static int A(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        j0 j0Var = (j0) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            j0Var.e(bVar.b);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int B(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int iJ = J(bArr, i11, bVar);
        zVar.d(i.c(bVar.f8424a));
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            zVar.d(i.c(bVar.f8424a));
        }
        return iJ;
    }

    public static int C(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int iM = M(bArr, i11, bVar);
        j0Var.e(i.d(bVar.b));
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            j0Var.e(i.d(bVar.b));
        }
        return iM;
    }

    public static int D(byte[] bArr, int i10, b bVar) throws b0 {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a;
        if (i11 < 0) {
            throw b0.g();
        }
        if (i11 == 0) {
            bVar.f8425c = "";
            return iJ;
        }
        bVar.f8425c = new String(bArr, iJ, i11, a0.b);
        return iJ + i11;
    }

    public static int E(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) throws b0 {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f8424a;
        if (i13 < 0) {
            throw b0.g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            iVar.add(new String(bArr, iJ, i13, a0.b));
            iJ += i13;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            int i14 = bVar.f8424a;
            if (i14 < 0) {
                throw b0.g();
            }
            if (i14 == 0) {
                iVar.add("");
            } else {
                iVar.add(new String(bArr, iJ, i14, a0.b));
                iJ += i14;
            }
        }
        return iJ;
    }

    public static int F(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) throws b0 {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f8424a;
        if (i13 < 0) {
            throw b0.g();
        }
        if (i13 == 0) {
            iVar.add("");
        } else {
            int i14 = iJ + i13;
            if (!r1.m(bArr, iJ, i14)) {
                throw b0.d();
            }
            iVar.add(new String(bArr, iJ, i13, a0.b));
            iJ = i14;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            int i15 = bVar.f8424a;
            if (i15 < 0) {
                throw b0.g();
            }
            if (i15 == 0) {
                iVar.add("");
            } else {
                int i16 = iJ + i15;
                if (!r1.m(bArr, iJ, i16)) {
                    throw b0.d();
                }
                iVar.add(new String(bArr, iJ, i15, a0.b));
                iJ = i16;
            }
        }
        return iJ;
    }

    public static int G(byte[] bArr, int i10, b bVar) throws b0 {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a;
        if (i11 < 0) {
            throw b0.g();
        }
        if (i11 == 0) {
            bVar.f8425c = "";
            return iJ;
        }
        bVar.f8425c = r1.e(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int H(int i10, byte[] bArr, int i11, int i12, o1 o1Var, b bVar) throws b0 {
        if (s1.a(i10) == 0) {
            throw b0.c();
        }
        int iB = s1.b(i10);
        if (iB == 0) {
            int iM = M(bArr, i11, bVar);
            o1Var.n(i10, Long.valueOf(bVar.b));
            return iM;
        }
        if (iB == 1) {
            o1Var.n(i10, Long.valueOf(k(bArr, i11)));
            return i11 + 8;
        }
        if (iB == 2) {
            int iJ = J(bArr, i11, bVar);
            int i13 = bVar.f8424a;
            if (i13 < 0) {
                throw b0.g();
            }
            if (i13 > bArr.length - iJ) {
                throw b0.m();
            }
            if (i13 == 0) {
                o1Var.n(i10, h.b);
            } else {
                o1Var.n(i10, h.f(bArr, iJ, i13));
            }
            return iJ + i13;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw b0.c();
            }
            o1Var.n(i10, Integer.valueOf(i(bArr, i11)));
            return i11 + 4;
        }
        o1 o1VarK = o1.k();
        int i14 = (i10 & (-8)) | 4;
        int i15 = bVar.f8427e + 1;
        bVar.f8427e = i15;
        a(i15);
        int i16 = 0;
        while (i11 < i12) {
            int iJ2 = J(bArr, i11, bVar);
            i16 = bVar.f8424a;
            if (i16 == i14) {
                i11 = iJ2;
                break;
            }
            i11 = H(i16, bArr, iJ2, i12, o1VarK, bVar);
        }
        bVar.f8427e--;
        if (i11 > i12 || i16 != i14) {
            throw b0.h();
        }
        o1Var.n(i10, o1VarK);
        return i11;
    }

    public static int I(int i10, byte[] bArr, int i11, b bVar) {
        int i12 = i10 & 127;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            bVar.f8424a = i12 | (b10 << 7);
            return i13;
        }
        int i14 = i12 | ((b10 & 127) << 7);
        int i15 = i11 + 2;
        byte b11 = bArr[i13];
        if (b11 >= 0) {
            bVar.f8424a = i14 | (b11 << 14);
            return i15;
        }
        int i16 = i14 | ((b11 & 127) << 14);
        int i17 = i11 + 3;
        byte b12 = bArr[i15];
        if (b12 >= 0) {
            bVar.f8424a = i16 | (b12 << 21);
            return i17;
        }
        int i18 = i16 | ((b12 & 127) << 21);
        int i19 = i11 + 4;
        byte b13 = bArr[i17];
        if (b13 >= 0) {
            bVar.f8424a = i18 | (b13 << 28);
            return i19;
        }
        int i20 = i18 | ((b13 & 127) << 28);
        while (true) {
            int i21 = i19 + 1;
            if (bArr[i19] >= 0) {
                bVar.f8424a = i20;
                return i21;
            }
            i19 = i21;
        }
    }

    public static int J(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 < 0) {
            return I(b10, bArr, i11, bVar);
        }
        bVar.f8424a = b10;
        return i11;
    }

    public static int K(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        int iJ = J(bArr, i11, bVar);
        zVar.d(bVar.f8424a);
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            zVar.d(bVar.f8424a);
        }
        return iJ;
    }

    public static int L(long j10, byte[] bArr, int i10, b bVar) {
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
        bVar.b = j11;
        return i11;
    }

    public static int M(byte[] bArr, int i10, b bVar) {
        int i11 = i10 + 1;
        long j10 = bArr[i10];
        if (j10 < 0) {
            return L(j10, bArr, i11, bVar);
        }
        bVar.b = j10;
        return i11;
    }

    public static int N(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        int iM = M(bArr, i11, bVar);
        j0Var.e(bVar.b);
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            j0Var.e(bVar.b);
        }
        return iM;
    }

    public static int O(Object obj, g1 g1Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws b0 {
        int i13 = bVar.f8427e + 1;
        bVar.f8427e = i13;
        a(i13);
        int iD0 = ((v0) g1Var).d0(obj, bArr, i10, i11, i12, bVar);
        bVar.f8427e--;
        bVar.f8425c = obj;
        return iD0;
    }

    public static int P(Object obj, g1 g1Var, byte[] bArr, int i10, int i11, b bVar) throws b0 {
        int I = i10 + 1;
        int i12 = bArr[i10];
        if (i12 < 0) {
            I = I(i12, bArr, I, bVar);
            i12 = bVar.f8424a;
        }
        int i13 = I;
        if (i12 < 0 || i12 > i11 - i13) {
            throw b0.m();
        }
        int i14 = bVar.f8427e + 1;
        bVar.f8427e = i14;
        a(i14);
        int i15 = i13 + i12;
        g1Var.h(obj, bArr, i13, i15, bVar);
        bVar.f8427e--;
        bVar.f8425c = obj;
        return i15;
    }

    public static int Q(int i10, byte[] bArr, int i11, int i12, b bVar) throws b0 {
        if (s1.a(i10) == 0) {
            throw b0.c();
        }
        int iB = s1.b(i10);
        if (iB == 0) {
            return M(bArr, i11, bVar);
        }
        if (iB == 1) {
            return i11 + 8;
        }
        if (iB == 2) {
            return J(bArr, i11, bVar) + bVar.f8424a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i11 + 4;
            }
            throw b0.c();
        }
        int i13 = (i10 & (-8)) | 4;
        int i14 = 0;
        while (i11 < i12) {
            i11 = J(bArr, i11, bVar);
            i14 = bVar.f8424a;
            if (i14 == i13) {
                break;
            }
            i11 = Q(i14, bArr, i11, i12, bVar);
        }
        if (i11 > i12 || i14 != i13) {
            throw b0.h();
        }
        return i11;
    }

    public static void a(int i10) throws b0 {
        if (i10 >= f8422a) {
            throw b0.i();
        }
    }

    public static int b(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        f fVar = (f) iVar;
        int iM = M(bArr, i11, bVar);
        fVar.e(bVar.b != 0);
        while (iM < i12) {
            int iJ = J(bArr, iM, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iM = M(bArr, iJ, bVar);
            fVar.e(bVar.b != 0);
        }
        return iM;
    }

    public static int c(byte[] bArr, int i10, b bVar) throws b0 {
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a;
        if (i11 < 0) {
            throw b0.g();
        }
        if (i11 > bArr.length - iJ) {
            throw b0.m();
        }
        if (i11 == 0) {
            bVar.f8425c = h.b;
            return iJ;
        }
        bVar.f8425c = h.f(bArr, iJ, i11);
        return iJ + i11;
    }

    public static int d(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) throws b0 {
        int iJ = J(bArr, i11, bVar);
        int i13 = bVar.f8424a;
        if (i13 < 0) {
            throw b0.g();
        }
        if (i13 > bArr.length - iJ) {
            throw b0.m();
        }
        if (i13 == 0) {
            iVar.add(h.b);
        } else {
            iVar.add(h.f(bArr, iJ, i13));
            iJ += i13;
        }
        while (iJ < i12) {
            int iJ2 = J(bArr, iJ, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iJ = J(bArr, iJ2, bVar);
            int i14 = bVar.f8424a;
            if (i14 < 0) {
                throw b0.g();
            }
            if (i14 > bArr.length - iJ) {
                throw b0.m();
            }
            if (i14 == 0) {
                iVar.add(h.b);
            } else {
                iVar.add(h.f(bArr, iJ, i14));
                iJ += i14;
            }
        }
        return iJ;
    }

    public static double e(byte[] bArr, int i10) {
        return Double.longBitsToDouble(k(bArr, i10));
    }

    public static int f(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        m mVar = (m) iVar;
        mVar.d(e(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            mVar.d(e(bArr, iJ));
            i13 = iJ + 8;
        }
        return i13;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int g(int i10, byte[] bArr, int i11, int i12, y.c<?, ?> cVar, y.e<?, ?> eVar, n1<o1, o1> n1Var, b bVar) throws b0 {
        int i13;
        int i14;
        u<y.d> uVar = cVar.extensions;
        int i15 = i10 >>> 3;
        if (eVar.b.f() && eVar.b.m()) {
            switch (a.f8423a[eVar.a().ordinal()]) {
                case 1:
                    m mVar = new m();
                    int iT = t(bArr, i11, mVar, bVar);
                    uVar.x(eVar.b, mVar);
                    return iT;
                case 2:
                    w wVar = new w();
                    int iW = w(bArr, i11, wVar, bVar);
                    uVar.x(eVar.b, wVar);
                    return iW;
                case 3:
                case 4:
                    j0 j0Var = new j0();
                    int iA = A(bArr, i11, j0Var, bVar);
                    uVar.x(eVar.b, j0Var);
                    return iA;
                case 5:
                case 6:
                    z zVar = new z();
                    int iZ = z(bArr, i11, zVar, bVar);
                    uVar.x(eVar.b, zVar);
                    return iZ;
                case 7:
                case 8:
                    j0 j0Var2 = new j0();
                    int iV = v(bArr, i11, j0Var2, bVar);
                    uVar.x(eVar.b, j0Var2);
                    return iV;
                case 9:
                case 10:
                    z zVar2 = new z();
                    int iU = u(bArr, i11, zVar2, bVar);
                    uVar.x(eVar.b, zVar2);
                    return iU;
                case 11:
                    f fVar = new f();
                    int iS = s(bArr, i11, fVar, bVar);
                    uVar.x(eVar.b, fVar);
                    return iS;
                case 12:
                    z zVar3 = new z();
                    int iX = x(bArr, i11, zVar3, bVar);
                    uVar.x(eVar.b, zVar3);
                    return iX;
                case 13:
                    j0 j0Var3 = new j0();
                    int iY = y(bArr, i11, j0Var3, bVar);
                    uVar.x(eVar.b, j0Var3);
                    return iY;
                case 14:
                    z zVar4 = new z();
                    int iZ2 = z(bArr, i11, zVar4, bVar);
                    i1.z(cVar, i15, zVar4, eVar.b.b(), null, n1Var);
                    uVar.x(eVar.b, zVar4);
                    return iZ2;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.g());
            }
        }
        Object objValueOf = null;
        if (eVar.a() == s1.b.f8567p) {
            i11 = J(bArr, i11, bVar);
            if (eVar.b.b().a(bVar.f8424a) == null) {
                i1.J(cVar, i15, bVar.f8424a, null, n1Var);
                return i11;
            }
            objValueOf = Integer.valueOf(bVar.f8424a);
        } else {
            switch (a.f8423a[eVar.a().ordinal()]) {
                case 1:
                    i13 = i11;
                    objValueOf = Double.valueOf(e(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 2:
                    i14 = i11;
                    objValueOf = Float.valueOf(m(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 3:
                case 4:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(bVar.b);
                    break;
                case 5:
                case 6:
                    i11 = J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(bVar.f8424a);
                    break;
                case 7:
                case 8:
                    i13 = i11;
                    objValueOf = Long.valueOf(k(bArr, i13));
                    i11 = i13 + 8;
                    break;
                case 9:
                case 10:
                    i14 = i11;
                    objValueOf = Integer.valueOf(i(bArr, i14));
                    i11 = i14 + 4;
                    break;
                case 11:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Boolean.valueOf(bVar.b != 0);
                    break;
                case 12:
                    i11 = J(bArr, i11, bVar);
                    objValueOf = Integer.valueOf(i.c(bVar.f8424a));
                    break;
                case 13:
                    i11 = M(bArr, i11, bVar);
                    objValueOf = Long.valueOf(i.d(bVar.b));
                    break;
                case 14:
                    throw new IllegalStateException("Shouldn't reach here.");
                case 15:
                    i11 = c(bArr, i11, bVar);
                    objValueOf = bVar.f8425c;
                    break;
                case 16:
                    i11 = D(bArr, i11, bVar);
                    objValueOf = bVar.f8425c;
                    break;
                case 17:
                    int i16 = (i15 << 3) | 4;
                    g1 g1VarC = c1.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iO = o(g1VarC, bArr, i11, i12, i16, bVar);
                        uVar.a(eVar.b, bVar.f8425c);
                        return iO;
                    }
                    Object objI = uVar.i(eVar.b);
                    if (objI == null) {
                        objI = g1VarC.e();
                        uVar.x(eVar.b, objI);
                    }
                    return O(objI, g1VarC, bArr, i11, i12, i16, bVar);
                case 18:
                    g1 g1VarC2 = c1.a().c(eVar.b().getClass());
                    if (eVar.d()) {
                        int iQ = q(g1VarC2, bArr, i11, i12, bVar);
                        uVar.a(eVar.b, bVar.f8425c);
                        return iQ;
                    }
                    Object objI2 = uVar.i(eVar.b);
                    if (objI2 == null) {
                        objI2 = g1VarC2.e();
                        uVar.x(eVar.b, objI2);
                    }
                    return P(objI2, g1VarC2, bArr, i11, i12, bVar);
            }
        }
        if (eVar.d()) {
            uVar.a(eVar.b, objValueOf);
            return i11;
        }
        uVar.x(eVar.b, objValueOf);
        return i11;
    }

    public static int h(int i10, byte[] bArr, int i11, int i12, Object obj, s0 s0Var, n1<o1, o1> n1Var, b bVar) {
        y.e eVarA = bVar.f8426d.a(s0Var, i10 >>> 3);
        if (eVarA == null) {
            return H(i10, bArr, i11, i12, v0.w(obj), bVar);
        }
        y.c cVar = (y.c) obj;
        cVar.Z();
        return g(i10, bArr, i11, i12, cVar, eVarA, n1Var, bVar);
    }

    public static int i(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public static int j(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        z zVar = (z) iVar;
        zVar.d(i(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            zVar.d(i(bArr, iJ));
            i13 = iJ + 4;
        }
        return i13;
    }

    public static long k(byte[] bArr, int i10) {
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public static int l(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        j0 j0Var = (j0) iVar;
        j0Var.e(k(bArr, i11));
        int i13 = i11 + 8;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            j0Var.e(k(bArr, iJ));
            i13 = iJ + 8;
        }
        return i13;
    }

    public static float m(byte[] bArr, int i10) {
        return Float.intBitsToFloat(i(bArr, i10));
    }

    public static int n(int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) {
        w wVar = (w) iVar;
        wVar.d(m(bArr, i11));
        int i13 = i11 + 4;
        while (i13 < i12) {
            int iJ = J(bArr, i13, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            wVar.d(m(bArr, iJ));
            i13 = iJ + 4;
        }
        return i13;
    }

    public static int o(g1 g1Var, byte[] bArr, int i10, int i11, int i12, b bVar) throws b0 {
        Object objE = g1Var.e();
        int iO = O(objE, g1Var, bArr, i10, i11, i12, bVar);
        g1Var.b(objE);
        bVar.f8425c = objE;
        return iO;
    }

    public static int p(g1 g1Var, int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) throws b0 {
        int i13 = (i10 & (-8)) | 4;
        int iO = o(g1Var, bArr, i11, i12, i13, bVar);
        iVar.add(bVar.f8425c);
        while (iO < i12) {
            int iJ = J(bArr, iO, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iO = o(g1Var, bArr, iJ, i12, i13, bVar);
            iVar.add(bVar.f8425c);
        }
        return iO;
    }

    public static int q(g1 g1Var, byte[] bArr, int i10, int i11, b bVar) throws b0 {
        Object objE = g1Var.e();
        int iP = P(objE, g1Var, bArr, i10, i11, bVar);
        g1Var.b(objE);
        bVar.f8425c = objE;
        return iP;
    }

    public static int r(g1<?> g1Var, int i10, byte[] bArr, int i11, int i12, a0.i<?> iVar, b bVar) throws b0 {
        int iQ = q(g1Var, bArr, i11, i12, bVar);
        iVar.add(bVar.f8425c);
        while (iQ < i12) {
            int iJ = J(bArr, iQ, bVar);
            if (i10 != bVar.f8424a) {
                break;
            }
            iQ = q(g1Var, bArr, iJ, i12, bVar);
            iVar.add(bVar.f8425c);
        }
        return iQ;
    }

    public static int s(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        f fVar = (f) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            fVar.e(bVar.b != 0);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int t(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        m mVar = (m) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            mVar.d(e(bArr, iJ));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int u(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        z zVar = (z) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            zVar.d(i(bArr, iJ));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int v(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        j0 j0Var = (j0) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            j0Var.e(k(bArr, iJ));
            iJ += 8;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int w(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        w wVar = (w) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            wVar.d(m(bArr, iJ));
            iJ += 4;
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int x(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        z zVar = (z) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, bVar);
            zVar.d(i.c(bVar.f8424a));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int y(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        j0 j0Var = (j0) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            iJ = M(bArr, iJ, bVar);
            j0Var.e(i.d(bVar.b));
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }

    public static int z(byte[] bArr, int i10, a0.i<?> iVar, b bVar) throws b0 {
        z zVar = (z) iVar;
        int iJ = J(bArr, i10, bVar);
        int i11 = bVar.f8424a + iJ;
        while (iJ < i11) {
            iJ = J(bArr, iJ, bVar);
            zVar.d(bVar.f8424a);
        }
        if (iJ == i11) {
            return iJ;
        }
        throw b0.m();
    }
}
