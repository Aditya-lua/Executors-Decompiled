.class public final Lfp/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfp/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u0011\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005JQ\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0016\u0010\u0017JQ\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00182\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lfp/i;",
        "",
        "Lir/b;",
        "navigationStateManager",
        "<init>",
        "(Lir/b;)V",
        "Lvo/d2$a;",
        "renderProps",
        "Lvo/j0$a;",
        "renderState",
        "Lls/g;",
        "Lvo/j0;",
        "workflowContext",
        "Lip/l;",
        "videoCaptureHelper",
        "Lkotlin/Function1;",
        "Lvo/d2$b;",
        "",
        "onOutput",
        "Lkr/l;",
        "transition",
        "Lvo/y3$d;",
        "i",
        "(Lvo/d2$a;Lvo/j0$a;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3$d;",
        "Lvo/j0$b;",
        "Lvo/y3;",
        "m",
        "(Lvo/d2$a;Lvo/j0$b;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;",
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

    iput-object p1, p0, Lfp/i;->a:Lir/b;

    return-void
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lfp/i;->l(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lls/g;Lqr/l4;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lfp/i;->p(Lls/g;Lqr/l4;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfp/i;->k(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lls/g;Lqr/l4;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lfp/i;->q(Lls/g;Lqr/l4;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lvo/d3;Lvo/j0$b;Lls/g;Lvo/d2$a;Lip/l;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lfp/i;->r(Lvo/d3;Lvo/j0$b;Lls/g;Lvo/d2$a;Lip/l;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lls/g;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lfp/i;->j(Lls/g;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lfp/i;->o(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lfp/i;->n(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lls/g;)Lkotlin/Unit;
    .locals 25

    move-object/from16 v0, p0

    invoke-virtual {v0}, Lls/g;->i()Lls/h;

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

    invoke-static {v0, v4}, Lep/e;->e(Lls/g;Z)Lvo/j0;

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

    invoke-virtual {v0, v5}, Lls/g;->p(Lls/h;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method

.method public static final k(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep/e;->p(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final l(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lvo/d2$b$b;->a:Lvo/d2$b$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final n(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep/e;->p(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final o(Lkotlin/jvm/functions/Function1;)Lkotlin/Unit;
    .locals 1

    sget-object v0, Lvo/d2$b$b;->a:Lvo/d2$b$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final p(Lls/g;Lqr/l4;)Lkotlin/Unit;
    .locals 15

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lls/g;->i()Lls/h;

    move-result-object v0

    instance-of v2, v0, Lvo/j0$b;

    if-eqz v2, :cond_0

    check-cast v0, Lvo/j0$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v1}, Lqr/l4;->f()Ljava/lang/String;

    move-result-object v11

    const/16 v13, 0x5ff

    const/4 v14, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v14}, Lvo/j0$b;->H(Lvo/j0$b;Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lvo/j0$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lls/g;->p(Lls/h;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final q(Lls/g;Lqr/l4;)Lkotlin/Unit;
    .locals 15

    const-string v0, "it"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lls/g;->i()Lls/h;

    move-result-object v0

    instance-of v2, v0, Lvo/j0$b;

    if-eqz v2, :cond_0

    check-cast v0, Lvo/j0$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v1}, Lqr/l4;->f()Ljava/lang/String;

    move-result-object v12

    const/16 v13, 0x3ff

    const/4 v14, 0x0

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

    move-object v1, v0

    invoke-static/range {v1 .. v14}, Lvo/j0$b;->H(Lvo/j0$b;Lvo/i3$a;Ljava/util/List;Ljava/util/List;ILvo/j0;Ljava/lang/String;Ljava/util/List;Lsn/v;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lvo/j0$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lls/g;->p(Lls/h;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method

.method public static final r(Lvo/d3;Lvo/j0$b;Lls/g;Lvo/d2$a;Lip/l;)Lkotlin/Unit;
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

    invoke-static/range {v0 .. v13}, Lep/e;->s(Lvo/j0;Lls/g;Lvo/d2$a;Lvo/n;Lvo/d3;Lip/l;Lsn/v;ZLjava/util/List;ILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final i(Lvo/d2$a;Lvo/j0$a;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3$d;
    .locals 16
    .param p1    # Lvo/d2$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/j0$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lls/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lip/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkr/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Lvo/j0$a;",
            "Lls/g<",
            "Lvo/j0;",
            ">;",
            "Lip/l;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lvo/d2$b;",
            "Lkotlin/Unit;",
            ">;",
            "Lkr/l;",
            ")",
            "Lvo/y3$d;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move-object/from16 v2, p4

    move-object/from16 v3, p5

    const-string v4, "renderProps"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "renderState"

    move-object/from16 v5, p2

    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "workflowContext"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "videoCaptureHelper"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onOutput"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "transition"

    move-object/from16 v15, p6

    invoke-static {v15, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lvo/y3$d;

    invoke-virtual/range {p2 .. p2}, Lvo/j0$a;->J()Lvo/c;

    move-result-object v4

    sget-object v6, Lfp/i$a;->a:[I

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v4, v6, v4

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eq v4, v8, :cond_1

    if-ne v4, v7, :cond_0

    invoke-virtual {v0}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lvo/d2$a$b;->b1()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_0
    new-instance v0, Lzt/l;

    invoke-direct {v0}, Lzt/l;-><init>()V

    throw v0

    :cond_1
    invoke-virtual {v0}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v4

    invoke-virtual {v4}, Lvo/d2$a$b;->U()Ljava/lang/String;

    move-result-object v4

    :goto_0
    invoke-virtual/range {p2 .. p2}, Lvo/j0$a;->J()Lvo/c;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v6, v6, v9

    if-eq v6, v8, :cond_3

    if-ne v6, v7, :cond_2

    invoke-virtual {v0}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v6

    invoke-virtual {v6}, Lvo/d2$a$b;->N0()Ljava/lang/String;

    move-result-object v6

    :goto_1
    move-object v7, v6

    goto :goto_2

    :cond_2
    new-instance v0, Lzt/l;

    invoke-direct {v0}, Lzt/l;-><init>()V

    throw v0

    :cond_3
    invoke-virtual {v0}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v6

    invoke-virtual {v6}, Lvo/d2$a$b;->T()Ljava/lang/String;

    move-result-object v6

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lvo/d2$a;->G()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v8

    move-object/from16 v6, p0

    iget-object v9, v6, Lfp/i;->a:Lir/b;

    invoke-virtual {v9}, Lir/b;->b()Lir/a;

    move-result-object v9

    new-instance v10, Lfp/f;

    invoke-direct {v10, v1}, Lfp/f;-><init>(Lls/g;)V

    new-instance v11, Lfp/g;

    invoke-direct {v11, v1, v0, v2, v3}, Lfp/g;-><init>(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)V

    new-instance v12, Lfp/h;

    invoke-direct {v12, v3}, Lfp/h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v2, v0}, Lip/l;->c(Lvo/d2$a;)Z

    move-result v13

    invoke-virtual {v0}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v1

    invoke-virtual {v1}, Lvo/d2$a$b;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {v0}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->t()Ljava/lang/String;

    move-result-object v1

    :cond_4
    move-object v14, v1

    move-object v6, v4

    invoke-direct/range {v5 .. v15}, Lvo/y3$d;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Lir/a;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLjava/lang/String;Lkr/l;)V

    return-object v5
.end method

.method public final m(Lvo/d2$a;Lvo/j0$b;Lls/g;Lip/l;Lkotlin/jvm/functions/Function1;Lkr/l;)Lvo/y3;
    .locals 25
    .param p1    # Lvo/d2$a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lvo/j0$b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lls/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lip/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkr/l;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvo/d2$a;",
            "Lvo/j0$b;",
            "Lls/g<",
            "Lvo/j0;",
            ">;",
            "Lip/l;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lvo/d2$b;",
            "Lkotlin/Unit;",
            ">;",
            "Lkr/l;",
            ")",
            "Lvo/y3;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    move-object/from16 v4, p1

    move-object/from16 v3, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    const-string v0, "renderProps"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "renderState"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workflowContext"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "videoCaptureHelper"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onOutput"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transition"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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

    move-result v8

    if-eqz v8, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lvo/f3;

    invoke-virtual {v9}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1

    goto :goto_0

    :cond_2
    move-object v8, v1

    :goto_0
    check-cast v8, Lvo/f3;

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lvo/f3;->g()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v0

    :goto_1
    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v0, v8}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lvo/d3;

    new-instance v11, Lqr/l4;

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v12

    invoke-virtual {v12}, Lvo/d2$a$b;->f0()Ljava/util/List;

    move-result-object v12

    if-eqz v12, :cond_4

    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v14

    const-string v15, "selectPage"

    invoke-static {v12, v13, v14, v15}, Lfp/j;->a(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    if-nez v12, :cond_5

    :cond_4
    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v12

    invoke-virtual {v12}, Lvo/d2$a$b;->V()Ljava/util/Map;

    move-result-object v12

    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v13

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/String;

    if-nez v12, :cond_5

    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v12

    :cond_5
    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v13

    const/4 v15, 0x4

    const/16 v16, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lqr/l4;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v7, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lvo/j0$b;->N()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_7

    goto :goto_3

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lvo/d3;

    invoke-virtual {v10}, Lvo/d3;->q2()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lvo/j0$b;->N()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move-object v1, v9

    :cond_9
    check-cast v1, Lvo/d3;

    :goto_3
    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->j0()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->b1()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4}, Lvo/d2$a;->G()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;

    move-result-object v11

    invoke-virtual {v2}, Lvo/j0$b;->L()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v0, v8}, Lkotlin/collections/q;->u(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v12, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lvo/f3;

    new-instance v13, Lvo/y3$a$a;

    invoke-virtual {v8}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8}, Lvo/f3;->f()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v8}, Lvo/f3;->a()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lwo/a0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-direct {v13, v14, v15, v8}, Lvo/y3$a$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v12, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->H()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lvo/j0$b;->M()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->S()Ljava/lang/String;

    move-result-object v14

    move-object v15, v9

    move-object v9, v8

    invoke-virtual {v2}, Lvo/j0$b;->N()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v0

    invoke-virtual {v0}, Lvo/d2$a$b;->g0()Ljava/lang/String;

    move-result-object v16

    if-eqz v1, :cond_b

    const/4 v0, 0x1

    :goto_5
    move/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v0, p0

    goto :goto_6

    :cond_b
    const/4 v0, 0x0

    goto :goto_5

    :goto_6
    iget-object v1, v0, Lfp/i;->a:Lir/b;

    invoke-virtual {v1}, Lir/b;->b()Lir/a;

    move-result-object v19

    move-object/from16 v20, v10

    move-object v10, v14

    invoke-virtual {v4}, Lvo/d2$a;->l()Lvo/i;

    move-result-object v14

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v1

    invoke-virtual {v1}, Lvo/d2$a$b;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_c

    invoke-virtual {v4}, Lvo/d2$a;->F()Lvo/d2$a$b;

    move-result-object v1

    invoke-virtual {v1}, Lvo/d2$a$b;->t()Ljava/lang/String;

    move-result-object v1

    :cond_c
    move-object/from16 v21, v1

    new-instance v22, Lvo/y3$a;

    move-object/from16 v23, v15

    new-instance v15, Lfp/a;

    invoke-direct {v15, v3}, Lfp/a;-><init>(Lls/g;)V

    new-instance v1, Lfp/b;

    invoke-direct {v1, v3}, Lfp/b;-><init>(Lls/g;)V

    new-instance v0, Lfp/c;

    move-object/from16 v24, v16

    move-object/from16 v16, v1

    move-object/from16 v1, v18

    move-object/from16 v18, v11

    move-object/from16 v11, v24

    invoke-direct/range {v0 .. v5}, Lfp/c;-><init>(Lvo/d3;Lvo/j0$b;Lls/g;Lvo/d2$a;Lip/l;)V

    new-instance v1, Lfp/d;

    invoke-direct {v1, v3, v4, v5, v6}, Lfp/d;-><init>(Lls/g;Lvo/d2$a;Lip/l;Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lfp/e;

    invoke-direct {v2, v6}, Lfp/e;-><init>(Lkotlin/jvm/functions/Function1;)V

    move-object v5, v12

    move-object v6, v13

    move/from16 v12, v17

    move-object/from16 v4, v18

    move-object/from16 v13, v19

    move-object/from16 v3, v20

    move-object/from16 v20, v21

    move-object/from16 v21, p6

    move-object/from16 v17, v0

    move-object/from16 v18, v1

    move-object/from16 v19, v2

    move-object/from16 v1, v22

    move-object/from16 v2, v23

    invoke-direct/range {v1 .. v21}, Lvo/y3$a;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyles$GovernmentIdStepStyle;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLir/a;Lvo/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Lkr/l;)V

    return-object v1
.end method
