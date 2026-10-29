.class public final Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;
.super Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/f;


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\t\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c7\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\n\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0004J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010$8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0014\u0010\'\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008)\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;",
        "Landroidx/lifecycle/f;",
        "Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;",
        "<init>",
        "()V",
        "Landroid/app/Activity;",
        "activity",
        "",
        "getSystemBrightness",
        "(Landroid/app/Activity;)F",
        "getBrightnessInternal",
        "Landroidx/lifecycle/s;",
        "owner",
        "",
        "onCreate",
        "(Landroidx/lifecycle/s;)V",
        "onDestroy",
        "brightnessLevel",
        "setBrightness",
        "(F)V",
        "getBrightness",
        "()F",
        "setBrightnessToDefault",
        "",
        "isAvailable",
        "()Z",
        "Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;",
        "capability",
        "hasCapability",
        "(Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;)Z",
        "enable",
        "setKeepAwake",
        "(Z)V",
        "",
        "TAG",
        "Ljava/lang/String;",
        "Ljava/lang/ref/WeakReference;",
        "activityWeakRef",
        "Ljava/lang/ref/WeakReference;",
        "MAX_SCREEN_BRIGHTNESS",
        "F",
        "BRIGHTNESS_UNAVAILABLE",
        "universalapp_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final BRIGHTNESS_UNAVAILABLE:F = -1.0f

.field public static final INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final MAX_SCREEN_BRIGHTNESS:F = 255.0f

.field private static final TAG:Ljava/lang/String; = "DeviceDisplayHandler"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static activityWeakRef:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Landroid/app/Activity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-direct {v0}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;-><init>()V

    sput-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-static {v0}, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IDeviceDisplayHandlerCore;->setPlatformImpl(Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;)Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IDeviceDisplayHandlerCore;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/roblox/protocols/devicedisplayplatforminterface/generated/IPlatformDeviceDisplayHandler;-><init>()V

    return-void
.end method

.method public static synthetic a(Landroid/app/Activity;F)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->setBrightness$lambda$0(Landroid/app/Activity;F)V

    return-void
.end method

.method public static synthetic b(ZLandroid/app/Activity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->setKeepAwake$lambda$0(ZLandroid/app/Activity;)V

    return-void
.end method

.method public static synthetic c(Landroid/app/Activity;)V
    .locals 0

    invoke-static {p0}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->setBrightnessToDefault$lambda$0(Landroid/app/Activity;)V

    return-void
.end method

.method public static synthetic d(Lkotlin/jvm/internal/z;Landroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->getBrightness$lambda$0(Lkotlin/jvm/internal/z;Landroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V

    return-void
.end method

.method private static final getBrightness$lambda$0(Lkotlin/jvm/internal/z;Landroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->INSTANCE:Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;

    invoke-direct {v0, p1}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->getBrightnessInternal(Landroid/app/Activity;)F

    move-result p1

    iput p1, p0, Lkotlin/jvm/internal/z;->a:F

    invoke-virtual {p2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    return-void
.end method

.method private final getBrightnessInternal(Landroid/app/Activity;)F
    .locals 2

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    const/4 v1, 0x0

    cmpg-float v1, v0, v1

    if-gez v1, :cond_0

    invoke-direct {p0, p1}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->getSystemBrightness(Landroid/app/Activity;)F

    move-result p1

    return p1

    :cond_0
    return v0
.end method

.method private final getSystemBrightness(Landroid/app/Activity;)F
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    :try_start_0
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness_float"

    invoke-static {v0, v1}, Landroid/provider/Settings$System;->getFloat(Landroid/content/ContentResolver;Ljava/lang/String;)F

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return p1

    :catchall_0
    move-exception v0

    sget-object v1, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    :try_start_1
    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p1

    const-string v0, "screen_brightness"

    invoke-static {p1, v0}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;)I

    move-result p1

    int-to-float p1, p1

    const/high16 v0, 0x437f0000    # 255.0f

    div-float/2addr p1, v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    sget-object v0, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    const/high16 v0, -0x40800000    # -1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-static {p1}, Ljt/n;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    move-object p1, v0

    :cond_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    return p1
.end method

.method private static final setBrightness$lambda$0(Landroid/app/Activity;F)V
    .locals 1

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method private static final setBrightnessToDefault$lambda$0(Landroid/app/Activity;)V
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    const/high16 v1, -0x40800000    # -1.0f

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->screenBrightness:F

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V

    return-void
.end method

.method private static final setKeepAwake$lambda$0(ZLandroid/app/Activity;)V
    .locals 1

    const/16 v0, 0x80

    if-eqz p0, :cond_0

    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->addFlags(I)V

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/Window;->clearFlags(I)V

    return-void
.end method


# virtual methods
.method public getBrightness()F
    .locals 4

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    const/high16 v1, -0x40800000    # -1.0f

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-direct {p0, v0}, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->getBrightnessInternal(Landroid/app/Activity;)F

    move-result v0

    return v0

    :cond_1
    new-instance v2, Lkotlin/jvm/internal/z;

    invoke-direct {v2}, Lkotlin/jvm/internal/z;-><init>()V

    iput v1, v2, Lkotlin/jvm/internal/z;->a:F

    new-instance v1, Ljava/util/concurrent/CountDownLatch;

    const/4 v3, 0x1

    invoke-direct {v1, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    new-instance v3, Ljl/a;

    invoke-direct {v3, v2, v0, v1}, Ljl/a;-><init>(Lkotlin/jvm/internal/z;Landroid/app/Activity;Ljava/util/concurrent/CountDownLatch;)V

    invoke-virtual {v0, v3}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V

    iget v0, v2, Lkotlin/jvm/internal/z;->a:F

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public hasCapability(Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;)Z
    .locals 2
    .param p1    # Lcom/roblox/protocols/devicedisplayplatforminterface/generated/DeviceDisplayCapability;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_0

    const/4 v1, 0x2

    if-eq p1, v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    return v0
.end method

.method public isAvailable()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public onCreate(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/ref/WeakReference;

    check-cast p1, Landroid/app/Activity;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public onDestroy(Landroidx/lifecycle/s;)V
    .locals 1
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/ref/Reference;->clear()V

    :cond_0
    const/4 p1, 0x0

    sput-object p1, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    return-void
.end method

.method public bridge onPause(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onPause(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onResume(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onResume(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStart(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStart(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public bridge onStop(Landroidx/lifecycle/s;)V
    .locals 0
    .param p1    # Landroidx/lifecycle/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    invoke-super {p0, p1}, Landroidx/lifecycle/f;->onStop(Landroidx/lifecycle/s;)V

    return-void
.end method

.method public setBrightness(F)V
    .locals 3

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {p1, v1, v2}, Lkotlin/ranges/d;->i(FFF)F

    move-result p1

    new-instance v1, Ljl/c;

    invoke-direct {v1, v0, p1}, Ljl/c;-><init>(Landroid/app/Activity;F)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setBrightnessToDefault()V
    .locals 2

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljl/d;

    invoke-direct {v1, v0}, Ljl/d;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public setKeepAwake(Z)V
    .locals 2

    sget-object v0, Lcom/roblox/protocols/devicedisplay/DeviceDisplayHandler;->activityWeakRef:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljl/b;

    invoke-direct {v1, p1, v0}, Ljl/b;-><init>(ZLandroid/app/Activity;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :cond_1
    :goto_0
    return-void
.end method
