package qe;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements oe.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final te.b.EnumC0569b f29350c = te.b.EnumC0569b.f31710a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f29351d = cf.p.a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f29352e = cf.p.a("070000004041424344454647");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f29353f = cf.p.a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f29354g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKey f29355a;
    public final byte[] b;

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherA = cf.m.b.a("ChaCha20-Poly1305");
                if (v.g(cipherA)) {
                    return cipherA;
                }
                return null;
            } catch (GeneralSecurityException unused) {
                return null;
            }
        }
    }

    public v(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f29350c.a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!f()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f29355a = new SecretKeySpec(bArr, "ChaCha20");
        this.b = bArr2;
    }

    public static oe.a d(pe.a0 a0Var) {
        return new v(a0Var.c().d(oe.j.a()), a0Var.d().d());
    }

    public static Cipher e() {
        return f29354g.get();
    }

    public static boolean f() {
        return f29354g.get() != null;
    }

    public static boolean g(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f29352e);
            byte[] bArr = f29351d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f29353f;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // oe.a
    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrA = cf.u.a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrA);
        Cipher cipher = f29354g.get();
        cipher.init(1, this.f29355a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrA, 0, bArrCopyOf, this.b.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.b.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // oe.a
    public byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!ve.s0.e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = f29354g.get();
        cipher.init(2, this.f29355a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr5 = this.b;
        return cipher.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }
}
