.class public final Lt6/m$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt6/m;->a(Lnt/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lt6/q;",
        "Lnt/b<",
        "-",
        "Lo6/o;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lt6/q;",
        "response",
        "Lo6/o;",
        "<anonymous>",
        "(Lt6/q;)Lo6/o;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "coil3.network.NetworkFetcher$fetch$fetchResult$1"
    f = "NetworkFetcher.kt"
    l = {
        0x4c,
        0x57
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public synthetic v:Ljava/lang/Object;

.field public final synthetic w:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Ln6/a$c;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic x:Lt6/m;

.field public final synthetic y:Lkotlin/jvm/internal/c0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/c0<",
            "Lt6/q;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic z:Lt6/o;


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/c0;Lt6/m;Lkotlin/jvm/internal/c0;Lt6/o;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/c0<",
            "Ln6/a$c;",
            ">;",
            "Lt6/m;",
            "Lkotlin/jvm/internal/c0<",
            "Lt6/q;",
            ">;",
            "Lt6/o;",
            "Lnt/b<",
            "-",
            "Lt6/m$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lt6/m$e;->w:Lkotlin/jvm/internal/c0;

    iput-object p2, p0, Lt6/m$e;->x:Lt6/m;

    iput-object p3, p0, Lt6/m$e;->y:Lkotlin/jvm/internal/c0;

    iput-object p4, p0, Lt6/m$e;->z:Lt6/o;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lt6/m$e;

    iget-object v1, p0, Lt6/m$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v2, p0, Lt6/m$e;->x:Lt6/m;

    iget-object v3, p0, Lt6/m$e;->y:Lkotlin/jvm/internal/c0;

    iget-object v4, p0, Lt6/m$e;->z:Lt6/o;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lt6/m$e;-><init>(Lkotlin/jvm/internal/c0;Lt6/m;Lkotlin/jvm/internal/c0;Lt6/o;Lnt/b;)V

    iput-object p1, v0, Lt6/m$e;->v:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lt6/q;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lt6/m$e;->q(Lt6/q;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lt6/m$e;->v:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lt6/q;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lt6/m$e;->u:I

    const-string v7, "Content-Type"

    const/4 v8, 0x2

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v8, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v6, p0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lt6/m$e;->t:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/c0;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lt6/m$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v1, p0, Lt6/m$e;->x:Lt6/m;

    iget-object v3, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v3, Ln6/a$c;

    iget-object v4, p0, Lt6/m$e;->y:Lkotlin/jvm/internal/c0;

    iget-object v4, v4, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v4, Lt6/q;

    move v6, v2

    move-object v2, v3

    move-object v3, v4

    iget-object v4, p0, Lt6/m$e;->z:Lt6/o;

    iput-object v5, p0, Lt6/m$e;->v:Ljava/lang/Object;

    iput-object p1, p0, Lt6/m$e;->t:Ljava/lang/Object;

    iput v6, p0, Lt6/m$e;->u:I

    move-object v6, p0

    invoke-static/range {v1 .. v6}, Lt6/m;->g(Lt6/m;Ln6/a$c;Lt6/q;Lt6/o;Lt6/q;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_0
    iput-object p1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    iget-object p1, v6, Lt6/m$e;->w:Lkotlin/jvm/internal/c0;

    iget-object p1, p1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    if-eqz p1, :cond_5

    iget-object v0, v6, Lt6/m$e;->y:Lkotlin/jvm/internal/c0;

    iget-object v1, v6, Lt6/m$e;->x:Lt6/m;

    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast p1, Ln6/a$c;

    invoke-static {v1, p1}, Lt6/m;->f(Lt6/m;Ln6/a$c;)Lt6/q;

    move-result-object p1

    iput-object p1, v0, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    new-instance p1, Lo6/o;

    iget-object v0, v6, Lt6/m$e;->x:Lt6/m;

    iget-object v1, v6, Lt6/m$e;->w:Lkotlin/jvm/internal/c0;

    iget-object v1, v1, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    check-cast v1, Ln6/a$c;

    invoke-static {v0, v1}, Lt6/m;->d(Lt6/m;Ln6/a$c;)Lm6/s;

    move-result-object v0

    iget-object v1, v6, Lt6/m$e;->x:Lt6/m;

    invoke-static {v1}, Lt6/m;->b(Lt6/m;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, v6, Lt6/m$e;->y:Lkotlin/jvm/internal/c0;

    iget-object v3, v3, Lkotlin/jvm/internal/c0;->a:Ljava/lang/Object;

    check-cast v3, Lt6/q;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lt6/q;->e()Lt6/n;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {v3, v7}, Lt6/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    :cond_4
    invoke-virtual {v1, v2, v9}, Lt6/m;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lm6/f;->d:Lm6/f;

    invoke-direct {p1, v0, v1, v2}, Lo6/o;-><init>(Lm6/s;Ljava/lang/String;Lm6/f;)V

    return-object p1

    :cond_5
    invoke-static {v5}, Lu6/e;->f(Lt6/q;)Lt6/r;

    move-result-object p1

    iput-object v5, v6, Lt6/m$e;->v:Ljava/lang/Object;

    iput-object v9, v6, Lt6/m$e;->t:Ljava/lang/Object;

    iput v8, v6, Lt6/m$e;->u:I

    invoke-static {p1, p0}, Lu6/e;->e(Lt6/r;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_1
    return-object v0

    :cond_6
    :goto_2
    check-cast p1, Lxu/e;

    invoke-virtual {p1}, Lxu/e;->size()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-lez v0, :cond_7

    new-instance v0, Lo6/o;

    iget-object v1, v6, Lt6/m$e;->x:Lt6/m;

    invoke-static {v1, p1}, Lt6/m;->e(Lt6/m;Lxu/e;)Lm6/s;

    move-result-object p1

    iget-object v1, v6, Lt6/m$e;->x:Lt6/m;

    invoke-static {v1}, Lt6/m;->b(Lt6/m;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v5}, Lt6/q;->e()Lt6/n;

    move-result-object v3

    invoke-virtual {v3, v7}, Lt6/n;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lt6/m;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lm6/f;->d:Lm6/f;

    invoke-direct {v0, p1, v1, v2}, Lo6/o;-><init>(Lm6/s;Ljava/lang/String;Lm6/f;)V

    return-object v0

    :cond_7
    return-object v9
.end method

.method public final q(Lt6/q;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt6/q;",
            "Lnt/b<",
            "-",
            "Lo6/o;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lt6/m$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lt6/m$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lt6/m$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
