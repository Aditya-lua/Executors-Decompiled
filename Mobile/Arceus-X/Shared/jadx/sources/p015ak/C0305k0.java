package p015ak;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.annotation.NonNull;
import bm.C1466r;
import cm.C1678a;
import com.roblox.client.C3179d;
import com.roblox.client.RobloxApplication;
import com.roblox.client.ossearch.C3210b;
import com.roblox.client.startup.C3272a;
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
import dm.C4643b;
import fk.C5654c;
import hm.C6426b;
import im.C6826f;
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
import km.C7635f;
import mk.C8569c;
import org.json.JSONException;
import org.json.JSONObject;
import p030bk.C1441a;
import p030bk.C1442b;
import p030bk.C1443c;
import p030bk.C1444d;
import p079di.C4617i;
import p140g0.C5918o0;
import p151gk.AsyncTaskC6103a;
import p151gk.C6107c;
import p151gk.C6117j;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6133z;
import p306nb.C9261qe;
import p308nh.C9477c;
import p383qi.C10583b;
import p386ql.C10597c;
import p416rl.C10895c;
import p416rl.C10902j;
import p517wh.C12433f;
import p517wh.C12453p;
import p519wj.C12476a;
import p520wk.C12483e;
import p520wk.C12488j;
import p546xg.C12830a;
import p548xi.C12836c;
import p551xl.C12864g;
import p580yl.C13203c;
import p608zl.C13839e;
import pm.C10293a;
import sg.C11295a1;
import sg.C11346q;
import sg.C11356t0;
import sg.C11370y;
import th.C11659h;
import vg.C12175e;
import vi.C12211b;
import vi.C12213d;
import vi.C12216g;
import vi.C12217h;

/* JADX INFO: renamed from: ak.k0 */
/* JADX INFO: loaded from: classes2.dex */
public class C0305k0 {

    /* JADX INFO: renamed from: j */
    public static boolean f779j;

    /* JADX INFO: renamed from: k */
    public static C0305k0 f780k;

    /* JADX INFO: renamed from: b */
    public volatile boolean f782b;

    /* JADX INFO: renamed from: e */
    public WeakReference<InterfaceC0317n0> f785e;

    /* JADX INFO: renamed from: f */
    public final Context f786f;

    /* JADX INFO: renamed from: g */
    public final C12216g f787g;

    /* JADX INFO: renamed from: a */
    public final AtomicBoolean f781a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c */
    public g f783c = g.INIT_STATE_NONE;

    /* JADX INFO: renamed from: d */
    public StartedForEnum f784d = StartedForEnum.SYSTEM;

    /* JADX INFO: renamed from: h */
    public final Set<InterfaceC0281e0> f788h = new HashSet();

    /* JADX INFO: renamed from: i */
    public OnAppBridgeNotificationListener f789i = new c();

    /* JADX INFO: renamed from: ak.k0$a */
    public class a implements C12433f.h {
        public a() {
        }

        @Override // p517wh.C12433f.h
        /* JADX INFO: renamed from: a */
        public void mo1302a(int i10) {
            File parentFile;
            LoggingProtocol.m15994g("load_setting_end");
            C12175e.m45057h().m45061i(C0305k0.this.f786f);
            if (i10 != 0) {
                C0305k0.this.m1279D();
                return;
            }
            C6124q.m27063h("InitHelper", "getAllAppSettings: ... Settings loaded.");
            C0305k0.this.f783c = g.INIT_STATE_SETTINGS_LOADED_OK;
            C0305k0.m1275w(C0305k0.this.f786f);
            if (C10902j.m41464j().m41466f()) {
                C10902j.m41464j().m41469i(C0305k0.this.f786f);
            }
            C7635f.m31524D().m31552t();
            C0305k0.this.m1301y();
            if (C11659h.m43403a().mo43697p2() && Environment.getExternalStorageState().equals("mounted")) {
                String absolutePath = C0305k0.this.f786f.getExternalFilesDir(null).getAbsolutePath();
                if (C11659h.m43403a().mo43593b0()) {
                    C1444d.m7455d(absolutePath);
                } else {
                    NativeSettingsInterface.nativeSetExternalDirectory(absolutePath);
                }
            }
            if (C11659h.m43403a().mo43671l4()) {
                File externalFilesDir = C0305k0.this.f786f.getExternalFilesDir(null);
                String absolutePath2 = (externalFilesDir == null || (parentFile = externalFilesDir.getParentFile()) == null) ? "" : parentFile.getAbsolutePath();
                if (C11659h.m43403a().mo43593b0()) {
                    C1444d.m7453b(C0305k0.this.f786f.getDataDir().getAbsolutePath(), absolutePath2);
                } else {
                    NativeSettingsInterface.nativeSetBaseDataDirectories(C0305k0.this.f786f.getDataDir().getAbsolutePath(), absolutePath2);
                }
            }
            if (C11659h.m43403a().mo43593b0()) {
                C1444d.m7456e(C6133z.m27106e(C0305k0.this.f786f).m27109f());
            } else {
                NativeSettingsInterface.nativeSetPreferencesFile(C6133z.m27106e(C0305k0.this.f786f).m27109f());
            }
            C0305k0.this.m1280E();
        }
    }

    /* JADX INFO: renamed from: ak.k0$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f791a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f792b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(String str, String str2) {
            this.f791a = str;
            this.f792b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6124q.m27063h("InitHelper", "handleAppBridgeNotification: type = " + this.f791a + ", data = " + this.f792b + ".");
            C3179d.e eVar = new C3179d.e();
            try {
                JSONObject jSONObject = new JSONObject(this.f792b);
                if (jSONObject.getInt("result") != 0) {
                    C0305k0.this.f787g.m45278q("Android-AppLogin-BrowserTracker-JsonFailed");
                    C0305k0.this.m1281F("AppBridgeNotification: JSON Result failure");
                    return;
                }
                long j10 = jSONObject.getLong("btid");
                C11295a1.f39657u = j10;
                if (C11659h.m43403a().mo43548U5()) {
                    C4617i.m22794n(C0305k0.this.f786f, j10);
                }
                int i10 = jSONObject.getInt("upgradeStatus");
                if (i10 == 1) {
                    eVar.m15097d();
                } else if (i10 != 2) {
                    eVar.m15099f();
                } else {
                    eVar.m15098e();
                }
                eVar.f11771b = jSONObject.optString("upgradeSource", "");
                eVar.f11772c = jSONObject.optString("MD5Sum", "");
                C0305k0.this.f787g.m45278q("Android-AppLogin-BrowserTracker-Success");
                if (C0305k0.this.f782b) {
                    ConnectivityV2Monitor.setup(C0305k0.this.f786f.getApplicationContext());
                }
                C0305k0.m1259T();
                if (eVar.m15095b() || eVar.m15096c()) {
                    C3179d.m15085e().m15090g(eVar);
                }
                C6124q.m27063h("InitHelper", "doAfterFetchBrowserTrackerId:...");
                C11356t0.m42532b(C0305k0.this.f786f, "appLaunch");
                if (C11659h.m43403a().mo43410A5()) {
                    return;
                }
                C0305k0.this.m1295p();
            } catch (JSONException unused) {
                C0305k0.this.f787g.m45278q("Android-AppLogin-BrowserTracker-JsonFailed");
                C0305k0.this.m1281F("AppBridgeNotification: JSON Result failure");
            }
        }
    }

    /* JADX INFO: renamed from: ak.k0$c */
    public class c extends OnAppBridgeNotificationListener {
        public c() {
        }

        @Override // com.roblox.engine.jni.OnAppBridgeNotificationListener
        /* JADX INFO: renamed from: a */
        public void mo1303a(String str, String str2) {
            C0305k0.this.m1299u(str, str2);
        }
    }

    /* JADX INFO: renamed from: ak.k0$d */
    public class d implements C12217h.f {
        public d() {
        }

        @Override // vi.C12217h.f
        /* JADX INFO: renamed from: a */
        public void mo1304a() {
            C6124q.m27063h("InitHelper", "onDidLoginEventFromLua: ... onPostLoginCompleted.");
            C0305k0.this.m1298t().mo1311k0();
            C0305k0.this.m1294o();
        }
    }

    /* JADX INFO: renamed from: ak.k0$e */
    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f796a;

        static {
            int[] iArr = new int[StartedForEnum.values().length];
            f796a = iArr;
            try {
                iArr[StartedForEnum.AFTER_SIGN_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f796a[StartedForEnum.AFTER_LOGIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f796a[StartedForEnum.AFTER_LOGIN_FOR_RESULT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f796a[StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f796a[StartedForEnum.REMINDER_NOTIFICATION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f796a[StartedForEnum.PROTOCOL_LAUNCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f796a[StartedForEnum.SYSTEM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: ak.k0$f */
    public static class f {

        /* JADX INFO: renamed from: a */
        public static final Set<String> f797a = C9261qe.m36724a(new Object[]{"RBXThemeOverride", "RBXHideThemeSetting"});
    }

    /* JADX INFO: renamed from: ak.k0$g */
    public enum g {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SETTINGS_LOADED_OK,
        INIT_STATE_DONE_OK,
        INIT_STATE_NO_USER_ID,
        INIT_STATE_UNAUTHORIZED,
        INIT_STATE_FAILED_APP_SETTINGS
    }

    /* JADX INFO: renamed from: ak.k0$h */
    public static class h implements InterfaceC0317n0 {
        @Override // p015ak.InterfaceC0317n0
        /* JADX INFO: renamed from: G */
        public void mo1307G() {
        }

        @Override // p015ak.InterfaceC0317n0
        /* JADX INFO: renamed from: J */
        public void mo1308J() {
        }

        @Override // p015ak.InterfaceC0317n0
        /* JADX INFO: renamed from: O */
        public void mo1309O() {
        }

        @Override // p015ak.InterfaceC0317n0
        /* JADX INFO: renamed from: i0 */
        public void mo1310i0() {
        }

        @Override // p015ak.InterfaceC0317n0
        /* JADX INFO: renamed from: k0 */
        public void mo1311k0() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public h() {
        }
    }

    public C0305k0(Context context, @NonNull C12216g c12216g) {
        C6124q.m27063h("InitHelper", "InitHelper created.");
        this.f786f = context.getApplicationContext();
        this.f787g = c12216g;
    }

    /* JADX INFO: renamed from: A */
    public static boolean m1256A(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("FirstRunPrefs", 0);
        boolean z10 = sharedPreferences.getBoolean("isFreshInstall", true);
        if (z10) {
            sharedPreferences.edit().putBoolean("isFreshInstall", false).apply();
        }
        return z10;
    }

    /* JADX INFO: renamed from: B */
    public static boolean m1257B() {
        return f779j;
    }

    /* JADX INFO: renamed from: G */
    public static void m1258G(final Activity activity, String str) {
        m1274s(activity).m1282H(str);
        if (C11659h.m43403a().mo43505O3()) {
            C12211b.m45200f().m45206h();
            activity.getWindow().clearFlags(8192);
        }
        C1678a.m8388a().m8389b(new C1678a.b() { // from class: ak.i0
            @Override // cm.C1678a.b
            /* JADX INFO: renamed from: a */
            public final void mo1255a(JSONObject jSONObject) {
                C11346q.m42509b(jSONObject, activity);
            }
        });
        if (C11659h.m43403a().mo43740v3()) {
            if (C11659h.m43403a().mo43593b0()) {
                C1442b.m7448a();
            } else {
                NativeGLInterface.screenTimeStartByGuac();
            }
        }
        if (C11659h.m43403a().mo43686n5()) {
            C3210b.m15320g(activity);
            C3210b.m15318e(activity);
        }
    }

    /* JADX INFO: renamed from: T */
    public static boolean m1259T() {
        String strM46731c = new C12476a(RobloxApplication.m14834f()).m46731c();
        C6124q.m27057b("InitHelper", "updateCookiesFromEngine: Got Cookies from external file = " + strM46731c);
        if (strM46731c != null) {
            C12488j.m46781c().m46785i(C11295a1.m42410O(), ".ROBLOSECURITY=" + strM46731c + "; Domain=" + C11295a1.m42410O(), C12483e.b.ENGINE_PUSH);
            return true;
        }
        for (String str : (C11659h.m43403a().mo43593b0() ? C1444d.m7452a(C11295a1.m42450g()) : NativeSettingsInterface.nativeGetCookiesInNetscapeFormat(C11295a1.m42450g())).split(";")) {
            String strTrim = str.trim();
            String[] strArrSplit = strTrim.split("\t");
            if (strArrSplit.length != 7 && strArrSplit.length != 6) {
                C6124q.m27060e("InitHelper", "updateCookiesFromEngine: Invalid cookie format: [" + strTrim + "]");
            } else if (strArrSplit[0].endsWith(C11295a1.m42410O())) {
                String str2 = strArrSplit[5];
                if (f.f797a.contains(str2)) {
                    C6124q.m27057b("InitHelper", "updateCookiesFromEngine: Skipping cookie update for: " + str2);
                } else {
                    C12488j.m46781c().m46785i(C11295a1.m42410O(), str2 + "=" + (strArrSplit.length == 7 ? strArrSplit[6] : "") + "; Domain=" + C11295a1.m42410O(), C12483e.b.ENGINE_PUSH);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m1261b(String str) {
    }

    /* JADX INFO: renamed from: s */
    public static C0305k0 m1274s(Context context) {
        if (f780k == null) {
            synchronized (C0305k0.class) {
                try {
                    if (f780k == null) {
                        f780k = new C0305k0(context, C12216g.m45228b());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f780k;
    }

    /* JADX INFO: renamed from: w */
    public static void m1275w(Context context) {
        C13203c.m48827i().m48829e();
        CookieProtocol.m15983a();
        C13839e.m50334m().m50342l(context);
        C6826f.m29205z().m29221w(context);
        C10597c.m40622h().m40627g(context);
        C7635f.m31524D().m31557y(context);
        C6426b.m28011h().m28017l(context);
        C12864g.m47841x();
        C10293a.m39556c();
        C4643b.m22866i().m22871g();
        if (C6127t.m27089e()) {
            if (C11659h.m43403a().mo43429D3()) {
                C10895c.m41456d().m41457c(context);
            } else {
                C10895c.m41456d();
            }
            C1466r.m7498y();
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m1276x(boolean z10) {
        f779j = z10;
    }

    /* JADX INFO: renamed from: z */
    public static void m1277z(Context context, int i10, boolean z10) {
        boolean zExists = new File("/system/fonts/NotoSansCJK-Regular.ttc").exists();
        List<String> listM26551a = C5918o0.m26551a(new Object[]{RobloxTelemetryEventConfig.EVENT_INGEST_BACKEND, RobloxTelemetryEventConfig.POINTS_BACKEND});
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair("FastFollowCJKAvailable", Boolean.toString(false)));
        arrayList.add(new Pair("SystemCJKAvailable", Boolean.toString(zExists)));
        arrayList.add(new Pair("EitherCJKAvailable", Boolean.toString(zExists)));
        if (C11659h.m43403a().mo43524R1()) {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(z10)));
        } else {
            arrayList.add(new Pair("IsFreshInstall", Boolean.toString(m1256A(context))));
        }
        if (C11659h.m43403a().mo43705q3()) {
            arrayList.add(new Pair("AvailableStorage", Long.toString(C6117j.m27040b().getAvailableBytes())));
            arrayList.add(new Pair("TotalStorage", Long.toString(C6117j.m27040b().getTotalBytes())));
            arrayList.add(new Pair("ExternalStorage", Long.toString(C6117j.m27039a().getTotalBytes())));
            arrayList.add(new Pair("AvailableExternalStorage", Long.toString(C6117j.m27040b().getAvailableBytes())));
        }
        LoggingProtocol.m15997j(RobloxTelemetryEvent.builder().setEventType(RobloxTelemetryEvent.ROBLOX_TELEMETRY_EVENT_TYPE).setConfig(RobloxTelemetryEventConfig.builder().setBackEnds(listM26551a).setThrottlingHundredthPercentage(i10).setEventName("JavaFastFollowEvent").build()).setData(RobloxTelemetryEventData.builder().setStandardizedFields(C5918o0.m26551a(new Object[]{RobloxTelemetryEventData.STANDARDIZED_FIELD_KEY_ADD_OS_INFO})).setCustomStringFields(arrayList).build()).build());
    }

    /* JADX INFO: renamed from: C */
    public void m1278C(Context context, boolean z10, C12836c.b bVar) {
        C6124q.m27063h("InitHelper", "logout: callServer = " + z10 + ", initState = " + this.f783c);
        this.f783c = g.INIT_STATE_NO_USER_ID;
        C12217h.m45288e().m45293c(context, z10, bVar);
    }

    /* JADX INFO: renamed from: D */
    public final void m1279D() {
        C6124q.m27063h("InitHelper", "AppSettings FAILURE");
        this.f783c = g.INIT_STATE_FAILED_APP_SETTINGS;
        LoggingProtocol.m15994g("init_failure");
        m1298t().mo1308J();
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f788h).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0281e0) it.next()).mo1248b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m1280E() {
        C6124q.m27063h("InitHelper", "AppSettings loaded.");
        C3272a.m15685B(this.f786f);
        this.f782b = C11659h.m43403a().mo43656j3();
        if (C11659h.m43403a().mo43593b0()) {
            C1441a.m7442b(this.f782b);
        } else {
            NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.f782b);
        }
        synchronized (this) {
            try {
                Iterator it = new HashSet(this.f788h).iterator();
                while (it.hasNext()) {
                    ((InterfaceC0281e0) it.next()).mo1247a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (C11659h.m43403a().mo43548U5()) {
            C4617i.m22797q(this.f786f);
        }
        if (C11659h.m43403a().mo43526R4()) {
            C9477c.m37336c(this.f786f);
        }
        C12830a.m47749e().m47759k(C11659h.m43403a().mo43694p(), C11659h.m43403a().mo43650i4(), C11659h.m43403a().mo43670l3(), C11659h.m43403a().mo43702q0(), TimeUnit.MINUTES.toMillis(C11659h.m43403a().mo43562W5()), C11659h.m43403a().mo43439F());
        m1298t().mo1307G();
    }

    /* JADX INFO: renamed from: F */
    public final void m1281F(String str) {
        if (this.f781a.compareAndSet(true, false)) {
            C6124q.m27063h("InitHelper", "Init FAILURE: (" + str + ")");
            LoggingProtocol.m15994g("init_failure");
            m1298t().mo1308J();
        }
    }

    /* JADX INFO: renamed from: H */
    public void m1282H(String str) {
        C6124q.m27063h("InitHelper", "onDidLoginEventFromLua: initState = " + this.f783c + ", data = " + str);
        this.f783c = g.INIT_STATE_DONE_OK;
        m1259T();
        C12217h.m45288e().m45298j(this.f786f, str, new d());
    }

    /* JADX INFO: renamed from: I */
    public void m1283I(String str) {
        C6124q.m27063h("InitHelper", "onDidSignUpEventFromLua: initState = " + this.f783c + ", data = " + str);
        m1287M(StartedForEnum.AFTER_SIGN_UP);
    }

    /* JADX INFO: renamed from: J */
    public void m1284J() {
        C6124q.m27063h("InitHelper", "onLoginRequestFromLua: initState = " + this.f783c);
        this.f783c = g.INIT_STATE_UNAUTHORIZED;
        m1298t().mo1309O();
    }

    /* JADX INFO: renamed from: K */
    public synchronized void m1285K(InterfaceC0281e0 interfaceC0281e0) {
        this.f788h.add(interfaceC0281e0);
    }

    /* JADX INFO: renamed from: L */
    public final void m1286L() {
        DeviceParams deviceParamsM46679c = C12453p.m46679c(this.f786f);
        if (C11659h.m43403a().mo43593b0()) {
            C1444d.m7454c(deviceParamsM46679c);
        } else {
            NativeSettingsInterface.nativeSetDeviceInfo(deviceParamsM46679c);
        }
    }

    /* JADX INFO: renamed from: M */
    public void m1287M(StartedForEnum startedForEnum) {
        this.f784d = startedForEnum;
    }

    /* JADX INFO: renamed from: N */
    public void m1288N(InterfaceC0317n0 interfaceC0317n0) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: setView = [");
        sb2.append(interfaceC0317n0 == null ? "null" : interfaceC0317n0.getClass().getSimpleName());
        sb2.append("]");
        C6124q.m27063h("InitHelper", sb2.toString());
        this.f785e = new WeakReference<>(interfaceC0317n0);
    }

    /* JADX INFO: renamed from: O */
    public void m1289O() {
        C6124q.m27063h("InitHelper", "start: initState = " + this.f783c + ", StartedFor: " + this.f784d);
        g gVar = this.f783c;
        g gVar2 = g.INIT_STATE_NONE;
        if (gVar == gVar2 && !C11659h.m43403a().mo43739v2()) {
            C8569c.m34512p().m34521s(new Consumer() { // from class: ak.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C0305k0.m1261b((String) obj);
                }
            });
        }
        if (this.f783c == g.INIT_STATE_DONE_OK) {
            this.f783c = gVar2;
        }
        g gVar3 = this.f783c;
        if (gVar3 == gVar2 || gVar3 == g.INIT_STATE_FAILED_APP_SETTINGS) {
            this.f783c = g.INIT_STATE_IN_PROGRESS;
            m1296q();
            return;
        }
        g gVar4 = g.INIT_STATE_SETTINGS_LOADED_OK;
        if (gVar3 == gVar4) {
            m1280E();
        } else if (gVar3 != g.INIT_STATE_NO_USER_ID && gVar3 != g.INIT_STATE_UNAUTHORIZED) {
            C6124q.m27063h("InitHelper", "The initialization must be in progress. Do nothing.");
        } else {
            this.f783c = gVar4;
            m1280E();
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m1290P() {
        LoggingProtocol.m15994g("start_app_bridge_begin");
        C6124q.m27063h("InitHelper", "startAppBridge:...");
        m1286L();
        if (C11659h.m43403a().mo43715s()) {
            LoggingProtocol.m15994g("after_set_device_info_in_engine");
        }
        if (C11659h.m43403a().mo43524R1()) {
            boolean zM1256A = m1256A(this.f786f);
            if (C11659h.m43403a().mo43593b0()) {
                C1441a.m7443c(zM1256A);
            } else {
                NativeAppBridgeInterface.setIsFirstInstall(zM1256A);
            }
            m1277z(this.f786f, 100, zM1256A);
        } else {
            m1277z(this.f786f, 100, false);
        }
        if (C11659h.m43403a().mo43715s()) {
            LoggingProtocol.m15994g("after_initialize_fonts_asset_pack");
        }
        if (C11659h.m43403a().mo43593b0()) {
            C1443c.m7450a(this.f789i);
        } else {
            NativeGLJavaInterface.setAppBridgeNotificationListener(this.f789i);
        }
        if (C11659h.m43403a().mo43715s()) {
            LoggingProtocol.m15994g("after_set_app_bridge_notification_listener");
        }
        String strM42450g = C11295a1.m42450g();
        String strM42433Z0 = C11295a1.m42433Z0();
        boolean zM42473r0 = C11295a1.m42473r0();
        if (C11659h.m43403a().mo43593b0()) {
            C1441a.m7441a(strM42450g, strM42433Z0, zM42473r0, C11295a1.f39656t, C11295a1.m42390E());
        } else {
            NativeAppBridgeInterface.m15789a(strM42450g, strM42433Z0, zM42473r0, C11295a1.f39656t, C11295a1.m42390E());
        }
        if (C11659h.m43403a().mo43691o3()) {
            C12433f.m46540j().m46545E();
        }
        LoggingProtocol.m15994g("start_app_bridge_end");
    }

    /* JADX INFO: renamed from: Q */
    public void m1291Q() {
        C6124q.m27063h("InitHelper", "startV2: initState = " + this.f783c + ", StartedFor: " + this.f784d);
        if (this.f781a.compareAndSet(false, true)) {
            if (C11659h.m43403a().mo43418C() && !C3272a.m15705m()) {
                throw new RuntimeException("Flags are not loaded when starting AppBridge");
            }
            m1290P();
        }
        g gVar = this.f783c;
        g gVar2 = g.INIT_STATE_DONE_OK;
        if (gVar == gVar2 || gVar == g.INIT_STATE_UNAUTHORIZED || gVar == g.INIT_STATE_NO_USER_ID) {
            C6124q.m27063h("InitHelper", "The initialization is done or unauthorized. Go to Main screen.");
            m1298t().mo1311k0();
        } else if (gVar == g.INIT_STATE_SETTINGS_LOADED_OK) {
            C6124q.m27063h("rbx.locale", " mContext: " + this.f786f);
            C10583b.m40569f().m40579m(this.f786f);
            m1298t().mo1310i0();
            C6124q.m27063h("InitHelper", "SessionCheck... New startup flow. Go directly to the Main screen.");
            this.f783c = gVar2;
            m1298t().mo1311k0();
        } else {
            C6124q.m27063h("InitHelper", "The initialization must be in progress. Do nothing.");
        }
        C13839e.m50334m().m50342l(this.f786f);
        C6826f.m29205z().m29221w(this.f786f);
        C10597c.m40622h().m40627g(this.f786f);
        C7635f.m31524D().m31557y(this.f786f);
        if (C11659h.m43403a().mo43429D3() && C6127t.m27089e()) {
            C10895c.m41456d().m41457c(this.f786f);
        }
    }

    /* JADX INFO: renamed from: R */
    public synchronized void m1292R(InterfaceC0281e0 interfaceC0281e0) {
        this.f788h.remove(interfaceC0281e0);
    }

    /* JADX INFO: renamed from: S */
    public void m1293S(InterfaceC0317n0 interfaceC0317n0) {
        InterfaceC0317n0 interfaceC0317n1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("start: unsetView = [");
        sb2.append(interfaceC0317n0 == null ? "null" : interfaceC0317n0.getClass().getSimpleName());
        sb2.append("]");
        C6124q.m27063h("InitHelper", sb2.toString());
        WeakReference<InterfaceC0317n0> weakReference = this.f785e;
        if (weakReference == null || (interfaceC0317n1 = weakReference.get()) == null || interfaceC0317n1 != interfaceC0317n0) {
            return;
        }
        this.f785e = null;
    }

    /* JADX INFO: renamed from: o */
    public final void m1294o() {
        C6124q.m27063h("InitHelper", "After post login. StartedFor: " + this.f784d);
        if (C11659h.m43403a().mo43410A5() && !C5654c.m25669c().m25682n()) {
            C6107c.m27010g().m27013f(this.f786f, new AsyncTaskC6103a.a() { // from class: ak.j0
                @Override // p151gk.AsyncTaskC6103a.a
                /* JADX INFO: renamed from: a */
                public final void mo1253a(String str) {
                    C11295a1.m42429X0();
                }
            });
        }
        switch (e.f796a[this.f784d.ordinal()]) {
            case 1:
                m1297r().mo14933g(this.f786f);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                m1297r().mo14928d(this.f786f);
                break;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1295p() {
        C6107c.m27010g().m27012e(this.f786f);
    }

    /* JADX INFO: renamed from: q */
    public final void m1296q() {
        C6124q.m27063h("InitHelper", "getAllAppSettings:...");
        LoggingProtocol.m15994g("load_setting_begin");
        C12433f.m46540j().m46558o(this.f786f, new a());
    }

    /* JADX INFO: renamed from: r */
    public final C12213d m1297r() {
        return C11370y.m42581h().m42585d();
    }

    /* JADX INFO: renamed from: t */
    public final InterfaceC0317n0 m1298t() {
        WeakReference<InterfaceC0317n0> weakReference = this.f785e;
        if (weakReference == null || weakReference.get() == null) {
            this.f785e = new WeakReference<>(new h());
        }
        return this.f785e.get();
    }

    /* JADX INFO: renamed from: u */
    public final void m1299u(String str, String str2) {
        new Handler(Looper.getMainLooper()).post(new b(str, str2));
    }

    /* JADX INFO: renamed from: v */
    public boolean m1300v() {
        return this.f783c != g.INIT_STATE_NONE;
    }

    /* JADX INFO: renamed from: y */
    public void m1301y() {
        m1297r().mo14923a(this.f786f);
    }
}
