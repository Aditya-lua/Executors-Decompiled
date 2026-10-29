package p076df;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: df.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C4582d {

    /* JADX INFO: renamed from: a */
    public static final Charset f18737a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: df.d$a */
    public static abstract class a {

        /* JADX INFO: renamed from: a */
        public byte[] f18738a;

        /* JADX INFO: renamed from: b */
        public int f18739b;
    }

    /* JADX INFO: renamed from: df.d$b */
    public static class b extends a {

        /* JADX INFO: renamed from: f */
        public static final int[] f18740f = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: g */
        public static final int[] f18741g = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

        /* JADX INFO: renamed from: c */
        public int f18742c;

        /* JADX INFO: renamed from: d */
        public int f18743d;

        /* JADX INFO: renamed from: e */
        public final int[] f18744e;

        public b(int i10, byte[] bArr) {
            this.f18738a = bArr;
            this.f18744e = (i10 & 8) == 0 ? f18740f : f18741g;
            this.f18742c = 0;
            this.f18743d = 0;
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00c0  */
        /* JADX INFO: renamed from: a */
        public boolean m22660a(byte[] bArr, int i10, int i11, boolean z10) {
            int i12 = this.f18742c;
            if (i12 == 6) {
                return false;
            }
            int i13 = i11 + i10;
            int i14 = this.f18743d;
            byte[] bArr2 = this.f18738a;
            int[] iArr = this.f18744e;
            int i15 = 0;
            int i16 = i14;
            int i17 = i12;
            int i18 = i10;
            while (i18 < i13) {
                if (i17 == 0) {
                    while (true) {
                        int i19 = i18 + 4;
                        if (i19 > i13 || (i16 = (iArr[bArr[i18] & 255] << 18) | (iArr[bArr[i18 + 1] & 255] << 12) | (iArr[bArr[i18 + 2] & 255] << 6) | iArr[bArr[i18 + 3] & 255]) < 0) {
                            break;
                        }
                        bArr2[i15 + 2] = (byte) i16;
                        bArr2[i15 + 1] = (byte) (i16 >> 8);
                        bArr2[i15] = (byte) (i16 >> 16);
                        i15 += 3;
                        i18 = i19;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                }
                int i20 = i18 + 1;
                int i21 = iArr[bArr[i18] & 255];
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 != 2) {
                            if (i17 != 3) {
                                if (i17 != 4) {
                                    if (i17 == 5 && i21 != -1) {
                                        this.f18742c = 6;
                                        return false;
                                    }
                                } else if (i21 == -2) {
                                    i17++;
                                } else if (i21 != -1) {
                                    this.f18742c = 6;
                                    return false;
                                }
                            } else if (i21 >= 0) {
                                int i22 = i21 | (i16 << 6);
                                bArr2[i15 + 2] = (byte) i22;
                                bArr2[i15 + 1] = (byte) (i22 >> 8);
                                bArr2[i15] = (byte) (i22 >> 16);
                                i15 += 3;
                                i16 = i22;
                                i17 = 0;
                            } else if (i21 == -2) {
                                bArr2[i15 + 1] = (byte) (i16 >> 2);
                                bArr2[i15] = (byte) (i16 >> 10);
                                i15 += 2;
                                i17 = 5;
                            } else if (i21 != -1) {
                                this.f18742c = 6;
                                return false;
                            }
                        } else if (i21 >= 0) {
                            i21 |= i16 << 6;
                            i17++;
                            i16 = i21;
                        } else if (i21 == -2) {
                            bArr2[i15] = (byte) (i16 >> 4);
                            i15++;
                            i17 = 4;
                        } else if (i21 != -1) {
                            this.f18742c = 6;
                            return false;
                        }
                    } else if (i21 >= 0) {
                        i21 |= i16 << 6;
                        i17++;
                        i16 = i21;
                    } else if (i21 != -1) {
                        this.f18742c = 6;
                        return false;
                    }
                } else if (i21 >= 0) {
                    i17++;
                    i16 = i21;
                } else if (i21 != -1) {
                    this.f18742c = 6;
                    return false;
                }
                i18 = i20;
            }
            if (!z10) {
                this.f18742c = i17;
                this.f18743d = i16;
                this.f18739b = i15;
                return true;
            }
            if (i17 == 1) {
                this.f18742c = 6;
                return false;
            }
            if (i17 == 2) {
                bArr2[i15] = (byte) (i16 >> 4);
                i15++;
            } else if (i17 == 3) {
                int i23 = i15 + 1;
                bArr2[i15] = (byte) (i16 >> 10);
                i15 += 2;
                bArr2[i23] = (byte) (i16 >> 2);
            } else if (i17 == 4) {
                this.f18742c = 6;
                return false;
            }
            this.f18742c = i17;
            this.f18739b = i15;
            return true;
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m22655a(String str) {
        return m22656b(str, 2);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m22656b(String str, int i10) {
        return m22657c(str.getBytes(f18737a), i10);
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m22657c(byte[] bArr, int i10) {
        return m22658d(bArr, 0, bArr.length, i10);
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m22658d(byte[] bArr, int i10, int i11, int i12) {
        b bVar = new b(i12, new byte[(i11 * 3) / 4]);
        if (!bVar.m22660a(bArr, i10, i11, true)) {
            throw new IllegalArgumentException("bad base-64");
        }
        int i13 = bVar.f18739b;
        byte[] bArr2 = bVar.f18738a;
        if (i13 == bArr2.length) {
            return bArr2;
        }
        byte[] bArr3 = new byte[i13];
        System.arraycopy(bArr2, 0, bArr3, 0, i13);
        return bArr3;
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m22659e(String str) {
        return m22656b(str, 11);
    }
}
