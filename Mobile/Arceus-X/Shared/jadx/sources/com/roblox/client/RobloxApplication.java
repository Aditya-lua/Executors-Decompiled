package com.roblox.client;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.os.StrictMode;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.core.os.EnvironmentCompat;
import androidx.p616lifecycle.C0959h0;
import androidx.work.C1115a;
import com.appsflyer.sdk_base.referrer.Payload;
import com.roblox.client.startup.C3272a;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.activitylifecyclecallbacks.JNIActivityLifecycleCallbacks;
import com.roblox.universalapp.applifecyclenativeadapter.JNIAppLifecycleNativeAdapter;
import com.roblox.universalapp.linking.JNIBaseUrlProtocol;
import com.roblox.universalapp.linking.JNIWebLoginProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Iterator;
import java.util.Locale;
import jm.C7209a;
import p013ah.C0262c;
import p015ak.C0311l2;
import p015ak.C0330r0;
import p015ak.C0333s0;
import p015ak.C0347x;
import p151gk.C6124q;
import p151gk.C6130w;
import p199ik.C6815a;
import p222jj.C7188m;
import p239k6.C7458d0;
import p239k6.InterfaceC7479s;
import p308nh.C9476b;
import p359pi.C10265c;
import p359pi.C10275m;
import p383qi.C10583b;
import p517wh.C12453p;
import p517wh.EnumC12462t0;
import p520wk.C12483e;
import p533x2.InterfaceC12631a;
import p536x5.AbstractC12719p0;
import sg.C11295a1;
import sg.C11349r;
import sg.C11352s;
import sh.C11384i;
import th.C11657f;
import th.C11659h;
import vg.C12179i;

/* JADX INFO: loaded from: classes2.dex */
public class RobloxApplication extends Application implements C7458d0.a, C1115a.c {

    /* JADX INFO: renamed from: c */
    public static Context f11612c;

    /* JADX INFO: renamed from: d */
    public static Locale f11613d;

    /* JADX INFO: renamed from: a */
    public final long f11614a = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: b */
    public long f11615b;

    /* JADX INFO: renamed from: com.roblox.client.RobloxApplication$a */
    public static /* synthetic */ class C3149a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f11616a;

        static {
            int[] iArr = new int[EnumC12462t0.values().length];
            f11616a = iArr;
            try {
                iArr[EnumC12462t0.APP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11616a[EnumC12462t0.EXPERIENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public RobloxApplication() {
        C0347x c0347xM1349m = C0347x.m1349m();
        c0347xM1349m.m1370x();
        c0347xM1349m.m1350A();
        c0347xM1349m.m1361o();
    }

    /* JADX INFO: renamed from: f */
    public static Context m14834f() {
        return f11612c;
    }

    /* JADX INFO: renamed from: g */
    public static void m14835g(String str, EnumC12462t0 enumC12462t0, int i10) {
        String str2;
        int i11 = C3149a.f11616a[enumC12462t0.ordinal()];
        String str3 = EnvironmentCompat.MEDIA_UNKNOWN;
        if (i11 != 1) {
            str2 = i11 != 2 ? EnvironmentCompat.MEDIA_UNKNOWN : "experience";
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
        C6124q.m27066k(str, "Mode: " + str2 + ", TrimLevel: " + str3);
    }

    @Override // p239k6.C7458d0.a
    @NonNull
    /* JADX INFO: renamed from: a */
    public InterfaceC7479s mo14836a(@NonNull Context context) {
        return C6815a.f26770a.m29185a(context);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        this.f11615b = SystemClock.elapsedRealtime();
        super.attachBaseContext(context);
        if (C0333s0.m1331c(context) && !C0333s0.m1330b(context)) {
            C0333s0.m1332d(context);
        }
        C11384i.m42698a(this);
    }

    @Override // androidx.work.C1115a.c
    @NonNull
    /* JADX INFO: renamed from: b */
    public C1115a mo6310b() {
        return new C1115a.a().m6309w(4).m6308v(new InterfaceC12631a() { // from class: sg.v0
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C6124q.m27061f("rbx.application", "WorkManager failed to initialize", (Throwable) obj);
            }
        }).m6287a();
    }

    /* JADX INFO: renamed from: d */
    public final void m14837d() {
        if (C11659h.m43403a().mo43747w3()) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            Iterator<String> it = C11384i.m42700c(this).iterator();
            int i10 = 0;
            while (it.hasNext()) {
                LoggingProtocol.m15994g(it.next() + "_installed");
                i10++;
                if (i10 >= 10) {
                    break;
                }
            }
            LoggingProtocol.m15995h("ondemand_module_check", SystemClock.elapsedRealtime() - jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m14838e() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
    }

    @Override // android.app.Application, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C10583b.m40569f().m40583q(configuration.getLocales().get(0));
    }

    @Override // android.app.Application
    public void onCreate() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        f11612c = getApplicationContext();
        if (C9476b.m37333a()) {
            m14838e();
        }
        C11657f.f41211a.m43399p(C11295a1.m42422U(this));
        if (C11659h.m43403a().mo43700p5()) {
            C7188m.m30054g();
        }
        C12179i.m45083a(f11612c);
        C0347x c0347xM1349m = C0347x.m1349m();
        c0347xM1349m.m1354E();
        c0347xM1349m.m1351B();
        C0262c.m1210c(f11612c);
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        C0311l2.m1316c(f11612c);
        C11352s.m42523b(f11612c);
        C11349r.m42520c();
        C0262c.m1215h(f11612c);
        registerActivityLifecycleCallbacks(new JNIActivityLifecycleCallbacks());
        if (C11659h.m43403a().mo43552V2()) {
            registerActivityLifecycleCallbacks(PlatformSystemDialogHandler.INSTANCE);
        }
        if (C11659h.m43403a().mo43575Y4()) {
            C0959h0.m4908m().mo4656a().mo4935a(C10275m.f36898a);
        } else {
            C0959h0.m4908m().mo4656a().mo4935a(C10265c.f36879a);
        }
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46753o(this);
            C12483e.m46755q(C11295a1.m42450g());
            C6124q.m27063h("rbx.application", "NativeCookieStorage context injected, migrationSourceUrl=" + C11295a1.m42450g());
        }
        if (C11659h.m43403a().mo43597b4()) {
            LoggingProtocol.m15998k("work_manager_initialization_deferred");
        } else {
            AbstractC12719p0.m47393i(this, mo6310b());
        }
        if (C11659h.m43403a().mo43490M1()) {
            if (C11659h.m43403a().mo43685n4()) {
                C0330r0.m1326a(this);
            }
            C3272a.m15692I("main");
            JNIAAssetManagerSetup.m14817a(f11612c);
            LocalStorageManager.m14818a(f11612c);
            if (C11659h.m43403a().mo43767z2()) {
                LoggingProtocol.m15999l("application_attachbasecontext", Long.valueOf(this.f11615b));
            }
            LoggingProtocol.m15999l("application_constructor", Long.valueOf(this.f11614a));
            LoggingProtocol.m15999l("application_oncreate", Long.valueOf(jElapsedRealtime));
            if (!C6130w.m27099a(this).equals("foreground")) {
                C6124q.m27063h("rbx.application", "Background process detected");
                C7209a.m30130i();
            }
            C0959h0.m4908m().mo4656a().mo4935a(new JNIAppLifecycleNativeAdapter());
            C6124q.m27063h("rbx.application", "GameActivity = ON. Return after loading native libs!");
            return;
        }
        C3272a.m15714v(f11612c);
        boolean zEquals = C6130w.m27099a(this).equals("foreground");
        NativeGLJavaInterface.setDeviceStaticParams(C12453p.m46680e());
        if (C11659h.m43403a().mo43685n4()) {
            C0330r0.m1326a(this);
        }
        C3272a.m15692I("main");
        JNIAAssetManagerSetup.m14817a(f11612c);
        LocalStorageManager.m14818a(f11612c);
        f11613d = Locale.getDefault();
        if (C11659h.m43403a().mo43767z2()) {
            LoggingProtocol.m15999l("application_attachbasecontext", Long.valueOf(this.f11615b));
        }
        LoggingProtocol.m15999l("application_constructor", Long.valueOf(this.f11614a));
        LoggingProtocol.m15999l("flag_prefetch_begin", Long.valueOf(jElapsedRealtime2));
        LoggingProtocol.m15999l("application_oncreate", Long.valueOf(jElapsedRealtime));
        if (!zEquals) {
            C6124q.m27063h("rbx.application", "Background process detected");
            C7209a.m30130i();
        }
        JNIBaseUrlProtocol.init(getApplicationContext());
        JNIWebLoginProtocol.init(getApplicationContext());
        C0959h0.m4908m().mo4656a().mo4935a(new JNIAppLifecycleNativeAdapter());
        m14837d();
    }
}
