.class public final Ltg/a$d;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/a;->e(Lj/b;)V
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
    c = "com.roblox.client.ads.AdsHelper$onCreate$1"
    f = "AdsHelper.kt"
    l = {
        0x2b,
        0x35,
        0x42,
        0x4b
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Ltg/a;

.field public final synthetic x:Lj/b;


# direct methods
.method public constructor <init>(Ltg/a;Lj/b;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/a;",
            "Lj/b;",
            "Lnt/b<",
            "-",
            "Ltg/a$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltg/a$d;->w:Ltg/a;

    iput-object p2, p0, Ltg/a$d;->x:Lj/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

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

    new-instance p1, Ltg/a$d;

    iget-object v0, p0, Ltg/a$d;->w:Ltg/a;

    iget-object v1, p0, Ltg/a$d;->x:Lj/b;

    invoke-direct {p1, v0, v1, p2}, Ltg/a$d;-><init>(Ltg/a;Lj/b;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Ltg/a$d;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Ltg/a$d;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/a$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Ltg/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Ltg/a$d;->v:I

    const-string v2, "gmasdk installed but controller still unavailable; keeping no-op protocol"

    const-string v3, "Activated real LegacyGmaSdkController in-session; swapping into ads protocol"

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const-string v8, "rbx.AdsHelper"

    if-eqz v1, :cond_4

    if-eq v1, v7, :cond_3

    if-eq v1, v6, :cond_2

    if-eq v1, v5, :cond_1

    if-eq v1, v4, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Ltg/a$d;->u:Ljava/lang/Object;

    check-cast v0, Ltl/d0;

    iget-object v1, p0, Ltg/a$d;->t:Ljava/lang/Object;

    check-cast v1, Ltl/c;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_8

    :catchall_0
    move-exception p1

    goto/16 :goto_9

    :cond_1
    iget-object v1, p0, Ltg/a$d;->u:Ljava/lang/Object;

    check-cast v1, Ltl/d0;

    iget-object v5, p0, Ltg/a$d;->t:Ljava/lang/Object;

    check-cast v5, Ltl/c;

    :try_start_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto/16 :goto_4

    :catchall_1
    move-exception p1

    move-object v0, v1

    goto/16 :goto_9

    :cond_2
    iget-object v0, p0, Ltg/a$d;->u:Ljava/lang/Object;

    check-cast v0, Ltg/g;

    iget-object v1, p0, Ltg/a$d;->t:Ljava/lang/Object;

    check-cast v1, Ltl/c;

    :try_start_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto/16 :goto_2

    :catchall_2
    move-exception p1

    goto/16 :goto_3

    :cond_3
    iget-object v1, p0, Ltg/a$d;->u:Ljava/lang/Object;

    check-cast v1, Ltg/g;

    iget-object v4, p0, Ltg/a$d;->t:Ljava/lang/Object;

    check-cast v4, Ltl/c;

    :try_start_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object p1, v1

    goto :goto_0

    :catchall_3
    move-exception p1

    move-object v0, v1

    goto/16 :goto_3

    :cond_4
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/universalapp/ads/JNINativeAdsProtocol;->getFFlagEnableNativeAdsProtocol()Z

    move-result p1

    const-string v1, "gmasdk not installed; awaiting in-session install to activate ads"

    if-eqz p1, :cond_9

    iget-object p1, p0, Ltg/a$d;->w:Ltg/a;

    iget-object v4, p0, Ltg/a$d;->x:Lj/b;

    invoke-static {p1, v4}, Ltg/a;->b(Ltg/a;Lj/b;)Ltl/c;

    move-result-object v4

    iget-object p1, p0, Ltg/a$d;->w:Ltg/a;

    invoke-static {p1}, Ltg/a;->c(Ltg/a;)Lkotlin/jvm/functions/Function2;

    move-result-object p1

    sget-object v5, Ltg/d;->a:Ltg/d;

    invoke-interface {p1, v5, v4}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltg/g;

    :try_start_4
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v9

    invoke-interface {v9}, Lth/i;->g0()Z

    move-result v9

    if-eqz v9, :cond_7

    instance-of v9, v4, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-eqz v9, :cond_7

    invoke-static {v8, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ltg/a$d;->t:Ljava/lang/Object;

    iput-object p1, p0, Ltg/a$d;->u:Ljava/lang/Object;

    iput v7, p0, Ltg/a$d;->v:I

    invoke-virtual {v5, p0}, Ltg/d;->c(Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    goto/16 :goto_7

    :cond_5
    :goto_0
    iget-object v1, p0, Ltg/a$d;->w:Ltg/a;

    iget-object v5, p0, Ltg/a$d;->x:Lj/b;

    invoke-static {v1, v5}, Ltg/a;->b(Ltg/a;Lj/b;)Ltl/c;

    move-result-object v1

    instance-of v5, v1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-nez v5, :cond_6

    invoke-static {v8, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {p1, v1}, Ltg/g;->n(Ltl/c;)V

    goto :goto_1

    :catchall_4
    move-exception v0

    move-object v10, v0

    move-object v0, p1

    move-object p1, v10

    goto :goto_3

    :cond_6
    invoke-static {v8, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Lpt/b;->d(I)Ljava/lang/Integer;

    :cond_7
    :goto_1
    invoke-static {v4}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ltg/a$d;->t:Ljava/lang/Object;

    iput-object p1, p0, Ltg/a$d;->u:Ljava/lang/Object;

    iput v6, p0, Ltg/a$d;->v:I

    invoke-static {p0}, Lku/z0;->a(Lnt/b;)Ljava/lang/Object;

    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    if-ne v1, v0, :cond_8

    goto/16 :goto_7

    :cond_8
    move-object v0, p1

    :goto_2
    :try_start_5
    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    :goto_3
    invoke-virtual {v0}, Ltg/g;->i()V

    throw p1

    :cond_9
    iget-object p1, p0, Ltg/a$d;->w:Ltg/a;

    iget-object v6, p0, Ltg/a$d;->x:Lj/b;

    invoke-static {p1, v6}, Ltg/a;->b(Ltg/a;Lj/b;)Ltl/c;

    move-result-object p1

    iget-object v6, p0, Ltg/a$d;->w:Ltg/a;

    invoke-static {v6}, Ltg/a;->a(Ltg/a;)Lkotlin/jvm/functions/Function2;

    move-result-object v6

    sget-object v7, Ltg/d;->a:Ltg/d;

    invoke-interface {v6, v7, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ltl/d0;

    :try_start_6
    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v9

    invoke-interface {v9}, Lth/i;->g0()Z

    move-result v9

    if-eqz v9, :cond_c

    instance-of v9, p1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-eqz v9, :cond_c

    invoke-static {v8, v1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iput-object v1, p0, Ltg/a$d;->t:Ljava/lang/Object;

    iput-object v6, p0, Ltg/a$d;->u:Ljava/lang/Object;

    iput v5, p0, Ltg/a$d;->v:I

    invoke-virtual {v7, p0}, Ltg/d;->c(Lnt/b;)Ljava/lang/Object;

    move-result-object v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    if-ne v1, v0, :cond_a

    goto :goto_7

    :cond_a
    move-object v5, p1

    move-object v1, v6

    :goto_4
    :try_start_7
    iget-object p1, p0, Ltg/a$d;->w:Ltg/a;

    iget-object v6, p0, Ltg/a$d;->x:Lj/b;

    invoke-static {p1, v6}, Ltg/a;->b(Ltg/a;Lj/b;)Ltl/c;

    move-result-object p1

    instance-of v6, p1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-nez v6, :cond_b

    invoke-static {v8, v3}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1, p1}, Ltl/d0;->X(Ltl/c;)V

    goto :goto_5

    :cond_b
    invoke-static {v8, v2}, Lgk/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lpt/b;->d(I)Ljava/lang/Integer;

    :goto_5
    move-object p1, v5

    goto :goto_6

    :catchall_5
    move-exception p1

    move-object v0, v6

    goto :goto_9

    :cond_c
    move-object v1, v6

    :goto_6
    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Ltg/a$d;->t:Ljava/lang/Object;

    iput-object v1, p0, Ltg/a$d;->u:Ljava/lang/Object;

    iput v4, p0, Ltg/a$d;->v:I

    invoke-static {p0}, Lku/z0;->a(Lnt/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-ne p1, v0, :cond_d

    :goto_7
    return-object v0

    :cond_d
    move-object v0, v1

    :goto_8
    :try_start_8
    new-instance p1, Ljt/d;

    invoke-direct {p1}, Ljt/d;-><init>()V

    throw p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    :goto_9
    invoke-virtual {v0}, Ltl/d0;->C()V

    throw p1
.end method
