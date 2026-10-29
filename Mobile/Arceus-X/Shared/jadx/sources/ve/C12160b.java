package ve;

import android.security.keystore.KeyGenParameterSpec;
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
import pe.InterfaceC10211a;

/* JADX INFO: renamed from: ve.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C12160b {

    /* JADX INFO: renamed from: ve.b$a */
    public static final class a implements InterfaceC10211a {

        /* JADX INFO: renamed from: a */
        public final SecretKey f42789a;

        public a(String str, KeyStore keyStore) throws InvalidKeyException {
            SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
            this.f42789a = secretKey;
            if (secretKey != null) {
                return;
            }
            throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
        }

        @Override // pe.InterfaceC10211a
        /* JADX INFO: renamed from: a */
        public byte[] mo22645a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            if (bArr.length > 2147483619) {
                throw new GeneralSecurityException("plaintext too long");
            }
            byte[] bArr3 = new byte[bArr.length + 28];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f42789a);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            byte[] iv2 = cipher.getIV();
            if (iv2.length != 12) {
                throw new GeneralSecurityException("IV has unexpected length");
            }
            System.arraycopy(iv2, 0, bArr3, 0, 12);
            return bArr3;
        }

        @Override // pe.InterfaceC10211a
        /* JADX INFO: renamed from: b */
        public byte[] mo22646b(byte[] bArr, byte[] bArr2) throws BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
            if (bArr.length < 28) {
                throw new BadPaddingException("ciphertext too short");
            }
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f42789a, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m45004a(String str) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        m45005b(new KeyGenParameterSpec.Builder(str, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
    }

    /* JADX INFO: renamed from: b */
    public static void m45005b(KeyGenParameterSpec keyGenParameterSpec) throws NoSuchAlgorithmException, NoSuchProviderException, InvalidAlgorithmParameterException {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(keyGenParameterSpec);
        keyGenerator.generateKey();
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC10211a m45006c(String str) {
        return new a(str, m45007d());
    }

    /* JADX INFO: renamed from: d */
    public static KeyStore m45007d() throws GeneralSecurityException {
        if (!m45009f()) {
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

    /* JADX INFO: renamed from: e */
    public static boolean m45008e(String str) {
        return m45007d().containsAlias(str);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m45009f() {
        return true;
    }
}
