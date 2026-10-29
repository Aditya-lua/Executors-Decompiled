package com.roblox.client;

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
import androidx.fragment.app.AbstractC0934h;
import androidx.fragment.app.ComponentCallbacksC0929c;
import androidx.fragment.app.FragmentManager;
import androidx.p616lifecycle.AbstractC0966l;
import cm.C1678a;
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
import com.roblox.client.startup.C3272a;
import com.roblox.client.startup.C3274c;
import com.roblox.client.startup.C3275d;
import com.roblox.client.startup.StartedForEnum;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.mediapicker.MediaPickerProtocolV2;
import com.roblox.protocols.webview.C3340a;
import com.roblox.protocols.webview.WebViewProtocol;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import dk.C4639h;
import fj.C5613a0;
import fj.C5636m;
import fk.C5654c;
import hm.C6426b;
import il.C6817b;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import jm.C7209a;
import km.C7630a;
import mk.C8574h;
import nl.C9492a;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p015ak.C0305k0;
import p015ak.C0319n2;
import p015ak.InterfaceC0317n0;
import p078dh.C4608b;
import p093e4.ActivityC4831q;
import p104ei.C5132j;
import p104ei.InterfaceC5135m;
import p108em.C5163a;
import p131fl.C5660d;
import p131fl.C5663g;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p139g.AbstractC5854c;
import p139g.InterfaceC5852a;
import p151gk.C6107c;
import p151gk.C6113f;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6129v;
import p151gk.C6130w;
import p151gk.C6131x;
import p154h.C6257j;
import p198ij.C6813a;
import p198ij.C6814b;
import p222jj.C7193r;
import p293mi.C8527c;
import p293mi.C8528d;
import p335ok.C9755a;
import p337ol.EnumC9799a;
import p359pi.C10264b;
import p359pi.C10265c;
import p359pi.C10275m;
import p383qi.C10583b;
import p383qi.C10587f;
import p412rh.C10880a;
import p412rh.C10881b;
import p412rh.InterfaceC10883d;
import p414rj.C10890f;
import p491vh.C12208l;
import p516wg.C12419a;
import p516wg.C12420b;
import p516wg.C12421c;
import p517wh.C12433f;
import p517wh.C12439i;
import p517wh.C12442j0;
import p517wh.C12453p;
import p517wh.C12464u0;
import p517wh.C12474z0;
import p517wh.EnumC12462t0;
import p517wh.InterfaceC12455q;
import p517wh.SurfaceHolderCallbackC12423a;
import p517wh.SurfaceHolderCallbackC12460s0;
import p519wj.C12478c;
import p520wk.C12486h;
import p546xg.C12830a;
import p580yl.C13203c;
import p606zj.C13818a;
import p606zj.InterfaceC13820c;
import ph.C10254c;
import ph.C10257f;
import ph.C10258g;
import ph.C10261j;
import pm.C10293a;
import sg.C11295a1;
import sg.C11297b;
import sg.C11304c2;
import sg.C11312e2;
import sg.C11317g0;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11346q;
import sg.C11347q0;
import sg.C11356t0;
import sg.C11370y;
import sg.C11371y0;
import sg.C11372y1;
import sh.C11382g;
import sh.ExpBackOffRetryPolicy;
import tg.C11642a;
import th.C11659h;
import tj.C11662a;
import vg.C12173c0;
import vg.C12183m;
import vi.C12211b;
import vi.C12214e;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
public class ActivityNativeMain extends AbstractActivityC3152a implements C12214e.e, InterfaceC10883d, InterfaceC0317n0, C12421c.d, SurfaceHolderCallbackC12423a.g, C3274c.b, NativeGLJavaInterface.OnAppShellReloadNeededListener, NativeGLJavaInterface.WebViewUserAgentGetter, NativeGLJavaInterface.MobileAdvertisingIdGetter, InterfaceC13820c, SurfaceHolderCallbackC12423a.f, ExperienceSession.InterfaceC3193d, C3340a.f, InterfaceC12455q {

    /* JADX INFO: renamed from: q0 */
    public static boolean f11387q0 = true;

    /* JADX INFO: renamed from: S */
    public boolean f11388S;

    /* JADX INFO: renamed from: T */
    public C10880a f11389T;

    /* JADX INFO: renamed from: U */
    public View f11390U;

    /* JADX INFO: renamed from: V */
    public View f11391V;

    /* JADX INFO: renamed from: W */
    public boolean f11392W;

    /* JADX INFO: renamed from: X */
    public long f11393X;

    /* JADX INFO: renamed from: Y */
    public String f11394Y;

    /* JADX INFO: renamed from: Z */
    public int f11395Z;

    /* JADX INFO: renamed from: a0 */
    public C10587f f11396a0;

    /* JADX INFO: renamed from: c0 */
    public WebViewProtocol f11398c0;

    /* JADX INFO: renamed from: d0 */
    public AppHangMonitor f11399d0;

    /* JADX INFO: renamed from: e0 */
    public ScheduledThreadPoolExecutor f11400e0;

    /* JADX INFO: renamed from: f0 */
    public SurfaceHolderCallbackC12460s0 f11401f0;

    /* JADX INFO: renamed from: g0 */
    public AbstractC5854c<IntentSenderRequest> f11402g0;

    /* JADX INFO: renamed from: i0 */
    public C4639h f11404i0;

    /* JADX INFO: renamed from: j0 */
    public C12439i f11405j0;

    /* JADX INFO: renamed from: k0 */
    public C12474z0 f11406k0;

    /* JADX INFO: renamed from: l0 */
    public ImageView f11407l0;

    /* JADX INFO: renamed from: o0 */
    public C11642a f11410o0;

    /* JADX INFO: renamed from: b0 */
    public C12421c f11397b0 = null;

    /* JADX INFO: renamed from: h0 */
    public boolean f11403h0 = false;

    /* JADX INFO: renamed from: m0 */
    public final Runnable f11408m0 = new Runnable() { // from class: sg.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f39709a.m14748J2();
        }
    };

    /* JADX INFO: renamed from: n0 */
    public final Runnable f11409n0 = new Runnable() { // from class: sg.k
        @Override // java.lang.Runnable
        public final void run() {
            this.f39729a.m14749K2();
        }
    };

    /* JADX INFO: renamed from: p0 */
    public final InterfaceC5135m f11411p0 = new C3139g();

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$a */
    public class C3133a implements C3161c.i {
        public C3133a() {
        }

        @Override // com.roblox.client.C3161c.i
        /* JADX INFO: renamed from: a */
        public void mo1374a(String str) {
            if (ActivityNativeMain.this.f11398c0 != null) {
                ActivityNativeMain.this.f11398c0.m15914u(str);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$b */
    public class RunnableC3134b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ActivityNativeMain f11413a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public RunnableC3134b(ActivityNativeMain activityNativeMain) {
            this.f11413a = activityNativeMain;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (ActivityNativeMain.this.isFinishing()) {
                return;
            }
            C12211b.m45203q();
            new AsyncTaskC3144l(this.f11413a).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$c */
    public class RunnableC3135c implements Runnable {
        public RunnableC3135c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6124q.m27057b("rbx.main", "[GrantPendingPurchase] Executor::run: ");
            ActivityNativeMain.this.m14737A2(false);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$d */
    public class ViewTreeObserverOnGlobalFocusChangeListenerC3136d implements ViewTreeObserver.OnGlobalFocusChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f11416a;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public ViewTreeObserverOnGlobalFocusChangeListenerC3136d(ViewGroup viewGroup) {
            this.f11416a = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
        public void onGlobalFocusChanged(View view, View view2) {
            SurfaceView surfaceView;
            if (C8574h.f31489a.m34582b() && view2 == null && (surfaceView = (SurfaceView) this.f11416a.findViewById(C11335m0.f39810h0)) != null) {
                surfaceView.requestFocus();
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$e */
    public class SurfaceHolderCallbackC3137e implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public Bitmap f11418a = null;

        /* JADX INFO: renamed from: b */
        public boolean f11419b = false;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewGroup f11420c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SurfaceView f11421d;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public SurfaceHolderCallbackC3137e(ViewGroup viewGroup, SurfaceView surfaceView) {
            this.f11420c = viewGroup;
            this.f11421d = surfaceView;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m14795b(int i10) {
            this.f11419b = i10 == 0;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f11407l0 == null || this.f11418a == null || !this.f11419b) {
                return;
            }
            ActivityNativeMain.this.f11407l0.setVisibility(0);
            ActivityNativeMain.this.f11407l0.setImageBitmap(this.f11418a);
            ActivityNativeMain.this.m14778i3(3000L);
            this.f11418a = null;
            this.f11419b = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            if (ActivityNativeMain.this.f11407l0 != null) {
                long width = ((long) (this.f11420c.getWidth() * this.f11420c.getHeight())) * 4;
                long jFreeMemory = Runtime.getRuntime().freeMemory();
                if (jFreeMemory < width) {
                    C6124q.m27063h("rbx.main", "surfaceDestroyed: Not enough memory for screenshot. Available: " + jFreeMemory + ", Required: " + width);
                    return;
                }
                try {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f11420c.getWidth(), this.f11420c.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f11418a = bitmapCreateBitmap;
                    PixelCopy.request(this.f11421d, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: sg.p
                        @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                        public final void onPixelCopyFinished(int i10) {
                            this.f39892a.m14795b(i10);
                        }
                    }, new Handler(Looper.getMainLooper()));
                } catch (OutOfMemoryError e10) {
                    C6124q.m27061f("rbx.main", "surfaceDestroyed: Out of memory while creating screenshot.", e10);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$f */
    public class ViewOnTouchListenerC3138f implements View.OnTouchListener {
        public ViewOnTouchListenerC3138f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$g */
    public class C3139g implements InterfaceC5135m {
        public C3139g() {
        }

        @Override // p104ei.InterfaceC5135m
        /* JADX INFO: renamed from: a */
        public void mo14796a(C5132j c5132j) {
            if (c5132j.m23933b() == 401) {
                C6124q.m27066k("rbx.main", "sessionCheckHandler: Got 401 error code from the server. Logout now...");
                C12211b.m45200f().m45207i(ActivityNativeMain.this, C12211b.d.LOGOUT_BY_401_ERROR_IN_NATIVE);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$h */
    public class C3140h extends C3179d.c {
        public C3140h() {
        }

        @Override // com.roblox.client.C3179d.d
        /* JADX INFO: renamed from: a */
        public void mo14797a(C3179d.e eVar) {
            if (eVar.m15095b()) {
                ActivityNativeMain.this.m14860f2(false);
                return;
            }
            if (eVar.m15096c()) {
                ActivityNativeMain.this.m14860f2(true);
            } else if (C6127t.m27094j() && eVar.m15094a()) {
                C12211b.m45200f().m45207i(ActivityNativeMain.this, C12211b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.C3179d.c, com.roblox.client.C3179d.d
        /* JADX INFO: renamed from: b */
        public void mo14798b(C3179d.e eVar) {
            if (C11295a1.m42471q0() && eVar.m15096c()) {
                ActivityNativeMain.this.m14860f2(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$i */
    public class RunnableC3141i implements Runnable {
        public RunnableC3141i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain activityNativeMain = ActivityNativeMain.this;
            C11312e2.m42505i(activityNativeMain, activityNativeMain.f11390U);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$j */
    public class RunnableC3142j implements Runnable {
        public RunnableC3142j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActivityNativeMain.this.f11391V.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$k */
    public class C3143k extends C3179d.c {
        public C3143k() {
        }

        @Override // com.roblox.client.C3179d.d
        /* JADX INFO: renamed from: a */
        public void mo14797a(C3179d.e eVar) {
            if (eVar.m15095b()) {
                ActivityNativeMain.this.m14860f2(false);
            } else if (eVar.m15096c()) {
                ActivityNativeMain.this.m14860f2(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.ActivityNativeMain$l */
    public static class AsyncTaskC3144l extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: a */
        public WeakReference<ActivityNativeMain> f11429a;

        public AsyncTaskC3144l(ActivityNativeMain activityNativeMain) {
            C6124q.m27063h("rbx.main", "Reloading lua app.");
            this.f11429a = new WeakReference<>(activityNativeMain);
        }

        /* JADX DEBUG: Method merged with bridge method: doInBackground([Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voidArr) {
            SurfaceHolderCallbackC12423a surfaceHolderCallbackC12423aM41428d;
            Surface surfaceM46525I2;
            ActivityNativeMain activityNativeMain = this.f11429a.get();
            if (activityNativeMain == null || (surfaceHolderCallbackC12423aM41428d = activityNativeMain.m14743F2().m41428d()) == null || (surfaceM46525I2 = surfaceHolderCallbackC12423aM41428d.m46525I2()) == null) {
                return Boolean.FALSE;
            }
            C12211b.m45199e();
            if (C11295a1.m42389D0()) {
                C12433f.m46540j().m46568y(activityNativeMain, surfaceM46525I2, activityNativeMain);
            } else {
                C12433f.m46540j().m46567x(activityNativeMain, surfaceM46525I2);
            }
            return Boolean.TRUE;
        }

        /* JADX DEBUG: Method merged with bridge method: onPostExecute(Ljava/lang/Object;)V */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean bool) {
            ActivityNativeMain activityNativeMain;
            if (bool.booleanValue() || (activityNativeMain = this.f11429a.get()) == null || activityNativeMain.f11391V == null) {
                return;
            }
            activityNativeMain.f11391V.setVisibility(8);
        }

        @Override // android.os.AsyncTask
        public void onPreExecute() {
            ActivityNativeMain activityNativeMain = this.f11429a.get();
            if (activityNativeMain == null || activityNativeMain.f11391V == null) {
                return;
            }
            activityNativeMain.f11391V.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: E2 */
    private void m14715E2() {
        C3274c.m15742v2(this);
    }

    /* JADX INFO: renamed from: Y2 */
    private void m14716Y2(String str, String str2) {
        C11346q.m42513f(this, C6113f.m27028c(str2), str);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d3 */
    private void m14717d3() {
        C6124q.m27063h("rbx.main", "processPushNotification.");
        Bundle bundleM30080i = C7193r.m30069k().m30080i();
        if (bundleM30080i == null || C7193r.m30069k().m30089t(bundleM30080i)) {
            return;
        }
        try {
            String string = bundleM30080i.getString("EXTRA_NOTIFICATION_TYPE", "");
            switch (string.hashCode()) {
                case 624927928:
                    if (!string.equals("FriendRequestAccepted")) {
                        return;
                    }
                    break;
                case 929482719:
                    if (string.equals("ChatNewMessage")) {
                        long j10 = bundleM30080i.getLong("EXTRA_CONVERSATION_ID", -1L);
                        if (j10 != -1) {
                            m14764W2(j10);
                            return;
                        }
                        return;
                    }
                    return;
                case 1050705701:
                    if (string.equals("PrivateMessageReceived")) {
                        m14760S2(bundleM30080i);
                        return;
                    }
                    return;
                case 1715544492:
                    if (string.equals("DefaultNotification")) {
                        C11662a.m43778a().m43779b(bundleM30080i.getString("EXTRA_NOTIFICATION_LINK_ON_INTERACTION"));
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
            m14759R2(bundleM30080i);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g3 */
    public static void m14718g3(ActivityNativeMain activityNativeMain, boolean z10) {
        SurfaceHolderCallbackC12423a surfaceHolderCallbackC12423aM41428d = activityNativeMain.m14743F2().m41428d();
        if (surfaceHolderCallbackC12423aM41428d != null && z10) {
            activityNativeMain.m23360l1().m4452r().mo4513m(surfaceHolderCallbackC12423aM41428d).mo4509h();
        }
        C6124q.m27057b("rbx.appshell", "removeGlApp() clearing app shell");
        C12433f.m46540j().m46550f();
    }

    /* JADX INFO: renamed from: o3 */
    private void m14726o3(int i10) {
        LoggingProtocol.m15994g("retry_during_main");
        C3274c.m15744y2(this, i10);
    }

    /* JADX INFO: renamed from: A2 */
    public final void m14737A2(boolean z10) {
        if (C11659h.m43403a().mo43582Z4()) {
            IAPPurchaseManager.m15356D(this, z10);
            return;
        }
        if (!C6127t.m27091g()) {
            if (C6127t.m27093i()) {
                C5654c c5654cM25669c = C5654c.m25669c();
                String strM25679k = c5654cM25669c.m25679k();
                long jM25678j = c5654cM25669c.m25678j();
                if (TextUtils.isEmpty(strM25679k)) {
                    return;
                }
                if (C11659h.m43403a().mo43466I5()) {
                    C6814b.m29184a(this);
                    throw null;
                }
                if (jM25678j > 0) {
                    C6813a.m29183a(this);
                    throw null;
                }
                C6813a.m29183a(this);
                throw null;
            }
            return;
        }
        String strM25679k2 = C5654c.m25669c().m25679k();
        long jM25678j2 = C5654c.m25669c().m25678j();
        if (TextUtils.isEmpty(strM25679k2)) {
            return;
        }
        if (C11659h.m43403a().mo43455H1()) {
            if (jM25678j2 > 0) {
                C5613a0.m25370R(this).m25389K(jM25678j2, z10);
                return;
            } else {
                C5613a0.m25370R(this).m25390L(z10);
                return;
            }
        }
        if (C11659h.m43403a().mo43677m3() && C11659h.m43403a().mo43708r()) {
            C5636m.m25494F0(this).m25608m1(jM25678j2, strM25679k2, z10);
        } else if (jM25678j2 > 0) {
            C5636m.m25494F0(this).m25553A0(jM25678j2, strM25679k2, z10);
        } else {
            C5636m.m25494F0(this).m25555B0(strM25679k2, z10);
        }
    }

    /* JADX INFO: renamed from: B2 */
    public final void m14738B2() {
        this.f11390U.post(new RunnableC3141i());
    }

    /* JADX INFO: renamed from: C2 */
    public final void m14739C2() {
        int i10;
        View rootView = this.f11390U.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView;
        rootView.getViewTreeObserver().addOnGlobalFocusChangeListener(new ViewTreeObserverOnGlobalFocusChangeListenerC3136d(viewGroup));
        int i11 = C11335m0.f39774F;
        this.f11395Z = i11;
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(i11);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        if (C11659h.m43403a().mo43468J0()) {
            i10 = C11338n0.f39864k;
        } else {
            i10 = C11659h.m43403a().mo43416B4() ? C11338n0.f39865l : C11338n0.f39863j;
        }
        if (C11659h.m43403a().mo43669l2()) {
            LoggingProtocol.m15994g("fragment_shared_inflate_begin");
        }
        getLayoutInflater().inflate(i10, (ViewGroup) frameLayout, true);
        if (C11659h.m43403a().mo43669l2()) {
            LoggingProtocol.m15994g("fragment_shared_inflate_end");
        }
        int i12 = C11335m0.f39810h0;
        this.f11401f0 = new SurfaceHolderCallbackC12460s0(this, (SurfaceView) frameLayout.findViewById(i12));
        mo4656a().mo4935a(this.f11401f0);
        C8574h.f31489a.m34583c(getResources().getConfiguration());
        C6124q.m27063h("rbx.main", "createGlAppsFrame() apps frame created");
        viewGroup.addView(frameLayout, 0);
        if (m14783l3()) {
            SurfaceView surfaceView = (SurfaceView) viewGroup.findViewById(i12);
            surfaceView.getHolder().addCallback(new SurfaceHolderCallbackC3137e(viewGroup, surfaceView));
        }
    }

    /* JADX INFO: renamed from: D2 */
    public final void m14740D2() {
        if (this.f11407l0 != null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f11390U.getRootView();
        this.f11407l0 = new ImageView(this);
        new FrameLayout.LayoutParams(-1, -1);
        this.f11407l0.setVisibility(8);
        this.f11407l0.setOnTouchListener(new ViewOnTouchListenerC3138f());
        viewGroup.addView(this.f11407l0);
        NativeGLInterface.nativeScheduleOnFirstFrame(this.f11409n0);
    }

    @Override // p517wh.InterfaceC12455q
    /* JADX INFO: renamed from: E */
    public void mo14741E() {
        mo14960E1();
    }

    @Override // p412rh.InterfaceC10883d
    /* JADX INFO: renamed from: F */
    public void mo14742F(int i10, ComponentCallbacksC0929c componentCallbacksC0929c, String str) {
        if (componentCallbacksC0929c != null) {
            AbstractC0934h abstractC0934hM4452r = m23360l1().m4452r();
            if (componentCallbacksC0929c.m4694p0()) {
                abstractC0934hM4452r.mo4514t(componentCallbacksC0929c);
            } else {
                abstractC0934hM4452r.m4775b(i10, componentCallbacksC0929c, str);
            }
            abstractC0934hM4452r.mo4509h();
        }
    }

    /* JADX INFO: renamed from: F2 */
    public final C10880a m14743F2() {
        if (this.f11389T == null) {
            this.f11389T = new C10880a(this, this.f11395Z);
        }
        return this.f11389T;
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: G */
    public void mo1307G() {
        C6124q.m27063h("rbx.main", "updateViewAppSettingsLoaded:");
        m14781k3();
    }

    /* JADX INFO: renamed from: G2 */
    public final C10258g m14744G2() {
        C10258g c10258gM39409b = C10258g.m39409b("CUSTOM_WEBVIEW_TAG");
        c10258gM39409b.m39414g(C11295a1.m42414Q(this));
        c10258gM39409b.m39417j(true);
        return c10258gM39409b;
    }

    /* JADX INFO: renamed from: H2 */
    public final void m14745H2() {
        C6124q.m27063h("rbx.main", "internalOnResume:");
        m14737A2(true);
        C3179d.m15085e().m15086b(new C3140h());
        if ((C6127t.m27094j() || C12217h.m45288e().m45297i()) && C11312e2.m42506j(this)) {
            C12217h.m45288e().m45294d(this.f11411p0);
        }
        C6124q.m27063h("rbx.main", "internalOnResume: NotificationManager addObserver");
        C12214e.m45220c().m45221b(this);
        if (C7193r.m30069k().m30090u() && C11312e2.m42506j(this)) {
            if (this.f11392W) {
                this.f11392W = false;
            }
            m14717d3();
        }
        if (this.f11392W) {
            C6124q.m27063h("rbx.main", "Back from game. Resuming Lua App.");
            m14768a3();
        }
        C10880a c10880aM14743F2 = m14743F2();
        m23360l1().m4432j0();
        if (c10880aM14743F2.m41428d() == null) {
            c10880aM14743F2.m41431g(new FeatureState("CUSTOM_LUAVIEW_TAG"));
        }
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: I */
    public void mo14746I() {
        mo14960E1();
    }

    /* JADX INFO: renamed from: I2 */
    public final /* synthetic */ void m14747I2(JSONObject jSONObject) {
        C11346q.m42509b(jSONObject, this);
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: J */
    public void mo1308J() {
        C6124q.m27063h("rbx.main", "showRetryUI:");
        if (C11295a1.m42471q0()) {
            C6131x.m27102a(this, C11347q0.f39937S);
            finish();
        } else if (m14965J1()) {
            m14726o3(C11347q0.f39937S);
        }
    }

    /* JADX INFO: renamed from: J2 */
    public final /* synthetic */ void m14748J2() {
        ImageView imageView = this.f11407l0;
        if (imageView != null) {
            imageView.setVisibility(8);
            this.f11407l0.setImageBitmap(null);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final /* synthetic */ void m14749K2() {
        m14778i3(500L);
    }

    /* JADX INFO: renamed from: L2 */
    public final /* synthetic */ void m14750L2() {
        this.f11391V.setVisibility(8);
    }

    /* JADX INFO: renamed from: M2 */
    public final /* synthetic */ void m14751M2(final String str) {
        runOnUiThread(new Runnable() { // from class: sg.e
            @Override // java.lang.Runnable
            public final void run() {
                C5654c.m25669c().m25689u(EnumC9799a.m38604b(str));
            }
        });
    }

    @Override // com.roblox.client.startup.C3274c.b
    /* JADX INFO: renamed from: N */
    public void mo14752N() {
        m14715E2();
        m14790q3();
    }

    /* JADX INFO: renamed from: N2 */
    public final /* synthetic */ void m14753N2(boolean z10) {
        C10265c.f36879a.m39430j(z10);
        C10264b.f36878a.m39421b(this, z10);
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: O */
    public void mo1309O() {
        C6124q.m27063h("rbx.main", "navigateToLandingScreen:");
        Intent intentM42595o = C11370y.m42581h().m42595o(this);
        intentM42595o.putExtra("send_app_input_focus_to_lua", true);
        startActivity(intentM42595o);
        finish();
    }

    /* JADX INFO: renamed from: O2 */
    public final /* synthetic */ void m14754O2() {
        this.f11392W = true;
        mo1311k0();
    }

    @Override // com.roblox.client.AbstractActivityC3152a
    /* JADX INFO: renamed from: P1 */
    public boolean mo14755P1() {
        return true;
    }

    /* JADX INFO: renamed from: P2 */
    public final /* synthetic */ void m14756P2(ActivityResult activityResult) {
        C11370y.m42581h().m42588g().m29216r(this, activityResult.getData());
    }

    @Override // com.roblox.client.AbstractActivityC3152a
    /* JADX INFO: renamed from: Q1 */
    public C8527c mo14757Q1() {
        return new C8528d();
    }

    /* JADX INFO: renamed from: Q2 */
    public final void m14758Q2(FeatureState featureState) {
        C6124q.m27063h("rbx.appshell", "loadDataModel()");
        C12433f.m46540j().m46546F(this);
        C12433f.m46540j().m46554k(C12453p.m46677a(this));
        if (NativeGLInterface.isColdStartDeeplinkToGame() && C12217h.m45289h()) {
            C1678a.m8388a().m8389b(new C1678a.b() { // from class: sg.h
                @Override // cm.C1678a.b
                /* JADX INFO: renamed from: a */
                public final void mo1255a(JSONObject jSONObject) {
                    this.f39703a.m14747I2(jSONObject);
                }
            });
            C0305k0.m1258G(this, C12217h.m45290l().toString());
        }
        if (C11370y.m42581h().m42587f().m15275i()) {
            return;
        }
        m14785m3(featureState);
        NativeGLInterface.nativeAppBridgeStartLuaAppDM();
    }

    /* JADX INFO: renamed from: R2 */
    public final void m14759R2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_NOTIFICATION_USER_ID", -1L);
        String string = bundle.getString("EXTRA_NOTIFICATION_TYPE");
        boolean z10 = bundle.getBoolean("EXTRA_STACKED_NOTIFICATION", false);
        String strM42438b0 = null;
        if (string == null) {
            finish();
        } else if (z10) {
            if (string.equals("FriendRequestAccepted")) {
                strM42438b0 = C11295a1.m42438b0(C12217h.m45288e().m45296g());
            } else if (string.equals("FriendRequestReceived")) {
                strM42438b0 = C11295a1.m42435a0(C12217h.m45288e().m45296g());
            }
        } else if (string.equals("FriendRequestAccepted")) {
            strM42438b0 = j10 == -1 ? C11295a1.m42438b0(C12217h.m45288e().m45296g()) : C11295a1.m42441c0(j10);
        } else if (string.equals("FriendRequestReceived")) {
            strM42438b0 = j10 == -1 ? C11295a1.m42435a0(C12217h.m45288e().m45296g()) : C11295a1.m42441c0(j10);
        }
        m14789p3(strM42438b0);
    }

    @Override // vi.C12214e.e
    /* JADX INFO: renamed from: S */
    public void mo1335S(int i10, Bundle bundle) {
        if (i10 != 2) {
            if (i10 != 101) {
                return;
            }
            C11346q.m42517j(C12442j0.m46630c(bundle.getBundle("game_init_params")), this);
        } else {
            C6124q.m27063h("rbx.main", "ANM.handleNotification() Logout event...");
            NativeGLInterface.nativeAppBridgeV2UserDidLogout();
            if (C12478c.m46740a()) {
                new AsyncTaskC3144l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            } else {
                m14852X1(C12211b.m45201g(bundle));
            }
        }
    }

    /* JADX INFO: renamed from: S2 */
    public final void m14760S2(Bundle bundle) {
        long j10 = bundle.getLong("EXTRA_CONVERSATION_ID", -1L);
        m14789p3(j10 == -1 ? C11295a1.m42483w0() : C11295a1.m42383A0(j10));
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
    /* JADX INFO: renamed from: T */
    public void mo1338T() {
        if (isFinishing()) {
            return;
        }
        NativeGLInterface.setMobileAdvertisingId(C6107c.m27009d());
    }

    /* JADX INFO: renamed from: T2 */
    public final boolean m14761T2() {
        Intent intent = getIntent();
        if (intent != null) {
            return intent.getBooleanExtra("loginAfterSignup", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: U2 */
    public final void m14762U2(Intent intent) {
        String stringExtra;
        if (intent == null || (stringExtra = intent.getStringExtra("FEATURE_EXTRA")) == null) {
            return;
        }
        if ("CHAT_TAG".equals(stringExtra)) {
            long longExtra = intent.getLongExtra("USER_ID_EXTRA", -1L);
            if (longExtra != -1) {
                m14766Z2(longExtra);
                return;
            } else {
                m14764W2(intent.getLongExtra("CONVERSATION_ID_EXTRA", -1L));
                return;
            }
        }
        if ("PROFILE_TAG".equals(stringExtra)) {
            C11346q.m42516i(this, intent.getStringExtra("PATH_EXTRA"), getString(C11347q0.f39917I), false, false, true);
        } else if ("SETTINGS_TAG".equals(stringExtra)) {
            C11346q.m42513f(this, intent.getStringExtra("PATH_EXTRA"), getString(C11347q0.f39923L));
        } else {
            C11346q.m42513f(this, intent.getStringExtra("PATH_EXTRA"), C10881b.m41435a(this, stringExtra));
        }
    }

    /* JADX INFO: renamed from: V2 */
    public final String m14763V2() {
        return "OVERLAY_" + m23360l1().m4462u0();
    }

    /* JADX INFO: renamed from: W2 */
    public final void m14764W2(long j10) {
        C6124q.m27057b("rbx.main", "navigateToConversation() conversation:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.m15120g("CHAT_CONVERSATION_ID", j10);
        m14765X2(featureState);
    }

    /* JADX INFO: renamed from: X2 */
    public final void m14765X2(FeatureState featureState) {
        C6124q.m27064i("rbx.main", "navigateToFeature:" + featureState.getName() + " bundle:" + featureState.m15118a());
        m14785m3(featureState);
    }

    /* JADX INFO: renamed from: Z2 */
    public final void m14766Z2(long j10) {
        C6124q.m27057b("rbx.main", "navigateToUserConversation() user:" + j10);
        FeatureState featureState = new FeatureState("CHAT_TAG");
        featureState.m15120g("USER_ID_EXTRA", j10);
        m14765X2(featureState);
    }

    @Override // p517wh.SurfaceHolderCallbackC12423a.g
    /* JADX INFO: renamed from: a0 */
    public void mo14767a0() {
        C6124q.m27063h("rbx.main", "onAppStarted: ");
        if (m14965J1() && C12211b.m45199e()) {
            new AsyncTaskC3144l(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final void m14768a3() {
        m14787n3();
        this.f11392W = false;
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: b */
    public boolean mo14769b() {
        return this.f11401f0.mo14769b();
    }

    /* JADX INFO: renamed from: b3 */
    public void m14770b3(String str, String str2) {
        C13818a.m50301c(str, str2);
    }

    @Override // p517wh.SurfaceHolderCallbackC12423a.g
    /* JADX INFO: renamed from: c */
    public void mo14771c(String str) {
        C6124q.m27063h("rbx.main", "onAppReady: " + str);
        View view = this.f11391V;
        if (view != null && view.getVisibility() != 8) {
            this.f11391V.post(new RunnableC3142j());
        }
        if ("Landing".equals(str) || "Home".equals(str)) {
            C3179d.m15085e().m15086b(new C3143k());
        } else if ("Push".equals(str)) {
            C11370y.m42581h().m42591k().m38645b0(getApplicationContext());
        }
        if (C11659h.m43403a().mo43641h2()) {
            final Context applicationContext = getApplicationContext();
            AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: sg.f
                @Override // java.lang.Runnable
                public final void run() {
                    C0319n2.m1322b(applicationContext);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final void m14772c3(String str) {
        JSONObject jSONObject;
        CaptchaConfig signUpCaptchaConfig;
        LoginCaptchaConfig.EnumC3164c enumC3164c;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            C6124q.m27066k("rbx.main", "openFunCaptchaActivity: Exception parsing json data.");
            jSONObject = null;
        }
        if (jSONObject != null) {
            if (jSONObject.optString("captchaType").equals("login")) {
                String strOptString = jSONObject.optString("cvalueType");
                String strOptString2 = jSONObject.optString("cvalue");
                strOptString.getClass();
                switch (strOptString) {
                    case "phone_number":
                        enumC3164c = LoginCaptchaConfig.EnumC3164c.PHONE_NUMBER;
                        break;
                    case "username":
                        enumC3164c = LoginCaptchaConfig.EnumC3164c.USERNAME;
                        break;
                    case "email":
                        enumC3164c = LoginCaptchaConfig.EnumC3164c.EMAIL;
                        break;
                    default:
                        throw new RuntimeException("Unsupported credential Type: " + strOptString + ".");
                }
                signUpCaptchaConfig = new LoginCaptchaConfig(enumC3164c, strOptString2);
            } else {
                signUpCaptchaConfig = new SignUpCaptchaConfig();
            }
            C6124q.m27063h("rbx.main", "openFunCaptchaActivity: config = " + signUpCaptchaConfig);
            startActivityForResult(ActivityFunCaptcha.m15044i2(this, signUpCaptchaConfig), 20115);
        }
    }

    @Override // p516wg.C12421c.d, com.roblox.protocols.webview.C3340a.f
    /* JADX INFO: renamed from: d */
    public void mo1222d(C9492a c9492a) {
        if (m23360l1().m4462u0() > 0) {
            ComponentCallbacksC0929c componentCallbacksC0929cM4441m0 = m23360l1().m4441m0(C11335m0.f39813j);
            if (componentCallbacksC0929cM4441m0 instanceof C3161c) {
                ((C3161c) componentCallbacksC0929cM4441m0).mo15000H3(c9492a);
            }
        }
    }

    @Override // p516wg.C12421c.d, com.roblox.protocols.webview.C3340a.f
    /* JADX INFO: renamed from: e */
    public void mo1223e() {
        WebViewProtocol webViewProtocol;
        if (!C11659h.m43403a().mo43594b1()) {
            m14776h3();
        } else {
            if (!m14776h3() || (webViewProtocol = this.f11398c0) == null) {
                return;
            }
            webViewProtocol.m15915v();
        }
    }

    /* JADX INFO: renamed from: e3 */
    public void m14773e3() {
        new C3275d().m15748c(this, new C3275d.a() { // from class: sg.l
            @Override // com.roblox.client.startup.C3275d.a
            /* JADX INFO: renamed from: a */
            public final void mo1336a() {
                this.f39738a.finish();
            }
        });
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: f */
    public void mo14774f(boolean z10) {
        this.f11401f0.mo14774f(z10);
    }

    /* JADX INFO: renamed from: f3 */
    public void m14775f3() {
        C6124q.m27063h("rbx.main", "Registering activity result for IdentityProtocol.");
        this.f11402g0 = mo4671h(new C6257j(), new InterfaceC5852a() { // from class: sg.d
            @Override // p139g.InterfaceC5852a
            /* JADX INFO: renamed from: a */
            public final void mo4481a(Object obj) {
                this.f39678a.m14756P2((ActivityResult) obj);
            }
        });
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (C11659h.m43403a().mo43484L2() && C11295a1.m42471q0()) {
            Process.killProcess(Process.myPid());
        }
    }

    @Override // p516wg.C12421c.d, com.roblox.protocols.webview.C3340a.f
    /* JADX INFO: renamed from: g */
    public void mo1224g(C9492a c9492a) {
        m14738B2();
        Boolean bool = c9492a.f34111d;
        boolean z10 = false;
        boolean z11 = bool != null && bool.booleanValue();
        Boolean bool2 = c9492a.f34110c;
        boolean zBooleanValue = bool2 == null ? true : bool2.booleanValue();
        Boolean bool3 = c9492a.f34112e;
        boolean z12 = bool3 != null && bool3.booleanValue();
        Boolean bool4 = c9492a.f34113f;
        boolean z13 = bool4 != null && bool4.booleanValue();
        Boolean bool5 = c9492a.f34114g;
        if (bool5 != null && bool5.booleanValue()) {
            z10 = true;
        }
        boolean zMo43594b1 = C11659h.m43403a().mo43594b1();
        C3161c c11371y0 = z11 ? new C11371y0() : new C12208l();
        c11371y0.mo4656a().mo4935a(new C12420b());
        c11371y0.mo4656a().mo4935a(new C12419a());
        Bundle bundle = new Bundle();
        bundle.putString("DEFAULT_URL", c9492a.f34108a);
        bundle.putBoolean("USE_APP_HYBRID", true);
        bundle.putBoolean("VISIBLE", zBooleanValue);
        bundle.putBoolean("BACK_NAVIGATION_DISABLED", z12);
        bundle.putString("TITLE_STRING", c9492a.f34109b);
        bundle.putBoolean("HAS_PARENT", true);
        bundle.putBoolean("HIDE_ACCESSORY_BUTTONS", true);
        bundle.putBoolean("SHOW_DOMAIN_AS_TITLE", z13);
        if (zMo43594b1) {
            bundle.putBoolean("ENABLE_WEB_VIEW_SERVICE", true);
            bundle.putBoolean("hideNativeHeader", z10);
        }
        c11371y0.m4625O1(bundle);
        if (zMo43594b1) {
            c11371y0.m14994B3(new C3133a());
        }
        AbstractC0934h abstractC0934hM4452r = m23360l1().m4452r();
        abstractC0934hM4452r.m4775b(C11335m0.f39813j, c11371y0, m14763V2());
        abstractC0934hM4452r.m4779f(null);
        abstractC0934hM4452r.mo4509h();
    }

    /* JADX INFO: renamed from: h3 */
    public final boolean m14776h3() {
        int i10 = 0;
        if (m23360l1().m4404U0()) {
            return false;
        }
        if (!C11659h.m43403a().mo43594b1()) {
            if (m23360l1().m4462u0() <= 0) {
                return false;
            }
            m23360l1().m4416a1();
            return true;
        }
        int iM4462u0 = m23360l1().m4462u0();
        boolean z10 = false;
        while (i10 < iM4462u0) {
            m23360l1().m4416a1();
            i10++;
            z10 = true;
        }
        return z10;
    }

    @Override // com.roblox.client.startup.C3274c.b
    /* JADX INFO: renamed from: i */
    public void mo14777i() {
        m14715E2();
        m14790q3();
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: i0 */
    public void mo1310i0() {
    }

    /* JADX INFO: renamed from: i3 */
    public final void m14778i3(long j10) {
        this.f11407l0.removeCallbacks(this.f11408m0);
        this.f11407l0.postDelayed(this.f11408m0, j10);
    }

    /* JADX INFO: renamed from: j3 */
    public void m14779j3(boolean z10) {
        C9755a c9755a = new C9755a(z10);
        NativeGLInterface.nativeBroadcastEventWithNamespace(c9755a.f35514a, c9755a.f35515b, c9755a.f35516c);
    }

    @Override // p606zj.InterfaceC13820c
    /* JADX INFO: renamed from: k */
    public void mo14780k(String str) {
        if (TextUtils.isEmpty(str)) {
            C6124q.m27057b("rbx.main", "Share data is empty");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("url");
            String string2 = jSONObject.getString("context");
            if (TextUtils.isEmpty(string)) {
                return;
            }
            C13818a.m50301c(string2, string);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.TEXT", string);
            PendingIntent broadcast = PendingIntent.getBroadcast(this, 0, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 167772160);
            m14779j3(false);
            startActivityForResult(Intent.createChooser(intent, null, broadcast.getIntentSender()), 20124);
        } catch (JSONException unused) {
            C6124q.m27057b("rbx.main", "Error parsing share data.");
        }
    }

    @Override // p015ak.InterfaceC0317n0
    /* JADX INFO: renamed from: k0 */
    public void mo1311k0() {
        C6124q.m27063h("rbx.main", "navigateToMainScreen: IsLoggedIn = " + C12217h.m45288e().m45295f());
        m14781k3();
        if (!C11370y.m42581h().m42587f().m15275i() && m14965J1() && C12217h.m45288e().m45295f()) {
            m14745H2();
        }
    }

    /* JADX INFO: renamed from: k3 */
    public final void m14781k3() {
        C6124q.m27057b("rbx.main", "setupMainTabs: tabs-loaded = " + this.f11388S);
        if (this.f11388S) {
            return;
        }
        this.f11388S = true;
        m14758Q2((!m14761T2() || C6127t.m27094j()) ? new FeatureState("CUSTOM_LUAVIEW_TAG") : new FeatureState("GAMES_TAG"));
        if (this.f11397b0 == null) {
            C12421c c12421c = new C12421c(this, new Handler(Looper.getMainLooper()));
            this.f11397b0 = c12421c;
            c12421c.m46514c();
        }
        if (!C11659h.m43403a().mo43594b1() || C11295a1.m42471q0()) {
            return;
        }
        this.f11398c0 = new WebViewProtocol(this);
    }

    @Override // sg.InterfaceC11314f0
    /* JADX INFO: renamed from: l */
    public void mo14782l() {
        this.f11401f0.mo14782l();
    }

    /* JADX INFO: renamed from: l3 */
    public final boolean m14783l3() {
        return !C11295a1.m42471q0();
    }

    @Override // com.roblox.client.game.ExperienceSession.InterfaceC3193d
    /* JADX INFO: renamed from: m */
    public void mo14784m(Bundle bundle) {
        C6124q.m27063h("rbx.main", "Request to end the game. Performing app restoration.");
        if (C11659h.m43403a().mo43660k0()) {
            this.f11393X = bundle.getLong(PinShortcutHandler.EXTRA_PLACE_ID);
            this.f11394Y = bundle.getString("gameId");
        }
        C11370y.m42581h().m42587f().m15278l(null);
        m14792r3(EnumC12462t0.APP);
        FragmentManager fragmentManagerM23360l1 = m23360l1();
        if (!m14965J1() || fragmentManagerM23360l1.m4404U0()) {
            C6124q.m27063h("rbx.main", "Experience has been ended in the background.");
            this.f11403h0 = true;
        } else {
            C11295a1.m42422U(this).edit().putBoolean("ROBLOXCrash", true).apply();
            C12433f.m46540j().m46569z();
            C12433f.m46540j().m46542B(true);
            runOnUiThread(new Runnable() { // from class: sg.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39697a.m14754O2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m3 */
    public void m14785m3(FeatureState featureState) {
        C6124q.m27063h("rbx.main", "ANM.showFeature: " + featureState.getName());
        m14743F2().m41431g(featureState);
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.OnAppShellReloadNeededListener
    /* JADX INFO: renamed from: n */
    public void mo14786n() {
        if (isFinishing()) {
            return;
        }
        runOnUiThread(new RunnableC3134b(this));
    }

    @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
    /* JADX INFO: renamed from: n0 */
    public void mo1337n0() {
        if (C11659h.m43403a().mo43641h2()) {
            NativeGLInterface.setWebviewUserAgent(C0319n2.m1323c(this));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(this));
        }
    }

    /* JADX INFO: renamed from: n3 */
    public final void m14787n3() {
        if (C11659h.m43403a().mo43635g3() || C11659h.m43403a().mo43648i2() || C4608b.m22756b().m22758c() < C11659h.m43403a().mo43729u()) {
            return;
        }
        C12830a.m47749e().m47757i(this, this.f11393X, this.f11394Y);
    }

    @Override // com.roblox.client.game.ExperienceSession.InterfaceC3193d
    /* JADX INFO: renamed from: o0 */
    public ActivityC4831q mo14788o0() {
        return this;
    }

    @Override // com.roblox.client.AbstractActivityC3152a, p093e4.ActivityC4831q, p088e.ActivityC4722p, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        C6124q.m27057b("rbx.main", "onActivityResult: requestCode = " + i10 + " resultCode = " + i11 + " Intent data = " + intent);
        if (i10 != -1) {
            if (i10 == 20104) {
                this.f11392W = true;
                return;
            }
            if (i10 == 20110) {
                if (i11 == -1) {
                    m14762U2(intent);
                    return;
                }
                return;
            }
            if (i10 != 20115) {
                if (i10 != 20124) {
                    super.onActivityResult(i10, i11, intent);
                    return;
                }
                C13818a.m50299a();
                m14779j3(true);
                if (C11659h.m43403a().mo43588a3()) {
                    C5163a.m24018k().m24019e(intent);
                    return;
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onActivityResult from FunCaptcha: code:");
            sb2.append(i11);
            sb2.append(", result:");
            sb2.append(i11 == 101 ? "success" : "dismiss");
            C6124q.m27063h("rbx.main", sb2.toString());
            C12433f.m46540j().m46541A(new C9755a(true));
            m14785m3(new FeatureState("HOME_TAG"));
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onBackButtonNotConsumedEvent(C10254c c10254c) {
        m14773e3();
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onBackPressed() {
        if (m23360l1().m4462u0() <= 0) {
            if (m14743F2().m41430f()) {
                return;
            }
            m14773e3();
            return;
        }
        ComponentCallbacksC0929c componentCallbacksC0929cM4441m0 = m23360l1().m4441m0(C11335m0.f39813j);
        if (!(componentCallbacksC0929cM4441m0 instanceof C3161c)) {
            if (!(componentCallbacksC0929cM4441m0 instanceof C11372y1)) {
                if (C10890f.m41451d(this)) {
                    C6124q.m27063h("rbx.main", "onBackPressed: BACK button is handled for QrCodeScanner.");
                    return;
                } else {
                    m23360l1().m4416a1();
                    return;
                }
            }
            C11372y1 c11372y1 = (C11372y1) componentCallbacksC0929cM4441m0;
            if (c11372y1.m42643J2() || c11372y1.m42642G2()) {
                return;
            }
            m23360l1().m4416a1();
            return;
        }
        C3161c c3161c = (C3161c) componentCallbacksC0929cM4441m0;
        if (!C11659h.m43403a().mo43594b1() || this.f11398c0 == null) {
            if (c3161c.m15012h3() || c3161c.mo15009e3()) {
                return;
            }
            m23360l1().m4416a1();
            return;
        }
        if (c3161c.m15012h3() || !c3161c.mo15009e3()) {
            this.f11398c0.m15915v();
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onCodeParsedFromSMS(C10261j c10261j) {
        C6124q.m27063h("rbx.main", "SMS code received.");
        C6124q.m27063h("rbx.main", "Calling IdentityProtocol to parse OTP.");
        C11370y.m42581h().m42588g().m29213o(c10261j.f36873a);
    }

    @Override // p203j.ActivityC6992b, p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C8574h.f31489a.m34584d(configuration);
        if (m14783l3()) {
            this.f11408m0.run();
        }
        SystemThemeProtocol.f12789a.m16071C();
        if (C11295a1.m42461l0()) {
            m14793z2(configuration);
        }
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!ActivitySplash.m15533r2() && !C3272a.m15705m() && bundle != null) {
            C0305k0.m1276x(bundle.getBoolean("RESTART_AFTER_PROCESS_DEATH", false));
            if (C0305k0.m1257B()) {
                C6124q.m27063h("rbx.main", "onCreate: App was previously destroyed due to process death");
                super.onCreate(bundle);
                finish();
                return;
            }
        }
        if (C11659h.m43403a().mo43457H3()) {
            if (f11387q0) {
                f11387q0 = false;
            } else {
                C6124q.m27066k("rbx.main", "onCreate: Activity recreated");
                LoggingProtocol.m15994g("activity_recreated");
            }
        }
        if (!C6130w.m27099a(this).equals("foreground")) {
            LoggingProtocol.m15994g("background_process_detected");
        }
        LoggingProtocol.m15994g("main_activity_oncreate");
        super.onCreate(bundle);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("onCreate NativeMain. savedInstanceState is null: ");
        sb2.append(bundle == null);
        C6124q.m27063h("rbx.main", sb2.toString());
        if (this.f11399d0 == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            this.f11399d0 = appHangMonitor;
            appHangMonitor.m15847c();
        }
        if (C11659h.m43403a().mo43733u3() && Build.VERSION.SDK_INT >= 29) {
            LoggingProtocol.m15995h("android_thermal_throttling", ((PowerManager) getSystemService("power")).getCurrentThermalStatus() + 1000);
        }
        this.f11396a0 = C10583b.m40569f().m40576j();
        C0305k0.m1274s(this).m1288N(this);
        setContentView(C11338n0.f39857d);
        if (bundle != null) {
            this.f11392W = bundle.getBoolean("BACK_FROM_GAME");
        }
        C7209a.m30129c(this);
        if (!this.f11392W) {
            C7209a.m30131j().m30132a(C7209a.a.MAIN, bundle);
        }
        this.f11390U = findViewById(C11335m0.f39811i);
        this.f11391V = findViewById(C11335m0.f39790V);
        if (C11370y.m42581h().m42587f().m15274h()) {
            this.f11391V.post(new Runnable() { // from class: sg.m
                @Override // java.lang.Runnable
                public final void run() {
                    this.f39768a.m14750L2();
                }
            });
        } else {
            this.f11391V.setVisibility(0);
        }
        m14739C2();
        NativeGLJavaInterface.setAppShellReloadNeededListener(this);
        NativeGLJavaInterface.setWebviewUserAgentGetter(this);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(this);
        if (this.f11400e0 == null && C11659h.m43403a().mo43688o0()) {
            long jMo43408A3 = C11659h.m43403a().mo43408A3();
            C6124q.m27057b("rbx.main", "Setup mPendingPurchaseExecutor to run every " + jMo43408A3 + " seconds");
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
            this.f11400e0 = scheduledThreadPoolExecutor;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(new RunnableC3135c(), jMo43408A3, jMo43408A3, TimeUnit.SECONDS);
        }
        if (C11659h.m43403a().mo43595b2()) {
            C11370y.m42581h().m42588g().m29212n(this);
        } else {
            m14775f3();
        }
        if (C11659h.m43403a().mo43558W1() && this.f11404i0 == null) {
            C4639h c4639h = new C4639h(new Handler(Looper.getMainLooper()));
            this.f11404i0 = c4639h;
            c4639h.m22861a();
        }
        if (C7193r.m30069k().m30090u()) {
            m14717d3();
        }
        if (C11659h.m43403a().mo43635g3()) {
            mo4656a().mo4935a(AppRatingPromptHandler.f12735a);
        }
        if (C11659h.m43403a().mo43550V0()) {
            mo4656a().mo4935a(PinShortcutHandler.INSTANCE);
        }
        if (C11659h.m43403a().mo43480K5()) {
            mo4656a().mo4935a(RecentlyPlayedWidgetHandler.INSTANCE);
        }
        if (C11659h.m43403a().mo43515Q() || C11659h.m43403a().mo43606c5()) {
            mo4656a().mo4935a(DeviceDisplayHandler.INSTANCE);
        }
        AbstractC0966l abstractC0966lMo4656a = mo4656a();
        SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f12789a;
        abstractC0966lMo4656a.mo4935a(systemThemeProtocol);
        systemThemeProtocol.m16079O(new SystemThemeProtocol.InterfaceC3368d() { // from class: sg.n
            @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.InterfaceC3368d
            /* JADX INFO: renamed from: a */
            public final void mo1375a(String str) {
                this.f39847a.m14751M2(str);
            }
        });
        if (C11659h.m43403a().mo43575Y4()) {
            final C10275m c10275m = C10275m.f36898a;
            Objects.requireNonNull(c10275m);
            systemThemeProtocol.m16076H(new SystemThemeProtocol.InterfaceC3365a() { // from class: sg.o
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.InterfaceC3365a
                /* JADX INFO: renamed from: a */
                public final void mo15682a(String str) {
                    c10275m.m39469f(str);
                }
            });
        } else if (C11659h.m43403a().mo43536T0()) {
            systemThemeProtocol.m16077K(new SystemThemeProtocol.InterfaceC3366b() { // from class: sg.c
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.InterfaceC3366b
                /* JADX INFO: renamed from: a */
                public final void mo1376a(boolean z10) {
                    this.f39672a.m14753N2(z10);
                }
            });
        }
        if (C11659h.m43403a().mo43678m4()) {
            C11382g.m42691q(C11297b.m42490a(new Map.Entry[]{new AbstractMap.SimpleEntry("webrtcsdk", new ExpBackOffRetryPolicy(3, 2000L))}));
            C6124q.m27063h("rbx.main", "Requesting WebRTC SDK module download immediately.");
            C11382g.m42686l("webrtcsdk");
        }
        if (C6129v.m27098b()) {
            C6129v.m27097a(C11382g.f40243a, "rbx.main");
            mo4656a().mo4935a(FacialAgeEstimationProtocol.INSTANCE);
        }
        if (C11659h.m43403a().mo43749w5()) {
            if (C11659h.m43403a().mo43683n2()) {
                mo4656a().mo4935a(C5663g.f21724a);
            } else {
                mo4656a().mo4935a(C5660d.f21719a);
            }
        }
        mo4656a().mo4935a(MediaPickerProtocolV2.INSTANCE);
        C11642a c11642a = new C11642a();
        this.f11410o0 = c11642a;
        c11642a.m43322e(this);
        if (this.f11405j0 == null) {
            C12439i c12439i = new C12439i(getApplicationContext());
            this.f11405j0 = c12439i;
            c12439i.m46589o();
        }
        if (this.f11406k0 == null) {
            C12474z0 c12474z0 = new C12474z0(getApplicationContext());
            this.f11406k0 = c12474z0;
            c12474z0.m46725a();
        }
        if (C11659h.m43403a().mo43538T2()) {
            mo4656a().mo4935a(C12464u0.f44579a);
        }
        mo4656a().mo4935a(C6817b.m29189a());
        if (C11659h.m43403a().mo43661k1()) {
            mo4656a().mo4935a(ExternalIdentityHandler.INSTANCE);
        }
        if (C12217h.m45288e().m45297i()) {
            ArrayList arrayList = new ArrayList(C7193r.m30070l());
            arrayList.add(new NameValuePair("recipient_user_id", String.valueOf(C12217h.m45288e().m45296g())));
            C12183m.m45108c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        C3272a.m15699g(getApplicationContext());
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        C4639h c4639h;
        if (C0305k0.m1257B()) {
            C6124q.m27063h("rbx.main", "onDestroy: App was previously destroyed due to process death");
            super.onDestroy();
            return;
        }
        C6124q.m27063h("rbx.main", "onDestroy. isFinishing = " + isFinishing());
        NativeGLJavaInterface.setAppShellReloadNeededListener(null);
        NativeGLJavaInterface.setWebviewUserAgentGetter(null);
        NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
        if (this.f11401f0.f44563a == EnumC12462t0.EXPERIENCE) {
            C11370y.m42581h().m42587f().m15273g(true);
        } else {
            m14718g3(this, isFinishing());
        }
        this.f11388S = false;
        C0305k0.m1274s(this).m1293S(this);
        C12421c c12421c = this.f11397b0;
        if (c12421c != null) {
            c12421c.m46516e();
            this.f11397b0 = null;
        }
        if (C11659h.m43403a().mo43558W1() && (c4639h = this.f11404i0) != null) {
            c4639h.m22862b();
            this.f11404i0 = null;
        }
        this.f11410o0.m43323f();
        C12439i c12439i = this.f11405j0;
        if (c12439i != null) {
            c12439i.m46591q();
            this.f11405j0 = null;
        }
        C12474z0 c12474z0 = this.f11406k0;
        if (c12474z0 != null) {
            c12474z0.m46726b();
            this.f11406k0 = null;
        }
        super.onDestroy();
    }

    @Override // p203j.ActivityC6992b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        return C8574h.f31489a.m34585e(keyEvent) || super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        return C8574h.f31489a.m34586f(keyEvent) || super.onKeyUp(i10, keyEvent);
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToConversationEvent(C10257f c10257f) {
        long j10 = c10257f.f36865b;
        if (j10 != -1) {
            m14766Z2(j10);
        } else {
            m14764W2(c10257f.f36864a);
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    public void onNavigateToFeatureEvent(C10258g c10258g) {
        JSONObject jSONObject;
        String str;
        C6124q.m27057b("rbx.main", "NavigateToFeature: " + c10258g.f36866a);
        if ("FRIEND_FINDER_TAG".equals(c10258g.f36866a) || "UNIVERSAL_FRIENDS_TAG".equals(c10258g.f36866a)) {
            c10258g = m14744G2();
        }
        if ("PROFILE_TAG".equals(c10258g.f36866a)) {
            C11346q.m42516i(this, c10258g.f36867b, getString(C11347q0.f39917I), c10258g.f36870e, c10258g.m39413f(), true);
            return;
        }
        if ("GAME_DETAILS_TAG".equals(c10258g.f36866a)) {
            C11346q.m42512e(this, C11295a1.m42450g() + "games/" + c10258g.f36867b, C11347q0.f40016v, c10258g.f36870e, c10258g.m39413f());
            return;
        }
        if ("CUSTOM_WEBVIEW_TAG".equals(c10258g.f36866a) || "YOUTUBE_TAG".equals(c10258g.f36866a)) {
            try {
                jSONObject = new JSONObject(c10258g.m39411d());
            } catch (JSONException unused) {
                C6124q.m27066k("rbx.main", "Exception parsing data onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                jSONObject = null;
            }
            if (jSONObject != null) {
                String strOptString = jSONObject.optString(Title.type);
                String strOptString2 = jSONObject.optString("url");
                if (strOptString2.isEmpty()) {
                    C6124q.m27066k("rbx.main", "URL must not be empty onNavigateToFeatureEvent CUSTOM_WEBVIEW_TAG");
                    return;
                }
                if ("YOUTUBE_TAG".equals(c10258g.f36866a) && C11295a1.m42471q0()) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(strOptString2));
                    if (intent.resolveActivity(getPackageManager()) != null) {
                        startActivity(intent);
                        return;
                    } else {
                        C6124q.m27066k("rbx.main", "Unable to handle youtube links on Maquettes device.");
                        return;
                    }
                }
                if (!c10258g.f36870e) {
                    C11346q.m42515h(this, strOptString2, strOptString, false, true);
                    return;
                } else {
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("searchParams");
                    C11346q.m42514g(this, strOptString2, strOptString, jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null);
                    return;
                }
            }
            return;
        }
        if ("SOCIAL_MEDIA_TAG".equals(c10258g.f36866a)) {
            new C7630a("rbx.main").m31521h(this, c10258g.m39411d());
            return;
        }
        if ("MY_FEED_TAG".equals(c10258g.f36866a)) {
            C11346q.m42512e(this, C11295a1.m42450g() + "feeds/inapp", C11347q0.f39913G, c10258g.f36870e, c10258g.m39413f());
            return;
        }
        if ("SEARCH_GAMES_TAG".equals(c10258g.f36866a)) {
            C11346q.m42512e(this, C11295a1.m42395G0(c10258g.f36867b), C11347q0.f39919J, c10258g.f36870e, c10258g.m39413f());
            return;
        }
        if ("GAMES_SEE_ALL_TAG".equals(c10258g.f36866a)) {
            C11346q.m42512e(this, C11295a1.m42382A(c10258g.f36867b), C11347q0.f39905D, c10258g.f36870e, c10258g.m39413f());
            return;
        }
        if ("ABUSE_REPORT_TAG".equals(c10258g.f36866a)) {
            C11346q.m42511d(this, c10258g.f36867b, c10258g.m39413f());
            return;
        }
        if (!"ANIMATED_ASSET_DETAILS_TAG".equals(c10258g.f36866a)) {
            if ("CAPTCHA_SUCCESS_TAG".equals(c10258g.f36866a)) {
                C6124q.m27063h("rbx.main", "NavigateToFeature: Received 'CAPTCHA_SUCCESS' tag. Do nothing for now.");
                return;
            }
            if ("CAPTCHA_TAG".equals(c10258g.f36866a)) {
                m14772c3(c10258g.m39411d());
                return;
            } else if ("SCAN_QR_CODE".equals(c10258g.f36866a)) {
                C10890f.m41453f(this, this.f11395Z);
                return;
            } else {
                m14716Y2(C10881b.m41435a(this, c10258g.f36866a), c10258g.f36867b);
                return;
            }
        }
        if (c10258g.f36867b != null) {
            str = C11295a1.m42450g() + "catalog/" + c10258g.f36867b;
        } else {
            str = C11295a1.m42450g() + "games/";
        }
        C11346q.m42516i(this, str, getString(C11347q0.f39925M), c10258g.f36870e, true, false);
    }

    @InterfaceC5847j
    public void onNavigateToLuaEvent(C3161c.h hVar) {
        mo1223e();
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        super.onPause();
        C6124q.m27063h("rbx.main", "onPause");
        C5163a.m24018k().m24021m();
        C7209a.m30131j().m30133b(C7209a.a.MAIN);
        if (m14783l3()) {
            m14740D2();
        }
        if (!C11659h.m43403a().mo43621e4()) {
            C6124q.m27063h("rbx.main", "onPause: NotificationManager removerObserver");
            C12214e.m45220c().m45225g(this);
        }
        C13203c.m48827i().m48833k(this);
        C11356t0.m42541k("onAppBackground");
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
        C11370y.m42581h().m42591k().m38635Q(i10, strArr, iArr);
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        super.onResume();
        C6124q.m27063h("rbx.main", "onResume: IsLoggedIn = " + C12217h.m45288e().m45295f());
        C13203c.m48827i().m48832j(this);
        C10587f c10587fM40576j = C10583b.m40569f().m40576j();
        if (this.f11396a0 != c10587fM40576j) {
            this.f11396a0 = c10587fM40576j;
            C6124q.m27063h("rbx.main", "onResume: Recreating activity due to Locale change.");
            recreate();
            return;
        }
        C0305k0.m1274s(this).m1288N(this);
        if (!C11370y.m42581h().m42587f().m15275i()) {
            m14790q3();
        } else if (this.f11401f0.f44563a == EnumC12462t0.EXPERIENCE && C7193r.m30069k().m30090u()) {
            C11370y.m42581h().m42587f().m15273g(false);
        }
        if (this.f11403h0) {
            C12433f.m46540j().m46542B(true);
            this.f11403h0 = false;
        }
        if (C11295a1.m42461l0()) {
            m14793z2(getResources().getConfiguration());
        }
        C11370y.m42581h().m42591k().m38647d0(this);
        C11370y.m42581h().m42591k().m38646c0();
        C5163a.m24018k().m24020l(this, new Intent(this, (Class<?>) ShareAppChosenReceiver.class), 20124, new C5163a.g() { // from class: sg.i
            @Override // p108em.C5163a.g
            /* JADX INFO: renamed from: a */
            public final void mo1231a(String str, String str2) {
                this.f39705a.m14770b3(str, str2);
            }
        });
        if (!C11659h.m43403a().mo43595b2()) {
            C6124q.m27063h("rbx.main", "Setting result launcher for IdentityProtocol");
            C11370y.m42581h().m42588g().m29223y(this.f11402g0);
        }
        if (C6127t.m27089e()) {
            C11370y.m42581h().m42586e().m7517x(this);
        }
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean("BACK_FROM_GAME", this.f11392W);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        C7209a.m30131j().m30137g();
        this.f11399d0.m15846b();
        C11312e2.f39692a = getResources().getDisplayMetrics();
        if (AbstractActivityC3152a.f11622R == 1 && this.f11401f0.f44563a == EnumC12462t0.APP) {
            NativeReportingInterface.applicationForegrounded();
        }
        if (C11659h.m43403a().mo43424C5()) {
            C6124q.m27063h("rbx.main", "onStart: App is going to foreground. setAppSuspended(false)");
            NativeReportingInterface.setAppSuspended(false);
        }
        C5840c.m26204d().m26215n(this);
        C12486h.m46774h().m46776i(C12433f.m46540j());
        C11356t0.m42552v("main");
        C6426b.m28011h().m28012e();
        if (this.f11401f0.f44563a == EnumC12462t0.EXPERIENCE) {
            C11370y.m42581h().m42587f().m15282p();
        }
        C10293a.m39556c().m39557a();
    }

    @Override // com.roblox.client.AbstractActivityC3152a, com.roblox.client.AbstractActivityC3160b, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStop() {
        C5840c.m26204d().m26217p(this);
        this.f11399d0.m15845a();
        if (AbstractActivityC3152a.f11622R == 1 && this.f11401f0.f44563a == EnumC12462t0.APP) {
            NativeReportingInterface.applicationBackgrounded();
        }
        if (C11659h.m43403a().mo43424C5() && this.f11401f0.f44563a == EnumC12462t0.APP) {
            C6124q.m27063h("rbx.main", "onStop: App is going to background. setAppSuspended(true)");
            NativeReportingInterface.setAppSuspended(true);
        }
        C12486h.m46774h().m46777j(C12433f.m46540j());
        C6426b.m28011h().m28013f();
        if (this.f11401f0.f44563a == EnumC12462t0.EXPERIENCE) {
            C11370y.m42581h().m42587f().m15280n();
        }
        C10293a.m39556c().m39558b();
        if (C11659h.m43403a().mo43621e4()) {
            C6124q.m27063h("rbx.main", "onStop: NotificationManager removerObserver");
            C12214e.m45220c().m45225g(this);
        }
        super.onStop();
        C6124q.m27063h("rbx.main", "onStop");
    }

    @Override // com.roblox.client.AbstractActivityC3160b, p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (C11659h.m43403a().mo43504O2()) {
            C12173c0.m45030s(i10);
        }
        this.f11401f0.m46701j(i10);
    }

    /* JADX INFO: renamed from: p3 */
    public final void m14789p3(String str) {
        Intent intent = new Intent(this, (Class<?>) RobloxWebActivity.class);
        intent.putExtra("URL_EXTRA", str);
        startActivity(intent);
        overridePendingTransition(C11317g0.f39699b, C11317g0.f39700c);
    }

    /* JADX INFO: renamed from: q3 */
    public final void m14790q3() {
        C6124q.m27063h("rbx.main", "startup:");
        if (C0305k0.m1274s(this).m1300v() || C12217h.m45288e().m45295f() || C3272a.m15705m() || !C6127t.m27090f()) {
            C0305k0.m1274s(this).m1291Q();
            return;
        }
        C6124q.m27060e("rbx.main", "Incomplete initialization, restarting app");
        startActivity(ActivitySplash.m15531o2(this, StartedForEnum.SHELL_PROCESS_RESTART));
        finish();
    }

    @Override // p412rh.InterfaceC10883d
    /* JADX INFO: renamed from: r */
    public ComponentCallbacksC0929c mo14791r(String str) {
        return m23360l1().m4444n0(str);
    }

    /* JADX INFO: renamed from: r3 */
    public void m14792r3(EnumC12462t0 enumC12462t0) {
        this.f11401f0.m46702k(enumC12462t0);
    }

    /* JADX INFO: renamed from: z2 */
    public final void m14793z2(Configuration configuration) {
        SurfaceHolderCallbackC12460s0 surfaceHolderCallbackC12460s0 = this.f11401f0;
        if (surfaceHolderCallbackC12460s0 == null || surfaceHolderCallbackC12460s0.f44563a != EnumC12462t0.EXPERIENCE) {
            C11304c2.m42491a(getWindow(), configuration);
        }
    }
}
