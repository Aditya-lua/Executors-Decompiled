.class public final Lp6/a$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp6/a;->a(Lp6/d$a;Lnt/b;)Ljava/lang/Object;
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
        "Lx6/t;",
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
        "Lx6/t;",
        "<anonymous>",
        "(Lku/p0;)Lx6/t;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "coil3.intercept.EngineInterceptor$intercept$2"
    f = "EngineInterceptor.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
.end annotation


# instance fields
.field public final synthetic A:Lp6/d$a;

.field public t:I

.field public final synthetic u:Lp6/a;

.field public final synthetic v:Lx6/g;

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Lx6/p;

.field public final synthetic y:Lk6/j;

.field public final synthetic z:Ls6/d$b;


# direct methods
.method public constructor <init>(Lp6/a;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Ls6/d$b;Lp6/d$a;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/a;",
            "Lx6/g;",
            "Ljava/lang/Object;",
            "Lx6/p;",
            "Lk6/j;",
            "Ls6/d$b;",
            "Lp6/d$a;",
            "Lnt/b<",
            "-",
            "Lp6/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp6/a$h;->u:Lp6/a;

    iput-object p2, p0, Lp6/a$h;->v:Lx6/g;

    iput-object p3, p0, Lp6/a$h;->w:Ljava/lang/Object;

    iput-object p4, p0, Lp6/a$h;->x:Lx6/p;

    iput-object p5, p0, Lp6/a$h;->y:Lk6/j;

    iput-object p6, p0, Lp6/a$h;->z:Ls6/d$b;

    iput-object p7, p0, Lp6/a$h;->A:Lp6/d$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 9
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

    new-instance v0, Lp6/a$h;

    iget-object v1, p0, Lp6/a$h;->u:Lp6/a;

    iget-object v2, p0, Lp6/a$h;->v:Lx6/g;

    iget-object v3, p0, Lp6/a$h;->w:Ljava/lang/Object;

    iget-object v4, p0, Lp6/a$h;->x:Lx6/p;

    iget-object v5, p0, Lp6/a$h;->y:Lk6/j;

    iget-object v6, p0, Lp6/a$h;->z:Ls6/d$b;

    iget-object v7, p0, Lp6/a$h;->A:Lp6/d$a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lp6/a$h;-><init>(Lp6/a;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Ls6/d$b;Lp6/d$a;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lp6/a$h;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lx6/t;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lp6/a$h;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lp6/a$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lp6/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v6

    iget v0, p0, Lp6/a$h;->t:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lp6/a$h;->u:Lp6/a;

    iget-object v2, p0, Lp6/a$h;->v:Lx6/g;

    move-object v3, v2

    iget-object v2, p0, Lp6/a$h;->w:Ljava/lang/Object;

    move-object v4, v3

    iget-object v3, p0, Lp6/a$h;->x:Lx6/p;

    move-object v7, v4

    iget-object v4, p0, Lp6/a$h;->y:Lk6/j;

    iput v1, p0, Lp6/a$h;->t:I

    move-object v5, p0

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Lp6/a;->c(Lp6/a;Lx6/g;Ljava/lang/Object;Lx6/p;Lk6/j;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    return-object v6

    :cond_2
    :goto_0
    check-cast v0, Lp6/a$b;

    iget-object v1, p0, Lp6/a$h;->u:Lp6/a;

    invoke-static {v1}, Lp6/a;->f(Lp6/a;)Le7/d0;

    move-result-object v1

    invoke-interface {v1}, Le7/d0;->a()V

    iget-object v1, p0, Lp6/a$h;->u:Lp6/a;

    invoke-static {v1}, Lp6/a;->e(Lp6/a;)Ls6/e;

    move-result-object v1

    iget-object v2, p0, Lp6/a$h;->z:Ls6/d$b;

    iget-object v3, p0, Lp6/a$h;->v:Lx6/g;

    invoke-virtual {v1, v2, v3, v0}, Ls6/e;->h(Ls6/d$b;Lx6/g;Lp6/a$b;)Z

    move-result v1

    invoke-virtual {v0}, Lp6/a$b;->e()Lk6/n;

    move-result-object v7

    iget-object v8, p0, Lp6/a$h;->v:Lx6/g;

    invoke-virtual {v0}, Lp6/a$b;->c()Lm6/f;

    move-result-object v9

    iget-object v2, p0, Lp6/a$h;->z:Ls6/d$b;

    if-eqz v1, :cond_3

    :goto_1
    move-object v10, v2

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lp6/a$b;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lp6/a$b;->f()Z

    move-result v12

    iget-object v0, p0, Lp6/a$h;->A:Lp6/d$a;

    invoke-static {v0}, Le7/h0;->p(Lp6/d$a;)Z

    move-result v13

    new-instance v6, Lx6/t;

    invoke-direct/range {v6 .. v13}, Lx6/t;-><init>(Lk6/n;Lx6/g;Lm6/f;Ls6/d$b;Ljava/lang/String;ZZ)V

    return-object v6
.end method
