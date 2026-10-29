.class public abstract Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
.super Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$a;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;,
        Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0012\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f \u0005!\"#$%&\'(B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c8 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00008 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148 X\u00a0\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016\u0082\u0001\u0011)*+,-./0123456789\u00a8\u0006:"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;",
        "<init>",
        "()V",
        "",
        "a",
        "Z",
        "getDidGoBack$selfie_release",
        "()Z",
        "x",
        "(Z)V",
        "didGoBack",
        "",
        "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
        "w",
        "()Ljava/util/List;",
        "selfies",
        "u",
        "()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "backState",
        "Lcom/withpersona/sdk2/camera/CameraProperties$b;",
        "v",
        "()Lcom/withpersona/sdk2/camera/CameraProperties$b;",
        "cameraFacingMode",
        "ShowInstructions",
        "WaitForCameraFeed",
        "RestartCamera",
        "WaitForWebRtcSetup",
        "ShowPoseHint",
        "StartCapture",
        "StartCaptureFaceDetected",
        "CountdownToCapture",
        "CountdownToManualCapture",
        "Capture",
        "AcquireNextPose",
        "CaptureTransition",
        "FinalizeLocalVideoCapture",
        "FinalizeWebRtc",
        "WebRtcFinished",
        "ReviewCaptures",
        "Submit",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$AcquireNextPose;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Capture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CaptureTransition;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToCapture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$CountdownToManualCapture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeWebRtc;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$RestartCamera;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ReviewCaptures;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowInstructions;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$ShowPoseHint;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCapture;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$StartCaptureFaceDetected;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$Submit;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForCameraFeed;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WaitForWebRtcSetup;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$WebRtcFinished;",
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


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/workflows/SimpleWorkflowState;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract u()Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end method

.method public abstract v()Lcom/withpersona/sdk2/camera/CameraProperties$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public abstract w()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/withpersona/sdk2/inquiry/selfie/Selfie;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final x(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->a:Z

    return-void
.end method
