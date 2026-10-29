.class public final Lnu/q$b$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/q$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lmu/k<",
        "+TT;>;",
        "Lnt/b<",
        "-",
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\u0008\u0000\u0010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "T",
        "Lmu/k;",
        "value",
        "",
        "<anonymous>",
        "(Lmu/k;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1"
    f = "Delay.kt"
    l = {
        0x18b
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lnu/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnu/i<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnu/i;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-TT;>;",
            "Lnt/b<",
            "-",
            "Lnu/q$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnu/q$b$a;->v:Lnu/i;

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

    new-instance v0, Lnu/q$b$a;

    iget-object v1, p0, Lnu/q$b$a;->v:Lnu/i;

    invoke-direct {v0, v1, p2}, Lnu/q$b$a;-><init>(Lnu/i;Lnt/b;)V

    iput-object p1, v0, Lnu/q$b$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lmu/k;

    invoke-virtual {p1}, Lmu/k;->k()Ljava/lang/Object;

    move-result-object p1

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lnu/q$b$a;->q(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lnu/q$b$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lnu/q$b$a;->u:Ljava/lang/Object;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lnu/q$b$a;->u:Ljava/lang/Object;

    check-cast p1, Lmu/k;

    invoke-virtual {p1}, Lmu/k;->k()Ljava/lang/Object;

    move-result-object p1

    iget-object v1, p0, Lnu/q$b$a;->v:Lnu/i;

    instance-of v3, p1, Lmu/k$c;

    if-nez v3, :cond_3

    iput-object p1, p0, Lnu/q$b$a;->u:Ljava/lang/Object;

    iput v2, p0, Lnu/q$b$a;->t:I

    invoke-interface {v1, p1, p0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    :goto_0
    move-object p1, v0

    :cond_3
    nop

    instance-of v0, p1, Lmu/k$a;

    if-eqz v0, :cond_5

    invoke-static {p1}, Lmu/k;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_4

    const/4 p1, 0x0

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    throw p1

    :cond_5
    invoke-static {v2}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final q(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lmu/k;->b(Ljava/lang/Object;)Lmu/k;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lnu/q$b$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lnu/q$b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lnu/q$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
