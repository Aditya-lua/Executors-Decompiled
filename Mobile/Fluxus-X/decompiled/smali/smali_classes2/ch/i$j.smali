.class public final Lch/i$j;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i;->install(Z)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$install$1"
    f = "NativeAdsHandler.kt"
    l = {
        0x9d,
        0x9f
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

.field public final synthetic u:Z

.field public final synthetic v:Lch/i;


# direct methods
.method public constructor <init>(ZLch/i;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lch/i;",
            "Leu/b<",
            "-",
            "Lch/i$j;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch/i$j;->u:Z

    iput-object p2, p0, Lch/i$j;->v:Lch/i;

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

    new-instance v0, Lch/i$j;

    iget-boolean v1, p0, Lch/i$j;->u:Z

    iget-object v2, p0, Lch/i$j;->v:Lch/i;

    invoke-direct {v0, v1, v2, p1}, Lch/i$j;-><init>(ZLch/i;Leu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lch/i$j;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lch/i$j;->t:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lcom/roblox/universalapp/ads/JNINativeAdsProtocol;->getGmaSdkBackgroundInstallIxpEnabled()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lai/h;->y()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-boolean p1, p0, Lch/i$j;->u:Z

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "engine triggered gmasdk install, eager install: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "NativeAdsHandler"

    invoke-static {v1, p1}, Lok/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-boolean p1, p0, Lch/i$j;->u:Z

    if-eqz p1, :cond_3

    iget-object p1, p0, Lch/i$j;->v:Lch/i;

    invoke-static {p1}, Lch/i;->e(Lch/i;)Lhm/i;

    move-result-object p1

    sget-object v1, Lhm/i$a;->b:Lhm/i$a;

    iput v3, p0, Lch/i$j;->t:I

    invoke-interface {p1, v1, p0}, Lhm/i;->b(Lhm/i$a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lch/i$j;->v:Lch/i;

    invoke-static {p1}, Lch/i;->e(Lch/i;)Lhm/i;

    move-result-object p1

    sget-object v1, Lhm/i$a;->a:Lhm/i$a;

    iput v2, p0, Lch/i$j;->t:I

    invoke-interface {p1, v1, p0}, Lhm/i;->b(Lhm/i$a;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_4
    iget-object p1, p0, Lch/i$j;->v:Lch/i;

    invoke-static {p1}, Lch/i;->e(Lch/i;)Lhm/i;

    move-result-object p1

    iget-boolean v0, p0, Lch/i$j;->u:Z

    invoke-interface {p1, v0}, Lhm/i;->a(Z)V

    :cond_5
    :goto_2
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

    invoke-virtual {p0, p1}, Lch/i$j;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/i$j;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lch/i$j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
