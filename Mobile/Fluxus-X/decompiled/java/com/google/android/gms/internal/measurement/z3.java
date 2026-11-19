package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class z3 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static volatile z3 f6961j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6962a = "FA";
    public final v9.e b = v9.h.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ExecutorService f6963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppMeasurementSdk f6964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f6965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f6968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public volatile u1 f6969i;

    public z3(Context context, Bundle bundle) {
        p1.a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new f3(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6963c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f6964d = new AppMeasurementSdk(this);
        this.f6965e = new ArrayList();
        try {
            if (ob.fb.a(context, "google_app_id", ob.d7.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, z3.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f6968h = null;
                    this.f6967g = true;
                    Log.w(this.f6962a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f6968h = "fa";
        i(new s2(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f6962a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new y3(this));
        }
    }

    public static z3 r(Context context, Bundle bundle) {
        o9.s.l(context);
        if (f6961j == null) {
            synchronized (z3.class) {
                try {
                    if (f6961j == null) {
                        f6961j = new z3(context, bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f6961j;
    }

    public final void A(Bundle bundle) {
        i(new m2(this, bundle));
    }

    public final void B(String str, String str2, Bundle bundle) {
        i(new n2(this, str, str2, bundle));
    }

    public final List C(String str, String str2) {
        r1 r1Var = new r1();
        i(new o2(this, str, str2, r1Var));
        List list = (List) r1.v2(r1Var.u2(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    public final void D(j2 j2Var, String str, String str2) {
        i(new p2(this, j2Var, str, str2));
    }

    public final void E(Boolean bool) {
        i(new q2(this, bool));
    }

    public final void F(Bundle bundle) {
        i(new r2(this, bundle));
    }

    public final void G(String str) {
        i(new t2(this, str));
    }

    public final void H(String str) {
        i(new u2(this, str));
    }

    public final void I(Runnable runnable) {
        i(new w2(this, runnable));
    }

    public final String J() {
        r1 r1Var = new r1();
        i(new x2(this, r1Var));
        return r1Var.s2(500L);
    }

    public final String K() {
        r1 r1Var = new r1();
        i(new y2(this, r1Var));
        return r1Var.s2(50L);
    }

    public final long L() {
        r1 r1Var = new r1();
        i(new z2(this, r1Var));
        Long lT2 = r1Var.t2(500L);
        if (lT2 != null) {
            return lT2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i10 = this.f6966f + 1;
        this.f6966f = i10;
        return jNextLong + ((long) i10);
    }

    public final String a() {
        r1 r1Var = new r1();
        i(new a3(this, r1Var));
        return r1Var.s2(500L);
    }

    public final String b() {
        r1 r1Var = new r1();
        i(new c3(this, r1Var));
        return r1Var.s2(500L);
    }

    public final Map c(String str, String str2, boolean z10) {
        r1 r1Var = new r1();
        i(new d3(this, str, str2, z10, r1Var));
        Bundle bundleU2 = r1Var.u2(5000L);
        if (bundleU2 == null || bundleU2.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleU2.size());
        for (String str3 : bundleU2.keySet()) {
            Object obj = bundleU2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void d(int i10, String str, Object obj, Object obj2, Object obj3) {
        i(new e3(this, false, 5, str, obj, null, null));
    }

    public final Bundle e(Bundle bundle, boolean z10) {
        r1 r1Var = new r1();
        i(new g3(this, bundle, r1Var));
        if (z10) {
            return r1Var.u2(5000L);
        }
        return null;
    }

    public final int f(String str) {
        r1 r1Var = new r1();
        i(new h3(this, str, r1Var));
        Integer num = (Integer) r1.v2(r1Var.u2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String g() {
        return this.f6968h;
    }

    public final void h(boolean z10) {
        i(new i3(this, z10));
    }

    public final /* synthetic */ String k() {
        return this.f6962a;
    }

    public final /* synthetic */ boolean l() {
        return this.f6967g;
    }

    public final /* synthetic */ u1 m() {
        return this.f6969i;
    }

    public final /* synthetic */ void n(u1 u1Var) {
        this.f6969i = u1Var;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void i(n3 n3Var) {
        this.f6963c.execute(n3Var);
    }

    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void j(Exception exc, boolean z10, boolean z11) {
        z3 z3Var;
        Exception exc2;
        this.f6967g |= z10;
        if (z10) {
            Log.w(this.f6962a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            z3Var = this;
            exc2 = exc;
            z3Var.d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            z3Var = this;
            exc2 = exc;
        }
        Log.w(z3Var.f6962a, "Error with data collection. Data lost.", exc2);
    }

    public final void q(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        i(new m3(this, l10, str, str2, bundle, z10, z11));
    }

    public final AppMeasurementSdk s() {
        return this.f6964d;
    }

    public final u1 t(Context context, boolean z10) {
        try {
            return t1.asInterface(DynamiteModule.e(context, z10 ? DynamiteModule.f6163e : DynamiteModule.f6161c, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e10) {
            j(e10, true, false);
            return null;
        }
    }

    public final void u(ob.z8 z8Var) {
        o3 o3Var = new o3(z8Var);
        if (this.f6969i != null) {
            try {
                this.f6969i.setEventInterceptor(o3Var);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f6962a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        i(new j3(this, o3Var));
    }

    public final void v(ob.a9 a9Var) {
        o9.s.l(a9Var);
        List list = this.f6965e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (a9Var.equals(((Pair) list.get(i10)).first)) {
                        Log.w(this.f6962a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p3 p3Var = new p3(a9Var);
            list.add(new Pair(a9Var, p3Var));
            if (this.f6969i != null) {
                try {
                    this.f6969i.registerOnMeasurementEventListener(p3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f6962a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            i(new k3(this, p3Var));
        }
    }

    public final void w(ob.a9 a9Var) {
        Pair pair;
        o9.s.l(a9Var);
        List list = this.f6965e;
        synchronized (list) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (a9Var.equals(((Pair) list.get(i10)).first)) {
                            pair = (Pair) list.get(i10);
                            break;
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (pair == null) {
                Log.w(this.f6962a, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            p3 p3Var = (p3) pair.second;
            if (this.f6969i != null) {
                try {
                    this.f6969i.unregisterOnMeasurementEventListener(p3Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f6962a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            i(new l3(this, p3Var));
        }
    }

    public final void x(String str, String str2, Bundle bundle) {
        q(str, str2, bundle, true, true, null);
    }

    public final void y(String str, String str2, Bundle bundle, long j10) {
        q(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    public final void z(String str, String str2, Object obj, boolean z10) {
        i(new l2(this, str, str2, obj, z10));
    }
}
