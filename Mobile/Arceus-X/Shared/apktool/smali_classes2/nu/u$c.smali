.class public final Lnu/u$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/u;->e(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnu/h<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "nu/u$c",
        "Lnu/h;",
        "Lnu/i;",
        "collector",
        "",
        "collect",
        "(Lnu/i;Lnt/b;)Ljava/lang/Object;",
        "kotlinx-coroutines-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function2;

.field public final synthetic b:Lnu/h;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lnu/h;)V
    .locals 0

    iput-object p1, p0, Lnu/u$c;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lnu/u$c;->b:Lnu/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public collect(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lnu/u$c$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu/u$c$a;

    iget v1, v0, Lnu/u$c$a;->u:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/u$c$a;->u:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/u$c$a;

    invoke-direct {v0, p0, p2}, Lnu/u$c$a;-><init>(Lnu/u$c;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lnu/u$c$a;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/u$c$a;->u:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lnu/u$c$a;->y:Ljava/lang/Object;

    check-cast p1, Lou/v;

    iget-object v2, v0, Lnu/u$c$a;->x:Ljava/lang/Object;

    check-cast v2, Lnu/i;

    iget-object v4, v0, Lnu/u$c$a;->w:Ljava/lang/Object;

    check-cast v4, Lnu/u$c;

    :try_start_0
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p2

    goto :goto_4

    :cond_3
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance p2, Lou/v;

    invoke-interface {v0}, Lnt/b;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object v2

    invoke-direct {p2, p1, v2}, Lou/v;-><init>(Lnu/i;Lkotlin/coroutines/CoroutineContext;)V

    :try_start_1
    iget-object v2, p0, Lnu/u$c;->a:Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lnu/u$c$a;->w:Ljava/lang/Object;

    iput-object p1, v0, Lnu/u$c$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnu/u$c$a;->y:Ljava/lang/Object;

    iput v4, v0, Lnu/u$c$a;->u:I

    const/4 v4, 0x6

    invoke-static {v4}, Lkotlin/jvm/internal/l;->c(I)V

    invoke-interface {v2, p2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v4, 0x7

    invoke-static {v4}, Lkotlin/jvm/internal/l;->c(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v4, p0

    move-object v2, p1

    move-object p1, p2

    :goto_1
    invoke-virtual {p1}, Lou/v;->releaseIntercepted()V

    iget-object p1, v4, Lnu/u$c;->b:Lnu/h;

    const/4 p2, 0x0

    iput-object p2, v0, Lnu/u$c$a;->w:Ljava/lang/Object;

    iput-object p2, v0, Lnu/u$c$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lnu/u$c$a;->y:Ljava/lang/Object;

    iput v3, v0, Lnu/u$c$a;->u:I

    invoke-interface {p1, v2, v0}, Lnu/h;->collect(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception p1

    move-object v5, p2

    move-object p2, p1

    move-object p1, v5

    :goto_4
    invoke-virtual {p1}, Lou/v;->releaseIntercepted()V

    throw p2
.end method
