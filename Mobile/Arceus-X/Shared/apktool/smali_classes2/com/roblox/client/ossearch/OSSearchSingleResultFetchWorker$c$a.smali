.class public final Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljava/lang/Boolean;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.ossearch.OSSearchSingleResultFetchWorker$doWork$2$1$1"
    f = "OSSearchSingleResultFetchWorker.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

.field public final synthetic v:Lm2/c;


# direct methods
.method public constructor <init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lm2/c;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;",
            "Lm2/c;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->u:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iput-object p2, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->v:Lm2/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 2
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

    new-instance p1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->u:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    iget-object v1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->v:Lm2/c;

    invoke-direct {p1, v0, v1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;-><init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lm2/c;Lnt/b;)V

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    iget v0, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->t:I

    if-nez v0, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->u:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;

    invoke-virtual {p1}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c$a;->v:Lm2/c;

    invoke-static {p1, v0}, Lm2/e;->h(Landroid/content/Context;Lm2/c;)Z

    move-result p1

    invoke-static {p1}, Lpt/b;->a(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
