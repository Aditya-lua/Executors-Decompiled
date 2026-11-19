.class public final Ltq/k2$l;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltq/k2;->A1(Lmq/q5$b;Lmq/y0$d;)Lmq/q5$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCountdownToCapture$2"
    f = "SelfieStepStateManager.kt"
    l = {
        0x49c
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:J

.field public u:I

.field public final synthetic v:Lmq/q5$b;

.field public final synthetic w:Ltq/k2;

.field public final synthetic x:Lmq/y0$d;


# direct methods
.method public constructor <init>(Lmq/q5$b;Ltq/k2;Lmq/y0$d;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/q5$b;",
            "Ltq/k2;",
            "Lmq/y0$d;",
            "Leu/b<",
            "-",
            "Ltq/k2$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltq/k2$l;->v:Lmq/q5$b;

    iput-object p2, p0, Ltq/k2$l;->w:Ltq/k2;

    iput-object p3, p0, Ltq/k2$l;->x:Lmq/y0$d;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltq/k2$l;

    iget-object v1, p0, Ltq/k2$l;->v:Lmq/q5$b;

    iget-object v2, p0, Ltq/k2$l;->w:Ltq/k2;

    iget-object v3, p0, Ltq/k2$l;->x:Lmq/y0$d;

    invoke-direct {v0, v1, v2, v3, p1}, Ltq/k2$l;-><init>(Lmq/q5$b;Ltq/k2;Lmq/y0$d;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Ltq/k2$l;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Ltq/k2$l;->u:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-wide v1, v0, Ltq/k2$l;->t:J

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v2, v0, Ltq/k2$l;->v:Lmq/q5$b;

    invoke-static {v2}, Lmq/b1;->a(Lmq/q5$b;)J

    move-result-wide v4

    iput-wide v4, v0, Ltq/k2$l;->t:J

    iput v3, v0, Ltq/k2$l;->u:I

    invoke-static {v4, v5, v0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    return-object v1

    :cond_2
    move-wide v1, v4

    :goto_0
    iget-object v4, v0, Ltq/k2$l;->w:Ltq/k2;

    invoke-virtual {v4}, Lls/d;->d()Lls/g;

    move-result-object v4

    invoke-virtual {v4}, Lls/g;->i()Lls/h;

    move-result-object v4

    instance-of v5, v4, Lmq/y0$d;

    if-eqz v5, :cond_3

    check-cast v4, Lmq/y0$d;

    :goto_1
    move-object v5, v4

    goto :goto_2

    :cond_3
    const/4 v4, 0x0

    goto :goto_1

    :goto_2
    if-nez v5, :cond_4

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1

    :cond_4
    invoke-virtual {v5}, Lmq/y0$d;->C()I

    move-result v4

    if-le v4, v3, :cond_5

    const-wide/16 v6, 0x0

    cmp-long v1, v1, v6

    if-lez v1, :cond_5

    iget-object v1, v0, Ltq/k2$l;->w:Ltq/k2;

    invoke-virtual {v1}, Lls/d;->d()Lls/g;

    move-result-object v1

    add-int/lit8 v6, v4, -0x1

    invoke-virtual {v5}, Lmq/y0$d;->F()Lxn/c;

    move-result-object v7

    const/16 v23, 0x7ffc

    const/16 v24, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v5 .. v24}, Lmq/y0$d;->z(Lmq/y0$d;ILxn/c;JLsn/v;JFLxn/b;Ljava/util/List;Ljava/util/List;Lmq/y0;Lmq/t;ZLsn/v$b;ZZILjava/lang/Object;)Lmq/y0$d;

    move-result-object v2

    invoke-virtual {v1, v2}, Lls/g;->p(Lls/h;)V

    goto :goto_3

    :cond_5
    iget-object v1, v0, Ltq/k2$l;->w:Ltq/k2;

    invoke-virtual {v1}, Lls/d;->d()Lls/g;

    move-result-object v1

    invoke-virtual {v5}, Lmq/y0$d;->F()Lxn/c;

    move-result-object v7

    invoke-virtual {v5}, Lmq/y0$d;->i()Ljava/util/List;

    move-result-object v11

    invoke-virtual {v5}, Lmq/y0$d;->a()J

    move-result-wide v12

    invoke-virtual {v5}, Lmq/y0$d;->f()Lsn/v;

    move-result-object v17

    iget-object v2, v0, Ltq/k2$l;->x:Lmq/y0$d;

    invoke-virtual {v2}, Lmq/y0$d;->t()J

    move-result-wide v15

    iget-object v2, v0, Ltq/k2$l;->w:Ltq/k2;

    invoke-virtual {v2}, Lls/d;->d()Lls/g;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ltq/l2;->a(Lls/g;Z)Lmq/y0;

    move-result-object v18

    iget-object v2, v0, Ltq/k2$l;->v:Lmq/q5$b;

    invoke-virtual {v2}, Lmq/q5$b;->D()Lmq/t;

    move-result-object v19

    iget-object v2, v0, Ltq/k2$l;->x:Lmq/y0$d;

    invoke-virtual {v2}, Lmq/y0$d;->D()F

    move-result v8

    iget-object v2, v0, Ltq/k2$l;->x:Lmq/y0$d;

    invoke-virtual {v2}, Lmq/y0$d;->B()Lxn/b;

    move-result-object v9

    iget-object v2, v0, Ltq/k2$l;->x:Lmq/y0$d;

    invoke-virtual {v2}, Lmq/y0$d;->v()Lsn/v$b;

    move-result-object v20

    iget-object v2, v0, Ltq/k2$l;->x:Lmq/y0$d;

    invoke-virtual {v2}, Lmq/y0$d;->s()Z

    move-result v21

    invoke-virtual {v5}, Lmq/y0$d;->G()Z

    move-result v24

    new-instance v6, Lmq/y0$b;

    const/16 v25, 0x6048

    const/16 v26, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v6 .. v26}, Lmq/y0$b;-><init>(Lxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZLmq/y0$h;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v6}, Lls/g;->p(Lls/h;)V

    :goto_3
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltq/k2$l;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ltq/k2$l;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltq/k2$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
