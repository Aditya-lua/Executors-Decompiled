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
    public static final Map f6757f = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6758a;
    public SharedPreferences.OnSharedPreferenceChangeListener b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map f6760d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6759c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6761e = new ArrayList();

    public n9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f6758a = sharedPreferences;
    }

    public static n9 c(Context context, String str, Runnable runnable) {
        final n9 n9Var;
        SharedPreferences sharedPreferencesA;
        if (k8.a() && !str.startsWith("direct_boot:") && !k8.c(context)) {
            return null;
        }
        synchronized (n9.class) {
            Map map = f6757f;
            n9Var = (n9) map.get(str);
            if (n9Var == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (k8.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = j1.a(context, str.substring(12), 0, f1.f6510a);
                    } else {
                        sharedPreferencesA = j1.a(context, str, 0, f1.f6510a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    n9Var = new n9(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.m9
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f6696a.e(sharedPreferences, str2);
                        }
                    };
                    n9Var.b = onSharedPreferenceChangeListener;
                    n9Var.f6758a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
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
            Map map = f6757f;
            for (n9 n9Var : map.values()) {
                n9Var.f6758a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) he.n.l(n9Var.b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.t8
    public final Object b(String str) {
        Map<String, ?> map = this.f6760d;
        if (map == null) {
            synchronized (this.f6759c) {
                try {
                    map = this.f6760d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f6758a.getAll();
                            this.f6760d = all;
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
        synchronized (this.f6759c) {
            this.f6760d = null;
            l9.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6761e.iterator();
                while (it.hasNext()) {
                    ((q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
