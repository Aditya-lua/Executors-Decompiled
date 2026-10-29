.class public final Ltg/g$g$a$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g$g$a;->onSuccess(Ljava/lang/String;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onSuccess$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Z

.field public final synthetic v:Ltg/g;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;


# direct methods
.method public constructor <init>(ZLtg/g;ILjava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ltg/g;",
            "I",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Ltg/g$g$a$b;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Ltg/g$g$a$b;->u:Z

    iput-object p2, p0, Ltg/g$g$a$b;->v:Ltg/g;

    iput p3, p0, Ltg/g$g$a$b;->w:I

    iput-object p4, p0, Ltg/g$g$a$b;->x:Ljava/lang/String;

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

    new-instance v0, Ltg/g$g$a$b;

    iget-boolean v1, p0, Ltg/g$g$a$b;->u:Z

    iget-object v2, p0, Ltg/g$g$a$b;->v:Ltg/g;

    iget v3, p0, Ltg/g$g$a$b;->w:I

    iget-object v4, p0, Ltg/g$g$a$b;->x:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Ltg/g$g$a$b;-><init>(ZLtg/g;ILjava/lang/String;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Ltg/g$g$a$b;->q(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Ltg/g$g$a$b;->t:I

    if-nez v0, :cond_3

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Ltg/g$g$a$b;->u:Z

    if-eqz p1, :cond_0

    sget-object p1, Ltg/b;->c:Ltg/b;

    const-string v0, "success"

    invoke-static {p1, v0}, Ltg/j;->b(Ltg/b;Ljava/lang/String;)V

    :cond_0
    iget-object p1, p0, Ltg/g$g$a$b;->v:Ltg/g;

    invoke-static {p1}, Ltg/g;->f(Ltg/g;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_2

    iget v0, p0, Ltg/g$g$a$b;->w:I

    iget-object v1, p0, Ltg/g$g$a$b;->x:Ljava/lang/String;

    if-nez v1, :cond_1

    const-string v1, ""

    :cond_1
    invoke-virtual {p1, v0, v1}, Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;->onGetQueryInfoCompleted(ILjava/lang/String;)V

    :cond_2
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_3
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

    invoke-virtual {p0, p1}, Ltg/g$g$a$b;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/g$g$a$b;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltg/g$g$a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
