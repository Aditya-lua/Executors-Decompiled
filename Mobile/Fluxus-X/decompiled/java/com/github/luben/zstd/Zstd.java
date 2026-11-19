package com.github.luben.zstd;

import com.github.luben.zstd.util.Native;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class Zstd {

    public static class FrameData {
        final long compressedSize;
        final long contentSize;

        public FrameData(byte[] bArr, int i10) {
            long jFindFrameCompressedSize = Zstd.findFrameCompressedSize(bArr, i10);
            this.compressedSize = jFindFrameCompressedSize;
            long frameContentSize = Zstd.getFrameContentSize(bArr, i10, (int) jFindFrameCompressedSize);
            this.contentSize = frameContentSize;
            if (Zstd.isError(frameContentSize)) {
                if (frameContentSize != -1) {
                    throw new ZstdException(frameContentSize);
                }
                throw new ZstdException(frameContentSize, "Content size is unknown");
            }
        }
    }

    public enum ParamSwitch {
        AUTO(0),
        ENABLE(1),
        DISABLE(2);

        private int val;

        ParamSwitch(int i10) {
            this.val = i10;
        }

        public int getValue() {
            return this.val;
        }
    }

    static {
        Native.load();
    }

    public static native int blockSizeMax();

    private static int calculateContentSizeAndFrames(byte[] bArr, List<FrameData> list) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            FrameData frameData = new FrameData(bArr, i10);
            list.add(frameData);
            i10 += (int) frameData.compressedSize;
            i11 += (int) frameData.contentSize;
        }
        return i11;
    }

    public static native int chainLogMax();

    public static native int chainLogMin();

    public static long compress(byte[] bArr, byte[] bArr2, int i10, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i10);
            zstdCompressCtx.setChecksum(z10);
            return zstdCompressCtx.compress(bArr, bArr2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static native long compressBound(long j10);

    public static long compressByteArray(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13, int i14, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i14);
            zstdCompressCtx.setChecksum(z10);
            return zstdCompressCtx.compressByteArray(bArr, i10, i11, bArr2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i14);
            zstdCompressCtx.setChecksum(z10);
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, byte[] bArr, int i14) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i14);
            zstdCompressCtx.loadDict(bArr);
            return zstdCompressCtx.compressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressFastDict(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressByteArray(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressUnsafe(long j10, long j11, long j12, long j13, int i10) {
        return compressUnsafe(j10, j11, j12, j13, i10, false);
    }

    public static native long compressUnsafe(long j10, long j11, long j12, long j13, int i10, boolean z10);

    public static long compressUsingDict(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3, int i13) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i13);
            zstdCompressCtx.loadDict(bArr3);
            return zstdCompressCtx.compressByteArray(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long decompress(byte[] bArr, byte[] bArr2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, bArr2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressByteArray(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompressByteArray(bArr, i10, i11, bArr2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBufferFastDict(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressDirectByteBufferUsingDict(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long decompressFastDict(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompressByteArray(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] decompressFrame(byte[] bArr, int i10, int i11, int i12) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, i10, i11, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static native long decompressUnsafe(long j10, long j11, long j12, long j13);

    public static long decompressUsingDict(byte[] bArr, int i10, byte[] bArr2, int i11, int i12, byte[] bArr3) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr3);
            return zstdDecompressCtx.decompressByteArray(bArr, i10, bArr.length - i10, bArr2, i11, i12);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i10, int i11) {
        return decompressedDirectByteBufferSize(byteBuffer, i10, i11, false);
    }

    @Deprecated
    public static native long decompressedDirectByteBufferSize(ByteBuffer byteBuffer, int i10, int i11, boolean z10);

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i10, int i11, boolean z10) {
        if (i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i12 = i10 + i11;
        if (i12 <= bArr.length) {
            return decompressedSize0(bArr, i10, i11, z10);
        }
        throw new ArrayIndexOutOfBoundsException(i12);
    }

    private static native long decompressedSize0(byte[] bArr, int i10, int i11, boolean z10);

    public static native int defaultCompressionLevel();

    public static native long errChecksumWrong();

    public static native long errCorruptionDetected();

    public static native long errDictionaryCorrupted();

    public static native long errDictionaryCreationFailed();

    public static native long errDictionaryWrong();

    public static native long errDstBufferNull();

    public static native long errDstSizeTooSmall();

    public static native long errFrameParameterUnsupported();

    public static native long errFrameParameterWindowTooLarge();

    public static native long errGeneric();

    public static native long errInitMissing();

    public static native long errMaxSymbolValueTooLarge();

    public static native long errMaxSymbolValueTooSmall();

    public static native long errMemoryAllocation();

    public static native long errNoError();

    public static native long errParameterOutOfBound();

    public static native long errParameterUnsupported();

    public static native long errPrefixUnknown();

    public static native long errSrcSizeWrong();

    public static native long errStageWrong();

    public static native long errTableLogTooLarge();

    public static native long errVersionUnsupported();

    public static native long errWorkSpaceTooSmall();

    public static native long findDirectByteBufferFrameCompressedSize(ByteBuffer byteBuffer, int i10, int i11);

    public static long findFrameCompressedSize(byte[] bArr, int i10, int i11) {
        if (i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i12 = i10 + i11;
        if (i12 > bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i12);
        }
        long jFindFrameCompressedSize0 = findFrameCompressedSize0(bArr, i10, i11);
        if (isError(jFindFrameCompressedSize0)) {
            throw new ZstdException(jFindFrameCompressedSize0);
        }
        return jFindFrameCompressedSize0;
    }

    private static native long findFrameCompressedSize0(byte[] bArr, int i10, int i11);

    public static native void generateSequences(long j10, long j11, long j12, long j13, long j14);

    public static ByteBuffer getArrayBackedBuffer(BufferPool bufferPool, int i10) throws ZstdIOException {
        ByteBuffer byteBuffer = bufferPool.get(i10);
        if (byteBuffer != null) {
            if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                return byteBuffer;
            }
            bufferPool.release(byteBuffer);
            throw new IllegalArgumentException("provided ByteBuffer lacks array or has non-zero arrayOffset");
        }
        throw new ZstdIOException(errMemoryAllocation(), "Cannot get ByteBuffer of size " + i10 + " from the BufferPool");
    }

    public static native long getBuiltinSequenceProducer();

    public static native long getDictIdFromDict(byte[] bArr);

    public static long getDictIdFromDictDirect(ByteBuffer byteBuffer) {
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (!byteBuffer.isDirect()) {
            throw new IllegalArgumentException("dict must be a direct buffer");
        }
        if (iLimit >= 0) {
            return getDictIdFromDictDirect(byteBuffer, byteBuffer.position(), iLimit);
        }
        throw new IllegalArgumentException("dict cannot be empty.");
    }

    private static native long getDictIdFromDictDirect(ByteBuffer byteBuffer, int i10, int i11);

    public static native long getDictIdFromFrame(byte[] bArr);

    public static native long getDictIdFromFrameBuffer(ByteBuffer byteBuffer);

    public static long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i10, int i11) {
        return getDirectByteBufferFrameContentSize(byteBuffer, i10, i11, false);
    }

    public static native long getDirectByteBufferFrameContentSize(ByteBuffer byteBuffer, int i10, int i11, boolean z10);

    public static native long getErrorCode(long j10);

    public static native String getErrorName(long j10);

    public static long getFrameContentSize(byte[] bArr, int i10, int i11, boolean z10) {
        if (i10 >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i10);
        }
        int i12 = i10 + i11;
        if (i12 <= bArr.length) {
            return getFrameContentSize0(bArr, i10, i11, z10);
        }
        throw new ArrayIndexOutOfBoundsException(i12);
    }

    private static native long getFrameContentSize0(byte[] bArr, int i10, int i11, boolean z10);

    public static native long getStubSequenceProducer();

    public static native int hashLogMax();

    public static native int hashLogMin();

    public static native boolean isError(long j10);

    public static native int loadDictCompress(long j10, byte[] bArr, int i10);

    public static native int loadDictDecompress(long j10, byte[] bArr, int i10);

    public static native int loadFastDictCompress(long j10, ZstdDictCompress zstdDictCompress);

    public static native int loadFastDictDecompress(long j10, ZstdDictDecompress zstdDictDecompress);

    public static native int magicNumber();

    public static native int maxCompressionLevel();

    public static native int minCompressionLevel();

    public static native void registerSequenceProducer(long j10, long j11, long j12);

    public static native int searchLengthMax();

    public static native int searchLengthMin();

    public static native int searchLogMax();

    public static native int searchLogMin();

    public static native int setCompressionChainLog(long j10, int i10);

    public static native int setCompressionChecksums(long j10, boolean z10);

    public static native int setCompressionHashLog(long j10, int i10);

    public static native int setCompressionJobSize(long j10, int i10);

    public static native int setCompressionLevel(long j10, int i10);

    public static native int setCompressionLong(long j10, int i10);

    public static native int setCompressionMagicless(long j10, boolean z10);

    public static native int setCompressionMinMatch(long j10, int i10);

    public static native int setCompressionOverlapLog(long j10, int i10);

    public static native int setCompressionSearchLog(long j10, int i10);

    public static native int setCompressionStrategy(long j10, int i10);

    public static native int setCompressionTargetLength(long j10, int i10);

    public static native int setCompressionWindowLog(long j10, int i10);

    public static native int setCompressionWorkers(long j10, int i10);

    public static native int setDecompressionLongMax(long j10, int i10);

    public static native int setDecompressionMagicless(long j10, boolean z10);

    public static native int setEnableLongDistanceMatching(long j10, int i10);

    public static native int setRefMultipleDDicts(long j10, boolean z10);

    public static native int setSearchForExternalRepcodes(long j10, int i10);

    public static native int setSequenceProducerFallback(long j10, boolean z10);

    public static native int setValidateSequences(long j10, int i10);

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z10) {
        return trainFromBuffer(bArr, bArr2, z10, defaultCompressionLevel());
    }

    private static native long trainFromBuffer0(byte[][] bArr, byte[] bArr2, boolean z10, int i10);

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z10) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, z10, defaultCompressionLevel());
    }

    private static native long trainFromBufferDirect0(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z10, int i10);

    public static native int windowLogMax();

    public static native int windowLogMin();

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2, boolean z10, int i10) {
        if (bArr.length > 10) {
            return trainFromBuffer0(bArr, bArr2, z10, i10);
        }
        throw new ZstdException(errGeneric(), "nb of samples too low");
    }

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2, boolean z10, int i10) {
        if (iArr.length > 10) {
            return trainFromBufferDirect0(byteBuffer, iArr, byteBuffer2, z10, i10);
        }
        throw new ZstdException(errGeneric(), "nb of samples too low");
    }

    public static int decompress(byte[] bArr, ByteBuffer byteBuffer) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, byteBuffer);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] decompressFrame(byte[] bArr, int i10) {
        int iFindFrameCompressedSize = (int) findFrameCompressedSize(bArr, i10);
        long frameContentSize = getFrameContentSize(bArr, i10, iFindFrameCompressedSize);
        if (!isError(frameContentSize)) {
            return decompressFrame(bArr, i10, iFindFrameCompressedSize, (int) frameContentSize);
        }
        if (frameContentSize == -1) {
            throw new ZstdException(frameContentSize, "Content size is unknown");
        }
        throw new ZstdException(frameContentSize);
    }

    public static long trainFromBuffer(byte[][] bArr, byte[] bArr2) {
        return trainFromBuffer(bArr, bArr2, false);
    }

    public static long trainFromBufferDirect(ByteBuffer byteBuffer, int[] iArr, ByteBuffer byteBuffer2) {
        return trainFromBufferDirect(byteBuffer, iArr, byteBuffer2, false);
    }

    @Deprecated
    public static long decompressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i10, int i11) {
        return decompressedSize(bArr, i10, i11, false);
    }

    public static long getFrameContentSize(byte[] bArr, int i10, int i11) {
        return getFrameContentSize(bArr, i10, i11, false);
    }

    public static long compress(byte[] bArr, byte[] bArr2, int i10) {
        return compress(bArr, bArr2, i10, false);
    }

    public static long compressByteArray(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, int i13, int i14) {
        return compressByteArray(bArr, i10, i11, bArr2, i12, i13, i14, false);
    }

    public static long compressDirectByteBuffer(ByteBuffer byteBuffer, int i10, int i11, ByteBuffer byteBuffer2, int i12, int i13, int i14) {
        return compressDirectByteBuffer(byteBuffer, i10, i11, byteBuffer2, i12, i13, i14, false);
    }

    public static long compressFastDict(byte[] bArr, int i10, byte[] bArr2, int i11, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compressByteArray(bArr, i10, bArr.length - i10, bArr2, i11, bArr2.length - i11);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long compressUsingDict(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i12);
            zstdCompressCtx.loadDict(bArr3);
            return zstdCompressCtx.compressByteArray(bArr, i10, bArr.length - i10, bArr2, i11, bArr2.length - i11);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr, int i10) {
        return decompressedSize(bArr, i10, bArr.length - i10);
    }

    public static long getFrameContentSize(byte[] bArr, int i10) {
        return getFrameContentSize(bArr, i10, bArr.length - i10);
    }

    public static long compress(byte[] bArr, byte[] bArr2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(bArr, bArr2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(byte[] bArr) {
        return decompressedSize(bArr, 0);
    }

    public static long findFrameCompressedSize(byte[] bArr, int i10) {
        return findFrameCompressedSize(bArr, i10, bArr.length - i10);
    }

    public static long getFrameContentSize(byte[] bArr) {
        return getFrameContentSize(bArr, 0);
    }

    public static byte[] decompress(byte[] bArr, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(bArr, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    @Deprecated
    public static long decompressedSize(ByteBuffer byteBuffer) {
        return decompressedDirectByteBufferSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static long findFrameCompressedSize(byte[] bArr) {
        return findFrameCompressedSize(bArr, 0);
    }

    public static long getFrameContentSize(ByteBuffer byteBuffer) {
        return getDirectByteBufferFrameContentSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static long findFrameCompressedSize(ByteBuffer byteBuffer) {
        return findDirectByteBufferFrameCompressedSize(byteBuffer, byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
    }

    public static byte[] decompressFrame(byte[] bArr) {
        return decompressFrame(bArr, 0);
    }

    @Deprecated
    public static long compressUsingDict(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i10);
    }

    public static byte[] decompress(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        byte[] bArr2 = new byte[calculateContentSizeAndFrames(bArr, arrayList)];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < arrayList.size()) {
            FrameData frameData = (FrameData) arrayList.get(i10);
            byte[] bArr3 = bArr;
            long jDecompressByteArray = decompressByteArray(bArr2, i11, (int) frameData.contentSize, bArr3, i12, (int) frameData.compressedSize);
            if (!isError(jDecompressByteArray)) {
                long j10 = frameData.contentSize;
                if (jDecompressByteArray == j10) {
                    i12 += (int) frameData.compressedSize;
                    i11 += (int) j10;
                    i10++;
                    bArr = bArr3;
                } else {
                    throw new IllegalStateException("decompressed size mismatch");
                }
            } else {
                throw new ZstdException(jDecompressByteArray, String.format("error %s while decompressing %d frame", getErrorName(jDecompressByteArray), Integer.valueOf(i10)));
            }
        }
        return bArr2;
    }

    public static byte[] compress(byte[] bArr) {
        return compress(bArr, defaultCompressionLevel());
    }

    public static byte[] compressUsingDict(byte[] bArr, byte[] bArr2, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr2);
            zstdCompressCtx.setLevel(i10);
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i10);
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return compress(byteBuffer, byteBuffer2, defaultCompressionLevel());
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, boolean z10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i10);
            zstdCompressCtx.setChecksum(z10);
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10) {
        return compress(byteBuffer, byteBuffer2, i10, false);
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.setLevel(i10);
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, bArr);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            return zstdDecompressCtx.decompress(byteBuffer, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static byte[] compress(byte[] bArr, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(bArr);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static byte[] decompress(byte[] bArr, ZstdDictDecompress zstdDictDecompress, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(bArr, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static long compress(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        return compressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3, i10);
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr);
            zstdCompressCtx.setLevel(i10);
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static long decompress(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return decompressUsingDict(bArr, 0, bArr2, 0, bArr2.length, bArr3);
    }

    public static byte[] decompress(byte[] bArr, byte[] bArr2, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr2);
            return zstdDecompressCtx.decompress(bArr, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(bArr);
            zstdCompressCtx.setLevel(i10);
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, byte[] bArr) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(byteBuffer, byteBuffer2);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(bArr);
            return zstdDecompressCtx.decompress(byteBuffer, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static int decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ZstdDictDecompress zstdDictDecompress) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(byteBuffer, byteBuffer2);
        } finally {
            zstdDecompressCtx.close();
        }
    }

    public static ByteBuffer compress(ByteBuffer byteBuffer, ZstdDictCompress zstdDictCompress) {
        ZstdCompressCtx zstdCompressCtx = new ZstdCompressCtx();
        try {
            zstdCompressCtx.loadDict(zstdDictCompress);
            zstdCompressCtx.setLevel(zstdDictCompress.level());
            return zstdCompressCtx.compress(byteBuffer);
        } finally {
            zstdCompressCtx.close();
        }
    }

    public static ByteBuffer decompress(ByteBuffer byteBuffer, ZstdDictDecompress zstdDictDecompress, int i10) {
        ZstdDecompressCtx zstdDecompressCtx = new ZstdDecompressCtx();
        try {
            zstdDecompressCtx.loadDict(zstdDictDecompress);
            return zstdDecompressCtx.decompress(byteBuffer, i10);
        } finally {
            zstdDecompressCtx.close();
        }
    }
}
