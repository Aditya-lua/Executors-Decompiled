package com.appsflyer.internal;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class AFa1nSDK extends HashMap<Integer, String> {

    /* JADX INFO: renamed from: d */
    private static AFa1nSDK f6850d;
    private final Object AFKeystoreWrapper = new Object();

    private AFa1nSDK() {
    }

    public static synchronized AFa1nSDK afErrorLog() {
        try {
            if (f6850d == null) {
                f6850d = new AFa1nSDK();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6850d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String put(Integer num, String str) {
        String str2;
        synchronized (this.AFKeystoreWrapper) {
            str2 = (String) super.put(num, str);
        }
        return str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.HashMap, java.util.Map
    public boolean remove(Object obj, Object obj2) {
        boolean zRemove;
        synchronized (this.AFKeystoreWrapper) {
            zRemove = super.remove(obj, obj2);
        }
        return zRemove;
    }

    /* JADX DEBUG: Method merged with bridge method: remove(Ljava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public String remove(Object obj) {
        String str;
        synchronized (this.AFKeystoreWrapper) {
            str = (String) super.remove(obj);
        }
        return str;
    }
}
