.class public final Lou/g$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lou/g;->p(Lnu/i;Lkotlin/coroutines/CoroutineContext;Lnt/b;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "Lnu/i;",
        "it",
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
    c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2"
    f = "ChannelFlow.kt"
    l = {
        0x94
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lou/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lou/g<",
            "TS;TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lou/g;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lou/g<",
            "TS;TT;>;",
            "Lnt/b<",
            "-",
            "Lou/g$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lou/g$a;->v:Lou/g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance v0, Lou/g$a;

    iget-object v1, p0, Lou/g$a;->v:Lou/g;

    invoke-direct {v0, v1, p2}, Lou/g$a;-><init>(Lou/g;Lnt/b;)V

    iput-object p1, v0, Lou/g$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lou/g$a;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lou/g$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lou/g$a;->u:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object v1, p0, Lou/g$a;->v:Lou/g;

    iput v2, p0, Lou/g$a;->t:I

    invoke-virtual {v1, p1, p0}, Lou/g;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
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

    invoke-virtual {p0, p1, p2}, Lou/g$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lou/g$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lou/g$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
