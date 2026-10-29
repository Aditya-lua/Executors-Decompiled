package com.roblox.client.startup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.SurfaceView;
import android.view.Window;
import android.webkit.WebSettings;
import androidx.annotation.Keep;
import androidx.core.app.NotificationCompat;
import androidx.p616lifecycle.AbstractC0966l;
import androidx.p616lifecycle.InterfaceC0974p;
import androidx.p616lifecycle.InterfaceC0980s;
import com.roblox.client.C3179d;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.ShareAppChosenReceiver;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.startup.NativeHelper;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.engine.jni.NativeAppBridgeInterface;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.connectivityv2.ConnectivityV2Monitor;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.mediapicker.MediaPickerProtocol;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import fk.C5654c;
import gl.C6134a;
import hm.C6426b;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import km.C7635f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7688j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7744k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC7738h;
import kotlin.jvm.internal.Intrinsics;
import mk.ViewOnTouchListenerC8572f;
import ni.C9479a;
import om.AbstractC9810k;
import om.EnumC9813n;
import org.fmod.FMOD;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p015ak.C0305k0;
import p015ak.C0315m2;
import p015ak.C0319n2;
import p079di.C4617i;
import p108em.C5163a;
import p130fh.InterfaceC5608i;
import p131fl.C5660d;
import p131fl.C5663g;
import p138fv.C5840c;
import p138fv.InterfaceC5847j;
import p151gk.C6107c;
import p151gk.C6124q;
import p151gk.C6127t;
import p151gk.C6129v;
import p151gk.C6133z;
import p222jj.C7195t;
import p229jt.C7345l;
import p229jt.C7347n;
import p229jt.C7348o;
import p229jt.InterfaceC7330b;
import p256ku.AbstractC7888l0;
import p256ku.C7864g1;
import p256ku.C7882k;
import p256ku.C7910q0;
import p256ku.InterfaceC7906p0;
import p274ll.InterfaceC8166f;
import p308nh.C9477c;
import p315nt.InterfaceC9557b;
import p337ol.EnumC9799a;
import p344ot.C10047c;
import p359pi.C10264b;
import p359pi.C10265c;
import p359pi.C10275m;
import p383qi.C10583b;
import p414rj.C10890f;
import p416rl.C10902j;
import p517wh.AbstractC12443k;
import p517wh.C12454p0;
import p517wh.C12456q0;
import p517wh.C12464u0;
import p517wh.InterfaceC12468w0;
import p518wi.C12475a;
import p520wk.C12486h;
import p520wk.C12488j;
import p577yi.C13192a;
import p580yl.C13203c;
import p604zg.InterfaceC13810a;
import p606zj.C13818a;
import ph.C10261j;
import pm.C10293a;
import pt.AbstractC10351m;
import pt.InterfaceC10344f;
import sg.C11295a1;
import sg.C11304c2;
import sg.C11370y;
import sh.C11382g;
import sh.ExpBackOffRetryPolicy;
import tg.C11642a;
import th.C11659h;
import vg.C12175e;
import vi.C12211b;
import vi.C12214e;
import vi.C12216g;
import vi.C12217h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m31664d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u008d\u00012\u00020\u0001:\u0001XB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ/\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020,H\u0007¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020\fH\u0007¢\u0006\u0004\b2\u0010\u000eJ\u0017\u00103\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b4\u0010/J\u0017\u00105\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b5\u0010/J\u000f\u00106\u001a\u00020\fH\u0007¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\fH\u0007¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0007¢\u0006\u0004\b8\u0010\u000eJ\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0007¢\u0006\u0004\b=\u0010\u000eJ\u000f\u0010>\u001a\u00020\fH\u0007¢\u0006\u0004\b>\u0010\u000eJ/\u0010E\u001a\u00020\f2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020(2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\fH\u0007¢\u0006\u0004\bG\u0010\u000eJ\u0017\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020,H\u0007¢\u0006\u0004\bI\u0010/J\u000f\u0010J\u001a\u00020\fH\u0007¢\u0006\u0004\bJ\u0010\u000eJ\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020,H\u0007¢\u0006\u0004\bL\u0010/J/\u0010Q\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020,H\u0007¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020SH\u0007¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\fH\u0007¢\u0006\u0004\bW\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010j\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0016\u0010n\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010iR\u0016\u0010p\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u0016\u0010r\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010iR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008e\u0001"}, m31665d2 = {"Lcom/roblox/client/startup/NativeHelper;", "", "Lcom/roblox/client/startup/MainGameActivity;", "activity", "Lfh/i;", "upgradeDialog", "Ltg/a;", "adsHelper", "Lku/l0;", "ioDispatcher", "<init>", "(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;)V", "", "o0", "()V", "m0", "h0", "G", "e0", "", "contentViewId", "Landroid/view/SurfaceView;", "surfaceView", "Lcom/roblox/client/RbxKeyboard;", "rbxEditText", "Lmk/f$f;", "inputAdapter", "n0", "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lmk/f$f;)V", "Ljava/nio/ByteBuffer;", "flagsBuffer", "gameActivity_onFlagsLoaded", "(Ljava/nio/ByteBuffer;)V", "gameActivity_onFlagsFailed", "gameActivity_onEngineInitialized", "", PinShortcutHandler.EXTRA_PLACE_ID, "gameActivity_onGameLoaded", "(J)V", "orientation", "", "inExperience", "gameActivity_onScreenOrientationChanged", "(IZ)V", "", "data", "gameActivity_onGameStreamingStatusChanged", "(Ljava/lang/String;)V", "motionType", "gameActivity_onMotionEventListening", "gameActivity_onLuaAppDidReturn", "gameActivity_onDidLogInReceived", "gameActivity_onDidSignUp", "gameActivity_onAppReady", "gameActivity_onDidLogOutReceived", "gameActivity_onDidSwitchAccountReceived", "gameActivity_onExperienceStart", "", "timeInMs", "gameActivity_onExperienceStop", "(D)V", "gameActivity_onRestartLuaApp", "gameActivity_onScanQrCode", "textBox", "showNativeInput", "", "byteArrayFromTextBox", "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;", "textBoxInfo", "gameActivity_showKeyboard", "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V", "gameActivity_hideKeyboard", "value", "gameActivity_onLuaTextBoxChanged", "gameActivity_onLuaTextBoxPropertyChanged", "path", "gameActivity_onScreenshotReady", "result", "upgradeStatusCode", "apkUrl", "apkCheckSum", "gameActivity_setAppUpgradeStatus", "(IILjava/lang/String;Ljava/lang/String;)V", "Lph/j;", NotificationCompat.CATEGORY_EVENT, "onCodeParsedFromSMS", "(Lph/j;)V", "g0", "a", "Lcom/roblox/client/startup/MainGameActivity;", "b", "Lfh/i;", "c", "Ltg/a;", "d", "Lku/l0;", "Lmk/f;", "e", "Lmk/f;", "inputListener", "Lwh/w0;", "f", "Lwh/w0;", "overlayEditTextController", "g", "Z", "isVisible", "h", "isForeground", "i", "isEngineInitialized", "j", "isInExperience", "k", "enableConnectivityV2ForAndroid", "Lzg/a;", "l", "Lzg/a;", "rtcAudioManager", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "m", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "appHangMonitor", "n", "I", "Landroidx/lifecycle/p;", "o", "Landroidx/lifecycle/p;", "lifecycleEventObserver", "Lvi/e$e;", "p", "Lvi/e$e;", "notificationObserver", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "q", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "webViewUserAgentGetter", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "r", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "mobileAdvertisingIdGetter", "s", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
public final class NativeHelper {

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t */
    @NotNull
    public static final C12486h.d f12304t = new C12486h.d() { // from class: ak.f2
        @Override // p520wk.C12486h.d
        /* JADX INFO: renamed from: a */
        public final void mo1254a() {
            NativeHelper.m15659p0();
        }
    };

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final MainGameActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC5608i upgradeDialog;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C11642a adsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AbstractC7888l0 ioDispatcher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public ViewOnTouchListenerC8572f inputListener;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public InterfaceC12468w0 overlayEditTextController;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public boolean isVisible;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean isForeground;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean isEngineInitialized;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean isInExperience;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public volatile boolean enableConnectivityV2ForAndroid;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public InterfaceC13810a rtcAudioManager;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public AppHangMonitor appHangMonitor;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public int contentViewId;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final InterfaceC0974p lifecycleEventObserver;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final C12214e.e notificationObserver;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.WebViewUserAgentGetter webViewUserAgentGetter;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.MobileAdvertisingIdGetter mobileAdvertisingIdGetter;

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a, reason: from kotlin metadata */
    @Metadata(m31664d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m31665d2 = {"Lcom/roblox/client/startup/NativeHelper$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/l$a;", NotificationCompat.CATEGORY_EVENT, "", "c", "(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V", "", "orientation", "d", "(I)I", "", "TAG", "Ljava/lang/String;", "Lwk/h$d;", "securityCookieObserver", "Lwk/h$d;", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a$a */
        @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f12323a;

            static {
                int[] iArr = new int[AbstractC0966l.a.values().length];
                try {
                    iArr[AbstractC0966l.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AbstractC0966l.a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f12323a = iArr;
            }
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.roblox.client.startup.NativeHelper.a.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final void m15680c(Activity activity, AbstractC0966l.a event) {
            AbstractC9810k abstractC9810kM42591k = C11370y.m42581h().m42591k();
            int i10 = a.f12323a[event.ordinal()];
            if (i10 == 1) {
                abstractC9810kM42591k.m38647d0(activity);
                abstractC9810kM42591k.m38646c0();
                abstractC9810kM42591k.m38649k("POST_NOTIFICATIONS", C7195t.m30098g());
                abstractC9810kM42591k.m38649k("MEDIA_PICKER", C12475a.m46727e());
                return;
            }
            if (i10 == 2) {
                abstractC9810kM42591k.m38642Y("POST_NOTIFICATIONS");
                abstractC9810kM42591k.m38642Y("MEDIA_PICKER");
            } else {
                throw new IllegalStateException(("Unhandled lifecycle event: " + event).toString());
            }
        }

        /* JADX INFO: renamed from: d */
        public final int m15681d(int orientation) {
            if (orientation == 0) {
                return 8;
            }
            if (orientation == 1) {
                return 0;
            }
            if (orientation == 2) {
                return 6;
            }
            if (orientation == 3) {
                return 7;
            }
            if (orientation == 4) {
                return 2;
            }
            C6124q.m27066k("NativeHelper", "orientationFromEngineToNative: Unsupported orientation = " + orientation);
            return -1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$b */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3267b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f12324a;

        static {
            int[] iArr = new int[AbstractC0966l.a.values().length];
            try {
                iArr[AbstractC0966l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC0966l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC0966l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC0966l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC0966l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC0966l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC0966l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f12324a = iArr;
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$c */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.NativeHelper$gameActivity_onAppReady$2", m39664f = "NativeHelper.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3268c extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12325t;

        public C3268c(InterfaceC9557b<? super C3268c> interfaceC9557b) {
            super(2, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return NativeHelper.this.new C3268c(interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12325t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            C0319n2.m1322b(NativeHelper.this.activity);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3268c) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$d */
    @Metadata(m31664d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m31665d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, m31666k = 3, m31667mv = {2, 2, 0})
    @InterfaceC10344f(m39663c = "com.roblox.client.startup.NativeHelper$gameActivity_onScreenshotReady$1", m39664f = "NativeHelper.kt", m39665l = {}, m39666m = "invokeSuspend", m39667v = 1)
    public static final class C3269d extends AbstractC10351m implements Function2<InterfaceC7906p0, InterfaceC9557b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t */
        public int f12327t;

        /* JADX INFO: renamed from: u */
        public final /* synthetic */ String f12328u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3269d(String str, InterfaceC9557b<? super C3269d> interfaceC9557b) {
            super(2, interfaceC9557b);
            this.f12328u = str;
        }

        @Override // pt.AbstractC10339a
        public final InterfaceC9557b<Unit> create(Object obj, InterfaceC9557b<?> interfaceC9557b) {
            return new C3269d(this.f12328u, interfaceC9557b);
        }

        @Override // pt.AbstractC10339a
        public final Object invokeSuspend(Object obj) {
            C10047c.m38805e();
            if (this.f12327t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7348o.m30470b(obj);
            AbstractC12443k.m46669u(this.f12328u);
            return Unit.f29331a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC7906p0 interfaceC7906p0, InterfaceC9557b<? super Unit> interfaceC9557b) {
            return ((C3269d) create(interfaceC7906p0, interfaceC9557b)).invokeSuspend(Unit.f29331a);
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$e */
    @Metadata(m31666k = 3, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final /* synthetic */ class C3270e implements SystemThemeProtocol.InterfaceC3365a, InterfaceC7738h {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C10275m f12329c;

        public C3270e(C10275m c10275m) {
            this.f12329c = c10275m;
        }

        @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.InterfaceC3365a
        /* JADX INFO: renamed from: a */
        public final void mo15682a(String p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            this.f12329c.m39469f(p8);
        }

        @Override // kotlin.jvm.internal.InterfaceC7738h
        /* JADX INFO: renamed from: b */
        public final InterfaceC7330b<?> mo15683b() {
            return new C7744k(1, this.f12329c, C10275m.class, "onAppIconChanged", "onAppIconChanged(Ljava/lang/String;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof SystemThemeProtocol.InterfaceC3365a) && (obj instanceof InterfaceC7738h)) {
                return Intrinsics.m31980c(mo15683b(), ((InterfaceC7738h) obj).mo15683b());
            }
            return false;
        }

        public final int hashCode() {
            return mo15683b().hashCode();
        }
    }

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$f */
    @Metadata(m31664d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m31665d2 = {"com/roblox/client/startup/NativeHelper$f", "Lcom/roblox/client/d$d;", "Lcom/roblox/client/d$e;", "result", "", "a", "(Lcom/roblox/client/d$e;)V", NotificationCompat.CATEGORY_STATUS, "b", "NativeShell_googleProdRelease"}, m31666k = 1, m31667mv = {2, 2, 0}, m31669xi = 48)
    public static final class C3271f implements C3179d.d {
        public C3271f() {
        }

        @Override // com.roblox.client.C3179d.d
        /* JADX INFO: renamed from: a */
        public void mo14797a(C3179d.e result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.m15095b()) {
                NativeHelper.this.upgradeDialog.mo25340a(InterfaceC5608i.a.Optional);
                return;
            }
            if (result.m15096c()) {
                NativeHelper.this.upgradeDialog.mo25340a(InterfaceC5608i.a.Required);
            } else if (C6127t.m27094j() && result.m15094a()) {
                NativeHelper.this.upgradeDialog.mo25340a(InterfaceC5608i.a.NewApp);
                C12211b.m45200f().m45207i(NativeHelper.this.activity, C12211b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.C3179d.d
        /* JADX INFO: renamed from: b */
        public void mo14798b(C3179d.e status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (C11295a1.m42471q0() && status.m15096c()) {
                NativeHelper.this.upgradeDialog.mo25340a(InterfaceC5608i.a.Required);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public NativeHelper(@NotNull MainGameActivity activity, @NotNull InterfaceC5608i upgradeDialog, @NotNull C11642a adsHelper, @NotNull AbstractC7888l0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(upgradeDialog, "upgradeDialog");
        Intrinsics.checkNotNullParameter(adsHelper, "adsHelper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.activity = activity;
        this.upgradeDialog = upgradeDialog;
        this.adsHelper = adsHelper;
        this.ioDispatcher = ioDispatcher;
        InterfaceC0974p interfaceC0974p = new InterfaceC0974p() { // from class: ak.t1
            @Override // androidx.p616lifecycle.InterfaceC0974p
            /* JADX INFO: renamed from: g */
            public final void mo1334g(InterfaceC0980s interfaceC0980s, AbstractC0966l.a aVar) {
                NativeHelper.m15635a0(this.f845a, interfaceC0980s, aVar);
            }
        };
        this.lifecycleEventObserver = interfaceC0974p;
        this.notificationObserver = new C12214e.e() { // from class: ak.u1
            @Override // vi.C12214e.e
            /* JADX INFO: renamed from: S */
            public final void mo1335S(int i10, Bundle bundle) {
                NativeHelper.m15641d0(i10, bundle);
            }
        };
        this.webViewUserAgentGetter = new NativeGLJavaInterface.WebViewUserAgentGetter() { // from class: ak.v1
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
            /* JADX INFO: renamed from: n0 */
            public final void mo1337n0() {
                NativeHelper.m15661q0(this.f852a);
            }
        };
        this.mobileAdvertisingIdGetter = new NativeGLJavaInterface.MobileAdvertisingIdGetter() { // from class: ak.w1
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
            /* JADX INFO: renamed from: T */
            public final void mo1338T() {
                NativeHelper.m15639c0();
            }
        };
        activity.mo4656a().mo4935a(interfaceC0974p);
    }

    /* JADX INFO: renamed from: H */
    public static final void m15615H(NativeHelper nativeHelper) {
        InterfaceC12468w0 interfaceC12468w0 = nativeHelper.overlayEditTextController;
        if (interfaceC12468w0 != null) {
            interfaceC12468w0.mo15256a();
        }
        nativeHelper.m15671G();
    }

    /* JADX INFO: renamed from: I */
    public static final void m15616I(NativeHelper nativeHelper) {
        nativeHelper.activity.m15590p2();
    }

    /* JADX INFO: renamed from: J */
    public static final void m15617J(NativeHelper nativeHelper, String str) {
        C0305k0.m1274s(nativeHelper.activity).m1282H(str);
        if (C11659h.m43403a().mo43505O3()) {
            C12211b.m45200f().m45206h();
            nativeHelper.activity.getWindow().clearFlags(8192);
        }
        nativeHelper.m15677o0();
        nativeHelper.m15675m0();
    }

    /* JADX INFO: renamed from: K */
    public static final void m15618K(NativeHelper nativeHelper) {
        if (C11659h.m43403a().mo43530S1() && !C12217h.m45288e().m45295f()) {
            C12211b.m45200f().m45213p(C12211b.d.LOGOUT_BY_USER_IN_LUA);
            C12488j.m46781c().m46783e(C11295a1.m42410O(), C11295a1.m42450g());
        }
        if (C12217h.m45288e().m45295f()) {
            C12211b.m45200f().m45207i(nativeHelper.activity, C12211b.d.LOGOUT_BY_USER_IN_LUA);
        }
    }

    /* JADX INFO: renamed from: L */
    public static final void m15619L(NativeHelper nativeHelper, String str) {
        C0305k0.m1274s(nativeHelper.activity).m1283I(str);
    }

    /* JADX INFO: renamed from: M */
    public static final void m15620M(NativeHelper nativeHelper) {
        C12211b.m45200f().m45208j(nativeHelper.activity);
    }

    /* JADX INFO: renamed from: N */
    public static final void m15621N(NativeHelper nativeHelper) {
        nativeHelper.m15674h0();
    }

    /* JADX INFO: renamed from: O */
    public static final void m15622O(NativeHelper nativeHelper) {
        nativeHelper.m15671G();
        C6426b.m28011h().m28012e();
        C11370y.m42581h().m42585d().mo14927c(nativeHelper.activity);
        C6134a.m27112b().m27115e();
    }

    /* JADX INFO: renamed from: P */
    public static final void m15623P(NativeHelper nativeHelper, double d10) {
        C6426b.m28011h().m28013f();
        C11370y.m42581h().m42585d().mo14929e(nativeHelper.activity, (long) d10);
        if (nativeHelper.isForeground) {
            C6134a.m27112b().m27114d(nativeHelper.activity);
        }
    }

    /* JADX INFO: renamed from: Q */
    public static final void m15624Q(Context context, NativeHelper nativeHelper) {
        NativeGLInterface.nativeSetAppPreviousExitReasons(C0315m2.m1317a(context));
        C12175e.m45057h().m45061i(context);
        boolean zMo43435E2 = C11659h.m43403a().mo43435E2();
        if (zMo43435E2) {
            LoggingProtocol.m15996i("fmod_init_begin", 0L, 2, null);
        }
        FMOD.init(nativeHelper.activity);
        if (zMo43435E2) {
            LoggingProtocol.m15996i("fmod_init_end", 0L, 2, null);
        }
        C11295a1.m42423U0();
        NativeSettingsInterface.nativeSetPreferencesFile(C6133z.m27106e(nativeHelper.activity).m27109f());
        C10583b.m40569f().m40579m(nativeHelper.activity);
        C0305k0.m1275w(context);
        if (nativeHelper.appHangMonitor == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            appHangMonitor.m15847c();
            if (nativeHelper.isVisible) {
                appHangMonitor.m15846b();
            }
            nativeHelper.appHangMonitor = appHangMonitor;
        }
        nativeHelper.activity.m15584j2();
        C7635f.m31524D().m31552t();
        C10902j c10902jM41464j = C10902j.m41464j();
        if (c10902jM41464j.m41466f()) {
            c10902jM41464j.m41469i(context);
        }
        C11370y.m42581h().m42585d().mo14923a(nativeHelper.activity);
        if (C11659h.m43403a().mo43697p2() && Intrinsics.m31980c(Environment.getExternalStorageState(), "mounted")) {
            File externalFilesDir = nativeHelper.activity.getExternalFilesDir(null);
            NativeSettingsInterface.nativeSetExternalDirectory(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        }
        if (C11659h.m43403a().mo43548U5()) {
            Intrinsics.checkNotNull(context);
            C4617i.m22793m(context);
        }
        if (C11659h.m43403a().mo43526R4()) {
            C9477c.m37336c(context);
        }
    }

    /* JADX INFO: renamed from: R */
    public static final void m15625R(NativeHelper nativeHelper) {
        nativeHelper.m15671G();
        if (nativeHelper.isInExperience) {
            nativeHelper.activity.m15590p2();
        }
        C3272a.m15706n();
    }

    /* JADX INFO: renamed from: S */
    public static final void m15626S(NativeHelper nativeHelper, String str) {
        InterfaceC12468w0 interfaceC12468w0 = nativeHelper.overlayEditTextController;
        if (interfaceC12468w0 != null) {
            interfaceC12468w0.mo15259d(str);
        }
    }

    /* JADX INFO: renamed from: T */
    public static final void m15627T(NativeHelper nativeHelper) {
        InterfaceC12468w0 interfaceC12468w0 = nativeHelper.overlayEditTextController;
        if (interfaceC12468w0 != null) {
            interfaceC12468w0.mo15258c();
        }
    }

    /* JADX INFO: renamed from: U */
    public static final void m15628U(NativeHelper nativeHelper) {
        ViewOnTouchListenerC8572f viewOnTouchListenerC8572f = nativeHelper.inputListener;
        if (viewOnTouchListenerC8572f != null) {
            viewOnTouchListenerC8572f.m34556H(true);
        }
    }

    /* JADX INFO: renamed from: V */
    public static final void m15629V(NativeHelper nativeHelper) {
        nativeHelper.activity.recreate();
    }

    /* JADX INFO: renamed from: W */
    public static final void m15630W(NativeHelper nativeHelper) {
        C10890f.m41453f(nativeHelper.activity, nativeHelper.contentViewId);
    }

    /* JADX INFO: renamed from: X */
    public static final void m15631X(NativeHelper nativeHelper, int i10) {
        nativeHelper.activity.setRequestedOrientation(i10);
    }

    /* JADX INFO: renamed from: Y */
    public static final void m15632Y(int i10, NativeHelper nativeHelper, int i11, String str, String str2) {
        if (i10 != 0) {
            C12216g.m45228b().m45278q("Android-AppLogin-BrowserTracker-Failed");
            nativeHelper.m15672e0();
            return;
        }
        C3179d.e eVar = new C3179d.e();
        if (i11 == 1) {
            eVar.m15097d();
        } else if (i11 != 2) {
            eVar.m15099f();
        } else {
            eVar.m15098e();
        }
        eVar.f11771b = str;
        eVar.f11772c = str2;
        C12216g.m45228b().m45278q("Android-AppLogin-BrowserTracker-Success");
        if (eVar.m15095b() || eVar.m15096c()) {
            C3179d.m15085e().m15090g(eVar);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static final void m15633Z(byte[] bArr, NativeHelper nativeHelper, long j10, boolean z10, NativeTextBoxInfo nativeTextBoxInfo) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str = new String(bArr, UTF_8);
        InterfaceC12468w0 interfaceC12468w0 = nativeHelper.overlayEditTextController;
        if (interfaceC12468w0 != null) {
            interfaceC12468w0.mo15257b(j10, z10, str, nativeTextBoxInfo);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static final void m15635a0(NativeHelper nativeHelper, InterfaceC0980s owner, AbstractC0966l.a event) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(event, "event");
        C6124q.m27057b("NativeHelper", "onStateChanged: event: " + event);
        switch (C3267b.f12324a[event.ordinal()]) {
            case 1:
                C10583b.m40569f().m40587u(nativeHelper.activity);
                NativeLocaleJavaInterface.setImplementation(new C9479a());
                C12214e.m45220c().m45222d(nativeHelper.activity);
                C6124q.m27057b("NativeHelper", "Initializing RTC audio manager.");
                InterfaceC13810a interfaceC13810aM42584c = C11370y.m42581h().m42584c(nativeHelper.activity.getApplicationContext());
                interfaceC13810aM42584c.mo50292b(nativeHelper.activity);
                nativeHelper.rtcAudioManager = interfaceC13810aM42584c;
                if (C11659h.m43403a().mo43505O3() && !C12211b.m45202n()) {
                    nativeHelper.activity.getWindow().addFlags(8192);
                }
                if (C11659h.m43403a().mo43548U5()) {
                    nativeHelper.activity.mo4656a().mo4935a(C4617i.f18890a);
                }
                if (C11659h.m43403a().mo43749w5()) {
                    if (C11659h.m43403a().mo43683n2()) {
                        nativeHelper.activity.mo4656a().mo4935a(C5663g.f21724a);
                    } else {
                        nativeHelper.activity.mo4656a().mo4935a(C5660d.f21719a);
                    }
                }
                MediaPickerProtocol.m15873o().m15877l(nativeHelper.activity);
                C11370y.m42581h().m42588g().m29212n(nativeHelper.activity);
                NativeGLJavaInterface.setWebviewUserAgentGetter(nativeHelper.webViewUserAgentGetter);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(nativeHelper.mobileAdvertisingIdGetter);
                C5654c.m25669c().m25681m();
                nativeHelper.adsHelper.m43322e(nativeHelper.activity);
                if (C11659h.m43403a().mo43678m4()) {
                    C11382g.m42691q(C7688j0.m31791g(new Pair("webrtcsdk", new ExpBackOffRetryPolicy(3, 2000L))));
                    C6124q.m27063h("NativeHelper", "Requesting WebRTC SDK module download immediately.");
                    C11382g.m42686l("webrtcsdk");
                }
                if (C6129v.m27098b()) {
                    C6129v.m27097a(C11382g.f40243a, "NativeHelper");
                    owner.mo4656a().mo4935a(FacialAgeEstimationProtocol.INSTANCE);
                }
                if (C11659h.m43403a().mo43538T2()) {
                    nativeHelper.activity.mo4656a().mo4935a(C12464u0.f44579a);
                }
                if (C11659h.m43403a().mo43515Q() || C11659h.m43403a().mo43606c5()) {
                    nativeHelper.activity.mo4656a().mo4935a(DeviceDisplayHandler.INSTANCE);
                }
                if (C11659h.m43403a().mo43661k1()) {
                    nativeHelper.activity.mo4656a().mo4935a(ExternalIdentityHandler.INSTANCE);
                    return;
                }
                return;
            case 2:
                nativeHelper.isVisible = true;
                C10293a.m39556c().m39557a();
                nativeHelper.m15677o0();
                C12486h.m46774h().m46776i(f12304t);
                C12216g.m45228b().m45270i0();
                C5840c.m26204d().m26215n(nativeHelper);
                AppHangMonitor appHangMonitor = nativeHelper.appHangMonitor;
                if (appHangMonitor != null) {
                    appHangMonitor.m15846b();
                }
                C6426b.m28011h().m28012e();
                C7635f.m31524D().m31531E(nativeHelper.activity);
                return;
            case 3:
                nativeHelper.isForeground = true;
                nativeHelper.m15671G();
                nativeHelper.m15675m0();
                nativeHelper.m15674h0();
                ViewOnTouchListenerC8572f viewOnTouchListenerC8572f = nativeHelper.inputListener;
                if (viewOnTouchListenerC8572f != null) {
                    viewOnTouchListenerC8572f.m34556H(false);
                }
                INSTANCE.m15680c(nativeHelper.activity, event);
                C13203c.m48827i().m48832j(nativeHelper.activity);
                C5163a.m24018k().m24020l(nativeHelper.activity, new Intent(nativeHelper.activity, (Class<?>) ShareAppChosenReceiver.class), 20124, new C5163a.g() { // from class: ak.b2
                    @Override // p108em.C5163a.g
                    /* JADX INFO: renamed from: a */
                    public final void mo1231a(String str, String str2) {
                        NativeHelper.m15637b0(str, str2);
                    }
                });
                return;
            case 4:
                nativeHelper.isForeground = false;
                ViewOnTouchListenerC8572f viewOnTouchListenerC8572f2 = nativeHelper.inputListener;
                if (viewOnTouchListenerC8572f2 != null) {
                    viewOnTouchListenerC8572f2.m34557I();
                }
                C6134a.m27112b().m27115e();
                C13203c.m48827i().m48833k(nativeHelper.activity);
                C5163a.m24018k().m24021m();
                return;
            case 5:
                nativeHelper.isVisible = false;
                C5840c.m26204d().m26217p(nativeHelper);
                C10293a.m39556c().m39558b();
                C12214e.m45220c().m45225g(nativeHelper.notificationObserver);
                INSTANCE.m15680c(nativeHelper.activity, event);
                C12486h.m46774h().m46777j(f12304t);
                AppHangMonitor appHangMonitor2 = nativeHelper.appHangMonitor;
                if (appHangMonitor2 != null) {
                    appHangMonitor2.m15845a();
                }
                C6426b.m28011h().m28013f();
                C7635f.m31524D().m31532F();
                return;
            case 6:
                C6124q.m27057b("NativeHelper", "Disposing RTC audio manager.");
                InterfaceC13810a interfaceC13810a = nativeHelper.rtcAudioManager;
                if (interfaceC13810a != null) {
                    interfaceC13810a.mo50291a();
                }
                nativeHelper.rtcAudioManager = null;
                NativeGLJavaInterface.setWebviewUserAgentGetter(null);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
                nativeHelper.adsHelper.m43323f();
                return;
            case 7:
                return;
            default:
                throw new C7345l();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static final void m15637b0(String str, String str2) {
        C13818a.m50301c(str, str2);
    }

    /* JADX INFO: renamed from: c0 */
    public static final void m15639c0() {
        NativeGLInterface.setMobileAdvertisingId(C6107c.m27009d());
    }

    /* JADX INFO: renamed from: d0 */
    public static final void m15641d0(int i10, Bundle bundle) {
        if (i10 == 2) {
            C6124q.m27057b("NativeHelper", "handleNotification: Logout event. Do nothing.");
        } else {
            if (i10 != 101) {
                throw new IllegalStateException("Unhandled notificationId");
            }
            C6124q.m27060e("NativeHelper", "handleNotification: Start PlaceID event...");
            throw new IllegalStateException("Error: Notification 'Start PlaceID' still needs to be handled.");
        }
    }

    /* JADX INFO: renamed from: f0 */
    public static final void m15644f0(NativeHelper nativeHelper) {
        C12175e.m45057h().m45061i(nativeHelper.activity.getApplicationContext());
        nativeHelper.activity.m15580J();
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m15648i0() {
        C6124q.m27063h("NativeHelper", "Requesting permissions for MediaPickerProtocol");
        C11370y.m42581h().m42591k().m38643Z(new String[]{EnumC9813n.MEDIA_PICKER.toString()});
    }

    /* JADX INFO: renamed from: j0 */
    public static final void m15650j0(NativeHelper nativeHelper, final String str) {
        nativeHelper.activity.runOnUiThread(new Runnable() { // from class: ak.a2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15652k0(str);
            }
        });
    }

    /* JADX INFO: renamed from: k0 */
    public static final void m15652k0(String str) {
        C5654c.m25669c().m25689u(EnumC9799a.INSTANCE.m38605a(str));
    }

    /* JADX INFO: renamed from: l0 */
    public static final void m15654l0(NativeHelper nativeHelper, boolean z10) {
        C10265c.f36879a.m39430j(z10);
        C10264b.f36878a.m39421b(nativeHelper.activity, z10);
    }

    /* JADX INFO: renamed from: p0 */
    public static final void m15659p0() {
        C6124q.m27063h("NativeHelper", "(callback) onCookieChanged: Update cookies (from web) => engine.");
        C11295a1.m42419S0();
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m15661q0(NativeHelper nativeHelper) {
        if (C11659h.m43403a().mo43641h2()) {
            NativeGLInterface.setWebviewUserAgent(C0319n2.m1323c(nativeHelper.activity));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(nativeHelper.activity));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m15671G() {
        boolean z10 = false;
        boolean z11 = this.activity.getResources().getConfiguration().orientation == 2;
        if (C11295a1.m42461l0() && z11) {
            z10 = true;
        }
        C6124q.m27057b("NativeHelper", "adjustWindowInsets: isForeground=" + this.isForeground + ", isInExperience=" + this.isInExperience + ", isLandscape=" + z11 + ", shouldHideInLandscape=" + z10);
        if (this.isInExperience || z10) {
            Window window = this.activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            C11304c2.m42492b(window);
        } else {
            Window window2 = this.activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
            C11304c2.m42493c(window2);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m15672e0() {
        LoggingProtocol.m15996i("init_failure", 0L, 2, null);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.d2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15644f0(this.f746a);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m15673g0() {
        m15671G();
    }

    @Keep
    public final void gameActivity_hideKeyboard() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.s1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15615H(this.f842a);
            }
        });
    }

    @Keep
    public final void gameActivity_onAppReady(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C6124q.m27057b("NativeHelper", "gameActivity_onAppReady: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.k1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15616I(this.f806a);
            }
        });
        if (Intrinsics.m31980c(data, "Push")) {
            C11370y.m42581h().m42591k().m38645b0(this.activity.getApplicationContext());
        }
        if (C11659h.m43403a().mo43641h2()) {
            C7882k.m32780d(C7910q0.m32885a(this.ioDispatcher), null, null, new C3268c(null), 3, null);
        }
    }

    @Keep
    public final void gameActivity_onDidLogInReceived(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C6124q.m27057b("NativeHelper", "gameActivity_onDidLogInReceived: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.o1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15617J(this.f825a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidLogOutReceived() {
        C6124q.m27057b("NativeHelper", "gameActivity_onDidLogOutReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.q1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15618K(this.f832a);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSignUp(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C6124q.m27057b("NativeHelper", "gameActivity_onDidSignUp: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.l1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15619L(this.f810a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSwitchAccountReceived() {
        C6124q.m27057b("NativeHelper", "gameActivity_onDidSwitchAccountReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.j2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15620M(this.f777a);
            }
        });
    }

    @Keep
    public final void gameActivity_onEngineInitialized() {
        C6124q.m27057b("NativeHelper", "gameActivity_onEngineInitialized:");
        this.isEngineInitialized = true;
        if (this.enableConnectivityV2ForAndroid) {
            Context applicationContext = this.activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ConnectivityV2Monitor.setup(applicationContext);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ak.i2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15621N(this.f772a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStart() {
        C6124q.m27057b("NativeHelper", "gameActivity_onExperienceStart:");
        this.isInExperience = true;
        C13192a.f46459a.m48804b(true);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.c2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15622O(this.f742a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStop(final double timeInMs) {
        C6124q.m27057b("NativeHelper", "gameActivity_onExperienceStop:");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.p1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15623P(this.f829a, timeInMs);
            }
        });
    }

    @Keep
    public final void gameActivity_onFlagsFailed() {
        C6124q.m27057b("NativeHelper", "gameActivity_onFlagsFailed:");
        m15672e0();
    }

    @Keep
    public final void gameActivity_onFlagsLoaded(@NotNull ByteBuffer flagsBuffer) {
        Intrinsics.checkNotNullParameter(flagsBuffer, "flagsBuffer");
        C6124q.m27057b("NativeHelper", "gameActivity_onFlagsLoaded: size = " + flagsBuffer.remaining());
        String string = StandardCharsets.UTF_8.newDecoder().decode(flagsBuffer).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        final Context applicationContext = this.activity.getApplicationContext();
        C3272a.m15689F(string, applicationContext);
        C3272a.m15685B(applicationContext);
        this.enableConnectivityV2ForAndroid = C11659h.m43403a().mo43656j3();
        NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.enableConnectivityV2ForAndroid);
        C3272a.m15699g(applicationContext);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.i1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15624Q(applicationContext, this);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameLoaded(long placeId) {
        C6124q.m27063h("NativeHelper", "gameActivity_onGameLoaded: placeId = " + placeId);
        boolean z10 = placeId > 0;
        this.isInExperience = z10;
        C13192a.f46459a.m48804b(z10);
        if (C11659h.m43403a().mo43664k4() && this.isInExperience) {
            LoggingProtocol.m15996i("native_experience_start", 0L, 2, null);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ak.g1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15625R(this.f758a);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameStreamingStatusChanged(@NotNull String data) {
        Object objM30460b;
        Intrinsics.checkNotNullParameter(data, "data");
        if (C11659h.m43403a().mo43537T1()) {
            try {
                C7347n.Companion companion = C7347n.INSTANCE;
                if (new JSONObject(data).optBoolean("inGameStreaming", false)) {
                    C12454p0.m46687f(this.activity);
                } else {
                    C12454p0.m46690i(this.activity);
                }
                objM30460b = C7347n.m30460b(Unit.f29331a);
            } catch (Throwable th2) {
                C7347n.Companion companion2 = C7347n.INSTANCE;
                objM30460b = C7347n.m30460b(C7348o.m30469a(th2));
            }
            Throwable thM30463e = C7347n.m30463e(objM30460b);
            if (thM30463e != null) {
                C6124q.m27060e("NativeHelper", "Failed to parse GAME_STREAMING_STATUS_CHANGED: " + thM30463e.getMessage());
            }
        }
    }

    @Keep
    public final void gameActivity_onLuaAppDidReturn() {
        C6124q.m27057b("NativeHelper", "gameActivity_onLuaAppDidReturn:");
        this.activity.requestOrientationAsDefault();
    }

    @Keep
    public final void gameActivity_onLuaTextBoxChanged(@NotNull final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.g2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15626S(this.f759a, value);
            }
        });
    }

    @Keep
    public final void gameActivity_onLuaTextBoxPropertyChanged() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.r1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15627T(this.f838a);
            }
        });
    }

    @Keep
    public final void gameActivity_onMotionEventListening(@NotNull String motionType) {
        Intrinsics.checkNotNullParameter(motionType, "motionType");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.h1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15628U(this.f761a);
            }
        });
    }

    @Keep
    public final void gameActivity_onRestartLuaApp() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.n1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15629V(this.f821a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScanQrCode() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.j1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15630W(this.f776a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScreenOrientationChanged(int orientation, boolean inExperience) {
        if (!inExperience) {
            C6124q.m27063h("NativeHelper", "gameActivity_onScreenOrientationChanged: (In-App) request the default Orientation.");
            this.activity.requestOrientationAsDefault();
            return;
        }
        final int iM15681d = INSTANCE.m15681d(orientation);
        if (iM15681d != -1) {
            C6124q.m27063h("NativeHelper", "gameActivity_onScreenOrientationChanged: orientation:" + orientation + " => " + iM15681d);
            this.activity.runOnUiThread(new Runnable() { // from class: ak.e2
                @Override // java.lang.Runnable
                public final void run() {
                    NativeHelper.m15631X(this.f749a, iM15681d);
                }
            });
        }
    }

    @Keep
    public final void gameActivity_onScreenshotReady(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        C7882k.m32780d(C7910q0.m32885a(this.ioDispatcher), null, null, new C3269d(path, null), 3, null);
    }

    @Keep
    public final void gameActivity_setAppUpgradeStatus(final int result, final int upgradeStatusCode, @NotNull final String apkUrl, @NotNull final String apkCheckSum) {
        Intrinsics.checkNotNullParameter(apkUrl, "apkUrl");
        Intrinsics.checkNotNullParameter(apkCheckSum, "apkCheckSum");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.m1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15632Y(result, this, upgradeStatusCode, apkUrl, apkCheckSum);
            }
        });
    }

    @Keep
    public final void gameActivity_showKeyboard(final long textBox, final boolean showNativeInput, @NotNull final byte[] byteArrayFromTextBox, @NotNull final NativeTextBoxInfo textBoxInfo) {
        Intrinsics.checkNotNullParameter(byteArrayFromTextBox, "byteArrayFromTextBox");
        Intrinsics.checkNotNullParameter(textBoxInfo, "textBoxInfo");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.h2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.m15633Z(byteArrayFromTextBox, this, textBox, showNativeInput, textBoxInfo);
            }
        });
    }

    /* JADX INFO: renamed from: h0 */
    public final void m15674h0() {
        C6124q.m27057b("NativeHelper", "onForegroundOrEngineInitialized: isForeground = " + this.isForeground + ", isEngineInitialized = " + this.isEngineInitialized);
        if (this.isForeground && this.isEngineInitialized) {
            MediaPickerProtocol.m15873o().m15878m(this.activity, new InterfaceC8166f() { // from class: ak.x1
                @Override // p274ll.InterfaceC8166f
                /* JADX INFO: renamed from: a */
                public final void mo1373a() {
                    NativeHelper.m15648i0();
                }
            });
            C6134a.m27112b().m27114d(this.activity);
            AbstractC0966l abstractC0966lMo4656a = this.activity.mo4656a();
            SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f12789a;
            abstractC0966lMo4656a.mo4935a(systemThemeProtocol);
            systemThemeProtocol.m16079O(new SystemThemeProtocol.InterfaceC3368d() { // from class: ak.y1
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.InterfaceC3368d
                /* JADX INFO: renamed from: a */
                public final void mo1375a(String str) {
                    NativeHelper.m15650j0(this.f868a, str);
                }
            });
            if (C11659h.m43403a().mo43575Y4()) {
                systemThemeProtocol.m16076H(new C3270e(C10275m.f36898a));
            } else if (C11659h.m43403a().mo43536T0()) {
                systemThemeProtocol.m16077K(new SystemThemeProtocol.InterfaceC3366b() { // from class: ak.z1
                    @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.InterfaceC3366b
                    /* JADX INFO: renamed from: a */
                    public final void mo1376a(boolean z10) {
                        NativeHelper.m15654l0(this.f871a, z10);
                    }
                });
            }
            if (C11659h.m43403a().mo43635g3()) {
                this.activity.mo4656a().mo4935a(AppRatingPromptHandler.f12735a);
            }
            if (C11659h.m43403a().mo43480K5()) {
                this.activity.mo4656a().mo4935a(RecentlyPlayedWidgetHandler.INSTANCE);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public final void m15675m0() {
        C6124q.m27057b("NativeHelper", "onForegroundOrLogin: isForeground = " + this.isForeground + ", isLoggedIn = " + C12217h.m45288e().m45295f());
        if (this.isForeground) {
            C3179d.m15085e().m15086b(new C3271f());
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m15676n0(int contentViewId, @NotNull SurfaceView surfaceView, @NotNull RbxKeyboard rbxEditText, @NotNull ViewOnTouchListenerC8572f.f inputAdapter) {
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(rbxEditText, "rbxEditText");
        Intrinsics.checkNotNullParameter(inputAdapter, "inputAdapter");
        this.contentViewId = contentViewId;
        ViewOnTouchListenerC8572f viewOnTouchListenerC8572f = this.inputListener;
        if (viewOnTouchListenerC8572f != null) {
            viewOnTouchListenerC8572f.m34557I();
        }
        ViewOnTouchListenerC8572f viewOnTouchListenerC8572f2 = new ViewOnTouchListenerC8572f(this.activity, surfaceView, inputAdapter);
        this.inputListener = viewOnTouchListenerC8572f2;
        surfaceView.setOnTouchListener(viewOnTouchListenerC8572f2);
        this.overlayEditTextController = new C12456q0(rbxEditText);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m15677o0() {
        C6124q.m27057b("NativeHelper", "onVisibleOrLogin: isVisible = " + this.isVisible + ", isLoggedIn = " + C12217h.m45288e().m45295f());
        if (this.isVisible && C12217h.m45288e().m45295f()) {
            C12214e.m45220c().m45221b(this.notificationObserver);
        }
    }

    @InterfaceC5847j(threadMode = ThreadMode.MAIN)
    @Keep
    public final void onCodeParsedFromSMS(@NotNull C10261j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        C6124q.m27063h("NativeHelper", "SMS code received.");
        C6124q.m27063h("NativeHelper", "Calling IdentityProtocol to parse OTP.");
        C11370y.m42581h().m42588g().m29213o(event.f36873a);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
      (r1v0 com.roblox.client.startup.MainGameActivity)
      (r2v0 fh.i)
      (r3v0 tg.a)
      (wrap ku.l0:?: TERNARY null = ((wrap int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap ku.l0:0x0004: INVOKE  STATIC call: ku.g1.b():ku.l0 A[MD:():ku.l0 (m), WRAPPED] (LINE:11)) : (r4v0 ku.l0))
     A[MD:(com.roblox.client.startup.MainGameActivity, fh.i, tg.a, ku.l0):void (m)] (LINE:12) call: com.roblox.client.startup.NativeHelper.<init>(com.roblox.client.startup.MainGameActivity, fh.i, tg.a, ku.l0):void type: THIS */
    public /* synthetic */ NativeHelper(MainGameActivity mainGameActivity, InterfaceC5608i interfaceC5608i, C11642a c11642a, AbstractC7888l0 abstractC7888l0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainGameActivity, interfaceC5608i, c11642a, (i10 & 8) != 0 ? C7864g1.m32644b() : abstractC7888l0);
    }
}
