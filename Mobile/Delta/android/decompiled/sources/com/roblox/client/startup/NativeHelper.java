package com.roblox.client.startup;

import ak.k0;
import ak.m2;
import ak.n2;
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
import fh.i;
import gk.s;
import gk.u;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import jj.t;
import jt.o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.j0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ku.g1;
import ku.l0;
import ku.p0;
import ku.q0;
import om.k;
import om.n;
import org.fmod.FMOD;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pt.m;
import sg.a1;
import sg.c2;
import sg.y;
import sh.ExpBackOffRetryPolicy;
import vi.g;
import wh.u0;
import wh.w0;
import wk.h;
import wk.j;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u008d\u00012\u00020\u0001:\u0001XB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ/\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\u000eJ\u000f\u0010\"\u001a\u00020\fH\u0007¢\u0006\u0004\b\"\u0010\u000eJ\u0017\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\f2\u0006\u00100\u001a\u00020,H\u0007¢\u0006\u0004\b1\u0010/J\u000f\u00102\u001a\u00020\fH\u0007¢\u0006\u0004\b2\u0010\u000eJ\u0017\u00103\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b3\u0010/J\u0017\u00104\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b4\u0010/J\u0017\u00105\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b5\u0010/J\u000f\u00106\u001a\u00020\fH\u0007¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\fH\u0007¢\u0006\u0004\b7\u0010\u000eJ\u000f\u00108\u001a\u00020\fH\u0007¢\u0006\u0004\b8\u0010\u000eJ\u0017\u0010;\u001a\u00020\f2\u0006\u0010:\u001a\u000209H\u0007¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\fH\u0007¢\u0006\u0004\b=\u0010\u000eJ\u000f\u0010>\u001a\u00020\fH\u0007¢\u0006\u0004\b>\u0010\u000eJ/\u0010E\u001a\u00020\f2\u0006\u0010?\u001a\u00020#2\u0006\u0010@\u001a\u00020(2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020CH\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\fH\u0007¢\u0006\u0004\bG\u0010\u000eJ\u0017\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020,H\u0007¢\u0006\u0004\bI\u0010/J\u000f\u0010J\u001a\u00020\fH\u0007¢\u0006\u0004\bJ\u0010\u000eJ\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020,H\u0007¢\u0006\u0004\bL\u0010/J/\u0010Q\u001a\u00020\f2\u0006\u0010M\u001a\u00020\u00132\u0006\u0010N\u001a\u00020\u00132\u0006\u0010O\u001a\u00020,2\u0006\u0010P\u001a\u00020,H\u0007¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\f2\u0006\u0010T\u001a\u00020SH\u0007¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\fH\u0007¢\u0006\u0004\bW\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010j\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0016\u0010n\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010iR\u0016\u0010p\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u0016\u0010r\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010iR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010z\u001a\u0004\u0018\u00010w8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\u0015\u0010\u0080\u0001\u001a\u00020}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u008e\u0001"}, d2 = {"Lcom/roblox/client/startup/NativeHelper;", "", "Lcom/roblox/client/startup/MainGameActivity;", "activity", "Lfh/i;", "upgradeDialog", "Ltg/a;", "adsHelper", "Lku/l0;", "ioDispatcher", "<init>", "(Lcom/roblox/client/startup/MainGameActivity;Lfh/i;Ltg/a;Lku/l0;)V", "", "o0", "()V", "m0", "h0", "G", "e0", "", "contentViewId", "Landroid/view/SurfaceView;", "surfaceView", "Lcom/roblox/client/RbxKeyboard;", "rbxEditText", "Lmk/f$f;", "inputAdapter", "n0", "(ILandroid/view/SurfaceView;Lcom/roblox/client/RbxKeyboard;Lmk/f$f;)V", "Ljava/nio/ByteBuffer;", "flagsBuffer", "gameActivity_onFlagsLoaded", "(Ljava/nio/ByteBuffer;)V", "gameActivity_onFlagsFailed", "gameActivity_onEngineInitialized", "", PinShortcutHandler.EXTRA_PLACE_ID, "gameActivity_onGameLoaded", "(J)V", "orientation", "", "inExperience", "gameActivity_onScreenOrientationChanged", "(IZ)V", "", "data", "gameActivity_onGameStreamingStatusChanged", "(Ljava/lang/String;)V", "motionType", "gameActivity_onMotionEventListening", "gameActivity_onLuaAppDidReturn", "gameActivity_onDidLogInReceived", "gameActivity_onDidSignUp", "gameActivity_onAppReady", "gameActivity_onDidLogOutReceived", "gameActivity_onDidSwitchAccountReceived", "gameActivity_onExperienceStart", "", "timeInMs", "gameActivity_onExperienceStop", "(D)V", "gameActivity_onRestartLuaApp", "gameActivity_onScanQrCode", "textBox", "showNativeInput", "", "byteArrayFromTextBox", "Lcom/roblox/engine/jni/model/NativeTextBoxInfo;", "textBoxInfo", "gameActivity_showKeyboard", "(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V", "gameActivity_hideKeyboard", "value", "gameActivity_onLuaTextBoxChanged", "gameActivity_onLuaTextBoxPropertyChanged", "path", "gameActivity_onScreenshotReady", "result", "upgradeStatusCode", "apkUrl", "apkCheckSum", "gameActivity_setAppUpgradeStatus", "(IILjava/lang/String;Ljava/lang/String;)V", "Lph/j;", "event", "onCodeParsedFromSMS", "(Lph/j;)V", "g0", "a", "Lcom/roblox/client/startup/MainGameActivity;", "b", "Lfh/i;", "c", "Ltg/a;", "d", "Lku/l0;", "Lmk/f;", "e", "Lmk/f;", "inputListener", "Lwh/w0;", "f", "Lwh/w0;", "overlayEditTextController", "g", "Z", "isVisible", "h", "isForeground", "i", "isEngineInitialized", "j", "isInExperience", "k", "enableConnectivityV2ForAndroid", "Lzg/a;", "l", "Lzg/a;", "rtcAudioManager", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "m", "Lcom/roblox/protocols/apphangmonitor/AppHangMonitor;", "appHangMonitor", "n", "I", "Landroidx/lifecycle/p;", "o", "Landroidx/lifecycle/p;", "lifecycleEventObserver", "Lvi/e$e;", "p", "Lvi/e$e;", "notificationObserver", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "q", "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;", "webViewUserAgentGetter", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "r", "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;", "mobileAdvertisingIdGetter", "s", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NativeHelper {

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final h.d f9431t = new h.d() { // from class: ak.f2
        @Override // wk.h.d
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
    public final tg.a adsHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final l0 ioDispatcher;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public mk.f inputListener;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public w0 overlayEditTextController;

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
    public zg.a rtcAudioManager;

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
    public final vi.e.InterfaceC0602e notificationObserver;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.WebViewUserAgentGetter webViewUserAgentGetter;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeGLJavaInterface.MobileAdvertisingIdGetter mobileAdvertisingIdGetter;

    /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/roblox/client/startup/NativeHelper$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/l$a;", "event", "", "c", "(Landroid/app/Activity;Landroidx/lifecycle/l$a;)V", "", "orientation", "d", "(I)I", "", "TAG", "Ljava/lang/String;", "Lwk/h$d;", "securityCookieObserver", "Lwk/h$d;", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.roblox.client.startup.NativeHelper$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class C0147a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9449a;

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
                f9449a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void c(Activity activity, l.a event) {
            k kVarK = y.h().k();
            int i10 = C0147a.f9449a[event.ordinal()];
            if (i10 == 1) {
                kVarK.d0(activity);
                kVarK.c0();
                kVarK.k("POST_NOTIFICATIONS", t.g());
                kVarK.k("MEDIA_PICKER", wi.a.e());
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
            gk.p.k("NativeHelper", "orientationFromEngineToNative: Unsupported orientation = " + orientation);
            return -1;
        }

        public Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9450a;

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
            f9450a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.startup.NativeHelper$gameActivity_onAppReady$2", f = "NativeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class c extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9451t;

        public c(nt.b<? super c> bVar) {
            super(2, bVar);
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return NativeHelper.this.new c(bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9451t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            n2.b(NativeHelper.this.activity);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((c) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku/p0;", "", "<anonymous>", "(Lku/p0;)V"}, k = 3, mv = {2, 2, 0})
    @pt.f(c = "com.roblox.client.startup.NativeHelper$gameActivity_onScreenshotReady$1", f = "NativeHelper.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class d extends m implements Function2<p0, nt.b<? super Unit>, Object> {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f9453t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f9454u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, nt.b<? super d> bVar) {
            super(2, bVar);
            this.f9454u = str;
        }

        @Override // pt.a
        public final nt.b<Unit> create(Object obj, nt.b<?> bVar) {
            return new d(this.f9454u, bVar);
        }

        @Override // pt.a
        public final Object invokeSuspend(Object obj) {
            ot.c.e();
            if (this.f9453t != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            wh.k.u(this.f9454u);
            return Unit.f22483a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(p0 p0Var, nt.b<? super Unit> bVar) {
            return ((d) create(p0Var, bVar)).invokeSuspend(Unit.f22483a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class e implements SystemThemeProtocol.a, kotlin.jvm.internal.h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ pi.m f9455c;

        public e(pi.m mVar) {
            this.f9455c = mVar;
        }

        @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.a
        public final void a(String p8) {
            Intrinsics.checkNotNullParameter(p8, "p0");
            this.f9455c.f(p8);
        }

        @Override // kotlin.jvm.internal.h
        public final jt.b<?> b() {
            return new kotlin.jvm.internal.k(1, this.f9455c, pi.m.class, "onAppIconChanged", "onAppIconChanged(Ljava/lang/String;)V", 0);
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
    public static final class f implements com.roblox.client.d.InterfaceC0136d {
        public f() {
        }

        @Override // com.roblox.client.d.InterfaceC0136d
        public void a(com.roblox.client.d.e result) {
            Intrinsics.checkNotNullParameter(result, "result");
            if (result.b()) {
                NativeHelper.this.upgradeDialog.a(i.a.Optional);
                return;
            }
            if (result.c()) {
                NativeHelper.this.upgradeDialog.a(i.a.Required);
            } else if (s.j() && result.a()) {
                NativeHelper.this.upgradeDialog.a(i.a.NewApp);
                vi.b.f().i(NativeHelper.this.activity, vi.b.d.LOGOUT_BY_USER_IN_NATIVE);
            }
        }

        @Override // com.roblox.client.d.InterfaceC0136d
        public void b(com.roblox.client.d.e status) {
            Intrinsics.checkNotNullParameter(status, "status");
            if (a1.q0() && status.c()) {
                NativeHelper.this.upgradeDialog.a(i.a.Required);
            }
        }
    }

    public NativeHelper(@NotNull MainGameActivity activity, @NotNull i upgradeDialog, @NotNull tg.a adsHelper, @NotNull l0 ioDispatcher) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(upgradeDialog, "upgradeDialog");
        Intrinsics.checkNotNullParameter(adsHelper, "adsHelper");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.activity = activity;
        this.upgradeDialog = upgradeDialog;
        this.adsHelper = adsHelper;
        this.ioDispatcher = ioDispatcher;
        p pVar = new p() { // from class: ak.t1
            @Override // androidx.p000lifecycle.p
            public final void g(androidx.p000lifecycle.s sVar, androidx.lifecycle.l.a aVar) {
                NativeHelper.a0(this.f644a, sVar, aVar);
            }
        };
        this.lifecycleEventObserver = pVar;
        this.notificationObserver = new vi.e.InterfaceC0602e() { // from class: ak.u1
            @Override // vi.e.InterfaceC0602e
            public final void S(int i10, Bundle bundle) {
                NativeHelper.d0(i10, bundle);
            }
        };
        this.webViewUserAgentGetter = new NativeGLJavaInterface.WebViewUserAgentGetter() { // from class: ak.v1
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.WebViewUserAgentGetter
            public final void n0() {
                NativeHelper.q0(this.f649a);
            }
        };
        this.mobileAdvertisingIdGetter = new NativeGLJavaInterface.MobileAdvertisingIdGetter() { // from class: ak.w1
            @Override // com.roblox.engine.jni.NativeGLJavaInterface.MobileAdvertisingIdGetter
            public final void T() {
                NativeHelper.c0();
            }
        };
        activity.a().a(pVar);
    }

    public static final void H(NativeHelper nativeHelper) {
        w0 w0Var = nativeHelper.overlayEditTextController;
        if (w0Var != null) {
            w0Var.a();
        }
        nativeHelper.G();
    }

    public static final void I(NativeHelper nativeHelper) {
        nativeHelper.activity.o2();
    }

    public static final void J(NativeHelper nativeHelper, String str) {
        k0.s(nativeHelper.activity).H(str);
        if (th.h.a().J3()) {
            vi.b.f().h();
            nativeHelper.activity.getWindow().clearFlags(8192);
        }
        nativeHelper.o0();
        nativeHelper.m0();
    }

    public static final void K(NativeHelper nativeHelper) {
        if (th.h.a().M1() && !vi.h.e().f()) {
            vi.b.f().p(vi.b.d.LOGOUT_BY_USER_IN_LUA);
            j.c().e(a1.O(), a1.g());
        }
        if (vi.h.e().f()) {
            vi.b.f().i(nativeHelper.activity, vi.b.d.LOGOUT_BY_USER_IN_LUA);
        }
    }

    public static final void L(NativeHelper nativeHelper, String str) {
        k0.s(nativeHelper.activity).I(str);
    }

    public static final void M(NativeHelper nativeHelper) {
        vi.b.f().j(nativeHelper.activity);
    }

    public static final void N(NativeHelper nativeHelper) {
        nativeHelper.h0();
    }

    public static final void O(NativeHelper nativeHelper) {
        nativeHelper.G();
        hm.b.h().e();
        y.h().d().c(nativeHelper.activity);
        gl.a.b().e();
    }

    public static final void P(NativeHelper nativeHelper, double d10) {
        hm.b.h().f();
        y.h().d().e(nativeHelper.activity, (long) d10);
        if (nativeHelper.isForeground) {
            gl.a.b().d(nativeHelper.activity);
        }
    }

    public static final void Q(Context context, NativeHelper nativeHelper) {
        NativeGLInterface.nativeSetAppPreviousExitReasons(m2.a(context));
        vg.e.h().i(context);
        boolean zY2 = th.h.a().y2();
        if (zY2) {
            LoggingProtocol.i("fmod_init_begin", 0L, 2, null);
        }
        FMOD.init(nativeHelper.activity);
        if (zY2) {
            LoggingProtocol.i("fmod_init_end", 0L, 2, null);
        }
        a1.U0();
        NativeSettingsInterface.nativeSetPreferencesFile(gk.y.e(nativeHelper.activity).f());
        qi.b.f().m(nativeHelper.activity);
        k0.w(context);
        if (nativeHelper.appHangMonitor == null) {
            AppHangMonitor appHangMonitor = new AppHangMonitor();
            appHangMonitor.c();
            if (nativeHelper.isVisible) {
                appHangMonitor.b();
            }
            nativeHelper.appHangMonitor = appHangMonitor;
        }
        nativeHelper.activity.i2();
        km.f.v().m();
        rl.j jVarJ = rl.j.j();
        if (jVarJ.f()) {
            jVarJ.i(context);
        }
        y.h().d().a(nativeHelper.activity);
        if (th.h.a().k2() && Intrinsics.c(Environment.getExternalStorageState(), "mounted")) {
            File externalFilesDir = nativeHelper.activity.getExternalFilesDir(null);
            NativeSettingsInterface.nativeSetExternalDirectory(externalFilesDir != null ? externalFilesDir.getAbsolutePath() : null);
        }
        if (th.h.a().O5()) {
            Intrinsics.checkNotNull(context);
            di.h.m(context);
        }
        if (th.h.a().L4()) {
            nh.c.c(context);
        }
    }

    public static final void R(NativeHelper nativeHelper) {
        nativeHelper.G();
        if (nativeHelper.isInExperience) {
            nativeHelper.activity.o2();
        }
        a.n();
    }

    public static final void S(NativeHelper nativeHelper, String str) {
        w0 w0Var = nativeHelper.overlayEditTextController;
        if (w0Var != null) {
            w0Var.d(str);
        }
    }

    public static final void T(NativeHelper nativeHelper) {
        w0 w0Var = nativeHelper.overlayEditTextController;
        if (w0Var != null) {
            w0Var.c();
        }
    }

    public static final void U(NativeHelper nativeHelper) {
        mk.f fVar = nativeHelper.inputListener;
        if (fVar != null) {
            fVar.H(true);
        }
    }

    public static final void V(NativeHelper nativeHelper) {
        nativeHelper.activity.recreate();
    }

    public static final void W(NativeHelper nativeHelper) {
        rj.f.f(nativeHelper.activity, nativeHelper.contentViewId);
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
        eVar.f9013c = str2;
        g.b().q("Android-AppLogin-BrowserTracker-Success");
        if (eVar.b() || eVar.c()) {
            com.roblox.client.d.e().g(eVar);
        }
    }

    public static final void Z(byte[] bArr, NativeHelper nativeHelper, long j10, boolean z10, NativeTextBoxInfo nativeTextBoxInfo) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        String str = new String(bArr, UTF_8);
        w0 w0Var = nativeHelper.overlayEditTextController;
        if (w0Var != null) {
            w0Var.b(j10, z10, str, nativeTextBoxInfo);
        }
    }

    public static final void a0(NativeHelper nativeHelper, androidx.p000lifecycle.s owner, l.a event) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(event, "event");
        gk.p.b("NativeHelper", "onStateChanged: event: " + event);
        switch (b.f9450a[event.ordinal()]) {
            case 1:
                qi.b.f().u(nativeHelper.activity);
                NativeLocaleJavaInterface.setImplementation(new ni.a());
                vi.e.c().d(nativeHelper.activity);
                gk.p.b("NativeHelper", "Initializing RTC audio manager.");
                zg.a aVarC = y.h().c(nativeHelper.activity.getApplicationContext());
                aVarC.b(nativeHelper.activity);
                nativeHelper.rtcAudioManager = aVarC;
                if (th.h.a().J3() && !vi.b.n()) {
                    nativeHelper.activity.getWindow().addFlags(8192);
                }
                if (th.h.a().O5()) {
                    nativeHelper.activity.a().a(di.h.f14632a);
                }
                if (th.h.a().q5()) {
                    if (th.h.a().h2()) {
                        nativeHelper.activity.a().a(fl.g.f16808a);
                    } else {
                        nativeHelper.activity.a().a(fl.d.f16804a);
                    }
                }
                MediaPickerProtocol.o().l(nativeHelper.activity);
                y.h().g().n(nativeHelper.activity);
                NativeGLJavaInterface.setWebviewUserAgentGetter(nativeHelper.webViewUserAgentGetter);
                NativeGLJavaInterface.setMobileAdvertisingIdGetter(nativeHelper.mobileAdvertisingIdGetter);
                fk.c.c().m();
                nativeHelper.adsHelper.e(nativeHelper.activity);
                if (th.h.a().h4()) {
                    sh.g.q(j0.g(new Pair("webrtcsdk", new ExpBackOffRetryPolicy(3, 2000L))));
                    gk.p.h("NativeHelper", "Requesting WebRTC SDK module download immediately.");
                    sh.g.l("webrtcsdk");
                }
                if (u.b()) {
                    u.a(sh.g.f31123a, "NativeHelper");
                    owner.a().a(FacialAgeEstimationProtocol.INSTANCE);
                }
                if (th.h.a().N2()) {
                    nativeHelper.activity.a().a(u0.f34384a);
                }
                if (th.h.a().N() || th.h.a().W4()) {
                    nativeHelper.activity.a().a(DeviceDisplayHandler.INSTANCE);
                }
                if (th.h.a().f1()) {
                    nativeHelper.activity.a().a(ExternalIdentityHandler.INSTANCE);
                    return;
                }
                return;
            case 2:
                nativeHelper.isVisible = true;
                pm.a.c().a();
                nativeHelper.o0();
                h.h().i(f9431t);
                g.b().i0();
                fv.c.d().n(nativeHelper);
                AppHangMonitor appHangMonitor = nativeHelper.appHangMonitor;
                if (appHangMonitor != null) {
                    appHangMonitor.b();
                }
                hm.b.h().e();
                km.f.v().w(nativeHelper.activity);
                return;
            case 3:
                nativeHelper.isForeground = true;
                nativeHelper.G();
                nativeHelper.m0();
                nativeHelper.h0();
                mk.f fVar = nativeHelper.inputListener;
                if (fVar != null) {
                    fVar.H(false);
                }
                INSTANCE.c(nativeHelper.activity, event);
                yl.c.i().j(nativeHelper.activity);
                em.a.k().l(nativeHelper.activity, new Intent(nativeHelper.activity, (Class<?>) ShareAppChosenReceiver.class), 20124, new em.a.g() { // from class: ak.b2
                    @Override // em.a.g
                    public final void a(String str, String str2) {
                        NativeHelper.b0(str, str2);
                    }
                });
                return;
            case 4:
                nativeHelper.isForeground = false;
                mk.f fVar2 = nativeHelper.inputListener;
                if (fVar2 != null) {
                    fVar2.I();
                }
                gl.a.b().e();
                yl.c.i().k(nativeHelper.activity);
                em.a.k().m();
                return;
            case 5:
                nativeHelper.isVisible = false;
                fv.c.d().p(nativeHelper);
                pm.a.c().b();
                vi.e.c().g(nativeHelper.notificationObserver);
                INSTANCE.c(nativeHelper.activity, event);
                h.h().j(f9431t);
                AppHangMonitor appHangMonitor2 = nativeHelper.appHangMonitor;
                if (appHangMonitor2 != null) {
                    appHangMonitor2.a();
                }
                hm.b.h().f();
                km.f.v().x();
                return;
            case 6:
                gk.p.b("NativeHelper", "Disposing RTC audio manager.");
                zg.a aVar = nativeHelper.rtcAudioManager;
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
                throw new jt.l();
        }
    }

    public static final void b0(String str, String str2) {
        zj.a.c(str, str2);
    }

    public static final void c0() {
        NativeGLInterface.setMobileAdvertisingId(gk.c.d());
    }

    public static final void d0(int i10, Bundle bundle) {
        if (i10 == 2) {
            gk.p.b("NativeHelper", "handleNotification: Logout event. Do nothing.");
        } else {
            if (i10 != 101) {
                throw new IllegalStateException("Unhandled notificationId");
            }
            gk.p.e("NativeHelper", "handleNotification: Start PlaceID event...");
            throw new IllegalStateException("Error: Notification 'Start PlaceID' still needs to be handled.");
        }
    }

    public static final void f0(NativeHelper nativeHelper) {
        vg.e.h().i(nativeHelper.activity.getApplicationContext());
        nativeHelper.activity.J();
    }

    public static final void i0() {
        gk.p.h("NativeHelper", "Requesting permissions for MediaPickerProtocol");
        y.h().k().Z(new String[]{n.MEDIA_PICKER.toString()});
    }

    public static final void j0(NativeHelper nativeHelper, final String str) {
        nativeHelper.activity.runOnUiThread(new Runnable() { // from class: ak.a2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.k0(str);
            }
        });
    }

    public static final void k0(String str) {
        fk.c.c().u(ol.a.INSTANCE.a(str));
    }

    public static final void l0(NativeHelper nativeHelper, boolean z10) {
        pi.c.f28623a.j(z10);
        pi.b.f28622a.b(nativeHelper.activity, z10);
    }

    public static final void p0() {
        gk.p.h("NativeHelper", "(callback) onCookieChanged: Update cookies (from web) => engine.");
        a1.S0();
    }

    public static final void q0(NativeHelper nativeHelper) {
        if (th.h.a().b2()) {
            NativeGLInterface.setWebviewUserAgent(n2.c(nativeHelper.activity));
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
        gk.p.b("NativeHelper", "adjustWindowInsets: isForeground=" + this.isForeground + ", isInExperience=" + this.isInExperience + ", isLandscape=" + z11 + ", shouldHideInLandscape=" + z10);
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
        this.activity.runOnUiThread(new Runnable() { // from class: ak.d2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.f0(this.f563a);
            }
        });
    }

    public final void g0() {
        G();
    }

    @Keep
    public final void gameActivity_hideKeyboard() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.s1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.H(this.f641a);
            }
        });
    }

    @Keep
    public final void gameActivity_onAppReady(@NotNull String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        gk.p.b("NativeHelper", "gameActivity_onAppReady: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.k1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.I(this.f612a);
            }
        });
        if (Intrinsics.c(data, "Push")) {
            y.h().k().b0(this.activity.getApplicationContext());
        }
        if (th.h.a().b2()) {
            ku.k.d(q0.a(this.ioDispatcher), null, null, new c(null), 3, null);
        }
    }

    @Keep
    public final void gameActivity_onDidLogInReceived(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        gk.p.b("NativeHelper", "gameActivity_onDidLogInReceived: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.o1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.J(this.f627a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidLogOutReceived() {
        gk.p.b("NativeHelper", "gameActivity_onDidLogOutReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.q1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.K(this.f632a);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSignUp(@NotNull final String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        gk.p.b("NativeHelper", "gameActivity_onDidSignUp: data = " + data);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.l1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.L(this.f615a, data);
            }
        });
    }

    @Keep
    public final void gameActivity_onDidSwitchAccountReceived() {
        gk.p.b("NativeHelper", "gameActivity_onDidSwitchAccountReceived:");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.j2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.M(this.f586a);
            }
        });
    }

    @Keep
    public final void gameActivity_onEngineInitialized() {
        gk.p.b("NativeHelper", "gameActivity_onEngineInitialized:");
        this.isEngineInitialized = true;
        if (this.enableConnectivityV2ForAndroid) {
            Context applicationContext = this.activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            ConnectivityV2Monitor.setup(applicationContext);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ak.i2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.N(this.f582a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStart() {
        gk.p.b("NativeHelper", "gameActivity_onExperienceStart:");
        this.isInExperience = true;
        yi.a.f35889a.b(true);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.c2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.O(this.f560a);
            }
        });
    }

    @Keep
    public final void gameActivity_onExperienceStop(final double timeInMs) {
        gk.p.b("NativeHelper", "gameActivity_onExperienceStop:");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.p1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.P(this.f630a, timeInMs);
            }
        });
    }

    @Keep
    public final void gameActivity_onFlagsFailed() {
        gk.p.b("NativeHelper", "gameActivity_onFlagsFailed:");
        e0();
    }

    @Keep
    public final void gameActivity_onFlagsLoaded(@NotNull ByteBuffer flagsBuffer) {
        Intrinsics.checkNotNullParameter(flagsBuffer, "flagsBuffer");
        gk.p.b("NativeHelper", "gameActivity_onFlagsLoaded: size = " + flagsBuffer.remaining());
        String string = StandardCharsets.UTF_8.newDecoder().decode(flagsBuffer).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        final Context applicationContext = this.activity.getApplicationContext();
        a.F(string, applicationContext);
        a.B(applicationContext);
        this.enableConnectivityV2ForAndroid = th.h.a().d3();
        NativeAppBridgeInterface.setEnableConnectivityV2ForAndroid(this.enableConnectivityV2ForAndroid);
        a.g(applicationContext);
        this.activity.runOnUiThread(new Runnable() { // from class: ak.i1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Q(applicationContext, this);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameLoaded(long placeId) {
        gk.p.h("NativeHelper", "gameActivity_onGameLoaded: placeId = " + placeId);
        boolean z10 = placeId > 0;
        this.isInExperience = z10;
        yi.a.f35889a.b(z10);
        if (th.h.a().f4() && this.isInExperience) {
            LoggingProtocol.i("native_experience_start", 0L, 2, null);
        }
        this.activity.runOnUiThread(new Runnable() { // from class: ak.g1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.R(this.f572a);
            }
        });
    }

    @Keep
    public final void gameActivity_onGameStreamingStatusChanged(@NotNull String data) {
        Object objB;
        Intrinsics.checkNotNullParameter(data, "data");
        if (th.h.a().N1()) {
            try {
                jt.n.Companion companion = jt.n.INSTANCE;
                if (new JSONObject(data).optBoolean("inGameStreaming", false)) {
                    wh.p0.f(this.activity);
                } else {
                    wh.p0.i(this.activity);
                }
                objB = jt.n.b(Unit.f22483a);
            } catch (Throwable th2) {
                jt.n.Companion companion2 = jt.n.INSTANCE;
                objB = jt.n.b(o.a(th2));
            }
            Throwable thE = jt.n.e(objB);
            if (thE != null) {
                gk.p.e("NativeHelper", "Failed to parse GAME_STREAMING_STATUS_CHANGED: " + thE.getMessage());
            }
        }
    }

    @Keep
    public final void gameActivity_onLuaAppDidReturn() {
        gk.p.b("NativeHelper", "gameActivity_onLuaAppDidReturn:");
        this.activity.requestOrientationAsDefault();
    }

    @Keep
    public final void gameActivity_onLuaTextBoxChanged(@NotNull final String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.g2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.S(this.f573a, value);
            }
        });
    }

    @Keep
    public final void gameActivity_onLuaTextBoxPropertyChanged() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.r1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.T(this.f637a);
            }
        });
    }

    @Keep
    public final void gameActivity_onMotionEventListening(@NotNull String motionType) {
        Intrinsics.checkNotNullParameter(motionType, "motionType");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.h1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.U(this.f574a);
            }
        });
    }

    @Keep
    public final void gameActivity_onRestartLuaApp() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.n1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.V(this.f623a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScanQrCode() {
        this.activity.runOnUiThread(new Runnable() { // from class: ak.j1
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.W(this.f585a);
            }
        });
    }

    @Keep
    public final void gameActivity_onScreenOrientationChanged(int orientation, boolean inExperience) {
        if (!inExperience) {
            gk.p.h("NativeHelper", "gameActivity_onScreenOrientationChanged: (In-App) request the default Orientation.");
            this.activity.requestOrientationAsDefault();
            return;
        }
        final int iD = INSTANCE.d(orientation);
        if (iD != -1) {
            gk.p.h("NativeHelper", "gameActivity_onScreenOrientationChanged: orientation:" + orientation + " => " + iD);
            this.activity.runOnUiThread(new Runnable() { // from class: ak.e2
                @Override // java.lang.Runnable
                public final void run() {
                    NativeHelper.X(this.f566a, iD);
                }
            });
        }
    }

    @Keep
    public final void gameActivity_onScreenshotReady(@NotNull String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        ku.k.d(q0.a(this.ioDispatcher), null, null, new d(path, null), 3, null);
    }

    @Keep
    public final void gameActivity_setAppUpgradeStatus(final int result, final int upgradeStatusCode, @NotNull final String apkUrl, @NotNull final String apkCheckSum) {
        Intrinsics.checkNotNullParameter(apkUrl, "apkUrl");
        Intrinsics.checkNotNullParameter(apkCheckSum, "apkCheckSum");
        this.activity.runOnUiThread(new Runnable() { // from class: ak.m1
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
        this.activity.runOnUiThread(new Runnable() { // from class: ak.h2
            @Override // java.lang.Runnable
            public final void run() {
                NativeHelper.Z(byteArrayFromTextBox, this, textBox, showNativeInput, textBoxInfo);
            }
        });
    }

    public final void h0() {
        gk.p.b("NativeHelper", "onForegroundOrEngineInitialized: isForeground = " + this.isForeground + ", isEngineInitialized = " + this.isEngineInitialized);
        if (this.isForeground && this.isEngineInitialized) {
            MediaPickerProtocol.o().m(this.activity, new ll.f() { // from class: ak.x1
                @Override // ll.f
                public final void a() {
                    NativeHelper.i0();
                }
            });
            gl.a.b().d(this.activity);
            l lVarA = this.activity.a();
            SystemThemeProtocol systemThemeProtocol = SystemThemeProtocol.f9821a;
            lVarA.a(systemThemeProtocol);
            systemThemeProtocol.O(new SystemThemeProtocol.d() { // from class: ak.y1
                @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.d
                public final void a(String str) {
                    NativeHelper.j0(this.f664a, str);
                }
            });
            if (th.h.a().S4()) {
                systemThemeProtocol.H(new e(pi.m.f28640a));
            } else if (th.h.a().P0()) {
                systemThemeProtocol.K(new SystemThemeProtocol.b() { // from class: ak.z1
                    @Override // com.roblox.universalapp.systemtheme.SystemThemeProtocol.b
                    public final void a(boolean z10) {
                        NativeHelper.l0(this.f666a, z10);
                    }
                });
            }
            if (th.h.a().a3()) {
                this.activity.a().a(AppRatingPromptHandler.f9777a);
            }
            if (th.h.a().E5()) {
                this.activity.a().a(RecentlyPlayedWidgetHandler.INSTANCE);
            }
        }
    }

    public final void m0() {
        gk.p.b("NativeHelper", "onForegroundOrLogin: isForeground = " + this.isForeground + ", isLoggedIn = " + vi.h.e().f());
        if (this.isForeground) {
            com.roblox.client.d.e().b(new f());
        }
    }

    public final void n0(int contentViewId, @NotNull SurfaceView surfaceView, @NotNull RbxKeyboard rbxEditText, @NotNull mk.f.InterfaceC0430f inputAdapter) {
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(rbxEditText, "rbxEditText");
        Intrinsics.checkNotNullParameter(inputAdapter, "inputAdapter");
        this.contentViewId = contentViewId;
        mk.f fVar = this.inputListener;
        if (fVar != null) {
            fVar.I();
        }
        mk.f fVar2 = new mk.f(this.activity, surfaceView, inputAdapter);
        this.inputListener = fVar2;
        surfaceView.setOnTouchListener(fVar2);
        this.overlayEditTextController = new wh.q0(rbxEditText);
    }

    public final void o0() {
        gk.p.b("NativeHelper", "onVisibleOrLogin: isVisible = " + this.isVisible + ", isLoggedIn = " + vi.h.e().f());
        if (this.isVisible && vi.h.e().f()) {
            vi.e.c().b(this.notificationObserver);
        }
    }

    @fv.j(threadMode = ThreadMode.MAIN)
    @Keep
    public final void onCodeParsedFromSMS(@NotNull ph.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        gk.p.h("NativeHelper", "SMS code received.");
        gk.p.h("NativeHelper", "Calling IdentityProtocol to parse OTP.");
        y.h().g().o(event.f28619a);
    }

    public /* synthetic */ NativeHelper(MainGameActivity mainGameActivity, i iVar, tg.a aVar, l0 l0Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(mainGameActivity, iVar, aVar, (i10 & 8) != 0 ? g1.b() : l0Var);
    }
}
