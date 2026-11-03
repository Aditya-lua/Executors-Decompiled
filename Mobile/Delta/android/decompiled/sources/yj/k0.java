package yj;

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
    public static boolean f36732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static k0 f36733k;
    public volatile boolean b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WeakReference<n0> f36737e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f36738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ti.g f36739g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f36734a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f36735c = g.INIT_STATE_NONE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StartedForEnum f36736d = StartedForEnum.SYSTEM;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set<e0> f36740h = new HashSet();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public OnAppBridgeNotificationListener f36741i = new c();

    public class a implements uh.f.h {
        public a() {
        }

        @Override // uh.f.h
        public void a(int i10) {
            File parentFile;
            LoggingProtocol.g("load_setting_end");
            ug.e.h().i(k0.this.f36738f);
            if (i10 != 0) {
                k0.this.D();
                return;
            }
            ek.q.h("InitHelper", "getAllAppSettings: ... Settings loaded.");
            k0.this.f36735c = g.INIT_STATE_SETTINGS_LOADED_OK;
            k0.w(k0.this.f36738f);
            if (pl.j.j().f()) {
                pl.j.j().i(k0.this.f36738f);
            }
            im.f.F().v();
            k0.this.y();
            if (rh.h.a().v2() && Environment.getExternalStorageState().equals("mounted")) {
                String absolutePath = k0.this.f36738f.getExternalFilesDir(null).getAbsolutePath();
                if (rh.h.a().b0()) {
                    zj.d.d(absolutePath);
                } else {
                    NativeSettingsInterface.nativeSetExternalDirectory(absolutePath);
                }
            }
            if (rh.h.a().r4()) {
                File externalFilesDir = k0.this.f36738f.getExternalFilesDir(null);
                String absolutePath2 = (externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? "" : parentFile.getAbsolutePath();
                if (rh.h.a().b0()) {
                    zj.d.b(k0.this.f36738f.getDataDir().getAbsolutePath(), absolutePath2);
                } else {
                    NativeSettingsInterface.nativeSetBaseDataDirectories(k0.this.f36738f.getDataDir().getAbsolutePath(), absolutePath2);
                }
            }
            if (rh.h.a().b0()) {
                zj.d.e(ek.z.e(k0.this.f36738f).f());
            } else {
                NativeSettingsInterface.nativeSetPreferencesFile(ek.z.e(k0.this.f36738f).f());
            }
            k0.this.E();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f36743a;
        public final /* synthetic */ String b;

        public b(String str, String str2) {
            this.f36743a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            ek.q.h("InitHelper", "handleAppBridgeNotification: type = " + this.f36743a + ", data = " + this.b + ".");
            com.roblox.client.d.e eVar = new com.roblox.client.d.e();
            try {
                JSONObject jSONObject = new JSONObject(this.b);
                if (jSONObject.getInt("result") != 0) {
                    k0.this.f36739g.q("Android-AppLogin-BrowserTracker-JsonFailed");
                    k0.this.F("AppBridgeNotification: JSON Result failure");
                    return;
                }
                long j10 = jSONObject.getLong("btid");
                rg.a1.f30334u = j10;
                if (rh.h.a().Y5()) {
                    bi.i.n(k0.this.f36738f, j10);
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
                eVar.f9087c = jSONObject.optString("MD5Sum", "");
                k0.this.f36739g.q("Android-AppLogin-BrowserTracker-Success");
                if (k0.this.b) {
                    ConnectivityV2Monitor.setup(k0.this.f36738f.getApplicationContext());
                }
                k0.T();
                if (eVar.b() || eVar.c()) {
                    com.roblox.client.d.e().g(eVar);
                }
                ek.q.h("InitHelper", "doAfterFetchBrowserTrackerId:...");
                rg.t0.b(k0.this.f36738f, "appLaunch");
                if (rh.h.a().E5()) {
                    return;
                }
                k0.this.p();
            } catch (JSONException unused) {
                k0.this.f36739g.q("Android-AppLogin-BrowserTracker-JsonFailed");
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

    public class d implements ti.h.f {
        public d() {
        }

        @Override // ti.h.f
        public void a() {
            ek.q.h("InitHelper", "onDidLoginEventFromLua: ... onPostLoginCompleted.");
            k0.this.t().k0();
            k0.this.o();
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36747a;

        static {
            int[] iArr = new int[StartedForEnum.values().length];
            f36747a = iArr;
            try {
                iArr[StartedForEnum.AFTER_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36747a[StartedForEnum.AFTER_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36747a[StartedForEnum.AFTER_LOGIN_FOR_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36747a[StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36747a[StartedForEnum.REMINDER_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36747a[StartedForEnum.PROTOCOL_LAUNCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36747a[StartedForEnum.SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Set<String> f36748a = qe.a(new Object[]{"RBXThemeOverride", "RBXHideThemeSetting"});
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
        @Override // yj.n0
        public void F() {
        }

        @Override // yj.n0
        public void I() {
        }

        @Override // yj.n0
        public void N() {
        }

        @Override // yj.n0
        public void i0() {
        }

        @Override // yj.n0
        public void k0() {
        }

        public h() {
        }
    }

    public k0(Context context, @NonNull ti.g gVar) {
        ek.q.h("InitHelper", "InitHelper created.");
        this.f36738f = context.getApplicationContext();
        this.f36739g = gVar;
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
        return f36732j;
    }

    public static void G(final Activity activity, String str) {
        s(activity).H(str);
        if (rh.h.a().U3()) {
            ti.b.f().h();
            activity.getWindow().clearFlags(8192);
        }
        am.a.a().b(new am.a.b() { // from class: yj.i0
            @Override // am.a.b
            public final void a(JSONObject jSONObject) {
                rg.q.b(jSONObject, activity);
            }
        });
        if (rh.h.a().z3()) {
            if (rh.h.a().b0()) {
                zj.b.a();
            } else {
                NativeGLInterface.screenTimeStartByGuac();
            }
        }
        if (rh.h.a().t5()) {
            com.roblox.client.ossearch.b.g(activity);
            com.roblox.client.ossearch.b.e(activity);
        }
    }

    public static boolean T() {
        String strC = new uj.a(RobloxApplication.f()).c();
        ek.q.b("InitHelper", "updateCookiesFromEngine: Got Cookies from external file = " + strC);
        if (strC != null) {
            uk.j.c().i(rg.a1.O(), ".ROBLOSECURITY=" + strC + "; Domain=" + rg.a1.O(), uk.e.c.ENGINE_PUSH);
            return true;
        }
        for (String str : (rh.h.a().b0() ? zj.d.a(rg.a1.g()) : NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(rg.a1.g())).split(";")) {
            String strTrim = str.trim();
            String[] strArrSplit = strTrim.split("\t");
            if (strArrSplit.length != 7 && strArrSplit.length != 6) {
                ek.q.e("InitHelper", "updateCookiesFromEngine: Invalid cookie format: [" + strTrim + "]");
            } else if (strArrSplit[0].endsWith(rg.a1.O())) {
                String str2 = strArrSplit[5];
                if (f.f36748a.contains(str2)) {
                    ek.q.b("InitHelper", "updateCookiesFromEngine: Skipping cookie update for: " + str2);
                } else {
                    uk.j.c().i(rg.a1.O(), str2 + "=" + (strArrSplit.length == 7 ? strArrSplit[6] : "") + "; Domain=" + rg.a1.O(), uk.e.c.ENGINE_PUSH);
                }
            }
        }
        return false;
    }

    public static /* synthetic */ void b(String str) {
    }

    public static k0 s(Context context) {
        if (f36733k == null) {
            synchronized (k0.class) {
                try {
                    if (f36733k == null) {
                        f36733k = new k0(context, ti.g.b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f36733k;
    }

    public static void w(Context context) {
        wl.c.i().e();
        CookieProtocol.a();
        xl.e.m().l(context);
        gm.f.z().w(context);
        ol.c.h().g(context);
        im.f.F().A(context);
        fm.b.h().l(context);
        vl.g.x();
        nm.a.c();
        bm.b.i().g();
        if (ek.t.e()) {
            if (rh.h.a().K3()) {
                pl.c.d().c(context);
            } else {
                pl.c.d();
            }
            zl.r.y();
        }
    }

    public static void x(boolean z10) {
        f36732j = z10;
    }

    public static void z(Context context, int i10, boolean z10) {
        boolean zExists = new File("/system/fonts/NotoSansCJK-Regular.ttc").exists();
        List<String> listA = g0.o0.a(new Object[]{RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND, RobloxTelemetryEventConfig.POINTS_BACKEND});
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("FastFollowCJKAvailable", Boolean.toString(false)));
        arrayList.add(new Pair("SystemCJKAvailable", Boolean.toString(zExists)));
        arrayList.add(new Pair("EitherCJKAvailable", Boolean.toString(zExists)));
        if (rh.h.a().V1()) {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(z10)));
        } else {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(A(context))));
        }
        if (rh.h.a().u3()) {
            arrayList.add(new Pair("AvailableStorage", Long.toString(ek.j.b().getAvailableBytes())));
            arrayList.add(new Pair("TotalStorage", Long.toString(ek.j.b().getTotalBytes())));
            arrayList.add(new Pair("ExternalStorage", Long.toString(ek.j.a().getTotalBytes())));
            arrayList.add(new Pair("AvailableExternalStorage", Long.toString(ek.j.b().getAvailableBytes())));
        }
        LoggingProtocol.j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(listA).setThrottlingHundredthPercentage(i10).setEventName("JavaFastFollowEvent").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(g0.o0.a(new Object[]{RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO})).setCustomStringFields(arrayList).build()).build());
    }

    public void C(Context context, boolean z10, vi.c.b bVar) {
        ek.q.h("InitHelper", "logout: callServer = " + z10 + ", initState = " + this.f36735c);
        this.f36735c = g.INIT_STATE_NO_USER_ID;
        ti.h.e().c(context, z10, bVar);
    }

    public final void D() {
        ek.q.h("InitHelper", "AppSettings FAILURE");
        this.f36735c = g.INIT_STATE_FAILED_APP_SETTINGS;
        LoggingProtocol.g("init_failure");
        t().I();
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f36740h).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void E() {
        ek.q.h("InitHelper", "AppSettings loaded.");
        com.roblox.client.startup.a.B(this.f36738f);
        this.b = rh.h.a().n3();
        if (rh.h.a().b0()) {
            zj.a.b(this.b);
        } else {
            NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.b);
        }
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f36740h).iterator();
                while (it.hasNext()) {
                    ((e0) it.next()).a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (rh.h.a().Y5()) {
            bi.i.q(this.f36738f);
        }
        if (rh.h.a().Y4()) {
            mh.c.c(this.f36738f);
        }
        wg.a.e().k(rh.h.a().o(), rh.h.a().o4(), rh.h.a().p3(), rh.h.a().r0(), TimeUnit.MINUTES.toMillis(rh.h.a().Z5()), rh.h.a().E());
        t().F();
    }

    public final void F(String str) {
        if (this.f36734a.compareAndSet(true, false)) {
            ek.q.h("InitHelper", "Init FAILURE: (" + str + ")");
            LoggingProtocol.g("init_failure");
            t().I();
        }
    }

    public void H(String str) {
        ek.q.h("InitHelper", "onDidLoginEventFromLua: initState = " + this.f36735c + ", data = " + str);
        this.f36735c = g.INIT_STATE_DONE_OK;
        T();
        ti.h.e().j(this.f36738f, str, new d());
    }

    public void I(String str) {
        ek.q.h("InitHelper", "onDidSignUpEventFromLua: initState = " + this.f36735c + ", data = " + str);
        M(StartedForEnum.AFTER_SIGN_UP);
    }

    public void J() {
        ek.q.h("InitHelper", "onLoginRequestFromLua: initState = " + this.f36735c);
        this.f36735c = g.INIT_STATE_UNAUTHORIZED;
        t().N();
    }

    public synchronized void K(e0 e0Var) {
        this.f36740h.add(e0Var);
    }

    public final void L() {
        DeviceParams deviceParamsC = uh.p.c(this.f36738f);
        if (rh.h.a().b0()) {
            zj.d.c(deviceParamsC);
        } else {
            NativeSettingsInterface.nativeSetDeviceInfo(deviceParamsC);
        }
    }

    public void M(StartedForEnum startedForEnum) {
        this.f36736d = startedForEnum;
    }

    public void N(n0 n0Var) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: setView = [");
        sb2.append(n0Var == null ? "null" : n0Var.getClass().getSimpleName());
        sb2.append("]");
        ek.q.h("InitHelper", sb2.toString());
        this.f36737e = new WeakReference<>(n0Var);
    }

    public void O() {
        ek.q.h("InitHelper", "start: initState = " + this.f36735c + ", StartedFor: " + this.f36736d);
        g gVar = this.f36735c;
        g gVar2 = g.INIT_STATE_NONE;
        if (gVar == gVar2 && !rh.h.a().B2()) {
            kk.c.p().s(new Consumer() { // from class: yj.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    k0.b((String) obj);
                }
            });
        }
        if (this.f36735c == g.INIT_STATE_DONE_OK) {
            this.f36735c = gVar2;
        }
        g gVar3 = this.f36735c;
        if (gVar3 == gVar2 || gVar3 == g.INIT_STATE_FAILED_APP_SETTINGS) {
            this.f36735c = g.INIT_STATE_IN_PROGRESS;
            q();
            return;
        }
        g gVar4 = g.INIT_STATE_SETTINGS_LOADED_OK;
        if (gVar3 == gVar4) {
            E();
        } else if (gVar3 != g.INIT_STATE_NO_USER_ID && gVar3 != g.INIT_STATE_UNAUTHORIZED) {
            ek.q.h("InitHelper", "The initialization must be in progress. Do nothing.");
        } else {
            this.f36735c = gVar4;
            E();
        }
    }

    public final void P() {
        LoggingProtocol.g("start_app_bridge_begin");
        ek.q.h("InitHelper", "startAppBridge:...");
        L();
        if (rh.h.a().r()) {
            LoggingProtocol.g("after_set_device_info_in_engine");
        }
        if (rh.h.a().V1()) {
            boolean zA = A(this.f36738f);
            if (rh.h.a().b0()) {
                zj.a.c(zA);
            } else {
                NativeAppBridgeInterface.setIsFirstInstall(zA);
            }
            z(this.f36738f, 100, zA);
        } else {
            z(this.f36738f, 100, false);
        }
        if (rh.h.a().r()) {
            LoggingProtocol.g("after_initialize_fonts_asset_pack");
        }
        if (rh.h.a().b0()) {
            zj.c.a(this.f36741i);
        } else {
            NativeGLJavaInterface.setAppBridgeNotificationListener(this.f36741i);
        }
        if (rh.h.a().r()) {
            LoggingProtocol.g("after_set_app_bridge_notification_listener");
        }
        String strG = rg.a1.g();
        String strA1 = rg.a1.a1();
        boolean zR0 = rg.a1.r0();
        if (rh.h.a().b0()) {
            zj.a.a(strG, strA1, zR0, rg.a1.f30333t, rg.a1.E());
        } else {
            NativeAppBridgeInterface.a(strG, strA1, zR0, rg.a1.f30333t, rg.a1.E());
        }
        if (rh.h.a().s3()) {
            uh.f.j().E();
        }
        LoggingProtocol.g("start_app_bridge_end");
    }

    public void Q() {
        ek.q.h("InitHelper", "startV2: initState = " + this.f36735c + ", StartedFor: " + this.f36736d);
        if (this.f36734a.compareAndSet(false, true)) {
            if (rh.h.a().B() && !com.roblox.client.startup.a.m()) {
                throw new RuntimeException("Flags are not loaded when starting AppBridge");
            }
            P();
        }
        g gVar = this.f36735c;
        g gVar2 = g.INIT_STATE_DONE_OK;
        if (gVar == gVar2 || gVar == g.INIT_STATE_UNAUTHORIZED || gVar == g.INIT_STATE_NO_USER_ID) {
            ek.q.h("InitHelper", "The initialization is done or unauthorized. Go to Main screen.");
            t().k0();
        } else if (gVar == g.INIT_STATE_SETTINGS_LOADED_OK) {
            ek.q.h("rbx.locale", " mContext: " + this.f36738f);
            oi.b.f().m(this.f36738f);
            t().i0();
            ek.q.h("InitHelper", "SessionCheck... New startup flow. Go directly to the Main screen.");
            this.f36735c = gVar2;
            t().k0();
        } else {
            ek.q.h("InitHelper", "The initialization must be in progress. Do nothing.");
        }
        xl.e.m().l(this.f36738f);
        gm.f.z().w(this.f36738f);
        ol.c.h().g(this.f36738f);
        im.f.F().A(this.f36738f);
        if (rh.h.a().K3() && ek.t.e()) {
            pl.c.d().c(this.f36738f);
        }
    }

    public synchronized void R(e0 e0Var) {
        this.f36740h.remove(e0Var);
    }

    public void S(n0 n0Var) {
        n0 n0Var2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: unsetView = [");
        sb2.append(n0Var == null ? "null" : n0Var.getClass().getSimpleName());
        sb2.append("]");
        ek.q.h("InitHelper", sb2.toString());
        WeakReference<n0> weakReference = this.f36737e;
        if (weakReference == null || (n0Var2 = weakReference.get()) == null || n0Var2 != n0Var) {
            return;
        }
        this.f36737e = null;
    }

    public final void o() {
        ek.q.h("InitHelper", "After post login. StartedFor: " + this.f36736d);
        if (rh.h.a().E5() && !dk.c.c().n()) {
            ek.c.g().f(this.f36738f, new ek.a.InterfaceC0297a() { // from class: yj.j0
                @Override // ek.a.InterfaceC0297a
                public final void a(String str) {
                    rg.a1.Y0();
                }
            });
        }
        switch (e.f36747a[this.f36736d.ordinal()]) {
            case 1:
                r().g(this.f36738f);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                r().d(this.f36738f);
                break;
        }
    }

    public final void p() {
        ek.c.g().e(this.f36738f);
    }

    public final void q() {
        ek.q.h("InitHelper", "getAllAppSettings:...");
        LoggingProtocol.g("load_setting_begin");
        uh.f.j().o(this.f36738f, new a());
    }

    public final ti.d r() {
        return rg.y.h().d();
    }

    public final n0 t() {
        WeakReference<n0> weakReference = this.f36737e;
        if (weakReference == null || weakReference.get() == null) {
            this.f36737e = new WeakReference<>(new h());
        }
        return this.f36737e.get();
    }

    public final void u(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new b(str, str2));
    }

    public boolean v() {
        return this.f36735c != g.INIT_STATE_NONE;
    }

    public void y() {
        r().a(this.f36738f);
    }
}
