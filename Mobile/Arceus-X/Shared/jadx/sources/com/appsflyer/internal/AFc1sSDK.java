package com.appsflyer.internal;

import android.util.Base64;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.JsonUtils;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1sSDK {
    String AFKeystoreWrapper;
    public AFe1zSDK AFLogger;

    /* JADX INFO: renamed from: d */
    public byte[] f6891d;

    /* JADX INFO: renamed from: e */
    public Map<String, String> f6892e;
    public String registerClient;
    public String unregisterClient;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AFc1sSDK(String str, byte[] bArr, String str2, AFe1zSDK aFe1zSDK, Map<String, String> map) {
        this.unregisterClient = str;
        this.f6891d = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = aFe1zSDK;
        this.f6892e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1sSDK.class == obj.getClass()) {
            AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
            if (Objects.equals(this.AFKeystoreWrapper, aFc1sSDK.AFKeystoreWrapper) && Arrays.equals(this.f6891d, aFc1sSDK.f6891d) && Objects.equals(this.unregisterClient, aFc1sSDK.unregisterClient) && Objects.equals(this.registerClient, aFc1sSDK.registerClient) && Objects.equals(this.f6892e, aFc1sSDK.f6892e) && this.AFLogger == aFc1sSDK.AFLogger) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.f6891d)) * 31;
        String str2 = this.unregisterClient;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.registerClient;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1zSDK aFe1zSDK = this.AFLogger;
        int iHashCode4 = (iHashCode3 + (aFe1zSDK != null ? aFe1zSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.f6892e;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    public AFc1sSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        while (scanner.hasNextLine()) {
            try {
                String strNextLine = scanner.nextLine();
                if (strNextLine.startsWith("url=")) {
                    this.unregisterClient = strNextLine.substring(4).trim();
                } else if (strNextLine.startsWith("version=")) {
                    this.AFKeystoreWrapper = strNextLine.substring(8).trim();
                } else if (strNextLine.startsWith("headers=")) {
                    try {
                        this.f6892e = JsonUtils.toStringMap(new JSONObject(new String(Base64.decode(strNextLine.substring(8).trim(), 2), Charset.defaultCharset())));
                    } catch (Exception e10) {
                        AFLogger.INSTANCE.m8961e(LogTag.CACHE, "Error parsing headers", e10);
                        this.f6892e = new HashMap();
                    }
                } else if (strNextLine.startsWith("data=")) {
                    this.f6891d = Base64.decode(strNextLine.substring(5).trim(), 2);
                } else if (strNextLine.startsWith("type=")) {
                    String strTrim = strNextLine.substring(5).trim();
                    AFd1bSDK aFd1bSDKRegisterClient = AFd1bSDK.registerClient(strTrim);
                    if (aFd1bSDKRegisterClient != null) {
                        this.AFLogger = aFd1bSDKRegisterClient;
                    } else {
                        AFLogger.INSTANCE.m8960d(LogTag.CACHE, "Unknown task type: ".concat(String.valueOf(strTrim)));
                    }
                }
            } catch (Throwable th2) {
                try {
                    scanner.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        scanner.close();
    }
}
