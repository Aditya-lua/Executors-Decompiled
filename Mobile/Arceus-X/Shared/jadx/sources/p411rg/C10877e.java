package p411rg;

import mg.C8522c;
import ng.C9470a;
import p381qg.C10580c;
import p381qg.EnumC10578a;

/* JADX INFO: renamed from: rg.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C10877e {

    /* JADX INFO: renamed from: a */
    public static final int[][] f38607a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: b */
    public static final int[][] f38608b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f38609c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f38610d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: a */
    public static void m41365a(C9470a c9470a, EnumC10578a enumC10578a, C10580c c10580c, int i10, C10874b c10874b) throws C8522c {
        m41367c(c10874b);
        m41368d(c10580c, c10874b);
        m41376l(enumC10578a, i10, c10874b);
        m41383s(c10580c, c10874b);
        m41370f(c9470a, i10, c10874b);
    }

    /* JADX INFO: renamed from: b */
    public static int m41366b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iM41378n = m41378n(i11);
        int iM41378n2 = i10 << (iM41378n - 1);
        while (m41378n(iM41378n2) >= iM41378n) {
            iM41378n2 ^= i11 << (m41378n(iM41378n2) - iM41378n);
        }
        return iM41378n2;
    }

    /* JADX INFO: renamed from: c */
    public static void m41367c(C10874b c10874b) {
        c10874b.m41328a((byte) -1);
    }

    /* JADX INFO: renamed from: d */
    public static void m41368d(C10580c c10580c, C10874b c10874b) throws C8522c {
        m41374j(c10874b);
        m41369e(c10874b);
        m41382r(c10580c, c10874b);
        m41375k(c10874b);
    }

    /* JADX INFO: renamed from: e */
    public static void m41369e(C10874b c10874b) throws C8522c {
        if (c10874b.m41329b(8, c10874b.m41331d() - 8) == 0) {
            throw new C8522c();
        }
        c10874b.m41333f(8, c10874b.m41331d() - 8, 1);
    }

    /* JADX INFO: renamed from: f */
    public static void m41370f(C9470a c9470a, int i10, C10874b c10874b) throws C8522c {
        boolean zM37310h;
        int iM41332e = c10874b.m41332e() - 1;
        int iM41331d = c10874b.m41331d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (iM41332e > 0) {
            if (iM41332e == 6) {
                iM41332e--;
            }
            while (iM41331d >= 0 && iM41331d < c10874b.m41331d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = iM41332e - i13;
                    if (m41379o(c10874b.m41329b(i14, iM41331d))) {
                        if (i11 < c9470a.m37311i()) {
                            zM37310h = c9470a.m37310h(i11);
                            i11++;
                        } else {
                            zM37310h = false;
                        }
                        if (i10 != -1 && C10876d.m41362f(i10, i14, iM41331d)) {
                            zM37310h = !zM37310h;
                        }
                        c10874b.m41334g(i14, iM41331d, zM37310h);
                    }
                }
                iM41331d += i12;
            }
            i12 = -i12;
            iM41331d += i12;
            iM41332e -= 2;
        }
        if (i11 == c9470a.m37311i()) {
            return;
        }
        throw new C8522c("Not all bits consumed: " + i11 + '/' + c9470a.m37311i());
    }

    /* JADX INFO: renamed from: g */
    public static void m41371g(int i10, int i11, C10874b c10874b) throws C8522c {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!m41379o(c10874b.m41329b(i13, i11))) {
                throw new C8522c();
            }
            c10874b.m41333f(i13, i11, 0);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m41372h(int i10, int i11, C10874b c10874b) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = f38608b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                c10874b.m41333f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m41373i(int i10, int i11, C10874b c10874b) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f38607a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                c10874b.m41333f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m41374j(C10874b c10874b) throws C8522c {
        int length = f38607a[0].length;
        m41373i(0, 0, c10874b);
        m41373i(c10874b.m41332e() - length, 0, c10874b);
        m41373i(0, c10874b.m41332e() - length, c10874b);
        m41371g(0, 7, c10874b);
        m41371g(c10874b.m41332e() - 8, 7, c10874b);
        m41371g(0, c10874b.m41332e() - 8, c10874b);
        m41377m(7, 0, c10874b);
        m41377m(c10874b.m41331d() - 8, 0, c10874b);
        m41377m(7, c10874b.m41331d() - 7, c10874b);
    }

    /* JADX INFO: renamed from: k */
    public static void m41375k(C10874b c10874b) {
        int i10 = 8;
        while (i10 < c10874b.m41332e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (m41379o(c10874b.m41329b(i10, 6))) {
                c10874b.m41333f(i10, 6, i12);
            }
            if (m41379o(c10874b.m41329b(6, i10))) {
                c10874b.m41333f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m41376l(EnumC10578a enumC10578a, int i10, C10874b c10874b) throws C8522c {
        int iM41331d;
        C9470a c9470a = new C9470a();
        m41380p(enumC10578a, i10, c9470a);
        for (int i11 = 0; i11 < c9470a.m37311i(); i11++) {
            boolean zM37310h = c9470a.m37310h((c9470a.m37311i() - 1) - i11);
            int[] iArr = f38610d[i11];
            c10874b.m41334g(iArr[0], iArr[1], zM37310h);
            int iM41332e = 8;
            if (i11 < 8) {
                iM41331d = 8;
                iM41332e = (c10874b.m41332e() - i11) - 1;
            } else {
                iM41331d = (c10874b.m41331d() - 7) + (i11 - 8);
            }
            c10874b.m41334g(iM41332e, iM41331d, zM37310h);
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m41377m(int i10, int i11, C10874b c10874b) throws C8522c {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!m41379o(c10874b.m41329b(i10, i13))) {
                throw new C8522c();
            }
            c10874b.m41333f(i10, i13, 0);
        }
    }

    /* JADX INFO: renamed from: n */
    public static int m41378n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    /* JADX INFO: renamed from: o */
    public static boolean m41379o(int i10) {
        return i10 == -1;
    }

    /* JADX INFO: renamed from: p */
    public static void m41380p(EnumC10578a enumC10578a, int i10, C9470a c9470a) throws C8522c {
        if (!C10879g.m41418b(i10)) {
            throw new C8522c("Invalid mask pattern");
        }
        int iM40549a = (enumC10578a.m40549a() << 3) | i10;
        c9470a.m37307c(iM40549a, 5);
        c9470a.m37307c(m41366b(iM40549a, 1335), 10);
        C9470a c9470a2 = new C9470a();
        c9470a2.m37307c(21522, 15);
        c9470a.m37314o(c9470a2);
        if (c9470a.m37311i() == 15) {
            return;
        }
        throw new C8522c("should not happen but we got: " + c9470a.m37311i());
    }

    /* JADX INFO: renamed from: q */
    public static void m41381q(C10580c c10580c, C9470a c9470a) throws C8522c {
        c9470a.m37307c(c10580c.m40557f(), 6);
        c9470a.m37307c(m41366b(c10580c.m40557f(), 7973), 12);
        if (c9470a.m37311i() == 18) {
            return;
        }
        throw new C8522c("should not happen but we got: " + c9470a.m37311i());
    }

    /* JADX INFO: renamed from: r */
    public static void m41382r(C10580c c10580c, C10874b c10874b) {
        if (c10580c.m40557f() < 2) {
            return;
        }
        int[] iArr = f38609c[c10580c.m40557f() - 1];
        for (int i10 : iArr) {
            if (i10 >= 0) {
                for (int i11 : iArr) {
                    if (i11 >= 0 && m41379o(c10874b.m41329b(i11, i10))) {
                        m41372h(i11 - 2, i10 - 2, c10874b);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m41383s(C10580c c10580c, C10874b c10874b) throws C8522c {
        if (c10580c.m40557f() < 7) {
            return;
        }
        C9470a c9470a = new C9470a();
        m41381q(c10580c, c9470a);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean zM37310h = c9470a.m37310h(i10);
                i10--;
                c10874b.m41334g(i11, (c10874b.m41331d() - 11) + i12, zM37310h);
                c10874b.m41334g((c10874b.m41331d() - 11) + i12, i11, zM37310h);
            }
        }
    }
}
