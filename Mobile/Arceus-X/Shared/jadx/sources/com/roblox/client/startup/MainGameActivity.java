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
import android.widget.Toast;
import androidx.annotation.Keep;
import androidx.appcompat.app.DialogInterfaceC0408a;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.C0959h0;
import androidx.p616lifecycle.InterfaceC0954f;
import androidx.p616lifecycle.InterfaceC0980s;
import com.axjava.Main;
import com.google.androidgamesdk.GameActivity;
import com.roblox.client.AbstractActivityC3160b;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.components.LoadingBar;
import com.roblox.client.datastructures.NameValuePair;
import com.roblox.client.flags.C3187a;
import com.roblox.client.purchase.IAPPurchaseManager;
import com.roblox.client.startup.MainGameActivity;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.autovalue.InitParams;
import com.roblox.protocols.systemdialog.PlatformSystemDialogHandler;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import com.withpersona.sdk2.inquiry.network.dto.p054ui.components.Title;
import fj.C5613a0;
import fj.C5636m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import jm.C7209a;
import km.C7635f;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7699p;
import kotlin.collections.C7701q;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mk.C8569c;
import mk.C8574h;
import ml.C8580d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p015ak.C0265a0;
import p015ak.C0305k0;
import p015ak.C0321o0;
import p088e.AbstractC4717m0;
import p088e.C4725q0;
import p088e.C4738x;
import p103eh.C5117e;
import p105ej.InterfaceC5143a;
import p130fh.C5609j;
import p151gk.AsyncTaskC6103a;
import p151gk.C6107c;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6131x;
import p222jj.C7193r;
import p229jt.C7342i;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.C7351r;
import p229jt.InterfaceC7341h;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p293mi.C8525a;
import p308nh.C9476b;
import p315nt.InterfaceC9557b;
import p344ot.C10047c;
import p383qi.C10583b;
import p383qi.C10587f;
import p516wg.C12421c;
import p517wh.C12433f;
import p517wh.C12453p;
import p517wh.InterfaceC12455q;
import p519wj.C12476a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import sg.C11295a1;
import sg.C11335m0;
import sg.C11338n0;
import sg.C11346q;
import sg.C11347q0;
import sg.C11370y;
import sh.C11384i;
import tg.C11642a;
import th.C11659h;
import vg.C12183m;
import vi.C12211b;
import vi.C12216g;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 ¢\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002£\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u001f\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0013\u0010\u0006J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0018\u0010\u0006J\u000f\u0010\u0019\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\u0019\u0010\u0006J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0006J\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u0006J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0004\b$\u0010\u0006J\u000f\u0010%\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010\u0006J\u0019\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010&H\u0014¢\u0006\u0004\b(\u0010)J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0007H\u0014¢\u0006\u0004\b0\u0010\u0006J\u000f\u00101\u001a\u00020\u0007H\u0014¢\u0006\u0004\b1\u0010\u0006J\u0017\u00104\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b6\u00105J\u000f\u00107\u001a\u00020\u0007H\u0014¢\u0006\u0004\b7\u0010\u0006J\u000f\u00108\u001a\u00020\u0007H\u0014¢\u0006\u0004\b8\u0010\u0006J\u001f\u0010<\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00142\u0006\u00109\u001a\u00020\u001b2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010=J-\u0010D\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\u001b2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000b0@2\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u0017\u0010H\u001a\u00020\u00072\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\u0007H\u0007¢\u0006\u0004\bJ\u0010\u0006J\u000f\u0010K\u001a\u00020\u0007H\u0007¢\u0006\u0004\bK\u0010\u0006J\u000f\u0010L\u001a\u00020\u0007H\u0007¢\u0006\u0004\bL\u0010\u0006J\u000f\u0010M\u001a\u00020\u0007H\u0017¢\u0006\u0004\bM\u0010\u0006J\u001f\u0010P\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020\u000bH\u0007¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0007H\u0007¢\u0006\u0004\bR\u0010\u0006J\u000f\u0010S\u001a\u00020\u0007H\u0007¢\u0006\u0004\bS\u0010\u0006J\u001f\u0010W\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u000bH\u0007¢\u0006\u0004\bW\u0010XJ)\u0010[\u001a\u00020\u00072\u0006\u0010U\u001a\u00020T2\u0006\u0010Y\u001a\u00020\u000b2\b\u0010Z\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b[\u0010\\J\u000f\u0010]\u001a\u00020\u0007H\u0007¢\u0006\u0004\b]\u0010\u0006J\u000f\u0010^\u001a\u00020\u0007H\u0007¢\u0006\u0004\b^\u0010\u0006J\u0011\u0010`\u001a\u0004\u0018\u00010_H\u0017¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010e\u001a\u00020\u001bH\u0016¢\u0006\u0004\bf\u0010\u001eJ\u0017\u0010g\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\bg\u0010#J\u000f\u0010h\u001a\u00020\u0007H\u0016¢\u0006\u0004\bh\u0010\u0006J\u000f\u0010i\u001a\u00020\u0007H\u0016¢\u0006\u0004\bi\u0010\u0006R\u0017\u0010o\u001a\u00020j8\u0007¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR\u0017\u0010u\u001a\u00020p8\u0006¢\u0006\f\n\u0004\bq\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010y\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010}\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b{\u0010|R\u0017\u0010\u0080\u0001\u001a\u00020~8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bf\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020z8\u0002@\u0002X\u0082.¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010|R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bg\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R!\u0010\u0093\u0001\u001a\u00030\u008e\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R!\u0010\u0098\u0001\u001a\u00030\u0094\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0095\u0001\u0010\u0090\u0001\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001a\u0010y\u001a\u00020v*\u00020\t8BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001¨\u0006¤\u0001"}, m31665d2 = {"Lcom/roblox/client/startup/MainGameActivity;", "Lcom/google/androidgamesdk/GameActivity;", "Lej/a;", "Lwh/q;", "Lcom/roblox/client/startup/c$b;", "<init>", "()V", "", "r2", "Landroid/content/Intent;", "intent", "", "tag", "o2", "(Landroid/content/Intent;Ljava/lang/String;)V", "q2", "Lcom/roblox/client/RbxKeyboard;", "s2", "()Lcom/roblox/client/RbxKeyboard;", "C2", "", "visible", "K2", "(Z)V", "F2", "d2", "z2", "", "messageResourceId", "I2", "(I)V", "i2", "B2", "message", "t2", "(Ljava/lang/String;)V", "L2", "x2", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "onNewIntent", "(Landroid/content/Intent;)V", "onStart", "onResume", "Landroid/view/SurfaceHolder;", "holder", "surfaceCreated", "(Landroid/view/SurfaceHolder;)V", "surfaceDestroyed", "onPause", "onDestroy", "keyCode", "Landroid/view/KeyEvent;", NotificationCompat.CATEGORY_EVENT, "onKeyDown", "(ILandroid/view/KeyEvent;)Z", "onKeyUp", "requestCode", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "p2", "bootstrapTheApp", "requestOrientationAsDefault", "E", "url", Title.type, "openWebActivity", "(Ljava/lang/String;Ljava/lang/String;)V", "syncCookiesFromEngine", "showLeaveAppPrompt", "", "userId", "productId", "promptNativePurchase", "(JLjava/lang/String;)V", "robloxNativeProductId", "payloadStr", "promptNativePurchaseWithPayload", "(JLjava/lang/String;Ljava/lang/String;)V", "J", "j2", "Lcom/roblox/client/b;", "q0", "()Lcom/roblox/client/b;", "Landroid/app/Activity;", "f0", "()Landroid/app/Activity;", "stringResourceId", "U", "W", "i", "N", "Lcom/roblox/client/startup/NativeHelper;", "Q", "Lcom/roblox/client/startup/NativeHelper;", "getNativeHelper", "()Lcom/roblox/client/startup/NativeHelper;", "nativeHelper", "Lmi/a;", "R", "Lmi/a;", "k2", "()Lmi/a;", "appInsetManager", "Lcom/roblox/client/startup/StartedForEnum;", "S", "Lcom/roblox/client/startup/StartedForEnum;", "startReason", "Landroid/view/View;", "T", "Landroid/view/View;", "splashScreen", "Lcom/roblox/client/components/LoadingBar;", "Lcom/roblox/client/components/LoadingBar;", "loadingView", "V", "webOverlayView", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initParamsForEngineDone", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "X", "Lcom/roblox/client/purchase/IAPPurchaseManager;", "iapPurchaseManager", "Lak/o0;", "Y", "Lak/o0;", "inputAdapter", "Lak/a0;", "Z", "Ljt/h;", "l2", "()Lak/a0;", "browserServiceAppAdapter", "Lwg/c;", "a0", "m2", "()Lwg/c;", "browserServiceBridge", "Lml/d;", "b0", "Lml/d;", "platformEmergencyObserver", "u2", "()Z", "isInForeground", "n2", "(Landroid/content/Intent;)Lcom/roblox/client/startup/StartedForEnum;", "c0", "Companion", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class MainGameActivity extends GameActivity implements InterfaceC5143a, InterfaceC12455q, C3274c.b {

    /* JADX INFO: renamed from: c0, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d0 */
    public static boolean f12285d0;

    /* JADX INFO: renamed from: e0 */
    public static boolean f12286e0;

    /* JADX INFO: renamed from: f0 */
    public static boolean f12287f0;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    @NotNull
    public final NativeHelper nativeHelper;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public View splashScreen;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    public LoadingBar loadingView;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public View webOverlayView;

    /* JADX INFO: renamed from: b0, reason: from kotlin metadata */
    @Nullable
    public C8580d platformEmergencyObserver;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    @NotNull
    public final C8525a appInsetManager = new C8525a();

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
    public final C0321o0 inputAdapter = new C0321o0();

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h browserServiceAppAdapter = C7342i.m30456b(new Function0() { // from class: ak.w0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.m15569f2(this.f854a);
        }
    });

    /* JADX INFO: renamed from: a0, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC7341h browserServiceBridge = C7342i.m30456b(new Function0() { // from class: ak.x0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainGameActivity.m15570g2(this.f865a);
        }
    });

    @Metadata(m31664d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0087 ¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0087 ¢\u0006\u0004\b\u0010\u0010\u0003J\u001a\u0010\u0013\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0083 ¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0011H\u0083 ¢\u0006\u0004\b\u0016\u0010\u0014J\u0018\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0017H\u0083 ¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u00118CX\u0083\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\"\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010#R\u0016\u0010%\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010#¨\u0006&"}, m31665d2 = {"Lcom/roblox/client/startup/MainGameActivity$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "packageContext", "Lcom/roblox/client/startup/StartedForEnum;", "reason", "Landroid/content/Intent;", "e", "(Landroid/content/Context;Lcom/roblox/client/startup/StartedForEnum;)Landroid/content/Intent;", "Lcom/roblox/engine/jni/autovalue/InitParams;", "initParams", "", "f", "(Lcom/roblox/engine/jni/autovalue/InitParams;)V", "i", "", "assetPath", "j", "(Ljava/lang/String;)V", "overrides", "h", "", "usePersistentStorage", "g", "(Z)V", "getAppUpgradeKey", "()Ljava/lang/String;", "getAppUpgradeKey$annotations", "appUpgradeKey", "TAG", "Ljava/lang/String;", "STARTED_FOR_INTENT_KEY", "overrideFlagsAtStartupDone", "Z", "initialized", "inferredCrashMarkerInitialized", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.startup.MainGameActivity.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Keep
        public final String getAppUpgradeKey() {
            String strM42390E = C11295a1.m42390E();
            Intrinsics.checkNotNullExpressionValue(strM42390E, "getAppUpgradeKey(...)");
            return strM42390E;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final Intent m15601e(@NotNull Context packageContext, @NotNull StartedForEnum reason) {
            Intrinsics.checkNotNullParameter(packageContext, "packageContext");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intent intentPutExtra = new Intent(packageContext, (Class<?>) MainGameActivity.class).putExtra("STARTED_FOR_INTENT_KEY", reason);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        /* JADX INFO: renamed from: f */
        public final void m15602f(@Nullable InitParams initParams) {
            MainGameActivity.nativeAppBridgeSetInitParams(initParams);
        }

        /* JADX INFO: renamed from: g */
        public final void m15603g(boolean usePersistentStorage) {
            MainGameActivity.nativeEnableVersionBFlagCache(usePersistentStorage);
        }

        /* JADX INFO: renamed from: h */
        public final void m15604h(String overrides) {
            MainGameActivity.nativePreloadFlagOverrides(overrides);
        }

        /* JADX INFO: renamed from: i */
        public final void m15605i() {
            MainGameActivity.nativeRetryInit();
        }

        /* JADX INFO: renamed from: j */
        public final void m15606j(String assetPath) {
            MainGameActivity.nativeSetAssetPath(assetPath);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.MainGameActivity$a */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m31665d2 = {"com/roblox/client/startup/MainGameActivity$a", "Landroidx/lifecycle/f;", "Landroidx/lifecycle/s;", "owner", "", "onStart", "(Landroidx/lifecycle/s;)V", "onStop", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3264a implements InterfaceC0954f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Context f12300a;

        public C3264a(Context context) {
            this.f12300a = context;
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onCreate(InterfaceC0980s interfaceC0980s) {
            super.onCreate(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onDestroy(InterfaceC0980s interfaceC0980s) {
            super.onDestroy(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onPause(InterfaceC0980s interfaceC0980s) {
            super.onPause(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public /* bridge */ void onResume(InterfaceC0980s interfaceC0980s) {
            super.onResume(interfaceC0980s);
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStart(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(this.f12300a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesM42422U, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesM42422U.edit();
            editorEdit.putBoolean("ROBLOXCrash", true);
            editorEdit.apply();
        }

        @Override // androidx.p616lifecycle.InterfaceC0954f
        public void onStop(InterfaceC0980s owner) {
            Intrinsics.checkNotNullParameter(owner, "owner");
            SharedPreferences sharedPreferencesM42422U = C11295a1.m42422U(this.f12300a);
            Intrinsics.checkNotNullExpressionValue(sharedPreferencesM42422U, "getKeyValues(...)");
            SharedPreferences.Editor editorEdit = sharedPreferencesM42422U.edit();
            editorEdit.remove("ROBLOXCrash");
            editorEdit.apply();
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.MainGameActivity$b */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.MainGameActivity$updateNativeSettingsBeforeFlags$1", m39664f = "MainGameActivity.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3265b extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12301t;

        public C3265b(InterfaceC9557b<? super C3265b> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        /* JADX INFO: renamed from: r */
        public static final void m15608r(String str) {
            C6107c.f23449c.mo37169D(str);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return MainGameActivity.this.new C3265b(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12301t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C6107c.m27010g().m27013f(MainGameActivity.this.getApplicationContext(), new AsyncTaskC6103a.a() { // from class: ak.f1
                @Override // p151gk.AsyncTaskC6103a.a
                /* JADX INFO: renamed from: a */
                public final void mo1253a(String str) {
                    MainGameActivity.C3265b.m15608r(str);
                }
            });
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3265b) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    public MainGameActivity() {
        AbstractC7888l0 abstractC7888l0 = null;
        this.nativeHelper = new NativeHelper(this, C5609j.m25348a(this), new C11642a(abstractC7888l0, null, null, null, 15, null), abstractC7888l0, 8, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: A2 */
    public static final void m15546A2(MainGameActivity mainGameActivity) {
        mainGameActivity.m15567d2();
    }

    /* JADX INFO: renamed from: D2 */
    public static final void m15547D2(MainGameActivity mainGameActivity) {
        mainGameActivity.m15587m2().m46514c();
    }

    /* JADX INFO: renamed from: E2 */
    public static final void m15548E2(MainGameActivity mainGameActivity) {
        mainGameActivity.m15578F2();
    }

    /* JADX INFO: renamed from: G2 */
    public static final void m15549G2(final MainGameActivity mainGameActivity) {
        if (mainGameActivity.isDestroyed()) {
            return;
        }
        new C3275d().m15748c(mainGameActivity, new C3275d.a() { // from class: ak.v0
            @Override // com.roblox.client.startup.C3275d.a
            /* JADX INFO: renamed from: a */
            public final void mo1336a() {
                MainGameActivity.m15550H2(this.f851a);
            }
        });
    }

    /* JADX INFO: renamed from: H2 */
    public static final void m15550H2(MainGameActivity mainGameActivity) {
        mainGameActivity.finish();
    }

    /* JADX INFO: renamed from: J2 */
    public static final void m15551J2() {
        C0305k0.m1259T();
    }

    /* JADX INFO: renamed from: d2 */
    private final void m15567d2() {
        int i10;
        if (C11295a1.m42471q0() || C11295a1.m42459k0()) {
            return;
        }
        if (C11295a1.m42467o0()) {
            i10 = 13;
        } else {
            i10 = C11295a1.m42469p0() ? 7 : 6;
        }
        setRequestedOrientation(i10);
    }

    /* JADX INFO: renamed from: e2 */
    public static final void m15568e2(MainGameActivity mainGameActivity) {
        mainGameActivity.m15577C2();
    }

    /* JADX INFO: renamed from: f2 */
    public static final C0265a0 m15569f2(MainGameActivity mainGameActivity) {
        return new C0265a0(mainGameActivity, C11335m0.f39832s0, null, null, 12, null);
    }

    /* JADX INFO: renamed from: g2 */
    public static final C12421c m15570g2(MainGameActivity mainGameActivity) {
        return new C12421c(mainGameActivity.m15586l2(), new Handler(Looper.getMainLooper()));
    }

    @Keep
    private static final String getAppUpgradeKey() {
        return INSTANCE.getAppUpgradeKey();
    }

    @NotNull
    /* JADX INFO: renamed from: h2 */
    public static final Intent m15571h2(@NotNull Context context, @NotNull StartedForEnum startedForEnum) {
        return INSTANCE.m15601e(context, startedForEnum);
    }

    public static final native void nativeAppBridgeSetInitParams(@Nullable InitParams initParams);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeEnableVersionBFlagCache(boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativePreloadFlagOverrides(String str);

    public static final native void nativeRetryInit();

    /* JADX INFO: Access modifiers changed from: private */
    public static final native void nativeSetAssetPath(String str);

    /* JADX INFO: renamed from: u2 */
    private final boolean m15572u2() {
        return mo4656a().getState().m4945b(AbstractC0966l.b.RESUMED);
    }

    /* JADX INFO: renamed from: v2 */
    public static final Unit m15573v2(AbstractC4717m0 addCallback) {
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        C6124q.m27057b("MainGameActivity", "onBackPressed: ... notify Lua of this BACK button.");
        NativeGLInterface.nativeHandleBackPressed();
        return Unit.f29331a;
    }

    /* JADX INFO: renamed from: w2 */
    public static final void m15574w2(MainGameActivity mainGameActivity, String str, String str2) {
        C11346q.m42515h(mainGameActivity, str, str2, false, true);
    }

    /* JADX INFO: renamed from: y2 */
    public static final CharSequence m15575y2(C7351r c7351r) {
        Intrinsics.checkNotNullParameter(c7351r, "<destruct>");
        return "\n\t" + ((String) c7351r.m30471a()) + " : " + ((Boolean) c7351r.m30472b()).booleanValue() + " => " + ((Boolean) c7351r.m30473c());
    }

    /* JADX INFO: renamed from: B2 */
    public final void m15576B2() {
        m15581K2(true);
        INSTANCE.m15605i();
    }

    /* JADX INFO: renamed from: C2 */
    public final void m15577C2() {
        C6124q.m27063h("MainGameActivity", "Set up context and start to unpack assets:");
        C8569c.INSTANCE.m34528c().m34520r();
        runOnUiThread(new Runnable() { // from class: ak.d1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.m15547D2(this.f745a);
            }
        });
        if (!C11659h.m43403a().mo43681n0()) {
            m15578F2();
            return;
        }
        C6124q.m27063h("MainGameActivity", "runAndWaitToUnpackAssets: check for platform emergency...");
        C8580d c8580d = this.platformEmergencyObserver;
        if (c8580d != null) {
            c8580d.m34610g(new Runnable() { // from class: ak.e1
                @Override // java.lang.Runnable
                public final void run() {
                    MainGameActivity.m15548E2(this.f748a);
                }
            });
        } else {
            m15578F2();
        }
    }

    @Override // p517wh.InterfaceC12455q
    /* JADX INFO: renamed from: E */
    public void mo14741E() {
        m15567d2();
    }

    /* JADX INFO: renamed from: F2 */
    public final synchronized void m15578F2() {
        try {
            if (this.initParamsForEngineDone.compareAndSet(false, true)) {
                C6124q.m27063h("MainGameActivity", "setInitParamsForEngine: initializing");
                NativeSettingsInterface.nativeSetDeviceInfo(C12453p.m46679c(this));
                InitParams.Builder builder = InitParams.builder();
                C12433f.d dVarM46678b = C12453p.m46678b(this, this);
                builder.setPlatformParams(dVarM46678b.m46571b());
                INSTANCE.m15602f(builder.setDeviceParams(dVarM46678b.m46570a()).setBaseURL(C11295a1.m42450g()).setUserAgent(C11295a1.m42433Z0()).setIsTablet(C11295a1.m42473r0()).setIsPotato(C11295a1.m42477t0()).setIsVrDevice(C11295a1.m42471q0()).build());
            } else {
                C6124q.m27063h("MainGameActivity", "setInitParamsForEngine: already initialized");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: I2 */
    public final void m15579I2(int messageResourceId) {
        LoggingProtocol.m15996i("retry_during_splash", 0L, 2, null);
        C3274c.m15744y2(this, messageResourceId);
    }

    /* JADX INFO: renamed from: J */
    public final void m15580J() {
        if (C11295a1.m42471q0()) {
            C6131x.m27102a(this, C11347q0.f39937S);
            finish();
        } else {
            m15581K2(false);
            if (m15572u2()) {
                m15579I2(C11347q0.f39937S);
            }
        }
    }

    /* JADX INFO: renamed from: K2 */
    public final void m15581K2(boolean visible) {
        if (C11295a1.m42471q0()) {
            C6124q.m27057b("MainGameActivity", "updateLoadingView is disabled to disable loading screen for full VR experience.");
            return;
        }
        LoadingBar loadingBar = this.loadingView;
        if (loadingBar == null) {
            Intrinsics.m31998u("loadingView");
            loadingBar = null;
        }
        loadingBar.setVisibility(visible ? 0 : 8);
    }

    /* JADX INFO: renamed from: L2 */
    public final void m15582L2() {
        String strM46736h;
        C7882k.m32780d(C7910q0.m32885a(C7864g1.m32644b()), null, null, new C3265b(null), 3, null);
        boolean zMo43435E2 = C11659h.m43403a().mo43435E2();
        if (zMo43435E2) {
            LoggingProtocol.m15996i("update_native_settings_begin", 0L, 2, null);
        }
        C11295a1.m42425V0();
        if (zMo43435E2) {
            LoggingProtocol.m15996i("update_native_settings_end", 0L, 2, null);
        }
        String strM34520r = C8569c.INSTANCE.m34528c().m34520r();
        Companion companion = INSTANCE;
        companion.m15606j(strM34520r);
        if (C11659h.m43403a().mo43623e6()) {
            Context applicationContext = getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FlagCacheUtils.EnumC3259a versionBCacheChannelMiss = FlagCacheUtils.getVersionBCacheChannelMiss(applicationContext);
            if (versionBCacheChannelMiss == null) {
                companion.m15603g(C11659h.m43403a().mo43752x1());
            } else {
                LoggingProtocol.m16000m("vb_cache_" + versionBCacheChannelMiss.getValue(), null, 2, null);
            }
        }
        if (!C9476b.m37333a() || (strM46736h = new C12476a(getApplicationContext()).m46736h()) == null) {
            return;
        }
        companion.m15604h(strM46736h);
    }

    @Override // com.roblox.client.startup.C3274c.b
    /* JADX INFO: renamed from: N */
    public void mo14752N() {
        m15583i2();
        m15576B2();
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: U */
    public void mo15184U(int stringResourceId) {
        String string = getString(stringResourceId);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        m15594t2(string);
    }

    @Override // p105ej.InterfaceC5143a
    /* JADX INFO: renamed from: W */
    public void mo15185W(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        m15594t2(message);
    }

    @Override // p203j.ActivityC6992b, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(@NotNull Context newBase) {
        Intrinsics.checkNotNullParameter(newBase, "newBase");
        Configuration configuration = newBase.getResources().getConfiguration();
        C10587f c10587fM40571d = C10583b.m40569f().m40571d(newBase);
        Intrinsics.checkNotNullExpressionValue(c10587fM40571d, "getDefaultLocaleValue(...)");
        C10587f c10587fM40576j = C10583b.m40569f().m40576j();
        C6124q.m27057b("rbx.locale", configuration.getClass().getSimpleName() + " -> Locale: base = " + configuration.getLocales().get(0) + "; default = " + c10587fM40571d.m40606c() + "; user = " + (c10587fM40576j != null ? c10587fM40576j.m40606c() : null));
        if (c10587fM40576j != null) {
            c10587fM40571d = c10587fM40576j;
        }
        Locale localeM40568b = C10583b.m40568b(c10587fM40571d.m40606c());
        configuration.setLocale(localeM40568b);
        configuration.setLayoutDirection(localeM40568b);
        super.attachBaseContext(newBase.createConfigurationContext(configuration));
        C11384i.m42699b(this);
    }

    @Keep
    public final void bootstrapTheApp() {
        C6124q.m27063h("MainGameActivity", "Unpack assets in a background thread.");
        Executors.newSingleThreadExecutor().submit(new Runnable() { // from class: ak.c1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.m15568e2(this.f741a);
            }
        });
    }

    @Override // p105ej.InterfaceC5143a
    @NotNull
    /* JADX INFO: renamed from: f0 */
    public Activity mo15198f0() {
        return this;
    }

    @Keep
    @NotNull
    public final NativeHelper getNativeHelper() {
        return this.nativeHelper;
    }

    @Override // com.roblox.client.startup.C3274c.b
    /* JADX INFO: renamed from: i */
    public void mo14777i() {
        m15583i2();
        m15576B2();
    }

    /* JADX INFO: renamed from: i2 */
    public final void m15583i2() {
        C3274c.m15742v2(this);
    }

    /* JADX INFO: renamed from: j2 */
    public final void m15584j2() {
        m15583i2();
    }

    @NotNull
    /* JADX INFO: renamed from: k2, reason: from getter */
    public final C8525a getAppInsetManager() {
        return this.appInsetManager;
    }

    /* JADX INFO: renamed from: l2 */
    public final C0265a0 m15586l2() {
        return (C0265a0) this.browserServiceAppAdapter.getValue();
    }

    /* JADX INFO: renamed from: m2 */
    public final C12421c m15587m2() {
        return (C12421c) this.browserServiceBridge.getValue();
    }

    /* JADX INFO: renamed from: n2 */
    public final StartedForEnum m15588n2(Intent intent) {
        Object objM30460b;
        Object serializableExtra;
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.setClassLoader(StartedForEnum.class.getClassLoader());
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                if (Build.VERSION.SDK_INT >= 33) {
                    serializableExtra = intent.getSerializableExtra("STARTED_FOR_INTENT_KEY", StartedForEnum.class);
                } else {
                    Object serializableExtra2 = intent.getSerializableExtra("STARTED_FOR_INTENT_KEY");
                    if (!(serializableExtra2 instanceof StartedForEnum)) {
                        serializableExtra2 = null;
                    }
                    serializableExtra = (StartedForEnum) serializableExtra2;
                }
                objM30460b = C7347n.m30460b((StartedForEnum) serializableExtra);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            StartedForEnum startedForEnum = (StartedForEnum) (C7347n.m30465g(objM30460b) ? null : objM30460b);
            if (startedForEnum != null) {
                return startedForEnum;
            }
        }
        return StartedForEnum.SYSTEM;
    }

    /* JADX INFO: renamed from: o2 */
    public final void m15589o2(Intent intent, String tag) {
        Bundle extras;
        StartedForEnum startedForEnumM15588n2 = m15588n2(intent);
        this.startReason = startedForEnumM15588n2;
        C6124q.m27063h("MainGameActivity", tag + ": Started for: " + startedForEnumM15588n2);
        if (this.startReason != StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION || (extras = intent.getExtras()) == null) {
            return;
        }
        C7193r.m30069k().m30076G(extras);
    }

    @Override // com.google.androidgamesdk.GameActivity, p203j.ActivityC6992b, p088e.ActivityC4722p, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        C8574h.f31489a.m34584d(newConfig);
        SystemThemeProtocol.f12789a.m16071C();
        if (C11295a1.m42461l0()) {
            this.nativeHelper.m15673g0();
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: e.q0.b(e.p0, androidx.lifecycle.s, boolean, kotlin.jvm.functions.Function1, int, java.lang.Object):e.m0 */
    /* JADX DEBUG: Class process forced to load method for inline: e.x.c(e.p, e.u0, e.u0, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.androidgamesdk.GameActivity, p093e4.ActivityC4831q, p088e.ActivityC4722p, p235k2.ActivityC7415g, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Main.Start(this);
        C6124q.m27063h("MainGameActivity", "onCreate");
        InterfaceC7906p0 interfaceC7906p0 = null;
        Object[] objArr = 0;
        if (f12286e0) {
            LoggingProtocol.m15996i("process_reuse", 0L, 2, null);
        }
        C7209a.m30129c(this);
        C7209a.m30131j().m30132a(C7209a.a.GAME, savedInstanceState);
        LoggingProtocol.m15996i("main_activity_oncreate", 0L, 2, null);
        m15595x2();
        if (C11659h.m43403a().mo43455H1()) {
            C5613a0.m25370R(this);
        } else {
            C5636m.m25494F0(this);
        }
        C4738x.m23112c(this, null, null, 3, null);
        C12211b.m45200f().m45210l(this);
        m15582L2();
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "getIntent(...)");
        m15589o2(intent, "onCreate");
        if (C11659h.m43403a().mo43639h0()) {
            Toast.makeText(this, "Using GameActivity (for QA)", 0).show();
        }
        int i10 = 1;
        if (C12217h.m45288e().m45297i()) {
            String strValueOf = String.valueOf(C12217h.m45288e().m45296g());
            ArrayList arrayList = new ArrayList(C7193r.m30070l());
            arrayList.add(new NameValuePair("recipient_user_id", strValueOf));
            C12183m.m45108c("androidNotificationsSettings", "onAppForeground", arrayList, true);
        }
        if (C11659h.m43403a().mo43681n0()) {
            C6124q.m27063h("MainGameActivity", "Attach platform emergency observer.");
            if (this.platformEmergencyObserver == null) {
                this.platformEmergencyObserver = new C8580d(interfaceC7906p0, i10, objArr == true ? 1 : 0);
            }
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            C8580d c8580d = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(c8580d);
            platformSystemDialogHandler.attachObserver(c8580d);
            platformSystemDialogHandler.setActivity(this);
        }
        super.onCreate(savedInstanceState);
        C8574h c8574h = C8574h.f31489a;
        Configuration configuration = getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        c8574h.m34583c(configuration);
        m15591q2();
        GameActivity.C2895d c2895d = this.f10779H;
        if (c2895d == null) {
            throw new IllegalStateException("GameActivity SurfaceView failed to initialize");
        }
        this.nativeHelper.m15676n0(this.f10776E, c2895d, m15593s2(), this.inputAdapter);
        C4725q0.m23086b(mo23043Q(), null, false, new Function1() { // from class: ak.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.m15573v2((AbstractC4717m0) obj);
            }
        }, 3, null);
        m15592r2();
    }

    @Override // com.google.androidgamesdk.GameActivity, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onDestroy() {
        C6124q.m27063h("MainGameActivity", "onDestroy. isFinishing = " + isFinishing());
        m15587m2().m46516e();
        if (this.platformEmergencyObserver != null) {
            C6124q.m27063h("MainGameActivity", "Detach platform emergency observer.");
            PlatformSystemDialogHandler platformSystemDialogHandler = PlatformSystemDialogHandler.INSTANCE;
            C8580d c8580d = this.platformEmergencyObserver;
            Intrinsics.checkNotNull(c8580d);
            platformSystemDialogHandler.detachObserver(c8580d);
            this.platformEmergencyObserver = null;
        }
        super.onDestroy();
    }

    @Override // com.google.androidgamesdk.GameActivity, p203j.ActivityC6992b, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return C8574h.f31489a.m34585e(event) || super.onKeyDown(keyCode, event);
    }

    @Override // com.google.androidgamesdk.GameActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return C8574h.f31489a.m34586f(event) || super.onKeyUp(keyCode, event);
    }

    @Override // p088e.ActivityC4722p, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        m15589o2(intent, "onNewIntent");
    }

    @Override // com.google.androidgamesdk.GameActivity, p093e4.ActivityC4831q, android.app.Activity
    public void onPause() {
        View view;
        super.onPause();
        if (C11659h.m43403a().mo43457H3() && (view = this.splashScreen) != null) {
            if (view == null) {
                Intrinsics.m31998u("splashScreen");
                view = null;
            }
            if (view.getVisibility() == 0 && !isFinishing()) {
                C6124q.m27066k("MainGameActivity", "onPause: MainGameActivity backgrounded before becoming interactive.");
                LoggingProtocol.m15996i("startup_interrupted", 0L, 2, null);
            }
        }
        C7209a.m30131j().m30133b(C7209a.a.GAME);
    }

    @Override // p093e4.ActivityC4831q, p088e.ActivityC4722p, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        C11370y.m42581h().m42591k().m38635Q(requestCode, permissions, grantResults);
    }

    @Override // com.google.androidgamesdk.GameActivity, p093e4.ActivityC4831q, android.app.Activity
    public void onResume() {
        C6124q.m27063h("MainGameActivity", "onResume:");
        super.onResume();
        C7193r.m30069k().m30088s(this);
        m15596z2();
        if (this.startReason == StartedForEnum.PROTOCOL_LAUNCH && C3272a.m15705m()) {
            C7635f.m31524D().m31552t();
        }
        if (C12217h.m45288e().m45295f()) {
            C6124q.m27063h("MainGameActivity", "onResume: ... (Logged in) Try to grant pending purchases.");
            IAPPurchaseManager.m15356D(this, true);
        }
        if (C6127t.m27089e()) {
            C11370y.m42581h().m42586e().m7517x(this);
        }
    }

    @Override // com.google.androidgamesdk.GameActivity, p203j.ActivityC6992b, p093e4.ActivityC4831q, android.app.Activity
    public void onStart() {
        super.onStart();
        f12286e0 = true;
        C7209a.m30131j().m30136f();
    }

    @Keep
    public final void openWebActivity(@NotNull final String url, @NotNull final String title) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        C6124q.m27063h("MainGameActivity", "openWebActivity: url = " + url + ", title = " + title);
        runOnUiThread(new Runnable() { // from class: ak.a1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.m15574w2(this.f735a, url, title);
            }
        });
    }

    /* JADX INFO: renamed from: p2 */
    public final void m15590p2() {
        C6124q.m27057b("MainGameActivity", "... Hide the progress bar.");
        View view = this.splashScreen;
        if (view == null) {
            Intrinsics.m31998u("splashScreen");
            view = null;
        }
        view.setVisibility(8);
    }

    @Keep
    public final void promptNativePurchase(long userId, @NotNull String productId) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        C6124q.m27063h("MainGameActivity", "promptNativePurchase: userId = " + userId + ", productId = " + productId);
        this.iapPurchaseManager.m15384y(userId, productId);
    }

    @Keep
    public final void promptNativePurchaseWithPayload(long userId, @NotNull String robloxNativeProductId, @Nullable String payloadStr) {
        Intrinsics.checkNotNullParameter(robloxNativeProductId, "robloxNativeProductId");
        C6124q.m27063h("MainGameActivity", "promptNativePurchaseWithPayload: userId = " + userId + ", roblox-native-productId = " + robloxNativeProductId);
        this.iapPurchaseManager.m15371A(userId, robloxNativeProductId, payloadStr);
    }

    @Override // p105ej.InterfaceC5143a
    @Nullable
    /* JADX INFO: renamed from: q0 */
    public AbstractActivityC3160b mo15213q0() {
        return null;
    }

    /* JADX INFO: renamed from: q2 */
    public final void m15591q2() {
        C6124q.m27063h("MainGameActivity", "Adding our custom loading view...");
        View viewFindViewById = findViewById(this.f10776E);
        if (viewFindViewById == null) {
            throw new IllegalStateException("Surface view not created or expected view hierarchy not matching.");
        }
        View viewInflate = getLayoutInflater().inflate(C11338n0.f39855b, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = viewInflate.findViewById(C11335m0.f39787S);
        if (viewFindViewById2 == null) {
            throw new IllegalStateException("`loading_layout` not found in the `activity_game` layout");
        }
        viewFindViewById2.setVisibility(0);
        this.splashScreen = viewFindViewById2;
        LoadingBar loadingBar = (LoadingBar) viewInflate.findViewById(C11335m0.f39789U);
        if (loadingBar == null) {
            throw new IllegalStateException("`loading_progress_view` not found in the `activity_game` layout");
        }
        loadingBar.setVisibility(0);
        this.loadingView = loadingBar;
        View viewFindViewById3 = viewInflate.findViewById(C11335m0.f39832s0);
        if (viewFindViewById3 == null) {
            throw new IllegalStateException("`web_overlay_layout` not found in the `activity_game` layout");
        }
        this.webOverlayView = viewFindViewById3;
        this.appInsetManager.m34393e(viewFindViewById3);
    }

    /* JADX INFO: renamed from: r2 */
    public final void m15592r2() {
        if (f12287f0) {
            return;
        }
        f12287f0 = true;
        Context applicationContext = getApplicationContext();
        C12216g.m45228b().m45269i(C11295a1.m42422U(applicationContext).getBoolean("ROBLOXCrash", false));
        C0959h0.INSTANCE.m4917a().mo4656a().mo4935a(new C3264a(applicationContext));
    }

    @Keep
    public final void requestOrientationAsDefault() {
        C6124q.m27063h("MainGameActivity", "requestOrientationAsDefault");
        runOnUiThread(new Runnable() { // from class: ak.y0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.m15546A2(this.f867a);
            }
        });
    }

    /* JADX INFO: renamed from: s2 */
    public final RbxKeyboard m15593s2() {
        RbxKeyboard rbxKeyboard = (RbxKeyboard) findViewById(C11335m0.f39798b0);
        if (rbxKeyboard == null) {
            throw new IllegalStateException("`rbx_edit_text` not found. Was `inflateOverlayLayout` called?");
        }
        C5117e.m23880d(rbxKeyboard, this, "SourceSansPro-Regular.ttf");
        return rbxKeyboard;
    }

    @Keep
    public final void showLeaveAppPrompt() {
        runOnUiThread(new Runnable() { // from class: ak.t0
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.m15549G2(this.f844a);
            }
        });
    }

    @Override // com.google.androidgamesdk.GameActivity, android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.surfaceCreated(holder);
        this.inputAdapter.m1324a(!isDestroyed());
    }

    @Override // com.google.androidgamesdk.GameActivity, android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NotNull SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        this.inputAdapter.m1324a(false);
        super.surfaceDestroyed(holder);
    }

    @Keep
    public final void syncCookiesFromEngine() {
        runOnUiThread(new Runnable() { // from class: ak.b1
            @Override // java.lang.Runnable
            public final void run() {
                MainGameActivity.m15551J2();
            }
        });
    }

    /* JADX INFO: renamed from: t2 */
    public final void m15594t2(String message) {
        if (isDestroyed()) {
            return;
        }
        new DialogInterfaceC0408a.a(this).m1526j(C11347q0.f40013u, null).m1524h(message).m1534r();
    }

    /* JADX INFO: renamed from: x2 */
    public final void m15595x2() {
        if (f12285d0) {
            return;
        }
        f12285d0 = true;
        List listM31892k = C7699p.m31892k();
        C6124q.m27057b("MainGameActivity", "overrideFlagsAtStartup: count = " + listM31892k.size());
        List<String> list = listM31892k;
        ArrayList arrayList = new ArrayList(C7701q.m31905u(list, 10));
        for (String str : list) {
            C3187a c3187aMo15151N0 = C11659h.m43403a().mo15151N0(str);
            if (c3187aMo15151N0 == null) {
                throw new IllegalStateException(("Flag " + str + " is not found.").toString());
            }
            if (c3187aMo15151N0.m15123a()) {
                throw new IllegalStateException(("Flag " + str + " is cached and not supported.").toString());
            }
            C3187a.a aVar = c3187aMo15151N0 instanceof C3187a.a ? (C3187a.a) c3187aMo15151N0 : null;
            if (aVar == null) {
                throw new IllegalStateException(("Flag " + str + " is not a boolean flag.").toString());
            }
            Boolean boolM15133k = aVar.m15133k();
            Intrinsics.checkNotNullExpressionValue(boolM15133k, "valueOf(...)");
            boolM15133k.booleanValue();
            aVar.m15129g(Boolean.TRUE);
            arrayList.add(new C7351r(str, boolM15133k, aVar.m15133k()));
        }
        C6124q.m27063h("MainGameActivity", CollectionsKt.m31715m0(arrayList, null, "overrideFlagsAtStartup:", null, 0, null, new Function1() { // from class: ak.u0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainGameActivity.m15575y2((C7351r) obj);
            }
        }, 29, null));
    }

    /* JADX INFO: renamed from: z2 */
    public final void m15596z2() {
        Bundle bundleM30080i = C7193r.m30069k().m30080i();
        if (bundleM30080i == null) {
            return;
        }
        C6124q.m27063h("MainGameActivity", "processPushNotification: Handle notifications using Linking...");
        if (C7193r.m30069k().m30089t(bundleM30080i)) {
            return;
        }
        C6124q.m27066k("MainGameActivity", "processPushNotification: Handle legacy push notifications...");
    }
}
