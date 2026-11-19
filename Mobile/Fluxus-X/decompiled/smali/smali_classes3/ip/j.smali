.class public final Lip/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B)\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJM\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2&\u0010\u0015\u001a\"0\u0010R\u001a\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010\u0012j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lip/j;",
        "",
        "Landroid/content/Context;",
        "applicationContext",
        "Lsn/a0$a;",
        "cameraXControllerFactory",
        "Lun/c$a;",
        "camera2ControllerFactory",
        "Lir/b;",
        "navigationStateManager",
        "<init>",
        "(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;)V",
        "Lvo/d2$a;",
        "renderProps",
        "Lvo/j0$e;",
        "renderState",
        "Lln/k$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;",
        "Lln/k;",
        "Lvo/j0;",
        "Lvo/d2$b;",
        "context",
        "Lip/l;",
        "videoCaptureHelper",
        "i",
        "(Lvo/d2$a;Lvo/j0$e;Lln/k$a;Lip/l;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "b",
        "Lsn/a0$a;",
        "c",
        "Lun/c$a;",
        "d",
        "Lir/b;",
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

.field public final b:Lsn/a0$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Lun/c$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lir/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;Lsn/a0$a;Lun/c$a;Lir/b;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lsn/a0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lun/c$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lir/b;
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

    iput-object p1, p0, Lip/j;->a:Landroid/content/Context;

    iput-object p2, p0, Lip/j;->b:Lsn/a0$a;

    iput-object p3, p0, Lip/j;->c:Lun/c$a;

    iput-object p4, p0, Lip/j;->d:Lir/b;

    return-void
.end method

.method public static synthetic a()Lkotlin/Unit;
    .locals 1

    invoke-static {}, Lip/j;->p()Lkotlin/Unit;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/j;->n(Ljava/lang/Throwable;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lip/j;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lip/j;->q(Lip/j;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/j;->l(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lln/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/j;->k(Lln/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lvo/j0$e;Lln/k$a;Lvo/d2$a;Lip/l;Ljava/io/File;Lsn/v;)Lkotlin/Unit;
    .locals 0

    invoke-static/range {p0 .. p5}, Lip/j;->o(Lvo/j0$e;Lln/k$a;Lvo/d2$a;Lip/l;Ljava/io/File;Lsn/v;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lln/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lip/j;->m(Lln/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/util/List;Lsn/v;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lip/j;->j(Ljava/util/List;Lsn/v;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/util/List;Lsn/v;)Lkotlin/Unit;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final k(Lln/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lip/h;

    invoke-direct {v0}, Lip/h;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lln/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/d2$b$b;->a:Lvo/d2$b$b;

    invoke-virtual {p0, v0}, Lln/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final m(Lln/k$a;)Lkotlin/Unit;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lvo/b3;->S(Lln/k$a;Lip/l;)V

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

.method public static final o(Lvo/j0$e;Lln/k$a;Lvo/d2$a;Lip/l;Ljava/io/File;Lsn/v;)Lkotlin/Unit;
    .locals 15

    const-string v0, "file"

    move-object/from16 v1, p4

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cameraProperties"

    move-object/from16 v7, p5

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lvo/j0$e;->D()Ljava/util/List;

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

    check-cast v3, Lvo/n;

    invoke-interface {v3}, Lvo/n;->y1()Lvo/n$d;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    sget-object v0, Lvo/n$d;->a:Lvo/n$d;

    invoke-interface {v2, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v3

    sget-object v4, Lvo/n$d;->b:Lvo/n$d;

    invoke-interface {v2, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    move-object v5, v4

    new-instance v4, Lvo/n$c;

    new-instance v6, Lvo/m;

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    const-string v8, "getAbsolutePath(...)"

    invoke-static {v1, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "video/*"

    invoke-direct {v6, v1, v8}, Lvo/m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v6}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    if-eqz v3, :cond_1

    if-eqz v2, :cond_1

    sget-object v0, Lvo/n$d;->c:Lvo/n$d;

    goto :goto_1

    :cond_1
    if-eqz v3, :cond_2

    goto :goto_1

    :cond_2
    if-eqz v2, :cond_3

    move-object v0, v5

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lvo/j0$e;->J()Lvo/d3;

    move-result-object v2

    invoke-virtual {v2}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lvo/n$a;->b:Lvo/n$a;

    invoke-direct {v4, v1, v0, v2, v3}, Lvo/n$c;-><init>(Ljava/util/List;Lvo/n$d;Ljava/lang/String;Lvo/n$a;)V

    invoke-virtual {p0}, Lvo/j0$e;->J()Lvo/d3;

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

    invoke-static/range {v1 .. v14}, Lvo/b3;->X(Lvo/j0;Lln/k$a;Lvo/d2$a;Lvo/n;Lvo/d3;Lip/l;Lsn/v;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p()Lkotlin/Unit;
    .locals 1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final q(Lip/j;Lln/k$a;Lvo/d2$a;)Lkotlin/Unit;
    .locals 1

    iget-object p0, p0, Lip/j;->a:Landroid/content/Context;

    const/4 v0, 0x1

    invoke-static {p0, p1, p2, v0}, Lvo/b3;->U(Landroid/content/Context;Lln/k$a;Lvo/d2$a;Z)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final i(Lvo/d2$a;Lvo/j0$e;Lln/k$a;Lip/l;)Ljava/lang/Object;
    .locals 40
    .param p1    # Lvo/d2$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/j0$e;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lln/k$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lip/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Lvo/j0$e;",
            "Lln/k<",
            "-",
            "Lvo/d2$a;",
            "Lvo/j0;",
            "+",
            "Lvo/d2$b;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lip/l;",
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

    new-instance v4, Lip/j$a;

    const/4 v5, 0x0

    invoke-direct {v4, v15, v2, v5}, Lip/j$a;-><init>(Lvo/j0$e;Lln/k$a;Leu/b;)V

    const-string v6, "finalize_delay"

    invoke-virtual {v2, v6, v4}, Lln/k$a;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V

    invoke-virtual {v15}, Lvo/j0$e;->y()Lvo/i3;

    move-result-object v4

    instance-of v6, v4, Lvo/i3$a;

    if-eqz v6, :cond_0

    check-cast v4, Lvo/i3$a;

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lvo/i3$a;->a()Lvo/d3$e;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v8, v4

    goto :goto_3

    :cond_2
    :goto_2
    sget-object v4, Lvo/d3$e;->d:Lvo/d3$e;

    goto :goto_1

    :goto_3
    invoke-virtual {v15}, Lvo/j0$e;->J()Lvo/d3;

    move-result-object v4

    invoke-virtual {v4, v8}, Lvo/d3;->g(Lvo/d3$e;)Lvo/d3$c;

    move-result-object v4

    new-instance v6, Lrn/d;

    invoke-virtual {v1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v7

    invoke-virtual {v15}, Lvo/j0$e;->J()Lvo/d3;

    move-result-object v9

    invoke-virtual {v9}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15}, Lvo/j0$e;->x()Ljava/lang/String;

    move-result-object v10

    invoke-static {v7, v8, v9, v10}, Lvo/b3;->K(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v9

    invoke-virtual {v15}, Lvo/j0$e;->J()Lvo/d3;

    move-result-object v10

    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v15}, Lvo/j0$e;->x()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v8, v10, v11}, Lvo/b3;->J(Lvo/d2$a$b;Lvo/d3$e;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v10

    invoke-virtual {v10}, Lvo/d2$a$b;->w()Ljava/lang/String;

    move-result-object v10

    move-object v11, v5

    sget-object v5, Lvo/y3$b$a;->a:Lvo/y3$b$a;

    invoke-virtual {v15}, Lvo/j0$e;->J()Lvo/d3;

    move-result-object v12

    invoke-virtual {v12}, Lvo/d3;->i()Ldp/e;

    move-result-object v12

    invoke-virtual {v4}, Lvo/d3$c;->g()Lvo/y3$f;

    move-result-object v4

    iget-object v13, v0, Lip/j;->d:Lir/b;

    invoke-virtual {v13}, Lir/b;->b()Lir/a;

    move-result-object v13

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v15}, Lvo/j0$e;->B()I

    move-result v16

    const/4 v11, 0x0

    invoke-static {v2, v11}, Lvo/b3;->z(Lln/k$a;Z)Lkotlin/jvm/functions/Function1;

    move-result-object v21

    invoke-virtual {v15}, Lvo/j0$e;->M()Z

    move-result v25

    sget-object v22, Lzn/a;->b:Lzn/a;

    iget-object v11, v0, Lip/j;->b:Lsn/a0$a;

    move-object/from16 v18, v4

    iget-object v4, v0, Lip/j;->c:Lun/c$a;

    move-object/from16 v19, v6

    move-object/from16 v6, v18

    move-object/from16 v18, v4

    move-object v4, v10

    new-instance v10, Lip/a;

    invoke-direct {v10}, Lip/a;-><init>()V

    move-object/from16 v17, v11

    const/16 v20, 0x0

    new-instance v11, Lip/b;

    invoke-direct {v11, v2}, Lip/b;-><init>(Lln/k$a;)V

    move-object/from16 v23, v7

    move-object v7, v12

    new-instance v12, Lip/c;

    invoke-direct {v12, v2}, Lip/c;-><init>(Lln/k$a;)V

    move-object/from16 v24, v20

    new-instance v20, Lip/d;

    invoke-direct/range {v20 .. v20}, Lip/d;-><init>()V

    move-object/from16 v26, v4

    new-instance v4, Lip/e;

    invoke-direct {v4, v15, v2, v1, v3}, Lip/e;-><init>(Lvo/j0$e;Lln/k$a;Lvo/d2$a;Lip/l;)V

    new-instance v27, Lip/f;

    invoke-direct/range {v27 .. v27}, Lip/f;-><init>()V

    new-instance v3, Lip/g;

    invoke-direct {v3, v0, v2, v1}, Lip/g;-><init>(Lip/j;Lln/k$a;Lvo/d2$a;)V

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

    invoke-static/range {v1 .. v37}, Lvo/i0;->g(Lvo/d2$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lvo/y3$b$a;Lvo/y3$f;Ldp/e;Lvo/d3$e;Lir/a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/util/List;Lvo/j0;ILsn/a0$a;Lun/c$a;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lzn/a;ZZZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ILjava/lang/String;Lzo/i;Lks/a;ZLkr/l;IILjava/lang/Object;)Lvo/y3$b;

    move-result-object v1

    invoke-static {v1}, Lfq/y1;->c(Ljava/lang/Object;)Lcq/c;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v11, 0x0

    invoke-direct {v0, v1, v11, v2, v11}, Lrn/d;-><init>(Ljava/lang/Object;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
