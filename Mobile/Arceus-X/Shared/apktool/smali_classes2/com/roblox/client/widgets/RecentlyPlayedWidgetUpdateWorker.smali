.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;
.super Landroidx/work/CoroutineWorker;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B#\u0008\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ \u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParams",
        "Lku/l0;",
        "ioDispatcher",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;)V",
        "Landroidx/work/c$a;",
        "doWork",
        "(Lnt/b;)Ljava/lang/Object;",
        "",
        "f",
        "context",
        "",
        "widgetDataJson",
        "d",
        "(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;",
        "a",
        "Lku/l0;",
        "e",
        "()Lku/l0;",
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
.field public static final b:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final a:Lku/l0;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->b:Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$a;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/work/WorkerParameters;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lku/l0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workerParams"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 3
    iput-object p3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->a:Lku/l0;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Lku/g1;->b()Lku/l0;

    move-result-object p3

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;Lku/l0;)V

    return-void
.end method

.method public static final synthetic b(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->d(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->f(Lnt/b;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Landroid/content/Context;Ljava/lang/String;Lnt/b;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/lang/String;",
            "Lnt/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2, p2}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {p1}, Lk6/d0;->a(Landroid/content/Context;)Lk6/s;

    move-result-object v5

    sget-object p2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {p0}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getCachedWidgetVariant(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;

    const/4 v6, 0x0

    move-object v1, p0

    move-object v4, p1

    invoke-direct/range {v0 .. v6}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lorg/json/JSONArray;Ljava/lang/String;Landroid/content/Context;Lk6/s;Lnt/b;)V

    invoke-static {v0, p3}, Lku/q0;->g(Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method

.method public doWork(Lnt/b;)Ljava/lang/Object;
    .locals 5
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

    instance-of v0, p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;

    iget v1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;->v:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;->v:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;

    invoke-direct {v0, p0, p1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)V

    :goto_0
    iget-object p1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;->t:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;->v:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->a:Lku/l0;

    new-instance v2, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;

    const/4 v4, 0x0

    invoke-direct {v2, p0, v4}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$d;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)V

    iput v3, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$c;->v:I

    invoke-static {p1, v2, v0}, Lku/i;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    const-string v0, "withContext(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final e()Lku/l0;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;->a:Lku/l0;

    return-object v0
.end method

.method public final f(Lnt/b;)Ljava/lang/Object;
    .locals 19
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

    move-object/from16 v0, p1

    instance-of v1, v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;

    iget v2, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->I:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->I:I

    move-object/from16 v2, p0

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;

    move-object/from16 v2, p0

    invoke-direct {v1, v2, v0}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;-><init>(Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker;Lnt/b;)V

    :goto_0
    iget-object v0, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->G:Ljava/lang/Object;

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v3

    iget v4, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->I:I

    const/4 v5, 0x0

    const-string v6, "getApplicationContext(...)"

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v7, :cond_1

    iget v4, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->C:I

    iget v8, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->B:I

    iget v9, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->A:I

    iget-object v10, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->z:Ljava/lang/Object;

    check-cast v10, Landroid/os/Bundle;

    iget-object v10, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->y:Ljava/lang/Object;

    check-cast v10, Lcom/roblox/client/widgets/a$b;

    iget-object v10, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->x:Ljava/lang/Object;

    check-cast v10, [I

    iget-object v11, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->w:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    iget-object v12, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->v:Ljava/lang/Object;

    check-cast v12, [I

    iget-object v13, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->u:Ljava/lang/Object;

    check-cast v13, Landroid/content/ComponentName;

    iget-object v14, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->t:Ljava/lang/Object;

    check-cast v14, Landroid/appwidget/AppWidgetManager;

    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v0, v11

    move-object/from16 v17, v12

    move-object/from16 v18, v13

    move-object v12, v14

    goto/16 :goto_2

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Ljt/o;->b(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object v0

    new-instance v4, Landroid/content/ComponentName;

    invoke-virtual {v2}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    const-class v9, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider;

    invoke-direct {v4, v8, v9}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v4}, Landroid/appwidget/AppWidgetManager;->getAppWidgetIds(Landroid/content/ComponentName;)[I

    move-result-object v8

    sget-object v9, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {v2}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v10, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v10}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getCachedWidgetVariant(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    array-length v10, v8

    move-object v12, v0

    move-object/from16 v18, v4

    move-object/from16 v17, v8

    move-object v0, v9

    move v4, v10

    move v8, v5

    move v9, v8

    move-object/from16 v10, v17

    :goto_1
    if-ge v8, v4, :cond_5

    aget v14, v10, v8

    invoke-virtual {v12, v14}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    move-result-object v11

    if-nez v11, :cond_3

    sget-object v11, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_3
    sget-object v13, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    invoke-virtual {v2}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    invoke-static {v15, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v11}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-virtual {v13, v15, v11, v0}, Lcom/roblox/client/widgets/a;->i(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)Lcom/roblox/client/widgets/a$b;

    move-result-object v15

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object/from16 v16, v11

    move-object v11, v13

    invoke-virtual {v2}, Landroidx/work/c;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    invoke-static {v13, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v12, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->t:Ljava/lang/Object;

    invoke-static/range {v18 .. v18}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->u:Ljava/lang/Object;

    invoke-static/range {v17 .. v17}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->v:Ljava/lang/Object;

    iput-object v0, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->w:Ljava/lang/Object;

    iput-object v10, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->x:Ljava/lang/Object;

    invoke-static {v15}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->y:Ljava/lang/Object;

    invoke-static/range {v16 .. v16}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    iput-object v7, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->z:Ljava/lang/Object;

    iput v9, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->A:I

    iput v8, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->B:I

    iput v4, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->C:I

    iput v14, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->D:I

    iput v14, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->E:I

    iput v5, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->F:I

    const/4 v7, 0x1

    iput v7, v1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$e;->I:I

    move-object/from16 v16, v1

    invoke-virtual/range {v11 .. v16}, Lcom/roblox/client/widgets/a;->o(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    :cond_4
    move-object/from16 v1, v16

    :goto_2
    add-int/2addr v8, v7

    goto :goto_1

    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0
.end method
