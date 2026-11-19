package com.roblox.client;

import ai.ExpBackOffRetryPolicy;
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
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.webkit.WebSettings;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import bh.c2;
import bh.e2;
import bh.g0;
import bh.m0;
import bh.q0;
import bh.y;
import bh.y0;
import bh.y1;
import com.github.luben.zstd.BuildConfig;
import com.lazyexec.exe.MainActivity;
import com.roblox.client.captcha.ActivityFunCaptcha;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.game.ExperienceSession;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.calling.CallingHandler;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.protocols.webview.WebViewProtocol;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import eh.o;
import ei.a1;
import ei.p;
import ei.q;
import ei.t0;
import ei.u0;
import ei.v0;
import f4.v;
import ik.k0;
import ik.n0;
import ik.s2;
import ik.u2;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import mi.m;
import nj.a0;
import ok.t;
import ok.w;
import ok.x;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import rj.r;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityNativeMain extends com.roblox.client.a implements dj.e.InterfaceC0225e, zh.e, n0, fh.b.d, ei.a.g, com.roblox.client.startup.c.b, NativeGLJavaInterface.OnAppShellReloadNeededListener, NativeGLJavaInterface.WebViewUserAgentGetter, NativeGLJavaInterface.MobileAdvertisingIdGetter, hk.c, ei.a.f, ExperienceSession.d, com.roblox.protocols.webview.a.d, q {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static boolean f8750q0 = true;
    public boolean S;
    public zh.a T;
    public View U;
    public View V;
    public boolean W;
    public long X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public yi.f f8751a0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public WebViewProtocol f8753c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public AppHangMonitor f8754d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f8755e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public t0 f8756f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public g.d<g.i> f8757g0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public lk.i f8759i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public ei.i f8760j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public a1 f8761k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public ImageView f8762l0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public ch.a f8765o0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public fh.b f8752b0 = null;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f8758h0 = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final Runnable f8763m0 = new Runnable() { // from class: bh.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f4078a.J2();
        }
    };

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Runnable f8764n0 = new Runnable() { // from class: bh.k
        @Override // java.lang.Runnable
        public final void run() {
            this.f4094a.K2();
        }
    };

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final m f8766p0 = new g();

    public class a implements com.roblox.client.c.i {
        public a() {
        }

        @Override // com.roblox.client.c.i
        public void a(String str) {
            if (ActivityNativeMain.this.f8753c0 != null) {
                ActivityNativeMain.this.f8753c0.s(str);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ActivityNativeMain f8768a;

        public b(ActivityNativeMain activityNativeMain) {
            this.f8768a = activityNativeMain;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActivityNativeMain.this.isFinishing()) {
                return;
            }
            dj.b.p();
            new l(this.f8768a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ok.q.b("rbx.main", "[GrantPendingPurchase] Executor::run: ");
            ActivityNativeMain.this.A2(false);
        }
    }

    public class d implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8770a;

        public d(ViewGroup viewGroup) {
            this.f8770a = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            SurfaceView surfaceView;
            if (uk.h.f33471a.b() && view2 == null && (surfaceView = (SurfaceView) this.f8770a.findViewById(m0.f4149k0)) != null) {
                surfaceView.requestFocus();
            }
        }
    }

    public class e implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Bitmap f8771a = null;
        public boolean b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f8772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ SurfaceView f8773d;

        public e(ViewGroup viewGroup, SurfaceView surfaceView) {
            this.f8772c = viewGroup;
            this.f8773d = surfaceView;
        }

        public final /* synthetic */ void b(int i10) {
            this.b = i10 == 0;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f8762l0 == null || this.f8771a == null || !this.b) {
                return;
            }
            ActivityNativeMain.this.f8762l0.setVisibility(0);
            ActivityNativeMain.this.f8762l0.setImageBitmap(this.f8771a);
            ActivityNativeMain.this.i3(3000L);
            this.f8771a = null;
            this.b = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f8762l0 != null) {
                long width = ((long) (this.f8772c.getWidth() * this.f8772c.getHeight())) * 4;
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < width) {
                    ok.q.h("rbx.main", "surfaceDestroyed: Not enough memory for screenshot. Available: " + jFreeMemory + ", Required: " + width);
                    return;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f8772c.getWidth(), this.f8772c.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f8771a = bitmapCreateBitmap;
                    PixelCopy.request(this.f8773d, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: bh.p
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            this.f4217a.b(i10);
                        }
                    }, new Handler(Looper.getMainLooper()));
                } catch (OutOfMemoryError e10) {
                    ok.q.f("rbx.main", "surfaceDestroyed: Out of memory while creating screenshot.", e10);
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

        @Override // mi.m
        public void a(mi.j jVar) {
            if (jVar.b() == 401) {
                ok.q.k("rbx.main", "sessionCheckHandler: Got 401 error code from the server. Logout now...");
                dj.b.f().i(ActivityNativeMain.this, dj.b.d.LOGOUT_BY_401_ERROR_IN_NATIVE);
            }
        }
    }

    public class h extends com.roblox.client.d.c {
        public h() {
        }

        @Override // com.roblox.client.d.InterfaceC0142d
        public void a(com.roblox.client.d.e eVar) {
            if (eVar.b()) {
                ActivityNativeMain.this.f2(false);
                return;
            }
            if (eVar.c()) {
                ActivityNativeMain.this.f2(true);
            } else if (t.j() && eVar.a()) {
                dj.b.f().i(ActivityNativeMain.this, dj.b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.d.c, com.roblox.client.d.InterfaceC0142d
        public void b(com.roblox.client.d.e eVar) {
            if (bh.a1.q0() && eVar.c()) {
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

        @Override // com.roblox.client.d.InterfaceC0142d
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
        public WeakReference<ActivityNativeMain> f8781a;

        public l(ActivityNativeMain activityNativeMain) {
            ok.q.h("rbx.main", "Reloading lua app.");
            this.f8781a = new WeakReference<>(activityNativeMain);
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            ei.a aVarD;
            Surface surfaceI2;
            ActivityNativeMain activityNativeMain = this.f8781a.get();
            if (activityNativeMain == null || (aVarD = activityNativeMain.F2().d()) == null || (surfaceI2 = aVarD.I2()) == null) {
                return Boolean.FALSE;
            }
            dj.b.e();
            if (bh.a1.E0()) {
                ei.f.j().y(activityNativeMain, surfaceI2, activityNativeMain);
            } else {
                ei.f.j().x(activityNativeMain, surfaceI2);
            }
            return Boolean.TRUE;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            ActivityNativeMain activityNativeMain;
            if (bool.booleanValue() || (activityNativeMain = this.f8781a.get()) == null || activityNativeMain.V == null) {
                return;
            }
            activityNativeMain.V.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ActivityNativeMain activityNativeMain = this.f8781a.get();
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
        bh.q.f(this, ok.f.c(str2), str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void d3() {
        ok.q.h("rbx.main", "processPushNotification.");
        Bundle bundleI = r.k().i();
        if (bundleI == null || r.k().t(bundleI)) {
            return;
        }
        try {
            String string = bundleI.getString("EXTRA_NOTIFICATION_TYPE", BuildConfig.FLAVOR);
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
                        bk.a.a().b(bundleI.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
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
        ei.a aVarD = activityNativeMain.F2().d();
        if (aVarD != null && z10) {
            activityNativeMain.l1().r().m(aVarD).h();
        }
        ok.q.b("rbx.appshell", "removeGlApp() clearing app shell");
        ei.f.j().f();
    }

    private void o3(int i10) {
        LoggingProtocol.g("retry_during_main");
        com.roblox.client.startup.c.y2(this, i10);
    }

    public final void A2(boolean z10) {
        if (bi.h.a().g5()) {
            IAPPurchaseManager.M(this, z10);
            return;
        }
        if (!t.g()) {
            if (t.i()) {
                nk.c cVarC = nk.c.c();
                String strK = cVarC.k();
                long j10 = cVarC.j();
                if (TextUtils.isEmpty(strK)) {
                    return;
                }
                if (bi.h.a().L5()) {
                    qj.b.a(this);
                    throw null;
                }
                if (j10 > 0) {
                    qj.a.a(this);
                    throw null;
                }
                qj.a.a(this);
                throw null;
            }
            return;
        }
        String strK2 = nk.c.c().k();
        long j11 = nk.c.c().j();
        if (TextUtils.isEmpty(strK2)) {
            return;
        }
        if (bi.h.a().L1()) {
            if (j11 > 0) {
                a0.R(this).K(j11, z10);
                return;
            } else {
                a0.R(this).L(z10);
                return;
            }
        }
        if (bi.h.a().t3() && bi.h.a().q()) {
            nj.m.F0(this).m1(j11, strK2, z10);
        } else if (j11 > 0) {
            nj.m.F0(this).A0(j11, strK2, z10);
        } else {
            nj.m.F0(this).B0(strK2, z10);
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
        this.Z = m0.F;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(m0.F);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (bi.h.a().O0()) {
            i10 = bh.n0.f4192k;
        } else {
            i10 = bi.h.a().J4() ? bh.n0.f4193l : bh.n0.f4191j;
        }
        if (bi.h.a().r2()) {
            LoggingProtocol.g("fragment_shared_inflate_begin");
        }
        getLayoutInflater().inflate(i10, (ViewGroup) frameLayout, true);
        if (bi.h.a().r2()) {
            LoggingProtocol.g("fragment_shared_inflate_end");
        }
        this.f8756f0 = new t0(this, (SurfaceView) frameLayout.findViewById(m0.f4149k0));
        a().a(this.f8756f0);
        uk.h.f33471a.c(getResources().getConfiguration());
        ok.q.h("rbx.main", "createGlAppsFrame() apps frame created");
        viewGroup.addView(frameLayout, 0);
        if (l3()) {
            SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(m0.f4149k0);
            surfaceView.getHolder().addCallback(new e(viewGroup, surfaceView));
        }
    }

    public final void D2() {
        if (this.f8762l0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.U.getRootView();
        this.f8762l0 = new ImageView(this);
        new FrameLayout.LayoutParams(-1, -1);
        this.f8762l0.setVisibility(8);
        this.f8762l0.setOnTouchListener(new f());
        viewGroup.addView(this.f8762l0);
        NativeGLInterface.nativeScheduleOnFirstFrame(this.f8764n0);
    }

    @Override // ei.q
    public void E() {
        E1();
    }

    @Override // ik.n0
    public void F() {
        ok.q.h("rbx.main", "updateViewAppSettingsLoaded:");
        k3();
    }

    public final zh.a F2() {
        if (this.T == null) {
            this.T = new zh.a(this, this.Z);
        }
        return this.T;
    }

    public final yh.g G2() {
        yh.g gVarB = yh.g.b("CUSTOM_WEBVIEW_TAG");
        gVarB.g(bh.a1.Q(this));
        gVarB.j(true);
        return gVarB;
    }

    @Override // bh.f0
    public void H() {
        E1();
    }

    public final void H2() {
        ok.q.h("rbx.main", "internalOnResume:");
        A2(true);
        com.roblox.client.d.e().b(new h());
        if ((t.j() || dj.h.e().i()) && e2.j(this)) {
            dj.h.e().d(this.f8766p0);
        }
        ok.q.h("rbx.main", "internalOnResume: NotificationManager addObserver");
        dj.e.c().b(this);
        if (r.k().u() && e2.j(this)) {
            if (this.W) {
                this.W = false;
            }
            d3();
        }
        if (this.W) {
            ok.q.h("rbx.main", "Back from game. Resuming Lua App.");
            a3();
        }
        zh.a aVarF2 = F2();
        l1().j0();
        if (aVarF2.d() == null) {
            aVarF2.g(new zh.c("CUSTOM_LUAVIEW_TAG"));
        }
    }

    @Override // ik.n0
    public void I() {
        ok.q.h("rbx.main", "showRetryUI:");
        if (bh.a1.q0()) {
            x.a(this, q0.S);
            finish();
        } else if (J1()) {
            o3(q0.S);
        }
    }

    public final /* synthetic */ void I2(JSONObject jSONObject) {
        bh.q.b(jSONObject, this);
    }

    public final /* synthetic */ void J2() {
        ImageView imageView = this.f8762l0;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.f8762l0.setImageBitmap(null);
        }
    }

    public final /* synthetic */ void K2() {
        i3(500L);
    }

    public final /* synthetic */ void L2() {
        this.V.setVisibility(8);
    }

    @Override // com.roblox.client.startup.c.b
    public void M() {
        E2();
        q3();
    }

    public final /* synthetic */ void M2(final String str) {
        runOnUiThread(new Runnable() { // from class: bh.e
            @Override // java.lang.Runnable
            public final void run() {
                nk.c.c().u(cm.a.b(str));
            }
        });
    }

    @Override // ik.n0
    public void N() {
        ok.q.h("rbx.main", "navigateToLandingScreen:");
        Intent intentO = y.h().o(this);
        intentO.putExtra("send_app_input_focus_to_lua", true);
        startActivity(intentO);
        finish();
    }

    public final /* synthetic */ void N2(boolean z10) {
        xi.c.f36686a.j(z10);
        xi.b.f36685a.b(this, z10);
    }

    public final /* synthetic */ void O2() {
        this.W = true;
        k0();
    }

    @Override // com.roblox.client.a
    public boolean P1() {
        return true;
    }

    public final /* synthetic */ void P2(g.a aVar) {
        y.h().g().r(this, aVar.getData());
    }

    @Override // com.roblox.client.a
    public ui.c Q1() {
        return new ui.d();
    }

    public final void Q2(zh.c cVar) {
        ok.q.h("rbx.appshell", "loadDataModel()");
        ei.f.j().F(this);
        ei.f.j().k(p.a(this));
        if (NativeGLInterface.isColdStartDeeplinkToGame() && dj.h.h()) {
            qm.a.a().b(new qm.a.b() { // from class: bh.h
                @Override // qm.a.b
                public final void a(JSONObject jSONObject) {
                    this.f4073a.I2(jSONObject);
                }
            });
            k0.G(this, dj.h.l().toString());
        }
        if (y.h().f().i()) {
            return;
        }
        m3(cVar);
        NativeGLInterface.nativeAppBridgeStartLuaAppDM();
    }

    @Override // dj.e.InterfaceC0225e
    public void R(int i10, Bundle bundle) {
        if (i10 != 2) {
            if (i10 != 101) {
                return;
            }
            bh.q.j(ei.k0.c(bundle.getBundle("game_init_params")), this);
        } else {
            ok.q.h("rbx.main", "ANM.handleNotification() Logout event...");
            NativeGLInterface.nativeAppBridgeV2UserDidLogout();
            if (ek.c.a()) {
                new l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                X1(dj.b.g(bundle));
            }
        }
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
                strB0 = bh.a1.b0(dj.h.e().g());
            } else if (string.equals("FriendRequestReceived")) {
                strB0 = bh.a1.a0(dj.h.e().g());
            }
        } else if (string.equals("FriendRequestAccepted")) {
            strB0 = j10 == -1 ? bh.a1.b0(dj.h.e().g()) : bh.a1.c0(j10);
        } else if (string.equals("FriendRequestReceived")) {
            strB0 = j10 == -1 ? bh.a1.a0(dj.h.e().g()) : bh.a1.c0(j10);
        }
        p3(strB0);
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
    public void S() {
        if (isFinishing()) {
            return;
        }
        NativeGLInterface.setMobileAdvertisingId(ok.c.d());
    }

    public final void S2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_CONVERSATION_ID", -1L);
        p3(j10 == -1 ? bh.a1.w0() : bh.a1.A0(j10));
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
            bh.q.i(this, intent.getStringExtra("PATH_EXTRA"), getString(q0.I), false, false, true);
        } else if ("SETTINGS_TAG".equals(stringExtra)) {
            bh.q.f(this, intent.getStringExtra("PATH_EXTRA"), getString(q0.L));
        } else {
            bh.q.f(this, intent.getStringExtra("PATH_EXTRA"), zh.b.a(this, stringExtra));
        }
    }

    public final String V2() {
        return "OVERLAY_" + l1().u0();
    }

    public final void W2(long j10) {
        ok.q.b("rbx.main", "navigateToConversation() conversation:" + j10);
        zh.c cVar = new zh.c("CHAT_TAG");
        cVar.g("CHAT_CONVERSATION_ID", j10);
        X2(cVar);
    }

    public final void X2(zh.c cVar) {
        ok.q.i("rbx.main", "navigateToFeature:" + cVar.getName() + " bundle:" + cVar.a());
        m3(cVar);
    }

    @Override // ei.a.g
    public void Z() {
        ok.q.h("rbx.main", "onAppStarted: ");
        if (J1() && dj.b.e()) {
            new l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void Z2(long j10) {
        ok.q.b("rbx.main", "navigateToUserConversation() user:" + j10);
        zh.c cVar = new zh.c("CHAT_TAG");
        cVar.g("USER_ID_EXTRA", j10);
        X2(cVar);
    }

    public final void a3() {
        n3();
        this.W = false;
    }

    @Override // bh.f0
    public boolean b() {
        return this.f8756f0.b();
    }

    public void b3(String str, String str2) {
        hk.a.c(str, str2);
    }

    @Override // ei.a.g
    public void c(String str) {
        ok.q.h("rbx.main", "onAppReady: " + str);
        View view = this.V;
        if (view != null && view.getVisibility() != 8) {
            this.V.post(new j());
        }
        if ("Landing".equals(str) || "Home".equals(str)) {
            com.roblox.client.d.e().b(new k());
        } else if ("Push".equals(str)) {
            y.h().k().Q(getApplicationContext());
        }
        if (bi.h.a().m2()) {
            final Context applicationContext = getApplicationContext();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: bh.f
                @Override // java.lang.Runnable
                public final void run() {
                    u2.b(applicationContext);
                }
            });
        }
    }

    public final void c3(String str) {
        JSONObject jSONObject;
        lh.a dVar;
        lh.b.c cVar;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            ok.q.k("rbx.main", "openFunCaptchaActivity: Exception parsing json data.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.optString("captchaType").equals("login")) {
                String strOptString = jSONObject.optString("cvalueType");
                String strOptString2 = jSONObject.optString("cvalue");
                strOptString.getClass();
                switch (strOptString) {
                    case "phone_number":
                        cVar = lh.b.c.PHONE_NUMBER;
                        break;
                    case "username":
                        cVar = lh.b.c.USERNAME;
                        break;
                    case "email":
                        cVar = lh.b.c.EMAIL;
                        break;
                    default:
                        throw new RuntimeException("Unsupported credential Type: " + strOptString + ".");
                }
                dVar = new lh.b(cVar, strOptString2);
            } else {
                dVar = new lh.d();
            }
            ok.q.h("rbx.main", "openFunCaptchaActivity: config = " + dVar);
            startActivityForResult(ActivityFunCaptcha.i2(this, dVar), 20115);
        }
    }

    @Override // fh.b.d, com.roblox.protocols.webview.a.d
    public void d(bm.a aVar) {
        B2();
        Boolean bool = aVar.f4458d;
        boolean z10 = false;
        boolean z11 = bool != null && bool.booleanValue();
        Boolean bool2 = aVar.f4457c;
        boolean zBooleanValue = bool2 == null ? true : bool2.booleanValue();
        Boolean bool3 = aVar.f4459e;
        boolean z12 = bool3 != null && bool3.booleanValue();
        Boolean bool4 = aVar.f4460f;
        boolean z13 = bool4 != null && bool4.booleanValue();
        Boolean bool5 = aVar.f4461g;
        if (bool5 != null && bool5.booleanValue()) {
            z10 = true;
        }
        com.roblox.client.c y0Var = z11 ? new y0() : new di.k();
        y0Var.a().a(new fh.a());
        Bundle bundle = new Bundle();
        bundle.putString("DEFAULT_URL", aVar.f4456a);
        bundle.putBoolean("USE_APP_HYBRID", true);
        bundle.putBoolean("VISIBLE", zBooleanValue);
        bundle.putBoolean("BACK_NAVIGATION_DISABLED", z12);
        bundle.putString("TITLE_STRING", aVar.b);
        bundle.putBoolean("HAS_PARENT", true);
        bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
        bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", z13);
        bundle.putBoolean("hideNativeHeader", z10);
        y0Var.O1(bundle);
        y0Var.B3(new a());
        f4.t0 t0VarR = l1().r();
        t0VarR.b(m0.f4146j, y0Var, V2());
        t0VarR.f(null);
        t0VarR.h();
    }

    @Override // fh.b.d, com.roblox.protocols.webview.a.d
    public void e() {
        WebViewProtocol webViewProtocol;
        if (!h3() || (webViewProtocol = this.f8753c0) == null) {
            return;
        }
        webViewProtocol.t();
    }

    public void e3() {
        new com.roblox.client.startup.d().c(this, new com.roblox.client.startup.d.a() { // from class: bh.l
            @Override // com.roblox.client.startup.d.a
            public final void a() {
                this.f4101a.finish();
            }
        });
    }

    @Override // bh.f0
    public void f(boolean z10) {
        this.f8756f0.f(z10);
    }

    public void f3() {
        ok.q.h("rbx.main", "Registering activity result for IdentityProtocol.");
        this.f8757g0 = h(new h.j(), new g.b() { // from class: bh.d
            @Override // g.b
            public final void a(Object obj) {
                this.f4054a.P2((g.a) obj);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (bi.h.a().S2() && bh.a1.q0()) {
            Process.killProcess(Process.myPid());
        }
    }

    @Override // fh.b.d, com.roblox.protocols.webview.a.d
    public void g(bm.a aVar) {
        if (l1().u0() > 0) {
            f4.q qVarM0 = l1().m0(m0.f4146j);
            if (qVarM0 instanceof com.roblox.client.c) {
                ((com.roblox.client.c) qVarM0).H3(aVar);
            }
        }
    }

    public final boolean h3() {
        int i10 = 0;
        if (l1().U0()) {
            return false;
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

    @Override // ik.n0
    public void i0() {
    }

    public final void i3(long j10) {
        this.f8762l0.removeCallbacks(this.f8763m0);
        this.f8762l0.postDelayed(this.f8763m0, j10);
    }

    public void j3(boolean z10) {
        wk.a aVar = new wk.a(z10);
        NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f35884a, aVar.b, aVar.f35885c);
    }

    @Override // hk.c
    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            ok.q.b("rbx.main", "Share data is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("context");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            hk.a.c(string2, string);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 167772160);
            j3(false);
            startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), 20124);
        } catch (JSONException unused) {
            ok.q.b("rbx.main", "Error parsing share data.");
        }
    }

    @Override // ik.n0
    public void k0() {
        ok.q.h("rbx.main", "navigateToMainScreen: IsLoggedIn = " + dj.h.e().f());
        k3();
        if (!y.h().f().i() && J1() && dj.h.e().f()) {
            H2();
        }
    }

    public final void k3() {
        ok.q.b("rbx.main", "setupMainTabs: tabs-loaded = " + this.S);
        if (this.S) {
            return;
        }
        this.S = true;
        Q2((!T2() || t.j()) ? new zh.c("CUSTOM_LUAVIEW_TAG") : new zh.c("GAMES_TAG"));
        if (this.f8752b0 == null) {
            fh.b bVar = new fh.b(this, new Handler(Looper.getMainLooper()));
            this.f8752b0 = bVar;
            bVar.c();
        }
        if (bh.a1.q0()) {
            return;
        }
        this.f8753c0 = new WebViewProtocol(this);
    }

    @Override // bh.f0
    public void l() {
        this.f8756f0.l();
    }

    public final boolean l3() {
        return !bh.a1.q0();
    }

    @Override // com.roblox.client.game.ExperienceSession.d
    public void m(Bundle bundle) {
        ok.q.h("rbx.main", "Request to end the game. Performing app restoration.");
        if (bi.h.a().n0()) {
            this.X = bundle.getLong(PinShortcutHandler.EXTRA_PLACE_ID);
            this.Y = bundle.getString("gameId");
        }
        y.h().f().l(null);
        r3(u0.APP);
        f4.k0 k0VarL1 = l1();
        if (!J1() || k0VarL1.U0()) {
            ok.q.h("rbx.main", "Experience has been ended in the background.");
            this.f8758h0 = true;
        } else {
            bh.a1.U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            ei.f.j().z();
            ei.f.j().B(true);
            runOnUiThread(new Runnable() { // from class: bh.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4069a.O2();
                }
            });
        }
    }

    public void m3(zh.c cVar) {
        ok.q.h("rbx.main", "ANM.showFeature: " + cVar.getName());
        F2().g(cVar);
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
        if (bi.h.a().m2()) {
            NativeGLInterface.setWebviewUserAgent(u2.c(this));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(this));
        }
    }

    public final void n3() {
        if (bi.h.a().m3() || bi.h.a().n2() || mh.b.b().c() < bi.h.a().t()) {
            return;
        }
        gh.a.e().i(this, this.X, this.Y);
    }

    @Override // com.roblox.client.game.ExperienceSession.d
    public v o0() {
        return this;
    }

    @Override // com.roblox.client.a, f4.v, e.p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        ok.q.b("rbx.main", "onActivityResult: requestCode = " + i10 + " resultCode = " + i11 + " Intent data = " + intent);
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
                hk.a.a();
                j3(true);
                if (bi.h.a().h3()) {
                    sm.a.k().e(intent);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onActivityResult from FunCaptcha: code:");
            sb2.append(i11);
            sb2.append(", result:");
            sb2.append(i11 == 101 ? "success" : "dismiss");
            ok.q.h("rbx.main", sb2.toString());
            ei.f.j().A(new wk.a(true));
            m3(new zh.c("HOME_TAG"));
        }
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onBackButtonNotConsumedEvent(yh.c cVar) {
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
        f4.q qVarM0 = l1().m0(m0.f4146j);
        if (qVarM0 instanceof com.roblox.client.c) {
            com.roblox.client.c cVar = (com.roblox.client.c) qVarM0;
            if (this.f8753c0 != null) {
                if (cVar.h3() || !cVar.e3()) {
                    this.f8753c0.t();
                    return;
                }
                return;
            }
            if (cVar.h3() || cVar.e3()) {
                return;
            }
            l1().a1();
            return;
        }
        if (!(qVarM0 instanceof y1)) {
            if (zj.f.d(this)) {
                ok.q.h("rbx.main", "onBackPressed: BACK button is handled for QrCodeScanner.");
                return;
            } else {
                l1().a1();
                return;
            }
        }
        y1 y1Var = (y1) qVarM0;
        if (y1Var.J2() || y1Var.G2()) {
            return;
        }
        l1().a1();
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onCodeParsedFromSMS(yh.j jVar) {
        ok.q.h("rbx.main", "SMS code received.");
        ok.q.h("rbx.main", "Calling IdentityProtocol to parse OTP.");
        y.h().g().o(jVar.f37872a);
    }

    @Override // j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        uk.h.f33471a.d(configuration);
        if (l3()) {
            this.f8763m0.run();
        }
        SystemThemeProtocol.f9823a.C();
        if (bh.a1.l0()) {
            z2(configuration);
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        MainActivity.Start(this);
        if (!ActivitySplash.r2() && !com.roblox.client.startup.a.m() && bundle != null) {
            k0.x(bundle.getBoolean("RESTART_AFTER_PROCESS_DEATH", false));
            if (k0.B()) {
                ok.q.h("rbx.main", "onCreate: App was previously destroyed due to process death");
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        if (bi.h.a().S3()) {
            if (f8750q0) {
                f8750q0 = false;
            } else {
                ok.q.k("rbx.main", "onCreate: Activity recreated");
                LoggingProtocol.g("activity_recreated");
            }
        }
        if (!w.a(this).equals("foreground")) {
            LoggingProtocol.g("background_process_detected");
        }
        LoggingProtocol.g("main_activity_oncreate");
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate NativeMain. savedInstanceState is null: ");
        sb2.append(bundle == null);
        ok.q.h("rbx.main", sb2.toString());
        if (this.f8754d0 == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            this.f8754d0 = appHangMonitor;
            appHangMonitor.c();
        }
        if (bi.h.a().B3() && Build.VERSION.SDK_INT >= 29) {
            LoggingProtocol.h("android_thermal_throttling", ((PowerManager) getSystemService("power")).getCurrentThermalStatus() + 1000);
        }
        this.f8751a0 = yi.b.f().j();
        k0.s(this).N(this);
        setContentView(bh.n0.f4185d);
        if (bundle != null) {
            this.W = bundle.getBoolean("BACK_FROM_GAME");
        }
        xm.a.c(this);
        if (!this.W) {
            xm.a.j().a(xm.a.EnumC0756a.MAIN, bundle);
        }
        this.U = findViewById(m0.f4144i);
        this.V = findViewById(m0.X);
        if (s2.b()) {
            this.V.setBackgroundColor(-16777216);
        } else {
            ((ViewStub) findViewById(m0.T)).inflate();
        }
        if (y.h().f().h()) {
            this.V.post(new Runnable() { // from class: bh.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4128a.L2();
                }
            });
        } else {
            this.V.setVisibility(0);
        }
        C2();
        NativeGLJavaInterface.setAppShellReloadNeededListener(this);
        NativeGLJavaInterface.setWebviewUserAgentGetter(this);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(this);
        if (this.f8755e0 == null && bi.h.a().r0()) {
            long jL3 = bi.h.a().L3();
            ok.q.b("rbx.main", "Setup mPendingPurchaseExecutor to run every " + jL3 + " seconds");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.f8755e0 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new c(), jL3, jL3, TimeUnit.SECONDS);
        }
        if (bi.h.a().f2()) {
            y.h().g().n(this);
        } else {
            f3();
        }
        if (bi.h.a().a2() && this.f8759i0 == null) {
            lk.i iVar = new lk.i(new Handler(Looper.getMainLooper()));
            this.f8759i0 = iVar;
            iVar.b();
        }
        if (r.k().u()) {
            d3();
        }
        if (bi.h.a().m3()) {
            a().a(AppRatingPromptHandler.f9795a);
        }
        if (bi.h.a().a1()) {
            a().a(PinShortcutHandler.INSTANCE);
        }
        if (bi.h.a().N5()) {
            a().a(RecentlyPlayedWidgetHandler.INSTANCE);
        }
        if (bi.h.a().R() || bi.h.a().i5()) {
            a().a(DeviceDisplayHandler.INSTANCE);
        }
        androidx.p000lifecycle.l lVarA = a();
        SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9823a;
        lVarA.a(systemThemeProtocol);
        systemThemeProtocol.O(new SystemThemeProtocol.d() { // from class: bh.n
            @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.d
            public final void a(String str) {
                this.f4182a.M2(str);
            }
        });
        if (bi.h.a().f5()) {
            final xi.m mVar = xi.m.f36703a;
            Objects.requireNonNull(mVar);
            systemThemeProtocol.H(new SystemThemeProtocol.a() { // from class: bh.o
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.a
                public final void a(String str) {
                    mVar.f(str);
                }
            });
        } else if (bi.h.a().Y0()) {
            systemThemeProtocol.K(new SystemThemeProtocol.b() { // from class: bh.c
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.b
                public final void a(boolean z10) {
                    this.f4049a.N2(z10);
                }
            });
        }
        if (ai.k.a()) {
            ai.h.r(bh.b.a(new Map.Entry[]{new AbstractMap.SimpleEntry("webrtcsdk", new ExpBackOffRetryPolicy(3, CallingHandler.AVATAR_TIMEOUT_MS))}));
            ok.q.h("rbx.main", "Requesting WebRTC SDK module download immediately.");
            ai.h.m("webrtcsdk");
        }
        if (ok.v.b()) {
            ok.v.a(ai.h.f468a, "rbx.main");
            a().a(FacialAgeEstimationProtocol.INSTANCE);
        }
        if (bi.h.a().x5()) {
            if (bi.h.a().t2()) {
                a().a(sl.g.f31481a);
            } else {
                a().a(sl.d.f31477a);
            }
        }
        a().a(MediaPickerProtocolV2.INSTANCE);
        ch.a aVar = new ch.a();
        this.f8765o0 = aVar;
        aVar.d(this);
        if (this.f8760j0 == null) {
            ei.i iVar2 = new ei.i(getApplicationContext());
            this.f8760j0 = iVar2;
            iVar2.o();
        }
        if (this.f8761k0 == null) {
            a1 a1Var = new a1(getApplicationContext());
            this.f8761k0 = a1Var;
            a1Var.a();
        }
        if (bi.h.a().a3()) {
            a().a(v0.f13801a);
        }
        a().a(wl.b.a());
        if (bi.h.a().n1()) {
            a().a(ExternalIdentityHandler.INSTANCE);
        }
        if (dj.h.e().i()) {
            ArrayList arrayList = new ArrayList(r.l());
            arrayList.add(new NameValuePair("recipient_user_id", String.valueOf(dj.h.e().g())));
            o.c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        com.roblox.client.startup.a.g(getApplicationContext());
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onDestroy() {
        lk.i iVar;
        if (k0.B()) {
            ok.q.h("rbx.main", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            return;
        }
        ok.q.h("rbx.main", "onDestroy. isFinishing = " + isFinishing());
        NativeGLJavaInterface.setAppShellReloadNeededListener(null);
        NativeGLJavaInterface.setWebviewUserAgentGetter(null);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
        if (this.f8756f0.f13787a == u0.EXPERIENCE) {
            y.h().f().g(true);
        } else {
            g3(this, isFinishing());
        }
        this.S = false;
        k0.s(this).S(this);
        fh.b bVar = this.f8752b0;
        if (bVar != null) {
            bVar.e();
            this.f8752b0 = null;
        }
        if (bi.h.a().a2() && (iVar = this.f8759i0) != null) {
            iVar.e();
            this.f8759i0 = null;
        }
        this.f8765o0.e();
        ei.i iVar2 = this.f8760j0;
        if (iVar2 != null) {
            iVar2.q();
            this.f8760j0 = null;
        }
        a1 a1Var = this.f8761k0;
        if (a1Var != null) {
            a1Var.b();
            this.f8761k0 = null;
        }
        super.onDestroy();
    }

    @Override // j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return uk.h.f33471a.e(keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return uk.h.f33471a.f(keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(yh.f fVar) {
        long j10 = fVar.b;
        if (j10 != -1) {
            Z2(j10);
        } else {
            W2(fVar.f37865a);
        }
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(yh.g gVar) {
        JSONObject jSONObject;
        String str;
        ok.q.b("rbx.main", "NavigateToFeature: " + gVar.f37866a);
        if ("FRIEND_FINDER_TAG".equals(gVar.f37866a) || "UNIVERSAL_FRIENDS_TAG".equals(gVar.f37866a)) {
            gVar = G2();
        }
        if ("PROFILE_TAG".equals(gVar.f37866a)) {
            bh.q.i(this, gVar.b, getString(q0.I), gVar.f37869e, gVar.f(), true);
            return;
        }
        if ("GAME_DETAILS_TAG".equals(gVar.f37866a)) {
            bh.q.e(this, bh.a1.g() + "games/" + gVar.b, q0.f4282v, gVar.f37869e, gVar.f());
            return;
        }
        if ("CUSTOM_WEBVIEW_TAG".equals(gVar.f37866a) || "YOUTUBE_TAG".equals(gVar.f37866a)) {
            try {
                jSONObject = new JSONObject(gVar.d());
            } catch (JSONException unused) {
                ok.q.k("rbx.main", "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                jSONObject = null;
            }
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Title.type);
                String strOptString2 = jSONObject.optString("url");
                if (strOptString2.isEmpty()) {
                    ok.q.k("rbx.main", "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                    return;
                }
                if ("YOUTUBE_TAG".equals(gVar.f37866a) && bh.a1.q0()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strOptString2));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                        return;
                    } else {
                        ok.q.k("rbx.main", "Unable to handle youtube links on Maquettes device.");
                        return;
                    }
                }
                if (!gVar.f37869e) {
                    bh.q.h(this, strOptString2, strOptString, false, true);
                    return;
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                    bh.q.g(this, strOptString2, strOptString, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
                    return;
                }
            }
            return;
        }
        if ("SOCIAL_MEDIA_TAG".equals(gVar.f37866a)) {
            new ym.a("rbx.main").h(this, gVar.d());
            return;
        }
        if ("MY_FEED_TAG".equals(gVar.f37866a)) {
            bh.q.e(this, bh.a1.g() + "feeds/inapp", q0.G, gVar.f37869e, gVar.f());
            return;
        }
        if ("SEARCH_GAMES_TAG".equals(gVar.f37866a)) {
            bh.q.e(this, bh.a1.H0(gVar.b), q0.J, gVar.f37869e, gVar.f());
            return;
        }
        if ("GAMES_SEE_ALL_TAG".equals(gVar.f37866a)) {
            bh.q.e(this, bh.a1.A(gVar.b), q0.D, gVar.f37869e, gVar.f());
            return;
        }
        if ("ABUSE_REPORT_TAG".equals(gVar.f37866a)) {
            bh.q.d(this, gVar.b, gVar.f());
            return;
        }
        if (!"ANIMATED_ASSET_DETAILS_TAG".equals(gVar.f37866a)) {
            if ("CAPTCHA_SUCCESS_TAG".equals(gVar.f37866a)) {
                ok.q.h("rbx.main", "NavigateToFeature: Received 'CAPTCHA_SUCCESS' tag. Do nothing for now.");
                return;
            }
            if ("CAPTCHA_TAG".equals(gVar.f37866a)) {
                c3(gVar.d());
                return;
            } else if ("SCAN_QR_CODE".equals(gVar.f37866a)) {
                zj.f.f(this, this.Z);
                return;
            } else {
                Y2(zh.b.a(this, gVar.f37866a), gVar.b);
                return;
            }
        }
        if (gVar.b != null) {
            str = bh.a1.g() + "catalog/" + gVar.b;
        } else {
            str = bh.a1.g() + "games/";
        }
        bh.q.i(this, str, getString(q0.M), gVar.f37869e, true, false);
    }

    @mw.j
    public void onNavigateToLuaEvent(com.roblox.client.c.h hVar) {
        e();
    }

    @Override // com.roblox.client.b, e.p, android.app.Activity
    public void onNewIntent(Intent intent) {
        Bundle extras;
        super.onNewIntent(intent);
        if (bi.h.a().y2()) {
            setIntent(intent);
            if (!intent.hasExtra("EXTRA_NOTIFICATION_LINK_ON_INTERACTION") || (extras = intent.getExtras()) == null) {
                return;
            }
            ok.q.h("rbx.main", "onNewIntent: received notification intent.");
            r.k().G(extras);
        }
    }

    @Override // com.roblox.client.a, com.roblox.client.b, f4.v, android.app.Activity
    public void onPause() {
        super.onPause();
        ok.q.h("rbx.main", "onPause");
        sm.a.k().m();
        xm.a.j().b(xm.a.EnumC0756a.MAIN);
        if (l3()) {
            D2();
        }
        if (!bi.h.a().n4()) {
            ok.q.h("rbx.main", "onPause: NotificationManager removerObserver");
            dj.e.c().g(this);
        }
        mm.c.i().k(this);
        bh.t0.k("onAppBackground");
    }

    @Override // f4.v, e.p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        y.h().k().E(i10, strArr, iArr);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, f4.v, android.app.Activity
    public void onResume() {
        super.onResume();
        ok.q.h("rbx.main", "onResume: IsLoggedIn = " + dj.h.e().f());
        mm.c.i().j(this);
        yi.f fVarJ = yi.b.f().j();
        if (this.f8751a0 != fVarJ) {
            this.f8751a0 = fVarJ;
            ok.q.h("rbx.main", "onResume: Recreating activity due to Locale change.");
            recreate();
            return;
        }
        k0.s(this).N(this);
        if (!y.h().f().i()) {
            q3();
        } else if (this.f8756f0.f13787a == u0.EXPERIENCE && r.k().u()) {
            y.h().f().g(false);
        }
        if (this.f8758h0) {
            ei.f.j().B(true);
            this.f8758h0 = false;
        }
        if (bh.a1.l0()) {
            z2(getResources().getConfiguration());
        }
        y.h().k().S(this);
        y.h().k().R();
        sm.a.k().l(this, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 20124, new sm.a.g() { // from class: bh.i
            @Override // sm.a.g
            public final void a(String str, String str2) {
                this.f4075a.b3(str, str2);
            }
        });
        if (!bi.h.a().f2()) {
            ok.q.h("rbx.main", "Setting result launcher for IdentityProtocol");
            y.h().g().y(this.f8757g0);
        }
        if (t.e()) {
            y.h().e().x(this);
        }
    }

    @Override // com.roblox.client.b, e.p, k2.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BACK_FROM_GAME", this.W);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onStart() {
        super.onStart();
        xm.a.j().g();
        this.f8754d0.b();
        e2.f4064a = getResources().getDisplayMetrics();
        if (com.roblox.client.a.R == 1 && this.f8756f0.f13787a == u0.APP) {
            NativeReportingInterface.applicationForegrounded();
        }
        if (bi.h.a().F5()) {
            ok.q.h("rbx.main", "onStart: App is going to foreground. setAppSuspended(false)");
            NativeReportingInterface.setAppSuspended(false);
        }
        mw.c.d().n(this);
        dl.h.j().k(ei.f.j());
        bh.t0.v("main");
        vm.b.h().e();
        if (this.f8756f0.f13787a == u0.EXPERIENCE) {
            y.h().f().p();
        }
        cn.a.c().a();
    }

    @Override // com.roblox.client.a, com.roblox.client.b, j.b, f4.v, android.app.Activity
    public void onStop() {
        mw.c.d().p(this);
        this.f8754d0.a();
        if (com.roblox.client.a.R == 1 && this.f8756f0.f13787a == u0.APP) {
            NativeReportingInterface.applicationBackgrounded();
        }
        if (bi.h.a().F5() && this.f8756f0.f13787a == u0.APP) {
            ok.q.h("rbx.main", "onStop: App is going to background. setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        dl.h.j().m(ei.f.j());
        vm.b.h().f();
        if (this.f8756f0.f13787a == u0.EXPERIENCE) {
            y.h().f().n();
        }
        cn.a.c().b();
        if (bi.h.a().n4()) {
            ok.q.h("rbx.main", "onStop: NotificationManager removerObserver");
            dj.e.c().g(this);
        }
        super.onStop();
        ok.q.h("rbx.main", "onStop");
    }

    @Override // com.roblox.client.b, e.p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (bi.h.a().V2()) {
            eh.v0.s(i10);
        }
        this.f8756f0.j(i10);
    }

    public final void p3(String str) {
        Intent intent = new Intent(this, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        startActivity(intent);
        overridePendingTransition(g0.b, g0.f4071c);
    }

    public final void q3() {
        ok.q.h("rbx.main", "startup:");
        if (k0.s(this).v() || dj.h.e().f() || com.roblox.client.startup.a.m() || !t.f()) {
            k0.s(this).Q();
            return;
        }
        ok.q.e("rbx.main", "Incomplete initialization, restarting app");
        startActivity(ActivitySplash.o2(this, StartedForEnum.SHELL_PROCESS_RESTART));
        finish();
    }

    @Override // zh.e
    public f4.q r(String str) {
        return l1().n0(str);
    }

    public void r3(u0 u0Var) {
        this.f8756f0.k(u0Var);
    }

    @Override // zh.e
    public void v(int i10, f4.q qVar, String str) {
        if (qVar != null) {
            f4.t0 t0VarR = l1().r();
            if (qVar.p0()) {
                t0VarR.t(qVar);
            } else {
                t0VarR.b(i10, qVar, str);
            }
            t0VarR.h();
        }
    }

    public final void z2(Configuration configuration) {
        t0 t0Var = this.f8756f0;
        if (t0Var == null || t0Var.f13787a != u0.EXPERIENCE) {
            c2.a(getWindow(), configuration);
        }
    }
}
