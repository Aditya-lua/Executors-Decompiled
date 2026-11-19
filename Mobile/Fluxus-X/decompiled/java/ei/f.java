package ei;

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
import ik.t2;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import org.fmod.FMOD;

/* JADX INFO: loaded from: classes2.dex */
public class f implements dl.h.d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13689f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public d f13691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AsyncTaskC0263f f13692i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f13694k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13685a = "rbx.appshell";
    public boolean b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13686c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13687d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13688e = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13690g = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Vector<wk.b> f13693j = new Vector<>();

    public class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f13695a;

        public a(h hVar) {
            this.f13695a = hVar;
        }

        @Override // ei.f.h
        public void a(int i10) {
            LoggingProtocol.g("update_setting_to_app_bridge_end");
            if (i10 == 0) {
                this.f13695a.a(0);
            } else {
                this.f13695a.a(1);
            }
        }
    }

    public class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f13696a;

        public b(h hVar) {
            this.f13696a = hVar;
        }

        @Override // ei.f.h
        public void a(int i10) {
            if (i10 == 0) {
                f.this.f13686c = true;
            }
            h hVar = this.f13696a;
            if (hVar != null) {
                hVar.a(i10);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d f13697a;

        public c(d dVar) {
            this.f13697a = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            NativeGLInterface.initMaquettesSDK(this.f13697a.f13698a);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Activity f13698a;
        public PlatformParams b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public DeviceParams f13699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f13700d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f13701e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f13702f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f13703g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f13704h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13705i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f13706j;

        public DeviceParams a() {
            return this.f13699c;
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

    /* JADX INFO: renamed from: ei.f$f, reason: collision with other inner class name */
    public static class AsyncTaskC0263f extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public h f13707a;
        public final String b = "rbx.appshell";

        public AsyncTaskC0263f(h hVar) {
            this.f13707a = hVar;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            String strO;
            com.roblox.client.startup.b.C0155b c0155bU = com.roblox.client.startup.a.u();
            String strD = c0155bU.d();
            String strE = c0155bU.e();
            if (strD == null || strD.isEmpty()) {
                return 1;
            }
            if (wh.b.a()) {
                strO = com.roblox.client.startup.a.o();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("overridePayload = ");
                sb2.append(strO);
                ok.q.b("rbx.appshell", sb2.toString() != null ? strO : "no overrides");
            } else {
                strO = new ek.a(RobloxApplication.f()).a();
            }
            return bi.h.a().e6() ? Integer.valueOf(NativeGLInterface.nativeInitClientSettingsSigned(strD, strE, strO, bh.a1.M())) : Integer.valueOf(NativeGLInterface.nativeInitClientSettings(strD, strO, bh.a1.M()));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer num) {
            if (num.intValue() == 0) {
                NativeGLInterface.nativePostClientSettingsLoadedInitialization3(t2.a(RobloxApplication.f()));
                ok.q.h("rbx.appshell", "GetClientSettingsTask onPostExecute initialized TaskScheduler");
            }
            h hVar = this.f13707a;
            if (hVar != null) {
                hVar.a(num.intValue());
            }
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f13708a = new f();
    }

    public interface h {
        void a(int i10);
    }

    public static /* synthetic */ void b(pe.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static /* synthetic */ void d(pe.e0 e0Var, String str) {
        LoggingProtocol.g("asset_unpack_end");
        e0Var.D(null);
    }

    public static f j() {
        return g.f13708a;
    }

    public void A(wk.c cVar) {
        if (this.b || (this.f13687d && bi.h.a().o2())) {
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnGameLoaded(cVar.f35884a, cVar.b, cVar.f35885c);
        } else {
            ok.q.k("rbx.appshell", "ASMA.sendAppEventOnGameLoaded: The manager is not yet setup. Ignore.");
        }
    }

    public void B(boolean z10) {
        A(new wk.a(z10));
    }

    public void C(wk.b bVar) {
        if (bVar == null) {
            return;
        }
        this.f13693j.add(bVar);
        if (l()) {
            u(this.f13693j);
        }
    }

    public void D(EngineJavaCallback2 engineJavaCallback2) {
        e eVar = new e(engineJavaCallback2);
        this.f13694k = eVar;
        NativeGLJavaInterface.setImplementation(eVar);
    }

    public void E() {
        this.f13689f = true;
    }

    public void F(Context context) {
        ok.q.b("rbx.appshell", "ASMA.setup() " + this.b);
        if (this.b) {
            bh.a1.T0();
            return;
        }
        this.b = true;
        boolean zL2 = bi.h.a().L2();
        if (zL2) {
            LoggingProtocol.g("update_native_settings_begin");
        }
        bh.a1.W0();
        if (zL2) {
            LoggingProtocol.g("update_native_settings_end");
        }
        if (zL2) {
            LoggingProtocol.g("fmod_init_begin");
        }
        FMOD.init(context);
        if (zL2) {
            LoggingProtocol.g("fmod_init_end");
        }
        if (zL2) {
            LoggingProtocol.g("game_global_init_begin");
        }
        NativeGLInterface.nativeGameGlobalInit();
        if (zL2) {
            LoggingProtocol.g("game_global_init_end");
        }
        bh.a1.V0();
        NativeGLInterface.nativeUpdateAdapterInit();
    }

    public void G(Surface surface) {
        if (this.f13687d) {
            this.f13690g = true;
            z();
            d dVarI = i();
            StartAppParams.a aVarH = StartAppParams.builder().i(surface).g(dVarI.b).b(dVarI.f13700d).c(dVarI.f13701e).d(dVarI.f13702f).e(dVarI.f13703g).j(dVarI.f13704h).f(dVarI.f13705i).h(dVarI.f13706j);
            if (bh.a1.E0()) {
                aVarH.k(dVarI.f13698a);
            }
            NativeGLInterface.nativeAppBridgeV2StartAppWithParams(aVarH.a());
            if (bh.a1.E0()) {
                Executors.newSingleThreadExecutor().execute(new c(dVarI));
            }
        }
    }

    public void H() {
        ok.q.b("rbx.appshell", "ASMA.stop");
        if (this.f13687d && this.f13690g) {
            this.f13690g = false;
            NativeGLInterface.nativeAppBridgeV2PauseApp();
            if (bh.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.stop");
        }
    }

    public void I(Surface surface, float f10, int i10, int i11) {
        ok.q.b("rbx.appshell", "ASMA.updateWindowHandle");
        if (this.f13687d) {
            PlatformParams platformParams = new PlatformParams();
            platformParams.dpiScale = f10;
            platformParams.viewportWidthMm = i10;
            platformParams.viewportHeightMm = i11;
            NativeGLInterface.nativeAppBridgeV2UpdateSurfaceAppWithPlatformParams(surface, platformParams);
        }
    }

    @Override // dl.h.d
    public void a() {
        ok.q.h("rbx.appshell", "onCookieChanged.");
        if (bi.h.a().W1()) {
            bh.a1.C0();
        }
        bh.a1.T0();
    }

    public void f() {
        synchronized (this) {
            g();
        }
    }

    public final void g() {
        if (this.f13687d) {
            ok.q.h("rbx.appshell", "ASMA.destroy() ....");
            NativeGLInterface.nativeAppBridgeV2DestroyApp();
        }
        v();
    }

    public final void h() {
        e eVar = this.f13694k;
        if (eVar != null) {
            NativeGLJavaInterface.setImplementation(eVar);
        }
    }

    public d i() {
        return this.f13691h;
    }

    public void k(d dVar) {
        ok.q.h("rbx.appshell", "ASMA.initializeDataModel: hasSettings:" + this.f13686c + ", isInitialized:" + this.f13687d + ", CrashWhenAppBridgeNotStarted:" + bi.h.a().v3() + ", appBridgeStarted:" + this.f13689f);
        if (!this.f13686c || this.f13687d) {
            return;
        }
        h();
        ok.q.b("rbx.appshell", "ASMA.initializeDataModel()");
        this.f13691h = dVar;
        this.f13687d = true;
        String strG = bh.a1.g();
        InitParams.a aVarH = InitParams.builder().i(dVar.b).d(dVar.f13699c).b(strG).j(bh.a1.a1()).f(bh.a1.r0()).h(0L);
        if (bi.h.a().j1()) {
            aVarH.c(ok.h.a());
        }
        aVarH.g(bh.a1.q0());
        aVarH.e(bh.a1.t0());
        if (dVar.b.assetFolderPath == null) {
            ok.q.e("rbx.appshell", "Asset folder path is null");
        } else {
            ok.q.h("rbx.appshell", "Asset folder path: " + dVar.b.assetFolderPath);
        }
        if (dVar.b.assetFolderPath == null) {
            throw new RuntimeException("Asset folder path is null");
        }
        if (bi.h.a().v3() && !this.f13689f) {
            throw new RuntimeException("AppBridge is not yet started");
        }
        NativeGLInterface.nativeAppBridgeV2InitWithParams(aVarH.a());
    }

    public boolean l() {
        return this.f13688e;
    }

    public boolean m() {
        return this.f13687d;
    }

    public final /* synthetic */ Object n(Context context, h hVar) {
        s(context, hVar, true);
        return null;
    }

    public void o(final Context context, final h hVar) {
        ok.q.h("rbx.appshell", "ASMA.loadAllAppSettings()");
        LoggingProtocol.g("asset_unpack_begin");
        final pe.e0 e0VarH = pe.e0.H();
        if (bi.h.a().D2()) {
            uk.c.p().q().thenAccept(new Consumer() { // from class: ei.c
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.d(e0VarH, (String) obj);
                }
            });
        } else {
            uk.c.p().s(new Consumer() { // from class: ei.d
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    f.b(e0VarH, (String) obj);
                }
            });
        }
        pe.s.o(com.roblox.client.startup.a.i(context), e0VarH).a(new Callable() { // from class: ei.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f13682a.n(context, hVar);
            }
        }, pe.a0.a());
    }

    public void p(h hVar) {
        ok.q.b("rbx.appshell", "ASMA.loadSettings() " + this.f13686c);
        if (this.f13686c) {
            ok.q.b("rbx.appshell", "ASMA.loadSettings() ... skipping because Init already does it!");
            if (hVar != null) {
                hVar.a(0);
                return;
            }
            return;
        }
        w();
        AsyncTaskC0263f asyncTaskC0263f = new AsyncTaskC0263f(new b(hVar));
        this.f13692i = asyncTaskC0263f;
        asyncTaskC0263f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public void q(String str) {
        ok.q.b("rbx.appshell", "ASMA.onAppReady() " + str);
        this.f13688e = true;
        u(this.f13693j);
    }

    public void r() {
        NativeGLInterface.nativeHandleBackPressed();
    }

    public final void s(Context context, h hVar, boolean z10) {
        if (bi.h.a().L2()) {
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
        ok.q.b("rbx.appshell", "ASMA.pause");
        if (this.f13687d) {
            ok.q.h("rbx.appshell", "ASMA.pause(): Do nothing in AppBridge refactor!");
            if (bh.y.h().f().i()) {
                return;
            }
            NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ASMA.pause");
        }
    }

    public final void u(Vector<wk.b> vector) {
        while (!vector.isEmpty()) {
            wk.b bVarRemove = vector.remove(0);
            ok.q.b("rbx.appshell", "publishPendingReadyEvents() " + bVarRemove.f35884a + ", " + bVarRemove.b + ", " + bVarRemove.f35885c + ", " + bVarRemove.f35883d);
            NativeGLInterface.nativeAppBridgeV2SendAppEventOnAppReady(bVarRemove.f35884a, bVarRemove.b, bVarRemove.f35885c, bVarRemove.f35883d);
        }
    }

    public void v() {
        ok.q.b("rbx.appshell", "ASMA.reset()");
        this.b = false;
        this.f13687d = false;
        this.f13688e = false;
        this.f13691h = null;
        NativeGLJavaInterface.replaceImplementation(e.class, new EngineJavaCallback2());
        w();
        qm.a.a().c();
    }

    public final void w() {
        AsyncTaskC0263f asyncTaskC0263f = this.f13692i;
        if (asyncTaskC0263f != null && !asyncTaskC0263f.isCancelled()) {
            ok.q.h("rbx.appshell", "ASMA.resetTask: Cancel the current (running) task...");
            asyncTaskC0263f.cancel(true);
        }
        this.f13692i = null;
    }

    public void x(Context context, Surface surface) {
        y(context, surface, null);
    }

    public void y(Context context, Surface surface, Activity activity) {
        ok.q.h("rbx.appshell", "ASMA.restart");
        f();
        k(bh.a1.E0() ? p.b(context, activity) : p.a(context));
        G(surface);
    }

    public void z() {
        h();
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ASMA.start");
    }
}
