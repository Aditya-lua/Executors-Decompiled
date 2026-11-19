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
import bh.a1;
import bh.c2;
import bh.f0;
import bh.m0;
import bh.q0;
import bh.y;
import bi.h;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.barcode.common.Barcode;
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
import ei.j0;
import ei.u0;
import ei.w0;
import ei.y0;
import ei.z0;
import f4.v;
import lm.g;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class ExperienceSession implements w0, mj.a, com.roblox.client.game.a.InterfaceC0145a, g.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static boolean f8941x;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f8942a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CountDownTimer f8945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d f8946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Bundle f8947g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j0 f8950j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Handler f8952l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IAPPurchaseManager f8953m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f8954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f8955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f8957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f8958r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f8959s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f8960t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f8961u;
    public final String b = "ExperienceSession";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8943c = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f8948h = 30000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f8949i = new f();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.roblox.client.game.b f8951k = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f8962v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8963w = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExperienceSession.this.c0();
        }
    }

    public class b extends EngineExitJavaCallback2 {
        public b() {
        }

        @Override // com.roblox.engine.jni.EngineExitJavaCallback2
        public void a() {
            q.h("ExperienceSession", "... (onCreate) gameDidLeave callback invoked.");
            ExperienceSession.this.J();
            ExperienceSession.this.Z(true);
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

        v o0();
    }

    public class e extends z0 {
        @Override // ei.z0
        public void h(int i10) {
            q.h("rbx.game.orientation", "setting orientation: " + i10);
            ExperienceSession.this.K().setRequestedOrientation(i10);
        }

        public e() {
        }
    }

    public class f {
        public f() {
        }

        public vk.b a() {
            if (ExperienceSession.this.K() == null) {
                return null;
            }
            ui.a aVarG1 = ((com.roblox.client.a) ExperienceSession.this.K()).G1();
            return vk.b.c(ExperienceSession.this.f8959s.getRootView(), ExperienceSession.this.K().getWindowManager(), null, aVarG1.d(), h.a().B5(), aVarG1.f(), aVarG1.b());
        }
    }

    public ExperienceSession(Bundle bundle) {
        this.f8947g = bundle;
    }

    private void O(View view) {
        ViewStub viewStub;
        if (h.a().O0() && (viewStub = (ViewStub) view.findViewById(m0.S)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(m0.G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setBackgroundColor(0);
        nh.e.d(rbxKeyboard, L(), "SourceSansPro-Regular.ttf");
        this.f8951k = new com.roblox.client.game.b(rbxKeyboard, this.f8950j, this.f8949i);
        RobloxApplication.f().registerComponentCallbacks(this.f8951k);
    }

    private void o0() {
        Window window;
        if (Build.VERSION.SDK_INT < 28 || this.f8946f == null || (window = K().getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        q0().G1().g(window.getDecorView());
        if (this.f8942a == null) {
            this.f8942a = new y0(L());
        }
        this.f8942a.i(q0(), q0().G1().a());
    }

    @Keep
    public static boolean shouldDisableExperienceIdleTimer() {
        if (g.x().h() || MediaPickerProtocolV2.isCapturingMedia()) {
            return true;
        }
        return h.a().I3() && FacialAgeEstimationProtocol.INSTANCE.isInInquiryFlow();
    }

    @Override // lm.g.a
    public void C(String str, boolean z10) {
    }

    public final void D() {
        q.h("ExperienceSession", "GameSession cancelScheduledGameExit");
        CountDownTimer countDownTimer = this.f8945e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f8945e = null;
        }
    }

    public final void E() {
        if (K() != null) {
            q.h("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            G(true, true);
        }
        if (h.a().F5()) {
            q.h("ExperienceSession", "endGameInBackground: setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        Z(true);
    }

    public void F(boolean z10) {
        G(z10, false);
    }

    public final void G(boolean z10, boolean z11) {
        q.h("ExperienceSession", "Ending game session with place ID " + this.f8961u);
        this.f8963w = false;
        D();
        g.x().w(this);
        if (!z10) {
            NativeReportingInterface.applicationForegrounded();
        }
        k0(false);
        if (this.f8943c) {
            q.k("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f8943c = true;
        g0();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", MlKitException.MODEL_HASH_MISMATCH);
        if (h.a().n0()) {
            bundle.putLong(PinShortcutHandler.EXTRA_PLACE_ID, this.f8947g.getLong("roblox_placeId"));
            bundle.putString("gameId", this.f8947g.getString("roblox_gameId"));
        }
        boolean zIsChangingConfigurations = K().isChangingConfigurations();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDestroy: shutdown = ");
        sb2.append(!zIsChangingConfigurations);
        sb2.append(", hasGameStarted = ");
        sb2.append(this.f8944d);
        q.h("ExperienceSession", sb2.toString());
        if (!zIsChangingConfigurations && this.f8944d) {
            q.h("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z10) {
                this.f8950j.j(z11);
            } else {
                this.f8950j.D();
            }
        }
        K().runOnUiThread(new Runnable() { // from class: ei.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f13783a.Q();
            }
        });
        NativeGLJavaInterface.setExitImplementation(null);
        this.f8946f.m(bundle);
        RobloxApplication.f().unregisterComponentCallbacks(this.f8951k);
    }

    public final void H() {
        q.h("ExperienceSession", "Entering immersive mode");
        if (this.f8956p) {
            c2.b(K().getWindow());
        } else {
            q.h("ExperienceSession", "System visibility " + this.f8955o);
            if (this.f8955o == 0) {
                this.f8955o = K().getWindow().getDecorView().getSystemUiVisibility();
            }
            K().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        ((ActivityNativeMain) K()).W1().o(u0.EXPERIENCE);
    }

    public final void I() {
        q.h("ExperienceSession", "Exiting immersive mode");
        Activity activityK = K();
        if (activityK == null || activityK.isFinishing()) {
            return;
        }
        ((com.roblox.client.a) activityK).W1().o(u0.APP);
        if (this.f8956p) {
            c2.c(activityK.getWindow());
        } else {
            activityK.getWindow().getDecorView().setSystemUiVisibility(this.f8955o);
        }
        if (a1.R0(activityK.getResources().getConfiguration())) {
            activityK.getWindow().getDecorView().post(new Runnable() { // from class: ei.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13785a.R();
                }
            });
        }
    }

    public final void J() {
        q.h("ExperienceSession", "finishGame:");
        if (((v) K()) != null) {
            f0();
            F(false);
        }
    }

    public Activity K() {
        return this.f8946f.o0();
    }

    public Context L() {
        return this.f8946f.o0();
    }

    public final void M() {
        J();
        Z(false);
    }

    public final void N() {
        final View viewFindViewById = K().findViewById(m0.X);
        if (viewFindViewById == null || viewFindViewById.getVisibility() == 8) {
            return;
        }
        viewFindViewById.post(new Runnable() { // from class: ei.u
            @Override // java.lang.Runnable
            public final void run() {
                viewFindViewById.setVisibility(8);
            }
        });
    }

    public boolean P() {
        d dVar = this.f8946f;
        if (dVar != null) {
            return dVar.b();
        }
        return false;
    }

    public final /* synthetic */ void Q() {
        if (!h.a().i5()) {
            K().getWindow().clearFlags(Barcode.FORMAT_ITF);
        }
        f0();
        if (!this.f8956p) {
            K().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        }
        I();
    }

    public final /* synthetic */ void R() {
        Activity activityK = K();
        if (activityK == null || activityK.isFinishing()) {
            return;
        }
        c2.b(activityK.getWindow());
    }

    public final /* synthetic */ void S(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        M();
    }

    @Override // mj.a
    public void T(int i10) {
        ((com.roblox.client.b) K()).T(i10);
    }

    @Override // lm.g.a
    public void U(String str) {
    }

    @Override // mj.a
    public void V(String str) {
        ((com.roblox.client.b) K()).V(str);
    }

    public final /* synthetic */ void W(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        M();
    }

    public final /* synthetic */ void X(int i10) {
        yi.b.f().u(L());
        new AlertDialog.Builder(L()).setMessage(i10).setNegativeButton(K().getString(q0.N), new DialogInterface.OnClickListener() { // from class: ei.x
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f13809a.S(dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ei.y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f13810a.W(dialogInterface);
            }
        }).create().show();
    }

    public final /* synthetic */ void Y(int i10) {
        if (this.f8943c || (i10 & 4) != 0) {
            return;
        }
        H();
    }

    public void Z(boolean z10) {
        q.h("ExperienceSession", "onGameEnded: success = " + z10 + ", hasGameStarted = " + this.f8944d);
        this.f8944d = false;
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void a(long j10, String str, NativePurchaseContext nativePurchaseContext) {
        this.f8953m.H(j10, str, nativePurchaseContext);
    }

    public void a0() {
        q.b("ExperienceSession", "onSurfaceCreated: finished = " + this.f8943c);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    @Override // ei.w0
    public void b(long j10) {
        q.h("ExperienceSession", "onGameStarting: placeId = " + j10);
        this.f8954n.p().b();
    }

    public void b0() {
        q.b("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f8943c);
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void c(int i10) {
        if (this.f8958r == null) {
            this.f8958r = new e();
        }
        this.f8958r.e(Integer.valueOf(i10));
    }

    public void c0() {
        if (shouldDisableExperienceIdleTimer()) {
            q.h("ExperienceSession", "Not pausing game session, user is in a call or capturing media or in a persona session");
            this.f8963w = true;
            return;
        }
        q.h("ExperienceSession", "Pause game session");
        this.f8954n.p().d();
        k0(true);
        i0();
        f0();
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void d(long j10, String str, String str2) {
        this.f8953m.I(j10, str, str2);
    }

    public void d0(Runnable runnable) {
        this.f8952l.post(runnable);
    }

    @Override // ei.w0
    public void e(long j10) {
        q.h("ExperienceSession", "onGameStarted: placeId = " + j10);
        this.f8944d = true;
        this.f8954n.p().a();
        com.roblox.client.ossearch.b.b(L(), j10);
    }

    @Override // mj.a
    public Activity e0() {
        return K();
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void f(boolean z10) {
        this.f8946f.f(z10);
    }

    public final void f0() {
        if (this.f8960t != null) {
            q.b("rbx.screen", "removing GlobalLayoutListener");
            this.f8959s.getViewTreeObserver().removeOnGlobalLayoutListener(this.f8960t);
            this.f8960t = null;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void g(String str, String str2, String str3) {
        bh.q.g(this.f8946f.o0(), str, str2, str3);
    }

    public final void g0() {
        if (this.f8957q > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f8957q;
            q.h("ExperienceSession", "Game duration: " + jElapsedRealtime + "ms.");
            dj.g.b().k(L(), jElapsedRealtime);
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void h(long j10, String str, String str2) {
        this.f8953m.G(j10, str, str2);
    }

    public void h0() {
        q.h("ExperienceSession", "Resume game session");
        this.f8963w = false;
        j0(true);
        D();
        this.f8954n.p().e();
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void i(long j10, String str, String str2) {
        this.f8953m.J(j10, str, str2);
    }

    public final void i0() {
        long jA = h.a().S0() ? new rm.a(rm.b.i().d("Backgrounding.General"), 30000L).a() : 30000L;
        q.h("ExperienceSession", "CountDownTimer constructed with delay:" + jA);
        this.f8945e = new c(jA, 1000L).start();
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void j(long j10, String str, String str2, String str3) {
        this.f8953m.K(j10, str, str2, str3);
    }

    public final synchronized void j0(boolean z10) {
        try {
            if (this.f8962v) {
                return;
            }
            this.f8962v = true;
            NativeReportingInterface.gameForegrounded();
            if (z10) {
                NativeGLInterface.nativeOnExperienceSessionResume();
            } else {
                NativeGLInterface.nativeOnFragmentStart();
            }
            vm.b.h().e();
            if (this.f8960t == null && this.f8951k != null) {
                q.b("rbx.screen", "adding GlobalLayoutListener");
                this.f8960t = this.f8951k;
                this.f8959s.getViewTreeObserver().addOnGlobalLayoutListener(this.f8960t);
            }
            com.roblox.client.game.b bVar = this.f8951k;
            if (bVar != null) {
                bVar.y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void k() {
        final v vVarO0 = this.f8946f.o0();
        if (vVarO0 == null) {
            q.k("ExperienceSession", "exitApp: no activity to finish");
        } else {
            q.h("ExperienceSession", "exitApp: finishing task at the user's request");
            vVarO0.runOnUiThread(new Runnable() { // from class: ei.v
                @Override // java.lang.Runnable
                public final void run() {
                    vVarO0.finishAndRemoveTask();
                }
            });
        }
    }

    public final synchronized void k0(boolean z10) {
        try {
            if (this.f8962v) {
                this.f8962v = false;
                NativeReportingInterface.gameBackgrounded();
                if (z10) {
                    NativeGLInterface.nativeOnExperienceSessionPause();
                } else {
                    NativeGLInterface.nativeOnFragmentStop();
                }
                vm.b.h().f();
                com.roblox.client.game.b bVar = this.f8951k;
                if (bVar != null) {
                    bVar.G();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void l(long j10) {
        q.h("ExperienceSession", "onGameLoaded: placeId = " + j10);
        com.roblox.client.game.b bVar = this.f8951k;
        if (bVar != null) {
            bVar.K(j10);
        }
        this.f8957q = SystemClock.elapsedRealtime();
    }

    public void l0(d dVar) {
        this.f8946f = dVar;
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void m(long j10, String str) {
        this.f8953m.F(j10, str);
    }

    @Override // lm.g.a
    public void m0(String str) {
    }

    @Override // com.roblox.client.game.a.InterfaceC0145a
    public void n(final int i10) {
        d0(new Runnable() { // from class: ei.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f13808a.X(i10);
            }
        });
    }

    public final void n0(long j10) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f8952l, new com.roblox.client.game.a(this, this.f8951k)));
        NativeGLJavaInterface.setExitImplementation(new b());
    }

    @Override // lm.g.a
    public void o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // lm.g.a
    public void p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    public void p0() {
        q.h("ExperienceSession", "Start game session");
        if (h.a().t4()) {
            LoggingProtocol.g("native_experience_start");
        }
        D();
        this.f8952l = new Handler(Looper.getMainLooper());
        this.f8953m = new IAPPurchaseManager(this, false);
        this.f8956p = h.a().T5();
        H();
        if (!this.f8956p) {
            K().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: ei.t
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i10) {
                    this.f13786a.Y(i10);
                }
            });
        }
        N();
        Bundle bundle = this.f8947g;
        this.f8959s = (ViewGroup) K().findViewById(m0.f4136e);
        o0();
        if (!z0.j()) {
            this.f8946f.H();
        }
        this.f8954n = y.h();
        ei.m0 m0Var = new ei.m0(bundle);
        this.f8961u = bundle.getLong("roblox_placeId", 0L);
        a1.W0();
        if (!f8941x) {
            f8941x = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        a1.V0();
        j0 j0Var = new j0(this, m0Var);
        this.f8950j = j0Var;
        j0Var.A(null, null, null);
        O(this.f8959s);
        n0(this.f8961u);
        j0(false);
        NativeReportingInterface.applicationBackgrounded();
        if (!h.a().i5()) {
            K().getWindow().addFlags(Barcode.FORMAT_ITF);
        }
        g.x().g(this);
    }

    @Override // ei.w0
    public void q() {
        q.h("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (K().isFinishing()) {
            return;
        }
        K().setResult(103);
        F(false);
    }

    @Override // mj.a
    public com.roblox.client.b q0() {
        return (com.roblox.client.a) K();
    }

    @Override // lm.g.a
    public void u(String str, String str2) {
        if (this.f8963w) {
            this.f8952l.post(new a());
            this.f8963w = false;
        }
    }
}
