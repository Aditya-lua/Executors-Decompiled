package com.roblox.client;

import ak.l2;
import ak.r0;
import ak.s0;
import ak.x;
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
import gk.p;
import gk.v;
import java.util.Iterator;
import java.util.Locale;
import jj.m;
import k6.d0;
import k6.s;
import sg.a1;
import sg.r;
import sh.i;
import th.f;
import th.h;
import wh.t0;
import wk.e;
import x5.p0;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxApplication extends Application implements d0.a, androidx.work.a.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f8912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Locale f8913d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8914a = SystemClock.elapsedRealtime();
    public long b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8915a;

        static {
            int[] iArr = new int[t0.values().length];
            f8915a = iArr;
            try {
                iArr[t0.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8915a[t0.EXPERIENCE.ordinal()] = 2;
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
        return f8912c;
    }

    public static void g(String str, t0 t0Var, int i10) {
        String str2;
        int i11 = a.f8915a[t0Var.ordinal()];
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
        p.k(str, "Mode: " + str2 + ", TrimLevel: " + str3);
    }

    @Override // k6.d0.a
    @NonNull
    public s a(@NonNull Context context) {
        return ik.a.f20504a.a(context);
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
        return new androidx.work.a.C0063a().w(4).v(new x2.a() { // from class: sg.v0
            @Override // x2.a
            public final void accept(Object obj) {
                gk.p.f("rbx.application", "WorkManager failed to initialize", (Throwable) obj);
            }
        }).a();
    }

    public final void d() {
        if (h.a().q3()) {
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
        qi.b.f().q(configuration.getLocales().get(0));
    }

    @Override // android.app.Application
    public void onCreate() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f8912c = getApplicationContext();
        if (nh.b.a()) {
            e();
        }
        f.f31815a.p(a1.U(this));
        if (h.a().j5()) {
            m.g();
        }
        vg.i.a(f8912c);
        x xVarM = x.m();
        xVarM.E();
        xVarM.B();
        ah.c.c(f8912c);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        l2.c(f8912c);
        sg.s.b(f8912c);
        r.c();
        ah.c.h(f8912c);
        registerActivityLifecycleCallbacks(new JNIActivityLifecycleCallbacks());
        if (h.a().P2()) {
            registerActivityLifecycleCallbacks(PlatformSystemDialogHandler.INSTANCE);
        }
        if (h.a().S4()) {
            h0.m().a().a(pi.m.f28640a);
        } else {
            h0.m().a().a(pi.c.f28623a);
        }
        if (h.a().M1()) {
            e.o(this);
            e.q(a1.g());
            p.h("rbx.application", "NativeCookieStorage context injected, migrationSourceUrl=" + a1.g());
        }
        if (h.a().W3()) {
            LoggingProtocol.k("work_manager_initialization_deferred");
        } else {
            p0.i(this, b());
        }
        if (h.a().G1()) {
            if (h.a().i4()) {
                r0.a(this);
            }
            com.roblox.client.startup.a.I("main");
            JNIAAssetManagerSetup.a(f8912c);
            LocalStorageManager.a(f8912c);
            if (h.a().t2()) {
                LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
            }
            LoggingProtocol.l("application_constructor", Long.valueOf(this.f8914a));
            LoggingProtocol.l("application_oncreate", Long.valueOf(jElapsedRealtime));
            if (!v.a(this).equals("foreground")) {
                p.h("rbx.application", "Background process detected");
                jm.a.i();
            }
            h0.m().a().a(new JNIAppLifecycleNativeAdapter());
            p.h("rbx.application", "GameActivity = ON. Return after loading native libs!");
            return;
        }
        com.roblox.client.startup.a.v(f8912c);
        boolean zEquals = v.a(this).equals("foreground");
        NativeGLJavaInterface.setDeviceStaticParams(wh.p.e());
        if (h.a().i4()) {
            r0.a(this);
        }
        com.roblox.client.startup.a.I("main");
        JNIAAssetManagerSetup.a(f8912c);
        LocalStorageManager.a(f8912c);
        f8913d = Locale.getDefault();
        if (h.a().t2()) {
            LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
        }
        LoggingProtocol.l("application_constructor", Long.valueOf(this.f8914a));
        LoggingProtocol.l("flag_prefetch_begin", Long.valueOf(jElapsedRealtime2));
        LoggingProtocol.l("application_oncreate", Long.valueOf(jElapsedRealtime));
        if (!zEquals) {
            p.h("rbx.application", "Background process detected");
            jm.a.i();
        }
        JNIBaseUrlProtocol.init(getApplicationContext());
        JNIWebLoginProtocol.init(getApplicationContext());
        h0.m().a().a(new JNIAppLifecycleNativeAdapter());
        d();
    }
}
