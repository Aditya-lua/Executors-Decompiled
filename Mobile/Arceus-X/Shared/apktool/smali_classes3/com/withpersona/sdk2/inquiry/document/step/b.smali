.class public final Lcom/withpersona/sdk2/inquiry/document/step/b;
.super Lvr/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/step/b$c;,
        Lcom/withpersona/sdk2/inquiry/document/step/b$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lvr/c<",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00be\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008#\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001aB\u008f\u0001\u0008\u0007\u0012\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0008\u0008\u0001\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0008\u0008\u0001\u0010$\u001a\u00020#\u00a2\u0006\u0004\u0008%\u0010&J\u001f\u0010*\u001a\u00020)2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008*\u0010+J!\u0010/\u001a\u00020)*\u0008\u0012\u0004\u0012\u00020\u00030,2\u0006\u0010.\u001a\u00020-H\u0002\u00a2\u0006\u0004\u0008/\u00100J1\u00107\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000201H\u0002\u00a2\u0006\u0004\u00087\u00108J1\u0010:\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u000204\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020)050302*\u000209H\u0002\u00a2\u0006\u0004\u0008:\u0010;J#\u0010=\u001a\u00020)*\u00020<2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008=\u0010>J#\u0010@\u001a\u00020)*\u00020?2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008@\u0010AJ\u0015\u0010C\u001a\u00020\u00032\u0006\u0010B\u001a\u00020\u0002\u00a2\u0006\u0004\u0008C\u0010DR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008G\u0010HR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008K\u0010LR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008_\u0010`\u00a8\u0006b"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/step/b;",
        "Lvr/c;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;",
        "initialProps",
        "Landroidx/lifecycle/l0;",
        "savedStateHandle",
        "Lk6/s;",
        "imageLoader",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/withpersona/sdk2/inquiry/document/a;",
        "documentCameraWorker",
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        "documentsSelectWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
        "documentCreateWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
        "documentLoadWorker",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
        "documentFileUploadWorkerFactory",
        "Lbo/a$a;",
        "documentFileDeleteWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
        "documentSubmitWorker",
        "Luq/a;",
        "navigationStateManager",
        "Lpq/c;",
        "externalEventLogger",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
        "permissionRequestWorker",
        "Lku/p0;",
        "coroutineScope",
        "<init>",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lku/p0;)V",
        "renderProps",
        "renderState",
        "",
        "l0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V",
        "Lvr/f;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;",
        "event",
        "S0",
        "(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;",
        "",
        "Lkotlin/Pair;",
        "",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "b0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;",
        "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;",
        "c0",
        "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
        "T0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
        "U0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V",
        "props",
        "k0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "e",
        "Landroidx/lifecycle/l0;",
        "f",
        "Lk6/s;",
        "g",
        "Landroid/content/Context;",
        "h",
        "Lcom/withpersona/sdk2/inquiry/document/a;",
        "i",
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        "j",
        "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
        "k",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
        "l",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
        "m",
        "Lbo/a$a;",
        "n",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
        "o",
        "Luq/a;",
        "p",
        "Lpq/c;",
        "q",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "r",
        "Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;",
        "c",
        "document_release"
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

.field public final f:Lk6/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/document/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lcom/withpersona/sdk2/inquiry/document/i$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/withpersona/sdk2/inquiry/document/network/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Lcom/withpersona/sdk2/inquiry/document/network/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lcom/withpersona/sdk2/inquiry/document/network/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lbo/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final n:Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final o:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final p:Lpq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final q:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Landroidx/lifecycle/l0;Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;Lku/p0;)V
    .locals 16
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/lifecycle/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lk6/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/document/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/withpersona/sdk2/inquiry/document/i$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/withpersona/sdk2/inquiry/document/network/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/document/network/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lcom/withpersona/sdk2/inquiry/document/network/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lbo/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Lcom/withpersona/sdk2/inquiry/document/network/g$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lpq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p14    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p15    # Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p16    # Lku/p0;
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

    const-string v0, "imageLoader"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentCameraWorker"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentsSelectWorkerFactory"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentCreateWorkerFactory"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentLoadWorker"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentFileUploadWorkerFactory"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentFileDeleteWorkerFactory"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentSubmitWorker"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalEventLogger"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionRequestWorker"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    move-object/from16 v15, p16

    invoke-static {v15, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v1, v2, v15}, Lvr/c;-><init>(Ljava/lang/Object;Landroidx/lifecycle/l0;Lku/p0;)V

    iput-object v2, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->e:Landroidx/lifecycle/l0;

    iput-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->f:Lk6/s;

    iput-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    iput-object v5, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->h:Lcom/withpersona/sdk2/inquiry/document/a;

    iput-object v6, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->i:Lcom/withpersona/sdk2/inquiry/document/i$b;

    iput-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->j:Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    iput-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->k:Lcom/withpersona/sdk2/inquiry/document/network/e$a;

    iput-object v9, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->l:Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    iput-object v10, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->m:Lbo/a$a;

    iput-object v11, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->n:Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    iput-object v12, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    iput-object v13, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->p:Lpq/c;

    iput-object v14, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->q:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    move-object/from16 v1, p15

    iput-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->r:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    invoke-virtual {v0}, Lvr/c;->b()Lnu/c0;

    move-result-object v2

    invoke-interface {v2}, Lnu/c0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    invoke-virtual {v0, v2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->k0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v2

    invoke-virtual {v1, v2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_0
    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    new-instance v2, Lco/j;

    invoke-direct {v2, v15, v0}, Lco/j;-><init>(Lku/p0;Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v1, v2}, Lvr/f;->o(Lkotlin/jvm/functions/Function1;)V

    invoke-static {}, Lku/g1;->d()Lku/l0;

    move-result-object v1

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/step/b$b;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lcom/withpersona/sdk2/inquiry/document/step/b$b;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lnt/b;)V

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

.method public static synthetic A(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->O0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final A0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic B(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->M0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final B0(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/g$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->G0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/g$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final C0()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic D(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->p0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic E(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->n0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final E0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->q0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final F0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic G(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->y0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final G0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/g$b;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;->a:Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic H(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->d0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic I(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->Q0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final I0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic J(Lku/p0;Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->Z(Lku/p0;Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final J0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic K(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->z0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final K0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->h0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic M(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->u0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final M0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object p2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/step/b$d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->h:Lcom/withpersona/sdk2/inquiry/document/a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v1, Lvp/g;->b:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/withpersona/sdk2/inquiry/document/a;->e(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    if-eqz p2, :cond_3

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    goto :goto_1

    :cond_3
    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    :goto_1
    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic N(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->I0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/e$b;)Lkotlin/Unit;
    .locals 12

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v4, :cond_2

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    invoke-static {p1, v2}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const/16 v10, 0xd6

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_3

    :cond_4
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;

    if-eqz v0, :cond_5

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_5
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic O(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->e0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final O0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object p2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/step/b$d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->h:Lcom/withpersona/sdk2/inquiry/document/a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v1, Lvp/g;->b:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/withpersona/sdk2/inquiry/document/a;->e(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    if-eqz p2, :cond_3

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    goto :goto_1

    :cond_3
    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    :goto_1
    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic P(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->g0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final P0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Q()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/document/step/b;->C0()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final Q0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic R(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->x0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final R0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic S(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->o0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic T(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->L0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->A0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic V(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->f0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final V0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lkotlin/Unit;
    .locals 12

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v0, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    instance-of v1, p2, Lcom/withpersona/sdk2/inquiry/document/a$b$b;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/a$b$b;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/a$b$b;->a()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->c:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v6}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p1

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    const/16 v10, 0xf4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_1
    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/a$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/a$b$a;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic W(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/step/b;->Z0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final W0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v0, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    instance-of v1, p3, Lcom/withpersona/sdk2/inquiry/document/i$c$c;

    if-eqz v1, :cond_1

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    check-cast p3, Lcom/withpersona/sdk2/inquiry/document/i$c$c;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/i$c$c;->a()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Lcom/withpersona/sdk2/inquiry/document/g;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {p2, p3}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p1

    invoke-static {p2, p1}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    const/16 v10, 0xf4

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0, v1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_1
    instance-of v1, p3, Lcom/withpersona/sdk2/inquiry/document/i$c$b;

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v5

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    check-cast p3, Lcom/withpersona/sdk2/inquiry/document/i$c$b;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/i$c$b;->a()Ljava/util/List;

    move-result-object p3

    invoke-static {p3}, Lcom/withpersona/sdk2/inquiry/document/g;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-static {v1, p3}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p1

    invoke-static {p3, p1}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget p1, Lvp/g;->m:I

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v9

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    const/16 v10, 0x74

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_2
    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/i$c$a;->a:Lcom/withpersona/sdk2/inquiry/document/i$c$a;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_3
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic X(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->E0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final X0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lkotlin/Unit;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v1, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    :cond_2
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_3
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic Y(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->F0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Y0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 14

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v2

    invoke-virtual {v2}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v3, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;

    const/16 v4, 0xa

    if-eqz v2, :cond_6

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v0, v4}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v6, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    move-object v4, v1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->b()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    move-result-object v2

    :cond_1
    invoke-interface {v6, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v1, 0x0

    :cond_4
    if-ge v1, v0, :cond_5

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v1, v1, 0x1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v2, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v2, :cond_4

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v4, v0

    goto :goto_3

    :cond_5
    :goto_2
    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_3
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto/16 :goto_8

    :cond_6
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;

    if-eqz v2, :cond_9

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v6, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v5, v4, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v5, :cond_7

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    move-object v7, v4

    check-cast v7, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-object v4, v1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;->a()I

    move-result v10

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->f(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v4

    :cond_7
    invoke-interface {v6, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v4

    const/16 v8, 0xa

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto/16 :goto_8

    :cond_9
    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    if-eqz v2, :cond_d

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->v0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object v0, v4

    check-cast v0, Ljava/lang/Iterable;

    instance-of v2, v0, Ljava/util/Collection;

    if-eqz v2, :cond_a

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v2, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v2, :cond_b

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    :goto_5
    move-object v7, v0

    goto :goto_7

    :cond_c
    :goto_6
    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    goto :goto_5

    :goto_7
    move-object v0, v1

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object v1

    instance-of v9, v1, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError;

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object v0

    iget-object p0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    move-object/from16 v2, p3

    invoke-static {v0, p0, v2}, Lcom/withpersona/sdk2/inquiry/document/g;->c(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x50

    const/4 v13, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v13}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v3}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_8

    :cond_d
    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;

    if-eqz v0, :cond_e

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, v0}, Lvr/c;->e(Ljava/lang/Object;)V

    :cond_e
    :goto_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Z(Lku/p0;Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;
    .locals 6

    if-nez p2, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-static {}, Lku/g1;->d()Lku/l0;

    move-result-object v1

    new-instance v3, Lcom/withpersona/sdk2/inquiry/document/step/b$a;

    const/4 v0, 0x0

    invoke-direct {v3, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b$a;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lnt/b;)V

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Z0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lkotlin/Unit;
    .locals 12

    const-string v0, "response"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    invoke-virtual {v0}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, p1}, Lkotlin/collections/CollectionsKt;->v0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object p1, v2

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v0, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v0, :cond_3

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v5, p1

    goto :goto_4

    :cond_4
    :goto_3
    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;->a()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_4
    instance-of p1, p3, Lbo/a$b$b;

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    const/16 v10, 0xe6

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_5

    :cond_5
    instance-of p1, p3, Lbo/a$b$a;

    if-eqz p1, :cond_6

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p3, Lbo/a$b$a;

    invoke-virtual {p3}, Lbo/a$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p2

    invoke-direct {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_6
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static final synthetic a0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->l0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    return-void
.end method

.method public static final d0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final e0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final f0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic g(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->m0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final g0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic h(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->J0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->v0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic j(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->K0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic k(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->R0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->H0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->P0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final m0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->V0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic o(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/e$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->N0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/e$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final o0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic p(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Ljava/lang/Object;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/document/step/b;->Y0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Ljava/lang/Object;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 2

    const-string v0, "document"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic q(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->i0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->s0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final r0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic s(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->t0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic t(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->j0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final t0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic u(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->D0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final u0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$b;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object p2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/step/b$d;->a:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_2

    const/4 v0, 0x2

    if-eq p2, v0, :cond_1

    const/4 v0, 0x3

    if-ne p2, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    goto :goto_2

    :cond_2
    iget-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->h:Lcom/withpersona/sdk2/inquiry/document/a;

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v1, Lvp/g;->b:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "getString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/withpersona/sdk2/inquiry/document/a;->e(Ljava/lang/String;)Z

    move-result p2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p0

    if-eqz p2, :cond_3

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    goto :goto_1

    :cond_3
    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    :goto_1
    invoke-virtual {p0, p1}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic v(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->w0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final v0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic w(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/step/b;->W0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final w0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic x(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->X0(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic y(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->B0(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final y0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic z(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/step/b;->r0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z0(Lcom/withpersona/sdk2/inquiry/document/step/b;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, v0, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b;->S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final S0(Lvr/f;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvr/f<",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            ">;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;",
            ")V"
        }
    .end annotation

    invoke-virtual {p1}, Lvr/f;->i()Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-nez v1, :cond_0

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void

    :cond_1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;

    invoke-virtual {p0, p1}, Lvr/c;->e(Ljava/lang/Object;)V

    return-void

    :cond_2
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_3
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_4
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p2, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_5
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const/4 p2, 0x1

    invoke-virtual {v1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_6
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v1, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_7
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;

    if-eqz v0, :cond_8

    instance-of v0, v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz v0, :cond_9

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_8
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    instance-of p2, v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz p2, :cond_9

    move-object v2, v1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const/16 v11, 0x7f

    const/4 v12, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v2 .. v12}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p2

    invoke-virtual {p1, p2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    :cond_9
    :goto_0
    return-void

    :cond_a
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;

    if-eqz v0, :cond_b

    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v2}, Lvr/f;->p(Lcom/withpersona/sdk2/inquiry/workflows/WorkflowState;)V

    return-void

    :cond_b
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final T0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/step/b$d;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    if-eq p1, v0, :cond_3

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->i:Lcom/withpersona/sdk2/inquiry/document/i$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/i$b;->c()Lcom/withpersona/sdk2/inquiry/document/i;

    move-result-object v0

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->i:Lcom/withpersona/sdk2/inquiry/document/i$b;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/i$b;->e()Lcom/withpersona/sdk2/inquiry/document/i;

    move-result-object v0

    :goto_1
    new-instance v1, Lco/o0;

    invoke-direct {v1, p0, p2, p3}, Lco/o0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    invoke-virtual {p1, v0, v1}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_3
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->h:Lcom/withpersona/sdk2/inquiry/document/a;

    new-instance v0, Lco/n0;

    invoke-direct {v0, p0, p2}, Lco/n0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    invoke-virtual {p1, p3, v0}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    return-void
.end method

.method public final U0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 7

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p1

    iget-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->j:Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->s()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p2

    invoke-virtual {p3, v0, v1, v2, p2}, Lcom/withpersona/sdk2/inquiry/document/network/a$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;

    move-result-object p2

    new-instance p3, Lco/p0;

    invoke-direct {p3, p0}, Lco/p0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {p1, p2, p3}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    const/4 v1, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_2
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v3, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object p2

    new-instance p3, Lcom/withpersona/sdk2/inquiry/document/step/b$f;

    invoke-direct {p3, p0, p1, v1}, Lcom/withpersona/sdk2/inquiry/document/step/b$f;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lnt/b;)V

    const-string p1, "upload_complete"

    invoke-virtual {p2, p1, p3}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_4
    const/4 p3, 0x3

    invoke-static {v0, p3}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->l:Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v3

    move-object v4, p1

    check-cast v4, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result v5

    const/4 v6, 0x1

    if-ne v5, v6, :cond_5

    goto :goto_2

    :cond_5
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v2, v3, v4, v0, v6}, Lcom/withpersona/sdk2/inquiry/document/network/c$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Z)Lcom/withpersona/sdk2/inquiry/document/network/c;

    move-result-object v2

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lvr/g;->a(Lvr/h;Ljava/lang/String;)Lvr/b;

    move-result-object v2

    new-instance v3, Lco/r0;

    invoke-direct {v3, p0, p1, v0, p2}, Lco/r0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    invoke-virtual {v1, v2, v3}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    goto :goto_1

    :cond_6
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    if-eqz v0, :cond_b

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-nez v0, :cond_7

    goto :goto_3

    :cond_7
    check-cast p3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->q()Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    move-result-object v0

    instance-of v2, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    if-eqz v2, :cond_8

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    :cond_8
    if-nez v1, :cond_a

    :cond_9
    :goto_3
    return-void

    :cond_a
    invoke-virtual {p0}, Lvr/c;->d()Lvr/f;

    move-result-object v0

    iget-object v2, p0, Lcom/withpersona/sdk2/inquiry/document/step/b;->m:Lbo/a$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p2, p3, v1}, Lbo/a$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lbo/a;

    move-result-object p2

    new-instance p3, Lco/s0;

    invoke-direct {p3, p0, v1, p1}, Lco/s0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;)V

    invoke-virtual {v0, p2, p3}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_b
    instance-of p1, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    if-eqz p1, :cond_c

    return-void

    :cond_c
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final b0(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;-><init>()V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->f()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/j0;

    invoke-direct {v2, p0}, Lco/j0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/k0;

    invoke-direct {v2, p0}, Lco/k0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->i()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/l0;

    invoke-direct {v2, p0}, Lco/l0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lco/m0;

    invoke-direct {v1, p0}, Lco/m0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->b()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final c0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;",
            ")",
            "Ljava/util/List<",
            "Lkotlin/Pair<",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
            "Lkotlin/Unit;",
            ">;>;>;"
        }
    .end annotation

    new-instance v0, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    invoke-direct {v0}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;-><init>()V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->f()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/t0;

    invoke-direct {v2, p0}, Lco/t0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lco/u0;

    invoke-direct {v2, p0}, Lco/u0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->i()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lco/v0;

    invoke-direct {v1, p0}, Lco/v0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->b()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final k0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
    .locals 11
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->K()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;

    move-result-object v0

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->n()Ljava/lang/String;

    move-result-object v5

    const/16 v7, 0xb

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_0
    instance-of v0, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->K()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;

    move-result-object p1

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const/16 v9, 0xdc

    const/4 v10, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_1
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final l0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->f()Z

    move-result v4

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->g()Z

    move-result v5

    instance-of v6, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    const/4 v10, 0x1

    xor-int/2addr v6, v10

    const/16 v8, 0x8

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v9}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v3

    invoke-virtual {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->T0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v3

    invoke-virtual {v0, v3, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/step/b;->U0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->p:Lpq/c;

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->q:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v3, v4, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/g;->a(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    instance-of v3, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    const-string v4, ""

    const/4 v5, 0x0

    const-string v6, "getString(...)"

    if-eqz v3, :cond_3

    new-instance v11, Lcom/withpersona/sdk2/inquiry/document/b;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;

    move-result-object v3

    invoke-static {v3}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v12

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/document/step/b;->b0(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;)Ljava/util/List;

    move-result-object v13

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    invoke-virtual {v3}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v14

    new-instance v15, Lco/u;

    invoke-direct {v15, v0}, Lco/u;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v3, Lco/m;

    invoke-direct {v3, v0}, Lco/m;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    move-object v7, v2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->q()Z

    move-result v8

    if-eqz v8, :cond_0

    sget-object v5, Lar/s;->a:Lar/s;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v8

    invoke-virtual {v8}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v8

    invoke-static {v8}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v8

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v9

    invoke-virtual {v0, v9}, Lcom/withpersona/sdk2/inquiry/document/step/b;->c0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;

    move-result-object v9

    new-instance v10, Lco/y;

    invoke-direct {v10, v0}, Lco/y;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v8, v9, v10, v1}, Lar/s;->j(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;

    move-result-object v5

    :cond_0
    move-object/from16 v17, v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->I()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v19

    move-object/from16 v16, v3

    invoke-direct/range {v11 .. v19}, Lcom/withpersona/sdk2/inquiry/document/b;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;)V

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v1

    sget-object v3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v1, v3, :cond_14

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    iget-object v3, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->r:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;

    new-instance v12, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    sget-object v13, Lrp/i0;->a:Lrp/i0;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->E()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    move-object v15, v4

    goto :goto_0

    :cond_1
    move-object v15, v5

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->D()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v5, Lvp/g;->f:I

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_2
    move-object/from16 v16, v4

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v5, Lvp/g;->e:I

    invoke-static {v4}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->C()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->A()Ljava/lang/String;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v23

    const/16 v24, 0x382

    const/16 v25, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v17, v4

    invoke-direct/range {v12 .. v25}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;-><init>(Lrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v12}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;->a(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    move-result-object v3

    new-instance v4, Lco/b0;

    invoke-direct {v4, v0, v2}, Lco/b0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    invoke-virtual {v1, v3, v4}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    goto/16 :goto_6

    :cond_3
    instance-of v1, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const/4 v3, 0x0

    if-eqz v1, :cond_b

    move-object v1, v2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->s()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v7

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->k:Lcom/withpersona/sdk2/inquiry/document/network/e$a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v9, v11}, Lcom/withpersona/sdk2/inquiry/document/network/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/e;

    move-result-object v8

    new-instance v9, Lco/c0;

    invoke-direct {v9, v0}, Lco/c0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v7, v8, v9}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v7

    sget-object v8, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v7, v8, :cond_7

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v7

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->r:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;

    new-instance v11, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    sget-object v12, Lrp/i0;->a:Lrp/i0;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->E()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_5

    move-object v14, v4

    goto :goto_1

    :cond_5
    move-object v14, v9

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->D()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_6

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v9, Lvp/g;->f:I

    invoke-virtual {v4, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_6
    move-object v15, v4

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v9, Lvp/g;->e:I

    invoke-static {v4}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v4, v9, v13}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->C()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->A()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v22

    const/16 v23, 0x382

    const/16 v24, 0x0

    const/4 v13, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v11 .. v24}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;-><init>(Lrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v11}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;->a(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    move-result-object v4

    new-instance v6, Lco/d0;

    invoke-direct {v6, v0, v2}, Lco/d0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    invoke-virtual {v7, v4, v6}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    :cond_7
    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->f:Lk6/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->J()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->G()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->k()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->N()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v32

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->s()Z

    move-result v27

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result v6

    if-ge v4, v6, :cond_8

    move/from16 v28, v10

    goto :goto_2

    :cond_8
    move/from16 v28, v3

    :goto_2
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v4

    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_9

    move/from16 v29, v10

    goto :goto_3

    :cond_9
    move/from16 v29, v3

    :goto_3
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->r()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->i()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->t()Z

    move-result v1

    if-eqz v1, :cond_a

    sget-object v1, Lar/s;->a:Lar/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v3

    invoke-static {v3}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v4

    invoke-virtual {v0, v4}, Lcom/withpersona/sdk2/inquiry/document/step/b;->c0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;

    move-result-object v4

    new-instance v5, Lco/e0;

    invoke-direct {v5, v0}, Lco/e0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v3, v4, v5, v6}, Lar/s;->j(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;

    move-result-object v5

    :cond_a
    move-object/from16 v34, v5

    new-instance v11, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    new-instance v1, Lco/g0;

    invoke-direct {v1, v0}, Lco/g0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v3, Lco/h0;

    invoke-direct {v3, v0}, Lco/h0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v4, Lco/i0;

    invoke-direct {v4, v0}, Lco/i0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v5, Lco/f0;

    invoke-direct {v5, v0}, Lco/f0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v6, Lco/q0;

    invoke-direct {v6, v0, v2}, Lco/q0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    new-instance v7, Lco/w0;

    invoke-direct {v7, v0, v2}, Lco/w0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    new-instance v2, Lco/x0;

    invoke-direct {v2, v0}, Lco/x0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v8, Lco/y0;

    invoke-direct {v8, v0}, Lco/y0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v9, Lco/z0;

    invoke-direct {v9, v0}, Lco/z0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    move-object/from16 v19, v1

    move-object/from16 v25, v2

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v22, v5

    move-object/from16 v23, v6

    move-object/from16 v24, v7

    move-object/from16 v26, v8

    move-object/from16 v31, v9

    invoke-direct/range {v11 .. v34}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lar/p;)V

    goto/16 :goto_6

    :cond_b
    instance-of v1, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-eqz v1, :cond_12

    move-object v1, v2

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->k()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v8

    new-instance v9, Lcom/withpersona/sdk2/inquiry/document/step/b$e;

    invoke-direct {v9, v0, v7, v5}, Lcom/withpersona/sdk2/inquiry/document/step/b$e;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Ljava/lang/String;Lnt/b;)V

    invoke-virtual {v8, v7, v9}, Lvr/f;->m(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_c
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v7

    sget-object v8, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v7, v8, :cond_f

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v7

    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->r:Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;

    new-instance v11, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;

    sget-object v12, Lrp/i0;->a:Lrp/i0;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->E()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_d

    move-object v14, v4

    goto :goto_4

    :cond_d
    move-object v14, v9

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->D()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_e

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v9, Lvp/g;->f:I

    invoke-virtual {v4, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_e
    move-object v15, v4

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->g:Landroid/content/Context;

    sget v9, Lvp/g;->e:I

    invoke-static {v4}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v13

    filled-new-array {v13}, [Ljava/lang/Object;

    move-result-object v13

    invoke-virtual {v4, v9, v13}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->C()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->A()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v22

    const/16 v23, 0x382

    const/16 v24, 0x0

    const/4 v13, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v11 .. v24}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;-><init>(Lrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v11}, Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e$a;->a(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Props;)Lcom/withpersona/sdk2/inquiry/permissions/permissionRequest/e;

    move-result-object v4

    new-instance v6, Lco/a1;

    invoke-direct {v6, v0, v2}, Lco/a1;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    invoke-virtual {v7, v4, v6}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    :cond_f
    iget-object v12, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->f:Lk6/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->J()Ljava/lang/String;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->G()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->k()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->N()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->m()Ljava/util/List;

    move-result-object v17

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v32

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    invoke-virtual {v2}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v18

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->r()Z

    move-result v27

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result v4

    if-ge v2, v4, :cond_10

    move/from16 v28, v10

    goto :goto_5

    :cond_10
    move/from16 v28, v3

    :goto_5
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->q()Ljava/lang/String;

    move-result-object v30

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->i()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->s()Z

    move-result v1

    if-eqz v1, :cond_11

    sget-object v1, Lar/s;->a:Lar/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v2

    invoke-static {v2}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/withpersona/sdk2/inquiry/document/step/b;->c0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;)Ljava/util/List;

    move-result-object v3

    new-instance v4, Lco/b1;

    invoke-direct {v4, v0}, Lco/b1;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v2, v3, v4, v5}, Lar/s;->j(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;

    move-result-object v5

    :cond_11
    move-object/from16 v34, v5

    new-instance v11, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    new-instance v1, Lco/k;

    invoke-direct {v1, v0}, Lco/k;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v2, Lco/l;

    invoke-direct {v2, v0}, Lco/l;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v3, Lco/n;

    invoke-direct {v3, v0}, Lco/n;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v4, Lco/o;

    invoke-direct {v4, v0}, Lco/o;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v23, Lco/p;

    invoke-direct/range {v23 .. v23}, Lco/p;-><init>()V

    new-instance v24, Lco/q;

    invoke-direct/range {v24 .. v24}, Lco/q;-><init>()V

    new-instance v5, Lco/r;

    invoke-direct {v5, v0}, Lco/r;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v6, Lco/s;

    invoke-direct {v6, v0}, Lco/s;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v7, Lco/t;

    invoke-direct {v7, v0}, Lco/t;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    const/16 v29, 0x0

    move-object/from16 v19, v1

    move-object/from16 v20, v2

    move-object/from16 v21, v3

    move-object/from16 v22, v4

    move-object/from16 v25, v5

    move-object/from16 v26, v6

    move-object/from16 v31, v7

    invoke-direct/range {v11 .. v34}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lar/p;)V

    goto/16 :goto_6

    :cond_12
    instance-of v1, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    if-eqz v1, :cond_15

    invoke-virtual {v0}, Lvr/c;->d()Lvr/f;

    move-result-object v1

    iget-object v2, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->n:Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->r()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->q()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->p()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v7, p2

    check-cast v7, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    invoke-virtual {v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;->m()Ljava/util/List;

    move-result-object v7

    invoke-virtual/range {v2 .. v7}, Lcom/withpersona/sdk2/inquiry/document/network/g$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/g;

    move-result-object v2

    new-instance v3, Lco/v;

    invoke-direct {v3, v0}, Lco/v;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual {v1, v2, v3}, Lvr/f;->n(Lvr/h;Lkotlin/jvm/functions/Function1;)V

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v4 .. v10}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->j()Lcom/withpersona/sdk2/inquiry/steps/ui/CustomPendingPage;

    move-result-object v1

    if-eqz v1, :cond_13

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;

    invoke-static {v1}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v3

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v5

    new-instance v6, Lco/w;

    invoke-direct {v6, v0}, Lco/w;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v7, Lco/x;

    invoke-direct {v7, v0}, Lco/x;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->w()Ljava/lang/String;

    move-result-object v8

    const/16 v10, 0x40

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$b;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lar/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v2

    goto :goto_6

    :cond_13
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->z()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->v()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;->getPendingPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;

    move-result-object v10

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/step/b;->o:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->x()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v11

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->w()Ljava/lang/String;

    move-result-object v12

    new-instance v3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;

    new-instance v7, Lco/z;

    invoke-direct {v7, v0}, Lco/z;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    new-instance v8, Lco/a0;

    invoke-direct {v8, v0}, Lco/a0;-><init>(Lcom/withpersona/sdk2/inquiry/document/step/b;)V

    const/16 v14, 0x200

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v3 .. v15}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Lar/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v3

    :cond_14
    :goto_6
    invoke-virtual {v0}, Lvr/c;->c()Lnu/c0;

    move-result-object v1

    invoke-interface {v1, v11}, Lnu/c0;->setValue(Ljava/lang/Object;)V

    return-void

    :cond_15
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1
.end method
