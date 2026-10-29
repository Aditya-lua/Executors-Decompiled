package com.roblox.client.startup;

import ak.k0;
import ak.n0;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.roblox.client.components.LoadingBar;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import gk.p;
import gk.v;
import gk.w;
import java.util.List;
import java.util.concurrent.Executors;
import jj.r;
import jj.u;
import jj.x;
import sg.a1;
import sg.m0;
import sg.q0;
import sg.t0;
import sg.y;
import th.h;
import vh.m;
import vi.g;

/* JADX INFO: loaded from: classes2.dex */
public class ActivitySplash extends com.roblox.client.a implements n0, c.b {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f9391e0 = true;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static boolean f9392f0;
    public LoadingBar S;
    public Runnable T;
    public long U;
    public Intent X;
    public boolean Y;
    public boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public StartedForEnum f9393a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f9394b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f9395c0;
    public Handler V = new Handler();
    public boolean W = false;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ml.d f9396d0 = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivitySplash.this.T = null;
            ActivitySplash.this.S.setVisibility(0);
        }
    }

    private void A2(int i10) {
        LoggingProtocol.g("retry_during_splash");
        c.y2(this, i10);
    }

    private void B2() {
        p.h("rbx.splash", "startup:");
        C2(true);
        k0.s(this).O();
    }

    private void C2(boolean z10) {
        if (a1.q0()) {
            p.b("rbx.splash", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        if (!z10) {
            p2();
            this.S.setVisibility(8);
            return;
        }
        if (!f9391e0) {
            this.S.setVisibility(0);
            return;
        }
        f9391e0 = false;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.U;
        if (jElapsedRealtime >= 5000) {
            this.S.setVisibility(0);
            return;
        }
        this.V = new Handler();
        a aVar = new a();
        this.T = aVar;
        this.V.postDelayed(aVar, 5000 - jElapsedRealtime);
    }

    public static Intent o2(Context context, StartedForEnum startedForEnum) {
        Intent intent = new Intent(context, (Class<?>) ActivitySplash.class);
        p.h("rbx.splash", "buildIntent for: " + startedForEnum);
        intent.putExtra("STARTED_FOR_INTENT_KEY", startedForEnum);
        return intent;
    }

    private void q2() {
        c.v2(this);
    }

    public static boolean r2() {
        return f9392f0;
    }

    @Override // ak.n0
    public void G() {
        g.b().i(this.W);
        z2();
        if (J1()) {
            if (h.a().j0() && this.f9396d0 != null) {
                Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ak.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f558a.v2();
                    }
                });
                return;
            }
            p.h("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now...");
            this.f9395c0 = true;
            k0.s(this).S(this);
            w2(this.f9394b0);
            finish();
        }
    }

    @Override // ak.n0
    public void J() {
        if (a1.q0()) {
            w.a(this, q0.S);
            finish();
        } else {
            C2(false);
            if (J1()) {
                A2(q0.S);
            }
        }
    }

    @Override // com.roblox.client.startup.c.b
    public void N() {
        q2();
        B2();
    }

    @Override // ak.n0
    public void O() {
    }

    @Override // com.roblox.client.a
    public boolean P1() {
        return true;
    }

    @Override // com.roblox.client.a
    public mi.c Q1() {
        return new mi.d();
    }

    @Override // com.roblox.client.startup.c.b
    public void i() {
        q2();
        B2();
    }

    @Override // ak.n0
    public void i0() {
    }

    @Override // ak.n0
    public void k0() {
        if (J1()) {
            if (!h.a().j0() || this.f9396d0 == null) {
                w2(false);
            } else {
                Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ak.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f547a.t2();
                    }
                });
            }
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (h.a().G1()) {
            p.h("rbx.splash", "GameActivity = ON. Start new GameActivity...");
            super.onCreate(bundle);
            Intent intent = new Intent(this, (Class<?>) MainGameActivity.class);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            startActivity(intent);
            finish();
            return;
        }
        if (r2()) {
            p.h("rbx.splash", "Process reuse detected.");
            LoggingProtocol.g("process_reuse");
        }
        LoggingProtocol.g("splash_activity_oncreate");
        super.onCreate(bundle);
        if (h.a().j0()) {
            p.h("rbx.splash", "Attach platform emergency observer.");
            if (this.f9396d0 == null) {
                this.f9396d0 = new ml.d();
            }
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            platformSystemDialogHandler.attachObserver(this.f9396d0);
            platformSystemDialogHandler.setActivity(this);
        }
        jm.a.c(this);
        jm.a.j().a(jm.a.EnumC0382a.SPLASH, bundle);
        this.U = SystemClock.elapsedRealtime();
        Intent intent2 = getIntent();
        this.X = intent2;
        this.f9393a0 = y2(intent2);
        NativeReportingInterface.initAppShellReporter();
        p.b("rbx.splash", "Started for: " + this.f9393a0);
        StartedForEnum startedForEnum = this.f9393a0;
        this.Y = startedForEnum == StartedForEnum.SHELL_PROCESS_RESTART_FOR_RESULT || startedForEnum == StartedForEnum.AFTER_LOGIN_FOR_RESULT;
        this.Z = startedForEnum == StartedForEnum.AFTER_SIGN_UP;
        this.f9394b0 = startedForEnum == StartedForEnum.PROTOCOL_LAUNCH;
        p.h("rbx.splash", "onCreate: startedForResult=" + this.Y + ", appRestarted=" + (startedForEnum == StartedForEnum.APP_RESTART));
        setContentView(sg.n0.f30879e);
        this.S = (LoadingBar) findViewById(m0.U);
        if (nh.b.a()) {
            String strG = a1.G();
            if (!TextUtils.isEmpty(strG)) {
                Toast.makeText(this, "Using " + strG, 1).show();
            }
        }
        li.a.h();
        this.W = R1();
        if (bundle == null) {
            vi.b.f().c(this);
        }
        if (nh.b.a() && a1.x0()) {
            p.k("rbx.splash", "Alert: needs restart");
            O1();
        } else {
            k0.s(this).M(this.f9393a0);
            k0.s(this).N(this);
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f9396d0 != null) {
            p.h("rbx.splash", "Detach platform emergency observer.");
            PlatformSystemDialogHandler.INSTANCE.detachObserver(this.f9396d0);
            this.f9396d0 = null;
        }
        p.h("rbx.splash", "onDestroy: unset the activity from InitHelper.");
        k0.s(this).S(this);
    }

    @Override // com.roblox.client.b, e.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        p.h("rbx.splash", "onNewIntent: intent=" + intent);
        this.X = intent;
        this.f9393a0 = y2(intent);
        x2();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
        LoggingProtocol.g("splash_activity_onpause");
        if (h.a().C3()) {
            if (isFinishing()) {
                p.b("rbx.splash", "ActivitySplash is paused due to finish()");
            } else {
                p.k("rbx.splash", "ActivitySplash is paused due to the app being put into the background.");
                LoggingProtocol.g("startup_interrupted");
            }
        }
        p.b("rbx.splash", "onPause: isFinishing = " + isFinishing());
        p2();
        if (this.f9395c0) {
            return;
        }
        jm.a.j().b(jm.a.EnumC0382a.SPLASH);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        p.b("rbx.splash", "onResume:");
        q2();
        B2();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        f9392f0 = true;
        jm.a.j().h();
        t0.v("splash");
    }

    public final void p2() {
        Runnable runnable = this.T;
        if (runnable != null) {
            this.V.removeCallbacks(runnable);
            this.T = null;
        }
    }

    public final /* synthetic */ void s2() {
        p.h("rbx.splash", "navigateToMainScreen: launch the Main activity now...");
        w2(false);
    }

    public final /* synthetic */ void t2() {
        p.h("rbx.splash", "navigateToMainScreen: check for platform emergency...");
        this.f9396d0.g(new Runnable() { // from class: ak.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f557a.s2();
            }
        });
    }

    public final /* synthetic */ void u2() {
        p.h("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now...");
        this.f9395c0 = true;
        k0.s(this).S(this);
        w2(this.f9394b0);
        finish();
    }

    public final /* synthetic */ void v2() {
        p.h("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) check for platform emergency...");
        this.f9396d0.g(new Runnable() { // from class: ak.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f561a.u2();
            }
        });
    }

    public final void w2(boolean z10) {
        x2();
        if (isFinishing()) {
            p.h("rbx.splash", "isFinishing");
            return;
        }
        p.h("rbx.splash", "launchMainActivity");
        Intent intentI = y.h().i(this);
        if (z10) {
            t0.b(this, "protocolLaunch");
        }
        if (this.Z) {
            intentI.putExtra("loginAfterSignup", true);
        }
        if (this.X.getExtras() != null) {
            intentI.putExtras(this.X.getExtras());
        }
        if (h.a().N3()) {
            LoggingProtocol.g("main_activity_launch_begin");
        }
        jm.a.j().e();
        startActivity(intentI);
        overridePendingTransition(0, 0);
        finish();
    }

    public final void x2() {
        if (this.f9393a0 != StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION) {
            return;
        }
        Bundle extras = this.X.getExtras();
        if (extras != null) {
            r.k().G(extras);
        }
        String string = extras.getString("EXTRA_NOTIFICATION_TYPE", "");
        String string2 = extras.getString("EXTRA_NOTIFICATION_VERSION", "");
        String string3 = extras.getString("EXTRA_NOTIFICATION_ID", "");
        List<NameValuePair> listA = jj.w.a(this.X);
        if (string2.isEmpty()) {
            if (string == "ChatNewMessage") {
                u.c().i(extras.getString("EXTRA_CATEGORY", ""));
            } else {
                u.c().d(string).clear();
                nj.h.g(this.X, this);
            }
        }
        t0.r("clicked", new x().a(this, "GcmPlatform"), string, string3, v.a(this), true, string2, "startup", listA);
        com.roblox.client.pushnotification.actions.a.a(this, this.X, true);
    }

    public final StartedForEnum y2(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(StartedForEnum.class.getClassLoader());
            try {
                StartedForEnum startedForEnum = Build.VERSION.SDK_INT >= 33 ? (StartedForEnum) intent.getSerializableExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.class) : (StartedForEnum) intent.getSerializableExtra("STARTED_FOR_INTENT_KEY");
                if (startedForEnum != null) {
                    return startedForEnum;
                }
            } catch (RuntimeException e10) {
                p.h("rbx.splash", "readStartedForEnum: Exception caught: " + e10);
            }
        }
        return StartedForEnum.SYSTEM;
    }

    public final void z2() {
        m mVarB = m.b();
        mVarB.d(h.a().U1());
        mVarB.c(a1.e0());
    }
}
