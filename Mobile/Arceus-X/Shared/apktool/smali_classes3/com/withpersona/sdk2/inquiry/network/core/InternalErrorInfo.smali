.class public abstract Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$CameraErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$ConfigurationErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$IntegrationErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$InvalidOneTimeLinkCode;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NoDiskSpaceErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$PermissionErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$UnknownErrorInfo;,
        Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$WebRtcIntegrationErrorInfo;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final fallbackAdapter:Lum/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lum/h<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;->Companion:Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion;

    new-instance v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion$fallbackAdapter$1;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$Companion$fallbackAdapter$1;-><init>()V

    invoke-virtual {v0}, Lum/h;->nullSafe()Lum/h;

    move-result-object v0

    sput-object v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;->fallbackAdapter:Lum/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;-><init>()V

    return-void
.end method

.method public static final synthetic access$getFallbackAdapter$cp()Lum/h;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;->fallbackAdapter:Lum/h;

    return-object v0
.end method
