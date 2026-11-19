package com.roblox.client.startup;

import ai.ExpBackOffRetryPolicy;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.view.Display;
import android.view.SurfaceView;
import android.view.Window;
import android.webkit.WebSettings;
import androidx.annotation.Keep;
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;
import av.g1;
import av.l0;
import av.p0;
import av.q0;
import bh.c2;
import bh.t0;
import bh.y;
import bn.k;
import com.github.luben.zstd.BuildConfig;
import com.roblox.client.RbxKeyboard;
import com.roblox.client.ShareAppChosenReceiver;
import com.roblox.client.shortcuts.PinShortcutHandler;
import com.roblox.client.startup.NativeHelper;
import com.roblox.client.widgets.RecentlyPlayedWidgetHandler;
import com.roblox.engine.jni.NativeAppBridgeInterface;
import com.roblox.engine.jni.NativeGLInterface;
import com.roblox.engine.jni.NativeGLJavaInterface;
import com.roblox.engine.jni.NativeReportingInterface;
import com.roblox.engine.jni.NativeSettingsInterface;
import com.roblox.engine.jni.locale.NativeLocaleJavaInterface;
import com.roblox.engine.jni.memstorage.MemStorage;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import com.roblox.platform.util.DeviceUtils;
import com.roblox.protocols.apphangmonitor.AppHangMonitor;
import com.roblox.protocols.calling.CallingHandler;
import com.roblox.protocols.connectivityv2.ConnectivityV2Monitor;
import com.roblox.protocols.devicedisplay.DeviceDisplayHandler;
import com.roblox.protocols.externalidentity.ExternalIdentityHandler;
import com.roblox.protocols.mediapicker.MediaPickerProtocol;
import com.roblox.universalapp.appratingprompt.AppRatingPromptHandler;
import com.roblox.universalapp.facialageestimation.FacialAgeEstimationProtocol;
import com.roblox.universalapp.logging.LoggingProtocol;
import com.roblox.universalapp.systemtheme.SystemThemeProtocol;
import dl.h;
import dl.j;
import ei.a1;
import ei.r0;
import ei.v0;
import ei.x0;
import gu.m;
import ik.k0;
import ik.t2;
import ik.u2;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import oh.i;
import ok.q;
import ok.v;
import ok.z;
import org.fmod.FMOD;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p001kotlin.Metadata;
import p001kotlin.Pair;
import p001kotlin.Unit;
import p001kotlin.collections.j0;
import p001kotlin.jvm.functions.Function2;
import p001kotlin.jvm.internal.DefaultConstructorMarker;
import p001kotlin.jvm.internal.Intrinsics;
import rj.t;
import zt.n;
import zt.o;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 £\u00012\u00020\u0001:\u0001cB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ/\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\fH\u0007¢\u0006\u0004\b)\u0010\u000eJ\u000f\u0010*\u001a\u00020\fH\u0007¢\u0006\u0004\b*\u0010\u000eJ\u000f\u0010+\u001a\u00020\fH\u0007¢\u0006\u0004\b+\u0010\u000eJ\u000f\u0010,\u001a\u00020\fH\u0007¢\u0006\u0004\b,\u0010\u000eJ\u0017\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\u0006\u00101\u001a\u00020-H\u0007¢\u0006\u0004\b2\u00100J\u001f\u00106\u001a\u00020\f2\u0006\u00103\u001a\u00020\u00172\u0006\u00105\u001a\u000204H\u0007¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\f2\u0006\u00108\u001a\u00020\"H\u0007¢\u0006\u0004\b9\u0010:J\u0017\u0010<\u001a\u00020\f2\u0006\u0010;\u001a\u00020\"H\u0007¢\u0006\u0004\b<\u0010:J\u000f\u0010=\u001a\u00020\fH\u0007¢\u0006\u0004\b=\u0010\u000eJ\u0017\u0010>\u001a\u00020\f2\u0006\u00108\u001a\u00020\"H\u0007¢\u0006\u0004\b>\u0010:J\u0017\u0010?\u001a\u00020\f2\u0006\u00108\u001a\u00020\"H\u0007¢\u0006\u0004\b?\u0010:J\u0017\u0010@\u001a\u00020\f2\u0006\u00108\u001a\u00020\"H\u0007¢\u0006\u0004\b@\u0010:J\u000f\u0010A\u001a\u00020\fH\u0007¢\u0006\u0004\bA\u0010\u000eJ\u000f\u0010B\u001a\u00020\fH\u0007¢\u0006\u0004\bB\u0010\u000eJ\u000f\u0010C\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010\u000eJ\u0017\u0010F\u001a\u00020\f2\u0006\u0010E\u001a\u00020DH\u0007¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0007¢\u0006\u0004\bH\u0010\u000eJ\u000f\u0010I\u001a\u00020\fH\u0007¢\u0006\u0004\bI\u0010\u000eJ/\u0010P\u001a\u00020\f2\u0006\u0010J\u001a\u00020-2\u0006\u0010K\u001a\u0002042\u0006\u0010M\u001a\u00020L2\u0006\u0010O\u001a\u00020NH\u0007¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0007¢\u0006\u0004\bR\u0010\u000eJ\u0017\u0010T\u001a\u00020\f2\u0006\u0010S\u001a\u00020\"H\u0007¢\u0006\u0004\bT\u0010:J\u000f\u0010U\u001a\u00020\fH\u0007¢\u0006\u0004\bU\u0010\u000eJ\u0017\u0010W\u001a\u00020\f2\u0006\u0010V\u001a\u00020\"H\u0007¢\u0006\u0004\bW\u0010:J/\u0010\\\u001a\u00020\f2\u0006\u0010X\u001a\u00020\u00172\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010Z\u001a\u00020\"2\u0006\u0010[\u001a\u00020\"H\u0007¢\u0006\u0004\b\\\u0010]J\u0017\u0010`\u001a\u00020\f2\u0006\u0010_\u001a\u00020^H\u0007¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\fH\u0007¢\u0006\u0004\bb\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0018\u0010n\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010r\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010u\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR\u0016\u0010y\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010tR\u0016\u0010{\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010tR\u0016\u0010}\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010tR\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0015R\u001c\u0010\u008a\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R\u001c\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001c\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u0097\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0018\u0010¢\u0001\u001a\u00030\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001¨\u0006¤\u0001"}, d2 = {"Lcom/roblox/client/startup/NativeHelper;", BuildConfig.FLAVOR, "Lcom/roblox/client/startup/MainGameActivity;", "activity", "Loh/i;", "upgradeDialog", "Lch/a;", "adsHelper", "Lav/l0;", "ioDispatcher", "<init>", "(Lcom/roblox/client/startup/MainGameActivity;Loh/i;Lch/a;Lav/l0;)V", BuildConfig.FLAVOR, "s0", "()V", "q0", "l0", "t0", "x0", "v0", "w0", "I", "i0", BuildConfig.FLAVOR, "contentViewId", "Landroid/view/SurfaceView;", "surfaceView", "Lcom/roblox/client/RbxKeyboard;", "rbxEditText", "Luk/f$f;", "inputAdapter", "r0", "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Luk/f$f;)V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "gameActivity_getShellFlagKeys", "()[Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "flagsBuffer", "gameActivity_onFlagsLoaded", "(Ljava/nio/ByteBuffer;)V", "gameActivity_onFlagsFailed", "gameActivity_onEngineInitialized", "gameActivity_onHomePageLoaded", "gameActivity_onHomePageInteractive", BuildConfig.FLAVOR, "browserTrackerId", "gameActivity_setBrowserTrackerId", "(J)V", PinShortcutHandler.EXTRA_PLACE_ID, "gameActivity_onGameLoaded", "orientation", BuildConfig.FLAVOR, "inExperience", "gameActivity_onScreenOrientationChanged", "(IZ)V", "data", "gameActivity_onGameStreamingStatusChanged", "(Ljava/lang/String;)V", "motionType", "gameActivity_onMotionEventListening", "gameActivity_onLuaAppDidReturn", "gameActivity_onDidLogInReceived", "gameActivity_onDidSignUp", "gameActivity_onAppReady", "gameActivity_onDidLogOutReceived", "gameActivity_onDidSwitchAccountReceived", "gameActivity_onExperienceStart", BuildConfig.FLAVOR, "timeInMs", "gameActivity_onExperienceStop", "(D)V", "gameActivity_onRestartLuaApp", "gameActivity_onScanQrCode", "textBox", "showNativeInput", BuildConfig.FLAVOR, "byteArrayFromTextBox", "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;", "textBoxInfo", "gameActivity_showKeyboard", "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V", "gameActivity_hideKeyboard", "value", "gameActivity_onLuaTextBoxChanged", "gameActivity_onLuaTextBoxPropertyChanged", "path", "gameActivity_onScreenshotReady", "result", "upgradeStatusCode", "apkUrl", "apkCheckSum", "gameActivity_setAppUpgradeStatus", "(IILjava/lang/String;Ljava/lang/String;)V", "Lyh/j;", "event", "onCodeParsedFromSMS", "(Lyh/j;)V", "k0", "a", "Lcom/roblox/client/startup/MainGameActivity;", "b", "Loh/i;", "c", "Lch/a;", "d", "Lav/l0;", "Luk/f;", "e", "Luk/f;", "inputListener", "Lei/x0;", "f", "Lei/x0;", "overlayEditTextController", "g", "Z", "isVisible", "h", "isForeground", "i", "isEngineInitialized", "j", "isInExperience", "k", "enableConnectivityV2ForAndroid", "Lih/a;", "l", "Lih/a;", "rtcAudioManager", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "m", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "appHangMonitor", "n", "Lei/i;", "o", "Lei/i;", "batteryStatusObserver", "Lei/a1;", "p", "Lei/a1;", "thermalStatusObserver", "Landroid/hardware/display/DisplayManager$DisplayListener;", "q", "Landroid/hardware/display/DisplayManager$DisplayListener;", "displayListener", "Landroidx/lifecycle/p;", "r", "Landroidx/lifecycle/p;", "lifecycleEventObserver", "Ldj/e$e;", "s", "Ldj/e$e;", "notificationObserver", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "t", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "webViewUserAgentGetter", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "u", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "mobileAdvertisingIdGetter", "v", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeHelper {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public static final h.d f9328w = new h.d() { // from class: ik.n2
        @Override // dl.h.d
        public final void a() {
            NativeHelper.u0();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MainGameActivity activity;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final i upgradeDialog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ch.a adsHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public uk.f inputListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public x0 overlayEditTextController;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isVisible;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isForeground;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isEngineInitialized;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isInExperience;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public volatile boolean enableConnectivityV2ForAndroid;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ih.a rtcAudioManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AppHangMonitor appHangMonitor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int contentViewId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ei.i batteryStatusObserver;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public a1 thermalStatusObserver;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public DisplayManager.DisplayListener displayListener;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p lifecycleEventObserver;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final dj.e.InterfaceC0225e notificationObserver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.WebViewUserAgentGetter webViewUserAgentGetter;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.MobileAdvertisingIdGetter mobileAdvertisingIdGetter;

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/startup/NativeHelper$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/l$a;", "event", BuildConfig.FLAVOR, "c", "(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V", BuildConfig.FLAVOR, "orientation", "d", "(I)I", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "Ldl/h$d;", "securityCookieObserver", "Ldl/h$d;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0153a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9349a;

            static {
                int[] iArr = new int[l.a.values().length];
                try {
                    iArr[l.a.ON_RESUME.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[l.a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f9349a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void c(Activity activity, l.a event) {
            k kVarK = y.h().k();
            int i10 = C0153a.f9349a[event.ordinal()];
            if (i10 == 1) {
                kVarK.S(activity);
                kVarK.R();
                kVarK.c("POST_NOTIFICATIONS", t.g());
                kVarK.c("MEDIA_PICKER", ej.a.e());
                return;
            }
            if (i10 == 2) {
                kVarK.N("POST_NOTIFICATIONS");
                kVarK.N("MEDIA_PICKER");
            } else {
                throw new IllegalStateException(("Unhandled lifecycle event: " + event).toString());
            }
        }

        public final int d(int orientation) {
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
            q.k("NativeHelper", "orientationFromEngineToNative: Unsupported orientation = " + orientation);
            return -1;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9350a;

        static {
            int[] iArr = new int[l.a.values().length];
            try {
                iArr[l.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[l.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[l.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9350a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.startup.NativeHelper$gameActivity_onAppReady$2", f = "NativeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9351t;

        public c(eu.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return NativeHelper.this.new c(bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9351t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            u2.b(NativeHelper.this.activity);
            return Unit.f21506a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lav/p0;", BuildConfig.FLAVOR, "<anonymous>", "(Lav/p0;)V"}, k = 3, mv = {2, 2, 0})
    @gu.f(c = "com.roblox.client.startup.NativeHelper$gameActivity_onScreenshotReady$1", f = "NativeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, eu.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9353t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f9354u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, eu.b<? super d> bVar) {
            super(2, bVar);
            this.f9354u = str;
        }

        @Override // gu.a
        public final eu.b<Unit> create(Object obj, eu.b<?> bVar) {
            return new d(this.f9354u, bVar);
        }

        @Override // p001kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, eu.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f21506a);
        }

        @Override // gu.a
        public final Object invokeSuspend(Object obj) {
            fu.c.e();
            if (this.f9353t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            ei.k.v(this.f9354u);
            return Unit.f21506a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e implements SystemThemeProtocol.a, p001kotlin.jvm.internal.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xi.m f9355a;

        public e(xi.m mVar) {
            this.f9355a = mVar;
        }

        @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.a
        public final void a(String p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            this.f9355a.f(p8);
        }

        @Override // p001kotlin.jvm.internal.h
        public final zt.b<?> b() {
            return new p001kotlin.jvm.internal.k(1, this.f9355a, xi.m.class, "onAppIconChanged", "onAppIconChanged(Ljava/lang/String;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof SystemThemeProtocol.a) && (obj instanceof p001kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((p001kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/roblox/client/startup/NativeHelper$f", "Lcom/roblox/client/d$d;", "Lcom/roblox/client/d$e;", "result", BuildConfig.FLAVOR, "a", "(Lcom/roblox/client/d$e;)V", "status", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements com.roblox.client.d.InterfaceC0142d {
        public f() {
        }

        @Override // com.roblox.client.d.InterfaceC0142d
        public void a(com.roblox.client.d.e result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.b()) {
                NativeHelper.this.upgradeDialog.a(i.a.Optional);
                return;
            }
            if (result.c()) {
                NativeHelper.this.upgradeDialog.a(i.a.Required);
            } else if (ok.t.j() && result.a()) {
                NativeHelper.this.upgradeDialog.a(i.a.NewApp);
                dj.b.f().i(NativeHelper.this.activity, dj.b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.d.InterfaceC0142d
        public void b(com.roblox.client.d.e status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (bh.a1.q0() && status.c()) {
                NativeHelper.this.upgradeDialog.a(i.a.Required);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/roblox/client/startup/NativeHelper$g", "Landroid/hardware/display/DisplayManager$DisplayListener;", BuildConfig.FLAVOR, "displayId", BuildConfig.FLAVOR, "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ DisplayManager f9357a;

        public g(DisplayManager displayManager) {
            this.f9357a = displayManager;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int displayId) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int displayId) {
            Display display;
            if (displayId != 0 || (display = this.f9357a.getDisplay(0)) == null) {
                return;
            }
            NativeGLInterface.nativePassCurrentDisplayRefreshRate(DeviceUtils.getCurrentRefreshRate(display));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int displayId) {
        }
    }

    public NativeHelper(@NotNull MainGameActivity activity, @NotNull i upgradeDialog, @NotNull ch.a adsHelper, @NotNull l0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(upgradeDialog, "upgradeDialog");
        Intrinsics.checkNotNullParameter(adsHelper, "adsHelper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.activity = activity;
        this.upgradeDialog = upgradeDialog;
        this.adsHelper = adsHelper;
        this.ioDispatcher = ioDispatcher;
        p pVar = new p() { // from class: ik.z1
            @Override // androidx.p000lifecycle.p
            public final void g(androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a aVar) {
                NativeHelper.e0(this.f19629a, sVar, aVar);
            }
        };
        this.lifecycleEventObserver = pVar;
        this.notificationObserver = new dj.e.InterfaceC0225e() { // from class: ik.a2
            @Override // dj.e.InterfaceC0225e
            public final void R(int i10, Bundle bundle) {
                NativeHelper.h0(i10, bundle);
            }
        };
        this.webViewUserAgentGetter = new NativeGLJavaInterface.WebViewUserAgentGetter() { // from class: ik.b2
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
            public final void n0() {
                NativeHelper.y0(this.f19505a);
            }
        };
        this.mobileAdvertisingIdGetter = new NativeGLJavaInterface.MobileAdvertisingIdGetter() { // from class: ik.c2
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
            public final void S() {
                NativeHelper.g0();
            }
        };
        activity.a().a(pVar);
    }

    public static final void J(NativeHelper nativeHelper) {
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.a();
        }
        nativeHelper.I();
    }

    public static final void K(NativeHelper nativeHelper) {
        nativeHelper.activity.r2();
    }

    public static final void L(NativeHelper nativeHelper, String str) {
        k0.s(nativeHelper.activity).H(str);
        if (bi.h.a().Y3()) {
            dj.b.f().h();
            nativeHelper.activity.getWindow().clearFlags(8192);
        }
        if (bi.h.a().D3()) {
            if (bi.h.a().C3()) {
                NativeGLInterface.screenTimeStartByGuac();
            }
            com.roblox.client.ossearch.b.g(nativeHelper.activity);
            com.roblox.client.ossearch.b.e(nativeHelper.activity);
        }
        nativeHelper.s0();
        nativeHelper.q0();
    }

    public static final void M(NativeHelper nativeHelper) {
        if (bi.h.a().W1() && !dj.h.e().f()) {
            dj.b.f().o(dj.b.d.LOGOUT_BY_USER_IN_LUA);
            j.e().g(bh.a1.O(), bh.a1.g());
        }
        if (dj.h.e().f()) {
            dj.b.f().i(nativeHelper.activity, dj.b.d.LOGOUT_BY_USER_IN_LUA);
            if (bi.h.a().D3() && bi.h.a().C3()) {
                NativeGLInterface.screenTimeStop();
            }
        }
    }

    public static final void N(NativeHelper nativeHelper, String str) {
        k0.s(nativeHelper.activity).I(str);
    }

    public static final void O(NativeHelper nativeHelper) {
        dj.b.f().j(nativeHelper.activity);
    }

    public static final void P(NativeHelper nativeHelper) {
        nativeHelper.l0();
        if (bi.h.a().D3()) {
            nativeHelper.v0();
        }
    }

    public static final void Q(NativeHelper nativeHelper) {
        nativeHelper.I();
        vm.b.h().e();
        y.h().d().c(nativeHelper.activity);
        tl.a.b().e();
    }

    public static final void R(boolean z10, NativeHelper nativeHelper, double d10) {
        if (z10) {
            nativeHelper.I();
        }
        vm.b.h().f();
        y.h().d().e(nativeHelper.activity, (long) d10);
        if (nativeHelper.isForeground) {
            tl.a.b().d(nativeHelper.activity);
        }
    }

    public static final void S(Context context, NativeHelper nativeHelper) {
        NativeGLInterface.nativeSetAppPreviousExitReasons(t2.a(context));
        eh.f.h().i(context);
        boolean zL2 = bi.h.a().L2();
        if (zL2) {
            LoggingProtocol.i("fmod_init_begin", 0L, 2, null);
        }
        FMOD.init(nativeHelper.activity);
        if (zL2) {
            LoggingProtocol.i("fmod_init_end", 0L, 2, null);
        }
        bh.a1.V0();
        NativeSettingsInterface.nativeSetPreferencesFile(z.e(nativeHelper.activity).f());
        yi.b.f().m(nativeHelper.activity);
        k0.w(context);
        if (nativeHelper.appHangMonitor == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            appHangMonitor.c();
            if (nativeHelper.isVisible) {
                appHangMonitor.b();
            }
            nativeHelper.appHangMonitor = appHangMonitor;
        }
        nativeHelper.activity.k2();
        ym.g.G().w();
        fm.j jVarJ = fm.j.j();
        if (jVarJ.f()) {
            jVarJ.i(context);
        }
        y.h().d().a(nativeHelper.activity);
        if (bi.h.a().w2() && Intrinsics.c(Environment.getExternalStorageState(), "mounted")) {
            File externalFilesDir = nativeHelper.activity.getExternalFilesDir(null);
            NativeSettingsInterface.nativeSetExternalDirectory(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        }
        if (bi.h.a().W5()) {
            Intrinsics.checkNotNull(context);
            li.i.m(context);
        }
        if (bi.h.a().Y4()) {
            wh.c.c(context);
        }
    }

    public static final void T(NativeHelper nativeHelper) {
        nativeHelper.I();
        if (nativeHelper.isInExperience) {
            nativeHelper.activity.r2();
        }
        a.n();
    }

    public static final void U(NativeHelper nativeHelper) {
        nativeHelper.activity.reportFullyDrawn();
        if (bi.h.a().W5()) {
            nativeHelper.activity.a().d(li.i.f22168a);
            li.i.o(nativeHelper.activity);
        }
    }

    public static final void V(NativeHelper nativeHelper) {
        li.i.p(nativeHelper.activity);
    }

    public static final void W(NativeHelper nativeHelper, String str) {
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.d(str);
        }
    }

    public static final void X(NativeHelper nativeHelper) {
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.c();
        }
    }

    public static final void Y(NativeHelper nativeHelper) {
        uk.f fVar = nativeHelper.inputListener;
        if (fVar != null) {
            fVar.H(true);
        }
    }

    public static final void Z(NativeHelper nativeHelper) {
        nativeHelper.activity.recreate();
    }

    public static final void a0(NativeHelper nativeHelper) {
        zj.f.f(nativeHelper.activity, nativeHelper.contentViewId);
    }

    public static final void b0(NativeHelper nativeHelper, int i10) {
        nativeHelper.activity.setRequestedOrientation(i10);
    }

    public static final void c0(int i10, NativeHelper nativeHelper, int i11, String str, String str2) {
        if (i10 != 0) {
            dj.g.b().q("Android-AppLogin-BrowserTracker-Failed");
            nativeHelper.i0();
            return;
        }
        com.roblox.client.d.e eVar = new com.roblox.client.d.e();
        if (i11 == 1) {
            eVar.d();
        } else if (i11 != 2) {
            eVar.f();
        } else {
            eVar.e();
        }
        eVar.b = str;
        eVar.f8904c = str2;
        dj.g.b().q("Android-AppLogin-BrowserTracker-Success");
        if (bi.h.a().D3()) {
            t0.b(nativeHelper.activity, "appLaunch");
            if (nativeHelper.activity.x2()) {
                t0.b(nativeHelper.activity, "protocolLaunch");
            }
        }
        if (eVar.b() || eVar.c()) {
            com.roblox.client.d.e().g(eVar);
        }
    }

    public static final void d0(byte[] bArr, NativeHelper nativeHelper, long j10, boolean z10, NativeTextBoxInfo nativeTextBoxInfo) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str = new String(bArr, UTF_8);
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.b(j10, z10, str, nativeTextBoxInfo);
        }
    }

    public static final void e0(NativeHelper nativeHelper, s owner, l.a event) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(event, "event");
        q.b("NativeHelper", "onStateChanged: event: " + event);
        switch (b.f9350a[event.ordinal()]) {
            case 1:
                yi.b.f().u(nativeHelper.activity);
                NativeLocaleJavaInterface.setImplementation(new vi.a());
                dj.e.c().d(nativeHelper.activity);
                q.b("NativeHelper", "Initializing RTC audio manager.");
                ih.a aVarC = y.h().c(nativeHelper.activity.getApplicationContext());
                aVarC.b(nativeHelper.activity);
                nativeHelper.rtcAudioManager = aVarC;
                if (bi.h.a().Y3() && !dj.b.m()) {
                    nativeHelper.activity.getWindow().addFlags(8192);
                }
                if (bi.h.a().W5()) {
                    nativeHelper.activity.a().a(li.i.f22168a);
                }
                if (bi.h.a().x5()) {
                    if (bi.h.a().t2()) {
                        nativeHelper.activity.a().a(sl.g.f31481a);
                    } else {
                        nativeHelper.activity.a().a(sl.d.f31477a);
                    }
                }
                MediaPickerProtocol.o().l(nativeHelper.activity);
                y.h().g().n(nativeHelper.activity);
                NativeGLJavaInterface.setWebviewUserAgentGetter(nativeHelper.webViewUserAgentGetter);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(nativeHelper.mobileAdvertisingIdGetter);
                nk.c.c().m();
                nativeHelper.adsHelper.d(nativeHelper.activity);
                if (ai.k.a()) {
                    ai.h.r(j0.g(new Pair("webrtcsdk", new ExpBackOffRetryPolicy(3, CallingHandler.AVATAR_TIMEOUT_MS))));
                    q.h("NativeHelper", "Requesting WebRTC SDK module download immediately.");
                    ai.h.m("webrtcsdk");
                }
                if (v.b()) {
                    v.a(ai.h.f468a, "NativeHelper");
                    owner.a().a(FacialAgeEstimationProtocol.INSTANCE);
                }
                if (bi.h.a().a3()) {
                    nativeHelper.activity.a().a(v0.f13801a);
                }
                if (bi.h.a().R() || bi.h.a().i5()) {
                    nativeHelper.activity.a().a(DeviceDisplayHandler.INSTANCE);
                }
                if (bi.h.a().n1()) {
                    nativeHelper.activity.a().a(ExternalIdentityHandler.INSTANCE);
                }
                if (bi.h.a().D3()) {
                    nativeHelper.activity.a().a(wl.b.a());
                    nativeHelper.t0();
                    return;
                }
                return;
            case 2:
                nativeHelper.isVisible = true;
                if (bi.h.a().D3() && bi.h.a().F5()) {
                    NativeReportingInterface.setAppSuspended(false);
                }
                cn.a.c().a();
                nativeHelper.s0();
                h.j().k(f9328w);
                if (bi.h.a().W1() && dl.e.o()) {
                    h.j().n(bh.a1.g());
                }
                dj.g.b().i0();
                mw.c.d().n(nativeHelper);
                AppHangMonitor appHangMonitor = nativeHelper.appHangMonitor;
                if (appHangMonitor != null) {
                    appHangMonitor.b();
                }
                vm.b.h().e();
                ym.g.G().H(nativeHelper.activity);
                return;
            case 3:
                nativeHelper.isForeground = true;
                nativeHelper.I();
                nativeHelper.q0();
                nativeHelper.l0();
                uk.f fVar = nativeHelper.inputListener;
                if (fVar != null) {
                    fVar.H(false);
                }
                INSTANCE.c(nativeHelper.activity, event);
                mm.c.i().j(nativeHelper.activity);
                sm.a.k().l(nativeHelper.activity, new Intent(nativeHelper.activity, (Class<?>) ShareAppChosenReceiver.class), 20124, new sm.a.g() { // from class: ik.i2
                    @Override // sm.a.g
                    public final void a(String str, String str2) {
                        NativeHelper.f0(str, str2);
                    }
                });
                return;
            case 4:
                nativeHelper.isForeground = false;
                uk.f fVar2 = nativeHelper.inputListener;
                if (fVar2 != null) {
                    fVar2.I();
                }
                tl.a.b().e();
                mm.c.i().k(nativeHelper.activity);
                sm.a.k().m();
                return;
            case 5:
                nativeHelper.isVisible = false;
                if (bi.h.a().D3() && bi.h.a().F5() && !nativeHelper.isInExperience) {
                    NativeReportingInterface.setAppSuspended(true);
                }
                mw.c.d().p(nativeHelper);
                cn.a.c().b();
                dj.e.c().g(nativeHelper.notificationObserver);
                INSTANCE.c(nativeHelper.activity, event);
                h.j().m(f9328w);
                AppHangMonitor appHangMonitor2 = nativeHelper.appHangMonitor;
                if (appHangMonitor2 != null) {
                    appHangMonitor2.a();
                }
                vm.b.h().f();
                ym.g.G().I();
                return;
            case 6:
                q.b("NativeHelper", "Disposing RTC audio manager.");
                ih.a aVar = nativeHelper.rtcAudioManager;
                if (aVar != null) {
                    aVar.a();
                }
                nativeHelper.rtcAudioManager = null;
                NativeGLJavaInterface.setWebviewUserAgentGetter(null);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
                nativeHelper.adsHelper.e();
                nativeHelper.x0();
                nativeHelper.w0();
                return;
            case 7:
                return;
            default:
                throw new zt.l();
        }
    }

    public static final void f0(String str, String str2) {
        hk.a.c(str, str2);
    }

    public static final void g0() {
        NativeGLInterface.setMobileAdvertisingId(ok.c.d());
    }

    public static final void h0(int i10, Bundle bundle) {
        if (i10 != 2) {
            if (i10 != 101) {
                throw new IllegalStateException("Unhandled notificationId");
            }
            q.e("NativeHelper", "handleNotification: Start PlaceID event...");
            throw new IllegalStateException("Error: Notification 'Start PlaceID' still needs to be handled.");
        }
        dj.b.d dVarG = dj.b.g(bundle);
        q.b("NativeHelper", "handleNotification: Logout event. type = " + dVarG);
        if (!bi.h.a().D3() || dVarG == dj.b.d.LOGOUT_BY_USER_IN_LUA) {
            return;
        }
        NativeGLInterface.nativeAppBridgeV2UserDidLogout();
        MemStorage.fire("NativeShellEvent", "NETWORK_ERROR_401");
    }

    public static final void j0(NativeHelper nativeHelper) {
        eh.f.h().i(nativeHelper.activity.getApplicationContext());
        nativeHelper.activity.I();
    }

    public static final void m0() {
        q.h("NativeHelper", "Requesting permissions for MediaPickerProtocol");
        y.h().k().O(new String[]{bn.o.MEDIA_PICKER.toString()});
    }

    public static final void n0(NativeHelper nativeHelper, final String str) {
        nativeHelper.activity.runOnUiThread(new Runnable() { // from class: ik.h2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.o0(str);
            }
        });
    }

    public static final void o0(String str) {
        nk.c.c().u(cm.a.INSTANCE.a(str));
    }

    public static final void p0(NativeHelper nativeHelper, boolean z10) {
        xi.c.f36686a.j(z10);
        xi.b.f36685a.b(nativeHelper.activity, z10);
    }

    public static final void u0() {
        q.h("NativeHelper", "(callback) onCookieChanged: Update cookies (from web) => engine.");
        if (bi.h.a().W1()) {
            bh.a1.C0();
        }
        bh.a1.T0();
    }

    public static final void y0(NativeHelper nativeHelper) {
        if (bi.h.a().m2()) {
            NativeGLInterface.setWebviewUserAgent(u2.c(nativeHelper.activity));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(nativeHelper.activity));
        }
    }

    public final void I() {
        boolean z10 = false;
        boolean z11 = this.activity.getResources().getConfiguration().orientation == 2;
        if (bh.a1.l0() && z11) {
            z10 = true;
        }
        q.b("NativeHelper", "adjustWindowInsets: isForeground=" + this.isForeground + ", isInExperience=" + this.isInExperience + ", isLandscape=" + z11 + ", shouldHideInLandscape=" + z10);
        if (this.isInExperience || z10) {
            Window window = this.activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
            c2.b(window);
        } else {
            Window window2 = this.activity.getWindow();
            Intrinsics.checkNotNullExpressionValue(window2, "getWindow(...)");
            c2.c(window2);
        }
    }

    @Keep
    @NotNull
    public final String[] gameActivity_getShellFlagKeys() {
        Set<Map.Entry<String, com.roblox.client.flags.a>> setB4 = bi.h.a().b4();
        Intrinsics.checkNotNullExpressionValue(setB4, "getEntrySet(...)");
        Set<Map.Entry<String, com.roblox.client.flags.a>> set = setB4;
        ArrayList arrayList = new ArrayList(p001kotlin.collections.q.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            arrayList.add(wh.a.d((String) entry.getKey(), (com.roblox.client.flags.a) entry.getValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Keep
    public final void gameActivity_hideKeyboard() {
        this.activity.runOnUiThread(new Runnable() { // from class: ik.y1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.J(this.f19626a);
            }
        });
    }

    @Keep
    public final void gameActivity_onAppReady(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q.b("NativeHelper", "gameActivity_onAppReady: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ik.q1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.K(this.f19574a);
            }
        });
        if (Intrinsics.c(data, "Push")) {
            y.h().k().Q(this.activity.getApplicationContext());
        }
        if (bi.h.a().m2()) {
            av.k.d(q0.a(this.ioDispatcher), null, null, new c(null), 3, null);
        }
    }

    @Keep
    public final void gameActivity_onDidLogInReceived(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q.b("NativeHelper", "gameActivity_onDidLogInReceived: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ik.u1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.L(this.f19598a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidLogOutReceived() {
        q.b("NativeHelper", "gameActivity_onDidLogOutReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: ik.x1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.M(this.f19624a);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSignUp(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q.b("NativeHelper", "gameActivity_onDidSignUp: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ik.r1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.N(this.f19581a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSwitchAccountReceived() {
        q.b("NativeHelper", "gameActivity_onDidSwitchAccountReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: ik.m1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.O(this.f19558a);
            }
        });
    }

    @Keep
    public final void gameActivity_onEngineInitialized() {
        q.b("NativeHelper", "gameActivity_onEngineInitialized:");
        this.isEngineInitialized = true;
        if (this.enableConnectivityV2ForAndroid) {
            Context applicationContext = this.activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ConnectivityV2Monitor.setup(applicationContext);
        }
        if (CallingHandler.isCallingEnabled()) {
            Context applicationContext2 = this.activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            CallingHandler.setup(applicationContext2);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ik.l1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.P(this.f19556a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStart() {
        q.b("NativeHelper", "gameActivity_onExperienceStart:");
        this.isInExperience = true;
        gj.a.f17755a.b(true);
        this.activity.runOnUiThread(new Runnable() { // from class: ik.k2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Q(this.f19555a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStop(final double timeInMs) {
        q.b("NativeHelper", "gameActivity_onExperienceStop:");
        final boolean zD3 = bi.h.a().D3();
        if (zD3) {
            this.isInExperience = false;
            gj.a.f17755a.b(false);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ik.w1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.R(zD3, this, timeInMs);
            }
        });
    }

    @Keep
    public final void gameActivity_onFlagsFailed() {
        q.b("NativeHelper", "gameActivity_onFlagsFailed:");
        i0();
    }

    @Keep
    public final void gameActivity_onFlagsLoaded(@NotNull ByteBuffer flagsBuffer) {
        PowerManager powerManager;
        Intrinsics.checkNotNullParameter(flagsBuffer, "flagsBuffer");
        q.b("NativeHelper", "gameActivity_onFlagsLoaded: size = " + flagsBuffer.remaining());
        String string = StandardCharsets.UTF_8.newDecoder().decode(flagsBuffer).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        final Context applicationContext = this.activity.getApplicationContext();
        a.F(string, applicationContext);
        a.B(applicationContext);
        this.enableConnectivityV2ForAndroid = bi.h.a().q3();
        if (bi.h.a().D3() && Build.VERSION.SDK_INT >= 29 && (powerManager = (PowerManager) this.activity.getSystemService(PowerManager.class)) != null) {
            LoggingProtocol.h("android_thermal_throttling", ((long) powerManager.getCurrentThermalStatus()) + 1000);
        }
        NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.enableConnectivityV2ForAndroid);
        a.g(applicationContext);
        this.activity.runOnUiThread(new Runnable() { // from class: ik.o1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.S(applicationContext, this);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameLoaded(long placeId) {
        q.h("NativeHelper", "gameActivity_onGameLoaded: placeId = " + placeId);
        boolean z10 = placeId > 0;
        this.isInExperience = z10;
        gj.a.f17755a.b(z10);
        if (bi.h.a().t4() && this.isInExperience) {
            LoggingProtocol.i("native_experience_start", 0L, 2, null);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ik.k1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.T(this.f19554a);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameStreamingStatusChanged(@NotNull String data) {
        Object objB;
        Intrinsics.checkNotNullParameter(data, "data");
        if (bi.h.a().X1()) {
            try {
                n.Companion companion = n.INSTANCE;
                if (new JSONObject(data).optBoolean("inGameStreaming", false)) {
                    ei.q0.f(this.activity);
                } else {
                    ei.q0.i(this.activity);
                }
                objB = n.b(Unit.f21506a);
            } catch (Throwable th2) {
                n.Companion companion2 = n.INSTANCE;
                objB = n.b(o.a(th2));
            }
            Throwable thE = n.e(objB);
            if (thE != null) {
                q.e("NativeHelper", "Failed to parse GAME_STREAMING_STATUS_CHANGED: " + thE.getMessage());
            }
        }
    }

    @Keep
    public final void gameActivity_onHomePageInteractive() {
        q.b("NativeHelper", "gameActivity_onHomePageInteractive:");
        if (bi.h.a().D3()) {
            this.activity.runOnUiThread(new Runnable() { // from class: ik.v1
                @Override // java.lang.Runnable
                public final void run() {
                    NativeHelper.U(this.f19602a);
                }
            });
            a.n();
            if (bi.h.a().v1()) {
                FlagCacheUtils.flushRetryDialogTelemetry();
            }
        }
    }

    @Keep
    public final void gameActivity_onHomePageLoaded() {
        q.b("NativeHelper", "gameActivity_onHomePageLoaded:");
        if (bi.h.a().D3()) {
            if (bi.h.a().l2()) {
                eh.k.q().k("luaHomeScreen");
            }
            Context applicationContext = this.activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            FlagCacheUtils.flushPendingVersionBWrite(applicationContext);
            FlagCacheUtils.flushPendingVersionBTelemetry();
            if (bi.h.a().c1()) {
                ai.b.c();
            }
            if (bi.h.a().W5()) {
                this.activity.runOnUiThread(new Runnable() { // from class: ik.g2
                    @Override // java.lang.Runnable
                    public final void run() {
                        NativeHelper.V(this.f19520a);
                    }
                });
            }
        }
    }

    @Keep
    public final void gameActivity_onLuaAppDidReturn() {
        q.b("NativeHelper", "gameActivity_onLuaAppDidReturn:");
        this.activity.requestOrientationAsDefault();
    }

    @Keep
    public final void gameActivity_onLuaTextBoxChanged(@NotNull final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.activity.runOnUiThread(new Runnable() { // from class: ik.o2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.W(this.f19565a, value);
            }
        });
    }

    @Keep
    public final void gameActivity_onLuaTextBoxPropertyChanged() {
        this.activity.runOnUiThread(new Runnable() { // from class: ik.j2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.X(this.f19528a);
            }
        });
    }

    @Keep
    public final void gameActivity_onMotionEventListening(@NotNull String motionType) {
        Intrinsics.checkNotNullParameter(motionType, "motionType");
        this.activity.runOnUiThread(new Runnable() { // from class: ik.n1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Y(this.f19561a);
            }
        });
    }

    @Keep
    public final void gameActivity_onRestartLuaApp() {
        this.activity.runOnUiThread(new Runnable() { // from class: ik.t1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Z(this.f19594a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScanQrCode() {
        this.activity.runOnUiThread(new Runnable() { // from class: ik.p1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.a0(this.f19568a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScreenOrientationChanged(int orientation, boolean inExperience) {
        if (!inExperience) {
            q.h("NativeHelper", "gameActivity_onScreenOrientationChanged: (In-App) request the default Orientation.");
            this.activity.requestOrientationAsDefault();
            return;
        }
        final int iD = INSTANCE.d(orientation);
        if (iD != -1) {
            q.h("NativeHelper", "gameActivity_onScreenOrientationChanged: orientation:" + orientation + " => " + iD);
            this.activity.runOnUiThread(new Runnable() { // from class: ik.m2
                @Override // java.lang.Runnable
                public final void run() {
                    NativeHelper.b0(this.f19559a, iD);
                }
            });
        }
    }

    @Keep
    public final void gameActivity_onScreenshotReady(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        av.k.d(q0.a(this.ioDispatcher), null, null, new d(path, null), 3, null);
    }

    @Keep
    public final void gameActivity_setAppUpgradeStatus(final int result, final int upgradeStatusCode, @NotNull final String apkUrl, @NotNull final String apkCheckSum) {
        Intrinsics.checkNotNullParameter(apkUrl, "apkUrl");
        Intrinsics.checkNotNullParameter(apkCheckSum, "apkCheckSum");
        this.activity.runOnUiThread(new Runnable() { // from class: ik.s1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.c0(result, this, upgradeStatusCode, apkUrl, apkCheckSum);
            }
        });
    }

    @Keep
    public final void gameActivity_setBrowserTrackerId(long browserTrackerId) {
        q.b("NativeHelper", "gameActivity_setBrowserTrackerId:");
        if (bi.h.a().D3()) {
            bh.a1.f4037u = browserTrackerId;
            if (bi.h.a().W5()) {
                Context applicationContext = this.activity.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                li.i.n(applicationContext, browserTrackerId);
            }
        }
    }

    @Keep
    public final void gameActivity_showKeyboard(final long textBox, final boolean showNativeInput, @NotNull final byte[] byteArrayFromTextBox, @NotNull final NativeTextBoxInfo textBoxInfo) {
        Intrinsics.checkNotNullParameter(byteArrayFromTextBox, "byteArrayFromTextBox");
        Intrinsics.checkNotNullParameter(textBoxInfo, "textBoxInfo");
        this.activity.runOnUiThread(new Runnable() { // from class: ik.p2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.d0(byteArrayFromTextBox, this, textBox, showNativeInput, textBoxInfo);
            }
        });
    }

    public final void i0() {
        LoggingProtocol.i("init_failure", 0L, 2, null);
        this.activity.runOnUiThread(new Runnable() { // from class: ik.l2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.j0(this.f19557a);
            }
        });
    }

    public final void k0() {
        I();
    }

    public final void l0() {
        q.b("NativeHelper", "onForegroundOrEngineInitialized: isForeground = " + this.isForeground + ", isEngineInitialized = " + this.isEngineInitialized);
        if (this.isForeground && this.isEngineInitialized) {
            MediaPickerProtocol.o().m(this.activity, new zl.f() { // from class: ik.d2
                @Override // zl.f
                public final void a() {
                    NativeHelper.m0();
                }
            });
            tl.a.b().d(this.activity);
            l lVarA = this.activity.a();
            SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9823a;
            lVarA.a(systemThemeProtocol);
            systemThemeProtocol.O(new SystemThemeProtocol.d() { // from class: ik.e2
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.d
                public final void a(String str) {
                    NativeHelper.n0(this.f19512a, str);
                }
            });
            if (bi.h.a().f5()) {
                systemThemeProtocol.H(new e(xi.m.f36703a));
            } else if (bi.h.a().Y0()) {
                systemThemeProtocol.K(new SystemThemeProtocol.b() { // from class: ik.f2
                    @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.b
                    public final void a(boolean z10) {
                        NativeHelper.p0(this.f19517a, z10);
                    }
                });
            }
            if (bi.h.a().m3()) {
                this.activity.a().a(AppRatingPromptHandler.f9795a);
            }
            if (bi.h.a().a1()) {
                this.activity.a().a(PinShortcutHandler.INSTANCE);
            }
            if (bi.h.a().N5()) {
                this.activity.a().a(RecentlyPlayedWidgetHandler.INSTANCE);
            }
        }
    }

    @mw.j(threadMode = ThreadMode.MAIN)
    @Keep
    public final void onCodeParsedFromSMS(@NotNull yh.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q.h("NativeHelper", "SMS code received.");
        q.h("NativeHelper", "Calling IdentityProtocol to parse OTP.");
        y.h().g().o(event.f37872a);
    }

    public final void q0() {
        q.b("NativeHelper", "onForegroundOrLogin: isForeground = " + this.isForeground + ", isLoggedIn = " + dj.h.e().f());
        if (this.isForeground) {
            com.roblox.client.d.e().b(new f());
        }
    }

    public final void r0(int contentViewId, @NotNull SurfaceView surfaceView, @NotNull RbxKeyboard rbxEditText, @NotNull uk.f.InterfaceC0678f inputAdapter) {
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(rbxEditText, "rbxEditText");
        Intrinsics.checkNotNullParameter(inputAdapter, "inputAdapter");
        this.contentViewId = contentViewId;
        uk.f fVar = this.inputListener;
        if (fVar != null) {
            fVar.I();
        }
        uk.f fVar2 = new uk.f(this.activity, surfaceView, inputAdapter);
        this.inputListener = fVar2;
        surfaceView.setOnTouchListener(fVar2);
        this.overlayEditTextController = new r0(rbxEditText);
    }

    public final void s0() {
        q.b("NativeHelper", "onVisibleOrLogin: isVisible = " + this.isVisible + ", isLoggedIn = " + dj.h.e().f());
        if (this.isVisible && dj.h.e().f()) {
            dj.e.c().b(this.notificationObserver);
        }
    }

    public final void t0() {
        DisplayManager displayManager = (DisplayManager) this.activity.getSystemService(DisplayManager.class);
        if (displayManager == null) {
            return;
        }
        g gVar = new g(displayManager);
        displayManager.registerDisplayListener(gVar, null);
        this.displayListener = gVar;
        Display display = displayManager.getDisplay(0);
        if (display == null) {
            return;
        }
        NativeGLInterface.nativePassCurrentDisplayRefreshRate(DeviceUtils.getCurrentRefreshRate(display));
        NativeGLInterface.nativePassSupportedRefreshRates(DeviceUtils.getSupportedRefreshRates(display));
    }

    public final void v0() {
        if (this.activity.isDestroyed()) {
            return;
        }
        if (this.batteryStatusObserver == null) {
            ei.i iVar = new ei.i(this.activity.getApplicationContext());
            iVar.o();
            this.batteryStatusObserver = iVar;
        }
        if (this.thermalStatusObserver == null) {
            a1 a1Var = new a1(this.activity.getApplicationContext());
            a1Var.a();
            this.thermalStatusObserver = a1Var;
        }
    }

    public final void w0() {
        ei.i iVar = this.batteryStatusObserver;
        if (iVar != null) {
            iVar.q();
        }
        this.batteryStatusObserver = null;
        a1 a1Var = this.thermalStatusObserver;
        if (a1Var != null) {
            a1Var.b();
        }
        this.thermalStatusObserver = null;
    }

    public final void x0() {
        DisplayManager displayManager;
        DisplayManager.DisplayListener displayListener = this.displayListener;
        if (displayListener != null && (displayManager = (DisplayManager) this.activity.getSystemService(DisplayManager.class)) != null) {
            displayManager.unregisterDisplayListener(displayListener);
        }
        this.displayListener = null;
    }

    public /* synthetic */ NativeHelper(MainGameActivity mainGameActivity, i iVar, ch.a aVar, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainGameActivity, iVar, aVar, (i10 & 8) != 0 ? g1.b() : l0Var);
    }
}
