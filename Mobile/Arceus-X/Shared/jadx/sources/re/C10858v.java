package re;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import p076df.C4591m;
import p076df.C4594p;
import p076df.C4599u;
import p379qe.C10506a0;
import p465ue.C11844b;
import p515we.C12394s0;
import pe.C10229j;
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: re.v */
/* JADX INFO: loaded from: classes2.dex */
public final class C10858v implements InterfaceC10211a {

    /* JADX INFO: renamed from: c */
    public static final C11844b.b f38582c = C11844b.b.f41601a;

    /* JADX INFO: renamed from: d */
    public static final byte[] f38583d = C4594p.m22709a("808182838485868788898a8b8c8d8e8f909192939495969798999a9b9c9d9e9f");

    /* JADX INFO: renamed from: e */
    public static final byte[] f38584e = C4594p.m22709a("070000004041424344454647");

    /* JADX INFO: renamed from: f */
    public static final byte[] f38585f = C4594p.m22709a("a0784d7a4716f3feb4f64e7f4b39bf04");

    /* JADX INFO: renamed from: g */
    public static final ThreadLocal<Cipher> f38586g = new a();

    /* JADX INFO: renamed from: a */
    public final SecretKey f38587a;

    /* JADX INFO: renamed from: b */
    public final byte[] f38588b;

    /* JADX INFO: renamed from: re.v$a */
    public class a extends ThreadLocal<Cipher> {
        /* JADX DEBUG: Method merged with bridge method: initialValue()Ljava/lang/Object; */
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                Cipher cipherM22699a = C4591m.f18797b.m22699a("ChaCha20-Poly1305");
                if (C10858v.m41304g(cipherM22699a)) {
                    return cipherM22699a;
                }
                return null;
            } catch (GeneralSecurityException unused) {
                return null;
            }
        }
    }

    public C10858v(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!f38582c.mo44243a()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        if (!m41303f()) {
            throw new GeneralSecurityException("JCE does not support algorithm: ChaCha20-Poly1305");
        }
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f38587a = new SecretKeySpec(bArr, "ChaCha20");
        this.f38588b = bArr2;
    }

    /* JADX INFO: renamed from: d */
    public static InterfaceC10211a m41301d(C10506a0 c10506a0) {
        return new C10858v(c10506a0.m40339c().m23856d(C10229j.m39322a()), c10506a0.m40340d().m23850d());
    }

    /* JADX INFO: renamed from: e */
    public static Cipher m41302e() {
        return f38586g.get();
    }

    /* JADX INFO: renamed from: f */
    public static boolean m41303f() {
        return f38586g.get() != null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m41304g(Cipher cipher) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f38584e);
            byte[] bArr = f38583d;
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            byte[] bArr2 = f38585f;
            if (cipher.doFinal(bArr2).length != 0) {
                return false;
            }
            cipher.init(2, new SecretKeySpec(bArr, "ChaCha20"), ivParameterSpec);
            return cipher.doFinal(bArr2).length == 0;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: a */
    public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] bArrM22724a = C4599u.m22724a(12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArrM22724a);
        Cipher cipher = f38586g.get();
        cipher.init(1, this.f38587a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        int outputSize = cipher.getOutputSize(bArr.length);
        byte[] bArr3 = this.f38588b;
        if (outputSize > 2147483635 - bArr3.length) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + 12 + outputSize);
        System.arraycopy(bArrM22724a, 0, bArrCopyOf, this.f38588b.length, 12);
        if (cipher.doFinal(bArr, 0, bArr.length, bArrCopyOf, this.f38588b.length + 12) == outputSize) {
            return bArrCopyOf;
        }
        throw new GeneralSecurityException("not enough data written");
    }

    @Override // pe.InterfaceC10211a
    /* JADX INFO: renamed from: b */
    public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.f38588b;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!C12394s0.m46452e(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = new byte[12];
        System.arraycopy(bArr, this.f38588b.length, bArr4, 0, 12);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        Cipher cipher = f38586g.get();
        cipher.init(2, this.f38587a, ivParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipher.updateAAD(bArr2);
        }
        byte[] bArr5 = this.f38588b;
        return cipher.doFinal(bArr, bArr5.length + 12, (bArr.length - bArr5.length) - 12);
    }
}
