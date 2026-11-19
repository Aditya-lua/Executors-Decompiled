package com.google.crypto.tink.shaded.protobuf;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8463a;

    public static class a {
        public static void h(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws b0 {
            if (m(b10) || (((b << 28) + (b10 + 112)) >> 30) != 0 || m(b11) || m(b12)) {
                throw b0.d();
            }
            int iR = ((b & 7) << 18) | (r(b10) << 12) | (r(b11) << 6) | r(b12);
            cArr[i10] = l(iR);
            cArr[i10 + 1] = q(iR);
        }

        public static void i(byte b, char[] cArr, int i10) {
            cArr[i10] = (char) b;
        }

        public static void j(byte b, byte b10, byte b11, char[] cArr, int i10) throws b0 {
            if (m(b10) || ((b == -32 && b10 < -96) || ((b == -19 && b10 >= -96) || m(b11)))) {
                throw b0.d();
            }
            cArr[i10] = (char) (((b & 15) << 12) | (r(b10) << 6) | r(b11));
        }

        public static void k(byte b, byte b10, char[] cArr, int i10) throws b0 {
            if (b < -62 || m(b10)) {
                throw b0.d();
            }
            cArr[i10] = (char) (((b & 31) << 6) | r(b10));
        }

        public static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        public static boolean m(byte b) {
            return b > -65;
        }

        public static boolean n(byte b) {
            return b >= 0;
        }

        public static boolean o(byte b) {
            return b < -16;
        }

        public static boolean p(byte b) {
            return b < -32;
        }

        public static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        public static int r(byte b) {
            return b & 63;
        }
    }

    public static abstract class b {
        public abstract String a(byte[] bArr, int i10, int i11);

        public abstract int b(String str, byte[] bArr, int i10, int i11);

        public final boolean c(byte[] bArr, int i10, int i11) {
            return d(0, bArr, i10, i11) == 0;
        }

        public abstract int d(int i10, byte[] bArr, int i11, int i12);
    }

    public static final class c extends b {
        public static int e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return f(bArr, i10, i11);
        }

        public static int f(byte[] bArr, int i10, int i11) {
            while (i10 < i11) {
                int i12 = i10 + 1;
                byte b = bArr[i10];
                if (b < 0) {
                    if (b < -32) {
                        if (i12 >= i11) {
                            return b;
                        }
                        if (b >= -62) {
                            i10 += 2;
                            if (bArr[i12] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b >= -16) {
                        if (i12 >= i11 - 2) {
                            return r1.l(bArr, i12, i11);
                        }
                        int i13 = i10 + 2;
                        byte b10 = bArr[i12];
                        if (b10 <= -65 && (((b << 28) + (b10 + 112)) >> 30) == 0) {
                            int i14 = i10 + 3;
                            if (bArr[i13] <= -65) {
                                i10 += 4;
                                if (bArr[i14] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                    if (i12 >= i11 - 1) {
                        return r1.l(bArr, i12, i11);
                    }
                    int i15 = i10 + 2;
                    byte b11 = bArr[i12];
                    if (b11 <= -65 && ((b != -32 || b11 >= -96) && (b != -19 || b11 < -96))) {
                        i10 += 3;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                i10 = i12;
            }
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.b
        public String a(byte[] bArr, int i10, int i11) throws b0 {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b = bArr[i10];
                if (!a.n(b)) {
                    break;
                }
                i10++;
                a.i(b, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                if (a.n(b10)) {
                    int i16 = i14 + 1;
                    a.i(b10, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b11 = bArr[i17];
                        if (!a.n(b11)) {
                            break;
                        }
                        i17++;
                        a.i(b11, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (a.p(b10)) {
                    if (i15 >= i12) {
                        throw b0.d();
                    }
                    i10 += 2;
                    a.k(b10, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.o(b10)) {
                    if (i15 >= i12 - 1) {
                        throw b0.d();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.j(b10, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw b0.d();
                    }
                    byte b12 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b13 = bArr[i10 + 2];
                    i10 += 4;
                    a.h(b10, b12, b13, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.b
        public int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char cCharAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) cCharAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char cCharAt2 = str.charAt(i15);
                if (cCharAt2 < 128 && i16 < i14) {
                    bArr[i16] = (byte) cCharAt2;
                    i16++;
                } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                    int i17 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                    i16 += 2;
                    bArr[i17] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                        if (i16 > i14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i15, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i16);
                        }
                        int i18 = i15 + 1;
                        if (i18 != str.length()) {
                            char cCharAt3 = str.charAt(i18);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | Barcode.FORMAT_ITF);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new d(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | Barcode.FORMAT_ITF);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF);
                }
                i15++;
            }
            return i16;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
        
            if (r8[r9] > (-65)) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        
            if (r8[r9] > (-65)) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x0083, code lost:
        
            if (r8[r7] > (-65)) goto L53;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.r1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int d(int i10, byte[] bArr, int i11, int i12) {
            byte b;
            int i13;
            int i14;
            if (i10 != 0) {
                if (i11 >= i12) {
                    return i10;
                }
                byte b10 = (byte) i10;
                if (b10 < -32) {
                    if (b10 >= -62) {
                        i14 = i11 + 1;
                    }
                    return -1;
                }
                if (b10 < -16) {
                    byte b11 = (byte) (~(i10 >> 8));
                    if (b11 == 0) {
                        int i15 = i11 + 1;
                        byte b12 = bArr[i11];
                        if (i15 >= i12) {
                            return r1.j(b10, b12);
                        }
                        i11 = i15;
                        b11 = b12;
                    }
                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                        i14 = i11 + 1;
                    }
                    return -1;
                }
                byte b13 = (byte) (~(i10 >> 8));
                if (b13 == 0) {
                    i13 = i11 + 1;
                    b13 = bArr[i11];
                    if (i13 >= i12) {
                        return r1.j(b10, b13);
                    }
                    b = 0;
                } else {
                    b = (byte) (i10 >> 16);
                    i13 = i11;
                }
                if (b == 0) {
                    int i16 = i13 + 1;
                    byte b14 = bArr[i13];
                    if (i16 >= i12) {
                        return r1.k(b10, b13, b14);
                    }
                    b = b14;
                    i13 = i16;
                }
                if (b13 <= -65 && (((b10 << 28) + (b13 + 112)) >> 30) == 0 && b <= -65) {
                    i11 = i13 + 1;
                }
                return -1;
                i11 = i14;
            }
            return e(bArr, i11, i12);
        }
    }

    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    public static final class e extends b {
        public static boolean e() {
            return q1.E() && q1.F();
        }

        public static int f(byte[] bArr, long j10, int i10) {
            int iG = g(bArr, j10, i10);
            int i11 = i10 - iG;
            long j11 = j10 + ((long) iG);
            while (true) {
                byte bU = 0;
                while (i11 > 0) {
                    long j12 = j11 + 1;
                    bU = q1.u(bArr, j11);
                    if (bU < 0) {
                        j11 = j12;
                        break;
                    }
                    i11--;
                    j11 = j12;
                }
                if (i11 == 0) {
                    return 0;
                }
                int i12 = i11 - 1;
                if (bU < -32) {
                    if (i12 == 0) {
                        return bU;
                    }
                    i11 -= 2;
                    if (bU >= -62) {
                        long j13 = 1 + j11;
                        if (q1.u(bArr, j11) <= -65) {
                            j11 = j13;
                        }
                    }
                    return -1;
                }
                if (bU >= -16) {
                    if (i12 < 3) {
                        return h(bArr, bU, j11, i12);
                    }
                    i11 -= 4;
                    long j14 = 1 + j11;
                    byte bU2 = q1.u(bArr, j11);
                    if (bU2 <= -65 && (((bU << 28) + (bU2 + 112)) >> 30) == 0) {
                        long j15 = 2 + j11;
                        if (q1.u(bArr, j14) <= -65) {
                            j11 += 3;
                            if (q1.u(bArr, j15) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 < 2) {
                    return h(bArr, bU, j11, i12);
                }
                i11 -= 3;
                long j16 = 1 + j11;
                byte bU3 = q1.u(bArr, j11);
                if (bU3 <= -65 && ((bU != -32 || bU3 >= -96) && (bU != -19 || bU3 < -96))) {
                    j11 += 2;
                    if (q1.u(bArr, j16) > -65) {
                    }
                }
                return -1;
            }
        }

        public static int g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j10) & 7);
            while (i11 < i12) {
                long j11 = 1 + j10;
                if (q1.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > i10 || (q1.A(bArr, q1.f8445h + j10) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j10 += 8;
                i11 = i13;
            }
            while (i11 < i10) {
                long j12 = j10 + 1;
                if (q1.u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j12;
            }
            return i10;
        }

        public static int h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return r1.i(i10);
            }
            if (i11 == 1) {
                return r1.j(i10, q1.u(bArr, j10));
            }
            if (i11 == 2) {
                return r1.k(i10, q1.u(bArr, j10), q1.u(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.b
        public String a(byte[] bArr, int i10, int i11) throws b0 {
            Charset charset = a0.b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw b0.d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.r1.b
        public int b(String str, byte[] bArr, int i10, int i11) {
            long j10;
            long j11;
            long j12;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = ((long) i11) + j13;
            int length = str.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                if (i13 >= length || (cCharAt = str.charAt(i13)) >= 128) {
                    break;
                }
                q1.K(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j13 < j14) {
                    q1.K(bArr, j13, (byte) cCharAt2);
                    j12 = j14;
                    j11 = j10;
                    j13 += j10;
                } else if (cCharAt2 >= 2048 || j13 > j14 - 2) {
                    j11 = j10;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        j12 = j14;
                        if (j13 > j12 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, str.charAt(i12)))) {
                                throw new d(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = str.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                q1.K(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                q1.K(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | Barcode.FORMAT_ITF));
                                long j15 = j13 + 3;
                                q1.K(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | Barcode.FORMAT_ITF));
                                j13 += 4;
                                q1.K(bArr, j15, (byte) ((codePoint & 63) | Barcode.FORMAT_ITF));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    q1.K(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    q1.K(bArr, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | Barcode.FORMAT_ITF));
                    j13 += 3;
                    q1.K(bArr, j16, (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    q1.K(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    q1.K(bArr, j17, (byte) ((cCharAt2 & '?') | Barcode.FORMAT_ITF));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.q1.u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.q1.u(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.r1.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int d(int i10, byte[] bArr, int i11, int i12) {
            byte bU;
            long j10;
            if ((i11 | i12 | (bArr.length - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            long j11 = i11;
            long j12 = i12;
            if (i10 != 0) {
                if (j11 >= j12) {
                    return i10;
                }
                byte b = (byte) i10;
                if (b < -32) {
                    if (b >= -62) {
                        long j13 = 1 + j11;
                        if (q1.u(bArr, j11) <= -65) {
                            j11 = j13;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bU2 = (byte) (~(i10 >> 8));
                    if (bU2 == 0) {
                        long j14 = j11 + 1;
                        bU2 = q1.u(bArr, j11);
                        if (j14 >= j12) {
                            return r1.j(b, bU2);
                        }
                        j11 = j14;
                    }
                    if (bU2 <= -65 && ((b != -32 || bU2 >= -96) && (b != -19 || bU2 < -96))) {
                        j10 = j11 + 1;
                    }
                    return -1;
                }
                byte bU3 = (byte) (~(i10 >> 8));
                if (bU3 == 0) {
                    long j15 = j11 + 1;
                    bU3 = q1.u(bArr, j11);
                    if (j15 >= j12) {
                        return r1.j(b, bU3);
                    }
                    bU = 0;
                    j11 = j15;
                } else {
                    bU = (byte) (i10 >> 16);
                }
                if (bU == 0) {
                    long j16 = j11 + 1;
                    bU = q1.u(bArr, j11);
                    if (j16 >= j12) {
                        return r1.k(b, bU3, bU);
                    }
                    j11 = j16;
                }
                if (bU3 <= -65 && (((b << 28) + (bU3 + 112)) >> 30) == 0 && bU <= -65) {
                    j10 = j11 + 1;
                }
                return -1;
                j11 = j10;
            }
            return f(bArr, j11, (int) (j12 - j11));
        }
    }

    static {
        f8463a = (!e.e() || com.google.crypto.tink.shaded.protobuf.d.c()) ? new c() : new e();
    }

    public static String e(byte[] bArr, int i10, int i11) {
        return f8463a.a(bArr, i10, i11);
    }

    public static int f(String str, byte[] bArr, int i10, int i11) {
        return f8463a.b(str, bArr, i10, i11);
    }

    public static int g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int iH = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                iH += h(str, i10);
                break;
            }
            iH += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iH >= length) {
            return iH;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iH) + 4294967296L));
    }

    public static int h(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < 2048) {
                i11 += (127 - cCharAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= cCharAt && cCharAt <= 57343) {
                    if (Character.codePointAt(str, i10) < 65536) {
                        throw new d(i10, length);
                    }
                    i10++;
                }
            }
            i10++;
        }
        return i11;
    }

    public static int i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    public static int j(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    public static int k(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    public static int l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return i(b10);
        }
        if (i12 == 1) {
            return j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    public static boolean m(byte[] bArr, int i10, int i11) {
        return f8463a.c(bArr, i10, i11);
    }
}
