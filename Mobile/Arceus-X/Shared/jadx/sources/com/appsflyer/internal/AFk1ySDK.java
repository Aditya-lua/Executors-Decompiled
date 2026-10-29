package com.appsflyer.internal;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AFk1ySDK extends FilterInputStream {
    private final int AFKeystoreWrapper;
    private final int AFLogger;
    private int afInfoLog;

    /* JADX INFO: renamed from: d */
    private final int f7095d;

    /* JADX INFO: renamed from: e */
    private int f7096e;
    private long[] force;

    /* JADX INFO: renamed from: i */
    private byte[] f7097i;
    private int registerClient;
    private long[] unregisterClient;

    /* JADX INFO: renamed from: v */
    private short f7098v;

    /* JADX INFO: renamed from: w */
    private int f7099w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AFk1ySDK(InputStream inputStream, int i10, int i11, short s8, int i12, int i13) {
        this(inputStream, i10, i11, s8, i12, i13, (byte) 0);
    }

    private int AFKeystoreWrapper() throws IOException {
        int i10;
        if (this.f7096e == Integer.MAX_VALUE) {
            this.f7096e = ((FilterInputStream) this).in.read();
        }
        if (this.f7099w == this.AFKeystoreWrapper) {
            byte[] bArr = this.f7097i;
            int i11 = this.f7096e;
            bArr[0] = (byte) i11;
            if (i11 < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i12 = 1;
            do {
                int i13 = ((FilterInputStream) this).in.read(this.f7097i, i12, this.AFKeystoreWrapper - i12);
                if (i13 <= 0) {
                    break;
                }
                i12 += i13;
            } while (i12 < this.AFKeystoreWrapper);
            if (i12 < this.AFKeystoreWrapper) {
                throw new IllegalStateException("unexpected block size");
            }
            int i14 = this.AFLogger;
            if (i14 == this.f7095d) {
                unregisterClient();
            } else {
                if (this.registerClient <= i14) {
                    unregisterClient();
                }
                int i15 = this.registerClient;
                if (i15 < this.f7095d) {
                    this.registerClient = i15 + 1;
                } else {
                    this.registerClient = 1;
                }
            }
            int i16 = ((FilterInputStream) this).in.read();
            this.f7096e = i16;
            this.f7099w = 0;
            if (i16 < 0) {
                int i17 = this.AFKeystoreWrapper;
                i10 = i17 - (this.f7097i[i17 - 1] & 255);
            } else {
                i10 = this.AFKeystoreWrapper;
            }
            this.afInfoLog = i10;
        }
        return this.afInfoLog;
    }

    private void unregisterClient() {
        long[] jArr = this.unregisterClient;
        long[] jArr2 = this.force;
        short s8 = this.f7098v;
        long j10 = jArr[s8 % 4] * 2147483085;
        long j11 = jArr2[(s8 + 2) % 4];
        int i10 = (s8 + 3) % 4;
        jArr2[i10] = ((jArr[i10] * 2147483085) + j11) / 2147483647L;
        jArr[i10] = (j10 + j11) % 2147483647L;
        for (int i11 = 0; i11 < this.AFKeystoreWrapper; i11++) {
            byte[] bArr = this.f7097i;
            bArr[i11] = (byte) (((long) bArr[i11]) ^ ((this.unregisterClient[this.f7098v] >> (i11 << 3)) & 255));
        }
        this.f7098v = (short) ((this.f7098v + 1) % 4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() throws IOException {
        AFKeystoreWrapper();
        return this.afInfoLog - this.f7099w;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        AFKeystoreWrapper();
        int i10 = this.f7099w;
        if (i10 >= this.afInfoLog) {
            return -1;
        }
        byte[] bArr = this.f7097i;
        this.f7099w = i10 + 1;
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
    private AFk1ySDK(InputStream inputStream, int i10, int i11, short s8, int i12, int i13, byte b) {
        super(new BufferedInputStream(inputStream, 4096));
        this.registerClient = 1;
        this.f7096e = Integer.MAX_VALUE;
        int iMin = Math.min(Math.max((int) s8, 4), 8);
        this.AFKeystoreWrapper = iMin;
        this.f7097i = new byte[iMin];
        this.unregisterClient = new long[4];
        this.force = new long[4];
        this.f7099w = iMin;
        this.afInfoLog = iMin;
        this.unregisterClient = AFk1wSDK.AFKeystoreWrapper(i10 ^ i13, iMin ^ i13);
        this.force = AFk1wSDK.AFKeystoreWrapper(i11 ^ i13, i12 ^ i13);
        this.AFLogger = 100;
        this.f7095d = 100;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            AFKeystoreWrapper();
            int i14 = this.f7099w;
            if (i14 >= this.afInfoLog) {
                if (i13 == i10) {
                    return -1;
                }
                return i11 - (i12 - i13);
            }
            byte[] bArr2 = this.f7097i;
            this.f7099w = i14 + 1;
            bArr[i13] = bArr2[i14];
        }
        return i11;
    }
}
