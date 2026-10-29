package ue;

import android.security.keystore.KeyGenParameterSpec;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    public static final class a implements oe.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SecretKey f32129a;

        public a(String str, KeyStore keyStore) throws InvalidKeyException {
            SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
            this.f32129a = secretKey;
            if (secretKey != null) {
                return;
            }
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }

        @Override // oe.a
        public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 2147483619) {
                throw new GeneralSecurityException("plaintext too long");
            }
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f32129a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            byte[] iv2 = cipher.getIV();
            if (iv2.length != 12) {
                throw new GeneralSecurityException("IV has unexpected length");
            }
            System.arraycopy(iv2, 0, bArr3, 0, 12);
            return bArr3;
        }

        @Override // oe.a
        public byte[] b(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            if (bArr.length < 28) {
                throw new BadPaddingException("ciphertext too short");
            }
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f32129a, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
    }

    public static void a(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        b(new KeyGenParameterSpec.Builder(str, 3).setKeySize(Barcode.FORMAT_QR_CODE).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
    }

    public static void b(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    public static oe.a c(String str) {
        return new a(str, d());
    }

    public static KeyStore d() throws GeneralSecurityException {
        if (!f()) {
            throw new IllegalStateException("Need Android Keystore on Android M or newer");
        }
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            return keyStore;
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static boolean e(String str) {
        return d().containsAlias(str);
    }

    public static boolean f() {
        return true;
    }
}
