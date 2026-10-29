.class public final Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;",
        "",
        "<init>",
        "()V",
        "Lum/h$e;",
        "createAdapter",
        "()Lum/h$e;",
        "tracking-events_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;-><init>()V

    sput-object v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;->$$INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Companion;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final createAdapter()Lum/h$e;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-class v0, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent;

    const-string v1, "type"

    invoke-static {v0, v1}, Lvm/b;->b(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Unknown;->INSTANCE:Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$Unknown;

    invoke-virtual {v0, v1}, Lvm/b;->c(Ljava/lang/Object;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$PageViewTrackingEvent;

    const-string v2, "inquiry.page.view"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryForegroundEvent;

    const-string v2, "inquiry.ui.foreground"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryBackgroundEvent;

    const-string v2, "inquiry.ui.background"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStartEvent;

    const-string v2, "inquiry.video.start"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopRequestEvent;

    const-string v2, "inquiry.video.stop_request"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoStopEvent;

    const-string v2, "inquiry.video.stop"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoIceCompleteEvent;

    const-string v2, "inquiry.video.ice_complete"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryVideoErrorEvent;

    const-string v2, "inquiry.video.error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryPermissionEvent;

    const-string v2, "inquiry.permissions"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieClickEvent;

    const-string v2, "inquiry.selfie_capture.button"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfieCaptureStateEvent;

    const-string v2, "inquiry.selfie_capture.state"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseEvent;

    const-string v2, "inquiry.selfie.pose.capture"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquirySelfiePoseDetectEvent;

    const-string v2, "inquiry.selfie.pose.detect"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdButtonEvent;

    const-string v2, "inquiry.gov_id_capture.button"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryGovernmentIdStateEvent;

    const-string v2, "inquiry.gov_id_capture.state"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryStartEvent;

    const-string v2, "inquiry.start"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryEndEvent;

    const-string v2, "inquiry.end"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryIntegrationEvent;

    const-string v2, "inquiry.integration"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryUiStepButtonEvent;

    const-string v2, "inquiry.ui_step.button"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryCameraInfoEvent;

    const-string v2, "inquiry.camera.info"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryDebugLogEvent;

    const-string v2, "inquiry.debug_log"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcScanEvent;

    const-string v2, "inquiry.nfc.scan"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    const-class v1, Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingEvent$InquiryNfcErrorEvent;

    const-string v2, "inquiry.nfc.error"

    invoke-virtual {v0, v1, v2}, Lvm/b;->e(Ljava/lang/Class;Ljava/lang/String;)Lvm/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object v0
.end method
