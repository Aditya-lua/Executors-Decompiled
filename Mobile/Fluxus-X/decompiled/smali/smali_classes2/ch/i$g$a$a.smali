.class public final Lch/i$g$a$a;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lch/i$g$a;->a(Lim/a;)V
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
    c = "com.roblox.client.ads.NativeAdsHandler$getQueryInfo$1$1$onFailure$1"
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

.field public final synthetic u:Z

.field public final synthetic v:Lim/a;

.field public final synthetic w:Lch/i;

.field public final synthetic x:I


# direct methods
.method public constructor <init>(ZLim/a;Lch/i;ILeu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lim/a;",
            "Lch/i;",
            "I",
            "Leu/b<",
            "-",
            "Lch/i$g$a$a;",
            ">;)V"
        }
    .end annotation

    iput-boolean p1, p0, Lch/i$g$a$a;->u:Z

    iput-object p2, p0, Lch/i$g$a$a;->v:Lim/a;

    iput-object p3, p0, Lch/i$g$a$a;->w:Lch/i;

    iput p4, p0, Lch/i$g$a$a;->x:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Leu/b;)Leu/b;
    .locals 6
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

    new-instance v0, Lch/i$g$a$a;

    iget-boolean v1, p0, Lch/i$g$a$a;->u:Z

    iget-object v2, p0, Lch/i$g$a$a;->v:Lim/a;

    iget-object v3, p0, Lch/i$g$a$a;->w:Lch/i;

    iget v4, p0, Lch/i$g$a$a;->x:I

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lch/i$g$a$a;-><init>(ZLim/a;Lch/i;ILeu/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Leu/b;

    invoke-virtual {p0, p1}, Lch/i$g$a$a;->m(Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    iget v0, p0, Lch/i$g$a$a;->t:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lzt/o;->b(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lch/i$g$a$a;->u:Z

    if-eqz p1, :cond_1

    sget-object p1, Lch/b;->c:Lch/b;

    iget-object v0, p0, Lch/i$g$a$a;->v:Lim/a;

    invoke-virtual {v0}, Lim/a;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "UNKNOWN"

    :cond_0
    invoke-static {p1, v0}, Lch/l;->b(Lch/b;Ljava/lang/String;)V

    :cond_1
    iget-object p1, p0, Lch/i$g$a$a;->w:Lch/i;

    invoke-static {p1}, Lch/i;->f(Lch/i;)Lcom/roblox/protocols/nativeadsplatforminterface/generated/INativeAdsCoreListener;

    move-result-object p1

    if-eqz p1, :cond_2

    iget v0, p0, Lch/i$g$a$a;->x:I

    const-string v1, ""

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

    invoke-virtual {p0, p1}, Lch/i$g$a$a;->create(Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lch/i$g$a$a;

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, v0}, Lch/i$g$a$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
