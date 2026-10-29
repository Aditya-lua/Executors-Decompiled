package com.appsflyer.internal;

import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1aSDK extends FilterInputStream {
    private static final short registerClient = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] AFKeystoreWrapper;
    private byte[] AFLogger;
    private int AFLoggerLogLevel;
    private final int afDebugLog;
    private final int afErrorLog;
    private int afInfoLog;
    private int afWarnLog;

    /* JADX INFO: renamed from: d */
    private byte[] f7060d;

    /* JADX INFO: renamed from: e */
    private int f7061e;
    private int force;
    private int getEntries;

    /* JADX INFO: renamed from: i */
    private int f7062i;
    private int unregisterClient;

    /* JADX INFO: renamed from: v */
    private int f7063v;

    /* JADX INFO: renamed from: w */
    private int f7064w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AFj1aSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12) {
        this(inputStream, iArr, i10, bArr, i11, i12, (byte) 0);
    }

    private int AFKeystoreWrapper() throws IOException {
        if (this.force == Integer.MAX_VALUE) {
            this.force = ((FilterInputStream) this).in.read();
        }
        if (this.unregisterClient == 8) {
            byte[] bArr = this.AFLogger;
            int i10 = this.force;
            bArr[0] = (byte) i10;
            if (i10 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i11 = 1;
            do {
                int i12 = ((FilterInputStream) this).in.read(this.AFLogger, i11, 8 - i11);
                if (i12 <= 0) {
                    break;
                }
                i11 += i12;
            } while (i11 < 8);
            if (i11 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            int i13 = this.afErrorLog;
            if (i13 == this.afDebugLog) {
                unregisterClient();
            } else {
                if (this.getEntries <= i13) {
                    unregisterClient();
                }
                int i14 = this.getEntries;
                if (i14 < this.afDebugLog) {
                    this.getEntries = i14 + 1;
                } else {
                    this.getEntries = 1;
                }
            }
            int i15 = ((FilterInputStream) this).in.read();
            this.force = i15;
            this.unregisterClient = 0;
            this.f7064w = i15 < 0 ? 8 - (this.AFLogger[7] & 255) : 8;
        }
        return this.f7064w;
    }

    private void unregisterClient() {
        if (this.f7062i == 3) {
            byte[] bArr = this.AFLogger;
            System.arraycopy(bArr, 0, this.f7060d, 0, bArr.length);
        }
        byte[] bArr2 = this.AFLogger;
        boolean z10 = true;
        char c10 = 2;
        int i10 = ((bArr2[0] << 24) & ViewCompat.MEASURED_STATE_MASK) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK) + (bArr2[3] & 255);
        int i11 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i12 = 0;
        while (true) {
            int i13 = this.f7063v;
            if (i12 >= i13) {
                break;
            }
            short s8 = registerClient;
            i11 -= ((((i13 - i12) * s8) + i10) ^ ((i10 << 4) + this.afInfoLog)) ^ ((i10 >>> 5) + this.afWarnLog);
            i10 -= (((i11 << 4) + this.f7061e) ^ ((s8 * (i13 - i12)) + i11)) ^ ((i11 >>> 5) + this.AFLoggerLogLevel);
            i12++;
            c10 = c10;
            z10 = z10;
        }
        byte[] bArr3 = this.AFLogger;
        bArr3[0] = (byte) (i10 >> 24);
        bArr3[z10 ? 1 : 0] = (byte) (i10 >> 16);
        bArr3[c10] = (byte) (i10 >> 8);
        bArr3[3] = (byte) i10;
        bArr3[4] = (byte) (i11 >> 24);
        bArr3[5] = (byte) (i11 >> 16);
        bArr3[6] = (byte) (i11 >> 8);
        bArr3[7] = (byte) i11;
        if (this.f7062i == 3) {
            for (int i14 = 0; i14 < 8; i14++) {
                byte[] bArr4 = this.AFLogger;
                bArr4[i14] = (byte) (bArr4[i14] ^ this.AFKeystoreWrapper[i14]);
            }
            byte[] bArr5 = this.f7060d;
            System.arraycopy(bArr5, 0, this.AFKeystoreWrapper, 0, bArr5.length);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.f7064w - this.unregisterClient;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i10 = this.unregisterClient;
        if (i10 >= this.f7064w) {
            return -1;
        }
        byte[] bArr = this.AFLogger;
        this.unregisterClient = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) {
        long j11 = 0;
        while (j11 < j10 && read() != -1) {
            j11++;
        }
        return j11;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private AFj1aSDK(InputStream inputStream, int[] iArr, int i10, byte[] bArr, int i11, int i12, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.force = Integer.MAX_VALUE;
        this.getEntries = 1;
        this.AFLogger = new byte[8];
        this.AFKeystoreWrapper = new byte[8];
        this.f7060d = new byte[8];
        this.unregisterClient = 8;
        this.f7064w = 8;
        this.f7063v = Math.min(Math.max(i11, 5), 16);
        this.f7062i = i12;
        if (i12 == 3) {
            System.arraycopy(bArr, 0, this.AFKeystoreWrapper, 0, 8);
        }
        long j10 = (((long) iArr[1]) & 4294967295L) | ((((long) iArr[0]) & 4294967295L) << 32);
        if (i10 == 0) {
            this.f7061e = (int) j10;
            long j11 = j10 >> 3;
            short s8 = registerClient;
            this.AFLoggerLogLevel = (int) ((((long) s8) * j11) >> 32);
            this.afInfoLog = (int) (j10 >> 32);
            this.afWarnLog = (int) (j11 + ((long) s8));
        } else {
            int i13 = (int) j10;
            this.f7061e = i13;
            this.AFLoggerLogLevel = i13 * i10;
            this.afInfoLog = i10 ^ i13;
            this.afWarnLog = (int) (j10 >> 32);
        }
        this.afErrorLog = 100;
        this.afDebugLog = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFKeystoreWrapper();
            int i14 = this.unregisterClient;
            if (i14 >= this.f7064w) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.AFLogger;
            this.unregisterClient = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
