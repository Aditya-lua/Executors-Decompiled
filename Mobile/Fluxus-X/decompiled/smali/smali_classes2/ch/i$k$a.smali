.class public final Lch/i$k$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Ljava/lang/String;",
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
    c = "com.roblox.client.ads.NativeAdsHandler$loadAd$1$1"
    f = "NativeAdsHandler.kt"
    l = {
        0xec
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "",
        "queryInfo",
        "Lzt/n;",
        "<anonymous>",
        "(Ljava/lang/String;)Lzt/n;"
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

.field public synthetic u:Ljava/lang/Object;

.field public final synthetic v:Lch/i;

.field public final synthetic w:Lhm/a;

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lch/i;Lhm/a;Ljava/lang/String;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lch/i;",
            "Lhm/a;",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lch/i$k$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch/i$k$a;->v:Lch/i;

    iput-object p2, p0, Lch/i$k$a;->w:Lhm/a;

    iput-object p3, p0, Lch/i$k$a;->x:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 4
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

    new-instance v0, Lch/i$k$a;

    iget-object v1, p0, Lch/i$k$a;->v:Lch/i;

    iget-object v2, p0, Lch/i$k$a;->w:Lhm/a;

    iget-object v3, p0, Lch/i$k$a;->x:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3, p2}, Lch/i$k$a;-><init>(Lch/i;Lhm/a;Ljava/lang/String;Leu/b;)V

    iput-object p1, v0, Lch/i$k$a;->u:Ljava/lang/Object;

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/String;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lch/i$k$a;->m(Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lch/i$k$a;->u:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, p0, Lch/i$k$a;->t:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

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

    iget-object p1, p0, Lch/i$k$a;->v:Lch/i;

    iget-object v2, p0, Lch/i$k$a;->w:Lhm/a;

    iget-object v4, p0, Lch/i$k$a;->x:Ljava/lang/String;

    invoke-static {v0}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, p0, Lch/i$k$a;->u:Ljava/lang/Object;

    iput v3, p0, Lch/i$k$a;->t:I

    invoke-static {p1, v2, v4, v0, p0}, Lch/i;->g(Lch/i;Lhm/a;Ljava/lang/String;Ljava/lang/String;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    invoke-static {p1}, Lzt/n;->a(Ljava/lang/Object;)Lzt/n;

    move-result-object p1

    return-object p1
.end method

.method public final m(Ljava/lang/String;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Leu/b<",
            "-",
            "Lzt/n<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lch/i$k$a;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/i$k$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lch/i$k$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
