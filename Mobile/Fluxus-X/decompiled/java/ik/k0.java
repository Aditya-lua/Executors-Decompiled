package ik;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.engine.jni.NativeAppBridgeInterface;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.OnAppBridgeNotificationListener;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEvent;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventConfig;
import com.roblox.engine.jni.autovalue.RobloxTelemetryEventData;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.protocols.calling.CallingHandler;
import com.roblox.protocols.connectivityv2.ConnectivityV2Monitor;
import com.roblox.universalapp.cookie.CookieProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import ob.ze;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f19530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k0 f19531k;
    public volatile boolean b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<n0> f19535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f19536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj.g f19537g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f19532a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f19533c = g.INIT_STATE_NONE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StartedForEnum f19534d = StartedForEnum.SYSTEM;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<e0> f19538h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnAppBridgeNotificationListener f19539i = new c();

    public class a implements ei.f.h {
        public a() {
        }

        @Override // ei.f.h
        public void a(int i10) {
            File parentFile;
            LoggingProtocol.g("load_setting_end");
            eh.f.h().i(k0.this.f19536f);
            if (i10 != 0) {
                k0.this.D();
                return;
            }
            ok.q.h("InitHelper", "getAllAppSettings: ... Settings loaded.");
            k0.this.f19533c = g.INIT_STATE_SETTINGS_LOADED_OK;
            k0.w(k0.this.f19536f);
            if (fm.j.j().f()) {
                fm.j.j().i(k0.this.f19536f);
            }
            ym.g.G().w();
            if (!bi.h.a().C5()) {
                k0.this.y();
            }
            if (bi.h.a().w2() && Environment.getExternalStorageState().equals("mounted")) {
                String absolutePath = k0.this.f19536f.getExternalFilesDir(null).getAbsolutePath();
                if (bi.h.a().d0()) {
                    jk.d.d(absolutePath);
                } else {
                    NativeSettingsInterface.nativeSetExternalDirectory(absolutePath);
                }
            }
            if (bi.h.a().u4()) {
                File externalFilesDir = k0.this.f19536f.getExternalFilesDir(null);
                String absolutePath2 = (externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? BuildConfig.FLAVOR : parentFile.getAbsolutePath();
                if (bi.h.a().d0()) {
                    jk.d.b(k0.this.f19536f.getDataDir().getAbsolutePath(), absolutePath2);
                } else {
                    NativeSettingsInterface.nativeSetBaseDataDirectories(k0.this.f19536f.getDataDir().getAbsolutePath(), absolutePath2);
                }
            }
            if (bi.h.a().d0()) {
                jk.d.e(ok.z.e(k0.this.f19536f).f());
            } else {
                NativeSettingsInterface.nativeSetPreferencesFile(ok.z.e(k0.this.f19536f).f());
            }
            k0.this.E(bi.h.a().C5());
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19541a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f19541a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ok.q.h("InitHelper", "handleAppBridgeNotification: type = " + this.f19541a + ", data = " + this.b + ".");
            com.roblox.client.d.e eVar = new com.roblox.client.d.e();
            try {
                JSONObject jSONObject = new JSONObject(this.b);
                if (jSONObject.getInt("result") != 0) {
                    k0.this.f19537g.q("Android-AppLogin-BrowserTracker-JsonFailed");
                    k0.this.F("AppBridgeNotification: JSON Result failure");
                    return;
                }
                long j10 = jSONObject.getLong("btid");
                bh.a1.f4037u = j10;
                if (bi.h.a().W5()) {
                    li.i.n(k0.this.f19536f, j10);
                }
                int i10 = jSONObject.getInt("upgradeStatus");
                if (i10 == 1) {
                    eVar.d();
                } else if (i10 != 2) {
                    eVar.f();
                } else {
                    eVar.e();
                }
                eVar.b = jSONObject.optString("upgradeSource", BuildConfig.FLAVOR);
                eVar.f8904c = jSONObject.optString("MD5Sum", BuildConfig.FLAVOR);
                k0.this.f19537g.q("Android-AppLogin-BrowserTracker-Success");
                if (k0.this.b) {
                    ConnectivityV2Monitor.setup(k0.this.f19536f.getApplicationContext());
                }
                if (CallingHandler.isCallingEnabled()) {
                    CallingHandler.setupAsync(k0.this.f19536f);
                }
                k0.T();
                if (eVar.b() || eVar.c()) {
                    com.roblox.client.d.e().g(eVar);
                }
                ok.q.h("InitHelper", "doAfterFetchBrowserTrackerId:...");
                bh.t0.b(k0.this.f19536f, "appLaunch");
                if (bi.h.a().D5()) {
                    return;
                }
                k0.this.p();
            } catch (JSONException unused) {
                k0.this.f19537g.q("Android-AppLogin-BrowserTracker-JsonFailed");
                k0.this.F("AppBridgeNotification: JSON Result failure");
            }
        }
    }

    public class c extends OnAppBridgeNotificationListener {
        public c() {
        }

        @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
        public void a(String str, String str2) {
            k0.this.u(str, str2);
        }
    }

    public class d implements dj.h.f {
        public d() {
        }

        @Override // dj.h.f
        public void a() {
            ok.q.h("InitHelper", "onDidLoginEventFromLua: ... onPostLoginCompleted.");
            k0.this.t().k0();
            k0.this.o();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19545a;

        static {
            int[] iArr = new int[StartedForEnum.values().length];
            f19545a = iArr;
            try {
                iArr[StartedForEnum.AFTER_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19545a[StartedForEnum.AFTER_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19545a[StartedForEnum.AFTER_LOGIN_FOR_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19545a[StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19545a[StartedForEnum.REMINDER_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19545a[StartedForEnum.PROTOCOL_LAUNCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19545a[StartedForEnum.SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set<String> f19546a = ze.a(new Object[]{"RBXThemeOverride", "RBXHideThemeSetting"});
    }

    public enum g {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SETTINGS_LOADED_OK,
        INIT_STATE_DONE_OK,
        INIT_STATE_NO_USER_ID,
        INIT_STATE_UNAUTHORIZED,
        INIT_STATE_FAILED_APP_SETTINGS
    }

    public static class h implements n0 {
        @Override // ik.n0
        public void F() {
        }

        @Override // ik.n0
        public void I() {
        }

        @Override // ik.n0
        public void N() {
        }

        @Override // ik.n0
        public void i0() {
        }

        @Override // ik.n0
        public void k0() {
        }

        public h() {
        }
    }

    public k0(Context context, @NonNull dj.g gVar) {
        ok.q.h("InitHelper", "InitHelper created.");
        this.f19536f = context.getApplicationContext();
        this.f19537g = gVar;
    }

    public static boolean A(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("FirstRunPrefs", 0);
        boolean z10 = sharedPreferences.getBoolean("isFreshInstall", true);
        if (z10) {
            sharedPreferences.edit().putBoolean("isFreshInstall", false).apply();
        }
        return z10;
    }

    public static boolean B() {
        return f19530j;
    }

    public static void G(final Activity activity, String str) {
        s(activity).H(str);
        if (bi.h.a().Y3()) {
            dj.b.f().h();
            activity.getWindow().clearFlags(8192);
        }
        qm.a.a().b(new qm.a.b() { // from class: ik.i0
            @Override // qm.a.b
            public final void a(JSONObject jSONObject) {
                bh.q.b(jSONObject, activity);
            }
        });
        if (bi.h.a().C3()) {
            if (bi.h.a().d0()) {
                jk.b.a();
            } else {
                NativeGLInterface.screenTimeStartByGuac();
            }
        }
        com.roblox.client.ossearch.b.g(activity);
        com.roblox.client.ossearch.b.e(activity);
    }

    public static boolean T() {
        String strC = new ek.a(RobloxApplication.f()).c();
        ok.q.b("InitHelper", "updateCookiesFromEngine: Got Cookies from external file = " + strC);
        if (strC != null) {
            dl.j.e().k(bh.a1.O(), ".ROBLOSECURITY=" + strC + "; Domain=" + bh.a1.O(), dl.e.c.ENGINE_PUSH);
            return true;
        }
        for (String str : (bi.h.a().d0() ? jk.d.a(bh.a1.g()) : NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(bh.a1.g())).split(";")) {
            String strTrim = str.trim();
            String[] strArrSplit = strTrim.split("\t");
            if (strArrSplit.length != 7 && strArrSplit.length != 6) {
                ok.q.e("InitHelper", "updateCookiesFromEngine: Invalid cookie format: [" + strTrim + "]");
            } else if (strArrSplit[0].endsWith(bh.a1.O())) {
                String str2 = strArrSplit[5];
                if (f.f19546a.contains(str2)) {
                    ok.q.b("InitHelper", "updateCookiesFromEngine: Skipping cookie update for: " + str2);
                } else {
                    dl.j.e().k(bh.a1.O(), str2 + "=" + (strArrSplit.length == 7 ? strArrSplit[6] : BuildConfig.FLAVOR) + "; Domain=" + bh.a1.O(), dl.e.c.ENGINE_PUSH);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void b(String str) {
    }

    public static k0 s(Context context) {
        if (f19531k == null) {
            synchronized (k0.class) {
                try {
                    if (f19531k == null) {
                        f19531k = new k0(context, dj.g.b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f19531k;
    }

    public static void w(Context context) {
        mm.c.i().e();
        CookieProtocol.a();
        nm.e.m().l(context);
        wm.f.z().w(context);
        em.c.h().g(context);
        ym.g.G().B(context);
        vm.b.h().l(context);
        lm.g.x();
        cn.a.c();
        rm.b.i().g();
        if (ok.t.e()) {
            if (bi.h.a().O3()) {
                fm.c.d().c(context);
            } else {
                fm.c.d();
            }
            pm.r.y();
        }
    }

    public static void x(boolean z10) {
        f19530j = z10;
    }

    public static void z(Context context, int i10, boolean z10) {
        boolean zExists = new File("/system/fonts/NotoSansCJK-Regular.ttc").exists();
        List<String> listA = g0.o0.a(new Object[]{RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND, RobloxTelemetryEventConfig.POINTS_BACKEND});
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("FastFollowCJKAvailable", Boolean.toString(false)));
        arrayList.add(new Pair("SystemCJKAvailable", Boolean.toString(zExists)));
        arrayList.add(new Pair("EitherCJKAvailable", Boolean.toString(zExists)));
        if (bi.h.a().V1()) {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(z10)));
        } else {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(A(context))));
        }
        if (bi.h.a().x3()) {
            arrayList.add(new Pair("AvailableStorage", Long.toString(ok.j.b().getAvailableBytes())));
            arrayList.add(new Pair("TotalStorage", Long.toString(ok.j.b().getTotalBytes())));
            arrayList.add(new Pair("ExternalStorage", Long.toString(ok.j.a().getTotalBytes())));
            arrayList.add(new Pair("AvailableExternalStorage", Long.toString(ok.j.b().getAvailableBytes())));
        }
        LoggingProtocol.j(RobloxTelemetryEvent.builder().e(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).c(RobloxTelemetryEventConfig.builder().c(listA).e(i10).d("JavaFastFollowEvent").b()).d(RobloxTelemetryEventData.builder().d(g0.o0.a(new Object[]{RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO})).c(arrayList).b()).b());
    }

    public void C(Context context, boolean z10, fj.c.b bVar) {
        ok.q.h("InitHelper", "logout: callServer = " + z10 + ", initState = " + this.f19533c);
        this.f19533c = g.INIT_STATE_NO_USER_ID;
        dj.h.e().c(context, z10, bVar);
    }

    public final void D() {
        ok.q.h("InitHelper", "AppSettings FAILURE");
        this.f19533c = g.INIT_STATE_FAILED_APP_SETTINGS;
        LoggingProtocol.g("init_failure");
        t().I();
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f19538h).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void E(boolean z10) {
        ok.q.h("InitHelper", "AppSettings loaded.");
        com.roblox.client.startup.a.B(this.f19536f);
        if (z10) {
            y();
        }
        this.b = bi.h.a().q3();
        if (bi.h.a().d0()) {
            jk.a.b(this.b);
        } else {
            NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.b);
        }
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f19538h).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bi.h.a().W5()) {
            li.i.q(this.f19536f);
        }
        if (bi.h.a().Y4()) {
            wh.c.c(this.f19536f);
        }
        gh.a.e().k(bi.h.a().o(), bi.h.a().r4(), bi.h.a().s3(), bi.h.a().t0(), TimeUnit.MINUTES.toMillis(bi.h.a().X5()), bi.h.a().E());
        t().F();
    }

    public final void F(String str) {
        if (this.f19532a.compareAndSet(true, false)) {
            ok.q.h("InitHelper", "Init FAILURE: (" + str + ")");
            LoggingProtocol.g("init_failure");
            t().I();
        }
    }

    public void H(String str) {
        ok.q.h("InitHelper", "onDidLoginEventFromLua: initState = " + this.f19533c + ", data = " + str);
        this.f19533c = g.INIT_STATE_DONE_OK;
        T();
        dj.h.e().j(this.f19536f, str, new d());
    }

    public void I(String str) {
        ok.q.h("InitHelper", "onDidSignUpEventFromLua: initState = " + this.f19533c + ", data = " + str);
        M(StartedForEnum.AFTER_SIGN_UP);
    }

    public void J() {
        ok.q.h("InitHelper", "onLoginRequestFromLua: initState = " + this.f19533c);
        this.f19533c = g.INIT_STATE_UNAUTHORIZED;
        t().N();
    }

    public synchronized void K(e0 e0Var) {
        this.f19538h.add(e0Var);
    }

    public final void L() {
        DeviceParams deviceParamsC = ei.p.c(this.f19536f);
        if (bi.h.a().d0()) {
            jk.d.c(deviceParamsC);
        } else {
            NativeSettingsInterface.nativeSetDeviceInfo(deviceParamsC);
        }
    }

    public void M(StartedForEnum startedForEnum) {
        this.f19534d = startedForEnum;
    }

    public void N(n0 n0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: setView = [");
        sb2.append(n0Var == null ? "null" : n0Var.getClass().getSimpleName());
        sb2.append("]");
        ok.q.h("InitHelper", sb2.toString());
        this.f19535e = new WeakReference<>(n0Var);
    }

    public void O() {
        ok.q.h("InitHelper", "start: initState = " + this.f19533c + ", StartedFor: " + this.f19534d);
        g gVar = this.f19533c;
        g gVar2 = g.INIT_STATE_NONE;
        if (gVar == gVar2 && !bi.h.a().D2()) {
            uk.c.p().s(new Consumer() { // from class: ik.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    k0.b((String) obj);
                }
            });
        }
        if (this.f19533c == g.INIT_STATE_DONE_OK) {
            this.f19533c = gVar2;
        }
        g gVar3 = this.f19533c;
        if (gVar3 == gVar2 || gVar3 == g.INIT_STATE_FAILED_APP_SETTINGS) {
            this.f19533c = g.INIT_STATE_IN_PROGRESS;
            q();
            return;
        }
        g gVar4 = g.INIT_STATE_SETTINGS_LOADED_OK;
        if (gVar3 == gVar4) {
            E(false);
        } else if (gVar3 != g.INIT_STATE_NO_USER_ID && gVar3 != g.INIT_STATE_UNAUTHORIZED) {
            ok.q.h("InitHelper", "The initialization must be in progress. Do nothing.");
        } else {
            this.f19533c = gVar4;
            E(false);
        }
    }

    public final void P() {
        LoggingProtocol.g("start_app_bridge_begin");
        ok.q.h("InitHelper", "startAppBridge:...");
        L();
        if (bi.h.a().r()) {
            LoggingProtocol.g("after_set_device_info_in_engine");
        }
        if (bi.h.a().V1()) {
            boolean zA = A(this.f19536f);
            if (bi.h.a().d0()) {
                jk.a.c(zA);
            } else {
                NativeAppBridgeInterface.setIsFirstInstall(zA);
            }
            z(this.f19536f, 100, zA);
        } else {
            z(this.f19536f, 100, false);
        }
        if (bi.h.a().r()) {
            LoggingProtocol.g("after_initialize_fonts_asset_pack");
        }
        if (bi.h.a().d0()) {
            jk.c.a(this.f19539i);
        } else {
            NativeGLJavaInterface.setAppBridgeNotificationListener(this.f19539i);
        }
        if (bi.h.a().r()) {
            LoggingProtocol.g("after_set_app_bridge_notification_listener");
        }
        String strG = bh.a1.g();
        String strA1 = bh.a1.a1();
        boolean zR0 = bh.a1.r0();
        if (bi.h.a().d0()) {
            jk.a.a(strG, strA1, zR0, bh.a1.f4036t, bh.a1.E());
        } else {
            NativeAppBridgeInterface.a(strG, strA1, zR0, bh.a1.f4036t, bh.a1.E());
        }
        if (bi.h.a().v3()) {
            ei.f.j().E();
        }
        LoggingProtocol.g("start_app_bridge_end");
    }

    public void Q() {
        ok.q.h("InitHelper", "startV2: initState = " + this.f19533c + ", StartedFor: " + this.f19534d);
        if (this.f19532a.compareAndSet(false, true)) {
            if (bi.h.a().B() && !com.roblox.client.startup.a.m()) {
                throw new RuntimeException("Flags are not loaded when starting AppBridge");
            }
            P();
        }
        g gVar = this.f19533c;
        g gVar2 = g.INIT_STATE_DONE_OK;
        if (gVar == gVar2 || gVar == g.INIT_STATE_UNAUTHORIZED || gVar == g.INIT_STATE_NO_USER_ID) {
            ok.q.h("InitHelper", "The initialization is done or unauthorized. Go to Main screen.");
            t().k0();
        } else if (gVar == g.INIT_STATE_SETTINGS_LOADED_OK) {
            ok.q.h("rbx.locale", " mContext: " + this.f19536f);
            yi.b.f().m(this.f19536f);
            t().i0();
            ok.q.h("InitHelper", "SessionCheck... New startup flow. Go directly to the Main screen.");
            this.f19533c = gVar2;
            t().k0();
        } else {
            ok.q.h("InitHelper", "The initialization must be in progress. Do nothing.");
        }
        nm.e.m().l(this.f19536f);
        wm.f.z().w(this.f19536f);
        em.c.h().g(this.f19536f);
        ym.g.G().B(this.f19536f);
        if (bi.h.a().O3() && ok.t.e()) {
            fm.c.d().c(this.f19536f);
        }
    }

    public synchronized void R(e0 e0Var) {
        this.f19538h.remove(e0Var);
    }

    public void S(n0 n0Var) {
        n0 n0Var2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: unsetView = [");
        sb2.append(n0Var == null ? "null" : n0Var.getClass().getSimpleName());
        sb2.append("]");
        ok.q.h("InitHelper", sb2.toString());
        WeakReference<n0> weakReference = this.f19535e;
        if (weakReference == null || (n0Var2 = weakReference.get()) == null || n0Var2 != n0Var) {
            return;
        }
        this.f19535e = null;
    }

    public final void o() {
        ok.q.h("InitHelper", "After post login. StartedFor: " + this.f19534d);
        if (bi.h.a().D5() && !nk.c.c().n()) {
            ok.c.g().f(this.f19536f, new ok.a.InterfaceC0545a() { // from class: ik.j0
                @Override // ok.a.InterfaceC0545a
                public final void a(String str) {
                    bh.a1.Y0();
                }
            });
        }
        switch (e.f19545a[this.f19534d.ordinal()]) {
            case 1:
                r().g(this.f19536f);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                r().d(this.f19536f);
                break;
        }
    }

    public final void p() {
        ok.c.g().e(this.f19536f);
    }

    public final void q() {
        ok.q.h("InitHelper", "getAllAppSettings:...");
        LoggingProtocol.g("load_setting_begin");
        ei.f.j().o(this.f19536f, new a());
    }

    public final dj.d r() {
        return bh.y.h().d();
    }

    public final n0 t() {
        WeakReference<n0> weakReference = this.f19535e;
        if (weakReference == null || weakReference.get() == null) {
            this.f19535e = new WeakReference<>(new h());
        }
        return this.f19535e.get();
    }

    public final void u(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new b(str, str2));
    }

    public boolean v() {
        return this.f19533c != g.INIT_STATE_NONE;
    }

    public void y() {
        r().a(this.f19536f);
    }
}
