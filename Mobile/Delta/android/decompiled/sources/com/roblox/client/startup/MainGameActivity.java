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
import com.google.androidgamesdk.GameActivity;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.components.LoadingBar;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.gloop.Loader;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import dh.e;
import eh.j;
import ek.t;
import ek.x;
import gt.h;
import gt.i;
import gt.n;
import gt.o;
import gt.r;
import iu.g1;
import iu.k;
import iu.l0;
import iu.p0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import nt.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rg.a1;
import rg.m0;
import rg.n0;
import rg.q0;
import rg.y;
import ti.g;
import uh.p;
import uh.q;
import yj.a0;
import yj.k0;
import yj.m2;
import yj.o0;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002£\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0006J\u0019\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u0010\u0006J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u0010\u0006J\u001f\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J-\u0010D\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u001b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0@2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0007H\u0007¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010K\u001a\u00020\u0007H\u0007¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0007H\u0007¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0007H\u0017¢\u0006\u0004\bM\u0010\u0006J\u001f\u0010P\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000bH\u0007¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0007¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u0007H\u0007¢\u0006\u0004\bS\u0010\u0006J\u001f\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u000bH\u0007¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0007H\u0007¢\u0006\u0004\b]\u0010\u0006J\u000f\u0010^\u001a\u00020\u0007H\u0007¢\u0006\u0004\b^\u0010\u0006J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u001bH\u0016¢\u0006\u0004\bf\u0010\u001eJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\bg\u0010#J\u000f\u0010h\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010\u0006R\u0017\u0010o\u001a\u00020j8\u0007¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010u\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010|\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0017\u0010\u0081\u0001\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bg\u0010{R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010y\u001a\u00020v*\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/roblox/client/startup/MainGameActivity;", "Lcom/google/androidgamesdk/GameActivity;", "Lcj/a;", "Luh/q;", "Lcom/roblox/client/startup/c$b;", "<init>", "()V", "", "r2", "Landroid/content/Intent;", "intent", "", "tag", "o2", "(Landroid/content/Intent;Ljava/lang/String;)V", "q2", "Lcom/roblox/client/RbxKeyboard;", "s2", "()Lcom/roblox/client/RbxKeyboard;", "C2", "", "visible", "K2", "(Z)V", "F2", "d2", "z2", "", "messageResourceId", "I2", "(I)V", "i2", "B2", "message", "t2", "(Ljava/lang/String;)V", "L2", "x2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "onNewIntent", "(Landroid/content/Intent;)V", "onStart", "onResume", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "surfaceDestroyed", "onPause", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "p2", "bootstrapTheApp", "requestOrientationAsDefault", "D", "url", Title.type, "openWebActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "syncCookiesFromEngine", "showLeaveAppPrompt", "", "userId", "productId", "promptNativePurchase", "(JLjava/lang/String;)V", "robloxNativeProductId", "payloadStr", "promptNativePurchaseWithPayload", "(JLjava/lang/String;Ljava/lang/String;)V", "I", "j2", "Lcom/roblox/client/b;", "q0", "()Lcom/roblox/client/b;", "Landroid/app/Activity;", "f0", "()Landroid/app/Activity;", "stringResourceId", "T", "V", "i", "M", "Lcom/roblox/client/startup/NativeHelper;", "Q", "Lcom/roblox/client/startup/NativeHelper;", "getNativeHelper", "()Lcom/roblox/client/startup/NativeHelper;", "nativeHelper", "Lki/a;", "R", "Lki/a;", "k2", "()Lki/a;", "appInsetManager", "Lcom/roblox/client/startup/StartedForEnum;", "S", "Lcom/roblox/client/startup/StartedForEnum;", "startReason", "Landroid/view/View;", "Landroid/view/View;", "splashScreen", "Lcom/roblox/client/components/LoadingBar;", "U", "Lcom/roblox/client/components/LoadingBar;", "loadingView", "webOverlayView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "W", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initParamsForEngineDone", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "X", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "iapPurchaseManager", "Lyj/o0;", "Y", "Lyj/o0;", "inputAdapter", "Lyj/a0;", "Z", "Lgt/h;", "l2", "()Lyj/a0;", "browserServiceAppAdapter", "Lvg/c;", "a0", "m2", "()Lvg/c;", "browserServiceBridge", "Lkl/d;", "b0", "Lkl/d;", "platformEmergencyObserver", "u2", "()Z", "isInForeground", "n2", "(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;", "c0", "Companion", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainGameActivity extends GameActivity implements cj.a, q, c.b {

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static boolean f9501d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f9502e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static boolean f9503f0;

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
    public kl.d platformEmergencyObserver;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final ki.a appInsetManager = new ki.a();

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
    public final h browserServiceAppAdapter = i.b(new Function0() { // from class: yj.w0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.f2(this.f36796a);
        }
    });

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h browserServiceBridge = i.b(new Function0() { // from class: yj.x0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.g2(this.f36806a);
        }
    });

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00118CX\u0083\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lcom/roblox/client/startup/MainGameActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "packageContext", "Lcom/roblox/client/startup/StartedForEnum;", "reason", "Landroid/content/Intent;", "e", "(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;", "Lcom/roblox/engine/jni/autovalue/InitParams;", "initParams", "", "f", "(Lcom/roblox/engine/jni/autovalue/InitParams;)V", "i", "", "assetPath", "j", "(Ljava/lang/String;)V", "overrides", "h", "", "usePersistentStorage", "g", "(Z)V", "getAppUpgradeKey", "()Ljava/lang/String;", "getAppUpgradeKey$annotations", "appUpgradeKey", "TAG", "Ljava/lang/String;", "STARTED_FOR_INTENT_KEY", "overrideFlagsAtStartupDone", "Z", "initialized", "inferredCrashMarkerInitialized", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/roblox/client/startup/MainGameActivity$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9506a;

        public a(Context context) {
            this.f9506a = context;
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
            SharedPreferences sharedPreferencesU = a1.U(this.f9506a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.putBoolean("ROBLOXCrash", true);
            editorEdit.apply();
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            SharedPreferences sharedPreferencesU = a1.U(this.f9506a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.remove("ROBLOXCrash");
            editorEdit.apply();
        }
    }

    @nt.f(c = "com.roblox.client.startup.MainGameActivity$updateNativeSettingsBeforeFlags$1", f = "MainGameActivity.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class b extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9507t;

        public b(lt.b<? super b> bVar) {
            super(2, bVar);
        }

        public static final void n(String str) {
            ek.c.f16131c.D(str);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return MainGameActivity.this.new b(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9507t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            ek.c.g().f(MainGameActivity.this.getApplicationContext(), new ek.a.InterfaceC0297a() { // from class: yj.f1
                @Override // ek.a.InterfaceC0297a
                public final void a(String str) {
                    MainGameActivity.b.n(str);
                }
            });
            return Unit.f22938a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainGameActivity() {
        l0 l0Var = null;
        this.nativeHelper = new NativeHelper(this, j.a(this), new sg.a(l0Var, null, null, null, 15, null), l0Var, 8, 0 == true ? 1 : 0);
    }

    public static final void A2(MainGameActivity mainGameActivity) {
        mainGameActivity.d2();
    }

    public static final void D2(MainGameActivity mainGameActivity) {
        mainGameActivity.m2().c();
    }

    public static final void E2(MainGameActivity mainGameActivity) {
        mainGameActivity.F2();
    }

    public static final void G2(final MainGameActivity mainGameActivity) {
        if (mainGameActivity.isDestroyed()) {
            return;
        }
        new d().c(mainGameActivity, new d.a() { // from class: yj.v0
            @Override // com.roblox.client.startup.d.a
            public final void a() {
                MainGameActivity.H2(this.f36793a);
            }
        });
    }

    public static final void H2(MainGameActivity mainGameActivity) {
        mainGameActivity.finish();
    }

    public static final void J2() {
        k0.T();
    }

    private final void d2() {
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

    public static final void e2(MainGameActivity mainGameActivity) {
        mainGameActivity.C2();
    }

    public static final a0 f2(MainGameActivity mainGameActivity) {
        return new a0(mainGameActivity, m0.f30466t0, null, null, 12, null);
    }

    public static final vg.c g2(MainGameActivity mainGameActivity) {
        return new vg.c(mainGameActivity.l2(), new Handler(Looper.getMainLooper()));
    }

    @Keep
    private static final String getAppUpgradeKey() {
        return INSTANCE.getAppUpgradeKey();
    }

    @NotNull
    public static final Intent h2(@NotNull Context context, @NotNull StartedForEnum startedForEnum) {
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

    private final boolean u2() {
        return a().getState().b(l.b.RESUMED);
    }

    public static final Unit v2(e.m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        ek.q.b("MainGameActivity", "onBackPressed: ... notify Lua of this BACK button.");
        NativeGLInterface.nativeHandleBackPressed();
        return Unit.f22938a;
    }

    public static final void w2(MainGameActivity mainGameActivity, String str, String str2) {
        rg.q.h(mainGameActivity, str, str2, false, true);
    }

    public static final CharSequence y2(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        return "\n\t" + ((String) rVar.a()) + " : " + ((Boolean) rVar.b()).booleanValue() + " => " + ((Boolean) rVar.c());
    }

    public final void B2() {
        K2(true);
        INSTANCE.i();
    }

    public final void C2() {
        ek.q.h("MainGameActivity", "Set up context and start to unpack assets:");
        kk.c.INSTANCE.c().r();
        runOnUiThread(new Runnable() { // from class: yj.d1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.D2(this.f36706a);
            }
        });
        if (!rh.h.a().o0()) {
            F2();
            return;
        }
        ek.q.h("MainGameActivity", "runAndWaitToUnpackAssets: check for platform emergency...");
        kl.d dVar = this.platformEmergencyObserver;
        if (dVar != null) {
            dVar.g(new Runnable() { // from class: yj.e1
                @Override // java.lang.Runnable
                public final void run() {
                    MainGameActivity.E2(this.f36709a);
                }
            });
        } else {
            F2();
        }
    }

    @Override // uh.q
    public void D() {
        d2();
    }

    public final synchronized void F2() {
        try {
            if (this.initParamsForEngineDone.compareAndSet(false, true)) {
                ek.q.h("MainGameActivity", "setInitParamsForEngine: initializing");
                NativeSettingsInterface.nativeSetDeviceInfo(p.c(this));
                InitParams.Builder builder = InitParams.builder();
                uh.f.d dVarB = p.b(this, this);
                builder.setPlatformParams(dVarB.b());
                INSTANCE.f(builder.setDeviceParams(dVarB.a()).setBaseURL(a1.g()).setUserAgent(a1.a1()).setIsTablet(a1.r0()).setIsPotato(a1.t0()).setIsVrDevice(a1.q0()).setPioneerPlaceId(0L).build());
            } else {
                ek.q.h("MainGameActivity", "setInitParamsForEngine: already initialized");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void I() {
        if (a1.q0()) {
            x.a(this, q0.S);
            finish();
        } else {
            K2(false);
            if (u2()) {
                I2(q0.S);
            }
        }
    }

    public final void I2(int messageResourceId) {
        LoggingProtocol.i("retry_during_splash", 0L, 2, null);
        c.y2(this, messageResourceId);
    }

    public final void K2(boolean visible) {
        if (a1.q0()) {
            ek.q.b("MainGameActivity", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        LoadingBar loadingBar = this.loadingView;
        if (loadingBar != null) {
            loadingBar.setVisibility(visible ? 0 : 8);
        }
    }

    public final void L2() {
        String strH;
        k.d(iu.q0.a(g1.b()), null, null, new b(null), 3, null);
        boolean zJ2 = rh.h.a().J2();
        if (zJ2) {
            LoggingProtocol.i("update_native_settings_begin", 0L, 2, null);
        }
        a1.W0();
        if (zJ2) {
            LoggingProtocol.i("update_native_settings_end", 0L, 2, null);
        }
        String strR = kk.c.INSTANCE.c().r();
        Companion companion = INSTANCE;
        companion.j(strR);
        if (rh.h.a().h6()) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FlagCacheUtils.a versionBCacheChannelMiss = FlagCacheUtils.getVersionBCacheChannelMiss(applicationContext);
            if (versionBCacheChannelMiss == null) {
                companion.g(rh.h.a().B1());
            } else {
                LoggingProtocol.m("vb_cache_" + versionBCacheChannelMiss.getValue(), null, 2, null);
            }
        }
        if (!mh.b.a() || (strH = new uj.a(getApplicationContext()).h()) == null) {
            return;
        }
        companion.h(strH);
    }

    @Override // com.roblox.client.startup.c.b
    public void M() {
        i2();
        B2();
    }

    @Override // cj.a
    public void T(int stringResourceId) {
        String string = getString(stringResourceId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        t2(string);
    }

    @Override // cj.a
    public void V(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        t2(message);
    }

    @Override // j.b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        Configuration configuration = newBase.getResources().getConfiguration();
        oi.f fVarD = oi.b.f().d(newBase);
        Intrinsics.checkNotNullExpressionValue(fVarD, "getDefaultLocaleValue(...)");
        oi.f fVarJ = oi.b.f().j();
        ek.q.b("rbx.locale", configuration.getClass().getSimpleName() + " -> Locale: base = " + configuration.getLocales().get(0) + "; default = " + fVarD.c() + "; user = " + (fVarJ != null ? fVarJ.c() : null));
        if (fVarJ != null) {
            fVarD = fVarJ;
        }
        Locale localeB = oi.b.b(fVarD.c());
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        super.attachBaseContext(newBase.createConfigurationContext(configuration));
        qh.i.b(this);
    }

    @Keep
    public final void bootstrapTheApp() {
        ek.q.h("MainGameActivity", "Unpack assets in a background thread.");
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: yj.c1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.e2(this.f36703a);
            }
        });
    }

    @Override // cj.a
    @NotNull
    public Activity f0() {
        return this;
    }

    @Keep
    @NotNull
    public final NativeHelper getNativeHelper() {
        return this.nativeHelper;
    }

    @Override // com.roblox.client.startup.c.b
    public void i() {
        i2();
        B2();
    }

    public final void i2() {
        c.v2(this);
    }

    public final void j2() {
        i2();
    }

    @NotNull
    /* JADX INFO: renamed from: k2, reason: from getter */
    public final ki.a getAppInsetManager() {
        return this.appInsetManager;
    }

    public final a0 l2() {
        return (a0) this.browserServiceAppAdapter.getValue();
    }

    public final vg.c m2() {
        return (vg.c) this.browserServiceBridge.getValue();
    }

    public final StartedForEnum n2(Intent intent) {
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

    public final void o2(Intent intent, String tag) {
        Bundle extras;
        StartedForEnum startedForEnumN2 = n2(intent);
        this.startReason = startedForEnumN2;
        ek.q.h("MainGameActivity", tag + ": Started for: " + startedForEnumN2);
        if (this.startReason != StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION || (extras = intent.getExtras()) == null) {
            return;
        }
        hj.r.k().G(extras);
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        kk.h.f22853a.d(newConfig);
        SystemThemeProtocol.f9902a.C();
        if (a1.l0()) {
            this.nativeHelper.g0();
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        ek.q.h("MainGameActivity", "onDestroy. isFinishing = " + isFinishing());
        m2().e();
        if (this.platformEmergencyObserver != null) {
            ek.q.h("MainGameActivity", "Detach platform emergency observer.");
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            kl.d dVar = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(dVar);
            platformSystemDialogHandler.detachObserver(dVar);
            this.platformEmergencyObserver = null;
        }
        super.onDestroy();
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return kk.h.f22853a.e(event) || super.onKeyDown(keyCode, event);
    }

    @Override // com.google.androidgamesdk.GameActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return kk.h.f22853a.f(event) || super.onKeyUp(keyCode, event);
    }

    @Override // e.p, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        o2(intent, "onNewIntent");
    }

    @Override // com.google.androidgamesdk.GameActivity, e4.q, android.app.Activity
    public void onPause() {
        View view;
        super.onPause();
        if (rh.h.a().O3() && (view = this.splashScreen) != null) {
            if (view == null) {
                Intrinsics.u("splashScreen");
                view = null;
            }
            if (view.getVisibility() == 0 && !isFinishing()) {
                ek.q.k("MainGameActivity", "onPause: MainGameActivity backgrounded before becoming interactive.");
                LoggingProtocol.i("startup_interrupted", 0L, 2, null);
            }
        }
        hm.a.j().b(hm.a.EnumC0345a.GAME);
    }

    @Override // e4.q, e.p, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        y.h().k().Q(requestCode, permissions, grantResults);
    }

    @Override // com.google.androidgamesdk.GameActivity, e4.q, android.app.Activity
    public void onResume() {
        ek.q.h("MainGameActivity", "onResume:");
        super.onResume();
        hj.r.k().s(this);
        z2();
        if (this.startReason == StartedForEnum.PROTOCOL_LAUNCH && com.roblox.client.startup.a.m()) {
            im.f.F().v();
        }
        if (ti.h.e().f()) {
            ek.q.h("MainGameActivity", "onResume: ... (Logged in) Try to grant pending purchases.");
            IAPPurchaseManager.M(this, true);
        }
        if (t.e()) {
            y.h().e().x(this);
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        f9502e0 = true;
        hm.a.j().f();
    }

    @Keep
    public final void openWebActivity(@NotNull final String url, @NotNull final String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        ek.q.h("MainGameActivity", "openWebActivity: url = " + url + ", title = " + title);
        runOnUiThread(new Runnable() { // from class: yj.a1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.w2(this.f36698a, url, title);
            }
        });
    }

    public final void p2() {
        ek.q.b("MainGameActivity", "... Hide the progress bar.");
        View view = this.splashScreen;
        if (view == null) {
            Intrinsics.u("splashScreen");
            view = null;
        }
        view.setVisibility(8);
    }

    @Keep
    public final void promptNativePurchase(long userId, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        ek.q.h("MainGameActivity", "promptNativePurchase: userId = " + userId + ", productId = " + productId);
        this.iapPurchaseManager.F(userId, productId);
    }

    @Keep
    public final void promptNativePurchaseWithPayload(long userId, @NotNull String robloxNativeProductId, @Nullable String payloadStr) {
        Intrinsics.checkNotNullParameter(robloxNativeProductId, "robloxNativeProductId");
        ek.q.h("MainGameActivity", "promptNativePurchaseWithPayload: userId = " + userId + ", roblox-native-productId = " + robloxNativeProductId);
        this.iapPurchaseManager.I(userId, robloxNativeProductId, payloadStr);
    }

    @Override // cj.a
    @Nullable
    public com.roblox.client.b q0() {
        return null;
    }

    public final void q2() {
        ek.q.h("MainGameActivity", "Adding our custom loading view...");
        View viewFindViewById = findViewById(this.E);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Surface view not created or expected view hierarchy not matching.");
        }
        View viewInflate = getLayoutInflater().inflate(n0.b, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(m0.T);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("`loading_layout` not found in the `activity_game` layout");
        }
        viewFindViewById2.setVisibility(0);
        this.splashScreen = viewFindViewById2;
        View viewFindViewById3 = viewInflate.findViewById(m0.f30466t0);
        if (viewFindViewById3 == null) {
            throw new IllegalStateException("`web_overlay_layout` not found in the `activity_game` layout");
        }
        this.webOverlayView = viewFindViewById3;
        ViewStub viewStub = (ViewStub) viewInflate.findViewById(m0.S);
        if (viewStub == null) {
            throw new IllegalStateException("`loading_content_stub` not found in the `activity_game` layout");
        }
        View view = null;
        if (m2.b()) {
            View view2 = this.splashScreen;
            if (view2 == null) {
                Intrinsics.u("splashScreen");
                view2 = null;
            }
            view2.setBackgroundColor(-16777216);
        } else {
            LoadingBar loadingBar = (LoadingBar) viewStub.inflate().findViewById(m0.V);
            if (loadingBar == null) {
                throw new IllegalStateException("`loading_progress_view` not found in `loading_content_roblox`");
            }
            loadingBar.setVisibility(0);
            this.loadingView = loadingBar;
        }
        ki.a aVar = this.appInsetManager;
        View view3 = this.webOverlayView;
        if (view3 == null) {
            Intrinsics.u("webOverlayView");
        } else {
            view = view3;
        }
        aVar.e(view);
    }

    public final void r2() {
        if (f9503f0) {
            return;
        }
        f9503f0 = true;
        Context applicationContext = getApplicationContext();
        g.b().i(a1.U(applicationContext).getBoolean("ROBLOXCrash", false));
        h0.INSTANCE.a().a().a(new a(applicationContext));
    }

    @Keep
    public final void requestOrientationAsDefault() {
        ek.q.h("MainGameActivity", "requestOrientationAsDefault");
        runOnUiThread(new Runnable() { // from class: yj.y0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.A2(this.f36808a);
            }
        });
    }

    public final RbxKeyboard s2() {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) findViewById(m0.f30432c0);
        if (rbxKeyboard == null) {
            throw new IllegalStateException("`rbx_edit_text` not found. Was `inflateOverlayLayout` called?");
        }
        e.d(rbxKeyboard, this, "SourceSansPro-Regular.ttf");
        return rbxKeyboard;
    }

    @Keep
    public final void showLeaveAppPrompt() {
        runOnUiThread(new Runnable() { // from class: yj.t0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.G2(this.f36788a);
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
        runOnUiThread(new Runnable() { // from class: yj.b1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.J2();
            }
        });
    }

    public final void t2(String message) {
        if (isDestroyed()) {
            return;
        }
        new androidx.appcompat.app.a.C0009a(this).j(q0.f30577u, null).h(message).r();
    }

    public final void x2() {
        if (f9501d0) {
            return;
        }
        f9501d0 = true;
        List listK = kotlin.collections.p.k();
        ek.q.b("MainGameActivity", "overrideFlagsAtStartup: count = " + listK.size());
        List<String> list = listK;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (String str : list) {
            com.roblox.client.flags.a aVarP0 = rh.h.a().P0(str);
            if (aVarP0 == null) {
                throw new IllegalStateException(("Flag " + str + " is not found.").toString());
            }
            if (aVarP0.a()) {
                throw new IllegalStateException(("Flag " + str + " is cached and not supported.").toString());
            }
            com.roblox.client.flags.a.C0140a c0140a = aVarP0 instanceof com.roblox.client.flags.a.C0140a ? (com.roblox.client.flags.a.C0140a) aVarP0 : null;
            if (c0140a == null) {
                throw new IllegalStateException(("Flag " + str + " is not a boolean flag.").toString());
            }
            Boolean boolK = c0140a.k();
            Intrinsics.checkNotNullExpressionValue(boolK, "valueOf(...)");
            boolK.booleanValue();
            c0140a.g(Boolean.TRUE);
            arrayList.add(new r(str, boolK, c0140a.k()));
        }
        ek.q.h("MainGameActivity", CollectionsKt.m0(arrayList, null, "overrideFlagsAtStartup:", null, 0, null, new Function1() { // from class: yj.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.y2((gt.r) obj);
            }
        }, 29, null));
    }

    public final void z2() {
        Bundle bundleI = hj.r.k().i();
        if (bundleI == null) {
            return;
        }
        ek.q.h("MainGameActivity", "processPushNotification: Handle notifications using Linking...");
        if (hj.r.k().t(bundleI)) {
            return;
        }
        ek.q.k("MainGameActivity", "processPushNotification: Handle legacy push notifications...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.androidgamesdk.GameActivity, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Loader.get().startLib(this);
        ek.q.h("MainGameActivity", "onCreate");
        p0 p0Var = null;
        Object[] objArr = 0;
        if (f9502e0) {
            LoggingProtocol.i("process_reuse", 0L, 2, null);
        }
        hm.a.c(this);
        hm.a.j().a(hm.a.EnumC0345a.GAME, savedInstanceState);
        LoggingProtocol.i("main_activity_oncreate", 0L, 2, null);
        x2();
        if (rh.h.a().L1()) {
            dj.a0.R(this);
        } else {
            dj.m.F0(this);
        }
        e.x.c(this, null, null, 3, null);
        ti.b.f().l(this);
        L2();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        o2(intent, "onCreate");
        if (rh.h.a().i0()) {
            Toast.makeText(this, "Using GameActivity (for QA)", 0).show();
        }
        int i10 = 1;
        if (ti.h.e().i()) {
            String strValueOf = String.valueOf(ti.h.e().g());
            ArrayList arrayList = new ArrayList(hj.r.l());
            arrayList.add(new NameValuePair("recipient_user_id", strValueOf));
            ug.m.c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        if (rh.h.a().o0()) {
            ek.q.h("MainGameActivity", "Attach platform emergency observer.");
            if (this.platformEmergencyObserver == null) {
                this.platformEmergencyObserver = new kl.d(p0Var, i10, objArr == true ? 1 : 0);
            }
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            kl.d dVar = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(dVar);
            platformSystemDialogHandler.attachObserver(dVar);
            platformSystemDialogHandler.setActivity(this);
        }
        super.onCreate(savedInstanceState);
        kk.h hVar = kk.h.f22853a;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        hVar.c(configuration);
        q2();
        GameActivity.d dVar2 = this.H;
        if (dVar2 == null) {
            throw new IllegalStateException("GameActivity SurfaceView failed to initialize");
        }
        this.nativeHelper.n0(this.E, dVar2, s2(), this.inputAdapter);
        e.q0.b(P(), null, false, new Function1() { // from class: yj.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.v2((e.m0) obj);
            }
        }, 3, null);
        r2();
    }
}
