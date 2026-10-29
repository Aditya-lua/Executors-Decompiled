.class public final Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lft/d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory$InstanceHolder;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lft/d<",
        "Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static create()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory$InstanceHolder;->INSTANCE:Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;

    return-object v0
.end method

.method public static newInstance()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;-><init>()V

    return-object v0
.end method


# virtual methods
.method public get()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;
    .locals 1

    .line 2
    invoke-static {}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;->newInstance()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic get()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager_Factory;->get()Lcom/withpersona/sdk2/inquiry/network/core/NetworkStateManager;

    move-result-object v0

    return-object v0
.end method
