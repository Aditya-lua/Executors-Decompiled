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
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import e4.q;
import gk.p;
import sg.a1;
import sg.c2;
import sg.f0;
import sg.m0;
import sg.q0;
import sg.y;
import th.h;
import wh.i0;
import wh.l0;
import wh.t0;
import wh.v0;
import wh.x0;
import wh.y0;
import xl.g;

/* JADX INFO: loaded from: classes2.dex */
public class ExperienceSession implements v0, ej.a, com.roblox.client.game.a.InterfaceC0139a, g.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f9052x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x0 f9053a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownTimer f9056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f9057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f9058g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i0 f9061j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f9063l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAPPurchaseManager f9064m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f9065n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9066o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9067p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f9068q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y0 f9069r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f9070s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f9071t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f9072u;
    public final String b = "ExperienceSession";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9054c = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9059h = 30000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f9060i = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.roblox.client.game.b f9062k = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f9073v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f9074w = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExperienceSession.this.Z();
        }
    }

    public class b extends EngineExitJavaCallback2 {
        public b() {
        }

        @Override // com.roblox.engine.jni.EngineExitJavaCallback2
        public void a() {
            p.h("ExperienceSession", "... (onCreate) gameDidLeave callback invoked.");
            ExperienceSession.this.G();
            ExperienceSession.this.T(true);
        }
    }

    public class c extends CountDownTimer {
        public c(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            p.h("ExperienceSession", "CountDownTimer::onFinish -> onGameTimeoutInBackground()");
            ExperienceSession.this.B();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    public interface d extends f0 {
        void m(Bundle bundle);

        q o0();
    }

    public class e extends y0 {
        @Override // wh.y0
        public void h(int i10) {
            p.h("rbx.game.orientation", "setting orientation: " + i10);
            ExperienceSession.this.H().setRequestedOrientation(i10);
        }

        public e() {
        }
    }

    public class f {
        public f() {
        }

        public nk.b a() {
            if (ExperienceSession.this.H() == null) {
                return null;
            }
            return nk.b.a(ExperienceSession.this.f9070s.getRootView(), ExperienceSession.this.H().getWindowManager(), null, ((com.roblox.client.a) ExperienceSession.this.H()).G1().c());
        }
    }

    public ExperienceSession(Bundle bundle) {
        this.f9058g = bundle;
    }

    private void L(View view) {
        ViewStub viewStub;
        if (h.a().G0() && (viewStub = (ViewStub) view.findViewById(m0.R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setBackgroundColor(0);
        eh.e.d(rbxKeyboard, I(), "SourceSansPro-Regular.ttf");
        this.f9062k = new com.roblox.client.game.b(rbxKeyboard, this.f9061j, this.f9060i);
        RobloxApplication.f().registerComponentCallbacks(this.f9062k);
    }

    private void k0() {
        Window window;
        if (Build.VERSION.SDK_INT < 28 || this.f9057f == null || (window = H().getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        q0().G1().e(window.getDecorView());
        if (this.f9053a == null) {
            this.f9053a = new x0(I());
        }
        this.f9053a.i(q0(), q0().G1().a());
    }

    @Keep
    public static boolean shouldDisableExperienceIdleTimer() {
        if (g.x().h() || MediaPickerProtocolV2.isCapturingMedia()) {
            return true;
        }
        return h.a().s3() && FacialAgeEstimationProtocol.INSTANCE.isInInquiryFlow();
    }

    public final void A() {
        p.h("ExperienceSession", "GameSession cancelScheduledGameExit");
        CountDownTimer countDownTimer = this.f9056e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f9056e = null;
        }
    }

    public final void B() {
        if (H() != null) {
            p.h("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            D(true);
        }
        if (h.a().w5()) {
            p.h("ExperienceSession", "endGameInBackground: setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        T(true);
    }

    @Override // xl.g.a
    public void C(String str, boolean z10) {
    }

    public void D(boolean z10) {
        p.h("ExperienceSession", "Ending game session with place ID " + this.f9072u);
        this.f9074w = false;
        A();
        g.x().w(this);
        if (!z10) {
            NativeReportingInterface.applicationForegrounded();
        }
        h0(false);
        if (this.f9054c) {
            p.k("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f9054c = true;
        c0();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", 102);
        if (h.a().g0()) {
            bundle.putLong(PinShortcutHandler.EXTRA_PLACE_ID, this.f9058g.getLong("roblox_placeId"));
            bundle.putString("gameId", this.f9058g.getString("roblox_gameId"));
        }
        boolean zIsChangingConfigurations = H().isChangingConfigurations();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDestroy: shutdown = ");
        sb2.append(!zIsChangingConfigurations);
        sb2.append(", hasGameStarted = ");
        sb2.append(this.f9055d);
        p.h("ExperienceSession", sb2.toString());
        if (!zIsChangingConfigurations && this.f9055d) {
            p.h("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z10) {
                this.f9061j.j();
            } else {
                this.f9061j.D();
            }
        }
        H().runOnUiThread(new Runnable() { // from class: wh.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f34368a.N();
            }
        });
        NativeGLJavaInterface.setExitImplementation(null);
        this.f9057f.m(bundle);
        RobloxApplication.f().unregisterComponentCallbacks(this.f9062k);
    }

    public final void E() {
        p.h("ExperienceSession", "Entering immersive mode");
        if (this.f9067p) {
            c2.b(H().getWindow());
        } else {
            p.h("ExperienceSession", "System visibility " + this.f9066o);
            if (this.f9066o == 0) {
                this.f9066o = H().getWindow().getDecorView().getSystemUiVisibility();
            }
            H().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        ((ActivityNativeMain) H()).W1().o(t0.EXPERIENCE);
    }

    public final void F() {
        p.h("ExperienceSession", "Exiting immersive mode");
        Activity activityH = H();
        if (activityH == null || activityH.isFinishing()) {
            return;
        }
        ((com.roblox.client.a) activityH).W1().o(t0.APP);
        if (this.f9067p) {
            c2.c(activityH.getWindow());
        } else {
            activityH.getWindow().getDecorView().setSystemUiVisibility(this.f9066o);
        }
        if (a1.Q0(activityH.getResources().getConfiguration())) {
            activityH.getWindow().getDecorView().post(new Runnable() { // from class: wh.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f34369a.O();
                }
            });
        }
    }

    public final void G() {
        p.h("ExperienceSession", "finishGame:");
        if (((q) H()) != null) {
            b0();
            D(false);
        }
    }

    public Activity H() {
        return this.f9057f.o0();
    }

    public Context I() {
        return this.f9057f.o0();
    }

    public final void J() {
        G();
        T(false);
    }

    public final void K() {
        final View viewFindViewById = H().findViewById(m0.V);
        if (viewFindViewById == null || viewFindViewById.getVisibility() == 8) {
            return;
        }
        viewFindViewById.post(new Runnable() { // from class: wh.u
            @Override // java.lang.Runnable
            public final void run() {
                viewFindViewById.setVisibility(8);
            }
        });
    }

    public boolean M() {
        d dVar = this.f9057f;
        if (dVar != null) {
            return dVar.b();
        }
        return false;
    }

    public final /* synthetic */ void N() {
        if (!h.a().W4()) {
            H().getWindow().clearFlags(128);
        }
        b0();
        if (!this.f9067p) {
            H().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        }
        F();
    }

    public final /* synthetic */ void O() {
        Activity activityH = H();
        if (activityH == null || activityH.isFinishing()) {
            return;
        }
        c2.b(activityH.getWindow());
    }

    public final /* synthetic */ void P(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        J();
    }

    public final /* synthetic */ void Q(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        J();
    }

    public final /* synthetic */ void R(int i10) {
        qi.b.f().u(I());
        new AlertDialog.Builder(I()).setMessage(i10).setNegativeButton(H().getString(q0.N), new DialogInterface.OnClickListener() { // from class: wh.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f34392a.P(dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: wh.x
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f34393a.Q(dialogInterface);
            }
        }).create().show();
    }

    public final /* synthetic */ void S(int i10) {
        if (this.f9054c || (i10 & 4) != 0) {
            return;
        }
        E();
    }

    public void T(boolean z10) {
        p.h("ExperienceSession", "onGameEnded: success = " + z10 + ", hasGameStarted = " + this.f9055d);
        this.f9055d = false;
    }

    @Override // ej.a
    public void U(int i10) {
        ((com.roblox.client.b) H()).U(i10);
    }

    @Override // xl.g.a
    public void V(String str) {
    }

    @Override // ej.a
    public void W(String str) {
        ((com.roblox.client.b) H()).W(str);
    }

    public void X() {
        p.b("ExperienceSession", "onSurfaceCreated: finished = " + this.f9054c);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    public void Y() {
        p.b("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f9054c);
    }

    public void Z() {
        if (shouldDisableExperienceIdleTimer()) {
            p.h("ExperienceSession", "Not pausing game session, user is in a call or capturing media or in a persona session");
            this.f9074w = true;
            return;
        }
        p.h("ExperienceSession", "Pause game session");
        this.f9065n.p().d();
        h0(true);
        e0();
        b0();
    }

    @Override // wh.v0
    public void a(long j10) {
        p.h("ExperienceSession", "onGameStarting: placeId = " + j10);
        this.f9065n.p().b();
    }

    public void a0(Runnable runnable) {
        this.f9063l.post(runnable);
    }

    @Override // wh.v0
    public void b(long j10) {
        p.h("ExperienceSession", "onGameStarted: placeId = " + j10);
        this.f9055d = true;
        this.f9065n.p().a();
        if (h.a().h5()) {
            com.roblox.client.ossearch.b.b(I(), j10);
        }
    }

    public final void b0() {
        if (this.f9071t != null) {
            p.b("rbx.screen", "removing GlobalLayoutListener");
            this.f9070s.getViewTreeObserver().removeOnGlobalLayoutListener(this.f9071t);
            this.f9071t = null;
        }
    }

    @Override // wh.v0
    public void c() {
        p.h("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (H().isFinishing()) {
            return;
        }
        H().setResult(103);
        D(false);
    }

    public final void c0() {
        if (this.f9068q > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f9068q;
            p.h("ExperienceSession", "Game duration: " + jElapsedRealtime + "ms.");
            vi.g.b().k(I(), jElapsedRealtime);
        }
    }

    public void d0() {
        p.h("ExperienceSession", "Resume game session");
        this.f9074w = false;
        g0(true);
        A();
        this.f9065n.p().e();
    }

    public final void e0() {
        long jA = h.a().L0() ? new dm.a(dm.b.i().d("Backgrounding.General"), 30000L).a() : 30000L;
        p.h("ExperienceSession", "CountDownTimer constructed with delay:" + jA);
        this.f9056e = new c(jA, 1000L).start();
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void f(boolean z10) {
        this.f9057f.f(z10);
    }

    @Override // ej.a
    public Activity f0() {
        return H();
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void g(int i10) {
        if (this.f9069r == null) {
            this.f9069r = new e();
        }
        this.f9069r.e(Integer.valueOf(i10));
    }

    public final synchronized void g0(boolean z10) {
        try {
            if (this.f9073v) {
                return;
            }
            this.f9073v = true;
            NativeReportingInterface.gameForegrounded();
            if (z10) {
                NativeGLInterface.nativeOnExperienceSessionResume();
            } else {
                NativeGLInterface.nativeOnFragmentStart();
            }
            hm.b.h().e();
            if (this.f9071t == null && this.f9062k != null) {
                p.b("rbx.screen", "adding GlobalLayoutListener");
                this.f9071t = this.f9062k;
                this.f9070s.getViewTreeObserver().addOnGlobalLayoutListener(this.f9071t);
            }
            com.roblox.client.game.b bVar = this.f9062k;
            if (bVar != null) {
                bVar.y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void h(long j10, String str, String str2) {
        this.f9064m.A(j10, str, str2);
    }

    public final synchronized void h0(boolean z10) {
        try {
            if (this.f9073v) {
                this.f9073v = false;
                NativeReportingInterface.gameBackgrounded();
                if (z10) {
                    NativeGLInterface.nativeOnExperienceSessionPause();
                } else {
                    NativeGLInterface.nativeOnFragmentStop();
                }
                hm.b.h().f();
                com.roblox.client.game.b bVar = this.f9062k;
                if (bVar != null) {
                    bVar.G();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void i(String str, String str2, String str3) {
        sg.q.g(this.f9057f.o0(), str, str2, str3);
    }

    public void i0(d dVar) {
        this.f9057f = dVar;
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void j(long j10, String str, String str2) {
        this.f9064m.z(j10, str, str2);
    }

    public final void j0(long j10) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f9063l, new com.roblox.client.game.a(this, this.f9062k)));
        NativeGLJavaInterface.setExitImplementation(new b());
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void k(long j10, String str, String str2) {
        this.f9064m.B(j10, str, str2);
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void l(long j10, String str, String str2, String str3) {
        this.f9064m.C(j10, str, str2, str3);
    }

    public void l0() {
        p.h("ExperienceSession", "Start game session");
        if (h.a().f4()) {
            LoggingProtocol.g("native_experience_start");
        }
        A();
        this.f9063l = new Handler(Looper.getMainLooper());
        this.f9064m = new IAPPurchaseManager(this, false);
        this.f9067p = h.a().L5();
        E();
        if (!this.f9067p) {
            H().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: wh.t
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i10) {
                    this.f34380a.S(i10);
                }
            });
        }
        K();
        Bundle bundle = this.f9058g;
        this.f9070s = (ViewGroup) H().findViewById(m0.f30832e);
        k0();
        if (!y0.j()) {
            this.f9057f.I();
        }
        this.f9065n = y.h();
        l0 l0Var = new l0(bundle);
        this.f9072u = bundle.getLong("roblox_placeId", 0L);
        a1.V0();
        if (!f9052x) {
            f9052x = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        a1.U0();
        i0 i0Var = new i0(this, l0Var);
        this.f9061j = i0Var;
        i0Var.A(null, null, null);
        L(this.f9070s);
        j0(this.f9072u);
        g0(false);
        NativeReportingInterface.applicationBackgrounded();
        if (!h.a().W4()) {
            H().getWindow().addFlags(128);
        }
        g.x().g(this);
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void m(long j10) {
        p.h("ExperienceSession", "onGameLoaded: placeId = " + j10);
        com.roblox.client.game.b bVar = this.f9062k;
        if (bVar != null) {
            bVar.K(j10);
        }
        this.f9068q = SystemClock.elapsedRealtime();
    }

    @Override // xl.g.a
    public void m0(String str) {
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void n(long j10, String str) {
        this.f9064m.y(j10, str);
    }

    @Override // xl.g.a
    public void o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // xl.g.a
    public void p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // com.roblox.client.game.a.InterfaceC0139a
    public void q(final int i10) {
        a0(new Runnable() { // from class: wh.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f34391a.R(i10);
            }
        });
    }

    @Override // ej.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.a) H();
    }

    @Override // xl.g.a
    public void v(String str, String str2) {
        if (this.f9074w) {
            this.f9063l.post(new a());
            this.f9074w = false;
        }
    }
}
