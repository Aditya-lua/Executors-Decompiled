.class public final Lch/i$k;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i;->k(Lhm/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lpu/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function1<",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1"
    f = "NativeAdsHandler.kt"
    l = {
        0xeb
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        ""
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lpu/n;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpu/n<",
            "Ljava/lang/String;",
            "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic w:Lch/i;

.field public final synthetic x:Lhm/a;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lpu/n;Lch/i;Lhm/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lpu/n<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Lch/i;",
            "Lhm/a;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Ljava/lang/String;",
            "Lkotlin/Unit;",
            ">;",
            "Leu/b<",
            "-",
            "Lch/i$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch/i$k;->u:Ljava/lang/String;

    iput-object p2, p0, Lch/i$k;->v:Lpu/n;

    iput-object p3, p0, Lch/i$k;->w:Lch/i;

    iput-object p4, p0, Lch/i$k;->x:Lhm/a;

    iput-object p5, p0, Lch/i$k;->y:Ljava/lang/String;

    iput-object p6, p0, Lch/i$k;->z:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p7}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lch/i$k;

    iget-object v1, p0, Lch/i$k;->u:Ljava/lang/String;

    iget-object v2, p0, Lch/i$k;->v:Lpu/n;

    iget-object v3, p0, Lch/i$k;->w:Lch/i;

    iget-object v4, p0, Lch/i$k;->x:Lhm/a;

    iget-object v5, p0, Lch/i$k;->y:Ljava/lang/String;

    iget-object v6, p0, Lch/i$k;->z:Lkotlin/jvm/functions/Function1;

    move-object v7, p1

    invoke-direct/range {v0 .. v7}, Lch/i$k;-><init>(Ljava/lang/String;Lpu/n;Lch/i;Lhm/a;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lch/i$k;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lch/i$k;->t:I

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Lzt/n;

    invoke-virtual {p1}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object p1

    move-object v9, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lch/i$k;->u:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lch/i$k;->v:Lpu/n;

    iget-object v0, p0, Lch/i$k;->u:Ljava/lang/String;

    sget-object v1, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->ADTRACINGIDABSENT:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    const-string v2, "adTracingId is empty"

    invoke-interface {p1, v0, v1, v2}, Lpu/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
    iget-object p1, p0, Lch/i$k;->w:Lch/i;

    invoke-static {p1}, Lch/i;->d(Lch/i;)Lhm/c;

    move-result-object v4

    iget-object v5, p0, Lch/i$k;->x:Lhm/a;

    iget-object v6, p0, Lch/i$k;->u:Ljava/lang/String;

    iget-object v7, p0, Lch/i$k;->y:Ljava/lang/String;

    new-instance v8, Lch/i$k$a;

    iget-object p1, p0, Lch/i$k;->w:Lch/i;

    invoke-direct {v8, p1, v5, v6, v3}, Lch/i$k$a;-><init>(Lch/i;Lhm/a;Ljava/lang/String;Leu/b;)V

    iput v2, p0, Lch/i$k;->t:I

    move-object v9, p0

    invoke-interface/range {v4 .. v9}, Lhm/c;->g(Lhm/a;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    iget-object v0, v9, Lch/i$k;->z:Lkotlin/jvm/functions/Function1;

    iget-object v1, v9, Lch/i$k;->u:Ljava/lang/String;

    invoke-static {p1}, Lzt/n;->h(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    move-object v2, p1

    check-cast v2, Lkotlin/Unit;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_4
    iget-object v0, v9, Lch/i$k;->v:Lpu/n;

    iget-object v1, v9, Lch/i$k;->u:Ljava/lang/String;

    invoke-static {p1}, Lzt/n;->e(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_9

    instance-of v2, p1, Lhm/b;

    if-eqz v2, :cond_5

    sget-object v2, Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;->NATIVESHUTTINGDOWN:Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    goto :goto_2

    :cond_5
    instance-of v2, p1, Lhm/e;

    if-eqz v2, :cond_6

    move-object v2, p1

    check-cast v2, Lhm/e;

    goto :goto_1

    :cond_6
    move-object v2, v3

    :goto_1
    if-eqz v2, :cond_7

    invoke-virtual {v2}, Lhm/e;->a()Lhm/g;

    move-result-object v3

    :cond_7
    invoke-static {v3}, Lhm/h;->a(Lhm/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/LoadAdFailureReason;

    move-result-object v2

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_8

    const-string p1, ""

    :cond_8
    invoke-interface {v0, v1, v2, p1}, Lpu/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_9
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public final m(Leu/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lch/i$k;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/i$k;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lch/i$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
