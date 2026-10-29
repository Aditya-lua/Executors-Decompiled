package p458u4;

import androidx.annotation.NonNull;
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

/* JADX INFO: renamed from: u4.c */
/* JADX INFO: loaded from: classes.dex */
public class C11792c {
    /* JADX INFO: renamed from: a */
    public static int m44087a(int i10) {
        return ((i10 + 7) & (-8)) / 8;
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m44088b(@NonNull byte[] bArr) {
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
    /* JADX INFO: renamed from: c */
    public static RuntimeException m44089c(String str) {
        return new IllegalStateException(str);
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static byte[] m44090d(@NonNull InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw m44089c("Not enough bytes to read: " + i10);
            }
            i11 += i12;
        }
        return bArr;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public static byte[] m44091e(@NonNull InputStream inputStream, int i10, int i11) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i11];
            byte[] bArr2 = new byte[2048];
            int i12 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i12 < i10) {
                int i13 = inputStream.read(bArr2);
                if (i13 < 0) {
                    throw m44089c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i10 + " bytes");
                }
                inflater.setInput(bArr2, 0, i13);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i11 - iInflate);
                    i12 += i13;
                } catch (DataFormatException e10) {
                    throw m44089c(e10.getMessage());
                }
            }
            if (i12 == i10) {
                if (!inflater.finished()) {
                    throw m44089c("Inflater did not finish");
                }
                inflater.end();
                return bArr;
            }
            throw m44089c("Didn't read enough bytes during decompression. expected=" + i10 + " actual=" + i12);
        } catch (Throwable th2) {
            inflater.end();
            throw th2;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static String m44092f(InputStream inputStream, int i10) {
        return new String(m44090d(inputStream, i10), StandardCharsets.UTF_8);
    }

    /* JADX INFO: renamed from: g */
    public static long m44093g(@NonNull InputStream inputStream, int i10) throws IOException {
        byte[] bArrM44090d = m44090d(inputStream, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 += ((long) (bArrM44090d[i11] & 255)) << (i11 * 8);
        }
        return j10;
    }

    /* JADX INFO: renamed from: h */
    public static int m44094h(@NonNull InputStream inputStream) {
        return (int) m44093g(inputStream, 2);
    }

    /* JADX INFO: renamed from: i */
    public static long m44095i(@NonNull InputStream inputStream) {
        return m44093g(inputStream, 4);
    }

    /* JADX INFO: renamed from: j */
    public static int m44096j(@NonNull InputStream inputStream) {
        return (int) m44093g(inputStream, 1);
    }

    /* JADX INFO: renamed from: k */
    public static int m44097k(@NonNull String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    /* JADX INFO: renamed from: l */
    public static void m44098l(@NonNull InputStream inputStream, @NonNull OutputStream outputStream, FileLock fileLock) throws IOException {
        if (fileLock == null || !fileLock.isValid()) {
            throw new IOException("Unable to acquire a lock on the underlying file channel.");
        }
        byte[] bArr = new byte[512];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m44099m(@NonNull OutputStream outputStream, byte[] bArr) throws IOException {
        m44103q(outputStream, bArr.length);
        byte[] bArrM44088b = m44088b(bArr);
        m44103q(outputStream, bArrM44088b.length);
        outputStream.write(bArrM44088b);
    }

    /* JADX INFO: renamed from: n */
    public static void m44100n(@NonNull OutputStream outputStream, @NonNull String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    /* JADX INFO: renamed from: o */
    public static void m44101o(@NonNull OutputStream outputStream, long j10, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) ((j10 >> (i11 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    /* JADX INFO: renamed from: p */
    public static void m44102p(@NonNull OutputStream outputStream, int i10) throws IOException {
        m44101o(outputStream, i10, 2);
    }

    /* JADX INFO: renamed from: q */
    public static void m44103q(@NonNull OutputStream outputStream, long j10) throws IOException {
        m44101o(outputStream, j10, 4);
    }

    /* JADX INFO: renamed from: r */
    public static void m44104r(@NonNull OutputStream outputStream, int i10) throws IOException {
        m44101o(outputStream, i10, 1);
    }
}
