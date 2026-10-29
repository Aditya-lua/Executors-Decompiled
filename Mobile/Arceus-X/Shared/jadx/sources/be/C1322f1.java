package be;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: be.f1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1322f1 {
    /* JADX INFO: renamed from: a */
    public static long m7127a(ByteBuffer byteBuffer) {
        m7133g(byteBuffer);
        return m7131e(byteBuffer, byteBuffer.position() + 16);
    }

    /* JADX INFO: renamed from: b */
    public static long m7128b(ByteBuffer byteBuffer) {
        m7133g(byteBuffer);
        return m7131e(byteBuffer, byteBuffer.position() + 12);
    }

    /* JADX INFO: renamed from: c */
    public static Pair m7129c(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairM7132f = m7132f(randomAccessFile, 0);
        return pairM7132f != null ? pairM7132f : m7132f(randomAccessFile, 65535);
    }

    /* JADX INFO: renamed from: d */
    public static void m7130d(ByteBuffer byteBuffer, long j10) {
        m7133g(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j10 >= 0 && j10 <= 4294967295L) {
            byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j10);
            return;
        }
        throw new IllegalArgumentException("uint32 value of out range: " + j10);
    }

    /* JADX INFO: renamed from: e */
    public static long m7131e(ByteBuffer byteBuffer, int i10) {
        return ((long) byteBuffer.getInt(i10)) & 4294967295L;
    }

    /* JADX INFO: renamed from: f */
    public static Pair m7132f(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        m7133g(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, 65535);
            int i13 = 0;
            while (true) {
                if (i13 >= iMin) {
                    i11 = -1;
                    break;
                }
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
                i13++;
            }
        } else {
            i11 = -1;
            break;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i11)));
    }

    /* JADX INFO: renamed from: g */
    public static void m7133g(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
