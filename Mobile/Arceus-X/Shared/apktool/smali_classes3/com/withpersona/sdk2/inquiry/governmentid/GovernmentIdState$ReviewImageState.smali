.class public abstract Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;
.super Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "ReviewImageState"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00088 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\u000c8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u0082\u0001\u0002\u0018\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "<init>",
        "()V",
        "",
        "newValue",
        "L",
        "(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;",
        "J",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;",
        "currentPart",
        "Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;",
        "I",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;",
        "captureConfig",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;",
        "K",
        "()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;",
        "idForReview",
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "a",
        "()Lcom/withpersona/sdk2/camera/CameraProperties;",
        "cameraProperties",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;",
        "government-id_release"
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
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract L(Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract a()Lcom/withpersona/sdk2/camera/CameraProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method
