.class public final Lou/i$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lou/i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lnu/i;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lku/d2;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lku/p0;

.field public final synthetic c:Lou/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lou/i<",
            "TT;TR;>;"
        }
    .end annotation
.end field

.field public final synthetic d:Lnu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/i<",
            "TR;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/c0;Lku/p0;Lou/i;Lnu/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/c0<",
            "Lku/d2;",
            ">;",
            "Lku/p0;",
            "Lou/i<",
            "TT;TR;>;",
            "Lnu/i<",
            "-TR;>;)V"
        }
    .end annotation

    iput-object p1, p0, Lou/i$a$a;->a:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lou/i$a$a;->b:Lku/p0;

    iput-object p3, p0, Lou/i$a$a;->c:Lou/i;

    iput-object p4, p0, Lou/i$a$a;->d:Lnu/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lou/i$a$a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lou/i$a$a$b;

    iget v1, v0, Lou/i$a$a$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lou/i$a$a$b;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lou/i$a$a$b;

    invoke-direct {v0, p0, p2}, Lou/i$a$a$b;-><init>(Lou/i$a$a;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lou/i$a$a$b;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lou/i$a$a$b;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lou/i$a$a$b;->v:Ljava/lang/Object;

    check-cast p1, Lku/d2;

    iget-object p1, v0, Lou/i$a$a$b;->u:Ljava/lang/Object;

    iget-object v0, v0, Lou/i$a$a$b;->t:Ljava/lang/Object;

    check-cast v0, Lou/i$a$a;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lou/i$a$a;->a:Lkotlin/jvm/internal/c0;

    iget-object p2, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast p2, Lku/d2;

    if-eqz p2, :cond_3

    new-instance v2, Lou/k;

    invoke-direct {v2}, Lou/k;-><init>()V

    invoke-interface {p2, v2}, Lku/d2;->c(Ljava/util/concurrent/CancellationException;)V

    iput-object p0, v0, Lou/i$a$a$b;->t:Ljava/lang/Object;

    iput-object p1, v0, Lou/i$a$a$b;->u:Ljava/lang/Object;

    iput-object p2, v0, Lou/i$a$a$b;->v:Ljava/lang/Object;

    iput v3, v0, Lou/i$a$a$b;->y:I

    invoke-interface {p2, v0}, Lku/d2;->L(Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    iget-object p2, v0, Lou/i$a$a;->a:Lkotlin/jvm/internal/c0;

    iget-object v1, v0, Lou/i$a$a;->b:Lku/p0;

    sget-object v3, Lku/r0;->d:Lku/r0;

    new-instance v4, Lou/i$a$a$a;

    iget-object v2, v0, Lou/i$a$a;->c:Lou/i;

    iget-object v0, v0, Lou/i$a$a;->d:Lnu/i;

    const/4 v5, 0x0

    invoke-direct {v4, v2, v0, p1, v5}, Lou/i$a$a$a;-><init>(Lou/i;Lnu/i;Ljava/lang/Object;Lnt/b;)V

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
