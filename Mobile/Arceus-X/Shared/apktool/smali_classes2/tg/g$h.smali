.class public final Ltg/g$h;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltg/g;->initialize(ILjava/lang/String;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$initialize$1"
    f = "NativeAdsHandler.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Ltg/g;

.field public final synthetic v:Ljava/lang/String;

.field public final synthetic w:I


# direct methods
.method public constructor <init>(Ltg/g;Ljava/lang/String;ILnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltg/g;",
            "Ljava/lang/String;",
            "I",
            "Lnt/b<",
            "-",
            "Ltg/g$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltg/g$h;->u:Ltg/g;

    iput-object p2, p0, Ltg/g$h;->v:Ljava/lang/String;

    iput p3, p0, Ltg/g$h;->w:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method

.method public static synthetic q(Ltg/g;ILjava/lang/Boolean;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ltg/g$h;->s(Ltg/g;ILjava/lang/Boolean;Ljava/lang/String;)V

    return-void
.end method

.method public static final s(Ltg/g;ILjava/lang/Boolean;Ljava/lang/String;)V
    .locals 6

    new-instance v0, Ltg/g$h$a;

    const/4 v5, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Ltg/g$h$a;-><init>(Ltg/g;ILjava/lang/Boolean;Ljava/lang/String;Lnt/b;)V

    invoke-static {v1, v0}, Ltg/g;->c(Ltg/g;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public final create(Lnt/b;)Lnt/b;
    .locals 4
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

    new-instance v0, Ltg/g$h;

    iget-object v1, p0, Ltg/g$h;->u:Ltg/g;

    iget-object v2, p0, Ltg/g$h;->v:Ljava/lang/String;

    iget v3, p0, Ltg/g$h;->w:I

    invoke-direct {v0, v1, v2, v3, p1}, Ltg/g$h;-><init>(Ltg/g;Ljava/lang/String;ILnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lnt/b;

    invoke-virtual {p0, p1}, Ltg/g$h;->r(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Ltg/g$h;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Ltg/g$h;->u:Ltg/g;

    invoke-static {p1}, Ltg/g;->d(Ltg/g;)Ltl/c;

    move-result-object p1

    iget-object v0, p0, Ltg/g$h;->v:Ljava/lang/String;

    iget-object v1, p0, Ltg/g$h;->u:Ltg/g;

    iget v2, p0, Ltg/g$h;->w:I

    new-instance v3, Ltg/h;

    invoke-direct {v3, v1, v2}, Ltg/h;-><init>(Ltg/g;I)V

    invoke-interface {p1, v0, v3}, Ltl/c;->g(Ljava/lang/String;Ljava/util/function/BiConsumer;)V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final r(Lnt/b;)Ljava/lang/Object;
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

    invoke-virtual {p0, p1}, Ltg/g$h;->create(Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Ltg/g$h;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Ltg/g$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
