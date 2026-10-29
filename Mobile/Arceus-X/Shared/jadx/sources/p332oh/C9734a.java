package p332oh;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
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
import p151gk.C6124q;

/* JADX INFO: renamed from: oh.a */
/* JADX INFO: loaded from: classes2.dex */
public class C9734a {

    /* JADX INFO: renamed from: oh.a$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final String f35426a;

        /* JADX INFO: renamed from: b */
        public final String f35427b;

        public a(String str, String str2) {
            this.f35426a = str;
            this.f35427b = str2;
        }

        /* JADX INFO: renamed from: a */
        public String m38524a() {
            return this.f35427b;
        }

        /* JADX INFO: renamed from: b */
        public String m38525b() {
            return this.f35426a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m38520a(String str, String str2) {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            try {
                KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("encryption_alias", null);
                if (secretKeyEntry == null) {
                    C6124q.m27057b("Encryption", "No key entry found");
                    return null;
                }
                SecretKey secretKey = secretKeyEntry.getSecretKey();
                byte[] bArrDecode = Base64.decode(str2, 0);
                if (bArrDecode == null) {
                    C6124q.m27057b("Encryption", "Error getting encryption IV.");
                    return null;
                }
                try {
                    Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                    cipher.init(2, secretKey, new GCMParameterSpec(128, bArrDecode));
                    return new String(cipher.doFinal(Base64.decode(str, 0)), StandardCharsets.UTF_8);
                } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e10) {
                    C6124q.m27057b("Encryption", e10.getMessage());
                    return null;
                }
            } catch (UnsupportedOperationException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException e11) {
                C6124q.m27057b("Encryption", e11.getMessage());
                return null;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e12) {
            C6124q.m27057b("Encryption", e12.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static a m38521b(String str) {
        SecretKey secretKeyM38523d = m38523d();
        if (secretKeyM38523d == null) {
            C6124q.m27057b("Encryption", "Error getting secret key");
            return null;
        }
        Cipher cipherM38522c = m38522c(secretKeyM38523d);
        if (cipherM38522c == null) {
            C6124q.m27057b("Encryption", "Error getting encrypt cipher.");
            return null;
        }
        try {
            return new a(new String(Base64.encode(cipherM38522c.getIV(), 0)), new String(Base64.encode(cipherM38522c.doFinal(str.getBytes(StandardCharsets.UTF_8)), 0)));
        } catch (BadPaddingException | IllegalBlockSizeException e10) {
            C6124q.m27057b("Encryption", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Cipher m38522c(SecretKey secretKey) {
        try {
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, secretKey);
            return cipher;
        } catch (InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            C6124q.m27057b("Encryption", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static SecretKey m38523d() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            try {
                keyGenerator.init(new KeyGenParameterSpec.Builder("encryption_alias", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
                return keyGenerator.generateKey();
            } catch (InvalidAlgorithmParameterException e10) {
                C6124q.m27057b("Encryption", e10.getLocalizedMessage());
                return null;
            }
        } catch (NoSuchAlgorithmException | NoSuchProviderException e11) {
            C6124q.m27057b("Encryption", e11.getMessage());
            return null;
        }
    }
}
