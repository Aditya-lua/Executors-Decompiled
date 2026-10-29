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
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.AbstractActivityC3160b;
import com.roblox.client.ActivityNativeMain;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.RobloxApplication;
import com.roblox.client.ossearch.C3210b;
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
import dm.C4642a;
import dm.C4643b;
import hm.C6426b;
import p093e4.ActivityC4831q;
import p103eh.C5117e;
import p105ej.InterfaceC5143a;
import p151gk.C6124q;
import p310nk.C9491b;
import p383qi.C10583b;
import p517wh.AbstractC12472y0;
import p517wh.C12446l0;
import p517wh.C12470x0;
import p517wh.EnumC12462t0;
import p517wh.InterfaceC12466v0;
import p517wh.SurfaceHolderCallbackC12440i0;
import p551xl.C12864g;
import sg.C11295a1;
import sg.C11304c2;
import sg.C11335m0;
import sg.C11346q;
import sg.C11347q0;
import sg.C11370y;
import sg.InterfaceC11314f0;
import th.C11659h;
import vi.C12216g;

/* JADX INFO: loaded from: classes2.dex */
public class ExperienceSession implements InterfaceC12466v0, InterfaceC5143a, C3196a.a, C12864g.a {

    /* JADX INFO: renamed from: x */
    public static boolean f11817x;

    /* JADX INFO: renamed from: a */
    public C12470x0 f11818a;

    /* JADX INFO: renamed from: d */
    public boolean f11821d;

    /* JADX INFO: renamed from: e */
    public CountDownTimer f11822e;

    /* JADX INFO: renamed from: f */
    public InterfaceC3193d f11823f;

    /* JADX INFO: renamed from: g */
    public final Bundle f11824g;

    /* JADX INFO: renamed from: j */
    public SurfaceHolderCallbackC12440i0 f11827j;

    /* JADX INFO: renamed from: l */
    public Handler f11829l;

    /* JADX INFO: renamed from: m */
    public IAPPurchaseManager f11830m;

    /* JADX INFO: renamed from: n */
    public C11370y f11831n;

    /* JADX INFO: renamed from: o */
    public int f11832o;

    /* JADX INFO: renamed from: p */
    public boolean f11833p;

    /* JADX INFO: renamed from: q */
    public long f11834q;

    /* JADX INFO: renamed from: r */
    public AbstractC12472y0 f11835r;

    /* JADX INFO: renamed from: s */
    public ViewGroup f11836s;

    /* JADX INFO: renamed from: t */
    public ViewTreeObserver.OnGlobalLayoutListener f11837t;

    /* JADX INFO: renamed from: u */
    public long f11838u;

    /* JADX INFO: renamed from: b */
    public final String f11819b = "ExperienceSession";

    /* JADX INFO: renamed from: c */
    public boolean f11820c = false;

    /* JADX INFO: renamed from: h */
    public final long f11825h = 30000;

    /* JADX INFO: renamed from: i */
    public final C3195f f11826i = new C3195f();

    /* JADX INFO: renamed from: k */
    public ViewTreeObserverOnGlobalLayoutListenerC3197b f11828k = null;

    /* JADX INFO: renamed from: v */
    public boolean f11839v = false;

    /* JADX INFO: renamed from: w */
    public boolean f11840w = false;

    /* JADX INFO: renamed from: com.roblox.client.game.ExperienceSession$a */
    public class RunnableC3190a implements Runnable {
        public RunnableC3190a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ExperienceSession.this.m15188Z();
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.ExperienceSession$b */
    public class C3191b extends EngineExitJavaCallback2 {
        public C3191b() {
        }

        @Override // com.roblox.engine.jni.EngineExitJavaCallback2
        /* JADX INFO: renamed from: a */
        public void mo15214a() {
            C6124q.m27063h("ExperienceSession", "... (onCreate) gameDidLeave callback invoked.");
            ExperienceSession.this.m15171G();
            ExperienceSession.this.m15183T(true);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.ExperienceSession$c */
    public class CountDownTimerC3192c extends CountDownTimer {
        public CountDownTimerC3192c(long j10, long j11) {
            super(j10, j11);
        }

        @Override // android.os.CountDownTimer
        public void onFinish() {
            C6124q.m27063h("ExperienceSession", "CountDownTimer::onFinish -> onGameTimeoutInBackground()");
            ExperienceSession.this.m15167B();
        }

        @Override // android.os.CountDownTimer
        public void onTick(long j10) {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.ExperienceSession$d */
    public interface InterfaceC3193d extends InterfaceC11314f0 {
        /* JADX INFO: renamed from: m */
        void mo14784m(Bundle bundle);

        /* JADX INFO: renamed from: o0 */
        ActivityC4831q mo14788o0();
    }

    /* JADX INFO: renamed from: com.roblox.client.game.ExperienceSession$e */
    public class C3194e extends AbstractC12472y0 {
        @Override // p517wh.AbstractC12472y0
        /* JADX INFO: renamed from: h */
        public void mo15215h(int i10) {
            C6124q.m27063h("rbx.game.orientation", "setting orientation: " + i10);
            ExperienceSession.this.m15172H().setRequestedOrientation(i10);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C3194e() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.game.ExperienceSession$f */
    public class C3195f {
        public C3195f() {
        }

        /* JADX INFO: renamed from: a */
        public C9491b m15216a() {
            if (ExperienceSession.this.m15172H() == null) {
                return null;
            }
            return C9491b.m37386a(ExperienceSession.this.f11836s.getRootView(), ExperienceSession.this.m15172H().getWindowManager(), null, ((AbstractActivityC3152a) ExperienceSession.this.m15172H()).m14962G1().m34391c());
        }
    }

    public ExperienceSession(Bundle bundle) {
        this.f11824g = bundle;
    }

    /* JADX INFO: renamed from: L */
    private void m15154L(View view) {
        ViewStub viewStub;
        if (C11659h.m43403a().mo43468J0() && (viewStub = (ViewStub) view.findViewById(C11335m0.f39786R)) != null) {
            viewStub.inflate();
        }
        RbxKeyboard rbxKeyboard = (RbxKeyboard) view.findViewById(C11335m0.f39775G);
        if (rbxKeyboard == null) {
            return;
        }
        rbxKeyboard.setBackgroundColor(0);
        C5117e.m23880d(rbxKeyboard, m15173I(), "SourceSansPro-Regular.ttf");
        this.f11828k = new ViewTreeObserverOnGlobalLayoutListenerC3197b(rbxKeyboard, this.f11827j, this.f11826i);
        RobloxApplication.m14834f().registerComponentCallbacks(this.f11828k);
    }

    /* JADX INFO: renamed from: k0 */
    private void m15157k0() {
        Window window;
        if (Build.VERSION.SDK_INT < 28 || this.f11823f == null || (window = m15172H().getWindow()) == null) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        mo15213q0().m14962G1().m34393e(window.getDecorView());
        if (this.f11818a == null) {
            this.f11818a = new C12470x0(m15173I());
        }
        this.f11818a.m46719i(mo15213q0(), mo15213q0().m14962G1().m34389a());
    }

    @Keep
    public static boolean shouldDisableExperienceIdleTimer() {
        if (C12864g.m47841x().m47843h() || MediaPickerProtocolV2.isCapturingMedia()) {
            return true;
        }
        return C11659h.m43403a().mo43761y3() && FacialAgeEstimationProtocol.INSTANCE.isInInquiryFlow();
    }

    /* JADX INFO: renamed from: A */
    public final void m15166A() {
        C6124q.m27063h("ExperienceSession", "GameSession cancelScheduledGameExit");
        CountDownTimer countDownTimer = this.f11822e;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.f11822e = null;
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m15167B() {
        if (m15172H() != null) {
            C6124q.m27063h("ExperienceSession", "endGameInBackground: call finish() on this GL activity.");
            m15168D(true);
        }
        if (C11659h.m43403a().mo43424C5()) {
            C6124q.m27063h("ExperienceSession", "endGameInBackground: setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        NativeGLInterface.setTaskSchedulerBackgroundMode(true, "ES.endGameInBackground");
        m15183T(true);
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: C */
    public void mo14808C(String str, boolean z10) {
    }

    /* JADX INFO: renamed from: D */
    public void m15168D(boolean z10) {
        C6124q.m27063h("ExperienceSession", "Ending game session with place ID " + this.f11838u);
        this.f11840w = false;
        m15166A();
        C12864g.m47841x().m47858w(this);
        if (!z10) {
            NativeReportingInterface.applicationForegrounded();
        }
        m15202h0(false);
        if (this.f11820c) {
            C6124q.m27066k("ExperienceSession", "Trying to end the session but it has already ended.");
            return;
        }
        this.f11820c = true;
        m15194c0();
        Bundle bundle = new Bundle();
        bundle.putInt("gameExitStatus", 102);
        if (C11659h.m43403a().mo43660k0()) {
            bundle.putLong(PinShortcutHandler.EXTRA_PLACE_ID, this.f11824g.getLong("roblox_placeId"));
            bundle.putString("gameId", this.f11824g.getString("roblox_gameId"));
        }
        boolean zIsChangingConfigurations = m15172H().isChangingConfigurations();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onDestroy: shutdown = ");
        sb2.append(!zIsChangingConfigurations);
        sb2.append(", hasGameStarted = ");
        sb2.append(this.f11821d);
        C6124q.m27063h("ExperienceSession", sb2.toString());
        if (!zIsChangingConfigurations && this.f11821d) {
            C6124q.m27063h("ExperienceSession", "onDestroy: Call stopDataModel (SYNC) if the GL fragment is still there...");
            if (z10) {
                this.f11827j.m46608j();
            } else {
                this.f11827j.m46604D();
            }
        }
        m15172H().runOnUiThread(new Runnable() { // from class: wh.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f44561a.m15177N();
            }
        });
        NativeGLJavaInterface.setExitImplementation(null);
        this.f11823f.mo14784m(bundle);
        RobloxApplication.m14834f().unregisterComponentCallbacks(this.f11828k);
    }

    /* JADX INFO: renamed from: E */
    public final void m15169E() {
        C6124q.m27063h("ExperienceSession", "Entering immersive mode");
        if (this.f11833p) {
            C11304c2.m42492b(m15172H().getWindow());
        } else {
            C6124q.m27063h("ExperienceSession", "System visibility " + this.f11832o);
            if (this.f11832o == 0) {
                this.f11832o = m15172H().getWindow().getDecorView().getSystemUiVisibility();
            }
            m15172H().getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        ((ActivityNativeMain) m15172H()).m14851W1().m34408o(EnumC12462t0.EXPERIENCE);
    }

    /* JADX INFO: renamed from: F */
    public final void m15170F() {
        C6124q.m27063h("ExperienceSession", "Exiting immersive mode");
        Activity activityM15172H = m15172H();
        if (activityM15172H == null || activityM15172H.isFinishing()) {
            return;
        }
        ((AbstractActivityC3152a) activityM15172H).m14851W1().m34408o(EnumC12462t0.APP);
        if (this.f11833p) {
            C11304c2.m42493c(activityM15172H.getWindow());
        } else {
            activityM15172H.getWindow().getDecorView().setSystemUiVisibility(this.f11832o);
        }
        if (C11295a1.m42415Q0(activityM15172H.getResources().getConfiguration())) {
            activityM15172H.getWindow().getDecorView().post(new Runnable() { // from class: wh.s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44562a.m15178O();
                }
            });
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m15171G() {
        C6124q.m27063h("ExperienceSession", "finishGame:");
        if (((ActivityC4831q) m15172H()) != null) {
            m15192b0();
            m15168D(false);
        }
    }

    /* JADX INFO: renamed from: H */
    public Activity m15172H() {
        return this.f11823f.mo14788o0();
    }

    /* JADX INFO: renamed from: I */
    public Context m15173I() {
        return this.f11823f.mo14788o0();
    }

    /* JADX INFO: renamed from: J */
    public final void m15174J() {
        m15171G();
        m15183T(false);
    }

    /* JADX INFO: renamed from: K */
    public final void m15175K() {
        final View viewFindViewById = m15172H().findViewById(C11335m0.f39790V);
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

    /* JADX INFO: renamed from: M */
    public boolean m15176M() {
        InterfaceC3193d interfaceC3193d = this.f11823f;
        if (interfaceC3193d != null) {
            return interfaceC3193d.mo14769b();
        }
        return false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m15177N() {
        if (!C11659h.m43403a().mo43606c5()) {
            m15172H().getWindow().clearFlags(128);
        }
        m15192b0();
        if (!this.f11833p) {
            m15172H().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(null);
        }
        m15170F();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m15178O() {
        Activity activityM15172H = m15172H();
        if (activityM15172H == null || activityM15172H.isFinishing()) {
            return;
        }
        C11304c2.m42492b(activityM15172H.getWindow());
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m15179P(DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        m15174J();
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m15180Q(DialogInterface dialogInterface) {
        dialogInterface.dismiss();
        m15174J();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m15181R(int i10) {
        C10583b.m40569f().m40587u(m15173I());
        new AlertDialog.Builder(m15173I()).setMessage(i10).setNegativeButton(m15172H().getString(C11347q0.f39927N), new DialogInterface.OnClickListener() { // from class: wh.w
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                this.f44590a.m15179P(dialogInterface, i11);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: wh.x
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f44591a.m15180Q(dialogInterface);
            }
        }).create().show();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m15182S(int i10) {
        if (this.f11820c || (i10 & 4) != 0) {
            return;
        }
        m15169E();
    }

    /* JADX INFO: renamed from: T */
    public void m15183T(boolean z10) {
        C6124q.m27063h("ExperienceSession", "onGameEnded: success = " + z10 + ", hasGameStarted = " + this.f11821d);
        this.f11821d = false;
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: U */
    public void mo15184U(int i10) {
        ((AbstractActivityC3160b) m15172H()).m14968U(i10);
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: V */
    public void mo14812V(String str) {
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: W */
    public void mo15185W(String str) {
        ((AbstractActivityC3160b) m15172H()).m14969W(str);
    }

    /* JADX INFO: renamed from: X */
    public void m15186X() {
        C6124q.m27057b("ExperienceSession", "onSurfaceCreated: finished = " + this.f11820c);
        NativeGLInterface.setTaskSchedulerBackgroundMode(false, "ES.onSurfaceCreated");
    }

    /* JADX INFO: renamed from: Y */
    public void m15187Y() {
        C6124q.m27057b("ExperienceSession", "onSurfaceDestroyed: finished = " + this.f11820c);
    }

    /* JADX INFO: renamed from: Z */
    public void m15188Z() {
        if (shouldDisableExperienceIdleTimer()) {
            C6124q.m27063h("ExperienceSession", "Not pausing game session, user is in a call or capturing media or in a persona session");
            this.f11840w = true;
            return;
        }
        C6124q.m27063h("ExperienceSession", "Pause game session");
        this.f11831n.m42596p().m45310d();
        m15202h0(true);
        m15196e0();
        m15192b0();
    }

    @Override // p517wh.InterfaceC12466v0
    /* JADX INFO: renamed from: a */
    public void mo15189a(long j10) {
        C6124q.m27063h("ExperienceSession", "onGameStarting: placeId = " + j10);
        this.f11831n.m42596p().m45308b();
    }

    /* JADX INFO: renamed from: a0 */
    public void m15190a0(Runnable runnable) {
        this.f11829l.post(runnable);
    }

    @Override // p517wh.InterfaceC12466v0
    /* JADX INFO: renamed from: b */
    public void mo15191b(long j10) {
        C6124q.m27063h("ExperienceSession", "onGameStarted: placeId = " + j10);
        this.f11821d = true;
        this.f11831n.m42596p().m45307a();
        if (C11659h.m43403a().mo43686n5()) {
            C3210b.m15317b(m15173I(), j10);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m15192b0() {
        if (this.f11837t != null) {
            C6124q.m27057b("rbx.screen", "removing GlobalLayoutListener");
            this.f11836s.getViewTreeObserver().removeOnGlobalLayoutListener(this.f11837t);
            this.f11837t = null;
        }
    }

    @Override // p517wh.InterfaceC12466v0
    /* JADX INFO: renamed from: c */
    public void mo15193c() {
        C6124q.m27063h("ExperienceSession", "onSettingsNotLoaded (detected from Game fragment)");
        if (m15172H().isFinishing()) {
            return;
        }
        m15172H().setResult(103);
        m15168D(false);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m15194c0() {
        if (this.f11834q > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f11834q;
            C6124q.m27063h("ExperienceSession", "Game duration: " + jElapsedRealtime + "ms.");
            C12216g.m45228b().m45272k(m15173I(), jElapsedRealtime);
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m15195d0() {
        C6124q.m27063h("ExperienceSession", "Resume game session");
        this.f11840w = false;
        m15200g0(true);
        m15166A();
        this.f11831n.m42596p().m45311e();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m15196e0() {
        long jM22863a = C11659h.m43403a().mo43502O0() ? new C4642a(C4643b.m22866i().m22868d("Backgrounding.General"), 30000L).m22863a() : 30000L;
        C6124q.m27063h("ExperienceSession", "CountDownTimer constructed with delay:" + jM22863a);
        this.f11822e = new CountDownTimerC3192c(jM22863a, 1000L).start();
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: f */
    public void mo15197f(boolean z10) {
        this.f11823f.mo14774f(z10);
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: f0 */
    public Activity mo15198f0() {
        return m15172H();
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: g */
    public void mo15199g(int i10) {
        if (this.f11835r == null) {
            this.f11835r = new C3194e();
        }
        this.f11835r.m23865e(Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: g0 */
    public final synchronized void m15200g0(boolean z10) {
        try {
            if (this.f11839v) {
                return;
            }
            this.f11839v = true;
            NativeReportingInterface.gameForegrounded();
            if (z10) {
                NativeGLInterface.nativeOnExperienceSessionResume();
            } else {
                NativeGLInterface.nativeOnFragmentStart();
            }
            C6426b.m28011h().m28012e();
            if (this.f11837t == null && this.f11828k != null) {
                C6124q.m27057b("rbx.screen", "adding GlobalLayoutListener");
                this.f11837t = this.f11828k;
                this.f11836s.getViewTreeObserver().addOnGlobalLayoutListener(this.f11837t);
            }
            ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = this.f11828k;
            if (viewTreeObserverOnGlobalLayoutListenerC3197b != null) {
                viewTreeObserverOnGlobalLayoutListenerC3197b.m15262y();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: h */
    public void mo15201h(long j10, String str, String str2) {
        this.f11830m.m15371A(j10, str, str2);
    }

    /* JADX INFO: renamed from: h0 */
    public final synchronized void m15202h0(boolean z10) {
        try {
            if (this.f11839v) {
                this.f11839v = false;
                NativeReportingInterface.gameBackgrounded();
                if (z10) {
                    NativeGLInterface.nativeOnExperienceSessionPause();
                } else {
                    NativeGLInterface.nativeOnFragmentStop();
                }
                C6426b.m28011h().m28013f();
                ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = this.f11828k;
                if (viewTreeObserverOnGlobalLayoutListenerC3197b != null) {
                    viewTreeObserverOnGlobalLayoutListenerC3197b.m15248G();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: i */
    public void mo15203i(String str, String str2, String str3) {
        C11346q.m42514g(this.f11823f.mo14788o0(), str, str2, str3);
    }

    /* JADX INFO: renamed from: i0 */
    public void m15204i0(InterfaceC3193d interfaceC3193d) {
        this.f11823f = interfaceC3193d;
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: j */
    public void mo15205j(long j10, String str, String str2) {
        this.f11830m.m15385z(j10, str, str2);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m15206j0(long j10) {
        NativeGLJavaInterface.setImplementation(new RunOnMainEngineJavaCallback(this.f11829l, new C3196a(this, this.f11828k)));
        NativeGLJavaInterface.setExitImplementation(new C3191b());
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: k */
    public void mo15207k(long j10, String str, String str2) {
        this.f11830m.m15372B(j10, str, str2);
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: l */
    public void mo15208l(long j10, String str, String str2, String str3) {
        this.f11830m.m15373C(j10, str, str2, str3);
    }

    /* JADX INFO: renamed from: l0 */
    public void m15209l0() {
        C6124q.m27063h("ExperienceSession", "Start game session");
        if (C11659h.m43403a().mo43664k4()) {
            LoggingProtocol.m15994g("native_experience_start");
        }
        m15166A();
        this.f11829l = new Handler(Looper.getMainLooper());
        this.f11830m = new IAPPurchaseManager(this, false);
        this.f11833p = C11659h.m43403a().mo43527R5();
        m15169E();
        if (!this.f11833p) {
            m15172H().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: wh.t
                @Override // android.view.View.OnSystemUiVisibilityChangeListener
                public final void onSystemUiVisibilityChange(int i10) {
                    this.f44574a.m15182S(i10);
                }
            });
        }
        m15175K();
        Bundle bundle = this.f11824g;
        this.f11836s = (ViewGroup) m15172H().findViewById(C11335m0.f39803e);
        m15157k0();
        if (!AbstractC12472y0.m46723j()) {
            this.f11823f.mo14746I();
        }
        this.f11831n = C11370y.m42581h();
        C12446l0 c12446l0 = new C12446l0(bundle);
        this.f11838u = bundle.getLong("roblox_placeId", 0L);
        C11295a1.m42425V0();
        if (!f11817x) {
            f11817x = true;
            NativeGLInterface.nativeGameGlobalInit();
        }
        C11295a1.m42423U0();
        SurfaceHolderCallbackC12440i0 surfaceHolderCallbackC12440i0 = new SurfaceHolderCallbackC12440i0(this, c12446l0);
        this.f11827j = surfaceHolderCallbackC12440i0;
        surfaceHolderCallbackC12440i0.m46601A(null, null, null);
        m15154L(this.f11836s);
        m15206j0(this.f11838u);
        m15200g0(false);
        NativeReportingInterface.applicationBackgrounded();
        if (!C11659h.m43403a().mo43606c5()) {
            m15172H().getWindow().addFlags(128);
        }
        C12864g.m47841x().m47842g(this);
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: m */
    public void mo15210m(long j10) {
        C6124q.m27063h("ExperienceSession", "onGameLoaded: placeId = " + j10);
        ViewTreeObserverOnGlobalLayoutListenerC3197b viewTreeObserverOnGlobalLayoutListenerC3197b = this.f11828k;
        if (viewTreeObserverOnGlobalLayoutListenerC3197b != null) {
            viewTreeObserverOnGlobalLayoutListenerC3197b.m15252K(j10);
        }
        this.f11834q = SystemClock.elapsedRealtime();
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: m0 */
    public void mo14813m0(String str) {
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: n */
    public void mo15211n(long j10, String str) {
        this.f11830m.m15384y(j10, str);
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: o */
    public void mo14814o(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: p */
    public void mo14815p(String str, String str2, String str3, String str4, String str5, String str6) {
    }

    @Override // com.roblox.client.game.C3196a.a
    /* JADX INFO: renamed from: q */
    public void mo15212q(final int i10) {
        m15190a0(new Runnable() { // from class: wh.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f44588a.m15181R(i10);
            }
        });
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: q0 */
    public AbstractActivityC3160b mo15213q0() {
        return (AbstractActivityC3152a) m15172H();
    }

    @Override // p551xl.C12864g.a
    /* JADX INFO: renamed from: v */
    public void mo14816v(String str, String str2) {
        if (this.f11840w) {
            this.f11829l.post(new RunnableC3190a());
            this.f11840w = false;
        }
    }
}
