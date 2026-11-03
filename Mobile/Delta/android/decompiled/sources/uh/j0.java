package uh;

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

/* JADX INFO: loaded from: classes2.dex */
public class j0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m0 f32983a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public FrameLayout f32984c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public SurfaceView f32988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FrameLayout f32989h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public cj.k f32991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ExecutorService f32992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public w0 f32993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExperienceSession f32994m;
    public final String b = "rbx.game";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f32985d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f32986e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f32987f = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f32990i = -1;

    public j0(ExperienceSession experienceSession, m0 m0Var) {
        this.f32994m = experienceSession;
        this.f32993l = experienceSession;
        this.f32983a = m0Var;
    }

    public View A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        ek.q.b("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f32990i);
        if (!com.roblox.client.startup.a.m() && bundle != null) {
            ek.q.k("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f32993l.c();
            return null;
        }
        this.f32991j = rh.h.a().L1() ? dj.a0.R(l()) : dj.m.F0(l());
        this.f32989h = (FrameLayout) q().findViewById(rg.m0.f30435e);
        if (rg.a1.k0() && bundle != null && this.f32990i == 2) {
            ek.q.h("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f32990i = 0;
        }
        if (!rh.h.a().L0() || (viewStub = (ViewStub) this.f32989h.findViewById(rg.m0.U)) == null) {
            this.f32984c = (FrameLayout) this.f32989h.findViewById(rg.m0.T);
        } else {
            this.f32984c = (FrameLayout) viewStub.inflate();
        }
        s(null);
        kk.c.p().s(new Consumer() { // from class: uh.c0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f32941a.u((String) obj);
            }
        });
        return null;
    }

    public final void B(final Runnable runnable) {
        o().execute(new Runnable() { // from class: uh.g0
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    public final void C(m0 m0Var) {
        ek.q.h("rbx.game", "startGame");
        Surface surface = this.f32988g.getHolder().getSurface();
        ok.a aVar = new ok.a(p());
        aVar.isTablet = rg.a1.r0();
        this.f32993l.a(m0Var.f33017c);
        StartGameParams.Builder referredByPlayerId = StartGameParams.builder().setSurface(surface).setPlatformParams(aVar).setDeviceParams(null).setPlaceId(m0Var.f33017c).setUserId(m0Var.b).setAccessCode(m0Var.f33018d).setLinkCode(m0Var.f33019e).setGameId(m0Var.f33020f).setIsUnder13(dk.c.c().n()).setUsername(dk.c.c().k()).setConversationId(m0Var.f33021g).setReservedServerAccessCode(m0Var.f33022h).setCallId(m0Var.f33023i).setJoinRequestType(m0Var.f33016a).setReferralPage(m0Var.f33024j).setLaunchData(m0Var.f33025k).setJoinAttemptId(m0Var.f33028n).setJoinAttemptOrigin(m0Var.f33029o).setIsoContext(m0Var.f33030p).setReferredByPlayerId(m0Var.f33031q);
        if (rg.a1.E0()) {
            referredByPlayerId.setVrContext(q());
        }
        referredByPlayerId.setGameJoinContext(m0Var.f33026l);
        referredByPlayerId.setEventId(m0Var.f33027m);
        if (rh.h.a().D3()) {
            referredByPlayerId.setGameIdToExclude(m0Var.f33032r);
        }
        q().runOnUiThread(new Runnable() { // from class: uh.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32974a.v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(referredByPlayerId.build());
        q().runOnUiThread(new Runnable() { // from class: uh.i0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32982a.w();
            }
        });
        this.f32993l.b(m0Var.f33017c);
    }

    public void D() {
        B(new Runnable() { // from class: uh.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32946a.x();
            }
        });
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void x() {
        ek.q.h("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f32990i + ", graphicsStarted = " + this.f32987f);
        this.f32988g.getHolder().removeCallback(this);
        this.f32990i = -1;
    }

    public final void F() {
        ek.q.h("rbx.game", "surfaceDestroyed: surfaceState = " + this.f32990i + ", graphicsStarted = " + this.f32987f);
        if (this.f32990i != 2) {
            return;
        }
        if (this.f32987f) {
            this.f32987f = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        com.roblox.client.a aVarQ = q();
        if (aVarQ == null || aVarQ.isFinishing()) {
            return;
        }
        ek.q.h("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f32994m.a0();
    }

    public final void G() {
        ek.q.h("rbx.game", "updateSurface() surfaceState = " + this.f32990i);
        com.roblox.client.a aVarQ = q();
        if (aVarQ == null || aVarQ.isFinishing() || aVarQ.isDestroyed()) {
            ek.q.h("rbx.game", "updateSurface() activity finishing ignore update");
            return;
        }
        int i10 = this.f32990i;
        if (i10 == 0) {
            this.f32990i = 2;
            this.f32987f = true;
            C(this.f32983a);
            return;
        }
        if (i10 == 2) {
            Surface surface = this.f32988g.getHolder().getSurface();
            PlatformParams platformParams = new PlatformParams();
            float fM = m();
            Point pointI = cl.a.i(n().K());
            platformParams.dpiScale = fM;
            platformParams.viewportWidthMm = pointI.x;
            platformParams.viewportHeightMm = pointI.y;
            if (this.f32987f) {
                ek.q.h("rbx.game", "updateSurface: nativeUpdateGraphics");
                NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(surface, platformParams, rg.a1.q0() ? q() : null);
            } else {
                ek.q.h("rbx.game", "updateSurface: nativeStartUpGraphics");
                this.f32987f = true;
                NativeGLInterface.nativeAppBridgeV2ResumeGameWithPlatformParams(surface, platformParams, rg.a1.q0() ? q() : null);
            }
        }
    }

    public void j() {
        B(new Runnable() { // from class: uh.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32936a.t();
            }
        });
    }

    public FrameLayout k() {
        return this.f32989h;
    }

    public Context l() {
        return n().K();
    }

    public float m() {
        return cl.a.e(n().K());
    }

    public ExperienceSession n() {
        return this.f32994m;
    }

    public final ExecutorService o() {
        if (this.f32992k == null) {
            this.f32992k = Executors.newSingleThreadExecutor();
        }
        return this.f32992k;
    }

    public final PlatformParams p() {
        String strR = kk.c.p().r();
        ek.q.b("rbx.game", "getPlatformParams: assetFolderPath = " + strR);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strR;
        platformParams.isTouchDevice = q().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m();
        Point pointI = cl.a.i(n().K());
        platformParams.viewportWidthMm = pointI.x;
        platformParams.viewportHeightMm = pointI.y;
        return platformParams;
    }

    public com.roblox.client.a q() {
        return (com.roblox.client.a) this.f32994m.J();
    }

    public SurfaceView r() {
        return this.f32988g;
    }

    public final void s(View view) {
        ek.q.b("rbx.game", "initSurfaceView: ...");
        SurfaceView surfaceView = (SurfaceView) q().findViewById(rg.m0.f30444i0);
        this.f32988g = surfaceView;
        surfaceView.setFocusable(true);
        this.f32988g.setFocusableInTouchMode(true);
        this.f32988g.getHolder().addCallback(this);
        if (n().O()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        ek.q.h("rbx.game", "surfaceChanged: ...");
        B(new Runnable() { // from class: uh.f0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32971a.G();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ek.q.h("rbx.game", "surfaceCreated: ...");
        B(new Runnable() { // from class: uh.b0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32939a.y();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f32992k.submit(new Runnable() { // from class: uh.d0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f32943a.z();
                }
            }).get();
        } catch (Exception unused) {
            ek.q.h("rbx.game", "game thread times out");
        }
    }

    public final /* synthetic */ void t() {
        x();
        NativeGLInterface.nativeAppBridgeV2LeaveGame();
    }

    public final /* synthetic */ void u(String str) {
        this.f32988g.setVisibility(0);
    }

    public final /* synthetic */ void v() {
        FrameLayout frameLayout = this.f32984c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public final /* synthetic */ void w() {
        FrameLayout frameLayout;
        if (q().isDestroyed() || (frameLayout = this.f32984c) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    public final /* synthetic */ void y() {
        this.f32994m.Z();
    }

    public final /* synthetic */ void z() {
        if (q() == null) {
            return;
        }
        F();
    }
}
