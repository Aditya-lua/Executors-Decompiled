.class public final Lch/i$p;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i;->showAd(ILjava/lang/String;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$showAd$1"
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

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Lch/i;

.field public final synthetic w:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Lch/i;ILeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lch/i;",
            "I",
            "Leu/b<",
            "-",
            "Lch/i$p;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lch/i$p;->u:Ljava/lang/String;

    iput-object p2, p0, Lch/i$p;->v:Lch/i;

    iput p3, p0, Lch/i$p;->w:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 4
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

    new-instance v0, Lch/i$p;

    iget-object v1, p0, Lch/i$p;->u:Ljava/lang/String;

    iget-object v2, p0, Lch/i$p;->v:Lch/i;

    iget v3, p0, Lch/i$p;->w:I

    invoke-direct {v0, v1, v2, v3, p1}, Lch/i$p;-><init>(Ljava/lang/String;Lch/i;ILeu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lch/i$p;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lch/i$p;->t:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lch/i$p;->u:Ljava/lang/String;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lch/i$p;->v:Lch/i;

    invoke-static {p1}, Lch/i;->f(Lch/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget v0, p0, Lch/i$p;->w:I

    sget-object v1, Ljm/c;->f:Ljm/c;

    invoke-virtual {v1}, Ljm/c;->b()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onShowAdCompleted(ILjava/lang/String;F)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
    iget-object p1, p0, Lch/i$p;->v:Lch/i;

    invoke-static {p1}, Lch/i;->d(Lch/i;)Lhm/c;

    move-result-object p1

    iget-object v0, p0, Lch/i$p;->u:Ljava/lang/String;

    new-instance v1, Lch/i$p$a;

    iget-object v2, p0, Lch/i$p;->v:Lch/i;

    iget v3, p0, Lch/i$p;->w:I

    invoke-direct {v1, v2, v3}, Lch/i$p$a;-><init>(Lch/i;I)V

    invoke-interface {p1, v0, v1}, Lhm/c;->b(Ljava/lang/String;Lhm/k;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_2
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

    invoke-virtual {p0, p1}, Lch/i$p;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/i$p;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lch/i$p;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
