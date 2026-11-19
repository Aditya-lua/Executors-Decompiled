.class public final Lli/i$k;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lli/i;->v(Leu/b;)Ljava/lang/Object;
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.googleplaygames.PlayGamesIntegration$updateAndGrantStreak$2"
    f = "PlayGamesIntegration.kt"
    l = {
        0x111,
        0x113,
        0x117,
        0x11b,
        0x11f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public v:I

.field public w:I


# direct methods
.method public constructor <init>(Leu/b;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lli/i$k;",
            ">;)V"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-direct {p0, v0, p1}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 0
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

    new-instance p1, Lli/i$k;

    invoke-direct {p1, p2}, Lli/i$k;-><init>(Leu/b;)V

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lli/i$k;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lli/i$k;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lli/i$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lli/i$k;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lli/i$k;->w:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x1

    const/4 v5, 0x3

    const-string v6, "rbx.achievements.playgames"

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v1, :cond_5

    if-eq v1, v4, :cond_4

    if-eq v1, v7, :cond_3

    if-eq v1, v5, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lli/i$k;->t:Ljava/lang/Object;

    check-cast v0, Lgm/b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lli/i$k;->v:I

    iget v3, p0, Lli/i$k;->u:I

    iget-object v4, p0, Lli/i$k;->t:Ljava/lang/Object;

    check-cast v4, Lgm/b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    iget v1, p0, Lli/i$k;->v:I

    iget v4, p0, Lli/i$k;->u:I

    iget-object v5, p0, Lli/i$k;->t:Ljava/lang/Object;

    check-cast v5, Lgm/b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_3
    iget v1, p0, Lli/i$k;->u:I

    iget-object v4, p0, Lli/i$k;->t:Ljava/lang/Object;

    check-cast v4, Lgm/b;

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v11, v4

    move v4, v1

    move-object v1, v11

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_5
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lli/i;->a:Lli/i;

    invoke-static {p1}, Lli/i;->f(Lli/i;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string p1, "Skip updating and granting streak achievements"

    invoke-static {v6, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
    invoke-virtual {p1}, Lli/i;->j()Lli/m;

    move-result-object p1

    iput v4, p0, Lli/i$k;->w:I

    invoke-virtual {p1, p0}, Lli/m;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto/16 :goto_4

    :cond_7
    :goto_0
    sget-object p1, Lcom/roblox/universalapp/achievement/b;->a:Lcom/roblox/universalapp/achievement/b;

    invoke-virtual {p1}, Lcom/roblox/universalapp/achievement/b;->a()Lgm/b;

    move-result-object p1

    if-eqz p1, :cond_c

    sget-object v1, Lli/i;->a:Lli/i;

    invoke-virtual {v1}, Lli/i;->j()Lli/m;

    move-result-object v1

    iput-object p1, p0, Lli/i$k;->t:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, p0, Lli/i$k;->u:I

    iput v7, p0, Lli/i$k;->w:I

    invoke-virtual {v1, p0}, Lli/m;->i(Leu/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_8

    goto/16 :goto_4

    :cond_8
    move-object v11, v1

    move-object v1, p1

    move-object p1, v11

    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Current login streak: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    if-lt p1, v5, :cond_9

    const-string v9, "Granting 3 day streak achievement"

    invoke-static {v6, v9}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v9, Lgm/l;

    invoke-static {}, Lli/b;->c()Lli/a;

    move-result-object v10

    invoke-virtual {v10}, Lli/a;->b()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v9, v10, v8, v7, v8}, Lgm/l;-><init>(Ljava/lang/String;Ljava/time/Instant;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lli/i$k;->t:Ljava/lang/Object;

    iput v4, p0, Lli/i$k;->u:I

    iput p1, p0, Lli/i$k;->v:I

    iput v5, p0, Lli/i$k;->w:I

    invoke-interface {v1, v9, p0}, Lgm/b;->e(Lgm/l;Leu/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_9

    goto :goto_4

    :cond_9
    move-object v5, v1

    move v1, p1

    :goto_2
    const/16 p1, 0xa

    if-lt v1, p1, :cond_b

    const-string p1, "Granting 10 day streak achievement"

    invoke-static {v6, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lgm/l;

    invoke-static {}, Lli/b;->b()Lli/a;

    move-result-object v9

    invoke-virtual {v9}, Lli/a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-direct {p1, v9, v8, v7, v8}, Lgm/l;-><init>(Ljava/lang/String;Ljava/time/Instant;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v5, p0, Lli/i$k;->t:Ljava/lang/Object;

    iput v4, p0, Lli/i$k;->u:I

    iput v1, p0, Lli/i$k;->v:I

    iput v3, p0, Lli/i$k;->w:I

    invoke-interface {v5, p1, p0}, Lgm/b;->e(Lgm/l;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_a

    goto :goto_4

    :cond_a
    move v3, v4

    move-object v4, v5

    :goto_3
    move-object v5, v4

    move v4, v3

    :cond_b
    const/16 p1, 0x14

    if-lt v1, p1, :cond_c

    const-string p1, "Granting 20 day streak achievement"

    invoke-static {v6, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance p1, Lgm/l;

    invoke-static {}, Lli/b;->d()Lli/a;

    move-result-object v3

    invoke-virtual {v3}, Lli/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p1, v3, v8, v7, v8}, Lgm/l;-><init>(Ljava/lang/String;Ljava/time/Instant;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    iput-object v3, p0, Lli/i$k;->t:Ljava/lang/Object;

    iput v4, p0, Lli/i$k;->u:I

    iput v1, p0, Lli/i$k;->v:I

    iput v2, p0, Lli/i$k;->w:I

    invoke-interface {v5, p1, p0}, Lgm/b;->e(Lgm/l;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_c

    :goto_4
    return-object v0

    :cond_c
    :goto_5
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
