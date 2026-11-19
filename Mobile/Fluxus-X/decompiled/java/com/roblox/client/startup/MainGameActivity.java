package com.roblox.client.startup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.p000lifecycle.f;
import androidx.p000lifecycle.h0;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.s;
import av.g1;
import av.k;
import av.l0;
import av.p0;
import bh.a1;
import bh.m0;
import bh.n0;
import bh.q0;
import bh.t0;
import bh.y;
import com.github.luben.zstd.BuildConfig;
import com.google.androidgamesdk.GameActivity;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.analytics.TelemetryFlushWorker;
import com.roblox.client.components.LoadingBar;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.engine.jni.autovalue.NativePurchaseContext;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import ei.q;
import gu.m;
import ik.a0;
import ik.k0;
import ik.o0;
import ik.s2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import nh.e;
import oh.j;
import ok.t;
import ok.w;
import ok.x;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.Metadata;
import p001kotlin.Unit;
import p001kotlin.collections.CollectionsKt;
import p001kotlin.collections.p;
import p001kotlin.jvm.functions.Function0;
import p001kotlin.jvm.functions.Function1;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import rj.u;
import ym.g;
import zt.h;
import zt.i;
import zt.n;
import zt.o;
import zt.r;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 ²\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002³\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001b\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0003¢\u0006\u0004\b \u0010\u0006J\u000f\u0010!\u001a\u00020\u0007H\u0002¢\u0006\u0004\b!\u0010\u0006J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010\u0006J\u000f\u0010'\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010\u0006J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0007H\u0002¢\u0006\u0004\b+\u0010\u0006J\u000f\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010\u0006J\u0019\u0010/\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00072\u0006\u00101\u001a\u00020\tH\u0014¢\u0006\u0004\b2\u0010\fJ\u0017\u00103\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b3\u0010\u0016J\u000f\u00104\u001a\u00020\u0007H\u0014¢\u0006\u0004\b4\u0010\u0006J\u000f\u00105\u001a\u00020\u0007H\u0014¢\u0006\u0004\b5\u0010\u0006J\u0017\u00108\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u00072\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u000f\u0010;\u001a\u00020\u0007H\u0014¢\u0006\u0004\b;\u0010\u0006J\u000f\u0010<\u001a\u00020\u0007H\u0014¢\u0006\u0004\b<\u0010\u0006J\u001f\u0010@\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\"2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010B\u001a\u00020\u00112\u0006\u0010=\u001a\u00020\"2\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bB\u0010AJ-\u0010H\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\"2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u000f0D2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ)\u0010L\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\"2\u0006\u0010J\u001a\u00020\"2\b\u0010K\u001a\u0004\u0018\u00010\rH\u0015¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0007¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u0007H\u0007¢\u0006\u0004\bS\u0010\u0006J\u000f\u0010T\u001a\u00020\u0007H\u0007¢\u0006\u0004\bT\u0010\u0006J\u000f\u0010U\u001a\u00020\u0007H\u0017¢\u0006\u0004\bU\u0010\u0006J\u001f\u0010X\u001a\u00020\u00072\u0006\u0010V\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020\u000fH\u0007¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\u0007H\u0007¢\u0006\u0004\bZ\u0010\u0006J\u000f\u0010[\u001a\u00020\u0007H\u0007¢\u0006\u0004\b[\u0010\u0006J\u001f\u0010_\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u000fH\u0007¢\u0006\u0004\b_\u0010`J)\u0010c\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\2\u0006\u0010a\u001a\u00020\u000f2\b\u0010b\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0004\bc\u0010dJ'\u0010f\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010e\u001a\u00020\u000fH\u0007¢\u0006\u0004\bf\u0010dJ'\u0010i\u001a\u00020\u00072\u0006\u0010]\u001a\u00020\\2\u0006\u0010^\u001a\u00020\u000f2\u0006\u0010h\u001a\u00020gH\u0007¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020\u0007H\u0007¢\u0006\u0004\bk\u0010\u0006J\u000f\u0010l\u001a\u00020\u0007H\u0007¢\u0006\u0004\bl\u0010\u0006J\u0011\u0010n\u001a\u0004\u0018\u00010mH\u0017¢\u0006\u0004\bn\u0010oJ\u000f\u0010q\u001a\u00020pH\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010t\u001a\u00020\u00072\u0006\u0010s\u001a\u00020\"H\u0016¢\u0006\u0004\bt\u0010%J\u0017\u0010u\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u000fH\u0016¢\u0006\u0004\bu\u0010*J\u000f\u0010v\u001a\u00020\u0007H\u0016¢\u0006\u0004\bv\u0010\u0006J\u000f\u0010w\u001a\u00020\u0007H\u0016¢\u0006\u0004\bw\u0010\u0006R\u0017\u0010}\u001a\u00020x8\u0007¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|R\u001b\u0010\u0083\u0001\u001a\u00020~8\u0006¢\u0006\u000f\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001a\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0019\u0010\u008a\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bt\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u008f\u0001\u001a\u00030\u0088\u00018\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\bu\u0010\u0089\u0001R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001R\u0018\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R!\u0010¡\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009d\u0001\u0010\u009e\u0001\u001a\u0006\b\u009f\u0001\u0010 \u0001R!\u0010¦\u0001\u001a\u00030¢\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b£\u0001\u0010\u009e\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001R\u001c\u0010\u0087\u0001\u001a\u00030\u0084\u0001*\u00020\r8BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0014\u0010±\u0001\u001a\u00020\u00118F¢\u0006\b\u001a\u0006\b°\u0001\u0010¬\u0001¨\u0006´\u0001"}, d2 = {"Lcom/roblox/client/startup/MainGameActivity;", "Lcom/google/androidgamesdk/GameActivity;", "Lmj/a;", "Lei/q;", "Lcom/roblox/client/startup/c$b;", "<init>", "()V", BuildConfig.FLAVOR, "t2", "Landroid/content/Context;", "appContext", "l2", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "intent", BuildConfig.FLAVOR, "tag", BuildConfig.FLAVOR, "isNewIntent", "q2", "(Landroid/content/Intent;Ljava/lang/String;Z)V", "z2", "(Landroid/content/Intent;)V", "s2", "Lcom/roblox/client/RbxKeyboard;", "u2", "()Lcom/roblox/client/RbxKeyboard;", "G2", "visible", "O2", "(Z)V", "J2", "e2", "D2", BuildConfig.FLAVOR, "messageResourceId", "M2", "(I)V", "j2", "F2", "message", "v2", "(Ljava/lang/String;)V", "P2", "B2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "newBase", "attachBaseContext", "onNewIntent", "onStart", "onResume", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "surfaceDestroyed", "onPause", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "requestCode", BuildConfig.FLAVOR, "permissions", BuildConfig.FLAVOR, "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "r2", "bootstrapTheApp", "requestOrientationAsDefault", "E", "url", Title.type, "openWebActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "syncCookiesFromEngine", "showLeaveAppPrompt", BuildConfig.FLAVOR, "userId", "productId", "promptNativePurchase", "(JLjava/lang/String;)V", "robloxNativeProductId", "payloadStr", "promptNativePurchaseWithPayload", "(JLjava/lang/String;Ljava/lang/String;)V", "paymentSessionId", "promptNativePurchaseWithPaymentSessionId", "Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;", "context", "promptNativePurchaseWithContext", "(JLjava/lang/String;Lcom/roblox/engine/jni/autovalue/NativePurchaseContext;)V", "I", "k2", "Lcom/roblox/client/b;", "q0", "()Lcom/roblox/client/b;", "Landroid/app/Activity;", "e0", "()Landroid/app/Activity;", "stringResourceId", "T", "V", "i", "M", "Lcom/roblox/client/startup/NativeHelper;", "Q", "Lcom/roblox/client/startup/NativeHelper;", "getNativeHelper", "()Lcom/roblox/client/startup/NativeHelper;", "nativeHelper", "Lui/a;", "R", "Lui/a;", "m2", "()Lui/a;", "appInsetManager", "Lcom/roblox/client/startup/StartedForEnum;", "S", "Lcom/roblox/client/startup/StartedForEnum;", "startReason", "Landroid/view/View;", "Landroid/view/View;", "splashScreen", "Lcom/roblox/client/components/LoadingBar;", "U", "Lcom/roblox/client/components/LoadingBar;", "loadingView", "webOverlayView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "W", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initParamsForEngineDone", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "X", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "iapPurchaseManager", "Lik/o0;", "Y", "Lik/o0;", "inputAdapter", "Lik/a0;", "Z", "Lzt/h;", "n2", "()Lik/a0;", "browserServiceAppAdapter", "Lfh/b;", "a0", "o2", "()Lfh/b;", "browserServiceBridge", "Lam/d;", "b0", "Lam/d;", "platformEmergencyObserver", "w2", "()Z", "isInForeground", "p2", "(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;", "x2", "isProtocolLaunch", "c0", "Companion", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainGameActivity extends GameActivity implements mj.a, q, c.b {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static boolean f9318d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f9319e0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static boolean f9321g0;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public final NativeHelper nativeHelper;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public View splashScreen;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public LoadingBar loadingView;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public View webOverlayView;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public am.d platformEmergencyObserver;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static boolean f9320f0 = true;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final ui.a appInsetManager = new ui.a();

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    @NotNull
    public StartedForEnum startReason = StartedForEnum.SYSTEM;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean initParamsForEngineDone = new AtomicBoolean(false);

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    @NotNull
    public final IAPPurchaseManager iapPurchaseManager = new IAPPurchaseManager(this, true);

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @NotNull
    public final o0 inputAdapter = new o0();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public final h browserServiceAppAdapter = i.a(new Function0() { // from class: ik.a1
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.g2(this.f19502a);
        }
    });

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h browserServiceBridge = i.a(new Function0() { // from class: ik.b1
        @Override // p001kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.h2(this.f19504a);
        }
    });

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00118CX\u0083\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010&\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006'"}, d2 = {"Lcom/roblox/client/startup/MainGameActivity$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "packageContext", "Lcom/roblox/client/startup/StartedForEnum;", "reason", "Landroid/content/Intent;", "e", "(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;", "Lcom/roblox/engine/jni/autovalue/InitParams;", "initParams", BuildConfig.FLAVOR, "f", "(Lcom/roblox/engine/jni/autovalue/InitParams;)V", "i", BuildConfig.FLAVOR, "assetPath", "j", "(Ljava/lang/String;)V", "overrides", "h", BuildConfig.FLAVOR, "usePersistentStorage", "g", "(Z)V", "getAppUpgradeKey", "()Ljava/lang/String;", "getAppUpgradeKey$annotations", "appUpgradeKey", "TAG", "Ljava/lang/String;", "STARTED_FOR_INTENT_KEY", "overrideFlagsAtStartupDone", "Z", "initialized", "isFirstTimeCreating", "inferredCrashMarkerInitialized", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Keep
        public final String getAppUpgradeKey() {
            String strE = a1.E();
            Intrinsics.checkNotNullExpressionValue(strE, "getAppUpgradeKey(...)");
            return strE;
        }

        @NotNull
        public final Intent e(@NotNull Context packageContext, @NotNull StartedForEnum reason) {
            Intrinsics.checkNotNullParameter(packageContext, "packageContext");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intent intentPutExtra = new Intent(packageContext, (Class<?>) MainGameActivity.class).putExtra("STARTED_FOR_INTENT_KEY", reason);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final void f(@Nullable InitParams initParams) {
            MainGameActivity.nativeAppBridgeSetInitParams(initParams);
        }

        public final void g(boolean usePersistentStorage) {
            MainGameActivity.nativeEnableVersionBFlagCache(usePersistentStorage);
        }

        public final void h(String overrides) {
            MainGameActivity.nativePreloadFlagOverrides(overrides);
        }

        public final void i() {
            MainGameActivity.nativeRetryInit();
        }

        public final void j(String assetPath) {
            MainGameActivity.nativeSetAssetPath(assetPath);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/roblox/client/startup/MainGameActivity$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", BuildConfig.FLAVOR, "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9324a;
        public final /* synthetic */ MainGameActivity b;

        public a(Context context, MainGameActivity mainGameActivity) {
            this.f9324a = context;
            this.b = mainGameActivity;
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onCreate(s sVar) {
            super.onCreate(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onDestroy(s sVar) {
            super.onDestroy(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onPause(s sVar) {
            super.onPause(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public /* bridge */ void onResume(s sVar) {
            super.onResume(sVar);
        }

        @Override // androidx.p000lifecycle.f
        public void onStart(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            SharedPreferences sharedPreferencesU = a1.U(this.f9324a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.putBoolean("ROBLOXCrash", true);
            editorEdit.apply();
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            SharedPreferences sharedPreferencesU = a1.U(this.f9324a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.remove("ROBLOXCrash");
            editorEdit.apply();
            if (bi.h.a().D3()) {
                MainGameActivity mainGameActivity = this.b;
                Context context = this.f9324a;
                Intrinsics.checkNotNull(context);
                mainGameActivity.l2(context);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.startup.MainGameActivity$updateNativeSettingsBeforeFlags$1", f = "MainGameActivity.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9325t;

        public b(eu.b<? super b> bVar) {
            super(2, bVar);
        }

        public static final void p(String str) {
            ok.c.f28244c.D(str);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return MainGameActivity.this.new b(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9325t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            ok.c.g().f(MainGameActivity.this.getApplicationContext(), new ok.a.InterfaceC0545a() { // from class: ik.j1
                @Override // ok.a.InterfaceC0545a
                public final void a(String str) {
                    MainGameActivity.b.p(str);
                }
            });
            return Unit.f21506a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainGameActivity() {
        l0 l0Var = null;
        this.nativeHelper = new NativeHelper(this, j.a(this), new ch.a(l0Var, null, null, 7, null), l0Var, 8, 0 == true ? 1 : 0);
    }

    public static final void A2(MainGameActivity mainGameActivity, String str, String str2) {
        bh.q.h(mainGameActivity, str, str2, false, true);
    }

    public static final CharSequence C2(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        return "\n\t" + ((String) rVar.a()) + " : " + ((Boolean) rVar.b()).booleanValue() + " => " + ((Boolean) rVar.c());
    }

    public static final void E2(MainGameActivity mainGameActivity) {
        mainGameActivity.e2();
    }

    public static final void H2(MainGameActivity mainGameActivity) {
        mainGameActivity.o2().c();
    }

    public static final void I2(MainGameActivity mainGameActivity) {
        mainGameActivity.J2();
    }

    public static final void K2(final MainGameActivity mainGameActivity) {
        if (mainGameActivity.isDestroyed()) {
            return;
        }
        new d().c(mainGameActivity, new d.a() { // from class: ik.z0
            @Override // com.roblox.client.startup.d.a
            public final void a() {
                MainGameActivity.L2(this.f19628a);
            }
        });
    }

    public static final void L2(MainGameActivity mainGameActivity) {
        mainGameActivity.finish();
    }

    public static final void N2() {
        k0.T();
    }

    private final void e2() {
        int i10;
        if (a1.q0() || a1.k0()) {
            return;
        }
        if (a1.o0()) {
            i10 = 13;
        } else {
            i10 = a1.p0() ? 7 : 6;
        }
        setRequestedOrientation(i10);
    }

    public static final void f2(MainGameActivity mainGameActivity) {
        mainGameActivity.G2();
    }

    public static final a0 g2(MainGameActivity mainGameActivity) {
        return new a0(mainGameActivity, m0.f4169u0, null, null, 12, null);
    }

    @Keep
    private static final String getAppUpgradeKey() {
        return INSTANCE.getAppUpgradeKey();
    }

    public static final fh.b h2(MainGameActivity mainGameActivity) {
        return new fh.b(mainGameActivity.n2(), new Handler(Looper.getMainLooper()));
    }

    @NotNull
    public static final Intent i2(@NotNull Context context, @NotNull StartedForEnum startedForEnum) {
        return INSTANCE.e(context, startedForEnum);
    }

    public static final native void nativeAppBridgeSetInitParams(@Nullable InitParams initParams);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeEnableVersionBFlagCache(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativePreloadFlagOverrides(String str);

    public static final native void nativeRetryInit();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetAssetPath(String str);

    private final boolean w2() {
        return a().getState().b(l.b.RESUMED);
    }

    public static final Unit y2(e.m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        ok.q.b("MainGameActivity", "onBackPressed: ... notify Lua of this BACK button.");
        NativeGLInterface.nativeHandleBackPressed();
        return Unit.f21506a;
    }

    public final void B2() {
        if (f9318d0) {
            return;
        }
        f9318d0 = true;
        List listK = p.k();
        ok.q.b("MainGameActivity", "overrideFlagsAtStartup: count = " + listK.size());
        List<String> list = listK;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(list, 10));
        for (String str : list) {
            com.roblox.client.flags.a aVarR0 = bi.h.a().R0(str);
            if (aVarR0 == null) {
                throw new IllegalStateException(("Flag " + str + " is not found.").toString());
            }
            if (aVarR0.a()) {
                throw new IllegalStateException(("Flag " + str + " is cached and not supported.").toString());
            }
            com.roblox.client.flags.a.C0143a c0143a = aVarR0 instanceof com.roblox.client.flags.a.C0143a ? (com.roblox.client.flags.a.C0143a) aVarR0 : null;
            if (c0143a == null) {
                throw new IllegalStateException(("Flag " + str + " is not a boolean flag.").toString());
            }
            Boolean boolK = c0143a.k();
            Intrinsics.checkNotNullExpressionValue(boolK, "valueOf(...)");
            boolK.booleanValue();
            c0143a.g(Boolean.TRUE);
            arrayList.add(new r(str, boolK, c0143a.k()));
        }
        ok.q.h("MainGameActivity", CollectionsKt.m0(arrayList, null, "overrideFlagsAtStartup:", null, 0, null, new Function1() { // from class: ik.y0
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.C2((zt.r) obj);
            }
        }, 29, null));
    }

    public final void D2() {
        Bundle bundleI = rj.r.k().i();
        if (bundleI == null) {
            return;
        }
        ok.q.h("MainGameActivity", "processPushNotification: Handle notifications using Linking...");
        if (rj.r.k().t(bundleI)) {
            return;
        }
        ok.q.k("MainGameActivity", "processPushNotification: Handle legacy push notifications...");
    }

    @Override // ei.q
    public void E() {
        e2();
    }

    public final void F2() {
        O2(true);
        INSTANCE.i();
    }

    public final void G2() {
        ok.q.h("MainGameActivity", "Set up context and start to unpack assets:");
        uk.c.INSTANCE.c().r();
        runOnUiThread(new Runnable() { // from class: ik.h1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.H2(this.f19521a);
            }
        });
        if (!bi.h.a().q0()) {
            J2();
            return;
        }
        ok.q.h("MainGameActivity", "runAndWaitToUnpackAssets: check for platform emergency...");
        am.d dVar = this.platformEmergencyObserver;
        if (dVar != null) {
            dVar.g(new Runnable() { // from class: ik.i1
                @Override // java.lang.Runnable
                public final void run() {
                    MainGameActivity.I2(this.f19525a);
                }
            });
        } else {
            J2();
        }
    }

    public final void I() {
        if (a1.q0()) {
            x.a(this, q0.S);
            finish();
        } else {
            O2(false);
            if (w2()) {
                M2(q0.S);
            }
        }
    }

    public final synchronized void J2() {
        try {
            if (this.initParamsForEngineDone.compareAndSet(false, true)) {
                ok.q.h("MainGameActivity", "setInitParamsForEngine: initializing");
                NativeSettingsInterface.nativeSetDeviceInfo(ei.p.c(this));
                InitParams.a aVarBuilder = InitParams.builder();
                ei.f.d dVarB = ei.p.b(this, this);
                aVarBuilder.i(dVarB.b());
                InitParams.a aVarH = aVarBuilder.d(dVarB.a()).b(a1.g()).j(a1.a1()).f(a1.r0()).e(a1.t0()).g(a1.q0()).h(0L);
                if (bi.h.a().D3() && bi.h.a().j1()) {
                    aVarH.c(ok.h.a());
                }
                INSTANCE.f(aVarH.a());
            } else {
                ok.q.h("MainGameActivity", "setInitParamsForEngine: already initialized");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.roblox.client.startup.c.b
    public void M() {
        j2();
        F2();
    }

    public final void M2(int messageResourceId) {
        LoggingProtocol.i("retry_during_splash", 0L, 2, null);
        c.y2(this, messageResourceId);
    }

    public final void O2(boolean visible) {
        if (a1.q0()) {
            ok.q.b("MainGameActivity", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        LoadingBar loadingBar = this.loadingView;
        if (loadingBar != null) {
            loadingBar.setVisibility(visible ? 0 : 8);
        }
    }

    public final void P2() {
        String strH;
        k.d(av.q0.a(g1.b()), null, null, new b(null), 3, null);
        boolean zL2 = bi.h.a().L2();
        if (zL2) {
            LoggingProtocol.i("update_native_settings_begin", 0L, 2, null);
        }
        a1.W0();
        if (zL2) {
            LoggingProtocol.i("update_native_settings_end", 0L, 2, null);
        }
        String strR = uk.c.INSTANCE.c().r();
        Companion companion = INSTANCE;
        companion.j(strR);
        if (bi.h.a().g6()) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FlagCacheUtils.a versionBCacheChannelMiss = FlagCacheUtils.getVersionBCacheChannelMiss(applicationContext);
            if (versionBCacheChannelMiss == null) {
                companion.g(bi.h.a().B1());
            } else {
                LoggingProtocol.m("vb_cache_" + versionBCacheChannelMiss.getValue(), null, 2, null);
            }
        }
        if (!wh.b.a() || (strH = new ek.a(getApplicationContext()).h()) == null) {
            return;
        }
        companion.h(strH);
    }

    @Override // mj.a
    public void T(int stringResourceId) {
        String string = getString(stringResourceId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        v2(string);
    }

    @Override // mj.a
    public void V(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        v2(message);
    }

    @Override // j.b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        Configuration configuration = newBase.getResources().getConfiguration();
        yi.f fVarD = yi.b.f().d(newBase);
        Intrinsics.checkNotNullExpressionValue(fVarD, "getDefaultLocaleValue(...)");
        yi.f fVarJ = yi.b.f().j();
        ok.q.b("rbx.locale", configuration.getClass().getSimpleName() + " -> Locale: base = " + configuration.getLocales().get(0) + "; default = " + fVarD.c() + "; user = " + (fVarJ != null ? fVarJ.c() : null));
        if (fVarJ != null) {
            fVarD = fVarJ;
        }
        Locale localeB = yi.b.b(fVarD.c());
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        super.attachBaseContext(newBase.createConfigurationContext(configuration));
        ai.j.b(this);
    }

    @Keep
    public final void bootstrapTheApp() {
        ok.q.h("MainGameActivity", "Unpack assets in a background thread.");
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ik.g1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.f2(this.f19519a);
            }
        });
    }

    @Override // mj.a
    @NotNull
    public Activity e0() {
        return this;
    }

    @Keep
    @NotNull
    public final NativeHelper getNativeHelper() {
        return this.nativeHelper;
    }

    @Override // com.roblox.client.startup.c.b
    public void i() {
        j2();
        F2();
    }

    public final void j2() {
        c.v2(this);
    }

    public final void k2() {
        j2();
    }

    public final void l2(Context appContext) {
        NativeReportingInterface.stopPushNotificationSession();
        eh.k.q().s();
        eh.k.q().r();
        eh.o.j(false);
        if (bi.h.a().E1()) {
            if (bi.h.a().T2() || bi.h.a().f()) {
                TelemetryFlushWorker.INSTANCE.a(appContext);
            }
        }
    }

    @NotNull
    /* JADX INFO: renamed from: m2, reason: from getter */
    public final ui.a getAppInsetManager() {
        return this.appInsetManager;
    }

    public final a0 n2() {
        return (a0) this.browserServiceAppAdapter.getValue();
    }

    public final fh.b o2() {
        return (fh.b) this.browserServiceBridge.getValue();
    }

    @Override // f4.v, e.p, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 20124 && bi.h.a().D3()) {
            hk.a.a();
            wk.a aVar = new wk.a(true);
            NativeGLInterface.nativeBroadcastEventWithNamespace(aVar.f35884a, aVar.b, aVar.f35885c);
            if (bi.h.a().h3()) {
                sm.a.k().e(data);
            }
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        uk.h.f33471a.d(newConfig);
        SystemThemeProtocol.f9823a.C();
        if (a1.l0()) {
            this.nativeHelper.k0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.androidgamesdk.GameActivity, f4.v, e.p, k2.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        ok.q.h("MainGameActivity", "onCreate");
        p0 p0Var = null;
        Object[] objArr = 0;
        if (f9319e0) {
            LoggingProtocol.i("process_reuse", 0L, 2, null);
        }
        xm.a.c(this);
        xm.a.j().a(xm.a.EnumC0756a.GAME, savedInstanceState);
        if (bi.h.a().D3()) {
            if (bi.h.a().S3()) {
                if (!f9320f0) {
                    LoggingProtocol.i("activity_recreated", 0L, 2, null);
                }
                f9320f0 = false;
            }
            if (!Intrinsics.c(w.a(this), "foreground")) {
                LoggingProtocol.i("background_process_detected", 0L, 2, null);
            }
        }
        LoggingProtocol.i("main_activity_oncreate", 0L, 2, null);
        B2();
        if (bi.h.a().L1()) {
            nj.a0.R(this);
        } else {
            nj.m.F0(this);
        }
        e.x.c(this, null, null, 3, null);
        dj.b.f().k(this);
        P2();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        int i10 = 1;
        q2(intent, "onCreate", savedInstanceState == null);
        if (bi.h.a().k0()) {
            Toast.makeText(this, "Using GameActivity (for QA)", 0).show();
        }
        if (dj.h.e().i()) {
            String strValueOf = String.valueOf(dj.h.e().g());
            ArrayList arrayList = new ArrayList(rj.r.l());
            arrayList.add(new NameValuePair("recipient_user_id", strValueOf));
            eh.o.c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        if (bi.h.a().q0()) {
            ok.q.h("MainGameActivity", "Attach platform emergency observer.");
            if (this.platformEmergencyObserver == null) {
                this.platformEmergencyObserver = new am.d(p0Var, i10, objArr == true ? 1 : 0);
            }
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            am.d dVar = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(dVar);
            platformSystemDialogHandler.attachObserver(dVar);
            platformSystemDialogHandler.setActivity(this);
        }
        super.onCreate(savedInstanceState);
        uk.h hVar = uk.h.f33471a;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        hVar.c(configuration);
        s2();
        GameActivity.d dVar2 = this.H;
        if (dVar2 == null) {
            throw new IllegalStateException("GameActivity SurfaceView failed to initialize");
        }
        this.nativeHelper.r0(this.E, dVar2, u2(), this.inputAdapter);
        e.q0.b(P(), null, false, new Function1() { // from class: ik.d1
            @Override // p001kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.y2((e.m0) obj);
            }
        }, 3, null);
        t2();
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, f4.v, android.app.Activity
    public void onDestroy() {
        ok.q.h("MainGameActivity", "onDestroy. isFinishing = " + isFinishing());
        o2().e();
        if (this.platformEmergencyObserver != null) {
            ok.q.h("MainGameActivity", "Detach platform emergency observer.");
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            am.d dVar = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(dVar);
            platformSystemDialogHandler.detachObserver(dVar);
            this.platformEmergencyObserver = null;
        }
        super.onDestroy();
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return uk.h.f33471a.e(event) || super.onKeyDown(keyCode, event);
    }

    @Override // com.google.androidgamesdk.GameActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return uk.h.f33471a.f(event) || super.onKeyUp(keyCode, event);
    }

    @Override // e.p, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        if (bi.h.a().y2()) {
            setIntent(intent);
        }
        q2(intent, "onNewIntent", true);
    }

    @Override // com.google.androidgamesdk.GameActivity, f4.v, android.app.Activity
    public void onPause() {
        View view;
        super.onPause();
        if (bi.h.a().S3() && (view = this.splashScreen) != null) {
            if (view == null) {
                Intrinsics.u("splashScreen");
                view = null;
            }
            if (view.getVisibility() == 0 && !isFinishing()) {
                ok.q.k("MainGameActivity", "onPause: MainGameActivity backgrounded before becoming interactive.");
                LoggingProtocol.i("startup_interrupted", 0L, 2, null);
            }
        }
        xm.a.j().b(xm.a.EnumC0756a.GAME);
        if (bi.h.a().D3()) {
            t0.k("onAppBackground");
        }
    }

    @Override // f4.v, e.p, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        y.h().k().E(requestCode, permissions, grantResults);
    }

    @Override // com.google.androidgamesdk.GameActivity, f4.v, android.app.Activity
    public void onResume() {
        ok.q.h("MainGameActivity", "onResume:");
        super.onResume();
        rj.r.k().s(this);
        D2();
        if (this.startReason == StartedForEnum.PROTOCOL_LAUNCH && com.roblox.client.startup.a.m()) {
            g.G().w();
        }
        if (dj.h.e().f()) {
            ok.q.h("MainGameActivity", "onResume: ... (Logged in) Try to grant pending purchases.");
            IAPPurchaseManager.M(this, true);
        }
        if (t.e()) {
            y.h().e().x(this);
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, f4.v, android.app.Activity
    public void onStart() {
        super.onStart();
        f9319e0 = true;
        xm.a.j().f();
    }

    @Keep
    public final void openWebActivity(@NotNull final String url, @NotNull final String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        ok.q.h("MainGameActivity", "openWebActivity: url = " + url + ", title = " + title);
        runOnUiThread(new Runnable() { // from class: ik.e1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.A2(this.f19510a, url, title);
            }
        });
    }

    public final StartedForEnum p2(Intent intent) {
        Object objB;
        Object serializableExtra;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(StartedForEnum.class.getClassLoader());
            try {
                n.Companion companion = n.INSTANCE;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent.getSerializableExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.class);
                } else {
                    Object serializableExtra2 = intent.getSerializableExtra("STARTED_FOR_INTENT_KEY");
                    if (!(serializableExtra2 instanceof StartedForEnum)) {
                        serializableExtra2 = null;
                    }
                    serializableExtra = (StartedForEnum) serializableExtra2;
                }
                objB = n.b((StartedForEnum) serializableExtra);
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            StartedForEnum startedForEnum = (StartedForEnum) (n.g(objB) ? null : objB);
            if (startedForEnum != null) {
                return startedForEnum;
            }
        }
        return StartedForEnum.SYSTEM;
    }

    @Keep
    public final void promptNativePurchase(long userId, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        ok.q.h("MainGameActivity", "promptNativePurchase: userId = " + userId + ", productId = " + productId);
        this.iapPurchaseManager.F(userId, productId);
    }

    @Keep
    public final void promptNativePurchaseWithContext(long userId, @NotNull String productId, @NotNull NativePurchaseContext context) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(context, "context");
        ok.q.h("MainGameActivity", "promptNativePurchaseWithContext: userId = " + userId + ", productId = " + productId);
        if (bi.h.a().D3()) {
            this.iapPurchaseManager.H(userId, productId, context);
        } else {
            this.iapPurchaseManager.F(userId, productId);
        }
    }

    @Keep
    public final void promptNativePurchaseWithPayload(long userId, @NotNull String robloxNativeProductId, @Nullable String payloadStr) {
        Intrinsics.checkNotNullParameter(robloxNativeProductId, "robloxNativeProductId");
        ok.q.h("MainGameActivity", "promptNativePurchaseWithPayload: userId = " + userId + ", roblox-native-productId = " + robloxNativeProductId);
        this.iapPurchaseManager.I(userId, robloxNativeProductId, payloadStr);
    }

    @Keep
    public final void promptNativePurchaseWithPaymentSessionId(long userId, @NotNull String productId, @NotNull String paymentSessionId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(paymentSessionId, "paymentSessionId");
        ok.q.h("MainGameActivity", "promptNativePurchaseWithPaymentSessionId: userId = " + userId + ", productId = " + productId);
        if (bi.h.a().D3()) {
            this.iapPurchaseManager.J(userId, productId, paymentSessionId);
        } else {
            this.iapPurchaseManager.F(userId, productId);
        }
    }

    @Override // mj.a
    @Nullable
    public com.roblox.client.b q0() {
        return null;
    }

    public final void q2(Intent intent, String tag, boolean isNewIntent) {
        StartedForEnum startedForEnumP2 = p2(intent);
        this.startReason = startedForEnumP2;
        ok.q.h("MainGameActivity", tag + ": Started for: " + startedForEnumP2);
        if (this.startReason == StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                rj.r.k().G(extras);
            }
            if (bi.h.a().D3() && isNewIntent) {
                z2(intent);
            }
        }
    }

    public final void r2() {
        ok.q.b("MainGameActivity", "... Hide the progress bar.");
        View view = this.splashScreen;
        if (view == null) {
            Intrinsics.u("splashScreen");
            view = null;
        }
        view.setVisibility(8);
    }

    @Keep
    public final void requestOrientationAsDefault() {
        ok.q.h("MainGameActivity", "requestOrientationAsDefault");
        runOnUiThread(new Runnable() { // from class: ik.c1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.E2(this.f19507a);
            }
        });
    }

    public final void s2() {
        ok.q.h("MainGameActivity", "Adding our custom loading view...");
        View viewFindViewById = findViewById(this.E);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Surface view not created or expected view hierarchy not matching.");
        }
        View viewInflate = getLayoutInflater().inflate(n0.b, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(m0.U);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("`loading_layout` not found in the `activity_game` layout");
        }
        viewFindViewById2.setVisibility(0);
        this.splashScreen = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(m0.f4169u0);
        if (viewFindViewById3 == null) {
            throw new IllegalStateException("`web_overlay_layout` not found in the `activity_game` layout");
        }
        this.webOverlayView = viewFindViewById3;
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(m0.T);
        if (viewStub == null) {
            throw new IllegalStateException("`loading_content_stub` not found in the `activity_game` layout");
        }
        View view = null;
        if (s2.b()) {
            View view2 = this.splashScreen;
            if (view2 == null) {
                Intrinsics.u("splashScreen");
                view2 = null;
            }
            view2.setBackgroundColor(-16777216);
        } else {
            LoadingBar loadingBar = (LoadingBar) viewStub.inflate().findViewById(m0.W);
            if (loadingBar == null) {
                throw new IllegalStateException("`loading_progress_view` not found in `loading_content_roblox`");
            }
            loadingBar.setVisibility(0);
            this.loadingView = loadingBar;
        }
        ui.a aVar = this.appInsetManager;
        View view3 = this.webOverlayView;
        if (view3 == null) {
            Intrinsics.u("webOverlayView");
        } else {
            view = view3;
        }
        aVar.g(view);
    }

    @Keep
    public final void showLeaveAppPrompt() {
        runOnUiThread(new Runnable() { // from class: ik.x0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.K2(this.f19623a);
            }
        });
    }

    @Override // com.google.androidgamesdk.GameActivity, android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.surfaceCreated(holder);
        this.inputAdapter.a(!isDestroyed());
    }

    @Override // com.google.androidgamesdk.GameActivity, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.inputAdapter.a(false);
        super.surfaceDestroyed(holder);
    }

    @Keep
    public final void syncCookiesFromEngine() {
        runOnUiThread(new Runnable() { // from class: ik.f1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.N2();
            }
        });
    }

    public final void t2() {
        if (f9321g0) {
            return;
        }
        f9321g0 = true;
        Context applicationContext = getApplicationContext();
        dj.g.b().i(a1.U(applicationContext).getBoolean("ROBLOXCrash", false));
        h0.INSTANCE.a().a().a(new a(applicationContext, this));
    }

    public final RbxKeyboard u2() {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) findViewById(m0.f4137e0);
        if (rbxKeyboard == null) {
            throw new IllegalStateException("`rbx_edit_text` not found. Was `inflateOverlayLayout` called?");
        }
        e.d(rbxKeyboard, this, "SourceSansPro-Regular.ttf");
        return rbxKeyboard;
    }

    public final void v2(String message) {
        if (isDestroyed()) {
            return;
        }
        new androidx.appcompat.app.a.C0021a(this).j(q0.f4279u, null).h(message).r();
    }

    public final boolean x2() {
        return this.startReason == StartedForEnum.PROTOCOL_LAUNCH;
    }

    public final void z2(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        String string = extras.getString("EXTRA_NOTIFICATION_TYPE", BuildConfig.FLAVOR);
        String string2 = extras.getString("EXTRA_NOTIFICATION_VERSION", BuildConfig.FLAVOR);
        Intrinsics.checkNotNull(string2);
        if (string2.length() == 0) {
            if (Intrinsics.c(string, "ChatNewMessage")) {
                u.c().i(extras.getString("EXTRA_CATEGORY", BuildConfig.FLAVOR));
            } else {
                u.c().d(string).clear();
                vj.h.g(intent, this);
            }
        }
        t0.r("clicked", new rj.x().a(this, "GcmPlatform"), string, extras.getString("EXTRA_NOTIFICATION_ID", BuildConfig.FLAVOR), w.a(this), true, string2, "startup", rj.w.a(intent));
        com.roblox.client.pushnotification.actions.a.a(this, intent, true);
    }
}
