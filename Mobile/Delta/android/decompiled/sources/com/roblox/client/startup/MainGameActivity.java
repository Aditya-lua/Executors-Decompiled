package com.roblox.client.startup;

import ak.a0;
import ak.k0;
import ak.o0;
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
import e.x;
import eh.e;
import fh.j;
import gk.p;
import gk.w;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import jt.h;
import jt.i;
import jt.n;
import jt.o;
import jt.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.k;
import ku.l0;
import ku.p0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pt.m;
import sg.a1;
import sg.m0;
import sg.n0;
import sg.q0;
import sg.y;
import vi.g;
import wh.q;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002£\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0006J\u0019\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u0010\u0006J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u0010\u0006J\u001f\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J-\u0010D\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u001b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0@2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0007H\u0007¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010K\u001a\u00020\u0007H\u0007¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0007H\u0007¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0007H\u0017¢\u0006\u0004\bM\u0010\u0006J\u001f\u0010P\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000bH\u0007¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0007¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u0007H\u0007¢\u0006\u0004\bS\u0010\u0006J\u001f\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u000bH\u0007¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0007H\u0007¢\u0006\u0004\b]\u0010\u0006J\u000f\u0010^\u001a\u00020\u0007H\u0007¢\u0006\u0004\b^\u0010\u0006J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u001bH\u0016¢\u0006\u0004\bf\u0010\u001eJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\bg\u0010#J\u000f\u0010h\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010\u0006R\u0017\u0010o\u001a\u00020j8\u0007¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010u\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010y\u001a\u00020v*\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/roblox/client/startup/MainGameActivity;", "Lcom/google/androidgamesdk/GameActivity;", "Lej/a;", "Lwh/q;", "Lcom/roblox/client/startup/c$b;", "<init>", "()V", "", "q2", "Landroid/content/Intent;", "intent", "", "tag", "n2", "(Landroid/content/Intent;Ljava/lang/String;)V", "p2", "Lcom/roblox/client/RbxKeyboard;", "r2", "()Lcom/roblox/client/RbxKeyboard;", "B2", "", "visible", "J2", "(Z)V", "E2", "c2", "y2", "", "messageResourceId", "H2", "(I)V", "h2", "A2", "message", "s2", "(Ljava/lang/String;)V", "K2", "w2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "onNewIntent", "(Landroid/content/Intent;)V", "onStart", "onResume", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "surfaceDestroyed", "onPause", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", "event", "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "o2", "bootstrapTheApp", "requestOrientationAsDefault", "E", "url", Title.type, "openWebActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "syncCookiesFromEngine", "showLeaveAppPrompt", "", "userId", "productId", "promptNativePurchase", "(JLjava/lang/String;)V", "robloxNativeProductId", "payloadStr", "promptNativePurchaseWithPayload", "(JLjava/lang/String;Ljava/lang/String;)V", "J", "i2", "Lcom/roblox/client/b;", "q0", "()Lcom/roblox/client/b;", "Landroid/app/Activity;", "f0", "()Landroid/app/Activity;", "stringResourceId", "U", "W", "i", "N", "Lcom/roblox/client/startup/NativeHelper;", "Q", "Lcom/roblox/client/startup/NativeHelper;", "getNativeHelper", "()Lcom/roblox/client/startup/NativeHelper;", "nativeHelper", "Lmi/a;", "R", "Lmi/a;", "j2", "()Lmi/a;", "appInsetManager", "Lcom/roblox/client/startup/StartedForEnum;", "S", "Lcom/roblox/client/startup/StartedForEnum;", "startReason", "Landroid/view/View;", "T", "Landroid/view/View;", "splashScreen", "Lcom/roblox/client/components/LoadingBar;", "Lcom/roblox/client/components/LoadingBar;", "loadingView", "V", "webOverlayView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initParamsForEngineDone", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "X", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "iapPurchaseManager", "Lak/o0;", "Y", "Lak/o0;", "inputAdapter", "Lak/a0;", "Z", "Ljt/h;", "k2", "()Lak/a0;", "browserServiceAppAdapter", "Lwg/c;", "a0", "l2", "()Lwg/c;", "browserServiceBridge", "Lml/d;", "b0", "Lml/d;", "platformEmergencyObserver", "t2", "()Z", "isInForeground", "m2", "(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;", "c0", "Companion", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MainGameActivity extends GameActivity implements ej.a, q, c.b {

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static boolean f9422d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static boolean f9423e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static boolean f9424f0;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public final NativeHelper nativeHelper;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public View splashScreen;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public LoadingBar loadingView;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public View webOverlayView;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ml.d platformEmergencyObserver;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final mi.a appInsetManager = new mi.a();

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
    public final h browserServiceAppAdapter = i.b(new Function0() { // from class: ak.w0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.e2(this.f651a);
        }
    });

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final h browserServiceBridge = i.b(new Function0() { // from class: ak.x0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.f2(this.f661a);
        }
    });

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\u00118CX\u0083\u0004¢\u0006\f\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lcom/roblox/client/startup/MainGameActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "packageContext", "Lcom/roblox/client/startup/StartedForEnum;", "reason", "Landroid/content/Intent;", "d", "(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;", "Lcom/roblox/engine/jni/autovalue/InitParams;", "initParams", "", "e", "(Lcom/roblox/engine/jni/autovalue/InitParams;)V", "g", "", "assetPath", "h", "(Ljava/lang/String;)V", "overrides", "f", "getAppUpgradeKey", "()Ljava/lang/String;", "getAppUpgradeKey$annotations", "appUpgradeKey", "TAG", "Ljava/lang/String;", "STARTED_FOR_INTENT_KEY", "", "overrideFlagsAtStartupDone", "Z", "initialized", "inferredCrashMarkerInitialized", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public final Intent d(@NotNull Context packageContext, @NotNull StartedForEnum reason) {
            Intrinsics.checkNotNullParameter(packageContext, "packageContext");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intent intentPutExtra = new Intent(packageContext, (Class<?>) MainGameActivity.class).putExtra("STARTED_FOR_INTENT_KEY", reason);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final void e(@Nullable InitParams initParams) {
            MainGameActivity.nativeAppBridgeSetInitParams(initParams);
        }

        public final void f(String overrides) {
            MainGameActivity.nativePreloadFlagOverrides(overrides);
        }

        public final void g() {
            MainGameActivity.nativeRetryInit();
        }

        public final void h(String assetPath) {
            MainGameActivity.nativeSetAssetPath(assetPath);
        }

        public Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"com/roblox/client/startup/MainGameActivity$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f9427a;

        public a(Context context) {
            this.f9427a = context;
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
            SharedPreferences sharedPreferencesU = a1.U(this.f9427a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.putBoolean("ROBLOXCrash", true);
            editorEdit.apply();
        }

        @Override // androidx.p000lifecycle.f
        public void onStop(s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            SharedPreferences sharedPreferencesU = a1.U(this.f9427a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesU, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesU.edit();
            editorEdit.remove("ROBLOXCrash");
            editorEdit.apply();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.startup.MainGameActivity$updateNativeSettingsBeforeFlags$1", f = "MainGameActivity.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9428t;

        public b(nt.b<? super b> bVar) {
            super(2, bVar);
        }

        public static final void r(String str) {
            gk.c.f18233c.D(str);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return MainGameActivity.this.new b(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9428t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            gk.c.g().f(MainGameActivity.this.getApplicationContext(), new gk.a.InterfaceC0327a() { // from class: ak.f1
                @Override // gk.a.InterfaceC0327a
                public final void a(String str) {
                    MainGameActivity.b.r(str);
                }
            });
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((b) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MainGameActivity() {
        l0 l0Var = null;
        this.nativeHelper = new NativeHelper(this, j.a(this), new tg.a(l0Var, null, null, null, 15, null), l0Var, 8, 0 == true ? 1 : 0);
    }

    public static final void C2(MainGameActivity mainGameActivity) {
        mainGameActivity.l2().c();
    }

    public static final void D2(MainGameActivity mainGameActivity) {
        mainGameActivity.E2();
    }

    public static final void F2(final MainGameActivity mainGameActivity) {
        if (mainGameActivity.isDestroyed()) {
            return;
        }
        new d().c(mainGameActivity, new d.a() { // from class: ak.v0
            @Override // com.roblox.client.startup.d.a
            public final void a() {
                MainGameActivity.G2(this.f648a);
            }
        });
    }

    public static final void G2(MainGameActivity mainGameActivity) {
        mainGameActivity.finish();
    }

    public static final void I2() {
        k0.T();
    }

    private final void c2() {
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

    public static final void d2(MainGameActivity mainGameActivity) {
        mainGameActivity.B2();
    }

    public static final a0 e2(MainGameActivity mainGameActivity) {
        return new a0(mainGameActivity, m0.f30861s0, null, null, 12, null);
    }

    public static final wg.c f2(MainGameActivity mainGameActivity) {
        return new wg.c(mainGameActivity.k2(), new Handler(Looper.getMainLooper()));
    }

    @NotNull
    public static final Intent g2(@NotNull Context context, @NotNull StartedForEnum startedForEnum) {
        return INSTANCE.d(context, startedForEnum);
    }

    @Keep
    private static final String getAppUpgradeKey() {
        return INSTANCE.getAppUpgradeKey();
    }

    public static final native void nativeAppBridgeSetInitParams(@Nullable InitParams initParams);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativePreloadFlagOverrides(String str);

    public static final native void nativeRetryInit();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetAssetPath(String str);

    private final boolean t2() {
        return a().getState().b(l.b.RESUMED);
    }

    public static final Unit u2(e.m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        p.b("MainGameActivity", "onBackPressed: ... notify Lua of this BACK button.");
        NativeGLInterface.nativeHandleBackPressed();
        return Unit.f22483a;
    }

    public static final void v2(MainGameActivity mainGameActivity, String str, String str2) {
        sg.q.h(mainGameActivity, str, str2, false, true);
    }

    public static final CharSequence x2(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
        return "\n\t" + ((String) rVar.a()) + " : " + ((Boolean) rVar.b()).booleanValue() + " => " + ((Boolean) rVar.c());
    }

    public static final void z2(MainGameActivity mainGameActivity) {
        mainGameActivity.c2();
    }

    public final void A2() {
        J2(true);
        INSTANCE.g();
    }

    public final void B2() {
        p.h("MainGameActivity", "Set up context and start to unpack assets:");
        mk.c.INSTANCE.c().r();
        runOnUiThread(new Runnable() { // from class: ak.d1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.C2(this.f562a);
            }
        });
        if (!th.h.a().j0()) {
            E2();
            return;
        }
        p.h("MainGameActivity", "runAndWaitToUnpackAssets: check for platform emergency...");
        ml.d dVar = this.platformEmergencyObserver;
        if (dVar != null) {
            dVar.g(new Runnable() { // from class: ak.e1
                @Override // java.lang.Runnable
                public final void run() {
                    MainGameActivity.D2(this.f565a);
                }
            });
        } else {
            E2();
        }
    }

    @Override // wh.q
    public void E() {
        c2();
    }

    public final synchronized void E2() {
        try {
            if (this.initParamsForEngineDone.compareAndSet(false, true)) {
                p.h("MainGameActivity", "setInitParamsForEngine: initializing");
                NativeSettingsInterface.nativeSetDeviceInfo(wh.p.c(this));
                InitParams.Builder builder = InitParams.builder();
                wh.f.d dVarB = wh.p.b(this, this);
                builder.setPlatformParams(dVarB.b());
                INSTANCE.e(builder.setDeviceParams(dVarB.a()).setBaseURL(a1.g()).setUserAgent(a1.Z0()).setIsTablet(a1.r0()).setIsPotato(a1.t0()).setIsVrDevice(a1.q0()).build());
            } else {
                p.h("MainGameActivity", "setInitParamsForEngine: already initialized");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void H2(int messageResourceId) {
        LoggingProtocol.i("retry_during_splash", 0L, 2, null);
        c.y2(this, messageResourceId);
    }

    public final void J() {
        if (a1.q0()) {
            w.a(this, q0.S);
            finish();
        } else {
            J2(false);
            if (t2()) {
                H2(q0.S);
            }
        }
    }

    public final void J2(boolean visible) {
        if (a1.q0()) {
            p.b("MainGameActivity", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        LoadingBar loadingBar = this.loadingView;
        if (loadingBar == null) {
            Intrinsics.u("loadingView");
            loadingBar = null;
        }
        loadingBar.setVisibility(visible ? 0 : 8);
    }

    public final void K2() {
        String strH;
        k.d(ku.q0.a(g1.b()), null, null, new b(null), 3, null);
        boolean zY2 = th.h.a().y2();
        if (zY2) {
            LoggingProtocol.i("update_native_settings_begin", 0L, 2, null);
        }
        a1.V0();
        if (zY2) {
            LoggingProtocol.i("update_native_settings_end", 0L, 2, null);
        }
        String strR = mk.c.INSTANCE.c().r();
        Companion companion = INSTANCE;
        companion.h(strR);
        if (!nh.b.a() || (strH = new wj.a(getApplicationContext()).h()) == null) {
            return;
        }
        companion.f(strH);
    }

    @Override // com.roblox.client.startup.c.b
    public void N() {
        h2();
        A2();
    }

    @Override // ej.a
    public void U(int stringResourceId) {
        String string = getString(stringResourceId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        s2(string);
    }

    @Override // ej.a
    public void W(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        s2(message);
    }

    @Override // j.b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        Configuration configuration = newBase.getResources().getConfiguration();
        qi.f fVarD = qi.b.f().d(newBase);
        Intrinsics.checkNotNullExpressionValue(fVarD, "getDefaultLocaleValue(...)");
        qi.f fVarJ = qi.b.f().j();
        p.b("rbx.locale", configuration.getClass().getSimpleName() + " -> Locale: base = " + configuration.getLocales().get(0) + "; default = " + fVarD.c() + "; user = " + (fVarJ != null ? fVarJ.c() : null));
        if (fVarJ != null) {
            fVarD = fVarJ;
        }
        Locale localeB = qi.b.b(fVarD.c());
        configuration.setLocale(localeB);
        configuration.setLayoutDirection(localeB);
        super.attachBaseContext(newBase.createConfigurationContext(configuration));
        sh.i.b(this);
    }

    @Keep
    public final void bootstrapTheApp() {
        p.h("MainGameActivity", "Unpack assets in a background thread.");
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ak.c1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.d2(this.f559a);
            }
        });
    }

    @Override // ej.a
    @NotNull
    public Activity f0() {
        return this;
    }

    @Keep
    @NotNull
    public final NativeHelper getNativeHelper() {
        return this.nativeHelper;
    }

    public final void h2() {
        c.v2(this);
    }

    @Override // com.roblox.client.startup.c.b
    public void i() {
        h2();
        A2();
    }

    public final void i2() {
        h2();
    }

    @NotNull
    /* JADX INFO: renamed from: j2, reason: from getter */
    public final mi.a getAppInsetManager() {
        return this.appInsetManager;
    }

    public final a0 k2() {
        return (a0) this.browserServiceAppAdapter.getValue();
    }

    public final wg.c l2() {
        return (wg.c) this.browserServiceBridge.getValue();
    }

    public final StartedForEnum m2(Intent intent) {
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

    public final void n2(Intent intent, String tag) {
        Bundle extras;
        StartedForEnum startedForEnumM2 = m2(intent);
        this.startReason = startedForEnumM2;
        p.h("MainGameActivity", tag + ": Started for: " + startedForEnumM2);
        if (this.startReason != StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION || (extras = intent.getExtras()) == null) {
            return;
        }
        jj.r.k().G(extras);
    }

    public final void o2() {
        p.b("MainGameActivity", "... Hide the progress bar.");
        View view = this.splashScreen;
        if (view == null) {
            Intrinsics.u("splashScreen");
            view = null;
        }
        view.setVisibility(8);
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e.p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        mk.h.f24374a.d(newConfig);
        SystemThemeProtocol.f9821a.C();
        if (a1.l0()) {
            this.nativeHelper.g0();
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e4.q, android.app.Activity
    public void onDestroy() {
        p.h("MainGameActivity", "onDestroy. isFinishing = " + isFinishing());
        l2().e();
        if (this.platformEmergencyObserver != null) {
            p.h("MainGameActivity", "Detach platform emergency observer.");
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            ml.d dVar = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(dVar);
            platformSystemDialogHandler.detachObserver(dVar);
            this.platformEmergencyObserver = null;
        }
        super.onDestroy();
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return mk.h.f24374a.e(event) || super.onKeyDown(keyCode, event);
    }

    @Override // com.google.androidgamesdk.GameActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return mk.h.f24374a.f(event) || super.onKeyUp(keyCode, event);
    }

    @Override // e.p, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        n2(intent, "onNewIntent");
    }

    @Override // com.google.androidgamesdk.GameActivity, e4.q, android.app.Activity
    public void onPause() {
        View view;
        super.onPause();
        if (th.h.a().C3() && (view = this.splashScreen) != null) {
            if (view == null) {
                Intrinsics.u("splashScreen");
                view = null;
            }
            if (view.getVisibility() == 0 && !isFinishing()) {
                p.k("MainGameActivity", "onPause: MainGameActivity backgrounded before becoming interactive.");
                LoggingProtocol.i("startup_interrupted", 0L, 2, null);
            }
        }
        jm.a.j().b(jm.a.EnumC0382a.GAME);
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
        p.h("MainGameActivity", "onResume:");
        super.onResume();
        jj.r.k().s(this);
        y2();
        if (this.startReason == StartedForEnum.PROTOCOL_LAUNCH && com.roblox.client.startup.a.m()) {
            km.f.v().m();
        }
        if (vi.h.e().f()) {
            p.h("MainGameActivity", "onResume: ... (Logged in) Try to grant pending purchases.");
            IAPPurchaseManager.D(this, true);
        }
        if (gk.s.e()) {
            y.h().e().x(this);
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, j.b, e4.q, android.app.Activity
    public void onStart() {
        super.onStart();
        f9423e0 = true;
        jm.a.j().f();
    }

    @Keep
    public final void openWebActivity(@NotNull final String url, @NotNull final String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        p.h("MainGameActivity", "openWebActivity: url = " + url + ", title = " + title);
        runOnUiThread(new Runnable() { // from class: ak.a1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.v2(this.f554a, url, title);
            }
        });
    }

    public final void p2() {
        p.h("MainGameActivity", "Adding our custom loading view...");
        View viewFindViewById = findViewById(this.E);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Surface view not created or expected view hierarchy not matching.");
        }
        View viewInflate = getLayoutInflater().inflate(n0.b, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(m0.S);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("`loading_layout` not found in the `activity_game` layout");
        }
        viewFindViewById2.setVisibility(0);
        this.splashScreen = viewFindViewById2;
        LoadingBar loadingBar = (LoadingBar) viewInflate.findViewById(m0.U);
        if (loadingBar == null) {
            throw new IllegalStateException("`loading_progress_view` not found in the `activity_game` layout");
        }
        loadingBar.setVisibility(0);
        this.loadingView = loadingBar;
        View viewFindViewById3 = viewInflate.findViewById(m0.f30861s0);
        if (viewFindViewById3 == null) {
            throw new IllegalStateException("`web_overlay_layout` not found in the `activity_game` layout");
        }
        this.webOverlayView = viewFindViewById3;
        this.appInsetManager.e(viewFindViewById3);
    }

    @Keep
    public final void promptNativePurchase(long userId, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        p.h("MainGameActivity", "promptNativePurchase: userId = " + userId + ", productId = " + productId);
        this.iapPurchaseManager.y(userId, productId);
    }

    @Keep
    public final void promptNativePurchaseWithPayload(long userId, @NotNull String robloxNativeProductId, @Nullable String payloadStr) {
        Intrinsics.checkNotNullParameter(robloxNativeProductId, "robloxNativeProductId");
        p.h("MainGameActivity", "promptNativePurchaseWithPayload: userId = " + userId + ", roblox-native-productId = " + robloxNativeProductId);
        this.iapPurchaseManager.A(userId, robloxNativeProductId, payloadStr);
    }

    @Override // ej.a
    @Nullable
    public com.roblox.client.b q0() {
        return null;
    }

    public final void q2() {
        if (f9424f0) {
            return;
        }
        f9424f0 = true;
        Context applicationContext = getApplicationContext();
        g.b().i(a1.U(applicationContext).getBoolean("ROBLOXCrash", false));
        h0.INSTANCE.a().a().a(new a(applicationContext));
    }

    public final RbxKeyboard r2() {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) findViewById(m0.f30827b0);
        if (rbxKeyboard == null) {
            throw new IllegalStateException("`rbx_edit_text` not found. Was `inflateOverlayLayout` called?");
        }
        e.d(rbxKeyboard, this, "SourceSansPro-Regular.ttf");
        return rbxKeyboard;
    }

    @Keep
    public final void requestOrientationAsDefault() {
        p.h("MainGameActivity", "requestOrientationAsDefault");
        runOnUiThread(new Runnable() { // from class: ak.y0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.z2(this.f663a);
            }
        });
    }

    public final void s2(String message) {
        if (isDestroyed()) {
            return;
        }
        new androidx.appcompat.app.a.C0013a(this).j(q0.f30972u, null).h(message).r();
    }

    @Keep
    public final void showLeaveAppPrompt() {
        runOnUiThread(new Runnable() { // from class: ak.t0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.F2(this.f643a);
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
        runOnUiThread(new Runnable() { // from class: ak.b1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.I2();
            }
        });
    }

    public final void w2() {
        if (f9422d0) {
            return;
        }
        f9422d0 = true;
        List listK = kotlin.collections.p.k();
        p.b("MainGameActivity", "overrideFlagsAtStartup: count = " + listK.size());
        List<String> list = listK;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(list, 10));
        for (String str : list) {
            com.roblox.client.flags.a aVarK0 = th.h.a().K0(str);
            if (aVarK0 == null) {
                throw new IllegalStateException(("Flag " + str + " is not found.").toString());
            }
            if (aVarK0.a()) {
                throw new IllegalStateException(("Flag " + str + " is cached and not supported.").toString());
            }
            com.roblox.client.flags.a.C0137a c0137a = aVarK0 instanceof com.roblox.client.flags.a.C0137a ? (com.roblox.client.flags.a.C0137a) aVarK0 : null;
            if (c0137a == null) {
                throw new IllegalStateException(("Flag " + str + " is not a boolean flag.").toString());
            }
            Boolean boolK = c0137a.k();
            Intrinsics.checkNotNullExpressionValue(boolK, "valueOf(...)");
            boolK.booleanValue();
            c0137a.g(Boolean.TRUE);
            arrayList.add(new r(str, boolK, c0137a.k()));
        }
        p.h("MainGameActivity", CollectionsKt.m0(arrayList, null, "overrideFlagsAtStartup:", null, 0, null, new Function1() { // from class: ak.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.x2((jt.r) obj);
            }
        }, 29, null));
    }

    public final void y2() {
        Bundle bundleI = jj.r.k().i();
        if (bundleI == null) {
            return;
        }
        p.h("MainGameActivity", "processPushNotification: Handle notifications using Linking...");
        if (jj.r.k().t(bundleI)) {
            return;
        }
        p.k("MainGameActivity", "processPushNotification: Handle legacy push notifications...");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.androidgamesdk.GameActivity, e4.q, e.p, k2.g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Loader.get().startLib(this);
        p.h("MainGameActivity", "onCreate");
        p0 p0Var = null;
        Object[] objArr = 0;
        if (f9423e0) {
            LoggingProtocol.i("process_reuse", 0L, 2, null);
        }
        jm.a.c(this);
        jm.a.j().a(jm.a.EnumC0382a.GAME, savedInstanceState);
        LoggingProtocol.i("main_activity_oncreate", 0L, 2, null);
        w2();
        if (th.h.a().B1()) {
            fj.a0.R(this);
        } else {
            fj.m.F0(this);
        }
        x.c(this, null, null, 3, null);
        vi.b.f().l(this);
        K2();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        n2(intent, "onCreate");
        if (th.h.a().d0()) {
            Toast.makeText(this, "Using GameActivity (for QA)", 0).show();
        }
        int i10 = 1;
        if (vi.h.e().i()) {
            String strValueOf = String.valueOf(vi.h.e().g());
            ArrayList arrayList = new ArrayList(jj.r.l());
            arrayList.add(new NameValuePair("recipient_user_id", strValueOf));
            vg.m.c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        if (th.h.a().j0()) {
            p.h("MainGameActivity", "Attach platform emergency observer.");
            if (this.platformEmergencyObserver == null) {
                this.platformEmergencyObserver = new ml.d(p0Var, i10, objArr == true ? 1 : 0);
            }
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            ml.d dVar = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(dVar);
            platformSystemDialogHandler.attachObserver(dVar);
            platformSystemDialogHandler.setActivity(this);
        }
        super.onCreate(savedInstanceState);
        mk.h hVar = mk.h.f24374a;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        hVar.c(configuration);
        p2();
        GameActivity.d dVar2 = this.H;
        if (dVar2 == null) {
            throw new IllegalStateException("GameActivity SurfaceView failed to initialize");
        }
        this.nativeHelper.n0(this.E, dVar2, r2(), this.inputAdapter);
        e.q0.b(Q(), null, false, new Function1() { // from class: ak.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.u2((e.m0) obj);
            }
        }, 3, null);
        q2();
    }
}
