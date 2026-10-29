.class public final Lcom/roblox/client/widgets/a$e;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/widgets/a;->l(Landroid/content/Context;Landroid/widget/RemoteViews;Lcom/roblox/client/widgets/a$b;Lorg/json/JSONArray;Lnt/b;)Ljava/lang/Object;
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
        "Landroid/widget/RemoteViews;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lku/p0;",
        "Landroid/widget/RemoteViews;",
        "<anonymous>",
        "(Lku/p0;)Landroid/widget/RemoteViews;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.widgets.RecentlyPlayedWidgetUpdater$renderMedLargeLayout$2"
    f = "RecentlyPlayedWidgetUpdater.kt"
    l = {
        0x122
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public final synthetic A:Landroid/widget/RemoteViews;

.field public final synthetic B:Lorg/json/JSONArray;

.field public final synthetic C:Lcom/roblox/client/widgets/a$b;

.field public final synthetic D:Landroid/content/Context;

.field public t:I

.field public u:I

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:Ljava/lang/Object;

.field public y:J

.field public z:I


# direct methods
.method public constructor <init>(Landroid/widget/RemoteViews;Lorg/json/JSONArray;Lcom/roblox/client/widgets/a$b;Landroid/content/Context;Lnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/RemoteViews;",
            "Lorg/json/JSONArray;",
            "Lcom/roblox/client/widgets/a$b;",
            "Landroid/content/Context;",
            "Lnt/b<",
            "-",
            "Lcom/roblox/client/widgets/a$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/roblox/client/widgets/a$e;->A:Landroid/widget/RemoteViews;

    iput-object p2, p0, Lcom/roblox/client/widgets/a$e;->B:Lorg/json/JSONArray;

    iput-object p3, p0, Lcom/roblox/client/widgets/a$e;->C:Lcom/roblox/client/widgets/a$b;

    iput-object p4, p0, Lcom/roblox/client/widgets/a$e;->D:Landroid/content/Context;

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

    new-instance v0, Lcom/roblox/client/widgets/a$e;

    iget-object v1, p0, Lcom/roblox/client/widgets/a$e;->A:Landroid/widget/RemoteViews;

    iget-object v2, p0, Lcom/roblox/client/widgets/a$e;->B:Lorg/json/JSONArray;

    iget-object v3, p0, Lcom/roblox/client/widgets/a$e;->C:Lcom/roblox/client/widgets/a$b;

    iget-object v4, p0, Lcom/roblox/client/widgets/a$e;->D:Landroid/content/Context;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/roblox/client/widgets/a$e;-><init>(Landroid/widget/RemoteViews;Lorg/json/JSONArray;Lcom/roblox/client/widgets/a$b;Landroid/content/Context;Lnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/a$e;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Landroid/widget/RemoteViews;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lcom/roblox/client/widgets/a$e;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lcom/roblox/client/widgets/a$e;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lcom/roblox/client/widgets/a$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lcom/roblox/client/widgets/a$e;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-wide v3, p0, Lcom/roblox/client/widgets/a$e;->y:J

    iget v1, p0, Lcom/roblox/client/widgets/a$e;->u:I

    iget v5, p0, Lcom/roblox/client/widgets/a$e;->t:I

    iget-object v6, p0, Lcom/roblox/client/widgets/a$e;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v6, p0, Lcom/roblox/client/widgets/a$e;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v7, p0, Lcom/roblox/client/widgets/a$e;->v:Ljava/lang/Object;

    check-cast v7, Lorg/json/JSONObject;

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    move-object v13, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/roblox/client/widgets/a$e;->A:Landroid/widget/RemoteViews;

    sget v1, Lsg/m0;->C:I

    invoke-virtual {p1, v1}, Landroid/widget/RemoteViews;->removeAllViews(I)V

    iget-object p1, p0, Lcom/roblox/client/widgets/a$e;->B:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p1

    iget-object v1, p0, Lcom/roblox/client/widgets/a$e;->C:Lcom/roblox/client/widgets/a$b;

    invoke-virtual {v1}, Lcom/roblox/client/widgets/a$b;->f()I

    move-result v1

    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p1

    const/4 v1, 0x0

    move v5, p1

    :goto_0
    if-ge v1, v5, :cond_4

    iget-object p1, p0, Lcom/roblox/client/widgets/a$e;->B:Lorg/json/JSONArray;

    invoke-virtual {p1, v1}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    const-string p1, "placeId"

    invoke-virtual {v7, p1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v10

    const-string p1, "name"

    invoke-virtual {v7, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const-string p1, "thumbnailUrl"

    invoke-virtual {v7, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    sget-object v8, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    iget-object v9, p0, Lcom/roblox/client/widgets/a$e;->D:Landroid/content/Context;

    invoke-static {v12}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    iput-object v7, p0, Lcom/roblox/client/widgets/a$e;->v:Ljava/lang/Object;

    iput-object v6, p0, Lcom/roblox/client/widgets/a$e;->w:Ljava/lang/Object;

    invoke-static {v12}, Lpt/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lcom/roblox/client/widgets/a$e;->x:Ljava/lang/Object;

    iput v5, p0, Lcom/roblox/client/widgets/a$e;->t:I

    iput v1, p0, Lcom/roblox/client/widgets/a$e;->u:I

    iput-wide v10, p0, Lcom/roblox/client/widgets/a$e;->y:J

    iput v2, p0, Lcom/roblox/client/widgets/a$e;->z:I

    move-object v13, p0

    invoke-static/range {v8 .. v13}, Lcom/roblox/client/widgets/a;->a(Lcom/roblox/client/widgets/a;Landroid/content/Context;JLjava/lang/String;Lnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    move-wide v3, v10

    :goto_1
    check-cast p1, Landroid/graphics/Bitmap;

    new-instance v8, Landroid/widget/RemoteViews;

    iget-object v9, v13, Lcom/roblox/client/widgets/a$e;->D:Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v9

    iget-object v10, v13, Lcom/roblox/client/widgets/a$e;->C:Lcom/roblox/client/widgets/a$b;

    invoke-virtual {v10}, Lcom/roblox/client/widgets/a$b;->b()I

    move-result v10

    invoke-direct {v8, v9, v10}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    iget-object v9, v13, Lcom/roblox/client/widgets/a$e;->D:Landroid/content/Context;

    iget-object v10, v13, Lcom/roblox/client/widgets/a$e;->C:Lcom/roblox/client/widgets/a$b;

    iget-object v11, v13, Lcom/roblox/client/widgets/a$e;->A:Landroid/widget/RemoteViews;

    sget v12, Lsg/m0;->A:I

    invoke-virtual {v8, v12, v6}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    sget v6, Lsg/m0;->y:I

    invoke-virtual {v8, v6, p1}, Landroid/widget/RemoteViews;->setImageViewBitmap(ILandroid/graphics/Bitmap;)V

    sget p1, Lsg/m0;->z:I

    sget-object v6, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    invoke-static {v3, v4}, Lpt/b;->e(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v10}, Lcom/roblox/client/widgets/a$b;->g()Ljava/lang/String;

    move-result-object v4

    invoke-static {v6, v9, v3, v4}, Lcom/roblox/client/widgets/a;->c(Lcom/roblox/client/widgets/a;Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v3

    invoke-virtual {v8, p1, v3}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    sget p1, Lsg/m0;->C:I

    invoke-virtual {v11, p1, v8}, Landroid/widget/RemoteViews;->addView(ILandroid/widget/RemoteViews;)V

    invoke-virtual {v10}, Lcom/roblox/client/widgets/a$b;->d()Z

    move-result p1

    if-eqz p1, :cond_3

    const-string p1, "rating"

    invoke-virtual {v7, p1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget v3, Lsg/m0;->B:I

    sget v4, Lsg/q0;->D1:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v9, v4, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v8, v3, p1}, Landroid/widget/RemoteViews;->setTextViewText(ILjava/lang/CharSequence;)V

    :cond_3
    add-int/2addr v1, v2

    goto/16 :goto_0

    :cond_4
    move-object v13, p0

    iget-object p1, v13, Lcom/roblox/client/widgets/a$e;->A:Landroid/widget/RemoteViews;

    iget-object v0, v13, Lcom/roblox/client/widgets/a$e;->D:Landroid/content/Context;

    iget-object v1, v13, Lcom/roblox/client/widgets/a$e;->C:Lcom/roblox/client/widgets/a$b;

    sget v2, Lsg/m0;->c0:I

    invoke-static {}, Lth/h;->a()Lth/i;

    move-result-object v3

    invoke-interface {v3}, Lth/i;->z()Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    const-string v4, "container"

    invoke-virtual {v1}, Lcom/roblox/client/widgets/a$b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v4, v1}, Lcom/roblox/client/widgets/a;->b(Lcom/roblox/client/widgets/a;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    goto :goto_2

    :cond_5
    sget-object v3, Lcom/roblox/client/widgets/a;->a:Lcom/roblox/client/widgets/a;

    const/4 v4, 0x0

    invoke-virtual {v1}, Lcom/roblox/client/widgets/a$b;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v0, v4, v1}, Lcom/roblox/client/widgets/a;->c(Lcom/roblox/client/widgets/a;Landroid/content/Context;Ljava/lang/Long;Ljava/lang/String;)Landroid/app/PendingIntent;

    move-result-object v0

    :goto_2
    invoke-virtual {p1, v2, v0}, Landroid/widget/RemoteViews;->setOnClickPendingIntent(ILandroid/app/PendingIntent;)V

    return-object p1
.end method
