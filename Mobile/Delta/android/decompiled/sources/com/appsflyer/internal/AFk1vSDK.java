package com.appsflyer.internal;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1vSDK extends FilterInputStream {
    private final int AFLoggerLogLevel;
    private final byte[] afDebugLog;
    private int afErrorLog;
    private final int afInfoLog;
    private int afWarnLog;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f5461e;
    private final byte[] force;
    private int getEntries;
    private int getLevel;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final byte[][] f5462i;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final int[] f5463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f5464w;
    private static final byte[] AFLogger = AFk1xSDK.registerClient;
    private static final int[] unregisterClient = AFk1xSDK.f5465d;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f5460d = AFk1xSDK.unregisterClient;
    private static final int[] registerClient = AFk1xSDK.AFKeystoreWrapper;
    private static final int[] AFKeystoreWrapper = AFk1xSDK.AFLogger;

    public AFk1vSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2) {
        this(inputStream, i10, bArr, bArr2, (byte) 0);
    }

    private void registerClient(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f5464w;
        char c10 = 1;
        char c11 = 2;
        char c12 = '\b';
        char c13 = 3;
        int i10 = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f5463v;
        iArr[0] = i10 ^ iArr2[0];
        char c14 = 5;
        char c15 = 6;
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((bArr[11] & 255) | (((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8))) ^ iArr2[2];
        char c16 = 14;
        iArr[3] = (((((bArr[13] & 255) << 16) | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255)) ^ iArr2[3];
        int i11 = 1;
        int i12 = 4;
        while (i11 < this.f5461e) {
            int[] iArr3 = unregisterClient;
            int[] iArr4 = this.f5464w;
            char c17 = c10;
            byte[][] bArr3 = this.f5462i;
            byte[] bArr4 = bArr3[0];
            int i13 = iArr3[iArr4[bArr4[0]] >>> 24];
            int[] iArr5 = f5460d;
            byte[] bArr5 = bArr3[c17];
            char c18 = c11;
            int i14 = i13 ^ iArr5[(iArr4[bArr5[0]] >>> 16) & 255];
            int[] iArr6 = registerClient;
            byte[] bArr6 = bArr3[c18];
            char c19 = c13;
            int i15 = i14 ^ iArr6[(iArr4[bArr6[0]] >>> 8) & 255];
            int[] iArr7 = AFKeystoreWrapper;
            byte[] bArr7 = bArr3[c19];
            char c20 = c12;
            int i16 = i15 ^ iArr7[iArr4[bArr7[0]] & 255];
            int[] iArr8 = this.f5463v;
            int i17 = i16 ^ iArr8[i12];
            char c21 = c16;
            char c22 = c14;
            int i18 = (((iArr3[iArr4[bArr4[c17]] >>> 24] ^ iArr5[(iArr4[bArr5[c17]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c17]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c17]] & 255]) ^ iArr8[i12 + 1];
            int i19 = (((iArr3[iArr4[bArr4[c18]] >>> 24] ^ iArr5[(iArr4[bArr5[c18]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c18]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c18]] & 255]) ^ iArr8[i12 + 2];
            int i20 = (((iArr3[iArr4[bArr4[c19]] >>> 24] ^ iArr5[(iArr4[bArr5[c19]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr6[c19]] >>> 8) & 255]) ^ iArr7[iArr4[bArr7[c19]] & 255]) ^ iArr8[i12 + 3];
            iArr4[0] = i17;
            iArr4[c17] = i18;
            iArr4[c18] = i19;
            iArr4[c19] = i20;
            i11++;
            i12 += 4;
            c10 = c17;
            c11 = c18;
            c13 = c19;
            c12 = c20;
            c14 = c22;
            c16 = c21;
            c15 = c15;
        }
        char c23 = c10;
        char c24 = c11;
        char c25 = c13;
        char c26 = c12;
        char c27 = c16;
        int[] iArr9 = this.f5463v;
        int i21 = iArr9[i12];
        byte[] bArr8 = AFLogger;
        int[] iArr10 = this.f5464w;
        byte[][] bArr9 = this.f5462i;
        byte[] bArr10 = bArr9[0];
        bArr2[0] = (byte) (bArr8[iArr10[bArr10[0]] >>> 24] ^ (i21 >>> 24));
        byte[] bArr11 = bArr9[c23];
        bArr2[c23] = (byte) (bArr8[(iArr10[bArr11[0]] >>> 16) & 255] ^ (i21 >>> 16));
        byte[] bArr12 = bArr9[c24];
        bArr2[c24] = (byte) (bArr8[(iArr10[bArr12[0]] >>> 8) & 255] ^ (i21 >>> 8));
        byte[] bArr13 = bArr9[c25];
        bArr2[c25] = (byte) (i21 ^ bArr8[iArr10[bArr13[0]] & 255]);
        int i22 = iArr9[i12 + 1];
        bArr2[4] = (byte) (bArr8[iArr10[bArr10[c23]] >>> 24] ^ (i22 >>> 24));
        bArr2[c14] = (byte) (bArr8[(iArr10[bArr11[c23]] >>> 16) & 255] ^ (i22 >>> 16));
        bArr2[c15] = (byte) (bArr8[(iArr10[bArr12[c23]] >>> 8) & 255] ^ (i22 >>> 8));
        bArr2[7] = (byte) (i22 ^ bArr8[iArr10[bArr13[c23]] & 255]);
        int i23 = iArr9[i12 + 2];
        bArr2[c26] = (byte) (bArr8[iArr10[bArr10[c24]] >>> 24] ^ (i23 >>> 24));
        bArr2[9] = (byte) (bArr8[(iArr10[bArr11[c24]] >>> 16) & 255] ^ (i23 >>> 16));
        bArr2[10] = (byte) (bArr8[(iArr10[bArr12[c24]] >>> 8) & 255] ^ (i23 >>> 8));
        bArr2[11] = (byte) (i23 ^ bArr8[iArr10[bArr13[c24]] & 255]);
        int i24 = iArr9[i12 + 3];
        bArr2[12] = (byte) (bArr8[iArr10[bArr10[c25]] >>> 24] ^ (i24 >>> 24));
        bArr2[13] = (byte) (bArr8[(iArr10[bArr11[c25]] >>> 16) & 255] ^ (i24 >>> 16));
        bArr2[c27] = (byte) (bArr8[(iArr10[bArr12[c25]] >>> 8) & 255] ^ (i24 >>> 8));
        bArr2[15] = (byte) (i24 ^ bArr8[iArr10[bArr13[c25]] & 255]);
    }

    private int unregisterClient() throws IOException {
        if (this.afErrorLog == Integer.MAX_VALUE) {
            this.afErrorLog = ((FilterInputStream) this).in.read();
        }
        if (this.getLevel == 16) {
            byte[] bArr = this.force;
            int i10 = this.afErrorLog;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.force, i11, 16 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 16);
            if (i11 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.AFLoggerLogLevel;
            if (i13 == this.afInfoLog) {
                registerClient(this.force, this.afDebugLog);
            } else {
                if (this.afWarnLog <= i13) {
                    registerClient(this.force, this.afDebugLog);
                } else {
                    byte[] bArr2 = this.force;
                    System.arraycopy(bArr2, 0, this.afDebugLog, 0, bArr2.length);
                }
                int i14 = this.afWarnLog;
                if (i14 < this.afInfoLog) {
                    this.afWarnLog = i14 + 1;
                } else {
                    this.afWarnLog = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.afErrorLog = i15;
            this.getLevel = 0;
            this.getEntries = i15 < 0 ? 16 - (this.afDebugLog[15] & 255) : 16;
        }
        return this.getEntries;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        unregisterClient();
        return this.getEntries - this.getLevel;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        unregisterClient();
        int i10 = this.getLevel;
        if (i10 >= this.getEntries) {
            return -1;
        }
        byte[] bArr = this.afDebugLog;
        this.getLevel = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    private AFk1vSDK(InputStream inputStream, int i10, byte[] bArr, byte[][] bArr2, byte b) {
        super(new BufferedInputStream(inputStream, Barcode.FORMAT_AZTEC));
        this.f5464w = new int[4];
        this.force = new byte[16];
        this.afDebugLog = new byte[16];
        this.afWarnLog = 1;
        this.afErrorLog = Integer.MAX_VALUE;
        this.getLevel = 16;
        this.getEntries = 16;
        this.f5461e = i10;
        this.f5463v = AFk1xSDK.AFLogger(bArr, i10);
        byte[][] bArr3 = new byte[bArr2.length][];
        for (int i11 = 0; i11 < bArr2.length; i11++) {
            bArr3[i11] = new byte[bArr2[i11].length];
            int i12 = 0;
            while (true) {
                byte[] bArr4 = bArr2[i11];
                if (i12 < bArr4.length) {
                    bArr3[i11][bArr4[i12]] = (byte) i12;
                    i12++;
                }
            }
        }
        this.f5462i = bArr3;
        this.AFLoggerLogLevel = 100;
        this.afInfoLog = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            unregisterClient();
            int i14 = this.getLevel;
            if (i14 >= this.getEntries) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.afDebugLog;
            this.getLevel = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
