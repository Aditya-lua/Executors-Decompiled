package com.roblox.engine.jni;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.Keep;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.spec.ECGenParameterSpec;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class NativeQuoteInterface {
    public static void a(Object obj) throws NoSuchAlgorithmException, IOException, NoSuchProviderException, InvalidAlgorithmParameterException {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            keyPairGenerator.initialize((KeyGenParameterSpec) obj);
            keyPairGenerator.generateKeyPair();
        } catch (ProviderException e10) {
            throw new IOException(e10);
        }
    }

    public static Object b(String str, int i10, byte[] bArr, boolean z10) {
        KeyGenParameterSpec.Builder keyValidityStart = new KeyGenParameterSpec.Builder(str, i10).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setDigests("SHA-256").setAttestationChallenge(bArr).setKeyValidityStart(new Date(System.currentTimeMillis() - 300000));
        if (Build.VERSION.SDK_INT >= 28 && z10) {
            keyValidityStart.setIsStrongBoxBacked(true);
        }
        return keyValidityStart;
    }

    @Keep
    public static byte[] requestResponse(byte[] bArr) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
        if (bArr.length != 32) {
            throw new IOException("challenge length is wrong");
        }
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (keyStore.containsAlias("rbx_keystore")) {
            keyStore.deleteEntry("rbx_keystore");
        }
        try {
            try {
                a(((KeyGenParameterSpec.Builder) b("rbx_keystore", 12, bArr, true)).build());
            } catch (IOException unused) {
                a(((KeyGenParameterSpec.Builder) b("rbx_keystore", 12, bArr, false)).build());
            }
            Certificate[] certificateChain = keyStore.getCertificateChain("rbx_keystore");
            keyStore.deleteEntry("rbx_keystore");
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32768);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.put((byte) certificateChain.length);
            for (Certificate certificate : certificateChain) {
                byte[] encoded = certificate.getEncoded();
                byteBufferAllocate.put((byte) (encoded.length & 255));
                byteBufferAllocate.put((byte) ((encoded.length >>> 8) & 255));
                byteBufferAllocate.put(encoded);
            }
            byteBufferAllocate.flip();
            byte[] bArr2 = new byte[byteBufferAllocate.remaining()];
            byteBufferAllocate.get(bArr2);
            return bArr2;
        } catch (IOException e10) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(32768);
            byteBufferAllocate2.put((byte) 1);
            byteBufferAllocate2.put((byte) 0);
            StringWriter stringWriter = new StringWriter();
            e10.printStackTrace(new PrintWriter(stringWriter));
            byteBufferAllocate2.put(stringWriter.toString().getBytes(StandardCharsets.UTF_8));
            byteBufferAllocate2.flip();
            byte[] bArr3 = new byte[byteBufferAllocate2.remaining()];
            byteBufferAllocate2.get(bArr3);
            return bArr3;
        }
    }
}
