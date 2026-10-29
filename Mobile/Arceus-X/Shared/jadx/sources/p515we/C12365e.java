package p515we;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import p076df.C4583e;
import p076df.C4591m;

/* JADX INFO: renamed from: we.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C12365e {

    /* JADX INFO: renamed from: a */
    public static final a f44221a = new a(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: b */
    public static final c f44222b = new c(new d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c */
    public static final byte[] f44223c = {-19, -45, -11, 92, 26, 99, 18, 88, -42, -100, -9, -94, -34, -7, -34, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16};

    /* JADX INFO: renamed from: we.e$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final long[] f44224a;

        /* JADX INFO: renamed from: b */
        public final long[] f44225b;

        /* JADX INFO: renamed from: c */
        public final long[] f44226c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(new long[10], new long[10], new long[10]);
        }

        /* JADX INFO: renamed from: a */
        public void m46278a(a aVar, int i10) {
            C12363d.m46235a(this.f44224a, aVar.f44224a, i10);
            C12363d.m46235a(this.f44225b, aVar.f44225b, i10);
            C12363d.m46235a(this.f44226c, aVar.f44226c, i10);
        }

        /* JADX INFO: renamed from: b */
        public void mo46279b(long[] jArr, long[] jArr2) {
            System.arraycopy(jArr2, 0, jArr, 0, 10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f44224a = jArr;
            this.f44225b = jArr2;
            this.f44226c = jArr3;
        }

        public a(a aVar) {
            this.f44224a = Arrays.copyOf(aVar.f44224a, 10);
            this.f44225b = Arrays.copyOf(aVar.f44225b, 10);
            this.f44226c = Arrays.copyOf(aVar.f44226c, 10);
        }
    }

    /* JADX INFO: renamed from: we.e$b */
    public static class b extends a {

        /* JADX INFO: renamed from: d */
        public final long[] f44227d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b() {
            this(new long[10], new long[10], new long[10], new long[10]);
        }

        @Override // p515we.C12365e.a
        /* JADX INFO: renamed from: b */
        public void mo46279b(long[] jArr, long[] jArr2) {
            C12373i.m46333f(jArr, jArr2, this.f44227d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(e eVar) {
            this();
            long[] jArr = this.f44224a;
            d dVar = eVar.f44233a;
            C12373i.m46342o(jArr, dVar.f44231b, dVar.f44230a);
            long[] jArr2 = this.f44225b;
            d dVar2 = eVar.f44233a;
            C12373i.m46340m(jArr2, dVar2.f44231b, dVar2.f44230a);
            System.arraycopy(eVar.f44233a.f44232c, 0, this.f44227d, 0, 10);
            C12373i.m46333f(this.f44226c, eVar.f44234b, C12367f.f44237b);
        }

        public b(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
            super(jArr, jArr2, jArr4);
            this.f44227d = jArr3;
        }
    }

    /* JADX INFO: renamed from: we.e$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final d f44228a;

        /* JADX INFO: renamed from: b */
        public final long[] f44229b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            this(new d(), new long[10]);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(d dVar, long[] jArr) {
            this.f44228a = dVar;
            this.f44229b = jArr;
        }

        public c(c cVar) {
            this.f44228a = new d(cVar.f44228a);
            this.f44229b = Arrays.copyOf(cVar.f44229b, 10);
        }
    }

    /* JADX INFO: renamed from: we.e$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final long[] f44230a;

        /* JADX INFO: renamed from: b */
        public final long[] f44231b;

        /* JADX INFO: renamed from: c */
        public final long[] f44232c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d() {
            this(new long[10], new long[10], new long[10]);
        }

        /* JADX INFO: renamed from: a */
        public static d m46280a(d dVar, c cVar) {
            C12373i.m46333f(dVar.f44230a, cVar.f44228a.f44230a, cVar.f44229b);
            long[] jArr = dVar.f44231b;
            d dVar2 = cVar.f44228a;
            C12373i.m46333f(jArr, dVar2.f44231b, dVar2.f44232c);
            C12373i.m46333f(dVar.f44232c, cVar.f44228a.f44232c, cVar.f44229b);
            return dVar;
        }

        /* JADX INFO: renamed from: b */
        public boolean m46281b() {
            long[] jArr = new long[10];
            C12373i.m46338k(jArr, this.f44230a);
            long[] jArr2 = new long[10];
            C12373i.m46338k(jArr2, this.f44231b);
            long[] jArr3 = new long[10];
            C12373i.m46338k(jArr3, this.f44232c);
            long[] jArr4 = new long[10];
            C12373i.m46338k(jArr4, jArr3);
            long[] jArr5 = new long[10];
            C12373i.m46340m(jArr5, jArr2, jArr);
            C12373i.m46333f(jArr5, jArr5, jArr3);
            long[] jArr6 = new long[10];
            C12373i.m46333f(jArr6, jArr, jArr2);
            C12373i.m46333f(jArr6, jArr6, C12367f.f44236a);
            C12373i.m46341n(jArr6, jArr4);
            C12373i.m46335h(jArr6, jArr6);
            return C4583e.m22662b(C12373i.m46328a(jArr5), C12373i.m46328a(jArr6));
        }

        /* JADX INFO: renamed from: c */
        public byte[] m46282c() {
            long[] jArr = new long[10];
            long[] jArr2 = new long[10];
            long[] jArr3 = new long[10];
            C12373i.m46332e(jArr, this.f44232c);
            C12373i.m46333f(jArr2, this.f44230a, jArr);
            C12373i.m46333f(jArr3, this.f44231b, jArr);
            byte[] bArrM46328a = C12373i.m46328a(jArr3);
            bArrM46328a[31] = (byte) ((C12365e.m46262k(jArr2) << 7) ^ bArrM46328a[31]);
            return bArrM46328a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(long[] jArr, long[] jArr2, long[] jArr3) {
            this.f44230a = jArr;
            this.f44231b = jArr2;
            this.f44232c = jArr3;
        }

        public d(d dVar) {
            this.f44230a = Arrays.copyOf(dVar.f44230a, 10);
            this.f44231b = Arrays.copyOf(dVar.f44231b, 10);
            this.f44232c = Arrays.copyOf(dVar.f44232c, 10);
        }

        public d(c cVar) {
            this();
            m46280a(this, cVar);
        }
    }

    /* JADX INFO: renamed from: we.e$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final d f44233a;

        /* JADX INFO: renamed from: b */
        public final long[] f44234b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public e() {
            this(new d(), new long[10]);
        }

        /* JADX INFO: renamed from: c */
        public static e m46285c(byte[] bArr) throws GeneralSecurityException {
            long[] jArr = new long[10];
            long[] jArrM46330c = C12373i.m46330c(bArr);
            long[] jArr2 = new long[10];
            jArr2[0] = 1;
            long[] jArr3 = new long[10];
            long[] jArr4 = new long[10];
            long[] jArr5 = new long[10];
            long[] jArr6 = new long[10];
            long[] jArr7 = new long[10];
            C12373i.m46338k(jArr4, jArrM46330c);
            C12373i.m46333f(jArr5, jArr4, C12367f.f44236a);
            C12373i.m46340m(jArr4, jArr4, jArr2);
            C12373i.m46342o(jArr5, jArr5, jArr2);
            long[] jArr8 = new long[10];
            C12373i.m46338k(jArr8, jArr5);
            C12373i.m46333f(jArr8, jArr8, jArr5);
            C12373i.m46338k(jArr, jArr8);
            C12373i.m46333f(jArr, jArr, jArr5);
            C12373i.m46333f(jArr, jArr, jArr4);
            C12365e.m46270s(jArr, jArr);
            C12373i.m46333f(jArr, jArr, jArr8);
            C12373i.m46333f(jArr, jArr, jArr4);
            C12373i.m46338k(jArr6, jArr);
            C12373i.m46333f(jArr6, jArr6, jArr5);
            C12373i.m46340m(jArr7, jArr6, jArr4);
            if (C12365e.m46264m(jArr7)) {
                C12373i.m46342o(jArr7, jArr6, jArr4);
                if (C12365e.m46264m(jArr7)) {
                    throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. No square root exists for modulo 2^255-19");
                }
                C12373i.m46333f(jArr, jArr, C12367f.f44238c);
            }
            if (!C12365e.m46264m(jArr) && ((bArr[31] & 255) >> 7) != 0) {
                throw new GeneralSecurityException("Cannot convert given bytes to extended projective coordinates. Computed x is zero and encoded x's least significant bit is not zero");
            }
            if (C12365e.m46262k(jArr) == ((bArr[31] & 255) >> 7)) {
                C12365e.m46269r(jArr, jArr);
            }
            C12373i.m46333f(jArr3, jArr, jArrM46330c);
            return new e(new d(jArr, jArrM46330c, jArr2), jArr3);
        }

        /* JADX INFO: renamed from: d */
        public static e m46286d(e eVar, c cVar) {
            C12373i.m46333f(eVar.f44233a.f44230a, cVar.f44228a.f44230a, cVar.f44229b);
            long[] jArr = eVar.f44233a.f44231b;
            d dVar = cVar.f44228a;
            C12373i.m46333f(jArr, dVar.f44231b, dVar.f44232c);
            C12373i.m46333f(eVar.f44233a.f44232c, cVar.f44228a.f44232c, cVar.f44229b);
            long[] jArr2 = eVar.f44234b;
            d dVar2 = cVar.f44228a;
            C12373i.m46333f(jArr2, dVar2.f44230a, dVar2.f44231b);
            return eVar;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public e(d dVar, long[] jArr) {
            this.f44233a = dVar;
            this.f44234b = jArr;
        }

        public e(c cVar) {
            this();
            m46286d(this, cVar);
        }
    }

    /* JADX INFO: renamed from: A */
    public static boolean m46251A(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 64) {
            return false;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr2, 32, 64);
        if (!m46265n(bArrCopyOfRange)) {
            return false;
        }
        MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a("SHA-512");
        messageDigestM22699a.update(bArr2, 0, 32);
        messageDigestM22699a.update(bArr3);
        messageDigestM22699a.update(bArr);
        byte[] bArrDigest = messageDigestM22699a.digest();
        m46271t(bArrDigest);
        byte[] bArrM46282c = m46257f(bArrDigest, e.m46285c(bArr3), bArrCopyOfRange).m46282c();
        for (int i10 = 0; i10 < 32; i10++) {
            if (bArrM46282c[i10] != bArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static void m46256e(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f44228a.f44230a;
        d dVar = eVar.f44233a;
        C12373i.m46342o(jArr2, dVar.f44231b, dVar.f44230a);
        long[] jArr3 = cVar.f44228a.f44231b;
        d dVar2 = eVar.f44233a;
        C12373i.m46340m(jArr3, dVar2.f44231b, dVar2.f44230a);
        long[] jArr4 = cVar.f44228a.f44231b;
        C12373i.m46333f(jArr4, jArr4, aVar.f44225b);
        d dVar3 = cVar.f44228a;
        C12373i.m46333f(dVar3.f44232c, dVar3.f44230a, aVar.f44224a);
        C12373i.m46333f(cVar.f44229b, eVar.f44234b, aVar.f44226c);
        aVar.mo46279b(cVar.f44228a.f44230a, eVar.f44233a.f44232c);
        long[] jArr5 = cVar.f44228a.f44230a;
        C12373i.m46342o(jArr, jArr5, jArr5);
        d dVar4 = cVar.f44228a;
        C12373i.m46340m(dVar4.f44230a, dVar4.f44232c, dVar4.f44231b);
        d dVar5 = cVar.f44228a;
        long[] jArr6 = dVar5.f44231b;
        C12373i.m46342o(jArr6, dVar5.f44232c, jArr6);
        C12373i.m46342o(cVar.f44228a.f44232c, jArr, cVar.f44229b);
        long[] jArr7 = cVar.f44229b;
        C12373i.m46340m(jArr7, jArr, jArr7);
    }

    /* JADX INFO: renamed from: f */
    public static d m46257f(byte[] bArr, e eVar, byte[] bArr2) {
        b[] bVarArr = new b[8];
        bVarArr[0] = new b(eVar);
        c cVar = new c();
        m46259h(cVar, eVar);
        e eVar2 = new e(cVar);
        for (int i10 = 1; i10 < 8; i10++) {
            m46256e(cVar, eVar2, bVarArr[i10 - 1]);
            bVarArr[i10] = new b(new e(cVar));
        }
        byte[] bArrM46276y = m46276y(bArr);
        byte[] bArrM46276y2 = m46276y(bArr2);
        c cVar2 = new c(f44222b);
        e eVar3 = new e();
        int i11 = 255;
        while (i11 >= 0 && bArrM46276y[i11] == 0 && bArrM46276y2[i11] == 0) {
            i11--;
        }
        while (i11 >= 0) {
            m46258g(cVar2, new d(cVar2));
            byte b10 = bArrM46276y[i11];
            if (b10 > 0) {
                m46256e(cVar2, e.m46286d(eVar3, cVar2), bVarArr[bArrM46276y[i11] / 2]);
            } else if (b10 < 0) {
                m46277z(cVar2, e.m46286d(eVar3, cVar2), bVarArr[(-bArrM46276y[i11]) / 2]);
            }
            byte b11 = bArrM46276y2[i11];
            if (b11 > 0) {
                m46256e(cVar2, e.m46286d(eVar3, cVar2), C12367f.f44240e[bArrM46276y2[i11] / 2]);
            } else if (b11 < 0) {
                m46277z(cVar2, e.m46286d(eVar3, cVar2), C12367f.f44240e[(-bArrM46276y2[i11]) / 2]);
            }
            i11--;
        }
        return new d(cVar2);
    }

    /* JADX INFO: renamed from: g */
    public static void m46258g(c cVar, d dVar) {
        long[] jArr = new long[10];
        C12373i.m46338k(cVar.f44228a.f44230a, dVar.f44230a);
        C12373i.m46338k(cVar.f44228a.f44232c, dVar.f44231b);
        C12373i.m46338k(cVar.f44229b, dVar.f44232c);
        long[] jArr2 = cVar.f44229b;
        C12373i.m46342o(jArr2, jArr2, jArr2);
        C12373i.m46342o(cVar.f44228a.f44231b, dVar.f44230a, dVar.f44231b);
        C12373i.m46338k(jArr, cVar.f44228a.f44231b);
        d dVar2 = cVar.f44228a;
        C12373i.m46342o(dVar2.f44231b, dVar2.f44232c, dVar2.f44230a);
        d dVar3 = cVar.f44228a;
        long[] jArr3 = dVar3.f44232c;
        C12373i.m46340m(jArr3, jArr3, dVar3.f44230a);
        d dVar4 = cVar.f44228a;
        C12373i.m46340m(dVar4.f44230a, jArr, dVar4.f44231b);
        long[] jArr4 = cVar.f44229b;
        C12373i.m46340m(jArr4, jArr4, cVar.f44228a.f44232c);
    }

    /* JADX INFO: renamed from: h */
    public static void m46259h(c cVar, e eVar) {
        m46258g(cVar, eVar.f44233a);
    }

    /* JADX INFO: renamed from: i */
    public static int m46260i(int i10, int i11) {
        int i12 = (~(i10 ^ i11)) & 255;
        int i13 = i12 & (i12 << 4);
        int i14 = i13 & (i13 << 2);
        return ((i14 & (i14 << 1)) >> 7) & 1;
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m46261j(byte[] bArr) {
        MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a("SHA-512");
        messageDigestM22699a.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigestM22699a.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b10 = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b10;
        bArrDigest[31] = (byte) (b10 | 64);
        return bArrDigest;
    }

    /* JADX INFO: renamed from: k */
    public static int m46262k(long[] jArr) {
        return C12373i.m46328a(jArr)[0] & 1;
    }

    /* JADX INFO: renamed from: l */
    public static void m46263l() {
        if (C12367f.f44236a == null) {
            throw new IllegalStateException("Could not initialize Ed25519.");
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m46264m(long[] jArr) {
        long[] jArr2 = new long[jArr.length + 1];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        C12373i.m46336i(jArr2);
        for (byte b10 : C12373i.m46328a(jArr2)) {
            if (b10 != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m46265n(byte[] bArr) {
        for (int i10 = 31; i10 >= 0; i10--) {
            int i11 = bArr[i10] & 255;
            int i12 = f44223c[i10] & 255;
            if (i11 != i12) {
                return i11 < i12;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public static long m46266o(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 2] & 255)) << 16) | (((long) bArr[i10]) & 255) | (((long) (bArr[i10 + 1] & 255)) << 8);
    }

    /* JADX INFO: renamed from: p */
    public static long m46267p(byte[] bArr, int i10) {
        return (((long) (bArr[i10 + 3] & 255)) << 24) | m46266o(bArr, i10);
    }

    /* JADX INFO: renamed from: q */
    public static void m46268q(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        long jM46266o = m46266o(bArr2, 0) & 2097151;
        long jM46267p = (m46267p(bArr2, 2) >> 5) & 2097151;
        long jM46266o2 = (m46266o(bArr2, 5) >> 2) & 2097151;
        long jM46267p2 = (m46267p(bArr2, 7) >> 7) & 2097151;
        long jM46267p3 = (m46267p(bArr2, 10) >> 4) & 2097151;
        long jM46266o3 = (m46266o(bArr2, 13) >> 1) & 2097151;
        long jM46267p4 = (m46267p(bArr2, 15) >> 6) & 2097151;
        long jM46266o4 = (m46266o(bArr2, 18) >> 3) & 2097151;
        long jM46266o5 = m46266o(bArr2, 21) & 2097151;
        long jM46267p5 = (m46267p(bArr2, 23) >> 5) & 2097151;
        long jM46266o6 = (m46266o(bArr2, 26) >> 2) & 2097151;
        long jM46267p6 = m46267p(bArr2, 28) >> 7;
        long jM46266o7 = m46266o(bArr3, 0) & 2097151;
        long jM46267p7 = (m46267p(bArr3, 2) >> 5) & 2097151;
        long jM46266o8 = (m46266o(bArr3, 5) >> 2) & 2097151;
        long jM46267p8 = (m46267p(bArr3, 7) >> 7) & 2097151;
        long jM46267p9 = (m46267p(bArr3, 10) >> 4) & 2097151;
        long jM46266o9 = (m46266o(bArr3, 13) >> 1) & 2097151;
        long jM46267p10 = (m46267p(bArr3, 15) >> 6) & 2097151;
        long jM46266o10 = (m46266o(bArr3, 18) >> 3) & 2097151;
        long jM46266o11 = m46266o(bArr3, 21) & 2097151;
        long jM46267p11 = (m46267p(bArr3, 23) >> 5) & 2097151;
        long jM46266o12 = (m46266o(bArr3, 26) >> 2) & 2097151;
        long jM46267p12 = m46267p(bArr3, 28) >> 7;
        long jM46266o13 = m46266o(bArr4, 0) & 2097151;
        long jM46267p13 = (m46267p(bArr4, 2) >> 5) & 2097151;
        long jM46266o14 = (m46266o(bArr4, 5) >> 2) & 2097151;
        long jM46267p14 = (m46267p(bArr4, 7) >> 7) & 2097151;
        long jM46267p15 = (m46267p(bArr4, 10) >> 4) & 2097151;
        long jM46266o15 = (m46266o(bArr4, 13) >> 1) & 2097151;
        long jM46267p16 = (m46267p(bArr4, 15) >> 6) & 2097151;
        long jM46266o16 = (m46266o(bArr4, 18) >> 3) & 2097151;
        long jM46266o17 = m46266o(bArr4, 21) & 2097151;
        long j10 = jM46266o13 + (jM46266o * jM46266o7);
        long j11 = jM46267p13 + (jM46266o * jM46267p7) + (jM46267p * jM46266o7);
        long j12 = jM46266o14 + (jM46266o * jM46266o8) + (jM46267p * jM46267p7) + (jM46266o2 * jM46266o7);
        long j13 = jM46267p14 + (jM46266o * jM46267p8) + (jM46267p * jM46266o8) + (jM46266o2 * jM46267p7) + (jM46267p2 * jM46266o7);
        long j14 = jM46267p15 + (jM46266o * jM46267p9) + (jM46267p * jM46267p8) + (jM46266o2 * jM46266o8) + (jM46267p2 * jM46267p7) + (jM46267p3 * jM46266o7);
        long j15 = jM46266o15 + (jM46266o * jM46266o9) + (jM46267p * jM46267p9) + (jM46266o2 * jM46267p8) + (jM46267p2 * jM46266o8) + (jM46267p3 * jM46267p7) + (jM46266o3 * jM46266o7);
        long j16 = jM46267p16 + (jM46266o * jM46267p10) + (jM46267p * jM46266o9) + (jM46266o2 * jM46267p9) + (jM46267p2 * jM46267p8) + (jM46267p3 * jM46266o8) + (jM46266o3 * jM46267p7) + (jM46267p4 * jM46266o7);
        long j17 = jM46266o16 + (jM46266o * jM46266o10) + (jM46267p * jM46267p10) + (jM46266o2 * jM46266o9) + (jM46267p2 * jM46267p9) + (jM46267p3 * jM46267p8) + (jM46266o3 * jM46266o8) + (jM46267p4 * jM46267p7) + (jM46266o4 * jM46266o7);
        long j18 = jM46266o17 + (jM46266o * jM46266o11) + (jM46267p * jM46266o10) + (jM46266o2 * jM46267p10) + (jM46267p2 * jM46266o9) + (jM46267p3 * jM46267p9) + (jM46266o3 * jM46267p8) + (jM46267p4 * jM46266o8) + (jM46266o4 * jM46267p7) + (jM46266o5 * jM46266o7);
        long jM46267p17 = ((m46267p(bArr4, 23) >> 5) & 2097151) + (jM46266o * jM46267p11) + (jM46267p * jM46266o11) + (jM46266o2 * jM46266o10) + (jM46267p2 * jM46267p10) + (jM46267p3 * jM46266o9) + (jM46266o3 * jM46267p9) + (jM46267p4 * jM46267p8) + (jM46266o4 * jM46266o8) + (jM46266o5 * jM46267p7) + (jM46267p5 * jM46266o7);
        long jM46266o18 = ((m46266o(bArr4, 26) >> 2) & 2097151) + (jM46266o * jM46266o12) + (jM46267p * jM46267p11) + (jM46266o2 * jM46266o11) + (jM46267p2 * jM46266o10) + (jM46267p3 * jM46267p10) + (jM46266o3 * jM46266o9) + (jM46267p4 * jM46267p9) + (jM46266o4 * jM46267p8) + (jM46266o5 * jM46266o8) + (jM46267p5 * jM46267p7) + (jM46266o6 * jM46266o7);
        long jM46267p18 = (m46267p(bArr4, 28) >> 7) + (jM46266o * jM46267p12) + (jM46267p * jM46266o12) + (jM46266o2 * jM46267p11) + (jM46267p2 * jM46266o11) + (jM46267p3 * jM46266o10) + (jM46266o3 * jM46267p10) + (jM46267p4 * jM46266o9) + (jM46266o4 * jM46267p9) + (jM46266o5 * jM46267p8) + (jM46267p5 * jM46266o8) + (jM46266o6 * jM46267p7) + (jM46266o7 * jM46267p6);
        long j19 = (jM46267p * jM46267p12) + (jM46266o2 * jM46266o12) + (jM46267p2 * jM46267p11) + (jM46267p3 * jM46266o11) + (jM46266o3 * jM46266o10) + (jM46267p4 * jM46267p10) + (jM46266o4 * jM46266o9) + (jM46266o5 * jM46267p9) + (jM46267p5 * jM46267p8) + (jM46266o6 * jM46266o8) + (jM46267p7 * jM46267p6);
        long j20 = (jM46266o2 * jM46267p12) + (jM46267p2 * jM46266o12) + (jM46267p3 * jM46267p11) + (jM46266o3 * jM46266o11) + (jM46267p4 * jM46266o10) + (jM46266o4 * jM46267p10) + (jM46266o5 * jM46266o9) + (jM46267p5 * jM46267p9) + (jM46266o6 * jM46267p8) + (jM46266o8 * jM46267p6);
        long j21 = (jM46267p2 * jM46267p12) + (jM46267p3 * jM46266o12) + (jM46266o3 * jM46267p11) + (jM46267p4 * jM46266o11) + (jM46266o4 * jM46266o10) + (jM46266o5 * jM46267p10) + (jM46267p5 * jM46266o9) + (jM46266o6 * jM46267p9) + (jM46267p8 * jM46267p6);
        long j22 = (jM46267p3 * jM46267p12) + (jM46266o3 * jM46266o12) + (jM46267p4 * jM46267p11) + (jM46266o4 * jM46266o11) + (jM46266o5 * jM46266o10) + (jM46267p5 * jM46267p10) + (jM46266o6 * jM46266o9) + (jM46267p9 * jM46267p6);
        long j23 = (jM46266o3 * jM46267p12) + (jM46267p4 * jM46266o12) + (jM46266o4 * jM46267p11) + (jM46266o5 * jM46266o11) + (jM46267p5 * jM46266o10) + (jM46266o6 * jM46267p10) + (jM46266o9 * jM46267p6);
        long j24 = (jM46267p4 * jM46267p12) + (jM46266o4 * jM46266o12) + (jM46266o5 * jM46267p11) + (jM46267p5 * jM46266o11) + (jM46266o6 * jM46266o10) + (jM46267p10 * jM46267p6);
        long j25 = (jM46266o4 * jM46267p12) + (jM46266o5 * jM46266o12) + (jM46267p5 * jM46267p11) + (jM46266o6 * jM46266o11) + (jM46266o10 * jM46267p6);
        long j26 = (jM46266o5 * jM46267p12) + (jM46267p5 * jM46266o12) + (jM46266o6 * jM46267p11) + (jM46266o11 * jM46267p6);
        long j27 = (jM46267p5 * jM46267p12) + (jM46266o6 * jM46266o12) + (jM46267p11 * jM46267p6);
        long j28 = (jM46266o6 * jM46267p12) + (jM46266o12 * jM46267p6);
        long j29 = jM46267p6 * jM46267p12;
        long j30 = (j10 + 1048576) >> 21;
        long j31 = j11 + j30;
        long j32 = j10 - (j30 << 21);
        long j33 = (j12 + 1048576) >> 21;
        long j34 = j13 + j33;
        long j35 = j12 - (j33 << 21);
        long j36 = (j14 + 1048576) >> 21;
        long j37 = j15 + j36;
        long j38 = j14 - (j36 << 21);
        long j39 = (j16 + 1048576) >> 21;
        long j40 = j17 + j39;
        long j41 = j16 - (j39 << 21);
        long j42 = (j18 + 1048576) >> 21;
        long j43 = jM46267p17 + j42;
        long j44 = j18 - (j42 << 21);
        long j45 = (jM46266o18 + 1048576) >> 21;
        long j46 = jM46267p18 + j45;
        long j47 = jM46266o18 - (j45 << 21);
        long j48 = (j19 + 1048576) >> 21;
        long j49 = j20 + j48;
        long j50 = j19 - (j48 << 21);
        long j51 = (j21 + 1048576) >> 21;
        long j52 = j22 + j51;
        long j53 = j21 - (j51 << 21);
        long j54 = (j23 + 1048576) >> 21;
        long j55 = j24 + j54;
        long j56 = j23 - (j54 << 21);
        long j57 = (j25 + 1048576) >> 21;
        long j58 = j26 + j57;
        long j59 = j25 - (j57 << 21);
        long j60 = (j27 + 1048576) >> 21;
        long j61 = j28 + j60;
        long j62 = j27 - (j60 << 21);
        long j63 = (j29 + 1048576) >> 21;
        long j64 = (j31 + 1048576) >> 21;
        long j65 = j35 + j64;
        long j66 = j31 - (j64 << 21);
        long j67 = (j34 + 1048576) >> 21;
        long j68 = j38 + j67;
        long j69 = j34 - (j67 << 21);
        long j70 = (j37 + 1048576) >> 21;
        long j71 = j41 + j70;
        long j72 = j37 - (j70 << 21);
        long j73 = (j40 + 1048576) >> 21;
        long j74 = j44 + j73;
        long j75 = j40 - (j73 << 21);
        long j76 = (j43 + 1048576) >> 21;
        long j77 = j47 + j76;
        long j78 = j43 - (j76 << 21);
        long j79 = (j46 + 1048576) >> 21;
        long j80 = j50 + j79;
        long j81 = j46 - (j79 << 21);
        long j82 = (j49 + 1048576) >> 21;
        long j83 = j53 + j82;
        long j84 = j49 - (j82 << 21);
        long j85 = (j52 + 1048576) >> 21;
        long j86 = j56 + j85;
        long j87 = j52 - (j85 << 21);
        long j88 = (j55 + 1048576) >> 21;
        long j89 = j59 + j88;
        long j90 = j55 - (j88 << 21);
        long j91 = (j58 + 1048576) >> 21;
        long j92 = j62 + j91;
        long j93 = j58 - (j91 << 21);
        long j94 = (j61 + 1048576) >> 21;
        long j95 = (j29 - (j63 << 21)) + j94;
        long j96 = j61 - (j94 << 21);
        long j97 = j87 + (j63 * 136657);
        long j98 = j86 - (j63 * 683901);
        long j99 = ((j84 + (j63 * 654183)) - (j95 * 997805)) + (j96 * 136657);
        long j100 = ((j83 - (j63 * 997805)) + (j95 * 136657)) - (j96 * 683901);
        long j101 = ((((j81 + (j63 * 666643)) + (j95 * 470296)) + (j96 * 654183)) - (j92 * 997805)) + (j93 * 136657);
        long j102 = ((((j80 + (j63 * 470296)) + (j95 * 654183)) - (j96 * 997805)) + (j92 * 136657)) - (j93 * 683901);
        long j103 = j71 + (j89 * 666643);
        long j104 = j74 + (j92 * 666643) + (j93 * 470296) + (j89 * 654183);
        long j105 = ((((j77 + (j95 * 666643)) + (j96 * 470296)) + (j92 * 654183)) - (j93 * 997805)) + (j89 * 136657);
        long j106 = (j103 + 1048576) >> 21;
        long j107 = j75 + (j93 * 666643) + (j89 * 470296) + j106;
        long j108 = j103 - (j106 << 21);
        long j109 = (j104 + 1048576) >> 21;
        long j110 = ((((j78 + (j96 * 666643)) + (j92 * 470296)) + (j93 * 654183)) - (j89 * 997805)) + j109;
        long j111 = j104 - (j109 << 21);
        long j112 = (j105 + 1048576) >> 21;
        long j113 = (j101 - (j89 * 683901)) + j112;
        long j114 = j105 - (j112 << 21);
        long j115 = (j102 + 1048576) >> 21;
        long j116 = (j99 - (j92 * 683901)) + j115;
        long j117 = j102 - (j115 << 21);
        long j118 = (j100 + 1048576) >> 21;
        long j119 = (j97 - (j95 * 683901)) + j118;
        long j120 = j100 - (j118 << 21);
        long j121 = (j98 + 1048576) >> 21;
        long j122 = j90 + j121;
        long j123 = j98 - (j121 << 21);
        long j124 = (j107 + 1048576) >> 21;
        long j125 = j111 + j124;
        long j126 = j107 - (j124 << 21);
        long j127 = (j110 + 1048576) >> 21;
        long j128 = j114 + j127;
        long j129 = j110 - (j127 << 21);
        long j130 = (j113 + 1048576) >> 21;
        long j131 = j117 + j130;
        long j132 = j113 - (j130 << 21);
        long j133 = (j116 + 1048576) >> 21;
        long j134 = j120 + j133;
        long j135 = j116 - (j133 << 21);
        long j136 = (j119 + 1048576) >> 21;
        long j137 = j123 + j136;
        long j138 = j119 - (j136 << 21);
        long j139 = j128 - (j122 * 683901);
        long j140 = ((j125 - (j122 * 997805)) + (j137 * 136657)) - (j138 * 683901);
        long j141 = ((((j108 + (j122 * 470296)) + (j137 * 654183)) - (j138 * 997805)) + (j134 * 136657)) - (j135 * 683901);
        long j142 = j32 + (j131 * 666643);
        long j143 = j65 + (j134 * 666643) + (j135 * 470296) + (j131 * 654183);
        long j144 = ((((j68 + (j137 * 666643)) + (j138 * 470296)) + (j134 * 654183)) - (j135 * 997805)) + (j131 * 136657);
        long j145 = (j142 + 1048576) >> 21;
        long j146 = j66 + (j135 * 666643) + (j131 * 470296) + j145;
        long j147 = j142 - (j145 << 21);
        long j148 = (j143 + 1048576) >> 21;
        long j149 = ((((j69 + (j138 * 666643)) + (j134 * 470296)) + (j135 * 654183)) - (j131 * 997805)) + j148;
        long j150 = j143 - (j148 << 21);
        long j151 = (j144 + 1048576) >> 21;
        long j152 = ((((((j72 + (j122 * 666643)) + (j137 * 470296)) + (j138 * 654183)) - (j134 * 997805)) + (j135 * 136657)) - (j131 * 683901)) + j151;
        long j153 = j144 - (j151 << 21);
        long j154 = (j141 + 1048576) >> 21;
        long j155 = ((((j126 + (j122 * 654183)) - (j137 * 997805)) + (j138 * 136657)) - (j134 * 683901)) + j154;
        long j156 = j141 - (j154 << 21);
        long j157 = (j140 + 1048576) >> 21;
        long j158 = ((j129 + (j122 * 136657)) - (j137 * 683901)) + j157;
        long j159 = j140 - (j157 << 21);
        long j160 = (j139 + 1048576) >> 21;
        long j161 = j132 + j160;
        long j162 = j139 - (j160 << 21);
        long j163 = (j146 + 1048576) >> 21;
        long j164 = j150 + j163;
        long j165 = j146 - (j163 << 21);
        long j166 = (j149 + 1048576) >> 21;
        long j167 = j153 + j166;
        long j168 = j149 - (j166 << 21);
        long j169 = (j152 + 1048576) >> 21;
        long j170 = j156 + j169;
        long j171 = j152 - (j169 << 21);
        long j172 = (j155 + 1048576) >> 21;
        long j173 = j159 + j172;
        long j174 = j155 - (j172 << 21);
        long j175 = (j158 + 1048576) >> 21;
        long j176 = (j161 + 1048576) >> 21;
        long j177 = j161 - (j176 << 21);
        long j178 = j147 + (j176 * 666643);
        long j179 = j165 + (j176 * 470296);
        long j180 = j164 + (j176 * 654183);
        long j181 = j168 - (j176 * 997805);
        long j182 = j167 + (j176 * 136657);
        long j183 = j171 - (j176 * 683901);
        long j184 = j178 >> 21;
        long j185 = j179 + j184;
        long j186 = j178 - (j184 << 21);
        long j187 = j185 >> 21;
        long j188 = j180 + j187;
        long j189 = j185 - (j187 << 21);
        long j190 = j188 >> 21;
        long j191 = j181 + j190;
        long j192 = j188 - (j190 << 21);
        long j193 = j191 >> 21;
        long j194 = j182 + j193;
        long j195 = j191 - (j193 << 21);
        long j196 = j194 >> 21;
        long j197 = j183 + j196;
        long j198 = j194 - (j196 << 21);
        long j199 = j197 >> 21;
        long j200 = j170 + j199;
        long j201 = j197 - (j199 << 21);
        long j202 = j200 >> 21;
        long j203 = j174 + j202;
        long j204 = j200 - (j202 << 21);
        long j205 = j203 >> 21;
        long j206 = j173 + j205;
        long j207 = j203 - (j205 << 21);
        long j208 = j206 >> 21;
        long j209 = (j158 - (j175 << 21)) + j208;
        long j210 = j206 - (j208 << 21);
        long j211 = j209 >> 21;
        long j212 = j162 + j175 + j211;
        long j213 = j209 - (j211 << 21);
        long j214 = j212 >> 21;
        long j215 = j177 + j214;
        long j216 = j212 - (j214 << 21);
        long j217 = j215 >> 21;
        long j218 = j215 - (j217 << 21);
        long j219 = j186 + (666643 * j217);
        long j220 = j189 + (470296 * j217);
        long j221 = j192 + (654183 * j217);
        long j222 = j195 - (997805 * j217);
        long j223 = j198 + (136657 * j217);
        long j224 = j201 - (j217 * 683901);
        long j225 = j219 >> 21;
        long j226 = j220 + j225;
        long j227 = j219 - (j225 << 21);
        long j228 = j226 >> 21;
        long j229 = j221 + j228;
        long j230 = j226 - (j228 << 21);
        long j231 = j229 >> 21;
        long j232 = j222 + j231;
        long j233 = j229 - (j231 << 21);
        long j234 = j232 >> 21;
        long j235 = j223 + j234;
        long j236 = j232 - (j234 << 21);
        long j237 = j235 >> 21;
        long j238 = j224 + j237;
        long j239 = j235 - (j237 << 21);
        long j240 = j238 >> 21;
        long j241 = j204 + j240;
        long j242 = j238 - (j240 << 21);
        long j243 = j241 >> 21;
        long j244 = j207 + j243;
        long j245 = j241 - (j243 << 21);
        long j246 = j244 >> 21;
        long j247 = j210 + j246;
        long j248 = j244 - (j246 << 21);
        long j249 = j247 >> 21;
        long j250 = j213 + j249;
        long j251 = j247 - (j249 << 21);
        long j252 = j250 >> 21;
        long j253 = j216 + j252;
        long j254 = j250 - (j252 << 21);
        long j255 = j253 >> 21;
        long j256 = j218 + j255;
        long j257 = j253 - (j255 << 21);
        bArr[0] = (byte) j227;
        bArr[1] = (byte) (j227 >> 8);
        bArr[2] = (byte) ((j227 >> 16) | (j230 << 5));
        bArr[3] = (byte) (j230 >> 3);
        bArr[4] = (byte) (j230 >> 11);
        bArr[5] = (byte) ((j230 >> 19) | (j233 << 2));
        bArr[6] = (byte) (j233 >> 6);
        bArr[7] = (byte) ((j233 >> 14) | (j236 << 7));
        bArr[8] = (byte) (j236 >> 1);
        bArr[9] = (byte) (j236 >> 9);
        bArr[10] = (byte) ((j236 >> 17) | (j239 << 4));
        bArr[11] = (byte) (j239 >> 4);
        bArr[12] = (byte) (j239 >> 12);
        bArr[13] = (byte) ((j239 >> 20) | (j242 << 1));
        bArr[14] = (byte) (j242 >> 7);
        bArr[15] = (byte) ((j242 >> 15) | (j245 << 6));
        bArr[16] = (byte) (j245 >> 2);
        bArr[17] = (byte) (j245 >> 10);
        bArr[18] = (byte) ((j245 >> 18) | (j248 << 3));
        bArr[19] = (byte) (j248 >> 5);
        bArr[20] = (byte) (j248 >> 13);
        bArr[21] = (byte) j251;
        bArr[22] = (byte) (j251 >> 8);
        bArr[23] = (byte) ((j251 >> 16) | (j254 << 5));
        bArr[24] = (byte) (j254 >> 3);
        bArr[25] = (byte) (j254 >> 11);
        bArr[26] = (byte) ((j254 >> 19) | (j257 << 2));
        bArr[27] = (byte) (j257 >> 6);
        bArr[28] = (byte) ((j257 >> 14) | (j256 << 7));
        bArr[29] = (byte) (j256 >> 1);
        bArr[30] = (byte) (j256 >> 9);
        bArr[31] = (byte) (j256 >> 17);
    }

    /* JADX INFO: renamed from: r */
    public static void m46269r(long[] jArr, long[] jArr2) {
        for (int i10 = 0; i10 < jArr2.length; i10++) {
            jArr[i10] = -jArr2[i10];
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m46270s(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        C12373i.m46338k(jArr3, jArr2);
        C12373i.m46338k(jArr4, jArr3);
        C12373i.m46338k(jArr4, jArr4);
        C12373i.m46333f(jArr4, jArr2, jArr4);
        C12373i.m46333f(jArr3, jArr3, jArr4);
        C12373i.m46338k(jArr3, jArr3);
        C12373i.m46333f(jArr3, jArr4, jArr3);
        C12373i.m46338k(jArr4, jArr3);
        for (int i10 = 1; i10 < 5; i10++) {
            C12373i.m46338k(jArr4, jArr4);
        }
        C12373i.m46333f(jArr3, jArr4, jArr3);
        C12373i.m46338k(jArr4, jArr3);
        for (int i11 = 1; i11 < 10; i11++) {
            C12373i.m46338k(jArr4, jArr4);
        }
        C12373i.m46333f(jArr4, jArr4, jArr3);
        C12373i.m46338k(jArr5, jArr4);
        for (int i12 = 1; i12 < 20; i12++) {
            C12373i.m46338k(jArr5, jArr5);
        }
        C12373i.m46333f(jArr4, jArr5, jArr4);
        C12373i.m46338k(jArr4, jArr4);
        for (int i13 = 1; i13 < 10; i13++) {
            C12373i.m46338k(jArr4, jArr4);
        }
        C12373i.m46333f(jArr3, jArr4, jArr3);
        C12373i.m46338k(jArr4, jArr3);
        for (int i14 = 1; i14 < 50; i14++) {
            C12373i.m46338k(jArr4, jArr4);
        }
        C12373i.m46333f(jArr4, jArr4, jArr3);
        C12373i.m46338k(jArr5, jArr4);
        for (int i15 = 1; i15 < 100; i15++) {
            C12373i.m46338k(jArr5, jArr5);
        }
        C12373i.m46333f(jArr4, jArr5, jArr4);
        C12373i.m46338k(jArr4, jArr4);
        for (int i16 = 1; i16 < 50; i16++) {
            C12373i.m46338k(jArr4, jArr4);
        }
        C12373i.m46333f(jArr3, jArr4, jArr3);
        C12373i.m46338k(jArr3, jArr3);
        C12373i.m46338k(jArr3, jArr3);
        C12373i.m46333f(jArr, jArr3, jArr2);
    }

    /* JADX INFO: renamed from: t */
    public static void m46271t(byte[] bArr) {
        long jM46266o = m46266o(bArr, 0) & 2097151;
        long jM46267p = (m46267p(bArr, 2) >> 5) & 2097151;
        long jM46266o2 = (m46266o(bArr, 5) >> 2) & 2097151;
        long jM46267p2 = (m46267p(bArr, 7) >> 7) & 2097151;
        long jM46267p3 = (m46267p(bArr, 10) >> 4) & 2097151;
        long jM46266o3 = (m46266o(bArr, 13) >> 1) & 2097151;
        long jM46267p4 = (m46267p(bArr, 15) >> 6) & 2097151;
        long jM46266o4 = (m46266o(bArr, 18) >> 3) & 2097151;
        long jM46266o5 = m46266o(bArr, 21) & 2097151;
        long jM46267p5 = (m46267p(bArr, 23) >> 5) & 2097151;
        long jM46266o6 = (m46266o(bArr, 26) >> 2) & 2097151;
        long jM46267p6 = (m46267p(bArr, 28) >> 7) & 2097151;
        long jM46267p7 = (m46267p(bArr, 31) >> 4) & 2097151;
        long jM46266o7 = (m46266o(bArr, 34) >> 1) & 2097151;
        long jM46267p8 = (m46267p(bArr, 36) >> 6) & 2097151;
        long jM46266o8 = (m46266o(bArr, 39) >> 3) & 2097151;
        long jM46266o9 = m46266o(bArr, 42) & 2097151;
        long jM46267p9 = (m46267p(bArr, 44) >> 5) & 2097151;
        long jM46266o10 = (m46266o(bArr, 47) >> 2) & 2097151;
        long jM46267p10 = (m46267p(bArr, 49) >> 7) & 2097151;
        long jM46267p11 = (m46267p(bArr, 52) >> 4) & 2097151;
        long jM46266o11 = (m46266o(bArr, 55) >> 1) & 2097151;
        long jM46267p12 = (m46267p(bArr, 57) >> 6) & 2097151;
        long jM46267p13 = m46267p(bArr, 60) >> 3;
        long j10 = jM46266o9 - (jM46267p13 * 683901);
        long j11 = ((jM46267p8 - (jM46267p13 * 997805)) + (jM46267p12 * 136657)) - (jM46266o11 * 683901);
        long j12 = ((((jM46267p7 + (jM46267p13 * 470296)) + (jM46267p12 * 654183)) - (jM46266o11 * 997805)) + (jM46267p11 * 136657)) - (jM46267p10 * 683901);
        long j13 = jM46267p4 + (jM46266o10 * 666643);
        long j14 = jM46266o4 + (jM46267p10 * 666643) + (jM46266o10 * 470296);
        long j15 = jM46266o5 + (jM46267p11 * 666643) + (jM46267p10 * 470296) + (jM46266o10 * 654183);
        long j16 = (((jM46267p5 + (jM46266o11 * 666643)) + (jM46267p11 * 470296)) + (jM46267p10 * 654183)) - (jM46266o10 * 997805);
        long j17 = ((((jM46266o6 + (jM46267p12 * 666643)) + (jM46266o11 * 470296)) + (jM46267p11 * 654183)) - (jM46267p10 * 997805)) + (jM46266o10 * 136657);
        long j18 = (((((jM46267p6 + (jM46267p13 * 666643)) + (jM46267p12 * 470296)) + (jM46266o11 * 654183)) - (jM46267p11 * 997805)) + (jM46267p10 * 136657)) - (jM46266o10 * 683901);
        long j19 = (j13 + 1048576) >> 21;
        long j20 = j14 + j19;
        long j21 = j13 - (j19 << 21);
        long j22 = (j15 + 1048576) >> 21;
        long j23 = j16 + j22;
        long j24 = j15 - (j22 << 21);
        long j25 = (j17 + 1048576) >> 21;
        long j26 = j18 + j25;
        long j27 = j17 - (j25 << 21);
        long j28 = (j12 + 1048576) >> 21;
        long j29 = ((((jM46266o7 + (jM46267p13 * 654183)) - (jM46267p12 * 997805)) + (jM46266o11 * 136657)) - (jM46267p11 * 683901)) + j28;
        long j30 = j12 - (j28 << 21);
        long j31 = (j11 + 1048576) >> 21;
        long j32 = ((jM46266o8 + (jM46267p13 * 136657)) - (jM46267p12 * 683901)) + j31;
        long j33 = j11 - (j31 << 21);
        long j34 = (j10 + 1048576) >> 21;
        long j35 = jM46267p9 + j34;
        long j36 = j10 - (j34 << 21);
        long j37 = (j20 + 1048576) >> 21;
        long j38 = j24 + j37;
        long j39 = j20 - (j37 << 21);
        long j40 = (j23 + 1048576) >> 21;
        long j41 = j27 + j40;
        long j42 = j23 - (j40 << 21);
        long j43 = (j26 + 1048576) >> 21;
        long j44 = j30 + j43;
        long j45 = j26 - (j43 << 21);
        long j46 = (j29 + 1048576) >> 21;
        long j47 = j33 + j46;
        long j48 = j29 - (j46 << 21);
        long j49 = (j32 + 1048576) >> 21;
        long j50 = j36 + j49;
        long j51 = j32 - (j49 << 21);
        long j52 = j41 - (j35 * 683901);
        long j53 = ((j38 - (j35 * 997805)) + (j50 * 136657)) - (j51 * 683901);
        long j54 = ((((j21 + (j35 * 470296)) + (j50 * 654183)) - (j51 * 997805)) + (j47 * 136657)) - (j48 * 683901);
        long j55 = jM46266o + (j44 * 666643);
        long j56 = jM46267p + (j48 * 666643) + (j44 * 470296);
        long j57 = jM46266o2 + (j47 * 666643) + (j48 * 470296) + (j44 * 654183);
        long j58 = (((jM46267p2 + (j51 * 666643)) + (j47 * 470296)) + (j48 * 654183)) - (j44 * 997805);
        long j59 = ((((jM46267p3 + (j50 * 666643)) + (j51 * 470296)) + (j47 * 654183)) - (j48 * 997805)) + (j44 * 136657);
        long j60 = (((((jM46266o3 + (j35 * 666643)) + (j50 * 470296)) + (j51 * 654183)) - (j47 * 997805)) + (j48 * 136657)) - (j44 * 683901);
        long j61 = (j55 + 1048576) >> 21;
        long j62 = j56 + j61;
        long j63 = j55 - (j61 << 21);
        long j64 = (j57 + 1048576) >> 21;
        long j65 = j58 + j64;
        long j66 = j57 - (j64 << 21);
        long j67 = (j59 + 1048576) >> 21;
        long j68 = j60 + j67;
        long j69 = j59 - (j67 << 21);
        long j70 = (j54 + 1048576) >> 21;
        long j71 = ((((j39 + (j35 * 654183)) - (j50 * 997805)) + (j51 * 136657)) - (j47 * 683901)) + j70;
        long j72 = j54 - (j70 << 21);
        long j73 = (j53 + 1048576) >> 21;
        long j74 = ((j42 + (j35 * 136657)) - (j50 * 683901)) + j73;
        long j75 = j53 - (j73 << 21);
        long j76 = (j52 + 1048576) >> 21;
        long j77 = j45 + j76;
        long j78 = j52 - (j76 << 21);
        long j79 = (j62 + 1048576) >> 21;
        long j80 = j66 + j79;
        long j81 = j62 - (j79 << 21);
        long j82 = (j65 + 1048576) >> 21;
        long j83 = j69 + j82;
        long j84 = j65 - (j82 << 21);
        long j85 = (j68 + 1048576) >> 21;
        long j86 = j72 + j85;
        long j87 = j68 - (j85 << 21);
        long j88 = (j71 + 1048576) >> 21;
        long j89 = j75 + j88;
        long j90 = j71 - (j88 << 21);
        long j91 = (j74 + 1048576) >> 21;
        long j92 = (j77 + 1048576) >> 21;
        long j93 = j77 - (j92 << 21);
        long j94 = j63 + (j92 * 666643);
        long j95 = j81 + (j92 * 470296);
        long j96 = j80 + (j92 * 654183);
        long j97 = j84 - (j92 * 997805);
        long j98 = j83 + (j92 * 136657);
        long j99 = j87 - (j92 * 683901);
        long j100 = j94 >> 21;
        long j101 = j95 + j100;
        long j102 = j94 - (j100 << 21);
        long j103 = j101 >> 21;
        long j104 = j96 + j103;
        long j105 = j101 - (j103 << 21);
        long j106 = j104 >> 21;
        long j107 = j97 + j106;
        long j108 = j104 - (j106 << 21);
        long j109 = j107 >> 21;
        long j110 = j98 + j109;
        long j111 = j107 - (j109 << 21);
        long j112 = j110 >> 21;
        long j113 = j99 + j112;
        long j114 = j110 - (j112 << 21);
        long j115 = j113 >> 21;
        long j116 = j86 + j115;
        long j117 = j113 - (j115 << 21);
        long j118 = j116 >> 21;
        long j119 = j90 + j118;
        long j120 = j116 - (j118 << 21);
        long j121 = j119 >> 21;
        long j122 = j89 + j121;
        long j123 = j119 - (j121 << 21);
        long j124 = j122 >> 21;
        long j125 = (j74 - (j91 << 21)) + j124;
        long j126 = j122 - (j124 << 21);
        long j127 = j125 >> 21;
        long j128 = j78 + j91 + j127;
        long j129 = j125 - (j127 << 21);
        long j130 = j128 >> 21;
        long j131 = j93 + j130;
        long j132 = j128 - (j130 << 21);
        long j133 = j131 >> 21;
        long j134 = j131 - (j133 << 21);
        long j135 = j102 + (666643 * j133);
        long j136 = j105 + (470296 * j133);
        long j137 = j108 + (654183 * j133);
        long j138 = j111 - (997805 * j133);
        long j139 = j114 + (136657 * j133);
        long j140 = j117 - (j133 * 683901);
        long j141 = j135 >> 21;
        long j142 = j136 + j141;
        long j143 = j135 - (j141 << 21);
        long j144 = j142 >> 21;
        long j145 = j137 + j144;
        long j146 = j142 - (j144 << 21);
        long j147 = j145 >> 21;
        long j148 = j138 + j147;
        long j149 = j145 - (j147 << 21);
        long j150 = j148 >> 21;
        long j151 = j139 + j150;
        long j152 = j148 - (j150 << 21);
        long j153 = j151 >> 21;
        long j154 = j140 + j153;
        long j155 = j151 - (j153 << 21);
        long j156 = j154 >> 21;
        long j157 = j120 + j156;
        long j158 = j154 - (j156 << 21);
        long j159 = j157 >> 21;
        long j160 = j123 + j159;
        long j161 = j157 - (j159 << 21);
        long j162 = j160 >> 21;
        long j163 = j126 + j162;
        long j164 = j160 - (j162 << 21);
        long j165 = j163 >> 21;
        long j166 = j129 + j165;
        long j167 = j163 - (j165 << 21);
        long j168 = j166 >> 21;
        long j169 = j132 + j168;
        long j170 = j166 - (j168 << 21);
        long j171 = j169 >> 21;
        long j172 = j134 + j171;
        long j173 = j169 - (j171 << 21);
        bArr[0] = (byte) j143;
        bArr[1] = (byte) (j143 >> 8);
        bArr[2] = (byte) ((j143 >> 16) | (j146 << 5));
        bArr[3] = (byte) (j146 >> 3);
        bArr[4] = (byte) (j146 >> 11);
        bArr[5] = (byte) ((j146 >> 19) | (j149 << 2));
        bArr[6] = (byte) (j149 >> 6);
        bArr[7] = (byte) ((j149 >> 14) | (j152 << 7));
        bArr[8] = (byte) (j152 >> 1);
        bArr[9] = (byte) (j152 >> 9);
        bArr[10] = (byte) ((j152 >> 17) | (j155 << 4));
        bArr[11] = (byte) (j155 >> 4);
        bArr[12] = (byte) (j155 >> 12);
        bArr[13] = (byte) ((j155 >> 20) | (j158 << 1));
        bArr[14] = (byte) (j158 >> 7);
        bArr[15] = (byte) ((j158 >> 15) | (j161 << 6));
        bArr[16] = (byte) (j161 >> 2);
        bArr[17] = (byte) (j161 >> 10);
        bArr[18] = (byte) ((j161 >> 18) | (j164 << 3));
        bArr[19] = (byte) (j164 >> 5);
        bArr[20] = (byte) (j164 >> 13);
        bArr[21] = (byte) j167;
        bArr[22] = (byte) (j167 >> 8);
        bArr[23] = (byte) ((j167 >> 16) | (j170 << 5));
        bArr[24] = (byte) (j170 >> 3);
        bArr[25] = (byte) (j170 >> 11);
        bArr[26] = (byte) ((j170 >> 19) | (j173 << 2));
        bArr[27] = (byte) (j173 >> 6);
        bArr[28] = (byte) ((j173 >> 14) | (j172 << 7));
        bArr[29] = (byte) (j172 >> 1);
        bArr[30] = (byte) (j172 >> 9);
        bArr[31] = (byte) (j172 >> 17);
    }

    /* JADX INFO: renamed from: u */
    public static d m46272u(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 32) {
                break;
            }
            int i12 = i11 * 2;
            bArr2[i12] = (byte) (bArr[i11] & 15);
            bArr2[i12 + 1] = (byte) (((bArr[i11] & 255) >> 4) & 15);
            i11++;
        }
        int i13 = 0;
        int i14 = 0;
        while (i13 < 63) {
            byte b10 = (byte) (bArr2[i13] + i14);
            bArr2[i13] = b10;
            int i15 = (b10 + 8) >> 4;
            bArr2[i13] = (byte) (b10 - (i15 << 4));
            i13++;
            i14 = i15;
        }
        bArr2[63] = (byte) (bArr2[63] + i14);
        c cVar = new c(f44222b);
        e eVar = new e();
        for (i10 = 1; i10 < 64; i10 += 2) {
            a aVar = new a(f44221a);
            m46274w(aVar, i10 / 2, bArr2[i10]);
            m46256e(cVar, e.m46286d(eVar, cVar), aVar);
        }
        d dVar = new d();
        m46258g(cVar, d.m46280a(dVar, cVar));
        m46258g(cVar, d.m46280a(dVar, cVar));
        m46258g(cVar, d.m46280a(dVar, cVar));
        m46258g(cVar, d.m46280a(dVar, cVar));
        for (int i16 = 0; i16 < 64; i16 += 2) {
            a aVar2 = new a(f44221a);
            m46274w(aVar2, i16 / 2, bArr2[i16]);
            m46256e(cVar, e.m46286d(eVar, cVar), aVar2);
        }
        d dVar2 = new d(cVar);
        if (dVar2.m46281b()) {
            return dVar2;
        }
        throw new IllegalStateException("arithmetic error in scalar multiplication");
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m46273v(byte[] bArr) {
        return m46272u(bArr).m46282c();
    }

    /* JADX INFO: renamed from: w */
    public static void m46274w(a aVar, int i10, byte b10) {
        int i11 = (b10 & 255) >> 7;
        int i12 = b10 - (((-i11) & b10) << 1);
        a[][] aVarArr = C12367f.f44239d;
        aVar.m46278a(aVarArr[i10][0], m46260i(i12, 1));
        aVar.m46278a(aVarArr[i10][1], m46260i(i12, 2));
        aVar.m46278a(aVarArr[i10][2], m46260i(i12, 3));
        aVar.m46278a(aVarArr[i10][3], m46260i(i12, 4));
        aVar.m46278a(aVarArr[i10][4], m46260i(i12, 5));
        aVar.m46278a(aVarArr[i10][5], m46260i(i12, 6));
        aVar.m46278a(aVarArr[i10][6], m46260i(i12, 7));
        aVar.m46278a(aVarArr[i10][7], m46260i(i12, 8));
        long[] jArrCopyOf = Arrays.copyOf(aVar.f44225b, 10);
        long[] jArrCopyOf2 = Arrays.copyOf(aVar.f44224a, 10);
        long[] jArrCopyOf3 = Arrays.copyOf(aVar.f44226c, 10);
        m46269r(jArrCopyOf3, jArrCopyOf3);
        aVar.m46278a(new a(jArrCopyOf, jArrCopyOf2, jArrCopyOf3), i11);
    }

    /* JADX INFO: renamed from: x */
    public static byte[] m46275x(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length);
        MessageDigest messageDigestM22699a = C4591m.f18800e.m22699a("SHA-512");
        messageDigestM22699a.update(bArr3, 32, 32);
        messageDigestM22699a.update(bArrCopyOfRange);
        byte[] bArrDigest = messageDigestM22699a.digest();
        m46271t(bArrDigest);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(m46272u(bArrDigest).m46282c(), 0, 32);
        messageDigestM22699a.reset();
        messageDigestM22699a.update(bArrCopyOfRange2);
        messageDigestM22699a.update(bArr2);
        messageDigestM22699a.update(bArrCopyOfRange);
        byte[] bArrDigest2 = messageDigestM22699a.digest();
        m46271t(bArrDigest2);
        byte[] bArr4 = new byte[32];
        m46268q(bArr4, bArrDigest2, bArr3, bArrDigest);
        return C4583e.m22661a(bArrCopyOfRange2, bArr4);
    }

    /* JADX INFO: renamed from: y */
    public static byte[] m46276y(byte[] bArr) {
        int i10;
        byte[] bArr2 = new byte[256];
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = (byte) (1 & ((bArr[i11 >> 3] & 255) >> (i11 & 7)));
        }
        for (int i12 = 0; i12 < 256; i12++) {
            if (bArr2[i12] != 0) {
                for (int i13 = 1; i13 <= 6 && (i10 = i12 + i13) < 256; i13++) {
                    byte b10 = bArr2[i10];
                    if (b10 != 0) {
                        byte b11 = bArr2[i12];
                        if ((b10 << i13) + b11 > 15) {
                            if (b11 - (b10 << i13) < -15) {
                                break;
                            }
                            bArr2[i12] = (byte) (b11 - (b10 << i13));
                            while (i10 < 256) {
                                if (bArr2[i10] == 0) {
                                    bArr2[i10] = 1;
                                    break;
                                }
                                bArr2[i10] = 0;
                                i10++;
                            }
                        } else {
                            bArr2[i12] = (byte) (b11 + (b10 << i13));
                            bArr2[i10] = 0;
                        }
                    }
                }
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: z */
    public static void m46277z(c cVar, e eVar, a aVar) {
        long[] jArr = new long[10];
        long[] jArr2 = cVar.f44228a.f44230a;
        d dVar = eVar.f44233a;
        C12373i.m46342o(jArr2, dVar.f44231b, dVar.f44230a);
        long[] jArr3 = cVar.f44228a.f44231b;
        d dVar2 = eVar.f44233a;
        C12373i.m46340m(jArr3, dVar2.f44231b, dVar2.f44230a);
        long[] jArr4 = cVar.f44228a.f44231b;
        C12373i.m46333f(jArr4, jArr4, aVar.f44224a);
        d dVar3 = cVar.f44228a;
        C12373i.m46333f(dVar3.f44232c, dVar3.f44230a, aVar.f44225b);
        C12373i.m46333f(cVar.f44229b, eVar.f44234b, aVar.f44226c);
        aVar.mo46279b(cVar.f44228a.f44230a, eVar.f44233a.f44232c);
        long[] jArr5 = cVar.f44228a.f44230a;
        C12373i.m46342o(jArr, jArr5, jArr5);
        d dVar4 = cVar.f44228a;
        C12373i.m46340m(dVar4.f44230a, dVar4.f44232c, dVar4.f44231b);
        d dVar5 = cVar.f44228a;
        long[] jArr6 = dVar5.f44231b;
        C12373i.m46342o(jArr6, dVar5.f44232c, jArr6);
        C12373i.m46340m(cVar.f44228a.f44232c, jArr, cVar.f44229b);
        long[] jArr7 = cVar.f44229b;
        C12373i.m46342o(jArr7, jArr, jArr7);
    }
}
