.class public final Lqj/b$d$b;
.super Lpt/m;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lqj/b$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Ljt/n<",
        "+",
        "Landroid/graphics/Bitmap;",
        ">;>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lku/p0;",
        "Ljt/n;",
        "Landroid/graphics/Bitmap;",
        "<anonymous>",
        "(Lku/p0;)Ljt/n;"
    }
    k = 0x3
    mv = {
        0x2,
        0x2,
        0x0
    }
.end annotation

.annotation runtime Lpt/f;
    c = "com.roblox.client.pushnotification.v2.richpushnotifications.PushNotificationImageFetcher$loadImagesForBigPictureNotification$1$largeIcon$1"
    f = "PushNotificationImageFetcher.kt"
    l = {
        0x39
    }
    m = "invokeSuspend"
    v = 0x1
.end annotation


# instance fields
.field public t:I

.field public final synthetic u:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

.field public final synthetic v:Landroid/content/Context;

.field public final synthetic w:J


# direct methods
.method public constructor <init>(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;",
            "Landroid/content/Context;",
            "J",
            "Lnt/b<",
            "-",
            "Lqj/b$d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lqj/b$d$b;->u:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iput-object p2, p0, Lqj/b$d$b;->v:Landroid/content/Context;

    iput-wide p3, p0, Lqj/b$d$b;->w:J

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

    new-instance v0, Lqj/b$d$b;

    iget-object v1, p0, Lqj/b$d$b;->u:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iget-object v2, p0, Lqj/b$d$b;->v:Landroid/content/Context;

    iget-wide v3, p0, Lqj/b$d$b;->w:J

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lqj/b$d$b;-><init>(Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lku/p0;

    check-cast p2, Lnt/b;

    invoke-virtual {p0, p1, p2}, Lqj/b$d$b;->invoke(Lku/p0;Lnt/b;)Ljava/lang/Object;

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
            "Ljt/n<",
            "Landroid/graphics/Bitmap;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1, p2}, Lqj/b$d$b;->create(Ljava/lang/Object;Lnt/b;)Lnt/b;

    move-result-object p1

    check-cast p1, Lqj/b$d$b;

    sget-object p2, Lkotlin/Unit;->a:Lkotlin/Unit;

    invoke-virtual {p1, p2}, Lqj/b$d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    invoke-static {}, Lot/c;->e()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, Lqj/b$d$b;->t:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    check-cast p1, Ljt/n;

    invoke-virtual {p1}, Ljt/n;->j()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Ljt/o;->b(Ljava/lang/Object;)V

    sget-object v1, Lqj/b;->a:Lqj/b;

    move p1, v2

    iget-object v2, p0, Lqj/b$d$b;->u:Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;

    iget-object v3, p0, Lqj/b$d$b;->v:Landroid/content/Context;

    sget-object v4, Lkotlin/time/a;->b:Lkotlin/time/a$a;

    iget-wide v4, p0, Lqj/b$d$b;->w:J

    sget-object v6, Lju/b;->d:Lju/b;

    invoke-static {v4, v5, v6}, Lkotlin/time/b;->q(JLju/b;)J

    move-result-wide v4

    iput p1, p0, Lqj/b$d$b;->t:I

    move-object v6, p0

    invoke-static/range {v1 .. v6}, Lqj/b;->a(Lqj/b;Lcom/roblox/client/pushnotification/v2/richpushnotifications/PushNotificationImageConfig;Landroid/content/Context;JLnt/b;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    invoke-static {p1}, Ljt/n;->a(Ljava/lang/Object;)Ljt/n;

    move-result-object p1

    return-object p1
.end method
