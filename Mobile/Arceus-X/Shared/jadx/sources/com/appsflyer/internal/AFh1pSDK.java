package com.appsflyer.internal;

import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1pSDK {
    public Map<String, Object> AFKeystoreWrapper;
    public AppsFlyerRequestListener AFLogger;
    protected boolean afErrorLog;
    public String afInfoLog;
    public int afWarnLog;

    /* JADX INFO: renamed from: d */
    public Map<String, Object> f7027d;

    /* JADX INFO: renamed from: e */
    public String f7028e;
    public byte[] force;

    /* JADX INFO: renamed from: i */
    public String f7029i;
    public final Map<String, String> registerClient;
    public final boolean unregisterClient;

    /* JADX INFO: renamed from: v */
    public String f7030v;

    /* JADX INFO: renamed from: w */
    public String f7031w;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AFh1pSDK() {
        this(null, null, null);
    }

    public abstract AFe1zSDK AFKeystoreWrapper();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AFh1pSDK AFKeystoreWrapper(Map<String, ?> map) {
        synchronized (map) {
            this.f7027d.putAll(map);
        }
        return this;
    }

    public boolean AFLogger() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public boolean mo8887d() {
        return true;
    }

    public boolean registerClient() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AFh1pSDK unregisterClient() {
        this.afErrorLog = true;
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AFh1pSDK(String str, String str2, Boolean bool) {
        this.f7027d = new HashMap();
        this.registerClient = new HashMap();
        this.afErrorLog = false;
        this.f7030v = str;
        this.f7029i = str2;
        this.unregisterClient = bool != null ? bool.booleanValue() : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public final AFh1pSDK unregisterClient(int i10) {
        this.afWarnLog = i10;
        synchronized (this.f7027d) {
            try {
                if (this.f7027d.containsKey("counter")) {
                    this.f7027d.put("counter", Integer.toString(i10));
                }
                if (this.f7027d.containsKey("launch_counter")) {
                    this.f7027d.put("launch_counter", Integer.toString(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final AFh1pSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.f7027d) {
            this.f7027d.put(str, obj);
        }
        return this;
    }

    public static boolean unregisterClient(double d10) {
        if (d10 < 0.0d || d10 >= 1.0d) {
            return false;
        }
        if (d10 == 0.0d) {
            return true;
        }
        int i10 = (int) (1.0d / d10);
        if (i10 + 1 > 0) {
            return ((int) ((Math.random() * ((double) i10)) + 1.0d)) != i10;
        }
        throw new IllegalArgumentException("Unsupported max value");
    }
}
