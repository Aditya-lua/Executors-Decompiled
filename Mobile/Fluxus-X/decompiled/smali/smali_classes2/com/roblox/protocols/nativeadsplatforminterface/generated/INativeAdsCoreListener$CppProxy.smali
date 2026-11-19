.class public final Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;
.super Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CppProxy"
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private final destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final nativeRef:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method private constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-static {p0, p1, p2}, Lcom/snapchat/djinni/NativeObjectManager;->register(Ljava/lang/Object;J)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/RuntimeException;

    const-string p2, "nativeRef is zero"

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static native nativeDestroy(J)V
.end method

.method private native native_onAdProgress(JFFFFLjava/lang/String;)V
.end method

.method private native native_onCtaClick(JLjava/lang/String;Z)V
.end method

.method private native native_onGetQueryInfoCompleted(JILjava/lang/String;)V
.end method

.method private native native_onInitializeCompleted(JIZLjava/lang/String;)V
.end method

.method private native native_onInitializeSdkFailed(JLjava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V
.end method

.method private native native_onInitializeSdkSuccess(JLjava/lang/String;)V
.end method

.method private native native_onLoadInterstitialAdFailed(JLjava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;Ljava/lang/String;)V
.end method

.method private native native_onLoadInterstitialAdSuccess(JLjava/lang/String;)V
.end method

.method private native native_onReportAd(JLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_onServeInterstitialAd(JLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_onSetAdStringCompleted(JIZLjava/lang/String;)V
.end method

.method private native native_onShowAdCompleted(JILjava/lang/String;F)V
.end method


# virtual methods
.method public onAdProgress(FFFFLjava/lang/String;)V
    .locals 8

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    move-object v0, p0

    move v3, p1

    move v4, p2

    move v5, p3

    move v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onAdProgress(JFFFFLjava/lang/String;)V

    return-void
.end method

.method public onCtaClick(Ljava/lang/String;Z)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onCtaClick(JLjava/lang/String;Z)V

    return-void
.end method

.method public onGetQueryInfoCompleted(ILjava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onGetQueryInfoCompleted(JILjava/lang/String;)V

    return-void
.end method

.method public onInitializeCompleted(IZLjava/lang/String;)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onInitializeCompleted(JIZLjava/lang/String;)V

    return-void
.end method

.method public onInitializeSdkFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onInitializeSdkFailed(JLjava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V

    return-void
.end method

.method public onInitializeSdkSuccess(Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onInitializeSdkSuccess(JLjava/lang/String;)V

    return-void
.end method

.method public onLoadInterstitialAdFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;Ljava/lang/String;)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    move-object v0, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onLoadInterstitialAdFailed(JLjava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;Ljava/lang/String;)V

    return-void
.end method

.method public onLoadInterstitialAdSuccess(Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onLoadInterstitialAdSuccess(JLjava/lang/String;)V

    return-void
.end method

.method public onReportAd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onReportAd(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onServeInterstitialAd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onServeInterstitialAd(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onSetAdStringCompleted(IZLjava/lang/String;)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onSetAdStringCompleted(JIZLjava/lang/String;)V

    return-void
.end method

.method public onShowAdCompleted(ILjava/lang/String;F)V
    .locals 6

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->nativeRef:J

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    move v5, p3

    invoke-direct/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;->native_onShowAdCompleted(JILjava/lang/String;F)V

    return-void
.end method
