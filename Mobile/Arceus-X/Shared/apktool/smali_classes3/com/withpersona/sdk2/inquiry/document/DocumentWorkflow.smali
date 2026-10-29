.class public final Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;
.super Lym/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;,
        Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lym/k<",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008&\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0006F`aHbJBq\u0008\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J7\u0010&\u001a\u00020%*\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00012\u0006\u0010$\u001a\u00020#H\u0002\u00a2\u0006\u0004\u0008&\u0010\'JU\u0010/\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u00020(2\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008/\u00100JU\u00102\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020%0-0+0**\u0002012\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u00082\u00103JG\u00107\u001a\u00020%*\u0002042\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u00087\u00108JG\u0010:\u001a\u00020%*\u0002092\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0002\u00a2\u0006\u0004\u0008:\u0010;J!\u0010?\u001a\u00020\u00032\u0006\u0010<\u001a\u00020\u00022\u0008\u0010>\u001a\u0004\u0018\u00010=H\u0016\u00a2\u0006\u0004\u0008?\u0010@J\u0017\u0010B\u001a\u00020=2\u0006\u0010A\u001a\u00020\u0003H\u0016\u00a2\u0006\u0004\u0008B\u0010CJC\u0010D\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00022\u0006\u00106\u001a\u00020\u00032\"\u0010)\u001a\u001e0\"R\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0016\u00a2\u0006\u0004\u0008D\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008F\u0010GR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008H\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010KR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008L\u0010MR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008N\u0010OR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008P\u0010QR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008R\u0010SR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008T\u0010UR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008V\u0010WR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\\\u0010]R\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008^\u0010_\u00a8\u0006c"
    }
    d2 = {
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
        "",
        "Lk6/s;",
        "imageLoader",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
        "permissionRequestWorkflow",
        "Lcom/withpersona/sdk2/inquiry/document/a;",
        "documentCameraWorker",
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        "documentsSelectWorkerFactory",
        "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
        "documentCreateWorker",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
        "documentLoadWorker",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
        "documentFileUploadWorker",
        "Lbo/a$a;",
        "documentFileDeleteWorker",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
        "documentSubmitWorker",
        "Luq/a;",
        "navigationStateManager",
        "Lpq/c;",
        "externalEventLogger",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "trackingEventsLogger",
        "<init>",
        "(Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V",
        "Lym/k$a;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;",
        "event",
        "",
        "K0",
        "(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;",
        "context",
        "",
        "Lkotlin/Pair;",
        "",
        "Lkotlin/Function1;",
        "Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;",
        "A0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lym/k$a;)Ljava/util/List;",
        "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;",
        "B0",
        "(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lym/k$a;)Ljava/util/List;",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
        "renderProps",
        "renderState",
        "H1",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V",
        "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
        "I1",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V",
        "props",
        "Lym/i;",
        "snapshot",
        "J0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
        "state",
        "a2",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lym/i;",
        "V0",
        "(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)Ljava/lang/Object;",
        "a",
        "Lk6/s;",
        "b",
        "Landroid/content/Context;",
        "c",
        "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;",
        "d",
        "Lcom/withpersona/sdk2/inquiry/document/a;",
        "e",
        "Lcom/withpersona/sdk2/inquiry/document/i$b;",
        "f",
        "Lcom/withpersona/sdk2/inquiry/document/network/a$a;",
        "g",
        "Lcom/withpersona/sdk2/inquiry/document/network/e$a;",
        "h",
        "Lcom/withpersona/sdk2/inquiry/document/network/c$a;",
        "i",
        "Lbo/a$a;",
        "j",
        "Lcom/withpersona/sdk2/inquiry/document/network/g$a;",
        "k",
        "Luq/a;",
        "l",
        "Lpq/c;",
        "m",
        "Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;",
        "Input",
        "StartPage",
        "State",
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
.field public final a:Lk6/s;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lcom/withpersona/sdk2/inquiry/document/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lcom/withpersona/sdk2/inquiry/document/i$b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lcom/withpersona/sdk2/inquiry/document/network/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final g:Lcom/withpersona/sdk2/inquiry/document/network/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final h:Lcom/withpersona/sdk2/inquiry/document/network/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final i:Lbo/a$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/withpersona/sdk2/inquiry/document/network/g$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lpq/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lk6/s;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/document/a;Lcom/withpersona/sdk2/inquiry/document/i$b;Lcom/withpersona/sdk2/inquiry/document/network/a$a;Lcom/withpersona/sdk2/inquiry/document/network/e$a;Lcom/withpersona/sdk2/inquiry/document/network/c$a;Lbo/a$a;Lcom/withpersona/sdk2/inquiry/document/network/g$a;Luq/a;Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;)V
    .locals 1
    .param p1    # Lk6/s;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lcom/withpersona/sdk2/inquiry/document/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lcom/withpersona/sdk2/inquiry/document/i$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lcom/withpersona/sdk2/inquiry/document/network/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lcom/withpersona/sdk2/inquiry/document/network/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p8    # Lcom/withpersona/sdk2/inquiry/document/network/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p9    # Lbo/a$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p10    # Lcom/withpersona/sdk2/inquiry/document/network/g$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p11    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p12    # Lpq/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p13    # Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "imageLoader"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "permissionRequestWorkflow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentCameraWorker"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentsSelectWorkerFactory"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentCreateWorker"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentLoadWorker"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentFileUploadWorker"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentFileDeleteWorker"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "documentSubmitWorker"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "externalEventLogger"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trackingEventsLogger"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lym/k;-><init>()V

    iput-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->a:Lk6/s;

    iput-object p2, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    iput-object p3, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    iput-object p4, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->d:Lcom/withpersona/sdk2/inquiry/document/a;

    iput-object p5, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->e:Lcom/withpersona/sdk2/inquiry/document/i$b;

    iput-object p6, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->f:Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    iput-object p7, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->g:Lcom/withpersona/sdk2/inquiry/document/network/e$a;

    iput-object p8, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->h:Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    iput-object p9, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->i:Lbo/a$a;

    iput-object p10, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->j:Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    iput-object p11, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    iput-object p12, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->l:Lpq/c;

    iput-object p13, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    return-void
.end method

.method public static synthetic A(Lcom/withpersona/sdk2/inquiry/document/network/e$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->D1(Lcom/withpersona/sdk2/inquiry/document/network/e$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final A1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzn/r0;

    invoke-direct {v0, p2, p0, p1}, Lzn/r0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->F1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final B1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object p0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->d:Lcom/withpersona/sdk2/inquiry/document/a;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v0, Lvp/g;->b:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/a;->e(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    :goto_1
    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic C(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->u1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final C0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final C1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/e$b;)Lym/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lzn/e1;

    invoke-direct {v0, p1}, Lzn/e1;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/e$b;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lzn/f1;

    invoke-direct {v0, p1}, Lzn/f1;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/e$b;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic D(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->N0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final D0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final D1(Lcom/withpersona/sdk2/inquiry/document/network/e$b;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

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
    new-instance v5, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v5, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$b;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

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
    invoke-static {p0, v2}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

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

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic E(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->C0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final E0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final E1(Lcom/withpersona/sdk2/inquiry/document/network/e$b;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/e$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic F(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->q1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final F0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final F1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic G(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->e1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final G0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final G1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic H(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->a1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final H0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic I(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->Z0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final I0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic J(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->I0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final J1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lym/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/document/a$b$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lzn/z1;

    invoke-direct {v0, p2, p1}, Lzn/z1;-><init>(Lcom/withpersona/sdk2/inquiry/document/a$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/a$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/a$b$a;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lzn/a2;

    invoke-direct {p1}, Lzn/a2;-><init>()V

    invoke-static {p0, v2, p1, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic K(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->T1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final K1(Lcom/withpersona/sdk2/inquiry/document/a$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v5

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/a$b$b;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/a$b$b;->a()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;->c:Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v6}, Lkotlin/collections/CollectionsKt;->x0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    const/16 v10, 0xf4

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p2, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic L(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->U0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final L0(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$b;

    invoke-virtual {p0, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final L1(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic M(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->j1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final M0(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$a;

    invoke-virtual {p0, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final M1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lym/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/document/i$c$c;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lzn/b2;

    invoke-direct {p2, p3, p1}, Lzn/b2;-><init>(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p3, Lcom/withpersona/sdk2/inquiry/document/i$c$b;

    if-eqz v0, :cond_1

    new-instance p2, Lzn/c2;

    invoke-direct {p2, p3, p1, p0}, Lzn/c2;-><init>(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;)V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    sget-object p1, Lcom/withpersona/sdk2/inquiry/document/i$c$a;->a:Lcom/withpersona/sdk2/inquiry/document/i$c$a;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lzn/d2;

    invoke-direct {p1, p2}, Lzn/d2;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    invoke-static {p0, v2, p1, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic N(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->n1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final N0(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final N1(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v5

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/i$c$c;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/i$c$c;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/g;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

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

    invoke-virtual {p2, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic O(Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->X1(Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final O0(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->e:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final O1(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v5

    invoke-virtual {p3}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/i$c$b;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/i$c$b;->a()Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/g;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p1

    invoke-static {p0, p1}, Lkotlin/collections/CollectionsKt;->H0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v2

    invoke-virtual {p3}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object v3

    iget-object p0, p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

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

    invoke-virtual {p3, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic P(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->F0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final P0(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    sget-object v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final P1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p0, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Q(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->y1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Q0(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Q1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lym/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v0, Lzn/s1;

    invoke-direct {v0, p1}, Lzn/s1;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/a$b;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lzn/u1;

    invoke-direct {v0, p1}, Lzn/u1;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/a$b;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic R(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->G0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final R0(Lym/r$c;)Lkotlin/Unit;
    .locals 2

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final R1(Lcom/withpersona/sdk2/inquiry/document/network/a$b;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$b;->a()Ljava/lang/String;

    move-result-object v3

    const/16 v6, 0xc

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic S(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->g1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final S0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    move-result-object v5

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final S1(Lcom/withpersona/sdk2/inquiry/document/network/a$b;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object v0

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;->isRecoverable()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/a$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo$NetworkErrorInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic T(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->Y1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final T0(Lym/r$c;)Lkotlin/Unit;
    .locals 13

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    if-eqz v1, :cond_0

    move-object v2, v0

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

    move-result-object v0

    invoke-virtual {p0, v0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final T1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)Lym/r;
    .locals 9

    const-string v0, "response"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lzn/v1;

    invoke-direct {p2, p1, p4}, Lzn/v1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p4, Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;

    if-eqz v0, :cond_1

    new-instance p1, Lzn/w1;

    invoke-direct {p1, p2, p4}, Lzn/w1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/network/c$b;)V

    invoke-static {p0, v2, p1, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p4, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    if-eqz v0, :cond_2

    new-instance v3, Lzn/x1;

    move-object v7, p0

    move-object v5, p1

    move-object v4, p2

    move-object v8, p3

    move-object v6, p4

    invoke-direct/range {v3 .. v8}, Lzn/x1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    invoke-static {v7, v2, v3, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_2
    move-object v7, p0

    move-object v6, p4

    instance-of p0, v6, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;

    if-eqz p0, :cond_3

    new-instance p0, Lzn/y1;

    invoke-direct {p0, v6}, Lzn/y1;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/c$b;)V

    invoke-static {v7, v2, p0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_3
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic U(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/e$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->C1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/e$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final U0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;->a()Ljava/lang/String;

    move-result-object v3

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v1}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final U1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    move-object v2, p1

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->b()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$d;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    move-result-object v1

    :cond_0
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    :cond_3
    if-ge v0, p1, :cond_4

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v0, v0, 0x1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v1, v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v1, :cond_3

    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    :goto_1
    move-object v2, p1

    goto :goto_3

    :cond_4
    :goto_2
    new-instance p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    goto :goto_1

    :goto_3
    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p2, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic V(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->t1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final V1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;
    .locals 11

    const-string v0, "$this$action"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v2, v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v2, :cond_0

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v5, v1

    check-cast v5, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$c;->a()I

    move-result v8

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->f(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/CaptureMethod;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    move-result-object v1

    :cond_0
    invoke-interface {v4, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p2}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v2

    const/16 v6, 0xa

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p2, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic W(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->D0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final W0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final W1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 13

    move-object/from16 v0, p5

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->m()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, p0}, Lkotlin/collections/CollectionsKt;->v0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    move-object p0, v3

    check-cast p0, Ljava/lang/Iterable;

    instance-of v1, p0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v1, v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v1, :cond_1

    new-instance p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    :goto_0
    move-object v6, p0

    goto :goto_2

    :cond_2
    :goto_1
    new-instance p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    move-object v1, p1

    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    goto :goto_0

    :goto_2
    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object p0

    instance-of v8, p0, Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse$FileLimitExceededError;

    new-instance v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;

    move-result-object p0

    move-object/from16 p1, p3

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    move-object/from16 p2, p4

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/g;->c(Lcom/withpersona/sdk2/inquiry/network/core/GenericFileUploadErrorResponse$DocumentErrorResponse;Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)Ljava/lang/String;

    move-result-object v10

    const/16 v11, 0x50

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v12}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;-><init>(Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic X(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->c1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final X0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final X1(Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/c$b$b;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic Y(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->h1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Y0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Y1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)Lym/r;
    .locals 1

    const-string v0, "response"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzn/f2;

    invoke-direct {v0, p1, p2, p3}, Lzn/f2;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lcom/withpersona/sdk2/inquiry/document/a$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K1(Lcom/withpersona/sdk2/inquiry/document/a$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final Z0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final Z1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;Lym/r$c;)Lkotlin/Unit;
    .locals 12

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lym/r$c;->c()Ljava/lang/Object;

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

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->v0(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object p0, v2

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    if-eqz v0, :cond_2

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_3

    :cond_2
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile;

    instance-of v0, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v0, :cond_3

    new-instance p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;-><init>(Ljava/lang/String;)V

    :goto_2
    move-object v5, p0

    goto :goto_4

    :cond_4
    :goto_3
    new-instance p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$DeleteFiles;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :goto_4
    instance-of p0, p2, Lbo/a$b$b;

    if-eqz p0, :cond_5

    const/16 v10, 0xe6

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile;ZZLjava/lang/String;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_5

    :cond_5
    instance-of p0, p2, Lbo/a$b$a;

    if-eqz p0, :cond_6

    new-instance p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p2, Lbo/a$b$a;

    invoke-virtual {p2}, Lbo/a$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p3, p0}, Lym/r$c;->d(Ljava/lang/Object;)V

    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_6
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic a0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->s1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final a1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 1

    const-string v0, "document"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)V

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic b0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->p1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final b1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;
    .locals 1

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object p2

    invoke-direct {v0, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic c0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->d1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final c1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic d0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->L1(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final d1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic e0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->i1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final e1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic f0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->R0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final f1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzn/y0;

    invoke-direct {v0, p2, p0, p1}, Lzn/y0;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->M1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/document/i$c;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final g1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object p0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->d:Lcom/withpersona/sdk2/inquiry/document/a;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v0, Lvp/g;->b:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/a;->e(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    :goto_1
    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic h(Lcom/withpersona/sdk2/inquiry/document/network/a$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->R1(Lcom/withpersona/sdk2/inquiry/document/network/a$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->L0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final h1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic i(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->z1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i0(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->M0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic j(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->w1(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j0()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->o1()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static final j1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic k(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->W0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final k1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic l(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->N1(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final l1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic m(Lcom/withpersona/sdk2/inquiry/document/network/a$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->S1(Lcom/withpersona/sdk2/inquiry/document/network/a$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->E0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final m1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic n(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->B1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->l1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final n1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic o(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->O0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->X0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final o1()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static synthetic p(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->m1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p0(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->O1(Lcom/withpersona/sdk2/inquiry/document/i$c;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic q(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->P0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->H0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/steps/ui/components/UiComponent;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final q1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic r(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->S0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->J1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/a$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final r1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic s(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->r1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s0(Lcom/withpersona/sdk2/inquiry/document/network/e$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->E1(Lcom/withpersona/sdk2/inquiry/document/network/e$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final s1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzn/g1;

    invoke-direct {v0, p2, p0, p1}, Lzn/g1;-><init>(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const/4 p1, 0x1

    const/4 p2, 0x0

    invoke-static {p0, p2, v0, p1, p2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t(Lcom/withpersona/sdk2/inquiry/document/network/g$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->x1(Lcom/withpersona/sdk2/inquiry/document/network/g$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic t0(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->V1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final t1(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;->a()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;

    move-result-object p0

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;->f()Lrp/j1;

    move-result-object p0

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 p1, 0x2

    if-eq p0, p1, :cond_1

    const/4 p1, 0x3

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    iget-object p0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->d:Lcom/withpersona/sdk2/inquiry/document/a;

    iget-object p1, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v0, Lvp/g;->b:I

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "getString(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/a;->e(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_3

    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->c:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    goto :goto_1

    :cond_3
    sget-object p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    invoke-virtual {p2, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->a(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p0

    :goto_1
    invoke-virtual {p3, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic u(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->Q0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic u0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->Q1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/a$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final u1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic v(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->U1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic v0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/g$b;)Lym/r;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->v1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/g$b;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final v1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/network/g$b;)Lym/r;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;->a:Lcom/withpersona/sdk2/inquiry/document/network/g$b$b;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p1, Lzn/c1;

    invoke-direct {p1}, Lzn/c1;-><init>()V

    invoke-static {p0, v2, p1, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;

    if-eqz v0, :cond_1

    new-instance v0, Lzn/d1;

    invoke-direct {v0, p1}, Lzn/d1;-><init>(Lcom/withpersona/sdk2/inquiry/document/network/g$b;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljt/l;

    invoke-direct {p0}, Ljt/l;-><init>()V

    throw p0
.end method

.method public static synthetic w(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->P1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic w0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->f1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final w1(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$d;

    invoke-virtual {p0, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic x(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->Z1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lbo/a$b;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic x0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->Y0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final x1(Lcom/withpersona/sdk2/inquiry/document/network/g$b;Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;

    check-cast p0, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/document/network/g$b$a;->a()Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b$c;-><init>(Lcom/withpersona/sdk2/inquiry/network/core/InternalErrorInfo;)V

    invoke-virtual {p1, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic y(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->T0(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->A1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$Output;)Lym/r;

    move-result-object p0

    return-object p0
.end method

.method public static final y1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic z(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->W1(Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/network/c$b;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->G1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final z1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-virtual {p0, p1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final A0(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lym/k$a;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
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

    new-instance v2, Lzn/n0;

    invoke-direct {v2, p0, p2}, Lzn/n0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lzn/o0;

    invoke-direct {v2, p0, p2}, Lzn/o0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->i()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lzn/p0;

    invoke-direct {v2, p0, p2}, Lzn/p0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lzn/q0;

    invoke-direct {v1, p0, p2}, Lzn/q0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->b()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final B0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lym/k$a;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
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

    new-instance v2, Lzn/s0;

    invoke-direct {v2, p0, p2}, Lzn/s0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->g()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lzn/t0;

    invoke-direct {v2, p0, p2}, Lzn/t0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object v0

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->i()Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lzn/u0;

    invoke-direct {v1, p0, p2}, Lzn/u0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v0, p1, v1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep$a;->b()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final H1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)V"
        }
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$d;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_4

    const/4 v0, 0x3

    const-string v1, ""

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
    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object p1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->d:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->e:Lcom/withpersona/sdk2/inquiry/document/i$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/i$b;->c()Lcom/withpersona/sdk2/inquiry/document/i;

    move-result-object p1

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->e:Lcom/withpersona/sdk2/inquiry/document/i$b;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/i$b;->e()Lcom/withpersona/sdk2/inquiry/document/i;

    move-result-object p1

    :goto_1
    new-instance v0, Lzn/w0;

    invoke-direct {v0, p0, p2, p3}, Lzn/w0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const-class p2, Lcom/withpersona/sdk2/inquiry/document/i;

    invoke-static {p2}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object p2

    invoke-static {p4, p1, p2, v1, v0}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_3
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->d:Lcom/withpersona/sdk2/inquiry/document/a;

    new-instance p3, Lzn/v0;

    invoke-direct {p3, p0, p2}, Lzn/v0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    const-class p2, Lcom/withpersona/sdk2/inquiry/document/a;

    invoke-static {p2}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object p2

    invoke-static {p4, p1, p2, v1, p3}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_4
    return-void
.end method

.method public final I1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)V"
        }
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$CreateDocument;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_1

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->k()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object p1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->f:Lcom/withpersona/sdk2/inquiry/document/network/a$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->s()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->o()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result p2

    invoke-virtual {p1, p3, v0, v2, p2}, Lcom/withpersona/sdk2/inquiry/document/network/a$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/withpersona/sdk2/inquiry/document/network/a;

    move-result-object p1

    new-instance p2, Lzn/z0;

    invoke-direct {p2, p0}, Lzn/z0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;)V

    const-class p3, Lcom/withpersona/sdk2/inquiry/document/network/a;

    invoke-static {p3}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object p3

    invoke-static {p4, p1, p3, v1, p2}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    const/4 v2, 0x0

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

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;

    if-eqz v3, :cond_2

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_4

    new-instance p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$f;

    invoke-direct {p2, p4, p0, p1, v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$f;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lnt/b;)V

    const-string p1, "upload_complete"

    invoke-virtual {p4, p1, p2}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

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

    iget-object v1, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->h:Lcom/withpersona/sdk2/inquiry/document/network/c$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v2

    move-object v3, p1

    check-cast v3, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$UploadFiles;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_5

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    invoke-virtual {v1, v2, v3, v0, v5}, Lcom/withpersona/sdk2/inquiry/document/network/c$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Z)Lcom/withpersona/sdk2/inquiry/document/network/c;

    move-result-object v1

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lzn/a1;

    invoke-direct {v3, p0, p1, v0, p2}, Lzn/a1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Local;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;)V

    const-class v0, Lcom/withpersona/sdk2/inquiry/document/network/c;

    invoke-static {v0}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v0

    invoke-static {p4, v1, v0, v2, v3}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

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

    instance-of v3, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    if-eqz v3, :cond_8

    move-object v2, v0

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;

    :cond_8
    if-nez v2, :cond_a

    :cond_9
    :goto_3
    return-void

    :cond_a
    iget-object v0, p0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->i:Lbo/a$a;

    invoke-virtual {p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v0, p2, p3, v2}, Lbo/a$a;->a(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;)Lbo/a;

    move-result-object p2

    new-instance p3, Lzn/b1;

    invoke-direct {p3, p0, v2, p1}, Lzn/b1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentFile$Remote;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;)V

    const-class p1, Lbo/a;

    invoke-static {p1}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object p1

    invoke-static {p4, p2, p1, v1, p3}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

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

.method public J0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
    .locals 11
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lym/i;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "props"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lym/i;->b()Lxu/h;

    move-result-object p2

    invoke-virtual {p2}, Lxu/h;->I()I

    move-result v0

    const/4 v1, 0x0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p2, v1

    :goto_0
    const/4 v0, 0x0

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    move-result-object v1

    const-string v2, "obtain()"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lxu/h;->O()[B

    move-result-object p2

    array-length v2, p2

    invoke-virtual {v1, p2, v0, v2}, Landroid/os/Parcel;->unmarshall([BII)V

    invoke-virtual {v1, v0}, Landroid/os/Parcel;->setDataPosition(I)V

    const-class p2, Lym/i;

    invoke-virtual {p2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p2

    invoke-virtual {v1, p2}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    const-string v2, "parcel.readParcelable<T>\u2026class.java.classLoader)!!"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    move-object v1, p2

    :goto_1
    check-cast v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    if-eqz v1, :cond_2

    invoke-virtual {v1, v0}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->f(Z)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p2

    if-eqz p2, :cond_2

    return-object p2

    :cond_2
    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->K()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage;

    move-result-object p2

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Prompt;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    invoke-virtual {p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->n()Ljava/lang/String;

    move-result-object v4

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_3
    instance-of p2, p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$StartPage$Review;

    if-eqz p2, :cond_4

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

    :cond_4
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public final K0(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;",
            ")V"
        }
    .end annotation

    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$b;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lzn/h1;

    invoke-direct {p2}, Lzn/h1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto/16 :goto_0

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$a;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance p2, Lzn/j1;

    invoke-direct {p2}, Lzn/j1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto/16 :goto_0

    :cond_1
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$g;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance p2, Lzn/k1;

    invoke-direct {p2}, Lzn/k1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto/16 :goto_0

    :cond_2
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$h;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p2, Lzn/l1;

    invoke-direct {p2}, Lzn/l1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto :goto_0

    :cond_3
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$j;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance p2, Lzn/m1;

    invoke-direct {p2}, Lzn/m1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto :goto_0

    :cond_4
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$e;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance p2, Lzn/n1;

    invoke-direct {p2}, Lzn/n1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto :goto_0

    :cond_5
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$c;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    new-instance p2, Lzn/o1;

    invoke-direct {p2}, Lzn/o1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto :goto_0

    :cond_6
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$f;

    if-eqz v0, :cond_7

    new-instance v0, Lzn/p1;

    invoke-direct {v0, p2}, Lzn/p1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto :goto_0

    :cond_7
    sget-object v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;->a:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$d;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    new-instance p2, Lzn/q1;

    invoke-direct {p2}, Lzn/q1;-><init>()V

    invoke-static {p0, v2, p2, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    goto :goto_0

    :cond_8
    instance-of v0, p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a$i;

    if-eqz v0, :cond_9

    new-instance v0, Lzn/r1;

    invoke-direct {v0, p2}, Lzn/r1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$a;)V

    invoke-static {p0, v2, v0, v1, v2}, Lym/w;->g(Lym/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p2

    :goto_0
    invoke-virtual {p1}, Lym/k$a;->d()Lym/h;

    move-result-object p1

    invoke-interface {p1, p2}, Lym/h;->a(Ljava/lang/Object;)V

    return-void

    :cond_9
    new-instance p1, Ljt/l;

    invoke-direct {p1}, Ljt/l;-><init>()V

    throw p1
.end method

.method public V0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)Ljava/lang/Object;
    .locals 48
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    const-string v4, "renderProps"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "renderState"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "context"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->f()Z

    move-result v6

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->g()Z

    move-result v7

    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    const/4 v12, 0x1

    xor-int/lit8 v8, v4, 0x1

    const/16 v10, 0x8

    const/4 v11, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v11}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v4

    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->H1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v4

    invoke-virtual {v0, v4, v1, v2, v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->I1(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)V

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->l:Lpq/c;

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->m:Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;

    invoke-static {v4, v5, v1, v2}, Lcom/withpersona/sdk2/inquiry/document/g;->a(Lpq/c;Lcom/withpersona/sdk2/inquiry/tracking/TrackingEventsLogger;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    const-string v5, ""

    const-string v6, "getString(...)"

    if-eqz v4, :cond_4

    new-instance v13, Lcom/withpersona/sdk2/inquiry/document/b;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;

    move-result-object v4

    invoke-static {v4}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v14

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->a()Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;

    move-result-object v4

    invoke-virtual {v0, v4, v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->A0(Lcom/withpersona/sdk2/inquiry/document/DocumentStartPage;Lym/k$a;)Ljava/util/List;

    move-result-object v15

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v16

    new-instance v4, Lzn/q;

    invoke-direct {v4, v0, v3}, Lzn/q;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v8, Lzn/s;

    invoke-direct {v8, v0, v3}, Lzn/s;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->I()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v21

    const/16 v22, 0x20

    const/16 v23, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v4

    move-object/from16 v18, v8

    invoke-direct/range {v13 .. v23}, Lcom/withpersona/sdk2/inquiry/document/b;-><init>(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lar/p;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v2

    check-cast v4, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->q()Z

    move-result v8

    if-eqz v8, :cond_0

    sget-object v8, Lar/s;->a:Lar/s;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v9

    invoke-static {v9}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v10

    invoke-virtual {v0, v10, v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->B0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lym/k$a;)Ljava/util/List;

    move-result-object v10

    new-instance v11, Lzn/e0;

    invoke-direct {v11, v0, v3}, Lzn/e0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v14

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v14

    invoke-virtual {v14}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v9, v10, v11, v14}, Lar/s;->j(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;

    move-result-object v8

    const-string v9, "document_upload_options_dialog"

    invoke-static {v8, v13, v9}, Lop/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lop/c;

    move-result-object v13

    :cond_0
    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$Start;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v4

    sget-object v8, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v4, v8, :cond_1

    goto :goto_0

    :cond_1
    const/4 v12, 0x0

    :goto_0
    sget-object v4, Lrp/i0;->a:Lrp/i0;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->E()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_1

    :cond_2
    move-object v5, v7

    :goto_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->D()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_3

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v8, Lvp/g;->f:I

    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_3
    iget-object v8, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v9, Lvp/g;->e:I

    invoke-static {v8}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->C()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->A()Ljava/lang/String;

    move-result-object v10

    iget-object v14, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v15

    new-instance v1, Lzn/f0;

    invoke-direct {v1, v0, v2}, Lzn/f0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const/16 v18, 0x4e08

    const/16 v19, 0x0

    move-object v6, v5

    const/4 v5, 0x0

    const/4 v11, 0x0

    move v3, v12

    const/4 v12, 0x0

    move-object/from16 v17, v1

    move-object v1, v13

    const/4 v13, 0x0

    const/16 v16, 0x0

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v19}, Lcom/withpersona/sdk2/inquiry/permissions/g;->e(Ljava/lang/Object;Lym/k$a;ZLrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lop/c;

    move-result-object v1

    return-object v1

    :cond_4
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    const-string v8, "document_upload_screen"

    if-eqz v4, :cond_c

    move-object/from16 v21, v2

    check-cast v21, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->s()Z

    move-result v4

    if-eqz v4, :cond_5

    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->g:Lcom/withpersona/sdk2/inquiry/document/network/e$a;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v9, v10}, Lcom/withpersona/sdk2/inquiry/document/network/e$a;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/withpersona/sdk2/inquiry/document/network/e;

    move-result-object v4

    new-instance v9, Lzn/g0;

    invoke-direct {v9, v0}, Lzn/g0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;)V

    const-class v10, Lcom/withpersona/sdk2/inquiry/document/network/e;

    invoke-static {v10}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v10

    invoke-static {v3, v4, v10, v5, v9}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    :cond_5
    iget-object v4, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->a:Lk6/s;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->J()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->G()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->k()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->N()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v28

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v43

    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    invoke-virtual {v9}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v29

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->s()Z

    move-result v38

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result v10

    if-ge v9, v10, :cond_6

    move/from16 v39, v12

    goto :goto_2

    :cond_6
    const/16 v39, 0x0

    :goto_2
    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->m()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-nez v9, :cond_7

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->n()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState;

    move-result-object v9

    new-instance v10, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->k()Ljava/lang/String;

    move-result-object v11

    invoke-direct {v10, v11}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadState$ReadyToSubmit;-><init>(Ljava/lang/String;)V

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    move/from16 v40, v12

    goto :goto_3

    :cond_7
    const/16 v40, 0x0

    :goto_3
    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->r()Ljava/lang/String;

    move-result-object v41

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->i()Ljava/lang/String;

    move-result-object v44

    new-instance v22, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    new-instance v9, Lzn/h0;

    invoke-direct {v9, v0, v3}, Lzn/h0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v10, Lzn/i0;

    invoke-direct {v10, v0, v3}, Lzn/i0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v11, Lzn/j0;

    invoke-direct {v11, v0, v3}, Lzn/j0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v13, Lzn/k0;

    invoke-direct {v13, v0, v3}, Lzn/k0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v14, Lzn/l0;

    invoke-direct {v14, v0, v3, v2}, Lzn/l0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    new-instance v15, Lzn/b0;

    invoke-direct {v15, v0, v3, v2}, Lzn/b0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    new-instance v7, Lzn/m0;

    invoke-direct {v7, v0, v3}, Lzn/m0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v12, Lzn/x0;

    invoke-direct {v12, v0, v3}, Lzn/x0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v1, Lzn/i1;

    invoke-direct {v1, v0, v3}, Lzn/i1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    const/high16 v46, 0x400000

    const/16 v47, 0x0

    const/16 v45, 0x0

    move-object/from16 v42, v1

    move-object/from16 v23, v4

    move-object/from16 v36, v7

    move-object/from16 v30, v9

    move-object/from16 v31, v10

    move-object/from16 v32, v11

    move-object/from16 v37, v12

    move-object/from16 v33, v13

    move-object/from16 v34, v14

    move-object/from16 v35, v15

    invoke-direct/range {v22 .. v47}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lar/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v1

    sget-object v4, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v1, v4, :cond_8

    const/4 v4, 0x1

    :goto_4
    move-object v1, v5

    goto :goto_5

    :cond_8
    const/4 v4, 0x0

    goto :goto_4

    :goto_5
    sget-object v5, Lrp/i0;->a:Lrp/i0;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->E()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_9

    move-object v7, v1

    :cond_9
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->D()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_a

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v9, Lvp/g;->f:I

    invoke-virtual {v1, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_a
    iget-object v9, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v10, Lvp/g;->e:I

    invoke-static {v9}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-virtual {v9, v10, v11}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->C()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->A()Ljava/lang/String;

    move-result-object v11

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v16

    new-instance v6, Lzn/t1;

    invoke-direct {v6, v0, v2}, Lzn/t1;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const/16 v19, 0x4e08

    const/16 v20, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object v2, v8

    move-object v8, v1

    move-object v1, v2

    move-object/from16 v2, v22

    invoke-static/range {v2 .. v20}, Lcom/withpersona/sdk2/inquiry/permissions/g;->e(Ljava/lang/Object;Lym/k$a;ZLrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lop/c;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCaptures;->t()Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Lar/s;->a:Lar/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v5

    invoke-static {v5}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v6

    invoke-virtual {v0, v6, v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->B0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lym/k$a;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lzn/e2;

    invoke-direct {v7, v0, v3}, Lzn/e2;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v5, v6, v7, v3}, Lar/s;->j(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;

    move-result-object v3

    invoke-static {v3, v2, v1}, Lop/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lop/c;

    move-result-object v1

    return-object v1

    :cond_b
    new-instance v3, Lop/c;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v2, v4, v1}, Lop/c;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V

    return-object v3

    :cond_c
    move-object v1, v5

    move-object v4, v8

    instance-of v5, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    if-eqz v5, :cond_13

    move-object/from16 v21, v2

    check-cast v21, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->k()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_d

    new-instance v7, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;

    const/4 v8, 0x0

    invoke-direct {v7, v3, v0, v5, v8}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$e;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Ljava/lang/String;Lnt/b;)V

    invoke-virtual {v3, v5, v7}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    :cond_d
    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->a:Lk6/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->J()Ljava/lang/String;

    move-result-object v24

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->G()Ljava/lang/String;

    move-result-object v25

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->k()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->N()Ljava/lang/String;

    move-result-object v27

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->m()Ljava/util/List;

    move-result-object v28

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v43

    iget-object v7, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    invoke-virtual {v7}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v29

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->r()Z

    move-result v38

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->m()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->m()I

    move-result v8

    if-ge v7, v8, :cond_e

    const/16 v39, 0x1

    goto :goto_6

    :cond_e
    const/16 v39, 0x0

    :goto_6
    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->q()Ljava/lang/String;

    move-result-object v41

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->i()Ljava/lang/String;

    move-result-object v44

    new-instance v22, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;

    new-instance v7, Lzn/g2;

    invoke-direct {v7, v0, v3}, Lzn/g2;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v8, Lzn/h2;

    invoke-direct {v8, v0, v3}, Lzn/h2;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v9, Lzn/i2;

    invoke-direct {v9, v0, v3}, Lzn/i2;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v10, Lzn/r;

    invoke-direct {v10, v0, v3}, Lzn/r;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v34, Lzn/t;

    invoke-direct/range {v34 .. v34}, Lzn/t;-><init>()V

    new-instance v35, Lzn/u;

    invoke-direct/range {v35 .. v35}, Lzn/u;-><init>()V

    new-instance v11, Lzn/v;

    invoke-direct {v11, v0, v3}, Lzn/v;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v12, Lzn/w;

    invoke-direct {v12, v0, v3}, Lzn/w;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v13, Lzn/x;

    invoke-direct {v13, v0, v3}, Lzn/x;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    const/high16 v46, 0x400000

    const/16 v47, 0x0

    const/16 v40, 0x0

    const/16 v45, 0x0

    move-object/from16 v23, v5

    move-object/from16 v30, v7

    move-object/from16 v31, v8

    move-object/from16 v32, v9

    move-object/from16 v33, v10

    move-object/from16 v36, v11

    move-object/from16 v37, v12

    move-object/from16 v42, v13

    invoke-direct/range {v22 .. v47}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$c;-><init>(Lk6/s;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZZZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Ljava/lang/String;Lar/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->j()Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    move-result-object v5

    sget-object v7, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;->b:Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$a;

    if-ne v5, v7, :cond_f

    const/4 v12, 0x1

    goto :goto_7

    :cond_f
    const/4 v12, 0x0

    :goto_7
    sget-object v5, Lrp/i0;->a:Lrp/i0;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->E()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_10

    move-object v7, v1

    :cond_10
    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->D()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_11

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v8, Lvp/g;->f:I

    invoke-virtual {v1, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_11
    move-object v8, v1

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->b:Landroid/content/Context;

    sget v9, Lvp/g;->e:I

    invoke-static {v1}, Ljq/g;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v10

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v1, v9, v10}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->C()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->A()Ljava/lang/String;

    move-result-object v11

    iget-object v15, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->c:Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v16

    new-instance v1, Lzn/y;

    invoke-direct {v1, v0, v2}, Lzn/y;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)V

    const/16 v19, 0x4e08

    const/16 v20, 0x0

    const/4 v6, 0x0

    move-object v2, v4

    move v4, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v1

    move-object v1, v2

    move-object/from16 v2, v22

    invoke-static/range {v2 .. v20}, Lcom/withpersona/sdk2/inquiry/permissions/g;->e(Ljava/lang/Object;Lym/k$a;ZLrp/i0;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lop/c;

    move-result-object v2

    invoke-virtual/range {v21 .. v21}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$ReviewCapturesWithoutDocumentId;->s()Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v4, Lar/s;->a:Lar/s;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v5

    invoke-virtual {v5}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v5

    invoke-static {v5}, Lar/b;->a(Lcom/withpersona/sdk2/inquiry/steps/ui/NestedUiStep;)Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v6

    invoke-virtual {v6}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v6

    invoke-virtual {v0, v6, v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->B0(Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;Lym/k$a;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lzn/z;

    invoke-direct {v7, v0, v3}, Lzn/z;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->u()Lcom/withpersona/sdk2/inquiry/document/DocumentPages;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/DocumentPages;->f()Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;

    move-result-object v3

    invoke-virtual {v3}, Lcom/withpersona/sdk2/inquiry/document/UploadOptionsDialog;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v5, v6, v7, v3}, Lar/s;->j(Lcom/withpersona/sdk2/inquiry/steps/ui/UiComponentScreen;Ljava/util/List;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lar/p;

    move-result-object v3

    invoke-static {v3, v2, v1}, Lop/d;->a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)Lop/c;

    move-result-object v1

    return-object v1

    :cond_12
    new-instance v3, Lop/c;

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v2, v4, v1}, Lop/c;-><init>(Ljava/lang/Object;Ljava/util/List;Ljava/lang/String;)V

    return-object v3

    :cond_13
    instance-of v4, v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    if-eqz v4, :cond_14

    iget-object v5, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->j:Lcom/withpersona/sdk2/inquiry/document/network/g$a;

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->y()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->r()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->q()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->p()Ljava/lang/String;

    move-result-object v9

    check-cast v2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State$UploadDocument;->m()Ljava/util/List;

    move-result-object v10

    invoke-virtual/range {v5 .. v10}, Lcom/withpersona/sdk2/inquiry/document/network/g$a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/document/network/g;

    move-result-object v2

    new-instance v4, Lzn/a0;

    invoke-direct {v4, v0}, Lzn/a0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;)V

    const-class v5, Lcom/withpersona/sdk2/inquiry/document/network/g;

    invoke-static {v5}, Lkotlin/jvm/internal/d0;->k(Ljava/lang/Class;)Lhu/m;

    move-result-object v5

    invoke-static {v3, v2, v5, v1, v4}, Lym/w;->l(Lym/a;Lym/o;Lhu/m;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    iget-object v6, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v6 .. v12}, Luq/a;->d(Luq/a;ZZZZILjava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->z()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->v()Ljava/lang/String;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->L()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->a()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;

    move-result-object v1

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig;->getPendingPage()Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;

    move-result-object v20

    iget-object v1, v0, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->k:Luq/a;

    invoke-virtual {v1}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v16

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->x()Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;->w()Ljava/lang/String;

    move-result-object v22

    new-instance v13, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;

    new-instance v1, Lzn/c0;

    invoke-direct {v1, v0, v3}, Lzn/c0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    new-instance v2, Lzn/d0;

    invoke-direct {v2, v0, v3}, Lzn/d0;-><init>(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;Lym/k$a;)V

    const/16 v24, 0x200

    const/16 v25, 0x0

    const/16 v23, 0x0

    move-object/from16 v17, v1

    move-object/from16 v18, v2

    invoke-direct/range {v13 .. v25}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$DocumentStepStyle;Lcom/withpersona/sdk2/inquiry/network/dto/NextStep$Document$AssetConfig$PendingPage;Lcom/withpersona/sdk2/inquiry/network/dto/PendingPageTextPosition;Ljava/lang/String;Lar/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v13

    :cond_14
    new-instance v1, Ljt/l;

    invoke-direct {v1}, Ljt/l;-><init>()V

    throw v1
.end method

.method public a2(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lym/i;
    .locals 1
    .param p1    # Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lan/q;->a(Landroid/os/Parcelable;)Lym/i;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d(Ljava/lang/Object;Lym/i;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    invoke-virtual {p0, p1, p2}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->J0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lym/i;)Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic f(Ljava/lang/Object;Ljava/lang/Object;Lym/k$a;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;

    check-cast p2, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p0, p1, p2, p3}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->V0(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$Input;Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;Lym/k$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic g(Ljava/lang/Object;)Lym/i;
    .locals 0

    check-cast p1, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;

    invoke-virtual {p0, p1}, Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow;->a2(Lcom/withpersona/sdk2/inquiry/document/DocumentWorkflow$State;)Lym/i;

    move-result-object p1

    return-object p1
.end method
