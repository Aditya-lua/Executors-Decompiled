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
import p305n9.C8953m;
import p306nb.C8997ab;
import p306nb.C9381y6;
import p306nb.InterfaceC9319u8;
import p306nb.InterfaceC9335v8;
import p462u9.C11817h;
import p462u9.InterfaceC11814e;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2349v3 {

    /* JADX INFO: renamed from: j */
    public static volatile C2349v3 f8702j;

    /* JADX INFO: renamed from: a */
    public final String f8703a = "FA";

    /* JADX INFO: renamed from: b */
    public final InterfaceC11814e f8704b = C11817h.m44180c();

    /* JADX INFO: renamed from: c */
    public final ExecutorService f8705c;

    /* JADX INFO: renamed from: d */
    public final AppMeasurementSdk f8706d;

    /* JADX INFO: renamed from: e */
    public final List f8707e;

    /* JADX INFO: renamed from: f */
    public int f8708f;

    /* JADX INFO: renamed from: g */
    public boolean f8709g;

    /* JADX INFO: renamed from: h */
    public final String f8710h;

    /* JADX INFO: renamed from: i */
    public volatile InterfaceC2329u1 f8711i;

    public C2349v3(Context context, Bundle bundle) {
        C2239p1.m10517a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1983b3(this));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f8705c = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f8706d = new AppMeasurementSdk(this);
        this.f8707e = new ArrayList();
        try {
            if (C8997ab.m36111a(context, "google_app_id", C9381y6.m37080a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, C2349v3.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.f8710h = null;
                    this.f8709g = true;
                    Log.w(this.f8703a, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        this.f8710h = "fa";
        m10810i(new C2222o2(this, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f8703a, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new C2331u3(this));
        }
    }

    /* JADX INFO: renamed from: r */
    public static C2349v3 m10791r(Context context, Bundle bundle) {
        C8953m.m36047l(context);
        if (f8702j == null) {
            synchronized (C2349v3.class) {
                try {
                    if (f8702j == null) {
                        f8702j = new C2349v3(context, bundle);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f8702j;
    }

    /* JADX INFO: renamed from: A */
    public final void m10792A(Bundle bundle) {
        m10810i(new C2150k2(this, bundle));
    }

    /* JADX INFO: renamed from: B */
    public final void m10793B(String str, String str2, Bundle bundle) {
        m10810i(new C2168l2(this, str, str2, bundle));
    }

    /* JADX INFO: renamed from: C */
    public final List m10794C(String str, String str2) {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2186m2(this, str, str2, binderC2275r1));
        List list = (List) BinderC2275r1.m10587v2(binderC2275r1.m10591u2(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX INFO: renamed from: D */
    public final void m10795D(zzdf zzdfVar, String str, String str2) {
        m10810i(new C2204n2(this, zzdfVar, str, str2));
    }

    /* JADX INFO: renamed from: E */
    public final void m10796E(String str) {
        m10810i(new C2240p2(this, str));
    }

    /* JADX INFO: renamed from: F */
    public final void m10797F(String str) {
        m10810i(new C2258q2(this, str));
    }

    /* JADX INFO: renamed from: G */
    public final void m10798G(Runnable runnable) {
        m10810i(new C2294s2(this, runnable));
    }

    /* JADX INFO: renamed from: H */
    public final String m10799H() {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2312t2(this, binderC2275r1));
        return binderC2275r1.m10589s2(500L);
    }

    /* JADX INFO: renamed from: I */
    public final String m10800I() {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2330u2(this, binderC2275r1));
        return binderC2275r1.m10589s2(50L);
    }

    /* JADX INFO: renamed from: J */
    public final long m10801J() {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2348v2(this, binderC2275r1));
        Long lM10590t2 = binderC2275r1.m10590t2(500L);
        if (lM10590t2 != null) {
            return lM10590t2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f8704b.mo44175a()).nextLong();
        int i10 = this.f8708f + 1;
        this.f8708f = i10;
        return jNextLong + ((long) i10);
    }

    /* JADX INFO: renamed from: a */
    public final String m10802a() {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2366w2(this, binderC2275r1));
        return binderC2275r1.m10589s2(500L);
    }

    /* JADX INFO: renamed from: b */
    public final String m10803b() {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2402y2(this, binderC2275r1));
        return binderC2275r1.m10589s2(500L);
    }

    /* JADX INFO: renamed from: c */
    public final Map m10804c(String str, String str2, boolean z10) {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2420z2(this, str, str2, z10, binderC2275r1));
        Bundle bundleM10591u2 = binderC2275r1.m10591u2(5000L);
        if (bundleM10591u2 == null || bundleM10591u2.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleM10591u2.size());
        for (String str3 : bundleM10591u2.keySet()) {
            Object obj = bundleM10591u2.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: d */
    public final void m10805d(int i10, String str, Object obj, Object obj2, Object obj3) {
        m10810i(new C1964a3(this, false, 5, str, obj, null, null));
    }

    /* JADX INFO: renamed from: e */
    public final Bundle m10806e(Bundle bundle, boolean z10) {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2002c3(this, bundle, binderC2275r1));
        if (z10) {
            return binderC2275r1.m10591u2(5000L);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final int m10807f(String str) {
        BinderC2275r1 binderC2275r1 = new BinderC2275r1();
        m10810i(new C2021d3(this, str, binderC2275r1));
        Integer num = (Integer) BinderC2275r1.m10587v2(binderC2275r1.m10591u2(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: g */
    public final String m10808g() {
        return this.f8710h;
    }

    /* JADX INFO: renamed from: h */
    public final void m10809h(boolean z10) {
        m10810i(new C2040e3(this, z10));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String m10812k() {
        return this.f8703a;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m10813l() {
        return this.f8709g;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC2329u1 m10814m() {
        return this.f8711i;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10815n(InterfaceC2329u1 interfaceC2329u1) {
        this.f8711i = interfaceC2329u1;
    }

    /* JADX DEBUG: Method merged with bridge method: i(Lcom/google/android/gms/internal/measurement/j3;)V */
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void m10810i(AbstractRunnableC2133j3 abstractRunnableC2133j3) {
        this.f8705c.execute(abstractRunnableC2133j3);
    }

    /* JADX DEBUG: Method merged with bridge method: j(Ljava/lang/Exception;ZZ)V */
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final void m10811j(Exception exc, boolean z10, boolean z11) {
        C2349v3 c2349v3;
        Exception exc2;
        this.f8709g |= z10;
        if (z10) {
            Log.w(this.f8703a, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z11) {
            c2349v3 = this;
            exc2 = exc;
            c2349v3.m10805d(5, "Error with data collection. Data lost.", exc2, null, null);
        } else {
            c2349v3 = this;
            exc2 = exc;
        }
        Log.w(c2349v3.f8703a, "Error with data collection. Data lost.", exc2);
    }

    /* JADX INFO: renamed from: q */
    public final void m10818q(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        m10810i(new C2116i3(this, l10, str, str2, bundle, z10, z11));
    }

    /* JADX INFO: renamed from: s */
    public final AppMeasurementSdk m10819s() {
        return this.f8706d;
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC2329u1 m10820t(Context context, boolean z10) {
        try {
            return AbstractBinderC2311t1.asInterface(DynamiteModule.m9235e(context, z10 ? DynamiteModule.f7556e : DynamiteModule.f7554c, ModuleDescriptor.MODULE_ID).m9244d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.C1906a e10) {
            m10811j(e10, true, false);
            return null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m10821u(InterfaceC9319u8 interfaceC9319u8) {
        BinderC2151k3 binderC2151k3 = new BinderC2151k3(interfaceC9319u8);
        if (this.f8711i != null) {
            try {
                this.f8711i.setEventInterceptor(binderC2151k3);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                Log.w(this.f8703a, "Failed to set event interceptor on calling thread. Trying again on the dynamite thread.");
            }
        }
        m10810i(new C2059f3(this, binderC2151k3));
    }

    /* JADX INFO: renamed from: v */
    public final void m10822v(InterfaceC9335v8 interfaceC9335v8) {
        C8953m.m36047l(interfaceC9335v8);
        List list = this.f8707e;
        synchronized (list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                try {
                    if (interfaceC9335v8.equals(((Pair) list.get(i10)).first)) {
                        Log.w(this.f8703a, "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            BinderC2169l3 binderC2169l3 = new BinderC2169l3(interfaceC9335v8);
            list.add(new Pair(interfaceC9335v8, binderC2169l3));
            if (this.f8711i != null) {
                try {
                    this.f8711i.registerOnMeasurementEventListener(binderC2169l3);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f8703a, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m10810i(new C2078g3(this, binderC2169l3));
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10823w(InterfaceC9335v8 interfaceC9335v8) {
        Pair pair;
        C8953m.m36047l(interfaceC9335v8);
        List list = this.f8707e;
        synchronized (list) {
            int i10 = 0;
            while (true) {
                try {
                    if (i10 >= list.size()) {
                        pair = null;
                        break;
                    } else {
                        if (interfaceC9335v8.equals(((Pair) list.get(i10)).first)) {
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
                Log.w(this.f8703a, "OnEventListener had not been registered.");
                return;
            }
            list.remove(pair);
            BinderC2169l3 binderC2169l3 = (BinderC2169l3) pair.second;
            if (this.f8711i != null) {
                try {
                    this.f8711i.unregisterOnMeasurementEventListener(binderC2169l3);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f8703a, "Failed to unregister event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            m10810i(new C2097h3(this, binderC2169l3));
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m10824x(String str, String str2, Bundle bundle) {
        m10818q(str, str2, bundle, true, true, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m10825y(String str, String str2, Bundle bundle, long j10) {
        m10818q(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    /* JADX INFO: renamed from: z */
    public final void m10826z(String str, String str2, Object obj, boolean z10) {
        m10810i(new C2132j2(this, str, str2, obj, z10));
    }
}
