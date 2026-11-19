.class public final Lwo/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwo/o$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JM\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000cj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JM\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00152&\u0010\u000f\u001a\"0\nR\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\u000cj\u0002`\u000b2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lwo/o;",
        "",
        "Lir/b;",
        "navigationStateManager",
        "<init>",
        "(Lir/b;)V",
        "Lvo/d2$a;",
        "renderProps",
        "Lvo/j0$a;",
        "renderState",
        "Lln/k$a;",
        "Lcom/withpersona/sdk2/inquiry/governmentid/RenderContext;",
        "Lln/k;",
        "Lvo/j0;",
        "Lvo/d2$b;",
        "context",
        "Lip/l;",
        "videoCaptureHelper",
        "Lvo/y3$d;",
        "n",
        "(Lvo/d2$a;Lvo/j0$a;Lln/k$a;Lip/l;)Lvo/y3$d;",
        "Lvo/j0$b;",
        "Lvo/y3;",
        "t",
        "(Lvo/d2$a;Lvo/j0$b;Lln/k$a;Lip/l;)Lvo/y3;",
        "a",
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
.field public final a:Lir/b;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lir/b;)V
    .locals 1
    .param p1    # Lir/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "navigationStateManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwo/o;->a:Lir/b;

    return-void
.end method

.method public static final A(Lln/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lwo/d;

    invoke-direct {v0}, Lwo/d;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final B(Lln/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/d2$b$b;->a:Lvo/d2$b$b;

    invoke-virtual {p0, v0}, Lln/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static synthetic a(Lln/k$a;Lqr/l4;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwo/o;->u(Lln/k$a;Lqr/l4;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lln/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lwo/o;->o(Lln/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lqr/l4;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwo/o;->v(Lqr/l4;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lwo/o;->p(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lwo/o;->s(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lln/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lwo/o;->r(Lln/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lln/k$a;Lqr/l4;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwo/o;->w(Lln/k$a;Lqr/l4;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lln/k$a;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lwo/o;->A(Lln/k$a;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lqr/l4;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwo/o;->x(Lqr/l4;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lln/k$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwo/o;->z(Lln/k$a;Lip/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lln/k$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lwo/o;->q(Lln/k$a;Lip/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lvo/d3;Lvo/j0$b;Lln/k$a;Lvo/d2$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lwo/o;->y(Lvo/d3;Lvo/j0$b;Lln/k$a;Lvo/d2$a;Lip/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lwo/o;->B(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lln/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lwo/m;

    invoke-direct {v0}, Lwo/m;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lln/r$c;)Lkotlin/Unit;
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lvo/j0$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lvo/j0$a;

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    if-nez v1, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual {v1}, Lvo/j0$a;->L()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const/4 v4, 0x1

    if-ne v2, v4, :cond_3

    invoke-virtual {v1}, Lvo/j0$a;->L()Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvo/f3;

    invoke-virtual {v2}, Lvo/f3;->g()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v5, v4, :cond_2

    invoke-virtual {v2}, Lvo/f3;->g()Ljava/util/List;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lvo/d3;

    invoke-virtual {v3}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v3

    :cond_2
    invoke-virtual {v2}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v2

    move-object v15, v2

    move-object/from16 v16, v3

    goto :goto_1

    :cond_3
    move-object v15, v3

    move-object/from16 v16, v15

    :goto_1
    new-instance v5, Lvo/j0$b;

    invoke-virtual {v1}, Lvo/j0$a;->H()Lvo/i3$a;

    move-result-object v6

    invoke-virtual {v1}, Lvo/j0$a;->D()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lvo/j0$a;->C()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v1}, Lvo/j0$a;->B()I

    move-result v9

    invoke-static {v0, v4}, Lvo/b3;->x(Lln/r$c;Z)Lvo/j0;

    move-result-object v10

    invoke-virtual {v1}, Lvo/j0$a;->x()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lvo/j0$a;->G()Ljava/util/List;

    move-result-object v12

    new-instance v17, Lsn/v;

    const/16 v23, 0x1f

    const/16 v24, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v17 .. v24}, Lsn/v;-><init>(Ljava/lang/String;Lsn/v$b;Landroid/util/Size;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lvo/j0$a;->L()Ljava/util/List;

    move-result-object v14

    move-object/from16 v13, v17

    invoke-direct/range {v5 .. v16}, Lvo/j0$b;-><init>(Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final q(Lln/k$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvo/b3;->S(Lln/k$a;Lip/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r(Lln/k$a;)Lkotlin/Unit;
    .locals 3

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lwo/n;

    invoke-direct {v0}, Lwo/n;-><init>()V

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-static {v2, v0, v1, v2}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p0, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final s(Lln/r$c;)Lkotlin/Unit;
    .locals 1

    const-string v0, "$this$action"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lvo/d2$b$b;->a:Lvo/d2$b$b;

    invoke-virtual {p0, v0}, Lln/r$c;->d(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final u(Lln/k$a;Lqr/l4;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lwo/e;

    invoke-direct {v0, p1}, Lwo/e;-><init>(Lqr/l4;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, p1, v1}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final v(Lqr/l4;Lln/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lvo/j0$b;

    if-eqz v2, :cond_0

    check-cast v1, Lvo/j0$b;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v2, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lqr/l4;->f()Ljava/lang/String;

    move-result-object v12

    const/16 v14, 0x5ff

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

    const/4 v13, 0x0

    invoke-static/range {v2 .. v15}, Lvo/j0$b;->H(Lvo/j0$b;Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lvo/j0$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final w(Lln/k$a;Lqr/l4;)Lkotlin/Unit;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lln/k$a;->d()Lln/h;

    move-result-object p0

    new-instance v0, Lwo/c;

    invoke-direct {v0, p1}, Lwo/c;-><init>(Lqr/l4;)V

    const/4 p1, 0x1

    const/4 v1, 0x0

    invoke-static {v1, v0, p1, v1}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object p1

    invoke-interface {p0, p1}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final x(Lqr/l4;Lln/r$c;)Lkotlin/Unit;
    .locals 16

    move-object/from16 v0, p1

    const-string v1, "$this$action"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lvo/j0$b;

    if-eqz v2, :cond_0

    check-cast v1, Lvo/j0$b;

    :goto_0
    move-object v2, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    if-nez v2, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lqr/l4;->f()Ljava/lang/String;

    move-result-object v13

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

    invoke-static/range {v2 .. v15}, Lvo/j0$b;->H(Lvo/j0$b;Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lvo/j0$b;

    move-result-object v1

    invoke-virtual {v0, v1}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final y(Lvo/d3;Lvo/j0$b;Lln/k$a;Lvo/d2$a;Lip/l;)Lkotlin/Unit;
    .locals 14

    if-nez p0, :cond_0

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_0
    invoke-virtual {p1}, Lvo/j0$b;->f()Lsn/v;

    move-result-object v6

    invoke-virtual {p0}, Lvo/d3;->f()Ljava/util/List;

    move-result-object v8

    invoke-virtual {p1}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v11

    const/16 v12, 0x480

    const/4 v13, 0x0

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/4 v9, -0x1

    const/4 v10, 0x0

    move-object v4, p0

    move-object v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object/from16 v5, p4

    invoke-static/range {v0 .. v13}, Lvo/b3;->X(Lvo/j0;Lln/k$a;Lvo/d2$a;Lvo/n;Lvo/d3;Lip/l;Lsn/v;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final z(Lln/k$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lvo/b3;->S(Lln/k$a;Lip/l;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final n(Lvo/d2$a;Lvo/j0$a;Lln/k$a;Lip/l;)Lvo/y3$d;
    .locals 16
    .param p1    # Lvo/d2$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/j0$a;
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
            "Lvo/j0$a;",
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
            "Lvo/y3$d;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p3

    move-object/from16 v1, p4

    const-string v2, "renderProps"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "renderState"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "videoCaptureHelper"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lvo/y3$d;

    invoke-virtual {v4}, Lvo/j0$a;->J()Lvo/c;

    move-result-object v2

    sget-object v5, Lwo/o$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v5, v2

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eq v2, v7, :cond_1

    if-ne v2, v6, :cond_0

    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lvo/d2$a$b;->b1()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    new-instance v0, Lzt/l;

    invoke-direct {v0}, Lzt/l;-><init>()V

    throw v0

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v2

    invoke-virtual {v2}, Lvo/d2$a$b;->U()Ljava/lang/String;

    move-result-object v2

    :goto_0
    invoke-virtual {v4}, Lvo/j0$a;->J()Lvo/c;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v5, v4

    if-eq v4, v7, :cond_3

    if-ne v4, v6, :cond_2

    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lvo/d2$a$b;->N0()Ljava/lang/String;

    move-result-object v4

    :goto_1
    move-object v5, v4

    goto :goto_2

    :cond_2
    new-instance v0, Lzt/l;

    invoke-direct {v0}, Lzt/l;-><init>()V

    throw v0

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lvo/d2$a$b;->T()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->G()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v6

    move-object/from16 v4, p0

    iget-object v7, v4, Lwo/o;->a:Lir/b;

    invoke-virtual {v7}, Lir/b;->b()Lir/a;

    move-result-object v7

    new-instance v8, Lwo/b;

    invoke-direct {v8, v0}, Lwo/b;-><init>(Lln/k$a;)V

    new-instance v9, Lwo/f;

    invoke-direct {v9, v0, v1}, Lwo/f;-><init>(Lln/k$a;Lip/l;)V

    new-instance v10, Lwo/g;

    invoke-direct {v10, v0}, Lwo/g;-><init>(Lln/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->f()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_4

    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->t()Ljava/lang/String;

    move-result-object v0

    :cond_4
    move-object v12, v0

    const/16 v14, 0x280

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v4, v2

    invoke-direct/range {v3 .. v15}, Lvo/y3$d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkr/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method

.method public final t(Lvo/d2$a;Lvo/j0$b;Lln/k$a;Lip/l;)Lvo/y3;
    .locals 26
    .param p1    # Lvo/d2$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/j0$b;
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
            "Lvo/j0$b;",
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
            "Lvo/y3;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v3, p3

    move-object/from16 v5, p4

    const-string v0, "renderProps"

    move-object/from16 v4, p1

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoCaptureHelper"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lvo/j0$b;->L()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lvo/f3;

    invoke-virtual {v7}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    goto :goto_0

    :cond_2
    move-object v6, v1

    :goto_0
    check-cast v6, Lvo/f3;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lvo/f3;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v8, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lvo/d3;

    new-instance v10, Lqr/l4;

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v11

    invoke-virtual {v11}, Lvo/d2$a$b;->f0()Ljava/util/List;

    move-result-object v11

    if-eqz v11, :cond_4

    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v9}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v13

    const-string v14, "selectPage"

    invoke-static {v11, v12, v13, v14}, Lwo/p;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_5

    :cond_4
    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v11

    invoke-virtual {v11}, Lvo/d2$a$b;->V()Ljava/util/Map;

    move-result-object v11

    invoke-virtual {v9}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v11, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-nez v11, :cond_5

    invoke-virtual {v9}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v11

    :cond_5
    invoke-virtual {v9}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v12

    const/4 v14, 0x4

    const/4 v15, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lqr/l4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v10}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lvo/j0$b;->N()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lvo/d3;

    invoke-virtual {v9}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lvo/j0$b;->N()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move-object v1, v7

    :cond_9
    check-cast v1, Lvo/d3;

    :goto_3
    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->j0()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->b1()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lvo/d2$a;->G()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v10

    invoke-virtual {v2}, Lvo/j0$b;->L()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v0, v6}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v11, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lvo/f3;

    new-instance v12, Lvo/y3$a$a;

    invoke-virtual {v6}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v6}, Lvo/f3;->f()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lwo/a0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-direct {v12, v13, v14, v6}, Lvo/y3$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v11, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v6

    move-object v12, v9

    invoke-virtual {v2}, Lvo/j0$b;->N()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->H()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->S()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->g0()Ljava/lang/String;

    move-result-object v15

    if-eqz v1, :cond_b

    const/4 v0, 0x1

    :goto_5
    move/from16 v16, v0

    move-object/from16 v17, v1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    iget-object v1, v0, Lwo/o;->a:Lir/b;

    invoke-virtual {v1}, Lir/b;->b()Lir/a;

    move-result-object v18

    move-object/from16 v19, v12

    move-object v12, v15

    invoke-virtual {v4}, Lvo/d2$a;->l()Lvo/i;

    move-result-object v15

    new-instance v1, Lwo/h;

    invoke-direct {v1, v3}, Lwo/h;-><init>(Lln/k$a;)V

    move-object/from16 v20, v6

    new-instance v6, Lwo/i;

    invoke-direct {v6, v3}, Lwo/i;-><init>(Lln/k$a;)V

    new-instance v0, Lwo/j;

    move/from16 v25, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v17

    move-object/from16 v17, v10

    move-object v10, v13

    move/from16 v13, v25

    invoke-direct/range {v0 .. v5}, Lwo/j;-><init>(Lvo/d3;Lvo/j0$b;Lln/k$a;Lvo/d2$a;Lip/l;)V

    new-instance v1, Lwo/k;

    invoke-direct {v1, v3, v5}, Lwo/k;-><init>(Lln/k$a;Lip/l;)V

    new-instance v2, Lwo/l;

    invoke-direct {v2, v3}, Lwo/l;-><init>(Lln/k$a;)V

    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v3

    invoke-virtual {v3}, Lvo/d2$a$b;->f()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_c

    invoke-virtual/range {p1 .. p1}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v3

    invoke-virtual {v3}, Lvo/d2$a$b;->t()Ljava/lang/String;

    move-result-object v3

    :cond_c
    move-object/from16 v21, v3

    move-object v3, v7

    move-object/from16 v7, v20

    move-object/from16 v20, v2

    new-instance v2, Lvo/y3$a;

    const/16 v22, 0x0

    const/high16 v23, 0x80000

    const/16 v24, 0x0

    move-object/from16 v5, v17

    move-object/from16 v4, v19

    move-object/from16 v19, v1

    move-object/from16 v17, v6

    move-object v6, v11

    move-object v11, v14

    move-object/from16 v14, v18

    move-object/from16 v18, v0

    invoke-direct/range {v2 .. v24}, Lvo/y3$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLir/a;Lvo/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkr/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
