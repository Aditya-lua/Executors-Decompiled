.class public final Lei/n$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lei/n;->lookup(Ljava/lang/String;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lpt/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lku/p0;",
        "Lnt/b<",
        "-",
        "Ljava/util/List<",
        "+",
        "Ljava/net/InetAddress;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "",
        "Ljava/net/InetAddress;",
        "<anonymous>",
        "(Lku/p0;)Ljava/util/List;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.http.PrewarmableDnsResolver$lookup$1"
    f = "PrewarmableDnsResolver.kt"
    l = {
        0x4f
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lku/x;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lku/x<",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;>;"
        }
    .end annotation
.end field

.field public final synthetic v:Lei/n;

.field public final synthetic w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lku/x;Lei/n;Ljava/lang/String;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/x<",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;>;",
            "Lei/n;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lei/n$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lei/n$b;->u:Lku/x;

    iput-object p2, p0, Lei/n$b;->v:Lei/n;

    iput-object p3, p0, Lei/n$b;->w:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lnt/b<",
            "*>;)",
            "Lnt/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance p1, Lei/n$b;

    iget-object v0, p0, Lei/n$b;->u:Lku/x;

    iget-object v1, p0, Lei/n$b;->v:Lei/n;

    iget-object v2, p0, Lei/n$b;->w:Ljava/lang/String;

    invoke-direct {p1, v0, v1, v2, p2}, Lei/n$b;-><init>(Lku/x;Lei/n;Ljava/lang/String;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lei/n$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lku/p0;",
            "Lnt/b<",
            "-",
            "Ljava/util/List<",
            "+",
            "Ljava/net/InetAddress;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lei/n$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lei/n$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lei/n$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lei/n$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p1

    invoke-static {p1}, Lku/q0;->a(Lkotlin/coroutines/CoroutineContext;)Lku/p0;

    move-result-object v3

    new-instance v6, Lei/n$b$a;

    iget-object p1, p0, Lei/n$b;->u:Lku/x;

    iget-object v1, p0, Lei/n$b;->v:Lei/n;

    iget-object v4, p0, Lei/n$b;->w:Ljava/lang/String;

    const/4 v5, 0x0

    invoke-direct {v6, p1, v1, v4, v5}, Lei/n$b$a;-><init>(Lku/x;Lei/n;Ljava/lang/String;Lnt/b;)V

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v8}, Lku/i;->d(Lku/p0;Lkotlin/coroutines/CoroutineContext;Lku/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lku/d2;

    iget-object p1, p0, Lei/n$b;->u:Lku/x;

    iput v2, p0, Lei/n$b;->t:I

    invoke-interface {p1, p0}, Lku/w0;->B(Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
