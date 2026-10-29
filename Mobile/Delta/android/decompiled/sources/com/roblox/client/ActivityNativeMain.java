package com.roblox.client;

import ak.k0;
import ak.n0;
import ak.n2;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import com.roblox.client.captcha.ActivityFunCaptcha;
import com.roblox.client.captcha.CaptchaConfig;
import com.roblox.client.captcha.LoginCaptchaConfig;
import com.roblox.client.captcha.SignUpCaptchaConfig;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.feature.FeatureState;
import com.roblox.client.game.ExperienceSession;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.gloop.Loader;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.protocols.webview.WebViewProtocol;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ei.m;
import fj.a0;
import gk.p;
import gk.s;
import gk.u;
import gk.v;
import gk.w;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jj.r;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import sg.a1;
import sg.c2;
import sg.e2;
import sg.g0;
import sg.m0;
import sg.q0;
import sg.y;
import sg.y0;
import sg.y1;
import sh.ExpBackOffRetryPolicy;
import vg.c0;
import wh.j0;
import wh.q;
import wh.s0;
import wh.t0;
import wh.u0;
import wh.z0;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityNativeMain extends com.roblox.client.a implements vi.e.InterfaceC0602e, rh.d, n0, wg.c.d, wh.a.g, com.roblox.client.startup.c.b, NativeGLJavaInterface.OnAppShellReloadNeededListener, NativeGLJavaInterface.WebViewUserAgentGetter, NativeGLJavaInterface.MobileAdvertisingIdGetter, zj.c, wh.a.f, ExperienceSession.d, com.roblox.protocols.webview.a.f, q {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static boolean f8865q0 = true;
    public boolean S;
    public rh.a T;
    public View U;
    public View V;
    public boolean W;
    public long X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public qi.f f8866a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public WebViewProtocol f8868c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public AppHangMonitor f8869d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f8870e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public s0 f8871f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public g.c<IntentSenderRequest> f8872g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public dk.h f8874i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public wh.i f8875j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public z0 f8876k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ImageView f8877l0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public tg.a f8880o0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public wg.c f8867b0 = null;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f8873h0 = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Runnable f8878m0 = new Runnable() { // from class: sg.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f30772a.J2();
        }
    };

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Runnable f8879n0 = new Runnable() { // from class: sg.k
        @Override // java.lang.Runnable
        public final void run() {
            this.f30790a.K2();
        }
    };

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final m f8881p0 = new g();

    public class a implements com.roblox.client.c.i {
        public a() {
        }

        @Override // com.roblox.client.c.i
        public void a(String str) {
            if (ActivityNativeMain.this.f8868c0 != null) {
                ActivityNativeMain.this.f8868c0.u(str);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityNativeMain f8883a;

        public b(ActivityNativeMain activityNativeMain) {
            this.f8883a = activityNativeMain;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActivityNativeMain.this.isFinishing()) {
                return;
            }
            vi.b.q();
            new l(this.f8883a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p.b("rbx.main", "[GrantPendingPurchase] Executor::run: ");
            ActivityNativeMain.this.A2(false);
        }
    }

    public class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8885a;

        public d(ViewGroup viewGroup) {
            this.f8885a = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            SurfaceView surfaceView;
            if (mk.h.f24374a.b() && view2 == null && (surfaceView = (SurfaceView) this.f8885a.findViewById(m0.f30839h0)) != null) {
                surfaceView.requestFocus();
            }
        }
    }

    public class e implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f8886a = null;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8887c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f8888d;

        public e(ViewGroup viewGroup, SurfaceView surfaceView) {
            this.f8887c = viewGroup;
            this.f8888d = surfaceView;
        }

        public final /* synthetic */ void b(int i10) {
            this.b = i10 == 0;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f8877l0 == null || this.f8886a == null || !this.b) {
                return;
            }
            ActivityNativeMain.this.f8877l0.setVisibility(0);
            ActivityNativeMain.this.f8877l0.setImageBitmap(this.f8886a);
            ActivityNativeMain.this.i3(3000L);
            this.f8886a = null;
            this.b = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f8877l0 != null) {
                long width = ((long) (this.f8887c.getWidth() * this.f8887c.getHeight())) * 4;
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < width) {
                    p.h("rbx.main", "surfaceDestroyed: Not enough memory for screenshot. Available: " + jFreeMemory + ", Required: " + width);
                    return;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f8887c.getWidth(), this.f8887c.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f8886a = bitmapCreateBitmap;
                    PixelCopy.request(this.f8888d, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: sg.p
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            this.f30910a.b(i10);
                        }
                    }, new Handler(Looper.getMainLooper()));
                } catch (OutOfMemoryError e10) {
                    p.f("rbx.main", "surfaceDestroyed: Out of memory while creating screenshot.", e10);
                }
            }
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    public class g implements m {
        public g() {
        }

        @Override // ei.m
        public void a(ei.j jVar) {
            if (jVar.b() == 401) {
                p.k("rbx.main", "sessionCheckHandler: Got 401 error code from the server. Logout now...");
                vi.b.f().i(ActivityNativeMain.this, vi.b.d.LOGOUT_BY_401_ERROR_IN_NATIVE);
            }
        }
    }

    public class h extends com.roblox.client.d.c {
        public h() {
        }

        @Override // com.roblox.client.d.InterfaceC0136d
        public void a(com.roblox.client.d.e eVar) {
            if (eVar.b()) {
                ActivityNativeMain.this.f2(false);
                return;
            }
            if (eVar.c()) {
                ActivityNativeMain.this.f2(true);
            } else if (s.j() && eVar.a()) {
                vi.b.f().i(ActivityNativeMain.this, vi.b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.d.c, com.roblox.client.d.InterfaceC0136d
        public void b(com.roblox.client.d.e eVar) {
            if (a1.q0() && eVar.c()) {
                ActivityNativeMain.this.f2(true);
            }
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain activityNativeMain = ActivityNativeMain.this;
            e2.i(activityNativeMain, activityNativeMain.U);
        }
    }

    public class j implements Runnable {
        public j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain.this.V.setVisibility(8);
        }
    }

    public class k extends com.roblox.client.d.c {
        public k() {
        }

        @Override // com.roblox.client.d.InterfaceC0136d
        public void a(com.roblox.client.d.e eVar) {
            if (eVar.b()) {
                ActivityNativeMain.this.f2(false);
            } else if (eVar.c()) {
                ActivityNativeMain.this.f2(true);
            }
        }
    }

    public static class l extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<ActivityNativeMain> f8896a;

        public l(ActivityNativeMain activityNativeMain) {
            p.h("rbx.main", "Reloading lua app.");
            this.f8896a = new WeakReference<>(activityNativeMain);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            wh.a aVarD;
            Surface surfaceI2;
            ActivityNativeMain activityNativeMain = this.f8896a.get();
            if (activityNativeMain == null || (aVarD = activityNativeMain.F2().d()) == null || (surfaceI2 = aVarD.I2()) == null) {
                return Boolean.FALSE;
            }
            vi.b.e();
            if (a1.D0()) {
                wh.f.j().y(activityNativeMain, surfaceI2, activityNativeMain);
            } else {
                wh.f.j().x(activityNativeMain, surfaceI2);
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            ActivityNativeMain activityNativeMain;
            if (bool.booleanValue() || (activityNativeMain = this.f8896a.get()) == null || activityNativeMain.V == null) {
                return;
            }
            activityNativeMain.V.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ActivityNativeMain activityNativeMain = this.f8896a.get();
            if (activityNativeMain == null || activityNativeMain.V == null) {
                return;
            }
            activityNativeMain.V.setVisibility(0);
        }
    }

    private void E2() {
        com.roblox.client.startup.c.v2(this);
    }

    private void Y2(String str, String str2) {
        sg.q.f(this, gk.f.c(str2), str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void d3() {
        p.h("rbx.main", "processPushNotification.");
        Bundle bundleI = r.k().i();
        if (bundleI == null || r.k().t(bundleI)) {
            return;
        }
        try {
            String string = bundleI.getString("EXTRA_NOTIFICATION_TYPE", "");
            switch (string.hashCode()) {
                case 624927928:
                    if (!string.equals("FriendRequestAccepted")) {
                        return;
                    }
                    break;
                case 929482719:
                    if (string.equals("ChatNewMessage")) {
                        long j10 = bundleI.getLong("EXTRA_CONVERSATION_ID", -1L);
                        if (j10 != -1) {
                            W2(j10);
                            return;
                        }
                        return;
                    }
                    return;
                case 1050705701:
                    if (string.equals("PrivateMessageReceived")) {
                        S2(bundleI);
                        return;
                    }
                    return;
                case 1715544492:
                    if (string.equals("DefaultNotification")) {
                        tj.a.a().b(bundleI.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
                        return;
                    }
                    return;
                case 1962733298:
                    if (!string.equals("FriendRequestReceived")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            R2(bundleI);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void g3(ActivityNativeMain activityNativeMain, boolean z10) {
        wh.a aVarD = activityNativeMain.F2().d();
        if (aVarD != null && z10) {
            activityNativeMain.l1().r().m(aVarD).h();
        }
        p.b("rbx.appshell", "removeGlApp() clearing app shell");
        wh.f.j().f();
    }

    private void o3(int i10) {
        LoggingProtocol.g("retry_during_main");
        com.roblox.client.startup.c.y2(this, i10);
    }

    public final void A2(boolean z10) {
        if (th.h.a().T4()) {
            IAPPurchaseManager.D(this, z10);
            return;
        }
        if (!s.g()) {
            if (s.i()) {
                fk.c cVarC = fk.c.c();
                String strK = cVarC.k();
                long j10 = cVarC.j();
                if (TextUtils.isEmpty(strK)) {
                    return;
                }
                if (th.h.a().C5()) {
                    ij.b.a(this);
                    throw null;
                }
                if (j10 > 0) {
                    ij.a.a(this);
                    throw null;
                }
                ij.a.a(this);
                throw null;
            }
            return;
        }
        String strK2 = fk.c.c().k();
        long j11 = fk.c.c().j();
        if (TextUtils.isEmpty(strK2)) {
            return;
        }
        if (th.h.a().B1()) {
            if (j11 > 0) {
                a0.R(this).K(j11, z10);
                return;
            } else {
                a0.R(this).L(z10);
                return;
            }
        }
        if (th.h.a().g3() && th.h.a().p()) {
            fj.m.F0(this).m1(j11, strK2, z10);
        } else if (j11 > 0) {
            fj.m.F0(this).A0(j11, strK2, z10);
        } else {
            fj.m.F0(this).B0(strK2, z10);
        }
    }

    public final void B2() {
        this.U.post(new i());
    }

    public final void C2() {
        int i10;
        View rootView = this.U.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView;
        rootView.getViewTreeObserver().addOnGlobalFocusChangeListener(new d(viewGroup));
        int i11 = m0.F;
        this.Z = i11;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(i11);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (th.h.a().G0()) {
            i10 = sg.n0.f30885k;
        } else {
            i10 = th.h.a().w4() ? sg.n0.f30886l : sg.n0.f30884j;
        }
        if (th.h.a().f2()) {
            LoggingProtocol.g("fragment_shared_inflate_begin");
        }
        getLayoutInflater().inflate(i10, (ViewGroup) frameLayout, true);
        if (th.h.a().f2()) {
            LoggingProtocol.g("fragment_shared_inflate_end");
        }
        int i12 = m0.f30839h0;
        this.f8871f0 = new s0(this, (SurfaceView) frameLayout.findViewById(i12));
        a().a(this.f8871f0);
        mk.h.f24374a.c(getResources().getConfiguration());
        p.h("rbx.main", "createGlAppsFrame() apps frame created");
        viewGroup.addView(frameLayout, 0);
        if (l3()) {
            SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(i12);
            surfaceView.getHolder().addCallback(new e(viewGroup, surfaceView));
        }
    }

    public final void D2() {
        if (this.f8877l0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.U.getRootView();
        this.f8877l0 = new ImageView(this);
        new FrameLayout.LayoutParams(-1, -1);
        this.f8877l0.setVisibility(8);
        this.f8877l0.setOnTouchListener(new f());
        viewGroup.addView(this.f8877l0);
        NativeGLInterface.nativeScheduleOnFirstFrame(this.f8879n0);
    }

    @Override // wh.q
    public void E() {
        E1();
    }

    @Override // rh.d
    public void F(int i10, androidx.fragment.app.c cVar, String str) {
        if (cVar != null) {
            androidx.fragment.app.h hVarR = l1().r();
            if (cVar.p0()) {
                hVarR.t(cVar);
            } else {
                hVarR.b(i10, cVar, str);
            }
            hVarR.h();
        }
    }

    public final rh.a F2() {
        if (this.T == null) {
            this.T = new rh.a(this, this.Z);
        }
        return this.T;
    }

    @Override // ak.n0
    public void G() {
        p.h("rbx.main", "updateViewAppSettingsLoaded:");
        k3();
    }

    public final ph.g G2() {
        ph.g gVarB = ph.g.b("CUSTOM_WEBVIEW_TAG");
        gVarB.g(a1.Q(this));
        gVarB.j(true);
        return gVarB;
    }

    public final void H2() {
        p.h("rbx.main", "internalOnResume:");
        A2(true);
        com.roblox.client.d.e().b(new h());
        if ((s.j() || vi.h.e().i()) && e2.j(this)) {
            vi.h.e().d(this.f8881p0);
        }
        p.h("rbx.main", "internalOnResume: NotificationManager addObserver");
        vi.e.c().b(this);
        if (r.k().u() && e2.j(this)) {
            if (this.W) {
                this.W = false;
            }
            d3();
        }
        if (this.W) {
            p.h("rbx.main", "Back from game. Resuming Lua App.");
            a3();
        }
        rh.a aVarF2 = F2();
        l1().j0();
        if (aVarF2.d() == null) {
            aVarF2.g(new FeatureState("CUSTOM_LUAVIEW_TAG"));
        }
    }

    @Override // sg.f0
    public void I() {
        E1();
    }

    public final /* synthetic */ void I2(JSONObject jSONObject) {
        sg.q.b(jSONObject, this);
    }

    @Override // ak.n0
    public void J() {
        p.h("rbx.main", "showRetryUI:");
        if (a1.q0()) {
            w.a(this, q0.S);
            finish();
        } else if (J1()) {
            o3(q0.S);
        }
    }

    public final /* synthetic */ void J2() {
        ImageView imageView = this.f8877l0;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.f8877l0.setImageBitmap(null);
        }
    }

    public final /* synthetic */ void K2() {
        i3(500L);
    }

    public final /* synthetic */ void L2() {
        this.V.setVisibility(8);
    }

    public final /* synthetic */ void M2(final String str) {
        runOnUiThread(new Runnable() { // from class: sg.e
            @Override // java.lang.Runnable
            public final void run() {
                fk.c.c().u(ol.a.b(str));
            }
        });
    }

    @Override // com.roblox.client.startup.c.b
    public void N() {
        E2();
        q3();
    }

    public final /* synthetic */ void N2(boolean z10) {
        pi.c.f28623a.j(z10);
        pi.b.f28622a.b(this, z10);
    }

    @Override // ak.n0
    public void O() {
        p.h("rbx.main", "navigateToLandingScreen:");
        Intent intentO = y.h().o(this);
        intentO.putExtra("send_app_input_focus_to_lua", true);
        startActivity(intentO);
        finish();
    }

    public final /* synthetic */ void O2() {
        this.W = true;
        k0();
    }

    @Override // com.roblox.client.a
    public boolean P1() {
        return true;
    }

    public final /* synthetic */ void P2(ActivityResult activityResult) {
        y.h().g().r(this, activityResult.getData());
    }

    @Override // com.roblox.client.a
    public mi.c Q1() {
        return new mi.d();
    }

    public final void Q2(FeatureState featureState) {
        p.h("rbx.appshell", "loadDataModel()");
        wh.f.j().F(this);
        wh.f.j().k(wh.p.a(this));
        if (NativeGLInterface.isColdStartDeeplinkToGame() && vi.h.h()) {
            cm.a.a().b(new cm.a.b() { // from class: sg.h
                @Override // cm.a.b
                public final void a(JSONObject jSONObject) {
                    this.f30767a.I2(jSONObject);
                }
            });
            k0.G(this, vi.h.l().toString());
        }
        if (y.h().f().i()) {
            return;
        }
        m3(featureState);
        NativeGLInterface.nativeAppBridgeStartLuaAppDM();
    }

    public final void R2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_NOTIFICATION_USER_ID", -1L);
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE");
        boolean z10 = bundle.getBoolean("EXTRA_STACKED_NOTIFICATION", false);
        String strB0 = null;
        if (string == null) {
            finish();
        } else if (z10) {
            if (string.equals("FriendRequestAccepted")) {
                strB0 = a1.b0(vi.h.e().g());
            } else if (string.equals("FriendRequestReceived")) {
                strB0 = a1.a0(vi.h.e().g());
            }
        } else if (string.equals("FriendRequestAccepted")) {
            strB0 = j10 == -1 ? a1.b0(vi.h.e().g()) : a1.c0(j10);
        } else if (string.equals("FriendRequestReceived")) {
            strB0 = j10 == -1 ? a1.a0(vi.h.e().g()) : a1.c0(j10);
        }
        p3(strB0);
    }

    @Override // vi.e.InterfaceC0602e
    public void S(int i10, Bundle bundle) {
        if (i10 != 2) {
            if (i10 != 101) {
                return;
            }
            sg.q.j(j0.c(bundle.getBundle("game_init_params")), this);
        } else {
            p.h("rbx.main", "ANM.handleNotification() Logout event...");
            NativeGLInterface.nativeAppBridgeV2UserDidLogout();
            if (wj.c.a()) {
                new l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                X1(vi.b.g(bundle));
            }
        }
    }

    public final void S2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_CONVERSATION_ID", -1L);
        p3(j10 == -1 ? a1.w0() : a1.A0(j10));
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
    public void T() {
        if (isFinishing()) {
            return;
        }
        NativeGLInterface.setMobileAdvertisingId(gk.c.d());
    }

    public final boolean T2() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("loginAfterSignup", false);
        }
        return false;
    }

    public final void U2(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("FEATURE_EXTRA")) == null) {
            return;
        }
        if ("CHAT_TAG".equals(stringExtra)) {
            long longExtra = intent.getLongExtra("USER_ID_EXTRA", -1L);
            if (longExtra != -1) {
                Z2(longExtra);
                return;
            } else {
                W2(intent.getLongExtra("CONVERSATION_ID_EXTRA", -1L));
                return;
            }
        }
        if ("PROFILE_TAG".equals(stringExtra)) {
            sg.q.i(this, intent.getStringExtra("PATH_EXTRA"), getString(q0.I), false, false, true);
        } else if ("SETTINGS_TAG".equals(stringExtra)) {
            sg.q.f(this, intent.getStringExtra("PATH_EXTRA"), getString(q0.L));
        } else {
            sg.q.f(this, intent.getStringExtra("PATH_EXTRA"), rh.b.a(this, stringExtra));
        }
    }

    public final String V2() {
        return "OVERLAY_" + l1().u0();
    }

    public final void W2(long j10) {
        p.b("rbx.main", "navigateToConversation() conversation:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.g("CHAT_CONVERSATION_ID", j10);
        X2(featureState);
    }

    public final void X2(FeatureState featureState) {
        p.i("rbx.main", "navigateToFeature:" + featureState.getName() + " bundle:" + featureState.a());
        m3(featureState);
    }

    public final void Z2(long j10) {
        p.b("rbx.main", "navigateToUserConversation() user:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.g("USER_ID_EXTRA", j10);
        X2(featureState);
    }

    @Override // wh.a.g
    public void a0() {
        p.h("rbx.main", "onAppStarted: ");
        if (J1() && vi.b.e()) {
            new l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void a3() {
        n3();
        this.W = false;
    }

    @Override // sg.f0
    public boolean b() {
        return this.f8871f0.b();
    }

    public void b3(String str, String str2) {
        zj.a.c(str, str2);
    }

    @Override // wh.a.g
    public void c(String str) {
        p.h("rbx.main", "onAppReady: " + str);
        View view = this.V;
        if (view != null && view.getVisibility() != 8) {
            this.V.post(new j());
        }
        if ("Landing".equals(str) || "Home".equals(str)) {
            com.roblox.client.d.e().b(new k());
        } else if ("Push".equals(str)) {
            y.h().k().b0(getApplicationContext());
        }
        if (th.h.a().b2()) {
            final Context applicationContext = getApplicationContext();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: sg.f
                @Override // java.lang.Runnable
                public final void run() {
                    n2.b(applicationContext);
                }
            });
        }
    }

    public final void c3(String str) {
        JSONObject jSONObject;
        CaptchaConfig signUpCaptchaConfig;
        LoginCaptchaConfig.c cVar;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            p.k("rbx.main", "openFunCaptchaActivity: Exception parsing json data.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.optString("captchaType").equals("login")) {
                String strOptString = jSONObject.optString("cvalueType");
                String strOptString2 = jSONObject.optString("cvalue");
                strOptString.getClass();
                switch (strOptString) {
                    case "phone_number":
                        cVar = LoginCaptchaConfig.c.PHONE_NUMBER;
                        break;
                    case "username":
                        cVar = LoginCaptchaConfig.c.USERNAME;
                        break;
                    case "email":
                        cVar = LoginCaptchaConfig.c.EMAIL;
                        break;
                    default:
                        throw new RuntimeException("Unsupported credential Type: " + strOptString + ".");
                }
                signUpCaptchaConfig = new LoginCaptchaConfig(cVar, strOptString2);
            } else {
                signUpCaptchaConfig = new SignUpCaptchaConfig();
            }
            p.h("rbx.main", "openFunCaptchaActivity: config = " + signUpCaptchaConfig);
            startActivityForResult(ActivityFunCaptcha.i2(this, signUpCaptchaConfig), 20115);
        }
    }

    @Override // wg.c.d, com.roblox.protocols.webview.a.f
    public void d(nl.a aVar) {
        if (l1().u0() > 0) {
            androidx.fragment.app.c cVarM0 = l1().m0(m0.f30842j);
            if (cVarM0 instanceof com.roblox.client.c) {
                ((com.roblox.client.c) cVarM0).H3(aVar);
            }
        }
    }

    @Override // wg.c.d, com.roblox.protocols.webview.a.f
    public void e() {
        WebViewProtocol webViewProtocol;
        if (!th.h.a().X0()) {
            h3();
        } else {
            if (!h3() || (webViewProtocol = this.f8868c0) == null) {
                return;
            }
            webViewProtocol.v();
        }
    }

    public void e3() {
        new com.roblox.client.startup.d().c(this, new com.roblox.client.startup.d.a() { // from class: sg.l
            @Override // com.roblox.client.startup.d.a
            public final void a() {
                this.f30797a.finish();
            }
        });
    }

    @Override // sg.f0
    public void f(boolean z10) {
        this.f8871f0.f(z10);
    }

    public void f3() {
        p.h("rbx.main", "Registering activity result for IdentityProtocol.");
        this.f8872g0 = h(new h.j(), new g.a() { // from class: sg.d
            @Override // g.a
            public final void a(Object obj) {
                this.f30749a.P2((ActivityResult) obj);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (th.h.a().F2() && a1.q0()) {
            Process.killProcess(Process.myPid());
        }
    }

    @Override // wg.c.d, com.roblox.protocols.webview.a.f
    public void g(nl.a aVar) {
        B2();
        Boolean bool = aVar.f26300d;
        boolean z10 = false;
        boolean z11 = bool != null && bool.booleanValue();
        Boolean bool2 = aVar.f26299c;
        boolean zBooleanValue = bool2 == null ? true : bool2.booleanValue();
        Boolean bool3 = aVar.f26301e;
        boolean z12 = bool3 != null && bool3.booleanValue();
        Boolean bool4 = aVar.f26302f;
        boolean z13 = bool4 != null && bool4.booleanValue();
        Boolean bool5 = aVar.f26303g;
        if (bool5 != null && bool5.booleanValue()) {
            z10 = true;
        }
        boolean zX0 = th.h.a().X0();
        com.roblox.client.c y0Var = z11 ? new y0() : new vh.l();
        y0Var.a().a(new wg.b());
        y0Var.a().a(new wg.a());
        Bundle bundle = new Bundle();
        bundle.putString("DEFAULT_URL", aVar.f26298a);
        bundle.putBoolean("USE_APP_HYBRID", true);
        bundle.putBoolean("VISIBLE", zBooleanValue);
        bundle.putBoolean("BACK_NAVIGATION_DISABLED", z12);
        bundle.putString("TITLE_STRING", aVar.b);
        bundle.putBoolean("HAS_PARENT", true);
        bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
        bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", z13);
        if (zX0) {
            bundle.putBoolean("ENABLE_WEB_VIEW_SERVICE", true);
            bundle.putBoolean("hideNativeHeader", z10);
        }
        y0Var.O1(bundle);
        if (zX0) {
            y0Var.B3(new a());
        }
        androidx.fragment.app.h hVarR = l1().r();
        hVarR.b(m0.f30842j, y0Var, V2());
        hVarR.f(null);
        hVarR.h();
    }

    public final boolean h3() {
        int i10 = 0;
        if (l1().U0()) {
            return false;
        }
        if (!th.h.a().X0()) {
            if (l1().u0() <= 0) {
                return false;
            }
            l1().a1();
            return true;
        }
        int iU0 = l1().u0();
        boolean z10 = false;
        while (i10 < iU0) {
            l1().a1();
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.roblox.client.startup.c.b
    public void i() {
        E2();
        q3();
    }

    @Override // ak.n0
    public void i0() {
    }

    public final void i3(long j10) {
        this.f8877l0.removeCallbacks(this.f8878m0);
        this.f8877l0.postDelayed(this.f8878m0, j10);
    }

    public void j3(boolean z10) {
        ok.a aVar = new ok.a(z10);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f27448a, aVar.b, aVar.f27449c);
    }

    @Override // zj.c
    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            p.b("rbx.main", "Share data is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("context");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            zj.a.c(string2, string);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 167772160);
            j3(false);
            startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), 20124);
        } catch (JSONException unused) {
            p.b("rbx.main", "Error parsing share data.");
        }
    }

    @Override // ak.n0
    public void k0() {
        p.h("rbx.main", "navigateToMainScreen: IsLoggedIn = " + vi.h.e().f());
        k3();
        if (!y.h().f().i() && J1() && vi.h.e().f()) {
            H2();
        }
    }

    public final void k3() {
        p.b("rbx.main", "setupMainTabs: tabs-loaded = " + this.S);
        if (this.S) {
            return;
        }
        this.S = true;
        Q2((!T2() || s.j()) ? new FeatureState("CUSTOM_LUAVIEW_TAG") : new FeatureState("GAMES_TAG"));
        if (this.f8867b0 == null) {
            wg.c cVar = new wg.c(this, new Handler(Looper.getMainLooper()));
            this.f8867b0 = cVar;
            cVar.c();
        }
        if (!th.h.a().X0() || a1.q0()) {
            return;
        }
        this.f8868c0 = new WebViewProtocol(this);
    }

    @Override // sg.f0
    public void l() {
        this.f8871f0.l();
    }

    public final boolean l3() {
        return !a1.q0();
    }

    @Override // com.roblox.client.game.ExperienceSession.d
    public void m(Bundle bundle) {
        p.h("rbx.main", "Request to end the game. Performing app restoration.");
        if (th.h.a().g0()) {
            this.X = bundle.getLong(PinShortcutHandler.EXTRA_PLACE_ID);
            this.Y = bundle.getString("gameId");
        }
        y.h().f().l(null);
        r3(t0.APP);
        FragmentManager fragmentManagerL1 = l1();
        if (!J1() || fragmentManagerL1.U0()) {
            p.h("rbx.main", "Experience has been ended in the background.");
            this.f8873h0 = true;
        } else {
            a1.U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            wh.f.j().z();
            wh.f.j().B(true);
            runOnUiThread(new Runnable() { // from class: sg.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30763a.O2();
                }
            });
        }
    }

    public void m3(FeatureState featureState) {
        p.h("rbx.main", "ANM.showFeature: " + featureState.getName());
        F2().g(featureState);
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.OnAppShellReloadNeededListener
    public void n() {
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new b(this));
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
    public void n0() {
        if (th.h.a().b2()) {
            NativeGLInterface.setWebviewUserAgent(n2.c(this));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(this));
        }
    }

    public final void n3() {
        if (th.h.a().a3() || th.h.a().c2() || dh.b.b().c() < th.h.a().s()) {
            return;
        }
        xg.a.e().i(this, this.X, this.Y);
    }

    @Override // com.roblox.client.game.ExperienceSession.d
    public e4.q o0() {
        return this;
    }

    @Override // com.roblox.client.a, e4.q, e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        p.b("rbx.main", "onActivityResult: requestCode = " + i10 + " resultCode = " + i11 + " Intent data = " + intent);
        if (i10 != -1) {
            if (i10 == 20104) {
                this.W = true;
                return;
            }
            if (i10 == 20110) {
                if (i11 == -1) {
                    U2(intent);
                    return;
                }
                return;
            }
            if (i10 != 20115) {
                if (i10 != 20124) {
                    super.onActivityResult(i10, i11, intent);
                    return;
                }
                zj.a.a();
                j3(true);
                if (th.h.a().U2()) {
                    em.a.k().e(intent);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onActivityResult from FunCaptcha: code:");
            sb2.append(i11);
            sb2.append(", result:");
            sb2.append(i11 == 101 ? "success" : "dismiss");
            p.h("rbx.main", sb2.toString());
            wh.f.j().A(new ok.a(true));
            m3(new FeatureState("HOME_TAG"));
        }
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    public void onBackButtonNotConsumedEvent(ph.c cVar) {
        e3();
    }

    @Override // e.p, android.app.Activity
    public void onBackPressed() {
        if (l1().u0() <= 0) {
            if (F2().f()) {
                return;
            }
            e3();
            return;
        }
        androidx.fragment.app.c cVarM0 = l1().m0(m0.f30842j);
        if (!(cVarM0 instanceof com.roblox.client.c)) {
            if (!(cVarM0 instanceof y1)) {
                if (rj.f.d(this)) {
                    p.h("rbx.main", "onBackPressed: BACK button is handled for QrCodeScanner.");
                    return;
                } else {
                    l1().a1();
                    return;
                }
            }
            y1 y1Var = (y1) cVarM0;
            if (y1Var.J2() || y1Var.G2()) {
                return;
            }
            l1().a1();
            return;
        }
        com.roblox.client.c cVar = (com.roblox.client.c) cVarM0;
        if (!th.h.a().X0() || this.f8868c0 == null) {
            if (cVar.h3() || cVar.e3()) {
                return;
            }
            l1().a1();
            return;
        }
        if (cVar.h3() || !cVar.e3()) {
            this.f8868c0.v();
        }
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    public void onCodeParsedFromSMS(ph.j jVar) {
        p.h("rbx.main", "SMS code received.");
        p.h("rbx.main", "Calling IdentityProtocol to parse OTP.");
        y.h().g().o(jVar.f28619a);
    }

    @Override // j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mk.h.f24374a.d(configuration);
        if (l3()) {
            this.f8878m0.run();
        }
        SystemThemeProtocol.f9821a.C();
        if (a1.l0()) {
            z2(configuration);
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        Loader.get().startLib(this);
        if (!ActivitySplash.r2() && !com.roblox.client.startup.a.m() && bundle != null) {
            k0.x(bundle.getBoolean("RESTART_AFTER_PROCESS_DEATH", false));
            if (k0.B()) {
                p.h("rbx.main", "onCreate: App was previously destroyed due to process death");
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        if (th.h.a().C3()) {
            if (f8865q0) {
                f8865q0 = false;
            } else {
                p.k("rbx.main", "onCreate: Activity recreated");
                LoggingProtocol.g("activity_recreated");
            }
        }
        if (!v.a(this).equals("foreground")) {
            LoggingProtocol.g("background_process_detected");
        }
        LoggingProtocol.g("main_activity_oncreate");
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate NativeMain. savedInstanceState is null: ");
        sb2.append(bundle == null);
        p.h("rbx.main", sb2.toString());
        if (this.f8869d0 == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            this.f8869d0 = appHangMonitor;
            appHangMonitor.c();
        }
        if (th.h.a().o3() && Build.VERSION.SDK_INT >= 29) {
            LoggingProtocol.h("android_thermal_throttling", ((PowerManager) getSystemService("power")).getCurrentThermalStatus() + 1000);
        }
        this.f8866a0 = qi.b.f().j();
        k0.s(this).N(this);
        setContentView(sg.n0.f30878d);
        if (bundle != null) {
            this.W = bundle.getBoolean("BACK_FROM_GAME");
        }
        jm.a.c(this);
        if (!this.W) {
            jm.a.j().a(jm.a.EnumC0382a.MAIN, bundle);
        }
        this.U = findViewById(m0.f30840i);
        this.V = findViewById(m0.V);
        if (y.h().f().h()) {
            this.V.post(new Runnable() { // from class: sg.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30824a.L2();
                }
            });
        } else {
            this.V.setVisibility(0);
        }
        C2();
        NativeGLJavaInterface.setAppShellReloadNeededListener(this);
        NativeGLJavaInterface.setWebviewUserAgentGetter(this);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(this);
        if (this.f8870e0 == null && th.h.a().k0()) {
            long jU3 = th.h.a().u3();
            p.b("rbx.main", "Setup mPendingPurchaseExecutor to run every " + jU3 + " seconds");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.f8870e0 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new c(), jU3, jU3, TimeUnit.SECONDS);
        }
        if (th.h.a().V1()) {
            y.h().g().n(this);
        } else {
            f3();
        }
        if (th.h.a().Q1() && this.f8874i0 == null) {
            dk.h hVar = new dk.h(new Handler(Looper.getMainLooper()));
            this.f8874i0 = hVar;
            hVar.a();
        }
        if (r.k().u()) {
            d3();
        }
        if (th.h.a().a3()) {
            a().a(AppRatingPromptHandler.f9777a);
        }
        if (th.h.a().R0()) {
            a().a(PinShortcutHandler.INSTANCE);
        }
        if (th.h.a().E5()) {
            a().a(RecentlyPlayedWidgetHandler.INSTANCE);
        }
        if (th.h.a().N() || th.h.a().W4()) {
            a().a(DeviceDisplayHandler.INSTANCE);
        }
        androidx.p000lifecycle.l lVarA = a();
        SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9821a;
        lVarA.a(systemThemeProtocol);
        systemThemeProtocol.O(new SystemThemeProtocol.d() { // from class: sg.n
            @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.d
            public final void a(String str) {
                this.f30875a.M2(str);
            }
        });
        if (th.h.a().S4()) {
            final pi.m mVar = pi.m.f28640a;
            Objects.requireNonNull(mVar);
            systemThemeProtocol.H(new SystemThemeProtocol.a() { // from class: sg.o
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.a
                public final void a(String str) {
                    mVar.f(str);
                }
            });
        } else if (th.h.a().P0()) {
            systemThemeProtocol.K(new SystemThemeProtocol.b() { // from class: sg.c
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.b
                public final void a(boolean z10) {
                    this.f30744a.N2(z10);
                }
            });
        }
        if (th.h.a().h4()) {
            sh.g.q(sg.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("webrtcsdk", new ExpBackOffRetryPolicy(3, 2000L))}));
            p.h("rbx.main", "Requesting WebRTC SDK module download immediately.");
            sh.g.l("webrtcsdk");
        }
        if (u.b()) {
            u.a(sh.g.f31123a, "rbx.main");
            a().a(FacialAgeEstimationProtocol.INSTANCE);
        }
        if (th.h.a().q5()) {
            if (th.h.a().h2()) {
                a().a(fl.g.f16808a);
            } else {
                a().a(fl.d.f16804a);
            }
        }
        a().a(MediaPickerProtocolV2.INSTANCE);
        tg.a aVar = new tg.a();
        this.f8880o0 = aVar;
        aVar.e(this);
        if (this.f8875j0 == null) {
            wh.i iVar = new wh.i(getApplicationContext());
            this.f8875j0 = iVar;
            iVar.o();
        }
        if (this.f8876k0 == null) {
            z0 z0Var = new z0(getApplicationContext());
            this.f8876k0 = z0Var;
            z0Var.a();
        }
        if (th.h.a().N2()) {
            a().a(u0.f34384a);
        }
        a().a(il.b.a());
        if (th.h.a().f1()) {
            a().a(ExternalIdentityHandler.INSTANCE);
        }
        if (vi.h.e().i()) {
            ArrayList arrayList = new ArrayList(r.l());
            arrayList.add(new NameValuePair("recipient_user_id", String.valueOf(vi.h.e().g())));
            vg.m.c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        com.roblox.client.startup.a.g(getApplicationContext());
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        dk.h hVar;
        if (k0.B()) {
            p.h("rbx.main", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            return;
        }
        p.h("rbx.main", "onDestroy. isFinishing = " + isFinishing());
        NativeGLJavaInterface.setAppShellReloadNeededListener(null);
        NativeGLJavaInterface.setWebviewUserAgentGetter(null);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
        if (this.f8871f0.f34370a == t0.EXPERIENCE) {
            y.h().f().g(true);
        } else {
            g3(this, isFinishing());
        }
        this.S = false;
        k0.s(this).S(this);
        wg.c cVar = this.f8867b0;
        if (cVar != null) {
            cVar.e();
            this.f8867b0 = null;
        }
        if (th.h.a().Q1() && (hVar = this.f8874i0) != null) {
            hVar.b();
            this.f8874i0 = null;
        }
        this.f8880o0.f();
        wh.i iVar = this.f8875j0;
        if (iVar != null) {
            iVar.q();
            this.f8875j0 = null;
        }
        z0 z0Var = this.f8876k0;
        if (z0Var != null) {
            z0Var.b();
            this.f8876k0 = null;
        }
        super.onDestroy();
    }

    @Override // j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return mk.h.f24374a.e(keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return mk.h.f24374a.f(keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(ph.f fVar) {
        long j10 = fVar.b;
        if (j10 != -1) {
            Z2(j10);
        } else {
            W2(fVar.f28612a);
        }
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(ph.g gVar) {
        JSONObject jSONObject;
        String str;
        p.b("rbx.main", "NavigateToFeature: " + gVar.f28613a);
        if ("FRIEND_FINDER_TAG".equals(gVar.f28613a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f28613a)) {
            gVar = G2();
        }
        if ("PROFILE_TAG".equals(gVar.f28613a)) {
            sg.q.i(this, gVar.b, getString(q0.I), gVar.f28616e, gVar.f(), true);
            return;
        }
        if ("GAME_DETAILS_TAG".equals(gVar.f28613a)) {
            sg.q.e(this, a1.g() + "games/" + gVar.b, q0.f30975v, gVar.f28616e, gVar.f());
            return;
        }
        if ("CUSTOM_WEBVIEW_TAG".equals(gVar.f28613a) || "YOUTUBE_TAG".equals(gVar.f28613a)) {
            try {
                jSONObject = new JSONObject(gVar.d());
            } catch (JSONException unused) {
                p.k("rbx.main", "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                jSONObject = null;
            }
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Title.type);
                String strOptString2 = jSONObject.optString("url");
                if (strOptString2.isEmpty()) {
                    p.k("rbx.main", "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                    return;
                }
                if ("YOUTUBE_TAG".equals(gVar.f28613a) && a1.q0()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strOptString2));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                        return;
                    } else {
                        p.k("rbx.main", "Unable to handle youtube links on Maquettes device.");
                        return;
                    }
                }
                if (!gVar.f28616e) {
                    sg.q.h(this, strOptString2, strOptString, false, true);
                    return;
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                    sg.q.g(this, strOptString2, strOptString, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
                    return;
                }
            }
            return;
        }
        if ("SOCIAL_MEDIA_TAG".equals(gVar.f28613a)) {
            new km.a("rbx.main").h(this, gVar.d());
            return;
        }
        if ("MY_FEED_TAG".equals(gVar.f28613a)) {
            sg.q.e(this, a1.g() + "feeds/inapp", q0.G, gVar.f28616e, gVar.f());
            return;
        }
        if ("SEARCH_GAMES_TAG".equals(gVar.f28613a)) {
            sg.q.e(this, a1.G0(gVar.b), q0.J, gVar.f28616e, gVar.f());
            return;
        }
        if ("GAMES_SEE_ALL_TAG".equals(gVar.f28613a)) {
            sg.q.e(this, a1.A(gVar.b), q0.D, gVar.f28616e, gVar.f());
            return;
        }
        if ("ABUSE_REPORT_TAG".equals(gVar.f28613a)) {
            sg.q.d(this, gVar.b, gVar.f());
            return;
        }
        if (!"ANIMATED_ASSET_DETAILS_TAG".equals(gVar.f28613a)) {
            if ("CAPTCHA_SUCCESS_TAG".equals(gVar.f28613a)) {
                p.h("rbx.main", "NavigateToFeature: Received 'CAPTCHA_SUCCESS' tag. Do nothing for now.");
                return;
            }
            if ("CAPTCHA_TAG".equals(gVar.f28613a)) {
                c3(gVar.d());
                return;
            } else if ("SCAN_QR_CODE".equals(gVar.f28613a)) {
                rj.f.f(this, this.Z);
                return;
            } else {
                Y2(rh.b.a(this, gVar.f28613a), gVar.b);
                return;
            }
        }
        if (gVar.b != null) {
            str = a1.g() + "catalog/" + gVar.b;
        } else {
            str = a1.g() + "games/";
        }
        sg.q.i(this, str, getString(q0.M), gVar.f28616e, true, false);
    }

    @fv.j
    public void onNavigateToLuaEvent(com.roblox.client.c.h hVar) {
        e();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, android.app.Activity
    public void onPause() {
        super.onPause();
        p.h("rbx.main", "onPause");
        em.a.k().m();
        jm.a.j().b(jm.a.EnumC0382a.MAIN);
        if (l3()) {
            D2();
        }
        if (!th.h.a().Z3()) {
            p.h("rbx.main", "onPause: NotificationManager removerObserver");
            vi.e.c().g(this);
        }
        yl.c.i().k(this);
        sg.t0.k("onAppBackground");
    }

    @Override // e4.q, e.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        y.h().k().Q(i10, strArr, iArr);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, e4.q, android.app.Activity
    public void onResume() {
        super.onResume();
        p.h("rbx.main", "onResume: IsLoggedIn = " + vi.h.e().f());
        yl.c.i().j(this);
        qi.f fVarJ = qi.b.f().j();
        if (this.f8866a0 != fVarJ) {
            this.f8866a0 = fVarJ;
            p.h("rbx.main", "onResume: Recreating activity due to Locale change.");
            recreate();
            return;
        }
        k0.s(this).N(this);
        if (!y.h().f().i()) {
            q3();
        } else if (this.f8871f0.f34370a == t0.EXPERIENCE && r.k().u()) {
            y.h().f().g(false);
        }
        if (this.f8873h0) {
            wh.f.j().B(true);
            this.f8873h0 = false;
        }
        if (a1.l0()) {
            z2(getResources().getConfiguration());
        }
        y.h().k().d0(this);
        y.h().k().c0();
        em.a.k().l(this, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 20124, new em.a.g() { // from class: sg.i
            @Override // em.a.g
            public final void a(String str, String str2) {
                this.f30769a.b3(str, str2);
            }
        });
        if (!th.h.a().V1()) {
            p.h("rbx.main", "Setting result launcher for IdentityProtocol");
            y.h().g().y(this.f8872g0);
        }
        if (s.e()) {
            y.h().e().x(this);
        }
    }

    @Override // com.roblox.client.b, e.p, k2.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BACK_FROM_GAME", this.W);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        jm.a.j().g();
        this.f8869d0.b();
        e2.f30759a = getResources().getDisplayMetrics();
        if (com.roblox.client.a.R == 1 && this.f8871f0.f34370a == t0.APP) {
            NativeReportingInterface.applicationForegrounded();
        }
        if (th.h.a().w5()) {
            p.h("rbx.main", "onStart: App is going to foreground. setAppSuspended(false)");
            NativeReportingInterface.setAppSuspended(false);
        }
        fv.c.d().n(this);
        wk.h.h().i(wh.f.j());
        sg.t0.v("main");
        hm.b.h().e();
        if (this.f8871f0.f34370a == t0.EXPERIENCE) {
            y.h().f().p();
        }
        pm.a.c().a();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, e4.q, android.app.Activity
    public void onStop() {
        fv.c.d().p(this);
        this.f8869d0.a();
        if (com.roblox.client.a.R == 1 && this.f8871f0.f34370a == t0.APP) {
            NativeReportingInterface.applicationBackgrounded();
        }
        if (th.h.a().w5() && this.f8871f0.f34370a == t0.APP) {
            p.h("rbx.main", "onStop: App is going to background. setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        wk.h.h().j(wh.f.j());
        hm.b.h().f();
        if (this.f8871f0.f34370a == t0.EXPERIENCE) {
            y.h().f().n();
        }
        pm.a.c().b();
        if (th.h.a().Z3()) {
            p.h("rbx.main", "onStop: NotificationManager removerObserver");
            vi.e.c().g(this);
        }
        super.onStop();
        p.h("rbx.main", "onStop");
    }

    @Override // com.roblox.client.b, e.p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (th.h.a().I2()) {
            c0.s(i10);
        }
        this.f8871f0.j(i10);
    }

    public final void p3(String str) {
        Intent intent = new Intent(this, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        startActivity(intent);
        overridePendingTransition(g0.b, g0.f30765c);
    }

    public final void q3() {
        p.h("rbx.main", "startup:");
        if (k0.s(this).v() || vi.h.e().f() || com.roblox.client.startup.a.m() || !s.f()) {
            k0.s(this).Q();
            return;
        }
        p.e("rbx.main", "Incomplete initialization, restarting app");
        startActivity(ActivitySplash.o2(this, StartedForEnum.SHELL_PROCESS_RESTART));
        finish();
    }

    @Override // rh.d
    public androidx.fragment.app.c r(String str) {
        return l1().n0(str);
    }

    public void r3(t0 t0Var) {
        this.f8871f0.k(t0Var);
    }

    public final void z2(Configuration configuration) {
        s0 s0Var = this.f8871f0;
        if (s0Var == null || s0Var.f34370a != t0.EXPERIENCE) {
            c2.a(getWindow(), configuration);
        }
    }
}
