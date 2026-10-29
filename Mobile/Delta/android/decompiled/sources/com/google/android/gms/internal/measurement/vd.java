package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class vd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6854a = 0;

    static {
        if (sd.f() && sd.g()) {
            int i10 = u9.f6826a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0076 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x007a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(byte[] bArr, int i10, int i11) {
        while (i10 < i11 && bArr[i10] >= 0) {
            i10++;
        }
        if (i10 >= i11) {
            return true;
        }
        while (i10 < i11) {
            int i12 = i10 + 1;
            int iD = bArr[i10];
            if (iD >= 0) {
                i10 = i12;
            } else if (iD < -32) {
                if (i12 >= i11) {
                    if (iD != 0) {
                        return false;
                    }
                    return true;
                }
                if (iD < -62) {
                    return false;
                }
                i10 += 2;
                if (bArr[i12] > -65) {
                    return false;
                }
            } else if (iD < -16) {
                if (i12 >= i11 - 1) {
                    iD = d(bArr, i12, i11);
                    if (iD != 0) {
                        return false;
                    }
                    return true;
                }
                int i13 = i10 + 2;
                char c10 = bArr[i12];
                if (c10 > -65) {
                    return false;
                }
                if (iD == -32 && c10 < -96) {
                    return false;
                }
                if (iD == -19 && c10 >= -96) {
                    return false;
                }
                i10 += 3;
                if (bArr[i13] > -65) {
                    return false;
                }
            } else {
                if (i12 >= i11 - 2) {
                    iD = d(bArr, i12, i11);
                    if (iD != 0) {
                        return false;
                    }
                    return true;
                }
                int i14 = i10 + 2;
                int i15 = bArr[i12];
                if (i15 > -65 || (((iD << 28) + (i15 + 112)) >> 30) != 0) {
                    return false;
                }
                int i16 = i10 + 3;
                if (bArr[i14] > -65) {
                    return false;
                }
                i10 += 4;
                if (bArr[i16] > -65) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int b(String str) {
        int length = str.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && str.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                while (i11 < length2) {
                    char cCharAt2 = str.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(str, i11) < 65536) {
                                throw new ud(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        long j10 = ((long) i12) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j10);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int c(String str, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        char cCharAt;
        int length = str.length();
        int i15 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i15 >= length || (i14 = i15 + i10) >= i12 || (cCharAt = str.charAt(i15)) >= 128) {
                break;
            }
            bArr[i14] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = str.charAt(i15);
            if (cCharAt2 < 128 && i16 < i12) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i12 - 2) {
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                bArr[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 2;
            } else {
                if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i16 > i12 - 3) {
                    if (i16 > i12 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i13 = i15 + 1) == str.length() || !Character.isSurrogatePair(cCharAt2, str.charAt(i13)))) {
                            throw new ud(i15, length);
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(cCharAt2).length() + 25 + String.valueOf(i16).length());
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i16);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i17 = i15 + 1;
                    if (i17 != str.length()) {
                        char cCharAt3 = str.charAt(i17);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int i18 = i16 + 3;
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i18] = (byte) ((codePoint & 63) | 128);
                            i15 = i17;
                        } else {
                            i15 = i17;
                        }
                    }
                    throw new ud(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                bArr[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                i16 += 3;
            }
            i15++;
        }
        return i16;
    }

    public static /* synthetic */ int d(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b = bArr[i10 - 1];
        if (i12 == 0) {
            if (b <= -12) {
                return b;
            }
            return -1;
        }
        if (i12 == 1) {
            byte b10 = bArr[i10];
            if (b > -12 || b10 > -65) {
                return -1;
            }
            return (b10 << 8) ^ b;
        }
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b11 = bArr[i10];
        byte b12 = bArr[i10 + 1];
        if (b > -12 || b11 > -65 || b12 > -65) {
            return -1;
        }
        return (b12 << 16) ^ ((b11 << 8) ^ b);
    }
}
