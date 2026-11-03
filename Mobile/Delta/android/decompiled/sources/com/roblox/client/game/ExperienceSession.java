package com.roblox.client.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.annotation.Keep;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.RobloxApplication;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.engine.jni.EngineExitJavaCallback2;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.RunOnMainEngineJavaCallback;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import ek.q;
import rg.a1;
import rg.c2;
import rg.f0;
import rg.m0;
import rg.q0;
import rg.y;
import rh.h;
import uh.j0;
import uh.u0;
import uh.w0;
import uh.y0;
import uh.z0;
import vl.g;

/* JADX INFO: loaded from: classes2.dex */
public class ExperienceSession implements w0, cj.a, com.roblox.client.game.a.InterfaceC0142a, g.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f9125x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f9126a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownTimer f9129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f9130f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f9131g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f9134j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f9136l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAPPurchaseManager f9137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f9138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f9142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f9143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f9144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9145u;
    public final String b = "ExperienceSession";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9127c = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9132h = 30000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f9133i = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.roblox.client.game.b f9135k = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9146v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9147w = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExperienceSession.this.b0();
        }
    }

    public class b extends EngineExitJavaCallback2 {
        public b() {
        }

        @Override // com.roblox.engine.jni.EngineExitJavaCallback2
        public void a() {
            q.h("ExperienceSession", "... (onCreate) gameDidLeave callback invoked.");
            ExperienceSession.this.I();
            ExperienceSession.this.Y(true);
        }
    }

    public class c extends CountDownTimer {
        public c(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            q.h("ExperienceSession", "CountDownTimer::onFinish -> onGameTimeoutInBackground()");
            ExperienceSession.this.E();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public interface d extends f0 {
        void m(Bundle bundle);

        e4.q o0();
    }

    public class e extends z0 {
        @Override // uh.z0
        public void h(int i10) {
            q.h("rbx.game.orientation", "setting orientation: " + i10);
            ExperienceSession.this.J().setRequestedOrientation(i10);
        }

        public e() {
        }
    }

    public class f {
        public f() {
        }

        public lk.b a() {
            if (ExperienceSession.this.J() == null) {
                return null;
            }
            return lk.b.a(ExperienceSession.this.f9143s.getRootView(), ExperienceSession.this.J().getWindowManager(), null, ((com.roblox.client.a) ExperienceSession.this.J()).G1().c());
        }
    }

    public ExperienceSession(Bundle bundle) {
        this.f9131g = bundle;
    }

    private void N(View view) {
        ViewStub viewStub;
        if (h.a().L0() && (viewStub = (ViewStub) view.findViewById(m0.R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setBackgroundColor(0);
        dh.e.d(rbxKeyboard, K(), "SourceSansPro-Regular.ttf");
        this.f9135k = new com.roblox.client.game.b(rbxKeyboard, this.f9134j, this.f9133i);
        RobloxApplication.f().registerComponentCallbacks(this.f9135k);
    }

    private void n0() {
        Window window;
        if (Build.VERSION.SDK_INT < 28 || this.f9130f == null || (window = J().getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        q0().G1().e(window.getDecorView());
        if (this.f9126a == null) {
            this.f9126a = new y0(K());
        }
        this.f9126a.i(q0(), q0().G1().a());
    }

    @Keep
    public static boolean shouldDisableExperienceIdleTimer() {
        if (g.x().h() || MediaPickerProtocolV2.isCapturingMedia()) {
            return true;
        }
        return h.a().E3() && FacialAgeEstimationProtocol.INSTANCE.isInInquiryFlow();
    }

    @Override // vl.g.a
    public void B(String str, boolean z10) {
    }

    public final void D() {
        q.h("ExperienceSession", "GameSession cancelScheduledGameExit");
        CountDownTimer countDownTimer = this.f9129e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f9129e = null;
        }
    }

    public final void E() {
        if (J() != null) {
            q.h("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            F(true);
        }
        if (h.a().G5()) {
            q.h("ExperienceSession", "endGameInBackground: setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        Y(true);
    }

    public void F(boolean z10) {
        q.h("ExperienceSession", "Ending game session with place ID " + this.f9145u);
        this.f9147w = false;
        D();
        g.x().w(this);
        if (!z10) {
            NativeReportingInterface.applicationForegrounded();
        }
        j0(false);
        if (this.f9127c) {
            q.k("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f9127c = true;
        e0();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", 102);
        if (h.a().l0()) {
            bundle.putLong(PinShortcutHandler.EXTRA_PLACE_ID, this.f9131g.getLong("roblox_placeId"));
            bundle.putString("gameId", this.f9131g.getString("roblox_gameId"));
        }
        boolean zIsChangingConfigurations = J().isChangingConfigurations();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDestroy: shutdown = ");
        sb2.append(!zIsChangingConfigurations);
        sb2.append(", hasGameStarted = ");
        sb2.append(this.f9128d);
        q.h("ExperienceSession", sb2.toString());
        if (!zIsChangingConfigurations && this.f9128d) {
            q.h("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z10) {
                this.f9134j.j();
            } else {
                this.f9134j.D();
            }
        }
        J().runOnUiThread(new Runnable() { // from class: uh.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f33045a.P();
            }
        });
        NativeGLJavaInterface.setExitImplementation(null);
        this.f9130f.m(bundle);
        RobloxApplication.f().unregisterComponentCallbacks(this.f9135k);
    }

    public final void G() {
        q.h("ExperienceSession", "Entering immersive mode");
        if (this.f9140p) {
            c2.b(J().getWindow());
        } else {
            q.h("ExperienceSession", "System visibility " + this.f9139o);
            if (this.f9139o == 0) {
                this.f9139o = J().getWindow().getDecorView().getSystemUiVisibility();
            }
            J().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        ((ActivityNativeMain) J()).W1().o(u0.EXPERIENCE);
    }

    public final void H() {
        q.h("ExperienceSession", "Exiting immersive mode");
        Activity activityJ = J();
        if (activityJ == null || activityJ.isFinishing()) {
            return;
        }
        ((com.roblox.client.a) activityJ).W1().o(u0.APP);
        if (this.f9140p) {
            c2.c(activityJ.getWindow());
        } else {
            activityJ.getWindow().getDecorView().setSystemUiVisibility(this.f9139o);
        }
        if (a1.R0(activityJ.getResources().getConfiguration())) {
            activityJ.getWindow().getDecorView().post(new Runnable() { // from class: uh.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33047a.Q();
                }
            });
        }
    }

    public final void I() {
        q.h("ExperienceSession", "finishGame:");
        if (((e4.q) J()) != null) {
            d0();
            F(false);
        }
    }

    public Activity J() {
        return this.f9130f.o0();
    }

    public Context K() {
        return this.f9130f.o0();
    }

    public final void L() {
        I();
        Y(false);
    }

    public final void M() {
        final View viewFindViewById = J().findViewById(m0.W);
        if (viewFindViewById == null || viewFindViewById.getVisibility() == 8) {
            return;
        }
        viewFindViewById.post(new Runnable() { // from class: uh.u
            @Override // java.lang.Runnable
            public final void run() {
                viewFindViewById.setVisibility(8);
            }
        });
    }

    public boolean O() {
        d dVar = this.f9130f;
        if (dVar != null) {
            return dVar.b();
        }
        return false;
    }

    public final /* synthetic */ void P() {
        if (!h.a().j5()) {
            J().getWindow().clearFlags(128);
        }
        d0();
        if (!this.f9140p) {
            J().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        }
        H();
    }

    public final /* synthetic */ void Q() {
        Activity activityJ = J();
        if (activityJ == null || activityJ.isFinishing()) {
            return;
        }
        c2.b(activityJ.getWindow());
    }

    public final /* synthetic */ void R(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        L();
    }

    public final /* synthetic */ void S(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        L();
    }

    @Override // cj.a
    public void T(int i10) {
        ((com.roblox.client.b) J()).T(i10);
    }

    @Override // vl.g.a
    public void U(String str) {
    }

    @Override // cj.a
    public void V(String str) {
        ((com.roblox.client.b) J()).V(str);
    }

    public final /* synthetic */ void W(int i10) {
        oi.b.f().u(K());
        new AlertDialog.Builder(K()).setMessage(i10).setNegativeButton(J().getString(q0.N), new DialogInterface.OnClickListener() { // from class: uh.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f33071a.R(dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: uh.y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f33072a.S(dialogInterface);
            }
        }).create().show();
    }

    public final /* synthetic */ void X(int i10) {
        if (this.f9127c || (i10 & 4) != 0) {
            return;
        }
        G();
    }

    public void Y(boolean z10) {
        q.h("ExperienceSession", "onGameEnded: success = " + z10 + ", hasGameStarted = " + this.f9128d);
        this.f9128d = false;
    }

    public void Z() {
        q.b("ExperienceSession", "onSurfaceCreated: finished = " + this.f9127c);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    @Override // uh.w0
    public void a(long j10) {
        q.h("ExperienceSession", "onGameStarting: placeId = " + j10);
        this.f9138n.p().b();
    }

    public void a0() {
        q.b("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f9127c);
    }

    @Override // uh.w0
    public void b(long j10) {
        q.h("ExperienceSession", "onGameStarted: placeId = " + j10);
        this.f9128d = true;
        this.f9138n.p().a();
        if (h.a().t5()) {
            com.roblox.client.ossearch.b.b(K(), j10);
        }
    }

    public void b0() {
        if (shouldDisableExperienceIdleTimer()) {
            q.h("ExperienceSession", "Not pausing game session, user is in a call or capturing media or in a persona session");
            this.f9147w = true;
            return;
        }
        q.h("ExperienceSession", "Pause game session");
        this.f9138n.p().d();
        j0(true);
        h0();
        d0();
    }

    @Override // uh.w0
    public void c() {
        q.h("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (J().isFinishing()) {
            return;
        }
        J().setResult(103);
        F(false);
    }

    public void c0(Runnable runnable) {
        this.f9136l.post(runnable);
    }

    public final void d0() {
        if (this.f9144t != null) {
            q.b("rbx.screen", "removing GlobalLayoutListener");
            this.f9143s.getViewTreeObserver().removeOnGlobalLayoutListener(this.f9144t);
            this.f9144t = null;
        }
    }

    public final void e0() {
        if (this.f9141q > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9141q;
            q.h("ExperienceSession", "Game duration: " + jElapsedRealtime + "ms.");
            ti.g.b().k(K(), jElapsedRealtime);
        }
    }

    @Override // cj.a
    public Activity f0() {
        return J();
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void g(boolean z10) {
        this.f9130f.g(z10);
    }

    public void g0() {
        q.h("ExperienceSession", "Resume game session");
        this.f9147w = false;
        i0(true);
        D();
        this.f9138n.p().e();
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void h(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        this.f9137m.H(j10, str, nativePurchaseContext);
    }

    public final void h0() {
        long jA = h.a().Q0() ? new bm.a(bm.b.i().d("Backgrounding.General"), 30000L).a() : 30000L;
        q.h("ExperienceSession", "CountDownTimer constructed with delay:" + jA);
        this.f9129e = new c(jA, 1000L).start();
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void i(int i10) {
        if (this.f9142r == null) {
            this.f9142r = new e();
        }
        this.f9142r.e(Integer.valueOf(i10));
    }

    public final synchronized void i0(boolean z10) {
        try {
            if (this.f9146v) {
                return;
            }
            this.f9146v = true;
            NativeReportingInterface.gameForegrounded();
            if (z10) {
                NativeGLInterface.nativeOnExperienceSessionResume();
            } else {
                NativeGLInterface.nativeOnFragmentStart();
            }
            fm.b.h().e();
            if (this.f9144t == null && this.f9135k != null) {
                q.b("rbx.screen", "adding GlobalLayoutListener");
                this.f9144t = this.f9135k;
                this.f9143s.getViewTreeObserver().addOnGlobalLayoutListener(this.f9144t);
            }
            com.roblox.client.game.b bVar = this.f9135k;
            if (bVar != null) {
                bVar.y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void j(long j10, String str, String str2) {
        this.f9137m.I(j10, str, str2);
    }

    public final synchronized void j0(boolean z10) {
        try {
            if (this.f9146v) {
                this.f9146v = false;
                NativeReportingInterface.gameBackgrounded();
                if (z10) {
                    NativeGLInterface.nativeOnExperienceSessionPause();
                } else {
                    NativeGLInterface.nativeOnFragmentStop();
                }
                fm.b.h().f();
                com.roblox.client.game.b bVar = this.f9135k;
                if (bVar != null) {
                    bVar.G();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void k(String str, String str2, String str3) {
        rg.q.g(this.f9130f.o0(), str, str2, str3);
    }

    public void k0(d dVar) {
        this.f9130f = dVar;
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void l(long j10, String str, String str2) {
        this.f9137m.G(j10, str, str2);
    }

    public final void l0(long j10) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f9136l, new com.roblox.client.game.a(this, this.f9135k)));
        NativeGLJavaInterface.setExitImplementation(new b());
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void m(long j10, String str, String str2) {
        this.f9137m.J(j10, str, str2);
    }

    @Override // vl.g.a
    public void m0(String str) {
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void n(long j10, String str, String str2, String str3) {
        this.f9137m.K(j10, str, str2, str3);
    }

    @Override // vl.g.a
    public void o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void o0() {
        q.h("ExperienceSession", "Start game session");
        if (h.a().q4()) {
            LoggingProtocol.g("native_experience_start");
        }
        D();
        this.f9136l = new Handler(Looper.getMainLooper());
        this.f9137m = new IAPPurchaseManager(this, false);
        this.f9140p = h.a().V5();
        G();
        if (!this.f9140p) {
            J().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: uh.t
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i10) {
                    this.f33048a.X(i10);
                }
            });
        }
        M();
        Bundle bundle = this.f9131g;
        this.f9143s = (ViewGroup) J().findViewById(m0.f30435e);
        n0();
        if (!z0.j()) {
            this.f9130f.H();
        }
        this.f9138n = y.h();
        uh.m0 m0Var = new uh.m0(bundle);
        this.f9145u = bundle.getLong("roblox_placeId", 0L);
        a1.W0();
        if (!f9125x) {
            f9125x = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        a1.V0();
        j0 j0Var = new j0(this, m0Var);
        this.f9134j = j0Var;
        j0Var.A(null, null, null);
        N(this.f9143s);
        l0(this.f9145u);
        i0(false);
        NativeReportingInterface.applicationBackgrounded();
        if (!h.a().j5()) {
            J().getWindow().addFlags(128);
        }
        g.x().g(this);
    }

    @Override // vl.g.a
    public void p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void q() {
        final e4.q qVarO0 = this.f9130f.o0();
        if (qVarO0 == null) {
            q.k("ExperienceSession", "exitApp: no activity to finish");
        } else {
            q.h("ExperienceSession", "exitApp: finishing task at the user's request");
            qVarO0.runOnUiThread(new Runnable() { // from class: uh.v
                @Override // java.lang.Runnable
                public final void run() {
                    qVarO0.finishAndRemoveTask();
                }
            });
        }
    }

    @Override // cj.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.a) J();
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void r(long j10) {
        q.h("ExperienceSession", "onGameLoaded: placeId = " + j10);
        com.roblox.client.game.b bVar = this.f9135k;
        if (bVar != null) {
            bVar.K(j10);
        }
        this.f9141q = SystemClock.elapsedRealtime();
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void s(long j10, String str) {
        this.f9137m.F(j10, str);
    }

    @Override // com.roblox.client.game.a.InterfaceC0142a
    public void t(final int i10) {
        c0(new Runnable() { // from class: uh.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f33070a.W(i10);
            }
        });
    }

    @Override // vl.g.a
    public void u(String str, String str2) {
        if (this.f9147w) {
            this.f9136l.post(new a());
            this.f9147w = false;
        }
    }
}
