package te;

import com.google.mlkit.vision.barcode.common.Barcode;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Cipher> f32355a = new a();

    public class a extends ThreadLocal<Cipher> {
        @Override // java.lang.ThreadLocal
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Cipher initialValue() {
            try {
                return ff.m.b.a("AES/GCM/NoPadding");
            } catch (GeneralSecurityException e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static AlgorithmParameterSpec a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static AlgorithmParameterSpec b(byte[] bArr, int i10, int i11) {
        Integer numC = ye.s0.c();
        return (numC == null || numC.intValue() > 19) ? new GCMParameterSpec(Barcode.FORMAT_ITF, bArr, i10, i11) : new IvParameterSpec(bArr, i10, i11);
    }

    public static SecretKey c(byte[] bArr) throws InvalidAlgorithmParameterException {
        ff.a0.a(bArr.length);
        return new SecretKeySpec(bArr, "AES");
    }

    public static Cipher d() {
        return f32355a.get();
    }
}
