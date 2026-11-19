.class public final Lyj/b$d;
.super Lgu/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyj/b;->c(Landroid/content/Context;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;JLkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lgu/m;",
        "Lkotlin/jvm/functions/Function2<",
        "Lav/p0;",
        "Leu/b<",
        "-",
        "Lkotlin/Unit;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lgu/f;
    c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1"
    f = "PushNotificationImageFetcher.kt"
    l = {
        0x3d,
        0x3e
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lav/p0;",
        "",
        "<anonymous>",
        "(Lav/p0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation


# instance fields
.field public final synthetic A:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

.field public final synthetic B:Landroid/content/Context;

.field public final synthetic C:J

.field public final synthetic D:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

.field public t:Ljava/lang/Object;

.field public u:Ljava/lang/Object;

.field public v:Ljava/lang/Object;

.field public w:Ljava/lang/Object;

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Lyj/a;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Leu/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Lyj/a;",
            "Lkotlin/Unit;",
            ">;",
            "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
            "Landroid/content/Context;",
            "J",
            "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
            "Leu/b<",
            "-",
            "Lyj/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lyj/b$d;->z:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lyj/b$d;->A:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iput-object p3, p0, Lyj/b$d;->B:Landroid/content/Context;

    iput-wide p4, p0, Lyj/b$d;->C:J

    iput-object p6, p0, Lyj/b$d;->D:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Lgu/m;-><init>(ILeu/b;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Leu/b;)Leu/b;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Leu/b<",
            "*>;)",
            "Leu/b<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    new-instance v0, Lyj/b$d;

    iget-object v1, p0, Lyj/b$d;->z:Lkotlin/jvm/functions/Function1;

    iget-object v2, p0, Lyj/b$d;->A:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iget-object v3, p0, Lyj/b$d;->B:Landroid/content/Context;

    iget-wide v4, p0, Lyj/b$d;->C:J

    iget-object v6, p0, Lyj/b$d;->D:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Lyj/b$d;-><init>(Lkotlin/jvm/functions/Function1;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Leu/b;)V

    iput-object p1, v0, Lyj/b$d;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lav/p0;Leu/b;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lav/p0;",
            "Leu/b<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lyj/b$d;->create(Ljava/lang/Object;Leu/b;)Leu/b;

    move-result-object p1

    check-cast p1, Lyj/b$d;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lyj/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lav/p0;

    check-cast p2, Leu/b;

    invoke-virtual {p0, p1, p2}, Lyj/b$d;->invoke(Lav/p0;Leu/b;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lyj/b$d;->y:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lav/p0;

    invoke-static {}, Lfu/c;->e()Ljava/lang/Object;

    move-result-object v1

    iget v3, v0, Lyj/b$d;->x:I

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v9, :cond_1

    if-ne v3, v8, :cond_0

    iget-object v1, v0, Lyj/b$d;->w:Ljava/lang/Object;

    iget-object v2, v0, Lyj/b$d;->v:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v0, Lyj/b$d;->u:Ljava/lang/Object;

    check-cast v3, Lav/w0;

    iget-object v3, v0, Lyj/b$d;->t:Ljava/lang/Object;

    check-cast v3, Lav/w0;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v3, v2

    move-object/from16 v2, p1

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v3, v0, Lyj/b$d;->v:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v0, Lyj/b$d;->u:Ljava/lang/Object;

    check-cast v4, Lav/w0;

    iget-object v5, v0, Lyj/b$d;->t:Ljava/lang/Object;

    check-cast v5, Lav/w0;

    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    move-object v10, v5

    move-object/from16 v5, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lzt/o;->b(Ljava/lang/Object;)V

    new-instance v5, Lyj/b$d$b;

    iget-object v11, v0, Lyj/b$d;->A:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iget-object v12, v0, Lyj/b$d;->B:Landroid/content/Context;

    iget-wide v13, v0, Lyj/b$d;->C:J

    const/4 v15, 0x0

    move-object v10, v5

    invoke-direct/range {v10 .. v15}, Lyj/b$d$b;-><init>(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLeu/b;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v7}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object v10

    new-instance v5, Lyj/b$d$a;

    iget-object v12, v0, Lyj/b$d;->D:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iget-object v13, v0, Lyj/b$d;->B:Landroid/content/Context;

    iget-wide v14, v0, Lyj/b$d;->C:J

    const/16 v16, 0x0

    move-object v11, v5

    invoke-direct/range {v11 .. v16}, Lyj/b$d$a;-><init>(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLeu/b;)V

    invoke-static/range {v2 .. v7}, Lav/i;->b(Lav/p0;Lkotlin/coroutines/CoroutineContext;Lav/r0;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lav/w0;

    move-result-object v4

    iget-object v3, v0, Lyj/b$d;->z:Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lyj/b$d;->y:Ljava/lang/Object;

    invoke-static {v10}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    iput-object v5, v0, Lyj/b$d;->t:Ljava/lang/Object;

    iput-object v4, v0, Lyj/b$d;->u:Ljava/lang/Object;

    iput-object v3, v0, Lyj/b$d;->v:Ljava/lang/Object;

    iput v9, v0, Lyj/b$d;->x:I

    invoke-interface {v10, v0}, Lav/w0;->y(Leu/b;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast v5, Lzt/n;

    invoke-virtual {v5}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lyj/b$d;->y:Ljava/lang/Object;

    invoke-static {v10}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lyj/b$d;->t:Ljava/lang/Object;

    invoke-static {v4}, Lgu/l;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    iput-object v2, v0, Lyj/b$d;->u:Ljava/lang/Object;

    iput-object v3, v0, Lyj/b$d;->v:Ljava/lang/Object;

    iput-object v5, v0, Lyj/b$d;->w:Ljava/lang/Object;

    iput v8, v0, Lyj/b$d;->x:I

    invoke-interface {v4, v0}, Lav/w0;->y(Leu/b;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    move-object v1, v5

    :goto_2
    check-cast v2, Lzt/n;

    invoke-virtual {v2}, Lzt/n;->j()Ljava/lang/Object;

    move-result-object v2

    new-instance v4, Lyj/a;

    invoke-direct {v4, v1, v2}, Lyj/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v3, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v1
.end method
