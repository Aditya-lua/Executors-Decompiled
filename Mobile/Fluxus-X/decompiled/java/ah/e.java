package ah;

import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[][] f435a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
    public static final int[][] b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f436c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, MlKitException.MODEL_HASH_MISMATCH, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, MlKitException.MODEL_HASH_MISMATCH, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, MlKitException.MODEL_HASH_MISMATCH, 126, 150}, new int[]{6, 24, 50, 76, MlKitException.MODEL_HASH_MISMATCH, Barcode.FORMAT_ITF, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f437d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    public static void a(wg.a aVar, zg.a aVar2, zg.c cVar, int i10, b bVar) throws vg.c {
        c(bVar);
        d(cVar, bVar);
        l(aVar2, i10, bVar);
        s(cVar, bVar);
        f(aVar, i10, bVar);
    }

    public static int b(int i10, int i11) {
        if (i11 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iN = n(i11);
        int iN2 = i10 << (iN - 1);
        while (n(iN2) >= iN) {
            iN2 ^= i11 << (n(iN2) - iN);
        }
        return iN2;
    }

    public static void c(b bVar) {
        bVar.a((byte) -1);
    }

    public static void d(zg.c cVar, b bVar) throws vg.c {
        j(bVar);
        e(bVar);
        r(cVar, bVar);
        k(bVar);
    }

    public static void e(b bVar) throws vg.c {
        if (bVar.b(8, bVar.d() - 8) == 0) {
            throw new vg.c();
        }
        bVar.f(8, bVar.d() - 8, 1);
    }

    public static void f(wg.a aVar, int i10, b bVar) throws vg.c {
        boolean zI;
        int iE = bVar.e() - 1;
        int iD = bVar.d() - 1;
        int i11 = 0;
        int i12 = -1;
        while (iE > 0) {
            if (iE == 6) {
                iE--;
            }
            while (iD >= 0 && iD < bVar.d()) {
                for (int i13 = 0; i13 < 2; i13++) {
                    int i14 = iE - i13;
                    if (o(bVar.b(i14, iD))) {
                        if (i11 < aVar.k()) {
                            zI = aVar.i(i11);
                            i11++;
                        } else {
                            zI = false;
                        }
                        if (i10 != -1 && d.f(i10, i14, iD)) {
                            zI = !zI;
                        }
                        bVar.g(i14, iD, zI);
                    }
                }
                iD += i12;
            }
            i12 = -i12;
            iD += i12;
            iE -= 2;
        }
        if (i11 == aVar.k()) {
            return;
        }
        throw new vg.c("Not all bits consumed: " + i11 + '/' + aVar.k());
    }

    public static void g(int i10, int i11, b bVar) throws vg.c {
        for (int i12 = 0; i12 < 8; i12++) {
            int i13 = i10 + i12;
            if (!o(bVar.b(i13, i11))) {
                throw new vg.c();
            }
            bVar.f(i13, i11, 0);
        }
    }

    public static void h(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 5; i12++) {
            int[] iArr = b[i12];
            for (int i13 = 0; i13 < 5; i13++) {
                bVar.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void i(int i10, int i11, b bVar) {
        for (int i12 = 0; i12 < 7; i12++) {
            int[] iArr = f435a[i12];
            for (int i13 = 0; i13 < 7; i13++) {
                bVar.f(i10 + i13, i11 + i12, iArr[i13]);
            }
        }
    }

    public static void j(b bVar) throws vg.c {
        int length = f435a[0].length;
        i(0, 0, bVar);
        i(bVar.e() - length, 0, bVar);
        i(0, bVar.e() - length, bVar);
        g(0, 7, bVar);
        g(bVar.e() - 8, 7, bVar);
        g(0, bVar.e() - 8, bVar);
        m(7, 0, bVar);
        m(bVar.d() - 8, 0, bVar);
        m(7, bVar.d() - 7, bVar);
    }

    public static void k(b bVar) {
        int i10 = 8;
        while (i10 < bVar.e() - 8) {
            int i11 = i10 + 1;
            int i12 = i11 % 2;
            if (o(bVar.b(i10, 6))) {
                bVar.f(i10, 6, i12);
            }
            if (o(bVar.b(6, i10))) {
                bVar.f(6, i10, i12);
            }
            i10 = i11;
        }
    }

    public static void l(zg.a aVar, int i10, b bVar) throws vg.c {
        int iD;
        wg.a aVar2 = new wg.a();
        p(aVar, i10, aVar2);
        for (int i11 = 0; i11 < aVar2.k(); i11++) {
            boolean zI = aVar2.i((aVar2.k() - 1) - i11);
            int[] iArr = f437d[i11];
            bVar.g(iArr[0], iArr[1], zI);
            int iE = 8;
            if (i11 < 8) {
                iD = 8;
                iE = (bVar.e() - i11) - 1;
            } else {
                iD = (bVar.d() - 7) + (i11 - 8);
            }
            bVar.g(iE, iD, zI);
        }
    }

    public static void m(int i10, int i11, b bVar) throws vg.c {
        for (int i12 = 0; i12 < 7; i12++) {
            int i13 = i11 + i12;
            if (!o(bVar.b(i10, i13))) {
                throw new vg.c();
            }
            bVar.f(i10, i13, 0);
        }
    }

    public static int n(int i10) {
        return 32 - Integer.numberOfLeadingZeros(i10);
    }

    public static boolean o(int i10) {
        return i10 == -1;
    }

    public static void p(zg.a aVar, int i10, wg.a aVar2) throws vg.c {
        if (!g.b(i10)) {
            throw new vg.c("Invalid mask pattern");
        }
        int iA = (aVar.a() << 3) | i10;
        aVar2.c(iA, 5);
        aVar2.c(b(iA, 1335), 10);
        wg.a aVar3 = new wg.a();
        aVar3.c(21522, 15);
        aVar2.q(aVar3);
        if (aVar2.k() == 15) {
            return;
        }
        throw new vg.c("should not happen but we got: " + aVar2.k());
    }

    public static void q(zg.c cVar, wg.a aVar) throws vg.c {
        aVar.c(cVar.f(), 6);
        aVar.c(b(cVar.f(), 7973), 12);
        if (aVar.k() == 18) {
            return;
        }
        throw new vg.c("should not happen but we got: " + aVar.k());
    }

    public static void r(zg.c cVar, b bVar) {
        if (cVar.f() < 2) {
            return;
        }
        int[] iArr = f436c[cVar.f() - 1];
        for (int i10 : iArr) {
            if (i10 >= 0) {
                for (int i11 : iArr) {
                    if (i11 >= 0 && o(bVar.b(i11, i10))) {
                        h(i11 - 2, i10 - 2, bVar);
                    }
                }
            }
        }
    }

    public static void s(zg.c cVar, b bVar) throws vg.c {
        if (cVar.f() < 7) {
            return;
        }
        wg.a aVar = new wg.a();
        q(cVar, aVar);
        int i10 = 17;
        for (int i11 = 0; i11 < 6; i11++) {
            for (int i12 = 0; i12 < 3; i12++) {
                boolean zI = aVar.i(i10);
                i10--;
                bVar.g(i11, (bVar.d() - 11) + i12, zI);
                bVar.g((bVar.d() - 11) + i12, i11, zI);
            }
        }
    }
}
