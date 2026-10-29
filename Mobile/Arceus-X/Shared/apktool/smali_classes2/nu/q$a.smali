.class public final Lnu/q$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lzt/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/q;->d(Lnu/h;Lkotlin/jvm/functions/Function1;)Lnu/h;
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
        "downstream",
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
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1"
    f = "Delay.kt"
    l = {
        0xd7,
        0x19f
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public synthetic w:Ljava/lang/Object;

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "TT;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic z:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lnu/h;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;",
            "Lnu/h<",
            "+TT;>;",
            "Lnt/b<",
            "-",
            "Lnu/q$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/q$a;->y:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lnu/q$a;->z:Lnu/h;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lku/p0;

    check-cast p2, Lnu/i;

    check-cast p3, Lnt/b;

    invoke-virtual {p0, p1, p2, p3}, Lnu/q$a;->q(Lku/p0;Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnu/q$a;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Lnu/q$a;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    iget-object v5, p0, Lnu/q$a;->x:Ljava/lang/Object;

    check-cast v5, Lmu/x;

    iget-object v6, p0, Lnu/q$a;->w:Ljava/lang/Object;

    check-cast v6, Lnu/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :cond_0
    move-object v7, v6

    move-object v6, v5

    move-object v5, v1

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v1, p0, Lnu/q$a;->u:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/b0;

    iget-object v5, p0, Lnu/q$a;->t:Ljava/lang/Object;

    check-cast v5, Lkotlin/jvm/internal/c0;

    iget-object v6, p0, Lnu/q$a;->x:Ljava/lang/Object;

    check-cast v6, Lmu/x;

    iget-object v7, p0, Lnu/q$a;->w:Ljava/lang/Object;

    check-cast v7, Lnu/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu/q$a;->w:Ljava/lang/Object;

    move-object v5, p1

    check-cast v5, Lku/p0;

    iget-object p1, p0, Lnu/q$a;->x:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    new-instance v8, Lnu/q$a$c;

    iget-object v1, p0, Lnu/q$a;->z:Lnu/h;

    invoke-direct {v8, v1, v4}, Lnu/q$a$c;-><init>(Lnu/h;Lnt/b;)V

    const/4 v9, 0x3

    const/4 v10, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lmu/t;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;ILkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lmu/x;

    move-result-object v1

    new-instance v5, Lkotlin/jvm/internal/c0;

    invoke-direct {v5}, Lkotlin/jvm/internal/c0;-><init>()V

    move-object v7, p1

    move-object v6, v1

    :goto_0
    iget-object p1, v5, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    sget-object v1, Lou/t;->c:Lqu/e0;

    if-eq p1, v1, :cond_a

    new-instance v1, Lkotlin/jvm/internal/b0;

    invoke-direct {v1}, Lkotlin/jvm/internal/b0;-><init>()V

    iget-object p1, v5, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-eqz p1, :cond_7

    iget-object v8, p0, Lnu/q$a;->y:Lkotlin/jvm/functions/Function1;

    sget-object v9, Lou/t;->a:Lqu/e0;

    if-ne p1, v9, :cond_4

    move-object p1, v4

    :cond_4
    invoke-interface {v8, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    iput-wide v10, v1, Lkotlin/jvm/internal/b0;->a:J

    const-wide/16 v12, 0x0

    cmp-long p1, v10, v12

    if-ltz p1, :cond_8

    cmp-long p1, v10, v12

    if-nez p1, :cond_7

    iget-object p1, v5, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-ne p1, v9, :cond_5

    move-object p1, v4

    :cond_5
    iput-object v7, p0, Lnu/q$a;->w:Ljava/lang/Object;

    iput-object v6, p0, Lnu/q$a;->x:Ljava/lang/Object;

    iput-object v5, p0, Lnu/q$a;->t:Ljava/lang/Object;

    iput-object v1, p0, Lnu/q$a;->u:Ljava/lang/Object;

    iput v3, p0, Lnu/q$a;->v:I

    invoke-interface {v7, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    iput-object v4, v5, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    :cond_7
    move-object p1, v1

    move-object v1, v5

    move-object v5, v6

    move-object v6, v7

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Debounce timeout should not be negative"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_2
    new-instance v7, Ltu/k;

    invoke-interface {p0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v8

    invoke-direct {v7, v8}, Ltu/k;-><init>(Lkotlin/coroutines/CoroutineContext;)V

    iget-object v8, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-eqz v8, :cond_9

    iget-wide v8, p1, Lkotlin/jvm/internal/b0;->a:J

    new-instance p1, Lnu/q$a$a;

    invoke-direct {p1, v6, v1, v4}, Lnu/q$a$a;-><init>(Lnu/i;Lkotlin/jvm/internal/c0;Lnt/b;)V

    invoke-static {v7, v8, v9, p1}, Ltu/c;->a(Ltu/d;JLkotlin/jvm/functions/Function1;)V

    :cond_9
    invoke-interface {v5}, Lmu/x;->A()Ltu/h;

    move-result-object p1

    new-instance v8, Lnu/q$a$b;

    invoke-direct {v8, v1, v6, v4}, Lnu/q$a$b;-><init>(Lkotlin/jvm/internal/c0;Lnu/i;Lnt/b;)V

    invoke-interface {v7, p1, v8}, Ltu/d;->c(Ltu/h;Lkotlin/jvm/functions/Function2;)V

    iput-object v6, p0, Lnu/q$a;->w:Ljava/lang/Object;

    iput-object v5, p0, Lnu/q$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Lnu/q$a;->t:Ljava/lang/Object;

    iput-object v4, p0, Lnu/q$a;->u:Ljava/lang/Object;

    iput v2, p0, Lnu/q$a;->v:I

    invoke-virtual {v7, p0}, Ltu/k;->o(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_0

    :goto_3
    return-object v0

    :cond_a
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lku/p0;Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 3
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

    new-instance v0, Lnu/q$a;

    iget-object v1, p0, Lnu/q$a;->y:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lnu/q$a;->z:Lnu/h;

    invoke-direct {v0, v1, v2, p3}, Lnu/q$a;-><init>(Lkotlin/jvm/functions/Function1;Lnu/h;Lnt/b;)V

    iput-object p1, v0, Lnu/q$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lnu/q$a;->x:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {v0, p1}, Lnu/q$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
