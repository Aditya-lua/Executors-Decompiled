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

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f5263d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, String> f5264e;
    public String registerClient;
    public String unregisterClient;

    public AFc1sSDK(String str, byte[] bArr, String str2, AFe1zSDK aFe1zSDK, Map<String, String> map) {
        this.unregisterClient = str;
        this.f5263d = bArr;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = aFe1zSDK;
        this.f5264e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFc1sSDK.class == obj.getClass()) {
            AFc1sSDK aFc1sSDK = (AFc1sSDK) obj;
            if (Objects.equals(this.AFKeystoreWrapper, aFc1sSDK.AFKeystoreWrapper) && Arrays.equals(this.f5263d, aFc1sSDK.f5263d) && Objects.equals(this.unregisterClient, aFc1sSDK.unregisterClient) && Objects.equals(this.registerClient, aFc1sSDK.registerClient) && Objects.equals(this.f5264e, aFc1sSDK.f5264e) && this.AFLogger == aFc1sSDK.AFLogger) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.AFKeystoreWrapper;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.f5263d)) * 31;
        String str2 = this.unregisterClient;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.registerClient;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        AFe1zSDK aFe1zSDK = this.AFLogger;
        int iHashCode4 = (iHashCode3 + (aFe1zSDK != null ? aFe1zSDK.hashCode() : 0)) * 31;
        Map<String, String> map = this.f5264e;
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
                        this.f5264e = JsonUtils.toStringMap(new JSONObject(new String(Base64.decode(strNextLine.substring(8).trim(), 2), Charset.defaultCharset())));
                    } catch (Exception e10) {
                        AFLogger.INSTANCE.e(LogTag.CACHE, "Error parsing headers", e10);
                        this.f5264e = new HashMap();
                    }
                } else if (strNextLine.startsWith("data=")) {
                    this.f5263d = Base64.decode(strNextLine.substring(5).trim(), 2);
                } else if (strNextLine.startsWith("type=")) {
                    String strTrim = strNextLine.substring(5).trim();
                    AFd1bSDK aFd1bSDKRegisterClient = AFd1bSDK.registerClient(strTrim);
                    if (aFd1bSDKRegisterClient != null) {
                        this.AFLogger = aFd1bSDKRegisterClient;
                    } else {
                        AFLogger.INSTANCE.d(LogTag.CACHE, "Unknown task type: ".concat(String.valueOf(strTrim)));
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
