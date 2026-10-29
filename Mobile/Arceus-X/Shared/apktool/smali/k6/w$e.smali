.class public final Lk6/w$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk6/w;->g(Lx6/g;ILnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Lx6/k;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "Lx6/k;",
        "<anonymous>",
        "(Lku/p0;)Lx6/k;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "coil3.RealImageLoader$execute$result$1"
    f = "RealImageLoader.kt"
    l = {
        0x8e
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lx6/g;

.field public final synthetic v:Lk6/w;

.field public final synthetic w:Ly6/g;

.field public final synthetic x:Lk6/j;

.field public final synthetic y:Lk6/n;


# direct methods
.method public constructor <init>(Lx6/g;Lk6/w;Ly6/g;Lk6/j;Lk6/n;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx6/g;",
            "Lk6/w;",
            "Ly6/g;",
            "Lk6/j;",
            "Lk6/n;",
            "Lnt/b<",
            "-",
            "Lk6/w$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lk6/w$e;->u:Lx6/g;

    iput-object p2, p0, Lk6/w$e;->v:Lk6/w;

    iput-object p3, p0, Lk6/w$e;->w:Ly6/g;

    iput-object p4, p0, Lk6/w$e;->x:Lk6/j;

    iput-object p5, p0, Lk6/w$e;->y:Lk6/n;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 7
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

    new-instance v0, Lk6/w$e;

    iget-object v1, p0, Lk6/w$e;->u:Lx6/g;

    iget-object v2, p0, Lk6/w$e;->v:Lk6/w;

    iget-object v3, p0, Lk6/w$e;->w:Ly6/g;

    iget-object v4, p0, Lk6/w$e;->x:Lk6/j;

    iget-object v5, p0, Lk6/w$e;->y:Lk6/n;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lk6/w$e;-><init>(Lx6/g;Lk6/w;Ly6/g;Lk6/j;Lk6/n;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lk6/w$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Lx6/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lk6/w$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lk6/w$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lk6/w$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lk6/w$e;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    new-instance v3, Lp6/e;

    iget-object v4, p0, Lk6/w$e;->u:Lx6/g;

    iget-object p1, p0, Lk6/w$e;->v:Lk6/w;

    invoke-virtual {p1}, Lk6/w;->getComponents()Lk6/h;

    move-result-object p1

    invoke-virtual {p1}, Lk6/h;->g()Ljava/util/List;

    move-result-object v5

    iget-object v7, p0, Lk6/w$e;->u:Lx6/g;

    iget-object v8, p0, Lk6/w$e;->w:Ly6/g;

    iget-object v9, p0, Lk6/w$e;->x:Lk6/j;

    iget-object p1, p0, Lk6/w$e;->y:Lk6/n;

    if-eqz p1, :cond_2

    move v10, v2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    move v10, p1

    :goto_0
    const/4 v6, 0x0

    invoke-direct/range {v3 .. v10}, Lp6/e;-><init>(Lx6/g;Ljava/util/List;ILx6/g;Ly6/g;Lk6/j;Z)V

    iput v2, p0, Lk6/w$e;->t:I

    invoke-virtual {v3, p0}, Lp6/e;->g(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    return-object p1
.end method
