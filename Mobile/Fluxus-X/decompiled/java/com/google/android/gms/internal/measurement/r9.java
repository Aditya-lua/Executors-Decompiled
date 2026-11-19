package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class r9 implements x8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f6807f = new w1.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f6808a;
    public SharedPreferences.OnSharedPreferenceChangeListener b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Map f6810d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f6809c = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6811e = new ArrayList();

    public r9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f6808a = sharedPreferences;
    }

    public static r9 c(Context context, String str, Runnable runnable) {
        final r9 r9Var;
        SharedPreferences sharedPreferencesA;
        if (o8.a() && !str.startsWith("direct_boot:") && !o8.c(context)) {
            return null;
        }
        synchronized (r9.class) {
            Map map = f6807f;
            r9Var = (r9) map.get(str);
            if (r9Var == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (o8.a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesA = j1.a(context, str.substring(12), 0, f1.f6502a);
                    } else {
                        sharedPreferencesA = j1.a(context, str, 0, f1.f6502a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    r9Var = new r9(sharedPreferencesA, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.q9
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f6789a.e(sharedPreferences, str2);
                        }
                    };
                    r9Var.b = onSharedPreferenceChangeListener;
                    r9Var.f6808a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, r9Var);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return r9Var;
    }

    public static synchronized void d() {
        try {
            Map map = f6807f;
            for (r9 r9Var : map.values()) {
                r9Var.f6808a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) je.n.l(r9Var.b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.x8
    public final Object b(String str) {
        Map<String, ?> map = this.f6810d;
        if (map == null) {
            synchronized (this.f6809c) {
                try {
                    map = this.f6810d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f6808a.getAll();
                            this.f6810d = all;
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
        synchronized (this.f6809c) {
            this.f6810d = null;
            p9.c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f6811e.iterator();
                while (it.hasNext()) {
                    ((u8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
