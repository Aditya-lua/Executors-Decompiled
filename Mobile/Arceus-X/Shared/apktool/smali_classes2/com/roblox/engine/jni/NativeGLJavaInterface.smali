.class public Lcom/roblox/engine/jni/NativeGLJavaInterface;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/engine/jni/NativeGLJavaInterface$IExtendedAnalyticsInterface;,
        Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;,
        Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;,
        Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;
    }
.end annotation


# static fields
.field private static sAppBridgeNotificationListener:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

.field private static sAppShellReloadNeededListener:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;",
            ">;"
        }
    .end annotation
.end field

.field private static sDeviceStaticParams:Lcom/roblox/engine/jni/model/DeviceStaticParams;

.field private static sExitImplementation:Lcom/roblox/engine/jni/EngineExitJavaCallback2;

.field private static sExtendedAnalyticsImplementation:Lcom/roblox/engine/jni/NativeGLJavaInterface$IExtendedAnalyticsInterface;

.field private static sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

.field private static sMobileAdvertisingIdGetter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;",
            ">;"
        }
    .end annotation
.end field

.field private static sWebViewUserAgentGetter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-direct {v0}, Lcom/roblox/engine/jni/EngineJavaCallback2;-><init>()V

    sput-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static exitGameWithError(I)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->a(I)V

    return-void
.end method

.method public static gameDidLeave()V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sExitImplementation:Lcom/roblox/engine/jni/EngineExitJavaCallback2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/roblox/engine/jni/EngineExitJavaCallback2;->a()V

    :cond_0
    return-void
.end method

.method public static gameLoadedCallback(J)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallback2;->b(J)V

    return-void
.end method

.method public static getDeviceStaticParams()Lcom/roblox/engine/jni/model/DeviceStaticParams;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sDeviceStaticParams:Lcom/roblox/engine/jni/model/DeviceStaticParams;

    return-object v0
.end method

.method public static getImplementation()Lcom/roblox/engine/jni/EngineJavaCallback2;
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    return-object v0
.end method

.method public static getMobileAdvertisingId()V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sMobileAdvertisingIdGetter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;->T()V

    return-void
.end method

.method public static getWebViewUserAgent()V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sWebViewUserAgentGetter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-interface {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;->n0()V

    return-void
.end method

.method public static hideKeyboard()V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->d()V

    return-void
.end method

.method public static listenToMotionEvents(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->e(Ljava/lang/String;)V

    return-void
.end method

.method public static onAppBridgeNotification(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sAppBridgeNotificationListener:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0, p1}, Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static onAppShellReloadNeeded()V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sAppShellReloadNeededListener:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;->n()V

    :cond_0
    return-void
.end method

.method public static onDataModelNotificationCallback(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallback2;->f(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static onExtendedAnalyticsRecvCallback([BI)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sExtendedAnalyticsImplementation:Lcom/roblox/engine/jni/NativeGLJavaInterface$IExtendedAnalyticsInterface;

    if-eqz v0, :cond_0

    invoke-interface {v0, p0, p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface$IExtendedAnalyticsInterface;->a([BI)V

    :cond_0
    return-void
.end method

.method public static onLuaTextBoxChangedCallback(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->g(Ljava/lang/String;)V

    return-void
.end method

.method public static onLuaTextBoxPropertyChangedCallback()V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->h()V

    return-void
.end method

.method public static onVrSessionStateUpdate(I)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->c(I)V

    return-void
.end method

.method public static openNativeOverlay(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1}, Lcom/roblox/engine/jni/EngineJavaCallback2;->i(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static promptNativePurchase(JLjava/lang/String;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1, p2}, Lcom/roblox/engine/jni/EngineJavaCallback2;->j(JLjava/lang/String;)V

    return-void
.end method

.method public static promptNativePurchase(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/roblox/engine/jni/EngineJavaCallback2;->k(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static promptNativePurchaseWithPayload(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/roblox/engine/jni/EngineJavaCallback2;->l(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static promptNativePurchaseWithPaymentSessionId(JLjava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/roblox/engine/jni/EngineJavaCallback2;->m(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static promptNativePurchaseWithPaymentSessionId(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 6

    .line 1
    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/engine/jni/EngineJavaCallback2;->n(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static replaceImplementation(Ljava/lang/Class;Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/roblox/engine/jni/EngineJavaCallback2;",
            ">;",
            "Lcom/roblox/engine/jni/EngineJavaCallback2;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    if-ne v0, p0, :cond_0

    invoke-static {p1}, Lcom/roblox/engine/jni/NativeGLJavaInterface;->setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V

    :cond_0
    return-void
.end method

.method public static saveImageToAlbum(Ljava/lang/String;)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->o(Ljava/lang/String;)V

    return-void
.end method

.method public static screenOrientationChanged(I)V
    .locals 1

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    invoke-virtual {v0, p0}, Lcom/roblox/engine/jni/EngineJavaCallback2;->p(I)V

    return-void
.end method

.method public static setAppBridgeNotificationListener(Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sAppBridgeNotificationListener:Lcom/roblox/engine/jni/OnAppBridgeNotificationListener;

    return-void
.end method

.method public static setAppShellReloadNeededListener(Lcom/roblox/engine/jni/NativeGLJavaInterface$OnAppShellReloadNeededListener;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sAppShellReloadNeededListener:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static setDeviceStaticParams(Lcom/roblox/engine/jni/model/DeviceStaticParams;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sDeviceStaticParams:Lcom/roblox/engine/jni/model/DeviceStaticParams;

    return-void
.end method

.method public static setExitImplementation(Lcom/roblox/engine/jni/EngineExitJavaCallback2;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sExitImplementation:Lcom/roblox/engine/jni/EngineExitJavaCallback2;

    return-void
.end method

.method public static setExtendedAnalyticsImplementation(Lcom/roblox/engine/jni/NativeGLJavaInterface$IExtendedAnalyticsInterface;)V
    .locals 0

    sput-object p0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sExtendedAnalyticsImplementation:Lcom/roblox/engine/jni/NativeGLJavaInterface$IExtendedAnalyticsInterface;

    return-void
.end method

.method public static setImplementation(Lcom/roblox/engine/jni/EngineJavaCallback2;)V
    .locals 0

    if-eqz p0, :cond_0

    sput-object p0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    :cond_0
    return-void
.end method

.method public static setMobileAdvertisingIdGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$MobileAdvertisingIdGetter;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sMobileAdvertisingIdGetter:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static setWebviewUserAgentGetter(Lcom/roblox/engine/jni/NativeGLJavaInterface$WebViewUserAgentGetter;)V
    .locals 1

    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sWebViewUserAgentGetter:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public static showKeyboard(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V
    .locals 6

    sget-object v0, Lcom/roblox/engine/jni/NativeGLJavaInterface;->sImplementation:Lcom/roblox/engine/jni/EngineJavaCallback2;

    move-wide v1, p0

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/engine/jni/EngineJavaCallback2;->q(JZ[BLcom/roblox/engine/jni/model/NativeTextBoxInfo;)V

    return-void
.end method
