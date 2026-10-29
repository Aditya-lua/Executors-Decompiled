.class public final synthetic Loj/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Loj/i;

.field public final synthetic b:Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

.field public final synthetic c:Lk2/k$f;

.field public final synthetic d:Lpj/f;

.field public final synthetic e:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Loj/i;Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$f;Lpj/f;Landroid/content/Context;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loj/c;->a:Loj/i;

    iput-object p2, p0, Loj/c;->b:Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    iput-object p3, p0, Loj/c;->c:Lk2/k$f;

    iput-object p4, p0, Loj/c;->d:Lpj/f;

    iput-object p5, p0, Loj/c;->e:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Loj/c;->a:Loj/i;

    iget-object v1, p0, Loj/c;->b:Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;

    iget-object v2, p0, Loj/c;->c:Lk2/k$f;

    iget-object v3, p0, Loj/c;->d:Lpj/f;

    iget-object v4, p0, Loj/c;->e:Landroid/content/Context;

    move-object v5, p1

    check-cast v5, Lqj/a;

    invoke-static/range {v0 .. v5}, Loj/i;->d(Loj/i;Lcom/roblox/client/pushnotification/v2/richpushnotifications/RichPushNotificationMedia;Lk2/k$f;Lpj/f;Landroid/content/Context;Lqj/a;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
