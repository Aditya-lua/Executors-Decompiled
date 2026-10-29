package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.appsflyer.sdk_base.logger.LogTag;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Locale;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes.dex */
public class AFKeystoreWrapper {
    private Context AFKeystoreWrapper;
    public KeyStore registerClient;
    public final Object AFLogger = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f5196d = "";
    public int unregisterClient = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.INSTANCE.i(LogTag.SECURITY, "Initializing KeyStore");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.registerClient = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            AFLogger.INSTANCE.e(LogTag.SECURITY, "Couldn't load keystore instance of type: AndroidKeyStore", e10);
        }
    }

    public final void AFKeystoreWrapper(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SECURITY;
        aFLogger.i(logTag, "Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Locale locale = Locale.US;
            Calendar calendar = Calendar.getInstance(locale);
            Calendar calendar2 = Calendar.getInstance(locale);
            calendar2.add(1, 5);
            synchronized (this.AFLogger) {
                try {
                    if (this.registerClient.containsAlias(str)) {
                        aFLogger.i(logTag, "Alias already exists: ".concat(String.valueOf(str)));
                    } else {
                        KeyGenParameterSpec keyGenParameterSpecBuild = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        keyPairGenerator.initialize(keyGenParameterSpecBuild);
                        keyPairGenerator.generateKeyPair();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            AFLogger aFLogger2 = AFLogger.INSTANCE;
            LogTag logTag2 = LogTag.SECURITY;
            StringBuilder sb2 = new StringBuilder("Exception occurred while creating key: ");
            sb2.append(th3.getMessage() != null ? th3.getMessage() : "unknown error");
            aFLogger2.e(logTag2, sb2.toString(), th3);
        }
    }

    public final String AFLogger() {
        String str;
        synchronized (this.AFLogger) {
            str = this.f5196d;
        }
        return str;
    }

    public final boolean d() {
        boolean z10;
        synchronized (this.AFLogger) {
            try {
                KeyStore keyStore = this.registerClient;
                z10 = false;
                if (keyStore != null) {
                    try {
                        Enumeration<String> enumerationAliases = keyStore.aliases();
                        while (enumerationAliases.hasMoreElements()) {
                            String strNextElement = enumerationAliases.nextElement();
                            if (strNextElement != null && strNextElement.startsWith("com.appsflyer")) {
                                String[] strArrSplit = strNextElement.split(",");
                                if (strArrSplit.length != 3) {
                                    break;
                                }
                                AFLogger.INSTANCE.i(LogTag.SECURITY, "Found a matching AF key with alias:\n".concat(strNextElement));
                                z10 = true;
                                String[] strArrSplit2 = strArrSplit[1].trim().split("=");
                                String[] strArrSplit3 = strArrSplit[2].trim().split("=");
                                if (strArrSplit2.length != 2 || strArrSplit3.length != 2) {
                                    break;
                                    break;
                                }
                                this.f5196d = strArrSplit2[1].trim();
                                this.unregisterClient = Integer.parseInt(strArrSplit3[1].trim());
                                break;
                            }
                        }
                    } catch (Throwable th2) {
                        AFLogger aFLogger = AFLogger.INSTANCE;
                        LogTag logTag = LogTag.SECURITY;
                        StringBuilder sb2 = new StringBuilder("Couldn't list KeyStore aliases: ");
                        sb2.append(th2.getClass().getName());
                        aFLogger.e(logTag, sb2.toString(), th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z10;
    }

    public final int registerClient() {
        int i10;
        synchronized (this.AFLogger) {
            i10 = this.unregisterClient;
        }
        return i10;
    }

    public final String AFKeystoreWrapper() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appsflyer,");
        synchronized (this.AFLogger) {
            sb2.append("KSAppsFlyerId=");
            sb2.append(this.f5196d);
            sb2.append(",");
            sb2.append("KSAppsFlyerRICounter=");
            sb2.append(this.unregisterClient);
        }
        return sb2.toString();
    }
}
