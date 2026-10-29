.class public final Lhq/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\u0018\u00002\u00020\u0001B1\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJG\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102&\u0010\u0017\u001a\"0\u0012R\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0014j\u0002`\u0013H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lhq/j;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lcom/withpersona/sdk2/camera/e$a;",
        "cameraXControllerFactory",
        "Lhn/c$a;",
        "camera2ControllerFactory",
        "Luq/a;",
        "navigationStateManager",
        "Lgo/e;",
        "featureFlagManager",
        "<init>",
        "(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)V",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
        "renderProps",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;",
        "renderState",
        "Lym/k$a;",
        "Lcom/withpersona/sdk2/inquiry/selfie/RenderContext;",
        "Lym/k;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
        "context",
        "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "q",
        "(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lcom/withpersona/sdk2/camera/e$a;",
        "c",
        "Lhn/c$a;",
        "d",
        "Luq/a;",
        "e",
        "Lgo/e;",
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

.field public final e:Lgo/e;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/withpersona/sdk2/camera/e$a;Lhn/c$a;Luq/a;Lgo/e;)V
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
    .param p5    # Lgo/e;
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

    const-string v0, "featureFlagManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhq/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lhq/j;->b:Lcom/withpersona/sdk2/camera/e$a;

    iput-object p3, p0, Lhq/j;->c:Lhn/c$a;

    iput-object p4, p0, Lhq/j;->d:Luq/a;

    iput-object p5, p0, Lhq/j;->e:Lgo/e;

    return-void
.end method

.method public static synthetic a(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lhq/j;->l(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhq/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lhq/j;->p(Lhq/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lhq/j;->k(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhq/j;->o(Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhq/j;->n(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lym/k$a;Ljava/io/File;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lhq/j;->i(Lym/k$a;Ljava/io/File;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lym/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lhq/j;->m(Lym/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/util/List;Lym/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lhq/j;->j(Ljava/util/List;Lym/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lym/k$a;Ljava/io/File;)Lkotlin/Unit;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;

    invoke-virtual {p1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string v2, "getAbsolutePath(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;->c:Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;

    invoke-direct {v1, p1, v2}, Lcom/withpersona/sdk2/inquiry/selfie/Selfie$SelfieVideo;-><init>(Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/selfie/Selfie$a;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance p1, Lhq/h;

    invoke-direct {p1, v0}, Lhq/h;-><init>(Ljava/util/List;)V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {v1, p1, v0, v1}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final j(Ljava/util/List;Lym/r$c;)Lkotlin/Unit;
    .locals 14

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

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
    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->w()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Lkotlin/collections/CollectionsKt;->w0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    const/16 v12, 0xf6

    const/4 v13, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->A(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Ljava/util/List;JZZLcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;Lcom/withpersona/sdk2/camera/CameraProperties$b;ILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    move-result-object p0

    invoke-virtual {p1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;)Lkotlin/Unit;
    .locals 2

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lhq/g;

    invoke-direct {v0, p1}, Lhq/g;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, p1, v1}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/r$c;)Lkotlin/Unit;
    .locals 8

    const-string v0, "$this$action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    if-eqz v1, :cond_0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->E()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    invoke-virtual {p1}, Lym/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    invoke-virtual {v0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;->w()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->a()Lcom/withpersona/sdk2/camera/CameraProperties;

    move-result-object v4

    invoke-virtual {p0}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->t()J

    move-result-wide v5

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->k(Lym/r$c;Z)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object v7

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Lcom/withpersona/sdk2/inquiry/selfie/p;->D(Lym/r$c;Ljava/util/List;Ljava/lang/String;Lcom/withpersona/sdk2/camera/CameraProperties;JLcom/withpersona/sdk2/inquiry/selfie/SelfieState;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;

    move-result-object p0

    invoke-virtual {v1, p0}, Lym/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Lym/k$a;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->x(Lym/k$a;Lur/a;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Lym/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lym/k$a;->d()Lym/h;

    move-result-object p0

    new-instance v0, Lhq/f;

    invoke-direct {v0}, Lhq/f;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lym/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lym/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lym/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lym/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b$b;

    invoke-virtual {p0, v0}, Lym/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lhq/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lkotlin/Unit;
    .locals 1

    iget-object p0, p0, Lhq/j;->a:Landroid/content/Context;

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lcom/withpersona/sdk2/inquiry/selfie/p;->z(Landroid/content/Context;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final q(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/k$a;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;
    .locals 33
    .param p1    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;
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
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;",
            "Lym/k<",
            "-",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieState;",
            "+",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;)",
            "Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;"
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

    new-instance v4, Lhq/j$a;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v3, v5}, Lhq/j$a;-><init>(Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;Lym/k$a;Lnt/b;)V

    const-string v5, "finalize_delay"

    invoke-virtual {v3, v5, v4}, Lym/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->D()Z

    move-result v9

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->E()Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->r:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    :goto_0
    move-object v10, v4

    goto :goto_1

    :cond_0
    sget-object v4, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;->p:Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->J()Lcom/withpersona/sdk2/inquiry/selfie/SelfieType;

    move-result-object v4

    sget-object v5, Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;->a:Lcom/withpersona/sdk2/inquiry/selfie/SelfieType$ConfigurablePoses;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    xor-int/lit8 v11, v4, 0x1

    new-instance v6, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;

    new-instance v7, Lhq/a;

    invoke-direct {v7, v3}, Lhq/a;-><init>(Lym/k$a;)V

    new-instance v8, Lhq/b;

    invoke-direct {v8, v3, v2}, Lhq/b;-><init>(Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;)V

    invoke-direct/range {v6 .. v11}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b$c;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$c;Z)V

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->I()Z

    move-result v10

    iget-object v4, v0, Lhq/j;->d:Luq/a;

    invoke-virtual {v4}, Luq/a;->b()Lcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;

    move-result-object v11

    const/4 v4, 0x0

    invoke-static {v3, v4}, Lcom/withpersona/sdk2/inquiry/selfie/p;->m(Lym/k$a;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v14

    sget-object v16, Lmn/a;->b:Lmn/a;

    invoke-static {v1}, Lcom/withpersona/sdk2/inquiry/selfie/p;->C(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;

    move-result-object v9

    invoke-virtual {v1}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;->P()Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;

    move-result-object v4

    invoke-virtual {v4}, Lcom/withpersona/sdk2/inquiry/selfie/video_capture/VideoCaptureConfig;->f()Z

    move-result v18

    iget-object v4, v0, Lhq/j;->b:Lcom/withpersona/sdk2/camera/e$a;

    iget-object v5, v0, Lhq/j;->c:Lhn/c$a;

    invoke-virtual {v2}, Lcom/withpersona/sdk2/inquiry/selfie/SelfieState$FinalizeLocalVideoCapture;->v()Lcom/withpersona/sdk2/camera/CameraProperties$b;

    move-result-object v23

    iget-object v2, v0, Lhq/j;->e:Lgo/e;

    sget-object v7, Lgo/a;->a:Lgo/a;

    invoke-virtual {v2, v7}, Lgo/e;->a(Lgo/d;)Z

    move-result v25

    new-instance v12, Lhq/c;

    invoke-direct {v12, v3}, Lhq/c;-><init>(Lym/k$a;)V

    new-instance v13, Lhq/d;

    invoke-direct {v13, v3}, Lhq/d;-><init>(Lym/k$a;)V

    new-instance v15, Lhq/e;

    invoke-direct {v15, v0, v3, v1}, Lhq/e;-><init>(Lhq/j;Lym/k$a;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;)V

    const/high16 v31, 0x3c000000    # 0.0078125f

    const/16 v32, 0x0

    const/4 v3, 0x0

    move-object/from16 v19, v4

    const/4 v4, 0x0

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object v8, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v32}, Lcom/withpersona/sdk2/inquiry/selfie/o;->n(Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$Input;Lym/k$a;Lkn/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$b;Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c$c$a;ZLcom/withpersona/sdk2/inquiry/shared/navigation/NavigationState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lmn/a;Lur/a;ZLcom/withpersona/sdk2/camera/e$a;Lhn/c$a;FLcom/withpersona/sdk2/camera/selfie/SelfieBrightnessInfo;Lcom/withpersona/sdk2/camera/CameraProperties$b;ZZZZZZZILjava/lang/Object;)Lcom/withpersona/sdk2/inquiry/selfie/SelfieWorkflow$c;

    move-result-object v1

    return-object v1
.end method
