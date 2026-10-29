package p517wh;

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
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.game.ExperienceSession;
import com.roblox.client.startup.C3272a;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.autovalue.StartGameParams;
import com.roblox.engine.jni.model.PlatformParams;
import fj.C5613a0;
import fj.C5636m;
import fk.C5654c;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import mk.C8569c;
import p105ej.InterfaceC5149g;
import p107el.C5160a;
import p151gk.C6124q;
import p385qk.C10593a;
import sg.C11295a1;
import sg.C11335m0;
import th.C11659h;

/* JADX INFO: renamed from: wh.i0 */
/* JADX INFO: loaded from: classes2.dex */
public class SurfaceHolderCallbackC12440i0 implements SurfaceHolder.Callback {

    /* JADX INFO: renamed from: a */
    public C12446l0 f44491a;

    /* JADX INFO: renamed from: c */
    public FrameLayout f44493c;

    /* JADX INFO: renamed from: g */
    public SurfaceView f44497g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f44498h;

    /* JADX INFO: renamed from: j */
    public InterfaceC5149g f44500j;

    /* JADX INFO: renamed from: k */
    public ExecutorService f44501k;

    /* JADX INFO: renamed from: l */
    public InterfaceC12466v0 f44502l;

    /* JADX INFO: renamed from: m */
    public ExperienceSession f44503m;

    /* JADX INFO: renamed from: b */
    public final String f44492b = "rbx.game";

    /* JADX INFO: renamed from: d */
    public long f44494d = 0;

    /* JADX INFO: renamed from: e */
    public String f44495e = "";

    /* JADX INFO: renamed from: f */
    public boolean f44496f = false;

    /* JADX INFO: renamed from: i */
    public int f44499i = -1;

    public SurfaceHolderCallbackC12440i0(ExperienceSession experienceSession, C12446l0 c12446l0) {
        this.f44503m = experienceSession;
        this.f44502l = experienceSession;
        this.f44491a = c12446l0;
    }

    /* JADX INFO: renamed from: A */
    public View m46601A(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewStub viewStub;
        C6124q.m27057b("rbx.game", "onCreateView: savedInstanceState = " + bundle + ", surfaceState = " + this.f44499i);
        if (!C3272a.m15705m() && bundle != null) {
            C6124q.m27066k("rbx.game", "onCreateView: No Settings with non-null savedInstanceState. No need to create view.");
            this.f44502l.mo15193c();
            return null;
        }
        this.f44500j = C11659h.m43403a().mo43455H1() ? C5613a0.m25370R(m46610l()) : C5636m.m25494F0(m46610l());
        this.f44498h = (FrameLayout) m46615q().findViewById(C11335m0.f39803e);
        if (C11295a1.m42459k0() && bundle != null && this.f44499i == 2) {
            C6124q.m27063h("rbx.game", "onCreateView: The game is being recreated. Keep the current surface state.");
        } else {
            this.f44499i = 0;
        }
        if (!C11659h.m43403a().mo43468J0() || (viewStub = (ViewStub) this.f44498h.findViewById(C11335m0.f39788T)) == null) {
            this.f44493c = (FrameLayout) this.f44498h.findViewById(C11335m0.f39787S);
        } else {
            this.f44493c = (FrameLayout) viewStub.inflate();
        }
        m46617s(null);
        C8569c.m34512p().m34521s(new Consumer() { // from class: wh.b0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f44439a.m46619u((String) obj);
            }
        });
        return null;
    }

    /* JADX INFO: renamed from: B */
    public final void m46602B(final Runnable runnable) {
        m46613o().execute(new Runnable() { // from class: wh.f0
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m46603C(C12446l0 c12446l0) {
        C6124q.m27063h("rbx.game", "startGame");
        Surface surface = this.f44497g.getHolder().getSurface();
        C10593a c10593a = new C10593a(m46614p());
        c10593a.isTablet = C11295a1.m42473r0();
        this.f44502l.mo15189a(c12446l0.f44528c);
        StartGameParams.Builder referredByPlayerId = StartGameParams.builder().setSurface(surface).setPlatformParams(c10593a).setDeviceParams(null).setPlaceId(c12446l0.f44528c).setUserId(c12446l0.f44527b).setAccessCode(c12446l0.f44529d).setLinkCode(c12446l0.f44530e).setGameId(c12446l0.f44531f).setIsUnder13(C5654c.m25669c().m25682n()).setUsername(C5654c.m25669c().m25679k()).setConversationId(c12446l0.f44532g).setReservedServerAccessCode(c12446l0.f44533h).setCallId(c12446l0.f44534i).setJoinRequestType(c12446l0.f44526a).setReferralPage(c12446l0.f44535j).setLaunchData(c12446l0.f44536k).setJoinAttemptId(c12446l0.f44539n).setJoinAttemptOrigin(c12446l0.f44540o).setIsoContext(c12446l0.f44541p).setReferredByPlayerId(c12446l0.f44542q);
        if (C11295a1.m42389D0()) {
            referredByPlayerId.setVrContext(m46615q());
        }
        referredByPlayerId.setGameJoinContext(c12446l0.f44537l);
        referredByPlayerId.setEventId(c12446l0.f44538m);
        if (C11659h.m43403a().mo43754x3()) {
            referredByPlayerId.setGameIdToExclude(c12446l0.f44543r);
        }
        m46615q().runOnUiThread(new Runnable() { // from class: wh.g0
            @Override // java.lang.Runnable
            public final void run() {
                this.f44481a.m46620v();
            }
        });
        NativeGLInterface.nativeAppBridgeV2StartGameWithParam(referredByPlayerId.build());
        m46615q().runOnUiThread(new Runnable() { // from class: wh.h0
            @Override // java.lang.Runnable
            public final void run() {
                this.f44482a.m46621w();
            }
        });
        this.f44502l.mo15191b(c12446l0.f44528c);
    }

    /* JADX INFO: renamed from: D */
    public void m46604D() {
        m46602B(new Runnable() { // from class: wh.d0
            @Override // java.lang.Runnable
            public final void run() {
                this.f44443a.m46622x();
            }
        });
    }

    /* JADX DEBUG: Method merged with bridge method: x()V */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void m46622x() {
        C6124q.m27063h("rbx.game", "stopDataModel: dataModel = GAME, surfaceState = " + this.f44499i + ", graphicsStarted = " + this.f44496f);
        this.f44497g.getHolder().removeCallback(this);
        this.f44499i = -1;
    }

    /* JADX INFO: renamed from: F */
    public final void m46606F() {
        C6124q.m27063h("rbx.game", "surfaceDestroyed: surfaceState = " + this.f44499i + ", graphicsStarted = " + this.f44496f);
        if (this.f44499i != 2) {
            return;
        }
        if (this.f44496f) {
            this.f44496f = false;
            NativeGLInterface.nativeAppBridgeV2PauseGame();
        }
        AbstractActivityC3152a abstractActivityC3152aM46615q = m46615q();
        if (abstractActivityC3152aM46615q == null || abstractActivityC3152aM46615q.isFinishing()) {
            return;
        }
        C6124q.m27063h("rbx.game", "surfaceDestroyed() activity finishing ignore task scheduler");
        this.f44503m.m15187Y();
    }

    /* JADX INFO: renamed from: G */
    public final void m46607G() {
        C6124q.m27063h("rbx.game", "updateSurface() surfaceState = " + this.f44499i);
        AbstractActivityC3152a abstractActivityC3152aM46615q = m46615q();
        if (abstractActivityC3152aM46615q == null || abstractActivityC3152aM46615q.isFinishing() || abstractActivityC3152aM46615q.isDestroyed()) {
            C6124q.m27063h("rbx.game", "updateSurface() activity finishing ignore update");
            return;
        }
        int i10 = this.f44499i;
        if (i10 == 0) {
            this.f44499i = 2;
            this.f44496f = true;
            m46603C(this.f44491a);
            return;
        }
        if (i10 == 2) {
            Surface surface = this.f44497g.getHolder().getSurface();
            PlatformParams platformParams = new PlatformParams();
            float fM46611m = m46611m();
            Point pointM24005i = C5160a.m24005i(m46612n().m15173I());
            platformParams.dpiScale = fM46611m;
            platformParams.viewportWidthMm = pointM24005i.x;
            platformParams.viewportHeightMm = pointM24005i.y;
            if (this.f44496f) {
                C6124q.m27063h("rbx.game", "updateSurface: nativeUpdateGraphics");
                NativeGLInterface.nativeAppBridgeV2UpdateSurfaceGameWithPlatformParams(surface, platformParams, C11295a1.m42471q0() ? m46615q() : null);
            } else {
                C6124q.m27063h("rbx.game", "updateSurface: nativeStartUpGraphics");
                this.f44496f = true;
                NativeGLInterface.nativeAppBridgeV2ResumeGameWithPlatformParams(surface, platformParams, C11295a1.m42471q0() ? m46615q() : null);
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m46608j() {
        m46602B(new Runnable() { // from class: wh.z
            @Override // java.lang.Runnable
            public final void run() {
                this.f44598a.m46618t();
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public FrameLayout m46609k() {
        return this.f44498h;
    }

    /* JADX INFO: renamed from: l */
    public Context m46610l() {
        return m46612n().m15173I();
    }

    /* JADX INFO: renamed from: m */
    public float m46611m() {
        return C5160a.m24001e(m46612n().m15173I());
    }

    /* JADX INFO: renamed from: n */
    public ExperienceSession m46612n() {
        return this.f44503m;
    }

    /* JADX INFO: renamed from: o */
    public final ExecutorService m46613o() {
        if (this.f44501k == null) {
            this.f44501k = Executors.newSingleThreadExecutor();
        }
        return this.f44501k;
    }

    /* JADX INFO: renamed from: p */
    public final PlatformParams m46614p() {
        String strM34520r = C8569c.m34512p().m34520r();
        C6124q.m27057b("rbx.game", "getPlatformParams: assetFolderPath = " + strM34520r);
        PlatformParams platformParams = new PlatformParams();
        platformParams.assetFolderPath = strM34520r;
        platformParams.isTouchDevice = m46615q().getPackageManager().hasSystemFeature("android.hardware.touchscreen");
        platformParams.isMouseDevice = m46615q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.isKeyboardDevice = m46615q().getPackageManager().hasSystemFeature("android.hardware.type.pc");
        platformParams.dpiScale = m46611m();
        Point pointM24005i = C5160a.m24005i(m46612n().m15173I());
        platformParams.viewportWidthMm = pointM24005i.x;
        platformParams.viewportHeightMm = pointM24005i.y;
        return platformParams;
    }

    /* JADX INFO: renamed from: q */
    public AbstractActivityC3152a m46615q() {
        return (AbstractActivityC3152a) this.f44503m.m15172H();
    }

    /* JADX INFO: renamed from: r */
    public SurfaceView m46616r() {
        return this.f44497g;
    }

    /* JADX INFO: renamed from: s */
    public final void m46617s(View view) {
        C6124q.m27057b("rbx.game", "initSurfaceView: ...");
        SurfaceView surfaceView = (SurfaceView) m46615q().findViewById(C11335m0.f39810h0);
        this.f44497g = surfaceView;
        surfaceView.setFocusable(true);
        this.f44497g.setFocusableInTouchMode(true);
        this.f44497g.getHolder().addCallback(this);
        if (m46612n().m15176M()) {
            surfaceCreated(null);
            surfaceChanged(null, 0, 0, 0);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        C6124q.m27063h("rbx.game", "surfaceChanged: ...");
        m46602B(new Runnable() { // from class: wh.e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f44447a.m46607G();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        C6124q.m27063h("rbx.game", "surfaceCreated: ...");
        m46602B(new Runnable() { // from class: wh.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f44438a.m46623y();
            }
        });
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        try {
            this.f44501k.submit(new Runnable() { // from class: wh.c0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44441a.m46624z();
                }
            }).get();
        } catch (Exception unused) {
            C6124q.m27063h("rbx.game", "game thread times out");
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m46618t() {
        m46622x();
        NativeGLInterface.nativeAppBridgeV2LeaveGame();
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m46619u(String str) {
        this.f44497g.setVisibility(0);
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m46620v() {
        FrameLayout frameLayout = this.f44493c;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m46621w() {
        FrameLayout frameLayout;
        if (m46615q().isDestroyed() || (frameLayout = this.f44493c) == null) {
            return;
        }
        frameLayout.setVisibility(8);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m46623y() {
        this.f44503m.m15186X();
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m46624z() {
        if (m46615q() == null) {
            return;
        }
        m46606F();
    }
}
