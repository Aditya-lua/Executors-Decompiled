.class public final Lnu/w$j;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/w;->g(Lnu/h;Lzt/n;)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lnu/i<",
        "-TR;>;",
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
        "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "R",
        "Lnu/i;",
        "",
        "<anonymous>",
        "(Lnu/i;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1"
    f = "Limit.kt"
    l = {
        0x98
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lnu/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/h<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic w:Lzt/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lzt/n<",
            "Lnu/i<",
            "-TR;>;TT;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnu/h;Lzt/n;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/h<",
            "+TT;>;",
            "Lzt/n<",
            "-",
            "Lnu/i<",
            "-TR;>;-TT;-",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;+",
            "Ljava/lang/Object;",
            ">;",
            "Lnt/b<",
            "-",
            "Lnu/w$j;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/w$j;->v:Lnu/h;

    iput-object p2, p0, Lnu/w$j;->w:Lzt/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lnu/w$j;

    iget-object v1, p0, Lnu/w$j;->v:Lnu/h;

    iget-object v2, p0, Lnu/w$j;->w:Lzt/n;

    invoke-direct {v0, v1, v2, p2}, Lnu/w$j;-><init>(Lnu/h;Lzt/n;Lnt/b;)V

    iput-object p1, v0, Lnu/w$j;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lnu/w$j;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnu/w$j;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lnu/w$j;->u:Ljava/lang/Object;

    check-cast v0, Lnu/w$j$a;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lou/a; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu/w$j;->u:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object v1, p0, Lnu/w$j;->v:Lnu/h;

    iget-object v3, p0, Lnu/w$j;->w:Lzt/n;

    new-instance v4, Lnu/w$j$a;

    invoke-direct {v4, v3, p1}, Lnu/w$j$a;-><init>(Lzt/n;Lnu/i;)V

    :try_start_1
    iput-object v4, p0, Lnu/w$j;->u:Ljava/lang/Object;

    iput v2, p0, Lnu/w$j;->t:I

    invoke-interface {v1, v4, p0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lou/a; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v0, :cond_2

    return-object v0

    :catch_1
    move-exception p1

    move-object v0, v4

    :goto_0
    invoke-static {p1, v0}, Lou/p;->a(Lou/a;Ljava/lang/Object;)V

    invoke-interface {p0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p1

    invoke-static {p1}, Lku/g2;->f(Lkotlin/coroutines/CoroutineContext;)V

    :cond_2
    :goto_1
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-TR;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lnu/w$j;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lnu/w$j;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnu/w$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
