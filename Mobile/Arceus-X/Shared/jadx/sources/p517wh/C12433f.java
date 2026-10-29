package p517wh;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.Surface;
import cm.C1678a;
import com.roblox.client.RobloxApplication;
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.C3273b;
import com.roblox.engine.jni.EngineJavaCallback2;
import com.roblox.engine.jni.EngineJavaCallbackWrapper;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.autovalue.StartAppParams;
import com.roblox.engine.jni.model.DeviceParams;
import com.roblox.engine.jni.model.PlatformParams;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import mk.C8569c;
import ne.C9410a0;
import ne.C9418e0;
import ne.C9435s;
import org.fmod.FMOD;
import p015ak.C0315m2;
import p151gk.C6115h;
import p151gk.C6124q;
import p308nh.C9476b;
import p335ok.C9755a;
import p335ok.C9756b;
import p335ok.C9757c;
import p519wj.C12476a;
import p520wk.C12483e;
import p520wk.C12486h;
import sg.C11295a1;
import sg.C11370y;
import th.C11659h;

/* JADX INFO: renamed from: wh.f */
/* JADX INFO: loaded from: classes2.dex */
public class C12433f implements C12486h.d {

    /* JADX INFO: renamed from: f */
    public boolean f44453f;

    /* JADX INFO: renamed from: h */
    public d f44455h;

    /* JADX INFO: renamed from: i */
    public f f44456i;

    /* JADX INFO: renamed from: k */
    public e f44458k;

    /* JADX INFO: renamed from: a */
    public final String f44448a = "rbx.appshell";

    /* JADX INFO: renamed from: b */
    public boolean f44449b = false;

    /* JADX INFO: renamed from: c */
    public boolean f44450c = false;

    /* JADX INFO: renamed from: d */
    public boolean f44451d = false;

    /* JADX INFO: renamed from: e */
    public boolean f44452e = false;

    /* JADX INFO: renamed from: g */
    public boolean f44454g = false;

    /* JADX INFO: renamed from: j */
    public Vector<C9756b> f44457j = new Vector<>();

    /* JADX INFO: renamed from: wh.f$a */
    public class a implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h f44459a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(h hVar) {
            this.f44459a = hVar;
        }

        @Override // p517wh.C12433f.h
        /* JADX INFO: renamed from: a */
        public void mo1302a(int i10) {
            LoggingProtocol.m15994g("update_setting_to_app_bridge_end");
            if (i10 == 0) {
                this.f44459a.mo1302a(0);
            } else {
                this.f44459a.mo1302a(1);
            }
        }
    }

    /* JADX INFO: renamed from: wh.f$b */
    public class b implements h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ h f44461a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public b(h hVar) {
            this.f44461a = hVar;
        }

        @Override // p517wh.C12433f.h
        /* JADX INFO: renamed from: a */
        public void mo1302a(int i10) {
            if (i10 == 0) {
                C12433f.this.f44450c = true;
            }
            h hVar = this.f44461a;
            if (hVar != null) {
                hVar.mo1302a(i10);
            }
        }
    }

    /* JADX INFO: renamed from: wh.f$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d f44463a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(d dVar) {
            this.f44463a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f44463a.f44465a);
        }
    }

    /* JADX INFO: renamed from: wh.f$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public Activity f44465a;

        /* JADX INFO: renamed from: b */
        public PlatformParams f44466b;

        /* JADX INFO: renamed from: c */
        public DeviceParams f44467c;

        /* JADX INFO: renamed from: d */
        public String f44468d;

        /* JADX INFO: renamed from: e */
        public String f44469e;

        /* JADX INFO: renamed from: f */
        public long f44470f;

        /* JADX INFO: renamed from: g */
        public boolean f44471g;

        /* JADX INFO: renamed from: h */
        public String f44472h;

        /* JADX INFO: renamed from: i */
        public int f44473i;

        /* JADX INFO: renamed from: j */
        public String f44474j;

        /* JADX INFO: renamed from: a */
        public DeviceParams m46570a() {
            return this.f44467c;
        }

        /* JADX INFO: renamed from: b */
        public PlatformParams m46571b() {
            return this.f44466b;
        }
    }

    /* JADX INFO: renamed from: wh.f$e */
    public class e extends EngineJavaCallbackWrapper {
        public e(EngineJavaCallback2 engineJavaCallback2) {
            super(engineJavaCallback2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
        /* JADX INFO: renamed from: f */
        public void mo15220f(String str, String str2) {
            if (str.equals("APP_READY")) {
                C12433f.this.m46560q(str2);
            }
            super.mo15220f(str, str2);
        }
    }

    /* JADX INFO: renamed from: wh.f$f */
    public static class f extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a */
        public h f44476a;

        /* JADX INFO: renamed from: b */
        public final String f44477b = "rbx.appshell";

        public f(h hVar) {
            this.f44476a = hVar;
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            String strM15707o;
            C3273b.b bVarM15713u = C3272a.m15713u();
            String strM15739d = bVarM15713u.m15739d();
            String strM15740e = bVarM15713u.m15740e();
            if (strM15739d == null || strM15739d.isEmpty()) {
                return 1;
            }
            if (C9476b.m37333a()) {
                strM15707o = C3272a.m15707o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("overridePayload = ");
                sb2.append(strM15707o);
                C6124q.m27057b("rbx.appshell", sb2.toString() != null ? strM15707o : "no overrides");
            } else {
                strM15707o = new C12476a(RobloxApplication.m14834f()).m46729a();
            }
            return C11659h.m43403a().mo43607c6() ? Integer.valueOf(NativeGLInterface.nativeInitClientSettingsSigned(strM15739d, strM15740e, strM15707o, C11295a1.m42406M())) : Integer.valueOf(NativeGLInterface.nativeInitClientSettings(strM15739d, strM15707o, C11295a1.m42406M()));
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                NativeGLInterface.nativePostClientSettingsLoadedInitialization3(C0315m2.m1317a(RobloxApplication.m14834f()));
                C6124q.m27063h("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f44476a;
            if (hVar != null) {
                hVar.mo1302a(num.intValue());
            }
        }
    }

    /* JADX INFO: renamed from: wh.f$g */
    public static class g {

        /* JADX INFO: renamed from: a */
        public static final C12433f f44478a = new C12433f();
    }

    /* JADX INFO: renamed from: wh.f$h */
    public interface h {
        /* JADX INFO: renamed from: a */
        void mo1302a(int i10);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46536b(C9418e0 c9418e0, String str) {
        LoggingProtocol.m15994g("asset_unpack_end");
        c9418e0.mo37169D(null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m46538d(C9418e0 c9418e0, String str) {
        LoggingProtocol.m15994g("asset_unpack_end");
        c9418e0.mo37169D(null);
    }

    /* JADX INFO: renamed from: j */
    public static C12433f m46540j() {
        return g.f44478a;
    }

    /* JADX INFO: renamed from: A */
    public void m46541A(C9757c c9757c) {
        if (this.f44449b) {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(c9757c.f35514a, c9757c.f35515b, c9757c.f35516c);
        } else {
            C6124q.m27066k("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        }
    }

    /* JADX INFO: renamed from: B */
    public void m46542B(boolean z10) {
        m46541A(new C9755a(z10));
    }

    /* JADX INFO: renamed from: C */
    public void m46543C(C9756b c9756b) {
        if (c9756b == null) {
            return;
        }
        this.f44457j.add(c9756b);
        if (m46555l()) {
            m46564u(this.f44457j);
        }
    }

    /* JADX INFO: renamed from: D */
    public void m46544D(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f44458k = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    /* JADX INFO: renamed from: E */
    public void m46545E() {
        this.f44453f = true;
    }

    /* JADX INFO: renamed from: F */
    public void m46546F(Context context) {
        C6124q.m27057b("rbx.appshell", "ASMA.setup() " + this.f44449b);
        if (this.f44449b) {
            C11295a1.m42419S0();
            return;
        }
        this.f44449b = true;
        boolean zMo43435E2 = C11659h.m43403a().mo43435E2();
        if (zMo43435E2) {
            LoggingProtocol.m15994g("update_native_settings_begin");
        }
        C11295a1.m42425V0();
        if (zMo43435E2) {
            LoggingProtocol.m15994g("update_native_settings_end");
        }
        if (zMo43435E2) {
            LoggingProtocol.m15994g("fmod_init_begin");
        }
        FMOD.init(context);
        if (zMo43435E2) {
            LoggingProtocol.m15994g("fmod_init_end");
        }
        if (zMo43435E2) {
            LoggingProtocol.m15994g("game_global_init_begin");
        }
        NativeGLInterface.nativeGameGlobalInit();
        if (zMo43435E2) {
            LoggingProtocol.m15994g("game_global_init_end");
        }
        C11295a1.m42423U0();
        NativeGLInterface.nativeUpdateAdapterInit();
    }

    /* JADX INFO: renamed from: G */
    public void m46547G(Surface surface) {
        if (this.f44451d) {
            this.f44454g = true;
            m46569z();
            d dVarM46553i = m46553i();
            StartAppParams.Builder selectedTheme = StartAppParams.builder().setSurface(surface).setPlatformParams(dVarM46553i.f44466b).setAppStarterPlace(dVarM46553i.f44468d).setAppStarterScript(dVarM46553i.f44469e).setAppUserId(dVarM46553i.f44470f).setIsUnder13(dVarM46553i.f44471g).setUsername(dVarM46553i.f44472h).setMembershipType(dVarM46553i.f44473i).setSelectedTheme(dVarM46553i.f44474j);
            if (C11295a1.m42389D0()) {
                selectedTheme.setVrContext(dVarM46553i.f44465a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(selectedTheme.build());
            if (C11295a1.m42389D0()) {
                Executors.newSingleThreadExecutor().execute(new c(dVarM46553i));
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m46548H() {
        C6124q.m27057b("rbx.appshell", "ASMA.stop");
        if (this.f44451d && this.f44454g) {
            this.f44454g = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (C11370y.m42581h().m42587f().m15275i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.stop");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m46549I(Surface surface, float f10, int i10, int i11) {
        C6124q.m27057b("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f44451d) {
            PlatformParams platformParams = new PlatformParams();
            platformParams.dpiScale = f10;
            platformParams.viewportWidthMm = i10;
            platformParams.viewportHeightMm = i11;
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(surface, platformParams);
        }
    }

    @Override // p520wk.C12486h.d
    /* JADX INFO: renamed from: a */
    public void mo1254a() {
        C6124q.m27063h("rbx.appshell", "onCookieChanged.");
        if (C11659h.m43403a().mo43530S1()) {
            C12483e.m46751k();
        }
        C11295a1.m42419S0();
    }

    /* JADX INFO: renamed from: f */
    public void m46550f() {
        synchronized (this) {
            m46551g();
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m46551g() {
        if (this.f44451d) {
            C6124q.m27063h("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        m46565v();
    }

    /* JADX INFO: renamed from: h */
    public final void m46552h() {
        e eVar = this.f44458k;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    /* JADX INFO: renamed from: i */
    public d m46553i() {
        return this.f44455h;
    }

    /* JADX INFO: renamed from: k */
    public void m46554k(d dVar) {
        C6124q.m27063h("rbx.appshell", "ASMA.initializeDataModel: hasSettings:" + this.f44450c + ", isInitialized:" + this.f44451d + ", CrashWhenAppBridgeNotStarted:" + C11659h.m43403a().mo43691o3() + ", appBridgeStarted:" + this.f44453f);
        if (!this.f44450c || this.f44451d) {
            return;
        }
        m46552h();
        C6124q.m27057b("rbx.appshell", "ASMA.initializeDataModel()");
        this.f44455h = dVar;
        this.f44451d = true;
        String strM42450g = C11295a1.m42450g();
        InitParams.Builder isTablet = InitParams.builder().setPlatformParams(dVar.f44466b).setDeviceParams(dVar.f44467c).setBaseURL(strM42450g).setUserAgent(C11295a1.m42433Z0()).setIsTablet(C11295a1.m42473r0());
        if (C11659h.m43403a().mo43633g1()) {
            isTablet.setBuildVariant(C6115h.m27036a());
        }
        isTablet.setIsVrDevice(C11295a1.m42471q0());
        isTablet.setIsPotato(C11295a1.m42477t0());
        if (dVar.f44466b.assetFolderPath == null) {
            C6124q.m27060e("rbx.appshell", "Asset folder path is null");
        } else {
            C6124q.m27063h("rbx.appshell", "Asset folder path: " + dVar.f44466b.assetFolderPath);
        }
        if (dVar.f44466b.assetFolderPath == null) {
            throw new RuntimeException("Asset folder path is null");
        }
        if (C11659h.m43403a().mo43691o3() && !this.f44453f) {
            throw new RuntimeException("AppBridge is not yet started");
        }
        NativeGLInterface.nativeAppBridgeV2InitWithParams(isTablet.build());
    }

    /* JADX INFO: renamed from: l */
    public boolean m46555l() {
        return this.f44452e;
    }

    /* JADX INFO: renamed from: m */
    public boolean m46556m() {
        return this.f44451d;
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object m46557n(Context context, h hVar) {
        m46562s(context, hVar, true);
        return null;
    }

    /* JADX INFO: renamed from: o */
    public void m46558o(final Context context, final h hVar) {
        C6124q.m27063h("rbx.appshell", "ASMA.loadAllAppSettings()");
        LoggingProtocol.m15994g("asset_unpack_begin");
        final C9418e0 c9418e0M37204H = C9418e0.m37204H();
        if (C11659h.m43403a().mo43739v2()) {
            C8569c.m34512p().m34519q().thenAccept(new Consumer() { // from class: wh.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C12433f.m46538d(c9418e0M37204H, (String) obj);
                }
            });
        } else {
            C8569c.m34512p().m34521s(new Consumer() { // from class: wh.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    C12433f.m46536b(c9418e0M37204H, (String) obj);
                }
            });
        }
        C9435s.m37270o(C3272a.m15701i(context), c9418e0M37204H).m37271a(new Callable() { // from class: wh.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f44444a.m46557n(context, hVar);
            }
        }, C9410a0.m37145a());
    }

    /* JADX INFO: renamed from: p */
    public void m46559p(h hVar) {
        C6124q.m27057b("rbx.appshell", "ASMA.loadSettings() " + this.f44450c);
        if (this.f44450c) {
            C6124q.m27057b("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.mo1302a(0);
                return;
            }
            return;
        }
        m46566w();
        f fVar = new f(new b(hVar));
        this.f44456i = fVar;
        fVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    /* JADX INFO: renamed from: q */
    public void m46560q(String str) {
        C6124q.m27057b("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f44452e = true;
        m46564u(this.f44457j);
    }

    /* JADX INFO: renamed from: r */
    public void m46561r() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    /* JADX INFO: renamed from: s */
    public final void m46562s(Context context, h hVar, boolean z10) {
        if (C11659h.m43403a().mo43435E2()) {
            LoggingProtocol.m15994g("settings_join_resolved");
        }
        if (!z10) {
            hVar.mo1302a(1);
            return;
        }
        m46546F(context);
        LoggingProtocol.m15994g("update_setting_to_app_bridge_start");
        m46559p(new a(hVar));
    }

    /* JADX INFO: renamed from: t */
    public void m46563t() {
        C6124q.m27057b("rbx.appshell", "ASMA.pause");
        if (this.f44451d) {
            C6124q.m27063h("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (C11370y.m42581h().m42587f().m15275i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m46564u(Vector<C9756b> vector) {
        while (!vector.isEmpty()) {
            C9756b c9756bRemove = vector.remove(0);
            C6124q.m27057b("rbx.appshell", "publishPendingReadyEvents() " + c9756bRemove.f35514a + ", " + c9756bRemove.f35515b + ", " + c9756bRemove.f35516c + ", " + c9756bRemove.f35513d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(c9756bRemove.f35514a, c9756bRemove.f35515b, c9756bRemove.f35516c, c9756bRemove.f35513d);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m46565v() {
        C6124q.m27057b("rbx.appshell", "ASMA.reset()");
        this.f44449b = false;
        this.f44451d = false;
        this.f44452e = false;
        this.f44455h = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        m46566w();
        C1678a.m8388a().m8390c();
    }

    /* JADX INFO: renamed from: w */
    public final void m46566w() {
        f fVar = this.f44456i;
        if (fVar != null && !fVar.isCancelled()) {
            C6124q.m27063h("rbx.appshell", "ASMA.resetTask: Cancel the current (running) task...");
            fVar.cancel(true);
        }
        this.f44456i = null;
    }

    /* JADX INFO: renamed from: x */
    public void m46567x(Context context, Surface surface) {
        m46568y(context, surface, null);
    }

    /* JADX INFO: renamed from: y */
    public void m46568y(Context context, Surface surface, Activity activity) {
        C6124q.m27063h("rbx.appshell", "ASMA.restart");
        m46550f();
        m46554k(C11295a1.m42389D0() ? C12453p.m46678b(context, activity) : C12453p.m46677a(context));
        m46547G(surface);
    }

    /* JADX INFO: renamed from: z */
    public void m46569z() {
        m46552h();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }
}
