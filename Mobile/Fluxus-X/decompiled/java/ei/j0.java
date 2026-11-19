package ei;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.game.ExperienceSession;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.PlatformParams;
import com.roblox.platform.util.DeviceUtils;
import ik.s2;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f13721a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f13722c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceView f13726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f13727h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public mj.k f13729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ExecutorService f13730k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w0 f13731l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExperienceSession f13732m;
    public final String b = "rbx.game";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f13723d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f13724e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f13725f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13728i = -1;

    public j0(ExperienceSession experienceSession, m0 m0Var) {
        this.f13732m = experienceSession;
        this.f13731l = experienceSession;
        this.f13721a = m0Var;
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        ok.q.b("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f13728i);
        if (!com.roblox.client.startup.a.m() && bundle != null) {
            ok.q.k("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f13731l.q();
            return null;
        }
        this.f13729j = bi.h.a().L1() ? nj.a0.R(l()) : nj.m.F0(l());
        this.f13727h = (FrameLayout) q().findViewById(bh.m0.f4136e);
        if (bh.a1.k0() && bundle != null && this.f13728i == 2) {
            ok.q.h("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f13728i = 0;
        }
        if (!bi.h.a().O0() || (viewStub = (ViewStub) this.f13727h.findViewById(bh.m0.V)) == null) {
            this.f13722c = (FrameLayout) this.f13727h.findViewById(bh.m0.U);
        } else {
            this.f13722c = (FrameLayout) viewStub.inflate();
        }
        s(null);
        uk.c.p().s(new Consumer() { // from class: ei.b0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f13677a.u((String) obj);
            }
        });
        return null;
    }

    public final void B(final Runnable runnable) {
        o().execute(new Runnable() { // from class: ei.g0
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public final void C(m0 m0Var) {
        ok.q.h("rbx.game", "startGame");
        Surface surface = this.f13726g.getHolder().getSurface();
        com.roblox.engine.jni.model.a aVar = new com.roblox.engine.jni.model.a(p());
        aVar.f9665d = bh.a1.r0();
        this.f13731l.b(m0Var.f13755c);
        StartGameParams.a aVarU = StartGameParams.builder().w(surface).s(aVar).f(null).r(m0Var.f13755c).x(m0Var.b).c(m0Var.f13756d).q(m0Var.f13757e).h(m0Var.f13758f).k(nk.c.c().n()).y(nk.c.c().k()).e(m0Var.f13759g).v(m0Var.f13760h).d(m0Var.f13761i).o(m0Var.f13754a).t(m0Var.f13762j).p(m0Var.f13763k).m(m0Var.f13766n).n(m0Var.f13767o).l(m0Var.f13768p).u(m0Var.f13769q);
        if (bh.a1.E0()) {
            aVarU.z(q());
        }
        aVarU.j(m0Var.f13764l);
        aVarU.g(m0Var.f13765m);
        if (bi.h.a().H3()) {
            aVarU.i(m0Var.f13770r);
        }
        q().runOnUiThread(new Runnable() { // from class: ei.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13712a.v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(aVarU.b());
        q().runOnUiThread(new Runnable() { // from class: ei.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13720a.w();
            }
        });
        this.f13731l.e(m0Var.f13755c);
    }

    public void D() {
        B(new Runnable() { // from class: ei.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13684a.x();
            }
        });
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void x() {
        ok.q.h("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f13728i + ", graphicsStarted = " + this.f13725f);
        this.f13726g.getHolder().removeCallback(this);
        this.f13728i = -1;
    }

    public final void F() {
        ok.q.h("rbx.game", "surfaceDestroyed: surfaceState = " + this.f13728i + ", graphicsStarted = " + this.f13725f);
        if (this.f13728i != 2) {
            return;
        }
        if (this.f13725f) {
            this.f13725f = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        com.roblox.client.a aVarQ = q();
        if (aVarQ == null || aVarQ.isFinishing()) {
            return;
        }
        ok.q.h("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f13732m.b0();
    }

    public final void G() {
        ok.q.h("rbx.game", "updateSurface() surfaceState = " + this.f13728i);
        com.roblox.client.a aVarQ = q();
        if (aVarQ == null || aVarQ.isFinishing() || aVarQ.isDestroyed()) {
            ok.q.h("rbx.game", "updateSurface() activity finishing ignore update");
            return;
        }
        int i10 = this.f13728i;
        if (i10 == 0) {
            this.f13728i = 2;
            this.f13725f = true;
            C(this.f13721a);
            return;
        }
        if (i10 == 2) {
            Surface surface = this.f13726g.getHolder().getSurface();
            PlatformParams platformParams = new PlatformParams();
            float fM = m();
            Point screenPhysicalSizeInMillimeters = DeviceUtils.getScreenPhysicalSizeInMillimeters(n().L());
            platformParams.dpiScale = fM;
            platformParams.viewportWidthMm = screenPhysicalSizeInMillimeters.x;
            platformParams.viewportHeightMm = screenPhysicalSizeInMillimeters.y;
            if (this.f13725f) {
                ok.q.h("rbx.game", "updateSurface: nativeUpdateGraphics");
                NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(surface, platformParams, bh.a1.q0() ? q() : null);
            } else {
                ok.q.h("rbx.game", "updateSurface: nativeStartUpGraphics");
                this.f13725f = true;
                NativeGLInterface.nativeAppBridgeV2ResumeGameWithPlatformParams(surface, platformParams, bh.a1.q0() ? q() : null);
            }
        }
    }

    public void j(final boolean z10) {
        B(new Runnable() { // from class: ei.c0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13679a.t(z10);
            }
        });
    }

    public FrameLayout k() {
        return this.f13727h;
    }

    public Context l() {
        return n().L();
    }

    public float m() {
        return DeviceUtils.getScreenDensity(n().L());
    }

    public ExperienceSession n() {
        return this.f13732m;
    }

    public final ExecutorService o() {
        if (this.f13730k == null) {
            this.f13730k = Executors.newSingleThreadExecutor();
        }
        return this.f13730k;
    }

    public final PlatformParams p() {
        String strR = uk.c.p().r();
        ok.q.b("rbx.game", "getPlatformParams: assetFolderPath = " + strR);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strR;
        platformParams.isTouchDevice = q().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m();
        Point screenPhysicalSizeInMillimeters = DeviceUtils.getScreenPhysicalSizeInMillimeters(n().L());
        platformParams.viewportWidthMm = screenPhysicalSizeInMillimeters.x;
        platformParams.viewportHeightMm = screenPhysicalSizeInMillimeters.y;
        return platformParams;
    }

    public com.roblox.client.a q() {
        return (com.roblox.client.a) this.f13732m.K();
    }

    public SurfaceView r() {
        return this.f13726g;
    }

    public final void s(View view) {
        ok.q.b("rbx.game", "initSurfaceView: ...");
        SurfaceView surfaceView = (SurfaceView) q().findViewById(bh.m0.f4149k0);
        this.f13726g = surfaceView;
        surfaceView.setFocusable(true);
        this.f13726g.setFocusableInTouchMode(true);
        this.f13726g.getHolder().addCallback(this);
        if (n().P()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ok.q.h("rbx.game", "surfaceChanged: ...");
        B(new Runnable() { // from class: ei.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13709a.G();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ok.q.h("rbx.game", "surfaceCreated: ...");
        B(new Runnable() { // from class: ei.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13674a.y();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f13730k.submit(new Runnable() { // from class: ei.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13681a.z();
                }
            }).get();
        } catch (Exception unused) {
            ok.q.h("rbx.game", "game thread times out");
        }
    }

    public final /* synthetic */ void t(boolean z10) {
        x();
        if (bi.h.a().a6() && z10 && s2.b()) {
            NativeGLInterface.nativeAppBridgeV2LeaveGameAfterIdle();
        } else {
            NativeGLInterface.nativeAppBridgeV2LeaveGame();
        }
    }

    public final /* synthetic */ void u(String str) {
        this.f13726g.setVisibility(0);
    }

    public final /* synthetic */ void v() {
        FrameLayout frameLayout = this.f13722c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final /* synthetic */ void w() {
        FrameLayout frameLayout;
        if (q().isDestroyed() || (frameLayout = this.f13722c) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final /* synthetic */ void y() {
        this.f13732m.a0();
    }

    public final /* synthetic */ void z() {
        if (q() == null) {
            return;
        }
        F();
    }
}
