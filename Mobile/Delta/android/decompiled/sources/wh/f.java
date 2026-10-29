package wh;

import ak.m2;
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
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class f implements wk.h.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34274f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f34276h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AsyncTaskC0628f f34277i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f34279k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34270a = "rbx.appshell";
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f34271c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f34272d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f34273e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f34275g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Vector<ok.b> f34278j = new Vector<>();

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f34280a;

        public a(h hVar) {
            this.f34280a = hVar;
        }

        @Override // wh.f.h
        public void a(int i10) {
            LoggingProtocol.g("update_setting_to_app_bridge_end");
            if (i10 == 0) {
                this.f34280a.a(0);
            } else {
                this.f34280a.a(1);
            }
        }
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f34281a;

        public b(h hVar) {
            this.f34281a = hVar;
        }

        @Override // wh.f.h
        public void a(int i10) {
            if (i10 == 0) {
                f.this.f34271c = true;
            }
            h hVar = this.f34281a;
            if (hVar != null) {
                hVar.a(i10);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f34282a;

        public c(d dVar) {
            this.f34282a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f34282a.f34283a);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f34283a;
        public PlatformParams b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DeviceParams f34284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f34285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f34286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f34287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f34288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f34289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f34290i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f34291j;

        public DeviceParams a() {
            return this.f34284c;
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

    /* JADX INFO: renamed from: wh.f$f, reason: collision with other inner class name */
    public static class AsyncTaskC0628f extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f34292a;
        public final String b = "rbx.appshell";

        public AsyncTaskC0628f(h hVar) {
            this.f34292a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            String strO;
            com.roblox.client.startup.b.C0149b c0149bU = com.roblox.client.startup.a.u();
            String strD = c0149bU.d();
            String strE = c0149bU.e();
            if (strD == null || strD.isEmpty()) {
                return 1;
            }
            if (nh.b.a()) {
                strO = com.roblox.client.startup.a.o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("overridePayload = ");
                sb2.append(strO);
                gk.p.b("rbx.appshell", sb2.toString() != null ? strO : "no overrides");
            } else {
                strO = new wj.a(RobloxApplication.f()).a();
            }
            return th.h.a().X5() ? Integer.valueOf(NativeGLInterface.nativeInitClientSettingsSigned(strD, strE, strO, a1.M())) : Integer.valueOf(NativeGLInterface.nativeInitClientSettings(strD, strO, a1.M()));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                NativeGLInterface.nativePostClientSettingsLoadedInitialization3(m2.a(RobloxApplication.f()));
                gk.p.h("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f34292a;
            if (hVar != null) {
                hVar.a(num.intValue());
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f34293a = new f();
    }

    public interface h {
        void a(int i10);
    }

    public static /* synthetic */ void b(me.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static /* synthetic */ void d(me.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static f j() {
        return g.f34293a;
    }

    public void A(ok.c cVar) {
        if (this.b) {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(cVar.f27448a, cVar.b, cVar.f27449c);
        } else {
            gk.p.k("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        }
    }

    public void B(boolean z10) {
        A(new ok.a(z10));
    }

    public void C(ok.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f34278j.add(bVar);
        if (l()) {
            u(this.f34278j);
        }
    }

    public void D(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f34279k = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    public void E() {
        this.f34274f = true;
    }

    public void F(Context context) {
        gk.p.b("rbx.appshell", "ASMA.setup() " + this.b);
        if (this.b) {
            a1.S0();
            return;
        }
        this.b = true;
        boolean zY2 = th.h.a().y2();
        if (zY2) {
            LoggingProtocol.g("update_native_settings_begin");
        }
        a1.V0();
        if (zY2) {
            LoggingProtocol.g("update_native_settings_end");
        }
        if (zY2) {
            LoggingProtocol.g("fmod_init_begin");
        }
        FMOD.init(context);
        if (zY2) {
            LoggingProtocol.g("fmod_init_end");
        }
        if (zY2) {
            LoggingProtocol.g("game_global_init_begin");
        }
        NativeGLInterface.nativeGameGlobalInit();
        if (zY2) {
            LoggingProtocol.g("game_global_init_end");
        }
        a1.U0();
        NativeGLInterface.nativeUpdateAdapterInit();
    }

    public void G(Surface surface) {
        if (this.f34272d) {
            this.f34275g = true;
            z();
            d dVarI = i();
            StartAppParams.Builder selectedTheme = StartAppParams.builder().setSurface(surface).setPlatformParams(dVarI.b).setAppStarterPlace(dVarI.f34285d).setAppStarterScript(dVarI.f34286e).setAppUserId(dVarI.f34287f).setIsUnder13(dVarI.f34288g).setUsername(dVarI.f34289h).setMembershipType(dVarI.f34290i).setSelectedTheme(dVarI.f34291j);
            if (a1.D0()) {
                selectedTheme.setVrContext(dVarI.f34283a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(selectedTheme.build());
            if (a1.D0()) {
                Executors.newSingleThreadExecutor().execute(new c(dVarI));
            }
        }
    }

    public void H() {
        gk.p.b("rbx.appshell", "ASMA.stop");
        if (this.f34272d && this.f34275g) {
            this.f34275g = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (sg.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.stop");
        }
    }

    public void I(Surface surface, float f10, int i10, int i11) {
        gk.p.b("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f34272d) {
            PlatformParams platformParams = new PlatformParams();
            platformParams.dpiScale = f10;
            platformParams.viewportWidthMm = i10;
            platformParams.viewportHeightMm = i11;
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(surface, platformParams);
        }
    }

    @Override // wk.h.d
    public void a() {
        gk.p.h("rbx.appshell", "onCookieChanged.");
        if (th.h.a().M1()) {
            wk.e.k();
        }
        a1.S0();
    }

    public void f() {
        synchronized (this) {
            g();
        }
    }

    public final void g() {
        if (this.f34272d) {
            gk.p.h("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        v();
    }

    public final void h() {
        e eVar = this.f34279k;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    public d i() {
        return this.f34276h;
    }

    public void k(d dVar) {
        gk.p.h("rbx.appshell", "ASMA.initializeDataModel: hasSettings:" + this.f34271c + ", isInitialized:" + this.f34272d + ", CrashWhenAppBridgeNotStarted:" + th.h.a().i3() + ", appBridgeStarted:" + this.f34274f);
        if (!this.f34271c || this.f34272d) {
            return;
        }
        h();
        gk.p.b("rbx.appshell", "ASMA.initializeDataModel()");
        this.f34276h = dVar;
        this.f34272d = true;
        String strG = a1.g();
        InitParams.Builder isTablet = InitParams.builder().setPlatformParams(dVar.b).setDeviceParams(dVar.f34284c).setBaseURL(strG).setUserAgent(a1.Z0()).setIsTablet(a1.r0());
        if (th.h.a().b1()) {
            isTablet.setBuildVariant(gk.h.a());
        }
        isTablet.setIsVrDevice(a1.q0());
        isTablet.setIsPotato(a1.t0());
        if (dVar.b.assetFolderPath == null) {
            gk.p.e("rbx.appshell", "Asset folder path is null");
        } else {
            gk.p.h("rbx.appshell", "Asset folder path: " + dVar.b.assetFolderPath);
        }
        if (dVar.b.assetFolderPath == null) {
            throw new RuntimeException("Asset folder path is null");
        }
        if (th.h.a().i3() && !this.f34274f) {
            throw new RuntimeException("AppBridge is not yet started");
        }
        NativeGLInterface.nativeAppBridgeV2InitWithParams(isTablet.build());
    }

    public boolean l() {
        return this.f34273e;
    }

    public boolean m() {
        return this.f34272d;
    }

    public final /* synthetic */ Object n(Context context, h hVar) {
        s(context, hVar, true);
        return null;
    }

    public void o(final Context context, final h hVar) {
        gk.p.h("rbx.appshell", "ASMA.loadAllAppSettings()");
        LoggingProtocol.g("asset_unpack_begin");
        final me.e0 e0VarH = me.e0.H();
        if (th.h.a().q2()) {
            mk.c.p().q().thenAccept(new Consumer() { // from class: wh.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.d(e0VarH, (String) obj);
                }
            });
        } else {
            mk.c.p().s(new Consumer() { // from class: wh.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.b(e0VarH, (String) obj);
                }
            });
        }
        me.s.o(com.roblox.client.startup.a.i(context), e0VarH).a(new Callable() { // from class: wh.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f34267a.n(context, hVar);
            }
        }, me.a0.a());
    }

    public void p(h hVar) {
        gk.p.b("rbx.appshell", "ASMA.loadSettings() " + this.f34271c);
        if (this.f34271c) {
            gk.p.b("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.a(0);
                return;
            }
            return;
        }
        w();
        AsyncTaskC0628f asyncTaskC0628f = new AsyncTaskC0628f(new b(hVar));
        this.f34277i = asyncTaskC0628f;
        asyncTaskC0628f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void q(String str) {
        gk.p.b("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f34273e = true;
        u(this.f34278j);
    }

    public void r() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    public final void s(Context context, h hVar, boolean z10) {
        if (th.h.a().y2()) {
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
        gk.p.b("rbx.appshell", "ASMA.pause");
        if (this.f34272d) {
            gk.p.h("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (sg.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    public final void u(Vector<ok.b> vector) {
        while (!vector.isEmpty()) {
            ok.b bVarRemove = vector.remove(0);
            gk.p.b("rbx.appshell", "publishPendingReadyEvents() " + bVarRemove.f27448a + ", " + bVarRemove.b + ", " + bVarRemove.f27449c + ", " + bVarRemove.f27447d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(bVarRemove.f27448a, bVarRemove.b, bVarRemove.f27449c, bVarRemove.f27447d);
        }
    }

    public void v() {
        gk.p.b("rbx.appshell", "ASMA.reset()");
        this.b = false;
        this.f34272d = false;
        this.f34273e = false;
        this.f34276h = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        w();
        cm.a.a().c();
    }

    public final void w() {
        AsyncTaskC0628f asyncTaskC0628f = this.f34277i;
        if (asyncTaskC0628f != null && !asyncTaskC0628f.isCancelled()) {
            gk.p.h("rbx.appshell", "ASMA.resetTask: Cancel the current (running) task...");
            asyncTaskC0628f.cancel(true);
        }
        this.f34277i = null;
    }

    public void x(Context context, Surface surface) {
        y(context, surface, null);
    }

    public void y(Context context, Surface surface, Activity activity) {
        gk.p.h("rbx.appshell", "ASMA.restart");
        f();
        k(a1.D0() ? p.b(context, activity) : p.a(context));
        G(surface);
    }

    public void z() {
        h();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }
}
