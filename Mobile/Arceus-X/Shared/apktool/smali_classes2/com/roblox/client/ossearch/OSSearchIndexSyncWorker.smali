.class public final Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000cB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\t\u0010\nR(\u0010\u0014\u001a\u00020\u000b8\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000c\u0010\r\u0012\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R.\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0000@\u0000X\u0081\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0017\u0010\u0018\u0012\u0004\u0008\u001c\u0010\u0013\u001a\u0004\u0008\u0017\u0010\u0019\"\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;",
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
        "Lku/l0;",
        "a",
        "Lku/l0;",
        "c",
        "()Lku/l0;",
        "setIoDispatcher$NativeShell_googleProdRelease",
        "(Lku/l0;)V",
        "getIoDispatcher$NativeShell_googleProdRelease$annotations",
        "()V",
        "ioDispatcher",
        "Lkotlin/Function0;",
        "",
        "b",
        "Lkotlin/jvm/functions/Function0;",
        "()Lkotlin/jvm/functions/Function0;",
        "setClock$NativeShell_googleProdRelease",
        "(Lkotlin/jvm/functions/Function0;)V",
        "getClock$NativeShell_googleProdRelease$annotations",
        "clock",
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
.field public static final c:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public a:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->c:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$a;

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

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->a:Lku/l0;

    sget-object p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$b;->a:Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$b;

    iput-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->b:Lkotlin/jvm/functions/Function0;

    return-void
.end method


# virtual methods
.method public final b()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->b:Lkotlin/jvm/functions/Function0;

    return-object v0
.end method

.method public final c()Lku/l0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->a:Lku/l0;

    return-object v0
.end method

.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 11
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

    instance-of v0, p1, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;

    iget v1, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->v:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->u:Ljava/lang/Object;

    check-cast v0, Lcom/roblox/client/ossearch/c;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-wide v4, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->t:J

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->a:Lku/l0;

    new-instance v2, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$e;

    invoke-direct {v2, p0, v6}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$e;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lnt/b;)V

    iput v5, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    invoke-static {p1, v2, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v7

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->b:Lkotlin/jvm/functions/Function0;

    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    cmp-long p1, v9, v7

    const-string v2, "OSSearchIndexSyncWorker"

    if-gez p1, :cond_6

    const-string p1, "Skipping OS search sync, not yet due"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Landroidx/work/c$a;->d()Landroidx/work/c$a;

    move-result-object p1

    const-string v0, "success(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_6
    const-string p1, "Starting OS search index sync"

    invoke-static {v2, p1}, Lgk/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;->a:Lku/l0;

    new-instance v2, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$f;

    invoke-direct {v2, v6}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$f;-><init>(Lnt/b;)V

    iput-wide v7, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->t:J

    iput v4, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    invoke-static {p1, v2, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    move-wide v4, v7

    :goto_2
    check-cast p1, Lcom/roblox/client/ossearch/c;

    new-instance v2, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;

    invoke-direct {v2, p0, p1, v6}, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$d;-><init>(Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker;Lcom/roblox/client/ossearch/c;Lnt/b;)V

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->u:Ljava/lang/Object;

    iput-wide v4, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->t:J

    iput v3, v0, Lcom/roblox/client/ossearch/OSSearchIndexSyncWorker$c;->x:I

    invoke-static {v2, v0}, Lku/q0;->g(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    const-string v0, "coroutineScope(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method
