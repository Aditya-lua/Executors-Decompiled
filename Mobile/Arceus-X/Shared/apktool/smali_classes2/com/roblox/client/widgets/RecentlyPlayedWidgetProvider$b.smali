.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider;->onUpdate(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;[I)V
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
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "",
        "<anonymous>",
        "(Lku/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetProvider$onUpdate$1"
    f = "RecentlyPlayedWidgetProvider.kt"
    l = {
        0x26
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public A:I

.field public B:I

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public final synthetic G:Landroid/content/Context;

.field public final synthetic H:[I

.field public final synthetic I:Landroid/content/BroadcastReceiver$PendingResult;

.field public final synthetic J:Landroid/appwidget/AppWidgetManager;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;[ILandroid/content/BroadcastReceiver$PendingResult;Landroid/appwidget/AppWidgetManager;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "[I",
            "Landroid/content/BroadcastReceiver$PendingResult;",
            "Landroid/appwidget/AppWidgetManager;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->G:Landroid/content/Context;

    iput-object p2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->H:[I

    iput-object p3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->I:Landroid/content/BroadcastReceiver$PendingResult;

    iput-object p4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->J:Landroid/appwidget/AppWidgetManager;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 6
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

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->G:Landroid/content/Context;

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->H:[I

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->I:Landroid/content/BroadcastReceiver$PendingResult;

    iget-object v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->J:Landroid/appwidget/AppWidgetManager;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;-><init>(Landroid/content/Context;[ILandroid/content/BroadcastReceiver$PendingResult;Landroid/appwidget/AppWidgetManager;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v5, p0

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v6

    iget v0, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->F:I

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v8, :cond_0

    iget v0, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->D:I

    iget v1, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->B:I

    iget v2, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->A:I

    iget v3, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->z:I

    iget-object v4, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->y:Ljava/lang/Object;

    check-cast v4, Landroid/os/Bundle;

    iget-object v4, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->x:Ljava/lang/Object;

    check-cast v4, Lcom/roblox/client/widgets/a$b;

    iget-object v9, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->w:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    iget-object v10, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->v:Ljava/lang/Object;

    check-cast v10, Landroid/appwidget/AppWidgetManager;

    iget-object v11, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->u:Ljava/lang/Object;

    check-cast v11, [I

    iget-object v12, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->t:Ljava/lang/Object;

    check-cast v12, Ljava/lang/String;

    :try_start_0
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v13, v12

    move-object v12, v11

    move v11, v3

    move v3, v1

    move-object v1, v10

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    sget-object v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    iget-object v1, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->G:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getCachedWidgetVariant(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->H:[I

    iget-object v2, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->J:Landroid/appwidget/AppWidgetManager;

    iget-object v3, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->G:Landroid/content/Context;

    array-length v4, v1

    move-object v13, v0

    move-object v12, v1

    move-object v1, v2

    move-object v2, v3

    move v9, v4

    move v10, v7

    move v11, v10

    :goto_0
    if-ge v10, v9, :cond_4

    aget v3, v12, v10

    invoke-virtual {v1, v3}, Landroid/appwidget/AppWidgetManager;->getAppWidgetOptions(I)Landroid/os/Bundle;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    :cond_2
    sget-object v4, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    move-object v14, v4

    invoke-virtual {v14, v2, v0, v13}, Lcom/roblox/client/widgets/a;->i(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)Lcom/roblox/client/widgets/a$b;

    move-result-object v4

    iput-object v13, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->t:Ljava/lang/Object;

    iput-object v12, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->u:Ljava/lang/Object;

    iput-object v1, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->v:Ljava/lang/Object;

    iput-object v2, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->w:Ljava/lang/Object;

    iput-object v4, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->x:Ljava/lang/Object;

    invoke-static {v0}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->y:Ljava/lang/Object;

    iput v11, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->z:I

    iput v10, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->A:I

    iput v9, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->B:I

    iput v3, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->C:I

    iput v3, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->D:I

    iput v7, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->E:I

    iput v8, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->F:I

    move-object v0, v14

    invoke-virtual/range {v0 .. v5}, Lcom/roblox/client/widgets/a;->o(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v6, :cond_3

    return-object v6

    :cond_3
    move v0, v3

    move v3, v9

    move-object v9, v2

    move v2, v10

    :goto_1
    sget-object v14, Lvg/m;->a:Lvg/m;

    const-string v15, "recents"

    sget-object v16, Llk/f;->a:Llk/f;

    invoke-virtual {v4}, Lcom/roblox/client/widgets/a$b;->g()Ljava/lang/String;

    move-result-object v17

    sget-object v18, Llk/g;->a:Llk/g;

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v14 .. v19}, Llk/b;->b(Lvg/m;Ljava/lang/String;Llk/f;Ljava/lang/String;Llk/g;Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    add-int/lit8 v10, v2, 0x1

    move-object v2, v9

    move v9, v3

    goto :goto_0

    :cond_4
    iget-object v0, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->I:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    :goto_2
    iget-object v1, v5, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$b;->I:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw v0
.end method
