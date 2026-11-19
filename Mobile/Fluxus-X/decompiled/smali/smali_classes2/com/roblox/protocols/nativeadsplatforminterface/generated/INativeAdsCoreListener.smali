.class public abstract Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/nativeadsplatforminterface/generated/IPlatformNativeAds;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;
.end method


# virtual methods
.method public onAdProgress(FFFFLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onCtaClick(Ljava/lang/String;Z)V
    .locals 0

    return-void
.end method

.method public onGetQueryInfoCompleted(ILjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onInitializeCompleted(IZLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onInitializeSdkFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/InitializeSdkFailureReason;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onInitializeSdkSuccess(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onLoadInterstitialAdFailed(Ljava/lang/String;Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onLoadInterstitialAdSuccess(Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onReportAd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onServeInterstitialAd(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onSetAdStringCompleted(IZLjava/lang/String;)V
    .locals 0

    return-void
.end method

.method public onShowAdCompleted(ILjava/lang/String;F)V
    .locals 0

    return-void
.end method
