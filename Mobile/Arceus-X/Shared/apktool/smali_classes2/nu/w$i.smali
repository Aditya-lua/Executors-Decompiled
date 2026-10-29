.class public final Lnu/w$i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnu/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnu/w;->f(Lnu/h;Lkotlin/jvm/functions/Function2;)Lnu/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnu/i<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "nu/w$i",
        "Lnu/i;",
        "value",
        "",
        "emit",
        "(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;",
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

.field public final synthetic b:Lnu/i;


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function2;Lnu/i;)V
    .locals 0

    iput-object p1, p0, Lnu/w$i;->a:Lkotlin/jvm/functions/Function2;

    iput-object p2, p0, Lnu/w$i;->b:Lnu/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;
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

    instance-of v0, p2, Lnu/w$i$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lnu/w$i$a;

    iget v1, v0, Lnu/w$i$a;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lnu/w$i$a;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lnu/w$i$a;

    invoke-direct {v0, p0, p2}, Lnu/w$i$a;-><init>(Lnu/w$i;Lnt/b;)V

    :goto_0
    iget-object p2, v0, Lnu/w$i$a;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lnu/w$i$a;->v:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lnu/w$i$a;->t:Ljava/lang/Object;

    check-cast p1, Lnu/w$i;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lnu/w$i$a;->x:Ljava/lang/Object;

    iget-object v2, v0, Lnu/w$i$a;->t:Ljava/lang/Object;

    check-cast v2, Lnu/w$i;

    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v6, p2

    move-object p2, p1

    move-object p1, v2

    move-object v2, v6

    goto :goto_1

    :cond_3
    invoke-static {p2}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p2, p0, Lnu/w$i;->a:Lkotlin/jvm/functions/Function2;

    iput-object p0, v0, Lnu/w$i$a;->t:Ljava/lang/Object;

    iput-object p1, v0, Lnu/w$i$a;->x:Ljava/lang/Object;

    iput v4, v0, Lnu/w$i$a;->v:I

    const/4 v2, 0x6

    invoke-static {v2}, Lkotlin/jvm/internal/l;->c(I)V

    invoke-interface {p2, p1, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x7

    invoke-static {v2}, Lkotlin/jvm/internal/l;->c(I)V

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    move-object v2, p2

    move-object p2, p1

    move-object p1, p0

    :goto_1
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, p1, Lnu/w$i;->b:Lnu/i;

    iput-object p1, v0, Lnu/w$i$a;->t:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v0, Lnu/w$i$a;->x:Ljava/lang/Object;

    iput v3, v0, Lnu/w$i$a;->v:I

    invoke-interface {v2, p2, v0}, Lnu/i;->emit(Ljava/lang/Object;Lnt/b;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_2
    return-object v1

    :cond_5
    const/4 v4, 0x0

    :cond_6
    :goto_3
    if-eqz v4, :cond_7

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_7
    new-instance p2, Lou/a;

    invoke-direct {p2, p1}, Lou/a;-><init>(Ljava/lang/Object;)V

    throw p2
.end method
