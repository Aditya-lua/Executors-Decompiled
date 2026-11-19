.class public final Ltq/k2$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltq/k2;->o1(Lmq/q5$b;Lmq/y0$b;)Lmq/q5$d;
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
    c = "com.withpersona.sdk2.inquiry.selfie.state.SelfieStepStateManager$renderCapture$1"
    f = "SelfieStepStateManager.kt"
    l = {
        0x558,
        0x560
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

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lmq/y0$b;

.field public final synthetic x:Ltq/k2;

.field public final synthetic y:Lmq/q5$b;


# direct methods
.method public constructor <init>(Lmq/y0$b;Ltq/k2;Lmq/q5$b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/y0$b;",
            "Ltq/k2;",
            "Lmq/q5$b;",
            "Leu/b<",
            "-",
            "Ltq/k2$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltq/k2$i;->w:Lmq/y0$b;

    iput-object p2, p0, Ltq/k2$i;->x:Ltq/k2;

    iput-object p3, p0, Ltq/k2$i;->y:Lmq/q5$b;

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

    new-instance v0, Ltq/k2$i;

    iget-object v1, p0, Ltq/k2$i;->w:Lmq/y0$b;

    iget-object v2, p0, Ltq/k2$i;->x:Ltq/k2;

    iget-object v3, p0, Ltq/k2$i;->y:Lmq/q5$b;

    invoke-direct {v0, v1, v2, v3, p1}, Ltq/k2$i;-><init>(Lmq/y0$b;Ltq/k2;Lmq/q5$b;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Ltq/k2$i;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ltq/k2$i;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Ltq/k2$i;->u:Ljava/lang/Object;

    check-cast v0, Lmq/y0$b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v3, p0, Ltq/k2$i;->t:J

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ltq/k2$i;->w:Lmq/y0$b;

    invoke-virtual {p1}, Lmq/y0$b;->C()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    sub-long/2addr v4, v6

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    sget-object p1, Lzu/b;->d:Lzu/b;

    invoke-static {v4, v5, p1}, Lkotlin/time/b;->q(JLzu/b;)J

    move-result-wide v6

    iput-wide v4, p0, Ltq/k2$i;->t:J

    iput v3, p0, Ltq/k2$i;->v:I

    invoke-static {v6, v7, p0}, Lav/z0;->c(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_2

    :cond_3
    move-wide v3, v4

    :goto_0
    iget-object p1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    invoke-virtual {p1}, Lls/g;->i()Lls/h;

    move-result-object p1

    instance-of v1, p1, Lmq/y0$b;

    if-eqz v1, :cond_4

    check-cast p1, Lmq/y0$b;

    goto :goto_1

    :cond_4
    const/4 p1, 0x0

    :goto_1
    if-nez p1, :cond_5

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    invoke-virtual {p1}, Lmq/y0$b;->C()Ljava/lang/Long;

    move-result-object v1

    iget-object v5, p0, Ltq/k2$i;->w:Lmq/y0$b;

    invoke-virtual {v5}, Lmq/y0$b;->C()Ljava/lang/Long;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
    invoke-static {p1}, Ltq/l2;->c(Lmq/y0;)V

    iget-object v1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-static {v1}, Ltq/k2;->T0(Ltq/k2;)Lrq/b;

    move-result-object v1

    iput-object p1, p0, Ltq/k2$i;->u:Ljava/lang/Object;

    iput-wide v3, p0, Ltq/k2$i;->t:J

    iput v2, p0, Ltq/k2$i;->v:I

    invoke-virtual {v1, p0}, Lrq/b;->o(Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    move-object v0, p1

    :goto_3
    iget-object p1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-static {p1}, Ltq/k2;->S0(Ltq/k2;)Lmq/f0;

    move-result-object p1

    invoke-virtual {p1}, Lmq/f0;->n()V

    iget-object p1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-virtual {p1}, Lls/d;->b()Ldv/c0;

    move-result-object p1

    invoke-interface {p1}, Ldv/c0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lmq/q5$b;

    invoke-virtual {p1}, Lmq/q5$b;->J()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lmq/y0$b;->f()Lsn/v;

    move-result-object v2

    invoke-virtual {v0}, Lmq/y0$b;->t()J

    move-result-wide v3

    iget-object v1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-virtual {v1}, Lls/d;->d()Lls/g;

    move-result-object v1

    const/4 v6, 0x0

    invoke-static {v1, v6}, Ltq/l2;->a(Lls/g;Z)Lmq/y0;

    move-result-object v6

    invoke-virtual {v0}, Lmq/y0$b;->v()Lsn/v$b;

    move-result-object v7

    invoke-virtual {v0}, Lmq/y0$b;->s()Z

    move-result v8

    iget-object v1, p0, Ltq/k2$i;->w:Lmq/y0$b;

    invoke-virtual {v1}, Lmq/y0$b;->i()Ljava/util/List;

    move-result-object v9

    iget-object v1, p0, Ltq/k2$i;->y:Lmq/q5$b;

    invoke-virtual {v1}, Lmq/q5$b;->D()Lmq/t;

    move-result-object v10

    invoke-virtual {v0}, Lmq/y0$b;->g()Z

    move-result v11

    new-instance v1, Lmq/y0$a;

    invoke-direct/range {v1 .. v11}, Lmq/y0$a;-><init>(Lsn/v;JLjava/util/List;Lmq/y0;Lsn/v$b;ZLjava/util/List;Lmq/t;Z)V

    invoke-virtual {p1, v1}, Lls/g;->p(Lls/h;)V

    goto :goto_4

    :cond_8
    iget-object p1, p0, Ltq/k2$i;->x:Ltq/k2;

    invoke-virtual {p1}, Lls/d;->d()Lls/g;

    move-result-object p1

    new-instance v0, Lmq/y0$k;

    iget-object v1, p0, Ltq/k2$i;->y:Lmq/q5$b;

    invoke-virtual {v1}, Lmq/q5$b;->L()Lmq/q5$b$b;

    move-result-object v1

    invoke-virtual {v1}, Lmq/q5$b$b;->Y()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lmq/y0$k;-><init>(Lmq/y0;Lsn/v$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lls/g;->p(Lls/h;)V

    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
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

    invoke-virtual {p0, p1}, Ltq/k2$i;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Ltq/k2$i;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltq/k2$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
