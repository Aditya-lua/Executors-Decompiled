package oh;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import gk.p;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: oh.a$a, reason: collision with other inner class name */
    public static class C0473a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27370a;
        public final String b;

        public C0473a(String str, String str2) {
            this.f27370a = str;
            this.b = str2;
        }

        public String a() {
            return this.b;
        }

        public String b() {
            return this.f27370a;
        }
    }

    public static String a(String str, String str2) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            try {
                KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("encryption_alias", null);
                if (secretKeyEntry == null) {
                    p.b("Encryption", "No key entry found");
                    return null;
                }
                SecretKey secretKey = secretKeyEntry.getSecretKey();
                byte[] bArrDecode = Base64.decode(str2, 0);
                if (bArrDecode == null) {
                    p.b("Encryption", "Error getting encryption IV.");
                    return null;
                }
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, secretKey, new GCMParameterSpec(128, bArrDecode));
                    return new String(cipher.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
                    p.b("Encryption", e10.getMessage());
                    return null;
                }
            } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e11) {
                p.b("Encryption", e11.getMessage());
                return null;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e12) {
            p.b("Encryption", e12.getMessage());
            return null;
        }
    }

    public static C0473a b(String str) {
        SecretKey secretKeyD = d();
        if (secretKeyD == null) {
            p.b("Encryption", "Error getting secret key");
            return null;
        }
        Cipher cipherC = c(secretKeyD);
        if (cipherC == null) {
            p.b("Encryption", "Error getting encrypt cipher.");
            return null;
        }
        try {
            return new C0473a(new String(Base64.encode(cipherC.getIV(), 0)), new String(Base64.encode(cipherC.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0)));
        } catch (BadPaddingException | IllegalBlockSizeException e10) {
            p.b("Encryption", e10.getMessage());
            return null;
        }
    }

    public static Cipher c(SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            p.b("Encryption", e10.getMessage());
            return null;
        }
    }

    public static SecretKey d() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            try {
                keyGenerator.init(new KeyGenParameterSpec.Builder("encryption_alias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                return keyGenerator.generateKey();
            } catch (InvalidAlgorithmParameterException e10) {
                p.b("Encryption", e10.getLocalizedMessage());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchProviderException e11) {
            p.b("Encryption", e11.getMessage());
            return null;
        }
    }
}
