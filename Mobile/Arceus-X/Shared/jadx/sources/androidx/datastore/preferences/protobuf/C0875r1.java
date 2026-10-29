package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0875r1 {

    /* JADX INFO: renamed from: a */
    public static final b f2997a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1$a */
    public static class a {
        /* JADX INFO: renamed from: h */
        public static void m4043h(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws C0823a0 {
            if (m4048m(b10) || (((b << 28) + (b10 + 112)) >> 30) != 0 || m4048m(b11) || m4048m(b12)) {
                throw C0823a0.m3341d();
            }
            int iM4053r = ((b & 7) << 18) | (m4053r(b10) << 12) | (m4053r(b11) << 6) | m4053r(b12);
            cArr[i10] = m4047l(iM4053r);
            cArr[i10 + 1] = m4052q(iM4053r);
        }

        /* JADX INFO: renamed from: i */
        public static void m4044i(byte b, char[] cArr, int i10) {
            cArr[i10] = (char) b;
        }

        /* JADX INFO: renamed from: j */
        public static void m4045j(byte b, byte b10, byte b11, char[] cArr, int i10) throws C0823a0 {
            if (m4048m(b10) || ((b == -32 && b10 < -96) || ((b == -19 && b10 >= -96) || m4048m(b11)))) {
                throw C0823a0.m3341d();
            }
            cArr[i10] = (char) (((b & 15) << 12) | (m4053r(b10) << 6) | m4053r(b11));
        }

        /* JADX INFO: renamed from: k */
        public static void m4046k(byte b, byte b10, char[] cArr, int i10) throws C0823a0 {
            if (b < -62 || m4048m(b10)) {
                throw C0823a0.m3341d();
            }
            cArr[i10] = (char) (((b & 31) << 6) | m4053r(b10));
        }

        /* JADX INFO: renamed from: l */
        public static char m4047l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        /* JADX INFO: renamed from: m */
        public static boolean m4048m(byte b) {
            return b > -65;
        }

        /* JADX INFO: renamed from: n */
        public static boolean m4049n(byte b) {
            return b >= 0;
        }

        /* JADX INFO: renamed from: o */
        public static boolean m4050o(byte b) {
            return b < -16;
        }

        /* JADX INFO: renamed from: p */
        public static boolean m4051p(byte b) {
            return b < -32;
        }

        /* JADX INFO: renamed from: q */
        public static char m4052q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        /* JADX INFO: renamed from: r */
        public static int m4053r(byte b) {
            return b & 63;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1$b */
    public static abstract class b {
        /* JADX INFO: renamed from: a */
        public abstract String mo4054a(byte[] bArr, int i10, int i11);

        /* JADX INFO: renamed from: b */
        public abstract int mo4055b(String str, byte[] bArr, int i10, int i11);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1$c */
    public static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.C0875r1.b
        /* JADX INFO: renamed from: a */
        public String mo4054a(byte[] bArr, int i10, int i11) throws C0823a0 {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b = bArr[i10];
                if (!a.m4049n(b)) {
                    break;
                }
                i10++;
                a.m4044i(b, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte b10 = bArr[i10];
                if (a.m4049n(b10)) {
                    int i16 = i14 + 1;
                    a.m4044i(b10, cArr, i14);
                    int i17 = i15;
                    while (i17 < i12) {
                        byte b11 = bArr[i17];
                        if (!a.m4049n(b11)) {
                            break;
                        }
                        i17++;
                        a.m4044i(b11, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    i10 = i17;
                } else if (a.m4051p(b10)) {
                    if (i15 >= i12) {
                        throw C0823a0.m3341d();
                    }
                    i10 += 2;
                    a.m4046k(b10, bArr[i15], cArr, i14);
                    i14++;
                } else if (a.m4050o(b10)) {
                    if (i15 >= i12 - 1) {
                        throw C0823a0.m3341d();
                    }
                    int i18 = i10 + 2;
                    i10 += 3;
                    a.m4045j(b10, bArr[i15], bArr[i18], cArr, i14);
                    i14++;
                } else {
                    if (i15 >= i12 - 2) {
                        throw C0823a0.m3341d();
                    }
                    byte b12 = bArr[i15];
                    int i19 = i10 + 3;
                    byte b13 = bArr[i10 + 2];
                    i10 += 4;
                    a.m4043h(b10, b12, b13, bArr[i19], cArr, i14);
                    i14 += 2;
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.C0875r1.b
        /* JADX INFO: renamed from: b */
        public int mo4055b(String str, byte[] bArr, int i10, int i11) {
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
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1$d */
    public static class d extends IllegalArgumentException {
        public d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r1$e */
    public static final class e extends b {
        /* JADX INFO: renamed from: c */
        public static boolean m4056c() {
            return C0872q1.m3961B() && C0872q1.m3962C();
        }

        @Override // androidx.datastore.preferences.protobuf.C0875r1.b
        /* JADX INFO: renamed from: a */
        public String mo4054a(byte[] bArr, int i10, int i11) throws C0823a0 {
            Charset charset = C0892z.f3158b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                throw C0823a0.m3341d();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.C0875r1.b
        /* JADX INFO: renamed from: b */
        public int mo4055b(String str, byte[] bArr, int i10, int i11) {
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
                C0872q1.m3967H(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = str.charAt(i13);
                if (cCharAt2 < 128 && j13 < j14) {
                    C0872q1.m3967H(bArr, j13, (byte) cCharAt2);
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
                                C0872q1.m3967H(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                C0872q1.m3967H(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j15 = j13 + 3;
                                C0872q1.m3967H(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j13 += 4;
                                C0872q1.m3967H(bArr, j15, (byte) ((codePoint & 63) | 128));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new d(i13 - 1, length);
                    }
                    C0872q1.m3967H(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j16 = j13 + 2;
                    j12 = j14;
                    C0872q1.m3967H(bArr, j13 + j11, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    j13 += 3;
                    C0872q1.m3967H(bArr, j16, (byte) ((cCharAt2 & '?') | 128));
                } else {
                    j11 = j10;
                    long j17 = j13 + j11;
                    C0872q1.m3967H(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    j13 += 2;
                    C0872q1.m3967H(bArr, j17, (byte) ((cCharAt2 & '?') | 128));
                    j12 = j14;
                }
                i13++;
                j10 = j11;
                j14 = j12;
            }
            return (int) j13;
        }
    }

    static {
        f2997a = (!e.m4056c() || C0831d.m3370c()) ? new c() : new e();
    }

    /* JADX INFO: renamed from: a */
    public static String m4032a(byte[] bArr, int i10, int i11) {
        return f2997a.mo4054a(bArr, i10, i11);
    }

    /* JADX INFO: renamed from: b */
    public static int m4033b(String str, byte[] bArr, int i10, int i11) {
        return f2997a.mo4055b(str, bArr, i10, i11);
    }

    /* JADX INFO: renamed from: c */
    public static int m4034c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int iM4035d = length;
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt >= 2048) {
                iM4035d += m4035d(str, i10);
                break;
            }
            iM4035d += (127 - cCharAt) >>> 31;
            i10++;
        }
        if (iM4035d >= length) {
            return iM4035d;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) iM4035d) + 4294967296L));
    }

    /* JADX INFO: renamed from: d */
    public static int m4035d(String str, int i10) {
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
}
