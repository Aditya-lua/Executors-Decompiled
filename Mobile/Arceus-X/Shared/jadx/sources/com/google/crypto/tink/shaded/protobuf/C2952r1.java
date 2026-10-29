package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2952r1 {

    /* JADX INFO: renamed from: a */
    public static final b f10989a;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r1$a */
    public static class a {
        /* JADX INFO: renamed from: h */
        public static void m14152h(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws C2903b0 {
            if (m14157m(b10) || (((b << 28) + (b10 + 112)) >> 30) != 0 || m14157m(b11) || m14157m(b12)) {
                throw C2903b0.m13399d();
            }
            int iM14162r = ((b & 7) << 18) | (m14162r(b10) << 12) | (m14162r(b11) << 6) | m14162r(b12);
            cArr[i10] = m14156l(iM14162r);
            cArr[i10 + 1] = m14161q(iM14162r);
        }

        /* JADX INFO: renamed from: i */
        public static void m14153i(byte b, char[] cArr, int i10) {
            cArr[i10] = (char) b;
        }

        /* JADX INFO: renamed from: j */
        public static void m14154j(byte b, byte b10, byte b11, char[] cArr, int i10) throws C2903b0 {
            if (m14157m(b10) || ((b == -32 && b10 < -96) || ((b == -19 && b10 >= -96) || m14157m(b11)))) {
                throw C2903b0.m13399d();
            }
            cArr[i10] = (char) (((b & 15) << 12) | (m14162r(b10) << 6) | m14162r(b11));
        }

        /* JADX INFO: renamed from: k */
        public static void m14155k(byte b, byte b10, char[] cArr, int i10) throws C2903b0 {
            if (b < -62 || m14157m(b10)) {
                throw C2903b0.m13399d();
            }
            cArr[i10] = (char) (((b & 31) << 6) | m14162r(b10));
        }

        /* JADX INFO: renamed from: l */
        public static char m14156l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        /* JADX INFO: renamed from: m */
        public static boolean m14157m(byte b) {
            return b > -65;
        }

        /* JADX INFO: renamed from: n */
        public static boolean m14158n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: o */
        public static boolean m14159o(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: p */
        public static boolean m14160p(byte b) {
            return b < -32;
        }

        /* JADX INFO: renamed from: q */
        public static char m14161q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        /* JADX INFO: renamed from: r */
        public static int m14162r(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r1$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract String mo14163a(byte[] bArr, int i10, int i11);

        /* JADX INFO: renamed from: b */
        public abstract int mo14164b(String str, byte[] bArr, int i10, int i11);

        /* JADX INFO: renamed from: c */
        public final boolean m14165c(byte[] bArr, int i10, int i11) {
            return mo14166d(0, bArr, i10, i11) == 0;
        }

        /* JADX INFO: renamed from: d */
        public abstract int mo14166d(int i10, byte[] bArr, int i11, int i12);
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r1$c */
    public static final class c extends b {
        /* JADX INFO: renamed from: e */
        public static int m14167e(byte[] bArr, int i10, int i11) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 >= i11) {
                return 0;
            }
            return m14168f(bArr, i10, i11);
        }

        /* JADX INFO: renamed from: f */
        public static int m14168f(byte[] bArr, int i10, int i11) {
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
                            return C2952r1.m14143l(bArr, i12, i11);
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
                        return C2952r1.m14143l(bArr, i12, i11);
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

        @Override // com.google.crypto.tink.shaded.protobuf.C2952r1.b
        /* JADX INFO: renamed from: a */
        public String mo14163a(byte[] bArr, int i10, int i11) throws C2903b0 {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b = bArr[i10];
                if (!a.m14158n(b)) {
                    break;
                }
                i10++;
                a.m14153i(b, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                if (a.m14158n(b10)) {
                    int i16 = i14 + 1;
                    a.m14153i(b10, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b11 = bArr[i17];
                        if (!a.m14158n(b11)) {
                            break;
                        }
                        i17++;
                        a.m14153i(b11, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (a.m14160p(b10)) {
                    if (i15 >= i12) {
                        throw C2903b0.m13399d();
                    }
                    i10 += 2;
                    a.m14155k(b10, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.m14159o(b10)) {
                    if (i15 >= i12 - 1) {
                        throw C2903b0.m13399d();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.m14154j(b10, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C2903b0.m13399d();
                    }
                    byte b12 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b13 = bArr[i10 + 2];
                    i10 += 4;
                    a.m14152h(b10, b12, b13, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2952r1.b
        /* JADX INFO: renamed from: b */
        public int mo14164b(String str, byte[] bArr, int i10, int i11) {
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
                    bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
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
                                bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i19 = i16 + 3;
                                bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i16 += 4;
                                bArr[i19] = (byte) ((codePoint & 63) | 128);
                                i15 = i18;
                            } else {
                                i15 = i18;
                            }
                        }
                        throw new d(i15 - 1, length);
                    }
                    bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i20 = i16 + 2;
                    bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i16 += 3;
                    bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
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
        @Override // com.google.crypto.tink.shaded.protobuf.C2952r1.b
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo14166d(int i10, byte[] bArr, int i11, int i12) {
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
                            return C2952r1.m14141j(b10, b12);
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
                        return C2952r1.m14141j(b10, b13);
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
                        return C2952r1.m14142k(b10, b13, b14);
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
            return m14167e(bArr, i11, i12);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r1$d */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r1$e */
    public static final class e extends b {
        /* JADX INFO: renamed from: e */
        public static boolean m14169e() {
            return C2949q1.m14070E() && C2949q1.m14071F();
        }

        /* JADX INFO: renamed from: f */
        public static int m14170f(byte[] bArr, long j10, int i10) {
            int iM14171g = m14171g(bArr, j10, i10);
            int i11 = i10 - iM14171g;
            long j11 = j10 + ((long) iM14171g);
            while (true) {
                byte bM14106u = 0;
                while (i11 > 0) {
                    long j12 = j11 + 1;
                    bM14106u = C2949q1.m14106u(bArr, j11);
                    if (bM14106u < 0) {
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
                if (bM14106u < -32) {
                    if (i12 == 0) {
                        return bM14106u;
                    }
                    i11 -= 2;
                    if (bM14106u >= -62) {
                        long j13 = 1 + j11;
                        if (C2949q1.m14106u(bArr, j11) <= -65) {
                            j11 = j13;
                        }
                    }
                    return -1;
                }
                if (bM14106u >= -16) {
                    if (i12 < 3) {
                        return m14172h(bArr, bM14106u, j11, i12);
                    }
                    i11 -= 4;
                    long j14 = 1 + j11;
                    byte bM14106u2 = C2949q1.m14106u(bArr, j11);
                    if (bM14106u2 <= -65 && (((bM14106u << 28) + (bM14106u2 + 112)) >> 30) == 0) {
                        long j15 = 2 + j11;
                        if (C2949q1.m14106u(bArr, j14) <= -65) {
                            j11 += 3;
                            if (C2949q1.m14106u(bArr, j15) > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i12 < 2) {
                    return m14172h(bArr, bM14106u, j11, i12);
                }
                i11 -= 3;
                long j16 = 1 + j11;
                byte bM14106u3 = C2949q1.m14106u(bArr, j11);
                if (bM14106u3 <= -65 && ((bM14106u != -32 || bM14106u3 >= -96) && (bM14106u != -19 || bM14106u3 < -96))) {
                    j11 += 2;
                    if (C2949q1.m14106u(bArr, j16) > -65) {
                    }
                }
                return -1;
            }
        }

        /* JADX INFO: renamed from: g */
        public static int m14171g(byte[] bArr, long j10, int i10) {
            int i11 = 0;
            if (i10 < 16) {
                return 0;
            }
            int i12 = 8 - (((int) j10) & 7);
            while (i11 < i12) {
                long j11 = 1 + j10;
                if (C2949q1.m14106u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j11;
            }
            while (true) {
                int i13 = i11 + 8;
                if (i13 > i10 || (C2949q1.m14066A(bArr, C2949q1.f10971h + j10) & (-9187201950435737472L)) != 0) {
                    break;
                }
                j10 += 8;
                i11 = i13;
            }
            while (i11 < i10) {
                long j12 = j10 + 1;
                if (C2949q1.m14106u(bArr, j10) < 0) {
                    return i11;
                }
                i11++;
                j10 = j12;
            }
            return i10;
        }

        /* JADX INFO: renamed from: h */
        public static int m14172h(byte[] bArr, int i10, long j10, int i11) {
            if (i11 == 0) {
                return C2952r1.m14140i(i10);
            }
            if (i11 == 1) {
                return C2952r1.m14141j(i10, C2949q1.m14106u(bArr, j10));
            }
            if (i11 == 2) {
                return C2952r1.m14142k(i10, C2949q1.m14106u(bArr, j10), C2949q1.m14106u(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2952r1.b
        /* JADX INFO: renamed from: a */
        public String mo14163a(byte[] bArr, int i10, int i11) throws C2903b0 {
            Charset charset = C2900a0.f10795b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw C2903b0.m13399d();
            }
            return str;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2952r1.b
        /* JADX INFO: renamed from: b */
        public int mo14164b(String str, byte[] bArr, int i10, int i11) {
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
                C2949q1.m14076K(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j13 < j14) {
                    C2949q1.m14076K(bArr, j13, (byte) cCharAt2);
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
                                C2949q1.m14076K(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                C2949q1.m14076K(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                C2949q1.m14076K(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                C2949q1.m14076K(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    C2949q1.m14076K(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    C2949q1.m14076K(bArr, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    C2949q1.m14076K(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    C2949q1.m14076K(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    C2949q1.m14076K(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }

        /* JADX WARN: Code restructure failed: missing block: B:35:0x0058, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.C2949q1.m14106u(r12, r0) > (-65)) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x009e, code lost:
        
            if (com.google.crypto.tink.shaded.protobuf.C2949q1.m14106u(r12, r0) > (-65)) goto L59;
         */
        @Override // com.google.crypto.tink.shaded.protobuf.C2952r1.b
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public int mo14166d(int i10, byte[] bArr, int i11, int i12) {
            byte bM14106u;
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
                        if (C2949q1.m14106u(bArr, j11) <= -65) {
                            j11 = j13;
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    byte bM14106u2 = (byte) (~(i10 >> 8));
                    if (bM14106u2 == 0) {
                        long j14 = j11 + 1;
                        bM14106u2 = C2949q1.m14106u(bArr, j11);
                        if (j14 >= j12) {
                            return C2952r1.m14141j(b, bM14106u2);
                        }
                        j11 = j14;
                    }
                    if (bM14106u2 <= -65 && ((b != -32 || bM14106u2 >= -96) && (b != -19 || bM14106u2 < -96))) {
                        j10 = j11 + 1;
                    }
                    return -1;
                }
                byte bM14106u3 = (byte) (~(i10 >> 8));
                if (bM14106u3 == 0) {
                    long j15 = j11 + 1;
                    bM14106u3 = C2949q1.m14106u(bArr, j11);
                    if (j15 >= j12) {
                        return C2952r1.m14141j(b, bM14106u3);
                    }
                    bM14106u = 0;
                    j11 = j15;
                } else {
                    bM14106u = (byte) (i10 >> 16);
                }
                if (bM14106u == 0) {
                    long j16 = j11 + 1;
                    bM14106u = C2949q1.m14106u(bArr, j11);
                    if (j16 >= j12) {
                        return C2952r1.m14142k(b, bM14106u3, bM14106u);
                    }
                    j11 = j16;
                }
                if (bM14106u3 <= -65 && (((b << 28) + (bM14106u3 + 112)) >> 30) == 0 && bM14106u <= -65) {
                    j10 = j11 + 1;
                }
                return -1;
                j11 = j10;
            }
            return m14170f(bArr, j11, (int) (j12 - j11));
        }
    }

    static {
        f10989a = (!e.m14169e() || C2908d.m13418c()) ? new c() : new e();
    }

    /* JADX INFO: renamed from: e */
    public static String m14136e(byte[] bArr, int i10, int i11) {
        return f10989a.mo14163a(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: f */
    public static int m14137f(String str, byte[] bArr, int i10, int i11) {
        return f10989a.mo14164b(str, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: g */
    public static int m14138g(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int iM14139h = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                iM14139h += m14139h(str, i10);
                break;
            }
            iM14139h += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iM14139h >= length) {
            return iM14139h;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iM14139h) + 4294967296L));
    }

    /* JADX INFO: renamed from: h */
    public static int m14139h(String str, int i10) {
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

    /* JADX INFO: renamed from: i */
    public static int m14140i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: renamed from: j */
    public static int m14141j(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: renamed from: k */
    public static int m14142k(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    /* JADX INFO: renamed from: l */
    public static int m14143l(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return m14140i(b10);
        }
        if (i12 == 1) {
            return m14141j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return m14142k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: m */
    public static boolean m14144m(byte[] bArr, int i10, int i11) {
        return f10989a.m14165c(bArr, i10, i11);
    }
}
