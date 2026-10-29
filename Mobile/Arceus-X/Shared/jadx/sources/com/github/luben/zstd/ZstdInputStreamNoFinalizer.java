package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class ZstdInputStreamNoFinalizer extends FilterInputStream {
    private static final int srcBuffSize;
    private final BufferPool bufferPool;
    private long dstPos;
    private boolean frameFinished;
    private boolean isClosed;
    private boolean isContinuous;
    private boolean needRead;
    private final byte[] src;
    private final ByteBuffer srcByteBuffer;
    private long srcPos;
    private long srcSize;
    private final long stream;

    static {
        Native.load();
        srcBuffSize = (int) recommendedDInSize();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZstdInputStreamNoFinalizer(InputStream inputStream) {
        this(inputStream, NoPool.INSTANCE);
    }

    private static native long createDStream();

    private native int decompressStream(long j10, byte[] bArr, int i10, byte[] bArr2, int i11);

    private static native int freeDStream(long j10);

    private native int initDStream(long j10);

    public static native long recommendedDInSize();

    public static native long recommendedDOutSize();

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (!this.needRead) {
            return 1;
        }
        return ((FilterInputStream) this).in.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.bufferPool.release(this.srcByteBuffer);
        freeDStream(this.stream);
        ((FilterInputStream) this).in.close();
    }

    public synchronized boolean getContinuous() {
        return this.isContinuous;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i10, int i11) {
        if (i10 >= 0) {
            if (i11 <= bArr.length - i10) {
                int internal = 0;
                if (i11 == 0) {
                    return 0;
                }
                while (internal == 0) {
                    internal = readInternal(bArr, i10, i11);
                }
                return internal;
            }
        }
        throw new IndexOutOfBoundsException("Requested length " + i11 + " from offset " + i10 + " in buffer of size " + bArr.length);
    }

    public int readInternal(byte[] bArr, int i10, int i11) throws IOException {
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (i10 < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException("Requested length " + i11 + " from offset " + i10 + " in buffer of size " + bArr.length);
        }
        int i12 = i10 + i11;
        long j10 = i10;
        this.dstPos = j10;
        long j11 = -1;
        while (true) {
            long j12 = this.dstPos;
            long j13 = i12;
            if (j12 >= j13 || j11 >= j12) {
                return (int) (j12 - j10);
            }
            boolean z10 = false;
            if (this.needRead && (((FilterInputStream) this).in.available() > 0 || this.dstPos == j10)) {
                long j14 = ((FilterInputStream) this).in.read(this.src, 0, srcBuffSize);
                this.srcSize = j14;
                this.srcPos = 0L;
                if (j14 < 0) {
                    this.srcSize = 0L;
                    if (this.frameFinished) {
                        return -1;
                    }
                    if (!this.isContinuous) {
                        throw new ZstdIOException(Zstd.errCorruptionDetected(), "Truncated source");
                    }
                    long j15 = (int) (this.dstPos - j10);
                    this.srcSize = j15;
                    if (j15 > 0) {
                        return (int) j15;
                    }
                    return -1;
                }
                this.frameFinished = false;
            }
            long j16 = this.dstPos;
            int iDecompressStream = decompressStream(this.stream, bArr, i12, this.src, (int) this.srcSize);
            long j17 = iDecompressStream;
            if (Zstd.isError(j17)) {
                throw new ZstdIOException(j17);
            }
            if (iDecompressStream == 0) {
                this.frameFinished = true;
                this.needRead = this.srcPos == this.srcSize;
                return (int) (this.dstPos - j10);
            }
            if (this.dstPos < j13) {
                z10 = true;
            }
            this.needRead = z10;
            j11 = j16;
        }
    }

    public synchronized ZstdInputStreamNoFinalizer setContinuous(boolean z10) {
        this.isContinuous = z10;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public synchronized ZstdInputStreamNoFinalizer setDict(byte[] bArr) {
        long jLoadDictDecompress = Zstd.loadDictDecompress(this.stream, bArr, bArr.length);
        if (Zstd.isError(jLoadDictDecompress)) {
            throw new ZstdIOException(jLoadDictDecompress);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setLongMax(int i10) {
        long decompressionLongMax = Zstd.setDecompressionLongMax(this.stream, i10);
        if (Zstd.isError(decompressionLongMax)) {
            throw new ZstdIOException(decompressionLongMax);
        }
        return this;
    }

    public synchronized ZstdInputStreamNoFinalizer setRefMultipleDDicts(boolean z10) {
        long refMultipleDDicts = Zstd.setRefMultipleDDicts(this.stream, z10);
        if (Zstd.isError(refMultipleDDicts)) {
            throw new ZstdIOException(refMultipleDDicts);
        }
        return this;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j10) {
        int i10;
        if (this.isClosed) {
            throw new IOException("Stream closed");
        }
        if (j10 <= 0) {
            return 0L;
        }
        int iRecommendedDOutSize = (int) recommendedDOutSize();
        if (iRecommendedDOutSize > j10) {
            iRecommendedDOutSize = (int) j10;
        }
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(this.bufferPool, iRecommendedDOutSize);
        try {
            byte[] bArrArray = arrayBackedBuffer.array();
            long j11 = j10;
            while (j11 > 0 && (i10 = read(bArrArray, 0, (int) Math.min(iRecommendedDOutSize, j11))) >= 0) {
                j11 -= (long) i10;
            }
            this.bufferPool.release(arrayBackedBuffer);
            return j10 - j11;
        } catch (Throwable th2) {
            this.bufferPool.release(arrayBackedBuffer);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ZstdInputStreamNoFinalizer(InputStream inputStream, BufferPool bufferPool) throws ZstdIOException {
        super(inputStream);
        this.dstPos = 0L;
        this.srcPos = 0L;
        this.srcSize = 0L;
        this.needRead = true;
        this.isContinuous = false;
        this.frameFinished = true;
        this.isClosed = false;
        this.bufferPool = bufferPool;
        ByteBuffer arrayBackedBuffer = Zstd.getArrayBackedBuffer(bufferPool, srcBuffSize);
        this.srcByteBuffer = arrayBackedBuffer;
        this.src = arrayBackedBuffer.array();
        synchronized (this) {
            long jCreateDStream = createDStream();
            this.stream = jCreateDStream;
            initDStream(jCreateDStream);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        try {
            byte[] bArr = new byte[1];
            int internal = 0;
            while (internal == 0) {
                internal = readInternal(bArr, 0, 1);
            }
            if (internal != 1) {
                return -1;
            }
            return bArr[0] & 255;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized ZstdInputStreamNoFinalizer setDict(ZstdDictDecompress zstdDictDecompress) {
        zstdDictDecompress.acquireSharedLock();
        try {
            long jLoadFastDictDecompress = Zstd.loadFastDictDecompress(this.stream, zstdDictDecompress);
            if (!Zstd.isError(jLoadFastDictDecompress)) {
                zstdDictDecompress.releaseSharedLock();
            } else {
                throw new ZstdIOException(jLoadFastDictDecompress);
            }
        } catch (Throwable th2) {
            zstdDictDecompress.releaseSharedLock();
            throw th2;
        }
        return this;
    }
}
