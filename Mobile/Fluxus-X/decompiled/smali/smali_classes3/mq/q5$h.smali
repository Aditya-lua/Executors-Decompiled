.class public final Lmq/q5$h;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/q5;->z1(Lmq/q5$b;Lmq/y0$a;Lln/k$a;)Lmq/q5$d;
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
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderAcquireNextPose$1"
    f = "SelfieWorkflow.kt"
    l = {
        0x1ed
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
.field public t:I

.field public final synthetic u:Lmq/q5;

.field public final synthetic v:I

.field public final synthetic w:Lln/k$a;
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
.method public constructor <init>(Lmq/q5;ILln/k$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/q5;",
            "I",
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
            "Lmq/q5$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/q5$h;->u:Lmq/q5;

    iput p2, p0, Lmq/q5$h;->v:I

    iput-object p3, p0, Lmq/q5$h;->w:Lln/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lmq/q5;Lrq/a;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2}, Lmq/q5$h;->p(Lmq/q5;Lrq/a;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(Lmq/q5;Lrq/a;Lln/r$c;)Lkotlin/Unit;
    .locals 17

    move-object/from16 v0, p2

    invoke-virtual {v0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lmq/y0$a;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v1, Lmq/y0$a;

    move-object v4, v1

    goto :goto_0

    :cond_0
    move-object v4, v3

    :goto_0
    if-nez v4, :cond_1

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    const/16 v15, 0x1bf

    const/16 v16, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lmq/y0$a;->z(Lmq/y0$a;Lsn/v;JLjava/util/List;Lmq/y0;Lsn/v$b;ZLjava/util/List;Lmq/t;ZILjava/lang/Object;)Lmq/y0$a;

    move-result-object v1

    move-object/from16 v2, p0

    invoke-static {v2, v0, v1, v3}, Lmq/q5;->s1(Lmq/q5;Lln/r$c;Lmq/y0;Lmq/b0;)Lmq/y0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
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

    new-instance p1, Lmq/q5$h;

    iget-object v0, p0, Lmq/q5$h;->u:Lmq/q5;

    iget v1, p0, Lmq/q5$h;->v:I

    iget-object v2, p0, Lmq/q5$h;->w:Lln/k$a;

    invoke-direct {p1, v0, v1, v2, p2}, Lmq/q5$h;-><init>(Lmq/q5;ILln/k$a;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lmq/q5$h;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lmq/q5$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmq/q5$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lmq/q5$h;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmq/q5$h;->t:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq/q5$h;->u:Lmq/q5;

    invoke-static {p1}, Lmq/q5;->q1(Lmq/q5;)Lrq/b;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "selfiePoseManager"

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->u(Ljava/lang/String;)V

    move-object p1, v2

    :cond_2
    iget v1, p0, Lmq/q5$h;->v:I

    iput v3, p0, Lmq/q5$h;->t:I

    invoke-virtual {p1, v1, p0}, Lrq/b;->k(ILeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, p0, Lmq/q5$h;->w:Lln/k$a;

    iget-object v1, p0, Lmq/q5$h;->u:Lmq/q5;

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v4, p1

    check-cast v4, Lrq/a;

    invoke-virtual {v0}, Lln/k$a;->d()Lln/h;

    move-result-object v0

    new-instance v5, Lmq/s5;

    invoke-direct {v5, v1, v4}, Lmq/s5;-><init>(Lmq/q5;Lrq/a;)V

    invoke-static {v1, v2, v5, v3, v2}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v1

    invoke-interface {v0, v1}, Lln/h;->a(Ljava/lang/Object;)V

    :cond_4
    iget-object v0, p0, Lmq/q5$h;->u:Lmq/q5;

    iget-object v1, p0, Lmq/q5$h;->w:Lln/k$a;

    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-static {v0, v1, p1}, Lmq/q5;->t1(Lmq/q5;Lln/k$a;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
