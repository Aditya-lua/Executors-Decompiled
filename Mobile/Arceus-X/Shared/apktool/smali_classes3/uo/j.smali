.class public final Luo/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Luo/j;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/withpersona/sdk2/camera/e$a;",
        "cameraXControllerFactory",
        "Lhn/c$a;",
        "camera2ControllerFactory",
        "Luq/a;",
        "navigationStateManager",
        "<init>",
        "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;)V",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
        "renderProps",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;",
        "renderState",
        "Lym/k$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
        "context",
        "Luo/l;",
        "videoCaptureHelper",
        "i",
        "(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Luo/l;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lcom/withpersona/sdk2/camera/e$a;",
        "c",
        "Lhn/c$a;",
        "d",
        "Luq/a;",
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
.field public final a:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final b:Lcom/withpersona/sdk2/camera/e$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lhn/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Luq/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/camera/e$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lhn/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Luq/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "applicationContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraXControllerFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "camera2ControllerFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationStateManager"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luo/j;->a:Landroid/content/Context;

    iput-object p2, p0, Luo/j;->b:Lcom/withpersona/sdk2/camera/e$a;

    iput-object p3, p0, Luo/j;->c:Lhn/c$a;

    iput-object p4, p0, Luo/j;->d:Luq/a;

    return-void
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Luo/j;->p()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Luo/j;->n(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luo/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Luo/j;->q(Luo/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Luo/j;->l(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Luo/j;->k(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Luo/j;->o(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Luo/j;->m(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Luo/j;->j(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/util/List;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lym/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Luo/h;

    invoke-direct {v0}, Luo/h;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a$b;

    invoke-virtual {p0, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Lym/k$a;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->S(Lym/k$a;Luo/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;Ljava/io/File;Lcom/withpersona/sdk2/camera/CameraProperties;)Lkotlin/Unit;
    .locals 15

    const-string v0, "file"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraProperties"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->E()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;

    invoke-interface {v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;->y1()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;->a:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    move-object v5, v4

    new-instance v4, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;

    new-instance v6, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v8, "getAbsolutePath(...)"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "video/*"

    invoke-direct {v6, v1, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/Frame;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    sget-object v0, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;->c:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    move-object v0, v5

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v2

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;->b:Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;

    invoke-direct {v4, v1, v0, v2, v3}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$GovernmentIdVideo;-><init>(Ljava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$b;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId$a;)V

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v5

    const/16 v13, 0xf00

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p3

    invoke-static/range {v1 .. v14}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->X(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentId;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;Luo/l;Lcom/withpersona/sdk2/camera/CameraProperties;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final q(Luo/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object p0, p0, Luo/j;->a:Landroid/content/Context;

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->U(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final i(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Luo/l;)Ljava/lang/Object;
    .locals 40
    .param p1    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lym/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Luo/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$a;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Luo/l;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v15, p2

    move-object/from16 v2, p3

    move-object/from16 v3, p4

    const-string v4, "renderProps"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "renderState"

    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "context"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "videoCaptureHelper"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Luo/j$a;

    const/4 v5, 0x0

    invoke-direct {v4, v15, v2, v5}, Luo/j$a;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lnt/b;)V

    const-string v6, "finalize_delay"

    invoke-virtual {v2, v6, v4}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->z()Lcom/withpersona/sdk2/inquiry/governmentid/IdPart;

    move-result-object v4

    instance-of v6, v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    if-eqz v6, :cond_0

    check-cast v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdPart$SideIdPart;->a()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v8, v4

    goto :goto_3

    :cond_2
    :goto_2
    sget-object v4, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;->d:Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;

    goto :goto_1

    :goto_3
    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v4

    invoke-virtual {v4, v8}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->g(Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;

    move-result-object v4

    new-instance v6, Len/d;

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v7

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v9

    invoke-virtual {v9}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->x()Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v8, v9, v10}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->K(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v9

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->m2()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->x()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v8, v10, v11}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->J(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;->G()Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;

    move-result-object v10

    invoke-virtual {v10}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input$Strings;->w()Ljava/lang/String;

    move-result-object v10

    move-object v11, v5

    sget-object v5, Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;->a:Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->K()Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;

    move-result-object v12

    invoke-virtual {v12}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;->i()Lpo/b;

    move-result-object v12

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;->g()Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;

    move-result-object v4

    iget-object v13, v0, Luo/j;->d:Luq/a;

    invoke-virtual {v13}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v13

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->C()I

    move-result v16

    const/4 v11, 0x0

    invoke-static {v2, v11}, Lcom/withpersona/sdk2/inquiry/governmentid/n;->z(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v21

    invoke-virtual {v15}, Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;->N()Z

    move-result v25

    sget-object v22, Lmn/a;->b:Lmn/a;

    iget-object v11, v0, Luo/j;->b:Lcom/withpersona/sdk2/camera/e$a;

    move-object/from16 v18, v4

    iget-object v4, v0, Luo/j;->c:Lhn/c$a;

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    move-object/from16 v18, v4

    move-object v4, v10

    new-instance v10, Luo/a;

    invoke-direct {v10}, Luo/a;-><init>()V

    move-object/from16 v17, v11

    const/16 v20, 0x0

    new-instance v11, Luo/b;

    invoke-direct {v11, v2}, Luo/b;-><init>(Lym/k$a;)V

    move-object/from16 v23, v7

    move-object v7, v12

    new-instance v12, Luo/c;

    invoke-direct {v12, v2}, Luo/c;-><init>(Lym/k$a;)V

    move-object/from16 v24, v20

    new-instance v20, Luo/d;

    invoke-direct/range {v20 .. v20}, Luo/d;-><init>()V

    move-object/from16 v26, v4

    new-instance v4, Luo/e;

    invoke-direct {v4, v15, v2, v1, v3}, Luo/e;-><init>(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState$FinalizeLocalVideoCapture;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Luo/l;)V

    new-instance v27, Luo/f;

    invoke-direct/range {v27 .. v27}, Luo/f;-><init>()V

    new-instance v3, Luo/g;

    invoke-direct {v3, v0, v2, v1}, Luo/g;-><init>(Luo/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;)V

    const/16 v36, 0x3

    const/16 v37, 0x0

    move-object/from16 v28, v3

    move-object v3, v9

    move-object v9, v13

    const/4 v13, 0x0

    move-object/from16 v2, v19

    const/16 v19, 0x0

    move-object/from16 v29, v2

    move-object/from16 v2, v23

    const/16 v23, 0x0

    move-object/from16 v30, v24

    const/16 v24, 0x1

    move-object/from16 v31, v29

    const/16 v29, 0x0

    move-object/from16 v32, v30

    const/16 v30, 0x0

    move-object/from16 v33, v31

    const/16 v31, 0x0

    move-object/from16 v34, v32

    const/16 v32, 0x0

    move-object/from16 v35, v33

    const/16 v33, 0x0

    move-object/from16 v38, v34

    const/16 v34, 0x0

    move-object/from16 v39, v35

    const/high16 v35, 0x60040000

    move-object/from16 v0, v26

    move-object/from16 v26, v4

    move-object v4, v0

    move-object/from16 v0, v39

    invoke-static/range {v1 .. v37}, Lcom/withpersona/sdk2/inquiry/governmentid/l;->g(Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdWorkflow$Input;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b$a;Lcom/withpersona/sdk2/inquiry/governmentid/Screen$Overlay;Lpo/b;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdState;ILcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lmn/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lmo/i;Lur/a;ZLwq/l;IILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/governmentid/Screen$b;

    move-result-object v1

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/permissions/g;->c(Ljava/lang/Object;)Lop/c;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v11, 0x0

    invoke-direct {v0, v1, v11, v2, v11}, Len/d;-><init>(Ljava/lang/Object;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
