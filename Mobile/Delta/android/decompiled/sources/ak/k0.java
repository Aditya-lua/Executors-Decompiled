package ak;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.NonNull;
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
import nb.qe;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class k0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k0 f589k;
    public volatile boolean b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<n0> f593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vi.g f595g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f590a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f591c = g.INIT_STATE_NONE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StartedForEnum f592d = StartedForEnum.SYSTEM;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<e0> f596h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnAppBridgeNotificationListener f597i = new c();

    public class a implements wh.f.h {
        public a() {
        }

        @Override // wh.f.h
        public void a(int i10) {
            File parentFile;
            LoggingProtocol.g("load_setting_end");
            vg.e.h().i(k0.this.f594f);
            if (i10 != 0) {
                k0.this.D();
                return;
            }
            gk.p.h("InitHelper", "getAllAppSettings: ... Settings loaded.");
            k0.this.f591c = g.INIT_STATE_SETTINGS_LOADED_OK;
            k0.w(k0.this.f594f);
            if (rl.j.j().f()) {
                rl.j.j().i(k0.this.f594f);
            }
            km.f.v().m();
            k0.this.y();
            if (th.h.a().k2() && Environment.getExternalStorageState().equals("mounted")) {
                String absolutePath = k0.this.f594f.getExternalFilesDir(null).getAbsolutePath();
                if (th.h.a().X()) {
                    bk.d.d(absolutePath);
                } else {
                    NativeSettingsInterface.nativeSetExternalDirectory(absolutePath);
                }
            }
            if (th.h.a().g4()) {
                File externalFilesDir = k0.this.f594f.getExternalFilesDir(null);
                String absolutePath2 = (externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? "" : parentFile.getAbsolutePath();
                if (th.h.a().X()) {
                    bk.d.b(k0.this.f594f.getDataDir().getAbsolutePath(), absolutePath2);
                } else {
                    NativeSettingsInterface.nativeSetBaseDataDirectories(k0.this.f594f.getDataDir().getAbsolutePath(), absolutePath2);
                }
            }
            if (th.h.a().X()) {
                bk.d.e(gk.y.e(k0.this.f594f).f());
            } else {
                NativeSettingsInterface.nativeSetPreferencesFile(gk.y.e(k0.this.f594f).f());
            }
            k0.this.E();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f599a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f599a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            gk.p.h("InitHelper", "handleAppBridgeNotification: type = " + this.f599a + ", data = " + this.b + ".");
            com.roblox.client.d.e eVar = new com.roblox.client.d.e();
            try {
                JSONObject jSONObject = new JSONObject(this.b);
                if (jSONObject.getInt("result") != 0) {
                    k0.this.f595g.q("Android-AppLogin-BrowserTracker-JsonFailed");
                    k0.this.F("AppBridgeNotification: JSON Result failure");
                    return;
                }
                long j10 = jSONObject.getLong("btid");
                sg.a1.f30733u = j10;
                if (th.h.a().O5()) {
                    di.h.n(k0.this.f594f, j10);
                }
                int i10 = jSONObject.getInt("upgradeStatus");
                if (i10 == 1) {
                    eVar.d();
                } else if (i10 != 2) {
                    eVar.f();
                } else {
                    eVar.e();
                }
                eVar.b = jSONObject.optString("upgradeSource", "");
                eVar.f9013c = jSONObject.optString("MD5Sum", "");
                k0.this.f595g.q("Android-AppLogin-BrowserTracker-Success");
                if (k0.this.b) {
                    ConnectivityV2Monitor.setup(k0.this.f594f.getApplicationContext());
                }
                k0.T();
                if (eVar.b() || eVar.c()) {
                    com.roblox.client.d.e().g(eVar);
                }
                gk.p.h("InitHelper", "doAfterFetchBrowserTrackerId:...");
                sg.t0.b(k0.this.f594f, "appLaunch");
                if (th.h.a().u5()) {
                    return;
                }
                k0.this.p();
            } catch (JSONException unused) {
                k0.this.f595g.q("Android-AppLogin-BrowserTracker-JsonFailed");
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

    public class d implements vi.h.f {
        public d() {
        }

        @Override // vi.h.f
        public void a() {
            gk.p.h("InitHelper", "onDidLoginEventFromLua: ... onPostLoginCompleted.");
            k0.this.t().k0();
            k0.this.o();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f603a;

        static {
            int[] iArr = new int[StartedForEnum.values().length];
            f603a = iArr;
            try {
                iArr[StartedForEnum.AFTER_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f603a[StartedForEnum.AFTER_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f603a[StartedForEnum.AFTER_LOGIN_FOR_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f603a[StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f603a[StartedForEnum.REMINDER_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f603a[StartedForEnum.PROTOCOL_LAUNCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f603a[StartedForEnum.SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set<String> f604a = qe.a(new Object[]{"RBXThemeOverride", "RBXHideThemeSetting"});
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
        @Override // ak.n0
        public void G() {
        }

        @Override // ak.n0
        public void J() {
        }

        @Override // ak.n0
        public void O() {
        }

        @Override // ak.n0
        public void i0() {
        }

        @Override // ak.n0
        public void k0() {
        }

        public h() {
        }
    }

    public k0(Context context, @NonNull vi.g gVar) {
        gk.p.h("InitHelper", "InitHelper created.");
        this.f594f = context.getApplicationContext();
        this.f595g = gVar;
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
        return f588j;
    }

    public static void G(final Activity activity, String str) {
        s(activity).H(str);
        if (th.h.a().J3()) {
            vi.b.f().h();
            activity.getWindow().clearFlags(8192);
        }
        cm.a.a().b(new cm.a.b() { // from class: ak.i0
            @Override // cm.a.b
            public final void a(JSONObject jSONObject) {
                sg.q.b(jSONObject, activity);
            }
        });
        if (th.h.a().p3()) {
            if (th.h.a().X()) {
                bk.b.a();
            } else {
                NativeGLInterface.screenTimeStartByGuac();
            }
        }
        if (th.h.a().h5()) {
            com.roblox.client.ossearch.b.g(activity);
            com.roblox.client.ossearch.b.e(activity);
        }
    }

    public static boolean T() {
        String strC = new wj.a(RobloxApplication.f()).c();
        gk.p.b("InitHelper", "updateCookiesFromEngine: Got Cookies from external file = " + strC);
        if (strC != null) {
            wk.j.c().i(sg.a1.O(), ".ROBLOSECURITY=" + strC + "; Domain=" + sg.a1.O(), wk.e.b.ENGINE_PUSH);
            return true;
        }
        for (String str : (th.h.a().X() ? bk.d.a(sg.a1.g()) : NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(sg.a1.g())).split(";")) {
            String strTrim = str.trim();
            String[] strArrSplit = strTrim.split("\t");
            if (strArrSplit.length != 7 && strArrSplit.length != 6) {
                gk.p.e("InitHelper", "updateCookiesFromEngine: Invalid cookie format: [" + strTrim + "]");
            } else if (strArrSplit[0].endsWith(sg.a1.O())) {
                String str2 = strArrSplit[5];
                if (f.f604a.contains(str2)) {
                    gk.p.b("InitHelper", "updateCookiesFromEngine: Skipping cookie update for: " + str2);
                } else {
                    wk.j.c().i(sg.a1.O(), str2 + "=" + (strArrSplit.length == 7 ? strArrSplit[6] : "") + "; Domain=" + sg.a1.O(), wk.e.b.ENGINE_PUSH);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void b(String str) {
    }

    public static k0 s(Context context) {
        if (f589k == null) {
            synchronized (k0.class) {
                try {
                    if (f589k == null) {
                        f589k = new k0(context, vi.g.b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f589k;
    }

    public static void w(Context context) {
        yl.c.i().e();
        CookieProtocol.a();
        zl.e.m().l(context);
        im.f.z().w(context);
        ql.c.h().g(context);
        km.f.v().r(context);
        hm.b.h().l(context);
        xl.g.x();
        pm.a.c();
        dm.b.i().g();
        if (gk.s.e()) {
            if (th.h.a().x3()) {
                rl.c.d().c(context);
            } else {
                rl.c.d();
            }
            bm.r.y();
        }
    }

    public static void x(boolean z10) {
        f588j = z10;
    }

    public static void z(Context context, int i10, boolean z10) {
        boolean zExists = new File("/system/fonts/NotoSansCJK-Regular.ttc").exists();
        List<String> listA = g0.o0.a(new Object[]{RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND, RobloxTelemetryEventConfig.POINTS_BACKEND});
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("FastFollowCJKAvailable", Boolean.toString(false)));
        arrayList.add(new Pair("SystemCJKAvailable", Boolean.toString(zExists)));
        arrayList.add(new Pair("EitherCJKAvailable", Boolean.toString(zExists)));
        if (th.h.a().L1()) {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(z10)));
        } else {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(A(context))));
        }
        if (th.h.a().k3()) {
            arrayList.add(new Pair("AvailableStorage", Long.toString(gk.j.b().getAvailableBytes())));
            arrayList.add(new Pair("TotalStorage", Long.toString(gk.j.b().getTotalBytes())));
            arrayList.add(new Pair("ExternalStorage", Long.toString(gk.j.a().getTotalBytes())));
            arrayList.add(new Pair("AvailableExternalStorage", Long.toString(gk.j.b().getAvailableBytes())));
        }
        LoggingProtocol.j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(listA).setThrottlingHundredthPercentage(i10).setEventName("JavaFastFollowEvent").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(g0.o0.a(new Object[]{RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO})).setCustomStringFields(arrayList).build()).build());
    }

    public void C(Context context, boolean z10, xi.c.b bVar) {
        gk.p.h("InitHelper", "logout: callServer = " + z10 + ", initState = " + this.f591c);
        this.f591c = g.INIT_STATE_NO_USER_ID;
        vi.h.e().c(context, z10, bVar);
    }

    public final void D() {
        gk.p.h("InitHelper", "AppSettings FAILURE");
        this.f591c = g.INIT_STATE_FAILED_APP_SETTINGS;
        LoggingProtocol.g("init_failure");
        t().J();
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f596h).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void E() {
        gk.p.h("InitHelper", "AppSettings loaded.");
        com.roblox.client.startup.a.B(this.f594f);
        this.b = th.h.a().d3();
        if (th.h.a().X()) {
            bk.a.b(this.b);
        } else {
            NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.b);
        }
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f596h).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (th.h.a().O5()) {
            di.h.q(this.f594f);
        }
        if (th.h.a().L4()) {
            nh.c.c(this.f594f);
        }
        xg.a.e().k(th.h.a().n(), th.h.a().d4(), th.h.a().f3(), th.h.a().m0(), TimeUnit.MINUTES.toMillis(th.h.a().Q5()), th.h.a().C());
        t().G();
    }

    public final void F(String str) {
        if (this.f590a.compareAndSet(true, false)) {
            gk.p.h("InitHelper", "Init FAILURE: (" + str + ")");
            LoggingProtocol.g("init_failure");
            t().J();
        }
    }

    public void H(String str) {
        gk.p.h("InitHelper", "onDidLoginEventFromLua: initState = " + this.f591c + ", data = " + str);
        this.f591c = g.INIT_STATE_DONE_OK;
        T();
        vi.h.e().j(this.f594f, str, new d());
    }

    public void I(String str) {
        gk.p.h("InitHelper", "onDidSignUpEventFromLua: initState = " + this.f591c + ", data = " + str);
        M(StartedForEnum.AFTER_SIGN_UP);
    }

    public void J() {
        gk.p.h("InitHelper", "onLoginRequestFromLua: initState = " + this.f591c);
        this.f591c = g.INIT_STATE_UNAUTHORIZED;
        t().O();
    }

    public synchronized void K(e0 e0Var) {
        this.f596h.add(e0Var);
    }

    public final void L() {
        DeviceParams deviceParamsC = wh.p.c(this.f594f);
        if (th.h.a().X()) {
            bk.d.c(deviceParamsC);
        } else {
            NativeSettingsInterface.nativeSetDeviceInfo(deviceParamsC);
        }
    }

    public void M(StartedForEnum startedForEnum) {
        this.f592d = startedForEnum;
    }

    public void N(n0 n0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: setView = [");
        sb2.append(n0Var == null ? "null" : n0Var.getClass().getSimpleName());
        sb2.append("]");
        gk.p.h("InitHelper", sb2.toString());
        this.f593e = new WeakReference<>(n0Var);
    }

    public void O() {
        gk.p.h("InitHelper", "start: initState = " + this.f591c + ", StartedFor: " + this.f592d);
        g gVar = this.f591c;
        g gVar2 = g.INIT_STATE_NONE;
        if (gVar == gVar2 && !th.h.a().q2()) {
            mk.c.p().s(new Consumer() { // from class: ak.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    k0.b((String) obj);
                }
            });
        }
        if (this.f591c == g.INIT_STATE_DONE_OK) {
            this.f591c = gVar2;
        }
        g gVar3 = this.f591c;
        if (gVar3 == gVar2 || gVar3 == g.INIT_STATE_FAILED_APP_SETTINGS) {
            this.f591c = g.INIT_STATE_IN_PROGRESS;
            q();
            return;
        }
        g gVar4 = g.INIT_STATE_SETTINGS_LOADED_OK;
        if (gVar3 == gVar4) {
            E();
        } else if (gVar3 != g.INIT_STATE_NO_USER_ID && gVar3 != g.INIT_STATE_UNAUTHORIZED) {
            gk.p.h("InitHelper", "The initialization must be in progress. Do nothing.");
        } else {
            this.f591c = gVar4;
            E();
        }
    }

    public final void P() {
        LoggingProtocol.g("start_app_bridge_begin");
        gk.p.h("InitHelper", "startAppBridge:...");
        L();
        if (th.h.a().q()) {
            LoggingProtocol.g("after_set_device_info_in_engine");
        }
        if (th.h.a().L1()) {
            boolean zA = A(this.f594f);
            if (th.h.a().X()) {
                bk.a.c(zA);
            } else {
                NativeAppBridgeInterface.setIsFirstInstall(zA);
            }
            z(this.f594f, 100, zA);
        } else {
            z(this.f594f, 100, false);
        }
        if (th.h.a().q()) {
            LoggingProtocol.g("after_initialize_fonts_asset_pack");
        }
        if (th.h.a().X()) {
            bk.c.a(this.f597i);
        } else {
            NativeGLJavaInterface.setAppBridgeNotificationListener(this.f597i);
        }
        if (th.h.a().q()) {
            LoggingProtocol.g("after_set_app_bridge_notification_listener");
        }
        String strG = sg.a1.g();
        String strZ0 = sg.a1.Z0();
        boolean zR0 = sg.a1.r0();
        if (th.h.a().X()) {
            bk.a.a(strG, strZ0, zR0, sg.a1.f30732t, sg.a1.E());
        } else {
            NativeAppBridgeInterface.a(strG, strZ0, zR0, sg.a1.f30732t, sg.a1.E());
        }
        if (th.h.a().i3()) {
            wh.f.j().E();
        }
        LoggingProtocol.g("start_app_bridge_end");
    }

    public void Q() {
        gk.p.h("InitHelper", "startV2: initState = " + this.f591c + ", StartedFor: " + this.f592d);
        if (this.f590a.compareAndSet(false, true)) {
            if (th.h.a().z() && !com.roblox.client.startup.a.m()) {
                throw new RuntimeException("Flags are not loaded when starting AppBridge");
            }
            P();
        }
        g gVar = this.f591c;
        g gVar2 = g.INIT_STATE_DONE_OK;
        if (gVar == gVar2 || gVar == g.INIT_STATE_UNAUTHORIZED || gVar == g.INIT_STATE_NO_USER_ID) {
            gk.p.h("InitHelper", "The initialization is done or unauthorized. Go to Main screen.");
            t().k0();
        } else if (gVar == g.INIT_STATE_SETTINGS_LOADED_OK) {
            gk.p.h("rbx.locale", " mContext: " + this.f594f);
            qi.b.f().m(this.f594f);
            t().i0();
            gk.p.h("InitHelper", "SessionCheck... New startup flow. Go directly to the Main screen.");
            this.f591c = gVar2;
            t().k0();
        } else {
            gk.p.h("InitHelper", "The initialization must be in progress. Do nothing.");
        }
        zl.e.m().l(this.f594f);
        im.f.z().w(this.f594f);
        ql.c.h().g(this.f594f);
        km.f.v().r(this.f594f);
        if (th.h.a().x3() && gk.s.e()) {
            rl.c.d().c(this.f594f);
        }
    }

    public synchronized void R(e0 e0Var) {
        this.f596h.remove(e0Var);
    }

    public void S(n0 n0Var) {
        n0 n0Var2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: unsetView = [");
        sb2.append(n0Var == null ? "null" : n0Var.getClass().getSimpleName());
        sb2.append("]");
        gk.p.h("InitHelper", sb2.toString());
        WeakReference<n0> weakReference = this.f593e;
        if (weakReference == null || (n0Var2 = weakReference.get()) == null || n0Var2 != n0Var) {
            return;
        }
        this.f593e = null;
    }

    public final void o() {
        gk.p.h("InitHelper", "After post login. StartedFor: " + this.f592d);
        if (th.h.a().u5() && !fk.c.c().n()) {
            gk.c.g().f(this.f594f, new gk.a.InterfaceC0327a() { // from class: ak.j0
                @Override // gk.a.InterfaceC0327a
                public final void a(String str) {
                    sg.a1.X0();
                }
            });
        }
        switch (e.f603a[this.f592d.ordinal()]) {
            case 1:
                r().g(this.f594f);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                r().d(this.f594f);
                break;
        }
    }

    public final void p() {
        gk.c.g().e(this.f594f);
    }

    public final void q() {
        gk.p.h("InitHelper", "getAllAppSettings:...");
        LoggingProtocol.g("load_setting_begin");
        wh.f.j().o(this.f594f, new a());
    }

    public final vi.d r() {
        return sg.y.h().d();
    }

    public final n0 t() {
        WeakReference<n0> weakReference = this.f593e;
        if (weakReference == null || weakReference.get() == null) {
            this.f593e = new WeakReference<>(new h());
        }
        return this.f593e.get();
    }

    public final void u(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new b(str, str2));
    }

    public boolean v() {
        return this.f591c != g.INIT_STATE_NONE;
    }

    public void y() {
        r().a(this.f594f);
    }
}
