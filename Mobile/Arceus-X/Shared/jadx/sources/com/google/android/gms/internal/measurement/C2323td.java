package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.td */
/* JADX INFO: loaded from: classes.dex */
public final class C2323td {
    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((r0v0 byte) >= (0 byte)) ? true : false */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m10770a(byte b) {
        return b >= 0;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m10771b(byte b, byte b10, char[] cArr, int i10) throws C2303sb {
        if (b < -62 || m10774e(b10)) {
            throw new C2303sb("Protocol message had invalid UTF-8.");
        }
        cArr[i10] = (char) (((b & 31) << 6) | (b10 & 63));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0013 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:11:0x0015  */
    /* JADX WARN: Code duplicated, block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x001c  */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10772c(byte b, byte b10, byte b11, char[] cArr, int i10) throws C2303sb {
        if (!m10774e(b10)) {
            if (b != -32) {
                if (b != -19) {
                    if (!m10774e(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b = -19;
                    if (!m10774e(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            } else if (b10 >= -96) {
                b = -32;
                if (b != -19) {
                    if (!m10774e(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                } else if (b10 < -96) {
                    b = -19;
                    if (!m10774e(b11)) {
                        cArr[i10] = (char) (((b & 15) << 12) | ((b10 & 63) << 6) | (b11 & 63));
                        return;
                    }
                }
            }
        }
        throw new C2303sb("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m10773d(byte b, byte b10, byte b11, byte b12, char[] cArr, int i10) throws C2303sb {
        if (m10774e(b10) || (((b << 28) + (b10 + 112)) >> 30) != 0 || m10774e(b11) || m10774e(b12)) {
            throw new C2303sb("Protocol message had invalid UTF-8.");
        }
        int i11 = ((b & 7) << 18) | ((b10 & 63) << 12) | ((b11 & 63) << 6) | (b12 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m10774e(byte b) {
        return b > -65;
    }
}
