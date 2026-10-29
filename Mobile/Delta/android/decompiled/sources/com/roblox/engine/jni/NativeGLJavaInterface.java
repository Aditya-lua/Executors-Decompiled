package com.roblox.engine.jni;

import com.roblox.engine.jni.model.DeviceStaticParams;
import com.roblox.engine.jni.model.NativeTextBoxInfo;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class NativeGLJavaInterface {
    private static OnAppBridgeNotificationListener sAppBridgeNotificationListener;
    private static WeakReference<OnAppShellReloadNeededListener> sAppShellReloadNeededListener;
    private static DeviceStaticParams sDeviceStaticParams;
    private static EngineExitJavaCallback2 sExitImplementation;
    private static IExtendedAnalyticsInterface sExtendedAnalyticsImplementation;
    private static EngineJavaCallback2 sImplementation = new EngineJavaCallback2();
    private static WeakReference<MobileAdvertisingIdGetter> sMobileAdvertisingIdGetter;
    private static WeakReference<WebViewUserAgentGetter> sWebViewUserAgentGetter;

    public interface IExtendedAnalyticsInterface {
        void a(byte[] bArr, int i10);
    }

    public interface MobileAdvertisingIdGetter {
        void T();
    }

    public interface OnAppShellReloadNeededListener {
        void n();
    }

    public interface WebViewUserAgentGetter {
        void n0();
    }

    public static void exitGameWithError(int i10) {
        sImplementation.a(i10);
    }

    public static void gameDidLeave() {
        EngineExitJavaCallback2 engineExitJavaCallback2 = sExitImplementation;
        if (engineExitJavaCallback2 != null) {
            engineExitJavaCallback2.a();
        }
    }

    public static void gameLoadedCallback(long j10) {
        sImplementation.b(j10);
    }

    public static DeviceStaticParams getDeviceStaticParams() {
        return sDeviceStaticParams;
    }

    public static EngineJavaCallback2 getImplementation() {
        return sImplementation;
    }

    public static void getMobileAdvertisingId() {
        MobileAdvertisingIdGetter mobileAdvertisingIdGetter = sMobileAdvertisingIdGetter.get();
        if (mobileAdvertisingIdGetter == null) {
            return;
        }
        mobileAdvertisingIdGetter.T();
    }

    public static void getWebViewUserAgent() {
        WebViewUserAgentGetter webViewUserAgentGetter = sWebViewUserAgentGetter.get();
        if (webViewUserAgentGetter == null) {
            return;
        }
        webViewUserAgentGetter.n0();
    }

    public static void hideKeyboard() {
        sImplementation.d();
    }

    public static void listenToMotionEvents(String str) {
        sImplementation.e(str);
    }

    public static void onAppBridgeNotification(String str, String str2) {
        OnAppBridgeNotificationListener onAppBridgeNotificationListener = sAppBridgeNotificationListener;
        if (onAppBridgeNotificationListener != null) {
            onAppBridgeNotificationListener.a(str, str2);
        }
    }

    public static void onAppShellReloadNeeded() {
        OnAppShellReloadNeededListener onAppShellReloadNeededListener = sAppShellReloadNeededListener.get();
        if (onAppShellReloadNeededListener != null) {
            onAppShellReloadNeededListener.n();
        }
    }

    public static void onDataModelNotificationCallback(String str, String str2) {
        sImplementation.f(str, str2);
    }

    public static void onExtendedAnalyticsRecvCallback(byte[] bArr, int i10) {
        IExtendedAnalyticsInterface iExtendedAnalyticsInterface = sExtendedAnalyticsImplementation;
        if (iExtendedAnalyticsInterface != null) {
            iExtendedAnalyticsInterface.a(bArr, i10);
        }
    }

    public static void onLuaTextBoxChangedCallback(String str) {
        sImplementation.g(str);
    }

    public static void onLuaTextBoxPropertyChangedCallback() {
        sImplementation.h();
    }

    public static void onVrSessionStateUpdate(int i10) {
        sImplementation.c(i10);
    }

    public static void openNativeOverlay(String str, String str2) {
        sImplementation.i(str, str2);
    }

    public static void promptNativePurchase(long j10, String str, String str2) {
        sImplementation.k(j10, str, str2);
    }

    public static void promptNativePurchaseWithPayload(long j10, String str, String str2) {
        sImplementation.l(j10, str, str2);
    }

    public static void promptNativePurchaseWithPaymentSessionId(long j10, String str, String str2, String str3) {
        sImplementation.n(j10, str, str2, str3);
    }

    public static void replaceImplementation(Class<? extends EngineJavaCallback2> cls, EngineJavaCallback2 engineJavaCallback2) {
        if (sImplementation.getClass() == cls) {
            setImplementation(engineJavaCallback2);
        }
    }

    public static void saveImageToAlbum(String str) {
        sImplementation.o(str);
    }

    public static void screenOrientationChanged(int i10) {
        sImplementation.p(i10);
    }

    public static void setAppBridgeNotificationListener(OnAppBridgeNotificationListener onAppBridgeNotificationListener) {
        sAppBridgeNotificationListener = onAppBridgeNotificationListener;
    }

    public static void setAppShellReloadNeededListener(OnAppShellReloadNeededListener onAppShellReloadNeededListener) {
        sAppShellReloadNeededListener = new WeakReference<>(onAppShellReloadNeededListener);
    }

    public static void setDeviceStaticParams(DeviceStaticParams deviceStaticParams) {
        sDeviceStaticParams = deviceStaticParams;
    }

    public static void setExitImplementation(EngineExitJavaCallback2 engineExitJavaCallback2) {
        sExitImplementation = engineExitJavaCallback2;
    }

    public static void setExtendedAnalyticsImplementation(IExtendedAnalyticsInterface iExtendedAnalyticsInterface) {
        sExtendedAnalyticsImplementation = iExtendedAnalyticsInterface;
    }

    public static void setImplementation(EngineJavaCallback2 engineJavaCallback2) {
        if (engineJavaCallback2 != null) {
            sImplementation = engineJavaCallback2;
        }
    }

    public static void setMobileAdvertisingIdGetter(MobileAdvertisingIdGetter mobileAdvertisingIdGetter) {
        sMobileAdvertisingIdGetter = new WeakReference<>(mobileAdvertisingIdGetter);
    }

    public static void setWebviewUserAgentGetter(WebViewUserAgentGetter webViewUserAgentGetter) {
        sWebViewUserAgentGetter = new WeakReference<>(webViewUserAgentGetter);
    }

    public static void showKeyboard(long j10, boolean z10, byte[] bArr, NativeTextBoxInfo nativeTextBoxInfo) {
        sImplementation.q(j10, z10, bArr, nativeTextBoxInfo);
    }

    public static void promptNativePurchase(long j10, String str) {
        sImplementation.j(j10, str);
    }

    public static void promptNativePurchaseWithPaymentSessionId(long j10, String str, String str2) {
        sImplementation.m(j10, str, str2);
    }
}
