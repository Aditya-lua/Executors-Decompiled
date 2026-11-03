package uh;

import android.app.Activity;
import android.content.Context;
import android.os.AsyncTask;
import android.view.Surface;
import com.roblox.client.RobloxApplication;
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
import org.fmod.FMOD;
import yj.n2;

/* JADX INFO: loaded from: classes2.dex */
public class f implements uk.h.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32951f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f32953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AsyncTaskC0596f f32954i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f32956k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32947a = "rbx.appshell";
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f32948c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f32949d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f32950e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f32952g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Vector<mk.b> f32955j = new Vector<>();

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32957a;

        public a(h hVar) {
            this.f32957a = hVar;
        }

        @Override // uh.f.h
        public void a(int i10) {
            LoggingProtocol.g("update_setting_to_app_bridge_end");
            if (i10 == 0) {
                this.f32957a.a(0);
            } else {
                this.f32957a.a(1);
            }
        }
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f32958a;

        public b(h hVar) {
            this.f32958a = hVar;
        }

        @Override // uh.f.h
        public void a(int i10) {
            if (i10 == 0) {
                f.this.f32948c = true;
            }
            h hVar = this.f32958a;
            if (hVar != null) {
                hVar.a(i10);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f32959a;

        public c(d dVar) {
            this.f32959a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f32959a.f32960a);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f32960a;
        public PlatformParams b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DeviceParams f32961c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f32962d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f32963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f32964f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f32965g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f32966h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f32967i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f32968j;

        public DeviceParams a() {
            return this.f32961c;
        }

        public PlatformParams b() {
            return this.b;
        }
    }

    public class e extends EngineJavaCallbackWrapper {
        public e(EngineJavaCallback2 engineJavaCallback2) {
            super(engineJavaCallback2);
        }

        @Override // com.roblox.engine.jni.EngineJavaCallbackWrapper, com.roblox.engine.jni.EngineJavaCallback2
        public void f(String str, String str2) {
            if (str.equals("APP_READY")) {
                f.this.q(str2);
            }
            super.f(str, str2);
        }
    }

    /* JADX INFO: renamed from: uh.f$f, reason: collision with other inner class name */
    public static class AsyncTaskC0596f extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f32969a;
        public final String b = "rbx.appshell";

        public AsyncTaskC0596f(h hVar) {
            this.f32969a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            String strO;
            com.roblox.client.startup.b.C0152b c0152bU = com.roblox.client.startup.a.u();
            String strD = c0152bU.d();
            String strE = c0152bU.e();
            if (strD == null || strD.isEmpty()) {
                return 1;
            }
            if (mh.b.a()) {
                strO = com.roblox.client.startup.a.o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("overridePayload = ");
                sb2.append(strO);
                ek.q.b("rbx.appshell", sb2.toString() != null ? strO : "no overrides");
            } else {
                strO = new uj.a(RobloxApplication.f()).a();
            }
            return rh.h.a().f6() ? Integer.valueOf(NativeGLInterface.nativeInitClientSettingsSigned(strD, strE, strO, rg.a1.M())) : Integer.valueOf(NativeGLInterface.nativeInitClientSettings(strD, strO, rg.a1.M()));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                NativeGLInterface.nativePostClientSettingsLoadedInitialization3(n2.a(RobloxApplication.f()));
                ek.q.h("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f32969a;
            if (hVar != null) {
                hVar.a(num.intValue());
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f32970a = new f();
    }

    public interface h {
        void a(int i10);
    }

    public static /* synthetic */ void b(ne.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static /* synthetic */ void d(ne.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static f j() {
        return g.f32970a;
    }

    public void A(mk.c cVar) {
        if (this.b || (this.f32949d && rh.h.a().o2())) {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(cVar.f24878a, cVar.b, cVar.f24879c);
        } else {
            ek.q.k("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        }
    }

    public void B(boolean z10) {
        A(new mk.a(z10));
    }

    public void C(mk.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f32955j.add(bVar);
        if (l()) {
            u(this.f32955j);
        }
    }

    public void D(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f32956k = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    public void E() {
        this.f32951f = true;
    }

    public void F(Context context) {
        ek.q.b("rbx.appshell", "ASMA.setup() " + this.b);
        if (this.b) {
            rg.a1.T0();
            return;
        }
        this.b = true;
        boolean zJ2 = rh.h.a().J2();
        if (zJ2) {
            LoggingProtocol.g("update_native_settings_begin");
        }
        rg.a1.W0();
        if (zJ2) {
            LoggingProtocol.g("update_native_settings_end");
        }
        if (zJ2) {
            LoggingProtocol.g("fmod_init_begin");
        }
        FMOD.init(context);
        if (zJ2) {
            LoggingProtocol.g("fmod_init_end");
        }
        if (zJ2) {
            LoggingProtocol.g("game_global_init_begin");
        }
        NativeGLInterface.nativeGameGlobalInit();
        if (zJ2) {
            LoggingProtocol.g("game_global_init_end");
        }
        rg.a1.V0();
        NativeGLInterface.nativeUpdateAdapterInit();
    }

    public void G(Surface surface) {
        if (this.f32949d) {
            this.f32952g = true;
            z();
            d dVarI = i();
            StartAppParams.Builder selectedTheme = StartAppParams.builder().setSurface(surface).setPlatformParams(dVarI.b).setAppStarterPlace(dVarI.f32962d).setAppStarterScript(dVarI.f32963e).setAppUserId(dVarI.f32964f).setIsUnder13(dVarI.f32965g).setUsername(dVarI.f32966h).setMembershipType(dVarI.f32967i).setSelectedTheme(dVarI.f32968j);
            if (rg.a1.E0()) {
                selectedTheme.setVrContext(dVarI.f32960a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(selectedTheme.build());
            if (rg.a1.E0()) {
                Executors.newSingleThreadExecutor().execute(new c(dVarI));
            }
        }
    }

    public void H() {
        ek.q.b("rbx.appshell", "ASMA.stop");
        if (this.f32949d && this.f32952g) {
            this.f32952g = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (rg.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.stop");
        }
    }

    public void I(Surface surface, float f10, int i10, int i11) {
        ek.q.b("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f32949d) {
            PlatformParams platformParams = new PlatformParams();
            platformParams.dpiScale = f10;
            platformParams.viewportWidthMm = i10;
            platformParams.viewportHeightMm = i11;
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(surface, platformParams);
        }
    }

    @Override // uk.h.d
    public void a() {
        ek.q.h("rbx.appshell", "onCookieChanged.");
        if (rh.h.a().W1()) {
            rg.a1.C0();
        }
        rg.a1.T0();
    }

    public void f() {
        synchronized (this) {
            g();
        }
    }

    public final void g() {
        if (this.f32949d) {
            ek.q.h("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        v();
    }

    public final void h() {
        e eVar = this.f32956k;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    public d i() {
        return this.f32953h;
    }

    public void k(d dVar) {
        ek.q.h("rbx.appshell", "ASMA.initializeDataModel: hasSettings:" + this.f32948c + ", isInitialized:" + this.f32949d + ", CrashWhenAppBridgeNotStarted:" + rh.h.a().s3() + ", appBridgeStarted:" + this.f32951f);
        if (!this.f32948c || this.f32949d) {
            return;
        }
        h();
        ek.q.b("rbx.appshell", "ASMA.initializeDataModel()");
        this.f32953h = dVar;
        this.f32949d = true;
        String strG = rg.a1.g();
        InitParams.Builder pioneerPlaceId = InitParams.builder().setPlatformParams(dVar.b).setDeviceParams(dVar.f32961c).setBaseURL(strG).setUserAgent(rg.a1.a1()).setIsTablet(rg.a1.r0()).setPioneerPlaceId(0L);
        if (rh.h.a().j1()) {
            pioneerPlaceId.setBuildVariant(ek.h.a());
        }
        pioneerPlaceId.setIsVrDevice(rg.a1.q0());
        pioneerPlaceId.setIsPotato(rg.a1.t0());
        if (dVar.b.assetFolderPath == null) {
            ek.q.e("rbx.appshell", "Asset folder path is null");
        } else {
            ek.q.h("rbx.appshell", "Asset folder path: " + dVar.b.assetFolderPath);
        }
        if (dVar.b.assetFolderPath == null) {
            throw new RuntimeException("Asset folder path is null");
        }
        if (rh.h.a().s3() && !this.f32951f) {
            throw new RuntimeException("AppBridge is not yet started");
        }
        NativeGLInterface.nativeAppBridgeV2InitWithParams(pioneerPlaceId.build());
    }

    public boolean l() {
        return this.f32950e;
    }

    public boolean m() {
        return this.f32949d;
    }

    public final /* synthetic */ Object n(Context context, h hVar) {
        s(context, hVar, true);
        return null;
    }

    public void o(final Context context, final h hVar) {
        ek.q.h("rbx.appshell", "ASMA.loadAllAppSettings()");
        LoggingProtocol.g("asset_unpack_begin");
        final ne.e0 e0VarH = ne.e0.H();
        if (rh.h.a().B2()) {
            kk.c.p().q().thenAccept(new Consumer() { // from class: uh.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.d(e0VarH, (String) obj);
                }
            });
        } else {
            kk.c.p().s(new Consumer() { // from class: uh.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.b(e0VarH, (String) obj);
                }
            });
        }
        ne.s.o(com.roblox.client.startup.a.i(context), e0VarH).a(new Callable() { // from class: uh.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f32944a.n(context, hVar);
            }
        }, ne.a0.a());
    }

    public void p(h hVar) {
        ek.q.b("rbx.appshell", "ASMA.loadSettings() " + this.f32948c);
        if (this.f32948c) {
            ek.q.b("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.a(0);
                return;
            }
            return;
        }
        w();
        AsyncTaskC0596f asyncTaskC0596f = new AsyncTaskC0596f(new b(hVar));
        this.f32954i = asyncTaskC0596f;
        asyncTaskC0596f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void q(String str) {
        ek.q.b("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f32950e = true;
        u(this.f32955j);
    }

    public void r() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    public final void s(Context context, h hVar, boolean z10) {
        if (rh.h.a().J2()) {
            LoggingProtocol.g("settings_join_resolved");
        }
        if (!z10) {
            hVar.a(1);
            return;
        }
        F(context);
        LoggingProtocol.g("update_setting_to_app_bridge_start");
        p(new a(hVar));
    }

    public void t() {
        ek.q.b("rbx.appshell", "ASMA.pause");
        if (this.f32949d) {
            ek.q.h("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (rg.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    public final void u(Vector<mk.b> vector) {
        while (!vector.isEmpty()) {
            mk.b bVarRemove = vector.remove(0);
            ek.q.b("rbx.appshell", "publishPendingReadyEvents() " + bVarRemove.f24878a + ", " + bVarRemove.b + ", " + bVarRemove.f24879c + ", " + bVarRemove.f24877d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(bVarRemove.f24878a, bVarRemove.b, bVarRemove.f24879c, bVarRemove.f24877d);
        }
    }

    public void v() {
        ek.q.b("rbx.appshell", "ASMA.reset()");
        this.b = false;
        this.f32949d = false;
        this.f32950e = false;
        this.f32953h = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        w();
        am.a.a().c();
    }

    public final void w() {
        AsyncTaskC0596f asyncTaskC0596f = this.f32954i;
        if (asyncTaskC0596f != null && !asyncTaskC0596f.isCancelled()) {
            ek.q.h("rbx.appshell", "ASMA.resetTask: Cancel the current (running) task...");
            asyncTaskC0596f.cancel(true);
        }
        this.f32954i = null;
    }

    public void x(Context context, Surface surface) {
        y(context, surface, null);
    }

    public void y(Context context, Surface surface, Activity activity) {
        ek.q.h("rbx.appshell", "ASMA.restart");
        f();
        k(rg.a1.E0() ? p.b(context, activity) : p.a(context));
        G(surface);
    }

    public void z() {
        h();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }
}
