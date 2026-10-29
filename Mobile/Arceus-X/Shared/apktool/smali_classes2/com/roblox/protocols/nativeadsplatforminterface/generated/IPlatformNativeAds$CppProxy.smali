.class public final Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;
.super Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;
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

    invoke-direct {p0}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->destroyed:Ljava/util/concurrent/atomic/AtomicBoolean;

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

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

.method private native native_cleanupAd(J)V
.end method

.method private native native_destroyInterstitialAd(JLjava/lang/String;)V
.end method

.method private native native_getQueryInfo(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_initialize(JILjava/lang/String;)V
.end method

.method private native native_initializeSdk(JLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_install(JZ)V
.end method

.method private native native_loadInterstitialAd(JLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_onServeInterstitialAdFailed(JLjava/lang/String;)V
.end method

.method private native native_onServeInterstitialAdResponse(JLjava/lang/String;Ljava/lang/String;)V
.end method

.method private native native_setAdString(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
.end method

.method private native native_showAd(JILjava/lang/String;)V
.end method


# virtual methods
.method public cleanupAd()V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_cleanupAd(J)V

    return-void
.end method

.method public destroyInterstitialAd(Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_destroyInterstitialAd(JLjava/lang/String;)V

    return-void
.end method

.method public getQueryInfo(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    move-object v0, p0

    move v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v0 .. v6}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_getQueryInfo(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public initialize(ILjava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_initialize(JILjava/lang/String;)V

    return-void
.end method

.method public initializeSdk(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_initializeSdk(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public install(Z)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_install(JZ)V

    return-void
.end method

.method public loadInterstitialAd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_loadInterstitialAd(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public onServeInterstitialAdFailed(Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_onServeInterstitialAdFailed(JLjava/lang/String;)V

    return-void
.end method

.method public onServeInterstitialAdResponse(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_onServeInterstitialAdResponse(JLjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public setAdString(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 15

    iget-wide v1, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    move-object v0, p0

    move/from16 v3, p1

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-wide/from16 v8, p6

    move/from16 v10, p8

    move-object/from16 v11, p9

    move-object/from16 v12, p10

    move-object/from16 v13, p11

    move/from16 v14, p12

    invoke-direct/range {v0 .. v14}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_setAdString(JILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public showAd(ILjava/lang/String;)V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->nativeRef:J

    invoke-direct {p0, v0, v1, p1, p2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds$CppProxy;->native_showAd(JILjava/lang/String;)V

    return-void
.end method
