.class public final Ltg/g$p$a$c;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g$p$a;->c(Lvl/c;F)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$showAd$1$1$onPlayBackEnded$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ltg/g;

.field public final synthetic v:I

.field public final synthetic w:Lvl/c;

.field public final synthetic x:F


# direct methods
.method public constructor <init>(Ltg/g;ILvl/c;FLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/g;",
            "I",
            "Lvl/c;",
            "F",
            "Lnt/b<",
            "-",
            "Ltg/g$p$a$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltg/g$p$a$c;->u:Ltg/g;

    iput p2, p0, Ltg/g$p$a$c;->v:I

    iput-object p3, p0, Ltg/g$p$a$c;->w:Lvl/c;

    iput p4, p0, Ltg/g$p$a$c;->x:F

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Ltg/g$p$a$c;

    iget-object v1, p0, Ltg/g$p$a$c;->u:Ltg/g;

    iget v2, p0, Ltg/g$p$a$c;->v:I

    iget-object v3, p0, Ltg/g$p$a$c;->w:Lvl/c;

    iget v4, p0, Ltg/g$p$a$c;->x:F

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ltg/g$p$a$c;-><init>(Ltg/g;ILvl/c;FLnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Ltg/g$p$a$c;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Ltg/g$p$a$c;->t:I

    if-nez v0, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ltg/g$p$a$c;->u:Ltg/g;

    invoke-static {p1}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_0

    iget v0, p0, Ltg/g$p$a$c;->v:I

    iget-object v1, p0, Ltg/g$p$a$c;->w:Lvl/c;

    invoke-virtual {v1}, Lvl/c;->b()Ljava/lang/String;

    move-result-object v1

    iget v2, p0, Ltg/g$p$a$c;->x:F

    invoke-virtual {p1, v0, v1, v2}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onShowAdCompleted(ILjava/lang/String;F)V

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_1
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

    invoke-virtual {p0, p1}, Ltg/g$p$a$c;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/g$p$a$c;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltg/g$p$a$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
