.class public final Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;
.super Lvr/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$c;,
        Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lvr/c<",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001fB\u0097\u0001\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0008\u0008\u0001\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0082@\u00a2\u0006\u0004\u0008,\u0010-J\u001f\u0010.\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008.\u0010/J\u000f\u00100\u001a\u00020+H\u0002\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020+H\u0002\u00a2\u0006\u0004\u00082\u00101J\u001b\u00104\u001a\u000203*\u00020\u00032\u0006\u0010)\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u00084\u00105J\u0015\u00107\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0002\u00a2\u0006\u0004\u00087\u00108J\u001d\u0010=\u001a\u00020+2\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;\u00a2\u0006\u0004\u0008=\u0010>J\r\u0010?\u001a\u00020+\u00a2\u0006\u0004\u0008?\u00101R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010a\u001a\u00020^8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`R \u0010e\u001a\u000c\u0012\u0006\u0008\u0001\u0012\u00020\u0003\u0018\u00010b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008c\u0010d\u00a8\u0006g"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;",
        "Lvr/c;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        "initialProps",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Landroid/content/Context;",
        "applicationContext",
        "Lk6/s;",
        "imageLoader",
        "Lpo/c$a;",
        "submitVerificationWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/governmentid/e;",
        "documentSelectWorker",
        "Lro/v0;",
        "localVideoCaptureRenderer",
        "Lro/j1;",
        "webRtcRenderer",
        "Lro/m0;",
        "captureRenderer",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        "autoClassifyWorkerFactory",
        "Lro/i;",
        "autoClassificationRenderer",
        "Lln/a;",
        "cameraStatsManager",
        "Luq/a;",
        "navigationStateManager",
        "Lpq/c;",
        "externalEventLogger",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "themeManager",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lk6/s;Lpo/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Lro/v0;Lro/j1;Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lro/i;Lln/a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lku/p0;)V",
        "renderProps",
        "renderState",
        "",
        "d0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)Ljava/lang/Object;",
        "g0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;",
        "c0",
        "()V",
        "Z",
        "",
        "V0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z",
        "props",
        "a0",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Ljava/io/File;",
        "file",
        "Lcom/withpersona/sdk2/camera/CameraProperties;",
        "cameraProperties",
        "f0",
        "(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V",
        "e0",
        "e",
        "Landroidx/lifecycle/l0;",
        "f",
        "Landroid/content/Context;",
        "g",
        "Lk6/s;",
        "h",
        "Lpo/c$a;",
        "i",
        "Lcom/withpersona/sdk2/inquiry/governmentid/e;",
        "j",
        "Lro/v0;",
        "k",
        "Lro/j1;",
        "l",
        "Lro/m0;",
        "m",
        "Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;",
        "n",
        "Lro/i;",
        "o",
        "Lln/a;",
        "p",
        "Luq/a;",
        "q",
        "Lpq/c;",
        "r",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "s",
        "Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;",
        "Luo/l;",
        "t",
        "Luo/l;",
        "videoCaptureHelper",
        "Lhu/c;",
        "u",
        "Lhu/c;",
        "previousStateClass",
        "c",
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


# instance fields
.field public final e:Landroidx/lifecycle/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lk6/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lpo/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/withpersona/sdk2/inquiry/governmentid/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lro/v0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lro/j1;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lro/m0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lro/i;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Lln/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lpq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t:Luo/l;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public u:Lhu/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lhu/c<",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Landroidx/lifecycle/l0;Landroid/content/Context;Lk6/s;Lpo/c$a;Lcom/withpersona/sdk2/inquiry/governmentid/e;Lro/v0;Lro/j1;Lro/m0;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lro/i;Lln/a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;Lku/p0;)V
    .locals 16
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lk6/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lpo/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/withpersona/sdk2/inquiry/governmentid/e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lro/v0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lro/j1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lro/m0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lro/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lln/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lpq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p17    # Lku/p0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "initialProps"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savedStateHandle"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageLoader"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submitVerificationWorkerFactory"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentSelectWorker"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "localVideoCaptureRenderer"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "webRtcRenderer"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "captureRenderer"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoClassifyWorkerFactory"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "autoClassificationRenderer"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraStatsManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalEventLogger"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "themeManager"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    move-object/from16 v15, p17

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v1, v2, v15}, Lvr/c;-><init>(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->e:Landroidx/lifecycle/l0;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->g:Lk6/s;

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->h:Lpo/c$a;

    iput-object v6, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->i:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->j:Lro/v0;

    iput-object v8, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->k:Lro/j1;

    iput-object v9, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->l:Lro/m0;

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->m:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    iput-object v11, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->n:Lro/i;

    iput-object v12, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->o:Lln/a;

    iput-object v13, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    iput-object v14, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->q:Lpq/c;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->s:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    new-instance v1, Luo/l;

    const/4 v2, 0x1

    const/4 v3, 0x0

    invoke-direct {v1, v3, v2, v3}, Luo/l;-><init>(Lur/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lvr/c;->b()Lnu/c0;

    move-result-object v1

    invoke-interface {v1}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->a0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_0
    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    new-instance v2, Lqo/q;

    invoke-direct {v2, v15, v0}, Lqo/q;-><init>(Lku/p0;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    invoke-virtual {v1, v2}, Lvr/f;->o(Lkotlin/jvm/functions/Function1;)V

    invoke-static {}, Lku/g1;->d()Lku/l0;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b;

    invoke-direct {v2, v0, v3}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$b;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lnt/b;)V

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 p2, v1

    move-object/from16 p4, v2

    move/from16 p5, v3

    move-object/from16 p6, v4

    move-object/from16 p3, v5

    move-object/from16 p1, v15

    invoke-static/range {p1 .. p6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    return-void
.end method

.method public static synthetic A(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->q0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final A0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic B(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->P0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->s0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final C0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic D(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->A0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic E(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->G0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final E0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lpo/c$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->x0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lpo/c$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final F0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic G(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->m0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final G0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic H(Lku/p0;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->T(Lku/p0;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic I(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->N0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final I0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic J(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->J0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final J0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic K(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->v0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final K0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->c0()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->y0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic M(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->I0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final M0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic N(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->C0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->Z()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic O(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->l0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final O0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 11

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic P(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->B0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final P0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/e$a;)Lkotlin/Unit;
    .locals 12

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;

    if-eqz v0, :cond_0

    check-cast p3, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$c;->b()Ljava/lang/String;

    move-result-object p3

    invoke-static {p2, p1, p0, v0, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->S0(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    sget-object p2, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/e$a$a;

    invoke-static {p3, p2}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v10, 0x1bf

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v11}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_1
    instance-of p1, p3, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;

    if-eqz p1, :cond_2

    new-instance p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    check-cast p3, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/governmentid/e$a$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic Q(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->D0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Q0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;
    .locals 21

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    move-object/from16 v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->E()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v6

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v3

    move-object/from16 v7, p2

    invoke-static {v7, v3}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->D()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->C()I

    move-result v9

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    const/4 v10, 0x0

    invoke-static {v1, v10}, Lqo/e;->e(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v16

    sget-object v11, Luo/x;->c:Luo/x;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->i()Ljava/lang/String;

    move-result-object v12

    move-object v7, v3

    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    new-instance v1, Lqo/v0;

    invoke-direct {v1, v0}, Lqo/v0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    const/16 v19, 0x2e00

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v1

    invoke-direct/range {v3 .. v20}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic R(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final R0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v1}, Luo/l;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Luo/x;->b:Luo/x;

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_1
    sget-object v1, Luo/x;->c:Luo/x;

    goto :goto_2

    :goto_3
    const/16 v18, 0x7f7f

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic S(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->K0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final S0(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Ljava/lang/String;Ljava/lang/String;)V
    .locals 15

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    const/4 v2, 0x2

    const/4 v9, 0x0

    move-object/from16 v3, p3

    invoke-direct {v1, v3, v9, v2, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object p0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->e0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    move-result-object v2

    move-object/from16 p0, p1

    check-cast p0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v3

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;

    const/16 v7, 0x20

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdImage;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;Lcom/withpersona/sdk2/inquiry/governmentid/RawExtraction;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p2 .. p2}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-eqz v2, :cond_0

    move-object v9, v1

    check-cast v9, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    :cond_0
    if-nez v9, :cond_1

    return-void

    :cond_1
    move-object v4, v0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v1

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->E()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v3

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->D()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->C()I

    move-result v7

    invoke-virtual/range {p2 .. p2}, Lvr/c;->d()Lvr/f;

    move-result-object v5

    const/4 v8, 0x0

    invoke-static {v5, v8}, Lqo/e;->e(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v8

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x700

    const/4 v14, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v14}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 p0, p2

    invoke-virtual {p0, v0}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void
.end method

.method public static final T(Lku/p0;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 6

    if-nez p2, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-static {}, Lku/g1;->d()Lku/l0;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final T0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V
    .locals 17

    invoke-virtual/range {p3 .. p3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->f()Ljava/util/List;

    move-result-object v8

    move-object/from16 v0, p0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    invoke-virtual/range {p1 .. p1}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    move-object/from16 v2, p1

    iget-object v5, v2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lcom/withpersona/sdk2/camera/CameraProperties;

    const/16 v15, 0x1f

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v16}, Lcom/withpersona/sdk2/camera/CameraProperties;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties$b;Landroid/util/Size;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v12, 0xe00

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v9, 0x0

    move-object/from16 v2, p2

    move-object/from16 v4, p3

    move/from16 v7, p4

    invoke-static/range {v0 .. v13}, Lqo/e;->s(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public static final synthetic U(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    return-object p0
.end method

.method public static synthetic U0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;ZILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p5, p5, 0x10

    if-eqz p5, :cond_0

    const/4 p4, 0x1

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->T0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V

    return-void
.end method

.method public static final synthetic V(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Luo/l;
    .locals 0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    return-object p0
.end method

.method public static final synthetic W(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic X(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->T0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Z)V

    return-void
.end method

.method public static final synthetic Y(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)V
    .locals 0

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public static final b0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v1}, Luo/l;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Luo/x;->b:Luo/x;

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_1
    sget-object v1, Luo/x;->c:Luo/x;

    goto :goto_2

    :goto_3
    const/16 v18, 0x7f7f

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic g(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->z0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->L0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 13

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->i:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/e;->g()V

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v11, 0x1bf

    const/4 v12, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->b0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->c0()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic j(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->Q0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->Z()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic k(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 12

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v10, 0xff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v11}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->M0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final l0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->O0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->R0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    invoke-virtual {p2}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    iget-object v1, p2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    iget-object p2, p2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {p0, p1, v0, v1, p2}, Lqo/e;->u(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->n0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;
    .locals 22

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;

    sget-object v3, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;->RETAKE_PHOTO:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v2, v3, v4, v5, v4}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureButtonType;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, v5, v4}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdButtonClickEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdButtonEventData;ZILjava/lang/Object;)V

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    if-eqz v1, :cond_1

    move-object/from16 v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v5

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->E()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    move-object/from16 v7, p2

    invoke-static {v7, v4}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->D()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v10

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-static {v1, v3}, Lqo/e;->e(Lvr/f;Z)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v11

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->x()Ljava/lang/String;

    move-result-object v17

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v1}, Luo/l;->d()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v1, Luo/x;->b:Luo/x;

    :goto_0
    move-object v12, v1

    goto :goto_1

    :cond_0
    sget-object v1, Luo/x;->c:Luo/x;

    goto :goto_0

    :goto_1
    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->i()Ljava/lang/String;

    move-result-object v13

    new-instance v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    new-instance v1, Lqo/u0;

    invoke-direct {v1, v0}, Lqo/u0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    const/16 v20, 0x2e00

    const/16 v21, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v7, p3

    move-object/from16 v19, v1

    invoke-direct/range {v4 .. v21}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->G(Z)V

    invoke-virtual {v0, v4}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic p(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->h0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 20

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-eqz v2, :cond_2

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v1}, Luo/l;->d()Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Luo/x;->b:Luo/x;

    :goto_2
    move-object v10, v1

    goto :goto_3

    :cond_1
    sget-object v1, Luo/x;->c:Luo/x;

    goto :goto_2

    :goto_3
    const/16 v18, 0x7f7f

    const/16 v19, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;->L(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->j0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 14

    move-object v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    const/16 v12, 0x6ff

    const/4 v13, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v0 .. v13}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic s(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->w0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 2

    check-cast p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    invoke-virtual {p2}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    iget-object v1, p2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    iget-object p2, p2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {p0, p1, v0, v1, p2}, Lqo/e;->u(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic t(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->i0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final t0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->c0()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic u(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->E0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->c0()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic v(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->k0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->Z()V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic w(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->u0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lkotlin/Unit;
    .locals 15

    move-object/from16 v0, p1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    const/16 v13, 0xdff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v0 .. v14}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->O(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Ljava/lang/String;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/camera/CameraProperties;Ljava/lang/String;ZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic x(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->H0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lpo/c$b;)Lkotlin/Unit;
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "it"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lpo/c$b$c;

    if-eqz v2, :cond_0

    move-object/from16 v3, p1

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    const/16 v15, 0x3ff

    const/16 v16, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    invoke-static/range {v3 .. v16}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    sget-object v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$d;

    invoke-virtual {v0, v1}, Lvr/c;->e(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_0
    instance-of v2, v1, Lpo/c$b$b;

    const/4 v3, 0x0

    const-string v4, "getString(...)"

    if-eqz v2, :cond_3

    check-cast v1, Lpo/c$b$b;

    invoke-virtual {v1}, Lpo/c$b$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object v2

    instance-of v2, v2, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;

    if-eqz v2, :cond_1

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    sget v5, Lvp/g;->t:I

    invoke-virtual {v1}, Lpo/c$b$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError;->getDetails()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$GovernmentIdDimensionSizeError$Details;->getMinDimensionSize()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v2, v5, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    sget v2, Lvp/g;->u:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v2

    invoke-virtual {v2}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v3

    :cond_2
    if-eqz v3, :cond_6

    invoke-virtual {v3, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->u(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_1

    :cond_3
    instance-of v2, v1, Lpo/c$b$a;

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v2

    invoke-virtual {v2}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v3

    :cond_4
    check-cast v1, Lpo/c$b$a;

    invoke-virtual {v1}, Lpo/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v2

    instance-of v2, v2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    if-eqz v2, :cond_5

    invoke-virtual {v1}, Lpo/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v2

    if-eqz v2, :cond_5

    if-eqz v3, :cond_5

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    sget v2, Lvp/g;->B:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->u(Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_1

    :cond_5
    move-object/from16 v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    const/16 v14, 0x3ff

    const/4 v15, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static/range {v2 .. v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;ZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    move-result-object v2

    invoke-virtual {v0, v2}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;

    invoke-virtual {v1}, Lpo/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v1

    invoke-direct {v2, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {v0, v2}, Lvr/c;->e(Ljava/lang/Object;)V

    :cond_6
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_7
    new-instance v0, Ljt/l;

    invoke-direct {v0}, Ljt/l;-><init>()V

    throw v0
.end method

.method public static synthetic y(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->F0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic z(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->o0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final V0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z
    .locals 3

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    const/4 v1, 0x1

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-nez v0, :cond_5

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {p1, p2}, Luo/l;->c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->isEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    return v1

    :cond_1
    return v2

    :cond_2
    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-nez p2, :cond_4

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-nez p2, :cond_4

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-nez p2, :cond_4

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-nez p2, :cond_4

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    if-nez p2, :cond_4

    instance-of p2, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-nez p2, :cond_4

    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_4
    :goto_0
    return v2

    :cond_5
    :goto_1
    return v1
.end method

.method public final Z()V
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void
.end method

.method public final a0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;
    .locals 20
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->u()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v3

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v0

    invoke-direct {v7, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v6

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    const/16 v11, 0x140

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v1 .. v12}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Ljava/util/List;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;ZLcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_0
    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    invoke-direct {v3, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)V

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig$AutoClassifyConfig;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v0

    sget-object v2, Lio/d;->b:Lio/d;

    if-ne v0, v2, :cond_1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;->c:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    goto :goto_0

    :goto_1
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v7

    sget-object v10, Luo/x;->c:Luo/x;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/video_capture/VideoCaptureConfig;->i()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v15

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    new-instance v0, Lqo/t0;

    move-object/from16 v1, p0

    invoke-direct {v0, v1}, Lqo/t0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    const/16 v18, 0x2e00

    const/16 v19, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v0

    invoke-direct/range {v2 .. v19}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Ljava/util/List;ILcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Luo/x;Ljava/lang/String;Ljava/lang/Throwable;ZZLjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    new-instance v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->j()Ljava/lang/String;

    move-result-object v6

    const/16 v9, 0xdf

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;Ljava/util/List;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILjava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public final c0()V
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->w()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v1}, Luo/l;->a()V

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lvr/c;->b()Lnu/c0;

    move-result-object v0

    invoke-interface {v0}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->g()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$a;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void

    :cond_2
    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->G(Z)V

    invoke-virtual {p0, v0}, Lvr/c;->f(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void
.end method

.method public final d0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->g0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v0

    invoke-virtual {p0, p2, p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->V0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result p2

    const/4 v1, 0x0

    if-nez p2, :cond_0

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    new-instance v2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$e;

    invoke-direct {v2, p0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$e;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lnt/b;)V

    const-string v3, "close_camera"

    invoke-virtual {p2, v3, v2}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_0
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {p2, p1}, Luo/l;->f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    invoke-static {p1}, Ljq/g;->e(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    new-instance p2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$f;

    invoke-direct {p2, p0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$f;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lnt/b;)V

    const-string v2, "output_webrtc_error"

    invoke-virtual {p1, v2, p2}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_1
    invoke-static {}, Lku/g1;->c()Lku/n2;

    move-result-object p1

    new-instance p2, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$g;

    invoke-direct {p2, p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$g;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/Screen;Lnt/b;)V

    invoke-static {p1, p2, p3}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final e0()V
    .locals 1

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v0}, Luo/l;->a()V

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->o:Lln/a;

    invoke-interface {v0}, Lln/a;->a()V

    return-void
.end method

.method public final f0(Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)V
    .locals 19
    .param p1    # Ljava/io/File;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/camera/CameraProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    move-object/from16 v0, p0

    const-string v1, "file"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "cameraProperties"

    move-object/from16 v8, p2

    invoke-static {v8, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    instance-of v3, v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-eqz v3, :cond_0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_1

    return-void

    :cond_1
    invoke-virtual {v0}, Lvr/c;->b()Lnu/c0;

    move-result-object v3

    invoke-interface {v3}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v10

    const/16 v17, 0x7c

    const/16 v18, 0x0

    const-string v11, "Upload"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v9 .. v18}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logVideoStopEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Double;ZILjava/lang/Object;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->E()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    invoke-interface {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->y1()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    move-result-object v6

    invoke-interface {v5, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    sget-object v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v6

    sget-object v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    invoke-interface {v5, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    move v9, v5

    new-instance v5, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;

    new-instance v10, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    const-string v11, "getAbsolutePath(...)"

    invoke-static {v2, v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "video/*"

    invoke-direct {v10, v2, v11}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v10}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    if-eqz v6, :cond_3

    if-eqz v9, :cond_3

    sget-object v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    goto :goto_2

    :cond_3
    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    if-eqz v9, :cond_5

    move-object v3, v7

    :cond_5
    :goto_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;

    invoke-direct {v5, v2, v3, v6, v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v6

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v3

    const/16 v14, 0xf00

    const/4 v15, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v2, v1

    invoke-static/range {v2 .. v15}, Lqo/e;->s(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lvr/f;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public final g0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v1

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->g()Z

    move-result v9

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->i()Z

    move-result v10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->isEnabled()Z

    move-result v3

    const/4 v15, 0x0

    const/4 v4, 0x1

    if-eqz v3, :cond_0

    instance-of v3, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-nez v3, :cond_0

    move v11, v4

    goto :goto_0

    :cond_0
    move v11, v15

    :goto_0
    const/16 v13, 0x8

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v14}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    instance-of v3, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    if-eqz v3, :cond_1

    sget-object v5, Lpq/h$a;->a:Lpq/h$a;

    goto/16 :goto_2

    :cond_1
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v5, :cond_2

    sget-object v5, Lpq/h$b;->a:Lpq/h$b;

    goto/16 :goto_2

    :cond_2
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-eqz v5, :cond_3

    sget-object v5, Lpq/h$h;->a:Lpq/h$h;

    goto :goto_2

    :cond_3
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-eqz v5, :cond_4

    new-instance v5, Lpq/h$f;

    move-object v6, v7

    check-cast v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->C()I

    move-result v6

    invoke-direct {v5, v6}, Lpq/h$f;-><init>(I)V

    goto :goto_2

    :cond_4
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-nez v5, :cond_a

    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    if-nez v5, :cond_a

    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-nez v5, :cond_a

    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-nez v5, :cond_a

    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v5, :cond_5

    goto :goto_1

    :cond_5
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    if-eqz v5, :cond_6

    new-instance v5, Lpq/h$c;

    move-object v6, v7

    check-cast v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->C()I

    move-result v6

    invoke-direct {v5, v6}, Lpq/h$c;-><init>(I)V

    goto :goto_2

    :cond_6
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-eqz v5, :cond_7

    new-instance v5, Lpq/h$d;

    move-object v6, v7

    check-cast v6, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->C()I

    move-result v6

    invoke-direct {v5, v6}, Lpq/h$d;-><init>(I)V

    goto :goto_2

    :cond_7
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-eqz v5, :cond_8

    sget-object v5, Lpq/h$e;->a:Lpq/h$e;

    goto :goto_2

    :cond_8
    instance-of v5, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz v5, :cond_9

    sget-object v5, Lpq/h$g;->a:Lpq/h$g;

    goto :goto_2

    :cond_9
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_a
    :goto_1
    new-instance v5, Lpq/h$i;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->C()I

    move-result v6

    invoke-direct {v5, v6}, Lpq/h$i;-><init>(I)V

    :goto_2
    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->q:Lpq/c;

    new-instance v8, Lpq/i$c;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v9

    invoke-direct {v8, v9, v5}, Lpq/i$c;-><init>(Ljava/lang/String;Lpq/h;)V

    invoke-virtual {v6, v8}, Lpq/c;->c(Lpq/i;)V

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->u:Lhu/c;

    invoke-static {v6, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v8, 0x2

    const/4 v9, 0x0

    if-nez v6, :cond_d

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v18

    const/16 v20, 0x4

    const/16 v21, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v6

    invoke-static/range {v16 .. v21}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logInquiryPageViewEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)V

    const-class v5, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    invoke-static {v5}, Lkotlin/jvm/internal/d0;->b(Ljava/lang/Class;)Lhu/c;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v16, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v17, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->LOADING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->z()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;

    move-result-object v6

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->Q(Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-static {v6}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v6

    move-object/from16 v19, v6

    goto :goto_3

    :cond_b
    move-object/from16 v19, v9

    :goto_3
    const/16 v21, 0x8

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    invoke-static {v5, v6, v15, v8, v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    :cond_c
    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->u:Lhu/c;

    :cond_d
    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;->A()Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lwq/l;->b:Lwq/l;

    :goto_4
    move-object/from16 v33, v1

    goto :goto_5

    :cond_e
    sget-object v1, Lwq/l;->a:Lwq/l;

    goto :goto_4

    :goto_5
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    if-eqz v1, :cond_f

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$k;

    invoke-direct {v3, v2, v7, v0, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$k;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lnt/b;)V

    const-string v4, "check_if_single_id_class"

    invoke-virtual {v1, v4, v3}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->getTitle()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->v0()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->z()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->g0()Ljava/lang/String;

    move-result-object v20

    invoke-static {v2}, Lqo/e;->m(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Ljava/util/List;

    move-result-object v21

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$m;

    invoke-direct {v1, v7, v0, v2}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$m;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getSelectPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;

    move-result-object v25

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v24

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v22

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ShowInstructions;->K()Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->isEnabled()Z

    move-result v26

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->s:Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/a;->a()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme;->f()Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;

    move-result-object v31

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->K0()Ljava/lang/String;

    move-result-object v32

    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;

    new-instance v2, Lqo/b0;

    invoke-direct {v2, v0}, Lqo/b0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v3, Lqo/t;

    invoke-direct {v3, v0}, Lqo/t;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v4, Lqo/f0;

    invoke-direct {v4, v0, v7}, Lqo/f0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    move-object/from16 v23, v1

    move-object/from16 v27, v2

    move-object/from16 v28, v3

    move-object/from16 v30, v4

    invoke-direct/range {v16 .. v33}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function1;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$SelectPage;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/shared/inquiryTheme/InquiryTheme$c;Ljava/lang/String;Lwq/l;)V

    return-object v16

    :cond_f
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    if-eqz v1, :cond_1b

    move-object v1, v7

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->L()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v5

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->i:Lcom/withpersona/sdk2/inquiry/governmentid/e;

    new-instance v10, Lqo/l0;

    invoke-direct {v10, v0, v7, v3}, Lqo/l0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;)V

    invoke-virtual {v5, v6, v10}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    :cond_10
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getPromptPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;

    move-result-object v5

    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->n()Ljava/util/List;

    move-result-object v17

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v6

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v11

    invoke-static {v11}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v12

    invoke-static {v6, v10, v11, v12}, Lqo/e;->j(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v6

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v3

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v10

    invoke-static {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->x()Ljava/lang/String;

    move-result-object v11

    invoke-static {v6, v3, v10, v11}, Lqo/e;->i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->C()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->E()Ljava/lang/String;

    move-result-object v21

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v22

    new-instance v3, Lqo/n0;

    invoke-direct {v3, v0, v7, v2}, Lqo/n0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V

    new-instance v6, Lqo/o0;

    invoke-direct {v6, v0, v7}, Lqo/o0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    new-instance v10, Lqo/p0;

    invoke-direct {v10, v0}, Lqo/p0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v11, Lqo/q0;

    invoke-direct {v11, v0}, Lqo/q0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->O()Ljava/lang/String;

    move-result-object v27

    new-instance v12, Lqo/r0;

    invoke-direct {v12, v0, v7}, Lqo/r0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v29

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v7

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v7

    sget-object v13, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$d;->a:[I

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v13, v7

    const/4 v14, 0x4

    if-eq v7, v4, :cond_15

    if-eq v7, v8, :cond_14

    const/4 v15, 0x3

    if-eq v7, v15, :cond_11

    if-eq v7, v14, :cond_13

    const/4 v15, 0x5

    if-ne v7, v15, :cond_12

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getPassportSignaturePictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    :cond_11
    :goto_6
    move-object/from16 v30, v9

    goto :goto_7

    :cond_12
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1

    :cond_13
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getBarcodePdf417Pictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_6

    :cond_14
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getIdBackPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_6

    :cond_15
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v7

    invoke-static {v7}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;

    move-result-object v7

    sget-object v15, Lpo/b;->j:Lpo/b;

    if-ne v7, v15, :cond_16

    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getPassportFrontPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_6

    :cond_16
    if-eqz v5, :cond_11

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PromptPage;->getIdFrontPictograph()Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;

    move-result-object v9

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->N()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    aget v5, v13, v5

    if-eq v5, v4, :cond_18

    if-eq v5, v8, :cond_17

    if-eq v5, v14, :cond_17

    sget v1, Lio/p2;->e:I

    :goto_8
    move/from16 v31, v1

    goto :goto_9

    :cond_17
    sget v1, Lio/p2;->d:I

    goto :goto_8

    :cond_18
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ChooseCaptureMethod;->K()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v1

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;

    move-result-object v1

    sget-object v4, Lpo/b;->j:Lpo/b;

    if-ne v1, v4, :cond_19

    sget v1, Lio/p2;->f:I

    goto :goto_8

    :cond_19
    sget v1, Lio/p2;->e:I

    goto :goto_8

    :goto_9
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->w0()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1a

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v1

    :cond_1a
    move-object/from16 v32, v1

    move-object/from16 v23, v3

    move-object/from16 v24, v6

    move-object/from16 v25, v10

    move-object/from16 v26, v11

    move-object/from16 v28, v12

    invoke-direct/range {v16 .. v33}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$c;-><init>(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/ui/components/RemoteImage;ILjava/lang/String;Lwq/l;)V

    return-object v16

    :cond_1b
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    if-eqz v1, :cond_1c

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->l:Lro/m0;

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->f:Landroid/content/Context;

    move-object v4, v7

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v5

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v7, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$h;

    invoke-direct {v7, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$h;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v8, Lqo/s0;

    invoke-direct {v8, v0}, Lqo/s0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v3, p1

    move-object/from16 v9, v33

    invoke-virtual/range {v1 .. v9}, Lro/m0;->Q(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$WaitForAutocapture;Lvr/f;Luo/l;Lym/h;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_1c
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    if-eqz v1, :cond_1d

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->l:Lro/m0;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;

    invoke-direct {v6, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$i;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v7, Lqo/m0;

    invoke-direct {v7, v0}, Lqo/m0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v2, p1

    move-object/from16 v8, v33

    invoke-virtual/range {v1 .. v8}, Lro/m0;->E(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$CountdownToCapture;Lvr/f;Luo/l;Lym/h;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_1d
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    if-eqz v1, :cond_21

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v16, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v17, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-object v10, v7

    check-cast v10, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v2

    invoke-static {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v19

    const/16 v21, 0x8

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v16

    invoke-static {v1, v2, v15, v8, v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v8

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v1

    invoke-static {v8, v1}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->d(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    move-result-object v9

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v1

    invoke-interface {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    move-object v11, v1

    check-cast v11, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->Q()Z

    move-result v1

    if-eqz v1, :cond_1e

    move-object v2, v7

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v3

    move v1, v4

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->m:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$j;

    invoke-direct {v6, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$j;-><init>(Ljava/lang/Object;)V

    move v12, v1

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lqo/e;->v(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lkotlin/jvm/functions/Function1;)V

    move-object v2, v1

    goto :goto_a

    :cond_1e
    move-object/from16 v2, p1

    move v12, v4

    :goto_a
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->g:Lk6/s;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v5

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->x()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lqo/e;->k(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->s()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;->g()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;

    move-result-object v20

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v22

    invoke-static {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->a(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lpo/b;

    move-result-object v23

    invoke-virtual {v11}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v21

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v24

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->n()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->m()Ljava/lang/String;

    move-result-object v28

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->I()Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;

    move-result-object v5

    invoke-static {v5}, Lcom/withpersona/sdk2/inquiry/governmentid/c;->b(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->x()Ljava/lang/String;

    move-result-object v6

    invoke-static {v3, v4, v5, v6}, Lqo/e;->l(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v31

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->P()Ljava/lang/String;

    move-result-object v32

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getCapturePage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;

    move-result-object v34

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_1f

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->Q()Z

    move-result v3

    if-nez v3, :cond_1f

    move/from16 v35, v12

    goto :goto_b

    :cond_1f
    move/from16 v35, v15

    :goto_b
    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewCapturedImage;->Q()Z

    move-result v36

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->C()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;

    move-result-object v37

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->m()Lio/d;

    move-result-object v38

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    invoke-virtual {v3, v2}, Luo/l;->c(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->isEnabled()Z

    move-result v3

    if-eqz v3, :cond_20

    move/from16 v39, v12

    goto :goto_c

    :cond_20
    move/from16 v39, v15

    :goto_c
    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->x()Ljava/lang/String;

    move-result-object v40

    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;

    new-instance v3, Lqo/w0;

    invoke-direct {v3, v2, v7, v0}, Lqo/w0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v4, Lqo/x0;

    invoke-direct {v4, v0, v7, v2, v8}, Lqo/x0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)V

    new-instance v2, Lqo/y0;

    invoke-direct {v2, v0}, Lqo/y0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v5, Lqo/z0;

    invoke-direct {v5, v0, v7}, Lqo/z0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    move-object/from16 v17, v1

    move-object/from16 v30, v2

    move-object/from16 v25, v3

    move-object/from16 v27, v4

    move-object/from16 v41, v33

    move-object/from16 v33, v5

    invoke-direct/range {v16 .. v41}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$h;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lpo/b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$CapturePage;ZZLcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StyleElements$Axis;Lio/d;ZLjava/lang/String;Lwq/l;)V

    return-object v16

    :cond_21
    move-object/from16 v2, p1

    move v12, v4

    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    if-eqz v1, :cond_24

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->r:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    new-instance v16, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;

    sget-object v17, Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;->CONFIRMING:Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;

    move-object v10, v7

    check-cast v10, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v3

    invoke-static {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->d0(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;

    move-result-object v19

    const/16 v21, 0x8

    const/16 v22, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;-><init>(Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureState;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureMethod;Lcom/withpersona/sdk2/inquiry/tracking/model/GovIdCaptureSide;Lcom/withpersona/sdk2/inquiry/tracking/model/TrackingMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v16

    invoke-static {v1, v3, v15, v8, v9}, Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;->logGovernmentIdStateEvent$default(Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/tracking/model/GovernmentIdStateEventData;ZILjava/lang/Object;)V

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->J()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    move-result-object v8

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->R()Z

    move-result v1

    if-eqz v1, :cond_22

    move-object v2, v7

    check-cast v2, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v3

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->m:Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$l;

    invoke-direct {v6, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$l;-><init>(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v6}, Lqo/e;->v(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewImageState;Lvr/f;Luo/l;Lcom/withpersona/sdk2/inquiry/governmentid/network/AutoClassifyWorker$b;Lkotlin/jvm/functions/Function1;)V

    move-object v2, v1

    :cond_22
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->g:Lk6/s;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    invoke-static {v3, v4}, Lqo/e;->o(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    invoke-static {v3, v4}, Lqo/e;->n(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->B0()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->y0()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v3

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->a()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->K()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    move-result-object v3

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->d3()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;->f()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->Q()Ljava/lang/String;

    move-result-object v24

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v25

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->P()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$ReviewSelectedImage;->R()Z

    move-result v3

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v32

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->G0()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_23

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->t()Ljava/lang/String;

    move-result-object v4

    :cond_23
    move-object/from16 v34, v4

    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;

    new-instance v4, Lqo/a1;

    invoke-direct {v4, v2, v7, v0}, Lqo/a1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v2, Lqo/b1;

    invoke-direct {v2, v0}, Lqo/b1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v5, Lqo/c1;

    invoke-direct {v5, v0}, Lqo/c1;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v6, Lqo/r;

    invoke-direct {v6, v0}, Lqo/r;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v8, Lqo/s;

    invoke-direct {v8, v0, v7}, Lqo/s;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    move-object/from16 v17, v1

    move-object/from16 v27, v2

    move-object/from16 v26, v4

    move-object/from16 v28, v5

    move-object/from16 v29, v6

    move-object/from16 v31, v8

    move-object/from16 v35, v33

    move/from16 v33, v3

    invoke-direct/range {v16 .. v35}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$i;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;ZLjava/lang/String;Lwq/l;)V

    return-object v16

    :cond_24
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    if-eqz v1, :cond_27

    move-object v1, v7

    check-cast v1, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->L()Z

    move-result v3

    if-nez v3, :cond_25

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v3

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->h:Lpo/c$a;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->x()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->t()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->s()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->K()Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;

    move-result-object v13

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->N()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$Submit;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v15

    invoke-interface/range {v8 .. v15}, Lpo/c$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/network/GovernmentIdRequestArguments;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;)Lpo/c;

    move-result-object v1

    new-instance v4, Lqo/u;

    invoke-direct {v4, v0, v7}, Lqo/u;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;)V

    invoke-virtual {v3, v1, v4}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    :cond_25
    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    const/16 v10, 0xc

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->k()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;

    move-result-object v1

    if-eqz v1, :cond_26

    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;

    invoke-static {v1}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v17

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v19

    new-instance v1, Lqo/v;

    invoke-direct {v1, v0}, Lqo/v;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v3, Lqo/w;

    invoke-direct {v3, v0}, Lqo/w;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->q0()Ljava/lang/String;

    move-result-object v22

    const/16 v25, 0x40

    const/16 v26, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v1

    move-object/from16 v21, v3

    move-object/from16 v24, v33

    invoke-direct/range {v16 .. v26}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v16

    :cond_26
    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->u0()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->s0()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v19

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getPendingPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;

    move-result-object v20

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v21

    new-instance v1, Lqo/x;

    invoke-direct {v1, v0}, Lqo/x;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v3, Lqo/y;

    invoke-direct {v3, v0}, Lqo/y;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->A()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v24

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->q0()Ljava/lang/String;

    move-result-object v26

    const/16 v28, 0x100

    const/16 v29, 0x0

    const/16 v25, 0x0

    move-object/from16 v22, v1

    move-object/from16 v23, v3

    move-object/from16 v27, v33

    invoke-direct/range {v16 .. v29}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLjava/lang/String;Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v16

    :cond_27
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    if-eqz v1, :cond_2a

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_29

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->k()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;

    move-result-object v1

    if-eqz v1, :cond_28

    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;

    invoke-static {v1}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v17

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v19

    new-instance v1, Lqo/z;

    invoke-direct {v1, v0}, Lqo/z;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v3, Lqo/a0;

    invoke-direct {v3, v0}, Lqo/a0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->q0()Ljava/lang/String;

    move-result-object v22

    const/16 v23, 0x1

    move-object/from16 v20, v1

    move-object/from16 v21, v3

    move-object/from16 v24, v33

    invoke-direct/range {v16 .. v24}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$f;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLwq/l;)V

    return-object v16

    :cond_28
    new-instance v16, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->u0()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->s0()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->I()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v19

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig;->getPendingPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;

    move-result-object v20

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->p:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v21

    new-instance v1, Lqo/c0;

    invoke-direct {v1, v0}, Lqo/c0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    new-instance v3, Lqo/d0;

    invoke-direct {v3, v0}, Lqo/d0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->A()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v24

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->q0()Ljava/lang/String;

    move-result-object v26

    const/16 v25, 0x1

    move-object/from16 v22, v1

    move-object/from16 v23, v3

    move-object/from16 v27, v33

    invoke-direct/range {v16 .. v27}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$j;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$GovernmentId$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;ZLjava/lang/String;Lwq/l;)V

    return-object v16

    :cond_29
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->j:Lro/v0;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lqo/e0;

    invoke-direct {v6, v0}, Lqo/e0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v7, v33

    invoke-virtual/range {v1 .. v7}, Lro/v0;->i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_2a
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    if-eqz v1, :cond_2c

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->f()Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/autoClassification/AutoClassificationConfig;->isEnabled()Z

    move-result v1

    if-eqz v1, :cond_2b

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->k:Lro/j1;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lqo/g0;

    invoke-direct {v6, v0}, Lqo/g0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v2, p1

    move-object/from16 v7, v33

    invoke-virtual/range {v1 .. v7}, Lro/j1;->u(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_2b
    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->k:Lro/j1;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lqo/h0;

    invoke-direct {v6, v0}, Lqo/h0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v2, p1

    move-object/from16 v7, v33

    invoke-virtual/range {v1 .. v7}, Lro/j1;->m(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeWebRtc;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_2c
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    if-eqz v1, :cond_2d

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->l:Lro/m0;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lqo/i0;

    invoke-direct {v6, v0}, Lqo/i0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v6}, Lro/m0;->M(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$HolographicTorchDelay;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_2d
    if-eqz v3, :cond_2e

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->n:Lro/i;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lqo/j0;

    invoke-direct {v6, v0}, Lqo/j0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v2, p1

    move-object/from16 v7, v33

    invoke-virtual/range {v1 .. v7}, Lro/i;->i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationError;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$d;

    move-result-object v1

    return-object v1

    :cond_2e
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    if-eqz v1, :cond_2f

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->n:Lro/i;

    move-object v3, v7

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v4

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->t:Luo/l;

    new-instance v6, Lqo/k0;

    invoke-direct {v6, v0}, Lqo/k0;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;)V

    move-object/from16 v2, p1

    move-object/from16 v7, v33

    invoke-virtual/range {v1 .. v7}, Lro/i;->m(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$AutoClassificationManualSelect;Lvr/f;Luo/l;Lkotlin/jvm/functions/Function1;Lwq/l;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen;

    move-result-object v1

    return-object v1

    :cond_2f
    instance-of v1, v7, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$RestartStep;

    if-eqz v1, :cond_30

    invoke-virtual/range {p0 .. p1}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;->a0(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;

    move-result-object v1

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v2

    new-instance v3, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;

    invoke-direct {v3, v0, v1, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b$n;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/persona_workflow/b;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lnt/b;)V

    const-string v1, "restart_step"

    invoke-virtual {v2, v1, v3}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;

    invoke-direct {v1, v9, v12, v9}, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$g;-><init>(Lwq/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_30
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1
.end method
