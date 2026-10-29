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

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<String, Object> f5399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5400e;
    public byte[] force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f5401i;
    public final Map<String, String> registerClient;
    public final boolean unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f5402v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f5403w;

    public AFh1pSDK() {
        this(null, null, null);
    }

    public abstract AFe1zSDK AFKeystoreWrapper();

    public final AFh1pSDK AFKeystoreWrapper(Map<String, ?> map) {
        synchronized (map) {
            this.f5399d.putAll(map);
        }
        return this;
    }

    public boolean AFLogger() {
        return true;
    }

    public boolean d() {
        return true;
    }

    public boolean registerClient() {
        return false;
    }

    public final AFh1pSDK unregisterClient() {
        this.afErrorLog = true;
        return this;
    }

    public AFh1pSDK(String str, String str2, Boolean bool) {
        this.f5399d = new HashMap();
        this.registerClient = new HashMap();
        this.afErrorLog = false;
        this.f5402v = str;
        this.f5401i = str2;
        this.unregisterClient = bool != null ? bool.booleanValue() : true;
    }

    public final AFh1pSDK unregisterClient(int i10) {
        this.afWarnLog = i10;
        synchronized (this.f5399d) {
            try {
                if (this.f5399d.containsKey("counter")) {
                    this.f5399d.put("counter", Integer.toString(i10));
                }
                if (this.f5399d.containsKey("launch_counter")) {
                    this.f5399d.put("launch_counter", Integer.toString(i10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return this;
    }

    public final AFh1pSDK AFKeystoreWrapper(String str, Object obj) {
        synchronized (this.f5399d) {
            this.f5399d.put(str, obj);
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
