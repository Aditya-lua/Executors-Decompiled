.class public final Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0018\u0000 \u00182\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0011\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rR(\u0010\u0017\u001a\u00020\u000e8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000f\u0010\u0010\u0012\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "params",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;",
        "c",
        "()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;",
        "Lku/l0;",
        "a",
        "Lku/l0;",
        "d",
        "()Lku/l0;",
        "setIoDispatcher$NativeShell_googleProdRelease",
        "(Lku/l0;)V",
        "getIoDispatcher$NativeShell_googleProdRelease$annotations",
        "()V",
        "ioDispatcher",
        "b",
        "NativeShell_googleProdRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final b:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->b:Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->a:Lku/l0;

    return-void
.end method

.method public static final synthetic b(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;)Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;
    .locals 0

    invoke-virtual {p0}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->c()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final c()Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;
    .locals 5

    invoke-virtual {p0}, Landroidx/work/c;->getInputData()Landroidx/work/b;

    move-result-object v0

    const-string v1, "place_id"

    const-wide/16 v2, -0x1

    invoke-virtual {v0, v1, v2, v3}, Landroidx/work/b;->f(Ljava/lang/String;J)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_1

    new-instance v1, Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;

    new-instance v2, Lcom/roblox/platform/http/postbody/notifications/SearchResultRequestItem;

    new-instance v3, Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;

    invoke-direct {v3, v0}, Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;-><init>(Ljava/lang/Long;)V

    invoke-direct {v2, v3}, Lcom/roblox/platform/http/postbody/notifications/SearchResultRequestItem;-><init>(Lcom/roblox/platform/http/returntypes/ossearch/SearchResultIdentifier;)V

    invoke-static {v2}, Lkotlin/collections/o;->d(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/roblox/platform/http/postbody/notifications/SingleOSSearchResultPostBody;-><init>(Ljava/util/List;)V

    return-object v1

    :cond_1
    return-object v2
.end method

.method public final d()Lku/l0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->a:Lku/l0;

    return-object v0
.end method

.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 6
    .param p1    # Lnt/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnt/b<",
            "-",
            "Landroidx/work/c$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    instance-of v0, p1, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;

    iget v1, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->w:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->w:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;-><init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->u:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->w:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->t:Ljava/lang/Object;

    check-cast v0, Lcom/roblox/client/ossearch/c;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    const-string p1, "OSSearchSingleResultFetchWorker"

    const-string v2, "Starting OS search result fetch"

    invoke-static {p1, v2}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;->a:Lku/l0;

    new-instance v2, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$d;

    invoke-direct {v2, v3}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$d;-><init>(Lnt/b;)V

    iput v5, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->w:I

    invoke-static {p1, v2, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/roblox/client/ossearch/c;

    new-instance v2, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;

    invoke-direct {v2, p0, p1, v3}, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$c;-><init>(Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker;Lcom/roblox/client/ossearch/c;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->t:Ljava/lang/Object;

    iput v4, v0, Lcom/roblox/client/ossearch/OSSearchSingleResultFetchWorker$b;->w:I

    invoke-static {v2, v0}, Lku/q0;->g(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    const-string v0, "coroutineScope(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
