.class public final Lx4/l0$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lx4/l0;->m([Ljava/lang/String;[IZ)Lnu/h;
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
        "-",
        "Ljava/util/Set<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lnu/i;",
        "",
        "",
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
    c = "androidx.room.TriggerBasedInvalidationTracker$createFlow$1"
    f = "InvalidationTracker.kt"
    l = {
        0xef,
        0xef,
        0xf3
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public t:I

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lx4/l0;

.field public final synthetic w:[I

.field public final synthetic x:Z

.field public final synthetic y:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Lx4/l0;[IZ[Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx4/l0;",
            "[IZ[",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lx4/l0$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lx4/l0$c;->v:Lx4/l0;

    iput-object p2, p0, Lx4/l0$c;->w:[I

    iput-boolean p3, p0, Lx4/l0$c;->x:Z

    iput-object p4, p0, Lx4/l0$c;->y:[Ljava/lang/String;

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

    new-instance v0, Lx4/l0$c;

    iget-object v1, p0, Lx4/l0$c;->v:Lx4/l0;

    iget-object v2, p0, Lx4/l0$c;->w:[I

    iget-boolean v3, p0, Lx4/l0$c;->x:Z

    iget-object v4, p0, Lx4/l0$c;->y:[Ljava/lang/String;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lx4/l0$c;-><init>(Lx4/l0;[IZ[Ljava/lang/String;Lnt/b;)V

    iput-object p1, v0, Lx4/l0$c;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnu/i;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lx4/l0$c;->q(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lx4/l0$c;->t:I

    const/4 v2, 0x0

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v4, :cond_1

    if-eq v1, v3, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_5

    :cond_1
    iget-object v1, p0, Lx4/l0$c;->u:Ljava/lang/Object;

    check-cast v1, Lnu/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lx4/l0$c;->u:Ljava/lang/Object;

    check-cast v1, Lnu/i;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lx4/l0$c;->u:Ljava/lang/Object;

    check-cast p1, Lnu/i;

    iget-object v1, p0, Lx4/l0$c;->v:Lx4/l0;

    invoke-static {v1}, Lx4/l0;->e(Lx4/l0;)Lx4/k;

    move-result-object v1

    iget-object v6, p0, Lx4/l0$c;->w:[I

    invoke-virtual {v1, v6}, Lx4/k;->i([I)Z

    move-result v1

    if-eqz v1, :cond_6

    iget-object v1, p0, Lx4/l0$c;->v:Lx4/l0;

    invoke-static {v1}, Lx4/l0;->d(Lx4/l0;)Lx4/u;

    move-result-object v1

    iput-object p1, p0, Lx4/l0$c;->u:Ljava/lang/Object;

    iput v5, p0, Lx4/l0$c;->t:I

    const/4 v5, 0x0

    invoke-static {v1, v5, p0}, Lc5/a;->b(Lx4/u;ZLnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_4

    goto :goto_3

    :cond_4
    move-object v10, v1

    move-object v1, p1

    move-object p1, v10

    :goto_0
    check-cast p1, Lkotlin/coroutines/CoroutineContext;

    new-instance v5, Lx4/l0$c$a;

    iget-object v6, p0, Lx4/l0$c;->v:Lx4/l0;

    invoke-direct {v5, v6, v2}, Lx4/l0$c$a;-><init>(Lx4/l0;Lnt/b;)V

    iput-object v1, p0, Lx4/l0$c;->u:Ljava/lang/Object;

    iput v4, p0, Lx4/l0$c;->t:I

    invoke-static {p1, v5, p0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    move-object v7, v1

    goto :goto_2

    :cond_6
    move-object v7, p1

    :goto_2
    :try_start_1
    new-instance v5, Lkotlin/jvm/internal/c0;

    invoke-direct {v5}, Lkotlin/jvm/internal/c0;-><init>()V

    iget-object p1, p0, Lx4/l0$c;->v:Lx4/l0;

    invoke-static {p1}, Lx4/l0;->f(Lx4/l0;)Lx4/l;

    move-result-object p1

    new-instance v4, Lx4/l0$c$b;

    iget-boolean v6, p0, Lx4/l0$c;->x:Z

    iget-object v8, p0, Lx4/l0$c;->y:[Ljava/lang/String;

    iget-object v9, p0, Lx4/l0$c;->w:[I

    invoke-direct/range {v4 .. v9}, Lx4/l0$c$b;-><init>(Lkotlin/jvm/internal/c0;ZLnu/i;[Ljava/lang/String;[I)V

    iput-object v2, p0, Lx4/l0$c;->u:Ljava/lang/Object;

    iput v3, p0, Lx4/l0$c;->t:I

    invoke-virtual {p1, v4, p0}, Lx4/l;->a(Lnu/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_3
    return-object v0

    :cond_7
    :goto_4
    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_5
    iget-object v0, p0, Lx4/l0$c;->v:Lx4/l0;

    invoke-static {v0}, Lx4/l0;->e(Lx4/l0;)Lx4/k;

    move-result-object v0

    iget-object v1, p0, Lx4/l0$c;->w:[I

    invoke-virtual {v0, v1}, Lx4/k;->j([I)Z

    throw p1
.end method

.method public final q(Lnu/i;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnu/i<",
            "-",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;>;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lx4/l0$c;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lx4/l0$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lx4/l0$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
