.class public abstract Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener$CppProxy;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static native setPlatformImpl(Lcom/roblox/protocols/connectivityv2platforminterface/generated/IPlatformConnectivityV2;)Lcom/roblox/protocols/connectivityv2platforminterface/generated/IConnectivityV2CoreListener;
.end method


# virtual methods
.method public reportNetworkChanged(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReport;)V
    .locals 0

    return-void
.end method

.method public reportNetworkChangedV2(Lcom/roblox/protocols/connectivityv2platforminterface/generated/NetworkChangeReportV2;)V
    .locals 0

    return-void
.end method
