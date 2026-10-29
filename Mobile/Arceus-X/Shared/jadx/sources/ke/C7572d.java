package ke;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import p169he.C6384n;
import p270le.C8127a;

/* JADX INFO: renamed from: ke.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C7572d {

    /* JADX INFO: renamed from: a */
    public static final OutputStream f29025a = new a();

    /* JADX INFO: renamed from: ke.d$a */
    public class a extends OutputStream {
        public String toString() {
            return "ByteStreams.nullOutputStream()";
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.io.OutputStream
        public void write(int i10) {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.io.OutputStream
        public void write(byte[] bArr) {
            C6384n.m27928l(bArr);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) {
            C6384n.m27928l(bArr);
            C6384n.m27933q(i10, i11 + i10, bArr.length);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m31368a(Queue<byte[]> queue, int i10) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] bArrRemove = queue.remove();
        if (bArrRemove.length == i10) {
            return bArrRemove;
        }
        int length = i10 - bArrRemove.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArrRemove, i10);
        while (length > 0) {
            byte[] bArrRemove2 = queue.remove();
            int iMin = Math.min(length, bArrRemove2.length);
            System.arraycopy(bArrRemove2, 0, bArrCopyOf, i10 - length, iMin);
            length -= iMin;
        }
        return bArrCopyOf;
    }

    /* JADX INFO: renamed from: b */
    public static long m31369b(InputStream inputStream, OutputStream outputStream) throws IOException {
        C6384n.m27928l(inputStream);
        C6384n.m27928l(outputStream);
        byte[] bArrM31370c = m31370c();
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArrM31370c);
            if (i10 == -1) {
                return j10;
            }
            outputStream.write(bArrM31370c, 0, i10);
            j10 += (long) i10;
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m31370c() {
        return new byte[8192];
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m31371d(InputStream inputStream) {
        C6384n.m27928l(inputStream);
        return m31372e(inputStream, new ArrayDeque(20), 0);
    }

    /* JADX INFO: renamed from: e */
    public static byte[] m31372e(InputStream inputStream, Queue<byte[]> queue, int i10) throws IOException {
        int iMin = Math.min(8192, Math.max(128, Integer.highestOneBit(i10) * 2));
        while (i10 < 2147483639) {
            int iMin2 = Math.min(iMin, 2147483639 - i10);
            byte[] bArr = new byte[iMin2];
            queue.add(bArr);
            int i11 = 0;
            while (i11 < iMin2) {
                int i12 = inputStream.read(bArr, i11, iMin2 - i11);
                if (i12 == -1) {
                    return m31368a(queue, i10);
                }
                i11 += i12;
                i10 += i12;
            }
            iMin = C8127a.m33348e(iMin, iMin < 4096 ? 4 : 2);
        }
        if (inputStream.read() == -1) {
            return m31368a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
