package com.roblox.client.startup;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.axjava.Main;
import com.roblox.client.AbstractActivityC3152a;
import com.roblox.client.components.LoadingBar;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.pushnotification.actions.C3224a;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import java.util.List;
import java.util.concurrent.Executors;
import jm.C7209a;
import li.C8150a;
import ml.C8580d;
import p015ak.C0305k0;
import p015ak.InterfaceC0317n0;
import p151gk.C6124q;
import p151gk.C6130w;
import p151gk.C6131x;
import p222jj.C7193r;
import p222jj.C7196u;
import p222jj.C7198w;
import p222jj.C7199x;
import p293mi.C8527c;
import p293mi.C8528d;
import p308nh.C9476b;
import p309nj.AbstractC9489h;
import p491vh.C12209m;
import sg.C11295a1;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11347q0;
import sg.C11356t0;
import sg.C11370y;
import th.C11659h;
import vi.C12211b;
import vi.C12216g;

/* JADX INFO: loaded from: classes2.dex */
public class ActivitySplash extends AbstractActivityC3152a implements InterfaceC0317n0, C3274c.b {

    /* JADX INFO: renamed from: e0 */
    public static boolean f12246e0 = true;

    /* JADX INFO: renamed from: f0 */
    public static boolean f12247f0;

    /* JADX INFO: renamed from: S */
    public LoadingBar f12248S;

    /* JADX INFO: renamed from: T */
    public Runnable f12249T;

    /* JADX INFO: renamed from: U */
    public long f12250U;

    /* JADX INFO: renamed from: X */
    public Intent f12253X;

    /* JADX INFO: renamed from: Y */
    public boolean f12254Y;

    /* JADX INFO: renamed from: Z */
    public boolean f12255Z;

    /* JADX INFO: renamed from: a0 */
    public StartedForEnum f12256a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f12257b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f12258c0;

    /* JADX INFO: renamed from: V */
    public Handler f12251V = new Handler();

    /* JADX INFO: renamed from: W */
    public boolean f12252W = false;

    /* JADX INFO: renamed from: d0 */
    public C8580d f12259d0 = null;

    /* JADX INFO: renamed from: com.roblox.client.startup.ActivitySplash$a */
    public class RunnableC3258a implements Runnable {
        public RunnableC3258a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivitySplash.this.f12249T = null;
            ActivitySplash.this.f12248S.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: A2 */
    private void m15522A2(int i10) {
        LoggingProtocol.m15994g("retry_during_splash");
        C3274c.m15744y2(this, i10);
    }

    /* JADX INFO: renamed from: B2 */
    private void m15523B2() {
        C6124q.m27063h("rbx.splash", "startup:");
        m15524C2(true);
        C0305k0.m1274s(this).m1289O();
    }

    /* JADX INFO: renamed from: C2 */
    private void m15524C2(boolean z10) {
        if (C11295a1.m42471q0()) {
            C6124q.m27057b("rbx.splash", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        if (!z10) {
            m15534p2();
            this.f12248S.setVisibility(8);
            return;
        }
        if (!f12246e0) {
            this.f12248S.setVisibility(0);
            return;
        }
        f12246e0 = false;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f12250U;
        if (jElapsedRealtime >= 5000) {
            this.f12248S.setVisibility(0);
            return;
        }
        this.f12251V = new Handler();
        RunnableC3258a runnableC3258a = new RunnableC3258a();
        this.f12249T = runnableC3258a;
        this.f12251V.postDelayed(runnableC3258a, 5000 - jElapsedRealtime);
    }

    /* JADX INFO: renamed from: o2 */
    public static Intent m15531o2(Context context, StartedForEnum startedForEnum) {
        Intent intent = new Intent(context, (Class<?>) ActivitySplash.class);
        C6124q.m27063h("rbx.splash", "buildIntent for: " + startedForEnum);
        intent.putExtra("STARTED_FOR_INTENT_KEY", startedForEnum);
        return intent;
    }

    /* JADX INFO: renamed from: q2 */
    private void m15532q2() {
        C3274c.m15742v2(this);
    }

    /* JADX INFO: renamed from: r2 */
    public static boolean m15533r2() {
        return f12247f0;
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: G */
    public void mo1307G() {
        C12216g.m45228b().m45269i(this.f12252W);
        m15542z2();
        if (m14965J1()) {
            if (C11659h.m43403a().mo43681n0() && this.f12259d0 != null) {
                Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ak.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f740a.m15538v2();
                    }
                });
                return;
            }
            C6124q.m27063h("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now...");
            this.f12258c0 = true;
            C0305k0.m1274s(this).m1293S(this);
            m15539w2(this.f12257b0);
            finish();
        }
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: J */
    public void mo1308J() {
        if (C11295a1.m42471q0()) {
            C6131x.m27102a(this, C11347q0.f39937S);
            finish();
        } else {
            m15524C2(false);
            if (m14965J1()) {
                m15522A2(C11347q0.f39937S);
            }
        }
    }

    @Override // com.roblox.client.startup.C3274c.b
    /* JADX INFO: renamed from: N */
    public void mo14752N() {
        m15532q2();
        m15523B2();
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: O */
    public void mo1309O() {
    }

    @Override // com.roblox.client.AbstractActivityC3152a
    /* JADX INFO: renamed from: P1 */
    public boolean mo14755P1() {
        return true;
    }

    @Override // com.roblox.client.AbstractActivityC3152a
    /* JADX INFO: renamed from: Q1 */
    public C8527c mo14757Q1() {
        return new C8528d();
    }

    @Override // com.roblox.client.startup.C3274c.b
    /* JADX INFO: renamed from: i */
    public void mo14777i() {
        m15532q2();
        m15523B2();
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: i0 */
    public void mo1310i0() {
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: k0 */
    public void mo1311k0() {
        if (m14965J1()) {
            if (!C11659h.m43403a().mo43681n0() || this.f12259d0 == null) {
                m15539w2(false);
            } else {
                Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ak.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f727a.m15536t2();
                    }
                });
            }
        }
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Main.Start(this);
        if (C11659h.m43403a().mo43490M1()) {
            C6124q.m27063h("rbx.splash", "GameActivity = ON. Start new GameActivity...");
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
        if (m15533r2()) {
            C6124q.m27063h("rbx.splash", "Process reuse detected.");
            LoggingProtocol.m15994g("process_reuse");
        }
        LoggingProtocol.m15994g("splash_activity_oncreate");
        super.onCreate(bundle);
        if (C11659h.m43403a().mo43681n0()) {
            C6124q.m27063h("rbx.splash", "Attach platform emergency observer.");
            if (this.f12259d0 == null) {
                this.f12259d0 = new C8580d();
            }
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            platformSystemDialogHandler.attachObserver(this.f12259d0);
            platformSystemDialogHandler.setActivity(this);
        }
        C7209a.m30129c(this);
        C7209a.m30131j().m30132a(C7209a.a.SPLASH, bundle);
        this.f12250U = SystemClock.elapsedRealtime();
        Intent intent2 = getIntent();
        this.f12253X = intent2;
        this.f12256a0 = m15541y2(intent2);
        NativeReportingInterface.initAppShellReporter();
        C6124q.m27057b("rbx.splash", "Started for: " + this.f12256a0);
        StartedForEnum startedForEnum = this.f12256a0;
        this.f12254Y = startedForEnum == StartedForEnum.SHELL_PROCESS_RESTART_FOR_RESULT || startedForEnum == StartedForEnum.AFTER_LOGIN_FOR_RESULT;
        this.f12255Z = startedForEnum == StartedForEnum.AFTER_SIGN_UP;
        this.f12257b0 = startedForEnum == StartedForEnum.PROTOCOL_LAUNCH;
        C6124q.m27063h("rbx.splash", "onCreate: startedForResult=" + this.f12254Y + ", appRestarted=" + (startedForEnum == StartedForEnum.APP_RESTART));
        setContentView(C11338n0.f39858e);
        this.f12248S = (LoadingBar) findViewById(C11335m0.f39789U);
        if (C9476b.m37333a()) {
            String strM42394G = C11295a1.m42394G();
            if (!TextUtils.isEmpty(strM42394G)) {
                Toast.makeText(this, "Using " + strM42394G, 1).show();
            }
        }
        C8150a.m33401h();
        this.f12252W = m14846R1();
        if (bundle == null) {
            C12211b.m45200f().m45204c(this);
        }
        if (C9476b.m37333a() && C11295a1.m42485x0()) {
            C6124q.m27066k("rbx.splash", "Alert: needs restart");
            m14845O1();
        } else {
            C0305k0.m1274s(this).m1287M(this.f12256a0);
            C0305k0.m1274s(this).m1288N(this);
        }
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f12259d0 != null) {
            C6124q.m27063h("rbx.splash", "Detach platform emergency observer.");
            PlatformSystemDialogHandler.INSTANCE.detachObserver(this.f12259d0);
            this.f12259d0 = null;
        }
        C6124q.m27063h("rbx.splash", "onDestroy: unset the activity from InitHelper.");
        C0305k0.m1274s(this).m1293S(this);
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p088e.ActivityC4722p, android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C6124q.m27063h("rbx.splash", "onNewIntent: intent=" + intent);
        this.f12253X = intent;
        this.f12256a0 = m15541y2(intent);
        m15540x2();
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        super.onPause();
        LoggingProtocol.m15994g("splash_activity_onpause");
        if (C11659h.m43403a().mo43457H3()) {
            if (isFinishing()) {
                C6124q.m27057b("rbx.splash", "ActivitySplash is paused due to finish()");
            } else {
                C6124q.m27066k("rbx.splash", "ActivitySplash is paused due to the app being put into the background.");
                LoggingProtocol.m15994g("startup_interrupted");
            }
        }
        C6124q.m27057b("rbx.splash", "onPause: isFinishing = " + isFinishing());
        m15534p2();
        if (this.f12258c0) {
            return;
        }
        C7209a.m30131j().m30133b(C7209a.a.SPLASH);
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        super.onResume();
        C6124q.m27057b("rbx.splash", "onResume:");
        m15532q2();
        m15523B2();
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        f12247f0 = true;
        C7209a.m30131j().m30138h();
        C11356t0.m42552v("splash");
    }

    /* JADX INFO: renamed from: p2 */
    public final void m15534p2() {
        Runnable runnable = this.f12249T;
        if (runnable != null) {
            this.f12251V.removeCallbacks(runnable);
            this.f12249T = null;
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m15535s2() {
        C6124q.m27063h("rbx.splash", "navigateToMainScreen: launch the Main activity now...");
        m15539w2(false);
    }

    /* JADX INFO: renamed from: t2 */
    public final /* synthetic */ void m15536t2() {
        C6124q.m27063h("rbx.splash", "navigateToMainScreen: check for platform emergency...");
        this.f12259d0.m34610g(new Runnable() { // from class: ak.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f739a.m15535s2();
            }
        });
    }

    /* JADX INFO: renamed from: u2 */
    public final /* synthetic */ void m15537u2() {
        C6124q.m27063h("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) launch the Main activity now...");
        this.f12258c0 = true;
        C0305k0.m1274s(this).m1293S(this);
        m15539w2(this.f12257b0);
        finish();
    }

    /* JADX INFO: renamed from: v2 */
    public final /* synthetic */ void m15538v2() {
        C6124q.m27063h("rbx.splash", "updateViewAppSettingsLoaded: (NEW_STARTUP) check for platform emergency...");
        this.f12259d0.m34610g(new Runnable() { // from class: ak.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f743a.m15537u2();
            }
        });
    }

    /* JADX INFO: renamed from: w2 */
    public final void m15539w2(boolean z10) {
        m15540x2();
        if (isFinishing()) {
            C6124q.m27063h("rbx.splash", "isFinishing");
            return;
        }
        C6124q.m27063h("rbx.splash", "launchMainActivity");
        Intent intentM42589i = C11370y.m42581h().m42589i(this);
        if (z10) {
            C11356t0.m42532b(this, "protocolLaunch");
        }
        if (this.f12255Z) {
            intentM42589i.putExtra("loginAfterSignup", true);
        }
        if (this.f12253X.getExtras() != null) {
            intentM42589i.putExtras(this.f12253X.getExtras());
        }
        if (C11659h.m43403a().mo43532S3()) {
            LoggingProtocol.m15994g("main_activity_launch_begin");
        }
        C7209a.m30131j().m30135e();
        startActivity(intentM42589i);
        overridePendingTransition(0, 0);
        finish();
    }

    /* JADX INFO: renamed from: x2 */
    public final void m15540x2() {
        if (this.f12256a0 != StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION) {
            return;
        }
        Bundle extras = this.f12253X.getExtras();
        if (extras != null) {
            C7193r.m30069k().m30076G(extras);
        }
        String string = extras.getString("EXTRA_NOTIFICATION_TYPE", "");
        String string2 = extras.getString("EXTRA_NOTIFICATION_VERSION", "");
        String string3 = extras.getString("EXTRA_NOTIFICATION_ID", "");
        List<NameValuePair> listM30118a = C7198w.m30118a(this.f12253X);
        if (string2.isEmpty()) {
            if (string == "ChatNewMessage") {
                C7196u.m30108c().m30116i(extras.getString("EXTRA_CATEGORY", ""));
            } else {
                C7196u.m30108c().m30111d(string).clear();
                AbstractC9489h.m37372g(this.f12253X, this);
            }
        }
        C11356t0.m42548r("clicked", new C7199x().m30120a(this, "GcmPlatform"), string, string3, C6130w.m27099a(this), true, string2, "startup", listM30118a);
        C3224a.m15404a(this, this.f12253X, true);
    }

    /* JADX INFO: renamed from: y2 */
    public final StartedForEnum m15541y2(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(StartedForEnum.class.getClassLoader());
            try {
                StartedForEnum startedForEnum = Build.VERSION.SDK_INT >= 33 ? (StartedForEnum) intent.getSerializableExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.class) : (StartedForEnum) intent.getSerializableExtra("STARTED_FOR_INTENT_KEY");
                if (startedForEnum != null) {
                    return startedForEnum;
                }
            } catch (RuntimeException e10) {
                C6124q.m27063h("rbx.splash", "readStartedForEnum: Exception caught: " + e10);
            }
        }
        return StartedForEnum.SYSTEM;
    }

    /* JADX INFO: renamed from: z2 */
    public final void m15542z2() {
        C12209m c12209mM45193b = C12209m.m45193b();
        c12209mM45193b.m45196d(C11659h.m43403a().mo43587a2());
        c12209mM45193b.m45195c(C11295a1.m42447e0());
    }
}
