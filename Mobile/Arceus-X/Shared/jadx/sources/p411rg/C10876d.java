package p411rg;

/* JADX INFO: renamed from: rg.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C10876d {
    /* JADX INFO: renamed from: a */
    public static int m41357a(C10874b c10874b) {
        return m41358b(c10874b, true) + m41358b(c10874b, false);
    }

    /* JADX INFO: renamed from: b */
    public static int m41358b(C10874b c10874b, boolean z10) {
        int iM41331d = z10 ? c10874b.m41331d() : c10874b.m41332e();
        int iM41332e = z10 ? c10874b.m41332e() : c10874b.m41331d();
        byte[][] bArrM41330c = c10874b.m41330c();
        int i10 = 0;
        for (int i11 = 0; i11 < iM41331d; i11++) {
            byte b = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < iM41332e; i13++) {
                byte b10 = z10 ? bArrM41330c[i11][i13] : bArrM41330c[i13][i11];
                if (b10 == b) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += i12 - 2;
                    }
                    i12 = 1;
                    b = b10;
                }
            }
            if (i12 >= 5) {
                i10 += i12 - 2;
            }
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static int m41359c(C10874b c10874b) {
        byte[][] bArrM41330c = c10874b.m41330c();
        int iM41332e = c10874b.m41332e();
        int iM41331d = c10874b.m41331d();
        int i10 = 0;
        for (int i11 = 0; i11 < iM41331d - 1; i11++) {
            byte[] bArr = bArrM41330c[i11];
            int i12 = 0;
            while (i12 < iM41332e - 1) {
                byte b = bArr[i12];
                int i13 = i12 + 1;
                if (b == bArr[i13]) {
                    byte[] bArr2 = bArrM41330c[i11 + 1];
                    if (b == bArr2[i12] && b == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    /* JADX INFO: renamed from: d */
    public static int m41360d(C10874b c10874b) {
        byte[][] bArrM41330c = c10874b.m41330c();
        int iM41332e = c10874b.m41332e();
        int iM41331d = c10874b.m41331d();
        int i10 = 0;
        for (int i11 = 0; i11 < iM41331d; i11++) {
            for (int i12 = 0; i12 < iM41332e; i12++) {
                byte[] bArr = bArrM41330c[i11];
                int i13 = i12 + 6;
                if (i13 < iM41332e && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (m41363g(bArr, i12 - 4, i12) || m41363g(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < iM41331d && bArrM41330c[i11][i12] == 1 && bArrM41330c[i11 + 1][i12] == 0 && bArrM41330c[i11 + 2][i12] == 1 && bArrM41330c[i11 + 3][i12] == 1 && bArrM41330c[i11 + 4][i12] == 1 && bArrM41330c[i11 + 5][i12] == 0 && bArrM41330c[i14][i12] == 1 && (m41364h(bArrM41330c, i12, i11 - 4, i11) || m41364h(bArrM41330c, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    /* JADX INFO: renamed from: e */
    public static int m41361e(C10874b c10874b) {
        byte[][] bArrM41330c = c10874b.m41330c();
        int iM41332e = c10874b.m41332e();
        int iM41331d = c10874b.m41331d();
        int i10 = 0;
        for (int i11 = 0; i11 < iM41331d; i11++) {
            byte[] bArr = bArrM41330c[i11];
            for (int i12 = 0; i12 < iM41332e; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int iM41331d2 = c10874b.m41331d() * c10874b.m41332e();
        return ((Math.abs((i10 * 2) - iM41331d2) * 10) / iM41331d2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX INFO: renamed from: f */
    public static boolean m41362f(int i10, int i11, int i12) {
        int i13;
        int i14;
        switch (i10) {
            case 0:
                i12 += i11;
                i13 = i12 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 1:
                i13 = i12 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 2:
                i13 = i11 % 3;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 3:
                i13 = (i12 + i11) % 3;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 4:
                i12 /= 2;
                i11 /= 3;
                i12 += i11;
                i13 = i12 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 5:
                int i15 = i12 * i11;
                i13 = (i15 & 1) + (i15 % 3);
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 6:
                int i16 = i12 * i11;
                i14 = (i16 & 1) + (i16 % 3);
                i13 = i14 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            case 7:
                i14 = ((i12 * i11) % 3) + ((i12 + i11) & 1);
                i13 = i14 & 1;
                if (i13 == 0) {
                    return true;
                }
                return false;
            default:
                throw new IllegalArgumentException("Invalid mask pattern: " + i10);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m41363g(byte[] bArr, int i10, int i11) {
        if (i10 < 0 || bArr.length < i11) {
            return false;
        }
        while (i10 < i11) {
            if (bArr[i10] == 1) {
                return false;
            }
            i10++;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m41364h(byte[][] bArr, int i10, int i11, int i12) {
        if (i11 < 0 || bArr.length < i12) {
            return false;
        }
        while (i11 < i12) {
            if (bArr[i11][i10] == 1) {
                return false;
            }
            i11++;
        }
        return true;
    }
}
