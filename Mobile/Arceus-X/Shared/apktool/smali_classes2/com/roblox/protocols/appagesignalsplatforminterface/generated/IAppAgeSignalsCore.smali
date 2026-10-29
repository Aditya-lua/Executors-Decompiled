.class public abstract Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IPlatformAppAgeSignals;)Lcom/roblox/protocols/appagesignalsplatforminterface/generated/IAppAgeSignalsCore;
.end method


# virtual methods
.method public onGetAgeSignalFailed(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformError;)V
    .locals 0

    return-void
.end method

.method public onGetAgeSignalSucceeded(Lcom/roblox/protocols/appagesignalsplatforminterface/generated/AppAgeSignalsPlatformSuccess;)V
    .locals 0

    return-void
.end method
