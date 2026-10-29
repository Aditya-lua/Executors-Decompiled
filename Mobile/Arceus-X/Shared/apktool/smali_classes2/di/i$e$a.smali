.class public final Ldi/i$e$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldi/i$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.roblox.client.googleplaygames.PlayGamesIntegration$onCreate$1$1"
    f = "PlayGamesIntegration.kt"
    l = {
        0xa4,
        0xc5
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lj/b;

.field public final synthetic B:Lsl/b;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Z

.field public x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lj/b;Lsl/b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj/b;",
            "Lsl/b;",
            "Lnt/b<",
            "-",
            "Ldi/i$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ldi/i$e$a;->A:Lj/b;

    iput-object p2, p0, Ldi/i$e$a;->B:Lsl/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
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

    new-instance v0, Ldi/i$e$a;

    iget-object v1, p0, Ldi/i$e$a;->A:Lj/b;

    iget-object v2, p0, Ldi/i$e$a;->B:Lsl/b;

    invoke-direct {v0, v1, v2, p2}, Ldi/i$e$a;-><init>(Lj/b;Lsl/b;Lnt/b;)V

    iput-object p1, v0, Ldi/i$e$a;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ldi/i$e$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ldi/i$e$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ldi/i$e$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ldi/i$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Ldi/i$e$a;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lku/p0;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v2, p0, Ldi/i$e$a;->y:I

    const-string v7, "rbx.achievements.playgames"

    const/4 v8, 0x2

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    if-ne v2, v8, :cond_0

    iget-object v0, p0, Ldi/i$e$a;->v:Ljava/lang/Object;

    check-cast v0, Lsl/w;

    iget-object v0, p0, Ldi/i$e$a;->u:Ljava/lang/Object;

    check-cast v0, Ldi/k;

    iget-object v0, p0, Ldi/i$e$a;->t:Ljava/lang/Object;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Ldi/i;->a:Ldi/i;

    iget-object v2, p0, Ldi/i$e$a;->A:Lj/b;

    invoke-static {v2}, Lda/g;->b(Landroid/app/Activity;)Lda/e;

    move-result-object v2

    const-string v4, "getGamesSignInClient(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Ldi/i$e$a;->z:Ljava/lang/Object;

    iput v3, p0, Ldi/i$e$a;->y:I

    invoke-static {p1, v2, p0}, Ldi/i;->e(Ldi/i;Lda/e;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object v9, p0, Ldi/i$e$a;->A:Lj/b;

    iget-object v2, p0, Ldi/i$e$a;->B:Lsl/b;

    invoke-static {p1}, Ljt/n;->h(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v3, p1

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->D()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-static {v9}, Ldi/g;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lsl/t;->a:Lsl/t;

    invoke-virtual {v4, v10, v3}, Lsl/t;->m(ZLjava/lang/String;)V

    :cond_4
    if-eqz v10, :cond_6

    new-instance v11, Ldi/k;

    invoke-static {v9}, Lda/g;->a(Landroid/app/Activity;)Lda/a;

    move-result-object v3

    const-string v4, "getAchievementsClient(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v11, v3}, Ldi/k;-><init>(Lda/a;)V

    new-instance v12, Lsl/w;

    invoke-direct {v12, v2, v11}, Lsl/w;-><init>(Lsl/b;Lsl/v;)V

    new-instance v4, Ldi/i$e$a$a;

    const/4 v13, 0x0

    invoke-direct {v4, v12, v13}, Ldi/i$e$a$a;-><init>(Lsl/w;Lnt/b;)V

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    sget-object v2, Landroidx/lifecycle/l$b;->e:Landroidx/lifecycle/l$b;

    new-instance v3, Ldi/i$e$a$b;

    invoke-direct {v3, v12, v13}, Ldi/i$e$a$b;-><init>(Lsl/w;Lnt/b;)V

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ldi/i$e$a;->z:Ljava/lang/Object;

    iput-object p1, p0, Ldi/i$e$a;->t:Ljava/lang/Object;

    invoke-static {v11}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ldi/i$e$a;->u:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ldi/i$e$a;->v:Ljava/lang/Object;

    iput-boolean v10, p0, Ldi/i$e$a;->w:Z

    const/4 v1, 0x0

    iput v1, p0, Ldi/i$e$a;->x:I

    iput v8, p0, Ldi/i$e$a;->y:I

    invoke-static {v9, v2, v3, p0}, Landroidx/lifecycle/j0;->b(Landroidx/lifecycle/s;Landroidx/lifecycle/l$b;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    move-object v0, p1

    :goto_2
    move-object p1, v0

    goto :goto_3

    :cond_6
    const-string v0, "PGS is not authenticated."

    invoke-static {v7, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Lpt/b;->d(I)Ljava/lang/Integer;

    :cond_7
    :goto_3
    invoke-static {p1}, Ljt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_8

    const-string v0, "GooglePlayGames signIn failed exceptionally"

    invoke-static {v7, v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_8
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
