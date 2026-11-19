.class public final Lmq/q5$l;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/q5;->Z1(Lmq/q5$b;Lmq/y0$d;Lln/k$a;)Lmq/q5$d;
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
    c = "com.withpersona.sdk2.inquiry.selfie.SelfieWorkflow$renderCountdownToCapture$2"
    f = "SelfieWorkflow.kt"
    l = {
        0x4a3
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

.field public final synthetic v:Lmq/q5$b;

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

.field public final synthetic x:Lmq/q5;

.field public final synthetic y:Lmq/y0$d;


# direct methods
.method public constructor <init>(Lmq/q5$b;Lln/k$a;Lmq/q5;Lmq/y0$d;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/q5$b;",
            "Lln/k<",
            "-",
            "Lmq/q5$b;",
            "Lmq/y0;",
            "+",
            "Lmq/q5$c;",
            "+",
            "Ljava/lang/Object;",
            ">.a;",
            "Lmq/q5;",
            "Lmq/y0$d;",
            "Leu/b<",
            "-",
            "Lmq/q5$l;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/q5$l;->v:Lmq/q5$b;

    iput-object p2, p0, Lmq/q5$l;->w:Lln/k$a;

    iput-object p3, p0, Lmq/q5$l;->x:Lmq/q5;

    iput-object p4, p0, Lmq/q5$l;->y:Lmq/y0$d;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(JLmq/y0$d;Lmq/q5$b;Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lmq/q5$l;->p(JLmq/y0$d;Lmq/q5$b;Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method public static final p(JLmq/y0$d;Lmq/q5$b;Lln/r$c;)Lkotlin/Unit;
    .locals 24

    move-object/from16 v0, p4

    invoke-virtual {v0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lmq/y0$d;

    if-eqz v2, :cond_0

    check-cast v1, Lmq/y0$d;

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
    invoke-virtual {v2}, Lmq/y0$d;->C()I

    move-result v1

    const/4 v3, 0x1

    if-le v1, v3, :cond_2

    const-wide/16 v4, 0x0

    cmp-long v4, p0, v4

    if-lez v4, :cond_2

    add-int/lit8 v3, v1, -0x1

    invoke-virtual {v2}, Lmq/y0$d;->F()Lxn/c;

    move-result-object v4

    const/16 v20, 0x7ffc

    const/16 v21, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v2 .. v21}, Lmq/y0$d;->z(Lmq/y0$d;ILxn/c;JLsn/v;JFLxn/b;Ljava/util/List;Ljava/util/List;Lmq/y0;Lmq/t;ZLsn/v$b;ZZILjava/lang/Object;)Lmq/y0$d;

    move-result-object v1

    invoke-virtual {v0, v1}, Lln/r$c;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lmq/y0$d;->w()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v2}, Lmq/y0$d;->F()Lxn/c;

    move-result-object v4

    invoke-virtual {v2}, Lmq/y0$d;->i()Ljava/util/List;

    move-result-object v8

    invoke-virtual {v2}, Lmq/y0$d;->a()J

    move-result-wide v9

    invoke-virtual {v2}, Lmq/y0$d;->f()Lsn/v;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lmq/y0$d;->t()J

    move-result-wide v12

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lmq/j6;->k(Lln/r$c;Z)Lmq/y0;

    move-result-object v15

    invoke-virtual/range {p3 .. p3}, Lmq/q5$b;->D()Lmq/t;

    move-result-object v16

    invoke-virtual/range {p2 .. p2}, Lmq/y0$d;->D()F

    move-result v5

    invoke-virtual/range {p2 .. p2}, Lmq/y0$d;->B()Lxn/b;

    move-result-object v6

    invoke-virtual/range {p2 .. p2}, Lmq/y0$d;->v()Lsn/v$b;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Lmq/y0$d;->s()Z

    move-result v18

    invoke-virtual/range {p2 .. p2}, Lmq/y0$d;->G()Z

    move-result v21

    new-instance v3, Lmq/y0$b;

    const/16 v22, 0x6040

    const/16 v23, 0x0

    const/4 v11, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v3 .. v23}, Lmq/y0$b;-><init>(Lxn/c;FLxn/b;Ljava/util/List;Ljava/util/List;JZJLsn/v;Lmq/y0;Lmq/t;Lsn/v$b;ZLmq/y0$h;Ljava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v3}, Lln/r$c;->e(Ljava/lang/Object;)V

    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Lmq/q5$l;

    iget-object v1, p0, Lmq/q5$l;->v:Lmq/q5$b;

    iget-object v2, p0, Lmq/q5$l;->w:Lln/k$a;

    iget-object v3, p0, Lmq/q5$l;->x:Lmq/q5;

    iget-object v4, p0, Lmq/q5$l;->y:Lmq/y0$d;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lmq/q5$l;-><init>(Lmq/q5$b;Lln/k$a;Lmq/q5;Lmq/y0$d;Leu/b;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lmq/q5$l;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lmq/q5$l;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmq/q5$l;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lmq/q5$l;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmq/q5$l;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v0, p0, Lmq/q5$l;->t:J

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq/q5$l;->v:Lmq/q5$b;

    invoke-static {p1}, Lmq/b1;->a(Lmq/q5$b;)J

    move-result-wide v3

    iput-wide v3, p0, Lmq/q5$l;->t:J

    iput v2, p0, Lmq/q5$l;->u:I

    invoke-static {v3, v4, p0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-wide v0, v3

    :goto_0
    iget-object p1, p0, Lmq/q5$l;->w:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    iget-object v3, p0, Lmq/q5$l;->x:Lmq/q5;

    iget-object v4, p0, Lmq/q5$l;->y:Lmq/y0$d;

    iget-object v5, p0, Lmq/q5$l;->v:Lmq/q5$b;

    new-instance v6, Lmq/w5;

    invoke-direct {v6, v0, v1, v4, v5}, Lmq/w5;-><init>(JLmq/y0$d;Lmq/q5$b;)V

    const/4 v0, 0x0

    invoke-static {v3, v0, v6, v2, v0}, Lln/w;->g(Lln/k;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
