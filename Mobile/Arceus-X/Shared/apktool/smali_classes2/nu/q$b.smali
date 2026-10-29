.class public final Lnu/q$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/q;->f(Lnu/h;J)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lzt/n<",
        "Lku/p0;",
        "Lnu/i<",
        "-TT;>;",
        "Lnt/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000*\u00020\u00012\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "T",
        "Lku/p0;",
        "Lnu/i;",
        "downStream",
        "",
        "<anonymous>",
        "(Lku/p0;Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1"
    f = "Delay.kt"
    l = {
        0x19d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:J

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public synthetic w:Ljava/lang/Object;

.field public final synthetic x:J

.field public final synthetic y:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JLnu/h;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lnu/h<",
            "+TT;>;",
            "Lnt/b<",
            "-",
            "Lnu/q$b;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Lnu/q$b;->x:J

    iput-object p3, p0, Lnu/q$b;->y:Lnu/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lku/p0;

    check-cast p2, Lnu/i;

    check-cast p3, Lnt/b;

    invoke-virtual {p0, p1, p2, p3}, Lnu/q$b;->q(Lku/p0;Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnu/q$b;->u:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v4, p0, Lnu/q$b;->t:J

    iget-object v1, p0, Lnu/q$b;->w:Ljava/lang/Object;

    check-cast v1, Lmu/x;

    iget-object v6, p0, Lnu/q$b;->v:Ljava/lang/Object;

    check-cast v6, Lnu/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu/q$b;->v:Ljava/lang/Object;

    check-cast p1, Lku/p0;

    iget-object v1, p0, Lnu/q$b;->w:Ljava/lang/Object;

    check-cast v1, Lnu/i;

    iget-wide v4, p0, Lnu/q$b;->x:J

    sget-object v6, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    invoke-virtual {v6}, Lkotlin/time/a$a;->b()J

    move-result-wide v6

    invoke-static {v4, v5, v6, v7}, Lkotlin/time/a;->j(JJ)I

    move-result v4

    if-lez v4, :cond_4

    iget-object v4, p0, Lnu/q$b;->y:Lnu/h;

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v4, v5, v3, v6, v3}, Lnu/j;->c(Lnu/h;ILmu/a;ILjava/lang/Object;)Lnu/h;

    move-result-object v4

    invoke-static {v4, p1}, Lnu/j;->G(Lnu/h;Lku/p0;)Lmu/x;

    move-result-object p1

    iget-wide v4, p0, Lnu/q$b;->x:J

    move-object v6, v1

    move-object v1, p1

    :cond_2
    new-instance p1, Ltu/k;

    invoke-interface {p0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v7

    invoke-direct {p1, v7}, Ltu/k;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    invoke-interface {v1}, Lmu/x;->A()Ltu/h;

    move-result-object v7

    new-instance v8, Lnu/q$b$a;

    invoke-direct {v8, v6, v3}, Lnu/q$b$a;-><init>(Lnu/i;Lnt/b;)V

    invoke-interface {p1, v7, v8}, Ltu/d;->c(Ltu/h;Lkotlin/jvm/functions/Function2;)V

    new-instance v7, Lnu/q$b$b;

    invoke-direct {v7, v4, v5, v3}, Lnu/q$b$b;-><init>(JLnt/b;)V

    invoke-static {p1, v4, v5, v7}, Ltu/c;->b(Ltu/d;JLkotlin/jvm/functions/Function1;)V

    iput-object v6, p0, Lnu/q$b;->v:Ljava/lang/Object;

    iput-object v1, p0, Lnu/q$b;->w:Ljava/lang/Object;

    iput-wide v4, p0, Lnu/q$b;->t:J

    iput v2, p0, Lnu/q$b;->u:I

    invoke-virtual {p1, p0}, Ltu/k;->o(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_4
    new-instance p1, Lku/e3;

    const-string v0, "Timed out immediately"

    invoke-direct {p1, v0}, Lku/e3;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lku/p0;Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnu/i<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lnu/q$b;

    iget-wide v1, p0, Lnu/q$b;->x:J

    iget-object v3, p0, Lnu/q$b;->y:Lnu/h;

    invoke-direct {v0, v1, v2, v3, p3}, Lnu/q$b;-><init>(JLnu/h;Lnt/b;)V

    iput-object p1, v0, Lnu/q$b;->v:Ljava/lang/Object;

    iput-object p2, v0, Lnu/q$b;->w:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lnu/q$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
