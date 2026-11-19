.class public final Lch/i$p$a$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i$p$a;->a(Ljm/b;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onAdProgress$1"
    f = "NativeAdsHandler.kt"
    l = {}
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

.field public final synthetic u:Lch/i;

.field public final synthetic v:Ljm/b;


# direct methods
.method public constructor <init>(Lch/i;Ljm/b;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/i;",
            "Ljm/b;",
            "Leu/b<",
            "-",
            "Lch/i$p$a$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch/i$p$a$a;->u:Lch/i;

    iput-object p2, p0, Lch/i$p$a$a;->v:Ljm/b;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 3
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

    new-instance v0, Lch/i$p$a$a;

    iget-object v1, p0, Lch/i$p$a$a;->u:Lch/i;

    iget-object v2, p0, Lch/i$p$a$a;->v:Ljm/b;

    invoke-direct {v0, v1, v2, p1}, Lch/i$p$a$a;-><init>(Lch/i;Ljm/b;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lch/i$p$a$a;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lch/i$p$a$a;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lch/i$p$a$a;->u:Lch/i;

    invoke-static {p1}, Lch/i;->f(Lch/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lch/i$p$a$a;->v:Ljm/b;

    invoke-virtual {p1}, Ljm/b;->a()D

    move-result-wide v1

    double-to-float v1, v1

    iget-object p1, p0, Lch/i$p$a$a;->v:Ljm/b;

    invoke-virtual {p1}, Ljm/b;->e()D

    move-result-wide v2

    double-to-float v2, v2

    iget-object p1, p0, Lch/i$p$a$a;->v:Ljm/b;

    invoke-virtual {p1}, Ljm/b;->b()J

    move-result-wide v3

    long-to-float v3, v3

    iget-object p1, p0, Lch/i$p$a$a;->v:Ljm/b;

    invoke-virtual {p1}, Ljm/b;->d()I

    move-result p1

    int-to-float v4, p1

    iget-object p1, p0, Lch/i$p$a$a;->v:Ljm/b;

    invoke-virtual {p1}, Ljm/b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onAdProgress(FFFFLjava/lang/String;)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
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

    invoke-virtual {p0, p1}, Lch/i$p$a$a;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/i$p$a$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lch/i$p$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
