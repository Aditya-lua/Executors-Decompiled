.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider;->onAppWidgetOptionsChanged(Landroid/content/Context;Landroid/appwidget/AppWidgetManager;ILandroid/os/Bundle;)V
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
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetProvider$onAppWidgetOptionsChanged$1"
    f = "RecentlyPlayedWidgetProvider.kt"
    l = {
        0x4c
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:Ljava/lang/Object;

.field public u:I

.field public final synthetic v:Landroid/content/Context;

.field public final synthetic w:Landroid/os/Bundle;

.field public final synthetic x:Landroid/appwidget/AppWidgetManager;

.field public final synthetic y:I

.field public final synthetic z:Landroid/content/BroadcastReceiver$PendingResult;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Bundle;Landroid/appwidget/AppWidgetManager;ILandroid/content/BroadcastReceiver$PendingResult;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/os/Bundle;",
            "Landroid/appwidget/AppWidgetManager;",
            "I",
            "Landroid/content/BroadcastReceiver$PendingResult;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->v:Landroid/content/Context;

    iput-object p2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->w:Landroid/os/Bundle;

    iput-object p3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->x:Landroid/appwidget/AppWidgetManager;

    iput p4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->y:I

    iput-object p5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->z:Landroid/content/BroadcastReceiver$PendingResult;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Lpt/m;-><init>(ILnt/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lnt/b;)Lnt/b;
    .locals 7
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

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->v:Landroid/content/Context;

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->w:Landroid/os/Bundle;

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->x:Landroid/appwidget/AppWidgetManager;

    iget v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->y:I

    iget-object v5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->z:Landroid/content/BroadcastReceiver$PendingResult;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;-><init>(Landroid/content/Context;Landroid/os/Bundle;Landroid/appwidget/AppWidgetManager;ILandroid/content/BroadcastReceiver$PendingResult;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->u:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->t:Ljava/lang/Object;

    check-cast v0, Lcom/roblox/client/widgets/a$b;

    :try_start_0
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, p0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p1, v0

    move-object v6, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    :try_start_1
    sget-object v1, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    iget-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->v:Landroid/content/Context;

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->w:Landroid/os/Bundle;

    sget-object v4, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->INSTANCE:Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;

    invoke-virtual {v4, p1}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetHandler;->getCachedWidgetVariant(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, p1, v3, v4}, Lcom/roblox/client/widgets/a;->i(Landroid/content/Context;Landroid/os/Bundle;Ljava/lang/String;)Lcom/roblox/client/widgets/a$b;

    move-result-object v5

    move p1, v2

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->x:Landroid/appwidget/AppWidgetManager;

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->v:Landroid/content/Context;

    iget v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->y:I

    iput-object v5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->t:Ljava/lang/Object;

    iput p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->u:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    move-object v6, p0

    :try_start_2
    invoke-virtual/range {v1 .. v6}, Lcom/roblox/client/widgets/a;->o(Landroid/appwidget/AppWidgetManager;Landroid/content/Context;ILcom/roblox/client/widgets/a$b;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, v5

    :goto_0
    sget-object v7, Lvg/m;->a:Lvg/m;

    const-string v8, "recents"

    sget-object v9, Llk/f;->c:Llk/f;

    invoke-virtual {v0}, Lcom/roblox/client/widgets/a$b;->g()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Llk/g;->a:Llk/g;

    iget p1, v6, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->y:I

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v12

    invoke-static/range {v7 .. v12}, Llk/b;->b(Lvg/m;Ljava/lang/String;Llk/f;Ljava/lang/String;Llk/g;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    iget-object p1, v6, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->z:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {p1}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1

    :catchall_1
    move-exception v0

    :goto_1
    move-object p1, v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v6, p0

    goto :goto_1

    :goto_2
    iget-object v0, v6, Lcom/roblox/client/widgets/RecentlyPlayedWidgetProvider$a;->z:Landroid/content/BroadcastReceiver$PendingResult;

    invoke-virtual {v0}, Landroid/content/BroadcastReceiver$PendingResult;->finish()V

    throw p1
.end method
