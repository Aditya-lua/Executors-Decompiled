.class public final Ltg/g$g;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g;->getQueryInfo(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function1<",
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

.annotation runtime Lpt/f;
    c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ljava/lang/String;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:Ltg/g;

.field public final synthetic x:I

.field public final synthetic y:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ltg/g;ILjava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ltg/g;",
            "I",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ltg/g$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltg/g$g;->u:Ljava/lang/String;

    iput-object p2, p0, Ltg/g$g;->v:Ljava/lang/String;

    iput-object p3, p0, Ltg/g$g;->w:Ltg/g;

    iput p4, p0, Ltg/g$g;->x:I

    iput-object p5, p0, Ltg/g$g;->y:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Ltg/g$g;

    iget-object v1, p0, Ltg/g$g;->u:Ljava/lang/String;

    iget-object v2, p0, Ltg/g$g;->v:Ljava/lang/String;

    iget-object v3, p0, Ltg/g$g;->w:Ltg/g;

    iget v4, p0, Ltg/g$g;->x:I

    iget-object v5, p0, Ltg/g$g;->y:Ljava/lang/String;

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Ltg/g$g;-><init>(Ljava/lang/String;Ljava/lang/String;Ltg/g;ILjava/lang/String;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Ltg/g$g;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Ltg/g$g;->t:I

    if-nez v0, :cond_6

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object p1

    invoke-interface {p1}, Lth/i;->N3()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Ltg/g$g;->u:Ljava/lang/String;

    const-string v0, "IsolatedRewarded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Ltg/g$g;->u:Ljava/lang/String;

    const-string v0, "NonIsolatedRewarded"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    sget-object v0, Ltg/b;->b:Ltg/b;

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, v2, v1, v2}, Ltg/j;->f(Ltg/b;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_2
    iget-object v0, p0, Ltg/g$g;->v:Ljava/lang/String;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_5

    if-eqz p1, :cond_3

    sget-object p1, Ltg/b;->c:Ltg/b;

    const-string v0, "MISSING_AD_TRACING_ID"

    invoke-static {p1, v0}, Ltg/j;->b(Ltg/b;Ljava/lang/String;)V

    :cond_3
    iget-object p1, p0, Ltg/g$g;->w:Ltg/g;

    invoke-static {p1}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_4

    iget v0, p0, Ltg/g$g;->x:I

    const-string v1, ""

    invoke-virtual {p1, v0, v1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onGetQueryInfoCompleted(ILjava/lang/String;)V

    :cond_4
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_5
    iget-object v0, p0, Ltg/g$g;->w:Ltg/g;

    invoke-static {v0}, Ltg/g;->d(Ltg/g;)Ltl/c;

    move-result-object v0

    iget-object v1, p0, Ltg/g$g;->v:Ljava/lang/String;

    iget-object v2, p0, Ltg/g$g;->y:Ljava/lang/String;

    iget-object v3, p0, Ltg/g$g;->u:Ljava/lang/String;

    new-instance v4, Ltg/g$g$a;

    iget-object v5, p0, Ltg/g$g;->w:Ltg/g;

    iget v6, p0, Ltg/g$g;->x:I

    invoke-direct {v4, v5, p1, v6}, Ltg/g$g$a;-><init>(Ltg/g;ZI)V

    invoke-interface {v0, v1, v2, v3, v4}, Ltl/c;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltl/j;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Lnt/b;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Ltg/g$g;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/g$g;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltg/g$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
