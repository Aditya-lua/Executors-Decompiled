.class public final Lmq/q5$i;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/q5;->K1(Lmq/q5$b;Lmq/y0$b;Lln/k$a;)Lmq/q5$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCapture$1"
    f = "SelfieWorkflow.kt"
    l = {
        0x563,
        0x565
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:J

.field public u:I

.field public final synthetic v:Lmq/y0$b;

.field public final synthetic w:Lmq/q5;

.field public final synthetic x:Lln/k$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lln/k<",
            "Lmq/q5$b;",
            "Lmq/y0;",
            "Lmq/q5$c;",
            "Ljava/lang/Object;",
            ">.a;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmq/y0$b;Lmq/q5;Lln/k$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/y0$b;",
            "Lmq/q5;",
            "Lln/k<",
            "-",
            "Lmq/q5$b;",
            "Lmq/y0;",
            "+",
            "Lmq/q5$c;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Leu/b<",
            "-",
            "Lmq/q5$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/q5$i;->v:Lmq/y0$b;

    iput-object p2, p0, Lmq/q5$i;->w:Lmq/q5;

    iput-object p3, p0, Lmq/q5$i;->x:Lln/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lmq/y0$b;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1}, Lmq/q5$i;->p(Lmq/y0$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lmq/y0$b;Lln/r$c;)Lkotlin/Unit;
    .locals 12

    invoke-virtual {p1}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lmq/y0$b;

    if-eqz v1, :cond_0

    check-cast v0, Lmq/y0$b;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_1
    invoke-virtual {v0}, Lmq/y0$b;->C()Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {p0}, Lmq/y0$b;->C()Ljava/lang/Long;

    move-result-object p0

    invoke-static {v1, p0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0

    :cond_2
    invoke-static {v0}, Ltq/l2;->c(Lmq/y0;)V

    invoke-virtual {p1}, Lln/r$c;->b()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmq/q5$b;

    invoke-virtual {p0}, Lmq/q5$b;->J()Z

    move-result p0

    if-eqz p0, :cond_3

    invoke-static {}, Lkotlin/collections/p;->k()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v0}, Lmq/y0$b;->f()Lsn/v;

    move-result-object v2

    invoke-virtual {v0}, Lmq/y0$b;->t()J

    move-result-wide v3

    const/4 p0, 0x0

    invoke-static {p1, p0}, Lmq/j6;->k(Lln/r$c;Z)Lmq/y0;

    move-result-object v6

    invoke-virtual {v0}, Lmq/y0$b;->v()Lsn/v$b;

    move-result-object v7

    invoke-virtual {v0}, Lmq/y0$b;->s()Z

    move-result v8

    invoke-virtual {v0}, Lmq/y0$b;->i()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v0}, Lmq/y0$b;->j()Lmq/t;

    move-result-object v10

    invoke-virtual {v0}, Lmq/y0$b;->g()Z

    move-result v11

    new-instance v1, Lmq/y0$a;

    invoke-direct/range {v1 .. v11}, Lmq/y0$a;-><init>(Lsn/v;JLjava/util/List;Lmq/y0;Lsn/v$b;ZLjava/util/List;Lmq/t;Z)V

    invoke-virtual {p1, v1}, Lln/r$c;->e(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    new-instance v2, Lmq/y0$k;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lmq/y0$k;-><init>(Lmq/y0;Lsn/v$b;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v2}, Lln/r$c;->e(Ljava/lang/Object;)V

    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lmq/q5$i;

    iget-object v0, p0, Lmq/q5$i;->v:Lmq/y0$b;

    iget-object v1, p0, Lmq/q5$i;->w:Lmq/q5;

    iget-object v2, p0, Lmq/q5$i;->x:Lln/k$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lmq/q5$i;-><init>(Lmq/y0$b;Lmq/q5;Lln/k$a;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lmq/q5$i;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lmq/q5$i;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmq/q5$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lmq/q5$i;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmq/q5$i;->u:I

    const/4 v2, 0x2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-wide v5, p0, Lmq/q5$i;->t:J

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq/q5$i;->v:Lmq/y0$b;

    invoke-virtual {p1}, Lmq/y0$b;->C()Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    sub-long/2addr v5, v7

    sget-object p1, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    sget-object p1, Lzu/b;->d:Lzu/b;

    invoke-static {v5, v6, p1}, Lkotlin/time/b;->q(JLzu/b;)J

    move-result-wide v7

    iput-wide v5, p0, Lmq/q5$i;->t:J

    iput v4, p0, Lmq/q5$i;->u:I

    invoke-static {v7, v8, p0}, Lav/z0;->c(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lmq/q5$i;->w:Lmq/q5;

    invoke-static {p1}, Lmq/q5;->q1(Lmq/q5;)Lrq/b;

    move-result-object p1

    if-nez p1, :cond_4

    const-string p1, "selfiePoseManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v3

    :cond_4
    iput-wide v5, p0, Lmq/q5$i;->t:J

    iput v2, p0, Lmq/q5$i;->u:I

    invoke-virtual {p1, p0}, Lrq/b;->o(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    iget-object p1, p0, Lmq/q5$i;->w:Lmq/q5;

    invoke-static {p1}, Lmq/q5;->p1(Lmq/q5;)Lmq/f0;

    move-result-object p1

    invoke-virtual {p1}, Lmq/f0;->n()V

    iget-object p1, p0, Lmq/q5$i;->x:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v0, p0, Lmq/q5$i;->w:Lmq/q5;

    iget-object v1, p0, Lmq/q5$i;->v:Lmq/y0$b;

    new-instance v2, Lmq/t5;

    invoke-direct {v2, v1}, Lmq/t5;-><init>(Lmq/y0$b;)V

    invoke-static {v0, v3, v2, v4, v3}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
