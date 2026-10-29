package cf;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import ve.s0;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements oe.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final te.b.EnumC0569b f4812f = te.b.EnumC0569b.f31710a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f4813g = new a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f4814h = new C0105b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4815a;
    public final byte[] b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f4816c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SecretKeySpec f4817d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4818e;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: cf.b$b, reason: collision with other inner class name */
    public class C0105b extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return m.b.a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public b(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!f4812f.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f4818e = i10;
        a0.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4817d = secretKeySpec;
        Cipher cipher = f4813g.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher.doFinal(new byte[16]));
        this.f4815a = bArrD;
        this.b = d(bArrD);
        this.f4816c = bArr2;
    }

    public static oe.a c(pe.l lVar) throws GeneralSecurityException {
        if (!f4812f.a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (lVar.e().e() == 16) {
            return new b(lVar.c().d(oe.j.a()), lVar.e().c(), lVar.d().d());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + lVar.e().e());
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static void g(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f4816c;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i10 = this.f4818e;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] bArrA = u.a(this.f4818e);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.f4816c.length, this.f4818e);
        Cipher cipher = f4813g.get();
        cipher.init(1, this.f4817d);
        byte[] bArrE = e(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrE2 = e(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f4814h.get();
        cipher2.init(1, this.f4817d, new IvParameterSpec(bArrE));
        cipher2.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f4816c.length + this.f4818e);
        byte[] bArrE3 = e(cipher, 2, bArrCopyOf, this.f4816c.length + this.f4818e, bArr.length);
        int length3 = this.f4816c.length + bArr.length + this.f4818e;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrCopyOf[length3 + i11] = (byte) ((bArrE2[i11] ^ bArrE[i11]) ^ bArrE3[i11]);
        }
        return bArrCopyOf;
    }

    @Override // oe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f4816c;
        int length2 = ((length - bArr3.length) - this.f4818e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = f4813g.get();
        cipher.init(1, this.f4817d);
        byte[] bArrE = e(cipher, 0, bArr, this.f4816c.length, this.f4818e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrE2 = e(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrE3 = e(cipher, 2, bArr, this.f4816c.length + this.f4818e, length2);
        int length3 = bArr.length - 16;
        byte b = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b = (byte) (b | (((bArr[length3 + i10] ^ bArrE2[i10]) ^ bArrE[i10]) ^ bArrE3[i10]));
        }
        if (b != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f4814h.get();
        cipher2.init(1, this.f4817d, new IvParameterSpec(bArrE));
        return cipher2.doFinal(bArr, this.f4816c.length + this.f4818e, length2);
    }

    public final byte[] e(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            g(bArr2, this.f4815a);
            return cipher.doFinal(bArr2);
        }
        byte[] bArr3 = new byte[16];
        cipher.doFinal(bArr2, 0, 16, bArr3);
        byte[] bArr4 = bArr3;
        byte[] bArr5 = bArr2;
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArr4[i14] = (byte) (bArr4[i14] ^ bArr[(i11 + i13) + i14]);
            }
            cipher.doFinal(bArr4, 0, 16, bArr5);
            i13 += 16;
            byte[] bArr6 = bArr4;
            bArr4 = bArr5;
            bArr5 = bArr6;
        }
        g(bArr4, f(bArr, i13 + i11, i11 + i12));
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    public final byte[] f(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        if (bArrCopyOfRange.length == 16) {
            g(bArrCopyOfRange, this.f4815a);
            return bArrCopyOfRange;
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.b, 16);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOf[i12] = (byte) (bArrCopyOf[i12] ^ bArrCopyOfRange[i12]);
        }
        bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        return bArrCopyOf;
    }
}
