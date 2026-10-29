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
        /* JADX INFO: renamed from: a */
        void m15790a(byte[] bArr, int i10);
    }

    public interface MobileAdvertisingIdGetter {
        /* JADX INFO: renamed from: T */
        void mo1338T();
    }

    public interface OnAppShellReloadNeededListener {
        /* JADX INFO: renamed from: n */
        void mo14786n();
    }

    public interface WebViewUserAgentGetter {
        /* JADX INFO: renamed from: n0 */
        void mo1337n0();
    }

    public static void exitGameWithError(int i10) {
        sImplementation.mo15217a(i10);
    }

    public static void gameDidLeave() {
        EngineExitJavaCallback2 engineExitJavaCallback2 = sExitImplementation;
        if (engineExitJavaCallback2 != null) {
            engineExitJavaCallback2.mo15214a();
        }
    }

    public static void gameLoadedCallback(long j10) {
        sImplementation.mo15218b(j10);
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
        mobileAdvertisingIdGetter.mo1338T();
    }

    public static void getWebViewUserAgent() {
        WebViewUserAgentGetter webViewUserAgentGetter = sWebViewUserAgentGetter.get();
        if (webViewUserAgentGetter == null) {
            return;
        }
        webViewUserAgentGetter.mo1337n0();
    }

    public static void hideKeyboard() {
        sImplementation.mo15783d();
    }

    public static void listenToMotionEvents(String str) {
        sImplementation.mo15219e(str);
    }

    public static void onAppBridgeNotification(String str, String str2) {
        OnAppBridgeNotificationListener onAppBridgeNotificationListener = sAppBridgeNotificationListener;
        if (onAppBridgeNotificationListener != null) {
            onAppBridgeNotificationListener.mo1303a(str, str2);
        }
    }

    public static void onAppShellReloadNeeded() {
        OnAppShellReloadNeededListener onAppShellReloadNeededListener = sAppShellReloadNeededListener.get();
        if (onAppShellReloadNeededListener != null) {
            onAppShellReloadNeededListener.mo14786n();
        }
    }

    public static void onDataModelNotificationCallback(String str, String str2) {
        sImplementation.mo15220f(str, str2);
    }

    public static void onExtendedAnalyticsRecvCallback(byte[] bArr, int i10) {
        IExtendedAnalyticsInterface iExtendedAnalyticsInterface = sExtendedAnalyticsImplementation;
        if (iExtendedAnalyticsInterface != null) {
            iExtendedAnalyticsInterface.m15790a(bArr, i10);
        }
    }

    public static void onLuaTextBoxChangedCallback(String str) {
        sImplementation.mo15784g(str);
    }

    public static void onLuaTextBoxPropertyChangedCallback() {
        sImplementation.mo15785h();
    }

    public static void onVrSessionStateUpdate(int i10) {
        sImplementation.mo15782c(i10);
    }

    public static void openNativeOverlay(String str, String str2) {
        sImplementation.mo15786i(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void promptNativePurchase(long j10, String str, String str2) {
        sImplementation.mo15222k(j10, str, str2);
    }

    public static void promptNativePurchaseWithPayload(long j10, String str, String str2) {
        sImplementation.mo15223l(j10, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void promptNativePurchaseWithPaymentSessionId(long j10, String str, String str2, String str3) {
        sImplementation.mo15225n(j10, str, str2, str3);
    }

    public static void replaceImplementation(Class<? extends EngineJavaCallback2> cls, EngineJavaCallback2 engineJavaCallback2) {
        if (sImplementation.getClass() == cls) {
            setImplementation(engineJavaCallback2);
        }
    }

    public static void saveImageToAlbum(String str) {
        sImplementation.mo15787o(str);
    }

    public static void screenOrientationChanged(int i10) {
        sImplementation.mo15226p(i10);
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
        sImplementation.mo15788q(j10, z10, bArr, nativeTextBoxInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void promptNativePurchase(long j10, String str) {
        sImplementation.mo15221j(j10, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static void promptNativePurchaseWithPaymentSessionId(long j10, String str, String str2) {
        sImplementation.mo15224m(j10, str, str2);
    }
}
