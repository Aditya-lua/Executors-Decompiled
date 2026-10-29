package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n9 implements t8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f6684f = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6685a;
    public SharedPreferences.OnSharedPreferenceChangeListener b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map f6687d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6686c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6688e = new ArrayList();

    public n9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f6685a = sharedPreferences;
    }

    public static n9 c(Context context, String str, Runnable runnable) {
        final n9 n9Var;
        SharedPreferences sharedPreferencesA;
        if (k8.a() && !str.startsWith("direct_boot:") && !k8.c(context)) {
            return null;
        }
        synchronized (n9.class) {
            Map map = f6684f;
            n9Var = (n9) map.get(str);
            if (n9Var == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (k8.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = j1.a(context, str.substring(12), 0, f1.f6437a);
                    } else {
                        sharedPreferencesA = j1.a(context, str, 0, f1.f6437a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    n9Var = new n9(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.m9
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f6623a.e(sharedPreferences, str2);
                        }
                    };
                    n9Var.b = onSharedPreferenceChangeListener;
                    n9Var.f6685a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, n9Var);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return n9Var;
    }

    public static synchronized void d() {
        try {
            Map map = f6684f;
            for (n9 n9Var : map.values()) {
                n9Var.f6685a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) ge.n.l(n9Var.b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final Object b(String str) {
        Map<String, ?> map = this.f6687d;
        if (map == null) {
            synchronized (this.f6686c) {
                try {
                    map = this.f6687d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f6685a.getAll();
                            this.f6687d = all;
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            map = all;
                        } catch (Throwable th2) {
                            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final /* synthetic */ void e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f6686c) {
            this.f6687d = null;
            l9.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6688e.iterator();
                while (it.hasNext()) {
                    ((q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
