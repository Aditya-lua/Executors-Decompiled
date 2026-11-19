.class public final Lch/a$c;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/a;->d(Lj/b;)V
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
    c = "com.roblox.client.ads.AdsHelper$onCreate$1"
    f = "AdsHelper.kt"
    l = {
        0x27,
        0x31
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

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Lch/a;

.field public final synthetic x:Lj/b;


# direct methods
.method public constructor <init>(Lch/a;Lj/b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/a;",
            "Lj/b;",
            "Leu/b<",
            "-",
            "Lch/a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch/a$c;->w:Lch/a;

    iput-object p2, p0, Lch/a$c;->x:Lj/b;

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

    new-instance p1, Lch/a$c;

    iget-object v0, p0, Lch/a$c;->w:Lch/a;

    iget-object v1, p0, Lch/a$c;->x:Lj/b;

    invoke-direct {p1, v0, v1, p2}, Lch/a$c;-><init>(Lch/a;Lj/b;Leu/b;)V

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
    invoke-virtual {p0, p1, p2}, Lch/a$c;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/a$c;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lch/a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lch/a$c;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lch/a$c;->v:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const-string v4, "rbx.AdsHelper"

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-eq v1, v2, :cond_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_0
    iget-object v0, p0, Lch/a$c;->u:Ljava/lang/Object;

    check-cast v0, Lch/i;

    iget-object v1, p0, Lch/a$c;->t:Ljava/lang/Object;

    check-cast v1, Lhm/c;

    :try_start_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_4

    :cond_1
    iget-object v1, p0, Lch/a$c;->u:Ljava/lang/Object;

    check-cast v1, Lch/i;

    iget-object v3, p0, Lch/a$c;->t:Ljava/lang/Object;

    check-cast v3, Lhm/c;

    :try_start_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p1

    move-object v0, v1

    goto/16 :goto_4

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lch/a$c;->w:Lch/a;

    iget-object v1, p0, Lch/a$c;->x:Lj/b;

    invoke-static {p1, v1}, Lch/a;->a(Lch/a;Lj/b;)Lhm/c;

    move-result-object p1

    iget-object v1, p0, Lch/a$c;->w:Lch/a;

    invoke-static {v1}, Lch/a;->b(Lch/a;)Lkotlin/jvm/functions/Function2;

    move-result-object v1

    sget-object v5, Lch/f;->a:Lch/f;

    invoke-interface {v1, v5, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lch/i;

    :try_start_2
    invoke-static {}, Lbi/h;->a()Lbi/i;

    move-result-object v6

    invoke-interface {v6}, Lbi/i;->j0()Z

    move-result v6

    if-eqz v6, :cond_5

    instance-of v6, p1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-eqz v6, :cond_5

    const-string v6, "gmasdk not installed; awaiting in-session install to activate ads"

    invoke-static {v4, v6}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iput-object v6, p0, Lch/a$c;->t:Ljava/lang/Object;

    iput-object v1, p0, Lch/a$c;->u:Ljava/lang/Object;

    iput v3, p0, Lch/a$c;->v:I

    invoke-virtual {v5, p0}, Lch/f;->d(Leu/b;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_2

    :cond_3
    move-object v3, p1

    :goto_0
    iget-object p1, p0, Lch/a$c;->w:Lch/a;

    iget-object v5, p0, Lch/a$c;->x:Lj/b;

    invoke-static {p1, v5}, Lch/a;->a(Lch/a;Lj/b;)Lhm/c;

    move-result-object p1

    instance-of v5, p1, Lcom/roblox/universalapp/ads/NoopGmaSdkController;

    if-nez v5, :cond_4

    const-string v5, "Activated real LegacyGmaSdkController in-session; swapping into ads protocol"

    invoke-static {v4, v5}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v1, p1}, Lch/i;->n(Lhm/c;)V

    goto :goto_1

    :cond_4
    const-string p1, "gmasdk installed but controller still unavailable; keeping no-op protocol"

    invoke-static {v4, p1}, Lok/q;->k(Ljava/lang/String;Ljava/lang/String;)I

    move-result p1

    invoke-static {p1}, Lgu/b;->c(I)Ljava/lang/Integer;

    :goto_1
    move-object p1, v3

    :cond_5
    invoke-static {p1}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lch/a$c;->t:Ljava/lang/Object;

    iput-object v1, p0, Lch/a$c;->u:Ljava/lang/Object;

    iput v2, p0, Lch/a$c;->v:I

    invoke-static {p0}, Lav/z0;->a(Leu/b;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    move-object v0, v1

    :goto_3
    :try_start_3
    new-instance p1, Lzt/d;

    invoke-direct {p1}, Lzt/d;-><init>()V

    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_4
    invoke-virtual {v0}, Lch/i;->i()V

    throw p1
.end method
