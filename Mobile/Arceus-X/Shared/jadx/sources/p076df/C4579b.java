package p076df;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p379qe.C10538l;
import p465ue.C11844b;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: df.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C4579b implements InterfaceC10211a {

    /* JADX INFO: renamed from: f */
    public static final C11844b.b f18724f = C11844b.b.f41601a;

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<Cipher> f18725g = new a();

    /* JADX INFO: renamed from: h */
    public static final ThreadLocal<Cipher> f18726h = new b();

    /* JADX INFO: renamed from: a */
    public final byte[] f18727a;

    /* JADX INFO: renamed from: b */
    public final byte[] f18728b;

    /* JADX INFO: renamed from: c */
    public final byte[] f18729c;

    /* JADX INFO: renamed from: d */
    public final SecretKeySpec f18730d;

    /* JADX INFO: renamed from: e */
    public final int f18731e;

    /* JADX INFO: renamed from: df.b$a */
    public class a extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C4591m.f18797b.m22699a("AES/ECB/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    /* JADX INFO: renamed from: df.b$b */
    public class b extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return C4591m.f18797b.m22699a("AES/CTR/NOPADDING");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public C4579b(byte[] bArr, int i10, byte[] bArr2) throws GeneralSecurityException {
        if (!f18724f.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f18731e = i10;
        C4578a0.m22637a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f18730d = secretKeySpec;
        Cipher cipher = f18725g.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrM22643d = m22643d(cipher.doFinal(new byte[16]));
        this.f18727a = bArrM22643d;
        this.f18728b = m22643d(bArrM22643d);
        this.f18729c = bArr2;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m22642c(C10538l c10538l) throws GeneralSecurityException {
        if (!f18724f.mo44243a()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (c10538l.m40411e().m40445e() == 16) {
            return new C4579b(c10538l.m40409c().m23856d(C10229j.m39322a()), c10538l.m40411e().m40443c(), c10538l.m40410d().m23850d());
        }
        throw new GeneralSecurityException("AesEaxJce only supports 16 byte tag size, not " + c10538l.m40411e().m40445e());
    }

    /* JADX INFO: renamed from: d */
    public static byte[] m22643d(byte[] bArr) {
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

    /* JADX INFO: renamed from: g */
    public static void m22644g(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f18729c;
        int length2 = Integer.MAX_VALUE - bArr3.length;
        int i10 = this.f18731e;
        if (length > (length2 - i10) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i10 + bArr.length + 16);
        byte[] bArrM22724a = C4599u.m22724a(this.f18731e);
        System.arraycopy(bArrM22724a, 0, bArrCopyOf, this.f18729c.length, this.f18731e);
        Cipher cipher = f18725g.get();
        cipher.init(1, this.f18730d);
        byte[] bArrM22647e = m22647e(cipher, 0, bArrM22724a, 0, bArrM22724a.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM22647e2 = m22647e(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = f18726h.get();
        cipher2.init(1, this.f18730d, new IvParameterSpec(bArrM22647e));
        cipher2.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f18729c.length + this.f18731e);
        byte[] bArrM22647e3 = m22647e(cipher, 2, bArrCopyOf, this.f18729c.length + this.f18731e, bArr.length);
        int length3 = this.f18729c.length + bArr.length + this.f18731e;
        for (int i11 = 0; i11 < 16; i11++) {
            bArrCopyOf[length3 + i11] = (byte) ((bArrM22647e2[i11] ^ bArrM22647e[i11]) ^ bArrM22647e3[i11]);
        }
        return bArrCopyOf;
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        byte[] bArr3 = this.f18729c;
        int length2 = ((length - bArr3.length) - this.f18731e) - 16;
        if (length2 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        Cipher cipher = f18725g.get();
        cipher.init(1, this.f18730d);
        byte[] bArrM22647e = m22647e(cipher, 0, bArr, this.f18729c.length, this.f18731e);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrM22647e2 = m22647e(cipher, 1, bArr4, 0, bArr4.length);
        byte[] bArrM22647e3 = m22647e(cipher, 2, bArr, this.f18729c.length + this.f18731e, length2);
        int length3 = bArr.length - 16;
        byte b10 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            b10 = (byte) (b10 | (((bArr[length3 + i10] ^ bArrM22647e2[i10]) ^ bArrM22647e[i10]) ^ bArrM22647e3[i10]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = f18726h.get();
        cipher2.init(1, this.f18730d, new IvParameterSpec(bArrM22647e));
        return cipher2.doFinal(bArr, this.f18729c.length + this.f18731e, length2);
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m22647e(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        if (i12 == 0) {
            m22644g(bArr2, this.f18727a);
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
        m22644g(bArr4, m22648f(bArr, i13 + i11, i11 + i12));
        cipher.doFinal(bArr4, 0, 16, bArr5);
        return bArr5;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m22648f(byte[] bArr, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        if (bArrCopyOfRange.length == 16) {
            m22644g(bArrCopyOfRange, this.f18727a);
            return bArrCopyOfRange;
        }
        byte[] bArrCopyOf = Arrays.copyOf(this.f18728b, 16);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOf[i12] = (byte) (bArrCopyOf[i12] ^ bArrCopyOfRange[i12]);
        }
        bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        return bArrCopyOf;
    }
}
