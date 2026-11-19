package com.roblox.client;

import ai.j;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.StrictMode;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.p000lifecycle.h0;
import bh.a1;
import bh.r;
import bi.f;
import bi.h;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.activitylifecyclecallbacks.JNIActivityLifecycleCallbacks;
import com.roblox.universalapp.applifecyclenativeadapter.JNIAppLifecycleNativeAdapter;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import dl.e;
import eh.a0;
import ei.p;
import ei.u0;
import ik.r0;
import ik.r2;
import ik.w0;
import ik.x;
import java.util.Iterator;
import java.util.Locale;
import l6.d0;
import l6.s;
import ok.q;
import ok.w;
import rj.m;
import y5.p0;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxApplication extends Application implements d0.a, androidx.work.a.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Context f8797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Locale f8798d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8799a = SystemClock.elapsedRealtime();
    public long b;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8800a;

        static {
            int[] iArr = new int[u0.values().length];
            f8800a = iArr;
            try {
                iArr[u0.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8800a[u0.EXPERIENCE.ordinal()] = 2;
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
        return f8797c;
    }

    public static void g(String str, u0 u0Var, int i10) {
        String str2;
        int i11 = a.f8800a[u0Var.ordinal()];
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

    @Override // l6.d0.a
    @NonNull
    public s a(@NonNull Context context) {
        return qk.a.f30032a.a(context);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        this.b = SystemClock.elapsedRealtime();
        super.attachBaseContext(context);
        if (w0.i(context) && !w0.h(context)) {
            w0.A(context);
        }
        j.a(this);
    }

    @Override // androidx.work.a.c
    @NonNull
    public androidx.work.a b() {
        return new androidx.work.a.C0067a().w(4).v(new x2.a() { // from class: bh.v0
            @Override // x2.a
            public final void accept(Object obj) {
                ok.q.f("rbx.application", "WorkManager failed to initialize", (Throwable) obj);
            }
        }).a();
    }

    public final void d() {
        if (h.a().G3()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<String> it = j.c(this).iterator();
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
        yi.b.f().q(configuration.getLocales().get(0));
    }

    @Override // android.app.Application
    public void onCreate() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f8797c = getApplicationContext();
        if (wh.b.a()) {
            e();
        }
        f.f4423a.p(a1.U(this));
        m.g();
        eh.j.a(f8797c);
        a0.w(f8797c);
        x xVarM = x.m();
        xVarM.E();
        xVarM.B();
        jh.c.c(f8797c);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        r2.c(f8797c);
        bh.s.b(f8797c);
        r.c();
        jh.c.h(f8797c);
        registerActivityLifecycleCallbacks(new JNIActivityLifecycleCallbacks());
        if (h.a().c3()) {
            registerActivityLifecycleCallbacks(PlatformSystemDialogHandler.INSTANCE);
        }
        if (h.a().f5()) {
            h0.m().a().a(xi.m.f36703a);
        } else {
            h0.m().a().a(xi.c.f36686a);
        }
        if (h.a().W1()) {
            e.x(this);
            e.z(a1.g());
            q.h("rbx.application", "NativeCookieStorage context injected, migrationSourceUrl=" + a1.g());
        }
        if (h.a().k4()) {
            LoggingProtocol.k("work_manager_initialization_deferred");
        } else {
            p0.i(this, b());
        }
        if (h.a().Q1()) {
            if (h.a().v4()) {
                r0.a(this);
            }
            com.roblox.client.startup.a.I("main");
            JNIAAssetManagerSetup.a(f8797c);
            LocalStorageManager.a(f8797c);
            if (h.a().H2()) {
                LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
            }
            LoggingProtocol.l("application_constructor", Long.valueOf(this.f8799a));
            LoggingProtocol.l("application_oncreate", Long.valueOf(jElapsedRealtime));
            w0.k();
            if (!w.a(this).equals("foreground")) {
                q.h("rbx.application", "Background process detected");
                xm.a.i();
            }
            h0.m().a().a(new JNIAppLifecycleNativeAdapter());
            q.h("rbx.application", "GameActivity = ON. Return after loading native libs!");
            return;
        }
        com.roblox.client.startup.a.v(f8797c);
        boolean zEquals = w.a(this).equals("foreground");
        NativeGLJavaInterface.setDeviceStaticParams(p.e());
        if (h.a().v4()) {
            r0.a(this);
        }
        com.roblox.client.startup.a.I("main");
        JNIAAssetManagerSetup.a(f8797c);
        LocalStorageManager.a(f8797c);
        f8798d = Locale.getDefault();
        if (h.a().H2()) {
            LoggingProtocol.l("application_attachbasecontext", Long.valueOf(this.b));
        }
        LoggingProtocol.l("application_constructor", Long.valueOf(this.f8799a));
        LoggingProtocol.l("flag_prefetch_begin", Long.valueOf(jElapsedRealtime2));
        LoggingProtocol.l("application_oncreate", Long.valueOf(jElapsedRealtime));
        w0.k();
        if (!zEquals) {
            q.h("rbx.application", "Background process detected");
            xm.a.i();
        }
        JNIBaseUrlProtocol.init(getApplicationContext());
        JNIWebLoginProtocol.init(getApplicationContext());
        h0.m().a().a(new JNIAppLifecycleNativeAdapter());
        d();
    }
}
