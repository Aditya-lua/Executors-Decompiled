package com.roblox.client;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.StrictMode;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.h0;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.activitylifecyclecallbacks.JNIActivityLifecycleCallbacks;
import com.roblox.universalapp.applifecyclenativeadapter.JNIAppLifecycleNativeAdapter;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
import ek.w;
import hj.m;
import java.util.Iterator;
import java.util.Locale;
import k6.d0;
import k6.s;
import qh.i;
import rg.a1;
import rg.r;
import rh.f;
import rh.h;
import uh.p;
import uh.u0;
import uk.e;
import x5.p0;
import yj.l2;
import yj.r0;
import yj.s0;
import yj.x;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxApplication extends Application implements d0.a, androidx.work.a.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f8980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Locale f8981d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8982a = SystemClock.elapsedRealtime();
    public long b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8983a;

        static {
            int[] iArr = new int[u0.values().length];
            f8983a = iArr;
            try {
                iArr[u0.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8983a[u0.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RobloxApplication() {
        x xVarM = x.m();
        xVarM.x();
        xVarM.A();
        xVarM.o();
    }

    public static Context f() {
        return f8980c;
    }

    public static void g(String str, u0 u0Var, int i10) {
        String str2;
        int i11 = a.f8983a[u0Var.ordinal()];
        String str3 = "unknown";
        if (i11 != 1) {
            str2 = i11 != 2 ? "unknown" : "experience";
        } else {
            str2 = Payload.TYPE_APP;
        }
        if (i10 == 5) {
            str3 = "TRIM_MEMORY_RUNNING_MODERATE";
        } else if (i10 == 10) {
            str3 = "TRIM_MEMORY_RUNNING_LOW";
        } else if (i10 == 15) {
            str3 = "TRIM_MEMORY_RUNNING_CRITICAL";
        } else if (i10 == 20) {
            str3 = "TRIM_MEMORY_UI_HIDDEN";
        } else if (i10 == 40) {
            str3 = "TRIM_MEMORY_BACKGROUND";
        } else if (i10 == 60) {
            str3 = "TRIM_MEMORY_MODERATE";
        } else if (i10 == 80) {
            str3 = "TRIM_MEMORY_COMPLETE";
        }
        q.k(str, "Mode: " + str2 + ", TrimLevel: " + str3);
    }

    @Override // k6.d0.a
    @NonNull
    public s a(@NonNull Context context) {
        return gk.a.f18561a.a(context);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        this.b = SystemClock.elapsedRealtime();
        super.attachBaseContext(context);
        if (s0.c(context) && !s0.b(context)) {
            s0.d(context);
        }
        i.a(this);
    }

    @Override // androidx.work.a.c
    @NonNull
    public androidx.work.a b() {
        return new androidx.work.a.C0059a().w(4).v(new x2.a() { // from class: rg.v0
            @Override // x2.a
            public final void accept(Object obj) {
                ek.q.f("rbx.application", "WorkManager failed to initialize", (Throwable) obj);
            }
        }).a();
    }

    public final void d() {
        if (h.a().C3()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<String> it = i.c(this).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                LoggingProtocol.g(it.next() + "_installed");
                i10++;
                if (i10 >= 10) {
                    break;
                }
            }
            LoggingProtocol.h("ondemand_module_check", SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
    }

    public final void e() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        oi.b.f().q(configuration.getLocales().get(0));
    }

    @Override // android.app.Application
    public void onCreate() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f8980c = getApplicationContext();
        if (mh.b.a()) {
            e();
        }
        f.f30722a.p(a1.U(this));
        m.g();
        ug.i.a(f8980c);
        x xVarM = x.m();
        xVarM.E();
        xVarM.B();
        zg.c.c(f8980c);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        l2.c(f8980c);
        rg.s.b(f8980c);
        r.c();
        zg.c.h(f8980c);
        registerActivityLifecycleCallbacks(new JNIActivityLifecycleCallbacks());
        if (h.a().a3()) {
            registerActivityLifecycleCallbacks(PlatformSystemDialogHandler.INSTANCE);
        }
        if (h.a().f5()) {
            h0.m().a().a(ni.m.f27234a);
        } else {
            h0.m().a().a(ni.c.f27217a);
        }
        if (h.a().W1()) {
            e.x(this);
            e.z(a1.g());
            q.h("rbx.application", "NativeCookieStorage context injected, migrationSourceUrl=" + a1.g());
        }
        if (h.a().h4()) {
            LoggingProtocol.k("work_manager_initialization_deferred");
        } else {
            p0.i(this, b());
        }
        if (h.a().Q1()) {
            if (h.a().t4()) {
                r0.a(this);
            }
            com.roblox.client.startup.a.I("main");
            JNIAAssetManagerSetup.a(f8980c);
            LocalStorageManager.a(f8980c);
            if (h.a().F2()) {
                LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
            }
            LoggingProtocol.l("application_constructor", Long.valueOf(this.f8982a));
            LoggingProtocol.l("application_oncreate", Long.valueOf(jElapsedRealtime));
            if (!w.a(this).equals("foreground")) {
                q.h("rbx.application", "Background process detected");
                hm.a.i();
            }
            h0.m().a().a(new JNIAppLifecycleNativeAdapter());
            q.h("rbx.application", "GameActivity = ON. Return after loading native libs!");
            return;
        }
        com.roblox.client.startup.a.v(f8980c);
        boolean zEquals = w.a(this).equals("foreground");
        NativeGLJavaInterface.setDeviceStaticParams(p.e());
        if (h.a().t4()) {
            r0.a(this);
        }
        com.roblox.client.startup.a.I("main");
        JNIAAssetManagerSetup.a(f8980c);
        LocalStorageManager.a(f8980c);
        f8981d = Locale.getDefault();
        if (h.a().F2()) {
            LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
        }
        LoggingProtocol.l("application_constructor", Long.valueOf(this.f8982a));
        LoggingProtocol.l("flag_prefetch_begin", Long.valueOf(jElapsedRealtime2));
        LoggingProtocol.l("application_oncreate", Long.valueOf(jElapsedRealtime));
        if (!zEquals) {
            q.h("rbx.application", "Background process detected");
            hm.a.i();
        }
        JNIBaseUrlProtocol.init(getApplicationContext());
        JNIWebLoginProtocol.init(getApplicationContext());
        h0.m().a().a(new JNIAppLifecycleNativeAdapter());
        d();
    }
}
