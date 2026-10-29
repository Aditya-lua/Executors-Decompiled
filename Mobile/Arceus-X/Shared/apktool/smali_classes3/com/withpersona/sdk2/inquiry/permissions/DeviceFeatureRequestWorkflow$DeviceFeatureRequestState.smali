.class public abstract Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "DeviceFeatureRequestState"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;,
        Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;,
        Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;,
        Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0004\u0008\t\n\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;",
        "Landroid/os/Parcelable;",
        "<init>",
        "()V",
        "CheckDeviceFeatureState",
        "ShowDeviceFeaturePrompt",
        "RequestDeviceFeature",
        "Complete",
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;",
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;",
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;",
        "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;",
        "permissions_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;-><init>()V

    return-void
.end method
