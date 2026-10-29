package u4;

import androidx.annotation.NonNull;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileLock;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static int a(int i10) {
        return ((i10 + 7) & (-8)) / 8;
    }

    public static byte[] b(@NonNull byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (Throwable th2) {
                try {
                    deflaterOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            deflater.end();
            throw th4;
        }
    }

    @NonNull
    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    public static byte[] d(@NonNull InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw c("Not enough bytes to read: " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    @NonNull
    public static byte[] e(@NonNull InputStream inputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[Barcode.FORMAT_PDF417];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = inputStream.read(bArr2);
                if (i13 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw c(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    @NonNull
    public static String f(InputStream inputStream, int i10) {
        return new String(d(inputStream, i10), StandardCharsets.UTF_8);
    }

    public static long g(@NonNull InputStream inputStream, int i10) throws IOException {
        byte[] bArrD = d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrD[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    public static int h(@NonNull InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    public static long i(@NonNull InputStream inputStream) {
        return g(inputStream, 4);
    }

    public static int j(@NonNull InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    public static int k(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[Barcode.FORMAT_UPC_A];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static void m(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    public static void n(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(@NonNull OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(@NonNull OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 2);
    }

    public static void q(@NonNull OutputStream outputStream, long j10) throws IOException {
        o(outputStream, j10, 4);
    }

    public static void r(@NonNull OutputStream outputStream, int i10) throws IOException {
        o(outputStream, i10, 1);
    }
}
