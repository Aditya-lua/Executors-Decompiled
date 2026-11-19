.class public final Lmq/n$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq/n;->w(Lmq/q5$d$c;Lnn/z;)V
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
    c = "com.withpersona.sdk2.inquiry.selfie.OldCameraScreenRunner$showRendering$1$1"
    f = "OldCameraScreenRunner.kt"
    l = {
        0xec,
        0xee
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

.field public final synthetic u:Lmq/n;

.field public final synthetic v:Lmq/q5$d$c$b;

.field public final synthetic w:Landroidx/lifecycle/m;


# direct methods
.method public constructor <init>(Lmq/n;Lmq/q5$d$c$b;Landroidx/lifecycle/m;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq/n;",
            "Lmq/q5$d$c$b;",
            "Landroidx/lifecycle/m;",
            "Leu/b<",
            "-",
            "Lmq/n$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq/n$d;->u:Lmq/n;

    iput-object p2, p0, Lmq/n$d;->v:Lmq/q5$d$c$b;

    iput-object p3, p0, Lmq/n$d;->w:Landroidx/lifecycle/m;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
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

    new-instance p1, Lmq/n$d;

    iget-object v0, p0, Lmq/n$d;->u:Lmq/n;

    iget-object v1, p0, Lmq/n$d;->v:Lmq/q5$d$c$b;

    iget-object v2, p0, Lmq/n$d;->w:Landroidx/lifecycle/m;

    invoke-direct {p1, v0, v1, v2, p2}, Lmq/n$d;-><init>(Lmq/n;Lmq/q5$d$c$b;Landroidx/lifecycle/m;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lmq/n$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lmq/n$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lmq/n$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lmq/n$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lmq/n$d;->t:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq/n$d;->u:Lmq/n;

    invoke-static {p1}, Lmq/n;->l(Lmq/n;)Lsn/i;

    move-result-object p1

    invoke-interface {p1}, Lsn/i;->b()Ldv/p0;

    move-result-object p1

    new-instance v1, Lmq/n$d$a;

    invoke-direct {v1, v2}, Lmq/n$d$a;-><init>(Leu/b;)V

    invoke-static {p1, v1}, Ldv/j;->O(Ldv/h;Lkotlin/jvm/functions/Function2;)Ldv/h;

    move-result-object p1

    iput v4, p0, Lmq/n$d;->t:I

    invoke-static {p1, p0}, Ldv/j;->i(Ldv/h;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {}, Lav/g1;->c()Lav/n2;

    move-result-object p1

    new-instance v1, Lmq/n$d$b;

    iget-object v4, p0, Lmq/n$d;->v:Lmq/q5$d$c$b;

    iget-object v5, p0, Lmq/n$d;->u:Lmq/n;

    iget-object v6, p0, Lmq/n$d;->w:Landroidx/lifecycle/m;

    invoke-direct {v1, v4, v5, v6, v2}, Lmq/n$d$b;-><init>(Lmq/q5$d$c$b;Lmq/n;Landroidx/lifecycle/m;Leu/b;)V

    iput v3, p0, Lmq/n$d;->t:I

    invoke-static {p1, v1, p0}, Lav/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
