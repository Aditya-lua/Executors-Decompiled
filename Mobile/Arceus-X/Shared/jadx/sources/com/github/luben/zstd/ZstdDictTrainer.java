package com.github.luben.zstd;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ZstdDictTrainer {
    private final int allocatedSize;
    private final int dictSize;
    private long filledSize;
    private int level;
    private final List<Integer> sampleSizes;
    private final ByteBuffer trainingSamples;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ZstdDictTrainer(int i10, int i11) {
        this(i10, i11, Zstd.defaultCompressionLevel());
    }

    private int[] copyToIntArray(List<Integer> list) {
        int[] iArr = new int[list.size()];
        Iterator<Integer> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public synchronized boolean addSample(byte[] bArr) {
        if (this.filledSize + ((long) bArr.length) > this.allocatedSize) {
            return false;
        }
        this.trainingSamples.put(bArr);
        this.sampleSizes.add(Integer.valueOf(bArr.length));
        this.filledSize += (long) bArr.length;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public byte[] trainSamples() {
        return trainSamples(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ByteBuffer trainSamplesDirect() {
        return trainSamplesDirect(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public ZstdDictTrainer(int i10, int i11, int i12) {
        this.trainingSamples = ByteBuffer.allocateDirect(i10);
        this.sampleSizes = new ArrayList();
        this.allocatedSize = i10;
        this.dictSize = i11;
        this.level = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public byte[] trainSamples(boolean z10) {
        ByteBuffer byteBufferTrainSamplesDirect = trainSamplesDirect(z10);
        byte[] bArr = new byte[byteBufferTrainSamplesDirect.remaining()];
        byteBufferTrainSamplesDirect.get(bArr);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public synchronized ByteBuffer trainSamplesDirect(boolean z10) {
        ByteBuffer byteBufferAllocateDirect;
        byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.dictSize);
        long jTrainFromBufferDirect = Zstd.trainFromBufferDirect(this.trainingSamples, copyToIntArray(this.sampleSizes), byteBufferAllocateDirect, z10, this.level);
        if (Zstd.isError(jTrainFromBufferDirect)) {
            byteBufferAllocateDirect.limit(0);
            throw new ZstdException(jTrainFromBufferDirect);
        }
        byteBufferAllocateDirect.limit(Long.valueOf(jTrainFromBufferDirect).intValue());
        return byteBufferAllocateDirect;
    }
}
