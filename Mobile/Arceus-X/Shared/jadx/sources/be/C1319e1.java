package be;

import android.util.Pair;
import androidx.core.view.InputDeviceCompat;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: be.e1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1319e1 {
    /* JADX INFO: renamed from: a */
    public static X509Certificate[][] m7112a(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            Pair pairM7129c = C1322f1.m7129c(randomAccessFile);
            if (pairM7129c == null) {
                throw new C1310b1("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
            }
            ByteBuffer byteBuffer = (ByteBuffer) pairM7129c.first;
            long jLongValue = ((Long) pairM7129c.second).longValue();
            long j10 = (-20) + jLongValue;
            if (j10 >= 0) {
                randomAccessFile.seek(j10);
                if (randomAccessFile.readInt() == 1347094023) {
                    throw new C1310b1("ZIP64 APK not supported");
                }
            }
            long jM7127a = C1322f1.m7127a(byteBuffer);
            if (jM7127a >= jLongValue) {
                throw new C1310b1("ZIP Central Directory offset out of range: " + jM7127a + ". ZIP End of Central Directory offset: " + jLongValue);
            }
            if (C1322f1.m7128b(byteBuffer) + jM7127a != jLongValue) {
                throw new C1310b1("ZIP Central Directory is not immediately followed by End of Central Directory");
            }
            if (jM7127a < 32) {
                throw new C1310b1("APK too small for APK Signing Block. ZIP Central Directory offset: " + jM7127a);
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
            ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
            byteBufferAllocate.order(byteOrder);
            randomAccessFile.seek(jM7127a - ((long) byteBufferAllocate.capacity()));
            randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
            if (byteBufferAllocate.getLong(8) != 2334950737559900225L || byteBufferAllocate.getLong(16) != 3617552046287187010L) {
                throw new C1310b1("No APK Signing Block before ZIP Central Directory");
            }
            int i10 = 0;
            long j11 = byteBufferAllocate.getLong(0);
            if (j11 < byteBufferAllocate.capacity() || j11 > 2147483639) {
                throw new C1310b1("APK Signing Block size out of range: " + j11);
            }
            int i11 = (int) (8 + j11);
            long j12 = jM7127a - ((long) i11);
            if (j12 < 0) {
                throw new C1310b1("APK Signing Block offset out of range: " + j12);
            }
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i11);
            byteBufferAllocate2.order(byteOrder);
            randomAccessFile.seek(j12);
            randomAccessFile.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
            long j13 = byteBufferAllocate2.getLong(0);
            if (j13 != j11) {
                throw new C1310b1("APK Signing Block sizes in header and footer do not match: " + j13 + " vs " + j11);
            }
            Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j12));
            ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
            long jLongValue2 = ((Long) pairCreate.second).longValue();
            if (byteBuffer2.order() != byteOrder) {
                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
            }
            int iCapacity = byteBuffer2.capacity() - 24;
            if (iCapacity < 8) {
                throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
            }
            int iCapacity2 = byteBuffer2.capacity();
            if (iCapacity > byteBuffer2.capacity()) {
                throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
            }
            int iLimit = byteBuffer2.limit();
            int iPosition = byteBuffer2.position();
            try {
                byteBuffer2.position(0);
                byteBuffer2.limit(iCapacity);
                byteBuffer2.position(8);
                ByteBuffer byteBufferSlice = byteBuffer2.slice();
                byteBufferSlice.order(byteBuffer2.order());
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                while (byteBufferSlice.hasRemaining()) {
                    i10++;
                    if (byteBufferSlice.remaining() < 8) {
                        throw new C1310b1("Insufficient data to read size of APK Signing Block entry #" + i10);
                    }
                    long j14 = byteBufferSlice.getLong();
                    if (j14 < 4 || j14 > 2147483647L) {
                        throw new C1310b1("APK Signing Block entry #" + i10 + " size out of range: " + j14);
                    }
                    int i12 = (int) j14;
                    int iPosition2 = byteBufferSlice.position() + i12;
                    if (i12 > byteBufferSlice.remaining()) {
                        throw new C1310b1("APK Signing Block entry #" + i10 + " size out of range: " + i12 + ", available: " + byteBufferSlice.remaining());
                    }
                    if (byteBufferSlice.getInt() == 1896449818) {
                        X509Certificate[][] x509CertificateArrM7123l = m7123l(randomAccessFile.getChannel(), new C1307a1(m7116e(byteBufferSlice, i12 - 4), jLongValue2, jM7127a, jLongValue, byteBuffer, null));
                        randomAccessFile.close();
                        try {
                            randomAccessFile.close();
                        } catch (IOException unused) {
                        }
                        return x509CertificateArrM7123l;
                    }
                    long j15 = jLongValue2;
                    byteBufferSlice.position(iPosition2);
                    jLongValue2 = j15;
                }
                throw new C1310b1("No APK Signature Scheme v2 block in APK Signing Block");
            } catch (Throwable th2) {
                byteBuffer2.position(0);
                byteBuffer2.limit(iLimit);
                byteBuffer2.position(iPosition);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                randomAccessFile.close();
            } catch (IOException unused2) {
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m7113b(int i10) {
        if (i10 == 1) {
            return 32;
        }
        if (i10 == 2) {
            return 64;
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    /* JADX INFO: renamed from: c */
    public static int m7114c(int i10) {
        if (i10 == 513) {
            return 1;
        }
        if (i10 == 514) {
            return 2;
        }
        if (i10 == 769) {
            return 1;
        }
        switch (i10) {
            case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m7115d(int i10) {
        if (i10 == 1) {
            return "SHA-256";
        }
        if (i10 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException("Unknown content digest algorthm: " + i10);
    }

    /* JADX INFO: renamed from: e */
    public static ByteBuffer m7116e(ByteBuffer byteBuffer, int i10) {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i11 = i10 + iPosition;
        if (i11 < iPosition || i11 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i11);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i11);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: f */
    public static ByteBuffer m7117f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            return m7116e(byteBuffer, i10);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i10 + ", remaining: " + byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: g */
    public static void m7118g(int i10, byte[] bArr, int i11) {
        bArr[1] = (byte) (i10 & 255);
        bArr[2] = (byte) ((i10 >>> 8) & 255);
        bArr[3] = (byte) ((i10 >>> 16) & 255);
        bArr[4] = (byte) (i10 >> 24);
    }

    /* JADX INFO: renamed from: h */
    public static void m7119h(Map map, FileChannel fileChannel, long j10, long j11, long j12, ByteBuffer byteBuffer) {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        C1372w0 c1372w0 = new C1372w0(fileChannel, 0L, j10);
        C1372w0 c1372w1 = new C1372w0(fileChannel, j11, j12 - j11);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        C1322f1.m7130d(byteBufferDuplicate, j10);
        C1305a c1305a = new C1305a(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = ((Integer) it.next()).intValue();
            i10++;
        }
        try {
            byte[][] bArrM7122k = m7122k(iArr, new InterfaceC1371w[]{c1372w0, c1372w1, c1305a});
            for (int i11 = 0; i11 < size; i11++) {
                int i12 = iArr[i11];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i12)), bArrM7122k[i11])) {
                    throw new SecurityException(m7115d(i12).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e10) {
            throw new SecurityException("Failed to compute digest(s) of contents", e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m7120i(ByteBuffer byteBuffer) throws IOException {
        int i10 = byteBuffer.getInt();
        if (i10 < 0) {
            throw new IOException("Negative length");
        }
        if (i10 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i10];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i10 + ", available: " + byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: j */
    public static X509Certificate[] m7121j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM7117f = m7117f(byteBuffer);
        ByteBuffer byteBufferM7117f2 = m7117f(byteBuffer);
        byte[] bArrM7120i = m7120i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM7120i2 = null;
        byte[] bArrM7120i3 = null;
        int i10 = -1;
        int i11 = 0;
        while (byteBufferM7117f2.hasRemaining()) {
            i11++;
            try {
                ByteBuffer byteBufferM7117f3 = m7117f(byteBufferM7117f2);
                if (byteBufferM7117f3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i12 = byteBufferM7117f3.getInt();
                arrayList.add(Integer.valueOf(i12));
                if (i12 != 513 && i12 != 514 && i12 != 769) {
                    switch (i12) {
                        case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i10 != -1) {
                    int iM7114c = m7114c(i12);
                    int iM7114c2 = m7114c(i10);
                    if (iM7114c != 1 && iM7114c2 == 1) {
                    }
                }
                bArrM7120i3 = m7120i(byteBufferM7117f3);
                i10 = i12;
            } catch (IOException e10) {
                e = e10;
                throw new SecurityException("Failed to parse signature record #" + i11, e);
            } catch (BufferUnderflowException e11) {
                e = e11;
                throw new SecurityException("Failed to parse signature record #" + i11, e);
            }
        }
        if (i10 == -1) {
            if (i11 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i10 == 513 || i10 == 514) {
            str = "EC";
        } else if (i10 != 769) {
            switch (i10) {
                case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            str = "DSA";
        }
        if (i10 == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i10 == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i10 != 769) {
            switch (i10) {
                case InputDeviceCompat.SOURCE_KEYBOARD /* 257 */:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    throw new IllegalArgumentException("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i10))));
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM7120i));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM7117f);
            if (!signature.verify(bArrM7120i3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferM7117f.clear();
            ByteBuffer byteBufferM7117f4 = m7117f(byteBufferM7117f);
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (byteBufferM7117f4.hasRemaining()) {
                i13++;
                try {
                    ByteBuffer byteBufferM7117f5 = m7117f(byteBufferM7117f4);
                    if (byteBufferM7117f5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i14 = byteBufferM7117f5.getInt();
                    arrayList2.add(Integer.valueOf(i14));
                    if (i14 == i10) {
                        bArrM7120i2 = m7120i(byteBufferM7117f5);
                    }
                } catch (IOException e12) {
                    e = e12;
                    throw new IOException("Failed to parse digest record #" + i13, e);
                } catch (BufferUnderflowException e13) {
                    e = e13;
                    throw new IOException("Failed to parse digest record #" + i13, e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iM7114c3 = m7114c(i10);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iM7114c3), bArrM7120i2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM7120i2)) {
                throw new SecurityException(m7115d(iM7114c3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM7117f6 = m7117f(byteBufferM7117f);
            ArrayList arrayList3 = new ArrayList();
            int i15 = 0;
            while (byteBufferM7117f6.hasRemaining()) {
                i15++;
                byte[] bArrM7120i4 = m7120i(byteBufferM7117f6);
                try {
                    arrayList3.add(new C1313c1((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM7120i4)), bArrM7120i4));
                } catch (CertificateException e14) {
                    throw new SecurityException("Failed to decode certificate #" + i15, e14);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM7120i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e15) {
            e = e15;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e16) {
            e = e16;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e17) {
            e = e17;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e18) {
            e = e18;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e19) {
            e = e19;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[][] m7122k(int[] iArr, InterfaceC1371w[] interfaceC1371wArr) throws DigestException {
        long j10;
        int i10;
        int length;
        char c10;
        int i11;
        String str;
        int i12 = 0;
        int i13 = 0;
        long jZza = 0;
        while (true) {
            j10 = 1048576;
            i10 = 3;
            if (i13 >= 3) {
                break;
            }
            jZza += (interfaceC1371wArr[i13].zza() + 1048575) / 1048576;
            i13++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr = new byte[iArr.length][];
        int i14 = 0;
        while (true) {
            length = iArr.length;
            c10 = 5;
            i11 = 1;
            if (i14 >= length) {
                break;
            }
            int i15 = (int) jZza;
            byte[] bArr2 = new byte[(m7113b(iArr[i14]) * i15) + 5];
            bArr2[0] = 90;
            m7118g(i15, bArr2, 1);
            bArr[i14] = bArr2;
            i14++;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i16 = 0;
        while (true) {
            str = " digest not supported";
            if (i16 >= iArr.length) {
                break;
            }
            String strM7115d = m7115d(iArr[i16]);
            try {
                messageDigestArr[i16] = MessageDigest.getInstance(strM7115d);
                i16++;
            } catch (NoSuchAlgorithmException e10) {
                throw new RuntimeException(strM7115d.concat(" digest not supported"), e10);
            }
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < i10) {
            InterfaceC1371w interfaceC1371w = interfaceC1371wArr[i17];
            int i19 = i17;
            long jZza2 = interfaceC1371w.zza();
            byte[][] bArr4 = bArr;
            long j11 = 0;
            while (jZza2 > 0) {
                int i20 = i18;
                String str2 = str;
                int iMin = (int) Math.min(jZza2, j10);
                m7118g(iMin, bArr3, i11);
                for (int i21 = 0; i21 < length; i21++) {
                    messageDigestArr[i21].update(bArr3);
                }
                try {
                    interfaceC1371w.mo7100a(messageDigestArr, j11, iMin);
                    int i22 = 0;
                    while (i22 < iArr.length) {
                        int i23 = iArr[i22];
                        byte[] bArr5 = bArr4[i22];
                        int iM7113b = m7113b(i23);
                        char c11 = c10;
                        MessageDigest messageDigest = messageDigestArr[i22];
                        int iDigest = messageDigest.digest(bArr5, (i20 * iM7113b) + 5, iM7113b);
                        if (iDigest != iM7113b) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i22++;
                        c10 = c11;
                    }
                    long j12 = iMin;
                    j11 += j12;
                    jZza2 -= j12;
                    i18 = i20 + 1;
                    str = str2;
                    j10 = 1048576;
                    i11 = 1;
                } catch (IOException e11) {
                    throw new DigestException("Failed to digest chunk #" + i20 + " of section #" + i12, e11);
                }
            }
            i12++;
            i17 = i19 + 1;
            bArr = bArr4;
            j10 = 1048576;
            i10 = 3;
            i11 = 1;
        }
        byte[][] bArr6 = bArr;
        String str3 = str;
        byte[][] bArr7 = new byte[iArr.length][];
        for (int i24 = 0; i24 < iArr.length; i24++) {
            int i25 = iArr[i24];
            byte[] bArr8 = bArr6[i24];
            String strM7115d2 = m7115d(i25);
            try {
                bArr7[i24] = MessageDigest.getInstance(strM7115d2).digest(bArr8);
            } catch (NoSuchAlgorithmException e12) {
                throw new RuntimeException(strM7115d2.concat(str3), e12);
            }
        }
        return bArr7;
    }

    /* JADX INFO: renamed from: l */
    public static X509Certificate[][] m7123l(FileChannel fileChannel, C1307a1 c1307a1) {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM7117f = m7117f(c1307a1.f5341a);
                int i10 = 0;
                while (byteBufferM7117f.hasRemaining()) {
                    i10++;
                    try {
                        arrayList.add(m7121j(m7117f(byteBufferM7117f), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e10) {
                        throw new SecurityException("Failed to parse/verify signer #" + i10 + " block", e10);
                    }
                }
                if (i10 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                m7119h(map, fileChannel, c1307a1.f5342b, c1307a1.f5343c, c1307a1.f5344d, c1307a1.f5345e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e11) {
                throw new SecurityException("Failed to read list of signers", e11);
            }
        } catch (CertificateException e12) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e12);
        }
    }
}
