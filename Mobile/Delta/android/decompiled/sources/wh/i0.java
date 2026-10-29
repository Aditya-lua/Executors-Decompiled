package wh;

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
import com.roblox.client.game.ExperienceSession;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.PlatformParams;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class i0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f34305a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f34306c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceView f34310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f34311h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ej.g f34313j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ExecutorService f34314k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public v0 f34315l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExperienceSession f34316m;
    public final String b = "rbx.game";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f34307d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f34308e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34309f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34312i = -1;

    public i0(ExperienceSession experienceSession, l0 l0Var) {
        this.f34316m = experienceSession;
        this.f34315l = experienceSession;
        this.f34305a = l0Var;
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        gk.p.b("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f34312i);
        if (!com.roblox.client.startup.a.m() && bundle != null) {
            gk.p.k("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f34315l.c();
            return null;
        }
        this.f34313j = th.h.a().B1() ? fj.a0.R(l()) : fj.m.F0(l());
        this.f34311h = (FrameLayout) q().findViewById(sg.m0.f30832e);
        if (a1.k0() && bundle != null && this.f34312i == 2) {
            gk.p.h("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f34312i = 0;
        }
        if (!th.h.a().G0() || (viewStub = (ViewStub) this.f34311h.findViewById(sg.m0.T)) == null) {
            this.f34306c = (FrameLayout) this.f34311h.findViewById(sg.m0.S);
        } else {
            this.f34306c = (FrameLayout) viewStub.inflate();
        }
        s(null);
        mk.c.p().s(new Consumer() { // from class: wh.b0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f34262a.u((String) obj);
            }
        });
        return null;
    }

    public final void B(final Runnable runnable) {
        o().execute(new Runnable() { // from class: wh.f0
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public final void C(l0 l0Var) {
        gk.p.h("rbx.game", "startGame");
        Surface surface = this.f34310g.getHolder().getSurface();
        qk.a aVar = new qk.a(p());
        aVar.isTablet = a1.r0();
        this.f34315l.a(l0Var.f34338c);
        StartGameParams.Builder referredByPlayerId = StartGameParams.builder().setSurface(surface).setPlatformParams(aVar).setDeviceParams(null).setPlaceId(l0Var.f34338c).setUserId(l0Var.b).setAccessCode(l0Var.f34339d).setLinkCode(l0Var.f34340e).setGameId(l0Var.f34341f).setIsUnder13(fk.c.c().n()).setUsername(fk.c.c().k()).setConversationId(l0Var.f34342g).setReservedServerAccessCode(l0Var.f34343h).setCallId(l0Var.f34344i).setJoinRequestType(l0Var.f34337a).setReferralPage(l0Var.f34345j).setLaunchData(l0Var.f34346k).setJoinAttemptId(l0Var.f34349n).setJoinAttemptOrigin(l0Var.f34350o).setIsoContext(l0Var.f34351p).setReferredByPlayerId(l0Var.f34352q);
        if (a1.D0()) {
            referredByPlayerId.setVrContext(q());
        }
        referredByPlayerId.setGameJoinContext(l0Var.f34347l);
        referredByPlayerId.setEventId(l0Var.f34348m);
        if (th.h.a().r3()) {
            referredByPlayerId.setGameIdToExclude(l0Var.f34353r);
        }
        q().runOnUiThread(new Runnable() { // from class: wh.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34296a.v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(referredByPlayerId.build());
        q().runOnUiThread(new Runnable() { // from class: wh.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34297a.w();
            }
        });
        this.f34315l.b(l0Var.f34338c);
    }

    public void D() {
        B(new Runnable() { // from class: wh.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34266a.x();
            }
        });
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void x() {
        gk.p.h("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f34312i + ", graphicsStarted = " + this.f34309f);
        this.f34310g.getHolder().removeCallback(this);
        this.f34312i = -1;
    }

    public final void F() {
        gk.p.h("rbx.game", "surfaceDestroyed: surfaceState = " + this.f34312i + ", graphicsStarted = " + this.f34309f);
        if (this.f34312i != 2) {
            return;
        }
        if (this.f34309f) {
            this.f34309f = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        com.roblox.client.a aVarQ = q();
        if (aVarQ == null || aVarQ.isFinishing()) {
            return;
        }
        gk.p.h("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f34316m.Y();
    }

    public final void G() {
        gk.p.h("rbx.game", "updateSurface() surfaceState = " + this.f34312i);
        com.roblox.client.a aVarQ = q();
        if (aVarQ == null || aVarQ.isFinishing() || aVarQ.isDestroyed()) {
            gk.p.h("rbx.game", "updateSurface() activity finishing ignore update");
            return;
        }
        int i10 = this.f34312i;
        if (i10 == 0) {
            this.f34312i = 2;
            this.f34309f = true;
            C(this.f34305a);
            return;
        }
        if (i10 == 2) {
            Surface surface = this.f34310g.getHolder().getSurface();
            PlatformParams platformParams = new PlatformParams();
            float fM = m();
            Point pointI = el.a.i(n().I());
            platformParams.dpiScale = fM;
            platformParams.viewportWidthMm = pointI.x;
            platformParams.viewportHeightMm = pointI.y;
            if (this.f34309f) {
                gk.p.h("rbx.game", "updateSurface: nativeUpdateGraphics");
                NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(surface, platformParams, a1.q0() ? q() : null);
            } else {
                gk.p.h("rbx.game", "updateSurface: nativeStartUpGraphics");
                this.f34309f = true;
                NativeGLInterface.nativeAppBridgeV2ResumeGameWithPlatformParams(surface, platformParams, a1.q0() ? q() : null);
            }
        }
    }

    public void j() {
        B(new Runnable() { // from class: wh.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f34399a.t();
            }
        });
    }

    public FrameLayout k() {
        return this.f34311h;
    }

    public Context l() {
        return n().I();
    }

    public float m() {
        return el.a.e(n().I());
    }

    public ExperienceSession n() {
        return this.f34316m;
    }

    public final ExecutorService o() {
        if (this.f34314k == null) {
            this.f34314k = Executors.newSingleThreadExecutor();
        }
        return this.f34314k;
    }

    public final PlatformParams p() {
        String strR = mk.c.p().r();
        gk.p.b("rbx.game", "getPlatformParams: assetFolderPath = " + strR);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strR;
        platformParams.isTouchDevice = q().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m();
        Point pointI = el.a.i(n().I());
        platformParams.viewportWidthMm = pointI.x;
        platformParams.viewportHeightMm = pointI.y;
        return platformParams;
    }

    public com.roblox.client.a q() {
        return (com.roblox.client.a) this.f34316m.H();
    }

    public SurfaceView r() {
        return this.f34310g;
    }

    public final void s(View view) {
        gk.p.b("rbx.game", "initSurfaceView: ...");
        SurfaceView surfaceView = (SurfaceView) q().findViewById(sg.m0.f30839h0);
        this.f34310g = surfaceView;
        surfaceView.setFocusable(true);
        this.f34310g.setFocusableInTouchMode(true);
        this.f34310g.getHolder().addCallback(this);
        if (n().M()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        gk.p.h("rbx.game", "surfaceChanged: ...");
        B(new Runnable() { // from class: wh.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34269a.G();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        gk.p.h("rbx.game", "surfaceCreated: ...");
        B(new Runnable() { // from class: wh.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f34261a.y();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f34314k.submit(new Runnable() { // from class: wh.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34264a.z();
                }
            }).get();
        } catch (Exception unused) {
            gk.p.h("rbx.game", "game thread times out");
        }
    }

    public final /* synthetic */ void t() {
        x();
        NativeGLInterface.nativeAppBridgeV2LeaveGame();
    }

    public final /* synthetic */ void u(String str) {
        this.f34310g.setVisibility(0);
    }

    public final /* synthetic */ void v() {
        FrameLayout frameLayout = this.f34306c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final /* synthetic */ void w() {
        FrameLayout frameLayout;
        if (q().isDestroyed() || (frameLayout = this.f34306c) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final /* synthetic */ void y() {
        this.f34316m.X();
    }

    public final /* synthetic */ void z() {
        if (q() == null) {
            return;
        }
        F();
    }
}
