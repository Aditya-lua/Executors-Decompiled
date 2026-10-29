.class public final Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdateWorker$cacheThumbnails$2$1"
    f = "RecentlyPlayedWidgetUpdateWorker.kt"
    l = {
        0x62
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Lk6/s;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:I

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Landroid/content/Context;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lk6/s;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Landroid/content/Context;",
            "Lk6/s;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->w:Ljava/lang/String;

    iput-object p2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->x:Ljava/lang/String;

    iput-object p3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->y:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->z:Landroid/content/Context;

    iput-object p5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->A:Lk6/s;

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

    new-instance v0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->w:Ljava/lang/String;

    iget-object v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->x:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->y:Ljava/lang/String;

    iget-object v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->z:Landroid/content/Context;

    iget-object v5, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->A:Lk6/s;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lk6/s;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->v:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->u:Ljava/lang/Object;

    check-cast v0, Lx6/g;

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->t:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object p1, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    iget-object v1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->w:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->x:Ljava/lang/String;

    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iget-object v4, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->y:Ljava/lang/String;

    invoke-virtual {p1, v1, v3, v4}, Lcom/roblox/client/widgets/a;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lx6/g$a;

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->z:Landroid/content/Context;

    invoke-direct {v1, v3}, Lx6/g$a;-><init>(Landroid/content/Context;)V

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->x:Ljava/lang/String;

    invoke-virtual {v1, v3}, Lx6/g$a;->c(Ljava/lang/Object;)Lx6/g$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lx6/g$a;->f(Ljava/lang/String;)Lx6/g$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lx6/g$a;->j(Ljava/lang/String;)Lx6/g$a;

    move-result-object v1

    sget-object v3, Lx6/c;->c:Lx6/c;

    invoke-virtual {v1, v3}, Lx6/g$a;->g(Lx6/c;)Lx6/g$a;

    move-result-object v1

    invoke-virtual {v1}, Lx6/g$a;->b()Lx6/g;

    move-result-object v1

    iget-object v3, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->A:Lk6/s;

    invoke-static {p1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->t:Ljava/lang/Object;

    invoke-static {v1}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->u:Ljava/lang/Object;

    iput v2, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->v:I

    invoke-interface {v3, v1, p0}, Lk6/s;->d(Lx6/g;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Lx6/k;

    instance-of v0, p1, Lx6/e;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roblox/client/widgets/RecentlyPlayedWidgetUpdateWorker$b$a;->w:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed to cache thumbnail for "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    check-cast p1, Lx6/e;

    invoke-virtual {p1}, Lx6/e;->b()Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "RecentlyPlayedWidgetUpdateWorker"

    invoke-static {v1, v0, p1}, Lgk/q;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_3
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object p1
.end method
