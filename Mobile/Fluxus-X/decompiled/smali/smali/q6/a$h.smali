.class public final Lq6/a$h;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lq6/a;->a(Lq6/d$a;Leu/b;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Ly6/t;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "coil3.intercept.EngineInterceptor$intercept$2"
    f = "EngineInterceptor.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "Ly6/t;",
        "<anonymous>",
        "(Lav/p0;)Ly6/t;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic A:Lq6/d$a;

.field public t:I

.field public final synthetic u:Lq6/a;

.field public final synthetic v:Ly6/g;

.field public final synthetic w:Ljava/lang/Object;

.field public final synthetic x:Ly6/p;

.field public final synthetic y:Ll6/j;

.field public final synthetic z:Lt6/d$b;


# direct methods
.method public constructor <init>(Lq6/a;Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Lt6/d$b;Lq6/d$a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq6/a;",
            "Ly6/g;",
            "Ljava/lang/Object;",
            "Ly6/p;",
            "Ll6/j;",
            "Lt6/d$b;",
            "Lq6/d$a;",
            "Leu/b<",
            "-",
            "Lq6/a$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lq6/a$h;->u:Lq6/a;

    iput-object p2, p0, Lq6/a$h;->v:Ly6/g;

    iput-object p3, p0, Lq6/a$h;->w:Ljava/lang/Object;

    iput-object p4, p0, Lq6/a$h;->x:Ly6/p;

    iput-object p5, p0, Lq6/a$h;->y:Ll6/j;

    iput-object p6, p0, Lq6/a$h;->z:Lt6/d$b;

    iput-object p7, p0, Lq6/a$h;->A:Lq6/d$a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lq6/a$h;

    iget-object v1, p0, Lq6/a$h;->u:Lq6/a;

    iget-object v2, p0, Lq6/a$h;->v:Ly6/g;

    iget-object v3, p0, Lq6/a$h;->w:Ljava/lang/Object;

    iget-object v4, p0, Lq6/a$h;->x:Ly6/p;

    iget-object v5, p0, Lq6/a$h;->y:Ll6/j;

    iget-object v6, p0, Lq6/a$h;->z:Lt6/d$b;

    iget-object v7, p0, Lq6/a$h;->A:Lq6/d$a;

    move-object v8, p2

    invoke-direct/range {v0 .. v8}, Lq6/a$h;-><init>(Lq6/a;Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Lt6/d$b;Lq6/d$a;Leu/b;)V

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Ly6/t;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lq6/a$h;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lq6/a$h;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lq6/a$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lq6/a$h;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v6

    iget v0, p0, Lq6/a$h;->t:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v1, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object v0, p0, Lq6/a$h;->u:Lq6/a;

    iget-object v2, p0, Lq6/a$h;->v:Ly6/g;

    move-object v3, v2

    iget-object v2, p0, Lq6/a$h;->w:Ljava/lang/Object;

    move-object v4, v3

    iget-object v3, p0, Lq6/a$h;->x:Ly6/p;

    move-object v7, v4

    iget-object v4, p0, Lq6/a$h;->y:Ll6/j;

    iput v1, p0, Lq6/a$h;->t:I

    move-object v5, p0

    move-object v1, v7

    invoke-static/range {v0 .. v5}, Lq6/a;->c(Lq6/a;Ly6/g;Ljava/lang/Object;Ly6/p;Ll6/j;Leu/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_2

    return-object v6

    :cond_2
    :goto_0
    check-cast v0, Lq6/a$b;

    iget-object v1, p0, Lq6/a$h;->u:Lq6/a;

    invoke-static {v1}, Lq6/a;->f(Lq6/a;)Lf7/d0;

    move-result-object v1

    invoke-interface {v1}, Lf7/d0;->a()V

    iget-object v1, p0, Lq6/a$h;->u:Lq6/a;

    invoke-static {v1}, Lq6/a;->e(Lq6/a;)Lt6/e;

    move-result-object v1

    iget-object v2, p0, Lq6/a$h;->z:Lt6/d$b;

    iget-object v3, p0, Lq6/a$h;->v:Ly6/g;

    invoke-virtual {v1, v2, v3, v0}, Lt6/e;->h(Lt6/d$b;Ly6/g;Lq6/a$b;)Z

    move-result v1

    invoke-virtual {v0}, Lq6/a$b;->e()Ll6/n;

    move-result-object v7

    iget-object v8, p0, Lq6/a$h;->v:Ly6/g;

    invoke-virtual {v0}, Lq6/a$b;->c()Ln6/f;

    move-result-object v9

    iget-object v2, p0, Lq6/a$h;->z:Lt6/d$b;

    if-eqz v1, :cond_3

    :goto_1
    move-object v10, v2

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    goto :goto_1

    :goto_2
    invoke-virtual {v0}, Lq6/a$b;->d()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lq6/a$b;->f()Z

    move-result v12

    iget-object v0, p0, Lq6/a$h;->A:Lq6/d$a;

    invoke-static {v0}, Lf7/h0;->p(Lq6/d$a;)Z

    move-result v13

    new-instance v6, Ly6/t;

    invoke-direct/range {v6 .. v13}, Ly6/t;-><init>(Ll6/n;Ly6/g;Ln6/f;Lt6/d$b;Ljava/lang/String;ZZ)V

    return-object v6
.end method
