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
import androidx.p000lifecycle.l;
import androidx.p000lifecycle.p;
import androidx.p000lifecycle.s;
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
import eh.i;
import ek.q;
import ek.v;
import ek.z;
import gt.o;
import hj.t;
import iu.g1;
import iu.l0;
import iu.p0;
import iu.q0;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import mm.k;
import mm.n;
import nt.m;
import org.fmod.FMOD;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import qh.ExpBackOffRetryPolicy;
import rg.a1;
import rg.c2;
import rg.y;
import ti.g;
import uh.r0;
import uh.v0;
import uh.x0;
import uk.h;
import uk.j;
import yj.k0;
import yj.n2;
import yj.o2;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Æ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0090\u00012\u00020\u0001:\u0001[B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ/\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\fH\u0007¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0007¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00132\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001eH\u0007¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\f2\u0006\u00103\u001a\u00020\u001eH\u0007¢\u0006\u0004\b4\u00102J\u000f\u00105\u001a\u00020\fH\u0007¢\u0006\u0004\b5\u0010\u000eJ\u0017\u00106\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001eH\u0007¢\u0006\u0004\b6\u00102J\u0017\u00107\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001eH\u0007¢\u0006\u0004\b7\u00102J\u0017\u00108\u001a\u00020\f2\u0006\u00100\u001a\u00020\u001eH\u0007¢\u0006\u0004\b8\u00102J\u000f\u00109\u001a\u00020\fH\u0007¢\u0006\u0004\b9\u0010\u000eJ\u000f\u0010:\u001a\u00020\fH\u0007¢\u0006\u0004\b:\u0010\u000eJ\u000f\u0010;\u001a\u00020\fH\u0007¢\u0006\u0004\b;\u0010\u000eJ\u0017\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020<H\u0007¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\fH\u0007¢\u0006\u0004\b@\u0010\u000eJ\u000f\u0010A\u001a\u00020\fH\u0007¢\u0006\u0004\bA\u0010\u000eJ/\u0010H\u001a\u00020\f2\u0006\u0010B\u001a\u00020'2\u0006\u0010C\u001a\u00020,2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0007¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\fH\u0007¢\u0006\u0004\bJ\u0010\u000eJ\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020\u001eH\u0007¢\u0006\u0004\bL\u00102J\u000f\u0010M\u001a\u00020\fH\u0007¢\u0006\u0004\bM\u0010\u000eJ\u0017\u0010O\u001a\u00020\f2\u0006\u0010N\u001a\u00020\u001eH\u0007¢\u0006\u0004\bO\u00102J/\u0010T\u001a\u00020\f2\u0006\u0010P\u001a\u00020\u00132\u0006\u0010Q\u001a\u00020\u00132\u0006\u0010R\u001a\u00020\u001e2\u0006\u0010S\u001a\u00020\u001eH\u0007¢\u0006\u0004\bT\u0010UJ\u0017\u0010X\u001a\u00020\f2\u0006\u0010W\u001a\u00020VH\u0007¢\u0006\u0004\bX\u0010YJ\u000f\u0010Z\u001a\u00020\fH\u0007¢\u0006\u0004\bZ\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010j\u001a\u0004\u0018\u00010g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010m\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010o\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0016\u0010q\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010lR\u0016\u0010s\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010lR\u0016\u0010u\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010lR\u0018\u0010y\u001a\u0004\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010}\u001a\u0004\u0018\u00010z8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0083\u0001\u001a\u00030\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0087\u0001\u001a\u00030\u0084\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0018\u0010\u008b\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0018\u0010\u008f\u0001\u001a\u00030\u008c\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001¨\u0006\u0091\u0001"}, d2 = {"Lcom/roblox/client/startup/NativeHelper;", "", "Lcom/roblox/client/startup/MainGameActivity;", "activity", "Leh/i;", "upgradeDialog", "Lsg/a;", "adsHelper", "Liu/l0;", "ioDispatcher", "<init>", "(Lcom/roblox/client/startup/MainGameActivity;Leh/i;Lsg/a;Liu/l0;)V", "", "o0", "()V", "m0", "h0", "G", "e0", "", "contentViewId", "Landroid/view/SurfaceView;", "surfaceView", "Lcom/roblox/client/RbxKeyboard;", "rbxEditText", "Lkk/f$f;", "inputAdapter", "n0", "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lkk/f$f;)V", "", "", "gameActivity_getShellFlagKeys", "()[Ljava/lang/String;", "Ljava/nio/ByteBuffer;", "flagsBuffer", "gameActivity_onFlagsLoaded", "(Ljava/nio/ByteBuffer;)V", "gameActivity_onFlagsFailed", "gameActivity_onEngineInitialized", "", PinShortcutHandler.EXTRA_PLACE_ID, "gameActivity_onGameLoaded", "(J)V", "orientation", "", "inExperience", "gameActivity_onScreenOrientationChanged", "(IZ)V", "data", "gameActivity_onGameStreamingStatusChanged", "(Ljava/lang/String;)V", "motionType", "gameActivity_onMotionEventListening", "gameActivity_onLuaAppDidReturn", "gameActivity_onDidLogInReceived", "gameActivity_onDidSignUp", "gameActivity_onAppReady", "gameActivity_onDidLogOutReceived", "gameActivity_onDidSwitchAccountReceived", "gameActivity_onExperienceStart", "", "timeInMs", "gameActivity_onExperienceStop", "(D)V", "gameActivity_onRestartLuaApp", "gameActivity_onScanQrCode", "textBox", "showNativeInput", "", "byteArrayFromTextBox", "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;", "textBoxInfo", "gameActivity_showKeyboard", "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V", "gameActivity_hideKeyboard", "value", "gameActivity_onLuaTextBoxChanged", "gameActivity_onLuaTextBoxPropertyChanged", "path", "gameActivity_onScreenshotReady", "result", "upgradeStatusCode", "apkUrl", "apkCheckSum", "gameActivity_setAppUpgradeStatus", "(IILjava/lang/String;Ljava/lang/String;)V", "Loh/j;", "event", "onCodeParsedFromSMS", "(Loh/j;)V", "g0", "a", "Lcom/roblox/client/startup/MainGameActivity;", "b", "Leh/i;", "c", "Lsg/a;", "d", "Liu/l0;", "Lkk/f;", "e", "Lkk/f;", "inputListener", "Luh/x0;", "f", "Luh/x0;", "overlayEditTextController", "g", "Z", "isVisible", "h", "isForeground", "i", "isEngineInitialized", "j", "isInExperience", "k", "enableConnectivityV2ForAndroid", "Lyg/a;", "l", "Lyg/a;", "rtcAudioManager", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "m", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "appHangMonitor", "n", "I", "Landroidx/lifecycle/p;", "o", "Landroidx/lifecycle/p;", "lifecycleEventObserver", "Lti/e$e;", "p", "Lti/e$e;", "notificationObserver", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "q", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "webViewUserAgentGetter", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "r", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "mobileAdvertisingIdGetter", "s", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeHelper {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final h.d f9510t = new h.d() { // from class: yj.f2
        @Override // uk.h.d
        public final void a() {
            NativeHelper.p0();
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
    public final sg.a adsHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public kk.f inputListener;

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
    public yg.a rtcAudioManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public AppHangMonitor appHangMonitor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int contentViewId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final p lifecycleEventObserver;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ti.e.InterfaceC0581e notificationObserver;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.WebViewUserAgentGetter webViewUserAgentGetter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.MobileAdvertisingIdGetter mobileAdvertisingIdGetter;

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/startup/NativeHelper$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/l$a;", "event", "", "c", "(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V", "", "orientation", "d", "(I)I", "", "TAG", "Ljava/lang/String;", "Luk/h$d;", "securityCookieObserver", "Luk/h$d;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0150a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9528a;

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
                f9528a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void c(Activity activity, l.a event) {
            k kVarK = y.h().k();
            int i10 = C0150a.f9528a[event.ordinal()];
            if (i10 == 1) {
                kVarK.d0(activity);
                kVarK.c0();
                kVarK.k("POST_NOTIFICATIONS", t.g());
                kVarK.k("MEDIA_PICKER", ui.a.e());
                return;
            }
            if (i10 == 2) {
                kVarK.Y("POST_NOTIFICATIONS");
                kVarK.Y("MEDIA_PICKER");
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
        public static final /* synthetic */ int[] f9529a;

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
            f9529a = iArr;
        }
    }

    @nt.f(c = "com.roblox.client.startup.NativeHelper$gameActivity_onAppReady$2", f = "NativeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class c extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9530t;

        public c(lt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return NativeHelper.this.new c(bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9530t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            o2.b(NativeHelper.this.activity);
            return Unit.f22938a;
        }
    }

    @nt.f(c = "com.roblox.client.startup.NativeHelper$gameActivity_onScreenshotReady$1", f = "NativeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Liu/p0;", "", "<anonymous>", "(Liu/p0;)V"}, k = 3, mv = {2, 2, 0})
    public static final class d extends m implements Function2<p0, lt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9532t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f9533u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, lt.b<? super d> bVar) {
            super(2, bVar);
            this.f9533u = str;
        }

        @Override // nt.a
        public final lt.b<Unit> create(Object obj, lt.b<?> bVar) {
            return new d(this.f9533u, bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, lt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22938a);
        }

        @Override // nt.a
        public final Object invokeSuspend(Object obj) {
            mt.c.e();
            if (this.f9532t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            uh.k.v(this.f9533u);
            return Unit.f22938a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e implements SystemThemeProtocol.a, kotlin.jvm.internal.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ni.m f9534c;

        public e(ni.m mVar) {
            this.f9534c = mVar;
        }

        @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.a
        public final void a(String p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            this.f9534c.g(p8);
        }

        @Override // kotlin.jvm.internal.h
        public final gt.b<?> b() {
            return new kotlin.jvm.internal.k(1, this.f9534c, ni.m.class, "onAppIconChanged", "onAppIconChanged(Ljava/lang/String;)V", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof SystemThemeProtocol.a) && (obj instanceof kotlin.jvm.internal.h)) {
                return Intrinsics.c(b(), ((kotlin.jvm.internal.h) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/roblox/client/startup/NativeHelper$f", "Lcom/roblox/client/d$d;", "Lcom/roblox/client/d$e;", "result", "", "a", "(Lcom/roblox/client/d$e;)V", "status", "b", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements com.roblox.client.d.InterfaceC0139d {
        public f() {
        }

        @Override // com.roblox.client.d.InterfaceC0139d
        public void a(com.roblox.client.d.e result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.b()) {
                NativeHelper.this.upgradeDialog.a(i.a.Optional);
                return;
            }
            if (result.c()) {
                NativeHelper.this.upgradeDialog.a(i.a.Required);
            } else if (ek.t.j() && result.a()) {
                NativeHelper.this.upgradeDialog.a(i.a.NewApp);
                ti.b.f().i(NativeHelper.this.activity, ti.b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.d.InterfaceC0139d
        public void b(com.roblox.client.d.e status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (a1.q0() && status.c()) {
                NativeHelper.this.upgradeDialog.a(i.a.Required);
            }
        }
    }

    public NativeHelper(@NotNull MainGameActivity activity, @NotNull i upgradeDialog, @NotNull sg.a adsHelper, @NotNull l0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(upgradeDialog, "upgradeDialog");
        Intrinsics.checkNotNullParameter(adsHelper, "adsHelper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.activity = activity;
        this.upgradeDialog = upgradeDialog;
        this.adsHelper = adsHelper;
        this.ioDispatcher = ioDispatcher;
        p pVar = new p() { // from class: yj.t1
            @Override // androidx.p000lifecycle.p
            public final void f(androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a aVar) {
                NativeHelper.a0(this.f36789a, sVar, aVar);
            }
        };
        this.lifecycleEventObserver = pVar;
        this.notificationObserver = new ti.e.InterfaceC0581e() { // from class: yj.u1
            @Override // ti.e.InterfaceC0581e
            public final void R(int i10, Bundle bundle) {
                NativeHelper.d0(i10, bundle);
            }
        };
        this.webViewUserAgentGetter = new NativeGLJavaInterface.WebViewUserAgentGetter() { // from class: yj.v1
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
            public final void n0() {
                NativeHelper.q0(this.f36794a);
            }
        };
        this.mobileAdvertisingIdGetter = new NativeGLJavaInterface.MobileAdvertisingIdGetter() { // from class: yj.w1
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
            public final void S() {
                NativeHelper.c0();
            }
        };
        activity.a().a(pVar);
    }

    public static final void H(NativeHelper nativeHelper) {
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.a();
        }
        nativeHelper.G();
    }

    public static final void I(NativeHelper nativeHelper) {
        nativeHelper.activity.p2();
    }

    public static final void J(NativeHelper nativeHelper, String str) {
        k0.s(nativeHelper.activity).H(str);
        if (rh.h.a().U3()) {
            ti.b.f().h();
            nativeHelper.activity.getWindow().clearFlags(8192);
        }
        nativeHelper.o0();
        nativeHelper.m0();
    }

    public static final void K(NativeHelper nativeHelper) {
        if (rh.h.a().W1() && !ti.h.e().f()) {
            ti.b.f().p(ti.b.d.LOGOUT_BY_USER_IN_LUA);
            j.c().e(a1.O(), a1.g());
        }
        if (ti.h.e().f()) {
            ti.b.f().i(nativeHelper.activity, ti.b.d.LOGOUT_BY_USER_IN_LUA);
        }
    }

    public static final void L(NativeHelper nativeHelper, String str) {
        k0.s(nativeHelper.activity).I(str);
    }

    public static final void M(NativeHelper nativeHelper) {
        ti.b.f().j(nativeHelper.activity);
    }

    public static final void N(NativeHelper nativeHelper) {
        nativeHelper.h0();
    }

    public static final void O(NativeHelper nativeHelper) {
        nativeHelper.G();
        fm.b.h().e();
        y.h().d().c(nativeHelper.activity);
        el.a.b().e();
    }

    public static final void P(NativeHelper nativeHelper, double d10) {
        fm.b.h().f();
        y.h().d().e(nativeHelper.activity, (long) d10);
        if (nativeHelper.isForeground) {
            el.a.b().d(nativeHelper.activity);
        }
    }

    public static final void Q(Context context, NativeHelper nativeHelper) {
        NativeGLInterface.nativeSetAppPreviousExitReasons(n2.a(context));
        ug.e.h().i(context);
        boolean zJ2 = rh.h.a().J2();
        if (zJ2) {
            LoggingProtocol.i("fmod_init_begin", 0L, 2, null);
        }
        FMOD.init(nativeHelper.activity);
        if (zJ2) {
            LoggingProtocol.i("fmod_init_end", 0L, 2, null);
        }
        a1.V0();
        NativeSettingsInterface.nativeSetPreferencesFile(z.e(nativeHelper.activity).f());
        oi.b.f().m(nativeHelper.activity);
        k0.w(context);
        if (nativeHelper.appHangMonitor == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            appHangMonitor.c();
            if (nativeHelper.isVisible) {
                appHangMonitor.b();
            }
            nativeHelper.appHangMonitor = appHangMonitor;
        }
        nativeHelper.activity.j2();
        im.f.F().v();
        pl.j jVarJ = pl.j.j();
        if (jVarJ.f()) {
            jVarJ.i(context);
        }
        y.h().d().a(nativeHelper.activity);
        if (rh.h.a().v2() && Intrinsics.c(Environment.getExternalStorageState(), "mounted")) {
            File externalFilesDir = nativeHelper.activity.getExternalFilesDir(null);
            NativeSettingsInterface.nativeSetExternalDirectory(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        }
        if (rh.h.a().Y5()) {
            Intrinsics.checkNotNull(context);
            bi.i.m(context);
        }
        if (rh.h.a().Y4()) {
            mh.c.c(context);
        }
    }

    public static final void R(NativeHelper nativeHelper) {
        nativeHelper.G();
        if (nativeHelper.isInExperience) {
            nativeHelper.activity.p2();
        }
        a.n();
    }

    public static final void S(NativeHelper nativeHelper, String str) {
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.d(str);
        }
    }

    public static final void T(NativeHelper nativeHelper) {
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.c();
        }
    }

    public static final void U(NativeHelper nativeHelper) {
        kk.f fVar = nativeHelper.inputListener;
        if (fVar != null) {
            fVar.H(true);
        }
    }

    public static final void V(NativeHelper nativeHelper) {
        nativeHelper.activity.recreate();
    }

    public static final void W(NativeHelper nativeHelper) {
        pj.f.f(nativeHelper.activity, nativeHelper.contentViewId);
    }

    public static final void X(NativeHelper nativeHelper, int i10) {
        nativeHelper.activity.setRequestedOrientation(i10);
    }

    public static final void Y(int i10, NativeHelper nativeHelper, int i11, String str, String str2) {
        if (i10 != 0) {
            g.b().q("Android-AppLogin-BrowserTracker-Failed");
            nativeHelper.e0();
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
        eVar.f9087c = str2;
        g.b().q("Android-AppLogin-BrowserTracker-Success");
        if (eVar.b() || eVar.c()) {
            com.roblox.client.d.e().g(eVar);
        }
    }

    public static final void Z(byte[] bArr, NativeHelper nativeHelper, long j10, boolean z10, NativeTextBoxInfo nativeTextBoxInfo) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str = new String(bArr, UTF_8);
        x0 x0Var = nativeHelper.overlayEditTextController;
        if (x0Var != null) {
            x0Var.b(j10, z10, str, nativeTextBoxInfo);
        }
    }

    public static final void a0(NativeHelper nativeHelper, s owner, l.a event) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(event, "event");
        q.b("NativeHelper", "onStateChanged: event: " + event);
        switch (b.f9529a[event.ordinal()]) {
            case 1:
                oi.b.f().u(nativeHelper.activity);
                NativeLocaleJavaInterface.setImplementation(new li.a());
                ti.e.c().d(nativeHelper.activity);
                q.b("NativeHelper", "Initializing RTC audio manager.");
                yg.a aVarC = y.h().c(nativeHelper.activity.getApplicationContext());
                aVarC.b(nativeHelper.activity);
                nativeHelper.rtcAudioManager = aVarC;
                if (rh.h.a().U3() && !ti.b.n()) {
                    nativeHelper.activity.getWindow().addFlags(8192);
                }
                if (rh.h.a().Y5()) {
                    nativeHelper.activity.a().a(bi.i.f4224a);
                }
                if (rh.h.a().A5()) {
                    if (rh.h.a().t2()) {
                        nativeHelper.activity.a().a(dl.g.f15004a);
                    } else {
                        nativeHelper.activity.a().a(dl.d.f15000a);
                    }
                }
                MediaPickerProtocol.o().l(nativeHelper.activity);
                y.h().g().n(nativeHelper.activity);
                NativeGLJavaInterface.setWebviewUserAgentGetter(nativeHelper.webViewUserAgentGetter);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(nativeHelper.mobileAdvertisingIdGetter);
                dk.c.c().m();
                nativeHelper.adsHelper.e(nativeHelper.activity);
                if (rh.h.a().s4()) {
                    qh.g.q(j0.g(new Pair("webrtcsdk", new ExpBackOffRetryPolicy(3, 2000L))));
                    q.h("NativeHelper", "Requesting WebRTC SDK module download immediately.");
                    qh.g.l("webrtcsdk");
                }
                if (v.b()) {
                    v.a(qh.g.f29870a, "NativeHelper");
                    owner.a().a(FacialAgeEstimationProtocol.INSTANCE);
                }
                if (rh.h.a().Y2()) {
                    nativeHelper.activity.a().a(v0.f33063a);
                }
                if (rh.h.a().P() || rh.h.a().j5()) {
                    nativeHelper.activity.a().a(DeviceDisplayHandler.INSTANCE);
                }
                if (rh.h.a().n1()) {
                    nativeHelper.activity.a().a(ExternalIdentityHandler.INSTANCE);
                    return;
                }
                return;
            case 2:
                nativeHelper.isVisible = true;
                nm.a.c().a();
                nativeHelper.o0();
                h.j().k(f9510t);
                if (rh.h.a().W1() && uk.e.o()) {
                    h.j().n(a1.g());
                }
                g.b().i0();
                dv.c.d().n(nativeHelper);
                AppHangMonitor appHangMonitor = nativeHelper.appHangMonitor;
                if (appHangMonitor != null) {
                    appHangMonitor.b();
                }
                fm.b.h().e();
                im.f.F().G(nativeHelper.activity);
                return;
            case 3:
                nativeHelper.isForeground = true;
                nativeHelper.G();
                nativeHelper.m0();
                nativeHelper.h0();
                kk.f fVar = nativeHelper.inputListener;
                if (fVar != null) {
                    fVar.H(false);
                }
                INSTANCE.c(nativeHelper.activity, event);
                wl.c.i().j(nativeHelper.activity);
                cm.a.k().l(nativeHelper.activity, new Intent(nativeHelper.activity, (Class<?>) ShareAppChosenReceiver.class), 20124, new cm.a.g() { // from class: yj.b2
                    @Override // cm.a.g
                    public final void a(String str, String str2) {
                        NativeHelper.b0(str, str2);
                    }
                });
                return;
            case 4:
                nativeHelper.isForeground = false;
                kk.f fVar2 = nativeHelper.inputListener;
                if (fVar2 != null) {
                    fVar2.I();
                }
                el.a.b().e();
                wl.c.i().k(nativeHelper.activity);
                cm.a.k().m();
                return;
            case 5:
                nativeHelper.isVisible = false;
                dv.c.d().p(nativeHelper);
                nm.a.c().b();
                ti.e.c().g(nativeHelper.notificationObserver);
                INSTANCE.c(nativeHelper.activity, event);
                h.j().m(f9510t);
                AppHangMonitor appHangMonitor2 = nativeHelper.appHangMonitor;
                if (appHangMonitor2 != null) {
                    appHangMonitor2.a();
                }
                fm.b.h().f();
                im.f.F().H();
                return;
            case 6:
                q.b("NativeHelper", "Disposing RTC audio manager.");
                yg.a aVar = nativeHelper.rtcAudioManager;
                if (aVar != null) {
                    aVar.a();
                }
                nativeHelper.rtcAudioManager = null;
                NativeGLJavaInterface.setWebviewUserAgentGetter(null);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(null);
                nativeHelper.adsHelper.f();
                return;
            case 7:
                return;
            default:
                throw new gt.l();
        }
    }

    public static final void b0(String str, String str2) {
        xj.a.c(str, str2);
    }

    public static final void c0() {
        NativeGLInterface.setMobileAdvertisingId(ek.c.d());
    }

    public static final void d0(int i10, Bundle bundle) {
        if (i10 == 2) {
            q.b("NativeHelper", "handleNotification: Logout event. Do nothing.");
        } else {
            if (i10 != 101) {
                throw new IllegalStateException("Unhandled notificationId");
            }
            q.e("NativeHelper", "handleNotification: Start PlaceID event...");
            throw new IllegalStateException("Error: Notification 'Start PlaceID' still needs to be handled.");
        }
    }

    public static final void f0(NativeHelper nativeHelper) {
        ug.e.h().i(nativeHelper.activity.getApplicationContext());
        nativeHelper.activity.I();
    }

    public static final void i0() {
        q.h("NativeHelper", "Requesting permissions for MediaPickerProtocol");
        y.h().k().Z(new String[]{n.MEDIA_PICKER.toString()});
    }

    public static final void j0(NativeHelper nativeHelper, final String str) {
        nativeHelper.activity.runOnUiThread(new Runnable() { // from class: yj.a2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.k0(str);
            }
        });
    }

    public static final void k0(String str) {
        dk.c.c().u(ml.a.INSTANCE.a(str));
    }

    public static final void l0(NativeHelper nativeHelper, boolean z10) {
        ni.c.f27217a.j(z10);
        ni.b.f27216a.b(nativeHelper.activity, z10);
    }

    public static final void p0() {
        q.h("NativeHelper", "(callback) onCookieChanged: Update cookies (from web) => engine.");
        if (rh.h.a().W1()) {
            a1.C0();
        }
        a1.T0();
    }

    public static final void q0(NativeHelper nativeHelper) {
        if (rh.h.a().m2()) {
            NativeGLInterface.setWebviewUserAgent(o2.c(nativeHelper.activity));
        } else {
            NativeGLInterface.setWebviewUserAgent(WebSettings.getDefaultUserAgent(nativeHelper.activity));
        }
    }

    public final void G() {
        boolean z10 = false;
        boolean z11 = this.activity.getResources().getConfiguration().orientation == 2;
        if (a1.l0() && z11) {
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

    public final void e0() {
        LoggingProtocol.i("init_failure", 0L, 2, null);
        this.activity.runOnUiThread(new Runnable() { // from class: yj.d2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.f0(this.f36707a);
            }
        });
    }

    public final void g0() {
        G();
    }

    @Keep
    @NotNull
    public final String[] gameActivity_getShellFlagKeys() {
        Set<Map.Entry<String, com.roblox.client.flags.a>> setX3 = rh.h.a().X3();
        Intrinsics.checkNotNullExpressionValue(setX3, "getEntrySet(...)");
        Set<Map.Entry<String, com.roblox.client.flags.a>> set = setX3;
        ArrayList arrayList = new ArrayList(kotlin.collections.q.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Intrinsics.checkNotNull(entry);
            arrayList.add(mh.a.d((String) entry.getKey(), (com.roblox.client.flags.a) entry.getValue()));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Keep
    public final void gameActivity_hideKeyboard() {
        this.activity.runOnUiThread(new Runnable() { // from class: yj.s1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.H(this.f36786a);
            }
        });
    }

    @Keep
    public final void gameActivity_onAppReady(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q.b("NativeHelper", "gameActivity_onAppReady: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: yj.k1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.I(this.f36756a);
            }
        });
        if (Intrinsics.c(data, "Push")) {
            y.h().k().b0(this.activity.getApplicationContext());
        }
        if (rh.h.a().m2()) {
            iu.k.d(q0.a(this.ioDispatcher), null, null, new c(null), 3, null);
        }
    }

    @Keep
    public final void gameActivity_onDidLogInReceived(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q.b("NativeHelper", "gameActivity_onDidLogInReceived: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: yj.o1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.J(this.f36771a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidLogOutReceived() {
        q.b("NativeHelper", "gameActivity_onDidLogOutReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: yj.q1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.K(this.f36777a);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSignUp(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        q.b("NativeHelper", "gameActivity_onDidSignUp: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: yj.l1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.L(this.f36759a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSwitchAccountReceived() {
        q.b("NativeHelper", "gameActivity_onDidSwitchAccountReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: yj.j2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.M(this.f36730a);
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
        this.activity.runOnUiThread(new Runnable() { // from class: yj.i2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.N(this.f36726a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStart() {
        q.b("NativeHelper", "gameActivity_onExperienceStart:");
        this.isInExperience = true;
        wi.a.f34518a.b(true);
        this.activity.runOnUiThread(new Runnable() { // from class: yj.c2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.O(this.f36704a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStop(final double timeInMs) {
        q.b("NativeHelper", "gameActivity_onExperienceStop:");
        this.activity.runOnUiThread(new Runnable() { // from class: yj.p1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.P(this.f36775a, timeInMs);
            }
        });
    }

    @Keep
    public final void gameActivity_onFlagsFailed() {
        q.b("NativeHelper", "gameActivity_onFlagsFailed:");
        e0();
    }

    @Keep
    public final void gameActivity_onFlagsLoaded(@NotNull ByteBuffer flagsBuffer) {
        Intrinsics.checkNotNullParameter(flagsBuffer, "flagsBuffer");
        q.b("NativeHelper", "gameActivity_onFlagsLoaded: size = " + flagsBuffer.remaining());
        String string = StandardCharsets.UTF_8.newDecoder().decode(flagsBuffer).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        final Context applicationContext = this.activity.getApplicationContext();
        a.F(string, applicationContext);
        a.B(applicationContext);
        this.enableConnectivityV2ForAndroid = rh.h.a().n3();
        NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.enableConnectivityV2ForAndroid);
        a.g(applicationContext);
        this.activity.runOnUiThread(new Runnable() { // from class: yj.i1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Q(applicationContext, this);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameLoaded(long placeId) {
        q.h("NativeHelper", "gameActivity_onGameLoaded: placeId = " + placeId);
        boolean z10 = placeId > 0;
        this.isInExperience = z10;
        wi.a.f34518a.b(z10);
        if (rh.h.a().q4() && this.isInExperience) {
            LoggingProtocol.i("native_experience_start", 0L, 2, null);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: yj.g1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.R(this.f36716a);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameStreamingStatusChanged(@NotNull String data) {
        Object objB;
        Intrinsics.checkNotNullParameter(data, "data");
        if (rh.h.a().X1()) {
            try {
                gt.n.Companion companion = gt.n.INSTANCE;
                if (new JSONObject(data).optBoolean("inGameStreaming", false)) {
                    uh.q0.f(this.activity);
                } else {
                    uh.q0.i(this.activity);
                }
                objB = gt.n.b(Unit.f22938a);
            } catch (Throwable th2) {
                gt.n.Companion companion2 = gt.n.INSTANCE;
                objB = gt.n.b(o.a(th2));
            }
            Throwable thE = gt.n.e(objB);
            if (thE != null) {
                q.e("NativeHelper", "Failed to parse GAME_STREAMING_STATUS_CHANGED: " + thE.getMessage());
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
        this.activity.runOnUiThread(new Runnable() { // from class: yj.g2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.S(this.f36717a, value);
            }
        });
    }

    @Keep
    public final void gameActivity_onLuaTextBoxPropertyChanged() {
        this.activity.runOnUiThread(new Runnable() { // from class: yj.r1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.T(this.f36782a);
            }
        });
    }

    @Keep
    public final void gameActivity_onMotionEventListening(@NotNull String motionType) {
        Intrinsics.checkNotNullParameter(motionType, "motionType");
        this.activity.runOnUiThread(new Runnable() { // from class: yj.h1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.U(this.f36718a);
            }
        });
    }

    @Keep
    public final void gameActivity_onRestartLuaApp() {
        this.activity.runOnUiThread(new Runnable() { // from class: yj.n1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.V(this.f36767a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScanQrCode() {
        this.activity.runOnUiThread(new Runnable() { // from class: yj.j1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.W(this.f36729a);
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
            this.activity.runOnUiThread(new Runnable() { // from class: yj.e2
                @Override // java.lang.Runnable
                public final void run() {
                    NativeHelper.X(this.f36710a, iD);
                }
            });
        }
    }

    @Keep
    public final void gameActivity_onScreenshotReady(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        iu.k.d(q0.a(this.ioDispatcher), null, null, new d(path, null), 3, null);
    }

    @Keep
    public final void gameActivity_setAppUpgradeStatus(final int result, final int upgradeStatusCode, @NotNull final String apkUrl, @NotNull final String apkCheckSum) {
        Intrinsics.checkNotNullParameter(apkUrl, "apkUrl");
        Intrinsics.checkNotNullParameter(apkCheckSum, "apkCheckSum");
        this.activity.runOnUiThread(new Runnable() { // from class: yj.m1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Y(result, this, upgradeStatusCode, apkUrl, apkCheckSum);
            }
        });
    }

    @Keep
    public final void gameActivity_showKeyboard(final long textBox, final boolean showNativeInput, @NotNull final byte[] byteArrayFromTextBox, @NotNull final NativeTextBoxInfo textBoxInfo) {
        Intrinsics.checkNotNullParameter(byteArrayFromTextBox, "byteArrayFromTextBox");
        Intrinsics.checkNotNullParameter(textBoxInfo, "textBoxInfo");
        this.activity.runOnUiThread(new Runnable() { // from class: yj.h2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Z(byteArrayFromTextBox, this, textBox, showNativeInput, textBoxInfo);
            }
        });
    }

    public final void h0() {
        q.b("NativeHelper", "onForegroundOrEngineInitialized: isForeground = " + this.isForeground + ", isEngineInitialized = " + this.isEngineInitialized);
        if (this.isForeground && this.isEngineInitialized) {
            MediaPickerProtocol.o().m(this.activity, new jl.f() { // from class: yj.x1
                @Override // jl.f
                public final void a() {
                    NativeHelper.i0();
                }
            });
            el.a.b().d(this.activity);
            l lVarA = this.activity.a();
            SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9902a;
            lVarA.a(systemThemeProtocol);
            systemThemeProtocol.O(new SystemThemeProtocol.d() { // from class: yj.y1
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.d
                public final void a(String str) {
                    NativeHelper.j0(this.f36809a, str);
                }
            });
            if (rh.h.a().f5()) {
                systemThemeProtocol.H(new e(ni.m.f27234a));
            } else if (rh.h.a().W0()) {
                systemThemeProtocol.K(new SystemThemeProtocol.b() { // from class: yj.z1
                    @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.b
                    public final void a(boolean z10) {
                        NativeHelper.l0(this.f36811a, z10);
                    }
                });
            }
            if (rh.h.a().k3()) {
                this.activity.a().a(AppRatingPromptHandler.f9858a);
            }
            if (rh.h.a().Y0()) {
                this.activity.a().a(PinShortcutHandler.INSTANCE);
            }
            if (rh.h.a().O5()) {
                this.activity.a().a(RecentlyPlayedWidgetHandler.INSTANCE);
            }
        }
    }

    public final void m0() {
        q.b("NativeHelper", "onForegroundOrLogin: isForeground = " + this.isForeground + ", isLoggedIn = " + ti.h.e().f());
        if (this.isForeground) {
            com.roblox.client.d.e().b(new f());
        }
    }

    public final void n0(int contentViewId, @NotNull SurfaceView surfaceView, @NotNull RbxKeyboard rbxEditText, @NotNull kk.f.InterfaceC0399f inputAdapter) {
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(rbxEditText, "rbxEditText");
        Intrinsics.checkNotNullParameter(inputAdapter, "inputAdapter");
        this.contentViewId = contentViewId;
        kk.f fVar = this.inputListener;
        if (fVar != null) {
            fVar.I();
        }
        kk.f fVar2 = new kk.f(this.activity, surfaceView, inputAdapter);
        this.inputListener = fVar2;
        surfaceView.setOnTouchListener(fVar2);
        this.overlayEditTextController = new r0(rbxEditText);
    }

    public final void o0() {
        q.b("NativeHelper", "onVisibleOrLogin: isVisible = " + this.isVisible + ", isLoggedIn = " + ti.h.e().f());
        if (this.isVisible && ti.h.e().f()) {
            ti.e.c().b(this.notificationObserver);
        }
    }

    @dv.j(threadMode = ThreadMode.MAIN)
    @Keep
    public final void onCodeParsedFromSMS(@NotNull oh.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        q.h("NativeHelper", "SMS code received.");
        q.h("NativeHelper", "Calling IdentityProtocol to parse OTP.");
        y.h().g().o(event.f27898a);
    }

    public /* synthetic */ NativeHelper(MainGameActivity mainGameActivity, i iVar, sg.a aVar, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainGameActivity, iVar, aVar, (i10 & 8) != 0 ? g1.b() : l0Var);
    }
}
