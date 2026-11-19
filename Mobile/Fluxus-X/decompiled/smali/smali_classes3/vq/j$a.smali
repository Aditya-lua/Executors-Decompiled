.class public final Lvq/j$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvq/j;->q(Lmq/q5$b;Lmq/y0$f;Lln/k$a;)Lmq/q5$d;
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
    c = "com.withpersona.sdk2.inquiry.selfie.video_capture.LocalVideoCaptureRenderer$renderFinalizeVideoCapture$1"
    f = "LocalVideoCaptureRenderer.kt"
    l = {
        0x29
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

.field public final synthetic u:Lmq/y0$f;

.field public final synthetic v:Lln/k$a;
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
.method public constructor <init>(Lmq/y0$f;Lln/k$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/y0$f;",
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
            "Lvq/j$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvq/j$a;->u:Lmq/y0$f;

    iput-object p2, p0, Lvq/j$a;->v:Lln/k$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method

.method public static synthetic m(Lln/r$c;)Lkotlin/Unit;
    .locals 0

    invoke-static {p0}, Lvq/j$a;->p(Lln/r$c;)Lkotlin/Unit;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lln/r$c;)Lkotlin/Unit;
    .locals 14

    invoke-virtual {p0}, Lln/r$c;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lmq/y0$f;

    if-eqz v1, :cond_0

    check-cast v0, Lmq/y0$f;

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
    const/16 v12, 0xfb

    const/4 v13, 0x0

    const/4 v2, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Lmq/y0$f;->z(Lmq/y0$f;Ljava/util/List;JZZLsn/v;JLmq/y0;Lsn/v$b;ILjava/lang/Object;)Lmq/y0$f;

    move-result-object v0

    invoke-virtual {p0, v0}, Lln/r$c;->e(Ljava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance p1, Lvq/j$a;

    iget-object v0, p0, Lvq/j$a;->u:Lmq/y0$f;

    iget-object v1, p0, Lvq/j$a;->v:Lln/k$a;

    invoke-direct {p1, v0, v1, p2}, Lvq/j$a;-><init>(Lmq/y0$f;Lln/k$a;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lvq/j$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lvq/j$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lvq/j$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lvq/j$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lvq/j$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lvq/j$a;->u:Lmq/y0$f;

    invoke-virtual {p1}, Lmq/y0$f;->B()J

    move-result-wide v3

    iput v2, p0, Lvq/j$a;->t:I

    invoke-static {v3, v4, p0}, Lav/z0;->b(JLeu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object p1, p0, Lvq/j$a;->v:Lln/k$a;

    invoke-virtual {p1}, Lln/k$a;->d()Lln/h;

    move-result-object p1

    new-instance v0, Lvq/i;

    invoke-direct {v0}, Lvq/i;-><init>()V

    const/4 v1, 0x0

    invoke-static {v1, v0, v2, v1}, Lln/w;->f(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lln/r;

    move-result-object v0

    invoke-interface {p1, v0}, Lln/h;->a(Ljava/lang/Object;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
