.class public final Ldi/i$e$a$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/i$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1$1$1"
    f = "PlayGamesIntegration.kt"
    l = {
        0xb6,
        0xc1
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public final synthetic y:Lsl/w;


# direct methods
.method public constructor <init>(Lsl/w;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl/w;",
            "Lnt/b<",
            "-",
            "Ldi/i$e$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldi/i$e$a$a;->y:Lsl/w;

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

    new-instance v0, Ldi/i$e$a$a;

    iget-object v1, p0, Ldi/i$e$a$a;->y:Lsl/w;

    invoke-direct {v0, v1, p2}, Ldi/i$e$a$a;-><init>(Lsl/w;Lnt/b;)V

    iput-object p1, v0, Ldi/i$e$a$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ldi/i$e$a$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Ldi/i$e$a$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ldi/i$e$a$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldi/i$e$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget-object v0, p0, Ldi/i$e$a$a;->x:Ljava/lang/Object;

    check-cast v0, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Ldi/i$e$a$a;->w:I

    const/4 v3, 0x2

    const/4 v4, 0x0

    const-string v5, "rbx.achievements.playgames"

    const/4 v6, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Ldi/i$e$a$a;->u:Ljava/lang/Object;

    check-cast v0, Ljava/io/Serializable;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Ldi/i$e$a$a;->t:Ljava/lang/Object;

    check-cast v2, Lku/p0;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    const-string p1, "starting one time remote to local sync"

    invoke-static {v5, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ldi/i$e$a$a;->y:Lsl/w;

    :try_start_1
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ldi/i$e$a$a;->x:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, p0, Ldi/i$e$a$a;->t:Ljava/lang/Object;

    iput v4, p0, Ldi/i$e$a$a;->v:I

    iput v6, p0, Ldi/i$e$a$a;->w:I

    invoke-virtual {p1, p0}, Lsl/w;->d(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_3

    :cond_3
    :goto_0
    check-cast p1, Ljava/io/Serializable;

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    sget-object v2, Ljt/n;->b:Ljt/n$a;

    invoke-static {p1}, Ljt/o;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljt/n;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_2
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v2

    const-string v7, "local"

    if-eqz v2, :cond_4

    const-string v8, "unable to sync remote to local"

    invoke-static {v5, v8, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v2

    invoke-interface {v2}, Lth/i;->D()Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lsl/t;->a:Lsl/t;

    invoke-virtual {v2, v7, v4}, Lsl/t;->o(Ljava/lang/String;Z)V

    :cond_4
    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Ljava/io/Serializable;

    const-string v8, "remote to local sync completed"

    invoke-static {v5, v8}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v5

    invoke-interface {v5}, Lth/i;->D()Z

    move-result v5

    if-eqz v5, :cond_5

    sget-object v5, Lsl/t;->a:Lsl/t;

    invoke-virtual {v5, v7, v6}, Lsl/t;->o(Ljava/lang/String;Z)V

    :cond_5
    sget-object v5, Ldi/i;->a:Ldi/i;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Ldi/i$e$a$a;->x:Ljava/lang/Object;

    iput-object p1, p0, Ldi/i$e$a$a;->t:Ljava/lang/Object;

    invoke-static {v2}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ldi/i$e$a$a;->u:Ljava/lang/Object;

    iput v4, p0, Ldi/i$e$a$a;->v:I

    iput v3, p0, Ldi/i$e$a$a;->w:I

    invoke-static {v5, p0}, Ldi/i;->b(Ldi/i;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
