.class public interface abstract Lcom/withpersona/sdk2/inquiry/selfie/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR\u0014\u0010\r\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\tR\u0014\u0010\u0013\u001a\u00020\u00108&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001aR\u0014\u0010!\u001a\u00020\u001e8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010$\u0082\u0001\u0006&\'()*+\u00a8\u0006,\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/a;",
        "",
        "",
        "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
        "g",
        "()Ljava/util/List;",
        "posesNeeded",
        "Lkn/a;",
        "j",
        "()Lkn/a;",
        "currentPose",
        "p",
        "()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
        "currentPoseInfo",
        "m",
        "currentPoseOrNull",
        "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;",
        "i",
        "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;",
        "poseConfigs",
        "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;",
        "k",
        "()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;",
        "currentPoseConfig",
        "",
        "f",
        "()Z",
        "autoCaptureSupported",
        "s",
        "isFlashEnabled",
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "a",
        "()Lcom/withpersona/sdk2/camera/CameraProperties;",
        "cameraProperties",
        "",
        "t",
        "()J",
        "startSelfieTimestamp",
        "Lcom/withpersona/sdk2/inquiry/selfie/b;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;",
        "selfie_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a()Lcom/withpersona/sdk2/camera/CameraProperties;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract f()Z
.end method

.method public abstract g()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract i()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public j()Lkn/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    return-object v0
.end method

.method public k()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->m()Lkn/a;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;->e:Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig$a;->a()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->i()Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;->a(Lkn/a;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;

    move-result-object v0

    return-object v0
.end method

.method public m()Lkn/a;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;->f()Lkn/a;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public p()Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    invoke-interface {p0}, Lcom/withpersona/sdk2/inquiry/selfie/a;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/pose/PoseInfo;

    return-object v0
.end method

.method public abstract s()Z
.end method

.method public abstract t()J
.end method
