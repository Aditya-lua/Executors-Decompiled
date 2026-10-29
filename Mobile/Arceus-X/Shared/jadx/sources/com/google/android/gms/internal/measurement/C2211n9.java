package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p169he.C6384n;
import p504w1.C12277a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2211n9 implements InterfaceC2318t8 {

    /* JADX INFO: renamed from: f */
    public static final Map f8509f = new C12277a();

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f8510a;

    /* JADX INFO: renamed from: b */
    public SharedPreferences.OnSharedPreferenceChangeListener f8511b;

    /* JADX INFO: renamed from: d */
    public volatile Map f8513d;

    /* JADX INFO: renamed from: c */
    public final Object f8512c = new Object();

    /* JADX INFO: renamed from: e */
    public final List f8514e = new ArrayList();

    public C2211n9(SharedPreferences sharedPreferences, Runnable runnable) {
        this.f8510a = sharedPreferences;
    }

    /* JADX INFO: renamed from: c */
    public static C2211n9 m10428c(Context context, String str, Runnable runnable) {
        final C2211n9 c2211n9;
        SharedPreferences sharedPreferencesM10298a;
        if (C2156k8.m10318a() && !str.startsWith("direct_boot:") && !C2156k8.m10320c(context)) {
            return null;
        }
        synchronized (C2211n9.class) {
            Map map = f8509f;
            c2211n9 = (C2211n9) map.get(str);
            if (c2211n9 == null) {
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    if (str.startsWith("direct_boot:")) {
                        if (C2156k8.m10318a()) {
                            context = context.createDeviceProtectedStorageContext();
                        }
                        sharedPreferencesM10298a = C2131j1.m10298a(context, str.substring(12), 0, C2057f1.f8175a);
                    } else {
                        sharedPreferencesM10298a = C2131j1.m10298a(context, str, 0, C2057f1.f8175a);
                    }
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    c2211n9 = new C2211n9(sharedPreferencesM10298a, runnable);
                    SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.google.android.gms.internal.measurement.m9
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str2) {
                            this.f8417a.m10431e(sharedPreferences, str2);
                        }
                    };
                    c2211n9.f8511b = onSharedPreferenceChangeListener;
                    c2211n9.f8510a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
                    map.put(str, c2211n9);
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            }
        }
        return c2211n9;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized void m10429d() {
        try {
            Map map = f8509f;
            for (C2211n9 c2211n9 : map.values()) {
                c2211n9.f8510a.unregisterOnSharedPreferenceChangeListener((SharedPreferences.OnSharedPreferenceChangeListener) C6384n.m27928l(c2211n9.f8511b));
            }
            map.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2318t8
    /* JADX INFO: renamed from: b */
    public final Object mo10430b(String str) {
        Map<String, ?> map = this.f8513d;
        if (map == null) {
            synchronized (this.f8512c) {
                try {
                    map = this.f8513d;
                    if (map == null) {
                        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                        try {
                            Map<String, ?> all = this.f8510a.getAll();
                            this.f8513d = all;
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

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10431e(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f8512c) {
            this.f8513d = null;
            AbstractC2175l9.m10362c();
        }
        synchronized (this) {
            try {
                Iterator it = this.f8514e.iterator();
                while (it.hasNext()) {
                    ((InterfaceC2264q8) it.next()).zza();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
