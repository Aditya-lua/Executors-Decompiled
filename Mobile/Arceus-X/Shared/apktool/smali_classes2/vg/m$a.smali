.class public final Lvg/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lvg/p$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lvg/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "vg/m$a",
        "Lvg/p$c;",
        "",
        "url",
        "body",
        "contentType",
        "Lei/j;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "counterName",
        "",
        "a",
        "(Ljava/lang/String;)V",
        "",
        "value",
        "b",
        "(Ljava/lang/String;J)V",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    const-string v0, "counterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lvi/g;->q(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;J)V
    .locals 1

    const-string v0, "counterName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lvi/g;->b()Lvi/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lvi/g;->r(Ljava/lang/String;J)V

    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lei/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lvg/m$a$a;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lvg/m$a$a;

    iget v1, v0, Lvg/m$a$a;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg/m$a$a;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvg/m$a$a;

    invoke-direct {v0, p0, p4}, Lvg/m$a$a;-><init>(Lvg/m$a;Lnt/b;)V

    :goto_0
    iget-object p4, v0, Lvg/m$a$a;->w:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lvg/m$a$a;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvg/m$a$a;->v:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lvg/m$a$a;->u:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object p1, v0, Lvg/m$a$a;->t:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p4

    new-instance v2, Lvg/m$a$b;

    const/4 v4, 0x0

    invoke-direct {v2, p1, p2, p3, v4}, Lvg/m$a$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lvg/m$a$a;->t:Ljava/lang/Object;

    invoke-static {p2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lvg/m$a$a;->u:Ljava/lang/Object;

    invoke-static {p3}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lvg/m$a$a;->v:Ljava/lang/Object;

    iput v3, v0, Lvg/m$a$a;->y:I

    invoke-static {p4, v2, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string p1, "withContext(...)"

    invoke-static {p4, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p4
.end method
