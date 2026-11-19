.class public final Lgm/w$b$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgm/w$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lzt/n<",
        "+",
        "Ljava/lang/String;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.universalapp.achievement.Replicator$syncLocalToRemote$2$2$1$1"
    f = "Replicator.kt"
    l = {
        0x36
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lav/p0;",
        "Lzt/n;",
        "",
        "<anonymous>",
        "(Lav/p0;)Lzt/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lgm/w;

.field public final synthetic v:Lgm/a;


# direct methods
.method public constructor <init>(Lgm/w;Lgm/a;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgm/w;",
            "Lgm/a;",
            "Leu/b<",
            "-",
            "Lgm/w$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lgm/w$b$a;->u:Lgm/w;

    iput-object p2, p0, Lgm/w$b$a;->v:Lgm/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 2
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

    new-instance p1, Lgm/w$b$a;

    iget-object v0, p0, Lgm/w$b$a;->u:Lgm/w;

    iget-object v1, p0, Lgm/w$b$a;->v:Lgm/a;

    invoke-direct {p1, v0, v1, p2}, Lgm/w$b$a;-><init>(Lgm/w;Lgm/a;Leu/b;)V

    return-object p1
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lzt/n<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lgm/w$b$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lgm/w$b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lgm/w$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lgm/w$b$a;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lgm/w$b$a;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lgm/w$b$a;->u:Lgm/w;

    invoke-static {p1}, Lgm/w;->b(Lgm/w;)Lgm/v;

    move-result-object p1

    iget-object v1, p0, Lgm/w$b$a;->v:Lgm/a;

    iput v2, p0, Lgm/w$b$a;->t:I

    invoke-interface {p1, v1, p0}, Lgm/v;->a(Lgm/a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    iget-object v0, p0, Lgm/w$b$a;->v:Lgm/a;

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "rbx.achievement.replicator"

    if-eqz v1, :cond_6

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-virtual {v0}, Lgm/a;->a()Ljava/lang/String;

    move-result-object v1

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "remote grant of "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " failed"

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v1

    invoke-interface {v1}, Lbi/i;->C()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lgm/t;->a:Lgm/t;

    const-string v4, "remote"

    invoke-virtual {v0}, Lgm/a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v4, v5, p1}, Lgm/t;->n(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_4
    invoke-virtual {v0}, Lgm/a;->a()Ljava/lang/String;

    move-result-object v0

    if-eqz p1, :cond_5

    goto :goto_1

    :cond_5
    move-object v0, v2

    :goto_1
    invoke-static {v0}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_2

    :cond_6
    invoke-static {p1}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    iget-object v0, p0, Lgm/w$b$a;->v:Lgm/a;

    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_7

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lgm/a;->a()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "granting "

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " failed exceptionally"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {v2}, Lzt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method
